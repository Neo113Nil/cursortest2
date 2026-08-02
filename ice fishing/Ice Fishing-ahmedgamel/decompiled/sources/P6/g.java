package P6;

import N6.o;
import N6.t;
import h6.C4579a;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.function.BiConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2413a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N6.b f2414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N6.j f2415c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2416d;

    public /* synthetic */ g(N6.j jVar, int[] iArr, N6.b bVar) {
        this.f2415c = jVar;
        this.f2416d = iArr;
        this.f2414b = bVar;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i;
        N6.b bVar = this.f2414b;
        Object obj3 = this.f2416d;
        switch (this.f2413a) {
            case 0:
                C4579a c4579a = (C4579a) obj;
                N6.j jVar = this.f2415c;
                int b9 = jVar.b();
                if (c4579a.f38137b.isEmpty()) {
                    i = 0;
                } else {
                    i = N6.k.b(U6.d.f3339a, c4579a.d());
                }
                int b10 = t.b(U6.d.f3340b, c4579a, obj2, a.f2401h, jVar) + i;
                jVar.f2066c[b9] = b10;
                int[] iArr = (int[]) obj3;
                iArr[0] = N6.d.b(b10) + bVar.f2043c + b10 + iArr[0];
                return;
            default:
                o oVar = (o) obj3;
                N6.j jVar2 = this.f2415c;
                C4579a c4579a2 = (C4579a) obj;
                try {
                    oVar.W(bVar, jVar2.e());
                    if (c4579a2.f38137b.isEmpty()) {
                        N6.b bVar2 = U6.d.f3339a;
                    } else {
                        oVar.n(U6.d.f3339a, c4579a2.d());
                    }
                    oVar.i(U6.d.f3340b, c4579a2, obj2, a.f2401h, jVar2);
                    oVar.C();
                    return;
                } catch (IOException e9) {
                    throw new UncheckedIOException(e9);
                }
        }
    }

    public /* synthetic */ g(o oVar, N6.b bVar, N6.j jVar) {
        this.f2416d = oVar;
        this.f2414b = bVar;
        this.f2415c = jVar;
    }
}
