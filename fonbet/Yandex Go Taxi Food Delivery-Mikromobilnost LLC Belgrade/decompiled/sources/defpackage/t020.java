package defpackage;

import ru.yandex.taxi.messenger.a;

/* loaded from: classes12.dex */
public final class t020 {
    public final h1p a;
    public final s2p b;
    public final a c;

    public t020(h1p h1pVar, s2p s2pVar, a aVar) {
        this.a = h1pVar;
        this.b = s2pVar;
        this.c = aVar;
    }

    public final void a(r7b r7bVar) {
        String str;
        String str2;
        if (((h120) this.c.a.c()).getB()) {
            String str3 = r7bVar.a;
            rfn rfnVar = null;
            if (str3 != null) {
                if (evu0.J(str3)) {
                    str3 = null;
                }
                str = str3;
            } else {
                str = null;
            }
            String str4 = r7bVar.b;
            if (str4 != null) {
                if (evu0.J(str4)) {
                    str4 = null;
                }
                str2 = str4;
            } else {
                str2 = null;
            }
            String str5 = r7bVar.c;
            h1p h1pVar = this.a;
            if (str == null || str2 == null) {
                xby.l(jst.e, "EATSKIT:WEBCHAT", null, null, b64.l("Missing required fields. ChatId ", str, ". Service: ", h1pVar.getValue()), 6);
            } else {
                String str6 = r7bVar.d;
                if (str6 == null) {
                    str6 = "";
                }
                rfnVar = new rfn(str, str2, str6, h1pVar.getValue(), str5 == null ? "" : str5);
            }
            if (rfnVar == null) {
                return;
            }
            this.b.n(rfnVar);
        }
    }
}
