package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes5.dex */
public final class w6b0 {
    public final lx4 a;
    public final h3y b;

    public w6b0(lx4 lx4Var, h3y h3yVar) {
        this.a = lx4Var;
        this.b = h3yVar;
    }

    public final void a(String str, String str2, String str3, String str4) {
        if (str == null || str.length() == 0) {
            qv10.C(new Object[]{str4}, 1, "Empty event name for notification event %s", jst.e);
            return;
        }
        pex0 m = ((k) ((wiq0) this.b.get())).m();
        String str5 = m != null ? m.b : null;
        i d = ((j) this.a).d(g8e.p(str2, Extension.DOT_CHAR, str4));
        d.d("type", str);
        d.d("tag", str3);
        d.d("current_tariff", str5);
        d.i();
        d.m();
    }
}
