package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.plus.core.graphql.type.TEMPLATE_TAG;
import com.yandex.plus.core.graphql.type.TRANSITION_LANGUAGE;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class w5f implements b050 {
    public final String a;
    public final yf70 b;
    public final List c;
    public final yf70 d;
    public final TRANSITION_LANGUAGE e;
    public final String f;
    public final yf70 g;
    public final String h;
    public final String i;
    public final TEMPLATE_TAG j;
    public final String k;
    public final String l;
    public final String m;
    public final boolean n;
    public final yf70 o;
    public final yf70 p;

    public w5f(String str, yf70 yf70Var, List list, yf70 yf70Var2, TRANSITION_LANGUAGE transition_language, String str2, yf70 yf70Var3, String str3, String str4, TEMPLATE_TAG template_tag, String str5, String str6, String str7, boolean z, yf70 yf70Var4, yf70 yf70Var5) {
        this.a = str;
        this.b = yf70Var;
        this.c = list;
        this.d = yf70Var2;
        this.e = transition_language;
        this.f = str2;
        this.g = yf70Var3;
        this.h = str3;
        this.i = str4;
        this.j = template_tag;
        this.k = str5;
        this.l = str6;
        this.m = str7;
        this.n = z;
        this.o = yf70Var4;
        this.p = yf70Var5;
    }

    @Override // defpackage.fc70
    public final void a(bfx bfxVar, c cVar) {
        bfxVar.A1("eventSessionId");
        foe foeVar = l80.a;
        bfxVar.r0(this.a);
        yf70 yf70Var = this.b;
        boolean z = yf70Var instanceof xf70;
        wkf wkfVar = rs60.a;
        if (z) {
            bfxVar.A1("tariffId");
            b70 d = cVar.d(wkfVar);
            if (d instanceof om60) {
                ny61.r("The adapter is already nullable");
                return;
            }
            Object obj = ((xf70) yf70Var).a;
            if (obj == null) {
                bfxVar.k2();
            } else {
                d.a(bfxVar, cVar, obj);
            }
        }
        bfxVar.A1("optionsIds");
        b70 d2 = cVar.d(wkfVar);
        bfxVar.l();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            d2.a(bfxVar, cVar, it.next());
        }
        bfxVar.j();
        yf70 yf70Var2 = this.d;
        if (yf70Var2 instanceof xf70) {
            bfxVar.A1("offerFor");
            b70 d3 = cVar.d(wkfVar);
            if (d3 instanceof om60) {
                ny61.r("The adapter is already nullable");
                return;
            }
            Object obj2 = ((xf70) yf70Var2).a;
            if (obj2 == null) {
                bfxVar.k2();
            } else {
                d3.a(bfxVar, cVar, obj2);
            }
        }
        bfxVar.A1("language");
        bfxVar.r0(this.e.getRawValue());
        bfxVar.A1("origin");
        bfxVar.r0(this.f);
        yf70 yf70Var3 = this.g;
        if (yf70Var3 instanceof xf70) {
            bfxVar.A1("paymentMethodId");
            l80.i.a(bfxVar, cVar, ((xf70) yf70Var3).a);
        }
        bfxVar.A1("returnPath");
        cVar.d(mr11.a).a(bfxVar, cVar, "");
        bfxVar.A1("source");
        bfxVar.r0(this.h);
        bfxVar.A1("target");
        bfxVar.r0(this.i);
        bfxVar.A1("templateTag");
        bfxVar.r0(this.j.getRawValue());
        bfxVar.A1("developerPayload");
        bfxVar.r0("");
        bfxVar.A1("offersPositionId");
        bfxVar.r0(this.k);
        bfxVar.A1("offersBatchId");
        bfxVar.r0(this.l);
        bfxVar.A1("externalCallerPayload");
        bfxVar.r0(this.m);
        bfxVar.A1("silentRequested");
        l80.f.a(bfxVar, cVar, Boolean.valueOf(this.n));
        yf70 yf70Var4 = this.o;
        if (yf70Var4 instanceof xf70) {
            bfxVar.A1("experimentFlags");
            lqy lqyVar = new lqy(foeVar);
            Object obj3 = ((xf70) yf70Var4).a;
            if (obj3 == null) {
                bfxVar.k2();
            } else {
                lqyVar.a(bfxVar, cVar, obj3);
            }
        }
        yf70 yf70Var5 = this.p;
        if (yf70Var5 instanceof xf70) {
            bfxVar.A1("additionalOffers");
            ep60 a = l80.a(g97.f);
            Object obj4 = ((xf70) yf70Var5).a;
            if (obj4 == null) {
                bfxVar.k2();
            } else {
                a.a(bfxVar, cVar, obj4);
            }
        }
    }

    @Override // defpackage.fc70
    public final ep60 adapter() {
        return l80.a(x5f.a);
    }

    @Override // defpackage.fc70
    public final String b() {
        return "mutation CreateInvoice($eventSessionId: String!, $tariffId: OfferNameScalar, $optionsIds: [OfferNameScalar!]!, $offerFor: OfferNameScalar, $language: TRANSITION_LANGUAGE!, $origin: String!, $paymentMethodId: String, $returnPath: URLScalar!, $source: String!, $target: String!, $templateTag: TEMPLATE_TAG!, $developerPayload: String!, $offersPositionId: String!, $offersBatchId: String!, $externalCallerPayload: String!, $silentRequested: Boolean!, $experimentFlags: [String!], $additionalOffers: CheckoutInvoiceAdditionalOffersInput) { invoice { externalCreate(eventSessionId: $eventSessionId, req: { offersPositionId: $offersPositionId offersBatchId: $offersBatchId compositeOffer: { tariffOffer: $tariffId serviceOffers: $optionsIds offerFor: $offerFor }  developerPayload: $developerPayload language: $language origin: $origin paymentMethodId: $paymentMethodId returnPath: $returnPath source: $source target: $target templateTag: $templateTag externalCallerPayload: $externalCallerPayload oneClickRequested: $silentRequested experimentFlags: $experimentFlags additionalOffers: $additionalOffers } ) { __typename ...invoice } } }  fragment invoicePrice on Price { currency amount }  fragment invoicePayment on Payment { id respCode respDesc status }  fragment invoice on Invoice { id invoiceStatus form paymentMethodId paidAmount { __typename ...invoicePrice } payment { __typename ...invoicePayment } totalAmount { __typename ...invoicePrice } invoicePollingParams { retryDelayMillis timeoutMillis } widgetQrCodeParams { widgetUrl underlineText } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5f)) {
            return false;
        }
        w5f w5fVar = (w5f) obj;
        return jl40.l(this.a, w5fVar.a) && this.b.equals(w5fVar.b) && jl40.l(this.c, w5fVar.c) && this.d.equals(w5fVar.d) && this.e == w5fVar.e && jl40.l(this.f, w5fVar.f) && this.g.equals(w5fVar.g) && jl40.l(this.h, w5fVar.h) && jl40.l(this.i, w5fVar.i) && this.j == w5fVar.j && jl40.l(this.k, w5fVar.k) && jl40.l(this.l, w5fVar.l) && this.m.equals(w5fVar.m) && this.n == w5fVar.n && this.o.equals(w5fVar.o) && this.p.equals(w5fVar.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + vfc.b(this.o, unr0.e(unr0.b(unr0.b(unr0.b((this.j.hashCode() + unr0.b(unr0.b(vfc.b(this.g, unr0.b((this.e.hashCode() + vfc.b(this.d, unr0.c(vfc.b(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31)) * 31, 31, this.f), 961), 31, this.h), 31, this.i)) * 961, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31);
    }

    @Override // defpackage.fc70
    public final String id() {
        return "b8337f4b87970509f24f587aef7b3ed80ba8a320031e0a940e46b25d8eafdbe1";
    }

    @Override // defpackage.fc70
    public final String name() {
        return "CreateInvoice";
    }

    public final String toString() {
        return "CreateInvoiceMutation(eventSessionId=" + this.a + ", tariffId=" + this.b + ", optionsIds=" + this.c + ", offerFor=" + this.d + ", language=" + this.e + ", origin=" + this.f + ", paymentMethodId=" + this.g + ", returnPath=, source=" + this.h + ", target=" + this.i + ", templateTag=" + this.j + ", developerPayload=, offersPositionId=" + this.k + ", offersBatchId=" + this.l + ", externalCallerPayload=" + this.m + ", silentRequested=" + this.n + ", experimentFlags=" + this.o + ", additionalOffers=" + this.p + ')';
    }
}
