package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final /* synthetic */ class gec implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hec b;

    public /* synthetic */ gec(hec hecVar, int i) {
        this.a = i;
        this.b = hecVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        sd2 J;
        sd2 g;
        switch (this.a) {
            case 0:
                this.b.a();
                return;
            case 1:
                this.b.a();
                return;
            default:
                hec hecVar = this.b;
                Object obj = hec.m;
                synchronized (obj) {
                    try {
                        aec aecVar = hecVar.a;
                        aecVar.a();
                        xiu b = xiu.b(aecVar.a);
                        try {
                            J = hecVar.c.J();
                            if (b != null) {
                                b.C();
                            }
                        } catch (Throwable th) {
                            if (b != null) {
                                b.C();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i = J.b;
                    if (!(i == 5)) {
                        if (!(i == 3)) {
                            if (hecVar.d.a(J)) {
                                g = hecVar.b(J);
                                synchronized (obj) {
                                    try {
                                        aec aecVar2 = hecVar.a;
                                        aecVar2.a();
                                        xiu b2 = xiu.b(aecVar2.a);
                                        try {
                                            hecVar.c.y(g);
                                            if (b2 != null) {
                                                b2.C();
                                            }
                                        } catch (Throwable th2) {
                                            if (b2 != null) {
                                                b2.C();
                                            }
                                            throw th2;
                                        }
                                    } finally {
                                    }
                                }
                                synchronized (hecVar) {
                                    try {
                                        if (hecVar.k.size() != 0 && !TextUtils.equals(J.a, g.a)) {
                                            Iterator it = hecVar.k.iterator();
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
                                if (g.b == 4) {
                                    String str = g.a;
                                    synchronized (hecVar) {
                                        hecVar.j = str;
                                    }
                                }
                                int i2 = g.b;
                                if (i2 == 5) {
                                    hecVar.h(new jec());
                                    return;
                                } else if (i2 == 2 || i2 == 1) {
                                    hecVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    hecVar.i(g);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    g = hecVar.g(J);
                    synchronized (obj) {
                    }
                } catch (jec e) {
                    hecVar.h(e);
                    return;
                }
                break;
        }
    }
}
