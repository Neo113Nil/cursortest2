package A6;

import c6.C0555a;
import i2.InterfaceC4590d;
import i2.h;
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
import r2.C4900e;
import t7.InterfaceC5045a;
import v6.C5108a;
import v6.C5109b;

/* loaded from: classes2.dex */
public final class d implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f203n;

    /* renamed from: u, reason: collision with root package name */
    public Object f204u;

    /* renamed from: v, reason: collision with root package name */
    public Object f205v;

    /* renamed from: w, reason: collision with root package name */
    public Object f206w;

    /* renamed from: x, reason: collision with root package name */
    public Object f207x;

    /* renamed from: y, reason: collision with root package name */
    public Object f208y;

    /* renamed from: z, reason: collision with root package name */
    public Object f209z;

    public /* synthetic */ d() {
        this.f203n = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c a(C5109b c5109b, int i) {
        byte[] j6;
        if (((AtomicBoolean) this.f206w).get()) {
            ((Logger) this.f204u).fine("Refusing to read from storage after being closed.");
            return null;
        }
        if (i > 3) {
            ((Logger) this.f204u).log(Level.WARNING, "Maximum number of attempts to read buffered data exceeded.");
            return null;
        }
        B6.a aVar = (B6.a) ((AtomicReference) this.f209z).get();
        if (aVar == null) {
            ((Logger) this.f204u).finer("Obtaining a new readableFile from the folderManager.");
            b bVar = (b) this.f205v;
            synchronized (bVar) {
                bVar.f196v = null;
                File b9 = bVar.b();
                if (b9 != null) {
                    B6.a aVar2 = new B6.a(b9, Long.parseLong(b9.getName()), bVar.f195u);
                    bVar.f196v = aVar2;
                    aVar = aVar2;
                } else {
                    aVar = null;
                }
            }
            ((AtomicReference) this.f209z).set(aVar);
            if (aVar == null) {
                ((Logger) this.f204u).fine("Unable to get or create readable file.");
                return null;
            }
        }
        ((Logger) this.f204u).finer("Attempting to read data from " + aVar);
        synchronized (aVar) {
            if (!aVar.f278y.get()) {
                synchronized (aVar) {
                    boolean z6 = TimeUnit.NANOSECONDS.toMillis(aVar.f276w.a(true)) >= aVar.f277x;
                    if (z6) {
                        aVar.close();
                    } else {
                        j6 = aVar.f275v.j();
                        if (j6 == null) {
                            aVar.b();
                        }
                    }
                }
                if (j6 != null) {
                    try {
                        c5109b.getClass();
                        try {
                            G6.a aVar3 = G6.b.f1183w;
                            aVar3.getClass();
                            ArrayList i4 = X2.a.i((G6.b) aVar3.b(new C0555a(j6, j6.length)));
                            ((AtomicBoolean) this.f207x).set(true);
                            return new c(this, i4, aVar);
                        } catch (IOException e9) {
                            e = e9;
                            throw new C5108a(e);
                        } catch (IllegalStateException e10) {
                            e = e10;
                            throw new C5108a(e);
                        }
                    } catch (C5108a unused) {
                        aVar.b();
                    }
                }
                ((AtomicReference) this.f209z).set(null);
                return a(c5109b, i + 1);
            }
        }
        j6 = null;
        if (j6 != null) {
        }
        ((AtomicReference) this.f209z).set(null);
        return a(c5109b, i + 1);
    }

    public boolean b(C4900e c4900e, int i) {
        Clock systemUTC;
        Instant instant;
        long epochSecond;
        int nano;
        B6.b bVar;
        if (((AtomicBoolean) this.f206w).get()) {
            ((Logger) this.f204u).fine("Refusing to write to storage after being closed.");
            return false;
        }
        if (i > 3) {
            ((Logger) this.f204u).log(Level.WARNING, "Max number of attempts to write buffered data exceeded.");
            return false;
        }
        B6.b bVar2 = (B6.b) ((AtomicReference) this.f208y).get();
        if (bVar2 == null) {
            b bVar3 = (b) this.f205v;
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
                    File[] listFiles = bVar3.f194n.listFiles();
                    if (listFiles != null) {
                        int i4 = 0;
                        for (File file : listFiles) {
                            if (millis > Long.parseLong(file.getName()) + bVar3.f195u.f899c) {
                                B6.a aVar = bVar3.f196v;
                                if (aVar != null && file.equals(aVar.f273n)) {
                                    bVar3.f196v.close();
                                }
                                if (file.delete()) {
                                    i4++;
                                }
                            }
                        }
                        if (i4 == 0) {
                            bVar3.i(listFiles);
                        }
                    }
                    bVar = new B6.b(new File(bVar3.f194n, String.valueOf(millis)), millis, bVar3.f195u);
                    bVar3.f197w = bVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((AtomicReference) this.f208y).set(bVar);
            ((Logger) this.f204u).finer("Created new writableFile: " + bVar);
            bVar2 = bVar;
        }
        synchronized (bVar2) {
            if (!bVar2.f284y.get()) {
                synchronized (bVar2) {
                    boolean z6 = TimeUnit.NANOSECONDS.toMillis(bVar2.f281v.a(true)) >= bVar2.f282w;
                    if (z6) {
                        bVar2.close();
                    } else {
                        int i6 = bVar2.f285z + ((Q6.c) c4900e.f40152n).f2697c;
                        bVar2.f280u.getClass();
                        if (i6 <= 1048576) {
                            c4900e.h(bVar2.f283x);
                            bVar2.f285z = i6;
                            return true;
                        }
                        bVar2.close();
                    }
                }
            }
        }
        ((AtomicReference) this.f208y).set(null);
        return b(c4900e, i + 1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f203n) {
            case 0:
                ((Logger) this.f204u).fine("Closing disk buffering storage.");
                if (((AtomicBoolean) this.f206w).compareAndSet(false, true)) {
                    ((b) this.f205v).close();
                    ((AtomicReference) this.f208y).set(null);
                    ((AtomicReference) this.f209z).set(null);
                    break;
                }
                break;
            default:
                ((h) ((InterfaceC4590d) ((InterfaceC5045a) this.f208y).get())).close();
                break;
        }
    }

    public d(b bVar) {
        this.f203n = 0;
        this.f204u = Logger.getLogger(d.class.getName());
        this.f206w = new AtomicBoolean(false);
        this.f207x = new AtomicBoolean(false);
        this.f208y = new AtomicReference();
        this.f209z = new AtomicReference();
        this.f205v = bVar;
    }
}
