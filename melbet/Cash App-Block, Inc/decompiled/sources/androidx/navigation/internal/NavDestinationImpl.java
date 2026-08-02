package androidx.navigation.internal;

import android.net.Uri;
import android.os.Bundle;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavDestination;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Lazy;

/* loaded from: classes3.dex */
public final class NavDestinationImpl {
    public final NavDestination destination;
    public int id;
    public String idName;
    public String route;
    public Lazy routeDeepLink;
    public final ArrayList deepLinks = new ArrayList();
    public final LinkedHashMap arguments = new LinkedHashMap();

    public NavDestinationImpl(NavDestination navDestination) {
        this.destination = navDestination;
    }

    public final NavDestination.DeepLinkMatch matchRoute$navigation_common_release(String str) {
        NavDeepLink navDeepLink;
        str.getClass();
        Lazy lazy = this.routeDeepLink;
        if (lazy == null || (navDeepLink = (NavDeepLink) lazy.getValue()) == null) {
            return null;
        }
        int i = NavDestination.$r8$clinit;
        Uri parse = Uri.parse("android-app://androidx.navigation/".concat(str));
        parse.getClass();
        Bundle matchingArguments = navDeepLink.getMatchingArguments(parse, this.arguments);
        if (matchingArguments == null) {
            return null;
        }
        return new NavDestination.DeepLinkMatch(this.destination, matchingArguments, navDeepLink.isExactDeepLink, navDeepLink.calculateMatchingPathSegments$navigation_common_release(parse), false, -1);
    }
}
