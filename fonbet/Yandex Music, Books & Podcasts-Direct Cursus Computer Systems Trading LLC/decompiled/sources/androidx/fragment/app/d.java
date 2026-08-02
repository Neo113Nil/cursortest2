package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import defpackage.jtc;
import defpackage.vnj;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class d extends f {
    public final boolean b;
    public boolean c;
    public jtc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f0 f0Var, boolean z) {
        super(f0Var);
        f0Var.getClass();
        this.b = z;
    }

    public final jtc b(Context context) {
        Animation loadAnimation;
        jtc jtcVar;
        context.getClass();
        if (this.c) {
            return this.d;
        }
        f0 f0Var = this.a;
        o oVar = f0Var.c;
        boolean z = f0Var.a == 2;
        int nextTransition = oVar.getNextTransition();
        int popEnterAnim = this.b ? z ? oVar.getPopEnterAnim() : oVar.getPopExitAnim() : z ? oVar.getEnterAnim() : oVar.getExitAnim();
        oVar.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = oVar.mContainer;
        jtc jtcVar2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            oVar.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = oVar.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = oVar.onCreateAnimation(nextTransition, z, popEnterAnim);
            if (onCreateAnimation != null) {
                jtcVar2 = new jtc(onCreateAnimation);
            } else {
                Animator onCreateAnimator = oVar.onCreateAnimator(nextTransition, z, popEnterAnim);
                if (onCreateAnimator != null) {
                    jtcVar2 = new jtc(onCreateAnimator);
                } else {
                    if (popEnterAnim == 0 && nextTransition != 0) {
                        popEnterAnim = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z ? vnj.R(context, android.R.attr.activityOpenEnterAnimation) : vnj.R(context, android.R.attr.activityOpenExitAnimation) : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? vnj.R(context, android.R.attr.activityCloseEnterAnimation) : vnj.R(context, android.R.attr.activityCloseExitAnimation) : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                    }
                    if (popEnterAnim != 0) {
                        boolean equals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                        try {
                            if (equals) {
                                try {
                                    loadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                                } catch (Resources.NotFoundException e) {
                                    throw e;
                                } catch (RuntimeException unused) {
                                }
                                if (loadAnimation != null) {
                                    jtcVar = new jtc(loadAnimation);
                                    jtcVar2 = jtcVar;
                                }
                            }
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                            if (loadAnimator != null) {
                                jtcVar = new jtc(loadAnimator);
                                jtcVar2 = jtcVar;
                            }
                        } catch (RuntimeException e2) {
                            if (equals) {
                                throw e2;
                            }
                            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                            if (loadAnimation2 != null) {
                                jtcVar2 = new jtc(loadAnimation2);
                            }
                        }
                    }
                }
            }
        }
        this.d = jtcVar2;
        this.c = true;
        return jtcVar2;
    }
}
