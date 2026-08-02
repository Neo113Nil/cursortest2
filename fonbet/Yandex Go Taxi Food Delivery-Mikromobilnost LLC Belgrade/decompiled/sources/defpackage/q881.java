package defpackage;

import android.content.Context;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.ld1;
import yads.md1;
import yads.nd1;
import yads.od1;
import yads.pd1;
import yads.vd1;
import yads.wd1;

/* loaded from: classes7.dex */
public final class q881 {
    public final Context a;
    public final a081 b;
    public final uh61 c;
    public final ld1 d;
    public final ike e;
    public final im71 f;

    public q881(Context context) {
        a081 a081Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        uh61 uh61Var = new uh61(context);
        ld1 ld1Var = new ld1(context);
        sjh sjhVar = uyj.a;
        ike a = bvf0.a(mdh.b);
        im71 b = gea1.b();
        this.a = context;
        this.b = a081Var2;
        this.c = uh61Var;
        this.d = ld1Var;
        this.e = a;
        this.f = b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00de, code lost:
    
        if (r13.s() == r2) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8 A[Catch: all -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:27:0x00b8), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r12v5, types: [fyc, kotlinx.coroutines.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        od1 od1Var;
        Object obj;
        int i;
        fyc fycVar;
        String str;
        gg81 gg81Var;
        gg81 gg81Var2;
        zy11 zy11Var = zy11.a;
        try {
            if (continuationImpl instanceof od1) {
                od1Var = (od1) continuationImpl;
                int i2 = od1Var.f;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    od1Var.f = i2 - Integer.MIN_VALUE;
                    obj = od1Var.d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = od1Var.f;
                    if (i != 0) {
                        b.b(obj);
                        gg81 a = this.b.a(this.a);
                        if (a != null && (str = a.y) != null && str.length() != 0) {
                            uh61 uh61Var = this.c;
                            od1Var.b = a;
                            od1Var.c = str;
                            od1Var.f = 1;
                            uh61Var.getClass();
                            sjh sjhVar = uyj.a;
                            Object k0 = tje.k0(mdh.b, new wd1(uh61Var, null), od1Var);
                            if (k0 != coroutineSingletons) {
                                gg81Var = a;
                                obj = k0;
                            }
                            return coroutineSingletons;
                        }
                        return zy11Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj);
                            if (fycVar != 0) {
                                fycVar.T(zy11Var);
                                return zy11Var;
                            }
                            return zy11Var;
                        }
                        str = od1Var.c;
                        gg81Var2 = od1Var.b;
                        b.b(obj);
                        if (obj == null) {
                            gg81Var = gg81Var2;
                            im71 im71Var = this.f;
                            im71Var.getClass();
                            im71Var.a = gwk0.b();
                            if (gg81Var.z) {
                                od1Var.b = null;
                                od1Var.c = null;
                                od1Var.f = 3;
                                j18 j18Var = new j18(1, dvw.b(od1Var));
                                j18Var.u();
                                b(new md1(j18Var), str);
                                j18Var.w(new nd1(this));
                            } else {
                                b(new pd1(this), str);
                            }
                        }
                        return zy11Var;
                    }
                    str = od1Var.c;
                    gg81Var = od1Var.b;
                    b.b(obj);
                    if (jl40.l(obj, str)) {
                        uh61 uh61Var2 = this.c;
                        od1Var.b = gg81Var;
                        od1Var.c = str;
                        od1Var.f = 2;
                        uh61Var2.getClass();
                        sjh sjhVar2 = uyj.a;
                        obj = tje.k0(mdh.b, new vd1(uh61Var2, null), od1Var);
                        if (obj != coroutineSingletons) {
                            gg81Var2 = gg81Var;
                            if (obj == null) {
                            }
                            return zy11Var;
                        }
                        return coroutineSingletons;
                    }
                    im71 im71Var2 = this.f;
                    im71Var2.getClass();
                    im71Var2.a = gwk0.b();
                    if (gg81Var.z) {
                    }
                }
            }
            if (i != 0) {
            }
            if (jl40.l(obj, str)) {
            }
            im71 im71Var22 = this.f;
            im71Var22.getClass();
            im71Var22.a = gwk0.b();
            if (gg81Var.z) {
            }
        } finally {
            fycVar = this.f.a;
            if (fycVar != null) {
                fycVar.T(zy11Var);
            }
        }
        od1Var = new od1(this, continuationImpl);
        obj = od1Var.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = od1Var.f;
    }

    public final void b(tls tlsVar, String str) {
        nl71 nl71Var = new nl71(str, new t26(28, this, str, tlsVar), new nb1(str, tlsVar));
        nl71Var.setShouldCache(false);
        nl71Var.setTag("light_bundle_js_request_tag");
        hba1.b(this.d.b).b(nl71Var);
    }
}
