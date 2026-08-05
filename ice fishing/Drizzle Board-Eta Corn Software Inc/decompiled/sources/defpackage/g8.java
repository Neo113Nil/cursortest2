package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class g8 extends View {
    public int MdtA4re8;
    public int[] NCTxEWno;
    public String P7K7Inc8;
    public HashMap Qr9iLBAD;
    public y1 VgvYg0wo;
    public String b2ZJblxo;
    public Context wxUZMvaN;

    public final void MdtA4re8(String str) {
        if (str.length() == 0 || this.wxUZMvaN == null) {
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
            if ((layoutParams instanceof i8) && trim.equals(((i8) layoutParams).g2aRJUAd)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    NCTxEWno(childAt.getId());
                }
            }
        }
    }

    public final void NCTxEWno(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.MdtA4re8 + 1;
        int[] iArr = this.NCTxEWno;
        if (i2 > iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.NCTxEWno = iArr;
        }
        int i3 = this.MdtA4re8;
        iArr[i3] = i;
        this.MdtA4re8 = i3 + 1;
    }

    public final void VgvYg0wo() {
        if (this.VgvYg0wo == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof i8) {
            ((i8) layoutParams).SMax8wMR = this.VgvYg0wo;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.NCTxEWno, this.MdtA4re8);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.P7K7Inc8;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.b2ZJblxo;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void qoPGr6Ce(String str) {
        int i;
        HashMap hashMap;
        Context context = this.wxUZMvaN;
        if (str.length() == 0 || context == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (isInEditMode() && constraintLayout != null) {
            Object obj = (trim == null || (hashMap = constraintLayout.ygLcUYwZ) == null || !hashMap.containsKey(trim)) ? null : constraintLayout.ygLcUYwZ.get(trim);
            if (obj instanceof Integer) {
                i = ((Integer) obj).intValue();
                if (i == 0 && constraintLayout != null) {
                    i = wxUZMvaN(constraintLayout, trim);
                }
                if (i == 0) {
                    try {
                        i = p00.class.getField(trim).getInt(null);
                    } catch (Exception unused) {
                    }
                }
                if (i == 0) {
                    i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
                }
                if (i == 0) {
                    this.Qr9iLBAD.put(Integer.valueOf(i), trim);
                    NCTxEWno(i);
                    return;
                } else {
                    Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
                    return;
                }
            }
        }
        i = 0;
        if (i == 0) {
            i = wxUZMvaN(constraintLayout, trim);
        }
        if (i == 0) {
        }
        if (i == 0) {
        }
        if (i == 0) {
        }
    }

    public void setIds(String str) {
        this.P7K7Inc8 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.MdtA4re8 = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                qoPGr6Ce(str.substring(i));
                return;
            } else {
                qoPGr6Ce(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.b2ZJblxo = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.MdtA4re8 = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                MdtA4re8(str.substring(i));
                return;
            } else {
                MdtA4re8(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.P7K7Inc8 = null;
        this.MdtA4re8 = 0;
        for (int i : iArr) {
            NCTxEWno(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.P7K7Inc8 == null) {
            NCTxEWno(i);
        }
    }

    public final int wxUZMvaN(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str != null && (resources = this.wxUZMvaN.getResources()) != null) {
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

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
