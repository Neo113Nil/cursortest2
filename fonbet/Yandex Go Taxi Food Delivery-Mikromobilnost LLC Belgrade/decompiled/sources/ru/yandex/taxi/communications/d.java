package ru.yandex.taxi.communications;

import com.yandex.go.address.models.Address;
import defpackage.iuc;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class d {
    public final ru.yandex.taxi.communications.data.b a;

    public d(ru.yandex.taxi.communications.data.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (defpackage.jl40.l(r10, defpackage.zzs.f) == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        GoCommunicationsGeoInteractor$getLocation$1 goCommunicationsGeoInteractor$getLocation$1;
        int i;
        zzs zzsVar;
        mo21 mo21Var;
        if (continuationImpl instanceof GoCommunicationsGeoInteractor$getLocation$1) {
            goCommunicationsGeoInteractor$getLocation$1 = (GoCommunicationsGeoInteractor$getLocation$1) continuationImpl;
            int i2 = goCommunicationsGeoInteractor$getLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                goCommunicationsGeoInteractor$getLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = goCommunicationsGeoInteractor$getLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = goCommunicationsGeoInteractor$getLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.communications.data.b bVar = this.a;
                    Address h = bVar.b.c().h();
                    if (h != null) {
                        zzsVar = h.B();
                    }
                    zzsVar = null;
                    iuc iucVar = zzsVar != null ? new iuc(zzsVar.a, zzsVar.b) : null;
                    if (iucVar != null) {
                        return iucVar;
                    }
                    goCommunicationsGeoInteractor$getLocation$1.L$0 = null;
                    goCommunicationsGeoInteractor$getLocation$1.label = 1;
                    obj = bVar.a(goCommunicationsGeoInteractor$getLocation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                mo21Var = (mo21) obj;
                if (mo21Var == null) {
                    return new iuc(mo21Var.a, mo21Var.b);
                }
                return null;
            }
        }
        goCommunicationsGeoInteractor$getLocation$1 = new GoCommunicationsGeoInteractor$getLocation$1(this, continuationImpl);
        Object obj2 = goCommunicationsGeoInteractor$getLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = goCommunicationsGeoInteractor$getLocation$1.label;
        if (i != 0) {
        }
        mo21Var = (mo21) obj2;
        if (mo21Var == null) {
        }
    }
}
