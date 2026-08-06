package n0;

import D0.m;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import f1.C0163N;
import java.util.Collections;
import java.util.Set;
import l.C0979c;
import o0.C0997a;
import o0.l;
import o0.r;
import o0.t;
import o0.v;
import p0.AbstractC1021r;
import p0.C1006c;
import p0.C1010g;
import p0.C1011h;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8202a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8203b;

    /* renamed from: c, reason: collision with root package name */
    public final x0.e f8204c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0988b f8205d;

    /* renamed from: e, reason: collision with root package name */
    public final C0997a f8206e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8207f;

    /* renamed from: g, reason: collision with root package name */
    public final C0163N f8208g;

    /* renamed from: h, reason: collision with root package name */
    public final o0.c f8209h;

    public f(Context context, x0.e eVar, InterfaceC0988b interfaceC0988b, e eVar2) {
        AbstractC1021r.d(context, "Null context is not permitted.");
        AbstractC1021r.d(eVar, "Api must not be null.");
        AbstractC1021r.d(eVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        AbstractC1021r.d(applicationContext, "The provided context did not have an application context.");
        this.f8202a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f8203b = attributionTag;
        this.f8204c = eVar;
        this.f8205d = interfaceC0988b;
        this.f8206e = new C0997a(eVar, interfaceC0988b, attributionTag);
        o0.c e2 = o0.c.e(applicationContext);
        this.f8209h = e2;
        this.f8207f = e2.f8264h.getAndIncrement();
        this.f8208g = eVar2.f8201a;
        A0.a aVar = e2.f8269m;
        aVar.sendMessage(aVar.obtainMessage(7, this));
    }

    public final I0.b a() {
        I0.b bVar = new I0.b(14, false);
        Set emptySet = Collections.emptySet();
        if (((C0979c) bVar.f721b) == null) {
            bVar.f721b = new C0979c(0);
        }
        ((C0979c) bVar.f721b).addAll(emptySet);
        Context context = this.f8202a;
        bVar.f723d = context.getClass().getName();
        bVar.f722c = context.getPackageName();
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m b(int i2, K.a aVar) {
        r rVar;
        D0.d dVar = new D0.d();
        o0.c cVar = this.f8209h;
        cVar.getClass();
        int i3 = aVar.f1017b;
        A0.a aVar2 = cVar.f8269m;
        m mVar = dVar.f210a;
        if (i3 != 0) {
            if (cVar.a()) {
                C1011h c1011h = (C1011h) C1010g.b().f8376a;
                C0997a c0997a = this.f8206e;
                boolean z2 = true;
                if (c1011h != null) {
                    if (c1011h.f8378b) {
                        l lVar = (l) cVar.f8266j.get(c0997a);
                        if (lVar != null) {
                            InterfaceC0989c interfaceC0989c = lVar.f8275b;
                            if (interfaceC0989c instanceof com.google.android.gms.common.internal.a) {
                                com.google.android.gms.common.internal.a aVar3 = (com.google.android.gms.common.internal.a) interfaceC0989c;
                                if (aVar3.f2704u != null && !aVar3.b()) {
                                    C1006c a2 = r.a(lVar, aVar3, i3);
                                    if (a2 != null) {
                                        lVar.f8285l++;
                                        z2 = a2.f8345c;
                                    }
                                }
                            }
                        }
                        z2 = c1011h.f8379c;
                    }
                }
                rVar = new r(cVar, i3, c0997a, z2 ? System.currentTimeMillis() : 0L, z2 ? SystemClock.elapsedRealtime() : 0L);
                if (rVar != null) {
                    aVar2.getClass();
                    D0.l lVar2 = new D0.l(aVar2, 1);
                    mVar.getClass();
                    mVar.f230b.c(new D0.g(lVar2, rVar));
                    mVar.h();
                }
            }
            rVar = null;
            if (rVar != null) {
            }
        }
        aVar2.sendMessage(aVar2.obtainMessage(4, new t(new v(i2, aVar, dVar, this.f8208g), cVar.f8265i.get(), this)));
        return mVar;
    }
}
