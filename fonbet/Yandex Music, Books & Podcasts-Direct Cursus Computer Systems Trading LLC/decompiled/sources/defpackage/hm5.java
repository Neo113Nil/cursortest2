package defpackage;

import java.util.concurrent.CompletableFuture;

/* loaded from: classes5.dex */
public final class hm5 extends CompletableFuture {
    public final foj a;

    public hm5(foj fojVar) {
        this.a = fojVar;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.a.cancel();
        }
        return super.cancel(z);
    }
}
