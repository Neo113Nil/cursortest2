package androidx.compose.foundation.pager;

import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.internal.Lock;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.ArcSplineKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition$Start;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.internal.LocalCombinedViewsKt$$ExternalSyntheticLambda3;
import app.cash.molecule.PlatformKt;
import bo.app.n3$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import coil3.network.NetworkFetcher$fetch$2;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda5;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda6;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.components.haptic.HapticVibratorKt;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.arcade.components.text.InlineIconPosition;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.avatar.components.AvatarKt;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewEvent;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.investing.components.MyInvestmentsTileKt$$ExternalSyntheticLambda6;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.moneybot.views.card.InsightChartKt$$ExternalSyntheticLambda19;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import com.squareup.util.Strings;
import com.squareup.util.compose.SharedViewEventsKt;
import com.stripe.android.model.parsers.WalletJsonParser;
import com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$5;
import java.io.Serializable;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class PagerKt {
    /* JADX WARN: Type inference failed for: r15v12, types: [com.squareup.cash.arcade.Colors$Component$Button$Prominent, com.squareup.cash.arcade.Colors$Surface] */
    public static final void BalanceAppletTileUI(BalanceAppletTileViewModel balanceAppletTileViewModel, AppletTile.AppletTileAppearance appletTileAppearance, final NetworkFetcher$fetch$2 networkFetcher$fetch$2, ElementBoundsRegistry elementBoundsRegistry, Composer composer, int i) {
        int i2;
        Throwable th;
        Modifier.Companion companion;
        Modifier modifier;
        Modifier pointerInput;
        int i3;
        boolean z;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(623789768);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(balanceAppletTileViewModel) : gapComposer.changedInstance(balanceAppletTileViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(appletTileAppearance) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(networkFetcher$fetch$2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(elementBoundsRegistry) ? 2048 : 1024;
        }
        int i4 = i2;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            Unit unit = Unit.INSTANCE;
            int i5 = i4 & 896;
            boolean z2 = i5 == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Continuation continuation = null;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MLKitTitleGenerator$1(networkFetcher$fetch$2, continuation, 13);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m276defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth(companion2, 1.0f), RecyclerView.DECELERATION_RATE, 260.0f, 1), Strings.getColors(gapComposer).surface.money.background, ColorKt.RectangleShape);
            if (ImageKt.isSystemInDarkTheme(gapComposer)) {
                th = null;
                companion = companion2;
                modifier = companion;
            } else {
                companion = companion2;
                th = null;
                modifier = ImageKt.background$default(companion, Lock.m132linearGradientmHitzGk(new Pair[]{new Pair(Float.valueOf(0.13f), new Color(Color.White)), new Pair(Float.valueOf(1.0f), new Color(Color.Transparent))}, 0L, (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32)), null, 6);
            }
            Modifier then = m177backgroundbw27NRU.then(modifier);
            if ((balanceAppletTileViewModel instanceof BalanceAppletTileViewModel.Loaded.Default) && ((BalanceAppletTileViewModel.Loaded.Default) balanceAppletTileViewModel).isManagedAccount) {
                gapComposer.startReplaceGroup(-1833426128);
                gapComposer.end(false);
                i3 = 0;
                pointerInput = companion;
            } else if (balanceAppletTileViewModel instanceof BalanceAppletTileViewModel.Loading) {
                gapComposer.startReplaceGroup(-1833418869);
                boolean z3 = i5 == 256;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z3 || rememberedValue2 == neverEqualPolicy) {
                    final int i6 = 0;
                    rememberedValue2 = new PointerInputEventHandler() { // from class: com.squareup.cash.banking.applets.views.BalanceAppletTileKt$BalanceAppletTileUI$2$1
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation2) {
                            int i7 = i6;
                            final NetworkFetcher$fetch$2 networkFetcher$fetch$22 = networkFetcher$fetch$2;
                            switch (i7) {
                                case 0:
                                    final int i8 = 0;
                                    Object detectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, new Function1() { // from class: com.squareup.cash.banking.applets.views.BalanceAppletTileKt$BalanceAppletTileUI$2$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            int i9 = i8;
                                            BalanceAppletTileViewEvent.BalanceAppletOnClickTile balanceAppletOnClickTile = BalanceAppletTileViewEvent.BalanceAppletOnClickTile.INSTANCE;
                                            NetworkFetcher$fetch$2 networkFetcher$fetch$23 = networkFetcher$fetch$22;
                                            switch (i9) {
                                                case 0:
                                                    networkFetcher$fetch$23.invoke(balanceAppletOnClickTile);
                                                    break;
                                                default:
                                                    networkFetcher$fetch$23.invoke(balanceAppletOnClickTile);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, continuation2, 7);
                                    if (detectTapGestures$default != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                                default:
                                    final int i9 = 1;
                                    Object detectTapGestures$default2 = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, new Function1() { // from class: com.squareup.cash.banking.applets.views.BalanceAppletTileKt$BalanceAppletTileUI$2$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            int i92 = i9;
                                            BalanceAppletTileViewEvent.BalanceAppletOnClickTile balanceAppletOnClickTile = BalanceAppletTileViewEvent.BalanceAppletOnClickTile.INSTANCE;
                                            NetworkFetcher$fetch$2 networkFetcher$fetch$23 = networkFetcher$fetch$22;
                                            switch (i92) {
                                                case 0:
                                                    networkFetcher$fetch$23.invoke(balanceAppletOnClickTile);
                                                    break;
                                                default:
                                                    networkFetcher$fetch$23.invoke(balanceAppletOnClickTile);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, continuation2, 7);
                                    if (detectTapGestures$default2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Modifier pointerInput2 = SuspendingPointerInputFilterKt.pointerInput(companion, unit, (PointerInputEventHandler) rememberedValue2);
                boolean z4 = ((i4 & 14) == 4 || ((i4 & 8) != 0 && gapComposer.changedInstance(balanceAppletTileViewModel))) | (i5 == 256);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z4 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new BadgeQueries$$ExternalSyntheticLambda0(15, balanceAppletTileViewModel, networkFetcher$fetch$2);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                i3 = 0;
                pointerInput = SemanticsModifierKt.semantics(pointerInput2, false, (Function1) rememberedValue3);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1833410439);
                boolean z5 = i5 == 256;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (z5 || rememberedValue4 == neverEqualPolicy) {
                    final int i7 = 1;
                    rememberedValue4 = new PointerInputEventHandler() { // from class: com.squareup.cash.banking.applets.views.BalanceAppletTileKt$BalanceAppletTileUI$2$1
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation2) {
                            int i72 = i7;
                            final NetworkFetcher$fetch$2 networkFetcher$fetch$22 = networkFetcher$fetch$2;
                            switch (i72) {
                                case 0:
                                    final int i8 = 0;
                                    Object detectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, new Function1() { // from class: com.squareup.cash.banking.applets.views.BalanceAppletTileKt$BalanceAppletTileUI$2$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            int i92 = i8;
                                            BalanceAppletTileViewEvent.BalanceAppletOnClickTile balanceAppletOnClickTile = BalanceAppletTileViewEvent.BalanceAppletOnClickTile.INSTANCE;
                                            NetworkFetcher$fetch$2 networkFetcher$fetch$23 = networkFetcher$fetch$22;
                                            switch (i92) {
                                                case 0:
                                                    networkFetcher$fetch$23.invoke(balanceAppletOnClickTile);
                                                    break;
                                                default:
                                                    networkFetcher$fetch$23.invoke(balanceAppletOnClickTile);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, continuation2, 7);
                                    if (detectTapGestures$default != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                                default:
                                    final int i9 = 1;
                                    Object detectTapGestures$default2 = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, new Function1() { // from class: com.squareup.cash.banking.applets.views.BalanceAppletTileKt$BalanceAppletTileUI$2$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            int i92 = i9;
                                            BalanceAppletTileViewEvent.BalanceAppletOnClickTile balanceAppletOnClickTile = BalanceAppletTileViewEvent.BalanceAppletOnClickTile.INSTANCE;
                                            NetworkFetcher$fetch$2 networkFetcher$fetch$23 = networkFetcher$fetch$22;
                                            switch (i92) {
                                                case 0:
                                                    networkFetcher$fetch$23.invoke(balanceAppletOnClickTile);
                                                    break;
                                                default:
                                                    networkFetcher$fetch$23.invoke(balanceAppletOnClickTile);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, continuation2, 7);
                                    if (detectTapGestures$default2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        break;
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, unit, (PointerInputEventHandler) rememberedValue4);
                i3 = 0;
                gapComposer.end(false);
            }
            Modifier then2 = then.then(pointerInput);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(then2, 16.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, i3);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Throwable th2 = th;
                Updater.invalidApplier();
                throw th2;
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
            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(false, gapComposer, 1);
            int i8 = i4 << 3;
            int i9 = i4 << 6;
            int i10 = 57344 & i9;
            ?? r15 = th;
            BalanceHeader(balanceAppletTileViewModel, appletTileAppearance, rememberShaker, networkFetcher$fetch$2, elementBoundsRegistry, gapComposer, (i9 & 458752) | (i8 & 896) | (i8 & 112) | 6 | i10);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 48.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 1.0f);
            Colors colors = Strings.getColors(gapComposer);
            gapComposer.startReplaceGroup(-966275391);
            Colors.Component component = colors.component;
            Colors.Component.Button button = component.button;
            gapComposer.startReplaceGroup(-966268698);
            Colors.Component.Button.Standard standard = colors.component.button.standard;
            Colors.Component.Button.Standard.Background background = standard.background;
            if (ImageKt.isSystemInDarkTheme(gapComposer)) {
                gapComposer.startReplaceGroup(-1946223302);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                z = false;
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.background.subtle;
                gapComposer.end(false);
            } else {
                z = false;
                gapComposer.startReplaceGroup(-1946115267);
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors3.semantic.background.f1047app;
                gapComposer.end(false);
            }
            Colors.Component.Button.Standard standard2 = new Colors.Component.Button.Standard(Colors.Component.Button.Standard.Background.m3117copyysEtTa8$default(background, j, 0L, 6), standard.icon, standard.text);
            gapComposer.end(z);
            Colors copy$default = Colors.copy$default(colors, Colors.Component.copy$default(component, null, Colors.Component.Button.copy$default(button, r15, standard2, 11), null, null, null, null, null, 134217719), r15, 55);
            gapComposer.end(false);
            BalanceButtons(balanceAppletTileViewModel, rememberShaker, fillMaxWidth, copy$default, networkFetcher$fetch$2, gapComposer, (i4 & 14) | MLKEMEngine.KyberPolyBytes | i10);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2(balanceAppletTileViewModel, i, appletTileAppearance, networkFetcher$fetch$2, elementBoundsRegistry, 11);
        }
    }

    public static final void BalanceButtons(BalanceAppletTileViewModel balanceAppletTileViewModel, Shaker shaker, Modifier modifier, Colors colors, NetworkFetcher$fetch$2 networkFetcher$fetch$2, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-706308472);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer2.changed(balanceAppletTileViewModel) : gapComposer2.changedInstance(balanceAppletTileViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(shaker) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(colors) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(networkFetcher$fetch$2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i3 = i2;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            gapComposer2.startDefaults();
            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(colors, null, null, Expect_jvmKt.rememberComposableLambda(-913667437, new AvatarsKt$$ExternalSyntheticLambda4(modifier, (Serializable) networkFetcher$fetch$2, (Object) balanceAppletTileViewModel, (Object) balanceAppletTileViewModel.getBalanceMovementButtons(), (Object) shaker, 10), gapComposer2), gapComposer, ((i3 >> 9) & 14) | 3072, 6);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(balanceAppletTileViewModel, shaker, modifier, colors, networkFetcher$fetch$2, i, 15);
        }
    }

    public static final void BalanceHeader(BalanceAppletTileViewModel balanceAppletTileViewModel, AppletTile.AppletTileAppearance appletTileAppearance, Shaker shaker, NetworkFetcher$fetch$2 networkFetcher$fetch$2, ElementBoundsRegistry elementBoundsRegistry, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Haptics haptics;
        int i3;
        Object n3__externalsyntheticlambda0;
        int i4;
        ColumnScopeInstance columnScopeInstance;
        NeverEqualPolicy neverEqualPolicy;
        RealHapticVibrator realHapticVibrator;
        Modifier.Companion companion;
        String str;
        char c;
        RealHapticVibrator realHapticVibrator2;
        NeverEqualPolicy neverEqualPolicy2;
        int i5;
        int i6;
        int i7;
        Modifier.Companion companion2;
        ColumnScopeInstance columnScopeInstance2;
        GapComposer gapComposer2;
        boolean z;
        String formattedBalance;
        NeverEqualPolicy neverEqualPolicy3;
        ColumnScopeInstance columnScopeInstance3;
        AppletTile.AppletTileAppearance appletTileAppearance2;
        RealHapticVibrator realHapticVibrator3;
        Modifier.Companion companion3;
        Modifier clearAndSetSemantics;
        boolean z2;
        float f;
        float f2;
        boolean z3;
        boolean z4;
        Modifier.Companion companion4;
        ColumnScopeInstance columnScopeInstance4;
        float f3;
        long j;
        AppletTile.AppletTileAppearance appletTileAppearance3;
        NetworkFetcher$fetch$2 networkFetcher$fetch$22 = networkFetcher$fetch$2;
        balanceAppletTileViewModel.getClass();
        appletTileAppearance.getClass();
        shaker.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-1340101083);
        Applier applier = gapComposer3.applier;
        int i8 = i & 6;
        ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
        if (i8 == 0) {
            i2 = (gapComposer3.changed(columnScopeInstance5) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? gapComposer3.changed(balanceAppletTileViewModel) : gapComposer3.changedInstance(balanceAppletTileViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer3.changed(appletTileAppearance) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer3.changedInstance(shaker) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer3.changedInstance(networkFetcher$fetch$22) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer3.changedInstance(elementBoundsRegistry) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer3.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            RealHapticVibrator realHapticVibrator4 = (RealHapticVibrator) gapComposer3.consume(HapticVibratorKt.LocalHapticVibrator);
            Haptics haptics2 = (Haptics) gapComposer3.consume(HapticsKt.LocalHaptics);
            boolean z5 = balanceAppletTileViewModel instanceof BalanceAppletTileViewModel.Loading;
            Modifier.Companion companion5 = Modifier.Companion.$$INSTANCE;
            if (z5) {
                gapComposer3.startReplaceGroup(653060284);
                LoadingBalanceContent(gapComposer3, i2 & 14);
                gapComposer3.end(false);
                columnScopeInstance4 = columnScopeInstance5;
                gapComposer = gapComposer3;
                companion4 = companion5;
                f3 = 1.0f;
                z2 = true;
            } else {
                if (!(balanceAppletTileViewModel instanceof BalanceAppletTileViewModel.Loaded)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 653065313, false);
                }
                gapComposer3.startReplaceGroup(-1229688891);
                BiasAlignment.Vertical vertical = Alignment.Companion.Top;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion5, 1.0f);
                Strings.getSizes(gapComposer3).getClass();
                DefaultSizes.spacing.getClass();
                Strings.getSizes(gapComposer3).getClass();
                Strings.getSizes(gapComposer3).getClass();
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, 8.0f, 16.0f, 8.0f, RecyclerView.DECELERATION_RATE, 8);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer3, 48);
                int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m302paddingqDBjuR0$default);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer3.startReusableNode();
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer3.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                int i9 = i2;
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer3, 48);
                int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, layoutWeightElement);
                gapComposer3.startReusableNode();
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer3.useNode();
                }
                Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                BalanceAppletTileViewModel.Loaded loaded = (BalanceAppletTileViewModel.Loaded) balanceAppletTileViewModel;
                String accountText = loaded.getAccountText();
                NeverEqualPolicy neverEqualPolicy4 = Composer.Companion.Empty;
                if (accountText == null) {
                    gapComposer3.startReplaceGroup(1174996185);
                    gapComposer3.end(false);
                    gapComposer2 = gapComposer3;
                    neverEqualPolicy2 = neverEqualPolicy4;
                    companion2 = companion5;
                    realHapticVibrator2 = realHapticVibrator4;
                    haptics = haptics2;
                    i5 = i9;
                    i6 = 256;
                    i3 = 57344;
                    c = 0;
                    columnScopeInstance2 = columnScopeInstance5;
                    z = false;
                    i7 = 32;
                } else {
                    gapComposer3.startReplaceGroup(1174996186);
                    String accountContentDescription = loaded.getAccountContentDescription();
                    if (accountContentDescription == null) {
                        accountContentDescription = accountText;
                    }
                    if ((balanceAppletTileViewModel instanceof BalanceAppletTileViewModel.Loaded.Default) && ((BalanceAppletTileViewModel.Loaded.Default) balanceAppletTileViewModel).isManagedAccount) {
                        gapComposer3.startReplaceGroup(1079521016);
                        boolean changed = gapComposer3.changed(accountContentDescription) | gapComposer3.changed(accountText);
                        Object rememberedValue = gapComposer3.rememberedValue();
                        if (changed || rememberedValue == neverEqualPolicy4) {
                            rememberedValue = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(accountContentDescription, accountText, 8);
                            gapComposer3.updateRememberedValue(rememberedValue);
                        }
                        Modifier semantics = SemanticsModifierKt.semantics(companion5, false, (Function1) rememberedValue);
                        haptics = haptics2;
                        realHapticVibrator2 = realHapticVibrator4;
                        i7 = 32;
                        i6 = 256;
                        i3 = 57344;
                        Room.m1165Text25TpFw(0, 0, 0, 5, 0, 0, 3824, Strings.getColors(gapComposer3).semantic.text.standard, (Composer) gapComposer3, semantics, Strings.getTypography(gapComposer3).labelSmall, (TextLineBalancing) null, accountText, (Map) null, (Function1) null, false);
                        gapComposer2 = gapComposer3;
                        gapComposer2.end(false);
                        z = false;
                        neverEqualPolicy2 = neverEqualPolicy4;
                        i5 = i9;
                        c = 0;
                        companion2 = companion5;
                        columnScopeInstance2 = columnScopeInstance5;
                    } else {
                        haptics = haptics2;
                        i3 = 57344;
                        gapComposer3.startReplaceGroup(1080088595);
                        boolean changed2 = gapComposer3.changed(accountContentDescription) | gapComposer3.changed(accountText) | ((i9 & 112) == 32 || ((i9 & 64) != 0 && gapComposer3.changedInstance(balanceAppletTileViewModel))) | ((i9 & 57344) == 16384);
                        Object rememberedValue2 = gapComposer3.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy4) {
                            i4 = 256;
                            columnScopeInstance = columnScopeInstance5;
                            neverEqualPolicy = neverEqualPolicy4;
                            realHapticVibrator = realHapticVibrator4;
                            companion = companion5;
                            n3__externalsyntheticlambda0 = new n3$$ExternalSyntheticLambda0(accountContentDescription, accountText, balanceAppletTileViewModel, networkFetcher$fetch$2, 23);
                            str = accountText;
                            gapComposer3.updateRememberedValue(n3__externalsyntheticlambda0);
                        } else {
                            columnScopeInstance = columnScopeInstance5;
                            realHapticVibrator = realHapticVibrator4;
                            i4 = 256;
                            str = accountText;
                            n3__externalsyntheticlambda0 = rememberedValue2;
                            companion = companion5;
                            neverEqualPolicy = neverEqualPolicy4;
                        }
                        Modifier clearAndSetSemantics2 = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) n3__externalsyntheticlambda0);
                        Painter painter = Icons.SubtlePush16.painter(gapComposer3);
                        NeverEqualPolicy neverEqualPolicy5 = neverEqualPolicy;
                        InlineIconPosition inlineIconPosition = InlineIconPosition.END;
                        long j2 = Strings.getColors(gapComposer3).semantic.text.standard;
                        c = 0;
                        realHapticVibrator2 = realHapticVibrator;
                        neverEqualPolicy2 = neverEqualPolicy5;
                        i5 = i9;
                        i6 = i4;
                        i7 = 32;
                        companion2 = companion;
                        columnScopeInstance2 = columnScopeInstance;
                        zzacp.m2014InlineIconTextQqsJerU(str, painter, clearAndSetSemantics2, Strings.getColors(gapComposer3).semantic.icon.standard, inlineIconPosition, Strings.getTypography(gapComposer3).labelSmall, j2, null, 0, 0, 0, 5, false, RecyclerView.DECELERATION_RATE, gapComposer3, (Painter.$stable << 3) | 24576, 0, 30592);
                        gapComposer2 = gapComposer3;
                        z = false;
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(z);
                }
                if (loaded.getBalanceObfuscationButton().areBalancesObfuscated) {
                    formattedBalance = re$$ExternalSyntheticOutline0.m(gapComposer2, 1176742137, R.string.obfuscated_amount_content_description, gapComposer2, z);
                } else {
                    gapComposer2.startReplaceGroup(1176850606);
                    gapComposer2.end(z);
                    formattedBalance = loaded.getFormattedBalance();
                }
                Modifier shakeWith = SharedViewEventsKt.shakeWith(companion2, shaker);
                boolean z6 = balanceAppletTileViewModel instanceof BalanceAppletTileViewModel.Loaded.Default;
                if (z6 && ((BalanceAppletTileViewModel.Loaded.Default) balanceAppletTileViewModel).isManagedAccount) {
                    gapComposer2.startReplaceGroup(1177117082);
                    formattedBalance.getClass();
                    String format2 = new MessageFormat(Room.stringResource(gapComposer2, R.string.animated_amount_content_description)).format(new Object[]{formattedBalance});
                    format2.getClass();
                    boolean changed3 = ((i5 & 112) == i7 || ((i5 & 64) != 0 && gapComposer2.changedInstance(balanceAppletTileViewModel))) | ((i5 & 896) == i6) | gapComposer2.changed(format2);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    neverEqualPolicy3 = neverEqualPolicy2;
                    if (changed3 || rememberedValue3 == neverEqualPolicy3) {
                        appletTileAppearance3 = appletTileAppearance;
                        rememberedValue3 = new UtilsKt$$ExternalSyntheticLambda0(28, format2, appletTileAppearance3, balanceAppletTileViewModel);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    } else {
                        appletTileAppearance3 = appletTileAppearance;
                    }
                    Modifier clearAndSetSemantics3 = SemanticsModifierKt.clearAndSetSemantics(companion2, (Function1) rememberedValue3);
                    gapComposer2.end(false);
                    companion3 = companion2;
                    clearAndSetSemantics = clearAndSetSemantics3;
                    realHapticVibrator3 = realHapticVibrator2;
                    appletTileAppearance2 = appletTileAppearance3;
                    networkFetcher$fetch$22 = networkFetcher$fetch$2;
                    columnScopeInstance3 = columnScopeInstance2;
                } else {
                    neverEqualPolicy3 = neverEqualPolicy2;
                    gapComposer2.startReplaceGroup(1177775212);
                    String title = loaded.getTitle();
                    title.getClass();
                    formattedBalance.getClass();
                    String format3 = new MessageFormat(Room.stringResource(gapComposer2, R.string.balance_applet_tile_amount_content_description)).format(new Object[]{title, formattedBalance});
                    format3.getClass();
                    Modifier.Companion companion6 = companion2;
                    boolean changed4 = ((i5 & 896) == 256) | gapComposer2.changed(format3) | ((i5 & 112) == 32 || ((i5 & 64) != 0 && gapComposer2.changedInstance(balanceAppletTileViewModel))) | ((i5 & i3) == 16384);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy3) {
                        columnScopeInstance3 = columnScopeInstance2;
                        appletTileAppearance2 = appletTileAppearance;
                        realHapticVibrator3 = realHapticVibrator2;
                        companion3 = companion6;
                        networkFetcher$fetch$22 = networkFetcher$fetch$2;
                        n3$$ExternalSyntheticLambda0 n3__externalsyntheticlambda02 = new n3$$ExternalSyntheticLambda0(format3, appletTileAppearance2, balanceAppletTileViewModel, networkFetcher$fetch$22, 24);
                        gapComposer2.updateRememberedValue(n3__externalsyntheticlambda02);
                        rememberedValue4 = n3__externalsyntheticlambda02;
                    } else {
                        realHapticVibrator3 = realHapticVibrator2;
                        appletTileAppearance2 = appletTileAppearance;
                        companion3 = companion6;
                        networkFetcher$fetch$22 = networkFetcher$fetch$2;
                        columnScopeInstance3 = columnScopeInstance2;
                    }
                    clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion3, (Function1) rememberedValue4);
                    gapComposer2.end(false);
                }
                Modifier then = shakeWith.then(clearAndSetSemantics);
                TextStyle textStyle = Strings.getTypography(gapComposer2).numeralLarge;
                long j3 = Strings.getColors(gapComposer2).semantic.text.standard;
                ColumnScopeInstance columnScopeInstance6 = columnScopeInstance3;
                NeverEqualPolicy neverEqualPolicy6 = neverEqualPolicy3;
                Function1 function1 = appletTileAppearance2.obfuscationMask;
                Modifier.Companion companion7 = companion3;
                RealHapticVibrator realHapticVibrator5 = realHapticVibrator3;
                GapComposer gapComposer4 = gapComposer2;
                Haptics haptics3 = haptics;
                VisibleKt.m3482AnimatedAmountTextJDMA8c0(then, textStyle, j3, 0, new AnimatedAmountTextView.Amount((String) function1.invoke(loaded.getFormattedBalance()), loaded.getRawBalance()), null, false, 0L, gapComposer4, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                gapComposer = gapComposer4;
                gapComposer.end(true);
                SpacerKt.Spacer(gapComposer, SizeKt.m292widthInVpY3zN4$default(companion7, 8.0f, RecyclerView.DECELERATION_RATE, 2));
                BalanceAppletTileViewModel.BalanceObfuscationButton balanceObfuscationButton = loaded.getBalanceObfuscationButton();
                boolean changedInstance = ((i5 & i3) == 16384) | gapComposer.changedInstance(realHapticVibrator5) | gapComposer.changed(haptics3);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue5 == neverEqualPolicy6) {
                    rememberedValue5 = new UtilsKt$$ExternalSyntheticLambda0(29, realHapticVibrator5, haptics3, networkFetcher$fetch$22);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                BalanceObfuscationButtonIcon(balanceObfuscationButton, elementBoundsRegistry, (Function1) rememberedValue5, gapComposer, (i5 >> 12) & 112);
                gapComposer.end(true);
                if (balanceAppletTileViewModel instanceof BalanceAppletTileViewModel.Loaded.Lite) {
                    gapComposer.startReplaceGroup(653221538);
                    BalanceAppletTileViewModel.ConvertedBalance convertedBalance = ((BalanceAppletTileViewModel.Loaded.Lite) balanceAppletTileViewModel).getConvertedBalance();
                    if (convertedBalance == null) {
                        gapComposer.startReplaceGroup(-1224968801);
                        gapComposer.end(false);
                        z3 = false;
                        z2 = true;
                        f = RecyclerView.DECELERATION_RATE;
                        f2 = 8.0f;
                    } else {
                        gapComposer.startReplaceGroup(-1224968800);
                        Strings.getSizes(gapComposer).getClass();
                        Strings.getSizes(gapComposer).getClass();
                        Strings.getSizes(gapComposer).getClass();
                        Strings.getSizes(gapComposer).getClass();
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(SpacerKt.m301paddingqDBjuR0(companion7, 8.0f, 4.0f, 8.0f, 4.0f), 1.0f);
                        TextStyle textStyle2 = Strings.getTypography(gapComposer).bodySmall;
                        long j4 = Strings.getColors(gapComposer).semantic.text.subtle;
                        AnimatedAmountTextView.Amount amount = new AnimatedAmountTextView.Amount((String) function1.invoke(convertedBalance.formattedBalance), convertedBalance.rawBalance);
                        f = RecyclerView.DECELERATION_RATE;
                        f2 = 8.0f;
                        z2 = true;
                        VisibleKt.m3482AnimatedAmountTextJDMA8c0(fillMaxWidth2, textStyle2, j4, 0, amount, null, false, 0L, gapComposer, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                        gapComposer = gapComposer;
                        z3 = false;
                        gapComposer.end(false);
                    }
                    gapComposer.end(z3);
                } else {
                    z2 = true;
                    f = RecyclerView.DECELERATION_RATE;
                    f2 = 8.0f;
                    z3 = false;
                    gapComposer.startReplaceGroup(-1224256451);
                    gapComposer.end(false);
                }
                if (z6) {
                    gapComposer.startReplaceGroup(-1224185430);
                    BalanceAppletTileViewModel.Loaded.Default r7 = (BalanceAppletTileViewModel.Loaded.Default) balanceAppletTileViewModel;
                    String str2 = r7.restrictedBalanceLabel;
                    if (str2 == null) {
                        gapComposer.startReplaceGroup(-1224164816);
                        gapComposer.end(z3);
                        z4 = z3;
                        companion4 = companion7;
                    } else {
                        gapComposer.startReplaceGroup(-1224164815);
                        Strings.getSizes(gapComposer).getClass();
                        Strings.getSizes(gapComposer).getClass();
                        Strings.getSizes(gapComposer).getClass();
                        companion4 = companion7;
                        GapComposer gapComposer5 = gapComposer;
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer5, SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(companion7, 8.0f, RecyclerView.DECELERATION_RATE, 8.0f, 4.0f, 2), 1.0f), Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, (String) function1.invoke(str2), (Map) null, (Function1) null, false);
                        gapComposer = gapComposer5;
                        z4 = false;
                        gapComposer.end(false);
                    }
                    BalanceAppletTileViewModel.OverdraftModel overdraftModel = r7.overdraftModel;
                    if (overdraftModel == null) {
                        gapComposer.startReplaceGroup(-1223643675);
                        gapComposer.end(z4);
                    } else {
                        gapComposer.startReplaceGroup(-1223643674);
                        if (overdraftModel.useWarningTextColor) {
                            gapComposer.startReplaceGroup(395413856);
                            j = Strings.getColors(gapComposer).semantic.text.warning;
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(395489217);
                            j = Strings.getColors(gapComposer).semantic.text.subtle;
                            gapComposer.end(false);
                        }
                        long j5 = j;
                        Strings.getSizes(gapComposer).getClass();
                        GapComposer gapComposer6 = gapComposer;
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j5, (Composer) gapComposer6, SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion4, f2, f, 2), 1.0f), Strings.getTypography(gapComposer).helpText, (TextLineBalancing) null, overdraftModel.amountUsedText, (Map) null, (Function1) null, false);
                        gapComposer = gapComposer6;
                        z4 = false;
                        gapComposer.end(false);
                    }
                    gapComposer.end(z4);
                } else {
                    z4 = z3;
                    companion4 = companion7;
                    gapComposer.startReplaceGroup(-1223121603);
                    gapComposer.end(z4);
                }
                gapComposer.end(z4);
                columnScopeInstance4 = columnScopeInstance6;
                f3 = 1.0f;
            }
            SpacerKt.Spacer(gapComposer, columnScopeInstance4.weight(f3, companion4, z2));
        } else {
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(balanceAppletTileViewModel, appletTileAppearance, shaker, networkFetcher$fetch$22, elementBoundsRegistry, i, 16);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
    
        if (r7 == r8) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BalanceObfuscationButtonIcon(BalanceAppletTileViewModel.BalanceObfuscationButton balanceObfuscationButton, ElementBoundsRegistry elementBoundsRegistry, Function1 function1, Composer composer, int i) {
        int i2;
        NeverEqualPolicy neverEqualPolicy;
        balanceObfuscationButton.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1806913823);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(balanceObfuscationButton) : gapComposer.changedInstance(balanceObfuscationButton) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(elementBoundsRegistry) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.m292widthInVpY3zN4$default(companion, 24.0f, RecyclerView.DECELERATION_RATE, 2), 24.0f, RecyclerView.DECELERATION_RATE, 2);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy2) {
                rememberedValue = new AvatarsKt$$ExternalSyntheticLambda2(18);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m279heightInVpY3zN4$default, true, (Function1) rememberedValue);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
            RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, 22.0f, null, gapComposer, 432, 9);
            String str = balanceObfuscationButton.clickLabel;
            Role role = new Role(0);
            boolean z = (i2 & 896) == 256;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z) {
                neverEqualPolicy = neverEqualPolicy2;
            } else {
                neverEqualPolicy = neverEqualPolicy2;
            }
            rememberedValue3 = new BalanceHomeViewKt$$ExternalSyntheticLambda1(23, function1);
            gapComposer.updateRememberedValue(rememberedValue3);
            Modifier then = ImageKt.m182clickableO2vRcR0$default(semantics, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, str, role, (Function0) rememberedValue3, 4).then(elementBoundsRegistry != null ? WalletJsonParser.provideBounds(elementBoundsRegistry, ElementBoundsRegistry.Element.BalanceAppletTile) : companion);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
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
            gapComposer.startReplaceGroup(1428229427);
            long j = ((Color) gapComposer.consume(ArcadeThemeKt.LocalIconColor)).value;
            if (j == 16) {
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.icon.standard;
            }
            gapComposer.end(false);
            boolean z2 = (i2 & 14) == 4 || ((i2 & 8) != 0 && gapComposer.changedInstance(balanceObfuscationButton));
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (z2 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new BadgeQueries$$ExternalSyntheticLambda5(balanceObfuscationButton, 6);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Trace.m1191Iconww6aTOc(balanceObfuscationButton.areBalancesObfuscated ? Icons.SensitiveVisible24 : Icons.SensitiveHidden24, (String) null, SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue4), j, gapComposer, 48, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(balanceObfuscationButton, elementBoundsRegistry, function1, i, 16);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00da  */
    /* renamed from: HorizontalPager--8jOkeI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m328HorizontalPager8jOkeI(final PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i, float f, BiasAlignment.Vertical vertical, SnapFlingBehavior snapFlingBehavior, boolean z, NestedScrollConnection nestedScrollConnection, SnapPosition$Start snapPosition$Start, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i2, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        PaddingValues paddingValues2;
        int i6;
        int i7;
        PageSize pageSize2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f2;
        int i13;
        BiasAlignment.Vertical vertical2;
        SnapFlingBehavior snapFlingBehavior2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        final NestedScrollConnection nestedScrollConnection2;
        final Modifier modifier3;
        final float f3;
        final BiasAlignment.Vertical vertical3;
        final PaddingValues paddingValues3;
        final SnapFlingBehavior snapFlingBehavior3;
        final PageSize pageSize3;
        final int i21;
        final boolean z2;
        final SnapPosition$Start snapPosition$Start2;
        final AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect2;
        RecomposeScopeImpl endRestartGroup;
        PagerState pagerState2;
        int i22;
        SnapFlingBehavior snapFlingBehavior4;
        int i23;
        Modifier modifier4;
        float f4;
        SnapFlingBehavior snapFlingBehavior5;
        PaddingValues paddingValues4;
        PageSize pageSize4;
        SnapPosition$Start snapPosition$Start3;
        AndroidEdgeEffectOverscrollEffect rememberOverscrollEffect;
        boolean z3;
        BiasAlignment.Vertical vertical4;
        int i24;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1860873769);
        int i25 = i2 | (gapComposer.changed(pagerState) ? 4 : 2);
        int i26 = i4 & 2;
        if (i26 != 0) {
            i25 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i25 |= gapComposer.changed(modifier2) ? 32 : 16;
            i5 = i4 & 4;
            if (i5 == 0) {
                i6 = i25 | MLKEMEngine.KyberPolyBytes;
                paddingValues2 = paddingValues;
            } else {
                paddingValues2 = paddingValues;
                i6 = i25 | (gapComposer.changed(paddingValues2) ? 256 : 128);
            }
            i7 = i4 & 8;
            if (i7 == 0) {
                i8 = i6 | 3072;
                pageSize2 = pageSize;
            } else {
                pageSize2 = pageSize;
                i8 = i6 | (gapComposer.changed(pageSize2) ? 2048 : 1024);
            }
            i9 = i4 & 16;
            if (i9 == 0) {
                i11 = i8 | 24576;
                i10 = i;
            } else {
                i10 = i;
                i11 = i8 | (gapComposer.changed(i10) ? 16384 : PKIFailureInfo.certRevoked);
            }
            i12 = i4 & 32;
            if (i12 == 0) {
                i11 |= 196608;
                f2 = f;
            } else {
                f2 = f;
                if ((i2 & 196608) == 0) {
                    i11 |= gapComposer.changed(f2) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
            }
            i13 = i4 & 64;
            if (i13 == 0) {
                i11 |= 1572864;
                vertical2 = vertical;
            } else {
                vertical2 = vertical;
                if ((i2 & 1572864) == 0) {
                    i11 |= gapComposer.changed(vertical2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
            }
            if ((i4 & 128) != 0) {
                snapFlingBehavior2 = snapFlingBehavior;
                if (gapComposer.changed(snapFlingBehavior2)) {
                    i14 = 8388608;
                    int i27 = i11 | i14;
                    i15 = i4 & 256;
                    if (i15 != 0) {
                        i27 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i16 = i15;
                        i27 |= gapComposer.changed(z) ? 67108864 : 33554432;
                        i17 = i27 | 805306368;
                        int i28 = i3 | 22;
                        i18 = i4 & 4096;
                        if (i18 == 0) {
                            i28 = 24982;
                            i19 = i18;
                        } else {
                            i19 = i18;
                            if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
                                i28 |= gapComposer.changed(snapPosition$Start) ? 256 : 128;
                            }
                        }
                        i20 = i28 | 1024;
                        if (gapComposer.shouldExecute(i17 & 1, (306783379 & i17) == 306783378 || (i20 & 9363) != 9362)) {
                            gapComposer.skipToGroupEnd();
                            nestedScrollConnection2 = nestedScrollConnection;
                            modifier3 = modifier2;
                            f3 = f2;
                            vertical3 = vertical2;
                            paddingValues3 = paddingValues2;
                            snapFlingBehavior3 = snapFlingBehavior2;
                            pageSize3 = pageSize2;
                            i21 = i10;
                            z2 = z;
                            snapPosition$Start2 = snapPosition$Start;
                            androidEdgeEffectOverscrollEffect2 = androidEdgeEffectOverscrollEffect;
                        } else {
                            gapComposer.startDefaults();
                            if ((i2 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                                Modifier modifier5 = i26 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                                float f5 = RecyclerView.DECELERATION_RATE;
                                PaddingValues paddingValuesImpl = i5 != 0 ? new PaddingValuesImpl(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) : paddingValues2;
                                PageSize pageSize5 = i7 != 0 ? PageSize.Fill.INSTANCE : pageSize2;
                                int i29 = i9 == 0 ? i10 : 0;
                                if (i12 == 0) {
                                    f5 = f2;
                                }
                                BiasAlignment.Vertical vertical5 = i13 != 0 ? Alignment.Companion.CenterVertically : vertical2;
                                if ((i4 & 128) != 0) {
                                    snapFlingBehavior4 = PagerDefaults.flingBehavior(pagerState, null, null, gapComposer, (i17 & 14) | 196608, 30);
                                    pagerState2 = pagerState;
                                    i22 = i17 & (-29360129);
                                } else {
                                    pagerState2 = pagerState;
                                    i22 = i17;
                                    snapFlingBehavior4 = snapFlingBehavior2;
                                }
                                boolean z4 = i16 == 0 ? z : true;
                                nestedScrollConnection2 = PagerDefaults.pageNestedScrollConnection(pagerState2, Orientation.Horizontal, gapComposer, (i22 & 14) | 432);
                                Modifier modifier6 = modifier5;
                                i23 = i20 & (-7281);
                                modifier4 = modifier6;
                                SnapFlingBehavior snapFlingBehavior6 = snapFlingBehavior4;
                                f4 = f5;
                                snapFlingBehavior5 = snapFlingBehavior6;
                                paddingValues4 = paddingValuesImpl;
                                pageSize4 = pageSize5;
                                snapPosition$Start3 = i19 != 0 ? SnapPosition$Start.INSTANCE : snapPosition$Start;
                                rememberOverscrollEffect = OverscrollKt.rememberOverscrollEffect(gapComposer);
                                z3 = z4;
                                vertical4 = vertical5;
                                i24 = i29;
                            } else {
                                gapComposer.skipToGroupEnd();
                                i22 = (i4 & 128) != 0 ? i17 & (-29360129) : i17;
                                nestedScrollConnection2 = nestedScrollConnection;
                                snapPosition$Start3 = snapPosition$Start;
                                rememberOverscrollEffect = androidEdgeEffectOverscrollEffect;
                                i23 = i20 & (-7281);
                                modifier4 = modifier2;
                                paddingValues4 = paddingValues2;
                                snapFlingBehavior5 = snapFlingBehavior2;
                                pageSize4 = pageSize2;
                                z3 = z;
                                vertical4 = vertical2;
                                f4 = f2;
                                i24 = i10;
                            }
                            gapComposer.endDefaults();
                            Modifier modifier7 = modifier4;
                            int i30 = i22 >> 6;
                            int i31 = i22 << 12;
                            LazyLayoutPagerKt.m327PagereLwUrMk(modifier7, pagerState, paddingValues4, Orientation.Horizontal, snapFlingBehavior5, z3, rememberOverscrollEffect, i24, f4, pageSize4, nestedScrollConnection2, Alignment.Companion.CenterHorizontally, vertical4, snapPosition$Start3, composableLambdaImpl, gapComposer, ((i22 >> 3) & 14) | 24576 | ((i22 << 3) & 112) | (i22 & 896) | 3072 | (i30 & 458752) | (i30 & 3670016) | (i31 & 234881024) | (i31 & 1879048192), ((i23 << 9) & 458752) | ((i22 >> 9) & 14) | 3456 | (i30 & 57344) | 1572864);
                            float f6 = f4;
                            snapFlingBehavior3 = snapFlingBehavior5;
                            pageSize3 = pageSize4;
                            z2 = z3;
                            i21 = i24;
                            vertical3 = vertical4;
                            androidEdgeEffectOverscrollEffect2 = rememberOverscrollEffect;
                            f3 = f6;
                            paddingValues3 = paddingValues4;
                            snapPosition$Start2 = snapPosition$Start3;
                            modifier3 = modifier7;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                            endRestartGroup.block = new Function2() { // from class: androidx.compose.foundation.pager.PagerKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                                    int updateChangedFlags2 = Updater.updateChangedFlags(i3);
                                    PagerKt.m328HorizontalPager8jOkeI(PagerState.this, modifier3, paddingValues3, pageSize3, i21, f3, vertical3, snapFlingBehavior3, z2, nestedScrollConnection2, snapPosition$Start2, androidEdgeEffectOverscrollEffect2, composableLambdaImpl, (Composer) obj, updateChangedFlags, updateChangedFlags2, i4);
                                    return Unit.INSTANCE;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i16 = i15;
                    i17 = i27 | 805306368;
                    int i282 = i3 | 22;
                    i18 = i4 & 4096;
                    if (i18 == 0) {
                    }
                    i20 = i282 | 1024;
                    if (gapComposer.shouldExecute(i17 & 1, (306783379 & i17) == 306783378 || (i20 & 9363) != 9362)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
            } else {
                snapFlingBehavior2 = snapFlingBehavior;
            }
            i14 = 4194304;
            int i272 = i11 | i14;
            i15 = i4 & 256;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i272 | 805306368;
            int i2822 = i3 | 22;
            i18 = i4 & 4096;
            if (i18 == 0) {
            }
            i20 = i2822 | 1024;
            if (gapComposer.shouldExecute(i17 & 1, (306783379 & i17) == 306783378 || (i20 & 9363) != 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i4 & 4;
        if (i5 == 0) {
        }
        i7 = i4 & 8;
        if (i7 == 0) {
        }
        i9 = i4 & 16;
        if (i9 == 0) {
        }
        i12 = i4 & 32;
        if (i12 == 0) {
        }
        i13 = i4 & 64;
        if (i13 == 0) {
        }
        if ((i4 & 128) != 0) {
        }
        i14 = 4194304;
        int i2722 = i11 | i14;
        i15 = i4 & 256;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i2722 | 805306368;
        int i28222 = i3 | 22;
        i18 = i4 & 4096;
        if (i18 == 0) {
        }
        i20 = i28222 | 1024;
        if (gapComposer.shouldExecute(i17 & 1, (306783379 & i17) == 306783378 || (i20 & 9363) != 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void LoadingBalanceContent(Composer composer, int i) {
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-684024028);
        int i2 = i & 1;
        int i3 = 3;
        if (gapComposer.shouldExecute(i2, i2 != 0)) {
            if (ImageKt.isSystemInDarkTheme(gapComposer)) {
                gapComposer.startReplaceGroup(1860110401);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.background.standard;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1860176803);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.background.subtle;
                gapComposer.end(false);
            }
            long j2 = j;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            VisibleKt.ShimmerBox(SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, 8.0f, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12), false, null, Expect_jvmKt.rememberComposableLambda(977926101, new MyInvestmentsTileKt$$ExternalSyntheticLambda6(j2, 2), gapComposer), gapComposer, 3072, 6);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            VisibleKt.ShimmerBox(SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth2, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), false, null, Expect_jvmKt.rememberComposableLambda(-1145951412, new MyInvestmentsTileKt$$ExternalSyntheticLambda6(j2, i3), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalCombinedViewsKt$$ExternalSyntheticLambda3(i, i3);
        }
    }

    /* renamed from: ThinkingText-hGBTI10, reason: not valid java name */
    public static final void m329ThinkingTexthGBTI10(String str, Modifier modifier, TextStyle textStyle, float f, int i, Composer composer, int i2) {
        String str2;
        TextStyle textStyle2;
        float f2;
        GapComposer gapComposer;
        int i3;
        int i4;
        TextStyle textStyle3;
        float f3;
        int i5;
        int i6;
        MutableState mutableState;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1525720700);
        int i7 = i2 | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changed(modifier) ? 32 : 16) | 27776;
        if (gapComposer2.shouldExecute(i7 & 1, (i7 & 9363) != 9362)) {
            gapComposer2.startDefaults();
            if ((i2 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                i4 = i7 & (-897);
                textStyle3 = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                f3 = 300.0f;
                i5 = 250;
            } else {
                gapComposer2.skipToGroupEnd();
                textStyle3 = textStyle;
                f3 = f;
                i4 = i7 & (-897);
                i5 = i;
            }
            gapComposer2.endDefaults();
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default("");
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState3 = (MutableState) rememberedValue2;
            boolean changed = gapComposer2.changed(((Boolean) mutableState3.getValue()).booleanValue());
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Updater.derivedStateOf(new OverlayKt$$ExternalSyntheticLambda1(r12, mutableState3));
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Number) ((State) rememberedValue3).getValue()).floatValue(), AnimatableKt.tween$default(i5, 0, EasingKt.LinearEasing, 2), "textFade", null, gapComposer2, 3072, 20);
            r12 = (i4 & 14) != 4 ? 0 : 1;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (r12 != 0 || rememberedValue4 == neverEqualPolicy) {
                int i8 = i5;
                GovernmentIdFeed$analyze$5 governmentIdFeed$analyze$5 = new GovernmentIdFeed$analyze$5(str, i8, mutableState2, mutableState3, (Continuation) null, 6);
                str2 = str;
                i6 = i8;
                mutableState = mutableState2;
                gapComposer2.updateRememberedValue(governmentIdFeed$analyze$5);
                rememberedValue4 = governmentIdFeed$analyze$5;
            } else {
                str2 = str;
                mutableState = mutableState2;
                i6 = i5;
            }
            Updater.LaunchedEffect(gapComposer2, str2, (Function2) rememberedValue4);
            InfiniteTransition rememberInfiniteTransition = ArcSplineKt.rememberInfiniteTransition("spotlight", gapComposer2, 0);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new InsightChartKt$$ExternalSyntheticLambda19(29);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            float floatValue = ((Number) ArcSplineKt.animateFloat(rememberInfiniteTransition, RecyclerView.DECELERATION_RATE, 1.0f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.keyframes((Function1) rememberedValue5), null, 6), "spotlight".concat("Progress"), gapComposer2, 4536, 0).value$delegate.getValue()).floatValue();
            String str3 = (String) mutableState.getValue();
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            BasicTextKt.m347BasicTextRWo7tUw((String) mutableState.getValue(), modifier, TextStyle.m993copyNs73l9s$default(textStyle3, AvatarKt.m3408rememberMoneybotSpotlightBrushcbhI11c(str3, textStyle3, floatValue, colors.semantic.text.subtle, ((Number) animateFloatAsState.getValue()).floatValue(), f3, gapComposer2, 196608, 0), null, 33554430), null, 0, false, 0, 0, null, gapComposer2, i4 & 112, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
            gapComposer = gapComposer2;
            textStyle2 = textStyle3;
            f2 = f3;
            i3 = i6;
        } else {
            str2 = str;
            gapComposer2.skipToGroupEnd();
            textStyle2 = textStyle;
            f2 = f;
            gapComposer = gapComposer2;
            i3 = i;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda6(str2, modifier, textStyle2, f2, i3, i2);
        }
    }

    /* renamed from: VerticalPager--8jOkeI, reason: not valid java name */
    public static final void m330VerticalPager8jOkeI(PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, Alignment.Horizontal horizontal, SnapFlingBehavior snapFlingBehavior, boolean z, NestedScrollConnection nestedScrollConnection, SnapPosition$Start snapPosition$Start, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        PaddingValues paddingValues2;
        PageSize pageSize2;
        Alignment.Horizontal horizontal2;
        SnapFlingBehavior snapFlingBehavior2;
        NestedScrollConnection nestedScrollConnection2;
        SnapPosition$Start snapPosition$Start2;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect2;
        PagerState pagerState2;
        SnapPosition$Start snapPosition$Start3;
        AndroidEdgeEffectOverscrollEffect rememberOverscrollEffect;
        Alignment.Horizontal horizontal3;
        NestedScrollConnection nestedScrollConnection3;
        SnapFlingBehavior snapFlingBehavior3;
        int i2;
        PageSize pageSize3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1590376023);
        int i3 = i | (gapComposer.changed(pagerState) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16) | 811298176;
        if (gapComposer.shouldExecute(i3 & 1, (306783379 & i3) != 306783378)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
                BiasAlignment.Horizontal horizontal4 = Alignment.Companion.CenterHorizontally;
                pagerState2 = pagerState;
                SnapFlingBehavior flingBehavior = PagerDefaults.flingBehavior(pagerState2, null, null, gapComposer, (i3 & 14) | 196608, 30);
                DefaultPagerNestedScrollConnection pageNestedScrollConnection = PagerDefaults.pageNestedScrollConnection(pagerState2, Orientation.Vertical, gapComposer, (i3 & 14) | 432);
                snapPosition$Start3 = SnapPosition$Start.INSTANCE;
                rememberOverscrollEffect = OverscrollKt.rememberOverscrollEffect(gapComposer);
                horizontal3 = horizontal4;
                nestedScrollConnection3 = pageNestedScrollConnection;
                snapFlingBehavior3 = flingBehavior;
                i2 = i3 & (-29360129);
                paddingValues2 = paddingValuesImpl;
                pageSize3 = PageSize.Fill.INSTANCE;
            } else {
                gapComposer.skipToGroupEnd();
                i2 = i3 & (-29360129);
                pagerState2 = pagerState;
                paddingValues2 = paddingValues;
                pageSize3 = pageSize;
                horizontal3 = horizontal;
                snapFlingBehavior3 = snapFlingBehavior;
                nestedScrollConnection3 = nestedScrollConnection;
                snapPosition$Start3 = snapPosition$Start;
                rememberOverscrollEffect = androidEdgeEffectOverscrollEffect;
            }
            gapComposer.endDefaults();
            LazyLayoutPagerKt.m327PagereLwUrMk(modifier, pagerState2, paddingValues2, Orientation.Vertical, snapFlingBehavior3, z, rememberOverscrollEffect, 0, RecyclerView.DECELERATION_RATE, pageSize3, nestedScrollConnection3, horizontal3, Alignment.Companion.CenterVertically, snapPosition$Start3, composableLambdaImpl, gapComposer, ((i2 << 3) & 112) | ((i2 >> 3) & 14) | 24576 | 907545984, 1797510);
            gapComposer = gapComposer;
            nestedScrollConnection2 = nestedScrollConnection3;
            horizontal2 = horizontal3;
            androidEdgeEffectOverscrollEffect2 = rememberOverscrollEffect;
            snapFlingBehavior2 = snapFlingBehavior3;
            pageSize2 = pageSize3;
            snapPosition$Start2 = snapPosition$Start3;
        } else {
            gapComposer.skipToGroupEnd();
            paddingValues2 = paddingValues;
            pageSize2 = pageSize;
            horizontal2 = horizontal;
            snapFlingBehavior2 = snapFlingBehavior;
            nestedScrollConnection2 = nestedScrollConnection;
            snapPosition$Start2 = snapPosition$Start;
            androidEdgeEffectOverscrollEffect2 = androidEdgeEffectOverscrollEffect;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PagerKt$$ExternalSyntheticLambda6(pagerState, modifier, paddingValues2, pageSize2, horizontal2, snapFlingBehavior2, z, nestedScrollConnection2, snapPosition$Start2, androidEdgeEffectOverscrollEffect2, composableLambdaImpl, i);
        }
    }
}
