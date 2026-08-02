package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowInsets;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.w;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.payments.domain.k;
import com.yandex.go.payments.order.domain.e;
import com.yandex.messaging.miniapps.view.a;
import com.yandex.messaging.views.bottomsheet.NavigableBottomSheetDialog;
import com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.PartnersFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation.MobileProvidersListFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation.MobilePaymentSelectContactFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.minimap.c;
import ru.yandex.taxi.eatskit.internal.nativeapi.NativeApi;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.masstransit.main.ui.header.compose.MtHeader;
import ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesView;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes5.dex */
public final /* synthetic */ class sc20 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sc20(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r7v26, types: [T, rva0] */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 listAdapter$lambda$1;
        zy11 listAdapter$lambda$0;
        SheetValue sheetValue;
        zy11 verticalsView$lambda$0;
        zy11 Content$lambda$0;
        long j;
        char c;
        long j2;
        long j3;
        zy11 addExternalAsyncMethods$lambda$0;
        n751 n751Var;
        zy11 adapter$lambda$0;
        Long l;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                tc20 tc20Var = (tc20) obj3;
                String str = (String) obj;
                try {
                    yeo yeoVar = tc20Var.b;
                    if (yeoVar != null) {
                        yeoVar.success(str);
                    }
                } catch (Throwable th) {
                    yeo yeoVar2 = tc20Var.b;
                    if (yeoVar2 != null) {
                        yeoVar2.error(tc20.class.getSimpleName(), ljo.b(th), null);
                    }
                }
                return zy11.a;
            case 1:
                View view = (View) obj;
                n751 n751Var2 = (n751) obj2;
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), ((a) obj3).G + n751Var2.a.g(2).d);
                return n751Var2;
            case 2:
                qh20 qh20Var = (qh20) obj3;
                WindowInsets windowInsets = (WindowInsets) obj2;
                qh20Var.l = windowInsets.getSystemWindowInsetBottom();
                qh20Var.e();
                return windowInsets;
            case 3:
                ((Integer) obj2).getClass();
                c.a((Bitmap) obj3, (fid) obj, vng.O(1));
                return zy11.a;
            case 4:
                hj20 hj20Var = (hj20) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    ymb1.e(hj20Var.a, null, 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, 0, 0, 65534);
                } else {
                    btsVar.Y();
                }
                return zy11.a;
            case 5:
                listAdapter$lambda$1 = MobilePaymentSelectContactFragment.listAdapter$lambda$1((MobilePaymentSelectContactFragment) obj3, (bj01) obj, ((Integer) obj2).intValue());
                return listAdapter$lambda$1;
            case 6:
                listAdapter$lambda$0 = MobileProvidersListFragment.listAdapter$lambda$0((MobileProvidersListFragment) obj3, (bj01) obj, ((Integer) obj2).intValue());
                return listAdapter$lambda$0;
            case 7:
                w wVar = (w) obj3;
                k6w k6wVar = (k6w) obj;
                float h = n8e.h(((n8e) obj2).a);
                bam bamVar = new bam();
                bamVar.a(SheetValue.Hidden, h);
                float f = h / 2.0f;
                if (((int) (k6wVar.a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) > f && !wVar.a) {
                    bamVar.a(SheetValue.PartiallyExpanded, f);
                }
                int i2 = (int) (k6wVar.a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                if (i2 != 0) {
                    bamVar.a(SheetValue.Expanded, Math.max(0.0f, h - i2));
                }
                ArrayList arrayList = bamVar.a;
                float[] fArr = bamVar.b;
                int size = arrayList.size();
                c73.a(size, fArr.length);
                lah lahVar = new lah(arrayList, Arrays.copyOfRange(fArr, 0, size));
                int i3 = lx20.a[((SheetValue) wVar.e.i.getValue()).ordinal()];
                if (i3 == 1) {
                    sheetValue = SheetValue.Hidden;
                } else if (i3 == 2) {
                    sheetValue = SheetValue.PartiallyExpanded;
                    if (!lahVar.c(sheetValue)) {
                        sheetValue = SheetValue.Expanded;
                        if (!lahVar.c(sheetValue)) {
                            sheetValue = SheetValue.Hidden;
                        }
                    }
                } else {
                    if (i3 != 3) {
                        w511.b();
                        return null;
                    }
                    sheetValue = SheetValue.Expanded;
                    if (!lahVar.c(sheetValue)) {
                        sheetValue = SheetValue.Hidden;
                    }
                }
                return new Pair(lahVar, sheetValue);
            case 8:
                ib30 ib30Var = (ib30) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.G(ib30Var, btsVar2.o(), null, false);
                } else {
                    btsVar2.Y();
                }
                return zy11.a;
            case 9:
                verticalsView$lambda$0 = MtCollapsedRoutesView.verticalsView$lambda$0((MtCollapsedRoutesView) obj3, ((Integer) obj).intValue(), (ob31) obj2);
                return verticalsView$lambda$0;
            case 10:
                Content$lambda$0 = MtHeader.Content$lambda$0((MtHeader) obj3, (fid) obj, ((Integer) obj2).intValue());
                return Content$lambda$0;
            case 11:
                ((Integer) obj2).getClass();
                fpb1.c((r740) obj3, (fid) obj, vng.O(9));
                return zy11.a;
            case 12:
                ((Integer) obj2).getClass();
                hm91.c((wp2) obj3, (fid) obj, vng.O(1));
                return zy11.a;
            case 13:
                l940 l940Var = (l940) obj3;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    f530 b = ofb1.b(c530.a, false, null, 15);
                    String str2 = l940Var.a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    yqb1.e(str2, b, null, xya1.e(btsVar3).g.b, 0, 0, null, null, null, 0, 0, btsVar3, 48, 2036);
                } else {
                    btsVar3.Y();
                }
                return zy11.a;
            case 14:
                ((Integer) obj2).getClass();
                spb1.b((lxd) obj3, (fid) obj, vng.O(1));
                return zy11.a;
            case 15:
                xk40 xk40Var = (xk40) obj3;
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    c530 c530Var = c530.a;
                    Object Q = btsVar4.Q();
                    if (Q == did.a) {
                        Q = new teb(20);
                        btsVar4.o0(Q);
                    }
                    f530 a = fnq0.a(c530Var, (tls) Q);
                    sic a2 = qic.a(lr20.e, x4c.G, btsVar4, 6);
                    int hashCode = Long.hashCode(btsVar4.T);
                    r1b0 o = btsVar4.o();
                    f530 d = b.d(btsVar4, a);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar4.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar4.i0();
                    if (btsVar4.S) {
                        btsVar4.n(slsVar);
                    } else {
                        btsVar4.r0();
                    }
                    qje.W(btsVar4, d.f, a2);
                    qje.W(btsVar4, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar4.S || !jl40.l(btsVar4.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar4, hashCode, wlsVar);
                    }
                    qje.W(btsVar4, d.d, d);
                    zgb1.a(xk40Var.c, null, 0, false, null, null, false, null, btsVar4, 0, 254);
                    zgb1.a(xk40Var.d, null, 0, false, null, null, false, null, btsVar4, 0, 254);
                    btsVar4.t(true);
                } else {
                    btsVar4.Y();
                }
                return zy11.a;
            case 16:
                xm40 xm40Var = (xm40) obj3;
                Set set = (Set) obj;
                synchronized (xm40Var.a) {
                    try {
                        hz40 hz40Var = xm40Var.b;
                        t130 t130Var = new t130(21, set, xm40Var);
                        ym11.e(1, t130Var);
                        Object[] objArr = hz40Var.b;
                        long[] jArr = hz40Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            j = 128;
                            j2 = 255;
                            while (true) {
                                long j4 = jArr[i4];
                                c = 7;
                                j3 = -9187201950435737472L;
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    for (int i6 = 0; i6 < i5; i6++) {
                                        if ((j4 & 255) < 128) {
                                            t130Var.invoke(objArr[(i4 << 3) + i6]);
                                        }
                                        j4 >>= 8;
                                    }
                                    if (i5 != 8) {
                                    }
                                }
                                if (i4 != length) {
                                    i4++;
                                }
                            }
                        } else {
                            j = 128;
                            c = 7;
                            j2 = 255;
                            j3 = -9187201950435737472L;
                        }
                        iz40 iz40Var = xm40Var.d;
                        Object[] objArr2 = iz40Var.b;
                        long[] jArr2 = iz40Var.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i7 = 0;
                            while (true) {
                                long j5 = jArr2[i7];
                                if ((((~j5) << c) & j5 & j3) != j3) {
                                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                                    for (int i9 = 0; i9 < i8; i9++) {
                                        if ((j5 & j2) < j) {
                                            ((ioq0) objArr2[(i7 << 3) + i9]).d(zy11.a);
                                        }
                                        j5 >>= 8;
                                    }
                                    if (i8 != 8) {
                                    }
                                }
                                if (i7 != length2) {
                                    i7++;
                                }
                            }
                        }
                        xm40Var.d.b();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return zy11.a;
            case 17:
                addExternalAsyncMethods$lambda$0 = NativeApi.addExternalAsyncMethods$lambda$0((cj7) obj3, (String) obj, (gcn) obj2);
                return addExternalAsyncMethods$lambda$0;
            case 18:
                n751Var = NavigableBottomSheetDialog.setupInsetsHandling$lambda$3((NavigableBottomSheetDialog) obj3, (View) obj, (n751) obj2);
                return n751Var;
            case 19:
                String str3 = (String) obj;
                nuy0 nuy0Var = ((ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.numeric_input.d) obj3).d;
                int i10 = ((mkx) obj2).a;
                nuy0Var.getClass();
                if (i10 == 3) {
                    r5 = TextUtils.isDigitsOnly(str3);
                } else {
                    if (i10 == 4) {
                        for (int i11 = 0; i11 < str3.length(); i11++) {
                            char charAt = str3.charAt(i11);
                            if (Character.isDigit(charAt) || nuy0.a.contains(Character.valueOf(charAt))) {
                            }
                        }
                    }
                    r5 = true;
                }
                return Boolean.valueOf(r5);
            case 20:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                String str4 = (String) obj2;
                rt1 rt1Var = ((com.ybsdk.feature.kycesia.internal.screens.browser.a) obj3).F.s0;
                LinkedHashMap linkedHashMap = new LinkedHashMap(3);
                linkedHashMap.put("has_data", bool);
                if (str4 != null) {
                    linkedHashMap.put("action", str4);
                }
                rt1Var.a.a("esia.browser_result", linkedHashMap);
                return zy11.a;
            case 21:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.tracking.impl.order_cancel_clarification.a.e((jk70) obj3, (fid) obj, vng.O(1));
                return zy11.a;
            case 22:
                y8u0 y8u0Var = (y8u0) obj3;
                bv70 bv70Var = ((cv70) obj).b;
                bv70 bv70Var2 = ((cv70) obj2).b;
                boolean l2 = jl40.l(bv70Var.b, bv70Var2.b);
                DriveState driveState = bv70Var.a;
                DriveState driveState2 = bv70Var2.a;
                boolean z = driveState != driveState2;
                boolean z2 = y8u0Var.a && y8u0Var.b.contains(driveState2.toString());
                if (!l2 || (z && z2)) {
                    r5 = true;
                }
                return Boolean.valueOf(!r5);
            case 23:
                k kVar = ((e) obj3).F;
                lv90.Companion.getClass();
                kVar.c.a.l(kv90.b((String) obj, (PaymentMethod$Type) obj2));
                return zy11.a;
            case 24:
                adapter$lambda$0 = PartnersFragment.adapter$lambda$0((PartnersFragment) obj3, (uty) obj, ((Integer) obj2).intValue());
                return adapter$lambda$0;
            case 25:
                fqs0 fqs0Var = (fqs0) obj3;
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    rdb1.b(fqs0Var, null, null, btsVar5, 0, 6);
                } else {
                    btsVar5.Y();
                }
                return zy11.a;
            case 26:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.payment_method_selector.ui.a.c((q7a0) obj3, (fid) obj, vng.O(1));
                return zy11.a;
            case 27:
                ((Integer) obj2).getClass();
                cg91.a((rz20) obj3, (fid) obj, vng.O(1));
                return zy11.a;
            case 28:
                r611 r611Var = (r611) obj3;
                fid fidVar6 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    jeb1.f(r611Var.c, null, AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar6).h.a, btsVar6, 384, 0, 16378);
                } else {
                    btsVar6.Y();
                }
                return zy11.a;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                sva0 sva0Var = (sva0) obj2;
                if (!sva0Var.g && sva0Var.f && !sva0Var.i && (l = sva0Var.a) != null) {
                    long longValue = l.longValue();
                    Long l3 = sva0Var.e;
                    if (l3 != null) {
                        long longValue2 = l3.longValue();
                        if (sva0Var.b && sva0Var.c && sva0Var.d) {
                            ref$ObjectRef.element = new rva0(sva0Var.m, sva0Var.k, sva0Var.j, sva0Var.l, (longValue2 - longValue) / 1000000);
                            sva0Var.g = true;
                        }
                    }
                }
                return sva0Var;
        }
    }

    public /* synthetic */ sc20(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
