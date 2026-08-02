package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class zs extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ueo l;
    public final /* synthetic */ Iterable m;
    public MainDatabase n;
    public Collection o;
    public Iterator p;
    public int q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zs(ueo ueoVar, Continuation continuation, Iterable iterable, int i) {
        super(1, continuation);
        this.j = i;
        this.l = ueoVar;
        this.m = iterable;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new zs(this.l, continuation, this.m, 0);
            default:
                return new zs(this.l, continuation, this.m, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((zs) create(continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0180  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00eb -> B:7:0x00ee). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0177 -> B:25:0x017a). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MainDatabase mainDatabase;
        int i;
        Collection linkedHashSet;
        Iterator it;
        int i2;
        MainDatabase mainDatabase2;
        int i3;
        Collection linkedHashSet2;
        Iterator it2;
        int i4;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    MainDatabase mainDatabase3 = (MainDatabase) this.l;
                    ArrayList H = CollectionsKt.H(this.m, 950);
                    mainDatabase = mainDatabase3;
                    i = 0;
                    linkedHashSet = new LinkedHashSet();
                    it = H.iterator();
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.r;
                    i2 = this.q;
                    it = this.p;
                    linkedHashSet = this.o;
                    mainDatabase = this.n;
                    qgg.h0(obj);
                    Object b = obj;
                    z75.t(linkedHashSet, (Iterable) b);
                    if (it.hasNext()) {
                        List list = (List) it.next();
                        cw w = mainDatabase.w();
                        ysr ysrVar = new ysr("album_mview");
                        um4 um4Var = new um4(pgp.c);
                        um4Var.e("original_id", list);
                        tt0.K(ysrVar, um4Var);
                        atn a = ysrVar.a();
                        this.n = mainDatabase;
                        this.o = linkedHashSet;
                        this.p = it;
                        this.q = i2;
                        this.r = i;
                        this.k = 1;
                        b = w.b(a, this);
                        if (b == nm6Var) {
                            return nm6Var;
                        }
                        z75.t(linkedHashSet, (Iterable) b);
                        if (it.hasNext()) {
                            return linkedHashSet;
                        }
                    }
                }
            default:
                nm6 nm6Var2 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    MainDatabase mainDatabase4 = (MainDatabase) this.l;
                    ArrayList H2 = CollectionsKt.H(this.m, 950);
                    mainDatabase2 = mainDatabase4;
                    i3 = 0;
                    linkedHashSet2 = new LinkedHashSet();
                    it2 = H2.iterator();
                    i4 = 0;
                    if (it2.hasNext()) {
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = this.r;
                    i4 = this.q;
                    it2 = this.p;
                    linkedHashSet2 = this.o;
                    mainDatabase2 = this.n;
                    qgg.h0(obj);
                    boolean z = true;
                    Object a2 = obj;
                    z75.t(linkedHashSet2, (Iterable) a2);
                    if (it2.hasNext()) {
                        List list2 = (List) it2.next();
                        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(((nvl) it3.next()).d());
                        }
                        swl J = mainDatabase2.J();
                        ysr ysrVar2 = new ysr("playlist_mview");
                        um4 um4Var2 = new um4(pgp.a);
                        um4Var2.i(hrg.q("(uid || ':' || original_id) IN (", CollectionsKt.X(arrayList, StringUtils.COMMA, null, null, h01.u, 30), ")"), xz0.X(new Object[0]));
                        um4Var2.g("sync", u75.h(String.valueOf(2), String.valueOf(4)));
                        tt0.K(ysrVar2, um4Var2);
                        atn a3 = ysrVar2.a();
                        this.n = mainDatabase2;
                        this.o = linkedHashSet2;
                        this.p = it2;
                        this.q = i4;
                        this.r = i3;
                        z = true;
                        this.k = 1;
                        a2 = J.a(a3, this);
                        if (a2 == nm6Var2) {
                            return nm6Var2;
                        }
                        z75.t(linkedHashSet2, (Iterable) a2);
                        if (it2.hasNext()) {
                            return linkedHashSet2;
                        }
                    }
                }
        }
    }
}
