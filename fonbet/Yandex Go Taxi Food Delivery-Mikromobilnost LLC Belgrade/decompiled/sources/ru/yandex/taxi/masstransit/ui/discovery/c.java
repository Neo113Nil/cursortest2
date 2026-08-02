package ru.yandex.taxi.masstransit.ui.discovery;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.mapkit.geometry.Polyline;
import defpackage.ah00;
import defpackage.d5v0;
import defpackage.e5v0;
import defpackage.eaf0;
import defpackage.faf0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.o400;
import defpackage.po21;
import defpackage.scc;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.tu30;
import defpackage.uc4;
import defpackage.uyj;
import defpackage.zgc0;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes6.dex */
public final class c implements faf0 {
    public final ah00 a;
    public final tu30 b;
    public final po21 c;
    public final tt2 w;

    public c(ah00 ah00Var, tu30 tu30Var, po21 po21Var, tt2 tt2Var) {
        this.a = ah00Var;
        this.b = tu30Var;
        this.c = po21Var;
        this.w = tt2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r15 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c cVar, ContinuationImpl continuationImpl) {
        MtProductsParamFactory$createFromLocation$1 mtProductsParamFactory$createFromLocation$1;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof MtProductsParamFactory$createFromLocation$1) {
            mtProductsParamFactory$createFromLocation$1 = (MtProductsParamFactory$createFromLocation$1) continuationImpl;
            int i2 = mtProductsParamFactory$createFromLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtProductsParamFactory$createFromLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtProductsParamFactory$createFromLocation$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtProductsParamFactory$createFromLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    po21 po21Var = cVar.c;
                    mtProductsParamFactory$createFromLocation$1.label = 1;
                    obj = ((e) po21Var).f(mtProductsParamFactory$createFromLocation$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                mo21 mo21Var = (mo21) obj;
                zzs zzsVar = new zzs(mo21Var.a, mo21Var.b, 0, null, null, 28);
                PlainAddress.Companion.getClass();
                Address a = zgc0.a(zzsVar);
                mtProductsParamFactory$createFromLocation$1.L$0 = null;
                mtProductsParamFactory$createFromLocation$1.L$1 = null;
                mtProductsParamFactory$createFromLocation$1.label = 2;
                Object c = cVar.c(a, mtProductsParamFactory$createFromLocation$1);
                return c != obj2 ? obj2 : c;
            }
        }
        mtProductsParamFactory$createFromLocation$1 = new MtProductsParamFactory$createFromLocation$1(cVar, continuationImpl);
        Object obj3 = mtProductsParamFactory$createFromLocation$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtProductsParamFactory$createFromLocation$1.label;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) obj3;
        zzs zzsVar2 = new zzs(mo21Var2.a, mo21Var2.b, 0, null, null, 28);
        PlainAddress.Companion.getClass();
        Address a2 = zgc0.a(zzsVar2);
        mtProductsParamFactory$createFromLocation$1.L$0 = null;
        mtProductsParamFactory$createFromLocation$1.L$1 = null;
        mtProductsParamFactory$createFromLocation$1.label = 2;
        Object c2 = cVar.c(a2, mtProductsParamFactory$createFromLocation$1);
        if (c2 != obj22) {
        }
    }

    @Override // defpackage.faf0
    public final tpr a() {
        b bVar = new b(kotlinx.coroutines.flow.e.d(this.b.b), this);
        this.w.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(bVar, o400.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Address address, ContinuationImpl continuationImpl) {
        MtProductsParamFactory$createFromAddress$1 mtProductsParamFactory$createFromAddress$1;
        int i;
        Address address2;
        zzs zzsVar;
        ArrayList arrayList;
        int i2;
        if (continuationImpl instanceof MtProductsParamFactory$createFromAddress$1) {
            mtProductsParamFactory$createFromAddress$1 = (MtProductsParamFactory$createFromAddress$1) continuationImpl;
            int i3 = mtProductsParamFactory$createFromAddress$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mtProductsParamFactory$createFromAddress$1.label = i3 - Integer.MIN_VALUE;
                Object obj = mtProductsParamFactory$createFromAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtProductsParamFactory$createFromAddress$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zzs B = address.B();
                    List a = this.b.a().a();
                    List list = a;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
                    int i4 = 0;
                    for (Object obj2 : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            scc.m();
                            throw null;
                        }
                        Address address3 = (Address) obj2;
                        zzs B2 = address3.B();
                        String uri = address3.getUri();
                        if (uri == null) {
                            uri = "";
                        }
                        String c2 = address3.c2();
                        d5v0 d5v0Var = e5v0.Companion;
                        int size = a.size();
                        d5v0Var.getClass();
                        arrayList2.add(new e5v0(B2, uri, c2, d5v0.a(i4, size), address3.J1(), address3.D1()));
                        i4 = i5;
                    }
                    Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                    mtProductsParamFactory$createFromAddress$1.L$0 = null;
                    mtProductsParamFactory$createFromAddress$1.L$1 = B;
                    address2 = address;
                    mtProductsParamFactory$createFromAddress$1.L$2 = address2;
                    mtProductsParamFactory$createFromAddress$1.L$3 = arrayList2;
                    mtProductsParamFactory$createFromAddress$1.I$0 = 1;
                    mtProductsParamFactory$createFromAddress$1.label = 1;
                    Object K = ru.yandex.taxi.map.utils.a.K(this.a, mtProductsParamFactory$createFromAddress$1);
                    if (K == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    zzsVar = B;
                    arrayList = arrayList2;
                    obj = K;
                    i2 = 1;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = mtProductsParamFactory$createFromAddress$1.I$0;
                    ?? r3 = (List) mtProductsParamFactory$createFromAddress$1.L$3;
                    address2 = (Address) mtProductsParamFactory$createFromAddress$1.L$2;
                    zzs zzsVar2 = (zzs) mtProductsParamFactory$createFromAddress$1.L$1;
                    kotlin.b.b(obj);
                    arrayList = r3;
                    zzsVar = zzsVar2;
                }
                return new eaf0(zzsVar, address2, arrayList, i2 == 0, (uc4) obj, null, null, null, 224);
            }
        }
        mtProductsParamFactory$createFromAddress$1 = new MtProductsParamFactory$createFromAddress$1(this, continuationImpl);
        Object obj3 = mtProductsParamFactory$createFromAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtProductsParamFactory$createFromAddress$1.label;
        if (i != 0) {
        }
        return new eaf0(zzsVar, address2, arrayList, i2 == 0, (uc4) obj3, null, null, null, 224);
    }
}
