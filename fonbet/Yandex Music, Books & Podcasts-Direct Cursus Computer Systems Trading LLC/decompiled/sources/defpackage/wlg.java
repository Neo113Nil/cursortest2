package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class wlg extends aur implements Function1 {
    public final /* synthetic */ int j = 3;
    public int k;
    public final /* synthetic */ ueo l;
    public final /* synthetic */ String m;
    public long n;
    public int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public Object r;
    public Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wlg(ueo ueoVar, Continuation continuation, xlg xlgVar, String str, long j, List list, List list2, ArrayList arrayList) {
        super(1, continuation);
        this.l = ueoVar;
        this.p = xlgVar;
        this.m = str;
        this.n = j;
        this.q = list;
        this.r = list2;
        this.s = arrayList;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new wlg(this.l, continuation, (xlg) this.p, this.m, this.n, (List) this.q, (List) this.r, (ArrayList) this.s);
            case 1:
                return new wlg(this.l, continuation, (gs4) this.p, this.m, (mqs) this.q, this.n);
            case 2:
                return new wlg(this.l, continuation, (gs4) this.p, this.m, this.n, (String) this.q, (Long) this.r);
            default:
                return new wlg(this.l, continuation, (b4m) this.p, this.m, (cvl) this.r, (List) this.q);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((wlg) create(continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        uys uysVar;
        ArrayList arrayList;
        Object b;
        int i3;
        Object f;
        gs4 gs4Var;
        String str;
        int i4;
        Object e;
        long longValue;
        String str2;
        Long l;
        int i5;
        Object j;
        MainDatabase mainDatabase;
        MainDatabase mainDatabase2;
        Object a;
        MainDatabase mainDatabase3;
        int i6;
        long j2;
        wlg wlgVar = this;
        switch (wlgVar.j) {
            case 0:
                xlg xlgVar = (xlg) wlgVar.p;
                i2m i2mVar = xlgVar.b;
                nm6 nm6Var = nm6.a;
                int i7 = wlgVar.k;
                String str3 = wlgVar.m;
                if (i7 == 0) {
                    qgg.h0(obj);
                    long j3 = wlgVar.n;
                    List list = (List) wlgVar.q;
                    i = 0;
                    wlgVar.o = 0;
                    wlgVar.k = 1;
                    if (i2mVar.l(wlgVar.m, j3, list, wlgVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            i2 = wlgVar.o;
                            qgg.h0(obj);
                            uysVar = xlgVar.c;
                            arrayList = (ArrayList) wlgVar.s;
                            wlgVar.o = i2;
                            wlgVar.k = 3;
                            if (uysVar.b(wlgVar, str3, arrayList) == nm6Var) {
                                return nm6Var;
                            }
                            i5h i5hVar = xlgVar.f;
                            wlgVar.o = i2;
                            wlgVar.k = 4;
                            b = i5hVar.b(str3, wlgVar);
                            if (b == nm6Var) {
                            }
                            ((MainDatabase) b).F("playlist_track");
                            return Unit.a;
                        }
                        if (i7 != 3) {
                            if (i7 != 4) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            b = obj;
                            ((MainDatabase) b).F("playlist_track");
                            return Unit.a;
                        }
                        i2 = wlgVar.o;
                        qgg.h0(obj);
                        i5h i5hVar2 = xlgVar.f;
                        wlgVar.o = i2;
                        wlgVar.k = 4;
                        b = i5hVar2.b(str3, wlgVar);
                        if (b == nm6Var) {
                            return nm6Var;
                        }
                        ((MainDatabase) b).F("playlist_track");
                        return Unit.a;
                    }
                    int i8 = wlgVar.o;
                    qgg.h0(obj);
                    i = i8;
                }
                long j4 = wlgVar.n;
                List list2 = (List) wlgVar.r;
                wlgVar.o = i;
                wlgVar.k = 2;
                if (i2mVar.c(wlgVar.m, j4, list2, wlgVar) == nm6Var) {
                    return nm6Var;
                }
                i2 = i;
                uysVar = xlgVar.c;
                arrayList = (ArrayList) wlgVar.s;
                wlgVar.o = i2;
                wlgVar.k = 3;
                if (uysVar.b(wlgVar, str3, arrayList) == nm6Var) {
                }
                i5h i5hVar22 = xlgVar.f;
                wlgVar.o = i2;
                wlgVar.k = 4;
                b = i5hVar22.b(str3, wlgVar);
                if (b == nm6Var) {
                }
                ((MainDatabase) b).F("playlist_track");
                return Unit.a;
            case 1:
                long j5 = wlgVar.n;
                mqs mqsVar = (mqs) wlgVar.q;
                gs4 gs4Var2 = (gs4) wlgVar.p;
                nm6 nm6Var2 = nm6.a;
                int i9 = wlgVar.k;
                String str4 = wlgVar.m;
                if (i9 == 0) {
                    qgg.h0(obj);
                    wlgVar.r = str4;
                    wlgVar.s = gs4Var2;
                    i3 = 0;
                    wlgVar.o = 0;
                    wlgVar.k = 1;
                    f = gs4.f(gs4Var2, str4, wlgVar);
                    if (f == nm6Var2) {
                        return nm6Var2;
                    }
                    gs4Var = gs4Var2;
                    str = str4;
                } else {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            i4 = wlgVar.o;
                            qgg.h0(obj);
                            wlgVar.r = str4;
                            wlgVar.s = gs4Var2;
                            wlgVar.o = i4;
                            wlgVar.k = 3;
                            e = gs4.e(gs4Var2, str4, wlgVar);
                            if (e == nm6Var2) {
                                return nm6Var2;
                            }
                            longValue = ((Number) e).longValue();
                            str2 = mqsVar.a;
                            l = new Long(j5);
                            wlgVar.r = null;
                            wlgVar.s = null;
                            wlgVar.o = i4;
                            wlgVar.k = 4;
                            if (gs4Var2.T(str4, longValue, str2, l, wlgVar) == nm6Var2) {
                            }
                            return Unit.a;
                        }
                        if (i9 != 3) {
                            if (i9 == 4) {
                                qgg.h0(obj);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = wlgVar.o;
                        gs4Var2 = (gs4) wlgVar.s;
                        str4 = (String) wlgVar.r;
                        qgg.h0(obj);
                        e = obj;
                        longValue = ((Number) e).longValue();
                        str2 = mqsVar.a;
                        l = new Long(j5);
                        wlgVar.r = null;
                        wlgVar.s = null;
                        wlgVar.o = i4;
                        wlgVar.k = 4;
                        if (gs4Var2.T(str4, longValue, str2, l, wlgVar) == nm6Var2) {
                            return nm6Var2;
                        }
                        return Unit.a;
                    }
                    i3 = wlgVar.o;
                    gs4 gs4Var3 = (gs4) wlgVar.s;
                    String str5 = (String) wlgVar.r;
                    qgg.h0(obj);
                    str = str5;
                    gs4Var = gs4Var3;
                    f = obj;
                }
                long longValue2 = ((Number) f).longValue();
                String str6 = str;
                String str7 = mqsVar.a;
                Long l2 = new Long(j5);
                wlgVar.r = null;
                wlgVar.s = null;
                wlgVar.o = i3;
                wlgVar.k = 2;
                int i10 = i3;
                Object T = gs4Var.T(str6, longValue2, str7, l2, wlgVar);
                wlgVar = wlgVar;
                if (T == nm6Var2) {
                    return nm6Var2;
                }
                i4 = i10;
                wlgVar.r = str4;
                wlgVar.s = gs4Var2;
                wlgVar.o = i4;
                wlgVar.k = 3;
                e = gs4.e(gs4Var2, str4, wlgVar);
                if (e == nm6Var2) {
                }
                longValue = ((Number) e).longValue();
                str2 = mqsVar.a;
                l = new Long(j5);
                wlgVar.r = null;
                wlgVar.s = null;
                wlgVar.o = i4;
                wlgVar.k = 4;
                if (gs4Var2.T(str4, longValue, str2, l, wlgVar) == nm6Var2) {
                }
                return Unit.a;
            case 2:
                gs4 gs4Var4 = (gs4) wlgVar.p;
                nm6 nm6Var3 = nm6.a;
                int i11 = wlgVar.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    MainDatabase mainDatabase4 = (MainDatabase) wlgVar.l;
                    btl btlVar = (btl) gs4Var4.a;
                    long j6 = wlgVar.n;
                    String str8 = (String) wlgVar.q;
                    wlgVar.s = mainDatabase4;
                    i5 = 0;
                    wlgVar.o = 0;
                    wlgVar.k = 1;
                    j = btlVar.j(wlgVar.m, j6, str8, wlgVar);
                    if (j == nm6Var3) {
                        return nm6Var3;
                    }
                    mainDatabase = mainDatabase4;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mainDatabase2 = (MainDatabase) wlgVar.s;
                        qgg.h0(obj);
                        long j7 = wlgVar.n;
                        String str9 = (String) wlgVar.q;
                        Long l3 = (Long) wlgVar.r;
                        hys hysVar = new hys(j7, 2, 0, str9, null, l3 == null ? new Date(l3.longValue()) : null);
                        p2m p2mVar = (p2m) gs4Var4.b;
                        List c = t75.c(hysVar);
                        p2mVar.getClass();
                        p2m.a(wlgVar.m, c);
                        mainDatabase2.F("playlist_track");
                        return Unit.a;
                    }
                    int i12 = wlgVar.o;
                    mainDatabase = (MainDatabase) wlgVar.s;
                    qgg.h0(obj);
                    i5 = i12;
                    j = obj;
                }
                if (!((Boolean) j).booleanValue()) {
                    return Unit.a;
                }
                q1m K = mainDatabase.K();
                long j8 = wlgVar.n;
                List c2 = t75.c((String) wlgVar.q);
                wlgVar.s = mainDatabase;
                wlgVar.o = i5;
                wlgVar.k = 2;
                if (K.c(j8, c2, wlgVar) == nm6Var3) {
                    return nm6Var3;
                }
                mainDatabase2 = mainDatabase;
                long j72 = wlgVar.n;
                String str92 = (String) wlgVar.q;
                Long l32 = (Long) wlgVar.r;
                hys hysVar2 = new hys(j72, 2, 0, str92, null, l32 == null ? new Date(l32.longValue()) : null);
                p2m p2mVar2 = (p2m) gs4Var4.b;
                List c3 = t75.c(hysVar2);
                p2mVar2.getClass();
                p2m.a(wlgVar.m, c3);
                mainDatabase2.F("playlist_track");
                return Unit.a;
            default:
                b4m b4mVar = (b4m) wlgVar.p;
                nm6 nm6Var4 = nm6.a;
                int i13 = wlgVar.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    MainDatabase mainDatabase5 = (MainDatabase) wlgVar.l;
                    cvl cvlVar = (cvl) wlgVar.r;
                    wlgVar.s = mainDatabase5;
                    wlgVar.o = 0;
                    wlgVar.k = 1;
                    a = b4m.a(b4mVar, mainDatabase5, cvlVar, false, wlgVar);
                    if (a == nm6Var4) {
                        return nm6Var4;
                    }
                    mainDatabase3 = mainDatabase5;
                    i6 = 0;
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j2 = wlgVar.n;
                        qgg.h0(obj);
                        return new Long(j2);
                    }
                    i6 = wlgVar.o;
                    MainDatabase mainDatabase6 = (MainDatabase) wlgVar.s;
                    qgg.h0(obj);
                    mainDatabase3 = mainDatabase6;
                    a = obj;
                }
                t3m t3mVar = (t3m) a;
                long j9 = t3mVar.a;
                if (!t3mVar.b) {
                    return new Long(j9);
                }
                List list3 = (List) wlgVar.q;
                wlgVar.s = null;
                wlgVar.o = i6;
                wlgVar.n = j9;
                wlgVar.k = 2;
                if (b4m.b(b4mVar, mainDatabase3, j9, list3, wlgVar) == nm6Var4) {
                    return nm6Var4;
                }
                j2 = j9;
                return new Long(j2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wlg(ueo ueoVar, Continuation continuation, gs4 gs4Var, String str, mqs mqsVar, long j) {
        super(1, continuation);
        this.l = ueoVar;
        this.p = gs4Var;
        this.m = str;
        this.q = mqsVar;
        this.n = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wlg(ueo ueoVar, Continuation continuation, gs4 gs4Var, String str, long j, String str2, Long l) {
        super(1, continuation);
        this.l = ueoVar;
        this.p = gs4Var;
        this.m = str;
        this.n = j;
        this.q = str2;
        this.r = l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wlg(ueo ueoVar, Continuation continuation, b4m b4mVar, String str, cvl cvlVar, List list) {
        super(1, continuation);
        this.l = ueoVar;
        this.p = b4mVar;
        this.m = str;
        this.r = cvlVar;
        this.q = list;
    }
}
