package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import androidx.room.util.a;
import com.adjust.sdk.Constants;
import com.google.zxing.NotFoundException;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivSwitchView;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import com.yandex.go.drive.sdkintegration.presentation.DriveHostView;
import com.yandex.go.places.models.data.entities.network.bottom_panel.OrganizationCardAnalyticsParams;
import com.yandex.go.taxi.order.ActionButtonsClickListener$SourceScreen;
import com.yandex.messaging.core.net.entities.ContactData;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.b;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.order.state.driving.DrivingStateView;
import ru.yandex.taxi.superapp.orders.models.ActionType;

/* loaded from: classes12.dex */
public final class yzh implements vzh, nr4, jlk, apk, jl11, go3, pfm, xt, k2n, t070 {
    public Object a;

    public yzh(Context context) {
        Paint paint = new Paint();
        int[] iArr = up11.a;
        paint.setTypeface(eja1.w(3, 0));
        paint.setTextSize((float) Math.ceil(context.getResources().getDimension(mrg0.component_text_size_caption)));
        this.a = paint;
    }

    public static Map m(ArrayList arrayList, rf70 rf70Var) {
        if (rf70Var == null) {
            return b.f();
        }
        int d = gw00.d(tcc.n(arrayList, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ejj0 ejj0Var = (ejj0) it.next();
            Pair pair = new Pair(ejj0Var.a, Boolean.valueOf(jl40.l(ejj0Var.l, rf70Var)));
            linkedHashMap.put(pair.c(), pair.f());
        }
        return linkedHashMap;
    }

    @Override // defpackage.go3
    public void D(Object obj) {
        l020 C;
        ContactData[] contactDataArr = (ContactData[]) obj;
        s7m s7mVar = (s7m) this.a;
        k020 k020Var = s7mVar.c;
        if (s7mVar.m.get()) {
            s7mVar.b("cancelled");
            s7mVar.a(1, 3);
            return;
        }
        if (contactDataArr.length == 0) {
            if (s7mVar.i > s7mVar.h) {
                C = k020Var.C();
                try {
                    long j = s7mVar.i;
                    ghf0 ghf0Var = C.E;
                    if (j > ghf0Var.o.f()) {
                        ((Number) a.b(ghf0Var.c.a, false, true, new vh10(j, 24))).intValue();
                    }
                    C.s();
                    C.close();
                } finally {
                }
            }
            s7mVar.a(1, 2);
            return;
        }
        gui0 gui0Var = s7mVar.a;
        gui0Var.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        gui0Var.b.P(new ugd0(26, contactDataArr, gui0Var));
        gui0Var.c.f("tech contacts updated", "time_diff", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), "count", Integer.valueOf(contactDataArr.length));
        C = k020Var.C();
        try {
            for (ContactData contactData : contactDataArr) {
                s7mVar.i = Math.max(contactData.getVersion(), s7mVar.i);
                C.Q0(contactData.toReducedUserInfo(), 1);
            }
            C.s();
            C.close();
            ContactData contactData2 = (ContactData) j73.O(contactDataArr);
            s7mVar.k = contactData2.getUserId();
            s7mVar.j = Long.valueOf(contactData2.getVersion());
            aqb1.d(s7mVar.d, "sync_download_receive", b.i(new Pair("uuid", s7mVar.e), new Pair("count", Integer.valueOf(contactDataArr.length)), new Pair("old_version", Long.valueOf(s7mVar.h)), new Pair("new_version", Long.valueOf(s7mVar.i))));
            s7mVar.d();
        } finally {
        }
    }

