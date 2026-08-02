package defpackage;

import java.util.HashMap;
import ru.yandex.taxi.intercity.analytics.IntercityContactsAnalytics$OpenOriginV2;
import ru.yandex.taxi.intercity.analytics.IntercityPhoneSelectOrigin;

/* loaded from: classes5.dex */
public final class tow implements pfb0 {
    public final pj a;
    public final IntercityPhoneSelectOrigin b;

    public tow(pj pjVar, IntercityPhoneSelectOrigin intercityPhoneSelectOrigin) {
        this.a = pjVar;
        this.b = intercityPhoneSelectOrigin;
    }

    public static IntercityContactsAnalytics$OpenOriginV2 e(IntercityPhoneSelectOrigin intercityPhoneSelectOrigin) {
        int i = sow.a[intercityPhoneSelectOrigin.ordinal()];
        if (i == 1) {
            return IntercityContactsAnalytics$OpenOriginV2.Bubble;
        }
        if (i == 2) {
            return IntercityContactsAnalytics$OpenOriginV2.TariffCard;
        }
        if (i == 3) {
            return IntercityContactsAnalytics$OpenOriginV2.OrderButton;
        }
        if (i == 4) {
            return IntercityContactsAnalytics$OpenOriginV2.Checkout;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.pfb0
    public final void a() {
        IntercityContactsAnalytics$OpenOriginV2 e = e(this.b);
        pj pjVar = this.a;
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("open_origin", e.getEventValue());
        pjVar.a.a("IntercityContacts.Selector.Shown", hashMap, 2, new HashMap());
    }

    @Override // defpackage.pfb0
    public final void b() {
    }

    @Override // defpackage.pfb0
    public final void c() {
        IntercityContactsAnalytics$OpenOriginV2 e = e(this.b);
        pj pjVar = this.a;
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("open_origin", e.getEventValue());
        pjVar.a.a("IntercityContacts.Selection.Confirmed", hashMap, 2, new HashMap());
    }

    @Override // defpackage.pfb0
    public final void d() {
        IntercityContactsAnalytics$OpenOriginV2 e = e(this.b);
        pj pjVar = this.a;
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("open_origin", e.getEventValue());
        pjVar.a.a("IntercityContacts.Selection.Cancelled", hashMap, 2, new HashMap());
    }
}
