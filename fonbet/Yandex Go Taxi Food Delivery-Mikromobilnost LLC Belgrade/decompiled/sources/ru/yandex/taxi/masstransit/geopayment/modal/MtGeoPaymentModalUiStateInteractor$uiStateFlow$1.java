package ru.yandex.taxi.masstransit.geopayment.modal;

import defpackage.avj0;
import defpackage.cyh0;
import defpackage.ems;
import defpackage.hk30;
import defpackage.il30;
import defpackage.jl30;
import defpackage.k26;
import defpackage.kl30;
import defpackage.l26;
import defpackage.ll30;
import defpackage.mja1;
import defpackage.mvg;
import defpackage.nl30;
import defpackage.nw8;
import defpackage.ny61;
import defpackage.o26;
import defpackage.ovi0;
import defpackage.q26;
import defpackage.r26;
import defpackage.r2h0;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Lgk30;", "geoItems", "", "geoState", "blePermissionState", "bleIsEnabled", "connectionError", "Lnl30;", "<anonymous>", "(Ljava/util/List;ZZZZ)Lnl30;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.modal.MtGeoPaymentModalUiStateInteractor$uiStateFlow$1", f = "MtGeoPaymentModalUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtGeoPaymentModalUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    /* synthetic */ boolean Z$2;
    /* synthetic */ boolean Z$3;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtGeoPaymentModalUiStateInteractor$uiStateFlow$1(g gVar, Continuation continuation) {
        super(6, continuation);
        this.this$0 = gVar;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        boolean booleanValue3 = ((Boolean) obj4).booleanValue();
        boolean booleanValue4 = ((Boolean) obj5).booleanValue();
        MtGeoPaymentModalUiStateInteractor$uiStateFlow$1 mtGeoPaymentModalUiStateInteractor$uiStateFlow$1 = new MtGeoPaymentModalUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj6);
        mtGeoPaymentModalUiStateInteractor$uiStateFlow$1.L$0 = (List) obj;
        mtGeoPaymentModalUiStateInteractor$uiStateFlow$1.Z$0 = booleanValue;
        mtGeoPaymentModalUiStateInteractor$uiStateFlow$1.Z$1 = booleanValue2;
        mtGeoPaymentModalUiStateInteractor$uiStateFlow$1.Z$2 = booleanValue3;
        mtGeoPaymentModalUiStateInteractor$uiStateFlow$1.Z$3 = booleanValue4;
        return mtGeoPaymentModalUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        q26 q26Var;
        String str;
        q26 q26Var2;
        String h;
        q26 q26Var3;
        String str2;
        q26 q26Var4;
        String str3;
        q26 q26Var5;
        String str4;
        List list = (List) this.L$0;
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        boolean z3 = this.Z$2;
        boolean z4 = this.Z$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        g gVar = this.this$0;
        nw8 nw8Var = gVar.b;
        r26 r26Var = gVar.a.a;
        zuj0 zuj0Var = nw8Var.a;
        if (!z) {
            o26 o26Var = r26Var != null ? r26Var.a : null;
            k26 k26Var = r26Var != null ? r26Var.b : null;
            q26 q26Var6 = o26Var != null ? o26Var.d : null;
            ovi0 a = (q26Var6 == null || (str4 = q26Var6.b) == null) ? null : mja1.a(str4, null, 6);
            avj0 avj0Var = (avj0) zuj0Var;
            String h2 = avj0Var.h(cyh0.allow_geo_access);
            return new nl30(o26Var != null ? o26Var.a : null, (o26Var == null || (q26Var5 = o26Var.d) == null) ? false : q26Var5.c, o26Var != null ? o26Var.c : true, o26Var != null ? o26Var.b : null, a, q26Var6 != null ? q26Var6.a : null, k26Var != null ? k26Var.b : false, h2, avj0Var.h(cyh0.qr_go_to_settings), null, new kl30(new ll30(null, h2)), null, HProv.ALG_TYPE_DH);
        }
        if (!z2) {
            o26 o26Var2 = r26Var != null ? r26Var.a : null;
            k26 k26Var2 = r26Var != null ? r26Var.b : null;
            q26 q26Var7 = o26Var2 != null ? o26Var2.d : null;
            ovi0 a2 = (q26Var7 == null || (str3 = q26Var7.b) == null) ? null : mja1.a(str3, null, 6);
            avj0 avj0Var2 = (avj0) zuj0Var;
            String h3 = avj0Var2.h(cyh0.allow_access_to_bluetooth);
            return new nl30(o26Var2 != null ? o26Var2.a : null, (o26Var2 == null || (q26Var4 = o26Var2.d) == null) ? false : q26Var4.c, o26Var2 != null ? o26Var2.c : true, o26Var2 != null ? o26Var2.b : null, a2, q26Var7 != null ? q26Var7.a : null, k26Var2 != null ? k26Var2.b : false, h3, avj0Var2.h(cyh0.qr_go_to_settings), null, new il30(new ll30(null, h3)), null, HProv.ALG_TYPE_DH);
        }
        if (z3) {
            if (z4) {
                o26 o26Var3 = r26Var != null ? r26Var.a : null;
                k26 k26Var3 = r26Var != null ? r26Var.b : null;
                avj0 avj0Var3 = (avj0) zuj0Var;
                return new nl30(null, (o26Var3 == null || (q26Var2 = o26Var3.d) == null) ? false : q26Var2.c, false, null, null, null, k26Var3 != null ? k26Var3.b : false, null, null, null, null, new hk30(r2h0.ic_alert, avj0Var3.h(cyh0.mt_ble_connection_error_title), avj0Var3.h(cyh0.mt_ble_connection_error_modal_subtitle), avj0Var3.h(cyh0.update)), 1981);
            }
            o26 o26Var4 = r26Var != null ? r26Var.a : null;
            k26 k26Var4 = r26Var != null ? r26Var.b : null;
            q26 q26Var8 = o26Var4 != null ? o26Var4.d : null;
            return new nl30(o26Var4 != null ? o26Var4.a : null, (o26Var4 == null || (q26Var = o26Var4.d) == null) ? false : q26Var.c, o26Var4 != null ? o26Var4.c : true, o26Var4 != null ? o26Var4.b : null, (q26Var8 == null || (str = q26Var8.b) == null) ? null : mja1.a(str, null, 6), q26Var8 != null ? q26Var8.a : null, k26Var4 != null ? k26Var4.b : false, null, null, list, null, null, 3456);
        }
        o26 o26Var5 = r26Var != null ? r26Var.a : null;
        k26 k26Var5 = r26Var != null ? r26Var.b : null;
        q26 q26Var9 = o26Var5 != null ? o26Var5.d : null;
        ovi0 a3 = (q26Var9 == null || (str2 = q26Var9.b) == null) ? null : mja1.a(str2, null, 6);
        l26 l26Var = k26Var5 != null ? k26Var5.d : null;
        avj0 avj0Var4 = (avj0) zuj0Var;
        String h4 = avj0Var4.h(cyh0.allow_access_to_bluetooth);
        String str5 = o26Var5 != null ? o26Var5.a : null;
        boolean z5 = (o26Var5 == null || (q26Var3 = o26Var5.d) == null) ? false : q26Var3.c;
        boolean z6 = o26Var5 != null ? o26Var5.c : true;
        String str6 = o26Var5 != null ? o26Var5.b : null;
        String str7 = q26Var9 != null ? q26Var9.a : null;
        boolean z7 = k26Var5 != null ? k26Var5.b : false;
        if (l26Var == null || (h = l26Var.b) == null) {
            h = avj0Var4.h(cyh0.qr_go_to_settings);
        }
        return new nl30(str5, z5, z6, str6, a3, str7, z7, h4, h, null, new jl30(new ll30(null, h4)), null, HProv.ALG_TYPE_DH);
    }
}
