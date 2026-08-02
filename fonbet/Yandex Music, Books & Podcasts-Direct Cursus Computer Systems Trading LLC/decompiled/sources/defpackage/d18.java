package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import com.yandex.pulse.metrics.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;

/* loaded from: classes.dex */
public final class d18 {
    public boolean a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public d18(ia0 ia0Var) {
        this.b = (vdr) ((jyr) ia0Var.n).getValue();
        this.c = (z66) ia0Var.b;
        this.d = (oq7) ia0Var.e;
        this.e = (e0j) ia0Var.i;
        this.f = (frt) ia0Var.c;
        this.g = (cc7) ia0Var.d;
        this.h = (rw5) ia0Var.l;
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.a = ((yjv) ((byb) qdcVar.C(I)).c(ern.a(yjv.class))).h();
    }

    public static final float a(d18 d18Var, hyo hyoVar, float f) {
        iyo iyoVar = (iyo) d18Var.b;
        long g = iyoVar.g(iyoVar.c(f));
        iyo iyoVar2 = hyoVar.a;
        return iyoVar.f(iyoVar.d(iyo.a(iyoVar2, iyoVar2.j, g, 1)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0122, code lost:
    
        if (r0.invoke(r1, r9) != r10) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(d18 d18Var, iyo iyoVar, efi efiVar, float f, float f2, cg6 cg6Var) {
        ffi ffiVar;
        int i;
        uqn uqnVar;
        d18 d18Var2;
        float f3;
        iyo iyoVar2;
        long s;
        d18Var.getClass();
        if (cg6Var instanceof ffi) {
            ffiVar = (ffi) cg6Var;
            int i2 = ffiVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ffiVar.p = i2 - Integer.MIN_VALUE;
                ffi ffiVar2 = ffiVar;
                Object obj = ffiVar2.n;
                nm6 nm6Var = nm6.a;
                i = ffiVar2.p;
                if (i != 0) {
                    xqn i3 = hrg.i(obj);
                    i3.a = efiVar;
                    d18Var.i(efiVar);
                    efi h = h((zi3) d18Var.f);
                    if (h != null) {
                        d18Var.i(h);
                        i3.a = ((efi) i3.a).a(h);
                    }
                    uqn uqnVar2 = new uqn();
                    float f4 = iyoVar.f(iyoVar.d(((efi) i3.a).a));
                    uqnVar2.a = f4;
                    if (cfi.a(f4)) {
                        return Unit.a;
                    }
                    xqn xqnVar = new xqn();
                    xqnVar.a = wdp.J(0.0f, 0.0f, 30);
                    gfi gfiVar = new gfi(uqnVar2, xqnVar, i3, f, d18Var, f2, iyoVar, null);
                    ffiVar2.j = d18Var;
                    ffiVar2.k = iyoVar;
                    ffiVar2.l = uqnVar2;
                    ffiVar2.m = f2;
                    ffiVar2.p = 1;
                    if (d18Var.j(iyoVar, gfiVar, ffiVar2) != nm6Var) {
                        uqnVar = uqnVar2;
                        d18Var2 = d18Var;
                        f3 = f2;
                        iyoVar2 = iyoVar;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f3 = ffiVar2.m;
                uqnVar = ffiVar2.l;
                iyoVar2 = ffiVar2.k;
                d18Var2 = ffiVar2.j;
                qgg.h0(obj);
                j6e j6eVar = (j6e) d18Var2.h;
                s = bzf.s(((b0u) j6eVar.a).b(Float.MAX_VALUE), ((b0u) j6eVar.b).b(Float.MAX_VALUE));
                if (s == 0) {
                    float c = iyoVar2.c(Math.signum(uqnVar.a)) * Math.min(Math.abs(uqnVar.a) / 100, f3) * 1000;
                    if (c == 0.0f) {
                        s = 0;
                    } else {
                        s = iyoVar2.d == bxj.b ? bzf.s(c, 0.0f) : bzf.s(0.0f, c);
                    }
                }
                tn5 tn5Var = (tn5) d18Var2.d;
                yzt yztVar = new yzt(s);
                ffiVar2.j = null;
                ffiVar2.k = null;
                ffiVar2.l = null;
                ffiVar2.p = 2;
            }
        }
        ffiVar = new ffi(d18Var, cg6Var);
        ffi ffiVar22 = ffiVar;
        Object obj2 = ffiVar22.n;
        nm6 nm6Var2 = nm6.a;
        i = ffiVar22.p;
        if (i != 0) {
        }
        j6e j6eVar2 = (j6e) d18Var2.h;
        s = bzf.s(((b0u) j6eVar2.a).b(Float.MAX_VALUE), ((b0u) j6eVar2.b).b(Float.MAX_VALUE));
        if (s == 0) {
        }
        tn5 tn5Var2 = (tn5) d18Var2.d;
        yzt yztVar2 = new yzt(s);
        ffiVar22.j = null;
        ffiVar22.k = null;
        ffiVar22.l = null;
        ffiVar22.p = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(d18 d18Var, xqn xqnVar, uqn uqnVar, iyo iyoVar, xqn xqnVar2, long j, cg6 cg6Var) {
        hfi hfiVar;
        int i;
        iyo iyoVar2;
        xqn xqnVar3;
        xqn xqnVar4;
        uqn uqnVar2;
        efi efiVar;
        boolean z;
        if (cg6Var instanceof hfi) {
            hfiVar = (hfi) cg6Var;
            int i2 = hfiVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hfiVar.p = i2 - Integer.MIN_VALUE;
                Object obj = hfiVar.o;
                nm6 nm6Var = nm6.a;
                i = hfiVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    if (j < 0) {
                        return Boolean.FALSE;
                    }
                    m1i m1iVar = new m1i(d18Var, null, 5);
                    hfiVar.j = d18Var;
                    hfiVar.k = xqnVar;
                    hfiVar.l = uqnVar;
                    iyoVar2 = iyoVar;
                    hfiVar.m = iyoVar2;
                    xqnVar3 = xqnVar2;
                    hfiVar.n = xqnVar3;
                    hfiVar.p = 1;
                    obj = tyf.L(j, m1iVar, hfiVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    xqnVar4 = xqnVar;
                    uqnVar2 = uqnVar;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xqn xqnVar5 = hfiVar.n;
                    iyo iyoVar3 = hfiVar.m;
                    uqnVar2 = hfiVar.l;
                    xqnVar4 = hfiVar.k;
                    d18 d18Var2 = hfiVar.j;
                    qgg.h0(obj);
                    xqnVar3 = xqnVar5;
                    iyoVar2 = iyoVar3;
                    d18Var = d18Var2;
                }
                efiVar = (efi) obj;
                if (efiVar == null) {
                    boolean z2 = ((efi) xqnVar4.a).c;
                    long j2 = efiVar.a;
                    xqnVar4.a = new efi(z2, j2, efiVar.b);
                    uqnVar2.a = iyoVar2.f(iyoVar2.d(j2));
                    xqnVar3.a = wdp.J(0.0f, 0.0f, 30);
                    d18Var.i(efiVar);
                    z = !cfi.a(uqnVar2.a);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        hfiVar = new hfi(cg6Var);
        Object obj2 = hfiVar.o;
        nm6 nm6Var2 = nm6.a;
        i = hfiVar.p;
        if (i != 0) {
        }
        efiVar = (efi) obj2;
        if (efiVar == null) {
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static efi h(zi3 zi3Var) {
        efi efiVar = null;
        xgp a = dhp.a(new zqc((Object) new ypb(18, zi3Var), (Continuation) (0 == true ? 1 : 0), 3));
        while (a.hasNext()) {
            efi efiVar2 = (efi) a.next();
            if (efiVar != null) {
                efiVar2 = efiVar.a(efiVar2);
            }
            efiVar = efiVar2;
        }
        return efiVar;
    }

    public y7l d() {
        vq1.A(!this.a);
        if (((x7l) this.e) == null) {
            if (((w7l) this.d) == null) {
                this.d = new w7l();
            }
            this.e = new x7l((w7l) this.d);
        }
        y7l y7lVar = new y7l(this);
        this.a = true;
        return y7lVar;
    }

    public FileInputStream e(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((wtm) this.c).e();
            return null;
        }
    }

    public void f(int i, Serializable serializable) {
        ((Executor) this.b).execute(new e02(this, i, serializable, 3));
    }

    public void g() {
        int i;
        yld yldVar = (yld) this.c;
        PackageManager packageManager = (PackageManager) this.e;
        ArrayList arrayList = (ArrayList) this.f;
        if (this.a) {
            ArrayList<ServiceInfo> arrayList2 = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next().serviceInfo);
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it2 = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i2 = 0;
            while (true) {
                boolean z = true;
                if (!it2.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it2.next().serviceInfo;
                if (serviceInfo != null) {
                    if ((krh.c == null ? false : krh.c().f()) && !arrayList2.isEmpty()) {
                        for (ServiceInfo serviceInfo2 : arrayList2) {
                            if (!serviceInfo.packageName.equals(serviceInfo2.packageName) || !serviceInfo.name.equals(serviceInfo2.name)) {
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            i3 = -1;
                            break;
                        }
                        ComponentName componentName = ((jsn) arrayList.get(i3)).i;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i3 < 0) {
                        jsn jsnVar = new jsn((Context) this.b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        jsnVar.p = new h5n(3, this, jsnVar);
                        if (!jsnVar.l) {
                            jsnVar.l = true;
                            jsnVar.m();
                        }
                        i = i2 + 1;
                        arrayList.add(i2, jsnVar);
                        yldVar.a(jsnVar, false);
                    } else if (i3 >= i2) {
                        jsn jsnVar2 = (jsn) arrayList.get(i3);
                        if (!jsnVar2.l) {
                            jsnVar2.l = true;
                            jsnVar2.m();
                        }
                        if (jsnVar2.n == null) {
                            if (!jsnVar2.l || (jsnVar2.e == null && jsnVar2.k.isEmpty())) {
                                z = false;
                            }
                            if (z) {
                                jsnVar2.l();
                                jsnVar2.i();
                            }
                        }
                        i = i2 + 1;
                        Collections.swap(arrayList, i3, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < arrayList.size()) {
                for (int size2 = arrayList.size() - 1; size2 >= i2; size2--) {
                    jsn jsnVar3 = (jsn) arrayList.get(size2);
                    hrh d = yldVar.d(jsnVar3);
                    if (d != null) {
                        jsnVar3.getClass();
                        krh.b();
                        jsnVar3.d = null;
                        jsnVar3.h(null);
                        yldVar.m(d, null);
                        yldVar.a.b(514, d);
                        yldVar.l.remove(d);
                    }
                    arrayList.remove(jsnVar3);
                    jsnVar3.p = null;
                    if (jsnVar3.l) {
                        jsnVar3.l = false;
                        jsnVar3.m();
                    }
                }
            }
        }
    }

    public void i(efi efiVar) {
        j6e j6eVar = (j6e) this.h;
        long j = efiVar.b;
        long j2 = efiVar.a;
        ((b0u) j6eVar.a).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((b0u) j6eVar.b).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(iyo iyoVar, gfi gfiVar, cg6 cg6Var) {
        ifi ifiVar;
        int i;
        d18 d18Var;
        if (cg6Var instanceof ifi) {
            ifiVar = (ifi) cg6Var;
            int i2 = ifiVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ifiVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ifiVar.k;
                nm6 nm6Var = nm6.a;
                i = ifiVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    this.a = true;
                    zig zigVar = new zig(iyoVar, gfiVar, null, 23);
                    ifiVar.j = this;
                    ifiVar.m = 1;
                    if (a4g.O(zigVar, ifiVar) == nm6Var) {
                        return nm6Var;
                    }
                    d18Var = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d18Var = ifiVar.j;
                    qgg.h0(obj);
                }
                d18Var.a = false;
                return Unit.a;
            }
        }
        ifiVar = new ifi(this, cg6Var);
        Object obj2 = ifiVar.k;
        nm6 nm6Var2 = nm6.a;
        i = ifiVar.m;
        if (i != 0) {
        }
        d18Var.a = false;
        return Unit.a;
    }

    public d18(iyo iyoVar, ozw ozwVar, tn5 tn5Var, jx7 jx7Var) {
        this.b = iyoVar;
        this.c = ozwVar;
        this.d = tn5Var;
        this.e = jx7Var;
        this.f = men.g(Integer.MAX_VALUE, 6, null);
        this.h = new j6e(10);
    }

    public d18(Context context, yld yldVar) {
        this.f = new ArrayList();
        this.g = new l83(18, this);
        this.h = new dsd(24, this);
        this.b = context;
        this.c = yldVar;
        this.d = new Handler();
        this.e = context.getPackageManager();
    }

    public d18(udp udpVar, xol xolVar, sfm sfmVar) {
        xolVar.getClass();
        this.b = udpVar;
        this.c = xolVar;
        this.d = sfmVar;
        this.e = gld.e(e.c(a4g.n(), mal.b()));
    }

    public d18(AssetManager assetManager, Executor executor, wtm wtmVar, String str, File file) {
        byte[] bArr;
        this.a = false;
        this.b = executor;
        this.c = wtmVar;
        this.g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            bArr = irf.h;
        } else {
            switch (i) {
                case 24:
                case 25:
                    bArr = irf.l;
                    break;
                case 26:
                    bArr = irf.k;
                    break;
                case 27:
                    bArr = irf.j;
                    break;
                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                case 29:
                case 30:
                    bArr = irf.i;
                    break;
                default:
                    bArr = null;
                    break;
            }
        }
        this.d = bArr;
    }

    public d18(Context context, dbu dbuVar) {
        this.b = context.getApplicationContext();
        this.c = dbuVar;
        ude udeVar = yde.b;
        this.f = qsn.e;
        this.g = wvo.i;
        this.h = dzr.a;
    }
}
