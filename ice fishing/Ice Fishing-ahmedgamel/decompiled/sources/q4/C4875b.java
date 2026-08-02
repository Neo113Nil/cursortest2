package q4;

import kotlin.jvm.internal.h;

/* renamed from: q4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4875b {
    private final Long rywDelay;
    private final String rywToken;

    public C4875b(String rywToken, Long l9) {
        h.e(rywToken, "rywToken");
        this.rywToken = rywToken;
        this.rywDelay = l9;
    }

    public static /* synthetic */ C4875b copy$default(C4875b c4875b, String str, Long l9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4875b.rywToken;
        }
        if ((i & 2) != 0) {
            l9 = c4875b.rywDelay;
        }
        return c4875b.copy(str, l9);
    }

    public final String component1() {
        return this.rywToken;
    }

    public final Long component2() {
        return this.rywDelay;
    }

    public final C4875b copy(String rywToken, Long l9) {
        h.e(rywToken, "rywToken");
        return new C4875b(rywToken, l9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4875b)) {
            return false;
        }
        C4875b c4875b = (C4875b) obj;
        return h.a(this.rywToken, c4875b.rywToken) && h.a(this.rywDelay, c4875b.rywDelay);
    }

    public final Long getRywDelay() {
        return this.rywDelay;
    }

    public final String getRywToken() {
        return this.rywToken;
    }

    public int hashCode() {
        int hashCode = this.rywToken.hashCode() * 31;
        Long l9 = this.rywDelay;
        return hashCode + (l9 == null ? 0 : l9.hashCode());
    }

    public String toString() {
        return "RywData(rywToken=" + this.rywToken + ", rywDelay=" + this.rywDelay + ')';
    }
}
