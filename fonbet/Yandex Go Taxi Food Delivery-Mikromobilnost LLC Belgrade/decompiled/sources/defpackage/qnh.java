package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import androidx.concurrent.futures.b;
import com.google.android.material.dockedtoolbar.DockedToolbarLayout;
import com.yandex.go.address.models.Address;
import com.yandex.mapkit.navigation.automotive.Navigation;
import com.yandex.messaging.internal.v;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;
import ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.d;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes15.dex */
public final class qnh implements ri51, vi51, iqs, s6l0, ajs, rdq0, pdj, uk2, xog, vm11, yxk, hw31, jyi0 {
    public final Object a;

    public qnh(bvh bvhVar) {
        Address address = bvhVar.a;
        String e2 = address.e2();
        String str = e2 == null ? "" : e2;
        String J1 = address.J1();
        String str2 = J1 == null ? "" : J1;
        String H1 = address.H1();
        String str3 = H1 == null ? "" : H1;
        String e0 = address.e0();
        String str4 = e0 == null ? "" : e0;
        String n0 = address.n0();
        String str5 = n0 == null ? "" : n0;
        bgq0 d1 = address.d1();
        this.a = bvf0.c(new yr0(d1 == null ? bgq0.f : d1, address, str, str2, str3, str4, str5));
    }

    @Override // defpackage.rdq0
    public void B0() {
    }

    @Override // defpackage.rdq0
    public void I(bgq0 bgq0Var) {
        ((mde) this.a).j.invoke(new s9e(bgq0Var.a, bgq0Var.b));
    }

    public boolean a() {
        int b = ((qj41) this.a).b();
        return b == -8 || b == -7 || b == -6 || b == -2;
    }

    public void b(Object obj) {
        ((ValueCallback) this.a).onReceiveValue(obj);
    }

    @Override // defpackage.uk2
    public void c(wnt0 wnt0Var) {
        ((Navigation) ((fmj) this.a).a).getGuidance().getAnnotator().setSpeaker(wnt0Var);
    }

