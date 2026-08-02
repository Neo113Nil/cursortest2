package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import com.yandex.passport.common.exception.a;
import com.yandex.passport.data.exceptions.e;
import com.yandex.passport.internal.impl.q0;
import com.yandex.passport.internal.properties.o;
import com.yandex.passport.internal.ui.sloth.plusdevices.c;
import com.yandex.passport.internal.ui.sloth.plusdevices.d;
import com.yandex.passport.internal.ui.sloth.plusdevices.j;
import com.yandex.passport.internal.usecase.m2;
import com.yandex.passport.internal.usecase.o2;
import com.yandex.plus.pay.ui.core.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes3.dex */
public final class ak1 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public boolean k;
    public int l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak1(bk1 bk1Var, wh1 wh1Var, boolean z, String str, Continuation continuation) {
        super(2, continuation);
        this.j = 0;
        this.m = bk1Var;
        this.n = wh1Var;
        this.k = z;
        this.o = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ak1((bk1) this.m, (wh1) this.n, this.k, (String) this.o, continuation);
            case 1:
                return new ak1((h84) this.o, continuation, 1);
            case 2:
                return new ak1(2, (mcu) this.m, (aqi) this.n, (fk0) this.o, continuation, this.k);
            case 3:
                ak1 ak1Var = new ak1((cca) this.o, continuation, 3);
                ak1Var.n = obj;
                return ak1Var;
            case 4:
                ak1 ak1Var2 = new ak1((sdr) this.n, this.k, (fvf) this.o, continuation, 4);
                ak1Var2.m = obj;
                return ak1Var2;
            case 5:
                return new ak1(5, (List) this.m, (vx6) this.n, (qc9) this.o, continuation, this.k);
            case 6:
                ak1 ak1Var3 = new ak1((ivd) this.o, this.k, continuation);
                ak1Var3.n = obj;
                return ak1Var3;
            case 7:
                return new ak1(this.k, (ltf) this.m, (wdc) this.n, (xod) this.o, continuation);
            case 8:
                ak1 ak1Var4 = new ak1(this.k, (bwg) this.n, (kwg) this.o, continuation, 8);
                ak1Var4.m = obj;
                return ak1Var4;
            case 9:
                return new ak1(9, (fk0) this.m, (act) this.n, (Function0) this.o, continuation, this.k);
            case 10:
                return new ak1(this.k, (e8s) this.n, (bve) this.o, continuation, 10);
            case 11:
                return new ak1((aqi) this.n, this.k, (uoi) this.o, continuation, 11);
            case 12:
                return new ak1((qju) this.m, (WeakReference) this.n, (hn5) this.o, continuation);
            case 13:
                return new ak1((hxu) this.n, (s9p) this.o, this.k, continuation, 13);
            case 14:
                return new ak1((yk3) this.o, continuation, 14);
            case 15:
                ak1 ak1Var5 = new ak1((List) this.n, continuation, (jkw) this.o, this.k);
                ak1Var5.m = obj;
                return ak1Var5;
            default:
                return new ak1((j) this.n, (o) this.o, this.k, continuation, 16);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((ak1) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x038a, code lost:
    
        if (r1.o(r0, r4) == r12) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0324, code lost:
    
        if (r1 == r12) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0223, code lost:
    
        if (r0 == r12) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0242, code lost:
    
        if (r0 == r12) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0262, code lost:
    
        if (r0 == r12) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0291, code lost:
    
        if (r0 == r12) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02be, code lost:
    
        if (r0 == r12) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02d3, code lost:
    
        if (r0 == r12) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0456, code lost:
    
        if (r0.a(false, true, r4) == r1) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0435, code lost:
    
        if (r0 == r1) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0413, code lost:
    
        if (r2 == r1) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e5, code lost:
    
        if (kotlin.Unit.a == r8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x070b, code lost:
    
        if (defpackage.fk0.c(r0, r1, r2, r3, r4, 4) == r7) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        if (kotlin.Unit.a == r8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
    
        if (com.yandex.passport.internal.ui.sloth.plusdevices.j.a(r1, r0, r4) == r8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0983, code lost:
    
        if (r0.emit(r1, r4) == r3) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x09b4, code lost:
    
        if (r2 == r3) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
    
        if (kotlin.Unit.a == r8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0955, code lost:
    
        if (r6 == r3) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006b, code lost:
    
        if (r3 == r8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0ab9, code lost:
    
        if (r2.o(0, r4) == r0) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x004e, code lost:
    
        if (kotlin.Unit.a == r8) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0a0f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0363  */
    /* JADX WARN: Type inference failed for: r6v69, types: [aur, kotlin.jvm.functions.Function1] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        h84 h84Var;
        mwk mwkVar;
        Object w;
        boolean z;
        mqs mqsVar;
        Object a;
        mqs mqsVar2;
        pxs pxsVar;
        Object a2;
        boolean z2;
        mqs mqsVar3;
        mqs mqsVar4;
        kij kijVar;
        Object a3;
        ivd ivdVar;
        Object V;
        evj evjVar;
        Object a4;
        Object V2;
        boolean booleanValue;
        Object i0;
        hxu hxuVar;
        Object a5;
        Object Q;
        Object Q2;
        Object Q3;
        Object Q4;
        Object f;
        qxu qxuVar;
        Object k;
        StationId stationId;
        Object invoke;
        boolean z3;
        gxc gxcVar;
        Object g;
        Object obj2;
        Throwable a6;
        ak1 ak1Var = this;
        int i = 4;
        boolean z4 = false;
        z4 = false;
        int i2 = 2;
        int i3 = 1;
        Continuation continuation = null;
        switch (ak1Var.j) {
            case 0:
                boolean z5 = ak1Var.k;
                bk1 bk1Var = (bk1) ak1Var.m;
                ce5 ce5Var = bk1Var.o;
                xdr xdrVar = bk1Var.l;
                nm6 nm6Var = nm6.a;
                int i4 = ak1Var.l;
                if (i4 == 0) {
                    qgg.h0(obj);
                    if (!(xdrVar.getValue() instanceof bpq)) {
                        apq apqVar = apq.a;
                        xdrVar.getClass();
                        xdrVar.m(null, apqVar);
                    }
                    bk1Var.p = (wh1) ak1Var.n;
                    if (z5) {
                        ce5Var.p();
                    }
                    String str = (String) ak1Var.o;
                    ak1Var.l = 1;
                    if (bk1.a(bk1Var, str, z5, ak1Var) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (z5) {
                    ce5Var.o();
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i5 = ak1Var.l;
                if (i5 == 0) {
                    qgg.h0(obj);
                    h84Var = (h84) ak1Var.o;
                    mwkVar = h84Var.g;
                    if (mwkVar == h1b.e) {
                        return Unit.a;
                    }
                    tnl tnlVar = h84Var.f;
                    if (tnlVar != tnl.a && tnlVar != tnl.e && tnlVar != tnl.f) {
                        ak1Var.l = 2;
                        break;
                    } else {
                        boolean z6 = h84Var.h;
                        ak1Var.m = h84Var;
                        ak1Var.n = mwkVar;
                        ak1Var.k = z6;
                        ak1Var.l = 1;
                        w = h84Var.w(ak1Var);
                        if (w != nm6Var2) {
                            z = z6;
                            h84.y(h84Var, mwkVar, z, 0L, ((h4q) w).a);
                        }
                    }
                    return nm6Var2;
                }
                if (i5 == 1) {
                    boolean z7 = ak1Var.k;
                    mwkVar = (mwk) ak1Var.n;
                    h84Var = (h84) ak1Var.m;
                    qgg.h0(obj);
                    w = obj;
                    z = z7;
                    h84.y(h84Var, mwkVar, z, 0L, ((h4q) w).a);
                } else {
                    if (i5 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i6 = ak1Var.l;
                if (i6 == 0) {
                    qgg.h0(obj);
                    eno s0 = szf.s0(new ps((mcu) ak1Var.m, ak1Var.k, i));
                    rc4 rc4Var = new rc4((aqi) ak1Var.n, (fk0) ak1Var.o, continuation, 20);
                    ak1Var.l = 1;
                    if (zsd.O(s0, rc4Var, ak1Var) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                cca ccaVar = (cca) ak1Var.o;
                gba gbaVar = (gba) ak1Var.n;
                nm6 nm6Var4 = nm6.a;
                int i7 = ak1Var.l;
                if (i7 == 0) {
                    qgg.h0(obj);
                    v3w.l("init() - next track to download = ", (gbaVar == null || (mqsVar2 = gbaVar.a) == null) ? null : mqsVar2.a, 3, cca.k, null);
                    if (gbaVar == null) {
                        return Unit.a;
                    }
                    mqsVar = gbaVar.a;
                    xaa xaaVar = (xaa) ccaVar.i.getValue();
                    ohr ohrVar = ohr.b;
                    ak1Var.n = gbaVar;
                    ak1Var.m = mqsVar;
                    ak1Var.l = 1;
                    a = xaaVar.a(ohrVar, ak1Var);
                    break;
                } else if (i7 == 1) {
                    mqsVar = (mqs) ak1Var.m;
                    qgg.h0(obj);
                    a = obj;
                } else {
                    if (i7 == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i7 == 3) {
                        mqs mqsVar5 = (mqs) ak1Var.m;
                        qgg.h0(obj);
                        mqsVar = mqsVar5;
                        a2 = obj;
                        boolean booleanValue2 = ((Boolean) a2).booleanValue();
                        x0q x0qVar = ccaVar.j;
                        qaa qaaVar = new qaa(mqsVar.a, booleanValue2);
                        ak1Var.n = null;
                        ak1Var.m = mqsVar;
                        ak1Var.k = booleanValue2;
                        ak1Var.l = 4;
                        if (x0qVar.emit(qaaVar, ak1Var) != nm6Var4) {
                            z2 = booleanValue2;
                            mqsVar3 = mqsVar;
                            if (z2) {
                            }
                            String str2 = cca.k;
                            kijVar = (kij) ccaVar.e.getValue();
                            String str3 = mqsVar3.a;
                            synchronized (kijVar) {
                            }
                        }
                        return nm6Var4;
                    }
                    if (i7 != 4) {
                        if (i7 != 5) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mqsVar4 = (mqs) ak1Var.m;
                        qgg.h0(obj);
                        mqsVar3 = mqsVar4;
                        String str22 = cca.k;
                        kijVar = (kij) ccaVar.e.getValue();
                        String str32 = mqsVar3.a;
                        synchronized (kijVar) {
                            str32.getClass();
                            if (((gba) kijVar.a.remove(str32)) != null) {
                                kijVar.a();
                            }
                        }
                        return Unit.a;
                    }
                    z2 = ak1Var.k;
                    mqsVar3 = (mqs) ak1Var.m;
                    qgg.h0(obj);
                    if (z2) {
                        String str4 = cca.k;
                        ((wo6) ccaVar.g.getValue()).b(mqsVar3);
                        e6q e6qVar = (e6q) ccaVar.f.getValue();
                        ak1Var.n = null;
                        ak1Var.m = mqsVar3;
                        ak1Var.k = z2;
                        ak1Var.l = 5;
                        if (e6qVar.a(ak1Var) != nm6Var4) {
                            mqsVar4 = mqsVar3;
                            mqsVar3 = mqsVar4;
                        }
                        return nm6Var4;
                    }
                    String str222 = cca.k;
                    kijVar = (kij) ccaVar.e.getValue();
                    String str322 = mqsVar3.a;
                    synchronized (kijVar) {
                    }
                }
                if (((Boolean) a).booleanValue()) {
                    String str5 = cca.k;
                    ((taa) ((raa) ccaVar.d.getValue())).a();
                    x0q x0qVar2 = ccaVar.j;
                    qaa qaaVar2 = new qaa(mqsVar.a, false);
                    ak1Var.n = null;
                    ak1Var.m = null;
                    ak1Var.l = 2;
                    break;
                } else {
                    xdr xdrVar2 = saa.a;
                    zvs zvsVar = new zvs(mqsVar.a);
                    nxs nxsVar = mqsVar.B;
                    if (nxsVar != null) {
                        String str6 = cca.k;
                        ccaVar.getClass();
                        pxsVar = new pxs(nxsVar.a, nxsVar.b);
                    } else {
                        pxsVar = null;
                    }
                    ak1Var.n = null;
                    ak1Var.m = mqsVar;
                    ak1Var.l = 3;
                    String str7 = cca.k;
                    a2 = ccaVar.a(zvsVar, gbaVar, pxsVar, ak1Var);
                    break;
                }
                return nm6Var4;
            case 4:
                jtm jtmVar = (jtm) ak1Var.m;
                nm6 nm6Var5 = nm6.a;
                int i8 = ak1Var.l;
                if (i8 == 0) {
                    qgg.h0(obj);
                    eno s02 = szf.s0(new axb((sdr) ak1Var.n, ak1Var.k, (fvf) ak1Var.o));
                    iwb iwbVar = new iwb(jtmVar, 3);
                    ak1Var.m = null;
                    ak1Var.l = 1;
                    if (s02.collect(iwbVar, ak1Var) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i9 = ak1Var.l;
                if (i9 != 0) {
                    if (i9 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                JSONArray jSONArray = new JSONArray();
                for (zl2 zl2Var : (List) ak1Var.m) {
                    jSONArray.put(new JSONObject().put("bankName", zl2Var.a).put("logoURL", zl2Var.b).put("scheme", zl2Var.c).put("isFavorite", zl2Var.d).put("isInstalled", zl2Var.e));
                }
                sfm sfmVar = new sfm(dq8.BANK_SELECT, new JSONObject(uah.e(new Pair("banks", jSONArray), new Pair("shouldShowLegal", Boolean.valueOf(ak1Var.k)))), 2);
                vx6 vx6Var = (vx6) ak1Var.n;
                sfg sfgVar = (sfg) vx6Var.d;
                qc9 qc9Var = (qc9) ak1Var.o;
                lx4 lx4Var = new lx4(vx6Var, (List) ak1Var.m, ak1Var.k, qc9Var, (Continuation) null);
                ak1Var.l = 1;
                Object a7 = sfgVar.a(qc9Var, sfmVar, lx4Var, ak1Var);
                return a7 == nm6Var6 ? nm6Var6 : a7;
            case 6:
                ivd ivdVar2 = (ivd) ak1Var.o;
                mm6 mm6Var = (mm6) ak1Var.n;
                nm6 nm6Var7 = nm6.a;
                int i10 = ak1Var.l;
                if (i10 == 0) {
                    qgg.h0(obj);
                    boolean z8 = ak1Var.k;
                    String str8 = ivdVar2.a;
                    Context context = ivdVar2.d;
                    pce pceVar = new pce(context);
                    pceVar.c = str8;
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f2 = displayMetrics.widthPixels;
                    float f3 = displayMetrics.density;
                    int b = eeh.b(((Number) yhn.i(Float.valueOf(Math.max((displayMetrics.heightPixels / f3) - 200, (f2 / f3) - 104)), Float.valueOf(96.0f), z8 ? Float.valueOf(320.0f) : null)).floatValue() * displayMetrics.density);
                    pceVar.e(new lmq(new q38(b), new q38(b)));
                    rce a8 = pceVar.a();
                    cce cceVar = ivdVar2.e;
                    ak1Var.n = mm6Var;
                    ak1Var.m = ivdVar2;
                    ak1Var.l = 1;
                    a3 = cceVar.a(a8, ak1Var);
                    if (a3 == nm6Var7) {
                        return nm6Var7;
                    }
                    ivdVar = ivdVar2;
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ivdVar = (ivd) ak1Var.m;
                    qgg.h0(obj);
                    a3 = obj;
                }
                sce sceVar = (sce) a3;
                ivdVar.j.setValue(ivd.e(ivdVar, sceVar));
                if (sceVar instanceof bqr) {
                    x97.y(mm6Var, null, null, new akc(ivdVar2, continuation, 18), 3);
                    if (ivdVar2.g == null) {
                        x97.y(mm6Var, null, null, new hvd(ivdVar2, continuation, i2), 3);
                    }
                }
                return Unit.a;
            case 7:
                ltf ltfVar = (ltf) ak1Var.m;
                nm6 nm6Var8 = nm6.a;
                int i11 = ak1Var.l;
                try {
                    if (i11 == 0) {
                        qgg.h0(obj);
                        if (ak1Var.k) {
                            fk0 fk0Var = ltfVar.p;
                            Float f4 = new Float(0.0f);
                            ak1Var.l = 1;
                            if (fk0Var.f(f4, ak1Var) == nm6Var8) {
                                return nm6Var8;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            int i12 = ltf.t;
                            ltfVar.d(false);
                            return Unit.a;
                        }
                        qgg.h0(obj);
                    }
                    fk0 fk0Var2 = ltfVar.p;
                    Float f5 = new Float(1.0f);
                    wdc wdcVar = (wdc) ak1Var.n;
                    ktf ktfVar = new ktf((xod) ak1Var.o, ltfVar, z4 ? 1 : 0);
                    ak1Var.l = 2;
                    break;
                } catch (Throwable th) {
                    int i13 = ltf.t;
                    ltfVar.d(false);
                    throw th;
                }
            case 8:
                bwg bwgVar = (bwg) ak1Var.n;
                mm6 mm6Var2 = (mm6) ak1Var.m;
                nm6 nm6Var9 = nm6.a;
                int i14 = ak1Var.l;
                if (i14 == 0) {
                    qgg.h0(obj);
                    mn7 mn7Var = dm6.b;
                    vvg vvgVar = new vvg((kwg) ak1Var.o, bwgVar, null);
                    ak1Var.m = mm6Var2;
                    ak1Var.l = 1;
                    V = x97.V(mn7Var, vvgVar, ak1Var);
                    if (V == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    V = obj;
                }
                nu1 nu1Var = (nu1) V;
                if (nu1Var == null) {
                    bwgVar.h(null);
                    return Unit.a;
                }
                boolean z9 = ak1Var.k;
                t3g t3gVar = bwgVar.a;
                if (z9) {
                    t3gVar.r(nu1Var);
                } else {
                    t3gVar.y(nu1Var);
                }
                return Unit.a;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i15 = ak1Var.l;
                if (i15 == 0) {
                    qgg.h0(obj);
                    fk0 fk0Var3 = (fk0) ak1Var.m;
                    Float f6 = new Float(ak1Var.k ? 1.0f : 0.0f);
                    act actVar = (act) ak1Var.n;
                    ak1Var.l = 1;
                    if (fk0.c(fk0Var3, f6, actVar, null, ak1Var, 12) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ((Function0) ak1Var.o).invoke();
                return Unit.a;
            case 10:
                bve bveVar = (bve) ak1Var.o;
                e8s e8sVar = (e8s) ak1Var.n;
                nm6 nm6Var11 = nm6.a;
                int i16 = ak1Var.l;
                if (i16 == 0) {
                    qgg.h0(obj);
                    if (ak1Var.k && e8sVar.x) {
                        z4 = true;
                    }
                    k5r.v("start purchase, oneClickEnabled=", z4, 4, "TariffPaywallViewModelImpl", null);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(d7s.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    lik likVar = e8sVar.o;
                    bveVar.getClass();
                    likVar.getClass();
                    evjVar = new evj(bveVar, z4, likVar);
                    ((qdk) ((jyr) evjVar.b).getValue()).c();
                    sek sekVar = (sek) ((jyr) evjVar.d).getValue();
                    ArrayList arrayList = bveVar.p.c;
                    vek vekVar = (vek) sekVar;
                    vekVar.getClass();
                    vekVar.a(xgr.o, null, arrayList);
                    ((lkj) ((kkj) ((jyr) evjVar.f).getValue())).a(bveVar);
                    l7s l7sVar = e8sVar.m;
                    ak1Var.m = evjVar;
                    ak1Var.l = 1;
                    a4 = ((k5m) l7sVar.a.getValue()).c().a(new zfk(bveVar, z4), ak1Var);
                    if (a4 == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    evj evjVar2 = (evj) ak1Var.m;
                    qgg.h0(obj);
                    evjVar = evjVar2;
                    a4 = obj;
                }
                sgk sgkVar = (sgk) a4;
                if (sgkVar instanceof rgk) {
                    ssg.a(4, "TariffPaywallViewModelImpl", "purchase success", null);
                    ((qdk) ((jyr) evjVar.b).getValue()).d();
                    ((udk) ((jyr) evjVar.e).getValue()).a();
                    sek sekVar2 = (sek) ((jyr) evjVar.d).getValue();
                    ArrayList arrayList2 = ((bve) evjVar.c).p.c;
                    vek vekVar2 = (vek) sekVar2;
                    vekVar2.getClass();
                    vekVar2.a(xgr.r, null, arrayList2);
                } else if (Intrinsics.d(sgkVar, pgk.a)) {
                    ssg.a(4, "TariffPaywallViewModelImpl", "purchase cancel", null);
                    ((qdk) ((jyr) evjVar.b).getValue()).a();
                    sek sekVar3 = (sek) ((jyr) evjVar.d).getValue();
                    ArrayList arrayList3 = ((bve) evjVar.c).p.c;
                    vek vekVar3 = (vek) sekVar3;
                    vekVar3.getClass();
                    vekVar3.a(xgr.q, null, arrayList3);
                } else {
                    if (!(sgkVar instanceof qgk)) {
                        b6e.s();
                        return null;
                    }
                    lgb lgbVar = ((qgk) sgkVar).a;
                    ssg.a(4, "TariffPaywallViewModelImpl", "purchase error: " + lgbVar, null);
                    evjVar.getClass();
                    ((qdk) ((jyr) evjVar.b).getValue()).b(lg3.v0(lgbVar), lgbVar.b);
                    sek sekVar4 = (sek) ((jyr) evjVar.d).getValue();
                    String lgbVar2 = lgbVar.toString();
                    ArrayList arrayList4 = ((bve) evjVar.c).p.c;
                    vek vekVar4 = (vek) sekVar4;
                    vekVar4.getClass();
                    vekVar4.a(xgr.p, lgbVar2, arrayList4);
                }
                return Unit.a;
            case 11:
                aqi aqiVar = (aqi) ak1Var.n;
                nm6 nm6Var12 = nm6.a;
                int i17 = ak1Var.l;
                if (i17 == 0) {
                    qgg.h0(obj);
                    rqm rqmVar = (rqm) aqiVar.getValue();
                    if (rqmVar != null) {
                        boolean z10 = ak1Var.k;
                        uoi uoiVar = (uoi) ak1Var.o;
                        tre sqmVar = z10 ? new sqm(rqmVar) : new qqm(rqmVar);
                        if (uoiVar != null) {
                            ak1Var.m = aqiVar;
                            ak1Var.l = 1;
                            if (uoiVar.a(sqmVar, ak1Var) == nm6Var12) {
                                return nm6Var12;
                            }
                        }
                    }
                    return Unit.a;
                }
                if (i17 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aqiVar = (aqi) ak1Var.m;
                qgg.h0(obj);
                aqiVar.setValue(null);
                return Unit.a;
            case 12:
                qju qjuVar = (qju) ak1Var.m;
                nm6 nm6Var13 = nm6.a;
                int i18 = ak1Var.l;
                if (i18 == 0) {
                    qgg.h0(obj);
                    l18 l18Var2 = l18.b;
                    bdt I2 = hag.I(byb.class);
                    qdc qdcVar2 = l18Var2.a;
                    qdcVar2.getClass();
                    if (!((Boolean) ((xdr) ((bqi) ((rju) ((byb) qdcVar2.C(I2)).b(rju.class)).e.getValue())).getValue()).booleanValue()) {
                        return Unit.a;
                    }
                    ssg.a(3, "VpnGateActivityCallbacks", "onActivityResumed try call showVpnBlockerIfNeeded", null);
                    n6p n6pVar = new n6p(qjuVar, (hn5) ak1Var.o, continuation, 24);
                    mn7 mn7Var2 = dm6.b;
                    ak1Var.l = 1;
                    V2 = x97.V(mn7Var2, n6pVar, ak1Var);
                    break;
                } else {
                    if (i18 != 1) {
                        if (i18 != 2) {
                            if (i18 == 3) {
                                qgg.h0(obj);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z11 = ak1Var.k;
                        qgg.h0(obj);
                        booleanValue = z11;
                        i0 = obj;
                        xxq xxqVar = (xxq) i0;
                        if (xxqVar == null || !xxqVar.a()) {
                            return Unit.a;
                        }
                        q0 q0Var = (q0) ((WeakReference) ak1Var.n).get();
                        if (q0Var != null) {
                            ak1Var.k = booleanValue;
                            ak1Var.l = 3;
                            break;
                        }
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    V2 = obj;
                }
                booleanValue = ((Boolean) V2).booleanValue();
                if (booleanValue) {
                    return Unit.a;
                }
                pjc g2 = ((frt) qjuVar.b.getValue()).g();
                ak1Var.k = booleanValue;
                ak1Var.l = 2;
                i0 = zsd.i0(g2, ak1Var);
                break;
            case 13:
                boolean z12 = ak1Var.k;
                s9p s9pVar = (s9p) ak1Var.o;
                hxu hxuVar2 = (hxu) ak1Var.n;
                nm6 nm6Var14 = nm6.a;
                switch (ak1Var.l) {
                    case 0:
                        qgg.h0(obj);
                        eu7 eu7Var = hxuVar2.a;
                        e5q e5qVar = hxuVar2.b;
                        if (!(e5qVar instanceof u4q)) {
                            if (!(e5qVar instanceof s4q)) {
                                hxuVar = hxuVar2;
                                if (!(e5qVar instanceof w4q)) {
                                    if (!(e5qVar instanceof y4q)) {
                                        if (!(e5qVar instanceof b5q)) {
                                            b6e.s();
                                            return null;
                                        }
                                        fmu fmuVar = hxuVar.g;
                                        ak1Var.l = 6;
                                        a5 = fmuVar.a(eu7Var, ak1Var);
                                        break;
                                    } else {
                                        eu7 eu7Var2 = hxuVar.a;
                                        gxu gxuVar = new gxu(hxuVar, continuation, i2);
                                        ak1Var.l = 5;
                                        Q = gld.Q(new inr(hxuVar, (a5q) e5qVar, gxuVar, eu7Var2, (Continuation) null), ak1Var);
                                        break;
                                    }
                                } else {
                                    eu7 eu7Var3 = hxuVar.a;
                                    w90 w90Var = new w90(s9pVar, hxuVar, continuation, 19);
                                    ak1Var.l = 4;
                                    Q2 = gld.Q(new inr(hxuVar, (a5q) e5qVar, w90Var, eu7Var3, (Continuation) null), ak1Var);
                                    break;
                                }
                            } else {
                                gxu gxuVar2 = new gxu(hxuVar2, continuation, i3);
                                ak1Var.l = 3;
                                hxuVar = hxuVar2;
                                Q3 = gld.Q(new vn1(z12, hxuVar, (q4q) e5qVar, gxuVar2, (Continuation) null), ak1Var);
                                break;
                            }
                        } else if (s9pVar != null) {
                            u4v u4vVar = new u4v(s9pVar, hxuVar2.i);
                            ak1Var.l = 1;
                            f = hxu.f(hxuVar2, eu7Var, u4vVar, ak1Var);
                            break;
                        } else {
                            gxu gxuVar3 = new gxu(hxuVar2, continuation, z4 ? 1 : 0);
                            ak1Var.l = 2;
                            Q4 = gld.Q(new vn1(z12, hxuVar2, (q4q) e5qVar, gxuVar3, (Continuation) null), ak1Var);
                            break;
                        }
                        return nm6Var14;
                    case 1:
                        qgg.h0(obj);
                        f = obj;
                        qxuVar = (qxu) f;
                        hxuVar = hxuVar2;
                        if (!(qxuVar instanceof pxu) || (qxuVar instanceof oxu) || (qxuVar instanceof nxu) || (qxuVar instanceof jxu) || (qxuVar instanceof lxu)) {
                            jzi jziVar = hxuVar.c;
                            ak1Var.m = qxuVar;
                            ak1Var.l = 8;
                            break;
                        } else if (!(qxuVar instanceof kxu)) {
                            b6e.s();
                            return null;
                        }
                        return qxuVar;
                    case 2:
                        qgg.h0(obj);
                        Q4 = obj;
                        qxuVar = (qxu) Q4;
                        hxuVar = hxuVar2;
                        if (qxuVar instanceof pxu) {
                            break;
                        }
                        jzi jziVar2 = hxuVar.c;
                        ak1Var.m = qxuVar;
                        ak1Var.l = 8;
                        break;
                    case 3:
                        qgg.h0(obj);
                        Q3 = obj;
                        hxuVar = hxuVar2;
                        qxuVar = (qxu) Q3;
                        if (qxuVar instanceof pxu) {
                        }
                        jzi jziVar22 = hxuVar.c;
                        ak1Var.m = qxuVar;
                        ak1Var.l = 8;
                        break;
                    case 4:
                        qgg.h0(obj);
                        Q2 = obj;
                        hxuVar = hxuVar2;
                        qxuVar = (qxu) Q2;
                        if (qxuVar instanceof pxu) {
                        }
                        jzi jziVar222 = hxuVar.c;
                        ak1Var.m = qxuVar;
                        ak1Var.l = 8;
                        break;
                    case 5:
                        qgg.h0(obj);
                        Q = obj;
                        hxuVar = hxuVar2;
                        qxuVar = (qxu) Q;
                        if (qxuVar instanceof pxu) {
                        }
                        jzi jziVar2222 = hxuVar.c;
                        ak1Var.m = qxuVar;
                        ak1Var.l = 8;
                        break;
                    case 6:
                        qgg.h0(obj);
                        a5 = obj;
                        hxuVar = hxuVar2;
                        dmu dmuVar = (dmu) a5;
                        if (!(dmuVar instanceof cmu)) {
                            if (!(dmuVar instanceof bmu)) {
                                b6e.s();
                                return null;
                            }
                            bmu bmuVar = (bmu) dmuVar;
                            qxuVar = new nxu(bmuVar.a, bmuVar.b, bmuVar.c);
                            if (qxuVar instanceof pxu) {
                            }
                            jzi jziVar22222 = hxuVar.c;
                            ak1Var.m = qxuVar;
                            ak1Var.l = 8;
                            break;
                        } else {
                            jyr b2 = btf.b(new jvu(i3, (cmu) dmuVar));
                            e5q e5qVar2 = hxuVar.b;
                            y4q y4qVar = new y4q(new wnu(b2, ((b5q) e5qVar2).a.a), ((b5q) e5qVar2).b);
                            eu7 eu7Var4 = hxuVar.a;
                            eu7 z13 = n7w.z(eu7Var4, eu7Var4.b.a);
                            v4v h = hxu.h(hxuVar, y4qVar);
                            gxc i19 = hxuVar.i();
                            pfn o = hxuVar.o();
                            ak1Var.m = null;
                            ak1Var.l = 7;
                            k = hxuVar.k(z13, h, o, i19, true, ak1Var);
                            ak1Var = ak1Var;
                            break;
                        }
                        break;
                    case 7:
                        qgg.h0(obj);
                        k = obj;
                        hxuVar = hxuVar2;
                        b5v b5vVar = (b5v) k;
                        if (b5vVar instanceof a5v) {
                            a5v a5vVar = (a5v) b5vVar;
                            qxuVar = new pxu(a5vVar.a, a5vVar.b, false);
                        } else {
                            if (!(b5vVar instanceof z4v)) {
                                b6e.s();
                                return null;
                            }
                            qxuVar = new jxu(((z4v) b5vVar).a);
                        }
                        if (qxuVar instanceof pxu) {
                        }
                        jzi jziVar222222 = hxuVar.c;
                        ak1Var.m = qxuVar;
                        ak1Var.l = 8;
                        break;
                    case 8:
                        qxu qxuVar2 = (qxu) ak1Var.m;
                        qgg.h0(obj);
                        return qxuVar2;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 14:
                yk3 yk3Var = (yk3) ak1Var.o;
                nm6 nm6Var15 = nm6.a;
                int i20 = ak1Var.l;
                if (i20 == 0) {
                    qgg.h0(obj);
                    stationId = (StationId) yk3Var.d;
                    boolean z14 = yk3Var.a;
                    gxc gxcVar2 = (gxc) yk3Var.e;
                    ?? r6 = (aur) yk3Var.c;
                    ak1Var.m = stationId;
                    ak1Var.n = gxcVar2;
                    ak1Var.k = z14;
                    ak1Var.l = 1;
                    invoke = r6.invoke(ak1Var);
                    if (invoke == nm6Var15) {
                        return nm6Var15;
                    }
                    z3 = z14;
                    gxcVar = gxcVar2;
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z15 = ak1Var.k;
                    gxc gxcVar3 = (gxc) ak1Var.n;
                    stationId = (StationId) ak1Var.m;
                    qgg.h0(obj);
                    invoke = obj;
                    z3 = z15;
                    gxcVar = gxcVar3;
                }
                return new jow(stationId, (e5d) invoke, gxcVar, z3, ((zzp) yk3Var.b).b());
            case 15:
                mm6 mm6Var3 = (mm6) ak1Var.m;
                nm6 nm6Var16 = nm6.a;
                int i21 = ak1Var.l;
                if (i21 != 0) {
                    if (i21 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ArrayList H = CollectionsKt.H((List) ak1Var.n, 400);
                ArrayList arrayList5 = new ArrayList(v75.o(H, 10));
                Iterator it = H.iterator();
                while (it.hasNext()) {
                    arrayList5.add(x97.p(mm6Var3, dm6.b, null, new s32((List) it.next(), null, (jkw) ak1Var.o, ak1Var.k), 2));
                }
                ak1Var.m = null;
                ak1Var.l = 1;
                Object v = ox6.v(arrayList5, ak1Var);
                return v == nm6Var16 ? nm6Var16 : v;
            default:
                o oVar = (o) ak1Var.o;
                j jVar = (j) ak1Var.n;
                xdr xdrVar3 = jVar.n;
                nm6 nm6Var17 = nm6.a;
                int i22 = 1112;
                switch (ak1Var.l) {
                    case 0:
                        qgg.h0(obj);
                        d dVar = d.b;
                        ak1Var.l = 1;
                        xdrVar3.getClass();
                        xdrVar3.m(null, dVar);
                        break;
                    case 1:
                        qgg.h0(obj);
                        o2 o2Var = jVar.l;
                        m2 m2Var = new m2(b.L(oVar.b), oVar.c, oVar.d, "managing_plus_devices");
                        ak1Var.l = 2;
                        g = o2Var.g(m2Var, ak1Var);
                        break;
                    case 2:
                        qgg.h0(obj);
                        g = obj;
                        obj2 = ((z7o) g).a;
                        boolean z16 = ak1Var.k;
                        if (!(obj2 instanceof t7o)) {
                            if (((Boolean) obj2).booleanValue()) {
                                c cVar = new c(-1);
                                ak1Var.m = obj2;
                                ak1Var.l = 3;
                                xdrVar3.getClass();
                                xdrVar3.m(null, cVar);
                                break;
                            } else if (z16) {
                                ak1Var.m = obj2;
                                ak1Var.l = 4;
                                break;
                            } else {
                                c cVar2 = new c(1112);
                                ak1Var.m = obj2;
                                ak1Var.l = 5;
                                xdrVar3.getClass();
                                xdrVar3.m(null, cVar2);
                                break;
                            }
                            obj2 = r0;
                        }
                        a6 = z7o.a(obj2);
                        if (a6 != null) {
                            if (a6 instanceof e) {
                                i22 = 1111;
                            } else if ((a6 instanceof a) || (a6 instanceof com.yandex.passport.api.exception.b)) {
                                i22 = NetworkRequestException.EXPIRED_SIGNATURE;
                            }
                            c cVar3 = new c(i22);
                            ak1Var.m = obj2;
                            ak1Var.l = 6;
                            xdrVar3.getClass();
                            xdrVar3.m(null, cVar3);
                            break;
                        }
                        return Unit.a;
                    case 3:
                    case 4:
                    case 5:
                        Object obj3 = ak1Var.m;
                        qgg.h0(obj);
                        obj2 = obj3;
                        a6 = z7o.a(obj2);
                        if (a6 != null) {
                        }
                        return Unit.a;
                    case 6:
                        qgg.h0(obj);
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ak1(int i, Object obj, Object obj2, Object obj3, Continuation continuation, boolean z) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.k = z;
        this.n = obj2;
        this.o = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak1(ivd ivdVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.j = 6;
        this.o = ivdVar;
        this.k = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ak1(sdr sdrVar, boolean z, Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = sdrVar;
        this.k = z;
        this.o = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak1(qju qjuVar, WeakReference weakReference, hn5 hn5Var, Continuation continuation) {
        super(2, continuation);
        this.j = 12;
        this.m = qjuVar;
        this.n = weakReference;
        this.o = hn5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ak1(Object obj, Object obj2, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
        this.o = obj2;
        this.k = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ak1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.o = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak1(List list, Continuation continuation, jkw jkwVar, boolean z) {
        super(2, continuation);
        this.j = 15;
        this.n = list;
        this.o = jkwVar;
        this.k = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak1(boolean z, ltf ltfVar, wdc wdcVar, xod xodVar, Continuation continuation) {
        super(2, continuation);
        this.j = 7;
        this.k = z;
        this.m = ltfVar;
        this.n = wdcVar;
        this.o = xodVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ak1(boolean z, Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = z;
        this.n = obj;
        this.o = obj2;
    }
}
