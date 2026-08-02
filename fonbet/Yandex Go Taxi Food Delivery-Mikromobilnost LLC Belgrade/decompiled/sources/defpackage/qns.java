package defpackage;

import com.ybsdk.widgets.common.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qns extends rns {
    public final c a;

    public qns(c cVar) {
        this.a = cVar;
    }

    public final c a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qns) && this.a.equals(((qns) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StatusScreen(state=" + this.a + Extension.C_BRAKE;
    }
}
