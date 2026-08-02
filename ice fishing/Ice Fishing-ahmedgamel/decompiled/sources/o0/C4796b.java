package o0;

import N3.C;
import S7.AbstractC0410y;
import S7.F;
import X7.o;
import Z7.e;
import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.h;
import l0.C4665a;
import p0.AbstractC4827b;
import q0.AbstractC4866f;
import q0.C4861a;
import q0.C4864d;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4796b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4866f f39713a;

    public C4796b(AbstractC4866f abstractC4866f) {
        this.f39713a = abstractC4866f;
    }

    public static final C4796b a(Context context) {
        C4864d c4864d;
        int i = Build.VERSION.SDK_INT;
        C4665a c4665a = C4665a.f38807a;
        if ((i >= 30 ? c4665a.a() : 0) >= 5) {
            Object systemService = context.getSystemService((Class<Object>) AbstractC4827b.j());
            h.d(systemService, "context.getSystemService…opicsManager::class.java)");
            c4864d = new C4864d(AbstractC4827b.i(systemService), 1);
        } else {
            if ((i >= 30 ? c4665a.a() : 0) == 4) {
                Object systemService2 = context.getSystemService((Class<Object>) AbstractC4827b.j());
                h.d(systemService2, "context.getSystemService…opicsManager::class.java)");
                c4864d = new C4864d(AbstractC4827b.i(systemService2), 0);
            } else {
                c4864d = null;
            }
        }
        if (c4864d != null) {
            return new C4796b(c4864d);
        }
        return null;
    }

    public P3.a b(C4861a request) {
        h.e(request, "request");
        e eVar = F.f2998a;
        return C.z(AbstractC0410y.c(AbstractC0410y.b(o.f3811a), new C4795a(this, request, null), 3));
    }
}
