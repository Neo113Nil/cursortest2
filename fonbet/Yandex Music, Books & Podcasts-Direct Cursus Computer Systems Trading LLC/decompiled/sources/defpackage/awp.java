package defpackage;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class awp {
    public final File a;

    public awp(File file) {
        file.getClass();
        this.a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof awp) && Intrinsics.d(this.a, ((awp) obj).a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) - 879258763;
    }

    public final String toString() {
        return "ShareFile(file=" + this.a + ", mime=image/png)";
    }
}
