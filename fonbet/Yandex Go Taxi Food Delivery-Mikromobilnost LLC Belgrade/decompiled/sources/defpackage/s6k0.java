package defpackage;

import android.net.Uri;
import androidx.camera.core.ImageCaptureException;
import com.yandex.go.scooters.qr.unavailable_scooter.analytics.ScootersQrUnavailableScooterAnalytics$Button;
import com.yandex.go.scooters.qr.unavailable_scooter.analytics.ScootersQrUnavailableScooterAnalytics$State;
import com.yandex.go.shortcuts.dto.request.ProductsScreenType$Type;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderTipsState;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.ui.payment.sbp.d;
import com.ybsdk.feature.main.internal.domain.entities.sbpPartners.Status;
import com.ybsdk.feature.main.internal.screens.sbpPartners.a;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$IdType;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$SaveRideModalButtonName;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$SaveRideModalMode;
import ru.yandex.taxi.scooters.domain.model.ScootersPhotoNotSavedException;

/* loaded from: classes13.dex */
public final class s6k0 implements ryj0, u8v, o1s0 {
    public final Object a;
    public Object b;
    public Object c;

    public /* synthetic */ s6k0(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // defpackage.o1s0
    public yaf0 a() {
        return new vaf0((String) this.a, ((ghf) this.c).b(), (ProductsScreenType$Type) this.b);
    }

    public void b(String str, Status status) {
        int i;
        r0 r0Var;
        Object value;
        ohm0 ohm0Var;
        List c = c();
        ArrayList arrayList = new ArrayList(tcc.n(c, 10));
        Iterator it = c.iterator();
        while (true) {
            i = 2;
            if (!it.hasNext()) {
                break;
            }
            ohm0 ohm0Var2 = (ohm0) it.next();
            int i2 = rhm0.a[status.ordinal()];
            if (i2 == 1) {
                nhm0 nhm0Var = ohm0Var2.a;
                ohm0Var = new ohm0(nhm0.a(nhm0Var, jl40.l(nhm0Var.b, str) ? status : Status.WAITING));
            } else if (i2 != 2) {
                arrayList.add(ohm0Var2);
            } else {
                ohm0Var = new ohm0(nhm0.a(ohm0Var2.a, status));
            }
            ohm0Var2 = ohm0Var;
            arrayList.add(ohm0Var2);
        }
        a aVar = (a) this.c;
        r8j0 r8j0Var = new r8j0(arrayList, null, 14);
        pz40 Y = aVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new vem0(zka1.d(((vem0) value).a, new di8(r8j0Var, i)))));
    }

    public List c() {
        Object t8j0Var;
        List list;
        u8j0 u8j0Var = ((vem0) ((a) this.c).X()).a;
        if (u8j0Var instanceof r8j0) {
            r8j0 r8j0Var = (r8j0) u8j0Var;
            t8j0Var = new r8j0(((wem0) r8j0Var.a).a, r8j0Var.b, r8j0Var.c, r8j0Var.d);
        } else if (u8j0Var instanceof s8j0) {
            t8j0Var = new s8j0(((s8j0) u8j0Var).a);
        } else {
            if (!(u8j0Var instanceof t8j0)) {
                w511.b();
                return null;
            }
            t8j0Var = new t8j0();
        }
        r8j0 r8j0Var2 = (r8j0) (!(t8j0Var instanceof r8j0) ? null : t8j0Var);
        if (r8j0Var2 != null && (list = (List) r8j0Var2.a) != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                return list;
            }
        }
        x4c.g("Binding sbp yb account with a strange state of yb items", null, String.valueOf(t8j0Var), null, 10);
        return EmptyList.a;
    }

    public bpk0 d(TaxiOrderTipsState taxiOrderTipsState, List list) {
        int s = ((ine0) this.a).a.s();
        if (s <= 0) {
            return null;
        }
        String i = ((avj0) ((zuj0) this.b)).i(kyh0.tip_percent_format, Integer.valueOf(s));
        String valueOf = String.valueOf(s);
        TaxiOrderSelectedTipsChoiceState taxiOrderSelectedTipsChoiceState = taxiOrderTipsState.d;
        boolean z = false;
        if (taxiOrderSelectedTipsChoiceState != null && taxiOrderSelectedTipsChoiceState.a == TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsChoiceType.PREFERRED_CHOICE && taxiOrderSelectedTipsChoiceState.b == TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.PERCENT && jl40.l(taxiOrderSelectedTipsChoiceState.c, valueOf)) {
            z = true;
        }
        boolean z2 = z;
        ((rck0) this.c).getClass();
        return new bpk0(i, z2, new bbk0(valueOf), i, String.valueOf(s), rck0.a(list, z2));
    }

    public void e(FavoritesAnalytics$SaveRideModalButtonName favoritesAnalytics$SaveRideModalButtonName, rzl0 rzl0Var) {
        s6k0 g = g(rzl0Var);
        if (g != null) {
            aip aipVar = (aip) this.b;
            String str = (String) g.a;
            FavoritesAnalytics$IdType favoritesAnalytics$IdType = (FavoritesAnalytics$IdType) g.b;
            FavoritesAnalytics$SaveRideModalMode favoritesAnalytics$SaveRideModalMode = (FavoritesAnalytics$SaveRideModalMode) g.c;
            aipVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("id", str);
            hashMap.put("id_type", favoritesAnalytics$IdType.getEventValue());
            hashMap.put("mode", favoritesAnalytics$SaveRideModalMode.getEventValue());
            hashMap.put("button_name", favoritesAnalytics$SaveRideModalButtonName.getEventValue());
            aipVar.a.a("Favorites.SaveTripModal.Tapped", hashMap, 1, new HashMap());
        }
    }

    public void f(ScootersQrUnavailableScooterAnalytics$Button scootersQrUnavailableScooterAnalytics$Button) {
        i d = ((j) ((lx4) this.a)).d("ScootersQrAlert.Tapped");
        String analyticsName = scootersQrUnavailableScooterAnalytics$Button.getAnalyticsName();
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put("button_name", analyticsName);
        ScootersQrUnavailableScooterAnalytics$State scootersQrUnavailableScooterAnalytics$State = (ScootersQrUnavailableScooterAnalytics$State) this.c;
        if (scootersQrUnavailableScooterAnalytics$State != null) {
            linkedHashMap.put(ClidProvider.STATE, scootersQrUnavailableScooterAnalytics$State.getAnalyticsName());
        }
        String str = (String) this.b;
        if (str != null) {
            d.d("open_reason", str);
        }
        d.m();
    }

    public s6k0 g(rzl0 rzl0Var) {
        FavoritesAnalytics$IdType favoritesAnalytics$IdType;
        String str = rzl0Var.b;
        if (str == null) {
            return null;
        }
        if (str.equals("order")) {
            favoritesAnalytics$IdType = FavoritesAnalytics$IdType.Order;
        } else if (str.equals("ride")) {
            favoritesAnalytics$IdType = FavoritesAnalytics$IdType.Ride;
        } else {
            k0m0 k0m0Var = (k0m0) this.a;
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            k0m0Var.getClass();
            jst.e.g("SAVE_MODAL_ERROR_TOKEN_V1", "SaveModalLoggerTag", "SAVE_MODAL_ERROR_TOKEN_V1:IdType is invalid", illegalArgumentException);
            favoritesAnalytics$IdType = null;
        }
        if (favoritesAnalytics$IdType == null) {
            return null;
        }
        return new s6k0(rzl0Var.a, favoritesAnalytics$IdType, rzl0Var.i ? FavoritesAnalytics$SaveRideModalMode.Edit : FavoritesAnalytics$SaveRideModalMode.Save);
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        ((d) this.a).a0(new hjm0((PaymentKitError) obj));
    }

    @Override // defpackage.u8v
    public void j(ImageCaptureException imageCaptureException) {
        ((OutputStream) this.a).close();
        ((j18) this.b).resumeWith(new Result.Failure(new ScootersPhotoNotSavedException()));
    }

    @Override // defpackage.u8v
    public void k(reu reuVar) {
        ((OutputStream) this.a).close();
        j18 j18Var = (j18) this.b;
        Uri uri = (Uri) reuVar.b;
        if (uri == null) {
            uri = (Uri) this.c;
        }
        j18Var.resumeWith(uri);
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        sm0 sm0Var = (sm0) obj;
        d dVar = (d) this.a;
        if (!(sm0Var instanceof nm0)) {
            if (sm0Var instanceof rm0) {
                rm0 rm0Var = (rm0) sm0Var;
                ((t7l0) this.c).invoke(rm0Var.a, rm0Var.b);
                return;
            }
            return;
        }
        mp4 mp4Var = (mp4) this.b;
        if (mp4Var instanceof lp4) {
            lp4 lp4Var = (lp4) mp4Var;
            dVar.y.edit().putString("com.yandex.payment.LAST_USED_BANK_NAME", lp4Var.a).putString("com.yandex.payment.LAST_USED_BANK_SCHEME", lp4Var.b).putString("com.yandex.payment.LAST_USED_BANK_ICON_URI", lp4Var.g.toString()).putString("com.yandex.payment.LAST_USED_BANK_URL_TEMPLATE", lp4Var.f).putString("com.yandex.payment.LAST_USED_BANK_WEB_CLIENT_URI", lp4Var.c).putBoolean("com.yandex.payment.LAST_USED_BANK_IS_WEB_CLIENT_ACTIVE", lp4Var.d).apply();
        }
        d dVar2 = (d) this.a;
        xry0 xry0Var = yry0.a;
        dVar2.a0(new kjm0(yry0.a.c));
    }

    public s6k0(k0m0 k0m0Var, aip aipVar) {
        this.a = k0m0Var;
        this.b = aipVar;
    }

    public s6k0(lx4 lx4Var) {
        this.a = lx4Var;
    }
}
