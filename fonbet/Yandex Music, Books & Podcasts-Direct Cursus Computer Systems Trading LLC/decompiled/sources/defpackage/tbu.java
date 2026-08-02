package defpackage;

/* loaded from: classes4.dex */
public final class tbu {
    public final tka a;

    public tbu(tka tkaVar) {
        this.a = tkaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tbu) && this.a.equals(((tbu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VideoPlayerNetworkConfig(okHttpClient=" + this.a + ")";
    }
}