    @Override // defpackage.jl11
    public void a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            ((DivSwitchView) this.a).setChecked(bool.booleanValue());
        }
    }

    public float b(d8r d8rVar, d8r d8rVar2) {
        int i = (int) d8rVar.a;
        int i2 = (int) d8rVar.b;
        int i3 = (int) d8rVar2.a;
        int i4 = (int) d8rVar2.b;
        float r = r(i, i2, i3, i4);
        float r2 = r((int) d8rVar2.a, i4, (int) d8rVar.a, i2);
        return Float.isNaN(r) ? r2 / 7.0f : Float.isNaN(r2) ? r / 7.0f : (r + r2) / 14.0f;
    }

    @Override // defpackage.pfm
    public void d(Throwable th) {
        hst hstVar = jst.e;
        String message = th.getMessage();
        if (message == null) {
            message = "drive error";
        }
        xby.l(hstVar, "DriveSDK", null, th, message, 2);
    }

    @Override // defpackage.jl11
    public void e(tls tlsVar) {
        ((DivSwitchView) this.a).setOnCheckedChangeListener(tlsVar);
    }

    @Override // defpackage.xt
    public void f(ActionType actionType) {
        com.yandex.go.taxi.order.state.driving.a presenter = ((DrivingStateView) this.a).getPresenter();
        presenter.getClass();
        if (actionType == ActionType.DRIVER) {
            presenter.U.b(presenter.A);
        }
    }

    @Override // defpackage.pfm
    public void g(String str, LinkedHashMap linkedHashMap) {
        pcm pcmVar;
        pcmVar = ((DriveHostView) this.a).driveAnalyticsReporter;
        ((qcm) pcmVar).b(str, linkedHashMap);
    }

    @Override // defpackage.nr4
    public void h(String str) {
        ((n3h) this.a).a(Uri.parse(str), DeeplinkSource.UNSPECIFIED);
    }

    @Override // defpackage.k2n
    public void i(int i) {
        RecyclerView.e layoutManager;
        x1n x1nVar = (x1n) this.a;
        RecyclerView recyclerView = x1nVar.h;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        x0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
        if (findViewHolderForAdapterPosition == null) {
            recyclerView.post(new mbb(recyclerView, i, x1nVar, layoutManager, 1));
        } else {
            int[] c = x1nVar.c(layoutManager, findViewHolderForAdapterPosition.a);
            recyclerView.scrollBy(c[0], c[1]);
        }
    }

    @Override // defpackage.xt
    public void j(String str, ActionType actionType) {
        com.yandex.go.taxi.order.state.driving.a presenter = ((DrivingStateView) this.a).getPresenter();
        presenter.T.a(str, actionType, ActionButtonsClickListener$SourceScreen.ORDER_DETAILS);
        p4j p4jVar = presenter.B;
        p4jVar.getClass();
        p4jVar.c(p4j.a(actionType));
    }

    @Override // defpackage.k2n
    public void k(int i) {
        RecyclerView.e layoutManager;
        RecyclerView.j d;
        x1n x1nVar = (x1n) this.a;
        RecyclerView recyclerView = x1nVar.h;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (d = x1nVar.d(layoutManager)) == null) {
            return;
        }
        d.a = i;
        layoutManager.v(d);
        x1nVar.l = true;
    }

    public ot1 l(float f, float f2, int i, int i2) {
        ot1 b;
        ot1 b2;
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        vz5 vz5Var = (vz5) this.a;
        int min = Math.min(vz5Var.a - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (min < f3) {
            throw NotFoundException.a();
        }
        int max2 = Math.max(0, i2 - i3);
        int min2 = Math.min(vz5Var.b - 1, i2 + i3) - max2;
        if (min2 < f3) {
            throw NotFoundException.a();
        }
        vz5 vz5Var2 = (vz5) this.a;
        pt1 pt1Var = new pt1(vz5Var2, max, max2, min, min2, f);
        int i4 = pt1Var.e;
        int i5 = pt1Var.c;
        int i6 = i4 + i5;
        int i7 = pt1Var.f;
        int i8 = (i7 / 2) + pt1Var.d;
        int[] iArr = new int[3];
        for (int i9 = 0; i9 < i7; i9++) {
            int i10 = ((i9 & 1) == 0 ? (i9 + 1) / 2 : -((i9 + 1) / 2)) + i8;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i11 = i5;
            while (i11 < i6 && !vz5Var2.b(i11, i10)) {
                i11++;
            }
            int i12 = 0;
            while (i11 < i6) {
                if (!vz5Var2.b(i11, i10)) {
                    if (i12 == 1) {
                        i12++;
                    }
                    iArr[i12] = iArr[i12] + 1;
                } else if (i12 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i12 != 2) {
                    i12++;
                    iArr[i12] = iArr[i12] + 1;
                } else {
                    if (pt1Var.a(iArr) && (b2 = pt1Var.b(iArr, i10, i11)) != null) {
                        return b2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i12 = 1;
                }
                i11++;
            }
            if (pt1Var.a(iArr) && (b = pt1Var.b(iArr, i10, i6)) != null) {
                return b;
            }
        }
        ArrayList arrayList = pt1Var.b;
        if (arrayList.isEmpty()) {
            throw NotFoundException.a();
        }
        return (ot1) arrayList.get(0);
    }

    public boolean n(hlk hlkVar) {
        return Div2View.handleActionWithResult$default((Div2View) this.a, new v3k(ngd0.m(hlkVar.a), null, ngd0.m(Uri.parse(hlkVar.b)), 1019), null, null, 6, null);
    }

    public int o(CharSequence charSequence) {
        return (int) Math.ceil(((Paint) this.a).measureText(charSequence, 0, charSequence.length()));
    }

    @Override // defpackage.t070
    public /* synthetic */ void onSuccess(Object obj) {
        ((j1) this.a).invoke(obj);
    }

    public void p(OrganizationCardAnalyticsParams organizationCardAnalyticsParams, fr frVar) {
        gsj gsjVar;
        gsj gsjVar2;
        hsj hsjVar = (hsj) this.a;
        String str = organizationCardAnalyticsParams.a;
        String str2 = organizationCardAnalyticsParams.b;
        String str3 = organizationCardAnalyticsParams.c;
        if (frVar instanceof dq) {
            gsjVar = new gsj("open_navigator", null, null, 6);
        } else if (frVar instanceof fq) {
            gsjVar = new gsj("open_taxi", null, null, 6);
        } else {
            if (frVar instanceof jp) {
                gsjVar2 = new gsj(Constants.DEEPLINK, ((jp) frVar).a, null, 4);
            } else if (frVar instanceof aq) {
                gsjVar = new gsj("open_more_actions", null, null, 6);
            } else if (frVar instanceof hq) {
                gsjVar2 = new gsj("web_view", null, ((hq) frVar).a, 2);
            } else if (frVar instanceof iq) {
                gsjVar2 = new gsj("web_view", null, ((iq) frVar).a, 2);
            } else {
                gsjVar = frVar instanceof cq ? new gsj("open_delivery_order_form", null, null, 6) : new gsj("", null, null, 6);
            }
            gsjVar = gsjVar2;
        }
        hsjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("oid", str);
        hashMap.put("source", str3);
        hashMap.put(LaunchBrowserActivity.KEY_URI, str2);
        hashMap.put("action", gsjVar.d);
        hsjVar.a.a("Discovery.OrganisationCard.Tapped", hashMap, 1, new HashMap());
    }

    public float q(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        double sqrt;
        int i11;
        yzh yzhVar;
        int i12;
        int i13 = 1;
        boolean z = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z) {
            i6 = i;
            i5 = i2;
            i8 = i3;
            i7 = i4;
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int abs = Math.abs(i7 - i5);
        int i14 = i8 - i6;
        int abs2 = Math.abs(i14);
        int i15 = 2;
        int i16 = (-abs) / 2;
        int i17 = i5 < i7 ? 1 : -1;
        int i18 = i6 < i8 ? 1 : -1;
        int i19 = i7 + i17;
        int i20 = i5;
        int i21 = i6;
        int i22 = 0;
        while (true) {
            if (i20 == i19) {
                i9 = i5;
                i10 = i15;
                break;
            }
            int i23 = z ? i21 : i20;
            boolean z2 = z;
            int i24 = z ? i20 : i21;
            i9 = i5;
            if (i22 == i13) {
                i11 = i13;
                i12 = i6;
                yzhVar = this;
            } else {
                i11 = 0;
                yzhVar = this;
                i12 = i6;
            }
            if (i11 == ((vz5) yzhVar.a).b(i23, i24)) {
                if (i22 == 2) {
                    double d = i20 - i9;
                    double d2 = i21 - i12;
                    sqrt = Math.sqrt((d2 * d2) + (d * d));
                    break;
                }
                i22++;
            }
            i16 += abs2;
            if (i16 > 0) {
                if (i21 == i8) {
                    i10 = 2;
                    break;
                }
                i21 += i18;
                i16 -= abs;
            }
            i20 += i17;
            i5 = i9;
            i6 = i12;
            z = z2;
            i13 = 1;
            i15 = 2;
        }
        if (i22 != i10) {
            return Float.NaN;
        }
        double d3 = i19 - i9;
        double d4 = i14;
        sqrt = Math.sqrt((d4 * d4) + (d3 * d3));
        return (float) sqrt;
    }

    public float r(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        vz5 vz5Var = (vz5) this.a;
        float q = q(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else {
            int i7 = vz5Var.a;
            if (i5 >= i7) {
                float f3 = ((i7 - 1) - i) / (i5 - i);
                int i8 = i7 - 1;
                f = f3;
                i5 = i8;
            } else {
                f = 1.0f;
            }
        }
        float f4 = i2;
        int i9 = (int) (f4 - ((i4 - i2) * f));
        if (i9 < 0) {
            f2 = f4 / (i2 - i9);
        } else {
            int i10 = vz5Var.b;
            if (i9 >= i10) {
                f2 = ((i10 - 1) - i2) / (i9 - i2);
                i6 = i10 - 1;
            } else {
                i6 = i9;
                f2 = 1.0f;
            }
        }
        return (q(i, i2, (int) (((i5 - i) * f2) + i), i6) + q) - 1.0f;
    }

    @Override // defpackage.apk
    /* renamed from: resolveString-gIAlu-s */
    public Object mo102resolveStringgIAlus(String str, String str2) {
        try {
            z3k z3kVar = new z3k(14);
            ums umsVar = wm11.c;
            return (String) new com.yandex.div.json.expressions.a(BduiExpressionResolverImpl.EXPRESSION_KEY, str, new lhj(15), z3kVar, eg90.b, umsVar, null).a((rvo) this.a);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    public /* synthetic */ yzh(Object obj) {
        this.a = obj;
    }
}
