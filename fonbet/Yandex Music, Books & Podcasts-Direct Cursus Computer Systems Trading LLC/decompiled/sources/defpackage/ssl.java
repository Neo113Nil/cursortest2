package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class ssl extends aur implements Function2 {
    public final /* synthetic */ int j;
    public long k;
    public int l;
    public int m;
    public int n;
    public final /* synthetic */ btl o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ssl(btl btlVar, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.o = btlVar;
        this.p = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ssl(this.o, this.p, continuation, 0);
            default:
                return new ssl(this.o, this.p, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((ssl) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a9, code lost:
    
        if (r12 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0128, code lost:
    
        if (r12 == r0) goto L35;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        int i;
        int i2;
        long j2;
        int i3;
        int i4 = 0;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i5 = this.n;
                if (i5 == 0) {
                    qgg.h0(obj);
                    btl btlVar = this.o;
                    j = this.p;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(frt.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str = ((frt) qdcVar.C(I)).c().a;
                    str.getClass();
                    i5h e = btlVar.e();
                    this.k = j;
                    this.l = 0;
                    this.m = 0;
                    this.n = 1;
                    obj = e.b(str, this);
                    if (obj != nm6Var) {
                        i = 0;
                        i2 = 0;
                    }
                    return nm6Var;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    List<j2m> o0 = CollectionsKt.o0((List) obj, new ehf(24));
                    ArrayList arrayList = new ArrayList(v75.o(o0, 10));
                    for (j2m j2mVar : o0) {
                        String str2 = j2mVar.c;
                        String str3 = j2mVar.d;
                        tfs tfsVar = wc7.a;
                        Date b = wc7.a.b(j2mVar.e);
                        b.getClass();
                        arrayList.add(new t2m(str2, str3, b));
                    }
                    return arrayList;
                }
                i = this.m;
                i2 = this.l;
                j = this.k;
                qgg.h0(obj);
                q1m K = ((MainDatabase) obj).K();
                this.l = i2;
                this.m = i;
                this.n = 2;
                obj = up6.G(K.a, true, false, new fn1(j, 13), this);
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i6 = this.n;
                if (i6 == 0) {
                    qgg.h0(obj);
                    btl btlVar2 = this.o;
                    j2 = this.p;
                    l18 l18Var2 = l18.b;
                    bdt I2 = hag.I(frt.class);
                    qdc qdcVar2 = l18Var2.a;
                    qdcVar2.getClass();
                    String str4 = ((frt) qdcVar2.C(I2)).c().a;
                    str4.getClass();
                    i5h e2 = btlVar2.e();
                    this.k = j2;
                    this.l = 0;
                    this.m = 0;
                    this.n = 1;
                    obj = e2.b(str4, this);
                    if (obj != nm6Var2) {
                        i3 = 0;
                    }
                    return nm6Var2;
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    qwl qwlVar = (qwl) CollectionsKt.firstOrNull((List) obj);
                    if (qwlVar != null) {
                        return ezf.W(qwlVar);
                    }
                    return null;
                }
                int i7 = this.m;
                int i8 = this.l;
                j2 = this.k;
                qgg.h0(obj);
                i4 = i8;
                i3 = i7;
                swl J = ((MainDatabase) obj).J();
                ysr ysrVar = new ysr("playlist_mview");
                um4 um4Var = new um4(pgp.a);
                um4Var.b("_id", String.valueOf(j2));
                um4Var.g("sync", u75.h(String.valueOf(2), String.valueOf(4)));
                tt0.K(ysrVar, um4Var);
                atn a = ysrVar.a();
                this.l = i4;
                this.m = i3;
                this.n = 2;
                obj = J.a(a, this);
                break;
        }
    }
}
