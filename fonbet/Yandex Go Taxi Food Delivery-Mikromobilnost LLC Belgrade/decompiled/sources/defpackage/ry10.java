package defpackage;

import com.yandex.messaging.internal.storage.MessagesRange$LoadingType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ry10 {
    public final long a;
    public final long b;
    public final MessagesRange$LoadingType c;

    public ry10(long j, long j2, MessagesRange$LoadingType messagesRange$LoadingType) {
        this.a = j;
        this.b = j2;
        this.c = messagesRange$LoadingType;
        z83.i();
    }

    public final long a() {
        int i = qy10.a[this.c.ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2 || i == 3) {
            return this.a;
        }
        w511.b();
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry10)) {
            return false;
        }
        ry10 ry10Var = (ry10) obj;
        return this.a == ry10Var.a && this.b == ry10Var.b && this.c == ry10Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + qv10.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder w = oyr.w(this.c.name(), Extension.O_BRAKE, wtb1.c(this.b), " - ", wtb1.c(this.a));
        w.append(Extension.C_BRAKE);
        return w.toString();
    }
}
