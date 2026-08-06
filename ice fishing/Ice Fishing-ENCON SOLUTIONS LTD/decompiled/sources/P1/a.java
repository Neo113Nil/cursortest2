package P1;

import N1.o;
import W1.g;
import W1.k;
import W1.q;
import W1.w;
import W1.y;
import java.io.IOException;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class a implements w {

    /* renamed from: a, reason: collision with root package name */
    public final k f1498a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1499b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f1500c;

    public a(o this$0) {
        i.e(this$0, "this$0");
        this.f1500c = this$0;
        this.f1498a = new k(((q) this$0.f1228d).f1895a.d());
    }

    public final void a() {
        o oVar = this.f1500c;
        int i2 = oVar.f1225a;
        if (i2 == 6) {
            return;
        }
        if (i2 != 5) {
            throw new IllegalStateException(i.h(Integer.valueOf(oVar.f1225a), "state: "));
        }
        k kVar = this.f1498a;
        y yVar = kVar.f1880e;
        kVar.f1880e = y.f1911d;
        yVar.a();
        yVar.b();
        oVar.f1225a = 6;
    }

    @Override // W1.w
    public final y d() {
        return this.f1498a;
    }

    @Override // W1.w
    public long e(g sink, long j2) {
        o oVar = this.f1500c;
        i.e(sink, "sink");
        try {
            return ((q) oVar.f1228d).e(sink, j2);
        } catch (IOException e2) {
            ((N1.k) oVar.f1227c).k();
            a();
            throw e2;
        }
    }
}
