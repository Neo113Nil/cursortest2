package ru.yandex.taxi.requirements.repository;

import defpackage.jl40;
import defpackage.nu1;
import defpackage.ny61;
import defpackage.ou1;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ pex0 b;

    public c(vpr vprVar, pex0 pex0Var) {
        this.a = vprVar;
        this.b = pex0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RequiredAltChoiceBubbleRepository$requiredAltChoiceBubbleFlow$lambda$0$$inlined$map$1$2$1 requiredAltChoiceBubbleRepository$requiredAltChoiceBubbleFlow$lambda$0$$inlined$map$1$2$1;
        int i;
        nu1 nu1Var;
        Object obj2;
        if (continuation instanceof RequiredAltChoiceBubbleRepository$requiredAltChoiceBubbleFlow$lambda$0$$inlined$map$1$2$1) {
            requiredAltChoiceBubbleRepository$requiredAltChoiceBubbleFlow$lambda$0$$inlined$map$1$2$1 = (RequiredAltChoiceBubbleRepository$requiredAltChoiceBubbleFlow$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = requiredAltChoiceBubbleRepository$requiredAltChoiceBubbleFlow$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requiredAltChoiceBubbleRepository$requiredAltChoiceBubbleFlow$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = requiredAltChoiceBubbleRepository$requiredAltChoiceBubbleFlow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requiredAltChoiceBubbleRepository$requiredAltChoiceBubbleFlow$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    String str = (String) obj;
                    pex0 pex0Var = this.b.M0;
                    if (pex0Var != null) {
                        Iterator it = ru.yandex.taxi.tariffs.model.b.b(pex0Var).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (jl40.l(((nu1) obj2).b, str)) {
                                break;
                            }
                        }
                        nu1Var = (nu1) obj2;
                    } else {
                        nu1Var = null;
                    }
                    ou1 ou1Var = nu1Var != null ? nu1Var.g : null;
                    requiredAltChoiceBubbleRepository$requiredAltChoiceBubbleFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    requiredAltChoiceBubbleRepository$requiredAltChoiceBubbleFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    requiredAltChoiceBubbleRepository$requiredAltChoiceBubbleFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    requiredAltChoiceBubbleRepository$requiredAltChoiceBubbleFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    requiredAltChoiceBubbleRepository$requiredAltChoiceBubbleFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(ou1Var, requiredAltChoiceBubbleRepository$requiredAltChoiceBubbleFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        requiredAltChoiceBubbleRepository$requiredAltChoiceBubbleFlow$lambda$0$$inlined$map$1$2$1 = new RequiredAltChoiceBubbleRepository$requiredAltChoiceBubbleFlow$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj32 = requiredAltChoiceBubbleRepository$requiredAltChoiceBubbleFlow$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requiredAltChoiceBubbleRepository$requiredAltChoiceBubbleFlow$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
