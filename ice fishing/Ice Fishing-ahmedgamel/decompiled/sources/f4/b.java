package f4;

import S0.l;
import android.text.TextUtils;
import g4.C4532a;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37451n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f37452u;

    public /* synthetic */ b(c cVar, int i) {
        this.f37451n = i;
        this.f37452u = cVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C4532a m9;
        C4532a g9;
        switch (this.f37451n) {
            case 0:
                this.f37452u.a();
                return;
            case 1:
                this.f37452u.a();
                return;
            default:
                c cVar = this.f37452u;
                cVar.getClass();
                Object obj = c.f37453m;
                synchronized (obj) {
                    try {
                        Q3.g gVar = cVar.f37454a;
                        gVar.a();
                        l E8 = l.E(gVar.f2661a);
                        try {
                            m9 = cVar.f37456c.m();
                            if (E8 != null) {
                                E8.G();
                            }
                        } catch (Throwable th) {
                            if (E8 != null) {
                                E8.G();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i = m9.f37672b;
                    if (!(i == 5)) {
                        if (!(i == 3)) {
                            if (cVar.f37457d.a(m9)) {
                                g9 = cVar.b(m9);
                                synchronized (obj) {
                                    try {
                                        Q3.g gVar2 = cVar.f37454a;
                                        gVar2.a();
                                        l E9 = l.E(gVar2.f2661a);
                                        try {
                                            cVar.f37456c.j(g9);
                                            if (E9 != null) {
                                                E9.G();
                                            }
                                        } catch (Throwable th2) {
                                            if (E9 != null) {
                                                E9.G();
                                            }
                                            throw th2;
                                        }
                                    } finally {
                                    }
                                }
                                synchronized (cVar) {
                                    try {
                                        if (cVar.f37463k.size() != 0 && !TextUtils.equals(m9.f37671a, g9.f37671a)) {
                                            Iterator it = cVar.f37463k.iterator();
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
                                if (g9.f37672b == 4) {
                                    String str = g9.f37671a;
                                    synchronized (cVar) {
                                        cVar.f37462j = str;
                                    }
                                }
                                int i4 = g9.f37672b;
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
                    g9 = cVar.g(m9);
                    synchronized (obj) {
                    }
                } catch (e e9) {
                    cVar.h(e9);
                    return;
                }
                break;
        }
    }
}
