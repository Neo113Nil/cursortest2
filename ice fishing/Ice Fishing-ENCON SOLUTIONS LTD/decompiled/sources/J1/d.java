package J1;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f841f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f842g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f843h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, Object obj, Object obj2, int i2) {
        super(0);
        this.f840e = i2;
        this.f841f = eVar;
        this.f842g = obj;
        this.f843h = obj2;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        switch (this.f840e) {
            case 0:
                R1.l lVar = this.f841f.f846b;
                List list = (List) this.f842g;
                List f2 = lVar == null ? null : lVar.f((String) this.f843h, list);
                if (f2 != null) {
                    list = f2;
                }
                ArrayList arrayList = new ArrayList(i1.k.E(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((X509Certificate) ((Certificate) it.next()));
                }
                return arrayList;
            default:
                R1.l lVar2 = this.f841f.f846b;
                kotlin.jvm.internal.i.b(lVar2);
                return lVar2.f(((C0050a) this.f843h).f820h.f907d, ((k) this.f842g).a());
        }
    }
}
