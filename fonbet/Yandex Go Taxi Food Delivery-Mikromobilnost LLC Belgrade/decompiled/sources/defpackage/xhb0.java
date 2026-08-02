package defpackage;

import java.io.File;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class xhb0 implements yhb0 {
    public final File a;

    public xhb0(File file) {
        this.a = file;
    }

    @Override // defpackage.yhb0
    public final File a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xhb0) && this.a.equals(((xhb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(file=" + this.a + Extension.C_BRAKE;
    }
}
