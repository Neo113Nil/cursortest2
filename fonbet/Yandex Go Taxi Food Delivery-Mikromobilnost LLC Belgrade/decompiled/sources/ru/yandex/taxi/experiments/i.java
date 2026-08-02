package ru.yandex.taxi.experiments;

import defpackage.bre0;
import defpackage.clw0;
import defpackage.dlw0;
import defpackage.jbh;
import defpackage.jst;
import defpackage.ny61;
import defpackage.qn11;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tje;
import defpackage.vn11;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class i implements bre0 {
    public final dlw0 a;
    public final rqo b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public i(dlw0 dlw0Var, rqo rqoVar) {
        this.a = dlw0Var;
        this.b = rqoVar;
    }

    public static void e(Class cls, Class cls2) {
        jst.e.x(new IllegalStateException("wrong experiment class"), String.format("expected: %s actual: %s", Arrays.copyOf(new Object[]{cls.toString(), cls2.toString()}, 2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [qn11] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(vn11 vn11Var, ContinuationImpl continuationImpl) {
        PerSessionExperimentProviderImpl$getOrDefault$2 perSessionExperimentProviderImpl$getOrDefault$2;
        int i;
        String str;
        Object d;
        vn11 vn11Var2;
        vn11 vn11Var3;
        if (continuationImpl instanceof PerSessionExperimentProviderImpl$getOrDefault$2) {
            perSessionExperimentProviderImpl$getOrDefault$2 = (PerSessionExperimentProviderImpl$getOrDefault$2) continuationImpl;
            int i2 = perSessionExperimentProviderImpl$getOrDefault$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                perSessionExperimentProviderImpl$getOrDefault$2.label = i2 - Integer.MIN_VALUE;
                Object obj = perSessionExperimentProviderImpl$getOrDefault$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = perSessionExperimentProviderImpl$getOrDefault$2.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    clw0 clw0Var = (clw0) this.a.b.get(vn11Var.getClass());
                    str = clw0Var != null ? clw0Var.a : null;
                    if (str == null || str.length() == 0) {
                        return vn11Var;
                    }
                    perSessionExperimentProviderImpl$getOrDefault$2.L$0 = null;
                    perSessionExperimentProviderImpl$getOrDefault$2.L$1 = this;
                    perSessionExperimentProviderImpl$getOrDefault$2.L$2 = vn11Var;
                    perSessionExperimentProviderImpl$getOrDefault$2.L$3 = str;
                    perSessionExperimentProviderImpl$getOrDefault$2.L$4 = null;
                    perSessionExperimentProviderImpl$getOrDefault$2.label = 1;
                    d = d(str, vn11Var, perSessionExperimentProviderImpl$getOrDefault$2);
                    vn11Var2 = vn11Var;
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str2 = (String) perSessionExperimentProviderImpl$getOrDefault$2.L$3;
                    ?? r6 = (qn11) perSessionExperimentProviderImpl$getOrDefault$2.L$2;
                    i iVar = (i) perSessionExperimentProviderImpl$getOrDefault$2.L$1;
                    kotlin.b.b(obj);
                    d = obj;
                    str = str2;
                    this = iVar;
                    vn11Var2 = r6;
                }
                vn11Var3 = (vn11) d;
                if (vn11Var3 == null) {
                    return vn11Var3;
                }
                this.c.putIfAbsent(str, vn11Var2);
                return vn11Var2;
            }
        }
        perSessionExperimentProviderImpl$getOrDefault$2 = new PerSessionExperimentProviderImpl$getOrDefault$2(this, continuationImpl);
        Object obj2 = perSessionExperimentProviderImpl$getOrDefault$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = perSessionExperimentProviderImpl$getOrDefault$2.label;
        if (i != 0) {
        }
        vn11Var3 = (vn11) d;
        if (vn11Var3 == null) {
        }
    }

    @Override // defpackage.bre0
    public final void b() {
        this.c.clear();
        this.d.clear();
    }

    public final vn11 c(vn11 vn11Var) {
        return (vn11) tje.Y(EmptyCoroutineContext.a, new PerSessionExperimentProviderImpl$getOrDefaultBlocking$1(this, vn11Var, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, vn11 vn11Var, ContinuationImpl continuationImpl) {
        PerSessionExperimentProviderImpl$readPersistExperiment$1 perSessionExperimentProviderImpl$readPersistExperiment$1;
        int i;
        i iVar;
        Class<?> cls;
        vn11 vn11Var2;
        if (continuationImpl instanceof PerSessionExperimentProviderImpl$readPersistExperiment$1) {
            perSessionExperimentProviderImpl$readPersistExperiment$1 = (PerSessionExperimentProviderImpl$readPersistExperiment$1) continuationImpl;
            int i2 = perSessionExperimentProviderImpl$readPersistExperiment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                perSessionExperimentProviderImpl$readPersistExperiment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = perSessionExperimentProviderImpl$readPersistExperiment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = perSessionExperimentProviderImpl$readPersistExperiment$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str == null || str.length() == 0) {
                        return vn11Var;
                    }
                    Class<?> cls2 = vn11Var.getClass();
                    qn11 qn11Var = (qn11) this.c.get(str);
                    if (qn11Var != null) {
                        if (cls2.isInstance(qn11Var)) {
                            return (qn11) cls2.cast(qn11Var);
                        }
                        e(cls2, qn11Var.getClass());
                        return null;
                    }
                    t1b0 e = ((jbh) this.b).e(vn11Var);
                    perSessionExperimentProviderImpl$readPersistExperiment$1.L$0 = null;
                    perSessionExperimentProviderImpl$readPersistExperiment$1.L$1 = null;
                    perSessionExperimentProviderImpl$readPersistExperiment$1.L$2 = this;
                    perSessionExperimentProviderImpl$readPersistExperiment$1.L$3 = str;
                    perSessionExperimentProviderImpl$readPersistExperiment$1.L$4 = null;
                    perSessionExperimentProviderImpl$readPersistExperiment$1.L$5 = cls2;
                    perSessionExperimentProviderImpl$readPersistExperiment$1.L$6 = null;
                    perSessionExperimentProviderImpl$readPersistExperiment$1.label = 1;
                    Object b = e.b(perSessionExperimentProviderImpl$readPersistExperiment$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    iVar = this;
                    cls = cls2;
                    obj = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cls = (Class) perSessionExperimentProviderImpl$readPersistExperiment$1.L$5;
                    str = (String) perSessionExperimentProviderImpl$readPersistExperiment$1.L$3;
                    iVar = (i) perSessionExperimentProviderImpl$readPersistExperiment$1.L$2;
                    kotlin.b.b(obj);
                }
                vn11Var2 = (vn11) obj;
                if (!cls.isInstance(vn11Var2)) {
                    iVar.c.putIfAbsent(str, vn11Var2);
                    return (qn11) cls.cast(iVar.c.get(str));
                }
                Class<?> cls3 = vn11Var2.getClass();
                iVar.getClass();
                e(cls, cls3);
                return null;
            }
        }
        perSessionExperimentProviderImpl$readPersistExperiment$1 = new PerSessionExperimentProviderImpl$readPersistExperiment$1(this, continuationImpl);
        Object obj2 = perSessionExperimentProviderImpl$readPersistExperiment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = perSessionExperimentProviderImpl$readPersistExperiment$1.label;
        if (i != 0) {
        }
        vn11Var2 = (vn11) obj2;
        if (!cls.isInstance(vn11Var2)) {
        }
    }
}
