package ru.yandex.taxi.requirements.interactor;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.w3r0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class f0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ w3r0 b;

    public f0(vpr vprVar, w3r0 w3r0Var) {
        this.a = vprVar;
        this.b = w3r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SetRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$2$1 setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SetRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$2$1) {
            setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$2$1 = (SetRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$2$1) continuation;
            int i2 = setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.g.getClass();
                    Long l = new Long(System.currentTimeMillis());
                    setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$2$1.L$0 = null;
                    setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$2$1.L$1 = null;
                    setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$2$1.L$2 = null;
                    setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$2$1.L$3 = null;
                    setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(l, setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$2$1 = new SetRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
