package ru.yandex.taxi.main.map.autofs;

import defpackage.br3;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AutoFsProtectionConfigProviderImpl$special$$inlined$map$2$2$1 autoFsProtectionConfigProviderImpl$special$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof AutoFsProtectionConfigProviderImpl$special$$inlined$map$2$2$1) {
            autoFsProtectionConfigProviderImpl$special$$inlined$map$2$2$1 = (AutoFsProtectionConfigProviderImpl$special$$inlined$map$2$2$1) continuation;
            int i2 = autoFsProtectionConfigProviderImpl$special$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoFsProtectionConfigProviderImpl$special$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = autoFsProtectionConfigProviderImpl$special$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoFsProtectionConfigProviderImpl$special$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(((br3) obj) != null);
                    autoFsProtectionConfigProviderImpl$special$$inlined$map$2$2$1.L$0 = null;
                    autoFsProtectionConfigProviderImpl$special$$inlined$map$2$2$1.L$1 = null;
                    autoFsProtectionConfigProviderImpl$special$$inlined$map$2$2$1.L$2 = null;
                    autoFsProtectionConfigProviderImpl$special$$inlined$map$2$2$1.L$3 = null;
                    autoFsProtectionConfigProviderImpl$special$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(valueOf, autoFsProtectionConfigProviderImpl$special$$inlined$map$2$2$1) == coroutineSingletons) {
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
        autoFsProtectionConfigProviderImpl$special$$inlined$map$2$2$1 = new AutoFsProtectionConfigProviderImpl$special$$inlined$map$2$2$1(this, continuation);
        Object obj22 = autoFsProtectionConfigProviderImpl$special$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoFsProtectionConfigProviderImpl$special$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
