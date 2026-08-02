package defpackage;

import com.ybsdk.widgets.common.e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xjb0 extends yjb0 {
    public final e a;

    public xjb0(e eVar) {
        this.a = eVar;
    }

    public final e a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xjb0) && this.a.equals(((xjb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Status(statusState=" + this.a + Extension.C_BRAKE;
    }
}
