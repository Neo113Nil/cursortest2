package d4;

import S0.l;
import android.text.TextUtils;
import e4.C4463a;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: d4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4448b implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37049n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4449c f37050u;

    public /* synthetic */ RunnableC4448b(C4449c c4449c, int i) {
        this.f37049n = i;
        this.f37050u = c4449c;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C4463a m4;
        C4463a g4;
        switch (this.f37049n) {
            case 0:
                this.f37050u.a();
                return;
            case 1:
                this.f37050u.a();
                return;
            default:
                C4449c c4449c = this.f37050u;
                c4449c.getClass();
                Object obj = C4449c.f37051m;
                synchronized (obj) {
                    try {
                        O3.g gVar = c4449c.f37052a;
                        gVar.a();
                        l A9 = l.A(gVar.f2345a);
                        try {
                            m4 = c4449c.f37054c.m();
                            if (A9 != null) {
                                A9.H();
                            }
                        } catch (Throwable th) {
                            if (A9 != null) {
                                A9.H();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i = m4.f37196b;
                    if (!(i == 5)) {
                        if (!(i == 3)) {
                            if (c4449c.f37055d.a(m4)) {
                                g4 = c4449c.b(m4);
                                synchronized (obj) {
                                    try {
                                        O3.g gVar2 = c4449c.f37052a;
                                        gVar2.a();
                                        l A10 = l.A(gVar2.f2345a);
                                        try {
                                            c4449c.f37054c.l(g4);
                                            if (A10 != null) {
                                                A10.H();
                                            }
                                        } catch (Throwable th2) {
                                            if (A10 != null) {
                                                A10.H();
                                            }
                                            throw th2;
                                        }
                                    } finally {
                                    }
                                }
                                synchronized (c4449c) {
                                    try {
                                        if (c4449c.f37061k.size() != 0 && !TextUtils.equals(m4.f37195a, g4.f37195a)) {
                                            Iterator it = c4449c.f37061k.iterator();
                                            if (it.hasNext()) {
                                                if (it.next() != null) {
                                                    throw new ClassCastException();
                                                }
                                                throw null;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                if (g4.f37196b == 4) {
                                    String str = g4.f37195a;
                                    synchronized (c4449c) {
                                        c4449c.f37060j = str;
                                    }
                                }
                                int i6 = g4.f37196b;
                                if (i6 == 5) {
                                    c4449c.h(new C4451e());
                                    return;
                                } else if (i6 == 2 || i6 == 1) {
                                    c4449c.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    c4449c.i(g4);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    g4 = c4449c.g(m4);
                    synchronized (obj) {
                    }
                } catch (C4451e e9) {
                    c4449c.h(e9);
                    return;
                }
                break;
        }
    }
}
