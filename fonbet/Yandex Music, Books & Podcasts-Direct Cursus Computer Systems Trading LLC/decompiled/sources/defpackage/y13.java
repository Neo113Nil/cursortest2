package defpackage;

import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public abstract class y13 implements ewf, IBinder.DeathRecipient {
    public static final Logger n = Logger.getLogger(y13.class.getName());
    public static final wu1 o = new wu1("internal:remote-uid");
    public static final wu1 p = new wu1("internal:server-authority");
    public static final wu1 q = new wu1("internal:inbound-parcelable-policy");
    public final xhj a;
    public final ScheduledExecutorService b;
    public final sue c;
    public xu1 g;
    public sgr i;
    public xrj j;
    public long m;
    public final LinkedHashSet f = new LinkedHashSet();
    public int h = 1;
    public final fwf d = new fwf(this);
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final sjc k = new sjc();
    public final AtomicLong l = new AtomicLong();

    public y13(xhj xhjVar, xu1 xu1Var, sue sueVar) {
        this.a = xhjVar;
        this.g = xu1Var;
        this.c = sueVar;
        this.b = (ScheduledExecutorService) xhjVar.e();
    }

    public static sgr p(RemoteException remoteException) {
        return ((remoteException instanceof DeadObjectException) || (remoteException instanceof TransactionTooLargeException)) ? sgr.o.h(remoteException) : sgr.n.h(remoteException);
    }

    public final sue a() {
        return this.c;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final synchronized void binderDied() {
        o(sgr.o.i("binderDied"), true);
    }

    @Override // defpackage.ewf
    public final boolean e(Parcel parcel, int i) {
        try {
            return h(parcel, i);
        } catch (RuntimeException e) {
            n.log(Level.SEVERE, "Terminating transport for uncaught Exception in transaction " + i, (Throwable) e);
            synchronized (this) {
                o(sgr.n.h(e), true);
                return false;
            }
        }
    }

    public final void g(long j) {
        oxj oxjVar;
        mjr mjrVar;
        sjc sjcVar = this.k;
        synchronized (sjcVar) {
            long j2 = sjcVar.b;
            if (j2 - j >= 0) {
                j = j2;
            }
            sjcVar.b = j;
            if (sjcVar.a - j >= SQLiteDatabase.OPEN_SHAREDCACHE || !sjcVar.c) {
                return;
            }
            sjcVar.c = false;
            n.log(Level.FINE, "handleAcknowledgedBytes: Transmit Window No-Longer Full. Unblock calls: " + this);
            this.f.addAll(this.e.keySet());
            Iterator it = this.f.iterator();
            while (i() && it.hasNext()) {
                uhe uheVar = (uhe) this.e.get(it.next());
                it.remove();
                if (uheVar != null) {
                    synchronized (uheVar) {
                        oxjVar = uheVar.d;
                        mjrVar = uheVar.f;
                    }
                    if (mjrVar != null) {
                        mjrVar.onReady();
                    }
                    if (oxjVar != null) {
                        try {
                            synchronized (oxjVar) {
                                oxjVar.c();
                            }
                        } catch (tgr e) {
                            synchronized (uheVar) {
                                sgr sgrVar = e.a;
                                uheVar.b(sgrVar, sgrVar, false);
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public final boolean h(Parcel parcel, int i) {
        fo7 o2;
        int readInt;
        if (i < 1001) {
            synchronized (this) {
                try {
                    if (i != 1) {
                        if (i == 2) {
                            o(sgr.o.i("transport shutdown by peer"), true);
                        } else if (i == 3) {
                            g(parcel.readLong());
                        } else if (i == 4) {
                            int readInt2 = parcel.readInt();
                            if (this.h == 3) {
                                try {
                                    o2 = fo7.o();
                                    try {
                                        o2.b().writeInt(readInt2);
                                        this.j.a(5, o2);
                                        o2.close();
                                    } finally {
                                    }
                                } catch (RemoteException unused) {
                                }
                            }
                        } else if (i != 5) {
                            return false;
                        }
                    }
                } finally {
                }
            }
        } else {
            int dataSize = parcel.dataSize();
            uhe uheVar = (uhe) this.e.get(Integer.valueOf(i));
            if (uheVar == null) {
                synchronized (this) {
                    try {
                        if (!j()) {
                            x13 x13Var = (x13) this;
                            uhe uheVar2 = new uhe(x13Var, x13Var.g, i);
                            uheVar = (uhe) this.e.putIfAbsent(Integer.valueOf(i), uheVar2);
                            if (uheVar == null) {
                                uheVar = uheVar2;
                            }
                        }
                    } finally {
                    }
                }
            }
            if (uheVar != null) {
                synchronized (uheVar) {
                    if (!(uheVar.n == vhe.f)) {
                        try {
                            readInt = parcel.readInt();
                        } catch (tgr e) {
                            sgr sgrVar = e.a;
                            uheVar.b(sgrVar, sgrVar, false);
                        }
                        if ((readInt & 8) != 0) {
                            sgr e2 = sgr.e((16711680 & readInt) >> 16);
                            if ((readInt & 32) != 0) {
                                e2 = e2.i(parcel.readString());
                            }
                            uheVar.b(e2, e2, true);
                        } else {
                            int readInt3 = parcel.readInt();
                            boolean z = (readInt & 1) != 0;
                            boolean z2 = (readInt & 2) != 0;
                            boolean z3 = (readInt & 4) != 0;
                            if (z) {
                                uheVar.e(parcel, readInt);
                                uheVar.g(vhe.c);
                            }
                            if (z2) {
                                uheVar.d(readInt, readInt3, parcel);
                            }
                            if (z3) {
                                uheVar.l = readInt3;
                                uheVar.k = true;
                            }
                            int i2 = uheVar.h;
                            if (readInt3 == i2) {
                                ArrayList arrayList = uheVar.j;
                                if (arrayList == null) {
                                    uheVar.h = i2 + 1;
                                } else if (!z2 && !z3) {
                                    arrayList.remove(0);
                                    uheVar.h++;
                                }
                            }
                            uheVar.h(parcel.dataSize());
                            uheVar.c();
                        }
                    }
                }
            }
            if (this.l.addAndGet(dataSize) - this.m > 16384) {
                synchronized (this) {
                    xrj xrjVar = this.j;
                    xrjVar.getClass();
                    long j = this.l.get();
                    this.m = j;
                    try {
                        o2 = fo7.o();
                    } catch (RemoteException e3) {
                        o(p(e3), true);
                    }
                    try {
                        o2.b().writeLong(j);
                        xrjVar.a(3, o2);
                        o2.close();
                    } finally {
                    }
                }
            }
        }
        return true;
    }

    public final boolean i() {
        return !this.k.c;
    }

    public final boolean j() {
        int i = this.h;
        return i == 4 || i == 5;
    }

    public abstract void k();

    public final void l() {
        xrj xrjVar = this.j;
        xrjVar.getClass();
        try {
            fo7 o2 = fo7.o();
            try {
                o2.b().writeInt(1);
                o2.b().writeStrongBinder(this.d);
                xrjVar.a(1, o2);
                o2.close();
            } finally {
            }
        } catch (RemoteException e) {
            o(p(e), true);
        }
    }

    public final void m(int i, fo7 fo7Var) {
        int dataSize = fo7Var.b().dataSize();
        try {
            this.j.a(i, fo7Var);
            sjc sjcVar = this.k;
            long j = dataSize;
            synchronized (sjcVar) {
                long j2 = sjcVar.a + j;
                sjcVar.a = j2;
                if (j2 - sjcVar.b < SQLiteDatabase.OPEN_SHAREDCACHE || sjcVar.c) {
                    return;
                }
                sjcVar.c = true;
                n.log(Level.FINE, "transmit window now full " + this);
            }
        } catch (RemoteException e) {
            throw p(e).a();
        }
    }

    public final void n(int i) {
        int i2 = this.h;
        int D = ouj.D(i);
        if (D == 1) {
            o2g.V(i2 == 1);
        } else if (D == 2) {
            if (i2 != 1 && i2 != 2) {
                r2 = false;
            }
            o2g.V(r2);
        } else if (D == 3) {
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                r2 = false;
            }
            o2g.V(r2);
        } else {
            if (D != 4) {
                wvs.b();
                return;
            }
            o2g.V(i2 == 4);
        }
        this.h = i;
    }

    public final void o(sgr sgrVar, boolean z) {
        if (!j()) {
            this.i = sgrVar;
            n(4);
        }
        if (this.h == 5) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.e;
        if (z || concurrentHashMap.isEmpty()) {
            this.d.a = null;
            n(5);
            xrj xrjVar = this.j;
            if (xrjVar != null) {
                try {
                    xrjVar.a.unlinkToDeath(this, 0);
                } catch (NoSuchElementException unused) {
                }
                try {
                    fo7 o2 = fo7.o();
                    try {
                        o2.b().writeInt(0);
                        this.j.a(2, o2);
                        o2.close();
                    } finally {
                    }
                } catch (RemoteException unused2) {
                }
            }
            ArrayList arrayList = new ArrayList(concurrentHashMap.values());
            concurrentHashMap.clear();
            this.b.execute(new cy1(1, this, arrayList, sgrVar));
        }
    }
}
