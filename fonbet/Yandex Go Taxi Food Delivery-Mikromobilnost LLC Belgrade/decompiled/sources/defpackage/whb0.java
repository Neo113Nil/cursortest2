package defpackage;

import java.io.File;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class whb0 implements yhb0 {
    public final File a;

    public whb0(File file) {
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
        return (obj instanceof whb0) && jl40.l(this.a, ((whb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Pending(file=" + this.a + Extension.C_BRAKE;
    }
}
