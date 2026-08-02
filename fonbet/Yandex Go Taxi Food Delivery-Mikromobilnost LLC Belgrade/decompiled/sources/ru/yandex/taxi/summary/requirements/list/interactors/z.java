package ru.yandex.taxi.summary.requirements.list.interactors;

import com.yandex.go.preorder.extraphone.ExtraContactPhonesRules;
import com.yandex.go.taxi.order.models.api.preorder.extraphone.ExtraPhoneContact;
import defpackage.b8r;
import defpackage.bgb0;
import defpackage.f6v;
import defpackage.joj0;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vfx0;
import defpackage.vpr;
import defpackage.y4p;
import defpackage.zy11;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class z implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ joj0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ mi31 w;

    public z(vpr vprVar, joj0 joj0Var, String str, mi31 mi31Var) {
        this.a = vprVar;
        this.b = joj0Var;
        this.c = str;
        this.w = mi31Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RequirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$2$1 requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$2$1;
        int i;
        ExtraContactPhonesRules extraContactPhonesRules;
        y4p y4pVar;
        if (continuation instanceof RequirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$2$1) {
            requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$2$1 = (RequirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ExtraPhoneContact extraPhoneContact = (ExtraPhoneContact) obj;
                    Pattern pattern = bgb0.a;
                    String str = extraPhoneContact.a;
                    String str2 = extraPhoneContact.b;
                    if (str.length() <= 0) {
                        str = str2.length() > 0 ? bgb0.e(str2) : "";
                    }
                    joj0 joj0Var = this.b;
                    mi31 d = b8r.d(joj0Var.c.b, this.c, null, 6);
                    pex0 pex0Var = d != null ? d.a : null;
                    if (pex0Var == null || (extraContactPhonesRules = pex0Var.W) == null) {
                        extraContactPhonesRules = ExtraContactPhonesRules.f;
                    }
                    if (extraContactPhonesRules.a()) {
                        y4pVar = new y4p(str.length() > 0 ? extraContactPhonesRules.c : extraContactPhonesRules.b, str);
                    } else {
                        y4pVar = new y4p(0);
                    }
                    joj0Var.a.getClass();
                    f6v b = ru.yandex.taxi.requirements.utils.c.b(y4pVar, vfx0.a(this.w));
                    requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(b, requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$2$1 = new RequirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementsExtraPhoneStateInteractor$extraPhoneStateFlow$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
