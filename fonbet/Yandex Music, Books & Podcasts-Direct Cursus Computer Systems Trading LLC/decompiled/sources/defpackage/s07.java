package defpackage;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.connectsdk.service.airplay.PListParser;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class s07 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ u07 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s07(u07 u07Var, int i) {
        super(1);
        this.r = i;
        this.s = u07Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gc8 gc8Var;
        gc8 gc8Var2;
        gc8 gc8Var3;
        l07 l07Var;
        lom lomVar;
        ow3 ow3Var;
        switch (this.r) {
            case 0:
                rx3 rx3Var = (rx3) obj;
                rx3Var.getClass();
                u07.x(this.s, rx3Var);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                boolean booleanValue = bool.booleanValue();
                u07 u07Var = this.s;
                ((LinearLayout) u07Var.y().d).setVisibility(booleanValue ? 0 : 8);
                ((FrameLayout) u07Var.y().c).setVisibility(booleanValue ? 8 : 0);
                break;
            case 2:
                lv3 lv3Var = (lv3) obj;
                lv3Var.getClass();
                boolean z = lv3Var instanceof kv3;
                u07 u07Var2 = this.s;
                if (z) {
                    l07 l07Var2 = u07Var2.i;
                    if (l07Var2 != null) {
                        l07Var2.H(false);
                    }
                } else if (lv3Var instanceof iv3) {
                    yv3 yv3Var = ((iv3) lv3Var).a;
                    if (yv3Var == yv3.a && (gc8Var3 = u07Var2.l) != null) {
                        gc8Var3.N("card_input_screen_button_state", u07Var2.D(jw3.a));
                    }
                    if (yv3Var == yv3.b && (gc8Var2 = u07Var2.l) != null) {
                        gc8Var2.N("card_input_screen_button_state", u07Var2.D(jw3.c));
                    }
                } else if (lv3Var instanceof jv3) {
                    yv3 yv3Var2 = ((jv3) lv3Var).a;
                    if (yv3Var2 == yv3.a && (gc8Var = u07Var2.l) != null) {
                        gc8Var.N("card_input_screen_button_state", "continue");
                    }
                    if (yv3Var2 == yv3.b) {
                        nw3 nw3Var = u07Var2.v;
                        if (nw3Var != null) {
                            ((x60) u07Var2.z()).a(gut.b0(qgg.I(nw3Var)));
                        }
                        gc8 gc8Var4 = u07Var2.l;
                        if (gc8Var4 != null) {
                            gc8Var4.N("card_input_screen_button_state", "continue");
                        }
                    }
                }
                break;
            case 3:
                bdv bdvVar = (bdv) obj;
                bdvVar.getClass();
                boolean z2 = bdvVar instanceof zcv;
                u07 u07Var3 = this.s;
                if (z2) {
                    l07 l07Var3 = u07Var3.i;
                    if (l07Var3 != null) {
                        String uri = ((zcv) bdvVar).a.toString();
                        uri.getClass();
                        l07Var3.x(uri);
                    }
                } else if (bdvVar instanceof adv) {
                    l07 l07Var4 = u07Var3.i;
                    if (l07Var4 != null) {
                        adv advVar = (adv) bdvVar;
                        String uri2 = advVar.a.toString();
                        uri2.getClass();
                        l07Var4.k(uri2, advVar.b);
                    }
                } else if ((bdvVar instanceof ycv) && (l07Var = u07Var3.i) != null) {
                    l07Var.t();
                }
                break;
            case 4:
                bdv bdvVar2 = (bdv) obj;
                bdvVar2.getClass();
                boolean z3 = bdvVar2 instanceof zcv;
                u07 u07Var4 = this.s;
                if (z3) {
                    lom lomVar2 = u07Var4.j;
                    if (lomVar2 != null) {
                        String uri3 = ((zcv) bdvVar2).a.toString();
                        uri3.getClass();
                        lomVar2.p(uri3, c5b.a);
                    }
                } else if (bdvVar2 instanceof adv) {
                    lom lomVar3 = u07Var4.j;
                    if (lomVar3 != null) {
                        adv advVar2 = (adv) bdvVar2;
                        String uri4 = advVar2.a.toString();
                        uri4.getClass();
                        lomVar3.p(uri4, advVar2.b);
                    }
                } else if ((bdvVar2 instanceof ycv) && (lomVar = u07Var4.j) != null) {
                    lomVar.d();
                }
                break;
            case 5:
                rx3 rx3Var2 = (rx3) obj;
                rx3Var2.getClass();
                u07.x(this.s, rx3Var2);
                break;
            case 6:
                Boolean bool2 = (Boolean) obj;
                u07 u07Var5 = this.s;
                osh oshVar = u07Var5.t;
                if (oshVar != null && (ow3Var = (ow3) oshVar.b) != null) {
                    bool2.getClass();
                    ow3Var.setSaveCardOnPayment(bool2.booleanValue());
                }
                k17 k17Var = u07Var5.h;
                if (k17Var != null) {
                    bool2.getClass();
                    k17Var.setSaveCardOnPayment(bool2.booleanValue());
                }
                nw3 nw3Var2 = u07Var5.v;
                if (nw3Var2 != null) {
                    zso I = qgg.I(nw3Var2);
                    g0c z4 = u07Var5.z();
                    bool2.getClass();
                    ((x60) z4).a(gut.o(bool2.booleanValue(), I, false));
                }
                bool2.getClass();
                String str = bool2.booleanValue() ? PListParser.TAG_TRUE : PListParser.TAG_FALSE;
                gc8 gc8Var5 = u07Var5.l;
                if (gc8Var5 != null) {
                    gc8Var5.N("card_input_screen_checkbox_value", str);
                }
                break;
            case 7:
                sdp sdpVar = (sdp) obj;
                sdpVar.getClass();
                lom lomVar4 = this.s.j;
                if (lomVar4 != null) {
                    lomVar4.f(sdpVar);
                }
                break;
            case 8:
                rfk rfkVar = (rfk) obj;
                rfkVar.getClass();
                if (this.s.j != null) {
                    cfk.e.a(rfkVar);
                }
                break;
            case 9:
                ix3 ix3Var = (ix3) obj;
                ix3Var.getClass();
                this.s.A().v = ix3Var;
                break;
            case 10:
                this.s.A();
                break;
            default:
                ene eneVar = (ene) obj;
                eneVar.getClass();
                gc8 gc8Var6 = this.s.l;
                if (gc8Var6 != null) {
                    gc8Var6.N("card_input_screen_error_state", eneVar.a);
                }
                break;
        }
        return Unit.a;
    }
}
