package D1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.internal.ads.C2964aq;
import java.io.InputStream;
import java.util.ArrayDeque;
import x1.InterfaceC5183a;

/* renamed from: D1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296a implements u1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f530a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f531b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f532c;

    public /* synthetic */ C0296a(int i, Object obj, Object obj2) {
        this.f530a = i;
        this.f531b = obj;
        this.f532c = obj2;
    }

    @Override // u1.j
    public final w1.w a(Object obj, int i, int i4, u1.h hVar) {
        boolean z6;
        z zVar;
        P1.e eVar;
        switch (this.f530a) {
            case 0:
                w1.w a9 = ((u1.j) this.f531b).a(obj, i, i4, hVar);
                if (a9 == null) {
                    return null;
                }
                return new C0299d((Resources) this.f532c, a9);
            case 1:
                w1.w c9 = ((F1.c) this.f531b).c((Uri) obj, hVar);
                if (c9 == null) {
                    return null;
                }
                return r.b((InterfaceC5183a) this.f532c, (Drawable) ((F1.b) c9).get(), i, i4);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof z) {
                    zVar = (z) inputStream;
                    z6 = false;
                } else {
                    z6 = true;
                    zVar = new z(inputStream, (C2964aq) this.f532c);
                }
                ArrayDeque arrayDeque = P1.e.f2356v;
                synchronized (arrayDeque) {
                    eVar = (P1.e) arrayDeque.poll();
                }
                if (eVar == null) {
                    eVar = new P1.e();
                }
                P1.e eVar2 = eVar;
                eVar2.f2357n = zVar;
                P1.m mVar = new P1.m(eVar2);
                S0.l lVar = new S0.l(1, zVar, eVar2);
                try {
                    p pVar = (p) this.f531b;
                    C0299d a10 = pVar.a(new b3.e(mVar, pVar.f567d, pVar.f566c), i, i4, hVar, lVar);
                    eVar2.f2358u = null;
                    eVar2.f2357n = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(eVar2);
                    }
                    if (z6) {
                        zVar.b();
                    }
                    return a10;
                } catch (Throwable th) {
                    eVar2.f2358u = null;
                    eVar2.f2357n = null;
                    ArrayDeque arrayDeque2 = P1.e.f2356v;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(eVar2);
                        if (!z6) {
                            throw th;
                        }
                        zVar.b();
                        throw th;
                    }
                }
        }
    }

    @Override // u1.j
    public final boolean b(Object obj, u1.h hVar) {
        switch (this.f530a) {
            case 0:
                return ((u1.j) this.f531b).b(obj, hVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((p) this.f531b).getClass();
                return true;
        }
    }

    public C0296a(Resources resources, u1.j jVar) {
        this.f530a = 0;
        this.f532c = resources;
        this.f531b = jVar;
    }
}
