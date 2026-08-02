package defpackage;

import com.yandex.messaging.internal.MessageStatus;
import java.util.Date;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class x8t {
    public final String a;
    public final CharSequence b;
    public final Date c;
    public final MessageStatus d;
    public final boolean e;
    public final boolean f;
    public final Integer g;
    public final boolean h;

    public x8t(String str, CharSequence charSequence, Date date, MessageStatus messageStatus, boolean z, boolean z2, Integer num, boolean z3) {
        this.a = str;
        this.b = charSequence;
        this.c = date;
        this.d = messageStatus;
        this.e = z;
        this.f = z2;
        this.g = num;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8t)) {
            return false;
        }
        x8t x8tVar = (x8t) obj;
        return jl40.l(this.a, x8tVar.a) && jl40.l(this.b, x8tVar.b) && jl40.l(this.c, x8tVar.c) && this.d == x8tVar.d && this.e == x8tVar.e && this.f == x8tVar.f && jl40.l(this.g, x8tVar.g) && this.h == x8tVar.h;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Date date = this.c;
        int e = unr0.e(unr0.e((this.d.hashCode() + ((hashCode2 + (date == null ? 0 : date.hashCode())) * 31)) * 31, 31, this.e), 31, this.f);
        Integer num = this.g;
        return Boolean.hashCode(this.h) + ((e + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "InfoResult(authorId=", this.a, ", plainText=", ", date=");
        t.append(this.c);
        t.append(", status=");
        t.append(this.d);
        t.append(", removed=");
        nnm.v(", doNotShowAuthor=", ", iconRes=", t, this.e, this.f);
        t.append(this.g);
        t.append(", isMissedCall=");
        t.append(this.h);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }

    public /* synthetic */ x8t(String str, CharSequence charSequence, Date date, MessageStatus messageStatus, boolean z, boolean z2) {
        this(str, charSequence, date, messageStatus, z, z2, null, false);
    }
}
