package defpackage;

import com.google.gson.Gson;
import com.yandex.music.databases.main.MainDatabase;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes4.dex */
public final class wws extends aur implements Function1 {
    public int j;
    public final /* synthetic */ MainDatabase k;
    public final /* synthetic */ v3t l;
    public final /* synthetic */ Iterable m;
    public final /* synthetic */ j20 n;
    public final /* synthetic */ f4m o;
    public final /* synthetic */ jk1 p;
    public MainDatabase q;
    public Iterator r;
    public int s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wws(MainDatabase mainDatabase, Continuation continuation, v3t v3tVar, Iterable iterable, j20 j20Var, f4m f4mVar, jk1 jk1Var) {
        super(1, continuation);
        this.k = mainDatabase;
        this.l = v3tVar;
        this.m = iterable;
        this.n = j20Var;
        this.o = f4mVar;
        this.p = jk1Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new wws(this.k, continuation, this.l, this.m, this.n, this.o, this.p);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((wws) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0228, code lost:
    
        if (r6 == r1) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x023a  */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r39v1, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r40v0 */
    /* JADX WARN: Type inference failed for: r40v1, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r40v2 */
    /* JADX WARN: Type inference failed for: r46v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r46v7 */
    /* JADX WARN: Type inference failed for: r46v8 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.util.ArrayList] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        MainDatabase mainDatabase;
        int i;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        String str4;
        String str5;
        Iterator it;
        boolean z3;
        String sb;
        MainDatabase mainDatabase2;
        Iterator it2;
        int i2;
        int i3;
        ?? r46;
        ?? c;
        Object obj2 = nm6.a;
        int i4 = this.j;
        Iterable<mqs> iterable = this.m;
        String str6 = null;
        if (i4 == 0) {
            qgg.h0(obj);
            ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
            Iterator it3 = iterable.iterator();
            while (it3.hasNext()) {
                mqs mqsVar = (mqs) it3.next();
                String str7 = mqsVar.a;
                nxs nxsVar = mqsVar.B;
                String str8 = mqsVar.b;
                String str9 = str6;
                String str10 = mqsVar.c;
                String obj3 = StringsKt.t0(str10).toString();
                String R = q7g.R(StringsKt.t0(str10).toString());
                R.getClass();
                String str11 = mqsVar.s;
                long j = mqsVar.e;
                String name = mqsVar.m.name();
                boolean z4 = mqsVar.j;
                String name2 = mqsVar.k.name();
                boolean z5 = mqsVar.G;
                List list = mqsVar.F;
                list.getClass();
                String X = CollectionsKt.X(list, StringUtils.COMMA, null, null, new hpj(16), 30);
                boolean z6 = mqsVar.n;
                hqs hqsVar = mqsVar.o;
                boolean z7 = hqsVar != null ? hqsVar.a : true;
                boolean z8 = hqsVar != null ? hqsVar.b : true;
                String str12 = mqsVar.q;
                if (str12 == null) {
                    quk qukVar = lqs.b;
                    str12 = "music";
                }
                String str13 = str12;
                String str14 = mqsVar.g;
                String str15 = mqsVar.h;
                String str16 = mqsVar.i;
                boolean z9 = mqsVar.l;
                String str17 = mqsVar.y;
                CoverPath coverPath = mqsVar.w;
                String I = coverPath != null ? men.I(coverPath) : str9;
                Map map = mqsVar.H;
                Gson gson = y85.a;
                map.getClass();
                String j2 = y85.a.j(map);
                j2.getClass();
                String str18 = mqsVar.z;
                Date date = mqsVar.x;
                if (date != null) {
                    Object obj4 = hkg.a.get();
                    obj4.getClass();
                    String format = ((SimpleDateFormat) obj4).format(date);
                    format.getClass();
                    str2 = format;
                } else {
                    str2 = str9;
                }
                ?? valueOf = nxsVar != null ? Float.valueOf(nxsVar.a) : str9;
                ?? valueOf2 = nxsVar != null ? Float.valueOf(nxsVar.b) : str9;
                boolean z10 = mqsVar.A;
                String Q = q7g.Q(mqsVar.C);
                qvs qvsVar = mqsVar.D;
                if (qvsVar == null) {
                    str3 = str18;
                    z = z10;
                    z3 = z4;
                    z2 = z6;
                    str4 = str15;
                    str5 = str11;
                    it = it3;
                    sb = str9;
                } else {
                    str3 = str18;
                    z = z10;
                    long j3 = qvsVar.a;
                    z2 = z6;
                    str4 = str15;
                    long j4 = qvsVar.b;
                    str5 = str11;
                    it = it3;
                    long j5 = qvsVar.c;
                    z3 = z4;
                    long j6 = qvsVar.d;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(j3);
                    sb2.append(StringUtils.COMMA);
                    sb2.append(j4);
                    ouj.C(sb2, StringUtils.COMMA, j5, StringUtils.COMMA);
                    sb2.append(j6);
                    sb = sb2.toString();
                }
                arrayList.add(new sus(str7, str8, obj3, R, str5, j, name, z3, name2, z5, X, z2, z7, z8, str13, str14, str4, str16, z9, str17, I, j2, str3, str2, valueOf, valueOf2, z, Q, sb, q7g.Q(mqsVar.I), q7g.Q(mqsVar.J)));
                it3 = it;
                str6 = str9;
            }
            str = str6;
            mainDatabase = this.k;
            this.q = mainDatabase;
            this.s = 0;
            this.j = 1;
            v3t v3tVar = this.l;
            Object G = up6.G(v3tVar.a, false, true, new wes(8, v3tVar, arrayList), this);
            if (G != nm6.a) {
                G = Unit.a;
            }
            if (G != obj2) {
                i = 0;
            }
            return obj2;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                i = this.s;
                mainDatabase = this.q;
                qgg.h0(obj);
                str = null;
                Iterator it4 = iterable.iterator();
                mainDatabase2 = mainDatabase;
                it2 = it4;
                i2 = i;
                i3 = 0;
                r46 = str;
                while (it2.hasNext()) {
                }
                mainDatabase2.F("track", "album_track", "artist_track");
                return Unit.a;
            }
            if (i4 != 3) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = this.t;
            i2 = this.s;
            it2 = this.r;
            mainDatabase2 = this.q;
            qgg.h0(obj);
            r46 = 0;
            while (it2.hasNext()) {
                mqs mqsVar2 = (mqs) it2.next();
                boolean k = mqsVar2.k();
                List list2 = mqsVar2.u;
                String str19 = mqsVar2.a;
                f4m f4mVar = this.o;
                if (k) {
                    List list3 = mqsVar2.f;
                    c = new ArrayList(v75.o(list3, 10));
                    int i5 = 0;
                    for (Object obj5 : list3) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            u75.n();
                            throw r46;
                        }
                        c.add(f4m.q(f4mVar, (zp2) obj5, str19, list2 != null ? (c01) CollectionsKt.S(list2, i5) : r46));
                        i5 = i6;
                    }
                } else {
                    c = t75.c(f4m.q(f4mVar, zp2.k, str19, list2 != null ? (c01) CollectionsKt.firstOrNull(list2) : r46));
                }
                this.q = mainDatabase2;
                this.r = it2;
                this.s = i2;
                this.t = i3;
                this.j = 3;
                jk1 jk1Var = this.p;
                Object G2 = up6.G(jk1Var.a, false, true, new kc(19, jk1Var, c), this);
                if (G2 != nm6.a) {
                    G2 = Unit.a;
                }
                if (G2 == obj2) {
                    return obj2;
                }
            }
            mainDatabase2.F("track", "album_track", "artist_track");
            return Unit.a;
        }
        i = this.s;
        MainDatabase mainDatabase3 = this.q;
        qgg.h0(obj);
        str = null;
        mainDatabase = mainDatabase3;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable, 10));
        for (mqs mqsVar3 : iterable) {
            k10 k10Var = mqsVar3.d;
            arrayList2.add(new l10(k10Var.a, k10Var.f, k10Var.e, k10Var.d, mqsVar3.a));
        }
        this.q = mainDatabase;
        this.s = i;
        this.j = 2;
        j20 j20Var = this.n;
        Object G3 = up6.G(j20Var.a, false, true, new kc(8, j20Var, arrayList2), this);
        if (G3 != nm6.a) {
            G3 = Unit.a;
        }
    }
}
