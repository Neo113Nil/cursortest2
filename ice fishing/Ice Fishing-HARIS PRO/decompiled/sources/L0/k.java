package L0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
import p0.u;

/* loaded from: classes.dex */
public final class k extends p0.m {
    @Override // p0.m
    public final void d(u uVar) {
        View view = uVar.f4214b;
        if (view instanceof TextView) {
            uVar.f4213a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // p0.m
    public final void g(u uVar) {
        View view = uVar.f4214b;
        if (view instanceof TextView) {
            uVar.f4213a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // p0.m
    public final Animator k(ViewGroup viewGroup, u uVar, u uVar2) {
        if (uVar != null && uVar2 != null && (uVar.f4214b instanceof TextView)) {
            View view = uVar2.f4214b;
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                HashMap hashMap = uVar.f4213a;
                HashMap hashMap2 = uVar2.f4213a;
                float floatValue = hashMap.get("android:textscale:scale") != null ? ((Float) hashMap.get("android:textscale:scale")).floatValue() : 1.0f;
                float floatValue2 = hashMap2.get("android:textscale:scale") != null ? ((Float) hashMap2.get("android:textscale:scale")).floatValue() : 1.0f;
                if (floatValue == floatValue2) {
                    return null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
                ofFloat.addUpdateListener(new B0.d(1, textView));
                return ofFloat;
            }
        }
        return null;
    }
}
