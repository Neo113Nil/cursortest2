package ru.yandex.taxi.main.map.autofs;

import defpackage.gci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class d implements tpr {
    public final /* synthetic */ gci0 a;

    public d(gci0 gci0Var) {
        this.a = gci0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        AutoFsProtectionConfigProviderImpl$special$$inlined$map$2$1 autoFsProtectionConfigProviderImpl$special$$inlined$map$2$1;
        int i;
        if (continuation instanceof AutoFsProtectionConfigProviderImpl$special$$inlined$map$2$1) {
            autoFsProtectionConfigProviderImpl$special$$inlined$map$2$1 = (AutoFsProtectionConfigProviderImpl$special$$inlined$map$2$1) continuation;
            int i2 = autoFsProtectionConfigProviderImpl$special$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoFsProtectionConfigProviderImpl$special$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoFsProtectionConfigProviderImpl$special$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoFsProtectionConfigProviderImpl$special$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar);
                    autoFsProtectionConfigProviderImpl$special$$inlined$map$2$1.L$0 = null;
                    autoFsProtectionConfigProviderImpl$special$$inlined$map$2$1.L$1 = null;
                    autoFsProtectionConfigProviderImpl$special$$inlined$map$2$1.L$2 = null;
                    autoFsProtectionConfigProviderImpl$special$$inlined$map$2$1.label = 1;
                    if (this.a.a.collect(cVar, autoFsProtectionConfigProviderImpl$special$$inlined$map$2$1) == coroutineSingletons) {
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
        autoFsProtectionConfigProviderImpl$special$$inlined$map$2$1 = new AutoFsProtectionConfigProviderImpl$special$$inlined$map$2$1(this, continuation);
        Object obj2 = autoFsProtectionConfigProviderImpl$special$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoFsProtectionConfigProviderImpl$special$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
