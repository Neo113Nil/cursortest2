package defpackage;

import androidx.concurrent.futures.b;

/* loaded from: classes10.dex */
public final class z54 extends plh {
    public final int a;
    public final int b;
    public final b c;

    public z54(int i, int i2, b bVar) {
        this.a = i;
        this.b = i2;
        if (bVar != null) {
            this.c = bVar;
        } else {
            ny61.t("Null completer");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof plh) {
            z54 z54Var = (z54) ((plh) obj);
            if (this.a == z54Var.a && this.b == z54Var.b && this.c.equals(z54Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.a + ", rotationDegrees=" + this.b + ", completer=" + this.c + "}";
    }
}
