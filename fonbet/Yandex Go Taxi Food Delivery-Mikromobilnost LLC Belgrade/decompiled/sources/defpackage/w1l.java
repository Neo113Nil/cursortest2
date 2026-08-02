package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.core.view2.divs.pager.DivPagerBinder$observeSizeChange$1;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class w1l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public w1l(j5b1 j5b1Var, AtomicReference atomicReference, zzr zzrVar) {
        this.a = 4;
        this.b = atomicReference;
        this.c = zzrVar;
        Objects.requireNonNull(j5b1Var);
        this.w = j5b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int size;
        FirebaseAnalytics firebaseAnalytics;
        AtomicReference atomicReference;
        j5b1 j5b1Var;
        g gVar;
        o5a1 o5a1Var;
        ieb1 ieb1Var;
        g gVar2;
        o5a1 o5a1Var2;
        y1a1 y1a1Var;
        String str = null;
        switch (this.a) {
            case 0:
                DivPagerBinder$observeSizeChange$1 divPagerBinder$observeSizeChange$1 = (DivPagerBinder$observeSizeChange$1) this.c;
                size = divPagerBinder$observeSizeChange$1.getSize();
                ((tls) this.w).invoke(Integer.valueOf(size));
                divPagerBinder$observeSizeChange$1.oldSize = size;
                return;
            case 1:
                qst qstVar = (qst) this.w;
                synchronized (qstVar.a) {
                    firebaseAnalytics = (FirebaseAnalytics) qstVar.a.get();
                }
                String str2 = (String) this.b;
                Bundle bundle = (Bundle) this.c;
                e eVar = firebaseAnalytics.a;
                eVar.getClass();
                eVar.a(new bp91(eVar, null, str2, bundle, false));
                return;
            case 2:
                zzbg zzbgVar = (zzbg) this.b;
                zzr zzrVar = (zzr) this.c;
                zzjd zzjdVar = (zzjd) this.w;
                zzjdVar.zzb(zzjdVar.zzc(zzbgVar, zzrVar), zzrVar);
                return;
            case 3:
                zzjd zzjdVar2 = (zzjd) this.w;
                zzjdVar2.zzL().w();
                zzpl zzplVar = (zzpl) this.b;
                Object zza = zzplVar.zza();
                zzr zzrVar2 = (zzr) this.c;
                if (zza != null) {
                    zzjdVar2.zzL().Q(zzplVar, zzrVar2);
                    return;
                } else {
                    zzjdVar2.zzL().R(zzplVar.zzb, zzrVar2);
                    return;
                }
            case 4:
                AtomicReference atomicReference2 = (AtomicReference) this.b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            j5b1Var = (j5b1) this.w;
                            gVar = (g) j5b1Var.b;
                            o5a1Var = gVar.x;
                            g.e(o5a1Var);
                        } catch (Throwable th) {
                            ((AtomicReference) this.b).notify();
                            throw th;
                        }
                    } catch (RemoteException e) {
                        y1a1 y1a1Var2 = ((g) ((j5b1) this.w).b).y;
                        g.g(y1a1Var2);
                        y1a1Var2.z.b(e, "Failed to get app instance id");
                        atomicReference = (AtomicReference) this.b;
                    }
                    if (o5a1Var.Ng().i(zzjk.ANALYTICS_STORAGE)) {
                        zzgb zzgbVar = j5b1Var.x;
                        if (zzgbVar != null) {
                            atomicReference2.set(zzgbVar.zzm((zzr) this.c));
                            String str3 = (String) atomicReference2.get();
                            if (str3 != null) {
                                j jVar = ((g) j5b1Var.b).F;
                                g.f(jVar);
                                jVar.A.set(str3);
                                o5a1 o5a1Var3 = gVar.x;
                                g.e(o5a1Var3);
                                o5a1Var3.A.p(str3);
                            }
                            j5b1Var.Tg();
                            atomicReference = (AtomicReference) this.b;
                            atomicReference.notify();
                            return;
                        }
                        y1a1 y1a1Var3 = gVar.y;
                        g.g(y1a1Var3);
                        y1a1Var3.z.a("Failed to get app instance id");
                    } else {
                        y1a1 y1a1Var4 = gVar.y;
                        g.g(y1a1Var4);
                        y1a1Var4.E.a("Analytics storage consent denied; will not get app instance id");
                        j jVar2 = ((g) j5b1Var.b).F;
                        g.f(jVar2);
                        jVar2.A.set(null);
                        o5a1 o5a1Var4 = gVar.x;
                        g.e(o5a1Var4);
                        o5a1Var4.A.p(null);
                        atomicReference2.set(null);
                    }
                    atomicReference2.notify();
                    return;
                }
            default:
                zzcu zzcuVar = (zzcu) this.c;
                j5b1 j5b1Var2 = (j5b1) this.w;
                try {
                    try {
                        gVar2 = (g) j5b1Var2.b;
                        o5a1Var2 = gVar2.x;
                        y1a1Var = gVar2.y;
                        g.e(o5a1Var2);
                    } catch (RemoteException e2) {
                        y1a1 y1a1Var5 = ((g) j5b1Var2.b).y;
                        g.g(y1a1Var5);
                        y1a1Var5.z.b(e2, "Failed to get app instance id");
                    }
                    if (o5a1Var2.Ng().i(zzjk.ANALYTICS_STORAGE)) {
                        zzgb zzgbVar2 = j5b1Var2.x;
                        if (zzgbVar2 != null) {
                            str = zzgbVar2.zzm((zzr) this.b);
                            if (str != null) {
                                j jVar3 = gVar2.F;
                                g.f(jVar3);
                                jVar3.A.set(str);
                                g.e(o5a1Var2);
                                o5a1Var2.A.p(str);
                            }
                            j5b1Var2.Tg();
                            ieb1Var = ((g) j5b1Var2.b).B;
                            g.e(ieb1Var);
                            ieb1Var.nh(zzcuVar, str);
                            return;
                        }
                        g.g(y1a1Var);
                        y1a1Var.z.a("Failed to get app instance id");
                    } else {
                        g.g(y1a1Var);
                        y1a1Var.E.a("Analytics storage consent denied; will not get app instance id");
                        j jVar4 = gVar2.F;
                        g.f(jVar4);
                        jVar4.A.set(null);
                        g.e(o5a1Var2);
                        o5a1Var2.A.p(null);
                    }
                    ieb1Var = gVar2.B;
                    g.e(ieb1Var);
                    ieb1Var.nh(zzcuVar, str);
                    return;
                } catch (Throwable th2) {
                    ieb1 ieb1Var2 = ((g) j5b1Var2.b).B;
                    g.e(ieb1Var2);
                    ieb1Var2.nh(zzcuVar, null);
                    throw th2;
                }
        }
    }

    public w1l(ViewPager2 viewPager2, DivPagerBinder$observeSizeChange$1 divPagerBinder$observeSizeChange$1, tls tlsVar) {
        this.a = 0;
        this.b = viewPager2;
        this.c = divPagerBinder$observeSizeChange$1;
        this.w = tlsVar;
    }

    public /* synthetic */ w1l(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.w = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
