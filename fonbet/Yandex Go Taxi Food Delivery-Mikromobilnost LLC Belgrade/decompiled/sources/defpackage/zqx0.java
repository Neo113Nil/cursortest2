package defpackage;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zqx0 implements wfd0 {
    public final gio a;
    public final jbd0 b;
    public final String c;
    public final String d;

    public zqx0(gio gioVar, jbd0 jbd0Var, String str, String str2) {
        this.a = gioVar;
        this.b = jbd0Var;
        this.c = str;
        this.d = str2;
    }

    public final void a(PlusPayCompositeOffers plusPayCompositeOffers) {
        String sessionId = plusPayCompositeOffers.getSessionId();
        String target = plusPayCompositeOffers.getTarget();
        String offersBatchId = plusPayCompositeOffers.getOffersBatchId();
        List<PlusPayCompositeOffers.Offer> offers = plusPayCompositeOffers.getOffers();
        ArrayList arrayList = new ArrayList(tcc.n(offers, 10));
        Iterator<T> it = offers.iterator();
        while (it.hasNext()) {
            arrayList.add(((PlusPayCompositeOffers.Offer) it.next()).getPositionId());
        }
        this.a.d(sessionId, target, offersBatchId, arrayList);
    }
}
