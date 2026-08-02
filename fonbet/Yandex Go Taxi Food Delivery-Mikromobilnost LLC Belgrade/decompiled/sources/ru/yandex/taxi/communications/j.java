package ru.yandex.taxi.communications;

import defpackage.e2t;
import defpackage.f2t;
import defpackage.g2t;
import defpackage.h8j0;
import defpackage.ksw;
import defpackage.ny61;
import defpackage.u6r;
import defpackage.v6r;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e2t b;

    public j(vpr vprVar, e2t e2tVar) {
        this.a = vprVar;
        this.b = e2tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiCommunicationsCountryCodeRepository$special$$inlined$map$1$2$1 taxiCommunicationsCountryCodeRepository$special$$inlined$map$1$2$1;
        int i;
        h8j0 h8j0Var;
        List list;
        ksw kswVar;
        v6r v6rVar;
        if (continuation instanceof TaxiCommunicationsCountryCodeRepository$special$$inlined$map$1$2$1) {
            taxiCommunicationsCountryCodeRepository$special$$inlined$map$1$2$1 = (TaxiCommunicationsCountryCodeRepository$special$$inlined$map$1$2$1) continuation;
            int i2 = taxiCommunicationsCountryCodeRepository$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiCommunicationsCountryCodeRepository$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiCommunicationsCountryCodeRepository$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiCommunicationsCountryCodeRepository$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    g2t a = ((f2t) this.b).a();
                    u6r u6rVar = (a == null || (v6rVar = a.a) == null) ? null : v6rVar.a;
                    String str = (u6rVar == null || (list = u6rVar.c) == null || (kswVar = (ksw) kotlin.collections.a.R(list)) == null) ? null : kswVar.k;
                    if (str == null) {
                        str = (u6rVar == null || (h8j0Var = u6rVar.l) == null) ? null : h8j0Var.a;
                    }
                    taxiCommunicationsCountryCodeRepository$special$$inlined$map$1$2$1.L$0 = null;
                    taxiCommunicationsCountryCodeRepository$special$$inlined$map$1$2$1.L$1 = null;
                    taxiCommunicationsCountryCodeRepository$special$$inlined$map$1$2$1.L$2 = null;
                    taxiCommunicationsCountryCodeRepository$special$$inlined$map$1$2$1.L$3 = null;
                    taxiCommunicationsCountryCodeRepository$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(str, taxiCommunicationsCountryCodeRepository$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        taxiCommunicationsCountryCodeRepository$special$$inlined$map$1$2$1 = new TaxiCommunicationsCountryCodeRepository$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = taxiCommunicationsCountryCodeRepository$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiCommunicationsCountryCodeRepository$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
