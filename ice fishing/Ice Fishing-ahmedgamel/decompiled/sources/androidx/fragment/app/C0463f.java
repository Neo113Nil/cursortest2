package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.icefishingapp.icefishing.C5275R;

/* renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0463f extends E2.a {

    /* renamed from: w, reason: collision with root package name */
    public final boolean f4979w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4980x;

    /* renamed from: y, reason: collision with root package name */
    public S0.s f4981y;

    public C0463f(a0 a0Var, K.f fVar, boolean z3) {
        super(2, a0Var, fVar);
        this.f4979w = z3;
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
    public final S0.s s(Context context) {
        int i;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Animation loadAnimation;
        S0.s sVar;
        if (this.f4980x) {
            return this.f4981y;
        }
        a0 a0Var = (a0) this.f731u;
        boolean z3 = a0Var.f4946a == 2;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s = a0Var.f4948c;
        r rVar = abstractComponentCallbacksC0475s.f5053n0;
        int i6 = rVar == null ? 0 : rVar.f5022f;
        if (!this.f4979w) {
            if (z3) {
                if (rVar != null) {
                    i = rVar.f5018b;
                    abstractComponentCallbacksC0475s.A(0, 0, 0, 0);
                    viewGroup = abstractComponentCallbacksC0475s.f5049W;
                    S0.s sVar2 = null;
                    if (viewGroup != null) {
                    }
                    viewGroup2 = abstractComponentCallbacksC0475s.f5049W;
                    if (viewGroup2 != null) {
                    }
                    if (i == 0) {
                    }
                    if (i != 0) {
                    }
                    this.f4981y = sVar2;
                    this.f4980x = true;
                    return sVar2;
                }
                i = 0;
                abstractComponentCallbacksC0475s.A(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0475s.f5049W;
                S0.s sVar22 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0475s.f5049W;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f4981y = sVar22;
                this.f4980x = true;
                return sVar22;
            }
            if (rVar != null) {
                i = rVar.f5019c;
                abstractComponentCallbacksC0475s.A(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0475s.f5049W;
                S0.s sVar222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0475s.f5049W;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f4981y = sVar222;
                this.f4980x = true;
                return sVar222;
            }
            i = 0;
            abstractComponentCallbacksC0475s.A(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0475s.f5049W;
            S0.s sVar2222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0475s.f5049W;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.f4981y = sVar2222;
            this.f4980x = true;
            return sVar2222;
        }
        if (!z3) {
            if (rVar != null) {
                i = rVar.f5021e;
                abstractComponentCallbacksC0475s.A(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC0475s.f5049W;
                S0.s sVar22222 = null;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC0475s.f5049W;
                if (viewGroup2 != null) {
                }
                if (i == 0) {
                }
                if (i != 0) {
                }
                this.f4981y = sVar22222;
                this.f4980x = true;
                return sVar22222;
            }
            i = 0;
            abstractComponentCallbacksC0475s.A(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0475s.f5049W;
            S0.s sVar222222 = null;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC0475s.f5049W;
            if (viewGroup2 != null) {
            }
            if (i == 0) {
            }
            if (i != 0) {
            }
            this.f4981y = sVar222222;
            this.f4980x = true;
            return sVar222222;
        }
        if (rVar != null) {
            i = rVar.f5020d;
            abstractComponentCallbacksC0475s.A(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC0475s.f5049W;
            S0.s sVar2222222 = null;
            if (viewGroup != null && viewGroup.getTag(C5275R.id.visible_removing_fragment_view_tag) != null) {
                abstractComponentCallbacksC0475s.f5049W.setTag(C5275R.id.visible_removing_fragment_view_tag, null);
            }
            viewGroup2 = abstractComponentCallbacksC0475s.f5049W;
            if (viewGroup2 != null || viewGroup2.getLayoutTransition() == null) {
                if (i == 0 && i6 != 0) {
                    i = i6 == 4097 ? i6 != 8194 ? i6 != 8197 ? i6 != 4099 ? i6 != 4100 ? -1 : z3 ? O3.b.E(context, R.attr.activityOpenEnterAnimation) : O3.b.E(context, R.attr.activityOpenExitAnimation) : z3 ? C5275R.animator.fragment_fade_enter : C5275R.animator.fragment_fade_exit : z3 ? O3.b.E(context, R.attr.activityCloseEnterAnimation) : O3.b.E(context, R.attr.activityCloseExitAnimation) : z3 ? C5275R.animator.fragment_close_enter : C5275R.animator.fragment_close_exit : z3 ? C5275R.animator.fragment_open_enter : C5275R.animator.fragment_open_exit;
                }
                if (i != 0) {
                    boolean equals = com.anythink.expressad.foundation.h.k.f19635f.equals(context.getResources().getResourceTypeName(i));
                    try {
                        if (equals) {
                            try {
                                loadAnimation = AnimationUtils.loadAnimation(context, i);
                            } catch (Resources.NotFoundException e9) {
                                throw e9;
                            } catch (RuntimeException unused) {
                            }
                            if (loadAnimation != null) {
                                sVar = new S0.s(loadAnimation);
                                sVar2222222 = sVar;
                            }
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                        if (loadAnimator != null) {
                            sVar = new S0.s(loadAnimator);
                            sVar2222222 = sVar;
                        }
                    } catch (RuntimeException e10) {
                        if (equals) {
                            throw e10;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                        if (loadAnimation2 != null) {
                            sVar2222222 = new S0.s(loadAnimation2);
                        }
                    }
                }
            }
            this.f4981y = sVar2222222;
            this.f4980x = true;
            return sVar2222222;
        }
        i = 0;
        abstractComponentCallbacksC0475s.A(0, 0, 0, 0);
        viewGroup = abstractComponentCallbacksC0475s.f5049W;
        S0.s sVar22222222 = null;
        if (viewGroup != null) {
            abstractComponentCallbacksC0475s.f5049W.setTag(C5275R.id.visible_removing_fragment_view_tag, null);
        }
        viewGroup2 = abstractComponentCallbacksC0475s.f5049W;
        if (viewGroup2 != null) {
        }
        if (i == 0) {
            i = i6 == 4097 ? i6 != 8194 ? i6 != 8197 ? i6 != 4099 ? i6 != 4100 ? -1 : z3 ? O3.b.E(context, R.attr.activityOpenEnterAnimation) : O3.b.E(context, R.attr.activityOpenExitAnimation) : z3 ? C5275R.animator.fragment_fade_enter : C5275R.animator.fragment_fade_exit : z3 ? O3.b.E(context, R.attr.activityCloseEnterAnimation) : O3.b.E(context, R.attr.activityCloseExitAnimation) : z3 ? C5275R.animator.fragment_close_enter : C5275R.animator.fragment_close_exit : z3 ? C5275R.animator.fragment_open_enter : C5275R.animator.fragment_open_exit;
        }
        if (i != 0) {
        }
        this.f4981y = sVar22222222;
        this.f4980x = true;
        return sVar22222222;
    }
}
