package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class nr3 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public Object k;
    public int l;
    public String m;
    public long n;
    public Object o;
    public Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr3(xlg xlgVar, ykf ykfVar, Continuation continuation, xlg xlgVar2, String str, long j) {
        super(2, continuation);
        this.j = 1;
        this.q = xlgVar;
        this.r = ykfVar;
        this.s = xlgVar2;
        this.m = str;
        this.n = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                nr3 nr3Var = new nr3((String) this.q, (String) this.r, (pr3) this.s, continuation);
                nr3Var.m = ((zrt) obj).a;
                return nr3Var;
            case 1:
                return new nr3((xlg) this.q, (ykf) this.r, continuation, (xlg) this.s, this.m, this.n);
            case 2:
                return new nr3((xlg) this.q, continuation, (xlg) this.r, this.m, this.n, (xlg) this.s);
            case 3:
                nr3 nr3Var2 = new nr3((mmo) this.p, continuation, (String) this.q, (mmo) this.r, (sfo) this.s, 3);
                nr3Var2.k = obj;
                return nr3Var2;
            default:
                nr3 nr3Var3 = new nr3((mmo) this.p, continuation, (mmo) this.q, (sfo) this.r, (p1t) this.s, 4);
                nr3Var3.k = obj;
                return nr3Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                String str = ((zrt) obj).a;
                nr3 nr3Var = new nr3((String) this.q, (String) this.r, (pr3) this.s, (Continuation) obj2);
                nr3Var.m = str;
                break;
        }
        return ((nr3) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02b4 A[LOOP:3: B:102:0x02ae->B:104:0x02b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02fb A[LOOP:5: B:118:0x02f5->B:120:0x02fb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03f7 A[LOOP:6: B:149:0x03f1->B:151:0x03f7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0182 A[LOOP:0: B:46:0x017c->B:48:0x0182, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d3 A[LOOP:2: B:66:0x01cd->B:68:0x01d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        nvl nvlVar;
        cvl cvlVar;
        Long l;
        long j;
        Iterator it;
        Object e;
        List list;
        cvl cvlVar2;
        cvl cvlVar3;
        Function2 function2;
        cvl cvlVar4;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        rrl rrlVar;
        rrl rrlVar2;
        cvl cvlVar5;
        cvl cvlVar6;
        Iterator it5;
        Iterator it6;
        Iterator it7;
        rrl rrlVar3;
        rrl rrlVar4;
        zzp zzpVar;
        long j2;
        String str;
        zzp zzpVar2;
        long j3;
        String str2;
        switch (this.j) {
            case 0:
                pr3 pr3Var = (pr3) this.s;
                String str3 = this.m;
                nm6 nm6Var = nm6.a;
                int i = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    nvlVar = new nvl((String) this.q, (String) this.r);
                    rtl rtlVar = pr3Var.c;
                    this.m = str3;
                    this.o = nvlVar;
                    this.l = 1;
                    obj = rtlVar.d(str3, nvlVar, true, this);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            cvlVar = (cvl) this.k;
                            qgg.h0(obj);
                            l = (Long) obj;
                            if (l != null) {
                                long longValue = l.longValue();
                                i2m i2mVar = pr3Var.d;
                                this.m = str3;
                                this.o = null;
                                this.k = cvlVar;
                                this.n = longValue;
                                this.l = 3;
                                obj = i2mVar.g(str3, longValue, this);
                                if (obj == nm6Var) {
                                    return nm6Var;
                                }
                                j = longValue;
                                List list2 = (List) obj;
                                rus rusVar = pr3Var.e;
                                List list3 = list2;
                                ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                                it = list3.iterator();
                                while (it.hasNext()) {
                                }
                                this.m = null;
                                this.o = null;
                                this.k = cvlVar;
                                this.p = list2;
                                this.n = j;
                                this.l = 4;
                                e = rusVar.e(this, str3, arrayList);
                                if (e != nm6Var) {
                                }
                            }
                            return null;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            list = (List) this.p;
                            cvlVar2 = (cvl) this.k;
                            qgg.h0(obj);
                            return new rrl(cvlVar2, list, (List) obj);
                        }
                        j = this.n;
                        cvlVar = (cvl) this.k;
                        qgg.h0(obj);
                        List list22 = (List) obj;
                        rus rusVar2 = pr3Var.e;
                        List list32 = list22;
                        ArrayList arrayList2 = new ArrayList(v75.o(list32, 10));
                        it = list32.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((t2m) it.next()).a.a);
                        }
                        this.m = null;
                        this.o = null;
                        this.k = cvlVar;
                        this.p = list22;
                        this.n = j;
                        this.l = 4;
                        e = rusVar2.e(this, str3, arrayList2);
                        if (e != nm6Var) {
                            return nm6Var;
                        }
                        list = list22;
                        obj = e;
                        cvlVar2 = cvlVar;
                        return new rrl(cvlVar2, list, (List) obj);
                    }
                    nvlVar = (nvl) this.o;
                    qgg.h0(obj);
                }
                cvl cvlVar7 = (cvl) obj;
                if (cvlVar7 != null) {
                    rtl rtlVar2 = pr3Var.c;
                    this.m = str3;
                    this.o = null;
                    this.k = cvlVar7;
                    this.l = 2;
                    Object i2 = rtlVar2.i(str3, nvlVar, this);
                    if (i2 == nm6Var) {
                        return nm6Var;
                    }
                    cvlVar = cvlVar7;
                    obj = i2;
                    l = (Long) obj;
                    if (l != null) {
                    }
                }
                return null;
            case 1:
                xlg xlgVar = (xlg) this.q;
                nm6 nm6Var2 = nm6.a;
                int i3 = this.l;
                if (i3 == 0) {
                    qgg.h0(obj);
                    rtl rtlVar3 = ((xlg) this.s).a;
                    String str4 = this.m;
                    long j4 = this.n;
                    this.o = null;
                    this.l = 1;
                    obj = rtlVar3.f(str4, j4, this);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            rrlVar = (rrl) this.p;
                            rrlVar2 = (rrl) this.o;
                            qgg.h0(obj);
                            if (!((Boolean) obj).booleanValue() || !rrlVar.b.isEmpty()) {
                            }
                            return null;
                        }
                        cvlVar3 = (cvl) this.k;
                        cvlVar4 = (cvl) this.p;
                        function2 = (Function2) this.o;
                        qgg.h0(obj);
                        List y = ((MainDatabase) obj).M().y(cvlVar3, null);
                        ArrayList arrayList3 = new ArrayList(v75.o(y, 10));
                        it2 = y.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(q7g.T((h4m) it2.next()));
                        }
                        ArrayList arrayList4 = new ArrayList();
                        it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            if (((Boolean) function2.invoke(cvlVar3, (mqs) next)).booleanValue()) {
                                arrayList4.add(next);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList(v75.o(arrayList4, 10));
                        it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            arrayList5.add(new t2m(((mqs) it4.next()).d(), null));
                        }
                        rrl rrlVar5 = new rrl(cvlVar4, arrayList5, arrayList4);
                        this.o = rrlVar5;
                        this.p = rrlVar5;
                        this.k = null;
                        this.l = 3;
                        obj = xlg.c(xlgVar, cvlVar4, this);
                        if (obj != nm6Var2) {
                            return nm6Var2;
                        }
                        rrlVar = rrlVar5;
                        rrlVar2 = rrlVar;
                        return !((Boolean) obj).booleanValue() ? rrlVar2 : rrlVar2;
                    }
                    qgg.h0(obj);
                }
                cvlVar3 = (cvl) obj;
                if (cvlVar3 != null) {
                    function2 = (ykf) this.r;
                    String str5 = xlgVar.e.c().a;
                    str5.getClass();
                    i5h i5hVar = xlgVar.f;
                    this.o = function2;
                    this.p = cvlVar3;
                    this.k = cvlVar3;
                    this.l = 2;
                    obj = i5hVar.b(str5, this);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                    cvlVar4 = cvlVar3;
                    List y2 = ((MainDatabase) obj).M().y(cvlVar3, null);
                    ArrayList arrayList32 = new ArrayList(v75.o(y2, 10));
                    it2 = y2.iterator();
                    while (it2.hasNext()) {
                    }
                    ArrayList arrayList42 = new ArrayList();
                    it3 = arrayList32.iterator();
                    while (it3.hasNext()) {
                    }
                    ArrayList arrayList52 = new ArrayList(v75.o(arrayList42, 10));
                    it4 = arrayList42.iterator();
                    while (it4.hasNext()) {
                    }
                    rrl rrlVar52 = new rrl(cvlVar4, arrayList52, arrayList42);
                    this.o = rrlVar52;
                    this.p = rrlVar52;
                    this.k = null;
                    this.l = 3;
                    obj = xlg.c(xlgVar, cvlVar4, this);
                    if (obj != nm6Var2) {
                    }
                }
                return null;
            case 2:
                xlg xlgVar2 = (xlg) this.s;
                xlg xlgVar3 = (xlg) this.q;
                nm6 nm6Var3 = nm6.a;
                int i4 = this.l;
                if (i4 == 0) {
                    qgg.h0(obj);
                    rtl rtlVar4 = ((xlg) this.r).a;
                    String str6 = this.m;
                    long j5 = this.n;
                    this.o = null;
                    this.l = 1;
                    obj = rtlVar4.f(str6, j5, this);
                    if (obj == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            rrlVar3 = (rrl) this.p;
                            rrl rrlVar6 = (rrl) this.o;
                            qgg.h0(obj);
                            rrlVar4 = rrlVar6;
                            if (!((Boolean) obj).booleanValue() || !rrlVar3.b.isEmpty()) {
                            }
                            return null;
                        }
                        cvlVar5 = (cvl) this.k;
                        cvlVar6 = (cvl) this.o;
                        qgg.h0(obj);
                        List y3 = ((MainDatabase) obj).M().y(cvlVar5, null);
                        ArrayList arrayList6 = new ArrayList(v75.o(y3, 10));
                        it5 = y3.iterator();
                        while (it5.hasNext()) {
                            arrayList6.add(q7g.T((h4m) it5.next()));
                        }
                        ArrayList arrayList7 = new ArrayList();
                        it6 = arrayList6.iterator();
                        while (it6.hasNext()) {
                            Object next2 = it6.next();
                            mqs mqsVar = (mqs) next2;
                            if (((Boolean) xlgVar2.h.invoke(cvlVar5, mqsVar)).booleanValue() && xlgVar2.g.j(mqsVar)) {
                                arrayList7.add(next2);
                            }
                        }
                        ArrayList arrayList8 = new ArrayList(v75.o(arrayList7, 10));
                        it7 = arrayList7.iterator();
                        while (it7.hasNext()) {
                            arrayList8.add(new t2m(((mqs) it7.next()).d(), null));
                        }
                        rrl rrlVar7 = new rrl(cvlVar6, arrayList8, arrayList7);
                        this.o = rrlVar7;
                        this.p = rrlVar7;
                        this.k = null;
                        this.l = 3;
                        obj = xlg.c(xlgVar3, cvlVar6, this);
                        if (obj != nm6Var3) {
                            return nm6Var3;
                        }
                        rrlVar3 = rrlVar7;
                        rrlVar4 = rrlVar3;
                        return !((Boolean) obj).booleanValue() ? rrlVar4 : rrlVar4;
                    }
                    qgg.h0(obj);
                }
                cvlVar5 = (cvl) obj;
                if (cvlVar5 != null) {
                    String str7 = xlgVar3.e.c().a;
                    str7.getClass();
                    i5h i5hVar2 = xlgVar3.f;
                    this.o = cvlVar5;
                    this.p = null;
                    this.k = cvlVar5;
                    this.l = 2;
                    obj = i5hVar2.b(str7, this);
                    if (obj == nm6Var3) {
                        return nm6Var3;
                    }
                    cvlVar6 = cvlVar5;
                    List y32 = ((MainDatabase) obj).M().y(cvlVar5, null);
                    ArrayList arrayList62 = new ArrayList(v75.o(y32, 10));
                    it5 = y32.iterator();
                    while (it5.hasNext()) {
                    }
                    ArrayList arrayList72 = new ArrayList();
                    it6 = arrayList62.iterator();
                    while (it6.hasNext()) {
                    }
                    ArrayList arrayList82 = new ArrayList(v75.o(arrayList72, 10));
                    it7 = arrayList72.iterator();
                    while (it7.hasNext()) {
                    }
                    rrl rrlVar72 = new rrl(cvlVar6, arrayList82, arrayList72);
                    this.o = rrlVar72;
                    this.p = rrlVar72;
                    this.k = null;
                    this.l = 3;
                    obj = xlg.c(xlgVar3, cvlVar6, this);
                    if (obj != nm6Var3) {
                    }
                }
                return null;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i5 = this.l;
                if (i5 == 0) {
                    qgg.h0(obj);
                    zzp zzpVar3 = (zzp) ((mmo) this.p).e;
                    long a = zzpVar3.a();
                    wmp wmpVar = new wmp(new Date(System.currentTimeMillis()), (String) this.q);
                    sml smlVar = (sml) ((mmo) this.r).b;
                    sfo sfoVar = (sfo) this.s;
                    String str8 = sfoVar.a;
                    s9p s9pVar = sfoVar.b;
                    this.k = null;
                    this.m = "sessionStartedAwaitTimeMs";
                    this.o = zzpVar3;
                    this.n = a;
                    this.l = 1;
                    if (smlVar.C(str8, s9pVar, wmpVar, this) == nm6Var4) {
                        return nm6Var4;
                    }
                    zzpVar = zzpVar3;
                    j2 = a;
                    str = "sessionStartedAwaitTimeMs";
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = this.n;
                    zzpVar = (zzp) this.o;
                    str = this.m;
                    qgg.h0(obj);
                }
                return new w7c(str, zzpVar.a() - j2);
            default:
                nm6 nm6Var5 = nm6.a;
                int i6 = this.l;
                if (i6 == 0) {
                    qgg.h0(obj);
                    zzp zzpVar4 = (zzp) ((mmo) this.p).e;
                    long a2 = zzpVar4.a();
                    sml smlVar2 = (sml) ((mmo) this.q).b;
                    sfo sfoVar2 = (sfo) this.r;
                    String str9 = sfoVar2.a;
                    s9p s9pVar2 = sfoVar2.b;
                    p1t p1tVar = (p1t) this.s;
                    this.k = null;
                    this.m = "startedAwaitTimeMs";
                    this.o = zzpVar4;
                    this.n = a2;
                    this.l = 1;
                    if (smlVar2.C(str9, s9pVar2, p1tVar, this) == nm6Var5) {
                        return nm6Var5;
                    }
                    zzpVar2 = zzpVar4;
                    j3 = a2;
                    str2 = "startedAwaitTimeMs";
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j3 = this.n;
                    zzpVar2 = (zzp) this.o;
                    str2 = this.m;
                    qgg.h0(obj);
                }
                return new w7c(str2, zzpVar2.a() - j3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr3(xlg xlgVar, Continuation continuation, xlg xlgVar2, String str, long j, xlg xlgVar3) {
        super(2, continuation);
        this.j = 2;
        this.r = xlgVar2;
        this.n = j;
        this.s = xlgVar3;
        this.q = xlgVar;
        this.m = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nr3(mmo mmoVar, Continuation continuation, Object obj, Object obj2, Object obj3, int i) {
        super(2, continuation);
        this.j = i;
        this.p = mmoVar;
        this.q = obj;
        this.r = obj2;
        this.s = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr3(String str, String str2, pr3 pr3Var, Continuation continuation) {
        super(2, continuation);
        this.j = 0;
        this.q = str;
        this.r = str2;
        this.s = pr3Var;
    }
}