    public k4i d(j4n j4nVar) {
        s14 s14Var = (s14) this.a;
        int i = 13;
        lk lkVar = new lk(i, new kyf(j4nVar, 5));
        int i2 = 3;
        jyf jyfVar = new jyf(s14Var, i2);
        jyf jyfVar2 = new jyf(s14Var, i);
        int i3 = 6;
        jyf jyfVar3 = new jyf(s14Var, i3);
        int i4 = 1;
        jyf jyfVar4 = new jyf(s14Var, i4);
        jyf jyfVar5 = new jyf(s14Var, 10);
        jyf jyfVar6 = new jyf(s14Var, 12);
        jyf jyfVar7 = new jyf(s14Var, 0);
        jyf jyfVar8 = new jyf(s14Var, 11);
        int i5 = 2;
        jyf jyfVar9 = new jyf(s14Var, i5);
        n3w a = n3w.a(new cs4(new h0w(20, new kxb0(new so4(jyfVar, jyfVar2, jyfVar3, jyfVar4, jyfVar5, jyfVar6, jyfVar7, jyfVar8, jyfVar9, 1), 15), jyfVar4)));
        kyf kyfVar = new kyf(j4nVar, i5);
        kyf kyfVar2 = new kyf(j4nVar, i2);
        jyf jyfVar10 = new jyf(s14Var, 4);
        kyf kyfVar3 = new kyf(j4nVar, i3);
        xvf0 b = i5m.b(new k4((xvf0) wq0.a, (xvf0) lkVar, (xvf0) new g6((xvf0) a, (xvf0) kyfVar, (xvf0) kyfVar2, (xvf0) jyfVar10, (xvf0) kyfVar3, 9), (xvf0) ech.a, (xvf0) noj.a, (xvf0) k500.a, (xvf0) brf0.a, (xvf0) ukp0.a, (xvf0) nms0.a, (xvf0) vkt0.a, (xvf0) pmt0.a, 4, false));
        kyf kyfVar4 = new kyf(j4nVar, i4);
        xvf0 b2 = i5m.b(new gmh(new p6f(b, 9), 6));
        xvf0 b3 = i5m.b(x4i.a);
        xvf0 b4 = i5m.b(new gmh(jyfVar5, 5));
        xdc xdcVar = wdc.a;
        xat xatVar = new xat(xdcVar, 20);
        id3 id3Var = hd3.a;
        int i6 = 23;
        f2b f2bVar = new f2b(xdcVar, xatVar, id3Var, i6);
        tl3 tl3Var = new tl3(xdcVar, 6);
        epf epfVar = new epf(xatVar, f2bVar, xdcVar, tl3Var, new di20(xatVar, xdcVar, tl3Var, 3), id3Var, new vm80(id3Var, x590.a, i6));
        int i7 = 0;
        xvf0 b5 = i5m.b(new bpf(b4, (xvf0) g5i.a, (xvf0) epfVar, (xvf0) new kyf(j4nVar, i7), 10));
        jyf jyfVar11 = new jyf(s14Var, 5);
        kyf kyfVar5 = new kyf(j4nVar, 4);
        xvf0 b6 = i5m.b(r4i.a);
        xvf0 b7 = i5m.b(v4i.a);
        xvf0 b8 = i5m.b(new nt0(b2, b3, kyfVar3, b5, jyfVar11, jyfVar10, kyfVar5, b6, jyfVar4, b7));
        jyf jyfVar12 = new jyf(s14Var, 8);
        xvf0 b9 = i5m.b(new qrb((xvf0) kyfVar4, (xvf0) jyfVar10, (xvf0) new di20(kyfVar, new jl00(new epf(jyfVar, jyfVar3, jyfVar7, jyfVar2, jyfVar6, jyfVar8, jyfVar12, 26), 13), jyfVar9, 7), (xvf0) jyfVar4, (xvf0) jyfVar11, 11, (byte) 0));
        c1 c1Var = new c1(b9, 5);
        peb pebVar = new peb(jyfVar9, 6);
        yk4 yk4Var = new yk4(pebVar, i7);
        qh4 qh4Var = new qh4(jyfVar6, pebVar);
        qh4 qh4Var2 = new qh4(pebVar, jyfVar6);
        ubq0 ubq0Var = new ubq0((xvf0) c1Var, (xvf0) yk4Var, (xvf0) pebVar, (xvf0) equ.a, (xvf0) qh4Var, (xvf0) qh4Var2, (xvf0) jyfVar12, 13);
        okp0 okp0Var = new okp0(ubq0Var, i4);
        okp0 okp0Var2 = new okp0(ubq0Var, i7);
        p6f p6fVar = new p6f(jyfVar7, 7);
        jyf jyfVar13 = new jyf(s14Var, 9);
        ncb ncbVar = new ncb(c1Var, pebVar, qh4Var, b7, p6fVar, jyfVar13);
        lk lkVar2 = new lk(5, c1Var);
        yk4 yk4Var2 = new yk4(pebVar, i4);
        return new k4i((qcp0) s14Var.k, new w3i((y30) s14Var.b, (dci) s14Var.g, new lhg((jwh) s14Var.i), (hwy0) s14Var.j, new tgg((Set) b.get()), (d) i5m.b(new bpf(kyfVar4, b8, new epf(new ut(okp0Var, b7, okp0Var2, new prq((xvf0) ncbVar, (xvf0) lkVar2, (xvf0) new oti(qh4Var, yk4Var2, 24), (xvf0) qh4Var, (xvf0) c1Var, 23), lkVar2, new qrb((xvf0) c1Var, (xvf0) qh4Var, (xvf0) yk4Var2, (xvf0) qh4Var2, (xvf0) new di20(qh4Var, pebVar, qh4Var2), 14, (byte) 0), new ph70((xvf0) c1Var, (xvf0) ncbVar, (xvf0) qh4Var, (xvf0) yk4Var2, (xvf0) pebVar, (xvf0) qh4Var2, 12), new e3u((xvf0) qh4Var, (xvf0) yk4Var2, (xvf0) ncbVar, 1), nkt0.a, es4.a, jyfVar12, c1Var, qh4Var, mc1.a), jyfVar2, b7, b6, kyfVar3, new wif((Object) jyfVar10, (xvf0) new can(jyfVar13, new jyf(s14Var, 7), 5), 16), b9), b9)).get(), (rpb) i5m.b(t4i.a).get()), (v3i) j4nVar.c, (h4i) j4nVar.x);
    }

