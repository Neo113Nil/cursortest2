package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class knt extends md {

    @NotNull
    public static final hnt Companion = new hnt();
    public static final arf[] b = {btf.a(bwf.b, new hft(6))};
    public final q2a a;

    public knt(int i, q2a q2aVar) {
        if (1 == (i & 1)) {
            this.a = q2aVar;
        } else {
            u7g.V(i, 1, fnt.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && knt.class == obj.getClass() && Intrinsics.d(this.a, ((knt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdateDocumentAction(document=" + this.a + ")";
    }
}
