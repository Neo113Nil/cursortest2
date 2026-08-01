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
import m1.C4726a;
import t0.C4986A;

/* renamed from: s6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4977a implements e {

    /* renamed from: u, reason: collision with root package name */
    public static final Duration f40489u;

    /* renamed from: n, reason: collision with root package name */
    public final C4726a f40490n;

    static {
        Duration ofSeconds;
        ofSeconds = Duration.ofSeconds(10L);
        f40489u = ofSeconds;
    }

    public C4977a(C4726a c4726a) {
        this.f40490n = c4726a;
    }

    @Override // e7.e
    public final c f(Collection collection) {
        CompletableFuture completedFuture;
        long millis;
        C4726a c4726a = this.f40490n;
        A6.a aVar = ((b) c4726a.f39272u).f837n;
        C4986A c4986a = aVar.f31u;
        Logger logger = aVar.f33w;
        logger.finer("Intercepting batch.");
        try {
            try {
                ((Q6.c) c4986a.f40533n).d(collection);
                boolean b9 = aVar.f30n.b(c4986a, 1);
                Q6.c cVar = (Q6.c) c4986a.f40533n;
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
                ((Q6.c) c4986a.f40533n).e();
            }
            try {
                millis = ((Duration) c4726a.f39273v).toMillis();
                F6.a aVar2 = (F6.a) completedFuture.get(millis, TimeUnit.MILLISECONDS);
                if (aVar2.f992a) {
                    return c.f3975e;
                }
                Exception exc = aVar2.f993b;
                if (exc == null) {
                    return c.f3976f;
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
            ((Q6.c) c4986a.f40533n).e();
            throw th;
        }
    }

    @Override // e7.e
    public final c shutdown() {
        return c.f3975e;
    }
}
