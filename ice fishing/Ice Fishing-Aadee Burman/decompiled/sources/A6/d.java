package A6;

import a.AbstractC0422a;
import c6.C0544a;
import g2.InterfaceC4527d;
import g2.h;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import t0.C4986A;
import t7.InterfaceC5044a;
import v6.C5118a;
import v6.C5119b;

/* loaded from: classes2.dex */
public final class d implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f46n;

    /* renamed from: u, reason: collision with root package name */
    public Object f47u;

    /* renamed from: v, reason: collision with root package name */
    public Object f48v;

    /* renamed from: w, reason: collision with root package name */
    public Object f49w;

    /* renamed from: x, reason: collision with root package name */
    public Object f50x;

    /* renamed from: y, reason: collision with root package name */
    public Object f51y;

    /* renamed from: z, reason: collision with root package name */
    public Object f52z;

    public /* synthetic */ d() {
        this.f46n = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c a(C5119b c5119b, int i) {
        byte[] j6;
        if (((AtomicBoolean) this.f49w).get()) {
            ((Logger) this.f47u).fine("Refusing to read from storage after being closed.");
            return null;
        }
        if (i > 3) {
            ((Logger) this.f47u).log(Level.WARNING, "Maximum number of attempts to read buffered data exceeded.");
            return null;
        }
        B6.a aVar = (B6.a) ((AtomicReference) this.f52z).get();
        if (aVar == null) {
            ((Logger) this.f47u).finer("Obtaining a new readableFile from the folderManager.");
            b bVar = (b) this.f48v;
            synchronized (bVar) {
                bVar.f39v = null;
                File b9 = bVar.b();
                if (b9 != null) {
                    B6.a aVar2 = new B6.a(b9, Long.parseLong(b9.getName()), bVar.f38u);
                    bVar.f39v = aVar2;
                    aVar = aVar2;
                } else {
                    aVar = null;
                }
            }
            ((AtomicReference) this.f52z).set(aVar);
            if (aVar == null) {
                ((Logger) this.f47u).fine("Unable to get or create readable file.");
                return null;
            }
        }
        ((Logger) this.f47u).finer("Attempting to read data from " + aVar);
        synchronized (aVar) {
            if (!aVar.f212y.get()) {
                synchronized (aVar) {
                    boolean z3 = TimeUnit.NANOSECONDS.toMillis(aVar.f210w.a(true)) >= aVar.f211x;
                    if (z3) {
                        aVar.close();
                    } else {
                        j6 = aVar.f209v.j();
                        if (j6 == null) {
                            aVar.b();
                        }
                    }
                }
                if (j6 != null) {
                    try {
                        c5119b.getClass();
                        try {
                            G6.a aVar3 = G6.b.f1080w;
                            aVar3.getClass();
                            ArrayList l9 = AbstractC0422a.l((G6.b) aVar3.b(new C0544a(j6, j6.length)));
                            ((AtomicBoolean) this.f50x).set(true);
                            return new c(this, l9, aVar);
                        } catch (IOException e9) {
                            e = e9;
                            throw new C5118a(e);
                        } catch (IllegalStateException e10) {
                            e = e10;
                            throw new C5118a(e);
                        }
                    } catch (C5118a unused) {
                        aVar.b();
                    }
                }
                ((AtomicReference) this.f52z).set(null);
                return a(c5119b, i + 1);
            }
        }
        j6 = null;
        if (j6 != null) {
        }
        ((AtomicReference) this.f52z).set(null);
        return a(c5119b, i + 1);
    }

    public boolean b(C4986A c4986a, int i) {
        Clock systemUTC;
        Instant instant;
        long epochSecond;
        int nano;
        B6.b bVar;
        if (((AtomicBoolean) this.f49w).get()) {
            ((Logger) this.f47u).fine("Refusing to write to storage after being closed.");
            return false;
        }
        if (i > 3) {
            ((Logger) this.f47u).log(Level.WARNING, "Max number of attempts to write buffered data exceeded.");
            return false;
        }
        B6.b bVar2 = (B6.b) ((AtomicReference) this.f51y).get();
        if (bVar2 == null) {
            b bVar3 = (b) this.f48v;
            synchronized (bVar3) {
                try {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    systemUTC = Clock.systemUTC();
                    instant = systemUTC.instant();
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    epochSecond = instant.getEpochSecond();
                    long nanos = timeUnit2.toNanos(epochSecond);
                    nano = instant.getNano();
                    long millis = timeUnit.toMillis(nanos + nano);
                    File[] listFiles = bVar3.f37n.listFiles();
                    if (listFiles != null) {
                        int i6 = 0;
                        for (File file : listFiles) {
                            if (millis > Long.parseLong(file.getName()) + bVar3.f38u.f836c) {
                                B6.a aVar = bVar3.f39v;
                                if (aVar != null && file.equals(aVar.f207n)) {
                                    bVar3.f39v.close();
                                }
                                if (file.delete()) {
                                    i6++;
                                }
                            }
                        }
                        if (i6 == 0) {
                            bVar3.i(listFiles);
                        }
                    }
                    bVar = new B6.b(new File(bVar3.f37n, String.valueOf(millis)), millis, bVar3.f38u);
                    bVar3.f40w = bVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((AtomicReference) this.f51y).set(bVar);
            ((Logger) this.f47u).finer("Created new writableFile: " + bVar);
            bVar2 = bVar;
        }
        synchronized (bVar2) {
            if (!bVar2.f218y.get()) {
                synchronized (bVar2) {
                    boolean z3 = TimeUnit.NANOSECONDS.toMillis(bVar2.f215v.a(true)) >= bVar2.f216w;
                    if (z3) {
                        bVar2.close();
                    } else {
                        int i9 = bVar2.f219z + ((Q6.c) c4986a.f40530n).f2660c;
                        bVar2.f214u.getClass();
                        if (i9 <= 1048576) {
                            c4986a.e(bVar2.f217x);
                            bVar2.f219z = i9;
                            return true;
                        }
                        bVar2.close();
                    }
                }
            }
        }
        ((AtomicReference) this.f51y).set(null);
        return b(c4986a, i + 1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f46n) {
            case 0:
                ((Logger) this.f47u).fine("Closing disk buffering storage.");
                if (((AtomicBoolean) this.f49w).compareAndSet(false, true)) {
                    ((b) this.f48v).close();
                    ((AtomicReference) this.f51y).set(null);
                    ((AtomicReference) this.f52z).set(null);
                    break;
                }
                break;
            default:
                ((h) ((InterfaceC4527d) ((InterfaceC5044a) this.f51y).get())).close();
                break;
        }
    }

    public d(b bVar) {
        this.f46n = 0;
        this.f47u = Logger.getLogger(d.class.getName());
        this.f49w = new AtomicBoolean(false);
        this.f50x = new AtomicBoolean(false);
        this.f51y = new AtomicReference();
        this.f52z = new AtomicReference();
        this.f48v = bVar;
    }
}
