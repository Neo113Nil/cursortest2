package ru.yandex.taxi.summary.requirements.list.interactors;

import com.yandex.go.zone.dto.objects.Notification;
import defpackage.as21;
import defpackage.hoj0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.xqe;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class w implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ y b;

    public w(vpr vprVar, y yVar) {
        this.a = vprVar;
        this.b = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RequirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1 requirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1;
        int i;
        boolean z;
        boolean z2;
        hoj0 hoj0Var;
        boolean z3;
        String str;
        Notification.Type type;
        if (continuation instanceof RequirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1) {
            requirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1 = (RequirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1) continuation;
            int i2 = requirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = requirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pex0 pex0Var = (pex0) obj;
                    y yVar = this.b;
                    boolean a = yVar.e.a(pex0Var);
                    boolean z4 = pex0Var.K0;
                    boolean z5 = pex0Var.z;
                    if (!z4 ? !(a || !z5) : !a) {
                        z = z5;
                        z2 = false;
                    } else {
                        z2 = true;
                        z = z5;
                    }
                    Boolean bool = pex0Var.x;
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                    boolean z6 = z;
                    if (a) {
                        xqe xqeVar = (xqe) yVar.h;
                        xqeVar.getClass();
                        Notification notification = (Notification) pex0Var.p0.get("requirements_promo");
                        if (notification != null && (type = notification.a) != null) {
                            if (as21.b(xqeVar.a.a, "FIELD_TARIFF_NOTIFICATION_SHOWN_".concat(xqe.a(pex0Var.b, type.toString()))) <= notification.b) {
                                z3 = true;
                                str = pex0Var.y;
                                if (str == null) {
                                    str = "";
                                }
                                hoj0Var = new hoj0(str, z2, z6, a, z3);
                                requirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1.L$0 = null;
                                requirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1.L$1 = null;
                                requirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1.L$2 = null;
                                requirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1.L$3 = null;
                                requirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1.label = 1;
                                if (this.a.emit(hoj0Var, requirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                    }
                    z3 = false;
                    str = pex0Var.y;
                    if (str == null) {
                    }
                    hoj0Var = new hoj0(str, z2, z6, a, z3);
                    requirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1.L$0 = null;
                    requirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1.L$1 = null;
                    requirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1.L$2 = null;
                    requirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1.L$3 = null;
                    requirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(hoj0Var, requirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        requirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1 = new RequirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = requirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementsDueStateInteractor$dueAvailabilityFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
