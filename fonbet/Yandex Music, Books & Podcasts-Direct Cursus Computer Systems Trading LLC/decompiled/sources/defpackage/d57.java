package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import org.json.JSONObject;
import ru.yandex.music.glagol.data.b;
import ru.yandex.quasar.glagol.backend.model.QuasarInfo;
import ru.yandex.quasar.glagol.backend.model.SmartDevice;

/* loaded from: classes4.dex */
public final class d57 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d57(mbq mbqVar, pjc pjcVar, xpi xpiVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.j = 13;
        this.o = mbqVar;
        this.l = pjcVar;
        this.m = (n9) xpiVar;
        this.n = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        if (r2.invoke(r10, r9) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d7, code lost:
    
        if (r0.a(r9) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        zgd zgdVar;
        qqi qqiVar;
        Object obj2 = this.o;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            zgdVar = (zgd) obj2;
            ssg.a(3, "GlagolVolume", dfi.c(zgdVar.a, "Collected ", " level of volume from station"), null);
            boolean z = ((chd) this.l).c;
            chd chdVar = (chd) this.l;
            if (!z) {
                chdVar.f.set(zgdVar);
                return Unit.a;
            }
            if (!chdVar.i || ((zgd) ((chd) this.l).d.get()).a == zgdVar.a) {
                ((chd) this.l).d.set(zgdVar);
                ((chd) this.l).i = false;
                qqiVar = ((chd) this.l).h;
                this.o = null;
                this.m = null;
                this.n = qqiVar;
                this.k = 2;
            } else {
                chd chdVar2 = (chd) this.l;
                fzb fzbVar = chdVar2.a;
                Object obj3 = chdVar2.d.get();
                obj3.getClass();
                this.o = null;
                this.m = zgdVar;
                this.k = 1;
            }
            return nm6Var;
        }
        if (i == 1) {
            zgdVar = (zgd) this.m;
            qgg.h0(obj);
            int i2 = zgdVar.a;
            int i3 = ((zgd) ((chd) this.l).d.get()).a;
            Object obj4 = ((chd) this.l).d.get();
            StringBuilder l = dfi.l("Volume unsync detected (station = ", i2, i3, " app = ", ") -> Emitted ");
            l.append(obj4);
            l.append(" level of volume to station");
            ssg.a(3, "GlagolVolume", l.toString(), null);
        } else {
            if (i != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qqiVar = (qqi) this.n;
            qgg.h0(obj);
            try {
                rar rarVar = ((chd) this.l).k;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                ((chd) this.l).k = null;
                qqiVar.b(null);
            } catch (Throwable th) {
                qqiVar.b(null);
                throw th;
            }
        }
        int i4 = ((zgd) ((chd) this.l).d.get()).a;
        bhd bhdVar = ((chd) this.l).l;
        if (i4 == 0) {
            i4 = -1;
        }
        bhdVar.e(i4);
        return Unit.a;
    }

    private final Object l(Object obj) {
        mm6 mm6Var = (mm6) this.o;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            Iterable iterable = (Iterable) this.l;
            ohd ohdVar = (ohd) this.m;
            dkd dkdVar = (dkd) this.n;
            ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
            Iterator it = iterable.iterator();
            while (true) {
                Continuation continuation = null;
                if (!it.hasNext()) {
                    break;
                }
                arrayList.add(x97.p(mm6Var, dm6.b, null, new ihd(ohdVar, (mdg) it.next(), dkdVar, continuation, 1), 2));
            }
            this.o = null;
            this.k = 1;
            obj = ox6.v(arrayList, this);
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
        return CollectionsKt.o0(CollectionsKt.O((Iterable) obj), new zda(13));
    }

    private final Object n(Object obj) {
        ou7 p;
        List list = (List) this.n;
        qhd qhdVar = (qhd) this.l;
        b bVar = (b) this.m;
        mm6 mm6Var = (mm6) this.o;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            Continuation continuation = null;
            ou7 p2 = x97.p(mm6Var, null, null, new fzb(bVar, qhdVar, continuation, 25), 3);
            switch (qhdVar.b.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 7:
                    p = x97.p(mm6Var, null, null, new fzb(bVar, list, continuation, 26), 3);
                    break;
                case 6:
                    p = x97.p(mm6Var, null, null, new akc(bVar, list, qhdVar, continuation, 15), 3);
                    break;
                default:
                    b6e.s();
                    return null;
            }
            List h = u75.h(p2, p);
            this.o = null;
            this.k = 1;
            obj = ox6.v(h, this);
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
        Object obj2 = ((List) obj).get(1);
        obj2.getClass();
        return (zhd) obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fb, code lost:
    
        if (r4.emit(r14, r20) == r5) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fd, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0079, code lost:
    
        if (r2 == r5) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005d, code lost:
    
        if (r4.emit(r6, r20) == r5) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object o(Object obj) {
        List a;
        Object V;
        ArrayList arrayList;
        fgd fgdVar;
        dkd dkdVar = (dkd) this.m;
        akd akdVar = (akd) this.l;
        agd agdVar = akdVar.c;
        rjc rjcVar = (rjc) this.o;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            a = agdVar.a();
            this.o = rjcVar;
            this.n = a;
            this.k = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    return Unit.a;
                }
                List list = (List) this.n;
                qgg.h0(obj);
                a = list;
                V = obj;
                List<SmartDevice> list2 = (List) V;
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (SmartDevice smartDevice : list2) {
                        String str = dkdVar.a;
                        QuasarInfo quasarInfo = smartDevice.getQuasarInfo();
                        if (quasarInfo == null) {
                            fgdVar = null;
                        } else {
                            String deviceId = quasarInfo.getDeviceId();
                            deviceId.getClass();
                            String name = smartDevice.getName();
                            name.getClass();
                            fgdVar = new fgd(str, deviceId, name, quasarInfo.getPlatform());
                        }
                        if (fgdVar != null) {
                            arrayList2.add(fgdVar);
                        }
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                if (!Intrinsics.d(arrayList, a)) {
                    SharedPreferences.Editor edit = agdVar.b().edit();
                    edit.putString("USER_SMART_HOME_RESPONSE", arrayList != null ? CollectionsKt.X(arrayList, "|||", null, null, new g4d(agdVar.b), 30) : null);
                    edit.apply();
                    this.o = null;
                    this.n = null;
                    this.k = 3;
                }
                return Unit.a;
            }
            a = (List) this.n;
            qgg.h0(obj);
        }
        String str2 = dkdVar.b;
        this.o = rjcVar;
        this.n = a;
        this.k = 2;
        V = x97.V(dm6.b, new nz5(akdVar, str2, continuation, 19), this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r4.b(r2, r9, r8) == r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        if (r9 == r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        if (r9 == r3) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object p(Object obj) {
        omp ompVar;
        rv0 rv0Var = (rv0) this.m;
        int i = rv0Var.a;
        Context context = (Context) this.l;
        nm6 nm6Var = nm6.a;
        int i2 = this.k;
        if (i2 == 0) {
            qgg.h0(obj);
            ompVar = (omp) this.o;
            String x = ot0.x(i);
            this.o = ompVar;
            this.k = 1;
            obj = ompVar.a(context, x, this);
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                if (i2 == 3) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ompVar = (omp) this.o;
            qgg.h0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            aw0 aw0Var = (aw0) ompVar.a.get(ot0.x(i));
            aw0Var.getClass();
            this.o = null;
            this.k = 3;
            Object e = aw0Var.e(uv0.a, this);
            if (e != nm6Var) {
                e = Unit.a;
            }
        } else {
            aw0 aw0Var2 = new aw0((pv0) this.n, rv0Var, null, 248);
            this.o = null;
            this.k = 2;
        }
        return nm6Var;
    }

    private final Object q(Object obj) {
        Context context = (Context) this.m;
        pkd pkdVar = (pkd) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            mm6 mm6Var = (mm6) this.o;
            pkd.a(pkdVar, mm6Var, context);
            int[] iArr = (int[]) this.n;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i2 : iArr) {
                arrayList.add(x97.p(mm6Var, null, null, new rs(pkdVar, context, i2, null, 2), 3));
            }
            this.k = 1;
            if (ox6.v(arrayList, this) == nm6Var) {
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x008c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object s(Object obj) {
        omp ompVar;
        omp ompVar2;
        rv0 rv0Var = (rv0) this.m;
        GlanceRemoteViewsService glanceRemoteViewsService = ((wkd) this.l).a;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            omp ompVar3 = (omp) this.o;
            String x = ot0.x(rv0Var.a);
            this.o = ompVar3;
            this.k = 1;
            Object a = ompVar3.a(glanceRemoteViewsService, x, this);
            if (a != nm6Var) {
                ompVar = ompVar3;
                obj = a;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ompVar2 = (omp) this.o;
            qgg.h0(obj);
            aw0 aw0Var = (aw0) ompVar2.a.get(ot0.x(rv0Var.a));
            aw0Var.getClass();
            this.o = null;
            this.k = 3;
            Object f = aw0Var.f(this);
            return f != nm6Var ? nm6Var : f;
        }
        ompVar = (omp) this.o;
        qgg.h0(obj);
        if (((Boolean) obj).booleanValue()) {
            return null;
        }
        aw0 aw0Var2 = new aw0((pv0) this.n, rv0Var, null, 252);
        this.o = ompVar;
        this.k = 2;
        if (ompVar.b(glanceRemoteViewsService, aw0Var2, this) != nm6Var) {
            ompVar2 = ompVar;
            aw0 aw0Var3 = (aw0) ompVar2.a.get(ot0.x(rv0Var.a));
            aw0Var3.getClass();
            this.o = null;
            this.k = 3;
            Object f2 = aw0Var3.f(this);
            if (f2 != nm6Var) {
            }
        }
    }

    private final Object t(Object obj) {
        a2e a2eVar = (a2e) this.o;
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
        m4l m4lVar = (m4l) a2eVar.e.getValue();
        a6l a = a2eVar.d.a((String) this.l);
        List list = (List) this.n;
        xpt xptVar = (xpt) this.m;
        this.k = 1;
        Object b = m4l.b(m4lVar, list, a, xptVar, this, 48);
        return b == nm6Var ? nm6Var : b;
    }

    private final Object u(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            eno s0 = szf.s0(new vd(26, (aqi) this.o, (aqi) this.l, (fvf) this.m));
            oc ocVar = new oc((aqi) this.n, 4);
            this.k = 1;
            if (s0.collect(ocVar, this) == nm6Var) {
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

    private final Object v(Object obj) {
        wae waeVar;
        Context context = (Context) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            wae waeVar2 = new wae(new ssb(6, (mm6) this.o, (ck0) this.n));
            context.registerReceiver(waeVar2, wae.c);
            try {
                waeVar2.a(context);
                aa0 aa0Var = (aa0) this.m;
                this.o = waeVar2;
                this.k = 1;
                obj = aa0Var.invoke(this);
                if (obj == nm6Var) {
                    return nm6Var;
                }
                waeVar = waeVar2;
            } catch (Throwable th) {
                th = th;
                waeVar = waeVar2;
                context.unregisterReceiver(waeVar);
                throw th;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            waeVar = (wae) this.o;
            try {
                qgg.h0(obj);
            } catch (Throwable th2) {
                th = th2;
                context.unregisterReceiver(waeVar);
                throw th;
            }
        }
        context.unregisterReceiver(waeVar);
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0081, code lost:
    
        if (defpackage.zsd.h0(r12, r1, r11) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0083, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005c, code lost:
    
        if (defpackage.bkp.w0(r5, r11) == r0) goto L18;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0081 -> B:6:0x0041). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0064 -> B:6:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object w(Object obj) {
        mm6 mm6Var;
        uqn uqnVar;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        int i2 = 2;
        if (i == 0) {
            qgg.h0(obj);
            mm6 mm6Var2 = (mm6) this.l;
            uqn uqnVar2 = new uqn();
            uqnVar2.a = 1.0f;
            mm6Var = mm6Var2;
            uqnVar = uqnVar2;
        } else if (i == 1) {
            uqn uqnVar3 = (uqn) this.o;
            mm6 mm6Var3 = (mm6) this.l;
            qgg.h0(obj);
            uqnVar = uqnVar3;
            mm6Var = mm6Var3;
            if (uqnVar.a == 0.0f) {
                eno s0 = szf.s0(new ypb(7, mm6Var));
                fv6 fv6Var = new fv6(i2, 1, null);
                this.l = mm6Var;
                this.o = uqnVar;
                this.k = 2;
            }
        } else {
            if (i != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uqn uqnVar4 = (uqn) this.o;
            mm6 mm6Var4 = (mm6) this.l;
            qgg.h0(obj);
            uqnVar = uqnVar4;
            mm6Var = mm6Var4;
        }
        ak0 ak0Var = new ak0((aqi) this.m, (xje) this.n, uqnVar, mm6Var, 17);
        this.l = mm6Var;
        this.o = uqnVar;
        this.k = 1;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [n9, xpi] */
    /* JADX WARN: Type inference failed for: r2v8, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r5v13, types: [n9, xpi] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new d57((e57) this.o, (JSONObject) this.l, (JSONObject) this.m, (List) this.n, continuation, 0);
            case 1:
                return new d57((y57) this.o, (JSONObject) this.l, (JSONObject) this.m, (List) this.n, continuation, 1);
            case 2:
                d57 d57Var = new d57((cb7) this.l, this.m, (cb7) this.n, continuation, 2);
                d57Var.o = obj;
                return d57Var;
            case 3:
                return new d57((au7) this.l, continuation, (au7) this.m, (nyn) this.n);
            case 4:
                d57 d57Var2 = new d57((aaa) this.n, continuation, 4);
                d57Var2.m = obj;
                return d57Var2;
            case 5:
                return new d57((nss) this.o, (zvs) this.l, (taa) this.m, this.n, continuation, 5);
            case 6:
                d57 d57Var3 = new d57((cba) this.n, continuation, 6);
                d57Var3.m = obj;
                return d57Var3;
            case 7:
                return new d57((u6k) this.o, (aqi) this.l, (aqi) this.m, (sub) this.n, continuation, 7);
            case 8:
                d57 d57Var4 = new d57((nyf) this.l, (lyf) this.m, (pjc) this.n, continuation, 8);
                d57Var4.o = obj;
                return d57Var4;
            case 9:
                d57 d57Var5 = new d57((clc) this.m, (cle) this.n, continuation, 9);
                d57Var5.l = obj;
                return d57Var5;
            case 10:
                d57 d57Var6 = new d57((pjc) this.l, (pjc) this.m, (pyc) this.n, continuation);
                d57Var6.o = obj;
                return d57Var6;
            case 11:
                d57 d57Var7 = new d57((xqn) this.m, (rjc) this.n, continuation, 11);
                d57Var7.l = obj;
                return d57Var7;
            case 12:
                d57 d57Var8 = new d57((pjc) this.l, (xpi) this.m, this.n, continuation);
                d57Var8.o = obj;
                return d57Var8;
            case 13:
                return new d57((mbq) this.o, (pjc) this.l, (xpi) this.m, this.n, continuation);
            case 14:
                return new d57((ced) this.o, (gj6) this.l, (String) this.m, (mdk) this.n, continuation, 14);
            case 15:
                return new d57((ked) this.m, (Function0) this.n, continuation, 15);
            case 16:
                d57 d57Var9 = new d57(continuation, (chd) this.l);
                d57Var9.o = obj;
                return d57Var9;
            case 17:
                d57 d57Var10 = new d57((ltm) this.l, (ohd) this.m, (dkd) this.n, continuation, 17);
                d57Var10.o = obj;
                return d57Var10;
            case 18:
                d57 d57Var11 = new d57((Iterable) this.l, (ohd) this.m, (dkd) this.n, continuation, 18);
                d57Var11.o = obj;
                return d57Var11;
            case 19:
                d57 d57Var12 = new d57((qhd) this.l, (b) this.m, (List) this.n, continuation, 19);
                d57Var12.o = obj;
                return d57Var12;
            case 20:
                d57 d57Var13 = new d57((akd) this.l, (dkd) this.m, continuation);
                d57Var13.o = obj;
                return d57Var13;
            case 21:
                d57 d57Var14 = new d57((Context) this.l, (rv0) this.m, (pv0) this.n, continuation, 21);
                d57Var14.o = obj;
                return d57Var14;
            case 22:
                d57 d57Var15 = new d57((pkd) this.l, (Context) this.m, (int[]) this.n, continuation, 22);
                d57Var15.o = obj;
                return d57Var15;
            case 23:
                d57 d57Var16 = new d57((wkd) this.l, (rv0) this.m, (pv0) this.n, continuation, 23);
                d57Var16.o = obj;
                return d57Var16;
            case 24:
                return new d57(this.o, (String) this.l, (List) this.n, (xpt) this.m, continuation, 24);
            case 25:
                return new d57(this.o, (String) this.l, (List) this.n, (xpt) this.m, continuation, 25);
            case 26:
                return new d57((aqi) this.o, (aqi) this.l, (fvf) this.m, (aqi) this.n, continuation, 26);
            case 27:
                d57 d57Var17 = new d57((Context) this.l, (aa0) this.m, (ck0) this.n, continuation, 27);
                d57Var17.o = obj;
                return d57Var17;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                d57 d57Var18 = new d57((aqi) this.m, (xje) this.n, continuation, 28);
                d57Var18.l = obj;
                return d57Var18;
            default:
                return new d57((sdr) this.o, (cjc) this.l, (z6g) this.m, (v6k) this.n, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((d57) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((d57) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((d57) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((d57) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((d57) create((oi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((d57) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((d57) create((oi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((d57) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((d57) create((ltm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((d57) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((d57) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((d57) create(new gd4(((gd4) obj).a), (Continuation) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((d57) create((kbq) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((d57) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((d57) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((d57) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((d57) create(obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((d57) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((d57) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((d57) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((d57) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((d57) create((omp) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((d57) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((d57) create((omp) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((d57) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((d57) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((d57) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((d57) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((d57) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                return nm6.a;
            default:
                return ((d57) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:307|308|309|310|311|(1:313)|314|315|(2:318|316)|319|320|321|322|(3:324|325|(2:327|328)(2:330|331))|332|333) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x024b, code lost:
    
        if (r0.collect(r1, r18) == r2) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x022c, code lost:
    
        if (r0.collect(r1, r18) == r2) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0242, code lost:
    
        if (defpackage.zsd.h0(r6, r8, r18) == r2) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0267, code lost:
    
        if (defpackage.zsd.O(r5, r6, r18) == r2) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x039a, code lost:
    
        if (r5.collect(r6, r18) == r0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0380, code lost:
    
        if (r3.emit(null, r18) == r0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x04a3, code lost:
    
        if (r0 == r5) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x05b8, code lost:
    
        if (r0.a(r18) == r1) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x05ad, code lost:
    
        if (r2 == r1) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x063e, code lost:
    
        if (r0 == r3) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0676, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x06f2, code lost:
    
        if (r1.a(r18) == r0) goto L326;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:261:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x06c2  */
    /* JADX WARN: Type inference failed for: r0v113, types: [n9, rjc, xpi] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, nss] */
    /* JADX WARN: Type inference failed for: r15v8, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r1v51, types: [n9, rjc, xpi] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:237:0x04a3 -> B:217:0x04a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:295:0x063e -> B:277:0x0643). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qqi qqiVar;
        qqi qqiVar2;
        si3 si3Var;
        si3 si3Var2;
        Object obj2;
        Object c;
        si3 si3Var3;
        si3 si3Var4;
        Object obj3;
        Object c2;
        mm6 mm6Var;
        rjc rjcVar;
        xqn xqnVar;
        xqn xqnVar2;
        xqn xqnVar3;
        Function0 function0;
        Object ghdVar;
        int i = 16;
        int i2 = 4;
        int i3 = 0;
        int i4 = 2;
        int i5 = 1;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar = ((e57) this.o).K;
                    JSONObject jSONObject = (JSONObject) this.l;
                    jSONObject.getClass();
                    JSONObject jSONObject2 = (JSONObject) this.m;
                    jSONObject2.getClass();
                    tv8 tv8Var = new tv8(jSONObject, jSONObject2, (List) this.n);
                    this.k = 1;
                    if (x0qVar.emit(tv8Var, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar2 = ((y57) this.o).D;
                    JSONObject jSONObject3 = (JSONObject) this.l;
                    jSONObject3.getClass();
                    JSONObject jSONObject4 = (JSONObject) this.m;
                    jSONObject4.getClass();
                    tv8 tv8Var2 = new tv8(jSONObject3, jSONObject4, (List) this.n);
                    this.k = 1;
                    if (x0qVar2.emit(tv8Var2, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                Object obj4 = this.m;
                nm6 nm6Var3 = nm6.a;
                int i8 = this.k;
                if (i8 != 0) {
                    if (i8 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                mm6 mm6Var2 = (mm6) this.o;
                mu7[] mu7VarArr = {x97.p(mm6Var2, null, null, new xa7((cb7) this.l, obj4, r10, i3), 3), x97.p(mm6Var2, null, null, new xa7((cb7) this.n, obj4, r10, i5), 3)};
                this.k = 1;
                Object w = ox6.w(mu7VarArr, this);
                return w == nm6Var3 ? nm6Var3 : w;
            case 3:
                au7 au7Var = (au7) this.m;
                Object obj5 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    qqiVar = (qqi) ((au7) this.l).m;
                    this.o = qqiVar;
                    this.k = 1;
                    break;
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qqi qqiVar3 = (qqi) this.o;
                    qgg.h0(obj);
                    qqiVar = qqiVar3;
                }
                try {
                    Object value = ((xdr) au7Var.o).getValue();
                    fwu fwuVar = value instanceof fwu ? (fwu) value : null;
                    if (fwuVar == null) {
                        obj5 = Boolean.FALSE;
                    } else {
                        e5q e5qVar = fwuVar.b;
                        tyu tyuVar = fwuVar.a;
                        gyn X = u7g.X(y7g.t((nyn) this.n, hdg.W(e5qVar)));
                        if (X.equals(tyuVar.b)) {
                            obj5 = Boolean.TRUE;
                        } else {
                            xdr xdrVar = (xdr) au7Var.o;
                            fwu f = au7Var.f(tyuVar.a, X, e5qVar, false, a3l.a);
                            xdrVar.getClass();
                            xdrVar.m(null, f);
                            obj5 = Boolean.TRUE;
                        }
                    }
                    return obj5;
                } finally {
                }
            case 4:
                aaa aaaVar = (aaa) this.n;
                oi oiVar = (oi) this.m;
                nm6 nm6Var4 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    oiVar.getClass();
                    zi3 zi3Var = oiVar.d;
                    zi3Var.getClass();
                    si3Var = new si3(zi3Var);
                    this.m = null;
                    this.o = si3Var;
                    this.l = null;
                    this.k = 1;
                    obj2 = si3Var.c(this);
                    if (obj2 != nm6Var4) {
                    }
                    return nm6Var4;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gm5 gm5Var = (gm5) this.l;
                    si3Var2 = (si3) this.o;
                    try {
                        try {
                            try {
                                qgg.h0(obj);
                                c = obj;
                            } catch (Throwable th) {
                                th = th;
                                Assertions.throwOrSkip(aaa.g, new FailedAssertionException("Unexpected error in DownloadAlbumHistoryImpl.historyUpdateActor", th));
                                gm5Var.U(Unit.a);
                                si3Var = si3Var2;
                                this.m = null;
                                this.o = si3Var;
                                this.l = null;
                                this.k = 1;
                                obj2 = si3Var.c(this);
                                if (obj2 != nm6Var4) {
                                }
                                return nm6Var4;
                            }
                            List<jca> list = (List) c;
                            int a = tah.a(v75.o(list, 10));
                            if (a < 16) {
                                a = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                            for (jca jcaVar : list) {
                                linkedHashMap.put(jcaVar.a, new Long(jcaVar.b));
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                            yca ycaVar = new yca(linkedHashMap2);
                            ssg.a(2, aaa.g, "Album download history updated " + linkedHashMap2.keySet(), null);
                            xdr xdrVar2 = aaaVar.d;
                            xdrVar2.getClass();
                            xdrVar2.m(null, ycaVar);
                            gm5Var.U(Unit.a);
                            si3Var = si3Var2;
                            this.m = null;
                            this.o = si3Var;
                            this.l = null;
                            this.k = 1;
                            obj2 = si3Var.c(this);
                            if (obj2 != nm6Var4) {
                                si3Var2 = si3Var;
                                if (((Boolean) obj2).booleanValue()) {
                                    return Unit.a;
                                }
                                gm5Var = (gm5) si3Var2.d();
                                ssg.a(2, aaa.g, "Album download history update request gotten", null);
                                wca wcaVar = aaaVar.a;
                                this.m = null;
                                this.o = si3Var2;
                                this.l = gm5Var;
                                this.k = 2;
                                c = wcaVar.c(this);
                                break;
                            }
                            return nm6Var4;
                        } catch (CancellationException e) {
                            throw e;
                        }
                    } finally {
                        gm5Var.U(Unit.a);
                    }
                }
                si3 si3Var5 = (si3) this.o;
                qgg.h0(obj);
                si3Var2 = si3Var5;
                obj2 = obj;
                if (((Boolean) obj2).booleanValue()) {
                }
            case 5:
                taa taaVar = (taa) this.m;
                Object obj6 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar3 = saa.a;
                    cur curVar = taaVar.f;
                    zvs zvsVar = (zvs) this.l;
                    ?? r14 = this.n;
                    nss nssVar = (nss) this.o;
                    this.k = 1;
                    curVar.getClass();
                    Object V = x97.V(dm6.a, new v24((Continuation) null, curVar, zvsVar, (nss) r14, nssVar), this);
                    if (V != obj6) {
                        V = Unit.a;
                        break;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                e6q e6qVar = taaVar.d;
                this.k = 2;
                break;
            case 6:
                cba cbaVar = (cba) this.n;
                oi oiVar2 = (oi) this.m;
                nm6 nm6Var5 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    oiVar2.getClass();
                    zi3 zi3Var2 = oiVar2.d;
                    zi3Var2.getClass();
                    si3Var3 = new si3(zi3Var2);
                    this.m = null;
                    this.o = si3Var3;
                    this.l = null;
                    this.k = 1;
                    obj3 = si3Var3.c(this);
                    if (obj3 != nm6Var5) {
                    }
                    return nm6Var5;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gm5 gm5Var2 = (gm5) this.l;
                    si3Var4 = (si3) this.o;
                    try {
                        try {
                            qgg.h0(obj);
                            c2 = obj;
                        } finally {
                            gm5Var2.U(Unit.a);
                        }
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Throwable th2) {
                        Assertions.throwOrSkip(cba.g, new FailedAssertionException("Unexpected error in DownloadPlaylistHistoryImpl.historyUpdateActor", th2));
                    }
                    List<fga> list2 = (List) c2;
                    int a2 = tah.a(v75.o(list2, 10));
                    if (a2 < i) {
                        a2 = i;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(a2);
                    for (fga fgaVar : list2) {
                        linkedHashMap3.put(new ega(fgaVar.a, fgaVar.b), new Long(fgaVar.c));
                    }
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(linkedHashMap3);
                    vga vgaVar = new vga(linkedHashMap4);
                    String str = cba.g;
                    Set<ega> keySet = linkedHashMap4.keySet();
                    ArrayList arrayList = new ArrayList(v75.o(keySet, 10));
                    for (ega egaVar : keySet) {
                        arrayList.add(egaVar.a.a + StringUtils.PROCESS_POSTFIX_DELIMITER + egaVar.b);
                    }
                    ssg.a(2, str, "Playlist download history updated " + arrayList, null);
                    xdr xdrVar4 = cbaVar.d;
                    xdrVar4.getClass();
                    xdrVar4.m(null, vgaVar);
                    gm5Var2.U(Unit.a);
                    si3Var3 = si3Var4;
                    i = 16;
                    this.m = null;
                    this.o = si3Var3;
                    this.l = null;
                    this.k = 1;
                    obj3 = si3Var3.c(this);
                    if (obj3 != nm6Var5) {
                        si3Var4 = si3Var3;
                        if (((Boolean) obj3).booleanValue()) {
                            return Unit.a;
                        }
                        gm5Var2 = (gm5) si3Var4.d();
                        ssg.a(2, cba.g, "Playlist download history update request gotten", null);
                        sga sgaVar = cbaVar.a;
                        this.m = null;
                        this.o = si3Var4;
                        this.l = gm5Var2;
                        this.k = 2;
                        c2 = sgaVar.c(this);
                        break;
                    }
                    return nm6Var5;
                }
                si3 si3Var6 = (si3) this.o;
                qgg.h0(obj);
                si3Var4 = si3Var6;
                obj3 = obj;
                if (((Boolean) obj3).booleanValue()) {
                }
            case 7:
                nm6 nm6Var6 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    h7a d0 = zsd.d0(szf.s0(new mub((u6k) this.o, 0)), 1);
                    tl0 tl0Var = new tl0((aqi) this.l, (aqi) this.m, (sub) this.n);
                    this.k = 1;
                    if (d0.collect(tl0Var, this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                nm6 nm6Var7 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var3 = (ltm) this.o;
                    nyf nyfVar = (nyf) this.l;
                    lyf lyfVar = (lyf) this.m;
                    fzb fzbVar = new fzb((pjc) this.n, mm6Var3, r10, 9);
                    this.o = mm6Var3;
                    this.k = 1;
                    if (o8g.J(nyfVar, lyfVar, fzbVar, this) == nm6Var7) {
                        return nm6Var7;
                    }
                    mm6Var = mm6Var3;
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mm6Var = (ltm) this.o;
                    qgg.h0(obj);
                }
                ((oc4) mm6Var).p0(null);
                return Unit.a;
            case 9:
                nm6 nm6Var8 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    rjcVar = (rjc) this.l;
                    xqnVar = new xqn();
                    xqnVar.a = null;
                    this.l = rjcVar;
                    this.o = xqnVar;
                    this.k = 1;
                    break;
                } else {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xqnVar = (xqn) this.o;
                    rjcVar = (rjc) this.l;
                    qgg.h0(obj);
                }
                clc clcVar = (clc) this.m;
                tl0 tl0Var2 = new tl0(i, xqnVar, (cle) this.n, rjcVar);
                this.l = null;
                this.o = null;
                this.k = 2;
                break;
            case 10:
                rjc rjcVar2 = (rjc) this.o;
                nm6 nm6Var9 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    ov ovVar = new ov((pjc) this.l, (pjc) this.m, rjcVar2, (pyc) this.n, (Continuation) null);
                    this.o = null;
                    this.k = 1;
                    if (gld.Q(ovVar, this) == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                nm6 nm6Var10 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    Object obj7 = ((gd4) this.l).a;
                    xqnVar2 = (xqn) this.m;
                    boolean z = obj7 instanceof fd4;
                    if (!z) {
                        xqnVar2.a = obj7;
                    }
                    rjc rjcVar3 = (rjc) this.n;
                    if (z) {
                        Throwable a3 = gd4.a(obj7);
                        if (a3 != null) {
                            throw a3;
                        }
                        Object obj8 = xqnVar2.a;
                        if (obj8 != 0) {
                            r10 = obj8 != ugj.a ? obj8 : null;
                            this.l = obj7;
                            this.o = xqnVar2;
                            this.k = 1;
                            if (rjcVar3.emit(r10, this) == nm6Var10) {
                                return nm6Var10;
                            }
                            xqnVar3 = xqnVar2;
                        }
                        xqnVar2.a = ugj.c;
                    }
                    return Unit.a;
                }
                if (i17 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xqnVar3 = (xqn) this.o;
                qgg.h0(obj);
                xqnVar2 = xqnVar3;
                xqnVar2.a = ugj.c;
                return Unit.a;
            case 12:
                ?? r0 = (n9) this.m;
                nm6 nm6Var11 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    int ordinal = ((kbq) this.o).ordinal();
                    if (ordinal == 0) {
                        pjc pjcVar = (pjc) this.l;
                        this.k = 1;
                        if (pjcVar.collect(r0, this) == nm6Var11) {
                            return nm6Var11;
                        }
                    } else if (ordinal != 1) {
                        if (ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        Object obj9 = this.n;
                        if (obj9 == y0q.a) {
                            r0.g();
                        } else {
                            r0.a(obj9);
                        }
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 13:
                pjc pjcVar2 = (pjc) this.l;
                ?? r1 = (n9) this.m;
                nm6 nm6Var12 = nm6.a;
                int i19 = this.k;
                if (i19 != 0) {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            qgg.h0(obj);
                            this.k = 3;
                            break;
                        } else if (i19 != 3 && i19 != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    qgg.h0(obj);
                    return Unit.a;
                }
                qgg.h0(obj);
                mbq mbqVar = (mbq) this.o;
                if (mbqVar == lbq.a) {
                    this.k = 1;
                    break;
                } else if (mbqVar == lbq.b) {
                    wor i20 = r1.i();
                    dt0 dt0Var = new dt0(i4, i2, r10);
                    this.k = 2;
                    break;
                } else {
                    pjc b0 = zsd.b0(mbqVar.a(r1.i()));
                    d57 d57Var = new d57(pjcVar2, (xpi) r1, this.n, (Continuation) null);
                    this.k = 4;
                    break;
                }
                return nm6Var12;
            case 14:
                nm6 nm6Var13 = nm6.a;
                int i21 = this.k;
                if (i21 != 0) {
                    if (i21 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ced cedVar = (ced) this.o;
                gj6 gj6Var = (gj6) this.l;
                String str2 = (String) this.m;
                mdk mdkVar = (mdk) this.n;
                this.k = 1;
                zt3 zt3Var = new zt3(1, qxe.b(this));
                zt3Var.s();
                try {
                    ssg.a(4, "GlagolCastConnection", "command " + str2 + " --> " + mdkVar, null);
                    String send = gj6Var.send(mdkVar, new ydd(zt3Var, str2));
                    send.getClass();
                    if (c.v(str2, "launch", false) && !cedVar.l.X()) {
                        cedVar.p = send;
                        cedVar.l.start();
                    }
                } catch (shd e3) {
                    ssg.a(6, null, hrg.r("command ", str2, " <-- failure: ", e3.getMessage()), e3);
                    r7o r7oVar = z7o.b;
                    zt3Var.resumeWith(new sdd(e3));
                }
                Object q = zt3Var.q();
                nm6 nm6Var14 = nm6.a;
                return q == nm6Var13 ? nm6Var13 : q;
            case 15:
                nm6 nm6Var15 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    qqiVar2 = ((ked) this.m).d;
                    Function0 function02 = (Function0) this.n;
                    this.o = qqiVar2;
                    this.l = function02;
                    this.k = 1;
                    if (qqiVar2.a(this) == nm6Var15) {
                        return nm6Var15;
                    }
                    function0 = function02;
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function0 = (Function0) this.l;
                    qqiVar2 = (qqi) this.o;
                    qgg.h0(obj);
                }
                try {
                    function0.invoke();
                    qqiVar2.b(null);
                    return Unit.a;
                } finally {
                    qqiVar2.b(null);
                }
            case 16:
                return k(obj);
            case 17:
                List list3 = (List) this.o;
                nm6 nm6Var16 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var4 = (ltm) this.l;
                    dkd dkdVar = (dkd) this.n;
                    if (list3 == null) {
                        ghdVar = fhd.a;
                    } else {
                        ssg.a(3, null, dfi.c(list3.size(), "discovery emit: ", " conversations"), null);
                        ghdVar = new ghd(dkdVar, list3);
                    }
                    this.o = null;
                    this.k = 1;
                    if (((oc4) mm6Var4).d.m(ghdVar, this) == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 18:
                return l(obj);
            case 19:
                return n(obj);
            case 20:
                return o(obj);
            case 21:
                return p(obj);
            case 22:
                return q(obj);
            case 23:
                return s(obj);
            case 24:
                x1e x1eVar = (x1e) this.o;
                nm6 nm6Var17 = nm6.a;
                int i24 = this.k;
                if (i24 != 0) {
                    if (i24 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                m4l m4lVar = (m4l) x1eVar.k.getValue();
                a6l a4 = x1eVar.f.a((String) this.l);
                List list4 = (List) this.n;
                xpt xptVar = (xpt) this.m;
                this.k = 1;
                Object b = m4l.b(m4lVar, list4, a4, xptVar, this, 48);
                return b == nm6Var17 ? nm6Var17 : b;
            case 25:
                return t(obj);
            case 26:
                return u(obj);
            case 27:
                return v(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return w(obj);
            default:
                nm6 nm6Var18 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    eno s0 = szf.s0(new y6g(i3, (sdr) this.o, (cjc) this.l));
                    lrf lrfVar = new lrf(i5, (z6g) this.m, (v6k) this.n);
                    this.k = 1;
                    if (s0.collect(lrfVar, this) == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d57(pjc pjcVar, pjc pjcVar2, pyc pycVar, Continuation continuation) {
        super(2, continuation);
        this.j = 10;
        this.l = pjcVar;
        this.m = pjcVar2;
        this.n = (aur) pycVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d57(pjc pjcVar, xpi xpiVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.j = 12;
        this.l = pjcVar;
        this.m = (n9) xpiVar;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d57(akd akdVar, dkd dkdVar, Continuation continuation) {
        super(2, continuation);
        this.j = 20;
        this.l = akdVar;
        this.m = dkdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d57(au7 au7Var, Continuation continuation, au7 au7Var2, nyn nynVar) {
        super(2, continuation);
        this.j = 3;
        this.l = au7Var;
        this.m = au7Var2;
        this.n = nynVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d57(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.o = obj;
        this.l = obj2;
        this.m = obj3;
        this.n = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d57(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d57(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d57(Object obj, String str, List list, xpt xptVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.o = obj;
        this.l = str;
        this.n = list;
        this.m = xptVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d57(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d57(Continuation continuation, chd chdVar) {
        super(2, continuation);
        this.j = 16;
        this.l = chdVar;
    }
}
