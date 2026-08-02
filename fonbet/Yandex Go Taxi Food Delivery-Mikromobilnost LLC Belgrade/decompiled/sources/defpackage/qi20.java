package defpackage;

import kotlinx.datetime.format.Padding;
import kotlinx.datetime.format.h;
import kotlinx.datetime.internal.format.g;

/* loaded from: classes9.dex */
public final class qi20 extends g {
    public final Padding e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi20(Padding padding) {
        super(h.b, padding == Padding.ZERO ? 2 : 1, padding == Padding.SPACE ? 2 : null);
        e421 e421Var = h.a;
        this.e = padding;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qi20) {
            return this.e == ((qi20) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
