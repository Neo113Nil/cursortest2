package defpackage;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPaySmartOffer;
import com.yandex.plus.pay.ui.api.feature.payment.e;
import com.yandex.plus.pay.ui.api.feature.payment.f;
import com.yandex.plus.pay.ui.api.feature.payment.g;
import com.yandex.plus.pay.ui.core.a;
import com.yandex.plus.pay.ui.core.api.tarifficator.b;
import com.yandex.plus.pay.ui.core.api.tarifficator.c;
import com.yandex.plus.pay.ui.core.api.tarifficator.d;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class dfk extends aur implements Function2 {
    public int j;
    public final /* synthetic */ efk k;
    public final /* synthetic */ PlusPaySmartOffer l;
    public final /* synthetic */ zfk m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfk(efk efkVar, PlusPaySmartOffer plusPaySmartOffer, zfk zfkVar, Continuation continuation) {
        super(2, continuation);
        this.k = efkVar;
        this.l = plusPaySmartOffer;
        this.m = zfkVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new dfk(this.k, this.l, this.m, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dfk) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0071, code lost:
    
        if (r10 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0073, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0029, code lost:
    
        if (r10 == r0) goto L26;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kgb kgbVar;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        String str = null;
        if (i == 0) {
            qgg.h0(obj);
            a aVar = this.k.a;
            this.j = 1;
            obj = aVar.a();
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                d dVar = (d) obj;
                dVar.getClass();
                if (dVar instanceof com.yandex.plus.pay.ui.core.api.tarifficator.a) {
                    return pgk.a;
                }
                if (dVar instanceof c) {
                    return rgk.a;
                }
                if (!(dVar instanceof b)) {
                    b6e.s();
                    return null;
                }
                g gVar = ((b) dVar).a;
                gVar.getClass();
                boolean z = gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.a;
                f fVar = f.a;
                e eVar = e.a;
                com.yandex.plus.pay.ui.api.feature.payment.b bVar = com.yandex.plus.pay.ui.api.feature.payment.b.a;
                if (z || (gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.d)) {
                    kgbVar = kgb.b;
                } else if (gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.c) {
                    kgbVar = kgb.c;
                } else if (gVar.equals(bVar)) {
                    kgbVar = kgb.a;
                } else {
                    if (!gVar.equals(eVar) && !gVar.equals(fVar)) {
                        b6e.s();
                        return null;
                    }
                    kgbVar = kgb.d;
                }
                if (z) {
                    str = ((com.yandex.plus.pay.ui.api.feature.payment.a) gVar).a.toString();
                } else if (gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.c) {
                    str = ((com.yandex.plus.pay.ui.api.feature.payment.c) gVar).a.toString();
                } else if (gVar instanceof com.yandex.plus.pay.ui.api.feature.payment.d) {
                    str = ((com.yandex.plus.pay.ui.api.feature.payment.d) gVar).a.toString();
                } else if (!gVar.equals(bVar) && !gVar.equals(eVar) && !gVar.equals(fVar)) {
                    b6e.s();
                    return null;
                }
                return new qgk(new lgb(kgbVar, str));
            }
            qgg.h0(obj);
        }
        com.yandex.plus.pay.ui.tarifficator.api.e C = com.yandex.plus.bdui.flex.ui.a.C((com.yandex.plus.pay.ui.core.internal.a) obj);
        PlusPaySmartOffer plusPaySmartOffer = this.l;
        PlusPayCompositeOffers.Offer compositeOffer = plusPaySmartOffer.getCompositeOffer();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String page = plusPaySmartOffer.getPage();
        if (page == null) {
            page = "";
        }
        String place = plusPaySmartOffer.getPlace();
        com.yandex.plus.pay.api.analytics.d dVar2 = new com.yandex.plus.pay.api.analytics.d(place != null ? place : "", page, null, linkedHashMap);
        q5b q5bVar = q5b.a;
        com.yandex.plus.pay.ui.tarifficator.api.a aVar2 = com.yandex.plus.pay.ui.tarifficator.api.a.b;
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        if (this.m.b) {
            aVar2 = com.yandex.plus.pay.ui.tarifficator.api.a.a;
        }
        com.yandex.plus.pay.ui.tarifficator.api.b bVar2 = new com.yandex.plus.pay.ui.tarifficator.api.b(q5bVar, aVar2, e5bVar);
        this.j = 2;
        obj = ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.e) C).a(compositeOffer, dVar2, bVar2, this);
    }
}
