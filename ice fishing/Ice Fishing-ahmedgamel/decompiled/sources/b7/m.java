package b7;

import f7.C4523a;
import g7.t;
import g7.u;
import h7.C4580a;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import m7.C4755a;
import o7.C4814i;
import q7.C4882b;
import q7.C4886f;
import q7.C4887g;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5605b;

    public /* synthetic */ m(int i, Object obj) {
        this.f5604a = i;
        this.f5605b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f5604a) {
            case 0:
                Y6.a aVar = (Y6.a) obj;
                n nVar = (n) this.f5605b;
                nVar.f5610w.apply(aVar);
                C4523a c4523a = C4523a.f37493a;
                boolean z6 = l.f5601c;
                C0536h c0536h = nVar.f5607n;
                return z6 ? new C0533e(c0536h, aVar, c4523a) : new l(c0536h, aVar, c4523a);
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() != null) {
                    throw new ClassCastException();
                }
                if (entry.getKey() != null) {
                    throw new ClassCastException();
                }
                if (entry.getValue() == null) {
                    return new C4755a(new C4814i(new ArrayList((ArrayList) this.f5605b)));
                }
                throw new ClassCastException();
            case 2:
                Y6.a aVar2 = (Y6.a) obj;
                u uVar = (u) this.f5605b;
                uVar.getClass();
                uVar.f37727z.apply(aVar2);
                return new t(uVar.f37724w, aVar2, uVar.f37722u, C4580a.f38141a);
            default:
                ((C4887g) this.f5605b).f40079v.apply((Y6.a) obj);
                return C4886f.f40075a ? new C4882b() : new C4886f();
        }
    }
}
