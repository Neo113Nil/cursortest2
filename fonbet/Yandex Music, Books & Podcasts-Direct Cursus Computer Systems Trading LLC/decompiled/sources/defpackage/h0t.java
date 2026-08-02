package defpackage;

import android.content.Context;
import android.os.Parcelable;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import retrofit2.Call;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.url.ui.UrlActivity;

/* loaded from: classes4.dex */
public final class h0t extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0t(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    private final Object A(Object obj) {
        aqi aqiVar = (aqi) this.n;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            if (!((Boolean) aqiVar.getValue()).booleanValue() && Intrinsics.d(((d8t) this.l).d.getValue(), d1w.a)) {
                aqiVar.setValue(Boolean.TRUE);
                lyv lyvVar = (lyv) this.m;
                this.k = 1;
                if (lyvVar.b(this) == nm6Var) {
                    return nm6Var;
                }
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    private final Object B(Object obj) {
        aqi aqiVar = (aqi) this.n;
        lyv lyvVar = (lyv) this.l;
        rxv rxvVar = lyvVar.a;
        aqi aqiVar2 = (aqi) this.m;
        Object obj2 = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            Continuation continuation = null;
            if (((String) aqiVar2.getValue()).length() == 0) {
                uyv uyvVar = lyvVar.b;
                en0 en0Var = new en0(lyvVar, null);
                uyvVar.getClass();
                uyvVar.g = en0Var;
                aqiVar2.setValue(((yyv) aqiVar.getValue()).b);
                return Unit.a;
            }
            if (!Intrinsics.d((String) aqiVar2.getValue(), ((yyv) aqiVar.getValue()).b)) {
                float f = 1.0f;
                if (rxvVar.i.e() < 1.0f) {
                    aqiVar2.setValue(((yyv) aqiVar.getValue()).b);
                    act S = weo.S(300, 0, lya.a, 2);
                    this.k = 1;
                    mqi mqiVar = rxvVar.u;
                    meh mehVar = new meh(rxvVar, f, S, continuation, 0);
                    rxvVar = rxvVar;
                    Object l = rxv.l(rxvVar, mqiVar, null, mehVar, this, 3);
                    if (l != obj2) {
                        l = Unit.a;
                    }
                    if (l == obj2) {
                        return obj2;
                    }
                }
            }
            aqiVar2.setValue(((yyv) aqiVar.getValue()).b);
            return Unit.a;
        }
        if (i != 1) {
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        rxvVar.D.setValue(Boolean.FALSE);
        return Unit.a;
    }

    private final Object k(Object obj) {
        Object value;
        Object value2;
        r3s r3sVar = (r3s) this.m;
        co5 co5Var = (co5) this.n;
        csu csuVar = (csu) this.l;
        x0q x0qVar = csuVar.n;
        xdr xdrVar = csuVar.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            do {
                value = xdrVar.getValue();
                ((bsu) value).getClass();
            } while (!xdrVar.k(value, new bsu(true)));
            squ squVar = csuVar.k;
            this.k = 1;
            obj = squVar.a(this);
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
        vr6 vr6Var = (vr6) obj;
        if (vr6Var instanceof ur6) {
            r3sVar.invoke(((ur6) vr6Var).a);
            co5Var.invoke();
        } else if (Intrinsics.d(vr6Var, tr6.a)) {
            co5Var.invoke();
            x0qVar.a(new hpu());
        } else {
            if (!Intrinsics.d(vr6Var, sr6.a)) {
                b6e.s();
                return null;
            }
            x0qVar.a(new fpu(new ftr(7, csuVar, r3sVar, co5Var)));
        }
        do {
            value2 = xdrVar.getValue();
            ((bsu) value2).getClass();
        } while (!xdrVar.k(value2, new bsu(false)));
        return Unit.a;
    }

    private final Object l(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        int i2 = 1;
        if (i == 0) {
            qgg.h0(obj);
            if (((Boolean) ((aqi) this.m).getValue()).booleanValue()) {
                eno s0 = szf.s0(new abi((bci) this.n, 2));
                lf2 lf2Var = new lf2(2, 15, null);
                this.k = 1;
                if (zsd.h0(s0, lf2Var, this) == nm6Var) {
                    return nm6Var;
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        yoc yocVar = (yoc) this.l;
        yocVar.getClass();
        yocVar.a(new u8b(i2, 4));
        return Unit.a;
    }

    private final Object n(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            mmo mmoVar = ((hxu) this.l).f;
            String str = ((u4q) this.m).a.b;
            List list = (List) this.n;
            this.k = 1;
            sml smlVar = (sml) mmoVar.b;
            List list2 = list;
            ArrayList arrayList = new ArrayList(v75.o(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new Long(((bpu) it.next()).a));
            }
            Object d = ((uou) ((oou) smlVar.a)).d(this, str, arrayList);
            nm6 nm6Var2 = nm6.a;
            if (d != nm6Var2) {
                d = Unit.a;
            }
            if (d != nm6Var2) {
                d = Unit.a;
            }
            if (d == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r10 == r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r10 == r3) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object o(Object obj) {
        hxu hxuVar = (hxu) this.m;
        ou7 ou7Var = (ou7) this.n;
        qxu qxuVar = (qxu) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i != 0) {
            if (i == 1) {
                qgg.h0(obj);
                return (qxu) obj;
            }
            if (i == 2) {
                qgg.h0(obj);
                return (qxu) obj;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        Continuation continuation = null;
        if (qxuVar instanceof mxu) {
            ssg.a(3, "WaveProlongationOperation", "Offline prolongation is failed, wait for online prolongation", null);
            this.l = null;
            this.k = 2;
            obj = ou7Var.s(this);
        } else {
            if (!hxuVar.h.d()) {
                ou7Var.g(null);
                ssg.a(3, "WaveProlongationOperation", "Offline prolongation is finished successfully, cancel online prolongation", null);
                return qxuVar;
            }
            ssg.a(3, "WaveProlongationOperation", "Apply interim offline prolongation and continue online prolongation", null);
            buu buuVar = new buu(ou7Var, continuation, 1);
            this.l = null;
            this.k = 1;
            obj = hxu.c(hxuVar, qxuVar, buuVar, this);
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (defpackage.y2x.o(r7, r9) == r0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object p(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            ssg.a(3, "WaveProlongationOperation", "Offline prolongation is scheduled", null);
            long j = ((vuu) this.l).e;
            this.k = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        ssg.a(3, "WaveProlongationOperation", "Offline prolongation is launched", null);
        hxu hxuVar = (hxu) this.m;
        q4q q4qVar = (q4q) this.n;
        this.k = 2;
        Object n = hxuVar.n(q4qVar, false, this);
        return n == nm6Var ? nm6Var : n;
    }

    private final Object q(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            rjc rjcVar = (rjc) this.l;
            pjc pjcVar = (pjc) this.m;
            jqp jqpVar = new jqp(29, rjcVar, (gxj) this.n);
            this.l = null;
            this.k = 1;
            if (pjcVar.collect(jqpVar, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    private final Object s(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            rjc rjcVar = (rjc) this.l;
            pjc pjcVar = (pjc) this.m;
            azu azuVar = new azu(0, rjcVar, (ran) this.n);
            this.l = null;
            this.k = 1;
            if (pjcVar.collect(azuVar, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (defpackage.y2x.o(3000, r7) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (defpackage.y2x.o(300, r7) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object t(Object obj) {
        z6v z6vVar = (z6v) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            this.k = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                z6vVar.m.l(null);
                return Unit.a;
            }
            qgg.h0(obj);
        }
        xdr xdrVar = z6vVar.m;
        k7v k7vVar = (k7v) this.n;
        xdrVar.getClass();
        xdrVar.m(null, k7vVar);
        this.k = 2;
    }

    private final Object u(Object obj) {
        aqi aqiVar = (aqi) this.m;
        String[] strArr = (String[]) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            vqn vqnVar = new vqn();
            vqnVar.a = yhn.e(xz0.G(strArr, aqiVar.getValue()), xz0.B(strArr));
            uqn uqnVar = new uqn();
            eno s0 = szf.s0(new jvu(13, (f9v) this.n));
            pm pmVar = new pm(uqnVar, vqnVar, strArr, aqiVar, 18);
            this.k = 1;
            if (s0.collect(pmVar, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007c, code lost:
    
        if (r12.f(r5, r11) != r0) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x007c -> B:7:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object v(Object obj) {
        act S;
        h0t h0tVar;
        act actVar;
        fk0 fk0Var;
        Float f;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            S = weo.S(800, 0, (ov6) this.m, 2);
        } else {
            if (i == 1) {
                S = (act) this.l;
                qgg.h0(obj);
                actVar = S;
                fk0Var = (fk0) this.n;
                f = new Float(1.0f);
                this.l = actVar;
                this.k = 2;
                h0tVar = this;
                if (fk0.c(fk0Var, f, actVar, null, h0tVar, 12) != nm6Var) {
                    S = actVar;
                    fk0 fk0Var2 = (fk0) h0tVar.n;
                    Float f2 = new Float(0.0f);
                    h0tVar.l = S;
                    h0tVar.k = 3;
                }
                return nm6Var;
            }
            if (i == 2) {
                S = (act) this.l;
                qgg.h0(obj);
                h0tVar = this;
                fk0 fk0Var22 = (fk0) h0tVar.n;
                Float f22 = new Float(0.0f);
                h0tVar.l = S;
                h0tVar.k = 3;
            } else {
                if (i != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                S = (act) this.l;
                qgg.h0(obj);
            }
        }
        this.l = S;
        this.k = 1;
        if (y2x.o(2000L, this) == nm6Var) {
            return nm6Var;
        }
        actVar = S;
        fk0Var = (fk0) this.n;
        f = new Float(1.0f);
        this.l = actVar;
        this.k = 2;
        h0tVar = this;
        if (fk0.c(fk0Var, f, actVar, null, h0tVar, 12) != nm6Var) {
        }
        return nm6Var;
    }

    private final Object w(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            j0q j0qVar = ((idv) this.l).b;
            edv edvVar = new edv((String) this.m, (Map) this.n);
            this.k = 1;
            if (j0qVar.emit(edvVar, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    private final Object x(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            eno s0 = szf.s0(new tiv((aqi) this.l, 0));
            azu azuVar = new azu(3, (aqi) this.m, (Function0) this.n);
            this.k = 1;
            Object collect = s0.collect(new pja(azuVar, 26), this);
            if (collect != nm6Var) {
                collect = Unit.a;
            }
            if (collect == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    private final Object y(Object obj) {
        vtm vtmVar = (vtm) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            ltm ltmVar = (ltm) this.l;
            rtc rtcVar = new rtc(4, ltmVar);
            ((bpv) vtmVar.a).a((Context) this.n, new gx0(1), rtcVar);
            j5n j5nVar = new j5n(20, vtmVar, rtcVar);
            this.k = 1;
            if (y7g.q(ltmVar, j5nVar, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    private final Object z(Object obj) {
        Object a;
        String str;
        h0t h0tVar;
        b80 b80Var;
        List list = (List) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i != 0) {
            if (i == 1) {
                qgg.h0(obj);
                return obj;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        yuv yuvVar = (yuv) this.m;
        boolean andSet = ((AtomicBoolean) this.n).getAndSet(false);
        this.l = null;
        this.k = 1;
        arf arfVar = yuvVar.d;
        quv quvVar = yuvVar.a;
        if (quvVar instanceof ouv) {
            gvv gvvVar = (gvv) arfVar.getValue();
            ouv ouvVar = (ouv) quvVar;
            String str2 = ouvVar.a;
            b80 b80Var2 = ouvVar.b;
            if (andSet) {
                str = "no-cache";
                b80Var = b80Var2;
                h0tVar = this;
            } else {
                str = null;
                h0tVar = this;
                b80Var = b80Var2;
            }
            a = gvvVar.b(str2, list, b80Var, str, h0tVar);
        } else {
            if (!(quvVar instanceof puv)) {
                b6e.s();
                return null;
            }
            a = ((gvv) arfVar.getValue()).a(this, andSet ? "no-cache" : null, list);
        }
        return a == nm6Var ? nm6Var : a;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new h0t((l0t) this.l, (Iterable) this.m, (psd) this.n, continuation, 0);
            case 1:
                h0t h0tVar = new h0t((e6t) this.m, (Function0) this.n, continuation, 1);
                h0tVar.l = obj;
                return h0tVar;
            case 2:
                h0t h0tVar2 = new h0t((mat) this.n, continuation, 2);
                h0tVar2.m = obj;
                return h0tVar2;
            case 3:
                h0t h0tVar3 = new h0t((wot) this.n, continuation, 3);
                h0tVar3.m = obj;
                return h0tVar3;
            case 4:
                return new h0t((UrlActivity) this.m, (cuo) this.n, continuation, 4);
            case 5:
                return new h0t((crt) this.m, (tqn) this.n, continuation, 5);
            case 6:
                return new h0t((mmo) this.l, (String) this.m, (String) this.n, continuation, 6);
            case 7:
                return new h0t((wst) this.l, (xxq) this.m, (LinkedHashMap) this.n, continuation, 7);
            case 8:
                h0t h0tVar4 = new h0t((List) this.m, (jm1) this.n, continuation, 8);
                h0tVar4.l = obj;
                return h0tVar4;
            case 9:
                h0t h0tVar5 = new h0t((vgu) this.m, (String) this.n, continuation, 9);
                h0tVar5.l = obj;
                return h0tVar5;
            case 10:
                h0t h0tVar6 = new h0t((dnu) this.n, continuation, 10);
                h0tVar6.m = obj;
                return h0tVar6;
            case 11:
                h0t h0tVar7 = new h0t((uoi) this.m, (fk0) this.n, continuation, 11);
                h0tVar7.l = obj;
                return h0tVar7;
            case 12:
                return new h0t((uru) this.l, (gsu) this.m, (String) this.n, continuation, 12);
            case 13:
                return new h0t((csu) this.l, (r3s) this.m, (co5) this.n, continuation, 13);
            case 14:
                return new h0t((yoc) this.l, (aqi) this.m, (bci) this.n, continuation, 14);
            case 15:
                return new h0t((hxu) this.l, (u4q) this.m, (List) this.n, continuation, 15);
            case 16:
                h0t h0tVar8 = new h0t((hxu) this.m, (ou7) this.n, continuation, 16);
                h0tVar8.l = obj;
                return h0tVar8;
            case 17:
                return new h0t((vuu) this.l, (hxu) this.m, (q4q) this.n, continuation, 17);
            case 18:
                h0t h0tVar9 = new h0t((pjc) this.m, continuation, (gxj) this.n, 18);
                h0tVar9.l = obj;
                return h0tVar9;
            case 19:
                h0t h0tVar10 = new h0t((pjc) this.m, continuation, (ran) this.n, 19);
                h0tVar10.l = obj;
                return h0tVar10;
            case 20:
                return new h0t((l7v) this.l, (z6v) this.m, (k7v) this.n, continuation, 20);
            case 21:
                return new h0t((String[]) this.l, (aqi) this.m, (f9v) this.n, continuation, 21);
            case 22:
                return new h0t((ov6) this.m, (fk0) this.n, continuation, 22);
            case 23:
                return new h0t((idv) this.l, (String) this.m, (Map) this.n, continuation, 23);
            case 24:
                return new h0t((aqi) this.l, (aqi) this.m, (Function0) this.n, continuation, 24);
            case 25:
                h0t h0tVar11 = new h0t((vtm) this.m, (Context) this.n, continuation, 25);
                h0tVar11.l = obj;
                return h0tVar11;
            case 26:
                h0t h0tVar12 = new h0t((yuv) this.m, (AtomicBoolean) this.n, continuation, 26);
                h0tVar12.l = obj;
                return h0tVar12;
            case 27:
                return new h0t((d8t) this.l, (lyv) this.m, (aqi) this.n, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new h0t((lyv) this.l, (aqi) this.m, (aqi) this.n, continuation, 28);
            default:
                return new h0t((List) this.l, (u6k) this.m, (u6k) this.n, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((h0t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((h0t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((h0t) create((r6t) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((h0t) create((oi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((h0t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((h0t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((h0t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((h0t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((h0t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((h0t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((h0t) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((h0t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((h0t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((h0t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((h0t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((h0t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((h0t) create((qxu) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((h0t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((h0t) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((h0t) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((h0t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((h0t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 22:
                ((h0t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                return nm6.a;
            case 23:
                return ((h0t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((h0t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((h0t) create((ltm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((h0t) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((h0t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((h0t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                ((h0t) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                return nm6.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a0, code lost:
    
        if (defpackage.dnu.b(r0, r32) == r5) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (defpackage.y2x.o(500, r32) != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        if (defpackage.y2x.o(600, r32) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0352, code lost:
    
        if (r0 == r4) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0329, code lost:
    
        if (r2 == r4) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x072c, code lost:
    
        if (r0 != r3) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x07fe, code lost:
    
        if (r11 != false) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x07a3, code lost:
    
        if (r4 == r0) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x08a0, code lost:
    
        if (r6 == r10) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x08b9, code lost:
    
        if (r6 == r10) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x08e8, code lost:
    
        if (r6 == r10) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x08fd, code lost:
    
        if (r6 == r10) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b7, code lost:
    
        if (r4.emit(r0, r32) == r5) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0ad9  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0adc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0055 -> B:8:0x0059). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object c;
        Object b;
        Object d;
        rj6 rj6Var;
        p5t p5tVar;
        String str;
        String str2;
        ybb ybbVar;
        String j;
        CoverPath coverPath;
        String str3;
        r6t r6tVar;
        Object c2;
        tjj tjjVar;
        ReentrantLock reentrantLock;
        sjj[] sjjVarArr;
        sjj sjjVar;
        tjj tjjVar2;
        ReentrantLock reentrantLock2;
        si3 si3Var;
        Object obj2;
        fuo t20Var;
        wqn wqnVar;
        Object f;
        Object O;
        Object kj6Var;
        Object v;
        Object t7oVar;
        Object g0;
        String str4;
        Object f2;
        int i = 7;
        int i2 = 20;
        int i3 = 6;
        int i4 = 9;
        int i5 = 4;
        int i6 = 5;
        int i7 = 3;
        int i8 = 2;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = true;
        boolean z10 = true;
        boolean z11 = true;
        boolean z12 = true;
        boolean z13 = true;
        boolean z14 = true;
        boolean z15 = true;
        boolean z16 = true;
        boolean z17 = true;
        boolean z18 = true;
        boolean z19 = true;
        boolean z20 = true;
        boolean z21 = true;
        boolean z22 = true;
        boolean z23 = true;
        boolean z24 = true;
        boolean z25 = true;
        boolean z26 = true;
        boolean z27 = true;
        boolean z28 = true;
        boolean z29 = true;
        boolean z30 = true;
        boolean z31 = true;
        boolean z32 = true;
        boolean z33 = true;
        boolean z34 = true;
        boolean z35 = true;
        boolean z36 = true;
        boolean z37 = true;
        boolean z38 = true;
        boolean z39 = false;
        boolean z40 = false;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i9 = this.k;
                if (i9 != 0) {
                    if (i9 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                l0t l0tVar = (l0t) this.l;
                Iterable iterable = (Iterable) this.m;
                psd psdVar = (psd) this.n;
                this.k = 1;
                Object e = l0tVar.e(iterable, psdVar, this);
                return e == nm6Var ? nm6Var : e;
            case 1:
                e6t e6tVar = (e6t) this.m;
                kxi kxiVar = e6tVar.m;
                xdr xdrVar = e6tVar.u;
                l5t l5tVar = e6tVar.n;
                jyr jyrVar = e6tVar.q;
                String str5 = e6tVar.o;
                mm6 mm6Var = (mm6) this.l;
                nm6 nm6Var2 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    int ordinal = l5tVar.ordinal();
                    if (ordinal != 0 && ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    b6e.s();
                                    return null;
                                }
                                k6t k6tVar = (k6t) jyrVar.getValue();
                                this.l = mm6Var;
                                this.k = 4;
                                d = k6tVar.d(str5, this);
                                break;
                            } else {
                                k6t k6tVar2 = (k6t) jyrVar.getValue();
                                this.l = mm6Var;
                                this.k = 3;
                                b = k6tVar2.b(str5, false, this);
                                break;
                            }
                        } else {
                            Parcelable.Creator<nvl> creator = nvl.CREATOR;
                            nvl x = wxf.x(str5);
                            if (x == null) {
                                dfi.r(f1d.g("Invalid playlist id ", str5), "TrailerViewModel");
                                return Unit.a;
                            }
                            k6t k6tVar3 = (k6t) jyrVar.getValue();
                            String str6 = x.a;
                            String str7 = x.b;
                            this.l = mm6Var;
                            this.k = 2;
                            c = k6tVar3.c(str6, str7, this);
                            break;
                        }
                    } else {
                        k6t k6tVar4 = (k6t) jyrVar.getValue();
                        this.l = mm6Var;
                        this.k = 1;
                        a = k6tVar4.a(str5, this);
                        break;
                    }
                    return nm6Var2;
                }
                if (i10 == 1) {
                    qgg.h0(obj);
                    a = obj;
                    rj6Var = (rj6) a;
                } else if (i10 == 2) {
                    qgg.h0(obj);
                    c = obj;
                    rj6Var = (rj6) c;
                } else if (i10 == 3) {
                    qgg.h0(obj);
                    b = obj;
                    rj6Var = (rj6) b;
                } else {
                    if (i10 != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    d = obj;
                    rj6Var = (rj6) d;
                }
                ((Function0) this.n).invoke();
                if (rj6Var instanceof qj6) {
                    ybb ybbVar2 = (ybb) ((qj6) rj6Var).a;
                    e6tVar.w = ybbVar2;
                    Context context = e6tVar.p.a;
                    ybbVar2.getClass();
                    if (ybbVar2 instanceof l20) {
                        String a2 = x5t.a(ybbVar2, context);
                        lt ltVar = ((l20) ybbVar2).b;
                        String str8 = ltVar.c;
                        u9b u9bVar = ltVar.e;
                        String e2 = u9bVar != null ? u9bVar.e(wct.s(), WebPath$Storage.AVATARS) : null;
                        p5tVar = new p5t(a2, str8, e2 == null ? "" : e2, qo6.b, (u9bVar == null || (str3 = u9bVar.b) == null) ? null : pd.T(str3), false, false, null);
                    } else if (ybbVar2 instanceof fm1) {
                        String a3 = x5t.a(ybbVar2, context);
                        u51 u51Var = ((fm1) ybbVar2).b;
                        String str9 = u51Var.b;
                        u9b u9bVar2 = u51Var.c;
                        String e3 = u9bVar2 != null ? u9bVar2.e(wct.s(), WebPath$Storage.AVATARS) : null;
                        p5tVar = new p5t(a3, str9, e3 == null ? "" : e3, qo6.d, (u9bVar2 == null || (str2 = u9bVar2.b) == null) ? null : pd.T(str2), false, false, null);
                    } else if (ybbVar2 instanceof o3m) {
                        String a4 = x5t.a(ybbVar2, context);
                        o3m o3mVar = (o3m) ybbVar2;
                        eul eulVar = o3mVar.b;
                        String str10 = eulVar.c;
                        u9b u9bVar3 = eulVar.d;
                        String e4 = u9bVar3 != null ? u9bVar3.e(wct.s(), WebPath$Storage.AVATARS) : null;
                        String str11 = e4 == null ? "" : e4;
                        qo6 qo6Var = qo6.e;
                        d85 T = (u9bVar3 == null || (str = u9bVar3.b) == null) ? null : pd.T(str);
                        boolean z41 = o3mVar.c;
                        Float f3 = o3mVar.d;
                        p5tVar = new p5t(a4, str10, str11, qo6Var, T, false, z41, f3 != null ? Float.valueOf((f3.floatValue() + 280) % 360) : null);
                    } else {
                        if (!(ybbVar2 instanceof u1t)) {
                            b6e.s();
                            return null;
                        }
                        String a5 = x5t.a(ybbVar2, context);
                        u1t u1tVar = (u1t) ybbVar2;
                        mqs mqsVar = u1tVar.b.a;
                        String str12 = mqsVar.c;
                        CoverPath coverPath2 = mqsVar.w;
                        String pathForSize = coverPath2 != null ? coverPath2.getPathForSize(wct.s()) : null;
                        p5tVar = new p5t(a5, str12, pathForSize == null ? "" : pathForSize, qo6.a, pd.T(u1tVar.a), false, false, null);
                    }
                    p5t p5tVar2 = p5tVar;
                    List<h0r> a6 = ybbVar2.a();
                    ArrayList arrayList = new ArrayList(v75.o(a6, 10));
                    for (h0r h0rVar : a6) {
                        dzs dzsVar = q0r.a;
                        mqs mqsVar2 = h0rVar.a;
                        dzs dzsVar2 = q0r.a;
                        dzsVar2.getClass();
                        co6 co6Var = dzsVar2.apply(mqsVar2) ? mqsVar2.x0 : null;
                        String pathForSize2 = (co6Var == null || (coverPath = co6Var.a) == null) ? null : coverPath.getPathForSize(wct.s());
                        String str13 = pathForSize2 == null ? "" : pathForSize2;
                        k10 k10Var = mqsVar2.d;
                        boolean z42 = k10Var.g;
                        int i11 = k10Var.e;
                        jzb i12 = mqsVar2.i();
                        boolean z43 = mqsVar2.j;
                        if (StringsKt.U(mqsVar2.j())) {
                            ybbVar = ybbVar2;
                            if (mqsVar2.k == dg2.d) {
                                j = ((skr) q0r.b.getValue()).c(R.string.track_has_been_deleted);
                                String str14 = j;
                                String obj3 = fxf.W(mqsVar2).toString();
                                arrayList.add(new j0r(h0rVar, new p0r(str13, z42, i11, i12, z43, str14, StringsKt.U(obj3) ? obj3 : null)));
                                ybbVar2 = ybbVar;
                            }
                        } else {
                            ybbVar = ybbVar2;
                        }
                        j = mqsVar2.j();
                        String str142 = j;
                        String obj32 = fxf.W(mqsVar2).toString();
                        arrayList.add(new j0r(h0rVar, new p0r(str13, z42, i11, i12, z43, str142, StringsKt.U(obj32) ? obj32 : null)));
                        ybbVar2 = ybbVar;
                    }
                    ybb ybbVar3 = ybbVar2;
                    a6t a6tVar = new a6t(p5tVar2, arrayList, ybbVar3, e6tVar.n, !e6tVar.l);
                    xdrVar.getClass();
                    xdrVar.m(null, a6tVar);
                    String t = weo.t();
                    b5t G = e6tVar.G();
                    t4t t4tVar = e6tVar.k;
                    cvo cvoVar = t4tVar.e;
                    jab jabVar = new jab(qkb.Trailer, 1, 1, 0);
                    pkb c3 = t4t.c(t4tVar.c);
                    String a7 = t4tVar.a();
                    a7.getClass();
                    if (G.g(ybbVar3, new w5l(cvoVar, jabVar, new thj(c3, a7, 1, 1, ""), null), kxiVar.a(t), kxiVar)) {
                        e6tVar.a(new c6t(e6tVar, t, 2));
                    }
                    b5t G2 = e6tVar.G();
                    G2.getClass();
                    ybbVar3.getClass();
                    e6tVar.t.d(e6t.x[0], ox6.B(new u21(21, G2.a.d, G2, ybbVar3), mm6Var, new d6t(e6tVar, 1)));
                } else {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    y5t y5tVar = new y5t(l5tVar, ((pj6) rj6Var).a(), ((z66) e6tVar.s.getValue()).g());
                    xdrVar.getClass();
                    xdrVar.m(null, y5tVar);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    r6tVar = (r6t) this.m;
                    this.m = r6tVar;
                    this.k = 1;
                    c2 = r6tVar.c(this);
                    break;
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        reentrantLock2 = (ReentrantLock) this.l;
                        tjjVar2 = (tjj) this.m;
                        try {
                            qgg.h0(obj);
                            reentrantLock = reentrantLock2;
                            tjjVar = tjjVar2;
                            tjjVar.f = false;
                            reentrantLock.unlock();
                            return Unit.a;
                        } catch (Throwable th) {
                            th = th;
                            try {
                                tjjVar2.f = false;
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                reentrantLock = reentrantLock2;
                                reentrantLock.unlock();
                                throw th;
                            }
                        }
                    }
                    r6tVar = (r6t) this.m;
                    qgg.h0(obj);
                    c2 = obj;
                }
                if (((Boolean) c2).booleanValue()) {
                    return Unit.a;
                }
                mat matVar = (mat) this.n;
                tjjVar = matVar.h;
                reentrantLock = tjjVar.e;
                reentrantLock.lock();
                try {
                    tjjVar.f = true;
                    ReentrantLock reentrantLock3 = tjjVar.a;
                    reentrantLock3.lock();
                    try {
                        if (tjjVar.d) {
                            tjjVar.d = false;
                            int length = tjjVar.b.length;
                            sjjVarArr = new sjj[length];
                            int i14 = 0;
                            boolean z44 = false;
                            while (i14 < length) {
                                boolean z45 = tjjVar.b[i14] > 0 ? z2 : false;
                                boolean[] zArr = tjjVar.c;
                                if (z45 != zArr[i14]) {
                                    zArr[i14] = z45;
                                    sjjVar = z45 ? sjj.b : sjj.c;
                                    z44 = true;
                                } else {
                                    sjjVar = sjj.a;
                                }
                                sjjVarArr[i14] = sjjVar;
                                i14++;
                                z2 = true;
                            }
                            break;
                        }
                        sjjVarArr = null;
                        if (sjjVarArr != null) {
                            try {
                                if (sjjVarArr.length != 0) {
                                    q6t q6tVar = q6t.b;
                                    ya2 ya2Var = new ya2(sjjVarArr, matVar, r6tVar, null);
                                    this.m = tjjVar;
                                    this.l = reentrantLock;
                                    this.k = 2;
                                    if (r6tVar.a(q6tVar, ya2Var, this) != nm6Var3) {
                                        tjjVar2 = tjjVar;
                                        reentrantLock2 = reentrantLock;
                                        reentrantLock = reentrantLock2;
                                        tjjVar = tjjVar2;
                                    }
                                    return nm6Var3;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                tjjVar2 = tjjVar;
                                reentrantLock2 = reentrantLock;
                                tjjVar2.f = false;
                                throw th;
                            }
                        }
                        tjjVar.f = false;
                        reentrantLock.unlock();
                        return Unit.a;
                    } finally {
                        reentrantLock3.unlock();
                    }
                } catch (Throwable th4) {
                    th = th4;
                    reentrantLock.unlock();
                    throw th;
                }
            case 3:
                oi oiVar = (oi) this.m;
                nm6 nm6Var4 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    oiVar.getClass();
                    zi3 zi3Var = oiVar.d;
                    zi3Var.getClass();
                    si3Var = new si3(zi3Var);
                } else if (i15 == 1) {
                    si3 si3Var2 = (si3) this.l;
                    qgg.h0(obj);
                    si3Var = si3Var2;
                    obj2 = obj;
                    if (((Boolean) obj2).booleanValue()) {
                        return Unit.a;
                    }
                    si3Var.d();
                    Unit unit = Unit.a;
                    this.m = null;
                    this.l = si3Var;
                    this.k = 2;
                    Object Q = gld.Q(new fr4((wot) this.n, (Continuation) null, 12), this);
                    if (Q == nm6.a) {
                    }
                    if (Q == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i15 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    si3 si3Var3 = (si3) this.l;
                    qgg.h0(obj);
                    si3Var = si3Var3;
                }
                this.m = null;
                this.l = si3Var;
                this.k = 1;
                obj2 = si3Var.c(this);
                if (obj2 == nm6Var4) {
                    return nm6Var4;
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i16 = this.k;
                if (i16 != 0) {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cuo cuoVar = (cuo) this.l;
                    qgg.h0(obj);
                    return cuoVar;
                }
                qgg.h0(obj);
                UrlActivity urlActivity = (UrlActivity) this.m;
                cuo cuoVar2 = (cuo) this.n;
                cuoVar2.getClass();
                ypt yptVar = (ypt) cuoVar2.a;
                euo type = yptVar.getType();
                e7o e7oVar = men.j;
                type.getClass();
                switch (type.ordinal()) {
                    case 0:
                    case 1:
                    case 7:
                    case 21:
                    case 22:
                    case 32:
                    case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                        t20Var = e7oVar;
                        break;
                    case 2:
                        t20Var = new t20(0);
                        break;
                    case 3:
                        t20Var = new jm1(0);
                        break;
                    case 4:
                        t20Var = new nz1(19, z4 ? 1 : 0, f8g.A(), z3 ? 1 : 0);
                        break;
                    case 5:
                        t20Var = new nz1(16);
                        break;
                    case 6:
                        t20Var = new nz1(16);
                        break;
                    case 8:
                        t20Var = new t20(z6 ? 1 : 0, f8g.A(), z5 ? 1 : 0);
                        break;
                    case 9:
                        t20Var = new nz1(11, z7 ? 1 : 0, f8g.A(), z);
                        break;
                    case 10:
                        t20Var = new nz1(10, z9 ? 1 : 0, f8g.A(), z8 ? 1 : 0);
                        break;
                    case 11:
                        t20Var = new nz1(i4, z11 ? 1 : 0, f8g.A(), z10 ? 1 : 0);
                        break;
                    case 12:
                        t20Var = new nz1(0);
                        break;
                    case 13:
                        t20Var = new nz1(0);
                        break;
                    case 14:
                        t20Var = new nz1(12, z13 ? 1 : 0, f8g.A(), z12 ? 1 : 0);
                        break;
                    case 15:
                        t20Var = new nz1(18, z15 ? 1 : 0, f8g.A(), z14 ? 1 : 0);
                        break;
                    case 16:
                        t20Var = new nz1(16);
                        break;
                    case 17:
                        t20Var = new nz1(13, z17 ? 1 : 0, z, z16 ? 1 : 0);
                        break;
                    case 18:
                        t20Var = new nz1(0);
                        break;
                    case 19:
                        t20Var = new nz1(0);
                        break;
                    case 20:
                        t20Var = new nz1(8, z19 ? 1 : 0, f8g.A(), z18 ? 1 : 0);
                        break;
                    case 23:
                        t20Var = new nz1(1);
                        break;
                    case 24:
                        t20Var = new nz1(i, z20 ? 1 : 0, f8g.A(), z);
                        break;
                    case 25:
                        t20Var = new jm1(1);
                        break;
                    case 26:
                        t20Var = new nz1(1);
                        break;
                    case 27:
                        t20Var = new nz1(14, z22 ? 1 : 0, f8g.A(), z21 ? 1 : 0);
                        break;
                    case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                        t20Var = new nz1(16);
                        break;
                    case 29:
                        t20Var = new jm1(2);
                        break;
                    case 30:
                        t20Var = new t20(1);
                        break;
                    case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                        t20Var = new nz1(i7, z23 ? 1 : 0, f8g.A(), z);
                        break;
                    case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                        t20Var = new nz1(0);
                        break;
                    case 35:
                        t20Var = new nz1(15, z, z, z);
                        break;
                    case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                        t20Var = new nz1(0);
                        break;
                    case 37:
                        t20Var = new nz1(0);
                        break;
                    case 38:
                        t20Var = new nz1(0);
                        break;
                    case 39:
                        t20Var = new nz1(1);
                        break;
                    case 40:
                        t20Var = new nz1(i8, z25 ? 1 : 0, f8g.A(), z24 ? 1 : 0);
                        break;
                    case 41:
                        t20Var = new nz1(22, z27 ? 1 : 0, z, z26 ? 1 : 0);
                        break;
                    case 42:
                        t20Var = new jm1(3);
                        break;
                    case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                        t20Var = new nz1(16);
                        break;
                    case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                        t20Var = new nz1(16);
                        break;
                    case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                        t20Var = new nz1(1);
                        break;
                    case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                        t20Var = new nz1(21, z29 ? 1 : 0, f8g.A(), z28 ? 1 : 0);
                        break;
                    case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                        t20Var = new nz1(1);
                        break;
                    case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                        t20Var = new nz1(i6, z31 ? 1 : 0, f8g.A(), z30 ? 1 : 0);
                        break;
                    case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                        t20Var = new nz1(17, z33 ? 1 : 0, f8g.A(), z32 ? 1 : 0);
                        break;
                    case 50:
                        t20Var = new nz1(i2, z35 ? 1 : 0, f8g.A(), z34 ? 1 : 0);
                        break;
                    case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                        t20Var = new nz1(16);
                        break;
                    case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                        t20Var = new nz1(16);
                        break;
                    case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                        t20Var = new nz1(i3, z36 ? 1 : 0, f8g.A(), z);
                        break;
                    case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                        t20Var = new nz1(i5, z37 ? 1 : 0, f8g.A(), z);
                        break;
                    default:
                        b6e.s();
                        return null;
                }
                kqt a8 = t20Var.a(urlActivity, yptVar);
                cuo cuoVar3 = new cuo(a8, cuoVar2.b);
                if (a8.c == 1) {
                    ypt yptVar2 = a8.a;
                    yptVar2.getClass();
                    fzk fzkVar = fzk.a;
                    if (yptVar2.Q("play") != null || yptVar2.Q("playTrack") != null) {
                        this.l = cuoVar3;
                        this.k = 1;
                        ssg.a(3, null, "PlaybackDeeplinkOpenedTrigger: perform", null);
                        Object emit = fzk.b.emit("DeeplinkTrigger", this);
                        if (emit != nm6Var5) {
                            emit = Unit.a;
                        }
                        if (emit != nm6Var5) {
                            emit = Unit.a;
                        }
                        if (emit == nm6Var5) {
                            return nm6Var5;
                        }
                    }
                }
                return cuoVar3;
            case 5:
                crt crtVar = (crt) this.m;
                nm6 nm6Var6 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    wqn wqnVar2 = new wqn();
                    vqn vqnVar = new vqn();
                    vqnVar.a = 5;
                    taa taaVar = (taa) crtVar.b;
                    taaVar.e.c();
                    es6 es6Var = taaVar.j;
                    ((zi3) es6Var.c).c(new hv0(es6Var, z39 ? 1 : 0, i));
                    bca b2 = crtVar.b();
                    msa msaVar = nsa.b;
                    clc clcVar = new clc(zsd.Y(b2, yd5.M(500, ssa.MILLISECONDS)), new z62(wqnVar2, vqnVar, (Continuation) null), 4);
                    hyl hylVar = new hyl(i4, wqnVar2, (tqn) this.n, crtVar);
                    this.l = wqnVar2;
                    this.k = 1;
                    if (clcVar.collect(hylVar, this) == nm6Var6) {
                        return nm6Var6;
                    }
                    wqnVar = wqnVar2;
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wqnVar = (wqn) this.l;
                    qgg.h0(obj);
                }
                float f4 = wqnVar.a / 1000000.0f;
                if (f4 >= 200.0f) {
                    Set set = ((lja) ((e6q) crtVar.c).e.getValue()).a;
                    ssg.a(3, "UsedMemoryHelperImpl", "wasted_space=(mb=" + f4 + ", ids=" + (set.size() <= 10 ? set : CollectionsKt.h0(CollectionsKt.q0(set, 9), "...")) + ")", null);
                }
                return Unit.a;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    hjp hjpVar = (hjp) ((mmo) this.l).b;
                    String str15 = (String) this.m;
                    String str16 = (String) this.n;
                    this.k = 1;
                    Object emit2 = ((dtt) hjpVar.b).g.emit(new Pair(str15, str16), this);
                    if (emit2 != nm6Var7) {
                        emit2 = Unit.a;
                    }
                    if (emit2 != nm6Var7) {
                        emit2 = Unit.a;
                    }
                    if (emit2 == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 7:
                wst wstVar = (wst) this.l;
                nm6 nm6Var8 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    frt frtVar = wstVar.b;
                    this.k = 1;
                    f = frtVar.f(this);
                    break;
                } else {
                    if (i19 != 1) {
                        if (i19 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        O = obj;
                        bii biiVar = (bii) O;
                        if (biiVar instanceof aii) {
                            kj6Var = new qj6(((aii) biiVar).a);
                        } else if (biiVar instanceof xhi) {
                            xhi xhiVar = (xhi) biiVar;
                            MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                            int i20 = xhiVar.b;
                            String name = musicBackendInvocationError.getName();
                            String str17 = name == null ? "" : name;
                            String message = musicBackendInvocationError.getMessage();
                            kj6Var = new kj6(i20, musicBackendInvocationError.getDetails(), str17, message == null ? "" : message, xhiVar.a);
                        } else if (biiVar instanceof yhi) {
                            yhi yhiVar = (yhi) biiVar;
                            kj6Var = new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                        } else {
                            if (!(biiVar instanceof zhi)) {
                                b6e.s();
                                return null;
                            }
                            kj6Var = uwf.J((zhi) biiVar);
                        }
                        return Boolean.valueOf(kj6Var instanceof qj6);
                    }
                    qgg.h0(obj);
                    f = obj;
                }
                if (!Intrinsics.d(((xxq) f).a, ((xxq) this.m).a)) {
                    return Boolean.FALSE;
                }
                Call<Unit> a9 = wstVar.d.a((LinkedHashMap) this.n);
                this.k = 2;
                O = swf.O(a9, Unit.class, this);
                break;
            case 8:
                mm6 mm6Var2 = (mm6) this.l;
                nm6 nm6Var9 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    List list = (List) this.m;
                    list.getClass();
                    vz0 vz0Var = new vz0(i7, new w55(list));
                    jm1 jm1Var = (jm1) this.n;
                    ArrayList arrayList2 = new ArrayList(v75.o(vz0Var, 10));
                    Iterator it = vz0Var.iterator();
                    while (true) {
                        if (((j1f) it).hasNext()) {
                            arrayList2.add(x97.p(mm6Var2, null, null, new npt(r8.next(), (Object) jm1Var, (Continuation) (z40 ? 1 : 0), i6), 3));
                        } else {
                            this.l = null;
                            this.k = 1;
                            v = ox6.v(arrayList2, this);
                            if (v == nm6Var9) {
                                return nm6Var9;
                            }
                        }
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    v = obj;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : (Iterable) v) {
                    if (obj4 instanceof qj6) {
                        arrayList3.add(obj4);
                    }
                }
                ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add((List) ((qj6) it2.next()).a);
                }
                return v75.p(arrayList4);
            case 9:
                vgu vguVar = (vgu) this.m;
                nm6 nm6Var10 = nm6.a;
                int i22 = this.k;
                try {
                    if (i22 == 0) {
                        qgg.h0(obj);
                        String str18 = (String) this.n;
                        r7o r7oVar = z7o.b;
                        WeakHashMap weakHashMap = vgu.c;
                        fkn fknVar = avf.L(vguVar.a, str18).f;
                        this.k = 1;
                        g0 = zsd.g0(fknVar, this);
                        if (g0 == nm6Var10) {
                            return nm6Var10;
                        }
                    } else {
                        if (i22 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        g0 = obj;
                    }
                    t7oVar = (tgu) g0;
                    r7o r7oVar2 = z7o.b;
                } catch (Throwable th5) {
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(th5);
                }
                if (z7o.a(t7oVar) != null) {
                    int i23 = i9f.a;
                }
                tgu tguVar = (tgu) (t7oVar instanceof t7o ? null : t7oVar);
                if (tguVar != null) {
                    return tguVar;
                }
                tgu tguVar2 = vguVar.b;
                return new tgu((String) this.n, tguVar2.b, tguVar2.c, tguVar2.d, tguVar2.e, tguVar2.f, tguVar2.g, tguVar2.h, tguVar2.i, tguVar2.j, tguVar2.k, tguVar2.l, tguVar2.m, tguVar2.n, tguVar2.o, tguVar2.p, tguVar2.q, tguVar2.r, tguVar2.s);
            case 10:
                dnu dnuVar = (dnu) this.n;
                rjc rjcVar = (rjc) this.m;
                nm6 nm6Var11 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    String str19 = dnuVar.f;
                    this.m = rjcVar;
                    this.l = str19;
                    this.k = 1;
                    if (rjcVar.emit(str19, this) != nm6Var11) {
                        str4 = str19;
                    }
                    return nm6Var11;
                }
                if (i24 != 1) {
                    if (i24 != 2) {
                        if (i24 == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str4 = (String) this.l;
                    qgg.h0(obj);
                    if (!Intrinsics.d(str4, dnuVar.f)) {
                        String str20 = dnuVar.f;
                        this.m = null;
                        this.l = null;
                        this.k = 3;
                        break;
                    }
                    return Unit.a;
                }
                str4 = (String) this.l;
                qgg.h0(obj);
                this.m = rjcVar;
                this.l = str4;
                this.k = 2;
                break;
            case 11:
                mm6 mm6Var3 = (mm6) this.l;
                nm6 nm6Var12 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    pjc C = zsd.C(new mpq(24, ((uoi) this.m).a, su4.q(obj)), -1);
                    tep tepVar = new tep((fk0) this.n, mm6Var3, z38 ? 1 : 0);
                    this.l = null;
                    this.k = 1;
                    if (C.collect(tepVar, this) == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                String str21 = (String) this.n;
                gsu gsuVar = (gsu) this.m;
                uru uruVar = (uru) this.l;
                nm6 nm6Var13 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    squ squVar = uruVar.k;
                    String str22 = gsuVar.a;
                    this.k = 1;
                    f2 = squVar.f(str22, str21, this);
                    if (f2 == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    f2 = obj;
                }
                own ownVar = (own) f2;
                if (ownVar instanceof nwn) {
                    uru.H(uruVar, new wes(i2, gsuVar, str21));
                } else {
                    if (!Intrinsics.d(ownVar, mwn.a)) {
                        b6e.s();
                        return null;
                    }
                    uruVar.r.a(fru.a);
                }
                return Unit.a;
            case 13:
                return k(obj);
            case 14:
                return l(obj);
            case 15:
                return n(obj);
            case 16:
                return o(obj);
            case 17:
                return p(obj);
            case 18:
                return q(obj);
            case 19:
                return s(obj);
            case 20:
                return t(obj);
            case 21:
                return u(obj);
            case 22:
                return v(obj);
            case 23:
                return w(obj);
            case 24:
                return x(obj);
            case 25:
                return y(obj);
            case 26:
                return z(obj);
            case 27:
                return A(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return B(obj);
            default:
                nm6 nm6Var14 = nm6.a;
                int i27 = this.k;
                if (i27 != 0) {
                    if (i27 != 1) {
                        if (i27 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        u6k u6kVar = (u6k) this.n;
                        float f5 = qzv.a;
                        u6kVar.i((u6kVar.h() + 1) % ((List) this.l).size());
                        this.k = 1;
                        break;
                    } else {
                        qgg.h0(obj);
                        u6k u6kVar2 = (u6k) this.m;
                        float f6 = qzv.a;
                        u6kVar2.i((u6kVar2.h() + 1) % 6);
                        this.k = 2;
                        break;
                    }
                } else {
                    qgg.h0(obj);
                    this.k = 1;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0t(pjc pjcVar, Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.j = i;
        this.m = pjcVar;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0t(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0t(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
    }
}
