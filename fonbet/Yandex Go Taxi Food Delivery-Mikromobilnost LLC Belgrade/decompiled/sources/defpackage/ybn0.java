package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.domain.model.ScootersPhotoShootingException;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lybn0;", "Ll050;", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ybn0 extends l050 {
    void V();

    void Y0();

    void db();

    void disableShotButton();

    void dismissView();

    void enableShotButton();

    void hc(List list);

    void releaseCamera();

    void s4(ScootersPhotoShootingException scootersPhotoShootingException);

    void setFlashlightEnabled(boolean z);

    void stopCamera();

    Object u6(ContinuationImpl continuationImpl);
}
