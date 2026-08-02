package defpackage;

import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonSize;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class yd6 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = BottomPanelButtonSize.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
