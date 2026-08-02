package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class s1m extends aur implements Function1 {
    public int j;
    public final /* synthetic */ ueo k;
    public final /* synthetic */ Integer l;
    public final /* synthetic */ long m;
    public final /* synthetic */ List n;
    public final /* synthetic */ i2m o;
    public final /* synthetic */ String p;
    public MainDatabase q;
    public ArrayList r;
    public int s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1m(ueo ueoVar, Continuation continuation, Integer num, long j, List list, i2m i2mVar, String str) {
        super(1, continuation);
        this.k = ueoVar;
        this.l = num;
        this.m = j;
        this.n = list;
        this.o = i2mVar;
        this.p = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new s1m(this.k, continuation, this.l, this.m, this.n, this.o, this.p);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((s1m) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e1, code lost:
    
        if (defpackage.i2m.i(r4, r17.m, r2, false, r17) != r6) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object G;
        MainDatabase mainDatabase;
        int i;
        final int intValue;
        Object G2;
        int i2;
        MainDatabase mainDatabase2;
        ArrayList arrayList;
        nm6 nm6Var = nm6.a;
        int i3 = this.j;
        final long j = this.m;
        if (i3 == 0) {
            qgg.h0(obj);
            MainDatabase mainDatabase3 = (MainDatabase) this.k;
            Integer num = this.l;
            if (num == null) {
                q1m K = mainDatabase3.K();
                this.q = mainDatabase3;
                this.s = 0;
                this.j = 1;
                G = up6.G(K.a, true, false, new fn1(j, 10), this);
                if (G != nm6Var) {
                    mainDatabase = mainDatabase3;
                    i = 0;
                }
                return nm6Var;
            }
            intValue = num.intValue();
            mainDatabase = mainDatabase3;
            i = 0;
            List list = this.n;
            ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
            int i4 = 0;
            for (Object obj2 : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    u75.n();
                    throw null;
                }
                arrayList2.add(q5g.M((t2m) obj2, i4 + intValue, j));
                i4 = i5;
            }
            q1m K2 = mainDatabase.K();
            final int size = arrayList2.size();
            this.q = mainDatabase;
            this.r = arrayList2;
            this.s = i;
            this.t = intValue;
            this.j = 2;
            G2 = up6.G(K2.a, false, true, new Function1() { // from class: m1m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    int i6 = size;
                    long j2 = j;
                    int i7 = intValue;
                    xjo xjoVar = (xjo) obj3;
                    xjoVar.getClass();
                    cko D0 = xjoVar.D0("UPDATE playlist_track SET position = position + ? WHERE playlist_id = ? AND position >= ?");
                    try {
                        D0.bindLong(1, i6);
                        D0.bindLong(2, j2);
                        D0.bindLong(3, i7);
                        D0.q();
                        D0.close();
                        return Unit.a;
                    } catch (Throwable th) {
                        D0.close();
                        throw th;
                    }
                }
            }, this);
            if (G2 != nm6.a) {
                G2 = Unit.a;
            }
            if (G2 != nm6Var) {
                i2 = i;
                mainDatabase2 = mainDatabase;
                arrayList = arrayList2;
                this.q = null;
                this.r = null;
                this.s = i2;
                this.t = intValue;
                this.j = 3;
            }
            return nm6Var;
        }
        if (i3 == 1) {
            int i6 = this.s;
            MainDatabase mainDatabase4 = this.q;
            qgg.h0(obj);
            mainDatabase = mainDatabase4;
            i = i6;
            G = obj;
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            intValue = this.t;
            i2 = this.s;
            arrayList = this.r;
            mainDatabase2 = this.q;
            qgg.h0(obj);
            this.q = null;
            this.r = null;
            this.s = i2;
            this.t = intValue;
            this.j = 3;
        }
        intValue = ((Number) G).intValue() + 1;
        List list2 = this.n;
        ArrayList arrayList22 = new ArrayList(v75.o(list2, 10));
        int i42 = 0;
        while (r12.hasNext()) {
        }
        q1m K22 = mainDatabase.K();
        final int size2 = arrayList22.size();
        this.q = mainDatabase;
        this.r = arrayList22;
        this.s = i;
        this.t = intValue;
        this.j = 2;
        G2 = up6.G(K22.a, false, true, new Function1() { // from class: m1m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                int i62 = size2;
                long j2 = j;
                int i7 = intValue;
                xjo xjoVar = (xjo) obj3;
                xjoVar.getClass();
                cko D0 = xjoVar.D0("UPDATE playlist_track SET position = position + ? WHERE playlist_id = ? AND position >= ?");
                try {
                    D0.bindLong(1, i62);
                    D0.bindLong(2, j2);
                    D0.bindLong(3, i7);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } catch (Throwable th) {
                    D0.close();
                    throw th;
                }
            }
        }, this);
        if (G2 != nm6.a) {
        }
        if (G2 != nm6Var) {
        }
        return nm6Var;
    }
}
