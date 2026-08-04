package com.gamericefishpro.space.na;

import android.animation.ValueAnimator;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((TextInputLayout) this.b).P0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                com.gamericefishpro.space.r5.j jVar = (com.gamericefishpro.space.r5.j) this.b;
                jVar.b.setAlpha(iFloatValue);
                jVar.c.setAlpha(iFloatValue);
                jVar.n.invalidate();
                break;
            default:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                com.gamericefishpro.space.ka.j jVar2 = ((BottomSheetBehavior) this.b).i;
                if (jVar2 != null) {
                    com.gamericefishpro.space.ka.h hVar = jVar2.e;
                    if (hVar.j != fFloatValue) {
                        hVar.j = fFloatValue;
                        jVar2.y = true;
                        jVar2.z = true;
                        jVar2.invalidateSelf();
                    }
                }
                break;
        }
    }
}
