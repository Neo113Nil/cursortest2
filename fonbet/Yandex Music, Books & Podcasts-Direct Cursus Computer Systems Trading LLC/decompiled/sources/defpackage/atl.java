package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class atl extends aur implements Function1 {
    public int j;
    public final /* synthetic */ ueo k;
    public final /* synthetic */ b38 l;
    public final /* synthetic */ long m;
    public final /* synthetic */ btl n;
    public final /* synthetic */ String o;
    public MainDatabase p;
    public List q;
    public ArrayList r;
    public Iterator s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atl(ueo ueoVar, Continuation continuation, b38 b38Var, long j, btl btlVar, String str) {
        super(1, continuation);
        this.k = ueoVar;
        this.l = b38Var;
        this.m = j;
        this.n = btlVar;
        this.o = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new atl(this.k, continuation, this.l, this.m, this.n, this.o);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((atl) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x012a, code lost:
    
        if (kotlin.Unit.a == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x012d, code lost:
    
        if (r4 != r1) goto L29;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<pws> list;
        Iterator it;
        ArrayList arrayList;
        MainDatabase mainDatabase;
        int i;
        char c;
        boolean z;
        Object G;
        Object obj2 = nm6.a;
        int i2 = this.j;
        if (i2 == 0) {
            qgg.h0(obj);
            MainDatabase mainDatabase2 = (MainDatabase) this.k;
            b38 b38Var = this.l;
            ArrayList arrayList2 = b38Var.a;
            List j0 = CollectionsKt.j0(b38Var.b);
            ArrayList arrayList3 = new ArrayList();
            list = j0;
            it = arrayList2.iterator();
            arrayList = arrayList3;
            mainDatabase = mainDatabase2;
            i = 0;
        } else if (i2 == 1) {
            i = this.t;
            it = this.s;
            arrayList = this.r;
            list = this.q;
            mainDatabase = this.p;
            qgg.h0(obj);
        } else {
            if (i2 != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.t;
            it = this.s;
            arrayList = this.r;
            list = this.q;
            mainDatabase = this.p;
            qgg.h0(obj);
            c = 2;
            z = true;
        }
        do {
            boolean hasNext = it.hasNext();
            long j = this.m;
            btl btlVar = this.n;
            if (!hasNext) {
                for (pws pwsVar : list) {
                    mqs mqsVar = pwsVar.a;
                    arrayList.add(new hys(j, 2, pwsVar.b, mqsVar.a, btl.a(btlVar, mqsVar), null));
                }
                btlVar.b.getClass();
                p2m.a(this.o, arrayList);
                mainDatabase.F("playlist_track");
                return Unit.a;
            }
            ec4 ec4Var = (ec4) it.next();
            mqs mqsVar2 = ec4Var.d;
            mqs mqsVar3 = ec4Var.c;
            Integer num = ec4Var.b;
            int i3 = ec4Var.a;
            if (mqsVar3 == null || num == null) {
                q1m K = mainDatabase.K();
                String str = mqsVar2.a;
                String a = btl.a(btlVar, mqsVar2);
                this.p = mainDatabase;
                this.q = list;
                this.r = arrayList;
                this.s = it;
                this.t = i;
                c = 2;
                this.j = 2;
                z = true;
                Object G2 = up6.G(K.a, false, true, new p1m(i3, str, a, this.m), this);
                if (G2 != nm6.a) {
                }
            } else {
                arrayList.add(new hys(j, 2, num.intValue(), mqsVar3.a, btl.a(btlVar, mqsVar3), null));
                arrayList.add(new hys(j, 1, num.intValue(), mqsVar2.a, btl.a(btlVar, mqsVar2), null));
                q1m K2 = mainDatabase.K();
                int intValue = num.intValue();
                String str2 = mqsVar2.a;
                String a2 = btl.a(btlVar, mqsVar2);
                this.p = mainDatabase;
                this.q = list;
                this.r = arrayList;
                this.s = it;
                this.t = i;
                this.j = 1;
                G = up6.G(K2.a, false, true, new o1m(intValue, this.m, str2, a2, i3, 0), this);
                if (G != nm6.a) {
                    G = Unit.a;
                }
            }
            return obj2;
        } while (G != obj2);
        return obj2;
    }
}
