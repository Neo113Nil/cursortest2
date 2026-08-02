package ru.yandex.taxi.ui.form.constructor;

import defpackage.b9u;
import defpackage.evu0;
import defpackage.j2c;
import defpackage.lcj0;
import defpackage.mvg;
import defpackage.nbj0;
import defpackage.ny61;
import defpackage.qql;
import defpackage.s41;
import defpackage.vbj0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.wmj0;
import defpackage.xu0;
import defpackage.yxv;
import defpackage.zbj0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "", "Lwu0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.ui.form.constructor.RequirementAddressFormUiConstructor$contentFlow$1", f = "RequirementAddressFormUiConstructor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RequirementAddressFormUiConstructor$contentFlow$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequirementAddressFormUiConstructor$contentFlow$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequirementAddressFormUiConstructor$contentFlow$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RequirementAddressFormUiConstructor$contentFlow$1 requirementAddressFormUiConstructor$contentFlow$1 = (RequirementAddressFormUiConstructor$contentFlow$1) create((vpr) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        requirementAddressFormUiConstructor$contentFlow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        aVar.b().clear();
        vbj0 vbj0Var = aVar.b;
        zbj0 c = vbj0Var.c();
        List b = aVar.b();
        lcj0 lcj0Var = aVar.a;
        wmj0 b2 = lcj0Var.b();
        String str2 = (String) b2.c.get(b2.f.a);
        if (str2 == null) {
            str2 = "";
        }
        b.add(new b9u(str2));
        List b3 = aVar.b();
        wmj0 b4 = lcj0Var.b();
        String str3 = (String) b4.c.get(b4.f.c.a);
        if (str3 == null) {
            str3 = "";
        }
        nbj0 nbj0Var = c.d;
        if (nbj0Var == null || (str = nbj0Var.b) == null) {
            wmj0 b5 = lcj0Var.b();
            str = (String) b5.c.get(b5.f.c.b);
            if (str == null) {
                str = "";
            }
        }
        b3.add(new j2c(str3, str));
        List b6 = aVar.b();
        wmj0 b7 = lcj0Var.b();
        String str4 = (String) b7.c.get(b7.f.d.a);
        if (str4 == null) {
            str4 = "";
        }
        b6.add(new qql(str4));
        List b8 = aVar.b();
        xu0 xu0Var = vbj0Var.c().a;
        wmj0 b9 = lcj0Var.b();
        String str5 = (String) b9.c.get(b9.f.b.b.a);
        String str6 = str5 == null ? "" : str5;
        wmj0 b10 = lcj0Var.b();
        String str7 = (String) b10.c.get(b10.f.b.a.a);
        String str8 = str7 == null ? "" : str7;
        wmj0 b11 = lcj0Var.b();
        String str9 = (String) b11.c.get(b11.f.b.d.a);
        String str10 = str9 == null ? "" : str9;
        wmj0 b12 = lcj0Var.b();
        String str11 = (String) b12.c.get(b12.f.b.c.a);
        b8.add(new s41(true, xu0Var, str6, str8, str10, str11 == null ? "" : str11));
        xu0 xu0Var2 = c.b;
        if (xu0Var2 != null && !evu0.J(xu0Var2.a)) {
            List b13 = aVar.b();
            wmj0 b14 = lcj0Var.b();
            String str12 = (String) b14.c.get(b14.f.f.a);
            if (str12 == null) {
                str12 = "";
            }
            b13.add(new qql(str12));
            List b15 = aVar.b();
            wmj0 b16 = lcj0Var.b();
            String str13 = (String) b16.c.get(b16.f.b.b.a);
            String str14 = str13 == null ? "" : str13;
            wmj0 b17 = lcj0Var.b();
            String str15 = (String) b17.c.get(b17.f.b.a.a);
            String str16 = str15 == null ? "" : str15;
            wmj0 b18 = lcj0Var.b();
            String str17 = (String) b18.c.get(b18.f.b.d.a);
            String str18 = str17 == null ? "" : str17;
            wmj0 b19 = lcj0Var.b();
            String str19 = (String) b19.c.get(b19.f.b.c.a);
            b15.add(new s41(false, xu0Var2, str14, str16, str18, str19 == null ? "" : str19));
        }
        List b20 = aVar.b();
        wmj0 b21 = lcj0Var.b();
        String str20 = (String) b21.c.get(b21.f.e.a);
        if (str20 == null) {
            str20 = "";
        }
        b20.add(new qql(str20));
        List b22 = aVar.b();
        wmj0 b23 = lcj0Var.b();
        String str21 = (String) b23.c.get(b23.f.e.b.a);
        b22.add(new yxv(str21 != null ? str21 : "", c.c));
        r0 r0Var = aVar.d;
        List J0 = kotlin.collections.a.J0(aVar.b());
        r0Var.getClass();
        r0Var.m(null, J0);
        return zy11.a;
    }
}
