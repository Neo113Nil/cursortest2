package ru.yandex.taxi.requirements.interactor;

import defpackage.ldj0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ldj0 c;

    public a(vpr vprVar, String str, ldj0 ldj0Var) {
        this.a = vprVar;
        this.b = str;
        this.c = ldj0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (defpackage.jl40.l(r7, r2 != null ? r2.b : null) != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RequirementBubbleDataInteractor$listenBubbles$$inlined$filter$1$2$1 requirementBubbleDataInteractor$listenBubbles$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof RequirementBubbleDataInteractor$listenBubbles$$inlined$filter$1$2$1) {
            requirementBubbleDataInteractor$listenBubbles$$inlined$filter$1$2$1 = (RequirementBubbleDataInteractor$listenBubbles$$inlined$filter$1$2$1) continuation;
            int i2 = requirementBubbleDataInteractor$listenBubbles$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementBubbleDataInteractor$listenBubbles$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = requirementBubbleDataInteractor$listenBubbles$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementBubbleDataInteractor$listenBubbles$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pex0 pex0Var = (pex0) ((Triple) obj).getFirst();
                    if (this.b == null) {
                        ldj0 ldj0Var = this.c;
                        ldj0Var.getClass();
                        String str = pex0Var != null ? pex0Var.b : null;
                        pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) ldj0Var.b).m();
                    }
                    requirementBubbleDataInteractor$listenBubbles$$inlined$filter$1$2$1.L$0 = null;
                    requirementBubbleDataInteractor$listenBubbles$$inlined$filter$1$2$1.L$1 = null;
                    requirementBubbleDataInteractor$listenBubbles$$inlined$filter$1$2$1.L$2 = null;
                    requirementBubbleDataInteractor$listenBubbles$$inlined$filter$1$2$1.L$3 = null;
                    requirementBubbleDataInteractor$listenBubbles$$inlined$filter$1$2$1.label = 1;
                    if (this.a.emit(obj, requirementBubbleDataInteractor$listenBubbles$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        requirementBubbleDataInteractor$listenBubbles$$inlined$filter$1$2$1 = new RequirementBubbleDataInteractor$listenBubbles$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = requirementBubbleDataInteractor$listenBubbles$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementBubbleDataInteractor$listenBubbles$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
