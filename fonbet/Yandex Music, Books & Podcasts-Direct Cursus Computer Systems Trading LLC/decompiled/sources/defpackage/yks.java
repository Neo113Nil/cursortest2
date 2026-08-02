package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.location.LocationManager;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.a;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public class yks implements w2q, pun {
    public static yks e;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public yks(Context context) {
        this.a = 5;
        context.getClass();
        this.b = context;
        l18 l18Var = l18.b;
        this.c = l18Var.b(hag.I(dy6.class), true);
        bdt I = hag.I(cce.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.d = (cce) qdcVar.C(I);
    }

    public pxk a(e5d e5dVar) {
        String str = e5dVar.e;
        WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
        str.getClass();
        webPath$Storage.getClass();
        CoverPath B = etn.B(str, webPath$Storage);
        ((ujl) this.b).getClass();
        String pathForSize = B.getPathForSize(wct.s());
        tjl tjlVar = (tjl) this.d;
        String str2 = e5dVar.g;
        tjlVar.getClass();
        un6 un6Var = new un6(qo6.a, pathForSize, pd.R(str2));
        String str3 = e5dVar.c;
        String str4 = e5dVar.d;
        if (StringsKt.U(str4)) {
            str4 = null;
        }
        String str5 = e5dVar.f;
        return new pxk(un6Var, str3, str4, str5 != null ? new jbu(str5) : null);
    }

    @Override // defpackage.pun
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 14:
                h4x h4xVar = (h4x) this.b;
                xun xunVar = (xun) this.c;
                String str = (String) this.d;
                jox joxVar = (jox) obj;
                i8s i8sVar = (i8s) obj2;
                y1g.I("Not active connection", h4xVar.F != 1);
                if (xunVar != null) {
                    y0x y0xVar = (y0x) joxVar.s();
                    Parcel M0 = y0xVar.M0();
                    M0.writeString(str);
                    y0xVar.P0(M0, 12);
                }
                i8sVar.b(null);
                break;
            default:
                h4x h4xVar2 = (h4x) this.b;
                String str2 = (String) this.c;
                String str3 = (String) this.d;
                jox joxVar2 = (jox) obj;
                i8s i8sVar2 = (i8s) obj2;
                HashMap hashMap = h4xVar2.B;
                long incrementAndGet = h4xVar2.q.incrementAndGet();
                y1g.I("Not connected to device", h4xVar2.F == 3);
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), i8sVar2);
                    y0x y0xVar2 = (y0x) joxVar2.s();
                    Parcel M02 = y0xVar2.M0();
                    M02.writeString(str2);
                    M02.writeString(str3);
                    M02.writeLong(incrementAndGet);
                    y0xVar2.P0(M02, 9);
                    break;
                } catch (RemoteException e2) {
                    hashMap.remove(Long.valueOf(incrementAndGet));
                    i8sVar2.a(e2);
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sxk b(mqs mqsVar) {
        String c;
        String str;
        Date date;
        qec qecVar = (qec) this.c;
        qecVar.getClass();
        mqsVar.getClass();
        k10 k10Var = mqsVar.d;
        List u = zwf.u(mqsVar);
        boolean isEmpty = u.isEmpty();
        if (a4g.D(gys.NonMusicHolder, mqsVar) || isEmpty) {
            u = null;
        }
        if (u == null) {
            u = c5b.a;
        }
        List list = u;
        CoverPath coverPath = mqsVar.x0.a;
        ((ujl) this.b).getClass();
        String pathForSize = coverPath.getPathForSize(frv.b());
        tjl tjlVar = (tjl) this.d;
        String str2 = mqsVar.f().a;
        tjlVar.getClass();
        un6 un6Var = new un6(qo6.a, pathForSize, pd.R(str2));
        String j = mqsVar.j();
        hgp hgpVar = (hgp) qecVar.b;
        switch (vjl.a[k10Var.d().ordinal()]) {
            case 1:
                if (!mqsVar.l()) {
                    c = ((skr) ((fkl) ((jyr) hgpVar.d).getValue()).a.getValue()).c(R.string.unknown_album);
                    break;
                } else {
                    c = StringsKt.t0(k10Var.d).toString();
                    break;
                }
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                String B = zwf.B(mqsVar.i, mqsVar.f);
                if (B.length() <= 0) {
                    c = "";
                    break;
                } else {
                    c = StringsKt.t0(B).toString();
                    break;
                }
            default:
                b6e.s();
                return null;
        }
        String str3 = !StringsKt.U(c) ? c : null;
        switch (vzs.a[k10Var.d().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                if (mqsVar.l()) {
                    Calendar calendar = Calendar.getInstance();
                    oq oqVar = mqsVar.t;
                    if (oqVar != null && (date = oqVar.p) != null) {
                        calendar.setTime(date);
                        str = String.valueOf(calendar.get(1));
                        String str4 = (str != null || StringsKt.U(str)) ? null : str;
                        jzb i = mqsVar.i();
                        boolean z = !mqsVar.C();
                        boolean z2 = (mqsVar.p() || mqsVar.C()) ? false : true;
                        String str5 = mqsVar.y;
                        ibu ibuVar = str5 != null ? new ibu(str5) : null;
                        hqs hqsVar = mqsVar.o;
                        break;
                    }
                }
                str = null;
                if (str != null) {
                }
                jzb i2 = mqsVar.i();
                boolean z3 = !mqsVar.C();
                if (mqsVar.p()) {
                }
                String str52 = mqsVar.y;
                ibu ibuVar2 = str52 != null ? new ibu(str52) : null;
                hqs hqsVar2 = mqsVar.o;
                break;
            default:
                b6e.s();
                break;
        }
        return null;
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        throw null;
    }

    public uxk d(x1u x1uVar) {
        CoverPath coverPath = x1uVar.o.a;
        ((ujl) this.b).getClass();
        un6 un6Var = new un6(qo6.j, coverPath.getPathForSize(720), null);
        String str = x1uVar.b;
        ((qec) this.c).getClass();
        return new uxk(un6Var, str, v5g.B(x1uVar), x1uVar.n);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0131 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(vtm vtmVar, lhd lhdVar, cg6 cg6Var) {
        p1u p1uVar;
        p1u p1uVar2;
        String str;
        int i;
        lhd lhdVar2;
        d85 d85Var;
        alu aluVar;
        String str2;
        yks yksVar;
        vtm vtmVar2;
        lhd lhdVar3;
        alu aluVar2;
        int i2;
        yks yksVar2;
        Object f;
        if (cg6Var instanceof p1u) {
            p1uVar = (p1u) cg6Var;
            int i3 = p1uVar.r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p1uVar.r = i3 - Integer.MIN_VALUE;
                p1uVar2 = p1uVar;
                Object obj = p1uVar2.p;
                nm6 nm6Var = nm6.a;
                Continuation continuation = null;
                switch (p1uVar2.r) {
                    case 0:
                        qgg.h0(obj);
                        if (vtmVar == null) {
                            b6e.s();
                            return null;
                        }
                        mqs mqsVar = (mqs) vtmVar.a;
                        str = mqsVar.c;
                        alu aluVar3 = new alu(mqsVar.d());
                        l18 l18Var = l18.b;
                        bdt I = hag.I(byb.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        String b = ((tnq) ((byb) qdcVar.C(I)).c(ern.a(tnq.class))).b();
                        boolean d = Intrinsics.d(b, "on");
                        i = R.string.dialog_action_radio_track;
                        if (!d && (!Intrinsics.d(b, "on_without_9_android") || Build.VERSION.SDK_INT == 28)) {
                            CoverPath coverPath = mqsVar.x0.a;
                            p1uVar2.j = vtmVar;
                            p1uVar2.k = lhdVar;
                            p1uVar2.l = this;
                            p1uVar2.m = str;
                            p1uVar2.n = aluVar3;
                            p1uVar2.o = R.string.dialog_action_radio_track;
                            p1uVar2.r = 5;
                            obj = x97.V(dm6.b, new npt(coverPath, this, continuation, 3), p1uVar2);
                            if (obj != nm6Var) {
                                vtmVar2 = vtmVar;
                                lhdVar3 = lhdVar;
                                aluVar2 = aluVar3;
                                i2 = R.string.dialog_action_radio_track;
                                yksVar2 = this;
                                yks yksVar3 = yksVar2;
                                str2 = str;
                                yksVar = yksVar3;
                                i = i2;
                                lhdVar2 = lhdVar3;
                                vtmVar = vtmVar2;
                                aluVar = aluVar2;
                                d85Var = (d85) obj;
                                avo avoVar = new avo(pkb.Track, ((mqs) vtmVar.a).a);
                                p1uVar2.j = null;
                                p1uVar2.k = null;
                                p1uVar2.l = null;
                                p1uVar2.m = null;
                                p1uVar2.n = null;
                                p1uVar2.r = 6;
                                f = yksVar.f(i, str2, aluVar, d85Var, avoVar, lhdVar2, p1uVar2);
                                if (f == nm6Var) {
                                    return f;
                                }
                            }
                            return nm6Var;
                        }
                        Integer R = pd.R(mqsVar.f().a);
                        if (R != null) {
                            lhdVar2 = lhdVar;
                            d85Var = new d85(c3x.f(R.intValue()));
                        } else {
                            lhdVar2 = lhdVar;
                            d85Var = null;
                        }
                        aluVar = aluVar3;
                        str2 = str;
                        yksVar = this;
                        avo avoVar2 = new avo(pkb.Track, ((mqs) vtmVar.a).a);
                        p1uVar2.j = null;
                        p1uVar2.k = null;
                        p1uVar2.l = null;
                        p1uVar2.m = null;
                        p1uVar2.n = null;
                        p1uVar2.r = 6;
                        f = yksVar.f(i, str2, aluVar, d85Var, avoVar2, lhdVar2, p1uVar2);
                        if (f == nm6Var) {
                            return nm6Var;
                        }
                        break;
                    case 1:
                        vtm vtmVar3 = p1uVar2.j;
                        qgg.h0(obj);
                        pkb pkbVar = pkb.Audiobook;
                        vtmVar3.getClass();
                        l1j.f();
                        return null;
                    case 2:
                        qgg.h0(obj);
                        return obj;
                    case 3:
                        vtm vtmVar4 = p1uVar2.j;
                        qgg.h0(obj);
                        pkb pkbVar2 = pkb.Audiobook;
                        vtmVar4.getClass();
                        l1j.f();
                        return null;
                    case 4:
                        qgg.h0(obj);
                        return obj;
                    case 5:
                        i2 = p1uVar2.o;
                        aluVar2 = p1uVar2.n;
                        str = p1uVar2.m;
                        yksVar2 = p1uVar2.l;
                        lhdVar3 = p1uVar2.k;
                        vtmVar2 = p1uVar2.j;
                        qgg.h0(obj);
                        yks yksVar32 = yksVar2;
                        str2 = str;
                        yksVar = yksVar32;
                        i = i2;
                        lhdVar2 = lhdVar3;
                        vtmVar = vtmVar2;
                        aluVar = aluVar2;
                        d85Var = (d85) obj;
                        avo avoVar22 = new avo(pkb.Track, ((mqs) vtmVar.a).a);
                        p1uVar2.j = null;
                        p1uVar2.k = null;
                        p1uVar2.l = null;
                        p1uVar2.m = null;
                        p1uVar2.n = null;
                        p1uVar2.r = 6;
                        f = yksVar.f(i, str2, aluVar, d85Var, avoVar22, lhdVar2, p1uVar2);
                        if (f == nm6Var) {
                        }
                        break;
                    case 6:
                        qgg.h0(obj);
                        return obj;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        p1uVar = new p1u(this, cg6Var);
        p1uVar2 = p1uVar;
        Object obj2 = p1uVar2.p;
        nm6 nm6Var2 = nm6.a;
        Continuation continuation2 = null;
        switch (p1uVar2.r) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(int i, String str, alu aluVar, d85 d85Var, avo avoVar, Function1 function1, cg6 cg6Var) {
        q1u q1uVar;
        int i2;
        String string;
        String str2;
        alu aluVar2;
        Function1 function12;
        avo avoVar2;
        if (cg6Var instanceof q1u) {
            q1uVar = (q1u) cg6Var;
            int i3 = q1uVar.r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q1uVar.r = i3 - Integer.MIN_VALUE;
                Object obj = q1uVar.p;
                nm6 nm6Var = nm6.a;
                i2 = q1uVar.r;
                if (i2 != 0) {
                    qgg.h0(obj);
                    string = ((Context) this.b).getString(i);
                    string.getClass();
                    q1uVar.j = str;
                    q1uVar.k = aluVar;
                    q1uVar.l = d85Var;
                    q1uVar.m = avoVar;
                    q1uVar.n = function1;
                    q1uVar.o = string;
                    q1uVar.r = 1;
                    Object V = x97.V(dm6.b, new zts(this, null, 13), q1uVar);
                    if (V == nm6Var) {
                        return nm6Var;
                    }
                    str2 = str;
                    aluVar2 = aluVar;
                    function12 = function1;
                    avoVar2 = avoVar;
                    obj = V;
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    string = q1uVar.o;
                    Function1 function13 = q1uVar.n;
                    avoVar2 = q1uVar.m;
                    d85Var = q1uVar.l;
                    alu aluVar3 = q1uVar.k;
                    String str3 = q1uVar.j;
                    qgg.h0(obj);
                    function12 = function13;
                    str2 = str3;
                    aluVar2 = aluVar3;
                }
                return new n1u(str2, aluVar2, new xes(10, avoVar2, aluVar2), string, neg.I((String) obj), new d85(d85Var == null ? d85Var.a : oa5.a), function12);
            }
        }
        q1uVar = new q1u(this, cg6Var);
        Object obj2 = q1uVar.p;
        nm6 nm6Var2 = nm6.a;
        i2 = q1uVar.r;
        if (i2 != 0) {
        }
        return new n1u(str2, aluVar2, new xes(10, avoVar2, aluVar2), string, neg.I((String) obj2), new d85(d85Var == null ? d85Var.a : oa5.a), function12);
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        faqVar.getClass();
        if (faqVar instanceof naq) {
            return b(((naq) faqVar).e);
        }
        if (faqVar instanceof daq) {
            return a(((daq) faqVar).e);
        }
        if (faqVar instanceof saq) {
            return d(((saq) faqVar).e);
        }
        if (faqVar instanceof qaq) {
            uow uowVar = ((qaq) faqVar).c;
            return q(uowVar.f, uowVar.d);
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        return b(jzsVar.a);
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        m1qVar.getClass();
        if (m1qVar instanceof c2q) {
            return b(((c2q) m1qVar).d);
        }
        if (m1qVar instanceof j1q) {
            return a(((j1q) m1qVar).d);
        }
        if (m1qVar instanceof e2q) {
            ckd ckdVar = ((e2q) m1qVar).c;
            return q(ckdVar.f, ckdVar.d);
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        return d(i5uVar.a);
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        return a(k4dVar.a);
    }

    public boolean l() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.c;
        if (((String) this.d) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.d = str;
                return true;
            }
            do {
                String readLine = ((BufferedReader) this.b).readLine();
                this.d = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.d = trim;
            } while (trim.isEmpty());
        }
        return true;
    }

    public String m() {
        if (!l()) {
            wvs.n();
            return null;
        }
        String str = (String) this.d;
        this.d = null;
        return str;
    }

    public void n(w5j w5jVar, String str, s7u s7uVar, long j) {
        Object i4uVar;
        w5jVar.getClass();
        str.getClass();
        s7uVar.getClass();
        tfn tfnVar = s7uVar.b.a;
        ssg.a(3, "VideoClipRadioFeedbackReporterImpl", "Reporting playback stop for itemId=" + tfnVar + " mode=" + w5jVar, null);
        float f = ((float) j) / ((float) 1000);
        if (f < 0.1f) {
            f = 0.1f;
        }
        int ordinal = w5jVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            i4uVar = new i4u(tfnVar, f);
        } else {
            if (ordinal != 2 && ordinal != 3) {
                b6e.s();
                return;
            }
            i4uVar = new drq(tfnVar, f);
        }
        ou7 p = x97.p((tf6) this.c, null, null, new lco(this, str, s7uVar, i4uVar, (Continuation) null, 29), 3);
        if (p.X()) {
            return;
        }
        ((ConcurrentLinkedQueue) this.d).offer(p);
        p.R(new wes(16, this, p));
    }

    public Object o(int i, String str, aur aurVar) {
        if (!((atn) this.c).T(str)) {
            return Unit.a;
        }
        x0q x0qVar = (x0q) this.d;
        String string = ((Resources) this.b).getString(i);
        string.getClass();
        Object emit = x0qVar.emit(string, aurVar);
        return emit == nm6.a ? emit : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p(String str, String str2, String str3, cg6 cg6Var) {
        c7u c7uVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof c7u) {
            c7uVar = (c7u) cg6Var;
            int i2 = c7uVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c7uVar.l = i2 - Integer.MIN_VALUE;
                Object obj = c7uVar.j;
                nm6 nm6Var = nm6.a;
                i = c7uVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "VideoClipRadioFeedbackReporterImpl", "Reporting station start for sessionId=" + str2, null);
                    vw5 vw5Var = (vw5) this.b;
                    ehn ehnVar = new ehn(str);
                    c7uVar.l = 1;
                    obj = vw5Var.a(str2, str3, ehnVar, c7uVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    ssg.a(6, "VideoClipRadioFeedbackReporterImpl", "Failed sending feedback for station start", ((pj6) rj6Var).a());
                }
                return Unit.a;
            }
        }
        c7uVar = new c7u(this, cg6Var);
        Object obj2 = c7uVar.j;
        nm6 nm6Var2 = nm6.a;
        i = c7uVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
        return Unit.a;
    }

    public txk q(String str, String str2) {
        WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
        webPath$Storage.getClass();
        CoverPath B = etn.B(str, webPath$Storage);
        ((ujl) this.b).getClass();
        return new txk(new un6(qo6.m, B.getPathForSize(frv.b()), null), str2);
    }

    public yks(c1t c1tVar, wcg wcgVar, i6c[] i6cVarArr, int i) {
        this.a = 13;
        this.d = c1tVar;
        this.b = wcgVar;
        this.c = i6cVarArr;
    }

    public yks(xun xunVar) {
        this.a = 15;
        this.d = xunVar;
        this.c = new AtomicLong((d94.b.nextLong() & 65535) * 10000);
    }

    public yks(pv9 pv9Var, bma bmaVar) {
        this.a = 7;
        pv9Var.getClass();
        this.b = pv9Var;
        this.c = bmaVar;
        this.d = zzp.b;
    }

    public yks(tf6 tf6Var, oq7 oq7Var, skr skrVar) {
        this.a = 8;
        this.b = tf6Var;
        this.c = oq7Var;
        this.d = btf.b(new jvu(4, skrVar));
    }

    public yks(Context context, ugk ugkVar, g0c g0cVar) {
        this.a = 10;
        ugkVar.getClass();
        g0cVar.getClass();
        this.b = context;
        this.c = g0cVar;
        this.d = btf.b(new j5n(21, this, ugkVar));
    }

    public yks(Resources resources, atn atnVar) {
        this.a = 4;
        resources.getClass();
        this.b = resources;
        this.c = atnVar;
        this.d = y0q.b(0, 0, null, 7);
    }

    public /* synthetic */ yks(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public yks(int i) {
        this.a = i;
        switch (i) {
            case 17:
                break;
            default:
                this.b = new WeakHashMap();
                this.c = new WeakHashMap();
                this.d = new WeakHashMap();
                break;
        }
    }

    public yks(ujl ujlVar, qec qecVar, tjl tjlVar) {
        this.a = 0;
        ujlVar.getClass();
        qecVar.getClass();
        tjlVar.getClass();
        this.b = ujlVar;
        this.c = qecVar;
        this.d = tjlVar;
    }

    public yks(vw5 vw5Var, a aVar) {
        this.a = 6;
        aVar.getClass();
        this.b = vw5Var;
        this.c = gld.e(aVar);
        this.d = new ConcurrentLinkedQueue();
    }

    public yks(Context context, LocationManager locationManager) {
        this.a = 2;
        this.d = new tpr();
        this.b = context;
        this.c = locationManager;
    }

    public yks(eps epsVar) {
        this.a = 9;
        this.b = (vdr) epsVar.b;
        this.c = (xdr) epsVar.f;
        this.d = (xdr) epsVar.c;
    }

    public yks(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.a = 11;
        this.c = arrayDeque;
        this.b = bufferedReader;
    }
}
