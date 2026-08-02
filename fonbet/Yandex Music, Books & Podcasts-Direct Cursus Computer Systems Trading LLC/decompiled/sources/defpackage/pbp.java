package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.payment.sdk.ui.challenger.SbpChallengerActivity;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class pbp extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ rbp s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pbp(rbp rbpVar, int i) {
        super(1);
        this.r = i;
        this.s = rbpVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        rbp rbpVar = this.s;
        switch (i) {
            case 0:
                mgk mgkVar = (mgk) obj;
                mgkVar.getClass();
                wgk f = mgkVar.f();
                Context requireContext = rbpVar.requireContext();
                requireContext.getClass();
                rbpVar.m = irf.J(requireContext, f, rbpVar.z());
                sbp sbpVar = rbpVar.p;
                if (sbpVar != null) {
                    sbpVar.i = mgkVar;
                    return Unit.a;
                }
                Intrinsics.j("callbacks");
                throw null;
            case 1:
                Pair pair = (Pair) obj;
                if (n7w.R(q6c.e) && n7w.R(q6c.n)) {
                    kpo kpoVar = (kpo) pair.a;
                    mfk mfkVar = (mfk) pair.b;
                    kpoVar.getClass();
                    mfkVar.getClass();
                    o17 o17Var = new o17();
                    o17Var.setArguments(cxb.K(new Pair("CHALLENGE_INFO_DATA", kpoVar), new Pair("SBP_TOKEN_DATA", mfkVar)));
                    sbp sbpVar2 = rbpVar.p;
                    if (sbpVar2 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar2.A(o17Var, false);
                } else {
                    Intent intent = new Intent(rbpVar.requireContext(), (Class<?>) SbpChallengerActivity.class);
                    intent.putExtra("CHALLENGE_INFO_DATA", (Parcelable) pair.a);
                    intent.putExtra("SBP_TOKEN_DATA", (Parcelable) pair.b);
                    intent.putExtra("MODULE_DATA", rbpVar.requireActivity().getIntent().getExtras());
                    rbpVar.requireActivity().startActivityForResult(intent, 1111);
                }
                return Unit.a;
            case 2:
                zcp zcpVar = (zcp) obj;
                ybf ybfVar = rbpVar.j;
                zcpVar.getClass();
                LinearLayout linearLayout = ((vhk) rbpVar.x()).a;
                linearLayout.getClass();
                View findViewById = rbpVar.requireView().getRootView().findViewById(R.id.container_layout);
                findViewById.getClass();
                qdq.b(linearLayout, (ViewGroup) findViewById);
                if (zcpVar instanceof vcp) {
                    ((vhk) rbpVar.x()).f.setVisibility(0);
                    vcp vcpVar = (vcp) zcpVar;
                    ((vhk) rbpVar.x()).f.setState(new dvm(vcpVar.b));
                    ((vhk) rbpVar.x()).b.setVisibility(8);
                    ((vhk) rbpVar.x()).h.setVisibility(8);
                    if (rbpVar.s) {
                        sbp sbpVar3 = rbpVar.p;
                        if (sbpVar3 == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        sbpVar3.n(false);
                    }
                    if (vcpVar.a) {
                        sbp sbpVar4 = rbpVar.p;
                        if (sbpVar4 == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        sbpVar4.G();
                    }
                } else if (zcpVar instanceof scp) {
                    sbp sbpVar5 = rbpVar.p;
                    if (sbpVar5 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar5.z(((scp) zcpVar).a);
                } else if (zcpVar instanceof xcp) {
                    g0c z = rbpVar.z();
                    qne m1 = gut.m1(d0n.SELECT);
                    x60 x60Var = (x60) z;
                    x60Var.getClass();
                    x60Var.a(m1);
                    ((vhk) rbpVar.x()).f.setVisibility(8);
                    ((vhk) rbpVar.x()).b.setVisibility(0);
                    ((vhk) rbpVar.x()).h.setVisibility(0);
                    sbp sbpVar6 = rbpVar.p;
                    if (sbpVar6 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar6.n(true);
                    sbp sbpVar7 = rbpVar.p;
                    if (sbpVar7 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    if (sbpVar7.i == null) {
                        sbpVar7.n(false);
                    }
                    boolean z2 = rbpVar.getResources().getConfiguration().orientation == 1;
                    mcp mcpVar = rbpVar.i;
                    if (mcpVar == null) {
                        Intrinsics.j("adapter");
                        throw null;
                    }
                    xcp xcpVar = (xcp) zcpVar;
                    mcpVar.w(xcpVar.a, xcpVar.b, z2);
                } else if (zcpVar instanceof ycp) {
                    ((u8q) ybfVar.getValue()).G();
                    if (rbpVar.s) {
                        sbp sbpVar8 = rbpVar.p;
                        if (sbpVar8 == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        sbpVar8.n(false);
                    }
                    sbp sbpVar9 = rbpVar.p;
                    if (sbpVar9 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar9.t();
                    sbp sbpVar10 = rbpVar.p;
                    if (sbpVar10 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar10.L(((ycp) zcpVar).a);
                } else if (zcpVar instanceof tcp) {
                    ((u8q) ybfVar.getValue()).G();
                    if (rbpVar.s) {
                        sbp sbpVar11 = rbpVar.p;
                        if (sbpVar11 == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        sbpVar11.n(false);
                    }
                    sbp sbpVar12 = rbpVar.p;
                    if (sbpVar12 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar12.t();
                    sbp sbpVar13 = rbpVar.p;
                    if (sbpVar13 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar13.B(((tcp) zcpVar).a);
                } else if (zcpVar.equals(ucp.a)) {
                    sbp sbpVar14 = rbpVar.p;
                    if (sbpVar14 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar14.e();
                } else if (zcpVar instanceof wcp) {
                    sbp sbpVar15 = rbpVar.p;
                    if (sbpVar15 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    wcp wcpVar = (wcp) zcpVar;
                    sbpVar15.O(rbpVar.l.d() ? ((vhk) rbpVar.x()).e.getEmailView().getEmail() : null, wcpVar.a, wcpVar.b);
                }
                return Unit.a;
            case 3:
                ol3 ol3Var = (ol3) obj;
                ol3Var.getClass();
                if (ol3Var.equals(nl3.a)) {
                    sbp sbpVar16 = rbpVar.p;
                    if (sbpVar16 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar16.H(false);
                } else if (ol3Var instanceof ll3) {
                    sbp sbpVar17 = rbpVar.p;
                    if (sbpVar17 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar17.H(true);
                    sbp sbpVar18 = rbpVar.p;
                    if (sbpVar18 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar18.s(cek.a);
                    Integer num = ((ll3) ol3Var).a;
                    if (num != null) {
                        String str = rbpVar.m;
                        sbp sbpVar19 = rbpVar.p;
                        if (sbpVar19 == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        String string = rbpVar.getString(num.intValue());
                        if (string == null) {
                            string = "";
                        }
                        sbpVar19.v(string, str, null);
                    } else {
                        sbp sbpVar20 = rbpVar.p;
                        if (sbpVar20 == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        String string2 = rbpVar.getString(R.string.paymentsdk_pay_title);
                        string2.getClass();
                        sbpVar20.v(string2, rbpVar.m, null);
                    }
                } else if (ol3Var instanceof ml3) {
                    if (rbpVar.l.d()) {
                        sbp sbpVar21 = rbpVar.p;
                        if (sbpVar21 == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        kmk personalInfo = ((vhk) rbpVar.x()).e.getPersonalInfo();
                        personalInfo.getClass();
                        sbpVar21.h = personalInfo;
                    }
                    sbp sbpVar22 = rbpVar.p;
                    if (sbpVar22 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar22.H(true);
                    sbp sbpVar23 = rbpVar.p;
                    if (sbpVar23 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    boolean z3 = ((ml3) ol3Var).a;
                    t7g t7gVar = aek.b;
                    if (z3 && !rbpVar.y()) {
                        t7gVar = new bek(rbpVar.n);
                    }
                    sbpVar23.s(new dek(t7gVar));
                    sbp sbpVar24 = rbpVar.p;
                    if (sbpVar24 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    String string3 = rbpVar.getString(R.string.paymentsdk_pay_title);
                    string3.getClass();
                    sbpVar24.v(string3, rbpVar.m, null);
                }
                return Unit.a;
            case 4:
                l2c l2cVar = (l2c) obj;
                if (l2cVar instanceof j2c) {
                    j2c j2cVar = (j2c) l2cVar;
                    String str2 = j2cVar.a;
                    List list = j2cVar.b;
                    sbp sbpVar25 = rbpVar.p;
                    if (sbpVar25 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar25.k(str2, list);
                } else {
                    if (l2cVar instanceof h2c ? true : Intrinsics.d(l2cVar, i2c.a)) {
                        sbp sbpVar26 = rbpVar.p;
                        if (sbpVar26 == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        sbpVar26.h();
                    } else if (l2cVar instanceof k2c) {
                        sbp sbpVar27 = rbpVar.p;
                        if (sbpVar27 == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        sbpVar27.l();
                        k2c k2cVar = (k2c) l2cVar;
                        int i2 = k2cVar.a;
                        String str3 = k2cVar.b;
                        String str4 = k2cVar.c;
                        str3.getClass();
                        str4.getClass();
                        ty6 ty6Var = new ty6();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("paymentsdk_cvv_args_key", new fz6(i2, str3, str4));
                        ty6Var.setArguments(bundle);
                        sbp sbpVar28 = rbpVar.p;
                        if (sbpVar28 == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        sbpVar28.A(ty6Var, false);
                    }
                }
                return Unit.a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                g0c z4 = rbpVar.z();
                qne s1 = gut.s1(fbs.EMAIL, booleanValue, null);
                x60 x60Var2 = (x60) z4;
                x60Var2.getClass();
                x60Var2.a(s1);
                return Unit.a;
        }
    }
}
