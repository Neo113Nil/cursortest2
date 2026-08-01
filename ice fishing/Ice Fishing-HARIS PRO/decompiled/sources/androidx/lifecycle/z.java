package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;
import n.C0306a;
import o.C0313d;
import o.C0315f;

/* loaded from: classes.dex */
public class z {
    public static final Object j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f2060a;

    /* renamed from: b, reason: collision with root package name */
    public final C0315f f2061b = new C0315f();

    /* renamed from: c, reason: collision with root package name */
    public int f2062c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2063d;
    public volatile Object e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f2064f;

    /* renamed from: g, reason: collision with root package name */
    public int f2065g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2066h;
    public boolean i;

    public z() {
        Object obj = j;
        this.f2064f = obj;
        this.e = obj;
        this.f2065g = -1;
    }

    public static void a(String str) {
        ((C0306a) C0306a.E().f4108g).getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(D1.h.g("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(y yVar) {
        if (yVar.f2057b) {
            if (!yVar.e()) {
                yVar.b(false);
                return;
            }
            int i = yVar.f2058c;
            int i2 = this.f2065g;
            if (i >= i2) {
                return;
            }
            yVar.f2058c = i2;
            yVar.f2056a.a(this.e);
        }
    }

    public final void c(y yVar) {
        if (this.f2066h) {
            this.i = true;
            return;
        }
        this.f2066h = true;
        do {
            this.i = false;
            if (yVar != null) {
                b(yVar);
                yVar = null;
            } else {
                C0315f c0315f = this.f2061b;
                c0315f.getClass();
                C0313d c0313d = new C0313d(c0315f);
                c0315f.f4126c.put(c0313d, Boolean.FALSE);
                while (c0313d.hasNext()) {
                    b((y) ((Map.Entry) c0313d.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.f2066h = false;
    }

    public final void d(Object obj) {
        a("setValue");
        this.f2065g++;
        this.e = obj;
        c(null);
    }
}
