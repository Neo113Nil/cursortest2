package ru.yandex.taxi.communications;

import com.yandex.go.address.models.Address;
import defpackage.d0l0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;

    public l(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (defpackage.jl40.l(r6, defpackage.zzs.f) == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiCommunicationsCountryCodeRepository$special$$inlined$mapNotNull$1$2$1 taxiCommunicationsCountryCodeRepository$special$$inlined$mapNotNull$1$2$1;
        int i;
        zzs zzsVar;
        if (continuation instanceof TaxiCommunicationsCountryCodeRepository$special$$inlined$mapNotNull$1$2$1) {
            taxiCommunicationsCountryCodeRepository$special$$inlined$mapNotNull$1$2$1 = (TaxiCommunicationsCountryCodeRepository$special$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = taxiCommunicationsCountryCodeRepository$special$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiCommunicationsCountryCodeRepository$special$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiCommunicationsCountryCodeRepository$special$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiCommunicationsCountryCodeRepository$special$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Address h = ((d0l0) obj).h();
                    if (h != null) {
                        zzsVar = h.B();
                    }
                    zzsVar = null;
                    if (zzsVar != null) {
                        taxiCommunicationsCountryCodeRepository$special$$inlined$mapNotNull$1$2$1.L$0 = null;
                        taxiCommunicationsCountryCodeRepository$special$$inlined$mapNotNull$1$2$1.L$1 = null;
                        taxiCommunicationsCountryCodeRepository$special$$inlined$mapNotNull$1$2$1.L$2 = null;
                        taxiCommunicationsCountryCodeRepository$special$$inlined$mapNotNull$1$2$1.L$3 = null;
                        taxiCommunicationsCountryCodeRepository$special$$inlined$mapNotNull$1$2$1.L$4 = null;
                        taxiCommunicationsCountryCodeRepository$special$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(zzsVar, taxiCommunicationsCountryCodeRepository$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        taxiCommunicationsCountryCodeRepository$special$$inlined$mapNotNull$1$2$1 = new TaxiCommunicationsCountryCodeRepository$special$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = taxiCommunicationsCountryCodeRepository$special$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiCommunicationsCountryCodeRepository$special$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
