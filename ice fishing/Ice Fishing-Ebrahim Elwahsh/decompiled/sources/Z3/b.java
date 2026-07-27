package Z3;

import S0.l;
import a4.C0428a;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4253n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f4254u;

    public /* synthetic */ b(c cVar, int i) {
        this.f4253n = i;
        this.f4254u = cVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C0428a m8;
        C0428a g9;
        switch (this.f4253n) {
            case 0:
                this.f4254u.a();
                return;
            case 1:
                this.f4254u.a();
                return;
            default:
                c cVar = this.f4254u;
                cVar.getClass();
                Object obj = c.f4255m;
                synchronized (obj) {
                    try {
                        K3.g gVar = cVar.f4256a;
                        gVar.a();
                        l h9 = l.h(gVar.f1623a);
                        try {
                            m8 = cVar.f4258c.m();
                            if (h9 != null) {
                                h9.s();
                            }
                        } catch (Throwable th) {
                            if (h9 != null) {
                                h9.s();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i = m8.f4377b;
                    if (!(i == 5)) {
                        if (!(i == 3)) {
                            if (cVar.f4259d.a(m8)) {
                                g9 = cVar.b(m8);
                                synchronized (obj) {
                                    try {
                                        K3.g gVar2 = cVar.f4256a;
                                        gVar2.a();
                                        l h10 = l.h(gVar2.f1623a);
                                        try {
                                            cVar.f4258c.h(g9);
                                            if (h10 != null) {
                                                h10.s();
                                            }
                                        } catch (Throwable th2) {
                                            if (h10 != null) {
                                                h10.s();
                                            }
                                            throw th2;
                                        }
                                    } finally {
                                    }
                                }
                                synchronized (cVar) {
                                    try {
                                        if (cVar.f4265k.size() != 0 && !TextUtils.equals(m8.f4376a, g9.f4376a)) {
                                            Iterator it = cVar.f4265k.iterator();
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
                                if (g9.f4377b == 4) {
                                    String str = g9.f4376a;
                                    synchronized (cVar) {
                                        cVar.f4264j = str;
                                    }
                                }
                                int i4 = g9.f4377b;
                                if (i4 == 5) {
                                    cVar.h(new e());
                                    return;
                                } else if (i4 == 2 || i4 == 1) {
                                    cVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    cVar.i(g9);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    g9 = cVar.g(m8);
                    synchronized (obj) {
                    }
                } catch (e e6) {
                    cVar.h(e6);
                    return;
                }
                break;
        }
    }
}
