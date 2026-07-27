package B1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.internal.ads.C2941aq;
import java.io.InputStream;
import java.util.ArrayDeque;
import v1.InterfaceC5104a;

/* renamed from: B1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259a implements s1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f117b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f118c;

    public /* synthetic */ C0259a(int i, Object obj, Object obj2) {
        this.f116a = i;
        this.f117b = obj;
        this.f118c = obj2;
    }

    @Override // s1.j
    public final u1.x a(Object obj, int i, int i6, s1.h hVar) {
        boolean z3;
        A a9;
        N1.e eVar;
        switch (this.f116a) {
            case 0:
                u1.x a10 = ((s1.j) this.f117b).a(obj, i, i6, hVar);
                if (a10 == null) {
                    return null;
                }
                return new C0262d((Resources) this.f118c, a10);
            case 1:
                u1.x c9 = ((D1.c) this.f117b).c((Uri) obj, hVar);
                if (c9 == null) {
                    return null;
                }
                return r.b((InterfaceC5104a) this.f118c, (Drawable) ((D1.b) c9).get(), i, i6);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof A) {
                    a9 = (A) inputStream;
                    z3 = false;
                } else {
                    z3 = true;
                    a9 = new A(inputStream, (C2941aq) this.f118c);
                }
                ArrayDeque arrayDeque = N1.e.f1912v;
                synchronized (arrayDeque) {
                    eVar = (N1.e) arrayDeque.poll();
                }
                if (eVar == null) {
                    eVar = new N1.e();
                }
                N1.e eVar2 = eVar;
                eVar2.f1913n = a9;
                N1.m mVar = new N1.m(eVar2);
                S0.e eVar3 = new S0.e(1, a9, eVar2);
                try {
                    p pVar = (p) this.f117b;
                    C0262d a11 = pVar.a(new Z2.e(mVar, pVar.f153d, pVar.f152c), i, i6, hVar, eVar3);
                    eVar2.f1914u = null;
                    eVar2.f1913n = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(eVar2);
                    }
                    if (z3) {
                        a9.b();
                    }
                    return a11;
                } catch (Throwable th) {
                    eVar2.f1914u = null;
                    eVar2.f1913n = null;
                    ArrayDeque arrayDeque2 = N1.e.f1912v;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(eVar2);
                        if (!z3) {
                            throw th;
                        }
                        a9.b();
                        throw th;
                    }
                }
        }
    }

    @Override // s1.j
    public final boolean b(Object obj, s1.h hVar) {
        switch (this.f116a) {
            case 0:
                return ((s1.j) this.f117b).b(obj, hVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((p) this.f117b).getClass();
                return true;
        }
    }

    public C0259a(Resources resources, s1.j jVar) {
        this.f116a = 0;
        this.f118c = resources;
        this.f117b = jVar;
    }
}
