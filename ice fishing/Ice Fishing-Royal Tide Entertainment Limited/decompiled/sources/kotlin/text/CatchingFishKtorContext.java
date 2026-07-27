package kotlin.text;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class CatchingFishKtorContext extends View {
    public int CatchingFishDaggerWebsocket;
    public HashMap CatchingFishFragmentHandler;
    public String CatchingFishLayout;
    public int[] CatchingFishReduxKtor;
    public String CatchingFishViewModelFAB;
    public CatchingFishRetrofitHandler CatchingFishViewModelScope;
    public Context CatchingFishWorkManager;

    public final void CatchingFishCoroutine(String str) {
        if (str == null || str.length() == 0 || this.CatchingFishWorkManager == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof CatchingFishGraphQLBundle) && trim.equals(((CatchingFishGraphQLBundle) layoutParams).CatchingFishMVVMAppCompat) && childAt.getId() != -1) {
                CatchingFishSnackbar(childAt.getId());
            }
        }
    }

    public final void CatchingFishLayout() {
        if (this.CatchingFishViewModelScope == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof CatchingFishGraphQLBundle) {
            ((CatchingFishGraphQLBundle) layoutParams).CatchingFishGlideWidgetKtor = this.CatchingFishViewModelScope;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishParcelableFAB(String str) {
        int i;
        HashMap hashMap;
        Context context = this.CatchingFishWorkManager;
        if (str == null || str.length() == 0 || context == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (isInEditMode() && constraintLayout != null) {
            Object obj = (trim == null || (hashMap = constraintLayout.CatchingFishStateLiveData) == null || !hashMap.containsKey(trim)) ? null : constraintLayout.CatchingFishStateLiveData.get(trim);
            if (obj instanceof Integer) {
                i = ((Integer) obj).intValue();
                if (i == 0 && constraintLayout != null) {
                    i = CatchingFishWorkManager(constraintLayout, trim);
                }
                if (i == 0) {
                    try {
                        i = CatchingFishMVIDataStore.class.getField(trim).getInt(null);
                    } catch (Exception unused) {
                    }
                }
                if (i == 0) {
                    i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
                }
                if (i == 0) {
                    this.CatchingFishFragmentHandler.put(Integer.valueOf(i), trim);
                    CatchingFishSnackbar(i);
                    return;
                }
                return;
            }
        }
        i = 0;
        if (i == 0) {
            i = CatchingFishWorkManager(constraintLayout, trim);
        }
        if (i == 0) {
        }
        if (i == 0) {
        }
        if (i == 0) {
        }
    }

    public final void CatchingFishReduxKtor(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.CatchingFishDaggerWebsocket; i++) {
            View view = (View) constraintLayout.CatchingFishReduxKtor.get(this.CatchingFishReduxKtor[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final void CatchingFishSnackbar(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.CatchingFishDaggerWebsocket + 1;
        int[] iArr = this.CatchingFishReduxKtor;
        if (i2 > iArr.length) {
            this.CatchingFishReduxKtor = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.CatchingFishReduxKtor;
        int i3 = this.CatchingFishDaggerWebsocket;
        iArr2[i3] = i;
        this.CatchingFishDaggerWebsocket = i3 + 1;
    }

    public abstract void CatchingFishViewModelFAB(CatchingFishDaggerRetrofit catchingFishDaggerRetrofit, boolean z);

    public void CatchingFishViewModelScope(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, CatchingFishFluxAndroidX.CatchingFishSnackbar);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.CatchingFishViewModelFAB = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.CatchingFishLayout = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final int CatchingFishWorkManager(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str != null && (resources = this.CatchingFishWorkManager.getResources()) != null) {
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

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.CatchingFishReduxKtor, this.CatchingFishDaggerWebsocket);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.CatchingFishViewModelFAB;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.CatchingFishLayout;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.CatchingFishViewModelFAB = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.CatchingFishDaggerWebsocket = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                CatchingFishParcelableFAB(str.substring(i));
                return;
            } else {
                CatchingFishParcelableFAB(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.CatchingFishLayout = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.CatchingFishDaggerWebsocket = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                CatchingFishCoroutine(str.substring(i));
                return;
            } else {
                CatchingFishCoroutine(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.CatchingFishViewModelFAB = null;
        this.CatchingFishDaggerWebsocket = 0;
        for (int i : iArr) {
            CatchingFishSnackbar(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.CatchingFishViewModelFAB == null) {
            CatchingFishSnackbar(i);
        }
    }

    public void CatchingFishDaggerWebsocket(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
