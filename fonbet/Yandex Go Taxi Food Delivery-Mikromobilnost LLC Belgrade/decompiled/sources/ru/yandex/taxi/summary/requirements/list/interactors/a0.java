package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.joj0;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a0 implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ joj0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ mi31 w;

    public a0(tpr tprVar, joj0 joj0Var, String str, mi31 mi31Var) {
        this.a = tprVar;
        this.b = joj0Var;
        this.c = str;
        this.w = mi31Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RequirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$1 requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof RequirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$1) {
            requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$1 = (RequirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$1) continuation;
            int i2 = requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    z zVar = new z(vprVar, this.b, this.c, this.w);
                    requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$1.L$0 = null;
                    requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$1.L$1 = null;
                    requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$1.L$2 = null;
                    requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(zVar, requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$1 = new RequirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
