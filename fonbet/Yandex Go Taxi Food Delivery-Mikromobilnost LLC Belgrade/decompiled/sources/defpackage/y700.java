package defpackage;

import com.yandex.go.address.models.Address;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.widget.modalview.ModalViewProcessing$ProcessingState;

/* loaded from: classes14.dex */
public interface y700 extends r330 {
    void addLocateButton();

    void collapse();

    int contentTop();

    void forceCollapse();

    ModalViewProcessing$ProcessingState getProcessingState();

    boolean isModalViewExpanded();

    boolean isProcessing();

    boolean isStickOut();

    void proceed();

    void removeLocateButton();

    void setProcessingState(ModalViewProcessing$ProcessingState modalViewProcessing$ProcessingState);

    void setSourceAddress(Address address);

    void showEditAddress(PointType pointType);

    void tryRenderPanoramaButton(Address address);
}
