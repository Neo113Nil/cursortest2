package b7;

import f7.C4513a;
import g7.t;
import g7.u;
import h7.C4575a;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import m7.C4741a;
import o7.C4810i;
import q7.C4933b;
import q7.C4937f;
import q7.C4938g;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5457b;

    public /* synthetic */ n(int i, Object obj) {
        this.f5456a = i;
        this.f5457b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f5456a) {
            case 0:
                Y6.a aVar = (Y6.a) obj;
                o oVar = (o) this.f5457b;
                oVar.f5462w.apply(aVar);
                C4513a c4513a = C4513a.f37531a;
                boolean z3 = l.f5451c;
                C0528h c0528h = oVar.f5459n;
                return z3 ? new C0525e(c0528h, aVar, c4513a) : new l(c0528h, aVar, c4513a);
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() != null) {
                    throw new ClassCastException();
                }
                if (entry.getKey() != null) {
                    throw new ClassCastException();
                }
                if (entry.getValue() == null) {
                    return new C4741a(new C4810i(new ArrayList((ArrayList) this.f5457b)));
                }
                throw new ClassCastException();
            case 2:
                Y6.a aVar2 = (Y6.a) obj;
                u uVar = (u) this.f5457b;
                uVar.getClass();
                uVar.f37702z.apply(aVar2);
                return new t(uVar.f37699w, aVar2, uVar.f37697u, C4575a.f38024a);
            default:
                ((C4938g) this.f5457b).f40265v.apply((Y6.a) obj);
                return C4937f.f40261a ? new C4933b() : new C4937f();
        }
    }
}
