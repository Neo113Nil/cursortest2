package o0;

import O7.AbstractC0399y;
import O7.F;
import S0.f;
import T7.o;
import V7.e;
import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.h;
import l0.C4683a;
import p0.AbstractC4853b;
import q0.AbstractC4871f;
import q0.C4866a;
import q0.C4869d;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4825b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4871f f39677a;

    public C4825b(AbstractC4871f abstractC4871f) {
        this.f39677a = abstractC4871f;
    }

    public static final C4825b a(Context context) {
        C4869d c4869d;
        int i = Build.VERSION.SDK_INT;
        C4683a c4683a = C4683a.f39022a;
        if ((i >= 30 ? c4683a.a() : 0) >= 5) {
            Object systemService = context.getSystemService((Class<Object>) AbstractC4853b.j());
            h.d(systemService, "context.getSystemService…opicsManager::class.java)");
            c4869d = new C4869d(AbstractC4853b.i(systemService), 1);
        } else {
            if ((i >= 30 ? c4683a.a() : 0) == 4) {
                Object systemService2 = context.getSystemService((Class<Object>) AbstractC4853b.j());
                h.d(systemService2, "context.getSystemService…opicsManager::class.java)");
                c4869d = new C4869d(AbstractC4853b.i(systemService2), 0);
            } else {
                c4869d = null;
            }
        }
        if (c4869d != null) {
            return new C4825b(c4869d);
        }
        return null;
    }

    public J3.a b(C4866a request) {
        h.e(request, "request");
        e eVar = F.f2551a;
        return f.b(AbstractC0399y.c(AbstractC0399y.b(o.f3162a), new C4824a(this, request, null), 3));
    }
}
