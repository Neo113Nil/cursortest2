package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class b3j extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ d3j s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3j(d3j d3jVar, int i) {
        super(1);
        this.r = i;
        this.s = d3jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        d3j d3jVar = this.s;
        switch (i) {
            case 0:
                rx3 rx3Var = (rx3) obj;
                rx3Var.getClass();
                LinearLayout linearLayout = ((shk) d3jVar.x()).a;
                linearLayout.getClass();
                View findViewById = d3jVar.requireView().getRootView().findViewById(R.id.container_layout);
                findViewById.getClass();
                qdq.b(linearLayout, (ViewGroup) findViewById);
                if (rx3Var instanceof nx3) {
                    g0c y = d3jVar.y();
                    qne m1 = gut.m1(d0n.BIND);
                    x60 x60Var = (x60) y;
                    x60Var.getClass();
                    x60Var.a(m1);
                    ((shk) d3jVar.x()).l.setVisibility(8);
                    ((shk) d3jVar.x()).e.setVisibility(0);
                    ((shk) d3jVar.x()).n.setVisibility(0);
                } else if (rx3Var instanceof ox3) {
                    ((shk) d3jVar.x()).l.setVisibility(0);
                    ((shk) d3jVar.x()).l.setState(new dvm(true));
                    ((shk) d3jVar.x()).e.setVisibility(8);
                    ((shk) d3jVar.x()).n.setVisibility(8);
                } else if (rx3Var instanceof px3) {
                    xzi xziVar = d3jVar.m;
                    if (xziVar == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    xziVar.F(((px3) rx3Var).a);
                } else if (rx3Var instanceof mx3) {
                    xzi xziVar2 = d3jVar.m;
                    if (xziVar2 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    xziVar2.g(((mx3) rx3Var).a);
                } else if (rx3Var instanceof qx3) {
                    b6e.l(rx3Var, "Illegal model state ");
                    return null;
                }
                return Unit.a;
            case 1:
                lv3 lv3Var = (lv3) obj;
                lv3Var.getClass();
                if (lv3Var instanceof kv3) {
                    xzi xziVar3 = d3jVar.m;
                    if (xziVar3 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    xziVar3.H(false);
                } else {
                    boolean z = lv3Var instanceof iv3;
                    int i2 = R.string.paymentsdk_bind_card_next_button;
                    if (z) {
                        xzi xziVar4 = d3jVar.m;
                        if (xziVar4 == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        int ordinal = ((iv3) lv3Var).a.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                b6e.s();
                                return null;
                            }
                            i2 = R.string.paymentsdk_bind_card_button;
                        }
                        String string = d3jVar.getString(i2);
                        string.getClass();
                        xziVar4.h0(string, null, null);
                        xzi xziVar5 = d3jVar.m;
                        if (xziVar5 == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        xziVar5.H(true);
                        xzi xziVar6 = d3jVar.m;
                        if (xziVar6 == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        xziVar6.g0(cek.a);
                    } else if (lv3Var instanceof jv3) {
                        xzi xziVar7 = d3jVar.m;
                        if (xziVar7 == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        yv3 yv3Var = ((jv3) lv3Var).a;
                        int ordinal2 = yv3Var.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                b6e.s();
                                return null;
                            }
                            i2 = R.string.paymentsdk_bind_card_button;
                        }
                        String string2 = d3jVar.getString(i2);
                        string2.getClass();
                        xziVar7.h0(string2, null, null);
                        xzi xziVar8 = d3jVar.m;
                        if (xziVar8 == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        xziVar8.H(true);
                        xzi xziVar9 = d3jVar.m;
                        if (xziVar9 == null) {
                            Intrinsics.j("callbacks");
                            throw null;
                        }
                        xziVar9.g0(new dek(aek.b));
                        if (yv3Var == yv3.b) {
                            g0c y2 = d3jVar.y();
                            qne b0 = gut.b0(zso.CARD_BIND);
                            x60 x60Var2 = (x60) y2;
                            x60Var2.getClass();
                            x60Var2.a(b0);
                        }
                    }
                }
                return Unit.a;
            default:
                bdv bdvVar = (bdv) obj;
                bdvVar.getClass();
                if (bdvVar instanceof zcv) {
                    xzi xziVar10 = d3jVar.m;
                    if (xziVar10 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    String uri = ((zcv) bdvVar).a.toString();
                    uri.getClass();
                    xziVar10.k(uri, c5b.a);
                } else if (bdvVar instanceof adv) {
                    xzi xziVar11 = d3jVar.m;
                    if (xziVar11 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    adv advVar = (adv) bdvVar;
                    String uri2 = advVar.a.toString();
                    uri2.getClass();
                    xziVar11.k(uri2, advVar.b);
                } else if (bdvVar instanceof ycv) {
                    xzi xziVar12 = d3jVar.m;
                    if (xziVar12 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    xziVar12.t();
                }
                return Unit.a;
        }
    }
}
