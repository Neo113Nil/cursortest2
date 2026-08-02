package androidx.navigation;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.TraceParser;
import com.squareup.cash.ui.CashInsets;
import java.util.ArrayList;
import java.util.Iterator;
import org.commonmark.node.Node;

/* loaded from: classes3.dex */
public final class NavGraphBuilder extends Node {
    public final ArrayList destinations;
    public final NavigatorProvider provider;
    public final String startDestinationRoute;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider navigatorProvider, String str) {
        super(navigatorProvider.getNavigator(CashInsets.Companion.getNameForNavigator$navigation_common_release(NavGraphNavigator.class)), (String) null);
        navigatorProvider.getClass();
        str.getClass();
        this.destinations = new ArrayList();
        this.provider = navigatorProvider;
        this.startDestinationRoute = str;
    }

    @Override // org.commonmark.node.Node
    public final NavGraph build() {
        NavGraph navGraph = (NavGraph) super.build();
        ArrayList arrayList = this.destinations;
        arrayList.getClass();
        TraceParser traceParser = navGraph.impl;
        traceParser.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            NavDestination navDestination = (NavDestination) it.next();
            if (navDestination != null) {
                traceParser.addDestination$navigation_common_release(navDestination);
            }
        }
        String str = this.startDestinationRoute;
        if (str != null) {
            traceParser.setStartDestinationRoute$navigation_common_release(str);
            return navGraph;
        }
        if (((String) this.firstChild) != null) {
            a$$ExternalSyntheticBUOutline0.m$1("You must set a start destination route");
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$1("You must set a start destination id");
        return null;
    }
}
