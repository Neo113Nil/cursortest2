package coil3.network;

import okio.BufferedSource;

/* loaded from: classes3.dex */
public final class SourceResponseBody implements AutoCloseable {
    public final BufferedSource source;

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.source.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SourceResponseBody) {
            return this.source.equals(((SourceResponseBody) obj).source);
        }
        return false;
    }

    public final int hashCode() {
        return this.source.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.source + ")";
    }
}
