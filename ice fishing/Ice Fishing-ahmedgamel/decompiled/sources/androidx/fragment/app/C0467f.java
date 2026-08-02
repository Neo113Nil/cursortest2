package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.IceFishing.LiveIceFishing.C5248R;

/* renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0467f extends B1.b {

    /* renamed from: w, reason: collision with root package name */
    public final boolean f4947w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4948x;

    /* renamed from: y, reason: collision with root package name */
    public S0.c f4949y;

    public C0467f(a0 a0Var, K.f fVar, boolean z6) {
        super(3, a0Var, fVar);
        this.f4947w = z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final S0.c s(Context context) {
        int i;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Animation loadAnimation;
        S0.c cVar;
        if (this.f4948x) {
            return this.f4949y;
        }
        a0 a0Var = (a0) this.f256u;
        boolean z6 = a0Var.f4914a == 2;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = a0Var.f4916c;
        r rVar = abstractComponentCallbacksC0479s.f5020i0;
        int i4 = rVar == null ? 0 : rVar.f4990f;
        if (!this.f4947w) {
            if (z6) {
                if (rVar != null) {
                    i = rVar.f4986b;
                    abstractComponentCallbacksC0479s.A(0, 0, 0, 0);
                    viewGroup = abstractComponentCallbacksC0479s.f5017W;
                    S0.c cVar2 = null;
                    if (viewGroup != null) {
                    }
                    viewGroup2 = abstractComponentCallbacksC0479s.f5017W;
                    if (viewGroup2 != null) {
                    }
                    if (i == 0) {
                    }
                    if (i != 0) {
                    }
                    this.f4949y = cVar2;
                    this.f4948x = true;
                    return cVar2;
                }
                i = 0;
                abstractComponentCallbacksC0479s.A(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0479s.f5017W;
                S0.c cVar22 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0479s.f5017W;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f4949y = cVar22;
                this.f4948x = true;
                return cVar22;
            }
            if (rVar != null) {
                i = rVar.f4987c;
                abstractComponentCallbacksC0479s.A(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0479s.f5017W;
                S0.c cVar222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0479s.f5017W;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f4949y = cVar222;
                this.f4948x = true;
                return cVar222;
            }
            i = 0;
            abstractComponentCallbacksC0479s.A(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0479s.f5017W;
            S0.c cVar2222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0479s.f5017W;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.f4949y = cVar2222;
            this.f4948x = true;
            return cVar2222;
        }
        if (!z6) {
            if (rVar != null) {
                i = rVar.f4989e;
                abstractComponentCallbacksC0479s.A(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0479s.f5017W;
                S0.c cVar22222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0479s.f5017W;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f4949y = cVar22222;
                this.f4948x = true;
                return cVar22222;
            }
            i = 0;
            abstractComponentCallbacksC0479s.A(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0479s.f5017W;
            S0.c cVar222222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0479s.f5017W;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.f4949y = cVar222222;
            this.f4948x = true;
            return cVar222222;
        }
        if (rVar != null) {
            i = rVar.f4988d;
            abstractComponentCallbacksC0479s.A(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0479s.f5017W;
            S0.c cVar2222222 = null;
            if (viewGroup != null && viewGroup.getTag(C5248R.id.visible_removing_fragment_view_tag) != null) {
                abstractComponentCallbacksC0479s.f5017W.setTag(C5248R.id.visible_removing_fragment_view_tag, null);
            }
            viewGroup2 = abstractComponentCallbacksC0479s.f5017W;
            if (viewGroup2 != null || viewGroup2.getLayoutTransition() == null) {
                if (i == 0 && i4 != 0) {
                    i = i4 == 4097 ? i4 != 8194 ? i4 != 8197 ? i4 != 4099 ? i4 != 4100 ? -1 : z6 ? S0.f.v(context, R.attr.activityOpenEnterAnimation) : S0.f.v(context, R.attr.activityOpenExitAnimation) : z6 ? C5248R.animator.fragment_fade_enter : C5248R.animator.fragment_fade_exit : z6 ? S0.f.v(context, R.attr.activityCloseEnterAnimation) : S0.f.v(context, R.attr.activityCloseExitAnimation) : z6 ? C5248R.animator.fragment_close_enter : C5248R.animator.fragment_close_exit : z6 ? C5248R.animator.fragment_open_enter : C5248R.animator.fragment_open_exit;
                }
                if (i != 0) {
                    boolean equals = com.anythink.expressad.foundation.h.k.f20422f.equals(context.getResources().getResourceTypeName(i));
                    try {
                        if (equals) {
                            try {
                                loadAnimation = AnimationUtils.loadAnimation(context, i);
                            } catch (Resources.NotFoundException e9) {
                                throw e9;
                            } catch (RuntimeException unused) {
                            }
                            if (loadAnimation != null) {
                                cVar = new S0.c(7, loadAnimation);
                                cVar2222222 = cVar;
                            }
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                        if (loadAnimator != null) {
                            cVar = new S0.c(7, (Object) loadAnimator, false);
                            cVar2222222 = cVar;
                        }
                    } catch (RuntimeException e10) {
                        if (equals) {
                            throw e10;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                        if (loadAnimation2 != null) {
                            cVar2222222 = new S0.c(7, loadAnimation2);
                        }
                    }
                }
            }
            this.f4949y = cVar2222222;
            this.f4948x = true;
            return cVar2222222;
        }
        i = 0;
        abstractComponentCallbacksC0479s.A(0, 0, 0, 0);
        viewGroup = abstractComponentCallbacksC0479s.f5017W;
        S0.c cVar22222222 = null;
        if (viewGroup != null) {
            abstractComponentCallbacksC0479s.f5017W.setTag(C5248R.id.visible_removing_fragment_view_tag, null);
        }
        viewGroup2 = abstractComponentCallbacksC0479s.f5017W;
        if (viewGroup2 != null) {
        }
        if (i == 0) {
            i = i4 == 4097 ? i4 != 8194 ? i4 != 8197 ? i4 != 4099 ? i4 != 4100 ? -1 : z6 ? S0.f.v(context, R.attr.activityOpenEnterAnimation) : S0.f.v(context, R.attr.activityOpenExitAnimation) : z6 ? C5248R.animator.fragment_fade_enter : C5248R.animator.fragment_fade_exit : z6 ? S0.f.v(context, R.attr.activityCloseEnterAnimation) : S0.f.v(context, R.attr.activityCloseExitAnimation) : z6 ? C5248R.animator.fragment_close_enter : C5248R.animator.fragment_close_exit : z6 ? C5248R.animator.fragment_open_enter : C5248R.animator.fragment_open_exit;
        }
        if (i != 0) {
        }
        this.f4949y = cVar22222222;
        this.f4948x = true;
        return cVar22222222;
    }
}
