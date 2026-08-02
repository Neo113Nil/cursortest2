package androidx.activity;

import android.graphics.PointF;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.widget.RedwoodLayoutKt$toAndroid$1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackKt$spacedBetween$1;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewEvent;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewModel;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda18;
import com.squareup.cash.invitations.InviteErrorDialogKt$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.views.chat.MoneybotLoadedContentKt$$ExternalSyntheticLambda40;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import type.JsonLogicList;
import utils.AnyUtilsKt;

/* loaded from: classes3.dex */
public abstract class OnBackPressedDispatcherKt implements CallbackToFutureAdapter$Resolver {
    public static final void Carousel(InvestingCryptoNewsViewModel investingCryptoNewsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1046915591);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changed(investingCryptoNewsViewModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer);
            int i5 = i3 & 112;
            callbackOnScroll(rememberLazyListState, function1, gapComposer, i5);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(16.0f, RecyclerView.DECELERATION_RATE, 2);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            AdaptiveStackKt$spacedBetween$1 adaptiveStackKt$spacedBetween$1 = new AdaptiveStackKt$spacedBetween$1(16.0f);
            boolean z = ((i3 & 14) == 4) | (i5 == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InvestingNewsKt$$ExternalSyntheticLambda1(investingCryptoNewsViewModel, function1, i4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.LazyRow(fillMaxWidth, rememberLazyListState, m295PaddingValuesYgX7TsA$default, adaptiveStackKt$spacedBetween$1, null, null, false, null, (Function1) rememberedValue, gapComposer, 0, 488);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18(modifier2, (Object) investingCryptoNewsViewModel, function1, i, 19);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestingCryptoNewsCarousel(final InvestingCryptoNewsViewModel investingCryptoNewsViewModel, final Function1 function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        InvestingCryptoNewsViewModel investingCryptoNewsViewModel2;
        Function1 function12;
        final Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        Modifier wrapContentHeight;
        String str;
        investingCryptoNewsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(190774900);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(investingCryptoNewsViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) == 146)) {
                investingCryptoNewsViewModel2 = investingCryptoNewsViewModel;
                function12 = function1;
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                final Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                if (investingCryptoNewsViewModel.articles.isEmpty()) {
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                        final int i6 = 0;
                        function2 = new Function2() { // from class: com.squareup.cash.investingcrypto.components.news.compose.InvestingCryptoNewsCarouselKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i6) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        OnBackPressedDispatcherKt.InvestingCryptoNewsCarousel(investingCryptoNewsViewModel, function1, modifier4, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        OnBackPressedDispatcherKt.InvestingCryptoNewsCarousel(investingCryptoNewsViewModel, function1, modifier4, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        endRestartGroup.block = function2;
                        return;
                    }
                    return;
                }
                investingCryptoNewsViewModel2 = investingCryptoNewsViewModel;
                function12 = function1;
                Modifier modifier5 = modifier4;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier5, 1.0f);
                int i7 = i4 & 112;
                boolean z = i7 == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (z || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new InviteErrorDialogKt$$ExternalSyntheticLambda0(19, function12);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                wrapContentHeight = SizeKt.wrapContentHeight(VisibleKt.onVisible$default(fillMaxWidth, (Function0) rememberedValue), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, wrapContentHeight);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (gapComposer.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                boolean z2 = investingCryptoNewsViewModel2.viewAll != null;
                String stringResource = Room.stringResource(gapComposer, R.string.investing_news_title);
                if (z2) {
                    str = re$$ExternalSyntheticOutline0.m(gapComposer, -1211855705, R.string.show_more, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1211790326);
                    gapComposer.end(false);
                    str = null;
                }
                boolean z3 = i7 == 32;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z3 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new InviteErrorDialogKt$$ExternalSyntheticLambda0(20, function12);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                ViewfinderDefaults.SectionHeader(stringResource, (Modifier) null, str, (Function0) rememberedValue2, (String) null, gapComposer, 0, 18);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                Carousel(investingCryptoNewsViewModel2, function12, null, gapComposer, i4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.end(true);
                modifier3 = modifier5;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                final int i8 = 1;
                final InvestingCryptoNewsViewModel investingCryptoNewsViewModel3 = investingCryptoNewsViewModel2;
                final Function1 function13 = function12;
                function2 = new Function2() { // from class: com.squareup.cash.investingcrypto.components.news.compose.InvestingCryptoNewsCarouselKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i8) {
                            case 0:
                                ((Integer) obj2).getClass();
                                OnBackPressedDispatcherKt.InvestingCryptoNewsCarousel(investingCryptoNewsViewModel3, function13, modifier3, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                OnBackPressedDispatcherKt.InvestingCryptoNewsCarousel(investingCryptoNewsViewModel3, function13, modifier3, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                endRestartGroup.block = function2;
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) == 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static void addCallback$default(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, Function1 function1, int i) {
        int i2 = 1;
        if ((i & 1) != 0) {
            lifecycleOwner = null;
        }
        onBackPressedDispatcher.getClass();
        RedwoodLayoutKt$toAndroid$1 redwoodLayoutKt$toAndroid$1 = new RedwoodLayoutKt$toAndroid$1(function1, i2);
        if (lifecycleOwner != null) {
            onBackPressedDispatcher.addCallback(redwoodLayoutKt$toAndroid$1, lifecycleOwner);
        } else {
            onBackPressedDispatcher.addCallback(redwoodLayoutKt$toAndroid$1);
        }
    }

    public static final void callbackOnScroll(LazyListState lazyListState, Function1 function1, Composer composer, int i) {
        int i2;
        lazyListState.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(827015283);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(lazyListState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 1;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (lazyListState.scrollableState.isScrollInProgress()) {
            function1.invoke(InvestingCryptoNewsViewEvent.ListScrolled.INSTANCE);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneybotLoadedContentKt$$ExternalSyntheticLambda40(lazyListState, function1, i, i3);
        }
    }

    public static final float distance(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(-pointF2.x, -pointF2.y);
        float f = pointF3.x;
        float f2 = pointF3.y;
        return (float) Math.sqrt((f2 * f2) + (f * f));
    }

    public static List flattenNestedLists(Object obj) {
        List list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            return CollectionsKt__CollectionsJVMKt.listOf(formatAsString(obj));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(flattenNestedLists(it.next()), arrayList);
        }
        return arrayList;
    }

    public static String formatAsString(Object obj) {
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number.doubleValue() == number.intValue()) {
                return String.valueOf(number.intValue());
            }
        }
        String obj2 = obj != null ? obj.toString() : null;
        return obj2 == null ? "" : obj2;
    }

    public static ArrayList unwrapValueAsString(Object obj) {
        String formatAsString;
        JsonLogicList asList = AnyUtilsKt.getAsList(obj);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(asList, 10));
        for (Object obj2 : asList.items) {
            List list = obj2 instanceof List ? (List) obj2 : null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll(flattenNestedLists(it.next()), arrayList2);
                }
                formatAsString = CollectionsKt.joinToString$default(arrayList2, ",", null, null, 0, null, null, 62);
            } else {
                formatAsString = formatAsString(obj2);
            }
            arrayList.add(formatAsString);
        }
        return arrayList;
    }
}
