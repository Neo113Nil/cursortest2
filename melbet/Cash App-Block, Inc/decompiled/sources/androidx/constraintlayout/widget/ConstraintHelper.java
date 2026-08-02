package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class ConstraintHelper extends View {
    public int mCount;
    public HelperWidget mHelperWidget;
    public int[] mIds;
    public final HashMap mMap;
    public String mReferenceIds;
    public String mReferenceTags;
    public View[] mViews;
    public final Context myContext;

    public ConstraintHelper(Context context) {
        super(context);
        this.mIds = new int[32];
        this.mViews = null;
        this.mMap = new HashMap();
        this.myContext = context;
        init(null);
    }

    public final void addID(String str) {
        if (str.length() == 0 || this.myContext == null) {
            return;
        }
        String trim = str.trim();
        int findId = findId(trim);
        if (findId != 0) {
            this.mMap.put(Integer.valueOf(findId), trim);
            addRscID(findId);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    public final void addRscID(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.mCount + 1;
        int[] iArr = this.mIds;
        if (i2 > iArr.length) {
            this.mIds = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.mIds;
        int i3 = this.mCount;
        iArr2[i3] = i;
        this.mCount = i3 + 1;
    }

    public final void addTag(String str) {
        if (str.length() == 0 || this.myContext == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && trim.equals(((ConstraintLayout.LayoutParams) layoutParams).constraintTag)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    addRscID(childAt.getId());
                }
            }
        }
    }

    public final void applyLayoutFeatures(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.mCount; i++) {
            View viewById = constraintLayout.getViewById(this.mIds[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > RecyclerView.DECELERATION_RATE) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void applyLayoutFeaturesInConstraintSet(ConstraintLayout constraintLayout) {
    }

    public final int findId(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int findId = constraintLayout != null ? findId(constraintLayout, str) : 0;
        if (findId == 0) {
            try {
                findId = R$id.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (findId != 0) {
            return findId;
        }
        Context context = this.myContext;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    public void init(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.mReferenceIds = string2;
                    setIds(string2);
                } else if (index == 36) {
                    String string3 = obtainStyledAttributes.getString(index);
                    this.mReferenceTags = string3;
                    setReferenceTags(string3);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void loadParameters(ConstraintSet.Constraint constraint, HelperWidget helperWidget, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
        ConstraintSet.Layout layout = constraint.layout;
        int[] iArr = layout.mReferenceIds;
        int i = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = layout.mReferenceIdString;
            if (str != null) {
                if (str.length() > 0) {
                    String[] split = layout.mReferenceIdString.split(",");
                    int[] iArr2 = new int[split.length];
                    int i2 = 0;
                    for (String str2 : split) {
                        int findId = findId(str2.trim());
                        if (findId != 0) {
                            iArr2[i2] = findId;
                            i2++;
                        }
                    }
                    if (i2 != split.length) {
                        iArr2 = Arrays.copyOf(iArr2, i2);
                    }
                    layout.mReferenceIds = iArr2;
                } else {
                    layout.mReferenceIds = null;
                }
            }
        }
        helperWidget.mWidgetsCount = 0;
        Arrays.fill(helperWidget.mWidgets, (Object) null);
        if (layout.mReferenceIds == null) {
            return;
        }
        while (true) {
            int[] iArr3 = layout.mReferenceIds;
            if (i >= iArr3.length) {
                return;
            }
            ConstraintWidget constraintWidget = (ConstraintWidget) sparseArray.get(iArr3[i]);
            if (constraintWidget != null) {
                helperWidget.add(constraintWidget);
            }
            i++;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.mReferenceIds;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.mReferenceTags;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void resolveRtl(ConstraintWidget constraintWidget, boolean z) {
    }

    public final void setIds(String str) {
        this.mReferenceIds = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.mCount = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                addID(str.substring(i));
                return;
            } else {
                addID(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public final void setReferenceTags(String str) {
        this.mReferenceTags = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.mCount = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                addTag(str.substring(i));
                return;
            } else {
                addTag(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.mReferenceIds = null;
        this.mCount = 0;
        for (int i : iArr) {
            addRscID(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.mReferenceIds == null) {
            addRscID(i);
        }
    }

    public void updatePostLayout() {
    }

    public final void validateParams() {
        if (this.mHelperWidget == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).mWidget = this.mHelperWidget;
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIds = new int[32];
        this.mViews = null;
        this.mMap = new HashMap();
        this.myContext = context;
        init(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIds = new int[32];
        this.mViews = null;
        this.mMap = new HashMap();
        this.myContext = context;
        init(attributeSet);
    }

    public final void applyLayoutFeatures() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        applyLayoutFeatures((ConstraintLayout) parent);
    }

    public final int findId(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str != null && (resources = this.myContext.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        str2 = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        str2 = null;
                    }
                    if (str.equals(str2)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }
}
