package S6;

import E2.M;
import b7.C0532d;
import h6.C4579a;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2972a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2973b;

    public /* synthetic */ b(int i, Object obj) {
        this.f2972a = i;
        this.f2973b = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f2972a) {
            case 0:
                final String str = (String) obj;
                final M m9 = (M) this.f2973b;
                ((List) obj2).forEach(new Consumer() { // from class: S6.c
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj3) {
                        String value = (String) obj3;
                        M m10 = M.this;
                        String name = str;
                        kotlin.jvm.internal.h.e(name, "name");
                        kotlin.jvm.internal.h.e(value, "value");
                        I1.d dVar = (I1.d) m10.f763w;
                        dVar.getClass();
                        X2.a.k(name);
                        X2.a.l(value, name);
                        X2.a.b(dVar, name, value);
                    }
                });
                break;
            case 1:
                ((K1.c) this.f2973b).c((k6.e) obj, obj2);
                break;
            case 2:
                C4579a c4579a = (C4579a) obj;
                I1.d dVar = (I1.d) this.f2973b;
                if (c4579a != null && !c4579a.f38137b.isEmpty() && obj2 != null) {
                    ArrayList arrayList = dVar.f1308n;
                    arrayList.add(c4579a);
                    arrayList.add(obj2);
                    break;
                }
                break;
            case 3:
                ((C0532d) this.f2973b).l((k6.e) obj, obj2);
                break;
            default:
                ((l6.e) this.f2973b).c((k6.e) obj, obj2);
                break;
        }
    }
}
