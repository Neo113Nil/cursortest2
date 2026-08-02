package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.preorder.map.CameraAnimationFinishType;
import kotlin.Metadata;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.search.address.view.PointType;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lq2s0;", "Ll050;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface q2s0 extends l050 {
    void F1();

    void Q0(CameraAnimationFinishType cameraAnimationFinishType);

    void showAddressesPicker(SourcePicker sourcePicker, PointType pointType);

    void ua(Address address);
}
