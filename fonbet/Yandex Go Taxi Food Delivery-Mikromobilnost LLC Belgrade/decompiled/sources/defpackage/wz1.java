package defpackage;

import com.yandex.go.domain.interactor.b;
import com.yandex.go.inapp_calls.navigation.c;
import com.yandex.go.places.complaint.impl.ui.ComplaintNotification;
import com.yandex.go.places.impl.ui.notifications.favorites.ShowFavoritesNotification;
import com.yandex.go.scooters.driver_license_notification.ScootersDriverLicenseNotification;
import com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.j;
import com.yandex.go.taxi.order.change.source.interactor.e;
import com.yandex.go.taxi.order.change.tariff.a;
import com.yandex.go.ui.UserPhotoNotificationItemComponent;
import ru.yandex.taxi.masstransit.trains.checkout.s;
import ru.yandex.taxi.multiexit.notification.MultiexitEntranceChangeNotification;

/* loaded from: classes13.dex */
public final /* synthetic */ class wz1 implements xj60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wz1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xj60
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((xz1) obj).b.c("AltpinSourceErrorNotification");
                break;
            case 1:
                ((x39) obj).a.c("cashback_payment_changed_to_wallet");
                break;
            case 2:
                ((e) obj).b.c("ChangeSourcePointNotification");
                break;
            case 3:
                ((a) obj).b.c("TariffChangeNotification");
                break;
            case 4:
                ((tj60) ((zsa) obj).F).c(ComplaintNotification.NOTIFICATION_ID);
                break;
            case 5:
                ((tj60) ((q4g) obj).x).c("driver_phone_copied");
                break;
            case 6:
                mim mimVar = (mim) obj;
                String str = mimVar.g;
                if (str != null) {
                    mimVar.b.c(str);
                    break;
                }
                break;
            case 7:
                ((c) obj).G.c("DOWNLOAD_SUCCESS_NOTIFICATION_ID");
                break;
            case 8:
                s sVar = (s) obj;
                ((tj60) sVar.e.get()).c(sVar.g);
                break;
            case 9:
                ((dr40) obj).b.c(MultiexitEntranceChangeNotification.NOTIFICATION_ID);
                break;
            case 10:
                ((tj60) obj).c("plus_subscription_activation_status");
                break;
            case 11:
                ((fkg0) obj).b.c("QueueNotification");
                break;
            case 12:
                ((ru.yandex.taxi.notification.a) obj).E.c("DeferredSavedToFavoriteNotification");
                break;
            case 13:
                ((tj60) ((s6k0) obj).b).c("SavedToFavoriteNotification");
                break;
            case 14:
                ((com.yandex.go.scooters.deposit.notification.a) obj).r(new qu(9));
                break;
            case 15:
                ScootersDriverLicenseNotification.showNotification$lambda$0$0((ScootersDriverLicenseNotification) obj);
                break;
            case 16:
                ((tj60) ((w040) obj).g).c("IGNITION_ENABLED_NOTIFICATION_ID");
                break;
            case 17:
                ((j) obj).e.c("SUPER_PASS_PURCHASE_SUCCESS_NOTIFICATION_ID");
                break;
            case 18:
                ((com.yandex.go.places.impl.ui.notifications.favorites.a) obj).b.c(ShowFavoritesNotification.NOTIFICATION_ID);
                break;
            default:
                ((b) obj).g.c(UserPhotoNotificationItemComponent.NOTIFICATION_ID);
                break;
        }
    }
}
