package o0;

import S7.AbstractC0406y;
import S7.F;
import X7.o;
import Z7.e;
import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.h;
import l0.C4654a;
import p0.AbstractC4823b;
import q0.AbstractC4866f;
import q0.C4861a;
import q0.C4864d;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4780b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4866f f39546a;

    public C4780b(AbstractC4866f abstractC4866f) {
        this.f39546a = abstractC4866f;
    }

    public static final C4780b a(Context context) {
        C4864d c4864d;
        int i = Build.VERSION.SDK_INT;
        C4654a c4654a = C4654a.f38880a;
        if ((i >= 30 ? c4654a.a() : 0) >= 5) {
            Object systemService = context.getSystemService((Class<Object>) AbstractC4823b.j());
            h.d(systemService, "context.getSystemService…opicsManager::class.java)");
            c4864d = new C4864d(AbstractC4823b.i(systemService), 1);
        } else {
            if ((i >= 30 ? c4654a.a() : 0) == 4) {
                Object systemService2 = context.getSystemService((Class<Object>) AbstractC4823b.j());
                h.d(systemService2, "context.getSystemService…opicsManager::class.java)");
                c4864d = new C4864d(AbstractC4823b.i(systemService2), 0);
            } else {
                c4864d = null;
            }
        }
        if (c4864d != null) {
            return new C4780b(c4864d);
        }
        return null;
    }

    public N3.a b(C4861a request) {
        h.e(request, "request");
        e eVar = F.f2915a;
        return L3.F.b(AbstractC0406y.c(AbstractC0406y.b(o.f3856a), new C4779a(this, request, null), 3));
    }
}
