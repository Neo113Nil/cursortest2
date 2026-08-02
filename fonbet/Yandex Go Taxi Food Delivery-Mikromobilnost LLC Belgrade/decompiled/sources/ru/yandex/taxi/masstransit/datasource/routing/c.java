package ru.yandex.taxi.masstransit.datasource.routing;

import com.yandex.mapkit.transport.masstransit.MasstransitRouter;
import com.yandex.mapkit.transport.masstransit.TimeOptions;
import defpackage.b64;
import defpackage.cl7;
import defpackage.dvw;
import defpackage.f410;
import defpackage.g6u;
import defpackage.j18;
import defpackage.jtq0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pw30;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.tw30;
import defpackage.uw30;
import defpackage.uyj;
import defpackage.vj;
import defpackage.wj;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes6.dex */
public final class c implements tw30 {
    public final f410 a;
    public final tt2 b;
    public final jtq0 c;

    public c(tt2 tt2Var, f410 f410Var, jtq0 jtq0Var) {
        this.a = f410Var;
        this.b = tt2Var;
        this.c = jtq0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r1 == r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, pw30] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c cVar, String str, TimeOptions timeOptions, ContinuationImpl continuationImpl) {
        MtRouteUriResolverImpl$resolveUriInternal$1 mtRouteUriResolverImpl$resolveUriInternal$1;
        int i;
        String str2;
        TimeOptions timeOptions2;
        cl7 cl7Var;
        cVar.getClass();
        if (continuationImpl instanceof MtRouteUriResolverImpl$resolveUriInternal$1) {
            mtRouteUriResolverImpl$resolveUriInternal$1 = (MtRouteUriResolverImpl$resolveUriInternal$1) continuationImpl;
            int i2 = mtRouteUriResolverImpl$resolveUriInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtRouteUriResolverImpl$resolveUriInternal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtRouteUriResolverImpl$resolveUriInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtRouteUriResolverImpl$resolveUriInternal$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f410 f410Var = cVar.a;
                    str2 = str;
                    mtRouteUriResolverImpl$resolveUriInternal$1.L$0 = str2;
                    timeOptions2 = timeOptions;
                    mtRouteUriResolverImpl$resolveUriInternal$1.L$1 = timeOptions2;
                    mtRouteUriResolverImpl$resolveUriInternal$1.label = 1;
                    obj = f410Var.a(mtRouteUriResolverImpl$resolveUriInternal$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    TimeOptions timeOptions3 = (TimeOptions) mtRouteUriResolverImpl$resolveUriInternal$1.L$1;
                    String str3 = (String) mtRouteUriResolverImpl$resolveUriInternal$1.L$0;
                    kotlin.b.b(obj);
                    timeOptions2 = timeOptions3;
                    str2 = str3;
                }
                MasstransitRouter masstransitRouter = (MasstransitRouter) obj;
                mtRouteUriResolverImpl$resolveUriInternal$1.L$0 = str2;
                mtRouteUriResolverImpl$resolveUriInternal$1.L$1 = timeOptions2;
                mtRouteUriResolverImpl$resolveUriInternal$1.L$2 = masstransitRouter;
                mtRouteUriResolverImpl$resolveUriInternal$1.label = 2;
                j18 j18Var = new j18(1, dvw.b(mtRouteUriResolverImpl$resolveUriInternal$1));
                Ref$ObjectRef y = b64.y(j18Var);
                vj vjVar = new vj(24, y);
                cl7Var = new cl7(j18Var, vjVar);
                MtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$2 mtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$2 = new MtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0);
                MtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$3 mtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$3 = new MtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0);
                if (timeOptions2 == null) {
                    timeOptions2 = new TimeOptions(new Long(cVar.c.d()), null);
                }
                y.element = new pw30(masstransitRouter.resolveUri(str2, timeOptions2, new uw30(mtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$2, mtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$3)), 3);
                if (cl7Var.c()) {
                    j18Var.w(new wj(cl7Var, 24));
                } else {
                    vjVar.invoke();
                }
                Object s = j18Var.s();
                return s != coroutineSingletons ? coroutineSingletons : s;
            }
        }
        mtRouteUriResolverImpl$resolveUriInternal$1 = new MtRouteUriResolverImpl$resolveUriInternal$1(cVar, continuationImpl);
        Object obj2 = mtRouteUriResolverImpl$resolveUriInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtRouteUriResolverImpl$resolveUriInternal$1.label;
        if (i != 0) {
        }
        MasstransitRouter masstransitRouter2 = (MasstransitRouter) obj2;
        mtRouteUriResolverImpl$resolveUriInternal$1.L$0 = str2;
        mtRouteUriResolverImpl$resolveUriInternal$1.L$1 = timeOptions2;
        mtRouteUriResolverImpl$resolveUriInternal$1.L$2 = masstransitRouter2;
        mtRouteUriResolverImpl$resolveUriInternal$1.label = 2;
        j18 j18Var2 = new j18(1, dvw.b(mtRouteUriResolverImpl$resolveUriInternal$1));
        Ref$ObjectRef y2 = b64.y(j18Var2);
        vj vjVar2 = new vj(24, y2);
        cl7Var = new cl7(j18Var2, vjVar2);
        MtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$2 mtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$22 = new MtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0);
        MtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$3 mtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$32 = new MtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0);
        if (timeOptions2 == null) {
        }
        y2.element = new pw30(masstransitRouter2.resolveUri(str2, timeOptions2, new uw30(mtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$22, mtRouteUriResolverImpl$resolveUriInternal$$inlined$suspendCallbackApi$32)), 3);
        if (cl7Var.c()) {
        }
        Object s2 = j18Var2.s();
        if (s2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, TimeOptions timeOptions, ContinuationImpl continuationImpl) {
        MtRouteUriResolverImpl$resolveUri$1 mtRouteUriResolverImpl$resolveUri$1;
        int i;
        if (continuationImpl instanceof MtRouteUriResolverImpl$resolveUri$1) {
            mtRouteUriResolverImpl$resolveUri$1 = (MtRouteUriResolverImpl$resolveUri$1) continuationImpl;
            int i2 = mtRouteUriResolverImpl$resolveUri$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtRouteUriResolverImpl$resolveUri$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtRouteUriResolverImpl$resolveUri$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtRouteUriResolverImpl$resolveUri$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.b.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    MtRouteUriResolverImpl$resolveUri$2 mtRouteUriResolverImpl$resolveUri$2 = new MtRouteUriResolverImpl$resolveUri$2(this, str, timeOptions, null);
                    mtRouteUriResolverImpl$resolveUri$1.L$0 = null;
                    mtRouteUriResolverImpl$resolveUri$1.L$1 = null;
                    mtRouteUriResolverImpl$resolveUri$1.label = 1;
                    obj = tje.k0(g6uVar, mtRouteUriResolverImpl$resolveUri$2, mtRouteUriResolverImpl$resolveUri$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        mtRouteUriResolverImpl$resolveUri$1 = new MtRouteUriResolverImpl$resolveUri$1(this, continuationImpl);
        Object obj2 = mtRouteUriResolverImpl$resolveUri$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtRouteUriResolverImpl$resolveUri$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
