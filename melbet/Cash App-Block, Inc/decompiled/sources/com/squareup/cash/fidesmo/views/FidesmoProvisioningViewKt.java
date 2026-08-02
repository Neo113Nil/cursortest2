package com.squareup.cash.fidesmo.views;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.ArcSplineKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.selection.ToggleableNode$$ExternalSyntheticLambda1;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17;
import androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda0;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.LazyWindowInfo;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.RoomDatabase$performClear$1;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda9;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_vision_common.zzg;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountAvatarKt$$ExternalSyntheticLambda2;
import com.squareup.cash.account.components.AccountUiViewKt$$ExternalSyntheticLambda14;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.list.ListUnorderedItem;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.booklet.ui.BookletGridKt;
import com.squareup.cash.booklet.ui.BookletTileKt$$ExternalSyntheticLambda0;
import com.squareup.cash.booklet.ui.BookletTileKt$$ExternalSyntheticLambda6;
import com.squareup.cash.card.onboarding.CanvasKt;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.card.onboarding.graphics.HeartEdition;
import com.squareup.cash.card.onboarding.graphics.MiniCardEdition;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda5;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db.contacts.Recipient$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda0;
import com.squareup.cash.directory_ui.views.SectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.family.fixtures.FamilyActivityFixtures$$ExternalSyntheticLambda0;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewEvent;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.fidesmo.viewmodels.FidesmoScanningPulseShape;
import com.squareup.cash.fidesmo.viewmodels.ScanningStarPlacement;
import com.squareup.cash.fidesmo.views.haptic.ProvisioningHaptics;
import com.squareup.cash.formview.components.FormCashtag$8$$ExternalSyntheticLambda0;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda17;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.cash.moneybot.theme.MoneybotTheme;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$complete$2;
import com.squareup.cash.wallet.views.CardLockViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.InteractiveCardState$animateLock$2;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.stripe.android.uicore.elements.PlaceHolderKt;
import com.stripe.android.uicore.elements.SectionUIKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.internal.Tags;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes6.dex */
public abstract class FidesmoProvisioningViewKt {
    public static final List SNAKE_PATH;
    public static final FidesmoProvisioningViewModel.Success.Provisioned.BookletGrid successBookletGridPreview;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ListUnordered.Variant.values().length];
            try {
                iArr[ListUnordered.Variant.SUBTLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SuccessCardImageState.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SuccessCardImageState successCardImageState = SuccessCardImageState.Loading;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                SuccessCardImageState successCardImageState2 = SuccessCardImageState.Loading;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[TagFormFactor.values().length];
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TagFormFactor tagFormFactor = TagFormFactor.WAND;
                iArr3[4] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                TagFormFactor tagFormFactor2 = TagFormFactor.WAND;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                TagFormFactor tagFormFactor3 = TagFormFactor.WAND;
                iArr3[5] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                TagFormFactor tagFormFactor4 = TagFormFactor.WAND;
                iArr3[0] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                TagFormFactor tagFormFactor5 = TagFormFactor.WAND;
                iArr3[3] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr4 = new int[ScanningPulseShape.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                ScanningPulseShape scanningPulseShape = ScanningPulseShape.Star;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                ScanningPulseShape scanningPulseShape2 = ScanningPulseShape.Star;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr5 = new int[FidesmoScanningPulseShape.values().length];
            try {
                iArr5[0] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                FidesmoScanningPulseShape fidesmoScanningPulseShape = FidesmoScanningPulseShape.STAR;
                iArr5[1] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                FidesmoScanningPulseShape fidesmoScanningPulseShape2 = FidesmoScanningPulseShape.STAR;
                iArr5[2] = 3;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    static {
        Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
        Pair pair = new Pair(valueOf, valueOf);
        Float valueOf2 = Float.valueOf(1.0f);
        Pair pair2 = new Pair(valueOf, valueOf2);
        Float valueOf3 = Float.valueOf(0.25f);
        Pair pair3 = new Pair(valueOf3, valueOf);
        Float valueOf4 = Float.valueOf(0.5f);
        Pair pair4 = new Pair(valueOf4, valueOf2);
        Float valueOf5 = Float.valueOf(0.75f);
        SNAKE_PATH = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{pair, pair2, pair3, pair4, new Pair(valueOf5, valueOf), new Pair(valueOf2, valueOf2), new Pair(valueOf2, valueOf), new Pair(valueOf5, valueOf2), new Pair(valueOf4, valueOf), new Pair(valueOf3, valueOf2)});
        new FidesmoProvisioningViewModel.PreScanInstructions("How to activate your Cash App Tag", null, CollectionsKt__CollectionsKt.listOf((Object[]) new FidesmoProvisioningViewModel.PreScanInstructions.InfoCard[]{new FidesmoProvisioningViewModel.PreScanInstructions.InfoCard("fake:///toast.png", "Place your tag against the back of your phone", "If you use a cover, remove it first. Hold your phone still and place the tag flat against the back. Look for the pulsing star as a guide near the spot where you usually tap to pay."), new FidesmoProvisioningViewModel.PreScanInstructions.InfoCard("fake:///toast.png", "Keep your tag in place", "When your phone buzzes, you're in the right place. Keep your tag still - activation takes about a minute and happens in a few steps."), new FidesmoProvisioningViewModel.PreScanInstructions.InfoCard("fake:///toast.png", "If you get stuck", "Keep the tag still in the position of the pulsing star and check that your internet connection is stable.")}), "Accept terms", "Scroll to review terms", "fake:///toast.png", "\nTERMS & CONDITIONS\n\nTo provision your tag, we partner with Fidesmo, a third-party service provider that enables secure device provisioning. By clicking Activate tag, you agree to the Fidesmo Terms of Service and Privacy Policy.\n\nBy clicking Activate tag, you authorize us to link your Cash App Card to your tag, and agree that your tag functions solely in connection with your Card and all transactions are subject to your Cardholder Agreement and the Cash App Terms of Service.\n");
        zzd zzdVar = Icons.Companion;
        successBookletGridPreview = new FidesmoProvisioningViewModel.Success.Provisioned.BookletGrid("Magically secure", CollectionsKt__CollectionsKt.listOf((Object[]) new FidesmoProvisioningViewModel.Success.Provisioned.BookletGrid.Item[]{new FidesmoProvisioningViewModel.Success.Provisioned.BookletGrid.Item(new Icon("qFw01A"), "Remote lock", "Lock and unlock your Charm, wherever it is."), new FidesmoProvisioningViewModel.Success.Provisioned.BookletGrid.Item(new Icon("hLUDah"), "Skim protection", "Your Charm only works at close range."), new FidesmoProvisioningViewModel.Success.Provisioned.BookletGrid.Item(new Icon("DibART"), "Private by default", "None of your info is shared when you pay."), new FidesmoProvisioningViewModel.Success.Provisioned.BookletGrid.Item(new Icon("XknEcS"), "Real-time alerts", "Know right away if something looks off."), new FidesmoProvisioningViewModel.Success.Provisioned.BookletGrid.Item(new Icon("yO80IX"), "Merchant blocking", "You control who can charge you."), new FidesmoProvisioningViewModel.Success.Provisioned.BookletGrid.Item(new Icon("pfbkAI"), "Zero fraud liability", "You're covered for fraudulent charges.")}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.Throwable] */
    public static final void ActivatingContent(FidesmoProvisioningViewModel.Activating activating, Function1 function1, boolean z, Function1 function12, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        ProvisioningHaptics provisioningHaptics;
        Continuation continuation;
        FidesmoProvisioningViewModel.Activating activating2 = activating;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(172684287);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(activating2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(function12) ? 2048 : 1024;
        }
        int i3 = i2;
        int i4 = 1;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Boolean bool = (Boolean) gapComposer2.consume(InspectionModeKt.LocalInspectionMode);
            boolean booleanValue = bool.booleanValue();
            if (booleanValue) {
                gapComposer2.startReplaceGroup(-932887202);
                gapComposer2.end(false);
                provisioningHaptics = null;
            } else {
                gapComposer2.startReplaceGroup(-1554114884);
                provisioningHaptics = StateFlowsComposeKt.rememberProvisioningHaptics(gapComposer2);
                gapComposer2.end(false);
            }
            boolean changedInstance = gapComposer2.changedInstance(provisioningHaptics);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new FidesmoProvisioningViewKt$$ExternalSyntheticLambda7(provisioningHaptics, 2);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Updater.DisposableEffect(provisioningHaptics, (Function1) rememberedValue, gapComposer2);
            Boolean valueOf = Boolean.valueOf(activating2.connected);
            boolean changed = gapComposer2.changed(booleanValue) | gapComposer2.changedInstance(activating2) | gapComposer2.changedInstance(provisioningHaptics);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                continuation = null;
                RoomDatabase$performClear$1.AnonymousClass1 anonymousClass1 = new RoomDatabase$performClear$1.AnonymousClass1(booleanValue, activating, provisioningHaptics, continuation, 10);
                activating2 = activating;
                gapComposer2.updateRememberedValue(anonymousClass1);
                rememberedValue2 = anonymousClass1;
            } else {
                continuation = null;
            }
            Updater.LaunchedEffect(valueOf, bool, (Function2) rememberedValue2, gapComposer2);
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            ?? r22 = continuation;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw r22;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer = gapComposer2;
            PositionedScanningInstructionBlock(activating2.title, null, z, function12, SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f, true), 1.0f), false, null, gapComposer, (i3 & 896) | 196656 | (i3 & 7168), 64);
            FidesmoProvisioningViewModel.Button button = activating2.button;
            if (button == null) {
                gapComposer.startReplaceGroup(-1310761883);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1310761882);
                DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(381424086, new FidesmoProvisioningViewKt$$ExternalSyntheticLambda24(function1, button, i4), gapComposer), gapComposer, 24576, 15);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(activating2, function1, z, function12, i);
        }
    }

    public static final void DeprovisionSuccess(FidesmoProvisioningViewModel.Success.Deprovisioned deprovisioned, Function1 function1, Composer composer, int i) {
        int i2;
        deprovisioned.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-513335523);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(deprovisioned) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxSize, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceBetween;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Center$1, horizontal, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14, 1.0f, true), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            Countries.PageHeader(deprovisioned.title, SizeKt.fillMaxWidth(companion, 1.0f), ComposableSingletons$FidesmoProvisioningViewKt.f422lambda$365366124, deprovisioned.message, gapComposer, 432, 0);
            gapComposer.end(true);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1373088619, new ArcadeModal2Kt$$ExternalSyntheticLambda0(22, function1, deprovisioned), gapComposer), gapComposer, 24576, 15);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(deprovisioned, function1, i, 16);
        }
    }

    public static final void ErrorContent(FidesmoProvisioningViewModel.Error error, Function1 function1, Composer composer, int i) {
        int i2;
        ComposableLambdaImpl rememberComposableLambda;
        boolean z;
        Icons icons;
        String str;
        error.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(505503078);
        Applier applier = gapComposer.applier;
        int i3 = (i & 6) == 0 ? (gapComposer.changedInstance(error) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxSize, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceBetween;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Center$1, horizontal, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14, 1.0f, true), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            String str2 = error.title;
            String str3 = error.message;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Icon icon = error.icon;
            String str4 = icon != null ? icon.arcade_id : null;
            if (str4 == null) {
                gapComposer.startReplaceGroup(-1834376074);
                i2 = 0;
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                i2 = 0;
                gapComposer.startReplaceGroup(-1834376073);
                Icons.Companion.getClass();
                Icons icons2 = zzd.get(str4);
                if (icons2 == null) {
                    gapComposer.startReplaceGroup(132835965);
                    gapComposer.end(false);
                    rememberComposableLambda = null;
                } else {
                    gapComposer.startReplaceGroup(132835966);
                    rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(105329861, new InfoSectionKt$$ExternalSyntheticLambda6(icons2, 18), gapComposer);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            }
            Countries.PageHeader(str2, fillMaxWidth, rememberComposableLambda, str3, gapComposer, 48, 0);
            DBUtil.SpacerBetweenSectionLarge(i2, 1, gapComposer, null);
            List<ListUnordered.ListItem> list = error.instructions.items;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (ListUnordered.ListItem listItem : list) {
                Icon icon2 = listItem.icon;
                if (icon2 == null || (str = icon2.arcade_id) == null) {
                    icons = null;
                } else {
                    Icons.Companion.getClass();
                    icons = zzd.get(str);
                }
                LocalizedString localizedString = listItem.label;
                String str5 = localizedString != null ? localizedString.translated_value : null;
                if (str5 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    return;
                }
                LocalizedString localizedString2 = listItem.value;
                String str6 = localizedString2 != null ? localizedString2.translated_value : null;
                LocalizedString localizedString3 = listItem.body;
                arrayList.add(new ListUnorderedItem(icons, str5, str6, localizedString3 != null ? localizedString3.translated_value : null));
            }
            ImmutableList immutableList = Tags.toImmutableList(arrayList);
            if (immutableList.isEmpty()) {
                z = true;
                gapComposer.startReplaceGroup(-1833147760);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1833386088);
                ListUnorderedKt.ListUnordered(immutableList, SizeKt.fillMaxWidth(companion, 1.0f), (ListUnorderedState) null, ListUnorderedProminence.Standard, ListUnorderedSize.Large, RecyclerView.DECELERATION_RATE, gapComposer, 27696, 36);
                gapComposer = gapComposer;
                z = true;
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            gapComposer.end(z);
            GapComposer gapComposer2 = gapComposer;
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1376189218, new ArcadeModal2Kt$$ExternalSyntheticLambda0(21, error, function1), gapComposer), gapComposer2, 24576, 15);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(error, function1, i, 15);
        }
    }

    public static final void FailedContent(FidesmoProvisioningViewModel.Failed failed, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-338400338);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(failed) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxSize, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            NavigationType navigationType = NavigationType.CLOSE;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SafetyHubViewKt$$ExternalSyntheticLambda9(27, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 54, 108);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            Countries.PageHeader(failed.title, (Modifier) null, ComposableSingletons$FidesmoProvisioningViewKt.lambda$464957999, failed.message, gapComposer2, MLKEMEngine.KyberPolyBytes, 2);
            gapComposer = gapComposer2;
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-463465178, new ArcadeModal2Kt$$ExternalSyntheticLambda0(23, failed, function1), gapComposer), gapComposer, 24576, 15);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(failed, function1, i, 17);
        }
    }

    public static final void FidesmoProvisioningView(FidesmoProvisioningViewModel fidesmoProvisioningViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2130811604);
        int i2 = (gapComposer.changedInstance(fidesmoProvisioningViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 18;
        int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            boolean booleanValue = ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            Unit unit = Unit.INSTANCE;
            int i5 = i2 & 112;
            boolean changed = gapComposer.changed(booleanValue) | gapComposer.changedInstance(context) | (i5 == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new DialogHostKt$$ExternalSyntheticLambda2(booleanValue, context, function1, 6);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.DisposableEffect(unit, (Function1) rememberedValue, gapComposer);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) gapComposer.consume(LocalLifecycleOwnerKt.LocalLifecycleOwner);
            if (booleanValue) {
                gapComposer.startReplaceGroup(609442614);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(609011125);
                boolean changedInstance = (i5 == 32) | gapComposer.changedInstance(context) | gapComposer.changedInstance(lifecycleOwner);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new GpsConfigQueries$$ExternalSyntheticLambda3(8, lifecycleOwner, context, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Updater.DisposableEffect(lifecycleOwner, (Function1) rememberedValue2, gapComposer);
                gapComposer.end(false);
            }
            ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(1882683511, new FidesmoUiFactory$$ExternalSyntheticLambda1(fidesmoProvisioningViewModel, function1, i4), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(fidesmoProvisioningViewModel, function1, i, i3);
        }
    }

    public static final void InfoCard(FidesmoProvisioningViewModel.PreScanInstructions.InfoCard infoCard, Composer composer, int i) {
        UriHandler uriHandler;
        Modifier.Companion companion;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        BiasAlignment.Horizontal horizontal;
        Arrangement$Top$1 arrangement$Top$1;
        GapComposer gapComposer;
        FidesmoProvisioningViewModel.PreScanInstructions.InfoCard infoCard2 = infoCard;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1506405464);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changedInstance(infoCard2) ? 4 : 2);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            UriHandler uriHandler2 = (UriHandler) gapComposer2.consume(CompositionLocalsKt.LocalUriHandler);
            boolean booleanValue = ((Boolean) gapComposer2.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier animateContentSize$default = booleanValue ? companion2 : AnimatedContentKt.animateContentSize$default(companion2, null, 3);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$16);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$17);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$18);
            String str = infoCard2.imageUrl;
            if (str == null) {
                gapComposer2.startReplaceGroup(-773398070);
                gapComposer2.end(false);
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                arrangement$Top$1 = arrangement$Top$12;
                uriHandler = uriHandler2;
                gapComposer = gapComposer2;
                companion = companion2;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$15;
                horizontal = horizontal2;
            } else {
                gapComposer2.startReplaceGroup(-773398069);
                Modifier then = SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(companion2, 1.0f), 160.0f, RecyclerView.DECELERATION_RATE, 2).then(animateContentSize$default);
                ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Object obj = DefaultSizes.border.entries;
                Modifier clip = ClipKt.clip(then, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                uriHandler = uriHandler2;
                companion = companion2;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$15;
                horizontal = horizontal2;
                arrangement$Top$1 = arrangement$Top$12;
                AsyncImageKt.m1438AsyncImage10Xjiaw(str, null, ImageKt.m177backgroundbw27NRU(clip, colors.semantic.background.prominent, ColorKt.RectangleShape), null, ContentScale.Companion.FillWidth, null, gapComposer2, 1572912, 1976);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            }
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$1);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$12);
            infoCard2 = infoCard;
            GapComposer gapComposer3 = gapComposer;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer3, (Modifier) null, Strings.getTypography(gapComposer).headlineSmall, (TextLineBalancing) null, infoCard2.title, (Map) null, (Function1) null, false);
            gapComposer2 = gapComposer3;
            String str2 = infoCard2.body;
            if (str2 == null) {
                gapComposer2.startReplaceGroup(-1804385259);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-1804385258);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                TextStyle textStyle = Strings.getTypography(gapComposer2).bodyMedium;
                long j = Strings.getColors(gapComposer2).semantic.text.standard;
                UriHandler uriHandler3 = uriHandler;
                boolean changedInstance = gapComposer2.changedInstance(uriHandler3);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new BookletTileKt$$ExternalSyntheticLambda0(uriHandler3, 3);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                LazyDslKt.m304MarkdownTextpCuZGqc(str2, (Function2) rememberedValue, null, textStyle, j, null, null, null, 0, 0, 0, gapComposer2, 0, 2020);
                gapComposer2.end(false);
            }
            gapComposer2.end(true);
            gapComposer2.end(true);
        } else {
            gapComposer2.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal$$ExternalSyntheticLambda5(infoCard2, i, 14);
        }
    }

    public static final void InfoCards(int i, Composer composer, List list) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1350039091);
        int i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(64.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            gapComposer.startReplaceGroup(-1412229602);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InfoCard((FidesmoProvisioningViewModel.PreScanInstructions.InfoCard) it.next(), gapComposer, 0);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda9(i, 6, list);
        }
    }

    public static final void InstructionList(ListUnordered listUnordered, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Icons icons;
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2111138875);
        int i2 = (gapComposer.changedInstance(listUnordered) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ListUnordered.Variant variant = listUnordered.variant;
            ListUnorderedProminence listUnorderedProminence = (variant == null ? -1 : WhenMappings.$EnumSwitchMapping$0[variant.ordinal()]) == 1 ? ListUnorderedProminence.Subtle : ListUnorderedProminence.Standard;
            List<ListUnordered.ListItem> list = listUnordered.items;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (ListUnordered.ListItem listItem : list) {
                Icon icon = listItem.icon;
                String str2 = null;
                if (icon == null || (str = icon.arcade_id) == null) {
                    icons = null;
                } else {
                    Icons.Companion.getClass();
                    icons = zzd.get(str);
                }
                LocalizedString localizedString = listItem.label;
                String str3 = localizedString != null ? localizedString.translated_value : null;
                if (str3 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    return;
                }
                LocalizedString localizedString2 = listItem.value;
                String str4 = localizedString2 != null ? localizedString2.translated_value : null;
                LocalizedString localizedString3 = listItem.body;
                if (localizedString3 != null) {
                    str2 = localizedString3.translated_value;
                }
                arrayList.add(new ListUnorderedItem(icons, str3, str4, str2));
            }
            modifier2 = modifier;
            ListUnorderedKt.ListUnordered(Tags.toImmutableList(arrayList), modifier2, (ListUnorderedState) null, listUnorderedProminence, ListUnorderedSize.Large, RecyclerView.DECELERATION_RATE, gapComposer, 24624, 36);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormCashtag$8$$ExternalSyntheticLambda0(listUnordered, modifier2, i, 12);
        }
    }

    /* renamed from: PositionedDisconnectedAlertIcon-zTRF_AQ, reason: not valid java name */
    public static final void m3536PositionedDisconnectedAlertIconzTRF_AQ(long j, ScanningStarPlacement scanningStarPlacement, int i, Function1 function1, Composer composer, int i2) {
        int i3;
        int i4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1532896992);
        if ((i2 & 6) == 0) {
            i3 = (gapComposer.changed(j) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= gapComposer.changedInstance(scanningStarPlacement) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 = i;
            i3 |= gapComposer.changed(i4) ? 256 : 128;
        } else {
            i4 = i;
        }
        if ((i2 & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        int i5 = i3;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 1171) != 1170)) {
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            int roundToInt = MathKt__MathJVMKt.roundToInt(density.mo236toPx0680j_4(96.0f));
            int roundToInt2 = MathKt__MathJVMKt.roundToInt(density.mo236toPx0680j_4(180.0f));
            gapComposer.startReplaceGroup(59789286);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            int roundToInt3 = MathKt__MathJVMKt.roundToInt(density.mo236toPx0680j_4(16.0f));
            gapComposer.end(false);
            boolean changed = ((i5 & 896) == 256) | ((i5 & 14) == 4) | gapComposer.changed(roundToInt) | gapComposer.changed(roundToInt2) | gapComposer.changed(scanningStarPlacement);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = m3538scanningStarLayoutzTRF_AQ(j, roundToInt, roundToInt2, roundToInt3, scanningStarPlacement, i4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ScanningStarLayout scanningStarLayout = (ScanningStarLayout) rememberedValue;
            InfiniteTransition.TransitionAnimationState animateFloat = ArcSplineKt.animateFloat(ArcSplineKt.rememberInfiniteTransition("disconnected_animation", gapComposer, 0), RecyclerView.DECELERATION_RATE, 3000.0f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.tween$default(3000, 0, EasingKt.LinearEasing, 2), RepeatMode.Restart, 4), "disconnected_time", gapComposer, 29112, 0);
            boolean changed2 = gapComposer.changed(scanningStarLayout) | ((i5 & 7168) == 2048);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new GLSceneScope$$ExternalSyntheticLambda4(12, function1, scanningStarLayout);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.SideEffect((Function0) rememberedValue2, gapComposer);
            AnimatedContentKt.AnimatedVisibility(((int) (j >> 32)) > 0 && ((int) (j & BodyPartID.bodyIdMax)) > 0, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-185810616, new SectionKt$$ExternalSyntheticLambda2(28, density, animateFloat, scanningStarLayout), gapComposer), (Composer) gapComposer, 200064, 18);
            gapComposer = gapComposer;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FidesmoProvisioningViewKt$$ExternalSyntheticLambda71(j, scanningStarPlacement, i, function1, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PositionedScanningInstructionBlock(String str, Integer num, boolean z, Function1 function1, Modifier modifier, boolean z2, String str2, Composer composer, int i, int i2) {
        int i3;
        String str3;
        String str4;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1518095499);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(num) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i3 |= gapComposer.changed(z2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i4 = i2 & 64;
        if (i4 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            str3 = str2;
            i3 |= gapComposer.changed(str3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
                gapComposer.skipToGroupEnd();
                str4 = str3;
            } else {
                if (i4 != 0) {
                    str3 = null;
                }
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier then = modifier.then(z ? SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 112.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13) : SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 96.0f, 7));
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(z ? Alignment.Companion.TopCenter : Alignment.Companion.BottomCenter, false);
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
                Modifier onSizeChanged = RulerKt.onSizeChanged(SizeKt.fillMaxWidth(companion, 1.0f), function1);
                int i5 = i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                int i6 = i3 >> 9;
                String str5 = str3;
                ScanningInstructionBlock(str, num, z2, str5, onSizeChanged, gapComposer, i5 | (i6 & 896) | (i6 & 7168));
                gapComposer.end(true);
                str4 = str5;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new AccountAvatarKt$$ExternalSyntheticLambda2(str, num, z, function1, modifier, z2, str4, i, i2);
                return;
            }
            return;
        }
        str3 = str2;
        if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x046c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x043f  */
    /* renamed from: PositionedScanningPulse-z0pNpkI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3537PositionedScanningPulsez0pNpkI(final long j, final ScanningStarPlacement scanningStarPlacement, int i, ScanningPulseStyle scanningPulseStyle, final ScanningStepAnimationTrigger scanningStepAnimationTrigger, final float f, final boolean z, final Function0 function0, Function0 function02, Function0 function03, Function1 function1, Composer composer, final int i2) {
        Function1 function12;
        int i3;
        final Function0 function04;
        GapComposer gapComposer;
        final Function0 function05;
        int i4;
        MutableState mutableState;
        int i5;
        boolean z2;
        int i6;
        float f2;
        int i7;
        Pair pair;
        Pair pair2;
        int i8;
        ScanningStarLayout scanningStarLayout;
        int i9;
        boolean z3;
        boolean changed;
        Object rememberedValue;
        int ordinal;
        ScanningPulseStyle copy$default;
        int ordinal2;
        Function0 function06;
        Function0 function07;
        GapComposer gapComposer2;
        int i10;
        int i11;
        int i12;
        int i13;
        ScanningPulseStyle scanningPulseStyle2 = scanningPulseStyle;
        scanningStarPlacement.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(1015955354);
        int i14 = i2 | (gapComposer3.changed(j) ? 4 : 2) | (gapComposer3.changedInstance(scanningStarPlacement) ? 32 : 16) | (gapComposer3.changed(i) ? 256 : 128) | (gapComposer3.changed(scanningPulseStyle2) ? 2048 : 1024) | (gapComposer3.changed(scanningStepAnimationTrigger) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer3.changed(f) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer3.changed(z) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer3.changedInstance(function0) ? 8388608 : 4194304) | 905969664;
        if (gapComposer3.shouldExecute(i14 & 1, (306783379 & i14) != 306783378)) {
            Object rememberedValue2 = gapComposer3.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue2 == obj) {
                rememberedValue2 = new Recipient$$ExternalSyntheticLambda2(25);
                gapComposer3.updateRememberedValue(rememberedValue2);
            }
            Function0 function08 = (Function0) rememberedValue2;
            Object rememberedValue3 = gapComposer3.rememberedValue();
            if (rememberedValue3 == obj) {
                rememberedValue3 = new Recipient$$ExternalSyntheticLambda2(26);
                gapComposer3.updateRememberedValue(rememberedValue3);
            }
            Function0 function09 = (Function0) rememberedValue3;
            Object rememberedValue4 = gapComposer3.rememberedValue();
            if (rememberedValue4 == obj) {
                rememberedValue4 = Updater.mutableStateOf$default(null);
                gapComposer3.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState2 = (MutableState) rememberedValue4;
            boolean z4 = (i14 & 57344) == 16384;
            Object rememberedValue5 = gapComposer3.rememberedValue();
            int i15 = 7;
            if (z4 || rememberedValue5 == obj) {
                rememberedValue5 = new CheckStatusPresenter.AnonymousClass1.C00611(scanningStepAnimationTrigger, mutableState2, null, i15);
                gapComposer3.updateRememberedValue(rememberedValue5);
            }
            Updater.LaunchedEffect(gapComposer3, scanningStepAnimationTrigger, (Function2) rememberedValue5);
            Density density = (Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity);
            int roundToInt = MathKt__MathJVMKt.roundToInt(density.mo236toPx0680j_4(getEffectSize(scanningPulseStyle2)));
            int roundToInt2 = MathKt__MathJVMKt.roundToInt(density.mo236toPx0680j_4(getClampedSize(scanningPulseStyle2)));
            gapComposer3.startReplaceGroup(1375551904);
            ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            int roundToInt3 = MathKt__MathJVMKt.roundToInt(density.mo236toPx0680j_4(16.0f));
            gapComposer3.end(false);
            boolean changed2 = ((i14 & 14) == 4) | gapComposer3.changed(roundToInt) | gapComposer3.changed(roundToInt2) | ((i14 & 896) == 256) | gapComposer3.changed(scanningStarPlacement) | gapComposer3.changed(roundToInt3);
            Object rememberedValue6 = gapComposer3.rememberedValue();
            if (changed2 || rememberedValue6 == obj) {
                i4 = i14;
                mutableState = mutableState2;
                i5 = roundToInt;
                z2 = true;
                i6 = roundToInt2;
                rememberedValue6 = m3538scanningStarLayoutzTRF_AQ(j, i5, i6, roundToInt3, scanningStarPlacement, i);
                gapComposer3.updateRememberedValue(rememberedValue6);
            } else {
                i4 = i14;
                mutableState = mutableState2;
                i5 = roundToInt;
                i6 = roundToInt2;
                z2 = true;
            }
            ScanningStarLayout scanningStarLayout2 = (ScanningStarLayout) rememberedValue6;
            InfiniteTransition rememberInfiniteTransition = ArcSplineKt.rememberInfiniteTransition("fidesmoUnknownFloat", gapComposer3, 0);
            Drop$$ExternalSyntheticBUOutline0 drop$$ExternalSyntheticBUOutline0 = EasingKt.LinearEasing;
            TweenSpec tween$default = AnimatableKt.tween$default(8000, 0, drop$$ExternalSyntheticBUOutline0, 2);
            int i16 = i6;
            RepeatMode repeatMode = RepeatMode.Restart;
            InfiniteTransition.TransitionAnimationState animateFloat = ArcSplineKt.animateFloat(rememberInfiniteTransition, RecyclerView.DECELERATION_RATE, 1.0f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(tween$default, repeatMode, 4), "fidesmoUnknownFloatPhase", gapComposer3, 29112, 0);
            int i17 = i5;
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, EasingKt.FastOutSlowInEasing, 2), "fidesmoUnknownSettle", null, gapComposer3, 3072, 20);
            Float valueOf = (!(scanningStarPlacement instanceof ScanningStarPlacement.Unknown) || ((int) (j & BodyPartID.bodyIdMax)) <= 0) ? null : Float.valueOf(TransactorKt.lerp((((float) Math.sin(((Number) animateFloat.value$delegate.getValue()).floatValue() * 6.283185307179586d)) * 0.25f) + 0.35000002f, 0.3f, ((Number) animateFloatAsState.getValue()).floatValue()));
            TweenSpec tween$default2 = AnimatableKt.tween$default(6500, 0, drop$$ExternalSyntheticBUOutline0, 2);
            RepeatMode repeatMode2 = RepeatMode.Reverse;
            InfiniteTransition.TransitionAnimationState animateFloat2 = ArcSplineKt.animateFloat(rememberInfiniteTransition, RecyclerView.DECELERATION_RATE, 1.0f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(tween$default2, repeatMode2, 4), "fidesmoBouncePongX", gapComposer3, 29112, 0);
            InfiniteTransition.TransitionAnimationState animateFloat3 = ArcSplineKt.animateFloat(rememberInfiniteTransition, RecyclerView.DECELERATION_RATE, 1.0f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.tween$default(4900, 0, drop$$ExternalSyntheticBUOutline0, 2), repeatMode2, 4), "fidesmoBouncePongY", gapComposer3, 29112, 0);
            if (!(scanningStarPlacement instanceof ScanningStarPlacement.Bounce) || (i12 = (int) (j >> 32)) <= 0 || (i13 = (int) (j & BodyPartID.bodyIdMax)) <= 0) {
                f2 = 1.0f;
                i7 = i16;
                pair = null;
            } else {
                f2 = 1.0f;
                i7 = i16;
                float f3 = i7 / 2.0f;
                float f4 = f3 / i12;
                if (f4 > 0.5f) {
                    f4 = 0.5f;
                }
                float f5 = f3 / i13;
                if (f5 > 0.5f) {
                    f5 = 0.5f;
                }
                pair = new Pair(Float.valueOf(TransactorKt.lerp(TransactorKt.lerp(f4, 1.0f - f4, ((Number) animateFloat2.value$delegate.getValue()).floatValue()), 0.5f, ((Number) animateFloatAsState.getValue()).floatValue())), Float.valueOf(TransactorKt.lerp(TransactorKt.lerp(f5, 1.0f - f5, ((Number) animateFloat3.value$delegate.getValue()).floatValue()), 0.3f, ((Number) animateFloatAsState.getValue()).floatValue())));
            }
            List list = SNAKE_PATH;
            InfiniteRepeatableSpec m154infiniteRepeatable9IiC70o$default = AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.tween$default(list.size() * 6125, 0, drop$$ExternalSyntheticBUOutline0, 2), repeatMode, 4);
            int i18 = i7;
            InfiniteTransition.TransitionAnimationState animateFloat4 = ArcSplineKt.animateFloat(rememberInfiniteTransition, RecyclerView.DECELERATION_RATE, 1.0f, m154infiniteRepeatable9IiC70o$default, "fidesmoSnakePhase", gapComposer3, 29112, 0);
            if (!(scanningStarPlacement instanceof ScanningStarPlacement.Snake) || (i10 = (int) (j >> 32)) <= 0 || (i11 = (int) (j & BodyPartID.bodyIdMax)) <= 0) {
                pair2 = null;
            } else {
                float f6 = i18 / 2.0f;
                float f7 = f6 / i10;
                if (f7 > 0.5f) {
                    f7 = 0.5f;
                }
                float f8 = f6 / i11;
                if (f8 > 0.5f) {
                    f8 = 0.5f;
                }
                int size = list.size();
                float floatValue = ((Number) animateFloat4.value$delegate.getValue()).floatValue() * size;
                int coerceIn = RangesKt___RangesKt.coerceIn((int) floatValue, 0, size - 1);
                float coerceIn2 = RangesKt___RangesKt.coerceIn(floatValue - coerceIn, RecyclerView.DECELERATION_RATE, f2);
                float f9 = (3.0f - (coerceIn2 * 2.0f)) * coerceIn2 * coerceIn2;
                Pair pair3 = (Pair) list.get(coerceIn);
                Pair pair4 = (Pair) list.get((coerceIn + 1) % size);
                float f10 = 1.0f - f7;
                float f11 = 1.0f - f8;
                pair2 = new Pair(Float.valueOf(TransactorKt.lerp(TransactorKt.lerp(TransactorKt.lerp(f7, f10, ((Number) pair3.first).floatValue()), TransactorKt.lerp(f7, f10, ((Number) pair4.first).floatValue()), f9), 0.5f, ((Number) animateFloatAsState.getValue()).floatValue())), Float.valueOf(TransactorKt.lerp(TransactorKt.lerp(TransactorKt.lerp(f8, f11, ((Number) pair3.second).floatValue()), TransactorKt.lerp(f8, f11, ((Number) pair4.second).floatValue()), f9), 0.3f, ((Number) animateFloatAsState.getValue()).floatValue())));
            }
            if (pair == null) {
                pair = pair2;
            }
            if (valueOf != null) {
                i8 = i17;
                i9 = MathKt__MathJVMKt.roundToInt((valueOf.floatValue() * ((int) (j & BodyPartID.bodyIdMax))) - (i8 / 2.0f));
            } else {
                i8 = i17;
                if (pair != null) {
                    i9 = MathKt__MathJVMKt.roundToInt((((Number) pair.second).floatValue() * ((int) (j & BodyPartID.bodyIdMax))) - (i8 / 2.0f));
                } else {
                    scanningStarLayout = scanningStarLayout2;
                    i9 = (int) (scanningStarLayout.offset & BodyPartID.bodyIdMax);
                    int roundToInt4 = pair == null ? MathKt__MathJVMKt.roundToInt((((Number) pair.first).floatValue() * ((int) (j >> 32))) - (i8 / 2.0f)) : (int) (scanningStarLayout.offset >> 32);
                    if (valueOf == null) {
                        float floatValue2 = valueOf.floatValue() * ((int) (j & BodyPartID.bodyIdMax));
                        i3 = i;
                        if (floatValue2 + (i18 / 2.0f) > i3) {
                            z3 = true;
                            Boolean valueOf2 = Boolean.valueOf(z3);
                            changed = gapComposer3.changed(z3);
                            rememberedValue = gapComposer3.rememberedValue();
                            if (!changed || rememberedValue == obj) {
                                function12 = function1;
                                rememberedValue = new CardSchemePresenter$complete$2(2, null, function12, z3);
                                gapComposer3.updateRememberedValue(rememberedValue);
                            } else {
                                function12 = function1;
                            }
                            Updater.LaunchedEffect(gapComposer3, valueOf2, (Function2) rememberedValue);
                            BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                            float mo233toDpu2uoSUM = density.mo233toDpu2uoSUM(roundToInt4);
                            float mo233toDpu2uoSUM2 = density.mo233toDpu2uoSUM(i9);
                            scanningPulseStyle2 = scanningPulseStyle;
                            ordinal = scanningPulseStyle2.shape.ordinal();
                            if (ordinal != 0) {
                                ScanningStarPulseParams scanningStarPulseParams = scanningPulseStyle2.starParams;
                                float f12 = scanningStarPulseParams.starSize;
                                float f13 = scanningStarPulseParams.starScale;
                                float f14 = scanningStarPulseParams.fillDurationSeconds;
                                float f15 = scanningStarPulseParams.beatDurationSeconds;
                                float f16 = scanningStarPulseParams.cellSize;
                                float f17 = scanningStarPulseParams.gap;
                                float f18 = scanningStarPulseParams.cornerRadius;
                                float f19 = scanningStarPulseParams.spread;
                                float f20 = scanningStarPulseParams.twinkleSpeed;
                                float f21 = scanningStarPulseParams.primaryOpacity;
                                float f22 = scanningStarPulseParams.glowScale;
                                float f23 = scanningStarPulseParams.glowAlpha;
                                float f24 = scanningStarPulseParams.glowBlur;
                                float f25 = scanningStarPulseParams.glowPulseAmount;
                                float f26 = scanningStarPulseParams.glowPulseDurationSeconds;
                                float f27 = scanningStarPulseParams.targetFillDurationSeconds;
                                float f28 = scanningStarPulseParams.targetShapeScaleBoost;
                                long j2 = scanningStarPulseParams.targetHoldMillis;
                                float f29 = scanningStarPulseParams.targetSpringDamping;
                                float f30 = scanningStarPulseParams.targetSpringStiffness;
                                float f31 = scanningStarPulseParams.stepTurnRotationDegrees;
                                int i19 = scanningStarPulseParams.stepTurnMaxTurnsPerSpring;
                                float f32 = scanningStarPulseParams.stepTurnOrbPeakScale;
                                long j3 = scanningStarPulseParams.stepTurnHoldMillis;
                                float f33 = scanningStarPulseParams.orbTurnDamping;
                                float f34 = scanningStarPulseParams.orbTurnStiffness;
                                float f35 = scanningStarPulseParams.starTurnDamping;
                                float f36 = scanningStarPulseParams.starTurnStiffness;
                                float f37 = scanningStarPulseParams.orbReturnDamping;
                                float f38 = scanningStarPulseParams.orbReturnStiffness;
                                ShapeStabilityAnimationParams shapeStabilityAnimationParams = scanningStarPulseParams.stabilityAnimationParams;
                                shapeStabilityAnimationParams.getClass();
                                copy$default = ScanningPulseStyle.copy$default(scanningPulseStyle2, new ScanningStarPulseParams(biasAlignment, mo233toDpu2uoSUM, mo233toDpu2uoSUM2, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, j2, f29, f30, f31, i19, f32, j3, f33, f34, f35, f36, f37, f38, shapeStabilityAnimationParams), null, null, 13);
                            } else if (ordinal == 1) {
                                ScanningHeartPulseParams scanningHeartPulseParams = scanningPulseStyle2.heartParams;
                                float f39 = scanningHeartPulseParams.heartSize;
                                float f40 = scanningHeartPulseParams.heartScale;
                                float f41 = scanningHeartPulseParams.fillDurationSeconds;
                                float f42 = scanningHeartPulseParams.beatDurationSeconds;
                                float f43 = scanningHeartPulseParams.cellSize;
                                float f44 = scanningHeartPulseParams.gap;
                                float f45 = scanningHeartPulseParams.cornerRadius;
                                float f46 = scanningHeartPulseParams.spread;
                                float f47 = scanningHeartPulseParams.twinkleSpeed;
                                float f48 = scanningHeartPulseParams.primaryOpacity;
                                float f49 = scanningHeartPulseParams.glowScale;
                                float f50 = scanningHeartPulseParams.glowAlpha;
                                float f51 = scanningHeartPulseParams.glowBlur;
                                float f52 = scanningHeartPulseParams.glowPulseAmount;
                                float f53 = scanningHeartPulseParams.glowPulseDurationSeconds;
                                float f54 = scanningHeartPulseParams.targetFillDurationSeconds;
                                float f55 = scanningHeartPulseParams.targetShapeScaleBoost;
                                long j4 = scanningHeartPulseParams.targetHoldMillis;
                                float f56 = scanningHeartPulseParams.targetSpringDamping;
                                float f57 = scanningHeartPulseParams.targetSpringStiffness;
                                float f58 = scanningHeartPulseParams.stepTurnRotationDegrees;
                                int i20 = scanningHeartPulseParams.stepTurnMaxTurnsPerSpring;
                                float f59 = scanningHeartPulseParams.stepTurnOrbPeakScale;
                                long j5 = scanningHeartPulseParams.stepTurnHoldMillis;
                                float f60 = scanningHeartPulseParams.orbTurnDamping;
                                float f61 = scanningHeartPulseParams.orbTurnStiffness;
                                float f62 = scanningHeartPulseParams.heartTurnDamping;
                                float f63 = scanningHeartPulseParams.heartTurnStiffness;
                                float f64 = scanningHeartPulseParams.orbReturnDamping;
                                float f65 = scanningHeartPulseParams.orbReturnStiffness;
                                ShapeStabilityAnimationParams shapeStabilityAnimationParams2 = scanningHeartPulseParams.stabilityAnimationParams;
                                shapeStabilityAnimationParams2.getClass();
                                copy$default = ScanningPulseStyle.copy$default(scanningPulseStyle2, null, new ScanningHeartPulseParams(biasAlignment, mo233toDpu2uoSUM, mo233toDpu2uoSUM2, f39, f40, f41, f42, f43, f44, f45, f46, f47, f48, f49, f50, f51, f52, f53, f54, f55, j4, f56, f57, f58, i20, f59, j5, f60, f61, f62, f63, f64, f65, shapeStabilityAnimationParams2), null, 11);
                            } else {
                                if (ordinal != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                }
                                ScanningCardPulseParams scanningCardPulseParams = scanningPulseStyle2.cardParams;
                                float f66 = scanningCardPulseParams.cardSize;
                                float f67 = scanningCardPulseParams.cardScale;
                                float f68 = scanningCardPulseParams.fillDurationSeconds;
                                float f69 = scanningCardPulseParams.beatDurationSeconds;
                                float f70 = scanningCardPulseParams.cellSize;
                                float f71 = scanningCardPulseParams.gap;
                                float f72 = scanningCardPulseParams.cornerRadius;
                                float f73 = scanningCardPulseParams.spread;
                                float f74 = scanningCardPulseParams.twinkleSpeed;
                                float f75 = scanningCardPulseParams.primaryOpacity;
                                float f76 = scanningCardPulseParams.glowScale;
                                float f77 = scanningCardPulseParams.glowAlpha;
                                float f78 = scanningCardPulseParams.glowBlur;
                                float f79 = scanningCardPulseParams.glowPulseAmount;
                                float f80 = scanningCardPulseParams.glowPulseDurationSeconds;
                                float f81 = scanningCardPulseParams.targetFillDurationSeconds;
                                float f82 = scanningCardPulseParams.targetShapeScaleBoost;
                                long j6 = scanningCardPulseParams.targetHoldMillis;
                                float f83 = scanningCardPulseParams.targetSpringDamping;
                                float f84 = scanningCardPulseParams.targetSpringStiffness;
                                float f85 = scanningCardPulseParams.stepTurnRotationDegrees;
                                int i21 = scanningCardPulseParams.stepTurnMaxTurnsPerSpring;
                                float f86 = scanningCardPulseParams.stepTurnOrbPeakScale;
                                long j7 = scanningCardPulseParams.stepTurnHoldMillis;
                                float f87 = scanningCardPulseParams.orbTurnDamping;
                                float f88 = scanningCardPulseParams.orbTurnStiffness;
                                float f89 = scanningCardPulseParams.cardTurnDamping;
                                float f90 = scanningCardPulseParams.cardTurnStiffness;
                                float f91 = scanningCardPulseParams.orbReturnDamping;
                                float f92 = scanningCardPulseParams.orbReturnStiffness;
                                ShapeStabilityAnimationParams shapeStabilityAnimationParams3 = scanningCardPulseParams.stabilityAnimationParams;
                                shapeStabilityAnimationParams3.getClass();
                                copy$default = ScanningPulseStyle.copy$default(scanningPulseStyle2, null, null, new ScanningCardPulseParams(biasAlignment, mo233toDpu2uoSUM, mo233toDpu2uoSUM2, f66, f67, f68, f69, f70, f71, f72, f73, f74, f75, f76, f77, f78, f79, f80, f81, f82, j6, f83, f84, f85, i21, f86, j7, f87, f88, f89, f90, f91, f92, shapeStabilityAnimationParams3), 7);
                            }
                            ordinal2 = copy$default.shape.ordinal();
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            if (ordinal2 != 0) {
                                function06 = function08;
                                function07 = function09;
                                gapComposer3.startReplaceGroup(1375829686);
                                int i22 = i4 >> 6;
                                ScanningStarPulseKt.ScanningStarPulse(SizeKt.fillMaxSize(companion, 1.0f), copy$default.starParams, scanningStepAnimationTrigger, (Integer) mutableState.getValue(), f, function0, function06, function07, gapComposer3, (i22 & 458752) | (i22 & 896) | 6 | ((i4 >> 3) & 57344) | 14155776);
                                gapComposer2 = gapComposer3;
                                gapComposer2.end(false);
                            } else if (ordinal2 == 1) {
                                function06 = function08;
                                function07 = function09;
                                gapComposer3.startReplaceGroup(1375846168);
                                int i23 = i4 >> 6;
                                ScanningHeartPulseKt.ScanningHeartPulse(SizeKt.fillMaxSize(companion, 1.0f), copy$default.heartParams, scanningStepAnimationTrigger, (Integer) mutableState.getValue(), f, function0, function06, function07, gapComposer3, (i23 & 458752) | (i23 & 896) | 6 | ((i4 >> 3) & 57344) | 14155776);
                                gapComposer2 = gapComposer3;
                                gapComposer2.end(false);
                            } else {
                                if (ordinal2 != 2) {
                                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 1375828737, false);
                                }
                                gapComposer3.startReplaceGroup(1375862678);
                                int i24 = i4 >> 6;
                                function06 = function08;
                                function07 = function09;
                                SectionUIKt.ScanningCardPulse(SizeKt.fillMaxSize(companion, 1.0f), copy$default.cardParams, scanningStepAnimationTrigger, (Integer) mutableState.getValue(), f, function0, function06, function07, gapComposer3, (i24 & 458752) | (i24 & 896) | 6 | ((i4 >> 3) & 57344) | 14155776);
                                gapComposer2 = gapComposer3;
                                gapComposer2.end(false);
                            }
                            gapComposer = gapComposer2;
                            function04 = function06;
                            function05 = function07;
                        }
                        z3 = false;
                        Boolean valueOf22 = Boolean.valueOf(z3);
                        changed = gapComposer3.changed(z3);
                        rememberedValue = gapComposer3.rememberedValue();
                        if (changed) {
                        }
                        function12 = function1;
                        rememberedValue = new CardSchemePresenter$complete$2(2, null, function12, z3);
                        gapComposer3.updateRememberedValue(rememberedValue);
                        Updater.LaunchedEffect(gapComposer3, valueOf22, (Function2) rememberedValue);
                        BiasAlignment biasAlignment2 = Alignment.Companion.TopStart;
                        float mo233toDpu2uoSUM3 = density.mo233toDpu2uoSUM(roundToInt4);
                        float mo233toDpu2uoSUM22 = density.mo233toDpu2uoSUM(i9);
                        scanningPulseStyle2 = scanningPulseStyle;
                        ordinal = scanningPulseStyle2.shape.ordinal();
                        if (ordinal != 0) {
                        }
                        ordinal2 = copy$default.shape.ordinal();
                        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                        if (ordinal2 != 0) {
                        }
                        gapComposer = gapComposer2;
                        function04 = function06;
                        function05 = function07;
                    } else {
                        i3 = i;
                        if (pair == null) {
                            z3 = scanningStarLayout.placeInstructionBlockAtTop;
                            Boolean valueOf222 = Boolean.valueOf(z3);
                            changed = gapComposer3.changed(z3);
                            rememberedValue = gapComposer3.rememberedValue();
                            if (changed) {
                            }
                            function12 = function1;
                            rememberedValue = new CardSchemePresenter$complete$2(2, null, function12, z3);
                            gapComposer3.updateRememberedValue(rememberedValue);
                            Updater.LaunchedEffect(gapComposer3, valueOf222, (Function2) rememberedValue);
                            BiasAlignment biasAlignment22 = Alignment.Companion.TopStart;
                            float mo233toDpu2uoSUM32 = density.mo233toDpu2uoSUM(roundToInt4);
                            float mo233toDpu2uoSUM222 = density.mo233toDpu2uoSUM(i9);
                            scanningPulseStyle2 = scanningPulseStyle;
                            ordinal = scanningPulseStyle2.shape.ordinal();
                            if (ordinal != 0) {
                            }
                            ordinal2 = copy$default.shape.ordinal();
                            Modifier.Companion companion22 = Modifier.Companion.$$INSTANCE;
                            if (ordinal2 != 0) {
                            }
                            gapComposer = gapComposer2;
                            function04 = function06;
                            function05 = function07;
                        }
                        z3 = false;
                        Boolean valueOf2222 = Boolean.valueOf(z3);
                        changed = gapComposer3.changed(z3);
                        rememberedValue = gapComposer3.rememberedValue();
                        if (changed) {
                        }
                        function12 = function1;
                        rememberedValue = new CardSchemePresenter$complete$2(2, null, function12, z3);
                        gapComposer3.updateRememberedValue(rememberedValue);
                        Updater.LaunchedEffect(gapComposer3, valueOf2222, (Function2) rememberedValue);
                        BiasAlignment biasAlignment222 = Alignment.Companion.TopStart;
                        float mo233toDpu2uoSUM322 = density.mo233toDpu2uoSUM(roundToInt4);
                        float mo233toDpu2uoSUM2222 = density.mo233toDpu2uoSUM(i9);
                        scanningPulseStyle2 = scanningPulseStyle;
                        ordinal = scanningPulseStyle2.shape.ordinal();
                        if (ordinal != 0) {
                        }
                        ordinal2 = copy$default.shape.ordinal();
                        Modifier.Companion companion222 = Modifier.Companion.$$INSTANCE;
                        if (ordinal2 != 0) {
                        }
                        gapComposer = gapComposer2;
                        function04 = function06;
                        function05 = function07;
                    }
                }
            }
            scanningStarLayout = scanningStarLayout2;
            if (pair == null) {
            }
            if (valueOf == null) {
            }
        } else {
            function12 = function1;
            i3 = i;
            gapComposer3.skipToGroupEnd();
            function04 = function02;
            gapComposer = gapComposer3;
            function05 = function03;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final Function1 function13 = function12;
            final int i25 = i3;
            final ScanningPulseStyle scanningPulseStyle3 = scanningPulseStyle2;
            endRestartGroup.block = new Function2(j, scanningStarPlacement, i25, scanningPulseStyle3, scanningStepAnimationTrigger, f, z, function0, function04, function05, function13, i2) { // from class: com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt$$ExternalSyntheticLambda58
                public final /* synthetic */ long f$0;
                public final /* synthetic */ ScanningStarPlacement f$1;
                public final /* synthetic */ Function1 f$10;
                public final /* synthetic */ int f$2;
                public final /* synthetic */ ScanningPulseStyle f$3;
                public final /* synthetic */ ScanningStepAnimationTrigger f$4;
                public final /* synthetic */ float f$5;
                public final /* synthetic */ boolean f$6;
                public final /* synthetic */ Function0 f$7;
                public final /* synthetic */ Function0 f$8;
                public final /* synthetic */ Function0 f$9;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    FidesmoProvisioningViewKt.m3537PositionedScanningPulsez0pNpkI(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, (Composer) obj2, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Throwable] */
    public static final void PreScanContent(FidesmoProvisioningViewModel.PreScanInstructions preScanInstructions, Function1 function1, ScrollState scrollState, Composer composer, int i) {
        int i2;
        Function1 function12;
        GapComposer gapComposer;
        FidesmoProvisioningViewModel.PreScanInstructions preScanInstructions2;
        ScrollState scrollState2;
        ScrollState rememberScrollState;
        int i3;
        ScrollState scrollState3;
        MutableState mutableState;
        boolean z;
        Continuation continuation;
        ScrollState scrollState4;
        ListUnordered listUnordered;
        preScanInstructions.getClass();
        String str = preScanInstructions.startButtonPreScrollText;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-429327159);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(preScanInstructions) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                rememberScrollState = ImageKt.rememberScrollState(gapComposer2);
                i3 = i2 & (-897);
            } else {
                gapComposer2.skipToGroupEnd();
                i3 = i2 & (-897);
                rememberScrollState = scrollState;
            }
            gapComposer2.endDefaults();
            UriHandler uriHandler = (UriHandler) gapComposer2.consume(CompositionLocalsKt.LocalUriHandler);
            boolean booleanValue = ((Boolean) gapComposer2.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier animateContentSize$default = booleanValue ? companion : AnimatedContentKt.animateContentSize$default(companion, null, 3);
            List list = preScanInstructions.infoCards;
            int i4 = i3;
            ListUnordered listUnordered2 = preScanInstructions.instructions;
            String str2 = preScanInstructions.startButtonText;
            boolean z2 = str != null;
            boolean changed = gapComposer2.changed(str);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline1.m(!z2, gapComposer2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            Integer valueOf = Integer.valueOf(rememberScrollState.viewportSize$delegate.getIntValue());
            Boolean valueOf2 = Boolean.valueOf(rememberScrollState.getCanScrollForward());
            boolean changed2 = gapComposer2.changed(z2) | gapComposer2.changed(rememberScrollState) | gapComposer2.changed(mutableState2);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                scrollState3 = rememberScrollState;
                mutableState = mutableState2;
                z = z2;
                continuation = null;
                rememberedValue2 = new InteractiveCardState$animateLock$2(z, scrollState3, mutableState, continuation, 8);
                gapComposer2.updateRememberedValue(rememberedValue2);
            } else {
                scrollState3 = rememberScrollState;
                mutableState = mutableState2;
                z = z2;
                continuation = null;
            }
            Updater.LaunchedEffect(str, valueOf, valueOf2, (Function2) rememberedValue2, gapComposer2);
            if (((Boolean) mutableState.getValue()).booleanValue() || str == null) {
                str = str2;
            }
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                ?? r3 = continuation;
                Updater.invalidApplier();
                throw r3;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf3 = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf3, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            NavigationType navigationType = NavigationType.CLOSE;
            boolean z3 = (i4 & 112) == 32;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (z3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new SafetyHubViewKt$$ExternalSyntheticLambda9(26, function1);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Modifier modifier = animateContentSize$default;
            GapComposer gapComposer3 = gapComposer2;
            String str3 = str;
            boolean z4 = z;
            MutableState mutableState3 = mutableState;
            ScrollState scrollState5 = scrollState3;
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue3, (Modifier) null, (Function3) null, gapComposer3, 54, 108);
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), true);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(companion, 1.0f), scrollState5, false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 0);
            int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, verticalScroll$default);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            String str4 = preScanInstructions.imageUrl;
            if (str4 == null) {
                gapComposer3.startReplaceGroup(-1607631771);
                gapComposer3.end(false);
                scrollState4 = scrollState5;
            } else {
                gapComposer3.startReplaceGroup(-1607631770);
                scrollState4 = scrollState5;
                AsyncImageKt.m1438AsyncImage10Xjiaw(str4, null, SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 240.0f, RecyclerView.DECELERATION_RATE, 2).then(modifier), null, ContentScale.Companion.FillWidth, null, gapComposer3, 1572912, 1976);
                gapComposer3 = gapComposer3;
                gapComposer3.end(false);
            }
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
            Strings.getSizes(gapComposer3).getClass();
            DefaultSizes.spacing.getClass();
            GapComposer gapComposer4 = gapComposer3;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer3).semantic.text.standard, (Composer) gapComposer4, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer3).headlineLarge, (TextLineBalancing) null, preScanInstructions.title, (Map) null, (Function1) null, false);
            GapComposer gapComposer5 = gapComposer4;
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer5, null);
            if (listUnordered2 == null) {
                gapComposer5.startReplaceGroup(-1606931636);
                gapComposer5.end(false);
                listUnordered = listUnordered2;
            } else {
                gapComposer5.startReplaceGroup(-1606931635);
                listUnordered = listUnordered2;
                InstructionList(listUnordered, SizeKt.fillMaxWidth(companion, 1.0f), gapComposer5, 48);
                gapComposer5.end(false);
            }
            if (list.isEmpty()) {
                gapComposer5.startReplaceGroup(-1606627897);
                gapComposer5.end(false);
            } else {
                gapComposer5.startReplaceGroup(-1606766281);
                if (listUnordered != null) {
                    gapComposer5.startReplaceGroup(-1606725454);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer5, null);
                    gapComposer5.end(false);
                } else {
                    gapComposer5.startReplaceGroup(-1606674521);
                    gapComposer5.end(false);
                }
                InfoCards(0, gapComposer5, list);
                gapComposer5.end(false);
            }
            preScanInstructions2 = preScanInstructions;
            String str5 = preScanInstructions2.disclosureText;
            if (str5 == null) {
                gapComposer5.startReplaceGroup(-1606582452);
                gapComposer5.end(false);
            } else {
                gapComposer5.startReplaceGroup(-1606582451);
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer5, null);
                boolean changedInstance = gapComposer5.changedInstance(uriHandler);
                Object rememberedValue4 = gapComposer5.rememberedValue();
                if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new BookletTileKt$$ExternalSyntheticLambda0(uriHandler, 1);
                    gapComposer5.updateRememberedValue(rememberedValue4);
                }
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                Strings.getSizes(gapComposer5).getClass();
                LazyDslKt.m304MarkdownTextpCuZGqc(str5, (Function2) rememberedValue4, SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer5).bodyXSmall, Strings.getColors(gapComposer5).semantic.text.standard, null, null, null, 0, 0, 0, gapComposer5, 0, 2016);
                gapComposer5 = gapComposer5;
                gapComposer5.end(false);
            }
            gapComposer5.end(true);
            gapComposer5.end(true);
            function12 = function1;
            GapComposer gapComposer6 = gapComposer5;
            DimensionKt.ButtonCtaGroup(ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(gapComposer5).semantic.background.f1047app, ColorKt.RectangleShape), scrollState4.getCanScrollForward(), null, null, Expect_jvmKt.rememberComposableLambda(1497579585, new AccountUiViewKt$$ExternalSyntheticLambda14(z4, function12, mutableState3, str3), gapComposer5), gapComposer6, 24576, 12);
            gapComposer = gapComposer6;
            gapComposer.end(true);
            scrollState2 = scrollState4;
        } else {
            function12 = function1;
            gapComposer = gapComposer2;
            preScanInstructions2 = preScanInstructions;
            gapComposer.skipToGroupEnd();
            scrollState2 = scrollState;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1((Object) preScanInstructions2, function12, (Object) scrollState2, i, 22);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v7, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r2v14, types: [int] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44, types: [int] */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v60 */
    public static final void ProvisionSuccess(FidesmoProvisioningViewModel.Success.Provisioned provisioned, Function1 function1, boolean z, Composer composer, int i) {
        boolean z2;
        boolean z3;
        Object roomDatabase$performClear$1;
        ScrollState scrollState;
        float f;
        NeverEqualPolicy neverEqualPolicy;
        int i2;
        boolean z4;
        boolean z5;
        ?? r12;
        GapComposer gapComposer;
        ?? r2;
        NeverEqualPolicy neverEqualPolicy2;
        boolean z6;
        ?? r9;
        GapComposer gapComposer2;
        FidesmoProvisioningViewModel.Success.Provisioned provisioned2 = provisioned;
        Function1 function12 = function1;
        provisioned2.getClass();
        function12.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(700074593);
        Applier applier = gapComposer3.applier;
        int i3 = (i & 6) == 0 ? (gapComposer3.changedInstance(provisioned2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= gapComposer3.changedInstance(function12) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= 128;
        }
        if (gapComposer3.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            gapComposer3.startDefaults();
            if ((i & 1) == 0 || gapComposer3.getDefaultsInvalid()) {
                z3 = !((Boolean) gapComposer3.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            } else {
                gapComposer3.skipToGroupEnd();
                z3 = z;
            }
            gapComposer3.endDefaults();
            float m1043getHeightD9Ej5fM = DpSize.m1043getHeightD9Ej5fM(((LazyWindowInfo) ((WindowInfo) gapComposer3.consume(CompositionLocalsKt.LocalWindowInfo))).m938getContainerDpSizeMYxV2XQ()) * 0.5f;
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer3);
            boolean changed = gapComposer3.changed(provisioned2) | gapComposer3.changed(z3);
            Object rememberedValue = gapComposer3.rememberedValue();
            NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy3) {
                rememberedValue = Recorder$$ExternalSyntheticOutline1.m(!z3, gapComposer3);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState.getValue()).booleanValue() ? 1.0f : 0.0f, AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, SuccessAnimationTiming.contentRevealEasing, 2), "success_content_reveal", null, gapComposer3, 3120, 20);
            Boolean valueOf = Boolean.valueOf(z3);
            boolean changed2 = gapComposer3.changed(mutableState) | gapComposer3.changed(z3) | gapComposer3.changedInstance(provisioned2);
            Object rememberedValue2 = gapComposer3.rememberedValue();
            Continuation continuation = null;
            if (changed2 || rememberedValue2 == neverEqualPolicy3) {
                boolean z7 = z3;
                scrollState = rememberScrollState;
                f = m1043getHeightD9Ej5fM;
                neverEqualPolicy = neverEqualPolicy3;
                i2 = 2;
                roomDatabase$performClear$1 = new RoomDatabase$performClear$1(z7, provisioned, mutableState, continuation, 9);
                z4 = z7;
                provisioned2 = provisioned;
                gapComposer3.updateRememberedValue(roomDatabase$performClear$1);
            } else {
                neverEqualPolicy = neverEqualPolicy3;
                i2 = 2;
                z4 = z3;
                roomDatabase$performClear$1 = rememberedValue2;
                scrollState = rememberScrollState;
                f = m1043getHeightD9Ej5fM;
            }
            Updater.LaunchedEffect(provisioned2, valueOf, (Function2) roomDatabase$performClear$1, gapComposer3);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Strings.getSizes(gapComposer3).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxSize, 16.0f, RecyclerView.DECELERATION_RATE, i2);
            Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceBetween;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Center$1, horizontal, gapComposer3, 6);
            ScrollState scrollState2 = scrollState;
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m300paddingVpY3zN4$default);
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
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf2 = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf2, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, companion);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
            boolean changed3 = gapComposer3.changed(animateFloatAsState) | gapComposer3.changed(scrollState2);
            Object rememberedValue3 = gapComposer3.rememberedValue();
            if (changed3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new GLSceneScope$$ExternalSyntheticLambda10(7, scrollState2, animateFloatAsState);
                gapComposer3.updateRememberedValue(rememberedValue3);
            }
            Modifier offset = OffsetKt.offset(fillMaxSize2, (Function1) rememberedValue3);
            TagFormFactor tagFormFactor = provisioned2.formFactor;
            FidesmoProvisioningViewModel.Success.Provisioned.Tile tile = provisioned2.tile;
            List<FidesmoProvisioningViewModel.Success.Provisioned.Card> list = provisioned2.cards;
            SuccessAnimation(0, gapComposer3, offset, tagFormFactor, z4);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(companion, 1.0f), scrollState2, false, 14);
            boolean changed4 = gapComposer3.changed(animateFloatAsState);
            Object rememberedValue4 = gapComposer3.rememberedValue();
            if (changed4 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new MoneyTabUIKt$$ExternalSyntheticLambda10(animateFloatAsState, 9);
                gapComposer3.updateRememberedValue(rememberedValue4);
            }
            Modifier graphicsLayer = ColorKt.graphicsLayer(verticalScroll$default, (Function1) rememberedValue4);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer3, 0);
            int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, graphicsLayer);
            gapComposer3.startReusableNode();
            boolean z8 = z4;
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
            NeverEqualPolicy neverEqualPolicy4 = neverEqualPolicy;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer3).semantic.text.brand, (Composer) gapComposer3, (Modifier) null, Strings.getTypography(gapComposer3).headlineSmall, (TextLineBalancing) null, provisioned2.title, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer3).semantic.text.standard, (Composer) gapComposer3, (Modifier) null, Strings.getTypography(gapComposer3).headlineSmall, (TextLineBalancing) null, provisioned2.message, (Map) null, (Function1) null, false);
            GapComposer gapComposer4 = gapComposer3;
            SpacerKt.Spacer(gapComposer4, SizeKt.m277height3ABfNKs(companion, f));
            FidesmoProvisioningViewModel.Success.Provisioned.BookletGrid bookletGrid = provisioned2.bookletGrid;
            if (bookletGrid == null) {
                gapComposer4.startReplaceGroup(-2053854577);
                z5 = 0;
                gapComposer4.end(false);
                r12 = gapComposer4;
            } else {
                gapComposer4.startReplaceGroup(-2053854576);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer4, (Modifier) null, Strings.getTypography(gapComposer4).headlineSmall, (TextLineBalancing) null, bookletGrid.headline, (Map) null, (Function1) null, false);
                GapComposer gapComposer5 = gapComposer4;
                z5 = 0;
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer5, null);
                SuccessGrid(0, gapComposer5, bookletGrid.items);
                gapComposer5.end(false);
                r12 = gapComposer5;
            }
            if (tile == null) {
                r12.startReplaceGroup(-2053670034);
                r12.end(z5);
                r2 = z5;
                gapComposer = r12;
            } else {
                r12.startReplaceGroup(-2053670033);
                DBUtil.SpacerBetweenSectionXLarge(z5, 1, r12, null);
                GapComposer gapComposer6 = r12;
                boolean z9 = z5;
                BookletGridKt.m3424BookletTileeHTjO5g(SizeKt.fillMaxWidth(companion, 1.0f), tile.title, tile.body, tile.image, 196.0f, null, null, gapComposer6, 221190, 192);
                GapComposer gapComposer7 = gapComposer6;
                gapComposer7.end(z9);
                r2 = z9;
                gapComposer = gapComposer7;
            }
            if (list.isEmpty()) {
                boolean z10 = r2;
                neverEqualPolicy2 = neverEqualPolicy4;
                gapComposer.startReplaceGroup(-2052981585);
                gapComposer.end(z10);
                z6 = z10;
            } else {
                gapComposer.startReplaceGroup(-2053313130);
                UriHandler uriHandler = (UriHandler) gapComposer.consume(CompositionLocalsKt.LocalUriHandler);
                DBUtil.SpacerBetweenSectionXLarge(r2, 1, gapComposer, null);
                Strings.getSizes(gapComposer).getClass();
                ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer, r2);
                int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, companion);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                gapComposer.startReplaceGroup(1963950546);
                for (FidesmoProvisioningViewModel.Success.Provisioned.Card card : list) {
                    boolean changedInstance = gapComposer.changedInstance(uriHandler);
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy5 = neverEqualPolicy4;
                    if (changedInstance || rememberedValue5 == neverEqualPolicy5) {
                        rememberedValue5 = new RecipientQueries$$ExternalSyntheticLambda0(uriHandler, 28);
                        gapComposer.updateRememberedValue(rememberedValue5);
                    }
                    SuccessCard(card, (Function1) rememberedValue5, gapComposer, 0);
                    neverEqualPolicy4 = neverEqualPolicy5;
                }
                neverEqualPolicy2 = neverEqualPolicy4;
                z6 = false;
                Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, false);
            }
            String str = provisioned2.disclosureText;
            if (str == null) {
                gapComposer.startReplaceGroup(-2052933536);
                gapComposer.end(z6);
                r9 = z6;
                gapComposer2 = gapComposer;
            } else {
                gapComposer.startReplaceGroup(-2052933535);
                if (tile == null || !list.isEmpty()) {
                    gapComposer.startReplaceGroup(-1921549601);
                    DBUtil.SpacerBetweenSectionXLarge(z6 ? 1 : 0, 1, gapComposer, null);
                    gapComposer.end(z6);
                } else {
                    gapComposer.startReplaceGroup(-1921608160);
                    DBUtil.SpacerBetweenSectionLarge(z6 ? 1 : 0, 1, gapComposer, null);
                    gapComposer.end(z6);
                }
                UriHandler uriHandler2 = (UriHandler) gapComposer.consume(CompositionLocalsKt.LocalUriHandler);
                boolean changedInstance2 = gapComposer.changedInstance(uriHandler2);
                Object rememberedValue6 = gapComposer.rememberedValue();
                Object obj = rememberedValue6;
                if (changedInstance2 || rememberedValue6 == neverEqualPolicy2) {
                    BookletTileKt$$ExternalSyntheticLambda0 bookletTileKt$$ExternalSyntheticLambda0 = new BookletTileKt$$ExternalSyntheticLambda0(uriHandler2, 2);
                    gapComposer.updateRememberedValue(bookletTileKt$$ExternalSyntheticLambda0);
                    obj = bookletTileKt$$ExternalSyntheticLambda0;
                }
                Function2 function2 = (Function2) obj;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                GapComposer gapComposer8 = gapComposer;
                LazyDslKt.m304MarkdownTextpCuZGqc(str, function2, fillMaxWidth, textStyle, colors.semantic.text.standard, null, null, null, 0, 0, 0, gapComposer8, MLKEMEngine.KyberPolyBytes, 2016);
                GapComposer gapComposer9 = gapComposer8;
                r9 = 0;
                gapComposer9.end(false);
                gapComposer2 = gapComposer9;
            }
            DBUtil.SpacerBetweenSectionXLarge(r9, 1, gapComposer2, null);
            DBUtil.SpacerBetweenSectionXLarge(r9, 1, gapComposer2, null);
            gapComposer2.end(true);
            function12 = function1;
            GapComposer gapComposer10 = gapComposer2;
            DimensionKt.ButtonCtaGroup(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter), false, null, null, Expect_jvmKt.rememberComposableLambda(1935791327, new SectionKt$$ExternalSyntheticLambda2(27, animateFloatAsState, function12, provisioned2), gapComposer2), gapComposer10, 24576, 14);
            gapComposer3 = gapComposer10;
            gapComposer3.end(true);
            gapComposer3.end(true);
            z2 = z8;
        } else {
            gapComposer3.skipToGroupEnd();
            z2 = z;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardLockViewKt$$ExternalSyntheticLambda2(provisioned2, function12, z2, i, 9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x038d  */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScanningContent(FidesmoProvisioningViewModel.Scanning scanning, Function1 function1, ScanningStarPlacement scanningStarPlacement, boolean z, Function1 function12, Function1 function13, Composer composer, int i, int i2) {
        int i3;
        ScanningStarPlacement scanningStarPlacement2;
        boolean z2;
        int i4;
        Function1 function14;
        int i5;
        Function1 function15;
        Function1 function16;
        ScanningStarPlacement scanningStarPlacement3;
        boolean z3;
        Function1 function17;
        Function1 function18;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        ScanningStarPlacement scanningStarPlacement4;
        ScanningStarPlacement scanningStarPlacement5;
        Function1 function19;
        int i6;
        boolean z4;
        ProvisioningHaptics provisioningHaptics;
        boolean z5;
        ScanningStarPlacement scanningStarPlacement6;
        int i7;
        boolean z6;
        Integer num;
        MutableState mutableState;
        int i8;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal;
        Object rememberedValue;
        MutableState mutableState2;
        Function1 function110;
        boolean z7;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        Function1 function111;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        ?? r6;
        String str;
        String str2;
        Function1 function112;
        GapComposer gapComposer2;
        boolean z8;
        int i9;
        scanning.getClass();
        function1.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-294043302);
        Applier applier = gapComposer3.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer3.changedInstance(scanning) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer3.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i2 & 4) == 0) {
                scanningStarPlacement2 = scanningStarPlacement;
                if (gapComposer3.changedInstance(scanningStarPlacement2)) {
                    i9 = 256;
                    i3 |= i9;
                }
            } else {
                scanningStarPlacement2 = scanningStarPlacement;
            }
            i9 = 128;
            i3 |= i9;
        } else {
            scanningStarPlacement2 = scanningStarPlacement;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= gapComposer3.changed(z2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function14 = function12;
                i3 |= gapComposer3.changedInstance(function14) ? 16384 : PKIFailureInfo.certRevoked;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                    function15 = function13;
                } else {
                    function15 = function13;
                    if ((i & 196608) == 0) {
                        i3 |= gapComposer3.changedInstance(function15) ? PKIFailureInfo.unsupportedVersion : 65536;
                    }
                }
                if (gapComposer3.shouldExecute(i3 & 1, (i3 & 74899) != 74898)) {
                    gapComposer3.startDefaults();
                    int i11 = i & 1;
                    Object obj = Composer.Companion.Empty;
                    if (i11 == 0 || gapComposer3.getDefaultsInvalid()) {
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            scanningStarPlacement4 = ScanningStarPlacement.Companion.TopCenter;
                        } else {
                            scanningStarPlacement4 = scanningStarPlacement2;
                        }
                        if (i10 != 0) {
                            z2 = false;
                        }
                        if (i4 != 0) {
                            Object rememberedValue2 = gapComposer3.rememberedValue();
                            if (rememberedValue2 == obj) {
                                rememberedValue2 = new FamilyActivityFixtures$$ExternalSyntheticLambda0(26);
                                gapComposer3.updateRememberedValue(rememberedValue2);
                            }
                            function14 = (Function1) rememberedValue2;
                        }
                        if (i5 != 0) {
                            Object rememberedValue3 = gapComposer3.rememberedValue();
                            if (rememberedValue3 == obj) {
                                rememberedValue3 = new FamilyActivityFixtures$$ExternalSyntheticLambda0(27);
                                gapComposer3.updateRememberedValue(rememberedValue3);
                            }
                            function19 = (Function1) rememberedValue3;
                            scanningStarPlacement5 = scanningStarPlacement4;
                        } else {
                            scanningStarPlacement5 = scanningStarPlacement4;
                            function19 = function15;
                        }
                        i6 = i3;
                        z4 = z2;
                    } else {
                        gapComposer3.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        i6 = i3;
                        scanningStarPlacement5 = scanningStarPlacement2;
                        z4 = z2;
                        function19 = function15;
                    }
                    gapComposer3.endDefaults();
                    Density density = (Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity);
                    boolean booleanValue = ((Boolean) gapComposer3.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
                    if (booleanValue) {
                        gapComposer3.startReplaceGroup(1889787939);
                        gapComposer3.end(false);
                        provisioningHaptics = null;
                    } else {
                        gapComposer3.startReplaceGroup(892243799);
                        provisioningHaptics = StateFlowsComposeKt.rememberProvisioningHaptics(gapComposer3);
                        gapComposer3.end(false);
                    }
                    gapComposer3.startReplaceGroup(892245664);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal2)).getClass();
                    DefaultSizes.spacing.getClass();
                    int roundToInt = MathKt__MathJVMKt.roundToInt(density.mo236toPx0680j_4(16.0f));
                    gapComposer3.end(false);
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    boolean z9 = z4;
                    int i12 = i6;
                    if (rememberedValue4 == obj) {
                        rememberedValue4 = Updater.mutableStateOf$default(new IntSize(0L));
                        gapComposer3.updateRememberedValue(rememberedValue4);
                    }
                    MutableState mutableState3 = (MutableState) rememberedValue4;
                    Object rememberedValue5 = gapComposer3.rememberedValue();
                    if (rememberedValue5 == obj) {
                        z5 = booleanValue;
                        scanningStarPlacement6 = scanningStarPlacement5;
                        rememberedValue5 = Updater.mutableStateOf$default(new IntSize(0L));
                        gapComposer3.updateRememberedValue(rememberedValue5);
                    } else {
                        z5 = booleanValue;
                        scanningStarPlacement6 = scanningStarPlacement5;
                    }
                    MutableState mutableState4 = (MutableState) rememberedValue5;
                    int roundToInt2 = MathKt__MathJVMKt.roundToInt(density.mo236toPx0680j_4(96.0f));
                    int i13 = (int) (((IntSize) mutableState3.getValue()).packedValue & BodyPartID.bodyIdMax);
                    int i14 = (int) (((IntSize) mutableState4.getValue()).packedValue & BodyPartID.bodyIdMax);
                    if (i13 <= 0) {
                        i7 = Integer.MAX_VALUE;
                    } else {
                        int i15 = i13 - roundToInt2;
                        if (i14 < 0) {
                            i14 = 0;
                        }
                        i7 = i15 - i14;
                        if (i7 < 0) {
                            i7 = 0;
                        }
                    }
                    boolean z10 = scanning instanceof FidesmoProvisioningViewModel.Scanning.InProgress;
                    if (z10) {
                        scanningStarPlacement3 = scanningStarPlacement6;
                        gapComposer3.startReplaceGroup(1890401244);
                        FidesmoProvisioningViewModel.Scanning.InProgress inProgress = (FidesmoProvisioningViewModel.Scanning.InProgress) scanning;
                        Integer num2 = inProgress.totalSteps;
                        z6 = z10;
                        Integer num3 = inProgress.currentStep;
                        num = inProgress.progressPercent;
                        if (num != null) {
                            gapComposer3.startReplaceGroup(892266281);
                            z8 = false;
                            gapComposer3.end(false);
                        } else if (num3 == null || num2 == null) {
                            z8 = false;
                            gapComposer3.startReplaceGroup(1890532932);
                            gapComposer3.end(false);
                            num = null;
                        } else {
                            gapComposer3.startReplaceGroup(1890619918);
                            int rememberScanningProgressPercent = PlaceHolderKt.rememberScanningProgressPercent(num3, num2, gapComposer3);
                            z8 = false;
                            gapComposer3.end(false);
                            num = Integer.valueOf(rememberScanningProgressPercent);
                        }
                        gapComposer3.end(z8);
                    } else {
                        scanningStarPlacement3 = scanningStarPlacement6;
                        z6 = z10;
                        gapComposer3.startReplaceGroup(1890788310);
                        gapComposer3.end(false);
                        num = null;
                    }
                    boolean changedInstance = gapComposer3.changedInstance(provisioningHaptics);
                    Object rememberedValue6 = gapComposer3.rememberedValue();
                    if (changedInstance || rememberedValue6 == obj) {
                        rememberedValue6 = new FidesmoProvisioningViewKt$$ExternalSyntheticLambda7(provisioningHaptics, 1);
                        gapComposer3.updateRememberedValue(rememberedValue6);
                    }
                    Updater.DisposableEffect(provisioningHaptics, (Function1) rememberedValue6, gapComposer3);
                    KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(scanning.getClass());
                    int i16 = i12 & 57344;
                    Integer num4 = num;
                    boolean changedInstance2 = (i16 == 16384) | gapComposer3.changedInstance(scanning);
                    Object rememberedValue7 = gapComposer3.rememberedValue();
                    if (changedInstance2 || rememberedValue7 == obj) {
                        rememberedValue7 = new CheckStatusPresenter.AnonymousClass1.C00611(scanning, function14, null, 8);
                        gapComposer3.updateRememberedValue(rememberedValue7);
                    }
                    Updater.LaunchedEffect(gapComposer3, orCreateKotlinClass, (Function2) rememberedValue7);
                    if (z5 && z6) {
                        mutableState = mutableState4;
                        staticProvidableCompositionLocal = staticProvidableCompositionLocal2;
                        if (IntSize.m1055equalsimpl0(((IntSize) mutableState3.getValue()).packedValue, 0L)) {
                            i8 = i7;
                        } else {
                            gapComposer3.startReplaceGroup(1891290727);
                            FidesmoProvisioningViewModel.Scanning.InProgress inProgress2 = (FidesmoProvisioningViewModel.Scanning.InProgress) scanning;
                            ScanningPulseStyle scanningPulseStyle = toScanningPulseStyle(inProgress2.pulseShape);
                            int roundToInt3 = MathKt__MathJVMKt.roundToInt(density.mo236toPx0680j_4(getEffectSize(scanningPulseStyle)));
                            int roundToInt4 = MathKt__MathJVMKt.roundToInt(density.mo236toPx0680j_4(getClampedSize(scanningPulseStyle)));
                            boolean changed = gapComposer3.changed(inProgress2.starPlacement) | gapComposer3.changed(((IntSize) mutableState3.getValue()).packedValue) | gapComposer3.changed(roundToInt) | gapComposer3.changed(i7);
                            Object rememberedValue8 = gapComposer3.rememberedValue();
                            if (changed || rememberedValue8 == obj) {
                                int i17 = i7;
                                ScanningStarLayout m3538scanningStarLayoutzTRF_AQ = m3538scanningStarLayoutzTRF_AQ(((IntSize) mutableState3.getValue()).packedValue, roundToInt3, roundToInt4, roundToInt, inProgress2.starPlacement, i17);
                                i8 = i17;
                                rememberedValue8 = Boolean.valueOf(m3538scanningStarLayoutzTRF_AQ.placeInstructionBlockAtTop);
                                gapComposer3.updateRememberedValue(rememberedValue8);
                            } else {
                                i8 = i7;
                            }
                            boolean booleanValue2 = ((Boolean) rememberedValue8).booleanValue();
                            boolean changed2 = (i16 == 16384) | gapComposer3.changed(booleanValue2);
                            Object rememberedValue9 = gapComposer3.rememberedValue();
                            if (changed2 || rememberedValue9 == obj) {
                                rememberedValue9 = new ToggleableNode$$ExternalSyntheticLambda1(function14, booleanValue2, 4);
                                gapComposer3.updateRememberedValue(rememberedValue9);
                            }
                            Updater.SideEffect((Function0) rememberedValue9, gapComposer3);
                            gapComposer3.end(false);
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                            rememberedValue = gapComposer3.rememberedValue();
                            if (rememberedValue == obj) {
                                rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(11, mutableState3);
                                gapComposer3.updateRememberedValue(rememberedValue);
                            }
                            Modifier onSizeChanged = RulerKt.onSizeChanged(fillMaxSize, (Function1) rememberedValue);
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopCenter, false);
                            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, onSizeChanged);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                            if (applier != null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer3.startReusableNode();
                            if (gapComposer3.inserting) {
                                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                            } else {
                                gapComposer3.useNode();
                            }
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
                            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$15);
                            Integer valueOf = Integer.valueOf(hashCode);
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
                            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$16);
                            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$12);
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
                            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$17);
                            boolean z11 = scanning instanceof FidesmoProvisioningViewModel.Scanning.Disconnected;
                            if (z11) {
                                gapComposer3.startReplaceGroup(-449757792);
                                mutableState2 = mutableState;
                                function110 = function19;
                                z7 = z11;
                                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$14;
                                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                                r6 = 0;
                                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                                m3536PositionedDisconnectedAlertIconzTRF_AQ(((IntSize) mutableState3.getValue()).packedValue, scanningStarPlacement3, i8, function14, gapComposer3, (i12 >> 3) & 7280);
                                function111 = function14;
                                gapComposer3.end(false);
                            } else {
                                mutableState2 = mutableState;
                                function110 = function19;
                                z7 = z11;
                                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$14;
                                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                                function111 = function14;
                                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                                r6 = 0;
                                gapComposer3.startReplaceGroup(-449509854);
                                gapComposer3.end(false);
                            }
                            Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer3, 48);
                            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, fillMaxSize2);
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
                            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$1);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$17);
                            if (z6 || z7) {
                                gapComposer3.startReplaceGroup(-579983437);
                                if (z6) {
                                    str = ((FidesmoProvisioningViewModel.Scanning.InProgress) scanning).title;
                                } else {
                                    if (!z7) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return;
                                    }
                                    str = ((FidesmoProvisioningViewModel.Scanning.Disconnected) scanning).title;
                                }
                                String str3 = str;
                                if (z7) {
                                    str2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -579635896, R.string.fidesmo_scanning_disconnected_title, gapComposer3, (boolean) r6);
                                } else {
                                    gapComposer3.startReplaceGroup(-579532790);
                                    gapComposer3.end(r6);
                                    str2 = null;
                                }
                                boolean z12 = (z6 && z9) ? true : r6;
                                Modifier fillMaxWidth = SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f, true), 1.0f);
                                ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                                boolean z13 = (i12 & 458752) == 131072 ? true : r6;
                                Object rememberedValue10 = gapComposer3.rememberedValue();
                                if (z13 || rememberedValue10 == obj) {
                                    function112 = function110;
                                    rememberedValue10 = new CashMapViewKt$$ExternalSyntheticLambda3(function112, mutableState2, 13);
                                    gapComposer3.updateRememberedValue(rememberedValue10);
                                } else {
                                    function112 = function110;
                                }
                                PositionedScanningInstructionBlock(str3, num4, z12, (Function1) rememberedValue10, m300paddingVpY3zN4$default, z6, str2, gapComposer3, 0, 0);
                                GapComposer gapComposer4 = gapComposer3;
                                gapComposer4.end(r6);
                                gapComposer2 = gapComposer4;
                            } else {
                                gapComposer3.startReplaceGroup(-579090420);
                                gapComposer3.end(r6);
                                function112 = function110;
                                gapComposer2 = gapComposer3;
                            }
                            if (z7) {
                                gapComposer2.startReplaceGroup(-1958340543);
                                FidesmoProvisioningViewModel.Button button = ((FidesmoProvisioningViewModel.Scanning.Disconnected) scanning).button;
                                if (button == null) {
                                    gapComposer2.startReplaceGroup(-579014688);
                                    gapComposer2.end(r6);
                                    function16 = function1;
                                } else {
                                    gapComposer2.startReplaceGroup(-579014687);
                                    function16 = function1;
                                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1542788535, new FidesmoProvisioningViewKt$$ExternalSyntheticLambda24(function16, button, r6), gapComposer2), gapComposer2, 24576, 15);
                                    gapComposer2.end(r6);
                                }
                                gapComposer2.end(r6);
                            } else {
                                function16 = function1;
                                gapComposer2.startReplaceGroup(-578750164);
                                gapComposer2.end(r6);
                            }
                            gapComposer2.end(true);
                            gapComposer2.end(true);
                            z3 = z9;
                            function18 = function112;
                            function17 = function111;
                            gapComposer = gapComposer2;
                        }
                    } else {
                        mutableState = mutableState4;
                        i8 = i7;
                        staticProvidableCompositionLocal = staticProvidableCompositionLocal2;
                    }
                    gapComposer3.startReplaceGroup(1892152744);
                    gapComposer3.end(false);
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion2, 1.0f);
                    rememberedValue = gapComposer3.rememberedValue();
                    if (rememberedValue == obj) {
                    }
                    Modifier onSizeChanged2 = RulerKt.onSizeChanged(fillMaxSize3, (Function1) rememberedValue);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopCenter, false);
                    int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, onSizeChanged2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier != null) {
                    }
                } else {
                    function16 = function1;
                    gapComposer3.skipToGroupEnd();
                    scanningStarPlacement3 = scanningStarPlacement2;
                    z3 = z2;
                    function17 = function14;
                    function18 = function15;
                    gapComposer = gapComposer3;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(scanning, function16, scanningStarPlacement3, z3, function17, function18, i, i2, 5);
                    return;
                }
                return;
            }
            function14 = function12;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if (gapComposer3.shouldExecute(i3 & 1, (i3 & 74899) != 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z2 = z;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function14 = function12;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if (gapComposer3.shouldExecute(i3 & 1, (i3 & 74899) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static final void ScanningInstructionBlock(String str, Integer num, boolean z, String str2, Modifier modifier, Composer composer, int i) {
        int i2;
        int i3;
        Modifier.Companion companion;
        ?? r2;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1822156882);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(num) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(-640030792);
                zzg.ScanningProgressPercent(num, SizeKt.fillMaxWidth(companion2, 1.0f), gapComposer, ((i2 >> 3) & 14) | 48);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.end(false);
                i3 = i2;
                companion = companion2;
                r2 = 1;
                z2 = false;
            } else if (str2 != null) {
                gapComposer.startReplaceGroup(-639858153);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                i3 = i2;
                companion = companion2;
                r2 = 1;
                z2 = false;
                Room.m1165Text25TpFw(0, 0, 0, 3, ((i2 >> 9) & 14) | 48, 0, 2800, colors.semantic.text.standard, (Composer) gapComposer, SizeKt.fillMaxWidth(companion2, 0.8f), textStyle, new TextLineBalancing(1), str2, (Map) null, (Function1) null, false);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else {
                i3 = i2;
                companion = companion2;
                r2 = 1;
                z2 = false;
                gapComposer.startReplaceGroup(-639536218);
                gapComposer.end(false);
            }
            TextStyle textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
            Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z2);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(z2);
            }
            Room.m1165Text25TpFw(0, 0, 0, 3, (i3 & 14) | 48, 0, 2800, colors2.semantic.text.standard, (Composer) gapComposer, SizeKt.fillMaxWidth(companion, 0.8f), textStyle2, new TextLineBalancing(r2), str, (Map) null, (Function1) null, false);
            gapComposer.end(r2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(str, num, z, str2, modifier, i);
        }
    }

    public static final void SuccessAnimation(int i, Composer composer, Modifier modifier, TagFormFactor tagFormFactor, boolean z) {
        int i2;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1957903685);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(tagFormFactor.ordinal()) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int ordinal = tagFormFactor.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal != 5) {
                                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 349769562, false);
                                }
                            }
                        }
                    }
                    gapComposer.startReplaceGroup(349778839);
                    CanvasKt.MiniCardConfirmationEffect(modifier, z, tagFormFactor == TagFormFactor.MINI_CARD_FIRST_EDITION ? MiniCardEdition.FIRST_EDITION : MiniCardEdition.STANDARD, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                    gapComposer.end(false);
                }
                gapComposer.startReplaceGroup(349771761);
                CanvasKt.HeartConfirmationEffect(modifier, z, tagFormFactor == TagFormFactor.HEART_FIRST_EDITION ? HeartEdition.FIRST_EDITION : HeartEdition.STANDARD, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
            }
            gapComposer.startReplaceGroup(349785988);
            if (z) {
                gapComposer.startReplaceGroup(-2041525966);
                FlowsKt.WandActivationSuccessAnimation(modifier, false, CanvasKt.toWandEdition(tagFormFactor), null, gapComposer, i2 & 14);
                gapComposer.end(false);
                z2 = false;
            } else {
                gapComposer.startReplaceGroup(-2041410367);
                int i3 = (i2 & 14) | 3504;
                z2 = false;
                FlowsKt.WandActivationSuccessEffect(modifier, 1.0f, 1.0f, RecyclerView.DECELERATION_RATE, CanvasKt.toWandEdition(tagFormFactor), null, null, null, gapComposer, i3, 480);
                gapComposer.end(false);
            }
            gapComposer.end(z2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardLockViewKt$$ExternalSyntheticLambda2(modifier, z, tagFormFactor, i, 10);
        }
    }

    public static final void SuccessCard(FidesmoProvisioningViewModel.Success.Provisioned.Card card, Function1 function1, Composer composer, int i) {
        Function0 function0;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1090993358);
        int i2 = (gapComposer.changedInstance(card) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i3 = 13;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = card.buttonUrl;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ComposableLambdaImpl composableLambdaImpl = null;
            if (str == null) {
                gapComposer.startReplaceGroup(-1765415050);
                gapComposer.end(false);
                function0 = null;
            } else {
                gapComposer.startReplaceGroup(-1765415049);
                boolean changed = gapComposer.changed(str) | ((i2 & 112) == 32);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new P2PListViewKt$$ExternalSyntheticLambda13(function1, str, 11);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                function0 = (Function0) rememberedValue;
                gapComposer.end(false);
            }
            String str2 = card.imageUrl;
            if (str2 == null) {
                gapComposer.startReplaceGroup(-1765340588);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1765340587);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-277642945, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str2, i3), gapComposer);
                gapComposer.end(false);
            }
            MoneybotTheme.m3623Cardjb40ds(fillMaxWidth, false, 0L, RecyclerView.DECELERATION_RATE, function0, composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(-613257492, new ArcadeModal2Kt$$ExternalSyntheticLambda0(24, card, str), gapComposer), gapComposer, 1572870, 14);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormCashtag$8$$ExternalSyntheticLambda0(card, function1, i, i3);
        }
    }

    public static final void SuccessCardImage(int i, Composer composer, Modifier modifier, String str) {
        String str2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1554414286);
        int i2 = 4;
        int i3 = (gapComposer.changed(str) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            int i5 = 14;
            int i6 = i3 & 14;
            boolean z = i6 == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (z || rememberedValue == obj) {
                rememberedValue = Updater.mutableStateOf$default(SuccessCardImageState.Success);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            boolean changed = gapComposer.changed(mutableState);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == obj) {
                rememberedValue2 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(13, mutableState);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function1 function1 = (Function1) rememberedValue2;
            boolean changed2 = gapComposer.changed(mutableState);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue3 == obj) {
                rememberedValue3 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(i5, mutableState);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Function1 function12 = (Function1) rememberedValue3;
            boolean changed3 = gapComposer.changed(mutableState);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue4 == obj) {
                rememberedValue4 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(15, mutableState);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            AsyncImagePainter m1450rememberAsyncImagePainterMqRF_0 = AsyncImageKt.m1450rememberAsyncImagePainterMqRF_0(str, function1, function12, (Function1) rememberedValue4, gapComposer, i6, 398);
            str2 = str;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(ImageKt.m177backgroundbw27NRU(modifier, colors.semantic.background.prominent, ColorKt.RectangleShape), 160.0f), 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            SuccessCardImageState successCardImageState = (SuccessCardImageState) mutableState.getValue();
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == obj) {
                rememberedValue5 = new FamilyActivityFixtures$$ExternalSyntheticLambda0(29);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            AnimatedContentKt.AnimatedContent(successCardImageState, null, (Function1) rememberedValue5, null, null, null, Expect_jvmKt.rememberComposableLambda(-228785060, new BookletTileKt$$ExternalSyntheticLambda6(m1450rememberAsyncImagePainterMqRF_0, i4), gapComposer), gapComposer, 1573248, 58);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            str2 = str;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda4(str2, modifier, i, i2);
        }
    }

    public static final void SuccessGrid(int i, Composer composer, List list) {
        Modifier wrapContentHeight;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(841768263);
        int i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            OffsetKt.FlowRow(wrapContentHeight, arrangement$SpacedAligned, new Arrangement$SpacedAligned(32.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), null, 2, 0, Expect_jvmKt.rememberComposableLambda(1150690476, new FidesmoProvisioningViewKt$$ExternalSyntheticLambda67(list, i3), gapComposer), gapComposer, 1597446, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda9(i, 5, list);
        }
    }

    public static final float getClampedSize(ScanningPulseStyle scanningPulseStyle) {
        float f;
        float f2;
        int ordinal = scanningPulseStyle.shape.ordinal();
        if (ordinal == 0) {
            ScanningStarPulseParams scanningStarPulseParams = scanningPulseStyle.starParams;
            f = scanningStarPulseParams.starSize;
            f2 = scanningStarPulseParams.starScale;
        } else if (ordinal == 1) {
            ScanningHeartPulseParams scanningHeartPulseParams = scanningPulseStyle.heartParams;
            f = scanningHeartPulseParams.heartSize;
            f2 = scanningHeartPulseParams.heartScale;
        } else {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return RecyclerView.DECELERATION_RATE;
            }
            ScanningCardPulseParams scanningCardPulseParams = scanningPulseStyle.cardParams;
            f = scanningCardPulseParams.cardSize;
            f2 = scanningCardPulseParams.cardScale;
        }
        return f * f2;
    }

    public static final float getEffectSize(ScanningPulseStyle scanningPulseStyle) {
        int ordinal = scanningPulseStyle.shape.ordinal();
        if (ordinal == 0) {
            return scanningPulseStyle.starParams.starSize * 1.5f;
        }
        if (ordinal == 1) {
            return scanningPulseStyle.heartParams.heartSize * 1.5f;
        }
        if (ordinal == 2) {
            return scanningPulseStyle.cardParams.cardSize * 1.5f;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return RecyclerView.DECELERATION_RATE;
    }

    /* renamed from: scanningStarLayout-zTRF_AQ, reason: not valid java name */
    public static final ScanningStarLayout m3538scanningStarLayoutzTRF_AQ(long j, int i, int i2, int i3, ScanningStarPlacement scanningStarPlacement, int i4) {
        int i5;
        Pair pair;
        Pair pair2;
        Float valueOf = Float.valueOf(0.5f);
        scanningStarPlacement.getClass();
        int i6 = (int) (j >> 32);
        if (i6 <= 0 || (i5 = (int) (j & BodyPartID.bodyIdMax)) <= 0 || i <= 0 || i2 <= 0) {
            return new ScanningStarLayout(0L, false);
        }
        float f = i2 / 2.0f;
        int i7 = i3 < 0 ? 0 : i3;
        boolean z = scanningStarPlacement instanceof ScanningStarPlacement.Position;
        float f2 = RecyclerView.DECELERATION_RATE;
        if (z) {
            ScanningStarPlacement.Position position = (ScanningStarPlacement.Position) scanningStarPlacement;
            float f3 = position.xFraction;
            Float valueOf2 = Float.valueOf(Math.abs(f3) <= Float.MAX_VALUE ? f3 : 0.5f);
            float f4 = position.yFraction;
            if (Math.abs(f4) <= Float.MAX_VALUE) {
                f2 = f4;
            }
            pair2 = new Pair(valueOf2, Float.valueOf(f2));
        } else {
            if (scanningStarPlacement.equals(ScanningStarPlacement.Unknown.INSTANCE)) {
                pair = new Pair(valueOf, Float.valueOf(RecyclerView.DECELERATION_RATE));
            } else {
                if (!scanningStarPlacement.equals(ScanningStarPlacement.Bounce.INSTANCE) && !scanningStarPlacement.equals(ScanningStarPlacement.Snake.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                pair = new Pair(valueOf, Float.valueOf(0.3f));
            }
            pair2 = pair;
        }
        float floatValue = ((Number) pair2.first).floatValue();
        float floatValue2 = ((Number) pair2.second).floatValue();
        float f5 = i6;
        float f6 = i7;
        float f7 = f + f6;
        float f8 = (f5 - f) - f6;
        float coerceIn = f7 <= f8 ? RangesKt___RangesKt.coerceIn(floatValue * f5, f7, f8) : f5 / 2.0f;
        float f9 = i5;
        float f10 = (f9 - f) - f6;
        float f11 = i / 2.0f;
        return new ScanningStarLayout((MathKt__MathJVMKt.roundToInt(coerceIn - f11) << 32) | (BodyPartID.bodyIdMax & MathKt__MathJVMKt.roundToInt(r3 - f11)), (f7 <= f10 ? RangesKt___RangesKt.coerceIn(floatValue2 * f9, f7, f10) : f9 / 2.0f) + f > ((float) i4));
    }

    public static final ScanningPulseStyle toScanningPulseStyle(FidesmoScanningPulseShape fidesmoScanningPulseShape) {
        int ordinal = fidesmoScanningPulseShape.ordinal();
        if (ordinal == 0) {
            ScanningPulseStyle scanningPulseStyle = ScanningPulseStyle.Star;
            return ScanningPulseStyle.Star;
        }
        if (ordinal == 1) {
            ScanningPulseStyle scanningPulseStyle2 = ScanningPulseStyle.Star;
            return ScanningPulseStyle.Heart;
        }
        if (ordinal == 2) {
            ScanningPulseStyle scanningPulseStyle3 = ScanningPulseStyle.Star;
            return ScanningPulseStyle.Card;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final FidesmoProvisioningViewEvent toViewEvent(FidesmoProvisioningViewModel.ButtonAction buttonAction) {
        if (buttonAction instanceof FidesmoProvisioningViewModel.ButtonAction.Close) {
            return FidesmoProvisioningViewEvent.Close.INSTANCE;
        }
        if (buttonAction instanceof FidesmoProvisioningViewModel.ButtonAction.OpenUrl) {
            return new FidesmoProvisioningViewEvent.OpenUrl(((FidesmoProvisioningViewModel.ButtonAction.OpenUrl) buttonAction).url);
        }
        if (buttonAction instanceof FidesmoProvisioningViewModel.ButtonAction.Retry) {
            return FidesmoProvisioningViewEvent.Retry.INSTANCE;
        }
        if (buttonAction instanceof FidesmoProvisioningViewModel.ButtonAction.OpenNfcSettings) {
            return FidesmoProvisioningViewEvent.OpenNfcSettings.INSTANCE;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
