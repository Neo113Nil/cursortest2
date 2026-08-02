package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class jlg extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlg(ueo ueoVar, Continuation continuation, long j) {
        super(1, continuation);
        this.j = 2;
        this.l = ueoVar;
        this.m = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new jlg((klg) this.l, this.m, continuation, 0);
            case 1:
                return new jlg((klg) this.l, this.m, continuation, 1);
            default:
                return new jlg((ueo) this.l, continuation, this.m);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((jlg) create(continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (r2 == r1) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [nm6] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object V;
        Object G;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                klg klgVar = (klg) this.l;
                long j = this.m;
                this.k = 1;
                jyr jyrVar = i2q.e;
                if (lsq.v()) {
                    l18 l18Var = l18.b;
                    bdt I = hag.I(frt.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    ((frt) qdcVar.C(I)).c().a.getClass();
                    xlg a = klgVar.a();
                    V = x97.V(dm6.b, new f84(a, a.h, j, (Continuation) null, 3), this);
                    if (V != nm6Var) {
                        V = (rrl) V;
                    }
                } else {
                    V = x97.V(dm6.a, new z62(j, klgVar, klgVar.g, null, 1), this);
                }
                return V == nm6Var ? nm6Var : V;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                klg klgVar2 = (klg) this.l;
                long j2 = this.m;
                this.k = 1;
                Object V2 = x97.V(dm6.a, new z62(null, klgVar2, j2, klgVar2), this);
                return V2 == nm6Var2 ? nm6Var2 : V2;
            default:
                Object obj2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    q1m K = ((MainDatabase) ((ueo) this.l)).K();
                    long j3 = this.m;
                    this.k = 1;
                    G = up6.G(K.a, true, true, new fn1(j3, 12), this);
                    break;
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    G = obj;
                }
                Iterable<j2m> iterable = (Iterable) G;
                obj2 = new ArrayList(v75.o(iterable, 10));
                for (j2m j2mVar : iterable) {
                    String str = j2mVar.c;
                    String str2 = j2mVar.d;
                    tfs tfsVar = wc7.a;
                    obj2.add(new t2m(str, str2, wc7.a.b(j2mVar.e)));
                }
                return obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jlg(klg klgVar, long j, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.l = klgVar;
        this.m = j;
    }
}
