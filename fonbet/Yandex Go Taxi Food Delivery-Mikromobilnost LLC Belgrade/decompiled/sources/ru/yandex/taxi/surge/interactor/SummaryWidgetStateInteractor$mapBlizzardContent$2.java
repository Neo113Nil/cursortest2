package ru.yandex.taxi.surge.interactor;

import android.graphics.drawable.Drawable;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.zone.dto.objects.ServiceLevelWidget$SurgeAlert;
import com.yandex.go.zone.dto.objects.SurgeAlertContent;
import com.yandex.go.zone.dto.objects.SurgeAlertContentBalance;
import com.yandex.go.zone.dto.objects.SurgeAlertContentTitle;
import defpackage.drv0;
import defpackage.ev4;
import defpackage.hlx0;
import defpackage.i36;
import defpackage.mja1;
import defpackage.mvg;
import defpackage.n4v;
import defpackage.noh;
import defpackage.ny61;
import defpackage.orv0;
import defpackage.ovi0;
import defpackage.q5z;
import defpackage.qje;
import defpackage.qoh;
import defpackage.tje;
import defpackage.trv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.wp2;
import defpackage.xng0;
import defpackage.y6i0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lorv0;", "<anonymous>", "(Ltse;)Lorv0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.interactor.SummaryWidgetStateInteractor$mapBlizzardContent$2", f = "SummaryWidgetStateInteractor.kt", l = {213, HProv.PP_AUTH_INFO, 224}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryWidgetStateInteractor$mapBlizzardContent$2 extends SuspendLambda implements wls {
    final /* synthetic */ ServiceLevelWidget$SurgeAlert $surgeAlert;
    float F$0;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ trv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryWidgetStateInteractor$mapBlizzardContent$2(trv0 trv0Var, ServiceLevelWidget$SurgeAlert serviceLevelWidget$SurgeAlert, Continuation continuation) {
        super(2, continuation);
        this.$surgeAlert = serviceLevelWidget$SurgeAlert;
        this.this$0 = trv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SummaryWidgetStateInteractor$mapBlizzardContent$2 summaryWidgetStateInteractor$mapBlizzardContent$2 = new SummaryWidgetStateInteractor$mapBlizzardContent$2(this.this$0, this.$surgeAlert, continuation);
        summaryWidgetStateInteractor$mapBlizzardContent$2.L$0 = obj;
        return summaryWidgetStateInteractor$mapBlizzardContent$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryWidgetStateInteractor$mapBlizzardContent$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int intValue;
        int intValue2;
        Object s;
        noh nohVar;
        int i;
        int i2;
        int i3;
        wp2 wp2Var;
        wp2 wp2Var2;
        Object k;
        wp2 wp2Var3;
        wp2 wp2Var4;
        int i4;
        List list;
        int i5;
        noh nohVar2;
        Drawable drawable;
        int i6;
        int i7;
        float f;
        int i8;
        List list2;
        n4v n4vVar;
        EmptyList emptyList;
        wp2 a;
        Object k2;
        int i9;
        int i10;
        int i11;
        ovi0 ovi0Var;
        int i12;
        Drawable drawable2;
        List list3;
        wp2 wp2Var5;
        float f2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = this.label;
        EmptyList emptyList2 = EmptyList.a;
        if (i13 == 0) {
            kotlin.b.b(obj);
            Integer S = q5z.S(this.$surgeAlert.a.a.d);
            int intValue3 = S != null ? S.intValue() : qje.t(xng0.bgMain, this.this$0.f);
            qoh h = tje.h(tseVar, null, null, new SummaryWidgetStateInteractor$mapBlizzardContent$2$widgetBackground$1(this.this$0, intValue3, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new SummaryWidgetStateInteractor$mapBlizzardContent$2$barIcon$1(this.this$0, this.$surgeAlert, null), 3);
            Integer S2 = q5z.S(this.$surgeAlert.a.a.a);
            intValue = S2 != null ? S2.intValue() : qje.t(xng0.controlMinor, this.this$0.f);
            Integer S3 = q5z.S(this.$surgeAlert.a.b.a);
            intValue2 = S3 != null ? S3.intValue() : intValue;
            Integer S4 = q5z.S(this.$surgeAlert.a.d.b);
            int intValue4 = S4 != null ? S4.intValue() : intValue;
            Integer S5 = q5z.S(this.$surgeAlert.a.d.c);
            int intValue5 = S5 != null ? S5.intValue() : intValue3;
            wp2 a2 = this.this$0.h.a(this.$surgeAlert.a.a.a, AppColor$Palette.ControlMinor);
            wp2 a3 = this.this$0.h.a(this.$surgeAlert.a.a.d, AppColor$Palette.Background);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h2;
            this.L$3 = a2;
            this.L$4 = a3;
            this.I$0 = intValue3;
            this.I$1 = intValue;
            this.I$2 = intValue2;
            this.I$3 = intValue4;
            this.I$4 = intValue5;
            this.label = 1;
            s = h.s(this);
            if (s != coroutineSingletons) {
                int i14 = intValue5;
                nohVar = h2;
                i = i14;
                i2 = intValue3;
                i3 = intValue4;
                wp2Var = a2;
                wp2Var2 = a3;
            }
            return coroutineSingletons;
        }
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                float f3 = this.F$0;
                int i15 = this.I$4;
                int i16 = this.I$3;
                int i17 = this.I$2;
                int i18 = this.I$1;
                List list4 = (List) this.L$9;
                list = (List) this.L$8;
                Drawable drawable3 = (Drawable) this.L$7;
                wp2 wp2Var6 = (wp2) this.L$6;
                ovi0 ovi0Var2 = (ovi0) this.L$5;
                wp2Var3 = (wp2) this.L$4;
                wp2 wp2Var7 = (wp2) this.L$3;
                kotlin.b.b(obj);
                list3 = list4;
                drawable2 = drawable3;
                i9 = i15;
                i10 = i16;
                emptyList = emptyList2;
                i11 = i17;
                i12 = i18;
                a = wp2Var6;
                ovi0Var = ovi0Var2;
                k2 = obj;
                f2 = f3;
                wp2Var5 = wp2Var7;
                wp2 wp2Var8 = wp2Var3;
                ev4 ev4Var = new ev4(a, ovi0Var, i12, f2, (n4v) k2);
                ServiceLevelWidget$SurgeAlert serviceLevelWidget$SurgeAlert = this.$surgeAlert;
                wp2 wp2Var9 = wp2Var5;
                hlx0 hlx0Var = new hlx0(drawable2, list, list3, ev4Var, serviceLevelWidget$SurgeAlert.a.a.d, 12);
                String a4 = trv0.a(this.this$0, serviceLevelWidget$SurgeAlert.b);
                ServiceLevelWidget$SurgeAlert serviceLevelWidget$SurgeAlert2 = this.$surgeAlert;
                String str = serviceLevelWidget$SurgeAlert2.b.c;
                SurgeAlertContentBalance surgeAlertContentBalance = serviceLevelWidget$SurgeAlert2.a.a;
                drv0 drv0Var = new drv0(surgeAlertContentBalance.a, y6i0.d(surgeAlertContentBalance.c, 0, 100), emptyList);
                SurgeAlertContent surgeAlertContent = this.$surgeAlert.a;
                SurgeAlertContentTitle surgeAlertContentTitle = surgeAlertContent.b;
                return new orv0(hlx0Var, a4, str, drv0Var, new i36(surgeAlertContentTitle.b, i11, surgeAlertContent.d.a, i10, i9, surgeAlertContent.c, this.this$0.h.a(surgeAlertContentTitle.a, wp2Var9), this.this$0.h.a(this.$surgeAlert.a.d.b, wp2Var9), this.this$0.h.a(this.$surgeAlert.a.d.c, wp2Var8)));
            }
            f = this.F$0;
            i7 = this.I$4;
            i6 = this.I$3;
            int i19 = this.I$2;
            i4 = this.I$1;
            int i20 = this.I$0;
            list2 = (List) this.L$7;
            List list5 = (List) this.L$6;
            Drawable drawable4 = (Drawable) this.L$5;
            wp2 wp2Var10 = (wp2) this.L$4;
            wp2 wp2Var11 = (wp2) this.L$3;
            nohVar2 = (noh) this.L$2;
            kotlin.b.b(obj);
            list = list5;
            i8 = i20;
            drawable = drawable4;
            wp2Var3 = wp2Var10;
            wp2Var4 = wp2Var11;
            i5 = i19;
            k = obj;
            n4vVar = (n4v) k;
            if (n4vVar != null || (r8 = n4vVar.b) == null) {
                String str2 = "";
            }
            emptyList = emptyList2;
            ovi0 a5 = mja1.a(str2, null, 6);
            a = this.this$0.h.a(this.$surgeAlert.a.a.a, AppColor$Palette.ControlMinor);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = wp2Var4;
            this.L$4 = wp2Var3;
            this.L$5 = a5;
            this.L$6 = a;
            this.L$7 = drawable;
            this.L$8 = list;
            this.L$9 = list2;
            this.I$0 = i8;
            this.I$1 = i4;
            this.I$2 = i5;
            this.I$3 = i6;
            this.I$4 = i7;
            this.F$0 = f;
            this.label = 3;
            k2 = nohVar2.k(this);
            if (k2 != coroutineSingletons) {
                return coroutineSingletons;
            }
            i9 = i7;
            i10 = i6;
            i11 = i5;
            ovi0Var = a5;
            i12 = i4;
            drawable2 = drawable;
            list3 = list2;
            wp2Var5 = wp2Var4;
            f2 = f;
            wp2 wp2Var82 = wp2Var3;
            ev4 ev4Var2 = new ev4(a, ovi0Var, i12, f2, (n4v) k2);
            ServiceLevelWidget$SurgeAlert serviceLevelWidget$SurgeAlert3 = this.$surgeAlert;
            wp2 wp2Var92 = wp2Var5;
            hlx0 hlx0Var2 = new hlx0(drawable2, list, list3, ev4Var2, serviceLevelWidget$SurgeAlert3.a.a.d, 12);
            String a42 = trv0.a(this.this$0, serviceLevelWidget$SurgeAlert3.b);
            ServiceLevelWidget$SurgeAlert serviceLevelWidget$SurgeAlert22 = this.$surgeAlert;
            String str3 = serviceLevelWidget$SurgeAlert22.b.c;
            SurgeAlertContentBalance surgeAlertContentBalance2 = serviceLevelWidget$SurgeAlert22.a.a;
            drv0 drv0Var2 = new drv0(surgeAlertContentBalance2.a, y6i0.d(surgeAlertContentBalance2.c, 0, 100), emptyList);
            SurgeAlertContent surgeAlertContent2 = this.$surgeAlert.a;
            SurgeAlertContentTitle surgeAlertContentTitle2 = surgeAlertContent2.b;
            return new orv0(hlx0Var2, a42, str3, drv0Var2, new i36(surgeAlertContentTitle2.b, i11, surgeAlertContent2.d.a, i10, i9, surgeAlertContent2.c, this.this$0.h.a(surgeAlertContentTitle2.a, wp2Var92), this.this$0.h.a(this.$surgeAlert.a.d.b, wp2Var92), this.this$0.h.a(this.$surgeAlert.a.d.c, wp2Var82)));
        }
        i = this.I$4;
        i3 = this.I$3;
        int i21 = this.I$2;
        intValue = this.I$1;
        int i22 = this.I$0;
        wp2Var2 = (wp2) this.L$4;
        wp2Var = (wp2) this.L$3;
        nohVar = (noh) this.L$2;
        kotlin.b.b(obj);
        i2 = i22;
        intValue2 = i21;
        s = obj;
        Drawable drawable5 = (Drawable) s;
        float d = y6i0.d(this.$surgeAlert.a.a.c, 0, 100) / 100.0f;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = nohVar;
        this.L$3 = wp2Var;
        this.L$4 = wp2Var2;
        this.L$5 = drawable5;
        this.L$6 = emptyList2;
        this.L$7 = emptyList2;
        this.I$0 = i2;
        this.I$1 = intValue;
        this.I$2 = intValue2;
        this.I$3 = i3;
        this.I$4 = i;
        this.F$0 = d;
        this.label = 2;
        k = nohVar.k(this);
        if (k != coroutineSingletons) {
            wp2Var3 = wp2Var2;
            wp2Var4 = wp2Var;
            i4 = intValue;
            list = emptyList2;
            i5 = intValue2;
            nohVar2 = nohVar;
            drawable = drawable5;
            i6 = i3;
            i7 = i;
            f = d;
            i8 = i2;
            list2 = list;
            n4vVar = (n4v) k;
            if (n4vVar != null) {
            }
            String str22 = "";
            emptyList = emptyList2;
            ovi0 a52 = mja1.a(str22, null, 6);
            a = this.this$0.h.a(this.$surgeAlert.a.a.a, AppColor$Palette.ControlMinor);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = wp2Var4;
            this.L$4 = wp2Var3;
            this.L$5 = a52;
            this.L$6 = a;
            this.L$7 = drawable;
            this.L$8 = list;
            this.L$9 = list2;
            this.I$0 = i8;
            this.I$1 = i4;
            this.I$2 = i5;
            this.I$3 = i6;
            this.I$4 = i7;
            this.F$0 = f;
            this.label = 3;
            k2 = nohVar2.k(this);
            if (k2 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
