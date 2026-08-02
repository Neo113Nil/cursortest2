package defpackage;

import android.graphics.Bitmap;
import com.yandex.go.navigator.ui.b;
import com.yandex.mapkit.Animation;
import java.text.NumberFormat;
import java.util.function.Supplier;
import ru.yandex.taxi.favorites.fragment.FavoriteAddressPickerMapFragment;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final /* synthetic */ class ydf implements Supplier {
    public final /* synthetic */ int a;

    public /* synthetic */ ydf(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        String onViewCreated$lambda$0;
        switch (this.a) {
            case 0:
                return NumberFormat.getInstance();
            case 1:
                return TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY;
            case 2:
                onViewCreated$lambda$0 = FavoriteAddressPickerMapFragment.onViewCreated$lambda$0();
                return onViewCreated$lambda$0;
            case 3:
                return new h2s();
            case 4:
                return "masstransit";
            case 5:
                return Bitmap.createBitmap(0, 0, Bitmap.Config.ARGB_8888);
            case 6:
                Animation animation = b.L;
                return "navigator";
            case 7:
                return new v660();
            case 8:
                return new xv70();
            case 9:
                return new v3b0();
            case 10:
                return new r0r0();
            case 11:
                return "default";
            case 12:
                return new snx0();
            default:
                return Boolean.TRUE;
        }
    }
}
