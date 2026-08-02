package defpackage;

import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class rfv {
    public final long a;
    public final long b;

    public rfv(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfv)) {
            return false;
        }
        rfv rfvVar = (rfv) obj;
        if (!d85.c(this.a, rfvVar.a) || !d85.c(this.b, rfvVar.b)) {
            return false;
        }
        Object obj2 = weo.f;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return weo.f.hashCode() + f1d.a(R.drawable.ic_close_mid_24, f1d.a(R.string.close_content_description, f1d.a(R.string.error_open_bank_application, tlm.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String i = d85.i(this.a);
        String i2 = d85.i(this.b);
        wn5 wn5Var = weo.f;
        StringBuilder m = f1d.m("WebViewScreenUiConfig(bgColor=", i, ", iconTintColor=", i2, ", failedSbpMessage=");
        hrg.w(R.string.error_open_bank_application, R.string.close_content_description, ", closeButtonDescription=", ", closeIcon=", m);
        m.append(R.drawable.ic_close_mid_24);
        m.append(", progressBox=");
        m.append(wn5Var);
        m.append(")");
        return m.toString();
    }
}
