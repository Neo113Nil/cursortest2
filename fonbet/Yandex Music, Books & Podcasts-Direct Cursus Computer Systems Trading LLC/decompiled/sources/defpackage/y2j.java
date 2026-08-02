package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class y2j extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ c3j s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2j(c3j c3jVar, int i) {
        super(1);
        this.r = i;
        this.s = c3jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        c3j c3jVar = this.s;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                g0c z = c3jVar.z();
                qne s1 = gut.s1(fbs.EMAIL, booleanValue, null);
                x60 x60Var = (x60) z;
                x60Var.getClass();
                x60Var.a(s1);
                return Unit.a;
            case 1:
                lv3 lv3Var = (lv3) obj;
                lv3Var.getClass();
                if (lv3Var.equals(kv3.a)) {
                    sbp sbpVar = c3jVar.r;
                    if (sbpVar == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar.H(false);
                } else if (lv3Var instanceof iv3) {
                    c3jVar.B(((iv3) lv3Var).a == yv3.a);
                    sbp sbpVar2 = c3jVar.r;
                    if (sbpVar2 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar2.H(true);
                    sbp sbpVar3 = c3jVar.r;
                    if (sbpVar3 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar3.s(cek.a);
                } else if (lv3Var instanceof jv3) {
                    yv3 yv3Var = ((jv3) lv3Var).a;
                    c3jVar.B(yv3Var == yv3.a);
                    sbp sbpVar4 = c3jVar.r;
                    if (sbpVar4 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    kmk personalInfo = ((shk) c3jVar.x()).k.getPersonalInfo();
                    personalInfo.getClass();
                    sbpVar4.h = personalInfo;
                    if (yv3Var == yv3.b) {
                        g0c z2 = c3jVar.z();
                        qne b0 = gut.b0(zso.NEW_CARD_PAY);
                        x60 x60Var2 = (x60) z2;
                        x60Var2.getClass();
                        x60Var2.a(b0);
                    }
                    sbp sbpVar5 = c3jVar.r;
                    if (sbpVar5 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar5.H(true);
                    sbp sbpVar6 = c3jVar.r;
                    if (sbpVar6 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar6.s(new dek());
                }
                return Unit.a;
            case 2:
                rx3 rx3Var = (rx3) obj;
                rx3Var.getClass();
                LinearLayout linearLayout = ((shk) c3jVar.x()).a;
                linearLayout.getClass();
                View findViewById = c3jVar.requireView().getRootView().findViewById(R.id.container_layout);
                findViewById.getClass();
                qdq.b(linearLayout, (ViewGroup) findViewById);
                if (rx3Var.equals(nx3.a)) {
                    g0c z3 = c3jVar.z();
                    qne m1 = gut.m1(d0n.BIND);
                    x60 x60Var3 = (x60) z3;
                    x60Var3.getClass();
                    x60Var3.a(m1);
                    ((shk) c3jVar.x()).l.setVisibility(8);
                    ((shk) c3jVar.x()).e.setVisibility(0);
                    ((shk) c3jVar.x()).n.setVisibility(0);
                } else if (rx3Var.equals(ox3.a)) {
                    sbp sbpVar7 = c3jVar.r;
                    if (sbpVar7 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar7.G();
                    ((shk) c3jVar.x()).l.setVisibility(0);
                    ((shk) c3jVar.x()).l.setState(new dvm(true));
                    ((shk) c3jVar.x()).e.setVisibility(8);
                    ((shk) c3jVar.x()).n.setVisibility(8);
                } else if (rx3Var instanceof qx3) {
                    sbp sbpVar8 = c3jVar.r;
                    if (sbpVar8 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar8.t();
                    sbp sbpVar9 = c3jVar.r;
                    if (sbpVar9 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar9.L(R.string.paymentsdk_success_title);
                } else if (rx3Var instanceof mx3) {
                    sbp sbpVar10 = c3jVar.r;
                    if (sbpVar10 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar10.t();
                    sbp sbpVar11 = c3jVar.r;
                    if (sbpVar11 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar11.B(((mx3) rx3Var).a);
                } else if (rx3Var instanceof px3) {
                    b6e.l(rx3Var, "Illegal model state ");
                    return null;
                }
                return Unit.a;
            default:
                bdv bdvVar = (bdv) obj;
                bdvVar.getClass();
                if (bdvVar instanceof ycv) {
                    sbp sbpVar12 = c3jVar.r;
                    if (sbpVar12 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar12.t();
                } else if (bdvVar instanceof zcv) {
                    sbp sbpVar13 = c3jVar.r;
                    if (sbpVar13 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    String uri = ((zcv) bdvVar).a.toString();
                    uri.getClass();
                    sbpVar13.k(uri, c5b.a);
                } else if (bdvVar instanceof adv) {
                    sbp sbpVar14 = c3jVar.r;
                    if (sbpVar14 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    adv advVar = (adv) bdvVar;
                    String uri2 = advVar.a.toString();
                    uri2.getClass();
                    sbpVar14.k(uri2, advVar.b);
                }
                return Unit.a;
        }
    }
}
