package defpackage;

import androidx.compose.foundation.pager.d;
import androidx.compose.ui.unit.LayoutDirection;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.information.presentation.a;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity;
import java.util.ArrayList;
import kotlin.Pair;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.modal.ModalViewType;
import ru.yandex.taxi.logistics.sdk.ui.component.control.e;
import ru.yandex.taxi.logistics.sdk.ui.component.marketing_pager.b;

/* loaded from: classes11.dex */
public final /* synthetic */ class s0v implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s0v(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        c530 c530Var = c530.a;
        int i2 = 7;
        o430 o430Var = did.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                o2b1.c((b911) obj4, (kxu) obj3, (fid) obj, vng.O(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                a.a((j6) obj4, (tls) obj3, (fid) obj, vng.O(7));
                break;
            case 2:
                ((Integer) obj2).getClass();
                com.yandex.messaging.ui.di.a.b((hs31) obj4, (zls) obj3, (fid) obj, vng.O(385));
                break;
            case 3:
                ((Integer) obj2).getClass();
                r7b1.b((wtd) obj4, (wls) obj3, (fid) obj, vng.O(1));
                break;
            case 4:
                Pair pair = (Pair) obj2;
                IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity.PlaceholderPoint placeholderPoint = (IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity.PlaceholderPoint) pair.getFirst();
                IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity.PlaceholderPoint placeholderPoint2 = (IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity.PlaceholderPoint) pair.getSecond();
                ckw ckwVar = new ckw((String) obj);
                ((zhw) obj3).getClass();
                Pair pair2 = new Pair(ckwVar, new ajw(zhw.c(placeholderPoint), zhw.c(placeholderPoint2)));
                ((hz40) obj4).o(pair2.c(), pair2.f());
                break;
            case 5:
                q611 q611Var = (q611) obj4;
                ety0 ety0Var = (ety0) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    jeb1.f(q611Var.b, null, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar, 384, 0, 16378);
                    break;
                }
            case 6:
                ((Integer) obj2).getClass();
                z9b1.b((dae) obj4, (sls) obj3, (fid) obj, vng.O(1));
                break;
            case 7:
                t0u t0uVar = (t0u) obj4;
                h43 h43Var = (h43) obj3;
                fwi fwiVar = (fwi) obj;
                n8e n8eVar = (n8e) obj2;
                if (n8e.i(n8eVar.a) == Integer.MAX_VALUE) {
                    lxv.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int i3 = n8e.i(n8eVar.a);
                int f0 = fwiVar.f0(h43Var.b());
                int i4 = t0uVar.a;
                int i5 = i3 - ((i4 - 1) * f0);
                int i6 = i5 / i4;
                int i7 = i5 % i4;
                ArrayList arrayList = new ArrayList(i4);
                int i8 = 0;
                while (i8 < i4) {
                    arrayList.add(Integer.valueOf((i8 < i7 ? 1 : 0) + i6));
                    i8++;
                }
                int[] I0 = kotlin.collections.a.I0(arrayList);
                int[] iArr = new int[I0.length];
                h43Var.u(fwiVar, i3, I0, LayoutDirection.Ltr, iArr);
                break;
            case 8:
                p5y p5yVar = (p5y) obj4;
                o5y o5yVar = (o5y) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    q5y q5yVar = (q5y) p5yVar.b.invoke();
                    int i9 = o5yVar.c;
                    Object obj5 = o5yVar.a;
                    if ((i9 >= q5yVar.getItemCount() || !q5yVar.c(i9).equals(obj5)) && (i9 = q5yVar.b(obj5)) != -1) {
                        o5yVar.c = i9;
                    }
                    int i10 = i9;
                    if (i10 != -1) {
                        btsVar2.e0(-1664741271);
                        hdb1.a(q5yVar, p5yVar.a, i10, o5yVar.a, btsVar2, 0);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(-1664505826);
                        btsVar2.t(false);
                    }
                    boolean e = btsVar2.e(o5yVar);
                    Object Q = btsVar2.Q();
                    if (e || Q == o430Var) {
                        Q = new ptw(i2, o5yVar);
                        btsVar2.o0(Q);
                    }
                    zpn.a(obj5, (tls) Q, btsVar2);
                    break;
                }
            case 9:
                break;
            case 10:
                androidx.compose.runtime.internal.a aVar = (androidx.compose.runtime.internal.a) obj4;
                e7y e7yVar = (e7y) obj3;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    aVar.invoke(e7yVar, btsVar3, 0);
                    break;
                }
            case 11:
                ((Integer) obj2).getClass();
                ydy.a((pey) obj4, (tls) obj3, (fid) obj, vng.O(7));
                break;
            case 12:
                yvy yvyVar = (yvy) obj4;
                tls tlsVar = (tls) obj3;
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    btsVar4.Y();
                    break;
                } else {
                    e.a(gza1.b(ljs0.e(ljs0.q(c530Var, 52.0f), 34.0f), 1.0f, 1.0f), yvyVar.b, false, dl51.I, 0L, 0L, tlsVar, null, btsVar4, 0, SubsamplingScaleImageView.ORIENTATION_180);
                    break;
                }
            case 13:
                tls tlsVar2 = (tls) obj4;
                wnb wnbVar = (wnb) obj3;
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (!btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    btsVar5.Y();
                    break;
                } else {
                    boolean k = btsVar5.k(tlsVar2) | btsVar5.e(wnbVar);
                    Object Q2 = btsVar5.Q();
                    if (k || Q2 == o430Var) {
                        Q2 = new mqu(22, tlsVar2, wnbVar);
                        btsVar5.o0(Q2);
                    }
                    xqb1.b(null, (sls) Q2, btsVar5, 0, 1);
                    break;
                }
            case 14:
                ((Integer) obj2).getClass();
                p3z.a((eyr) obj4, (androidx.compose.runtime.internal.a) obj3, (fid) obj, vng.O(49));
                break;
            case 15:
                ((Integer) obj2).getClass();
                q3z.a((lyy) obj4, (androidx.compose.runtime.internal.a) obj3, (fid) obj, vng.O(49));
                break;
            case 16:
                ((Integer) obj2).getClass();
                raz.b((abz) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                raz.e((kkz) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                raz.c((nvi0) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                com.yandex.go.loyalty.impl.selector.ui.a.f((kxz) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                b.b((d) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                tib1.a((ebp0) obj4, (g510) obj3, (fid) obj, vng.O(1));
                break;
            case 22:
                ak20 ak20Var = (ak20) obj4;
                sls slsVar = (sls) obj3;
                fid fidVar6 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (!btsVar6.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    btsVar6.Y();
                    break;
                } else {
                    kj20.a(ak20Var.c.a, slsVar, btsVar6, 0);
                    break;
                }
            case 23:
                ((Integer) obj2).getClass();
                xnb1.c((ModalViewType) obj4, (y7m) obj3, (fid) obj, vng.O(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                tk91.a((aa30) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                kob1.a((sls) obj4, (sls) obj3, (fid) obj, vng.O(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                cl91.g((String) obj4, (ovi0) obj3, (fid) obj, vng.O(1));
                break;
            case 27:
                tls tlsVar3 = (tls) obj4;
                ll30 ll30Var = (ll30) obj3;
                fid fidVar7 = (fid) obj;
                int intValue7 = ((Integer) obj2).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (!btsVar7.V(intValue7 & 1, (intValue7 & 3) != 2)) {
                    btsVar7.Y();
                    break;
                } else {
                    Object Q3 = btsVar7.Q();
                    if (Q3 == o430Var) {
                        Q3 = new pi30(5);
                        btsVar7.o0(Q3);
                    }
                    f530 b = fnq0.b(c530Var, false, (tls) Q3);
                    boolean k2 = btsVar7.k(tlsVar3) | btsVar7.e(ll30Var);
                    Object Q4 = btsVar7.Q();
                    if (k2 || Q4 == o430Var) {
                        Q4 = new lk30(tlsVar3, ll30Var, 2);
                        btsVar7.o0(Q4);
                    }
                    xqb1.b(b, (sls) Q4, btsVar7, 0, 0);
                    break;
                }
            case 28:
                ((Integer) obj2).getClass();
                uob1.c((vp30) obj4, (tls) obj3, (fid) obj, vng.O(1));
                break;
            default:
                ((Integer) obj2).getClass();
                wob1.b((ot30) obj4, (sls) obj3, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ s0v(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
