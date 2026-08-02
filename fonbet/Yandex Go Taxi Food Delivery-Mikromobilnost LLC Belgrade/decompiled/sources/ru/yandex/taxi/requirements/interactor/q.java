package ru.yandex.taxi.requirements.interactor;

import defpackage.b8r;
import defpackage.ik31;
import defpackage.jl40;
import defpackage.ldj0;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class q implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ldj0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String w;

    public q(vpr vprVar, ldj0 ldj0Var, String str, String str2) {
        this.a = vprVar;
        this.b = ldj0Var;
        this.c = str;
        this.w = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RequirementBubbleDataInteractor$listenBubbles$$inlined$map$8$2$1 requirementBubbleDataInteractor$listenBubbles$$inlined$map$8$2$1;
        int i;
        mi31 mi31Var;
        if (continuation instanceof RequirementBubbleDataInteractor$listenBubbles$$inlined$map$8$2$1) {
            requirementBubbleDataInteractor$listenBubbles$$inlined$map$8$2$1 = (RequirementBubbleDataInteractor$listenBubbles$$inlined$map$8$2$1) continuation;
            int i2 = requirementBubbleDataInteractor$listenBubbles$$inlined$map$8$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementBubbleDataInteractor$listenBubbles$$inlined$map$8$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = requirementBubbleDataInteractor$listenBubbles$$inlined$map$8$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementBubbleDataInteractor$listenBubbles$$inlined$map$8$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ik31 ik31Var = (ik31) obj;
                    ldj0 ldj0Var = this.b;
                    ldj0Var.getClass();
                    String str = this.w;
                    if (str == null || str.length() == 0) {
                        mi31Var = ik31Var.b;
                    } else {
                        mi31Var = ik31Var.b;
                        boolean l = jl40.l(mi31Var.f, str);
                        String str2 = this.c;
                        if (!l || !jl40.l(mi31Var.b, str2)) {
                            mi31Var = b8r.d(ldj0Var.o, str, str2, 4);
                        }
                    }
                    requirementBubbleDataInteractor$listenBubbles$$inlined$map$8$2$1.L$0 = null;
                    requirementBubbleDataInteractor$listenBubbles$$inlined$map$8$2$1.L$1 = null;
                    requirementBubbleDataInteractor$listenBubbles$$inlined$map$8$2$1.L$2 = null;
                    requirementBubbleDataInteractor$listenBubbles$$inlined$map$8$2$1.L$3 = null;
                    requirementBubbleDataInteractor$listenBubbles$$inlined$map$8$2$1.label = 1;
                    if (this.a.emit(mi31Var, requirementBubbleDataInteractor$listenBubbles$$inlined$map$8$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        requirementBubbleDataInteractor$listenBubbles$$inlined$map$8$2$1 = new RequirementBubbleDataInteractor$listenBubbles$$inlined$map$8$2$1(this, continuation);
        Object obj22 = requirementBubbleDataInteractor$listenBubbles$$inlined$map$8$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementBubbleDataInteractor$listenBubbles$$inlined$map$8$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
