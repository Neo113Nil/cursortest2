package ru.yandex.taxi.main.map.autofs;

import defpackage.dr3;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ dr3 b;

    public b(tpr tprVar, dr3 dr3Var) {
        this.a = tprVar;
        this.b = dr3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        AutoFsProtectionConfigProviderImpl$special$$inlined$map$1$1 autoFsProtectionConfigProviderImpl$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof AutoFsProtectionConfigProviderImpl$special$$inlined$map$1$1) {
            autoFsProtectionConfigProviderImpl$special$$inlined$map$1$1 = (AutoFsProtectionConfigProviderImpl$special$$inlined$map$1$1) continuation;
            int i2 = autoFsProtectionConfigProviderImpl$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoFsProtectionConfigProviderImpl$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoFsProtectionConfigProviderImpl$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoFsProtectionConfigProviderImpl$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    autoFsProtectionConfigProviderImpl$special$$inlined$map$1$1.L$0 = null;
                    autoFsProtectionConfigProviderImpl$special$$inlined$map$1$1.L$1 = null;
                    autoFsProtectionConfigProviderImpl$special$$inlined$map$1$1.L$2 = null;
                    autoFsProtectionConfigProviderImpl$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, autoFsProtectionConfigProviderImpl$special$$inlined$map$1$1) == coroutineSingletons) {
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
        autoFsProtectionConfigProviderImpl$special$$inlined$map$1$1 = new AutoFsProtectionConfigProviderImpl$special$$inlined$map$1$1(this, continuation);
        Object obj2 = autoFsProtectionConfigProviderImpl$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoFsProtectionConfigProviderImpl$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
