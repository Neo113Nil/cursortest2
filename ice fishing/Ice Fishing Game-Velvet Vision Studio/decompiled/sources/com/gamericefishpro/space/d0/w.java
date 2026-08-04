package com.gamericefishpro.space.d0;

import android.content.Intent;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.t0.b2;
import com.gamericefishpro.space.t0.h2;
import com.gamericefishpro.space.t0.y1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;

    public /* synthetic */ w(int i, int i2, Object obj, Object obj2) {
        this.d = i2;
        this.i = obj;
        this.e = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Intent intentCreateIntent;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.f2.h1 h1Var = (com.gamericefishpro.space.f2.h1) obj;
                com.gamericefishpro.space.c3.a aVar = (com.gamericefishpro.space.c3.a) obj2;
                return ((com.gamericefishpro.space.f2.l0) this.i).a(h1Var, h1Var.j(Unit.a, new com.gamericefishpro.space.b1.h(-431986394, new w((com.gamericefishpro.space.b1.h) this.e, new y(h1Var, aVar.a), 1), true)), aVar.a);
            case 1:
                com.gamericefishpro.space.b1.h hVar = (com.gamericefishpro.space.b1.h) this.e;
                y yVar = (y) this.i;
                com.gamericefishpro.space.t0.r rVar = (com.gamericefishpro.space.t0.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    hVar.a(yVar, rVar, 0);
                } else {
                    rVar.V();
                }
                return Unit.a;
            case 2:
                com.gamericefishpro.space.g0.a aVar2 = (com.gamericefishpro.space.g0.a) this.i;
                d dVar = (d) this.e;
                com.gamericefishpro.space.c3.c cVar = (com.gamericefishpro.space.c3.c) obj;
                com.gamericefishpro.space.c3.a aVar3 = (com.gamericefishpro.space.c3.a) obj2;
                if (com.gamericefishpro.space.c3.a.h(aVar3.a) == Integer.MAX_VALUE) {
                    com.gamericefishpro.space.c0.a.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int iH = com.gamericefishpro.space.c3.a.h(aVar3.a);
                int iJ = cVar.J(dVar.a());
                int i = aVar2.a;
                int i2 = iH - ((i - 1) * iJ);
                int i3 = i2 / i;
                int i4 = i2 % i;
                ArrayList arrayList = new ArrayList(i);
                int i5 = 0;
                while (i5 < i) {
                    arrayList.add(Integer.valueOf((i5 < i4 ? 1 : 0) + i3));
                    i5++;
                }
                int[] iArrK = CollectionsKt.K(arrayList);
                int[] iArr = new int[iArrK.length];
                dVar.c(cVar, iH, iArrK, com.gamericefishpro.space.c3.l.d, iArr);
                return new com.gamericefishpro.space.u6.e(3, iArrK, iArr);
            case 3:
                ((Integer) obj2).getClass();
                y3.i((List) this.i, (Collection) this.e, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                a4.k((com.gamericefishpro.space.e1.c) this.i, (com.gamericefishpro.space.b1.h) this.e, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                return Unit.a;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                com.gamericefishpro.space.h0.y yVar2 = (com.gamericefishpro.space.h0.y) this.i;
                com.gamericefishpro.space.h0.x xVar = (com.gamericefishpro.space.h0.x) this.e;
                com.gamericefishpro.space.t0.r rVar2 = (com.gamericefishpro.space.t0.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    com.gamericefishpro.space.h0.z zVar = (com.gamericefishpro.space.h0.z) yVar2.b.invoke();
                    int iD = xVar.c;
                    Object obj3 = xVar.a;
                    if ((iD >= zVar.a() || !zVar.b(iD).equals(obj3)) && (iD = zVar.d(obj3)) != -1) {
                        xVar.c = iD;
                    }
                    if (iD != -1) {
                        rVar2.a0(-1664741271);
                        com.gamericefishpro.space.h0.n.d(zVar, yVar2.a, iD, xVar.a, rVar2, 0);
                    } else {
                        rVar2.a0(-1668376610);
                    }
                    rVar2.p(false);
                    boolean zH = rVar2.h(xVar);
                    Object objP = rVar2.P();
                    if (zH || objP == com.gamericefishpro.space.t0.n.a) {
                        objP = new com.gamericefishpro.space.a7.c(9, xVar);
                        rVar2.k0(objP);
                    }
                    com.gamericefishpro.space.t0.i.d(obj3, (Function1) objP, rVar2);
                } else {
                    rVar2.V();
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((com.gamericefishpro.space.f0.o) this.e).a(new com.gamericefishpro.space.h0.d0((com.gamericefishpro.space.h0.y) this.i, (com.gamericefishpro.space.f2.h1) obj), ((com.gamericefishpro.space.c3.a) obj2).a);
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                com.gamericefishpro.space.b1.h hVar2 = (com.gamericefishpro.space.b1.h) this.e;
                com.gamericefishpro.space.h0.v0 v0Var = (com.gamericefishpro.space.h0.v0) this.i;
                com.gamericefishpro.space.t0.r rVar3 = (com.gamericefishpro.space.t0.r) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (rVar3.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    hVar2.a(v0Var, rVar3, 0);
                } else {
                    rVar3.V();
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                ((Integer) obj2).getClass();
                com.gamericefishpro.space.d9.h.a((Function0) this.i, (com.gamericefishpro.space.k7.f) this.e, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                return Unit.a;
            case 9:
                ((Integer) obj2).getClass();
                com.gamericefishpro.space.b9.a.c((Function0) this.i, (Function0) this.e, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                return Unit.a;
            case 10:
                ((Integer) obj2).getClass();
                com.gamericefishpro.space.i.a.b((Function0) this.i, (com.gamericefishpro.space.o7.e) this.e, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                return Unit.a;
            case RequestError.STOP_TRACKING /* 11 */:
                ((Integer) obj2).getClass();
                y3.g((String) this.i, (com.gamericefishpro.space.b1.h) this.e, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(55));
                return Unit.a;
            case 12:
                ((Integer) obj2).getClass();
                com.gamericefishpro.space.s7.d.a((Function0) this.i, (com.gamericefishpro.space.s7.i) this.e, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                return Unit.a;
            case 13:
                com.gamericefishpro.space.u6.q qVar = (com.gamericefishpro.space.u6.q) this.i;
                h2 h2Var = (h2) this.e;
                int iIntValue4 = ((Integer) obj).intValue();
                if (obj2 instanceof com.gamericefishpro.space.t0.j) {
                    ((com.gamericefishpro.space.v0.e) qVar.f).b((com.gamericefishpro.space.t0.j) obj2);
                } else if (!(obj2 instanceof b2)) {
                    if (obj2 instanceof y1) {
                        com.gamericefishpro.space.t0.i.A(h2Var, iIntValue4, obj2);
                        qVar.e((y1) obj2);
                    } else if (obj2 instanceof com.gamericefishpro.space.t0.p1) {
                        com.gamericefishpro.space.t0.i.A(h2Var, iIntValue4, obj2);
                        ((com.gamericefishpro.space.t0.p1) obj2).d();
                    }
                }
                return Unit.a;
            case 14:
                ((Integer) obj2).getClass();
                com.gamericefishpro.space.wa.b.a((Function0) this.i, (com.gamericefishpro.space.u7.c) this.e, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                return Unit.a;
            case 15:
                com.gamericefishpro.space.t0.v0 v0Var2 = (com.gamericefishpro.space.t0.v0) this.i;
                com.gamericefishpro.space.e.q qVar2 = (com.gamericefishpro.space.e.q) this.e;
                WebChromeClient.FileChooserParams fileChooserParams = (WebChromeClient.FileChooserParams) obj2;
                v0Var2.setValue((ValueCallback) obj);
                if (fileChooserParams != null && (intentCreateIntent = fileChooserParams.createIntent()) != null) {
                    try {
                        qVar2.L(intentCreateIntent);
                    } catch (Exception unused) {
                        ValueCallback valueCallback = (ValueCallback) v0Var2.getValue();
                        if (valueCallback != null) {
                            valueCallback.onReceiveValue(null);
                        }
                        v0Var2.setValue(null);
                    }
                    break;
                } else {
                    ValueCallback valueCallback2 = (ValueCallback) v0Var2.getValue();
                    if (valueCallback2 != null) {
                        valueCallback2.onReceiveValue(null);
                    }
                    v0Var2.setValue(null);
                }
                return Unit.a;
            case 16:
                ((Integer) obj2).getClass();
                ((com.gamericefishpro.space.w.l1) this.i).a(this.e, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                return Unit.a;
            default:
                com.gamericefishpro.space.h1.m mVar = (com.gamericefishpro.space.h1.m) this.i;
                Function1 function1 = (Function1) this.e;
                ((Integer) obj2).getClass();
                com.gamericefishpro.space.y.q.a(com.gamericefishpro.space.t0.i.D(1), mVar, (com.gamericefishpro.space.t0.r) obj, function1);
                return Unit.a;
        }
    }

    public /* synthetic */ w(int i, Object obj, Object obj2) {
        this.d = i;
        this.i = obj;
        this.e = obj2;
    }

    public /* synthetic */ w(FrameLayout frameLayout, com.gamericefishpro.space.t0.v0 v0Var, com.gamericefishpro.space.e.q qVar) {
        this.d = 15;
        this.i = v0Var;
        this.e = qVar;
    }

    public /* synthetic */ w(com.gamericefishpro.space.b1.h hVar, Object obj, int i) {
        this.d = i;
        this.e = hVar;
        this.i = obj;
    }
}
