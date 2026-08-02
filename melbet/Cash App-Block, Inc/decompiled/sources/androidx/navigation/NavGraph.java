package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.collection.SieveCacheKt;
import androidx.collection.SparseArrayCompat;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.navigation.NavDestination;
import androidx.navigation.internal.NavGraphImpl$iterator$1;
import com.bugsnag.android.TraceParser;
import com.caverock.androidsvg.SVG;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.UIntArray;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public class NavGraph extends NavDestination implements Iterable, KMappedMarker {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final TraceParser impl;

    public NavGraph(NavGraphNavigator navGraphNavigator) {
        super(navGraphNavigator);
        this.impl = new TraceParser(this);
    }

    @Override // androidx.navigation.NavDestination
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof NavGraph) || !super.equals(obj)) {
                return false;
            }
            TraceParser traceParser = this.impl;
            int size = ((SparseArrayCompat) traceParser.projectPackages).size();
            TraceParser traceParser2 = ((NavGraph) obj).impl;
            if (size != ((SparseArrayCompat) traceParser2.projectPackages).size() || traceParser.state != traceParser2.state) {
                return false;
            }
            SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) traceParser.projectPackages;
            sparseArrayCompat.getClass();
            Iterator it = SequencesKt__SequencesKt.asSequence(new UIntArray.Iterator(sparseArrayCompat, 1)).iterator();
            while (it.hasNext()) {
                NavDestination navDestination = (NavDestination) it.next();
                SparseArrayCompat sparseArrayCompat2 = (SparseArrayCompat) traceParser2.projectPackages;
                int i = navDestination.impl.id;
                sparseArrayCompat2.getClass();
                if (!navDestination.equals(SieveCacheKt.commonGet(sparseArrayCompat2, i))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // androidx.navigation.NavDestination
    public final int hashCode() {
        TraceParser traceParser = this.impl;
        int i = traceParser.state;
        SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) traceParser.projectPackages;
        int size = sparseArrayCompat.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = Fragment$5$$ExternalSyntheticOutline0.m$1(i, 31, sparseArrayCompat.keyAt(i2), 31) + ((NavDestination) sparseArrayCompat.valueAt(i2)).hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        TraceParser traceParser = this.impl;
        traceParser.getClass();
        return new NavGraphImpl$iterator$1(traceParser);
    }

    @Override // androidx.navigation.NavDestination
    public final NavDestination.DeepLinkMatch matchDeepLink(SVG svg) {
        NavDestination.DeepLinkMatch matchDeepLink = super.matchDeepLink(svg);
        TraceParser traceParser = this.impl;
        traceParser.getClass();
        return traceParser.matchDeepLinkComprehensive$navigation_common_release(matchDeepLink, svg, false, (NavGraph) traceParser.logger);
    }

    public final NavDestination.DeepLinkMatch matchDeepLinkComprehensive(SVG svg, NavDestination navDestination) {
        return this.impl.matchDeepLinkComprehensive$navigation_common_release(super.matchDeepLink(svg), svg, true, navDestination);
    }

    public final NavDestination.DeepLinkMatch matchRouteComprehensive(String str, boolean z, NavDestination navDestination) {
        NavDestination.DeepLinkMatch deepLinkMatch;
        str.getClass();
        TraceParser traceParser = this.impl;
        traceParser.getClass();
        NavGraph navGraph = (NavGraph) traceParser.logger;
        NavDestination.DeepLinkMatch matchRoute$navigation_common_release = ((NavDestination) navGraph).impl.matchRoute$navigation_common_release(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = navGraph.iterator();
        while (true) {
            NavGraphImpl$iterator$1 navGraphImpl$iterator$1 = (NavGraphImpl$iterator$1) it;
            deepLinkMatch = null;
            if (!navGraphImpl$iterator$1.hasNext()) {
                break;
            }
            NavDestination navDestination2 = (NavDestination) navGraphImpl$iterator$1.next();
            if (!Intrinsics.areEqual(navDestination2, navDestination)) {
                if (navDestination2 instanceof NavGraph) {
                    deepLinkMatch = ((NavGraph) navDestination2).matchRouteComprehensive(str, false, navGraph);
                } else {
                    navDestination2.getClass();
                    deepLinkMatch = navDestination2.impl.matchRoute$navigation_common_release(str);
                }
            }
            if (deepLinkMatch != null) {
                arrayList.add(deepLinkMatch);
            }
        }
        NavDestination.DeepLinkMatch deepLinkMatch2 = (NavDestination.DeepLinkMatch) CollectionsKt.maxOrNull((Iterable) arrayList);
        NavGraph navGraph2 = navGraph.parent;
        if (navGraph2 != null && z && !navGraph2.equals(navDestination)) {
            deepLinkMatch = navGraph2.matchRouteComprehensive(str, true, navGraph);
        }
        return (NavDestination.DeepLinkMatch) CollectionsKt.maxOrNull((Iterable) ArraysKt___ArraysKt.filterNotNull(new NavDestination.DeepLinkMatch[]{matchRoute$navigation_common_release, deepLinkMatch2, deepLinkMatch}));
    }

    @Override // androidx.navigation.NavDestination
    public final void onInflate(Context context, AttributeSet attributeSet) {
        String valueOf;
        context.getClass();
        super.onInflate(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, androidx.navigation.common.R$styleable.NavGraphNavigator);
        obtainAttributes.getClass();
        int resourceId = obtainAttributes.getResourceId(0, 0);
        TraceParser traceParser = this.impl;
        NavGraph navGraph = (NavGraph) traceParser.logger;
        if (resourceId == ((NavDestination) navGraph).impl.id) {
            throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + navGraph).toString());
        }
        if (((String) traceParser.threadAttrs) != null) {
            traceParser.setStartDestinationRoute$navigation_common_release(null);
        }
        traceParser.state = resourceId;
        traceParser.currentThread = null;
        int i = traceParser.state;
        if (i <= 16777215) {
            valueOf = String.valueOf(i);
        } else {
            try {
                valueOf = context.getResources().getResourceName(i);
                valueOf.getClass();
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i);
            }
        }
        traceParser.currentThread = valueOf;
        obtainAttributes.recycle();
    }

    @Override // androidx.navigation.NavDestination
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        TraceParser traceParser = this.impl;
        String str = (String) traceParser.threadAttrs;
        traceParser.getClass();
        NavDestination findNode$navigation_common_release = (str == null || StringsKt.isBlank(str)) ? null : traceParser.findNode$navigation_common_release(str, true);
        if (findNode$navigation_common_release == null) {
            findNode$navigation_common_release = traceParser.findNode$navigation_common_release(traceParser.state);
        }
        sb.append(" startDestination=");
        if (findNode$navigation_common_release == null) {
            String str2 = (String) traceParser.threadAttrs;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = (String) traceParser.currentThread;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(traceParser.state));
                }
            }
        } else {
            sb.append("{");
            sb.append(findNode$navigation_common_release.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
