package defpackage;

import java.util.Calendar;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wh01 {
    public final String a;
    public final boolean b;
    public final Calendar c;

    public wh01(String str, boolean z, Calendar calendar) {
        this.a = str;
        this.b = z;
        this.c = calendar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh01)) {
            return false;
        }
        wh01 wh01Var = (wh01) obj;
        return this.a.equals(wh01Var.a) && this.b == wh01Var.b && this.c.equals(wh01Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder l = oo31.l("TransferDateSelectorItemUiState(title=", this.a, ", isSelected=", ", date=", this.b);
        l.append(this.c);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
