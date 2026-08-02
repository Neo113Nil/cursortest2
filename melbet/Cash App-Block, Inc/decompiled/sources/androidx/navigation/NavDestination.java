package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.collection.SieveCacheKt;
import androidx.collection.SparseArrayCompat;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.os.BundleKt;
import androidx.navigation.ActivityNavigator;
import androidx.navigation.internal.NavDestinationImpl;
import androidx.navigation.internal.NavDestinationImpl$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.b9$$ExternalSyntheticLambda0;
import com.caverock.androidsvg.SVG;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrl;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.fidesmo.views.ScanningShapePulseKt$$ExternalSyntheticLambda2;
import com.squareup.cash.nearby.views.PulsingState$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.CashInsets;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.MatcherMatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class NavDestination {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final SparseArrayCompat actions;
    public final NavDestinationImpl impl;
    public CharSequence label;
    public final String navigatorName;
    public NavGraph parent;

    public abstract class Companion {
        public static final void SheetCrossfade(Object obj, float f, Modifier modifier, final Function1 function1, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
            int i2;
            Modifier modifier2;
            obj.getClass();
            function1.getClass();
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(952235854);
            if ((i & 6) == 0) {
                i2 = ((i & 8) == 0 ? gapComposer.changed(obj) : gapComposer.changedInstance(obj) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= gapComposer.changed(f) ? 32 : 16;
            }
            int i3 = i2 | MLKEMEngine.KyberPolyBytes;
            if ((i & 3072) == 0) {
                i3 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
                float f2 = RecyclerView.DECELERATION_RATE;
                final float f3 = f < 0.5f ? 1.0f - (f * 2.0f) : 0.0f;
                if (f >= 0.5f) {
                    f2 = (f - 0.5f) * 2.0f;
                }
                final float f4 = f2;
                Transition updateTransition = AnimatableKt.updateTransition(obj, "sheet-crossfade", gapComposer, (i3 & 8) | 48 | (i3 & 14), 0);
                TweenSpec tween$default = AnimatableKt.tween$default(16, 0, null, 6);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new TaxWebAppBridge$$ExternalSyntheticLambda1(25);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                final int i4 = i3;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                CrossfadeKt.Crossfade(updateTransition, companion, tween$default, (Function1) rememberedValue, Expect_jvmKt.rememberComposableLambda(1293039266, new Function3() { // from class: com.squareup.cash.transfers.views.shared.SheetCrossfadeKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        Composer composer2 = (Composer) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        obj2.getClass();
                        if ((intValue & 6) == 0) {
                            intValue |= (intValue & 8) == 0 ? ((GapComposer) composer2).changed(obj2) : ((GapComposer) composer2).changedInstance(obj2) ? 4 : 2;
                        }
                        GapComposer gapComposer2 = (GapComposer) composer2;
                        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                            composableLambdaImpl.invoke(obj2, Float.valueOf(((Boolean) Function1.this.invoke(obj2)).booleanValue() ? f3 : f4), gapComposer2, Integer.valueOf((intValue & 14) | (i4 & 8)));
                        } else {
                            gapComposer2.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, ((i4 >> 3) & 112) | 28032, 0);
                modifier2 = companion;
            } else {
                gapComposer.skipToGroupEnd();
                modifier2 = modifier;
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new ScanningShapePulseKt$$ExternalSyntheticLambda2(obj, f, modifier2, function1, composableLambdaImpl, i);
            }
        }

        public static List getDeepLinkSpecs() {
            return ClientRoute.ViewBalanceHome.deepLinkSpecs;
        }

        public static String getDisplayName(ActionBarPolicy actionBarPolicy, int i) {
            actionBarPolicy.getClass();
            if (i <= 16777215) {
                return String.valueOf(i);
            }
            try {
                Context context = actionBarPolicy.mContext;
                context.getClass();
                String resourceName = context.getResources().getResourceName(i);
                resourceName.getClass();
                return resourceName;
            } catch (Resources.NotFoundException unused) {
                return String.valueOf(i);
            }
        }

        public static Sequence getHierarchy(NavDestination navDestination) {
            navDestination.getClass();
            return SequencesKt__SequencesKt.generateSequence(new Navigation$$ExternalSyntheticLambda1(18), navDestination);
        }

        public static final Modifier sheetAlpha(Modifier modifier, float f) {
            modifier.getClass();
            return ColorKt.graphicsLayer(modifier, new PulsingState$$ExternalSyntheticLambda0(f, 17));
        }
    }

    public final class DeepLinkMatch implements Comparable {
        public final NavDestination destination;
        public final boolean hasMatchingAction;
        public final boolean isExactDeepLink;
        public final Bundle matchingArgs;
        public final int matchingPathSegments;
        public final int mimeTypeMatchLevel;

        public DeepLinkMatch(NavDestination navDestination, Bundle bundle, boolean z, int i, boolean z2, int i2) {
            this.destination = navDestination;
            this.matchingArgs = bundle;
            this.isExactDeepLink = z;
            this.matchingPathSegments = i;
            this.hasMatchingAction = z2;
            this.mimeTypeMatchLevel = i2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(DeepLinkMatch deepLinkMatch) {
            deepLinkMatch.getClass();
            boolean z = this.isExactDeepLink;
            if (z && !deepLinkMatch.isExactDeepLink) {
                return 1;
            }
            if (!z && deepLinkMatch.isExactDeepLink) {
                return -1;
            }
            int i = deepLinkMatch.matchingPathSegments;
            boolean z2 = deepLinkMatch.hasMatchingAction;
            Bundle bundle = deepLinkMatch.matchingArgs;
            int i2 = this.matchingPathSegments - i;
            if (i2 > 0) {
                return 1;
            }
            if (i2 < 0) {
                return -1;
            }
            Bundle bundle2 = this.matchingArgs;
            if (bundle2 != null && bundle == null) {
                return 1;
            }
            if (bundle2 == null && bundle != null) {
                return -1;
            }
            if (bundle2 != null) {
                bundle2.getClass();
                int size = bundle2.size();
                bundle.getClass();
                int size2 = size - bundle.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z3 = this.hasMatchingAction;
            if (z3 && !z2) {
                return 1;
            }
            if (z3 || !z2) {
                return this.mimeTypeMatchLevel - deepLinkMatch.mimeTypeMatchLevel;
            }
            return -1;
        }
    }

    static {
        new LinkedHashMap();
    }

    public NavDestination(Navigator navigator) {
        navigator.getClass();
        LinkedHashMap linkedHashMap = NavigatorProvider.annotationNames;
        this.navigatorName = CashInsets.Companion.getNameForNavigator$navigation_common_release(navigator.getClass());
        this.impl = new NavDestinationImpl(this);
        this.actions = new SparseArrayCompat((Object) null);
    }

    public final void addArgument(String str, NavArgument navArgument) {
        str.getClass();
        navArgument.getClass();
        NavDestinationImpl navDestinationImpl = this.impl;
        navDestinationImpl.getClass();
        navDestinationImpl.arguments.put(str, navArgument);
    }

    public final void addDeepLink(NavDeepLink navDeepLink) {
        navDeepLink.getClass();
        NavDestinationImpl navDestinationImpl = this.impl;
        navDestinationImpl.getClass();
        ArrayList missingRequiredArguments = NavArgumentKt.missingRequiredArguments(navDestinationImpl.arguments, new NavDestinationImpl$$ExternalSyntheticLambda0(navDeepLink, 0));
        if (missingRequiredArguments.isEmpty()) {
            navDestinationImpl.deepLinks.add(navDeepLink);
        } else {
            LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Deep link ", navDeepLink.uriPattern, " can't be used to open destination ", navDestinationImpl.destination, ".\nFollowing required arguments are missing: ", missingRequiredArguments);
        }
    }

    public final Bundle addInDefaultArgs(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = this.impl.arguments;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        EmptyMap.INSTANCE.getClass();
        Bundle bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            NavArgument navArgument = (NavArgument) entry.getValue();
            navArgument.getClass();
            str.getClass();
            if (navArgument.isDefaultValuePresent && (obj = navArgument.defaultValue) != null) {
                navArgument.f901type.put(bundleOf, str, obj);
            }
        }
        if (bundle != null) {
            bundleOf.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                NavArgument navArgument2 = (NavArgument) entry2.getValue();
                navArgument2.getClass();
                NavType navType = navArgument2.f901type;
                str2.getClass();
                if (navArgument2.isNullable || !bundleOf.containsKey(str2) || !BundleKt.m1098isNullimpl(bundleOf, str2)) {
                    try {
                        navType.get(bundleOf, str2);
                    } catch (IllegalStateException unused) {
                    }
                }
                Drop$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Wrong argument type for '", str2, "' in argument savedState. "), navType.getName(), " expected.");
                return null;
            }
        }
        return bundleOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof NavDestination)) {
                NavDestinationImpl navDestinationImpl = this.impl;
                ArrayList arrayList = navDestinationImpl.deepLinks;
                NavDestination navDestination = (NavDestination) obj;
                SparseArrayCompat sparseArrayCompat = navDestination.actions;
                NavDestinationImpl navDestinationImpl2 = navDestination.impl;
                boolean areEqual = Intrinsics.areEqual(arrayList, navDestinationImpl2.deepLinks);
                final SparseArrayCompat sparseArrayCompat2 = this.actions;
                if (sparseArrayCompat2.size() == sparseArrayCompat.size()) {
                    Iterator it = SequencesKt__SequencesKt.asSequence(new IntIterator() { // from class: androidx.collection.SparseArrayKt$keyIterator$1
                        public int index;

                        @Override // java.util.Iterator
                        public final boolean hasNext() {
                            return this.index < SparseArrayCompat.this.size();
                        }

                        @Override // kotlin.collections.IntIterator
                        public final int nextInt() {
                            int i = this.index;
                            this.index = i + 1;
                            return SparseArrayCompat.this.keyAt(i);
                        }
                    }).iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (!Intrinsics.areEqual(SieveCacheKt.commonGet(sparseArrayCompat2, intValue), SieveCacheKt.commonGet(sparseArrayCompat, intValue))) {
                        }
                    }
                    z = true;
                    if (getArguments().size() == navDestination.getArguments().size()) {
                        for (Map.Entry entry : (Iterable) CollectionsKt.asSequence(getArguments().entrySet()).$this_lineSequence$inlined) {
                            if (navDestination.getArguments().containsKey(entry.getKey()) && Intrinsics.areEqual(navDestination.getArguments().get(entry.getKey()), entry.getValue())) {
                            }
                        }
                        z2 = true;
                        if (navDestinationImpl.id == navDestinationImpl2.id || !Intrinsics.areEqual(navDestinationImpl.route, navDestinationImpl2.route) || !areEqual || !z || !z2) {
                        }
                    }
                    z2 = false;
                    if (navDestinationImpl.id == navDestinationImpl2.id) {
                    }
                }
                z = false;
                if (getArguments().size() == navDestination.getArguments().size()) {
                }
                z2 = false;
                if (navDestinationImpl.id == navDestinationImpl2.id) {
                }
            }
            return false;
        }
        return true;
    }

    public final NavAction getAction(int i) {
        SparseArrayCompat sparseArrayCompat = this.actions;
        NavAction navAction = sparseArrayCompat.size() == 0 ? null : (NavAction) SieveCacheKt.commonGet(sparseArrayCompat, i);
        if (navAction != null) {
            return navAction;
        }
        NavGraph navGraph = this.parent;
        if (navGraph != null) {
            return navGraph.getAction(i);
        }
        return null;
    }

    public final Map getArguments() {
        return MapsKt__MapsKt.toMap(this.impl.arguments);
    }

    public int hashCode() {
        NavDestinationImpl navDestinationImpl = this.impl;
        int i = navDestinationImpl.id * 31;
        String str = navDestinationImpl.route;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        Iterator it = navDestinationImpl.deepLinks.iterator();
        while (it.hasNext()) {
            NavDeepLink navDeepLink = (NavDeepLink) it.next();
            int i2 = hashCode * 31;
            String str2 = navDeepLink.uriPattern;
            int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = navDeepLink.action;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = navDeepLink.mimeType;
            hashCode = hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        SparseArrayCompat sparseArrayCompat = this.actions;
        sparseArrayCompat.getClass();
        int i3 = 0;
        while (true) {
            if (!(i3 < sparseArrayCompat.size())) {
                break;
            }
            int i4 = i3 + 1;
            NavAction navAction = (NavAction) sparseArrayCompat.valueAt(i3);
            int i5 = ((hashCode * 31) + navAction.destinationId) * 31;
            NavOptions navOptions = navAction.navOptions;
            hashCode = i5 + (navOptions != null ? navOptions.hashCode() : 0);
            Bundle bundle = navAction.defaultArguments;
            if (bundle != null) {
                hashCode = zzrl.contentDeepHashCode$SavedStateReaderKt__SavedStateReader_androidKt(bundle) + (hashCode * 31);
            }
            i3 = i4;
        }
        for (String str5 : getArguments().keySet()) {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(hashCode * 31, 31, str5);
            Object obj = getArguments().get(str5);
            hashCode = m + (obj != null ? obj.hashCode() : 0);
        }
        return hashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeepLinkMatch matchDeepLink(SVG svg) {
        boolean z;
        boolean matches;
        boolean matches2;
        int i;
        DeepLinkMatch deepLinkMatch;
        Regex regex;
        MatcherMatchResult matchEntire;
        List list;
        int i2;
        List list2;
        NavDestinationImpl navDestinationImpl = this.impl;
        LinkedHashMap linkedHashMap = navDestinationImpl.arguments;
        Uri uri = (Uri) svg.rootElement;
        ArrayList arrayList = navDestinationImpl.deepLinks;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        DeepLinkMatch deepLinkMatch2 = null;
        while (it.hasNext()) {
            NavDeepLink navDeepLink = (NavDeepLink) it.next();
            String str = (String) svg.idToElementMap;
            String str2 = (String) svg.cssRules;
            navDeepLink.getClass();
            Lazy lazy = navDeepLink.mimeTypePattern$delegate;
            Lazy lazy2 = navDeepLink.pathPattern$delegate;
            String str3 = navDeepLink.mimeType;
            String str4 = navDeepLink.action;
            if (((Regex) lazy2.getValue()) == null) {
                matches = true;
            } else if (uri == null) {
                matches = false;
            } else {
                Regex regex2 = (Regex) lazy2.getValue();
                regex2.getClass();
                z = true;
                matches = regex2.matches(uri.toString());
                if (matches) {
                    if (str4 == null ? z : str2 == null ? false : str4.equals(str2)) {
                        if (str3 == null) {
                            matches2 = z;
                        } else if (str == null) {
                            matches2 = false;
                        } else {
                            Regex regex3 = (Regex) lazy.getValue();
                            regex3.getClass();
                            matches2 = regex3.matches(str);
                        }
                        if (matches2) {
                            Bundle matchingArguments = uri != null ? navDeepLink.getMatchingArguments(uri, linkedHashMap) : null;
                            int calculateMatchingPathSegments$navigation_common_release = navDeepLink.calculateMatchingPathSegments$navigation_common_release(uri);
                            boolean z2 = (str2 == null || !str2.equals(str4)) ? false : z;
                            if (str != null && str3 != null) {
                                Regex regex4 = (Regex) lazy.getValue();
                                regex4.getClass();
                                if (regex4.matches(str)) {
                                    List split = new Regex("/").split(0, str3);
                                    if (!split.isEmpty()) {
                                        ListIterator listIterator = split.listIterator(split.size());
                                        while (listIterator.hasPrevious()) {
                                            if (((String) listIterator.previous()).length() != 0) {
                                                list = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                                                break;
                                            }
                                        }
                                    }
                                    list = EmptyList.INSTANCE;
                                    String str5 = (String) list.get(0);
                                    String str6 = (String) list.get(z ? 1 : 0);
                                    List split2 = new Regex("/").split(0, str);
                                    if (!split2.isEmpty()) {
                                        ListIterator listIterator2 = split2.listIterator(split2.size());
                                        while (listIterator2.hasPrevious()) {
                                            if (((String) listIterator2.previous()).length() != 0) {
                                                i2 = 1;
                                                list2 = CollectionsKt.take(split2, listIterator2.nextIndex() + 1);
                                                break;
                                            }
                                        }
                                    }
                                    i2 = 1;
                                    list2 = EmptyList.INSTANCE;
                                    String str7 = (String) list2.get(0);
                                    String str8 = (String) list2.get(i2);
                                    i = Intrinsics.areEqual(str5, str7) ? 2 : 0;
                                    if (Intrinsics.areEqual(str6, str8)) {
                                        i++;
                                    }
                                    if (matchingArguments == null) {
                                        if (z2 || i > -1) {
                                            linkedHashMap.getClass();
                                            EmptyMap.INSTANCE.getClass();
                                            Bundle bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
                                            if (uri != null && (regex = (Regex) lazy2.getValue()) != null && (matchEntire = regex.matchEntire(uri.toString())) != null) {
                                                navDeepLink.getMatchingPathArguments(matchEntire, bundleOf, linkedHashMap);
                                                if (((Boolean) navDeepLink.isParameterizedQuery$delegate.getValue()).booleanValue()) {
                                                    navDeepLink.getMatchingQueryArguments(uri, bundleOf, linkedHashMap);
                                                }
                                            }
                                            if (!NavArgumentKt.missingRequiredArguments(linkedHashMap, new NavDeepLink$$ExternalSyntheticLambda8(bundleOf, 1)).isEmpty()) {
                                            }
                                        }
                                    }
                                    deepLinkMatch = new DeepLinkMatch(navDestinationImpl.destination, matchingArguments, navDeepLink.isExactDeepLink, calculateMatchingPathSegments$navigation_common_release, z2, i);
                                    if (deepLinkMatch2 != null || deepLinkMatch.compareTo(deepLinkMatch2) > 0) {
                                        deepLinkMatch2 = deepLinkMatch;
                                    }
                                }
                            }
                            i = -1;
                            if (matchingArguments == null) {
                            }
                            deepLinkMatch = new DeepLinkMatch(navDestinationImpl.destination, matchingArguments, navDeepLink.isExactDeepLink, calculateMatchingPathSegments$navigation_common_release, z2, i);
                            if (deepLinkMatch2 != null) {
                            }
                            deepLinkMatch2 = deepLinkMatch;
                        }
                    }
                }
            }
            z = true;
            if (matches) {
            }
        }
        return deepLinkMatch2;
    }

    public void onInflate(Context context, AttributeSet attributeSet) {
        String valueOf;
        context.getClass();
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, androidx.navigation.common.R$styleable.Navigator);
        obtainAttributes.getClass();
        setRoute(obtainAttributes.getString(2));
        if (obtainAttributes.hasValue(1)) {
            int resourceId = obtainAttributes.getResourceId(1, 0);
            NavDestinationImpl navDestinationImpl = this.impl;
            navDestinationImpl.id = resourceId;
            navDestinationImpl.idName = null;
            int i = navDestinationImpl.id;
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
            navDestinationImpl.idName = valueOf;
        }
        this.label = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    public final void putAction(int i, NavAction navAction) {
        navAction.getClass();
        if (!(this instanceof ActivityNavigator.Destination)) {
            if (i != 0) {
                this.actions.put(i, navAction);
                return;
            } else {
                a$$ExternalSyntheticBUOutline0.m$3("Cannot have an action with actionId 0");
                return;
            }
        }
        throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public final void setRoute(String str) {
        NavDestinationImpl navDestinationImpl = this.impl;
        if (str == null) {
            navDestinationImpl.id = 0;
            navDestinationImpl.idName = null;
        } else {
            navDestinationImpl.getClass();
            if (StringsKt.isBlank(str)) {
                a$$ExternalSyntheticBUOutline0.m$3("Cannot have an empty route");
                return;
            }
            String concat = "android-app://androidx.navigation/".concat(str);
            int i = 1;
            ArrayList missingRequiredArguments = NavArgumentKt.missingRequiredArguments(navDestinationImpl.arguments, new NavDestinationImpl$$ExternalSyntheticLambda0(new NavDeepLink(concat, null, null), i));
            if (!missingRequiredArguments.isEmpty()) {
                StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Cannot set route \"", str, "\" for destination ");
                m3m.append(navDestinationImpl.destination);
                m3m.append(". Following required arguments are missing: ");
                m3m.append(missingRequiredArguments);
                throw new IllegalArgumentException(m3m.toString().toString());
            }
            navDestinationImpl.routeDeepLink = LazyKt.lazy(new b9$$ExternalSyntheticLambda0(concat, i));
            navDestinationImpl.id = concat.hashCode();
            navDestinationImpl.idName = null;
        }
        navDestinationImpl.route = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        NavDestinationImpl navDestinationImpl = this.impl;
        String str = navDestinationImpl.idName;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(navDestinationImpl.id));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = navDestinationImpl.route;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            sb.append(" route=");
            sb.append(navDestinationImpl.route);
        }
        if (this.label != null) {
            sb.append(" label=");
            sb.append(this.label);
        }
        return sb.toString();
    }
}
