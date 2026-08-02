package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class yw4 extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ueo l;
    public long m;
    public int n;
    public final /* synthetic */ Object o;
    public Object p;
    public Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw4(ueo ueoVar, Continuation continuation, long j, String str, btl btlVar, String str2) {
        super(1, continuation);
        this.j = 1;
        this.l = ueoVar;
        this.m = j;
        this.o = str;
        this.p = btlVar;
        this.q = str2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new yw4(this.l, continuation, (Set) this.o, 0);
            case 1:
                return new yw4(this.l, continuation, this.m, (String) this.o, (btl) this.p, (String) this.q);
            case 2:
                return new yw4(this.m, this.l, (List) this.o, continuation);
            default:
                return new yw4(this.l, continuation, (nvl) this.o, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((yw4) create(continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0274 A[LOOP:1: B:89:0x026e->B:91:0x0274, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0282  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0264 -> B:70:0x0267). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MainDatabase mainDatabase;
        Iterator it;
        int i;
        long j;
        int i2;
        Object G;
        Iterator it2;
        q1m q1mVar;
        int i3;
        MainDatabase mainDatabase2;
        Object b;
        r4m r4mVar;
        int i4;
        int i5;
        long j2;
        q1m K;
        int i6;
        MainDatabase mainDatabase3;
        long j3;
        Object G2;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    mainDatabase = (MainDatabase) this.l;
                    it = CollectionsKt.H((Set) this.o, 950).iterator();
                    i = 0;
                    j = 0;
                    if (it.hasNext()) {
                    }
                } else if (i7 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    j = this.m;
                    i = this.n;
                    it = (Iterator) this.q;
                    mainDatabase = (MainDatabase) this.p;
                    qgg.h0(obj);
                    Object b2 = obj;
                    Iterator it3 = ((Iterable) b2).iterator();
                    long j4 = 0;
                    while (it3.hasNext()) {
                        j4 += ((rxs) it3.next()).a.e;
                    }
                    j += j4;
                    if (it.hasNext()) {
                        List list = (List) it.next();
                        uxs Q = mainDatabase.Q();
                        ysr ysrVar = new ysr("track_mview");
                        um4 um4Var = new um4(pgp.c);
                        um4Var.e("original_id", list);
                        tt0.K(ysrVar, um4Var);
                        atn a = ysrVar.a();
                        this.p = mainDatabase;
                        this.q = it;
                        this.n = i;
                        this.m = j;
                        this.k = 1;
                        b2 = Q.b(a, this);
                        if (b2 == nm6Var) {
                        }
                        Iterator it32 = ((Iterable) b2).iterator();
                        long j42 = 0;
                        while (it32.hasNext()) {
                        }
                        j += j42;
                        if (it.hasNext()) {
                            break;
                        }
                    }
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    q1m K2 = ((MainDatabase) this.l).K();
                    long j5 = this.m;
                    String str = (String) this.o;
                    i2 = 0;
                    this.n = 0;
                    this.k = 1;
                    G = up6.G(K2.a, true, false, new l1m(str, 0, j5), this);
                    if (G == nm6Var2) {
                    }
                } else if (i8 == 1) {
                    int i9 = this.n;
                    qgg.h0(obj);
                    i2 = i9;
                    G = obj;
                } else if (i8 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                btl btlVar = (btl) this.p;
                String str2 = (String) this.q;
                this.n = i2;
                this.k = 2;
                Object c = btl.c(btlVar, str2, (List) G, this);
                if (c != nm6Var2) {
                    break;
                }
                break;
            case 2:
                Object obj2 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    q1m K3 = ((MainDatabase) this.l).K();
                    it2 = ((List) this.o).iterator();
                    q1mVar = K3;
                    i3 = 0;
                } else if (i10 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    i3 = this.n;
                    it2 = (Iterator) this.q;
                    q1mVar = (q1m) this.p;
                    qgg.h0(obj);
                }
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    long j6 = this.m;
                    mqs mqsVar = (mqs) pair.a;
                    String str3 = mqsVar.a;
                    String str4 = mqsVar.d.a;
                    int intValue = ((Number) pair.b).intValue();
                    this.p = q1mVar;
                    this.q = it2;
                    this.n = i3;
                    this.k = 1;
                    Object G3 = up6.G(q1mVar.a, false, true, new p1m(intValue, str3, str4, j6), this);
                    if (G3 != nm6.a) {
                        G3 = Unit.a;
                    }
                    if (G3 == obj2) {
                        break;
                    }
                }
                break;
            default:
                nvl nvlVar = (nvl) this.o;
                nm6 nm6Var3 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    mainDatabase2 = (MainDatabase) this.l;
                    r4m I = mainDatabase2.I();
                    String str5 = nvlVar.a;
                    String str6 = nvlVar.b;
                    this.p = mainDatabase2;
                    this.q = I;
                    this.n = 0;
                    this.k = 1;
                    b = I.b(str5, str6, this);
                    if (b != nm6Var3) {
                        r4mVar = I;
                        i4 = 0;
                    }
                } else if (i11 == 1) {
                    int i12 = this.n;
                    r4m r4mVar2 = (r4m) this.q;
                    MainDatabase mainDatabase4 = (MainDatabase) this.p;
                    qgg.h0(obj);
                    r4mVar = r4mVar2;
                    i4 = i12;
                    mainDatabase2 = mainDatabase4;
                    b = obj;
                } else if (i11 == 2) {
                    j2 = this.m;
                    i5 = this.n;
                    mainDatabase2 = (MainDatabase) this.p;
                    qgg.h0(obj);
                    K = mainDatabase2.K();
                    this.p = mainDatabase2;
                    this.q = null;
                    this.n = i5;
                    this.m = j2;
                    this.k = 3;
                    if (K.b(j2, this) == nm6Var3) {
                        MainDatabase mainDatabase5 = mainDatabase2;
                        i6 = i5;
                        mainDatabase3 = mainDatabase5;
                        j3 = j2;
                        mys R = mainDatabase3.R();
                        this.p = mainDatabase3;
                        this.q = null;
                        this.n = i6;
                        this.m = j3;
                        this.k = 4;
                        G2 = up6.G(R.a, false, true, new fn1(j3, 15), this);
                        if (G2 != nm6Var3) {
                        }
                        if (G2 == nm6Var3) {
                        }
                        mainDatabase3.F("playlist", "playlist_track");
                    }
                } else if (i11 == 3) {
                    j3 = this.m;
                    int i13 = this.n;
                    MainDatabase mainDatabase6 = (MainDatabase) this.p;
                    qgg.h0(obj);
                    i6 = i13;
                    mainDatabase3 = mainDatabase6;
                    mys R2 = mainDatabase3.R();
                    this.p = mainDatabase3;
                    this.q = null;
                    this.n = i6;
                    this.m = j3;
                    this.k = 4;
                    G2 = up6.G(R2.a, false, true, new fn1(j3, 15), this);
                    if (G2 != nm6Var3) {
                        G2 = Unit.a;
                    }
                    if (G2 == nm6Var3) {
                    }
                    mainDatabase3.F("playlist", "playlist_track");
                } else if (i11 != 4) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mainDatabase3 = (MainDatabase) this.p;
                    qgg.h0(obj);
                    mainDatabase3.F("playlist", "playlist_track");
                    break;
                }
                Long l = (Long) b;
                long longValue = l != null ? l.longValue() : -1L;
                if (longValue < 0) {
                    ssg.a(5, "PlaylistUpdateHelper", "Attempt to delete an already deleted playlist: " + nvlVar, null);
                    break;
                } else {
                    this.p = mainDatabase2;
                    this.q = null;
                    this.n = i4;
                    this.m = longValue;
                    this.k = 2;
                    Object G4 = up6.G(r4mVar.a, false, true, new fn1(longValue, 14), this);
                    if (G4 != nm6Var3) {
                        G4 = Unit.a;
                    }
                    if (G4 != nm6Var3) {
                        i5 = i4;
                        j2 = longValue;
                        K = mainDatabase2.K();
                        this.p = mainDatabase2;
                        this.q = null;
                        this.n = i5;
                        this.m = j2;
                        this.k = 3;
                        if (K.b(j2, this) == nm6Var3) {
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw4(long j, ueo ueoVar, List list, Continuation continuation) {
        super(1, continuation);
        this.j = 2;
        this.l = ueoVar;
        this.o = list;
        this.m = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yw4(ueo ueoVar, Continuation continuation, Object obj, int i) {
        super(1, continuation);
        this.j = i;
        this.l = ueoVar;
        this.o = obj;
    }
}
