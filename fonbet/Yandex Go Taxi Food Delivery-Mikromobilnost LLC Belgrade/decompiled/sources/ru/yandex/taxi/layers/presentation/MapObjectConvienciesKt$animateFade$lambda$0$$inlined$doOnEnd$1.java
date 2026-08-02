package ru.yandex.taxi.layers.presentation;

import android.animation.Animator;
import defpackage.f4c0;
import defpackage.sls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\u000b¸\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Lzy11;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "androidx/core/animation/AnimatorKt$doOnEnd$$inlined$addListener$1", "core-ktx_release"}, k = 1, mv = {2, 4, 0})
/* loaded from: classes5.dex */
public final class MapObjectConvienciesKt$animateFade$lambda$0$$inlined$doOnEnd$1 implements Animator.AnimatorListener {
    final /* synthetic */ sls $doOnEnd$inlined;
    final /* synthetic */ f4c0 $this_animateFade$inlined;
    final /* synthetic */ boolean $visible$inlined;

    public MapObjectConvienciesKt$animateFade$lambda$0$$inlined$doOnEnd$1(f4c0 f4c0Var, boolean z, sls slsVar) {
        this.$this_animateFade$inlined = f4c0Var;
        this.$visible$inlined = z;
        this.$doOnEnd$inlined = slsVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.$this_animateFade$inlined.i(this.$visible$inlined);
        this.$doOnEnd$inlined.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}
