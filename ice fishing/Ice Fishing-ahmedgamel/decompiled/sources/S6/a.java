package S6;

import C2.N;
import b7.C0524d;
import d1.C4445c;
import h6.C4574a;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2890b;

    public /* synthetic */ a(int i, Object obj) {
        this.f2889a = i;
        this.f2890b = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f2889a) {
            case 0:
                final String str = (String) obj;
                final N n9 = (N) this.f2890b;
                ((List) obj2).forEach(new Consumer() { // from class: S6.b
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj3) {
                        String value = (String) obj3;
                        N n10 = N.this;
                        String name = str;
                        kotlin.jvm.internal.h.e(name, "name");
                        kotlin.jvm.internal.h.e(value, "value");
                        G1.e eVar = (G1.e) n10.f303w;
                        eVar.getClass();
                        com.bumptech.glide.f.h(name);
                        com.bumptech.glide.f.i(value, name);
                        com.bumptech.glide.f.f(eVar, name, value);
                    }
                });
                break;
            case 1:
                ((C4445c) this.f2890b).f((k6.e) obj, obj2);
                break;
            case 2:
                C4574a c4574a = (C4574a) obj;
                I1.f fVar = (I1.f) this.f2890b;
                if (c4574a != null && !c4574a.f38020b.isEmpty() && obj2 != null) {
                    ArrayList arrayList = fVar.f1286a;
                    arrayList.add(c4574a);
                    arrayList.add(obj2);
                    break;
                }
                break;
            case 3:
                ((C0524d) this.f2890b).l((k6.e) obj, obj2);
                break;
            default:
                ((l6.e) this.f2890b).c((k6.e) obj, obj2);
                break;
        }
    }
}
