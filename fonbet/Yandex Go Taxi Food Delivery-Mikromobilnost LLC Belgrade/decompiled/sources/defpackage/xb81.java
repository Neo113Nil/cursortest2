package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.cb0;
import yads.hm2;
import yads.qe2;
import yads.re2;

/* loaded from: classes7.dex */
public final class xb81 {
    public final hn71 a;
    public final vmn0 b;
    public final yt81 c;
    public final pv71 d;
    public final vi71 e;
    public final n381 f;

    public xb81(fe81 fe81Var, v981 v981Var, d881 d881Var, hn71 hn71Var, vmn0 vmn0Var) {
        yt81 yt81Var = new yt81();
        pv71 pv71Var = new pv71();
        vi71 vi71Var = new vi71(fe81Var, v981Var, d881Var);
        n381 n381Var = new n381();
        this.a = hn71Var;
        this.b = vmn0Var;
        this.c = yt81Var;
        this.d = pv71Var;
        this.e = vi71Var;
        this.f = n381Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0080 -> B:10:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, List list, ContinuationImpl continuationImpl) {
        re2 re2Var;
        int i;
        Context context2;
        Iterator it;
        Context context3;
        if (continuationImpl instanceof re2) {
            re2Var = (re2) continuationImpl;
            int i2 = re2Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                re2Var.g = i2 - Integer.MIN_VALUE;
                Object obj = re2Var.e;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = re2Var.g;
                if (i != 0) {
                    b.b(obj);
                    Context a = tb71.a();
                    if (a != null) {
                        context = a;
                    } else {
                        this.c.getClass();
                        int i3 = 0;
                        Context context4 = context;
                        while (context4 instanceof ContextWrapper) {
                            int i4 = i3 + 1;
                            if (i3 >= 10) {
                                break;
                            }
                            if (context4 instanceof Activity) {
                                context2 = (Activity) context4;
                                break;
                            }
                            context4 = ((ContextWrapper) context4).getBaseContext();
                            i3 = i4;
                        }
                        context2 = null;
                        if (context2 != null) {
                            context = context2;
                        }
                    }
                    it = list.iterator();
                    context3 = context;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ms71 ms71Var = re2Var.d;
                    it = re2Var.c;
                    context3 = re2Var.b;
                    b.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        return ms71Var;
                    }
                    if (it.hasNext()) {
                        ms71Var = (ms71) it.next();
                        re2Var.b = context3;
                        re2Var.c = it;
                        re2Var.d = ms71Var;
                        re2Var.g = 1;
                        obj = b(context3, ms71Var, re2Var);
                        if (obj == obj2) {
                            return obj2;
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                        if (it.hasNext()) {
                            return null;
                        }
                    }
                }
            }
        }
        re2Var = new re2(this, continuationImpl);
        Object obj3 = re2Var.e;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = re2Var.g;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, ms71 ms71Var, ContinuationImpl continuationImpl) {
        qe2 qe2Var;
        int i;
        xk71 xk71Var;
        xk71 xk71Var2;
        if (continuationImpl instanceof qe2) {
            qe2Var = (qe2) continuationImpl;
            int i2 = qe2Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qe2Var.f = i2 - Integer.MIN_VALUE;
                Object obj = qe2Var.d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qe2Var.f;
                hn71 hn71Var = this.a;
                if (i != 0) {
                    b.b(obj);
                    xk71Var = new xk71(ms71Var);
                    try {
                        this.d.getClass();
                        Intent a = pv71.a(context, ms71Var);
                        if (ms71Var.e == cb0.d) {
                            vi71 vi71Var = this.e;
                            qe2Var.b = ms71Var;
                            qe2Var.c = xk71Var;
                            qe2Var.f = 1;
                            if (vi71Var.a(context, a, qe2Var) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            context.startActivity(a);
                        }
                        xk71Var2 = xk71Var;
                    } catch (Exception unused) {
                        hn71Var.l(ms71Var.g, xk71Var, kotlin.collections.b.f());
                        c(ms71Var, xk71Var, false);
                        return Boolean.FALSE;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xk71Var2 = qe2Var.c;
                    ms71Var = qe2Var.b;
                    try {
                        b.b(obj);
                    } catch (Exception unused2) {
                        xk71Var = xk71Var2;
                        hn71Var.l(ms71Var.g, xk71Var, kotlin.collections.b.f());
                        c(ms71Var, xk71Var, false);
                        return Boolean.FALSE;
                    }
                }
                hn71Var.l(ms71Var.f, xk71Var2, kotlin.collections.b.f());
                c(ms71Var, xk71Var2, true);
                return Boolean.TRUE;
            }
        }
        qe2Var = new qe2(this, continuationImpl);
        Object obj2 = qe2Var.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qe2Var.f;
        hn71 hn71Var2 = this.a;
        if (i != 0) {
        }
        hn71Var2.l(ms71Var.f, xk71Var2, kotlin.collections.b.f());
        c(ms71Var, xk71Var2, true);
        return Boolean.TRUE;
    }

    public final void c(ms71 ms71Var, xk71 xk71Var, boolean z) {
        this.f.getClass();
        String a = n381.a(xk71Var);
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("click_url", zla1.g(ms71Var.b));
        mapBuilder.put("deeplink_package_name", ms71Var.a);
        mapBuilder.put("deeplink_success", Boolean.valueOf(z));
        if (z) {
            mapBuilder.put("click_destination", a);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapBuilder.j());
        hm2 hm2Var = hm2.t;
        vmn0 vmn0Var = this.b;
        zj71 b = vmn0Var.b(hm2Var, linkedHashMap);
        ((ge71) vmn0Var.w).c(b);
        ((mj31) vmn0Var.y).t(hm2Var, b.b, g771.a, null);
    }
}
