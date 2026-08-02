package z;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import w.C5130e;

/* loaded from: classes.dex */
public abstract class c extends View {

    /* renamed from: n, reason: collision with root package name */
    public int[] f41984n;

    /* renamed from: u, reason: collision with root package name */
    public int f41985u;

    /* renamed from: v, reason: collision with root package name */
    public Context f41986v;

    /* renamed from: w, reason: collision with root package name */
    public w.j f41987w;

    /* renamed from: x, reason: collision with root package name */
    public String f41988x;

    /* renamed from: y, reason: collision with root package name */
    public String f41989y;

    /* renamed from: z, reason: collision with root package name */
    public HashMap f41990z;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str) {
        Context context;
        int i;
        HashMap hashMap;
        if (str == null || str.length() == 0 || (context = this.f41986v) == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (isInEditMode() && constraintLayout != null) {
            Object obj = (trim == null || (hashMap = constraintLayout.f4617F) == null || !hashMap.containsKey(trim)) ? null : constraintLayout.f4617F.get(trim);
            if (obj instanceof Integer) {
                i = ((Integer) obj).intValue();
                if (i == 0 && constraintLayout != null) {
                    i = f(constraintLayout, trim);
                }
                if (i == 0) {
                    try {
                        i = q.class.getField(trim).getInt(null);
                    } catch (Exception unused) {
                    }
                }
                if (i == 0) {
                    i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
                }
                if (i == 0) {
                    this.f41990z.put(Integer.valueOf(i), trim);
                    b(i);
                    return;
                } else {
                    Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
                    return;
                }
            }
        }
        i = 0;
        if (i == 0) {
            i = f(constraintLayout, trim);
        }
        if (i == 0) {
        }
        if (i == 0) {
        }
        if (i == 0) {
        }
    }

    public final void b(int i) {
        if (i == getId()) {
            return;
        }
        int i4 = this.f41985u + 1;
        int[] iArr = this.f41984n;
        if (i4 > iArr.length) {
            this.f41984n = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f41984n;
        int i6 = this.f41985u;
        iArr2[i6] = i;
        this.f41985u = i6 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f41986v == null) {
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
            if ((layoutParams instanceof e) && trim.equals(((e) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f41985u; i++) {
            View view = (View) constraintLayout.f4620n.get(this.f41984n[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str != null && (resources = this.f41986v.getResources()) != null) {
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

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f42184b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f41988x = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f41989y = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f41984n, this.f41985u);
    }

    public abstract void h(C5130e c5130e, boolean z6);

    public final void i() {
        if (this.f41987w == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof e) {
            ((e) layoutParams).f42045p0 = this.f41987w;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f41988x;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f41989y;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f41988x = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f41985u = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f41989y = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f41985u = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                c(str.substring(i));
                return;
            } else {
                c(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f41988x = null;
        this.f41985u = 0;
        for (int i : iArr) {
            b(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f41988x == null) {
            b(i);
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
