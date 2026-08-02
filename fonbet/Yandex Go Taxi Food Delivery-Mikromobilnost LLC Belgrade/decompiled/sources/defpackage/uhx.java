package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.concurrent.futures.b;
import androidx.media3.common.a;
import com.google.android.material.button.MaterialButton;
import com.yandex.go.taxi.order.models.api.car.CopyInfoType;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.runtime.image.ImageProvider;
import com.ybsdk.feature.merchant.offers.internal.screens.root.MerchantOffersFragment;
import com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.fragment.CopiedNotification;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationComponent;
import ru.yandex.taxi.logistics.ndd_map.router.e;
import ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutModalView;
import ru.yandex.taxi.masstransit.ui.discovery.c;
import ru.yandex.taxi.models.CopySource;
import ru.yandex.taxi.multiexit.MultiexitModalView;
import ru.yandex.taxi.order.OrderFragmentPresenter$updateScreenRect$$inlined$safeCollectIn$1;
import ru.yandex.taxi.order.i;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl;
import ru.yandex.video.m3.player.provider.Supplier;

/* loaded from: classes13.dex */
public final /* synthetic */ class uhx implements aa3, cf3, el7, r48, ai60, ee5, x710, ed10, llf, nl21, odv, dx4, ulp, dly, mep0, an40, xz60, vl00, uf41, yg41, Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uhx(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.nl21
    public void B(o0k o0kVar) {
        ((pv10) this.b).a().a.setText(o0kVar.a);
    }

    @Override // defpackage.an40
    public void a(String str, String str2, boolean z) {
        ((t690) this.b).d(str, str2, z);
    }

    @Override // defpackage.aa3
    public euy apply(Object obj) {
        return (euy) ((ptw) this.b).invoke(obj);
    }

    @Override // defpackage.ed10
    public int b(Object obj) {
        a aVar = (a) this.b;
        sb10 sb10Var = (sb10) obj;
        String str = sb10Var.b;
        return ((str.equals(aVar.n) || str.equals(fd10.b(aVar))) && sb10Var.c(aVar, false) && sb10Var.d(aVar)) ? 1 : 0;
    }

    public void c(float f) {
        ((MaterialButton) this.b).lambda$setOpticalCenterEnabled$4(f);
    }

    public void d() {
        i iVar = (i) this.b;
        iVar.A0.a(null);
        iVar.A0 = tje.N(iVar.Jg(), null, null, new OrderFragmentPresenter$updateScreenRect$$inlined$safeCollectIn$1(new g92(2, zy11.a), null, iVar), 3);
    }

    @Override // defpackage.r48
    public void e(String str, CopyInfoType copyInfoType, CopySource copySource) {
        boj0 boj0Var = (boj0) this.b;
        jj10 jj10Var = (jj10) boj0Var.x;
        int i = nhz.a[copyInfoType.ordinal()];
        if (i == 1) {
            jj10Var.getClass();
            jj10Var.a.a("Menu.CopyCarPlateFullNumber.Tapped", new HashMap(), 1, new HashMap());
        } else if (i == 2) {
            jj10Var.getClass();
            jj10Var.a.a("Menu.CopyCarModelDetails.Tapped", new HashMap(), 1, new HashMap());
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            jj10Var.getClass();
            jj10Var.a.a("Menu.CopyCarPlateFullNumberAndCarDetails.Tapped", new HashMap(), 1, new HashMap());
        }
        fjz fjzVar = (fjz) boj0Var.w;
        c6i c6iVar = fjzVar.d;
        c6iVar.getClass();
        c6iVar.a.a("DeliveryDetails.Menu.Tapped", new HashMap(), 1, new HashMap());
        Context context = (Context) boj0Var.y;
        qke.w(context, HapticController$Effect.CLICK_MEDIUM, true, true);
        ((k3c) boj0Var.b).a(false, str, "CarNumberInfo");
        tj60 tj60Var = (tj60) boj0Var.c;
        if (tj60Var.a(copyInfoType.getId()) != null) {
            return;
        }
        CopiedNotification copiedNotification = new CopiedNotification(context, copyInfoType.getStringId(), copyInfoType.getStringId(), copyInfoType.getId());
        pnr0 pnr0Var = fjzVar.g;
        pnr0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("car_number", str);
        pnr0Var.a.a("SharedOrderCardCarNumber.Copied", hashMap, 1, new HashMap());
        tj60Var.e(copiedNotification);
        copiedNotification.startExpiresTimer();
        copiedNotification.setExpiresListener(new qn5(7, boj0Var, copyInfoType));
    }

    @Override // defpackage.ulp
    /* renamed from: get, reason: collision with other method in class */
    public tlp mo967get() {
        Object h = ((com.yandex.plus.experiments.impl.providers.a) ((wn40) this.b).k).h();
        if (h instanceof Result.Failure) {
            h = null;
        }
        k2d0 k2d0Var = (k2d0) h;
        return new tlp(k2d0Var != null ? k2d0Var.d : null);
    }

    @Override // defpackage.vl00
    public void h(CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
        e eVar = ((ei50) this.b).b;
        eVar.getClass();
        if (cameraUpdateReason == CameraUpdateReason.GESTURES && eVar.H.a().a && z) {
            Point target = cameraPosition.getTarget();
            eVar.f(new zzs(target.getLatitude(), target.getLongitude(), 0, null, null, 28));
        }
    }

    @Override // defpackage.ai60
    public void i(boolean z) {
        MapNotificationComponent._init_$lambda$1((MapNotificationComponent) this.b, z);
    }

    @Override // defpackage.el7
    public Object j(b bVar) {
        evy evyVar = (evy) this.b;
        geb1.f().execute(new r7v(23, evyVar, bVar));
        return evyVar + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    @Override // defpackage.mep0
    public ru.yandex.taxi.superapp.shortcuts.a k(dgp0 dgp0Var) {
        w3i w3iVar = (w3i) this.b;
        tse tseVar = (tse) w3iVar.c;
        c cVar = (c) w3iVar.z;
        i47 i47Var = (i47) w3iVar.B;
        xz30 xz30Var = (xz30) w3iVar.A;
        dgp0Var.getClass();
        return new ru.yandex.taxi.superapp.shortcuts.a(tseVar, dgp0Var.a, i47Var, xz30Var, cVar);
    }

    @Override // defpackage.xz60
    public void l(int i, int i2, int i3, boolean z) {
        MultiexitModalView._init_$lambda$0((MultiexitModalView) this.b, i, i2, i3, z);
    }

    @Override // defpackage.ee5
    public void m(Object obj, ce5 ce5Var) {
        po00 po00Var = (po00) this.b;
        bq00 bq00Var = po00Var.c;
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return;
        }
        Object obj2 = map.get("icon_id");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        String str = (String) obj2;
        if (str == null) {
            return;
        }
        Object obj3 = map.get("icon_bytes");
        if (!(obj3 instanceof List)) {
            obj3 = null;
        }
        List list = (List) obj3;
        if (list == null) {
            return;
        }
        Object obj4 = map.get("scale_factor");
        if (!(obj4 instanceof Number)) {
            obj4 = null;
        }
        Number number = (Number) obj4;
        float floatValue = number != null ? number.floatValue() : 1.0f;
        int size = list.size();
        byte[] bArr = new byte[size];
        for (int i = 0; i < size; i++) {
            bArr[i] = (byte) ((Number) list.get(i)).intValue();
        }
        bq00Var.b.put(str, new nav(str, ImageProvider.fromBitmap(BitmapFactory.decodeByteArray(bArr, 0, size), true, str), floatValue));
        Set set = (Set) bq00Var.c.get(str);
        if (set == null) {
            set = EmptySet.a;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jv00 d = bq00Var.d((String) it.next());
            MapObject mapObject = d != null ? d.b : null;
            PlacemarkMapObject placemarkMapObject = mapObject instanceof PlacemarkMapObject ? (PlacemarkMapObject) mapObject : null;
            if (placemarkMapObject != null) {
                String str2 = d.e;
                String str3 = d.g;
                if (str2 != null) {
                    nav c = bq00Var.c(str2);
                    if (c == null) {
                        po00Var.d(str2);
                    } else {
                        String str4 = c.a;
                        if (!jl40.l(d.h, str4)) {
                            IconStyle iconStyle = d.d;
                            if (iconStyle == null) {
                                iconStyle = new IconStyle();
                            }
                            placemarkMapObject.setIcon(c.b, po00.b(iconStyle, c.c));
                            d.h = str4;
                        }
                    }
                }
                if (str3 != null) {
                    nav c2 = bq00Var.c(str3);
                    if (c2 == null) {
                        po00Var.d(str3);
                    } else {
                        String str5 = c2.a;
                        if (!jl40.l(d.h, str5)) {
                            IconStyle iconStyle2 = d.f;
                            if (iconStyle2 == null) {
                                iconStyle2 = new IconStyle();
                            }
                            placemarkMapObject.setIcon(c2.b, po00.b(iconStyle2, c2.c));
                            d.h = str5;
                        }
                    }
                }
            }
        }
        ce5Var.a(null);
    }

    @Override // defpackage.dly
    public boolean n(ClickableSpan clickableSpan) {
        boolean linkClickMovementMethod$lambda$0;
        linkClickMovementMethod$lambda$0 = MtCheckoutModalView.linkClickMovementMethod$lambda$0((MtCheckoutModalView) this.b, clickableSpan);
        return linkClickMovementMethod$lambda$0;
    }

    @Override // defpackage.dx4
    public void o(ru.yandex.taxi.search.view.a aVar, pv0 pv0Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 16:
                ((y71) obj).r(new t71(pv0Var, 5));
                break;
            case 17:
            default:
                ((f28) obj).r(new t71(pv0Var, 7));
                break;
            case 18:
                ((da0) obj).r(new t71(pv0Var, 6));
                break;
        }
    }

    @Override // defpackage.uf41
    public void onClose() {
        ((ru.yandex.taxi.surge.router.a) this.b).r(new qu(9));
    }

    @Override // defpackage.llf
    public boolean q(CustomSwipeRefreshLayout customSwipeRefreshLayout, View view) {
        boolean onViewCreated$lambda$14$lambda$11;
        onViewCreated$lambda$14$lambda$11 = MerchantOffersFragment.onViewCreated$lambda$14$lambda$11((MerchantOffersFragment) this.b, customSwipeRefreshLayout, view);
        return onViewCreated$lambda$14$lambda$11;
    }

    @Override // defpackage.odv
    public void r(pdv pdvVar) {
        c920 c920Var = (c920) this.b;
        synchronized (c920Var.a) {
            c920Var.c++;
        }
        c920Var.d(pdvVar);
    }

    @Override // defpackage.cf3
    public void setVolume(float f) {
        ((zty) this.b).a.setVolume(f);
    }

    @Override // ru.yandex.video.m3.player.provider.Supplier
    /* renamed from: get */
    public Object getValue() {
        PlayerDelegate decoderManager$lambda$2;
        decoderManager$lambda$2 = OptimizedYandexPlayerImpl.decoderManager$lambda$2((OptimizedYandexPlayerImpl) this.b);
        return decoderManager$lambda$2;
    }
}
