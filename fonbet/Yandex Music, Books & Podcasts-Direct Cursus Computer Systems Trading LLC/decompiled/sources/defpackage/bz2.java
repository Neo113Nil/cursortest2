package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.music.shared.playback.core.api.PlaybackQueueStartValidator$InvalidQueueException;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes3.dex */
public class bz2 implements xhu, c04, fii, e9n, ui4, w8n, fyh {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;

    public bz2(int i) {
        this.a = i;
        switch (i) {
            case 11:
                this.c = new SparseBooleanArray();
                break;
            case 16:
                this.c = new Handler(Looper.getMainLooper(), new du2(1));
                break;
            default:
                this.c = new mvt(20);
                break;
        }
    }

    public static int M(sc8 sc8Var, dp8 dp8Var) {
        switch (sc8Var.ordinal()) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 5;
            case 3:
                return 11;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 9;
            case 7:
                return 6;
            case 8:
                return 8;
            case 9:
                return 13;
            case 10:
                return 12;
            case 11:
                if (dp8Var instanceof l49) {
                    return 3;
                }
                if (dp8Var instanceof xq9) {
                    return 11;
                }
                if (dp8Var instanceof vo9) {
                    return 9;
                }
                if (dp8Var instanceof ei9) {
                    return 8;
                }
                if (dp8Var instanceof zk9) {
                    return 7;
                }
                if ((dp8Var instanceof i29) || (dp8Var instanceof i19)) {
                    return 5;
                }
                if (dp8Var instanceof s09) {
                    tc8 tc8Var = ((s09) dp8Var).a;
                    if ((tc8Var != null ? tc8Var.a : null) != null) {
                        return 10;
                    }
                }
                if (dp8Var instanceof jt8) {
                    return 14;
                }
                return dp8Var instanceof jo9 ? 15 : 1;
            default:
                b6e.s();
                return 0;
        }
    }

    public static void m(View view, dp8 dp8Var, Boolean bool) {
        sc8 sc8Var;
        tc8 q = dp8Var.q();
        int M = (q == null || (sc8Var = q.g) == null) ? 0 : M(sc8Var, dp8Var);
        if (M == 13 || M == 12) {
            a e = wdu.e(view);
            o1c o1cVar = e instanceof o1c ? (o1c) e : null;
            if (o1cVar != null) {
                o1cVar.g = bool;
            }
        }
    }

    public static void n(View view, String str, String str2) {
        if (str == null) {
            str = str2;
        } else if (str2 != null && !str.equals(str2)) {
            str = hrg.l('\n', str, str2);
        }
        view.setContentDescription(str);
    }

    public static void p(View view, dp8 dp8Var, rc8 rc8Var) {
        CharSequence contentDescription;
        int i = 0;
        rc8 rc8Var2 = rc8.MERGE;
        boolean z = rc8Var == rc8Var2;
        WeakHashMap weakHashMap = wdu.a;
        new jdu(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).g(view, Boolean.valueOf(z));
        if (rc8Var == rc8.EXCLUDE) {
            i = 4;
        } else {
            tc8 q = dp8Var.q();
            if ((q != null ? q.g : null) == sc8.HEADER || ((contentDescription = view.getContentDescription()) != null && !StringsKt.U(contentDescription) && (rc8Var == rc8Var2 || (view instanceof i39) || (view instanceof v19)))) {
                i = 1;
            }
        }
        view.setImportantForAccessibility(i);
    }

    public static bz2 t(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                arrayList.add(bundle2 != null ? new dqh(bundle2) : null);
            }
        }
        return new bz2(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public void A(byte b) {
        ((que) this.c).writeLong(b);
    }

    public void B(char c) {
        ((que) this.c).e(c);
    }

    public void C(int i) {
        ((que) this.c).writeLong(i);
    }

    public void D(long j) {
        ((que) this.c).writeLong(j);
    }

    public void E(String str) {
        str.getClass();
        ((que) this.c).z(str);
    }

    public void F(short s) {
        ((que) this.c).writeLong(s);
    }

    public void G(String str) {
        str.getClass();
        ((que) this.c).y(str);
    }

    public synchronized void H(k2o k2oVar, boolean z) {
        try {
            if (!this.b && !z) {
                this.b = true;
                k2oVar.g();
                this.b = false;
            }
            ((Handler) this.c).obtainMessage(1, k2oVar).sendToTarget();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.w8n
    public Object J(igr igrVar) {
        nyu R = v7g.R(igrVar);
        xsu xsuVar = igrVar.c;
        xsuVar.getClass();
        nyn nynVar = nyn.a;
        return new og5(R, xsuVar, this.b);
    }

    public void K() {
        xdr xdrVar = (xdr) ((x8a) this.c).c;
        Boolean bool = Boolean.TRUE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
        this.b = true;
    }

    public void L() {
        xdr xdrVar = (xdr) ((x8a) this.c).c;
        Boolean bool = Boolean.FALSE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
        this.b = false;
    }

    public void O(fgx fgxVar) {
        if (this.b) {
            l8x.g("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((n3m) this.c).P0(new bd2(null, fgxVar, lsm.a, null), new wvs(9));
        } catch (Throwable unused) {
            l8x.g("BillingLogger", "logging failed.");
        }
    }

    @Override // defpackage.w8n
    public Object Q(se5 se5Var) {
        return new og5(se5Var, this.b, (h4q) this.c);
    }

    @Override // defpackage.fii
    public void a(rf3 rf3Var) {
        lg3.e0("TabReselected", Collections.singletonMap("tab", rf3Var.name().toLowerCase(Locale.US)));
        np2 np2Var = (np2) this.c;
        lhs lhsVar = MainScreenActivity.Q0;
        np2Var.startActivity(imp.J(np2Var, rf3Var, null, null, 12));
    }

    @Override // defpackage.w8n
    public Object b(uid uidVar) {
        throw new PlaybackQueueStartValidator$InvalidQueueException(new FailedAssertionException("glagol is not expected to be launched as remote command"), null);
    }

    @Override // defpackage.c04
    public pjc c() {
        int i = 9;
        boolean z = this.b;
        a04 a04Var = (a04) this.c;
        int i2 = 0;
        int i3 = 1;
        Continuation continuation = null;
        if (z) {
            yx4 yx4Var = (yx4) a04Var.b.getValue();
            return zsd.M0(new wz3(yx4.y(new pjc[]{((e6q) yx4Var.a).e}, new vw4(yx4Var, i, continuation, i3)), a04Var, i2), new d04(null, this));
        }
        yx4 yx4Var2 = (yx4) a04Var.b.getValue();
        return new fs(7, new wz3(yx4.y(new pjc[]{((e6q) yx4Var2.a).e}, new vw4(yx4Var2, i, continuation, i3)), a04Var, i2));
    }

    @Override // defpackage.ui4
    public jtp d(wi4 wi4Var) {
        wi4Var.getClass();
        String str = wi4Var.a;
        if (str.equals("success")) {
            return nif.d(fgk.a);
        }
        if (str.equals("wait_for_notification")) {
            bro[] broVarArr = bro.a;
            bro[] broVarArr2 = bro.a;
        }
        return nif.c(new k03(q1c.b, r1c.a, null, str, hrg.q("Unable to convert status ", str, " to PollingResult")));
    }

    @Override // defpackage.fyh
    public void e(hxh hxhVar, boolean z) {
        dg dgVar;
        tos tosVar = (tos) this.c;
        if (this.b) {
            return;
        }
        this.b = true;
        ActionMenuView actionMenuView = tosVar.a.a.a;
        if (actionMenuView != null && (dgVar = actionMenuView.t) != null) {
            dgVar.f();
            ag agVar = dgVar.t;
            if (agVar != null && agVar.b()) {
                agVar.i.dismiss();
            }
        }
        tosVar.b.onPanelClosed(108, hxhVar);
        this.b = false;
    }

    @Override // defpackage.e9n
    public void f(d9n d9nVar, int i) {
        StringBuilder sb = (StringBuilder) this.c;
        if (this.b) {
            this.b = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    @Override // defpackage.ui4
    public y7o g(wi4 wi4Var) {
        ft7 ft7Var;
        wi4Var.getClass();
        String str = wi4Var.a;
        String str2 = wi4Var.h;
        String str3 = wi4Var.f;
        if (str.equals("success")) {
            return ngg.F(ggm.done);
        }
        if (!str.equals("wait_for_notification")) {
            return new y7o(null, cxb.o0(wi4Var));
        }
        if (str3 != null && str2 != null) {
            try {
                if (!this.b) {
                    this.b = true;
                    try {
                        String uri = new URI(str3).toString();
                        uri.getClass();
                        Uri parse = Uri.parse(uri);
                        parse.getClass();
                        ft7Var = new ft7(parse);
                    } catch (Throwable unused) {
                        ft7Var = null;
                    }
                    if (ft7Var == null) {
                        return new y7o(null, cxb.X(str3, "paymentFormUrl", wi4Var));
                    }
                    ((s30) this.c).invoke(ft7Var, str2);
                    bro[] broVarArr = bro.a;
                    bro[] broVarArr2 = bro.a;
                }
            } catch (RuntimeException e) {
                return new y7o(null, cxb.L(wi4Var, e));
            }
        }
        return ngg.F(ggm.retry);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    @Override // defpackage.xhu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kqv h(View view, kqv kqvVar, weg wegVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i;
        boolean z9 = this.b;
        hqv hqvVar = kqvVar.a;
        zne g = hqvVar.g(519);
        zne g2 = hqvVar.g(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.c;
        int i2 = g.b;
        int i3 = g.c;
        int i4 = g.a;
        bottomSheetBehavior.insetTop = i2;
        boolean z10 = true;
        boolean z11 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        z = bottomSheetBehavior.paddingBottomSystemWindowInsets;
        if (z) {
            bottomSheetBehavior.insetBottom = kqvVar.a();
            int i5 = wegVar.d;
            i = bottomSheetBehavior.insetBottom;
            paddingBottom = i + i5;
        }
        z2 = bottomSheetBehavior.paddingLeftSystemWindowInsets;
        if (z2) {
            paddingLeft = (z11 ? wegVar.c : wegVar.a) + i4;
        }
        z3 = bottomSheetBehavior.paddingRightSystemWindowInsets;
        if (z3) {
            paddingRight = (z11 ? wegVar.a : wegVar.c) + i3;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        z4 = bottomSheetBehavior.marginLeftSystemWindowInsets;
        if (!z4 || marginLayoutParams.leftMargin == i4) {
            z5 = false;
        } else {
            marginLayoutParams.leftMargin = i4;
            z5 = true;
        }
        z6 = bottomSheetBehavior.marginRightSystemWindowInsets;
        if (z6 && marginLayoutParams.rightMargin != i3) {
            marginLayoutParams.rightMargin = i3;
            z5 = true;
        }
        z7 = bottomSheetBehavior.marginTopSystemWindowInsets;
        if (z7) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = g.b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
                if (z10) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                if (z9) {
                    bottomSheetBehavior.gestureInsetBottom = g2.d;
                }
                z8 = bottomSheetBehavior.paddingBottomSystemWindowInsets;
                if (z8 && !z9) {
                    return kqvVar;
                }
                bottomSheetBehavior.updatePeekHeight(false);
                return kqvVar;
            }
        }
        z10 = z5;
        if (z10) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        if (z9) {
        }
        z8 = bottomSheetBehavior.paddingBottomSystemWindowInsets;
        if (z8) {
        }
        bottomSheetBehavior.updatePeekHeight(false);
        return kqvVar;
    }

    public void i(int i) {
        vq1.A(!this.b);
        ((SparseBooleanArray) this.c).append(i, true);
    }

    public void j(xgc xgcVar) {
        for (int i = 0; i < xgcVar.a.size(); i++) {
            i(xgcVar.b(i));
        }
    }

    public void k(int... iArr) {
        for (int i : iArr) {
            i(i);
        }
    }

    @Override // defpackage.fii
    public boolean l(rf3 rf3Var) {
        lg3.e0("TabSelected", Collections.singletonMap("tab", rf3Var.name().toLowerCase(Locale.US)));
        np2 np2Var = (np2) this.c;
        lhs lhsVar = MainScreenActivity.Q0;
        Intent J = imp.J(np2Var, rf3Var, null, null, 12);
        if (this.b) {
            J.addFlags(268435456);
        }
        np2Var.startActivity(J);
        return true;
    }

    @Override // defpackage.w8n
    public Object o(u4d u4dVar) {
        return new f5d(u4dVar, this.b);
    }

    public xgc q() {
        vq1.A(!this.b);
        this.b = true;
        return new xgc((SparseBooleanArray) this.c);
    }

    public xk3 r(int i, dsc dscVar, boolean z, ArrayList arrayList, pcl pclVar) {
        r2c jvcVar;
        String str = dscVar.m;
        if (!l5i.n(str)) {
            if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                jvcVar = new reh((mvt) this.c, this.b ? 1 : 3);
            } else if (Objects.equals(str, "image/jpeg")) {
                jvcVar = new ro7(1);
            } else if (Objects.equals(str, "image/png")) {
                jvcVar = new j83(1);
            } else {
                int i2 = z ? 4 : 0;
                if (!this.b) {
                    i2 |= 32;
                }
                jvcVar = new jvc((mvt) this.c, i2, null, null, arrayList, pclVar);
            }
        } else {
            if (!this.b) {
                return null;
            }
            jvcVar = new npr(((mvt) this.c).f(dscVar), dscVar);
        }
        return new xk3(jvcVar, i, dscVar);
    }

    public boolean s() {
        return this.b;
    }

    public String toString() {
        switch (this.a) {
            case 13:
                StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.c;
                sb.append(Arrays.toString(list.toArray()));
                sb.append(", isValid=");
                int size = list.size();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= size) {
                        z = true;
                    } else {
                        dqh dqhVar = (dqh) list.get(i);
                        if (dqhVar != null && dqhVar.e()) {
                            i++;
                        }
                    }
                }
                return ouj.r(sb, z, " }");
            default:
                return super.toString();
        }
    }

    public void u(r0p r0pVar) {
        tao taoVar = (tao) this.c;
        nmb nmbVar = (nmb) taoVar.d;
        String str = (String) taoVar.b;
        long b = ((zzp) taoVar.e).b();
        mkb k = tao.k((c0p) taoVar.c);
        String G = ((fnb) taoVar.a).G();
        bmb s = tao.s(r0pVar);
        if (s == null) {
            return;
        }
        nmbVar.getClass();
        str.getClass();
        G.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("search_session_id", str);
        linkedHashMap.put("event_timestamp", String.valueOf(b));
        linkedHashMap.put("page_id", k.a);
        linkedHashMap.put("hash", G);
        linkedHashMap.put("to", s.a);
        linkedHashMap.put("page_type", "landing");
        linkedHashMap.put("entity_type", "search_history");
        dfi.p(1, "from", "search_history_screen", "_meta", linkedHashMap);
        nmbVar.C("Search.SearchHistory.Navigated", linkedHashMap);
    }

    public void v(int i, String str, String str2) {
        rkb rkbVar;
        r0p r0pVar = r0p.b;
        str.getClass();
        str2.getClass();
        tao taoVar = (tao) this.c;
        int ordinal = ((c0p) taoVar.c).ordinal();
        if (ordinal == 0) {
            rkbVar = rkb.SearchHistoryKids;
        } else if (ordinal == 1) {
            rkbVar = rkb.SearchHistoryPodcasts;
        } else if (ordinal == 2) {
            rkbVar = rkb.SearchHistoryCollection;
        } else if (ordinal != 3 && ordinal != 4) {
            b6e.s();
            return;
        } else {
            rkbVar = null;
            su4.s(2, null, "Cannot get empty search context", null);
        }
        if (rkbVar == null) {
            return;
        }
        String str3 = rkbVar.a;
        nmb nmbVar = (nmb) taoVar.d;
        int i2 = i + 1;
        cmb u = tao.u(r0pVar);
        String G = ((fnb) taoVar.a).G();
        nmbVar.getClass();
        G.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("object_pos", String.valueOf(i2));
        linkedHashMap.put("object_type", u.a);
        linkedHashMap.put("object_id", str);
        linkedHashMap.put("hash", G);
        linkedHashMap.put("page_id", "search_history_screen");
        linkedHashMap.put("playback_action_id", str2);
        linkedHashMap.put("entity_type", str3);
        eta.m(1, "entity_id", str3, "entity_pos_x", linkedHashMap);
        ouj.y(1, linkedHashMap, "entity_pos_y", 1, "object_pos_x");
        linkedHashMap.put("object_pos_y", String.valueOf(i2));
        linkedHashMap.put("_meta", nmb.u(3));
        nmbVar.C("Search.SearchHistory.Started", linkedHashMap);
    }

    @Override // defpackage.fyh
    public boolean w(hxh hxhVar) {
        ((tos) this.c).b.onMenuOpened(108, hxhVar);
        return true;
    }

    public boolean x(int i, CharSequence charSequence) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            e7o.e();
            return false;
        }
        aaw aawVar = (aaw) this.c;
        if (aawVar == null) {
            return s();
        }
        aawVar.getClass();
        char c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            bz2 bz2Var = gas.a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c = 2;
                            break;
                    }
                }
                c = 0;
            }
            c = 1;
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return s();
        }
        return false;
    }

    public void y() {
        this.b = false;
    }

    public void z() {
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (((Boolean) ((qgw) ((byb) qdcVar.C(I)).c(ern.a(qgw.class))).e.getValue()).booleanValue() && this.b) {
            afw i = ((j2n) this.c).i();
            if (i.a().c()) {
                how b = i.b();
                if ((b != null ? b.c : null) == null) {
                    return;
                }
                qfw.j(i.a(), null, null, 4);
            }
        }
    }

    public void I() {
    }

    public void N() {
    }

    public /* synthetic */ bz2(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ bz2(Object obj, int i, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = true;
    }

    public /* synthetic */ bz2(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    public /* synthetic */ bz2(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    public bz2(lwl lwlVar, boolean z) {
        this.a = 0;
        lwlVar.getClass();
        this.c = lwlVar;
        this.b = z;
    }

    public bz2(rw5 rw5Var, boolean z) {
        this.a = 8;
        rw5Var.getClass();
        this.c = rw5Var;
        this.b = z;
    }

    public bz2(fnb fnbVar) {
        this.a = 3;
        this.c = qld.m();
    }

    public bz2(a04 a04Var, boolean z) {
        this.a = 4;
        a04Var.getClass();
        this.c = a04Var;
        this.b = z;
    }

    public bz2(ArrayList arrayList, boolean z) {
        this.a = 13;
        if (arrayList.isEmpty()) {
            this.c = Collections.EMPTY_LIST;
        } else {
            this.c = Collections.unmodifiableList(new ArrayList(arrayList));
        }
        this.b = z;
    }

    public bz2(boolean z, h4q h4qVar) {
        this.a = 20;
        h4qVar.getClass();
        this.b = z;
        this.c = h4qVar;
    }

    public /* synthetic */ bz2(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    public bz2(s30 s30Var) {
        this.a = 17;
        bro[] broVarArr = bro.a;
        this.c = s30Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bz2(aaw aawVar, boolean z) {
        this(19, aawVar);
        this.a = 19;
        this.b = z;
    }
}
