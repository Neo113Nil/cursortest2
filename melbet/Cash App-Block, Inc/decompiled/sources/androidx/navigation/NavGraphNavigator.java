package androidx.navigation;

import android.os.Bundle;
import androidx.collection.SieveCacheKt;
import androidx.collection.SparseArrayCompat;
import androidx.core.os.BundleKt;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.internal.NavDestinationImpl;
import app.cash.redwood.Modifier$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.TraceParser;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Ref$ObjectRef;
import okio.Path$$ExternalSyntheticBUOutline0;

@Navigator.Name(BreadcrumbHelper.Category.NAVIGATION)
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/NavGraphNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavGraph;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class NavGraphNavigator extends Navigator {
    public final NavigatorProvider navigatorProvider;

    public NavGraphNavigator(NavigatorProvider navigatorProvider) {
        navigatorProvider.getClass();
        this.navigatorProvider = navigatorProvider;
    }

    @Override // androidx.navigation.Navigator
    public NavGraph createDestination() {
        return new NavGraph(this);
    }

    @Override // androidx.navigation.Navigator
    public final void navigate(List list, NavOptions navOptions) {
        NavDestination navDestination;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
            NavDestination navDestination2 = navBackStackEntry.destination;
            navDestination2.getClass();
            NavGraph navGraph = (NavGraph) navDestination2;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = navBackStackEntry.impl.getArguments$navigation_common_release();
            TraceParser traceParser = navGraph.impl;
            int i = traceParser.state;
            String str = (String) traceParser.threadAttrs;
            if (i == 0 && str == null) {
                NavDestinationImpl navDestinationImpl = ((NavDestination) navGraph).impl;
                String str2 = navDestinationImpl.idName;
                if (str2 == null) {
                    str2 = String.valueOf(navDestinationImpl.id);
                }
                str2.getClass();
                if (((NavDestination) ((NavGraph) traceParser.logger)).impl.id == 0) {
                    str2 = "the root navigation";
                }
                Path$$ExternalSyntheticBUOutline0.m((Object) "no start destination defined via app:startDestination for ".concat(str2));
                return;
            }
            if (str != null) {
                navDestination = traceParser.findNode$navigation_common_release(str, false);
            } else {
                SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) traceParser.projectPackages;
                sparseArrayCompat.getClass();
                navDestination = (NavDestination) SieveCacheKt.commonGet(sparseArrayCompat, i);
            }
            if (navDestination == null) {
                if (((String) traceParser.currentThread) == null) {
                    String str3 = (String) traceParser.threadAttrs;
                    if (str3 == null) {
                        str3 = String.valueOf(traceParser.state);
                    }
                    traceParser.currentThread = str3;
                }
                String str4 = (String) traceParser.currentThread;
                str4.getClass();
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("navigation destination ", str4, " is not a direct child of this NavGraph"));
                return;
            }
            NavDestinationImpl navDestinationImpl2 = navDestination.impl;
            if (str != null) {
                if (!str.equals(navDestinationImpl2.route)) {
                    NavDestination.DeepLinkMatch matchRoute$navigation_common_release = navDestinationImpl2.matchRoute$navigation_common_release(str);
                    Bundle bundle = matchRoute$navigation_common_release != null ? matchRoute$navigation_common_release.matchingArgs : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        EmptyMap.INSTANCE.getClass();
                        Bundle bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        bundleOf.putAll(bundle);
                        Bundle bundle2 = (Bundle) ref$ObjectRef.element;
                        if (bundle2 != null) {
                            bundleOf.putAll(bundle2);
                        }
                        ref$ObjectRef.element = bundleOf;
                    }
                }
                if (navDestination.getArguments().isEmpty()) {
                    continue;
                } else {
                    ArrayList missingRequiredArguments = NavArgumentKt.missingRequiredArguments(navDestination.getArguments(), new Modifier$$ExternalSyntheticLambda0(2, ref$ObjectRef));
                    if (!missingRequiredArguments.isEmpty()) {
                        Path$$ExternalSyntheticBUOutline0.m(93, navDestination, ". Missing required arguments [", missingRequiredArguments, "Cannot navigate to startDestination ");
                        return;
                    }
                }
            }
            this.navigatorProvider.getNavigator(navDestination.navigatorName).navigate(CollectionsKt__CollectionsJVMKt.listOf(getState().createBackStackEntry(navDestination, navDestination.addInDefaultArgs((Bundle) ref$ObjectRef.element))), navOptions);
        }
    }
}
