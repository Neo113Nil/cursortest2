package ru.yandex.taxi.requirements.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.w3r0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public final class g0 implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ w3r0 b;

    public g0(n0 n0Var, w3r0 w3r0Var) {
        this.a = n0Var;
        this.b = w3r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SetRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$1 setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof SetRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$1) {
            setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$1 = (SetRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$1) continuation;
            int i2 = setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f0 f0Var = new f0(vprVar, this.b);
                    setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$1.L$0 = null;
                    setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$1.L$1 = null;
                    setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$1.L$2 = null;
                    setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(f0Var, setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$1 = new SetRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setRequirementsInteractor$reloadRequirementsTimestampFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