    public void e(ViewGroup viewGroup, int i, boolean z) {
        Integer num;
        int i2;
        gbi gbiVar = (gbi) this.a;
        if (gbiVar.a.t) {
            if (i == 0) {
                i2 = mzg0.logistics_bottom_corners_round;
            } else {
                mji0 mji0Var = (mji0) gbiVar.c.a.getValue();
                Integer valueOf = mji0Var != null ? Integer.valueOf(mji0Var.a.size()) : null;
                i2 = (valueOf == null || i != valueOf.intValue() + (-1)) ? mzg0.logistics_all_corners_round : mzg0.logistics_top_corners_round;
            }
            num = Integer.valueOf(i2);
        } else {
            num = null;
        }
        if (num != null) {
            viewGroup.setBackgroundResource(num.intValue());
            if (z) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = (int) uh6.o(3.0f);
                viewGroup.setLayoutParams(marginLayoutParams);
            }
        }
    }

    @Override // defpackage.pdj
    public qdj f(tdj tdjVar, Activity activity, zch zchVar) {
        AlertDialog message = new AlertDialog(activity).setTitle(tdjVar.b, tdjVar.d).setMessage(tdjVar.c, tdjVar.e);
        String str = tdjVar.g;
        if (str != null && str.length() != 0) {
            message.setPositiveButton(str);
        }
        String str2 = tdjVar.h;
        if (str2 != null && str2.length() != 0) {
            message.setNegativeButton(str2);
        }
        ((rdj) this.a).k(message);
        return zchVar.I(tdjVar, message);
    }

    @Override // defpackage.xog
    public e1k g(h3t0 h3t0Var, zog zogVar) {
        return ((v) ((q0k) this.a).e.get()).c(zy11.a, new ot7(2, this, zogVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    @Override // defpackage.hw31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n751 k(View view, n751 n751Var, iw31 iw31Var) {
        Boolean bool;
        boolean hasGravity;
        int i;
        boolean hasGravity2;
        int i2;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        DockedToolbarLayout dockedToolbarLayout = (DockedToolbarLayout) this.a;
        bool = dockedToolbarLayout.paddingTopSystemWindowInsets;
        if (bool != null) {
            bool8 = dockedToolbarLayout.paddingBottomSystemWindowInsets;
            if (bool8 != null) {
                bool9 = dockedToolbarLayout.paddingTopSystemWindowInsets;
                if (!bool9.booleanValue()) {
                    bool10 = dockedToolbarLayout.paddingBottomSystemWindowInsets;
                    if (!bool10.booleanValue()) {
                        return n751Var;
                    }
                }
            }
        }
        u1w g = n751Var.a.g(655);
        int i3 = g.d;
        int i4 = g.b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        hasGravity = dockedToolbarLayout.hasGravity(layoutParams, 48);
        if (hasGravity) {
            bool7 = dockedToolbarLayout.paddingTopSystemWindowInsets;
            if (bool7 == null && dockedToolbarLayout.getFitsSystemWindows()) {
                i = i4;
                hasGravity2 = dockedToolbarLayout.hasGravity(layoutParams, 80);
                if (hasGravity2) {
                    bool6 = dockedToolbarLayout.paddingBottomSystemWindowInsets;
                    if (bool6 == null && dockedToolbarLayout.getFitsSystemWindows()) {
                        i2 = i3;
                        bool2 = dockedToolbarLayout.paddingBottomSystemWindowInsets;
                        if (bool2 != null) {
                            bool5 = dockedToolbarLayout.paddingBottomSystemWindowInsets;
                            if (!bool5.booleanValue()) {
                                i3 = 0;
                            }
                            i2 = i3;
                        }
                        bool3 = dockedToolbarLayout.paddingTopSystemWindowInsets;
                        if (bool3 != null) {
                            bool4 = dockedToolbarLayout.paddingTopSystemWindowInsets;
                            if (!bool4.booleanValue()) {
                                i4 = 0;
                            }
                            i = i4;
                        }
                        int i5 = iw31Var.b + i;
                        iw31Var.b = i5;
                        int i6 = iw31Var.d + i2;
                        iw31Var.d = i6;
                        view.setPaddingRelative(iw31Var.a, i5, iw31Var.c, i6);
                        return n751Var;
                    }
                }
                i2 = 0;
                bool2 = dockedToolbarLayout.paddingBottomSystemWindowInsets;
                if (bool2 != null) {
                }
                bool3 = dockedToolbarLayout.paddingTopSystemWindowInsets;
                if (bool3 != null) {
                }
                int i52 = iw31Var.b + i;
                iw31Var.b = i52;
                int i62 = iw31Var.d + i2;
                iw31Var.d = i62;
                view.setPaddingRelative(iw31Var.a, i52, iw31Var.c, i62);
                return n751Var;
            }
        }
        i = 0;
        hasGravity2 = dockedToolbarLayout.hasGravity(layoutParams, 80);
        if (hasGravity2) {
        }
        i2 = 0;
        bool2 = dockedToolbarLayout.paddingBottomSystemWindowInsets;
        if (bool2 != null) {
        }
        bool3 = dockedToolbarLayout.paddingTopSystemWindowInsets;
        if (bool3 != null) {
        }
        int i522 = iw31Var.b + i;
        iw31Var.b = i522;
        int i622 = iw31Var.d + i2;
        iw31Var.d = i622;
        view.setPaddingRelative(iw31Var.a, i522, iw31Var.c, i622);
        return n751Var;
    }

    @Override // defpackage.iqs
    public void onFailure(Throwable th) {
        boolean z = th instanceof TimeoutException;
        b bVar = (b) this.a;
        if (z) {
            bVar.d(th);
        } else {
            bVar.b(Collections.EMPTY_LIST);
        }
    }

    @Override // defpackage.iqs
    public void onSuccess(Object obj) {
        List list = (List) obj;
        list.getClass();
        ((b) this.a).b(new ArrayList(list));
    }

    @Override // defpackage.vm11
    public Object q() {
        return (JSONObject) this.a;
    }

    @Override // defpackage.jyi0
    public void release() {
    }

    @Override // defpackage.jyi0
    public iyi0[] s() {
        return (iyi0[]) this.a;
    }

    @Override // defpackage.jyi0
    public int size() {
        return 0;
    }

    @Override // defpackage.vm11
    public boolean t(Object obj) {
        return obj instanceof JSONObject;
    }

    public /* synthetic */ qnh(Object obj) {
        this.a = obj;
    }

    public qnh(int i) {
        switch (i) {
            case 23:
                this.a = new JSONObject();
                break;
            default:
                this.a = new ArrayDeque();
                break;
        }
    }
}
