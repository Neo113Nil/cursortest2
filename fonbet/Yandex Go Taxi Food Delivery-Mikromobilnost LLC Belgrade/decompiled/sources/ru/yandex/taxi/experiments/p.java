package ru.yandex.taxi.experiments;

import android.os.Looper;
import com.yandex.go.experiments.api.ExperimentSource;
import defpackage.bvf0;
import defpackage.clw0;
import defpackage.dlw0;
import defpackage.dxd;
import defpackage.eku0;
import defpackage.ike;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.mth;
import defpackage.n96;
import defpackage.ny61;
import defpackage.qn11;
import defpackage.s8x;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.un11;
import defpackage.uyj;
import defpackage.v1b0;
import defpackage.vn11;
import defpackage.w96;
import defpackage.wku0;
import defpackage.wnt;
import defpackage.xn11;
import defpackage.y1b0;
import defpackage.z1b0;
import defpackage.zn11;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

/* loaded from: classes9.dex */
public final class p implements v1b0 {
    public final wnt a;
    public final tt2 b;
    public final dlw0 c;
    public final wku0 d;
    public final r0 e = bvf0.c(null);
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final ike h;
    public final AtomicBoolean i;
    public final s8x j;
    public ExperimentSource k;

    public p(wnt wntVar, tt2 tt2Var, dlw0 dlw0Var, wku0 wku0Var) {
        this.a = wntVar;
        this.b = tt2Var;
        this.c = dlw0Var;
        this.d = wku0Var;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.h = bvf0.a(mdh.b.plus(jl40.a()));
        this.i = new AtomicBoolean(false);
        this.j = kotlinx.coroutines.a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (r3 == null) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [qn11] */
    @Override // defpackage.x1b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vn11 a(vn11 vn11Var) {
        zn11 zn11Var = (zn11) this.e.getValue();
        vn11 vn11Var2 = null;
        vn11Var2 = null;
        if (zn11Var != null) {
            un11 un11Var = (un11) zn11Var.a.get(vn11Var.getClass());
            vn11 vn11Var3 = un11Var != null ? un11Var.a : null;
            if (vn11Var3 != null) {
                vn11Var = vn11Var3;
            }
            return vn11Var;
        }
        clw0 clw0Var = (clw0) this.c.b.get(vn11Var.getClass());
        if (clw0Var != null) {
            ConcurrentHashMap concurrentHashMap = this.f;
            z1b0 z1b0Var = (z1b0) concurrentHashMap.get(clw0Var);
            if (z1b0Var == null) {
                if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
                    if (this.i.get()) {
                        tje.Y(EmptyCoroutineContext.a, new PersistentExperimentsImpl$waitForWarmUpBlocking$1(this, null));
                    }
                    z1b0Var = (z1b0) concurrentHashMap.get(clw0Var);
                    if (z1b0Var == null) {
                        vn11 k = k(clw0Var, false);
                        if (k == null) {
                            z1b0Var = null;
                        } else {
                            z1b0Var = new z1b0(k);
                            z1b0 z1b0Var2 = (z1b0) concurrentHashMap.putIfAbsent(clw0Var, z1b0Var);
                            if (z1b0Var2 != null) {
                                z1b0Var = z1b0Var2;
                            }
                        }
                    }
                } else {
                    z1b0Var = (z1b0) concurrentHashMap.computeIfAbsent(clw0Var, new dxd(6, new y1b0(this, clw0Var, 0)));
                }
            }
            vn11Var2 = z1b0Var.a;
        }
        return vn11Var2 == null ? vn11Var : vn11Var2;
    }

    @Override // defpackage.x1b0
    public final m b(SimplePersistentBooleanExperiment simplePersistentBooleanExperiment) {
        return new m(new mth(this.e, 6), simplePersistentBooleanExperiment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [qn11] */
    @Override // defpackage.x1b0
    public final xn11 c(xn11 xn11Var) {
        zn11 zn11Var = (zn11) this.e.getValue();
        if (zn11Var == null) {
            return xn11Var;
        }
        un11 un11Var = (un11) zn11Var.a.get(xn11Var.getClass());
        xn11 xn11Var2 = un11Var != null ? un11Var.a : null;
        if (xn11Var2 != null) {
            xn11Var = xn11Var2;
        }
        return xn11Var;
    }

    @Override // defpackage.x1b0
    public final k d(SimpleBooleanExperiment simpleBooleanExperiment) {
        return new k(new mth(this.e, 6), simpleBooleanExperiment);
    }

    public final boolean e(String str, boolean z) {
        eku0 k;
        ExperimentSource experimentSource = this.k;
        if (experimentSource == null) {
            experimentSource = null;
        }
        k = this.d.k(experimentSource, str, "", z);
        qn11 qn11Var = k != null ? k.d : null;
        if (qn11Var == null) {
            return false;
        }
        if (qn11Var instanceof n96) {
            return ((n96) qn11Var).b();
        }
        if (qn11Var instanceof w96) {
            return ((w96) qn11Var).h();
        }
        return false;
    }

    @Override // defpackage.x1b0
    public final Object f(SimplePersistentBooleanExperiment simplePersistentBooleanExperiment, Continuation continuation) {
        String id = simplePersistentBooleanExperiment.getId();
        zn11 zn11Var = (zn11) this.e.getValue();
        if (zn11Var != null) {
            return Boolean.valueOf(zn11Var.a(id));
        }
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new PersistentExperimentsImpl$persistentBooleanExperiment$2(this, id, null), continuation);
    }

    @Override // defpackage.x1b0
    public final boolean g(SimplePersistentBooleanExperiment simplePersistentBooleanExperiment) {
        zn11 zn11Var = (zn11) this.e.getValue();
        if (zn11Var != null) {
            return zn11Var.a(simplePersistentBooleanExperiment.getId());
        }
        String id = simplePersistentBooleanExperiment.getId();
        if (!jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            return e(id, true);
        }
        if (this.i.get()) {
            tje.Y(EmptyCoroutineContext.a, new PersistentExperimentsImpl$waitForWarmUpBlocking$1(this, null));
        }
        return e(id, false);
    }

    @Override // defpackage.w1b0
    public final ExperimentSource getSource() {
        ExperimentSource experimentSource = this.k;
        if (experimentSource != null) {
            return experimentSource;
        }
        return null;
    }

    @Override // defpackage.x1b0
    public final o h(qn11 qn11Var) {
        return new o(new mth(this.e, 6), qn11Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r3v2, types: [qn11] */
    /* JADX WARN: Type inference failed for: r5v0, types: [ru.yandex.taxi.experiments.p] */
    @Override // defpackage.x1b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(vn11 vn11Var, Continuation continuation) {
        PersistentExperimentsImpl$experimentOrDefault$1 persistentExperimentsImpl$experimentOrDefault$1;
        int i;
        if (continuation instanceof PersistentExperimentsImpl$experimentOrDefault$1) {
            persistentExperimentsImpl$experimentOrDefault$1 = (PersistentExperimentsImpl$experimentOrDefault$1) continuation;
            int i2 = persistentExperimentsImpl$experimentOrDefault$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                persistentExperimentsImpl$experimentOrDefault$1.label = i2 - Integer.MIN_VALUE;
                Object obj = persistentExperimentsImpl$experimentOrDefault$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = persistentExperimentsImpl$experimentOrDefault$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zn11 zn11Var = (zn11) this.e.getValue();
                    if (zn11Var != null) {
                        un11 un11Var = (un11) zn11Var.a.get(vn11Var.getClass());
                        vn11 vn11Var2 = un11Var != null ? un11Var.a : null;
                        if (vn11Var2 != null) {
                            vn11Var = vn11Var2;
                        }
                        return vn11Var;
                    }
                    persistentExperimentsImpl$experimentOrDefault$1.L$0 = vn11Var;
                    persistentExperimentsImpl$experimentOrDefault$1.label = 1;
                    obj = l(vn11Var, persistentExperimentsImpl$experimentOrDefault$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vn11Var = (vn11) persistentExperimentsImpl$experimentOrDefault$1.L$0;
                    kotlin.b.b(obj);
                }
                vn11 vn11Var3 = (vn11) obj;
                return vn11Var3 != null ? vn11Var : vn11Var3;
            }
        }
        persistentExperimentsImpl$experimentOrDefault$1 = new PersistentExperimentsImpl$experimentOrDefault$1(this, continuation);
        Object obj2 = persistentExperimentsImpl$experimentOrDefault$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = persistentExperimentsImpl$experimentOrDefault$1.label;
        if (i != 0) {
        }
        vn11 vn11Var32 = (vn11) obj2;
        if (vn11Var32 != null) {
        }
    }

    @Override // defpackage.x1b0
    public final boolean j(SimpleBooleanExperiment simpleBooleanExperiment) {
        zn11 zn11Var = (zn11) this.e.getValue();
        if (zn11Var != null) {
            return zn11Var.a(simpleBooleanExperiment.getId());
        }
        return false;
    }

    public final vn11 k(clw0 clw0Var, boolean z) {
        eku0 k;
        ExperimentSource experimentSource = this.k;
        if (experimentSource == null) {
            experimentSource = null;
        }
        k = this.d.k(experimentSource, clw0Var.a, "", z);
        qn11 qn11Var = k != null ? k.d : null;
        if (qn11Var instanceof vn11) {
            return (vn11) qn11Var;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(vn11 vn11Var, ContinuationImpl continuationImpl) {
        PersistentExperimentsImpl$persistentExperimentValue$1 persistentExperimentsImpl$persistentExperimentValue$1;
        int i;
        z1b0 z1b0Var;
        if (continuationImpl instanceof PersistentExperimentsImpl$persistentExperimentValue$1) {
            persistentExperimentsImpl$persistentExperimentValue$1 = (PersistentExperimentsImpl$persistentExperimentValue$1) continuationImpl;
            int i2 = persistentExperimentsImpl$persistentExperimentValue$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                persistentExperimentsImpl$persistentExperimentValue$1.label = i2 - Integer.MIN_VALUE;
                Object obj = persistentExperimentsImpl$persistentExperimentValue$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = persistentExperimentsImpl$persistentExperimentValue$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    clw0 clw0Var = (clw0) this.c.b.get(vn11Var.getClass());
                    if (clw0Var == null) {
                        return null;
                    }
                    z1b0Var = (z1b0) this.f.get(clw0Var);
                    if (z1b0Var == null) {
                        this.b.getClass();
                        sjh sjhVar = uyj.a;
                        mdh mdhVar = mdh.b;
                        PersistentExperimentsImpl$persistentExperimentValue$cacheEntry$1 persistentExperimentsImpl$persistentExperimentValue$cacheEntry$1 = new PersistentExperimentsImpl$persistentExperimentValue$cacheEntry$1(this, clw0Var, null);
                        persistentExperimentsImpl$persistentExperimentValue$1.L$0 = null;
                        persistentExperimentsImpl$persistentExperimentValue$1.L$1 = null;
                        persistentExperimentsImpl$persistentExperimentValue$1.label = 1;
                        obj = tje.k0(mdhVar, persistentExperimentsImpl$persistentExperimentValue$cacheEntry$1, persistentExperimentsImpl$persistentExperimentValue$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return z1b0Var.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                z1b0Var = (z1b0) obj;
                return z1b0Var.a;
            }
        }
        persistentExperimentsImpl$persistentExperimentValue$1 = new PersistentExperimentsImpl$persistentExperimentValue$1(this, continuationImpl);
        Object obj2 = persistentExperimentsImpl$persistentExperimentValue$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = persistentExperimentsImpl$persistentExperimentValue$1.label;
        if (i != 0) {
        }
        z1b0Var = (z1b0) obj2;
        return z1b0Var.a;
    }
}
