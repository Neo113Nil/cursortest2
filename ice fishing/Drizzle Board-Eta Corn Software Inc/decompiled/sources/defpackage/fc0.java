package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class fc0 extends rd0 {
    @Override // defpackage.rd0
    public final void b2ZJblxo(zd0 zd0Var) {
        View view = zd0Var.NCTxEWno;
        if (view instanceof TextView) {
            zd0Var.qoPGr6Ce.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // defpackage.rd0
    public final Animator k3x7lurq(ViewGroup viewGroup, zd0 zd0Var, zd0 zd0Var2) {
        if (zd0Var == null || zd0Var2 == null || !(zd0Var.NCTxEWno instanceof TextView)) {
            return null;
        }
        View view = zd0Var2.NCTxEWno;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap hashMap = zd0Var.qoPGr6Ce;
        HashMap hashMap2 = zd0Var2.qoPGr6Ce;
        float floatValue = hashMap.get("android:textscale:scale") != null ? ((Float) hashMap.get("android:textscale:scale")).floatValue() : 1.0f;
        float floatValue2 = hashMap2.get("android:textscale:scale") != null ? ((Float) hashMap2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new u2(2, textView));
        return ofFloat;
    }

    @Override // defpackage.rd0
    public final void wxUZMvaN(zd0 zd0Var) {
        View view = zd0Var.NCTxEWno;
        if (view instanceof TextView) {
            zd0Var.qoPGr6Ce.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }
}
