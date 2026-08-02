package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.preorder.SelectedTariffInfo;
import com.yandex.go.taxi.order.models.api.preorder.TollRoads;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.main.internal.screens.sbpPartners.a;
import com.ybsdk.feature.savings.internal.screens.account.view.SavingsIncomeProgressView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;
import ru.yandex.taxi.scooters.domain.m;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result.c;
import ru.yandex.taxi.utils.CustomImagePositionedSpan;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final /* synthetic */ class ycm0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ ycm0(dd31 dd31Var, String str, TollRoads tollRoads, SelectedTariffInfo selectedTariffInfo) {
        this.a = 10;
        this.c = dd31Var;
        this.b = str;
        this.w = tollRoads;
        this.x = selectedTariffInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x042c, code lost:
    
        if (defpackage.jl40.l(r3 != null ? java.lang.Integer.valueOf(r3.size()) : null, java.lang.Integer.valueOf(r0.size())) == false) goto L94;
     */
    /* JADX WARN: Type inference failed for: r2v30, types: [T, hbv] */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        zy11 createPeriodsAdapter$lambda$7$lambda$6;
        Spannable a;
        int i = 8;
        int i2 = 6;
        boolean z = true;
        char c = 1;
        char c2 = 1;
        switch (this.a) {
            case 0:
                createPeriodsAdapter$lambda$7$lambda$6 = SavingsIncomeProgressView.createPeriodsAdapter$lambda$7$lambda$6((n70) this.c, (SavingsIncomeProgressView) this.w, (String) this.b, (String) this.x, (List) obj);
                return createPeriodsAdapter$lambda$7$lambda$6;
            case 1:
                String str = (String) this.b;
                a aVar = (a) this.c;
                List list = (List) this.w;
                ArrayList arrayList = (ArrayList) this.x;
                wem0 wem0Var = (wem0) obj;
                aVar.getClass();
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!(it.next() instanceof ohm0)) {
                            z = false;
                            return wem0.a(wem0Var, null, str, z, 5);
                        }
                    }
                }
                break;
            case 2:
                kdd0 kdd0Var = (kdd0) this.c;
                ScootersErrorCode scootersErrorCode = (ScootersErrorCode) this.w;
                a6o0 a6o0Var = (a6o0) this.b;
                j9n0 j9n0Var = (j9n0) this.x;
                sbm0 sbm0Var = ((n9n0) kdd0Var.d).a;
                return new c((Context) ((xvf0) sbm0Var.a).get(), (tt2) ((e7g) sbm0Var.b).get(), (h6o0) ((npe0) sbm0Var.c).get(), (h8n0) ((xvf0) sbm0Var.d).get(), (m) ((xvf0) sbm0Var.e).get(), (nqm0) ((xvf0) sbm0Var.f).get(), (ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.domain.a) ((mam0) sbm0Var.g).get(), (kco0) ((xvf0) sbm0Var.h).get(), (jco0) ((xvf0) sbm0Var.i).get(), scootersErrorCode, a6o0Var, (tls) obj, j9n0Var);
            case 3:
                return new com.yandex.go.places.impl.ui.search.viewholder.a((ListItemComponent) obj, (e) this.c, (hbp0) this.w, (pgk0) this.b, (tt2) this.x);
            case 4:
                n70 n70Var = (n70) this.c;
                tls tlsVar = (tls) this.w;
                tls tlsVar2 = (tls) this.b;
                cp1 cp1Var = (cp1) this.x;
                u261 u261Var = (u261) n70Var.N;
                g9r0 g9r0Var = (g9r0) n70Var.Z();
                TextView textView = u261Var.e;
                SwitchCompat switchCompat = u261Var.d;
                textView.setTextAppearance(g9r0Var.i);
                TextView textView2 = u261Var.e;
                Text text = g9r0Var.b;
                ShimmerFrameLayout shimmerFrameLayout = u261Var.a;
                textView2.setText(d.a(shimmerFrameLayout.getContext(), text));
                textView2.setEnabled(g9r0Var.d);
                g9r0 g9r0Var2 = (g9r0) n70Var.Z();
                TextView textView3 = u261Var.b;
                ImageView imageView = u261Var.c;
                textView3.setMovementMethod(LinkMovementMethod.getInstance());
                Text text2 = g9r0Var2.c;
                textView3.setVisibility(d.a(shimmerFrameLayout.getContext(), text2).length() > 0 ? 0 : 8);
                if (g9r0Var2.d) {
                    textView3.setText(rtu.a(new uwl0(i2, tlsVar), d.a(shimmerFrameLayout.getContext(), text2).toString()));
                } else {
                    a = rtu.a(new jiu(6), d.a(shimmerFrameLayout.getContext(), text2).toString());
                    textView3.setText(a);
                }
                v4b1.k(null, imageView, null, null, 6);
                imageView.setVisibility(8);
                imageView.setOnClickListener(new tai0(g9r0Var2, tlsVar, tlsVar2));
                textView3.setOnClickListener(null);
                g9r0 g9r0Var3 = (g9r0) n70Var.Z();
                switchCompat.setOnCheckedChangeListener(null);
                switchCompat.setEnabled(g9r0Var3.d);
                switchCompat.setClickable(g9r0Var3.g);
                switchCompat.setChecked(g9r0Var3.e);
                if (g9r0Var3.d) {
                    switchCompat.setOnCheckedChangeListener(new kbr0(cp1Var, g9r0Var3, u261Var, c == true ? 1 : 0));
                }
                gjb1.d(switchCompat);
                switchCompat.setClickable(!((g9r0) n70Var.Z()).f);
                if (((g9r0) n70Var.Z()).f) {
                    shimmerFrameLayout.startShimmer();
                } else {
                    shimmerFrameLayout.stopShimmer();
                }
                return zy11.a;
            case 5:
                ((sts0) this.c).e0((CustomImagePositionedSpan) this.w, (Drawable) this.x, (View) obj, (String) this.b);
                return zy11.a;
            case 6:
                return new com.yandex.go.superapp.discovery.map.impl.ui.search.viewholder.a((ListItemComponent) obj, (e) this.c, (hbp0) this.w, (n2v0) this.b, (tt2) this.x);
            case 7:
                Boolean bool = (Boolean) this.c;
                androidx.compose.material.e eVar = (androidx.compose.material.e) this.w;
                tls tlsVar3 = (tls) this.b;
                oz40 oz40Var = (oz40) this.x;
                oz40 oz40Var2 = eVar.b;
                if (!bool.equals(oz40Var2.getValue())) {
                    tlsVar3.invoke(oz40Var2.getValue());
                    oz40Var.setValue(Boolean.valueOf(!((Boolean) oz40Var.getValue()).booleanValue()));
                }
                return new izw0();
            case 8:
                ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) this.w;
                n70 n70Var2 = (n70) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.b;
                wls wlsVar = (wls) this.x;
                tja1.b(shimmerFrameLayout2);
                exa1.e(shimmerFrameLayout2, new f5m0(n70Var2, wlsVar, c2 == true ? 1 : 0));
                zo31 zo31Var = n70Var2.N;
                Context context = n70Var2.P;
                xty0.d(((a361) zo31Var).e, ((bj01) n70Var2.Z()).b);
                a361 a361Var = (a361) n70Var2.N;
                xty0.d(a361Var.d, ((bj01) n70Var2.Z()).c);
                TextView textView4 = a361Var.d;
                Text text3 = ((bj01) n70Var2.Z()).c;
                CharSequence a2 = text3 != null ? d.a(context, text3) : null;
                if (a2 != null && a2.length() != 0) {
                    i = 0;
                }
                textView4.setVisibility(i);
                hbv hbvVar = (hbv) ref$ObjectRef.element;
                if (hbvVar != null) {
                    hbvVar.dispose();
                }
                ref$ObjectRef.element = v4b1.k(((bj01) n70Var2.Z()).d.g(context, context.getResources().getDimensionPixelSize(vvg0.ybsdk_clickable_icon_size), context.getResources().getDimensionPixelSize(vvg0.ybsdk_clickable_icon_size)), a361Var.c, null, null, 6);
                ImageView imageView2 = a361Var.b;
                Integer num = ((bj01) n70Var2.Z()).e;
                imageView2.setImageDrawable(num != null ? vng.t(num.intValue(), a361Var.a.getContext()) : null);
                b.y(shimmerFrameLayout2, ((bj01) n70Var2.Z()).f);
                if (((bj01) n70Var2.Z()).h) {
                    shimmerFrameLayout2.startShimmer();
                } else {
                    shimmerFrameLayout2.stopShimmer();
                }
                return zy11.a;
            case 9:
                com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.a aVar2 = (com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.a) this.c;
                String str2 = (String) this.b;
                String str3 = (String) this.x;
                String str4 = (String) this.w;
                Object X = aVar2.X();
                wk01 wk01Var = X instanceof wk01 ? (wk01) X : null;
                if (wk01Var == null) {
                    return (xk01) aVar2.X();
                }
                if (str2 == null) {
                    str2 = wk01Var.G;
                }
                return wk01.b(wk01Var, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, null, false, null, null, null, str2, str3, str4, null, -1, 8);
            default:
                dd31 dd31Var = (dd31) this.c;
                String str5 = (String) this.b;
                TollRoads tollRoads = (TollRoads) this.w;
                SelectedTariffInfo selectedTariffInfo = (SelectedTariffInfo) this.x;
                Result result = (Result) obj;
                Object value = result.getValue();
                if (!(value instanceof Result.Failure)) {
                    ((kpi0) dd31Var.e0.get()).b();
                    Preorder preorder = ((dqe0) dd31Var.K.get()).a;
                    preorder.b = str5;
                    preorder.d0 = tollRoads;
                    if (((com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c) dd31Var.U.get()).d(((dqe0) dd31Var.K.get()).c())) {
                        preorder.y = ((com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c) dd31Var.U.get()).g();
                    }
                    if (selectedTariffInfo != null) {
                        preorder.m(selectedTariffInfo);
                    }
                    dd31Var.M.b((m950) dd31Var.V.get(), new b5y0("Open from Mobility hub", preorder));
                }
                Throwable a3 = Result.a(result.getValue());
                if (a3 != null) {
                    xby.l(jst.e, "VerticalHub.VerticalHubV2Router.Error", null, null, "Error while authRouter is opening " + a3, 6);
                }
                return zy11.a;
        }
    }

    public /* synthetic */ ycm0(sts0 sts0Var, CustomImagePositionedSpan customImagePositionedSpan, Drawable drawable, String str) {
        this.a = 5;
        this.c = sts0Var;
        this.w = customImagePositionedSpan;
        this.x = drawable;
        this.b = str;
    }

    public /* synthetic */ ycm0(com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.a aVar, String str, String str2, String str3) {
        this.a = 9;
        this.c = aVar;
        this.b = str;
        this.x = str2;
        this.w = str3;
    }

    public /* synthetic */ ycm0(ShimmerFrameLayout shimmerFrameLayout, n70 n70Var, Ref$ObjectRef ref$ObjectRef, wls wlsVar) {
        this.a = 8;
        this.w = shimmerFrameLayout;
        this.c = n70Var;
        this.b = ref$ObjectRef;
        this.x = wlsVar;
    }

    public /* synthetic */ ycm0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.b = obj3;
        this.x = obj4;
    }

    public /* synthetic */ ycm0(String str, a aVar, List list, ArrayList arrayList) {
        this.a = 1;
        this.b = str;
        this.c = aVar;
        this.w = list;
        this.x = arrayList;
    }
}
