package P6;

import N6.o;
import N6.t;
import h6.C4574a;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.function.BiConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2578a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N6.b f2579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N6.j f2580c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2581d;

    public /* synthetic */ g(N6.j jVar, int[] iArr, N6.b bVar) {
        this.f2580c = jVar;
        this.f2581d = iArr;
        this.f2579b = bVar;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i;
        N6.b bVar = this.f2579b;
        Object obj3 = this.f2581d;
        switch (this.f2578a) {
            case 0:
                C4574a c4574a = (C4574a) obj;
                N6.j jVar = this.f2580c;
                int b9 = jVar.b();
                if (c4574a.f38020b.isEmpty()) {
                    i = 0;
                } else {
                    i = N6.k.b(U6.d.f3216a, c4574a.d());
                }
                int b10 = t.b(U6.d.f3217b, c4574a, obj2, a.f2566h, jVar) + i;
                jVar.f1978c[b9] = b10;
                int[] iArr = (int[]) obj3;
                iArr[0] = N6.d.b(b10) + bVar.f1955c + b10 + iArr[0];
                return;
            default:
                o oVar = (o) obj3;
                N6.j jVar2 = this.f2580c;
                C4574a c4574a2 = (C4574a) obj;
                try {
                    oVar.W(bVar, jVar2.e());
                    if (c4574a2.f38020b.isEmpty()) {
                        N6.b bVar2 = U6.d.f3216a;
                    } else {
                        oVar.n(U6.d.f3216a, c4574a2.d());
                    }
                    oVar.i(U6.d.f3217b, c4574a2, obj2, a.f2566h, jVar2);
                    oVar.C();
                    return;
                } catch (IOException e9) {
                    throw new UncheckedIOException(e9);
                }
        }
    }

    public /* synthetic */ g(o oVar, N6.b bVar, N6.j jVar) {
        this.f2581d = oVar;
        this.f2579b = bVar;
        this.f2580c = jVar;
    }
}
