package defpackage;

import com.yandex.go.chargers.discounts.data.models.i;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class rt9 implements st9 {
    public final i a;

    public rt9(i iVar) {
        this.a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rt9) && jl40.l(this.a, ((rt9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(discount=" + this.a + Extension.C_BRAKE;
    }
}
