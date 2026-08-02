package s6;

import E6.b;
import Y6.c;
import e7.e;
import java.io.IOException;
import java.time.Duration;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import k1.C4639a;
import r2.C4900e;

/* renamed from: s6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4976a implements e {

    /* renamed from: u, reason: collision with root package name */
    public static final Duration f40543u;

    /* renamed from: n, reason: collision with root package name */
    public final C4639a f40544n;

    static {
        Duration ofSeconds;
        ofSeconds = Duration.ofSeconds(10L);
        f40543u = ofSeconds;
    }

    public C4976a(C4639a c4639a) {
        this.f40544n = c4639a;
    }

    @Override // e7.e
    public final c f(Collection collection) {
        CompletableFuture completedFuture;
        long millis;
        C4639a c4639a = this.f40544n;
        A6.a aVar = ((b) c4639a.f38564b).f900n;
        C4900e c4900e = aVar.f188u;
        Logger logger = aVar.f190w;
        logger.finer("Intercepting batch.");
        try {
            try {
                ((Q6.c) c4900e.f40152n).d(collection);
                boolean b9 = aVar.f187n.b(c4900e, 1);
                Q6.c cVar = (Q6.c) c4900e.f40152n;
                if (b9) {
                    completedFuture = CompletableFuture.completedFuture(new F6.a(true, null));
                } else {
                    logger.fine("Could not store batch in disk.");
                    completedFuture = CompletableFuture.completedFuture(new F6.a(false, new Exception("Could not store batch in disk for an unknown reason.")));
                }
                cVar.e();
            } catch (IOException e9) {
                logger.log(Level.WARNING, "An unexpected error happened while attempting to write the data in disk.", (Throwable) e9);
                completedFuture = CompletableFuture.completedFuture(new F6.a(false, e9));
                ((Q6.c) c4900e.f40152n).e();
            }
            try {
                millis = ((Duration) c4639a.f38565c).toMillis();
                F6.a aVar2 = (F6.a) completedFuture.get(millis, TimeUnit.MILLISECONDS);
                if (aVar2.f1018a) {
                    return c.f3919e;
                }
                Exception exc = aVar2.f1019b;
                if (exc == null) {
                    return c.f3920f;
                }
                c cVar2 = new c();
                cVar2.a(exc);
                return cVar2;
            } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                c cVar3 = new c();
                cVar3.a(e10);
                return cVar3;
            }
        } catch (Throwable th) {
            ((Q6.c) c4900e.f40152n).e();
            throw th;
        }
    }

    @Override // e7.e
    public final c shutdown() {
        return c.f3919e;
    }
}
