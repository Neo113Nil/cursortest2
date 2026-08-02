package defpackage;

import java.io.IOException;
import java.util.Iterator;
import okhttp3.internal.connection.RealConnection;

/* loaded from: classes9.dex */
public final class xxj extends wsx0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xxj(String str, int i, Object obj) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.wsx0
    public final long a() {
        long j;
        RealConnection realConnection;
        int i = 0;
        long j2 = -1;
        switch (this.e) {
            case 0:
                dyj dyjVar = (dyj) this.f;
                synchronized (dyjVar) {
                    if (dyjVar.F && !dyjVar.G) {
                        try {
                            dyjVar.I();
                        } catch (IOException unused) {
                            dyjVar.H = true;
                        }
                        try {
                            if (dyjVar.n()) {
                                dyjVar.B();
                                dyjVar.C = 0;
                            }
                        } catch (IOException unused2) {
                            dyjVar.I = true;
                            ici0 ici0Var = dyjVar.A;
                            if (ici0Var != null) {
                                yf61.b(ici0Var);
                            }
                            dyjVar.A = new ici0(new o16());
                        }
                    }
                }
                return -1L;
            case 1:
                oci0 oci0Var = (oci0) this.f;
                long nanoTime = System.nanoTime();
                long j3 = (nanoTime - oci0Var.c) + 1;
                Iterator it = oci0Var.f.iterator();
                long j4 = Long.MAX_VALUE;
                RealConnection realConnection2 = null;
                long j5 = j3;
                RealConnection realConnection3 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    long j6 = j2;
                    RealConnection realConnection4 = (RealConnection) it.next();
                    synchronized (realConnection4) {
                        if (oci0Var.a(realConnection4, nanoTime) > 0) {
                            i2++;
                        } else {
                            long j7 = j5;
                            long j8 = realConnection4.r;
                            if (j8 < j7) {
                                realConnection3 = realConnection4;
                                j7 = j8;
                            }
                            i++;
                            if (j8 < j4) {
                                realConnection2 = realConnection4;
                                j4 = j8;
                            }
                            j5 = j7;
                        }
                    }
                    j2 = j6;
                }
                long j9 = j2;
                long j10 = j5;
                if (realConnection3 != null) {
                    realConnection = realConnection3;
                    j = j10;
                } else if (i > oci0Var.a) {
                    j = j4;
                    realConnection = realConnection2;
                } else {
                    j = j9;
                    realConnection = null;
                }
                if (realConnection == null) {
                    return realConnection2 != null ? (j4 + oci0Var.c) - nanoTime : i2 > 0 ? oci0Var.c : j9;
                }
                synchronized (realConnection) {
                    if (realConnection.q.isEmpty() && realConnection.r == j) {
                        realConnection.k = true;
                        oci0Var.f.remove(realConnection);
                        bg61.d(realConnection.e);
                        oci0Var.b.getClass();
                        if (!oci0Var.f.isEmpty()) {
                            return 0L;
                        }
                        oci0Var.d.a();
                        return 0L;
                    }
                    return 0L;
                }
            default:
                ((sls) this.f).invoke();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxj(String str, boolean z, sls slsVar) {
        super(str, z);
        this.e = 2;
        this.f = slsVar;
    }
}
