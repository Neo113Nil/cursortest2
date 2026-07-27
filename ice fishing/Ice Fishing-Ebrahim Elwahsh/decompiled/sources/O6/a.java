package O6;

import B2.N;
import d6.C4460a;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2525a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2526b;

    public /* synthetic */ a(int i, Object obj) {
        this.f2525a = i;
        this.f2526b = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f2525a) {
            case 0:
                final String str = (String) obj;
                final N n9 = (N) this.f2526b;
                ((List) obj2).forEach(new Consumer() { // from class: O6.b
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj3) {
                        String value = (String) obj3;
                        N n10 = N.this;
                        String name = str;
                        kotlin.jvm.internal.h.e(name, "name");
                        kotlin.jvm.internal.h.e(value, "value");
                        I1.b bVar = (I1.b) n10.f198w;
                        bVar.getClass();
                        K3.b.p(name);
                        K3.b.q(value, name);
                        K3.b.b(bVar, name, value);
                    }
                });
                break;
            case 1:
                ((I1.f) this.f2526b).d((g6.e) obj, obj2);
                break;
            case 2:
                C4460a c4460a = (C4460a) obj;
                I1.b bVar = (I1.b) this.f2526b;
                if (c4460a != null && !c4460a.f37203b.isEmpty() && obj2 != null) {
                    ArrayList arrayList = bVar.f1246n;
                    arrayList.add(c4460a);
                    arrayList.add(obj2);
                    break;
                }
                break;
            case 3:
                ((X6.d) this.f2526b).l((g6.e) obj, obj2);
                break;
            default:
                ((h6.e) this.f2526b).e((g6.e) obj, obj2);
                break;
        }
    }
}
