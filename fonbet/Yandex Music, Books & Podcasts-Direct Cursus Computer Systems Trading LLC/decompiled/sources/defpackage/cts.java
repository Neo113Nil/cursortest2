package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class cts extends p9 {
    public final Uri b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cts(Uri uri) {
        super(bb6.b);
        uri.getClass();
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cts) && Intrinsics.d(this.b, ((cts) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Hls(masterPlaylistUri=" + this.b + ")";
    }
}
