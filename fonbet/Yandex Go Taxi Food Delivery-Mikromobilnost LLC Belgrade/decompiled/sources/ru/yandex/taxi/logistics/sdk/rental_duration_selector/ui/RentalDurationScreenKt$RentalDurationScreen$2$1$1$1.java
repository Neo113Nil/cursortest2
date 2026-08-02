package ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui;

import android.net.Uri;
import com.yandex.go.delivery.rental_duration_selector.e;
import defpackage.c9u;
import defpackage.g9u;
import defpackage.izi0;
import defpackage.sls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class RentalDurationScreenKt$RentalDurationScreen$2$1$1$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        g9u g9uVar;
        String str;
        d dVar = (d) this.receiver;
        dVar.y.a.a.o("DeliveryCargoHour.SelectTimeScreen.Info.Tapped", null, new LinkedHashMap());
        e eVar = dVar.b;
        c9u c9uVar = ((izi0) eVar.B.getValue()).a;
        if (c9uVar != null && (g9uVar = c9uVar.d) != null && (str = g9uVar.b) != null) {
            eVar.z.a(Uri.parse(str), DeeplinkSource.UNSPECIFIED);
        }
        return zy11.a;
    }
}
