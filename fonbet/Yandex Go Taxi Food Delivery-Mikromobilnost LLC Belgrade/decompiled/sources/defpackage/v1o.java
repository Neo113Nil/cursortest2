package defpackage;

import com.bumptech.glide.request.a;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class v1o {
    public final a a;
    public final Executor b;

    public v1o(a aVar, Executor executor) {
        this.a = aVar;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v1o) && this.a == ((v1o) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
