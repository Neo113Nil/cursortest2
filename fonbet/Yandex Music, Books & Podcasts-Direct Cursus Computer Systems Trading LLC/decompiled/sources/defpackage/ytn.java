package defpackage;

import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class ytn extends md {

    @NotNull
    public static final xtn Companion = new xtn();
    public final boolean a;

    public ytn(int i, boolean z) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ytn) && this.a == ((ytn) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return dfi.j(new StringBuilder("ReloadDocumentAction(retryAfterError="), this.a, ')');
    }
}
