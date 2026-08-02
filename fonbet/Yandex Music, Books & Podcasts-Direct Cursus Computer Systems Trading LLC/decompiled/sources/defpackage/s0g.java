package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class s0g extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ueo l;
    public final /* synthetic */ List m;
    public final /* synthetic */ e1g n;
    public q4g o;
    public Iterator p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0g(ueo ueoVar, Continuation continuation, List list, e1g e1gVar, int i) {
        super(1, continuation);
        this.j = i;
        this.l = ueoVar;
        this.m = list;
        this.n = e1gVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new s0g(this.l, continuation, this.m, this.n, 0);
            case 1:
                return new s0g(this.l, continuation, this.m, this.n, 1);
            case 2:
                return new s0g(this.l, continuation, this.m, this.n, 2);
            default:
                return new s0g(this.l, continuation, this.m, this.n, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((s0g) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        q4g D;
        Iterator it;
        int i;
        q4g D2;
        Iterator it2;
        int i2;
        q4g D3;
        Iterator it3;
        int i3;
        q4g D4;
        Iterator it4;
        int i4;
        switch (this.j) {
            case 0:
                Object obj2 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    D = ((MainDatabase) this.l).D();
                    it = this.m.iterator();
                    i = 0;
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    i = this.q;
                    it = this.p;
                    D = this.o;
                    qgg.h0(obj);
                }
                while (it.hasNext()) {
                    m0g m0gVar = (m0g) it.next();
                    String str = m0gVar.b;
                    int m = e1g.m(m0gVar.a);
                    this.o = D;
                    this.p = it;
                    this.q = i;
                    this.k = 1;
                    Object G = up6.G(D.a, false, true, new x20(str, m, 3), this);
                    if (G != nm6.a) {
                        G = Unit.a;
                    }
                    if (G == obj2) {
                        break;
                    }
                }
                break;
            case 1:
                Object obj3 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    D2 = ((MainDatabase) this.l).D();
                    it2 = this.m.iterator();
                    i2 = 0;
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    i2 = this.q;
                    it2 = this.p;
                    D2 = this.o;
                    qgg.h0(obj);
                }
                while (it2.hasNext()) {
                    n0g n0gVar = (n0g) it2.next();
                    String str2 = n0gVar.b;
                    int m2 = e1g.m(n0gVar.a);
                    this.o = D2;
                    this.p = it2;
                    this.q = i2;
                    this.k = 1;
                    Object G2 = up6.G(D2.a, false, true, new x20(str2, m2, 4), this);
                    if (G2 != nm6.a) {
                        G2 = Unit.a;
                    }
                    if (G2 == obj3) {
                        break;
                    }
                }
                break;
            case 2:
                Object obj4 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    D3 = ((MainDatabase) this.l).D();
                    it3 = this.m.iterator();
                    i3 = 0;
                } else if (i7 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    i3 = this.q;
                    it3 = this.p;
                    D3 = this.o;
                    qgg.h0(obj);
                }
                while (it3.hasNext()) {
                    o0g o0gVar = (o0g) it3.next();
                    String d = o0gVar.b.d();
                    int m3 = e1g.m(o0gVar.a);
                    this.o = D3;
                    this.p = it3;
                    this.q = i3;
                    this.k = 1;
                    Object G3 = up6.G(D3.a, false, true, new x20(d, m3, 1), this);
                    if (G3 != nm6.a) {
                        G3 = Unit.a;
                    }
                    if (G3 == obj4) {
                        break;
                    }
                }
                break;
            default:
                Object obj5 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    D4 = ((MainDatabase) this.l).D();
                    it4 = this.m.iterator();
                    i4 = 0;
                } else if (i8 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    i4 = this.q;
                    it4 = this.p;
                    D4 = this.o;
                    qgg.h0(obj);
                }
                while (it4.hasNext()) {
                    p0g p0gVar = (p0g) it4.next();
                    String str3 = p0gVar.b;
                    int m4 = e1g.m(p0gVar.a);
                    this.o = D4;
                    this.p = it4;
                    this.q = i4;
                    this.k = 1;
                    Object G4 = up6.G(D4.a, false, true, new x20(str3, m4, 2), this);
                    if (G4 != nm6.a) {
                        G4 = Unit.a;
                    }
                    if (G4 == obj5) {
                        break;
                    }
                }
                break;
        }
        return Unit.a;
    }
}
