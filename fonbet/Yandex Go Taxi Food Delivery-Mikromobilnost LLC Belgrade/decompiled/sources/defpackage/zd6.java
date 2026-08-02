package defpackage;

import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class zd6 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = BottomPanelButtonType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
