package L6;

import J6.o;
import J6.t;
import d6.C4460a;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.function.BiConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1766a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J6.b f1767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J6.j f1768c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1769d;

    public /* synthetic */ g(J6.j jVar, int[] iArr, J6.b bVar) {
        this.f1768c = jVar;
        this.f1769d = iArr;
        this.f1767b = bVar;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i;
        J6.b bVar = this.f1767b;
        Object obj3 = this.f1769d;
        switch (this.f1766a) {
            case 0:
                C4460a c4460a = (C4460a) obj;
                J6.j jVar = this.f1768c;
                int b9 = jVar.b();
                if (c4460a.f37203b.isEmpty()) {
                    i = 0;
                } else {
                    i = J6.k.b(Q6.d.f2728a, c4460a.d());
                }
                int b10 = t.b(Q6.d.f2729b, c4460a, obj2, a.f1754h, jVar) + i;
                jVar.f1425c[b9] = b10;
                int[] iArr = (int[]) obj3;
                iArr[0] = J6.d.b(b10) + bVar.f1402c + b10 + iArr[0];
                return;
            default:
                o oVar = (o) obj3;
                J6.j jVar2 = this.f1768c;
                C4460a c4460a2 = (C4460a) obj;
                try {
                    oVar.W(bVar, jVar2.e());
                    if (c4460a2.f37203b.isEmpty()) {
                        J6.b bVar2 = Q6.d.f2728a;
                    } else {
                        oVar.n(Q6.d.f2728a, c4460a2.d());
                    }
                    oVar.g(Q6.d.f2729b, c4460a2, obj2, a.f1754h, jVar2);
                    oVar.C();
                    return;
                } catch (IOException e6) {
                    throw new UncheckedIOException(e6);
                }
        }
    }

    public /* synthetic */ g(o oVar, J6.b bVar, J6.j jVar) {
        this.f1769d = oVar;
        this.f1767b = bVar;
        this.f1768c = jVar;
    }
}
