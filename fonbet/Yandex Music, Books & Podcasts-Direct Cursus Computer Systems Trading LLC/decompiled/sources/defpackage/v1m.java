package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class v1m extends aur implements Function1 {
    public int j;
    public final /* synthetic */ ueo k;
    public final /* synthetic */ List l;
    public MainDatabase m;
    public q1m n;
    public List o;
    public Iterator p;
    public j2m q;
    public int r;
    public long s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1m(ueo ueoVar, Continuation continuation, List list) {
        super(1, continuation);
        this.k = ueoVar;
        this.l = list;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new v1m(this.k, continuation, this.l);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((v1m) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a6, code lost:
    
        if (r3 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0118  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00ae -> B:8:0x0076). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0111 -> B:7:0x0115). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        MainDatabase mainDatabase;
        int i;
        q1m q1mVar;
        List list;
        MainDatabase mainDatabase2;
        j2m j2mVar;
        q1m q1mVar2;
        List list2;
        Iterator it2;
        long j;
        Object G;
        long j2;
        Object obj2;
        nm6 nm6Var = nm6.a;
        int i2 = this.j;
        int i3 = 2;
        if (i2 == 0) {
            qgg.h0(obj);
            MainDatabase mainDatabase3 = (MainDatabase) this.k;
            q1m K = mainDatabase3.K();
            ArrayList arrayList = new ArrayList();
            it = this.l.iterator();
            mainDatabase = mainDatabase3;
            i = 0;
            q1mVar = K;
            list = arrayList;
            if (it.hasNext()) {
            }
        } else if (i2 == 1) {
            j2 = this.s;
            i = this.r;
            it = this.p;
            list = this.o;
            q1mVar = this.n;
            mainDatabase = this.m;
            qgg.h0(obj);
            obj2 = obj;
            j2m j2mVar2 = (j2m) obj2;
            if (j2mVar2 != null) {
                list.add(j2mVar2);
                this.m = mainDatabase;
                this.n = q1mVar;
                this.o = list;
                this.p = it;
                this.q = j2mVar2;
                this.r = i;
                this.s = j2;
                this.j = i3;
                Object G2 = up6.G(q1mVar.a, false, true, new fn1(j2, 8), this);
                if (G2 != nm6.a) {
                    G2 = Unit.a;
                }
                if (G2 != nm6Var) {
                    List list3 = list;
                    j2mVar = j2mVar2;
                    j = j2;
                    list2 = list3;
                    it2 = it;
                    q1mVar2 = q1mVar;
                    mainDatabase2 = mainDatabase;
                    long j3 = j2mVar.b;
                    int i4 = j2mVar.f;
                    this.m = mainDatabase2;
                    this.n = q1mVar2;
                    this.o = list2;
                    this.p = it2;
                    this.q = null;
                    this.r = i;
                    this.s = j;
                    this.j = 3;
                    G = up6.G(q1mVar2.a, false, true, new n1m(j3, i4), this);
                    if (G != nm6.a) {
                    }
                    if (G != nm6Var) {
                    }
                }
                return nm6Var;
            }
            if (it.hasNext()) {
            }
        } else {
            if (i2 == 2) {
                long j4 = this.s;
                i = this.r;
                j2m j2mVar3 = this.q;
                Iterator it3 = this.p;
                List list4 = this.o;
                q1m q1mVar3 = this.n;
                mainDatabase2 = this.m;
                qgg.h0(obj);
                j = j4;
                it2 = it3;
                list2 = list4;
                j2mVar = j2mVar3;
                q1mVar2 = q1mVar3;
                long j32 = j2mVar.b;
                int i42 = j2mVar.f;
                this.m = mainDatabase2;
                this.n = q1mVar2;
                this.o = list2;
                this.p = it2;
                this.q = null;
                this.r = i;
                this.s = j;
                this.j = 3;
                G = up6.G(q1mVar2.a, false, true, new n1m(j32, i42), this);
                if (G != nm6.a) {
                    G = Unit.a;
                }
                if (G != nm6Var) {
                    mainDatabase = mainDatabase2;
                    list = list2;
                    q1mVar = q1mVar2;
                    it = it2;
                    i3 = 2;
                    if (it.hasNext()) {
                    }
                }
                return nm6Var;
            }
            if (i2 != 3) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.r;
            Iterator it4 = this.p;
            List list5 = this.o;
            q1m q1mVar4 = this.n;
            MainDatabase mainDatabase4 = this.m;
            qgg.h0(obj);
            mainDatabase = mainDatabase4;
            q1mVar = q1mVar4;
            it = it4;
            list = list5;
            i3 = 2;
            if (it.hasNext()) {
                mainDatabase.F("playlist_track");
                List<j2m> list6 = list;
                ArrayList arrayList2 = new ArrayList(v75.o(list6, 10));
                for (j2m j2mVar4 : list6) {
                    long j5 = j2mVar4.a;
                    long j6 = j2mVar4.b;
                    String str = j2mVar4.c;
                    String str2 = j2mVar4.d;
                    int i5 = j2mVar4.f;
                    tfs tfsVar = wc7.a;
                    arrayList2.add(new i1m(j5, j6, str, str2, i5, wc7.a.b(j2mVar4.e)));
                }
                return arrayList2;
            }
            j2 = ((Number) it.next()).longValue();
            this.m = mainDatabase;
            this.n = q1mVar;
            this.o = list;
            this.p = it;
            this.q = null;
            this.r = i;
            this.s = j2;
            this.j = 1;
            obj2 = up6.G(q1mVar.a, true, false, new fn1(j2, 9), this);
        }
    }
}
