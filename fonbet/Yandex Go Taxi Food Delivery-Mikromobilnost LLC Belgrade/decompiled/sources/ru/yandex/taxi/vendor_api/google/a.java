package ru.yandex.taxi.vendor_api.google;

import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.internal.c;
import com.google.android.gms.tasks.zzw;
import defpackage.ag70;
import defpackage.b64;
import defpackage.cl7;
import defpackage.dvw;
import defpackage.gtq0;
import defpackage.j18;
import defpackage.ny61;
import defpackage.q530;
import defpackage.r530;
import defpackage.uqs;
import defpackage.vj;
import defpackage.w511;
import defpackage.wj;
import defpackage.ykt;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes6.dex */
public abstract class a {
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
    
        if (r15 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r14v3, types: [T, uqs] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, ag70 ag70Var, ContinuationImpl continuationImpl) {
        GmsModuleInstallUtilsKt$ensureModuleAvailability$1 gmsModuleInstallUtilsKt$ensureModuleAvailability$1;
        int i;
        ModuleAvailabilityResponse moduleAvailabilityResponse;
        if (continuationImpl instanceof GmsModuleInstallUtilsKt$ensureModuleAvailability$1) {
            gmsModuleInstallUtilsKt$ensureModuleAvailability$1 = (GmsModuleInstallUtilsKt$ensureModuleAvailability$1) continuationImpl;
            int i2 = gmsModuleInstallUtilsKt$ensureModuleAvailability$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gmsModuleInstallUtilsKt$ensureModuleAvailability$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gmsModuleInstallUtilsKt$ensureModuleAvailability$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gmsModuleInstallUtilsKt$ensureModuleAvailability$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zzw e = cVar.e(ag70Var);
                    gmsModuleInstallUtilsKt$ensureModuleAvailability$1.L$0 = cVar;
                    gmsModuleInstallUtilsKt$ensureModuleAvailability$1.L$1 = ag70Var;
                    gmsModuleInstallUtilsKt$ensureModuleAvailability$1.label = 1;
                    obj = gtq0.c(e, gmsModuleInstallUtilsKt$ensureModuleAvailability$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ag70Var = (ag70) gmsModuleInstallUtilsKt$ensureModuleAvailability$1.L$1;
                    cVar = (c) gmsModuleInstallUtilsKt$ensureModuleAvailability$1.L$0;
                    kotlin.b.b(obj);
                }
                moduleAvailabilityResponse = (ModuleAvailabilityResponse) obj;
                if (moduleAvailabilityResponse.getAvailabilityStatus() != 2) {
                    w511.t("Requested module ", ag70Var, " is unknown");
                    return null;
                }
                if (moduleAvailabilityResponse.getAvailabilityStatus() != 0) {
                    gmsModuleInstallUtilsKt$ensureModuleAvailability$1.L$0 = cVar;
                    gmsModuleInstallUtilsKt$ensureModuleAvailability$1.L$1 = ag70Var;
                    gmsModuleInstallUtilsKt$ensureModuleAvailability$1.L$2 = null;
                    gmsModuleInstallUtilsKt$ensureModuleAvailability$1.label = 2;
                    j18 j18Var = new j18(1, dvw.b(gmsModuleInstallUtilsKt$ensureModuleAvailability$1));
                    Ref$ObjectRef y = b64.y(j18Var);
                    vj vjVar = new vj(14, y);
                    cl7 cl7Var = new cl7(j18Var, vjVar);
                    ykt yktVar = new ykt(new GmsModuleInstallUtilsKt$ensureModuleAvailability$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), new GmsModuleInstallUtilsKt$ensureModuleAvailability$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0), ag70Var);
                    q530 q530Var = new q530();
                    ArrayList arrayList = q530Var.a;
                    arrayList.add(ag70Var);
                    q530Var.b = yktVar;
                    cVar.f(new r530(arrayList, yktVar));
                    y.element = new uqs(8, cVar, yktVar);
                    if (cl7Var.c()) {
                        vjVar.invoke();
                    } else {
                        j18Var.w(new wj(cl7Var, 14));
                    }
                    if (j18Var.s() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        gmsModuleInstallUtilsKt$ensureModuleAvailability$1 = new GmsModuleInstallUtilsKt$ensureModuleAvailability$1(continuationImpl);
        Object obj2 = gmsModuleInstallUtilsKt$ensureModuleAvailability$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gmsModuleInstallUtilsKt$ensureModuleAvailability$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        moduleAvailabilityResponse = (ModuleAvailabilityResponse) obj2;
        if (moduleAvailabilityResponse.getAvailabilityStatus() != 2) {
        }
    }
}
