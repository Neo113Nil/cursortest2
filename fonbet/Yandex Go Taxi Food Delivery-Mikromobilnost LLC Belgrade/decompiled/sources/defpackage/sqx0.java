package defpackage;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class sqx0 implements ofd0 {
    public final gio a;

    public sqx0(gio gioVar) {
        this.a = gioVar;
    }

    public final void a(PlusPayCompositeOffers.Offer offer) {
        String sessionId = offer.getMeta().getSessionId();
        gio gioVar = this.a;
        gioVar.getClass();
        LinkedHashMap x = g8e.x("session_id", sessionId);
        x.put("_meta", gio.a(new HashMap()));
        gioVar.e("PlusPayment.Step.CardSelecting.Stop", x);
    }
}
