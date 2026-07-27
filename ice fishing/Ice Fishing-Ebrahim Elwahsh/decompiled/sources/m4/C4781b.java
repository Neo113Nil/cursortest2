package m4;

import kotlin.jvm.internal.h;

/* renamed from: m4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4781b {
    private final Long rywDelay;
    private final String rywToken;

    public C4781b(String rywToken, Long l9) {
        h.e(rywToken, "rywToken");
        this.rywToken = rywToken;
        this.rywDelay = l9;
    }

    public static /* synthetic */ C4781b copy$default(C4781b c4781b, String str, Long l9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4781b.rywToken;
        }
        if ((i & 2) != 0) {
            l9 = c4781b.rywDelay;
        }
        return c4781b.copy(str, l9);
    }

    public final String component1() {
        return this.rywToken;
    }

    public final Long component2() {
        return this.rywDelay;
    }

    public final C4781b copy(String rywToken, Long l9) {
        h.e(rywToken, "rywToken");
        return new C4781b(rywToken, l9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4781b)) {
            return false;
        }
        C4781b c4781b = (C4781b) obj;
        return h.a(this.rywToken, c4781b.rywToken) && h.a(this.rywDelay, c4781b.rywDelay);
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
