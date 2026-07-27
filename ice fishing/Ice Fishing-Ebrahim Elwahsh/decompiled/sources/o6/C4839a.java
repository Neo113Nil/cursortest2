package o6;

import A6.b;
import S0.c;
import a7.f;
import java.io.IOException;
import java.time.Duration;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import u1.u;
import w6.C5174a;

/* renamed from: o6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4839a implements f {

    /* renamed from: u, reason: collision with root package name */
    public static final Duration f39728u;

    /* renamed from: n, reason: collision with root package name */
    public final c f39729n;

    static {
        Duration ofSeconds;
        ofSeconds = Duration.ofSeconds(10L);
        f39728u = ofSeconds;
    }

    public C4839a(c cVar) {
        this.f39729n = cVar;
    }

    @Override // a7.f
    public final U6.c e(Collection collection) {
        CompletableFuture completedFuture;
        long millis;
        c cVar = this.f39729n;
        C5174a c5174a = ((b) cVar.f2886u).f40n;
        u uVar = c5174a.f41677u;
        Logger logger = c5174a.f41679w;
        logger.finer("Intercepting batch.");
        try {
            try {
                ((M6.c) uVar.f41190n).d(collection);
                boolean b9 = c5174a.f41676n.b(uVar, 1);
                M6.c cVar2 = (M6.c) uVar.f41190n;
                if (b9) {
                    completedFuture = CompletableFuture.completedFuture(new B6.a(true, null));
                } else {
                    logger.fine("Could not store batch in disk.");
                    completedFuture = CompletableFuture.completedFuture(new B6.a(false, new Exception("Could not store batch in disk for an unknown reason.")));
                }
                cVar2.e();
            } catch (IOException e6) {
                logger.log(Level.WARNING, "An unexpected error happened while attempting to write the data in disk.", (Throwable) e6);
                completedFuture = CompletableFuture.completedFuture(new B6.a(false, e6));
                ((M6.c) uVar.f41190n).e();
            }
            try {
                millis = ((Duration) cVar.f2887v).toMillis();
                B6.a aVar = (B6.a) completedFuture.get(millis, TimeUnit.MILLISECONDS);
                if (aVar.f363a) {
                    return U6.c.f3310e;
                }
                Exception exc = aVar.f364b;
                if (exc == null) {
                    return U6.c.f3311f;
                }
                U6.c cVar3 = new U6.c();
                cVar3.a(exc);
                return cVar3;
            } catch (InterruptedException | ExecutionException | TimeoutException e9) {
                U6.c cVar4 = new U6.c();
                cVar4.a(e9);
                return cVar4;
            }
        } catch (Throwable th) {
            ((M6.c) uVar.f41190n).e();
            throw th;
        }
    }

    @Override // a7.f
    public final U6.c shutdown() {
        return U6.c.f3310e;
    }
}
