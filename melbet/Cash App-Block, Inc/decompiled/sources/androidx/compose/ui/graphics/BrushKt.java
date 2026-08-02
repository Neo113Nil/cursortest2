package androidx.compose.ui.graphics;

import android.graphics.Shader;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.viewmodels.itemviewmodels.InfoTileViewModel;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.ClusterInfoItem;
import com.squareup.protos.cash.shop.rendering.api.ClusterSize;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$UrlAction;
import com.squareup.protos.cash.shop.rendering.api.UrlTapAction;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;

/* loaded from: classes3.dex */
public abstract class BrushKt {
    public static final BrushKt$ShaderBrush$1 ShaderBrush(Shader shader) {
        return new BrushKt$ShaderBrush$1(shader);
    }

    public static final ArrayList reorderItemsByRanking(List list, ClusterSize clusterSize) {
        int ordinal = clusterSize.ordinal();
        if (ordinal == 0) {
            return CollectionsKt.plus((Iterable) list.subList(3, list.size()), (Collection) CollectionsKt.reversed(list.subList(0, 3)));
        }
        if (ordinal == 1) {
            return CollectionsKt.plus((Iterable) list.subList(4, list.size()), (Collection) CollectionsKt.plus((Iterable) list.subList(0, 1), (Collection) list.subList(1, 4)));
        }
        if (ordinal != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        return CollectionsKt.plus((Iterable) list.subList(5, list.size()), (Collection) CollectionsKt.plus((Iterable) list.subList(0, 2), (Collection) CollectionsKt.plus((Iterable) list.subList(2, 4), (Collection) list.subList(4, 5))));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InfoTileViewModel toInfoCollectionTile(ClusterInfoItem clusterInfoItem) {
        String str;
        TapAction tapAction = clusterInfoItem.tap_action;
        if (tapAction == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Data validation: ClusterInfoItem.tap_action == null");
            return null;
        }
        AnalyticsEvent analyticsEvent = clusterInfoItem.analytics_view_event;
        if (analyticsEvent == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Data validation: info item analytics data was null");
            return null;
        }
        OffersAnalyticsEventSpec offersAnalyticsEventSpec = androidx.compose.ui.draw.ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent);
        com.squareup.protos.cash.ui.Color color = clusterInfoItem.background_color;
        StyledText styledText = clusterInfoItem.title;
        if (styledText == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Data validation: info item title was null");
            return null;
        }
        zzle zzleVar = tapAction.action;
        if (zzleVar != null) {
            TapAction$Action$UrlAction tapAction$Action$UrlAction = zzleVar instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar : null;
            UrlTapAction urlTapAction = tapAction$Action$UrlAction != null ? tapAction$Action$UrlAction.value : null;
            if (urlTapAction != null) {
                str = urlTapAction.action_url;
                if (str != null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Data validation: info item tap action was null");
                    return null;
                }
                Button button = clusterInfoItem.button;
                if (button == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Data validation: info item button was null");
                    return null;
                }
                List list = tapAction.analytics_tap_events;
                PersistentVectorBuilder builder = SmallPersistentVector.EMPTY.builder();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    builder.add(androidx.compose.ui.draw.ShadowKt.toOffersAnalyticsEventSpec((AnalyticsEvent) it.next()));
                }
                return new InfoTileViewModel(offersAnalyticsEventSpec, color, styledText, button, str, builder.build());
            }
        }
        str = null;
        if (str != null) {
        }
    }
}
