package defpackage;

import androidx.compose.ui.platform.a;
import com.yandex.music.core.ui.compose.b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class u43 implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ u43(int i, List list, bzj bzjVar, bg5 bg5Var, boolean z, boolean z2, aqi aqiVar, aqi aqiVar2, po6 po6Var, aqi aqiVar3) {
        this.g = i;
        this.h = list;
        this.i = bzjVar;
        this.j = bg5Var;
        this.c = z;
        this.e = z2;
        this.d = aqiVar;
        this.f = aqiVar2;
        this.b = po6Var;
        this.k = aqiVar3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        zyj zyjVar;
        kjn kjnVar;
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                irf.i((String) this.h, (yci) this.d, (String) this.i, (o0k) this.f, (Function0) this.b, this.c, (Function2) this.k, this.e, (String) this.j, (hq5) obj, rvf.R(this.g | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ksw.n((i31) this.h, (wn5) this.i, (Function0) this.b, (Function0) this.j, this.c, (yci) this.d, (pyc) this.k, this.e, (o0k) this.f, (hq5) obj, rvf.R(this.g | 1));
                break;
            default:
                List list = (List) this.h;
                bzj bzjVar = (bzj) this.i;
                bg5 bg5Var = (bg5) this.j;
                sdr sdrVar = (sdr) this.d;
                sdr sdrVar2 = (sdr) this.f;
                po6 po6Var = (po6) this.b;
                aqi aqiVar = (aqi) this.k;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    yci b = b.b(a.a(vci.a, "queue_item"), this.g);
                    boolean h = oq5Var.h(list);
                    Object K = oq5Var.K();
                    kjn kjnVar2 = gq5.a;
                    if (h || K == kjnVar2) {
                        K = new h50(list, 6);
                        oq5Var.k0(K);
                    }
                    yci b2 = nfp.b(b, false, (Function1) K);
                    int ordinal = bzjVar.ordinal();
                    if (ordinal == 0) {
                        zyjVar = zyj.d;
                    } else if (ordinal != 1) {
                        b6e.s();
                        break;
                    } else {
                        zyjVar = zyj.c;
                    }
                    rba rbaVar = (rba) sdrVar.getValue();
                    lzs lzsVar = (lzs) sdrVar2.getValue();
                    nxq nxqVar = nxq.b;
                    boolean h2 = oq5Var.h(bg5Var);
                    Object K2 = oq5Var.K();
                    if (h2 || K2 == kjnVar2) {
                        kjnVar = kjnVar2;
                        ebm ebmVar = new ebm(0, bg5Var, bg5.class, "onClick", "onClick()V", 0, 29);
                        oq5Var.k0(ebmVar);
                        K2 = ebmVar;
                    } else {
                        kjnVar = kjnVar2;
                    }
                    h9f h9fVar = (h9f) K2;
                    boolean h3 = oq5Var.h(bg5Var);
                    Object K3 = oq5Var.K();
                    if (h3 || K3 == kjnVar) {
                        r9n r9nVar = new r9n(0, bg5Var, bg5.class, "onLongClick", "onLongClick()V", 0, 0);
                        oq5Var.k0(r9nVar);
                        K3 = r9nVar;
                    }
                    h9f h9fVar2 = (h9f) K3;
                    boolean h4 = oq5Var.h(bg5Var);
                    Object K4 = oq5Var.K();
                    if (h4 || K4 == kjnVar) {
                        r9n r9nVar2 = new r9n(0, bg5Var, bg5.class, "onOverflowClick", "onOverflowClick()V", 0, 1);
                        oq5Var.k0(r9nVar2);
                        K4 = r9nVar2;
                    }
                    wn5 C = ild.C(905403218, new t2n(2, po6Var, sdrVar2, aqiVar), oq5Var);
                    boolean z = this.e;
                    wn5 C2 = ild.C(2106544561, new rul(po6Var, z, bg5Var, 1), oq5Var);
                    qgg.l(zyjVar, rbaVar, lzsVar, this.c, z, (Function0) h9fVar, (Function0) h9fVar2, (Function0) ((h9f) K4), C, C2, b2, nxqVar, null, null, null, null, 0L, 0L, null, null, false, oq5Var, 905969664, 48, 0, 2093056);
                } else {
                    oq5Var.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ u43(i31 i31Var, wn5 wn5Var, Function0 function0, Function0 function02, boolean z, yci yciVar, pyc pycVar, boolean z2, o0k o0kVar, int i) {
        this.h = i31Var;
        this.i = wn5Var;
        this.b = function0;
        this.j = function02;
        this.c = z;
        this.d = yciVar;
        this.k = pycVar;
        this.e = z2;
        this.f = o0kVar;
        this.g = i;
    }

    public /* synthetic */ u43(String str, yci yciVar, String str2, o0k o0kVar, Function0 function0, boolean z, Function2 function2, boolean z2, String str3, int i) {
        this.h = str;
        this.d = yciVar;
        this.i = str2;
        this.f = o0kVar;
        this.b = function0;
        this.c = z;
        this.k = function2;
        this.e = z2;
        this.j = str3;
        this.g = i;
    }
}
