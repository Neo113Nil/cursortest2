package com.squareup.cash.agents.applets.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.views.ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.memory.RealWeakMemoryCache;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabw;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda9;
import com.squareup.cash.activity.views.SectionHeaderScope$$ExternalSyntheticLambda1;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda16;
import com.squareup.cash.agents.applets.viewmodels.AgentCardViewModel;
import com.squareup.cash.agents.applets.viewmodels.AgentsHomeViewModel;
import com.squareup.cash.amountchooser.views.AtmPickerGridKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.theme.MoneybotTheme;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.work.views.pay.PayHomeViewKt$$ExternalSyntheticLambda18;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.Tags;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class AgentsHomeViewKt {

    /* renamed from: lambda$-811725408, reason: not valid java name */
    public static final ComposableLambdaImpl f139lambda$811725408 = new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(24), false, -811725408);
    public static final ComposableLambdaImpl lambda$575935469 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(7), false, 575935469);

    public static final void AgentCard(AgentCardViewModel agentCardViewModel, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-73864158);
        int i2 = (gapComposer.changedInstance(agentCardViewModel) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            modifier2 = modifier;
            MoneybotTheme.m3623Cardjb40ds(modifier2, false, 0L, RecyclerView.DECELERATION_RATE, null, null, Expect_jvmKt.rememberComposableLambda(1663816104, new BalanceFeedKt$$ExternalSyntheticLambda9(agentCardViewModel, 26), gapComposer), gapComposer, ((i2 >> 3) & 14) | 1572864, 62);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AtmPickerGridKt$$ExternalSyntheticLambda4(agentCardViewModel, modifier2, i, 28);
        }
    }

    /* renamed from: AgentsAppletIcon-lip--vc, reason: not valid java name */
    public static final void m2976AgentsAppletIconlipvc(final float f, final boolean z, Modifier modifier, float f2, Composer composer, final int i, final int i2) {
        int i3;
        float f3;
        final Modifier modifier2;
        Modifier modifier3;
        int i4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-689147792);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                f3 = f2;
                if (gapComposer.changed(f3)) {
                    i4 = 2048;
                    i5 |= i4;
                }
            } else {
                f3 = f2;
            }
            i4 = 1024;
            i5 |= i4;
        } else {
            f3 = f2;
        }
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 1171) != 1170)) {
            gapComposer.startDefaults();
            int i6 = i & 1;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (i6 == 0 || gapComposer.getDefaultsInvalid()) {
                if ((i2 & 8) != 0) {
                    f3 = f;
                }
                modifier3 = companion;
            } else {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier;
            }
            gapComposer.endDefaults();
            ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1 = ContentScale.Companion.Fit;
            if (z) {
                gapComposer.startReplaceGroup(-458035483);
                BiasAlignment biasAlignment = Alignment.Companion.Center;
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(modifier3, f);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, colors.surface.money.applet.asset.background, RoundedCornerShapeKt.CircleShape);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                ImageKt.Image(Countries.painterResource(R.drawable.agents_installed_applet_agent, 0, gapComposer), null, SizeKt.m285size3ABfNKs(companion, f3), null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 24624, 104);
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-457606877);
                ImageKt.Image(Countries.painterResource(R.drawable.agents_installed_applet_agent, 0, gapComposer), null, SizeKt.m285size3ABfNKs(modifier3, f), null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 24624, 104);
                gapComposer.end(false);
            }
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        final float f4 = f3;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.agents.applets.views.AgentsAppletIconKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AgentsHomeViewKt.m2976AgentsAppletIconlipvc(f, z, modifier2, f4, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void AgentsHome(AgentsHomeViewModel agentsHomeViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(386928862);
        int i2 = (gapComposer.changedInstance(agentsHomeViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer);
            Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.systemBarsPadding(Modifier.Companion.$$INSTANCE), 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            PaddingValuesImpl m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1313959916, new BrandSheetViewKt$$ExternalSyntheticLambda6(17, function1), gapComposer);
            boolean changedInstance = gapComposer.changedInstance(agentsHomeViewModel) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CombinedModifier$$ExternalSyntheticLambda0(29, agentsHomeViewModel, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ScreenScaffoldKt.ScreenScaffoldLazy(m177backgroundbw27NRU, rememberLazyListState, m297PaddingValuesa9UjIt4$default, rememberComposableLambda, null, (Function1) rememberedValue, gapComposer, 3072, 16);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AgentsHomeViewKt$$ExternalSyntheticLambda0(agentsHomeViewModel, function1, i);
        }
    }

    public static final void AgentsHomeHeader(int i, Composer composer, Modifier modifier, String str, String str2, Function0 function0) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(656514250);
        int i2 = i | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changed(str2) ? 32 : 16) | (gapComposer2.changedInstance(function0) ? 256 : 128) | (gapComposer2.changed(modifier) ? 2048 : 1024);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer2).getClass();
            Strings.getSizes(gapComposer2).getClass();
            Strings.getSizes(gapComposer2).getClass();
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(fillMaxWidth, 16.0f, 32.0f, 16.0f, 64.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m301paddingqDBjuR0);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4080, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, modifier.then(Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier, 1.0f, true)), Strings.getTypography(gapComposer2).pageTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Strings.getSizes(gapComposer2).getClass();
            SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, 8.0f));
            coil3.size.SizeKt.ButtonCompact(function0, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(80356334, new LocalHomeViewKt$$ExternalSyntheticLambda1(str2, 15), gapComposer2), gapComposer2, ((i2 >> 6) & 14) | 1572864, 62);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AgentsHomeViewKt$$ExternalSyntheticLambda16(str, function0, modifier, str2, i, 0);
        }
    }

    public static final void AgentsHomeView(AgentsHomeViewModel agentsHomeViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(625866425);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(agentsHomeViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1779737212, new AgentsHomeViewKt$$ExternalSyntheticLambda0(agentsHomeViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SectionHeaderScope$$ExternalSyntheticLambda1(agentsHomeViewModel, function1, i, 17);
        }
    }

    public static final void AvatarStackVisual(List list, AvatarSize avatarSize, int i, Composer composer, int i2) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-70143091);
        int i3 = i2 | (gapComposer2.changedInstance(list) ? 4 : 2) | (gapComposer2.changed(avatarSize.ordinal()) ? 32 : 16) | (gapComposer2.changed(i) ? 256 : 128);
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            RealWeakMemoryCache realWeakMemoryCache = new RealWeakMemoryCache(1);
            gapComposer2.startReplaceGroup(1375265694);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned((-avatarSize.size) / 3.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer2.startReplaceGroup(-1875520994);
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                GapComposer gapComposer3 = gapComposer2;
                arrayList.add(AvatarsKt.toAvatarEntry((StackedAvatarViewModel.Avatar) it.next(), null, null, gapComposer3, 8, 3));
                gapComposer2 = gapComposer3;
            }
            gapComposer2.end(false);
            zzabw.HorizontalStackedAvatars(avatarSize, Tags.toImmutableList(arrayList), null, gapComposer2, 0, 4);
            gapComposer = gapComposer2;
            if (i > 0) {
                gapComposer.startReplaceGroup(1988501940);
                OverflowBadge(i, avatarSize, realWeakMemoryCache.m1459clippedOutlinewH6b6FI(companion, RoundedCornerShapeKt.CircleShape, 3.0f), gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1988686700);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            gapComposer.end(false);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AgentsAppletTileKt$$ExternalSyntheticLambda0(list, avatarSize, i, i2, 0);
        }
    }

    public static final void EmptyOrFailureContent(String str, String str2, Composer composer, int i) {
        String str3;
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(225869472);
        int i3 = i | (gapComposer.changed(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(str2) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(fillMaxWidth, 32.0f);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalTypography;
            Room.m1165Text25TpFw(0, 0, 0, 0, i3 & 14, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal2)).sectionTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            if (str2 == null) {
                gapComposer.startReplaceGroup(130073301);
                gapComposer.end(false);
                str3 = str2;
            } else {
                gapComposer.startReplaceGroup(130073302);
                str3 = str2;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal2)).bodyMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            i2 = 1;
            gapComposer.end(true);
        } else {
            str3 = str2;
            i2 = 1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PayHomeViewKt$$ExternalSyntheticLambda18(str, i, i2, str3);
        }
    }

    public static final void OverflowBadge(int i, AvatarSize avatarSize, Modifier modifier, Composer composer, int i2) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2011717766);
        int i3 = i2 | (gapComposer.changed(i) ? 4 : 2) | (gapComposer.changed(avatarSize.ordinal()) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(modifier, avatarSize.size);
            long j = Strings.getColors(gapComposer).surface.money.applet.data.inactive.border;
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ImageKt.m178borderxT4_qwU(m285size3ABfNKs, 1.0f, j, roundedCornerShape), Strings.getColors(gapComposer).surface.money.applet.background, roundedCornerShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, Room.stringResource(R.string.agents_applet_overflow_count, new Object[]{Integer.valueOf(i)}, gapComposer), (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AgentsAppletTileKt$$ExternalSyntheticLambda1(i, avatarSize, modifier, i2, 0);
        }
    }
}
