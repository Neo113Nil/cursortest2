package defpackage;

import android.app.ActivityManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Process;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.t;
import com.yandex.pulse.metrics.o;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.concert.ConcertActivity;
import ru.yandex.music.emergency.EmergencyService;

/* loaded from: classes4.dex */
public final /* synthetic */ class vd implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vd(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        iuk iukVar;
        duk dukVar;
        String str;
        wjb wjbVar;
        RandomAccessFile randomAccessFile;
        FileLock lock;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Pair pair;
        int i = 21;
        int i2 = 3;
        boolean z = false;
        r10 = false;
        boolean z2 = false;
        z = false;
        z = false;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                return new i3((tmb) this.b, (wn5) this.c, (ud) this.d);
            case 1:
                fk0 fk0Var = (fk0) this.b;
                aqi aqiVar = (aqi) this.c;
                aqi aqiVar2 = (aqi) this.d;
                ges gesVar = (ges) aqiVar.getValue();
                ges gesVar2 = (ges) aqiVar2.getValue();
                float floatValue = ((Number) fk0Var.e()).floatValue();
                bcs bcsVar = zbs.a;
                c4r c4rVar = gesVar.a;
                c4r c4rVar2 = gesVar2.a;
                bcs bcsVar2 = d4r.d;
                ccs ccsVar = ccs.c;
                bcs bcsVar3 = c4rVar.a;
                bcs bcsVar4 = c4rVar2.a;
                boolean z3 = bcsVar3 instanceof ci3;
                if (!z3 && !(bcsVar4 instanceof ci3)) {
                    long M = c3x.M(bcsVar3.a(), bcsVar4.a(), floatValue);
                    if (M != 16) {
                        bcsVar = new y95(M);
                    }
                } else if (z3 && (bcsVar4 instanceof ci3)) {
                    ci3 ci3Var = (ci3) bcsVar3;
                    ci3 ci3Var2 = (ci3) bcsVar4;
                    ai3 ai3Var = (ai3) d4r.b(floatValue, ci3Var.a, ci3Var2.a);
                    float I = fxf.I(ci3Var.b, ci3Var2.b, floatValue);
                    if (ai3Var != null) {
                        if (ai3Var instanceof f3r) {
                            long D = tyf.D(I, ((f3r) ai3Var).a);
                            if (D != 16) {
                                bcsVar = new y95(D);
                            }
                        } else {
                            if (!(ai3Var instanceof ltp)) {
                                b6e.s();
                                return null;
                            }
                            bcsVar = new ci3((ltp) ai3Var, I);
                        }
                    }
                } else {
                    bcsVar = (bcs) d4r.b(floatValue, bcsVar3, bcsVar4);
                }
                bcs bcsVar5 = bcsVar;
                qpc qpcVar = (qpc) d4r.b(floatValue, c4rVar.f, c4rVar2.f);
                long c = d4r.c(c4rVar.b, c4rVar2.b, floatValue);
                tqc tqcVar = c4rVar.c;
                if (tqcVar == null) {
                    tqcVar = tqc.m;
                }
                tqc tqcVar2 = c4rVar2.c;
                if (tqcVar2 == null) {
                    tqcVar2 = tqc.m;
                }
                tqc tqcVar3 = new tqc(yhn.d(fxf.K(tqcVar.a, floatValue, tqcVar2.a), 1, 1000));
                oqc oqcVar = (oqc) d4r.b(floatValue, c4rVar.d, c4rVar2.d);
                pqc pqcVar = (pqc) d4r.b(floatValue, c4rVar.e, c4rVar2.e);
                String str2 = (String) d4r.b(floatValue, c4rVar.g, c4rVar2.g);
                long c2 = d4r.c(c4rVar.h, c4rVar2.h, floatValue);
                wu2 wu2Var = c4rVar.i;
                float f = wu2Var != null ? wu2Var.a : 0.0f;
                wu2 wu2Var2 = c4rVar2.i;
                float I2 = fxf.I(f, wu2Var2 != null ? wu2Var2.a : 0.0f, floatValue);
                ccs ccsVar2 = c4rVar.j;
                if (ccsVar2 == null) {
                    ccsVar2 = ccsVar;
                }
                ccs ccsVar3 = c4rVar2.j;
                if (ccsVar3 != null) {
                    ccsVar = ccsVar3;
                }
                ccs ccsVar4 = new ccs(fxf.I(ccsVar2.a, ccsVar.a, floatValue), fxf.I(ccsVar2.b, ccsVar.b, floatValue));
                bqg bqgVar = (bqg) d4r.b(floatValue, c4rVar.k, c4rVar2.k);
                long M2 = c3x.M(c4rVar.l, c4rVar2.l, floatValue);
                aas aasVar = (aas) d4r.b(floatValue, c4rVar.m, c4rVar2.m);
                otp otpVar = c4rVar.n;
                if (otpVar == null) {
                    otpVar = new otp();
                }
                otp otpVar2 = c4rVar2.n;
                if (otpVar2 == null) {
                    otpVar2 = new otp();
                }
                otp otpVar3 = new otp(c3x.M(otpVar.a, otpVar2.a, floatValue), swf.W(otpVar.b, otpVar2.b, floatValue), fxf.I(otpVar.c, otpVar2.c, floatValue));
                iuk iukVar2 = c4rVar.o;
                iuk iukVar3 = c4rVar2.o;
                if (iukVar2 == null && iukVar3 == null) {
                    iukVar = null;
                } else {
                    if (iukVar2 == null) {
                        iukVar2 = iuk.a;
                    }
                    iukVar = iukVar2;
                }
                c4r c4rVar3 = new c4r(bcsVar5, c, tqcVar3, oqcVar, pqcVar, qpcVar, str2, c2, new wu2(I2), ccsVar4, bqgVar, M2, aasVar, otpVar3, iukVar, (kpa) d4r.b(floatValue, c4rVar.p, c4rVar2.p));
                x5k x5kVar = gesVar.b;
                x5k x5kVar2 = gesVar2.b;
                int i3 = y5k.b;
                int i4 = ((o9s) d4r.b(floatValue, new o9s(x5kVar.a), new o9s(x5kVar2.a))).a;
                int i5 = ((fas) d4r.b(floatValue, new fas(x5kVar.b), new fas(x5kVar2.b))).a;
                long c3 = d4r.c(x5kVar.c, x5kVar2.c, floatValue);
                fcs fcsVar = x5kVar.d;
                if (fcsVar == null) {
                    fcsVar = fcs.c;
                }
                fcs fcsVar2 = x5kVar2.d;
                if (fcsVar2 == null) {
                    fcsVar2 = fcs.c;
                }
                fcs fcsVar3 = new fcs(d4r.c(fcsVar.a, fcsVar2.a, floatValue), d4r.c(fcsVar.b, fcsVar2.b, floatValue));
                duk dukVar2 = x5kVar.e;
                duk dukVar3 = x5kVar2.e;
                duk dukVar4 = duk.b;
                if (dukVar2 == null && dukVar3 == null) {
                    dukVar = null;
                } else {
                    if (dukVar2 == null) {
                        dukVar2 = dukVar4;
                    }
                    boolean z4 = dukVar2.a;
                    if (dukVar3 == null) {
                        dukVar3 = dukVar4;
                    }
                    boolean z5 = dukVar3.a;
                    if (z4 == z5) {
                        dukVar = dukVar2;
                    } else {
                        ((e4b) d4r.b(floatValue, new e4b(), new e4b())).getClass();
                        dukVar = new duk(0, ((Boolean) d4r.b(floatValue, Boolean.valueOf(z4), Boolean.valueOf(z5))).booleanValue());
                    }
                }
                return new ges(c4rVar3, new x5k(i4, i5, c3, fcsVar3, dukVar, (h6g) d4r.b(floatValue, x5kVar.f, x5kVar2.f), ((u5g) d4r.b(floatValue, new u5g(x5kVar.g), new u5g(x5kVar2.g))).a, ((f8e) d4r.b(floatValue, new f8e(x5kVar.h), new f8e(x5kVar2.h))).a, (lds) d4r.b(floatValue, x5kVar.i, x5kVar2.i)));
            case 2:
                return new i3((p31) this.d, (tmb) this.b, (wn5) this.c);
            case 3:
                k61 k61Var = (k61) this.b;
                m7a m7aVar = (m7a) this.c;
                spd spdVar = (spd) this.d;
                k61Var.getClass();
                rmb.j(k61Var.a, wjb.Link, vnj.j(m7aVar, spdVar.a, spdVar.b), null, 12);
                jzi jziVar = k61Var.b;
                jyr jyrVar = y7a.a;
                y7a.a((hn5) jziVar.a, m7aVar.a, false);
                return Unit.a;
            case 4:
                return new i3((pk1) this.d, (tmb) this.b, (wn5) this.c);
            case 5:
                ((vm1) this.b).d((String) this.c, (qkl) this.d);
                return Unit.a;
            case 6:
                sp1 sp1Var = (sp1) this.b;
                pp1 pp1Var = (pp1) this.c;
                qkl qklVar = (qkl) this.d;
                h06 h06Var = pp1Var.b;
                sp1Var.getClass();
                sp1Var.a(wjb.ConcertPurchaseScreen, qklVar);
                je1 je1Var = sp1Var.a;
                String str3 = h06Var.h;
                if (str3 != null && (str = (String) avf.R(str3)) != null) {
                    a0g.D(je1Var.a.b, h06Var.a, str);
                }
                return Unit.a;
            case 7:
                xj3 xj3Var = (xj3) this.b;
                t tVar = (t) this.c;
                ix6 ix6Var = (ix6) this.d;
                e00 e00Var = xj3Var.b;
                bdt I3 = hag.I(frt.class);
                qdc qdcVar = e00Var.a;
                qdcVar.getClass();
                frt frtVar = (frt) qdcVar.C(I3);
                e00 e00Var2 = xj3Var.b;
                bdt I4 = hag.I(xrt.class);
                qdc qdcVar2 = e00Var2.a;
                qdcVar2.getClass();
                xrt xrtVar = (xrt) qdcVar2.C(I4);
                Resources resources = tVar.getApplicationContext().getResources();
                resources.getClass();
                return new mk3(frtVar, xrtVar, resources, ix6Var, new r93(i2, xj3Var));
            case 8:
                p04 p04Var = (p04) this.b;
                g01 g01Var = (g01) this.c;
                iz3 iz3Var = (iz3) this.d;
                rmb rmbVar = p04Var.b;
                tz3 tz3Var = (tz3) g01Var.b;
                switch (tz3Var.a) {
                    case 0:
                        wjbVar = tz3Var.e;
                        break;
                    default:
                        wjbVar = tz3Var.e;
                        break;
                }
                rmb.j(rmbVar, wjbVar, null, null, 14);
                iz3Var.i(p04Var.e);
                return Unit.a;
            case 9:
                return new i3((a14) this.b, (jnq) this.c, (q2) this.d);
            case 10:
                String str4 = (String) this.b;
                g24 g24Var = (g24) this.c;
                j54 j54Var = (j54) this.d;
                if (str4 != null && g24Var != null) {
                    j54Var.d(str4, g24Var);
                }
                return Unit.a;
            case 11:
                return szf.g0(new l54((ya0) ((Function0) this.b).invoke(), h4a.s((wn5) this.c, (o14) this.d)));
            case 12:
                return ((Function2) this.b).invoke(((vdr) this.c).getValue(), ((vdr) this.d).getValue());
            case 13:
                ut5 ut5Var = (ut5) this.b;
                ht5 ht5Var = (ht5) this.c;
                spd spdVar2 = (spd) this.d;
                h06 h06Var2 = ht5Var.a;
                ut5Var.getClass();
                rmb.j(ut5Var.d, wjb.ConcertScreen, x97.o(h06Var2, spdVar2), null, 12);
                mt5 mt5Var = ut5Var.a;
                String str5 = h06Var2.a;
                str5.getClass();
                t tVar2 = mt5Var.a;
                int i6 = ConcertActivity.w0;
                tVar2.startActivity(bkp.j0(tVar2, str5, null));
                return Unit.a;
            case 14:
                e00 e00Var3 = (e00) this.b;
                String str6 = (String) this.c;
                kxi kxiVar = (kxi) this.d;
                cvo cvoVar = (cvo) ((bz5) e00Var3.b).f.getValue();
                bdt I5 = hag.I(upq.class);
                qdc qdcVar3 = e00Var3.a;
                qdcVar3.getClass();
                upq upqVar = (upq) qdcVar3.C(I5);
                bdt I6 = hag.I(xpq.class);
                qdc qdcVar4 = e00Var3.a;
                qdcVar4.getClass();
                g06 g06Var = new g06(str6, upqVar, (gnq) qdcVar4.C(I6));
                bdt I7 = hag.I(xpq.class);
                qdc qdcVar5 = e00Var3.a;
                qdcVar5.getClass();
                nnq nnqVar = (nnq) qdcVar5.C(I7);
                bdt I8 = hag.I(l63.class);
                qdc qdcVar6 = e00Var3.a;
                qdcVar6.getClass();
                return new d06(str6, new l06(g06Var, nnqVar, (l63) qdcVar6.C(I8)), cvoVar, kxiVar, e00Var3);
            case 15:
                return new hk6((sk6) this.b, (pyc) ((aqi) this.c).getValue(), (Function1) this.d);
            case 16:
                xqn xqnVar = (xqn) this.b;
                dzf dzfVar = (dzf) this.c;
                gc8 gc8Var = (gc8) this.d;
                xqnVar.a = x97.y(ezf.D(dzfVar), null, null, new g68(gc8Var, continuation, 2), 3);
                n nVar = new n(29, gc8Var);
                WeakHashMap weakHashMap = wdu.a;
                ndu.n(gc8Var, nVar);
                return Unit.a;
            case 17:
                o3a o3aVar = (o3a) this.b;
                ub6 ub6Var = (ub6) this.c;
                ViewGroup viewGroup = (ViewGroup) this.d;
                viewGroup.removeView(ub6Var.o(viewGroup));
                Iterator it = o3aVar.t.iterator();
                while (it.hasNext()) {
                }
                ub6Var.p();
                return Unit.a;
            case 18:
                vka vkaVar = (vka) this.b;
                return new taa(vkaVar.a, (jur) this.c, vkaVar.f, (e6q) vkaVar.d.getValue(), (kij) vkaVar.c.getValue(), (cur) this.d, (xaa) vkaVar.e.getValue());
            case 19:
                return new y3((jnq) this.b, (r1b) this.c, (nha) this.d);
            case 20:
                return new i3((jnq) this.b, (ioq) this.c, (rea) this.d);
            case 21:
                EmergencyService emergencyService = (EmergencyService) this.b;
                File file = (File) this.c;
                Throwable th = (Throwable) this.d;
                Handler handler = (Handler) emergencyService.a.getValue();
                handler.getClass();
                try {
                    File file2 = z2b.b;
                    if (file2 == null) {
                        file2 = new File(emergencyService.getCacheDir(), "lock");
                        z2b.b = file2;
                    }
                    randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        FileChannel channel = randomAccessFile.getChannel();
                        sr7 sr7Var = new sr7(10, channel);
                        handler.postDelayed(sr7Var, 3000L);
                        lock = channel.lock();
                        handler.removeCallbacks(sr7Var);
                    } finally {
                    }
                } catch (Exception e) {
                    Log.d("Emergency", "Fail when check corruption lock.", e);
                    Log.e("Emergency", "Fail when try acquire an exclusive lock, failing to clear data.", e);
                    ActivityManager b = l1b.b(emergencyService);
                    if (b != null) {
                        b.clearApplicationUserData();
                    }
                }
                try {
                    ActivityManager b2 = l1b.b(emergencyService);
                    if (b2 != null && (runningAppProcesses = b2.getRunningAppProcesses()) != null) {
                        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                            if (runningAppProcessInfo.pid != Process.myPid()) {
                                Process.killProcess(runningAppProcessInfo.pid);
                            }
                        }
                    }
                    z2b.a(emergencyService, emergencyService.getDataDir(), file);
                    z2b.a(emergencyService, emergencyService.getExternalCacheDir(), file);
                    randomAccessFile.close();
                    if (th != null) {
                        try {
                            aec.i(emergencyService);
                            kp6 kp6Var = bec.a().a;
                            ((vq6) kp6Var.o.a).d(new cy1(8, kp6Var, "emergency", Boolean.toString(true)));
                            kp6 kp6Var2 = bec.a().a;
                            Map map = Collections.EMPTY_MAP;
                            ((vq6) kp6Var2.o.a).d(new qf0(kp6Var2, th));
                        } catch (Exception unused) {
                        }
                    }
                    emergencyService.stopSelf();
                    return Unit.a;
                } finally {
                    if (lock != null && lock.isValid()) {
                        lock.release();
                    }
                }
            case 22:
                String str7 = (String) this.b;
                upq upqVar2 = (upq) this.c;
                gnq gnqVar = (gnq) this.d;
                hnq hnqVar = hnq.a;
                gnqVar.getClass();
                return new cjf(str7, upqVar2, gnqVar, null, hnqVar, null);
            case 23:
                pzc pzcVar = (pzc) this.b;
                nzc nzcVar = (nzc) this.c;
                s2i s2iVar = (s2i) this.d;
                ssg.a(4, "GRPC.HEAD", nzcVar.b.b + " ---> Starting a call with " + s2iVar.d().size() + " headers:", null);
                if (((Boolean) ((dfw) pzcVar.a.a).invoke()).booleanValue()) {
                    ssg.a(4, "GRPC.BODY", String.valueOf(s2iVar), null);
                }
                return Unit.a;
            case 24:
                pzc pzcVar2 = (pzc) this.b;
                ozc ozcVar = (ozc) this.c;
                s2i s2iVar2 = (s2i) this.d;
                ssg.a(4, "GRPC.HEAD", ozcVar.u.b + " <--- Received " + s2iVar2.d().size() + " headers:", null);
                if (((Boolean) ((dfw) pzcVar2.a.a).invoke()).booleanValue()) {
                    ssg.a(4, "GRPC.BODY", String.valueOf(s2iVar2), null);
                }
                return Unit.a;
            case 25:
                g06 g06Var2 = (g06) this.b;
                t1q t1qVar = (t1q) this.c;
                vhd vhdVar = (vhd) this.d;
                List list = t1qVar.e;
                m1q m1qVar = t1qVar.c;
                long j = vhdVar != null ? vhdVar.e : 0L;
                g06Var2.getClass();
                ssg.a(3, null, "GlagolCastPlaybackConverter: convert track list", null);
                ((e) g06Var2.d).getClass();
                c c4 = e.c();
                List<m1q> list2 = list;
                ArrayList arrayList = new ArrayList();
                for (m1q m1qVar2 : list2) {
                    if (m1qVar2 instanceof c2q) {
                        pair = new Pair(((c2q) m1qVar2).d, m1qVar2.b);
                    } else {
                        if (!(m1qVar2 instanceof e2q) && !(m1qVar2 instanceof j1q)) {
                            b6e.s();
                            return null;
                        }
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return g06.k(g06Var2, c4, arrayList, m1qVar, j);
            case 26:
                aqi aqiVar3 = (aqi) this.b;
                aqi aqiVar4 = (aqi) this.c;
                fvf fvfVar = (fvf) this.d;
                k2s k2sVar = (k2s) aqiVar3.getValue();
                String str8 = (String) aqiVar4.getValue();
                if (k2sVar.b.a.size() > 1 && str8 != null) {
                    List list3 = fvfVar.j().k;
                    if (!list3.isEmpty()) {
                        List list4 = list3;
                        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                            Iterator it2 = list4.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((cvf) it2.next()).l.equals(str8)) {
                                        z2 = true;
                                    }
                                }
                            }
                        }
                        z = !z2;
                    }
                }
                return Boolean.valueOf(z);
            case 27:
                u3e u3eVar = (u3e) this.b;
                u3eVar.h.n(new jcr((mqs) this.c), new q3e(u3eVar, continuation, z ? 1 : 0), u3eVar.i, u3eVar.g.b((thj) this.d), "mobile-own_tracks-playlist-default", new lhd(5, u3eVar), b0l.b, true, new evk(i));
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                w3e w3eVar = (w3e) this.b;
                w3eVar.e.n(new icr(((spd) this.c).c), new r3e(w3eVar, continuation, z ? 1 : 0), w3eVar.f, w3eVar.b.b((thj) this.d), "mobile-downloads_music-track-default", new mvd(6), b0l.b, true, new evk(i));
                return Unit.a;
            default:
                tqn tqnVar = (tqn) this.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.c;
                xd0 xd0Var = (xd0) this.d;
                if (tqnVar.a) {
                    jsg.j().e(r3w.a, "NetworkRequestConstraintController unregister callback");
                    connectivityManager.unregisterNetworkCallback(xd0Var);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ vd(Object obj, tmb tmbVar, wn5 wn5Var, int i) {
        this.a = i;
        this.d = obj;
        this.b = tmbVar;
        this.c = wn5Var;
    }
}
