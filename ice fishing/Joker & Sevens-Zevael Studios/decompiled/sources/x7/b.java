package x7;

import android.text.TextUtils;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.io.IOException;
import java.util.Iterator;
import x4.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8375g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f8376h;

    public /* synthetic */ b(c cVar, int i10) {
        this.f8375g = i10;
        this.f8376h = cVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        y7.b j3;
        y7.b g8;
        switch (this.f8375g) {
            case 0:
                this.f8376h.a();
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                this.f8376h.a();
                return;
            default:
                c cVar = this.f8376h;
                Object obj = c.f8377m;
                synchronized (obj) {
                    try {
                        i7.g gVar = cVar.f8378a;
                        gVar.a();
                        s a6 = s.a(gVar.f3231a);
                        try {
                            j3 = cVar.f8380c.j();
                            if (a6 != null) {
                                a6.j();
                            }
                        } catch (Throwable th) {
                            if (a6 != null) {
                                a6.j();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i10 = j3.f8804b;
                    if (!(i10 == 5)) {
                        if (!(i10 == 3)) {
                            if (cVar.f8381d.a(j3)) {
                                g8 = cVar.b(j3);
                                synchronized (obj) {
                                    try {
                                        i7.g gVar2 = cVar.f8378a;
                                        gVar2.a();
                                        s a8 = s.a(gVar2.f3231a);
                                        try {
                                            cVar.f8380c.h(g8);
                                            if (a8 != null) {
                                                a8.j();
                                            }
                                        } catch (Throwable th2) {
                                            if (a8 != null) {
                                                a8.j();
                                            }
                                            throw th2;
                                        }
                                    } finally {
                                    }
                                }
                                synchronized (cVar) {
                                    try {
                                        if (cVar.f8388k.size() != 0 && !TextUtils.equals(j3.f8803a, g8.f8803a)) {
                                            Iterator it = cVar.f8388k.iterator();
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
                                if (g8.f8804b == 4) {
                                    String str = g8.f8803a;
                                    synchronized (cVar) {
                                        cVar.f8387j = str;
                                    }
                                }
                                int i11 = g8.f8804b;
                                if (i11 == 5) {
                                    cVar.h(new e());
                                    return;
                                } else if (i11 == 2 || i11 == 1) {
                                    cVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    cVar.i(g8);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    g8 = cVar.g(j3);
                    synchronized (obj) {
                    }
                } catch (e e10) {
                    cVar.h(e10);
                    return;
                }
                break;
        }
    }
}
