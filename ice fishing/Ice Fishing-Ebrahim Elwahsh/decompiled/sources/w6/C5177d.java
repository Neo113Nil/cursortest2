package w6;

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
import p7.InterfaceC4864a;
import r6.C4968a;
import r6.C4969b;
import u1.u;
import x6.C5215a;
import x6.C5216b;

/* renamed from: w6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5177d implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41692n;

    /* renamed from: u, reason: collision with root package name */
    public Object f41693u;

    /* renamed from: v, reason: collision with root package name */
    public Object f41694v;

    /* renamed from: w, reason: collision with root package name */
    public Object f41695w;

    /* renamed from: x, reason: collision with root package name */
    public Object f41696x;

    /* renamed from: y, reason: collision with root package name */
    public Object f41697y;

    /* renamed from: z, reason: collision with root package name */
    public Object f41698z;

    public /* synthetic */ C5177d() {
        this.f41692n = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5176c a(C4969b c4969b, int i) {
        byte[] j9;
        if (((AtomicBoolean) this.f41695w).get()) {
            ((Logger) this.f41693u).fine("Refusing to read from storage after being closed.");
            return null;
        }
        if (i > 3) {
            ((Logger) this.f41693u).log(Level.WARNING, "Maximum number of attempts to read buffered data exceeded.");
            return null;
        }
        C5215a c5215a = (C5215a) ((AtomicReference) this.f41698z).get();
        if (c5215a == null) {
            ((Logger) this.f41693u).finer("Obtaining a new readableFile from the folderManager.");
            C5175b c5175b = (C5175b) this.f41694v;
            synchronized (c5175b) {
                c5175b.f41685v = null;
                File b9 = c5175b.b();
                if (b9 != null) {
                    C5215a c5215a2 = new C5215a(b9, Long.parseLong(b9.getName()), c5175b.f41684u);
                    c5175b.f41685v = c5215a2;
                    c5215a = c5215a2;
                } else {
                    c5215a = null;
                }
            }
            ((AtomicReference) this.f41698z).set(c5215a);
            if (c5215a == null) {
                ((Logger) this.f41693u).fine("Unable to get or create readable file.");
                return null;
            }
        }
        ((Logger) this.f41693u).finer("Attempting to read data from " + c5215a);
        synchronized (c5215a) {
            if (!c5215a.f41789y.get()) {
                synchronized (c5215a) {
                    boolean z8 = TimeUnit.NANOSECONDS.toMillis(c5215a.f41787w.a(true)) >= c5215a.f41788x;
                    if (z8) {
                        c5215a.close();
                    } else {
                        j9 = c5215a.f41786v.j();
                        if (j9 == null) {
                            c5215a.b();
                        }
                    }
                }
                if (j9 != null) {
                    try {
                        c4969b.getClass();
                        try {
                            C6.a aVar = C6.b.f488w;
                            aVar.getClass();
                            ArrayList e6 = Z5.c.e((C6.b) aVar.c(new Y5.a(j9, j9.length)));
                            ((AtomicBoolean) this.f41696x).set(true);
                            return new C5176c(this, e6, c5215a);
                        } catch (IOException e9) {
                            e = e9;
                            throw new C4968a(e);
                        } catch (IllegalStateException e10) {
                            e = e10;
                            throw new C4968a(e);
                        }
                    } catch (C4968a unused) {
                        c5215a.b();
                    }
                }
                ((AtomicReference) this.f41698z).set(null);
                return a(c4969b, i + 1);
            }
        }
        j9 = null;
        if (j9 != null) {
        }
        ((AtomicReference) this.f41698z).set(null);
        return a(c4969b, i + 1);
    }

    public boolean b(u uVar, int i) {
        Clock systemUTC;
        Instant instant;
        long epochSecond;
        int nano;
        C5216b c5216b;
        if (((AtomicBoolean) this.f41695w).get()) {
            ((Logger) this.f41693u).fine("Refusing to write to storage after being closed.");
            return false;
        }
        if (i > 3) {
            ((Logger) this.f41693u).log(Level.WARNING, "Max number of attempts to write buffered data exceeded.");
            return false;
        }
        C5216b c5216b2 = (C5216b) ((AtomicReference) this.f41697y).get();
        if (c5216b2 == null) {
            C5175b c5175b = (C5175b) this.f41694v;
            synchronized (c5175b) {
                try {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    systemUTC = Clock.systemUTC();
                    instant = systemUTC.instant();
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    epochSecond = instant.getEpochSecond();
                    long nanos = timeUnit2.toNanos(epochSecond);
                    nano = instant.getNano();
                    long millis = timeUnit.toMillis(nanos + nano);
                    File[] listFiles = c5175b.f41683n.listFiles();
                    if (listFiles != null) {
                        int i4 = 0;
                        for (File file : listFiles) {
                            if (millis > Long.parseLong(file.getName()) + c5175b.f41684u.f39c) {
                                C5215a c5215a = c5175b.f41685v;
                                if (c5215a != null && file.equals(c5215a.f41784n)) {
                                    c5175b.f41685v.close();
                                }
                                if (file.delete()) {
                                    i4++;
                                }
                            }
                        }
                        if (i4 == 0) {
                            c5175b.g(listFiles);
                        }
                    }
                    c5216b = new C5216b(new File(c5175b.f41683n, String.valueOf(millis)), millis, c5175b.f41684u);
                    c5175b.f41686w = c5216b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((AtomicReference) this.f41697y).set(c5216b);
            ((Logger) this.f41693u).finer("Created new writableFile: " + c5216b);
            c5216b2 = c5216b;
        }
        synchronized (c5216b2) {
            if (!c5216b2.f41795y.get()) {
                synchronized (c5216b2) {
                    boolean z8 = TimeUnit.NANOSECONDS.toMillis(c5216b2.f41792v.a(true)) >= c5216b2.f41793w;
                    if (z8) {
                        c5216b2.close();
                    } else {
                        int i9 = c5216b2.f41796z + ((M6.c) uVar.f41190n).f1912c;
                        c5216b2.f41791u.getClass();
                        if (i9 <= 1048576) {
                            uVar.b(c5216b2.f41794x);
                            c5216b2.f41796z = i9;
                            return true;
                        }
                        c5216b2.close();
                    }
                }
            }
        }
        ((AtomicReference) this.f41697y).set(null);
        return b(uVar, i + 1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f41692n) {
            case 0:
                ((Logger) this.f41693u).fine("Closing disk buffering storage.");
                if (((AtomicBoolean) this.f41695w).compareAndSet(false, true)) {
                    ((C5175b) this.f41694v).close();
                    ((AtomicReference) this.f41697y).set(null);
                    ((AtomicReference) this.f41698z).set(null);
                    break;
                }
                break;
            default:
                ((h) ((g2.d) ((InterfaceC4864a) this.f41697y).get())).close();
                break;
        }
    }

    public C5177d(C5175b c5175b) {
        this.f41692n = 0;
        this.f41693u = Logger.getLogger(C5177d.class.getName());
        this.f41695w = new AtomicBoolean(false);
        this.f41696x = new AtomicBoolean(false);
        this.f41697y = new AtomicReference();
        this.f41698z = new AtomicReference();
        this.f41694v = c5175b;
    }
}
