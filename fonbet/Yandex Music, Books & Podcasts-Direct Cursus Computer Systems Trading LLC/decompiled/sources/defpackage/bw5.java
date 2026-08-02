package defpackage;

import android.view.Window;
import androidx.compose.foundation.lazy.a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class bw5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bw5(boolean z, ew5 ew5Var) {
        this.a = 0;
        this.b = z;
        this.c = ew5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                final ew5 ew5Var = (ew5) this.c;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                boolean z = this.b;
                vuf.Y(vufVar, null, new wn5(new o91(z, ew5Var, 1), -637794083, true), 3);
                final int i = 0;
                vuf.Y(vufVar, null, new wn5(new pyc() { // from class: dw5
                    @Override // defpackage.pyc
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i2 = i;
                        ew5 ew5Var2 = ew5Var;
                        switch (i2) {
                            case 0:
                                hq5 hq5Var = (hq5) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                ((a) obj2).getClass();
                                if ((intValue & 17) == 16) {
                                    oq5 oq5Var = (oq5) hq5Var;
                                    if (oq5Var.z()) {
                                        oq5Var.S();
                                        break;
                                    }
                                }
                                xcs.b(ew5Var2.b, androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 16, 0.0f, 32, 5), ((dq0) ((oq5) hq5Var).j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), hq5Var, 48, 0, 65528);
                            default:
                                hq5 hq5Var2 = (hq5) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                ((a) obj2).getClass();
                                if ((intValue2 & 17) == 16) {
                                    oq5 oq5Var2 = (oq5) hq5Var2;
                                    if (oq5Var2.z()) {
                                        oq5Var2.S();
                                        break;
                                    }
                                }
                                n7w.k(0, hq5Var2, null, rvf.M(R.string.concert_info_event_type_title, hq5Var2), j66.d0(ew5Var2.i.d(), hq5Var2));
                        }
                        return Unit.a;
                    }
                }, 808361300, true), 3);
                if (z) {
                    final int i2 = 1;
                    vuf.Y(vufVar, null, new wn5(new pyc() { // from class: dw5
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i22 = i2;
                            ew5 ew5Var2 = ew5Var;
                            switch (i22) {
                                case 0:
                                    hq5 hq5Var = (hq5) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    ((a) obj2).getClass();
                                    if ((intValue & 17) == 16) {
                                        oq5 oq5Var = (oq5) hq5Var;
                                        if (oq5Var.z()) {
                                            oq5Var.S();
                                            break;
                                        }
                                    }
                                    xcs.b(ew5Var2.b, androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 16, 0.0f, 32, 5), ((dq0) ((oq5) hq5Var).j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), hq5Var, 48, 0, 65528);
                                default:
                                    hq5 hq5Var2 = (hq5) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    ((a) obj2).getClass();
                                    if ((intValue2 & 17) == 16) {
                                        oq5 oq5Var2 = (oq5) hq5Var2;
                                        if (oq5Var2.z()) {
                                            oq5Var2.S();
                                            break;
                                        }
                                    }
                                    n7w.k(0, hq5Var2, null, rvf.M(R.string.concert_info_event_type_title, hq5Var2), j66.d0(ew5Var2.i.d(), hq5Var2));
                            }
                            return Unit.a;
                        }
                    }, -1386143112, true), 3);
                }
                String str = ew5Var.c;
                if (str != null) {
                    vuf.Y(vufVar, null, new wn5(new mf3(str, 1), 2146923453, true), 3);
                }
                String str2 = ew5Var.e;
                if (str2 != null) {
                    vuf.Y(vufVar, null, new wn5(new mf3(str2, 2), 1157287988, true), 3);
                }
                String str3 = ew5Var.d;
                if (str3 != null) {
                    vuf.Y(vufVar, null, new wn5(new mf3(str3, 3), -2093891339, true), 3);
                }
                return Unit.a;
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                vuf vufVar2 = (vuf) obj;
                vufVar2.getClass();
                vufVar2.Z(arrayList.size(), null, new vv(arrayList, 23), new wn5(new p8i(arrayList, this.b), -632812321, true));
                return Unit.a;
            default:
                Window window = (Window) this.c;
                ((oa8) obj).getClass();
                window.getClass();
                vyr vyrVar = vyr.StatusBar;
                boolean q = c9g.q(window, vyrVar);
                vyr vyrVar2 = vyr.NavigationBar;
                bzr bzrVar = new bzr(q, c9g.q(window, vyrVar2));
                c9g.u(window, vyrVar, false);
                boolean z2 = this.b;
                if (z2) {
                    c9g.u(window, vyrVar2, false);
                }
                return new pxo(window, bzrVar, z2, 1);
        }
    }

    public /* synthetic */ bw5(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }
}
