package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lns8;", "Landroidx/fragment/app/o;", "<init>", "()V", "bdu-communication-screens"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class ns8 extends o {
    public final jyr g;
    public final jyr h;
    public final jyr i;
    public final jyr j;
    public final jyr k;
    public final qxp l;
    public final ybf m;
    public final ybf n;
    public final jyr o;
    public final jyr p;
    public boolean q;

    public ns8() {
        bdt I = hag.I(lzp.class);
        l18 l18Var = l18.b;
        this.g = l18Var.b(I, true);
        this.h = l18Var.b(hag.I(ay2.class), true);
        this.i = l18Var.b(hag.I(qy2.class), true);
        this.j = btf.b(new js8(this, 0));
        this.k = btf.b(new js8(this, 1));
        this.l = new qxp(this);
        this.m = new ybf(ern.a(bt8.class), new ms8(this, 0), new gz4(14, new js8(this, 2)));
        this.n = new ybf(ern.a(lhk.class), new ms8(this, 1), new gz4(15, new js8(this, 3)));
        this.o = btf.b(new js8(this, 4));
        this.p = btf.b(new js8(this, 5));
    }

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hs8 y = y();
        if (y == null) {
            ((fs8) this.k.getValue()).a.finish();
        } else {
            ys8 ys8Var = y.d;
            bt8 z = z();
            ys8 ys8Var2 = ys8.a;
            if (ys8Var == ys8Var2) {
                ox6.B(zsd.b0(new d64(z.q, 26)), ot0.F(z), new u58(3, z));
            }
            bt8 z2 = z();
            rs8 rs8Var = new rs8(y.a, y.b, y.c, ys8Var);
            xdr xdrVar = z2.o;
            ts8 ts8Var = new ts8(rs8Var);
            xdrVar.getClass();
            xdrVar.m(null, ts8Var);
            this.q = ys8Var == ys8Var2;
        }
        if (!this.q || Build.VERSION.SDK_INT == 26) {
            return;
        }
        t l = l();
        if (l != null) {
            l.setRequestedOrientation(1);
        }
        z().m.a.a("DivCommunication.Fullscreen.PortraitForced", null);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        if (this.q) {
            ((ls8) this.p.getValue()).enable();
        }
        os8 os8Var = new os8(0);
        os8Var.b = new LinkedHashMap();
        ny2 ny2Var = new ny2(14, this, os8Var);
        if (!this.q) {
            nt0.N(this, new jp0(new js8(this, 6)), new wn5(new kv4(22, ny2Var), -405227046, true));
            return null;
        }
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        return (gc8) ((g06) ny2Var.invoke(viewLifecycleOwner)).d;
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.q) {
            ((ls8) this.p.getValue()).disable();
        }
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        qpj onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.a(viewLifecycleOwner, (ks8) this.o.getValue());
    }

    public final String x() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("anchor_id") : null;
        if (string == null || string.length() == 0) {
            ssg.a(6, "DivCommunicationFragment", "anchorId is null or empty", null);
            requireActivity().finish();
        }
        return string == null ? "" : string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
    
        if (r2 == null) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hs8 y() {
        ys8 ys8Var;
        ys8 ys8Var2;
        gs8 gs8Var = (gs8) this.j.getValue();
        String x = x();
        gs8Var.getClass();
        jyr jyrVar = k3j.e;
        if (ixf.x()) {
            is8 is8Var = (is8) gs8Var.c.getValue();
            is8Var.getClass();
            xh5 xh5Var = (xh5) is8Var.a.remove(x);
            if (xh5Var == null) {
                oi5 oi5Var = (oi5) gs8Var.a.getValue();
                oi5Var.getClass();
                List list = (List) ((Map) oi5Var.e.getValue()).get(x);
                xh5Var = list != null ? oi5.a(null, list) : null;
            }
            if (xh5Var instanceof mh5) {
                mh5 mh5Var = (mh5) xh5Var;
                rv8 rv8Var = mh5Var.d;
                switch (mh5Var.c.a.ordinal()) {
                    case 0:
                        ys8Var = ys8.a;
                        break;
                    case 1:
                        ys8Var = ys8.b;
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ys8Var = null;
                        break;
                    default:
                        b6e.s();
                        return null;
                }
                if (ys8Var != null) {
                    return new hs8(mh5Var.a, mh5Var.b, rv8Var, ys8Var);
                }
            } else if (!(xh5Var instanceof vh5) && !(xh5Var instanceof ph5) && !(xh5Var instanceof dh5) && !(xh5Var instanceof kh5) && !(xh5Var instanceof lh5)) {
                b6e.s();
            }
        } else {
            xh5 a = pi5.a((pi5) gs8Var.b.getValue(), x);
            if (a != null) {
                if (a instanceof mh5) {
                    mh5 mh5Var2 = (mh5) a;
                    rv8 rv8Var2 = mh5Var2.d;
                    switch (mh5Var2.c.a.ordinal()) {
                        case 0:
                            ys8Var2 = ys8.a;
                            break;
                        case 1:
                            ys8Var2 = ys8.b;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            ys8Var2 = null;
                            break;
                        default:
                            b6e.s();
                            return null;
                    }
                    if (ys8Var2 != null) {
                        return new hs8(mh5Var2.a, mh5Var2.b, rv8Var2, ys8Var2);
                    }
                } else if (!(a instanceof vh5) && !(a instanceof ph5) && !(a instanceof dh5) && !(a instanceof kh5) && !(a instanceof lh5)) {
                    b6e.s();
                    return null;
                }
            }
        }
        return null;
    }

    public final bt8 z() {
        return (bt8) this.m.getValue();
    }
}
