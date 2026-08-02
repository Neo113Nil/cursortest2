package ru.yandex.taxi.summary.requirements.list.router;

import defpackage.bfj0;
import defpackage.cb8;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.ny61;
import defpackage.q6c0;
import defpackage.tej0;
import defpackage.xej0;
import defpackage.zy11;
import java.util.Collections;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;
import ru.yandex.taxi.promotions.model.Promotion;
import ru.yandex.taxi.summary.requirements.list.interactors.v;

/* loaded from: classes6.dex */
public final class a {
    public final c a;
    public final q6c0 b;
    public final v c;

    public a(c cVar, q6c0 q6c0Var, v vVar) {
        this.a = cVar;
        this.b = q6c0Var;
        this.c = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tej0 tej0Var, String str, ContinuationImpl continuationImpl) {
        RequirementCommunicationRouter$openCommunication$1 requirementCommunicationRouter$openCommunication$1;
        int i;
        String str2;
        Object b;
        Promotion promotion;
        tej0 tej0Var2 = tej0Var;
        if (continuationImpl instanceof RequirementCommunicationRouter$openCommunication$1) {
            requirementCommunicationRouter$openCommunication$1 = (RequirementCommunicationRouter$openCommunication$1) continuationImpl;
            int i2 = requirementCommunicationRouter$openCommunication$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementCommunicationRouter$openCommunication$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requirementCommunicationRouter$openCommunication$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementCommunicationRouter$openCommunication$1.label;
                v vVar = this.c;
                if (i != 0) {
                    b.b(obj);
                    requirementCommunicationRouter$openCommunication$1.L$0 = tej0Var2;
                    str2 = str;
                    requirementCommunicationRouter$openCommunication$1.L$1 = str2;
                    requirementCommunicationRouter$openCommunication$1.label = 1;
                    b = vVar.b(tej0Var2, requirementCommunicationRouter$openCommunication$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str3 = (String) requirementCommunicationRouter$openCommunication$1.L$1;
                    tej0 tej0Var3 = (tej0) requirementCommunicationRouter$openCommunication$1.L$0;
                    b.b(obj);
                    str2 = str3;
                    tej0Var2 = tej0Var3;
                    b = obj;
                }
                promotion = (Promotion) b;
                zy11 zy11Var = zy11.a;
                if (promotion == null) {
                    c.m(this.a, promotion, "requirement_communication", new bfj0(this, str2, tej0Var2.a, false), null, 24);
                    return zy11Var;
                }
                xej0 xej0Var = tej0Var2.c;
                String str4 = xej0Var.a;
                vVar.getClass();
                cb8 cb8Var = (evu0.J(str4) || evu0.J(xej0Var.c)) ? null : new cb8(g8e.o("fallback_banner_id_", str2), new TypedContentWidget(str4, null, 14), new TypedContentWidget(xej0Var.b, null, 14), new BannerWidgets(null, null, Collections.singletonList(new BannerWidgets.b("", xej0Var.c, null, null, null, null, 4082)), 248), 914430);
                if (cb8Var != null) {
                    c.m(this.a, cb8Var, "requirement_communication_fallback", new bfj0(this, str2, tej0Var2.a, true), null, 24);
                }
                return zy11Var;
            }
        }
        requirementCommunicationRouter$openCommunication$1 = new RequirementCommunicationRouter$openCommunication$1(this, continuationImpl);
        Object obj2 = requirementCommunicationRouter$openCommunication$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementCommunicationRouter$openCommunication$1.label;
        v vVar2 = this.c;
        if (i != 0) {
        }
        promotion = (Promotion) b;
        zy11 zy11Var2 = zy11.a;
        if (promotion == null) {
        }
    }
}
