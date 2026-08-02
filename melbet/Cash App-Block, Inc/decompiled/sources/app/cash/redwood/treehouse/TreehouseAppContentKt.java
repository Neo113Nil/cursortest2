package app.cash.redwood.treehouse;

import com.fillr.featuretoggle.UnleashContext;
import com.squareup.cash.arcade.treehouse.SwitchBinding;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.ArrayList;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class TreehouseAppContentKt {
    public static final void access$showLoading(TreehouseLayout treehouseLayout) {
        UnleashContext unleashContext = treehouseLayout.children;
        unleashContext.remove(0, ((ArrayList) unleashContext.properties).size());
        treehouseLayout.children.insert(0, new SwitchBinding(treehouseLayout.dynamicContentWidgetFactory.mContext, 2));
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewDraftPayment.deepLinkSpecs;
    }
}
