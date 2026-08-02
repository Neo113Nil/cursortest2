package com.squareup.cash.activity.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt$$ExternalSyntheticLambda1;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda6;
import app.cash.local.views.cart.CartBannerViewKt$$ExternalSyntheticLambda2;
import app.cash.molecule.PlatformKt;
import bo.app.n3$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zzd;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.ActivityItemPresentationContext;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.viewmodels.ItemAccessory;
import com.squareup.cash.activity.viewmodels.ReactionsState;
import com.squareup.cash.activity.views.ActivityItemViewKt;
import com.squareup.cash.activity.views.compact.CompactCellActivityKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.cdf.ActivityItemOrigin;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda3;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class ActivityItemViewKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Icons.values().length];
            try {
                zzd zzdVar = Icons.Companion;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzd zzdVar2 = Icons.Companion;
                iArr[104] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PaymentHistoryData.AmountTreatment.values().length];
            try {
                iArr2[PaymentHistoryData.AmountTreatment.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PaymentHistoryData.AmountTreatment.SUCCEEDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PaymentHistoryData.AmountTreatment.FADED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PaymentHistoryData.AmountTreatment.STRIKETHROUGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PaymentHistoryData.InlineButtonProminence.values().length];
            try {
                iArr3[PaymentHistoryData.InlineButtonProminence.DESTRUCTIVE_STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[PaymentHistoryData.InlineButtonProminence.DEFAULT_STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[PaymentHistoryData.InlineButtonProminence.DESTRUCTIVE_PROMINENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[PaymentHistoryData.InlineButtonProminence.PROMINENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[PaymentHistoryData.InlineButtonProminence.DESTRUCTIVE_SUBTLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[PaymentHistoryData.InlineButtonProminence.SUBTLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        new ColorModel.Accented(new Color(new Color.ModeVariant("#F46E38", null, null, null, null, 30, null), (Color.ModeVariant) null, 6));
        new ColorModel.Accented(new Color(new Color.ModeVariant("#FF4A4A", null, null, null, null, 30, null), (Color.ModeVariant) null, 6));
        new ActivityItemPresentationContext(ActivityItemOrigin.HISTORY, 1, null, ActivityScope.MY_ACTIVITY, new ActivityToken(ActivityTokenType.CUSTOMER_TOKEN, "token", (String) null, 12), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* renamed from: ActivityItemView-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2972ActivityItemViewww6aTOc(final ActivityItemViewModel activityItemViewModel, Function1 function1, Modifier modifier, long j, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        long j2;
        GapComposer gapComposer;
        Modifier modifier3;
        long j3;
        RecomposeScopeImpl endRestartGroup;
        long j4;
        int i4;
        Modifier modifier4;
        MutableState mutableState;
        Object n3__externalsyntheticlambda0;
        NeverEqualPolicy neverEqualPolicy;
        ComposableLambdaImpl composableLambdaImpl;
        activityItemViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-680807700);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(activityItemViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                j2 = j;
                i3 |= ((i2 & 8) == 0 && gapComposer2.changed(j2)) ? 2048 : 1024;
            } else {
                j2 = j;
            }
            int i6 = 1;
            if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
                j3 = j2;
            } else {
                gapComposer2.startDefaults();
                if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                    Modifier modifier5 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        i4 = i3 & (-7169);
                        modifier4 = modifier5;
                        j4 = colors.component.cell.background.f171default;
                    } else {
                        j4 = j2;
                        i4 = i3;
                        modifier4 = modifier5;
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    j4 = j2;
                    i4 = i3;
                    modifier4 = modifier2;
                }
                gapComposer2.endDefaults();
                Object rememberedValue = gapComposer2.rememberedValue();
                NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy2) {
                    rememberedValue = Updater.mutableStateOf$default(null);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState2 = (MutableState) rememberedValue;
                String stringResource = Room.stringResource(gapComposer2, R.string.activity_item_action_view);
                String stringResource2 = Room.stringResource(gapComposer2, R.string.activity_item_action_view_profile);
                int i7 = i4 & 112;
                boolean changed = gapComposer2.changed(stringResource) | (i7 == 32) | gapComposer2.changed(stringResource2) | gapComposer2.changedInstance(activityItemViewModel);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy2) {
                    mutableState = mutableState2;
                    neverEqualPolicy = neverEqualPolicy2;
                    n3__externalsyntheticlambda0 = new n3$$ExternalSyntheticLambda0(stringResource, activityItemViewModel, function1, stringResource2, 17);
                    gapComposer2.updateRememberedValue(n3__externalsyntheticlambda0);
                } else {
                    mutableState = mutableState2;
                    n3__externalsyntheticlambda0 = rememberedValue2;
                    neverEqualPolicy = neverEqualPolicy2;
                }
                Modifier focusable = CanvasKt.focusable(SemanticsModifierKt.clearAndSetSemantics(modifier4, (Function1) n3__externalsyntheticlambda0), true, null);
                boolean z = i7 == 32;
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (z || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new CashMapViewKt$$ExternalSyntheticLambda3(function1, mutableState, 2);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                Modifier onPlaced = RulerKt.onPlaced(focusable, (Function1) rememberedValue3);
                ReactionsState reactionsState = activityItemViewModel.reactionsState;
                boolean z2 = i7 == 32;
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (z2 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new UtilsKt$$ExternalSyntheticLambda1(11, function1);
                    gapComposer2.updateRememberedValue(rememberedValue4);
                }
                Modifier reactionsAnchor = AvatarsKt.reactionsAnchor(onPlaced, reactionsState, (Function1) rememberedValue4);
                final int i8 = 0;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1266138000, new Function2() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        long j5;
                        int i9 = i8;
                        ActivityItemViewModel activityItemViewModel2 = activityItemViewModel;
                        switch (i9) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Icons icons = activityItemViewModel2.primaryLabelIcon;
                                    if ((icons == null ? -1 : ActivityItemViewKt.WhenMappings.$EnumSwitchMapping$0[icons.ordinal()]) == -1) {
                                        gapComposer3.startReplaceGroup(-1282871043);
                                        Room.m1165Text25TpFw(0, 2, 0, 0, 1572864, 0, 4030, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, activityItemViewModel2.primaryLabel, (Map) null, (Function1) null, false);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-1282868068);
                                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer3, 48);
                                        int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, companion);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer3.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer3.startReusableNode();
                                        if (gapComposer3.inserting) {
                                            gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                                        } else {
                                            gapComposer3.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer3, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Room.m1165Text25TpFw(0, 2, 0, 0, 1572864, 0, 4028, 0L, (Composer) gapComposer3, (Modifier) Request$Priority$EnumUnboxingLocalUtility.m(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier, 1.0f, false), (TextStyle) null, (TextLineBalancing) null, activityItemViewModel2.primaryLabel, (Map) null, (Function1) null, false);
                                        Strings.getSizes(gapComposer3).getClass();
                                        DefaultSizes.spacing.getClass();
                                        Modifier m281requiredSize3ABfNKs = SizeKt.m281requiredSize3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 16.0f);
                                        int ordinal = icons.ordinal();
                                        if (ordinal == 0) {
                                            gapComposer3.startReplaceGroup(-485377041);
                                            j5 = Strings.getColors(gapComposer3).semantic.icon.info;
                                            gapComposer3.end(false);
                                        } else if (ordinal != 104) {
                                            gapComposer3.startReplaceGroup(-485373578);
                                            gapComposer3.end(false);
                                            j5 = androidx.compose.ui.graphics.Color.Unspecified;
                                        } else {
                                            gapComposer3.startReplaceGroup(-485374608);
                                            j5 = Strings.getColors(gapComposer3).semantic.icon.brand;
                                            gapComposer3.end(false);
                                        }
                                        Trace.m1191Iconww6aTOc(icons, (String) null, m281requiredSize3ABfNKs, j5, gapComposer3, 48, 0);
                                        gapComposer3.end(true);
                                        gapComposer3.end(false);
                                    }
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, activityItemViewModel2.presentationContext.secondaryLabelMaxLines, 0, 0, 0, 0, 4030, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, activityItemViewModel2.secondaryLabel, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, gapComposer2);
                if (activityItemViewModel.compact) {
                    gapComposer2.startReplaceGroup(-1102833948);
                    int i9 = i4 << 6;
                    CompactCellActivityKt.CompactActivityItemView(reactionsAnchor, rememberComposableLambda, activityItemViewModel, function1, gapComposer2, (i9 & 896) | 48 | (i9 & 7168));
                    gapComposer = gapComposer2;
                    gapComposer.end(false);
                    modifier3 = modifier4;
                } else {
                    modifier3 = modifier4;
                    int i10 = 0;
                    gapComposer = gapComposer2;
                    gapComposer.startReplaceGroup(-1102621412);
                    String str = activityItemViewModel.tertiaryLabel;
                    if (str == null) {
                        gapComposer.startReplaceGroup(-1102218196);
                        gapComposer.end(false);
                        composableLambdaImpl = null;
                    } else {
                        gapComposer.startReplaceGroup(-1102218195);
                        ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1441550168, new ToastKt$$ExternalSyntheticLambda1(str, 8), gapComposer);
                        gapComposer.end(false);
                        composableLambdaImpl = rememberComposableLambda2;
                    }
                    Badge.Small small = activityItemViewModel.isBadged ? Badge.Small.INSTANCE : null;
                    ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(490791246, new ActivityItemViewKt$$ExternalSyntheticLambda5(activityItemViewModel, function1, i10), gapComposer);
                    ComposableLambdaImpl rememberComposableLambda4 = Expect_jvmKt.rememberComposableLambda(-1524977817, new ActivityItemViewKt$$ExternalSyntheticLambda5(activityItemViewModel, function1, i6), gapComposer);
                    boolean z3 = i7 == 32;
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (z3 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new BalanceFeedKt$$ExternalSyntheticLambda4(16, function1);
                        gapComposer.updateRememberedValue(rememberedValue5);
                    }
                    final int i11 = 1;
                    CellDefaultKt.m3388CellActivity6RhP_wg(rememberComposableLambda3, rememberComposableLambda, rememberComposableLambda4, (Function0) rememberedValue5, reactionsAnchor, small, Expect_jvmKt.rememberComposableLambda(1733969828, new Function2() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            long j5;
                            int i92 = i11;
                            ActivityItemViewModel activityItemViewModel2 = activityItemViewModel;
                            switch (i92) {
                                case 0:
                                    Composer composer2 = (Composer) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        Icons icons = activityItemViewModel2.primaryLabelIcon;
                                        if ((icons == null ? -1 : ActivityItemViewKt.WhenMappings.$EnumSwitchMapping$0[icons.ordinal()]) == -1) {
                                            gapComposer3.startReplaceGroup(-1282871043);
                                            Room.m1165Text25TpFw(0, 2, 0, 0, 1572864, 0, 4030, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, activityItemViewModel2.primaryLabel, (Map) null, (Function1) null, false);
                                            gapComposer3.end(false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-1282868068);
                                            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer3, 48);
                                            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, companion);
                                            ComposeUiNode.Companion.getClass();
                                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                            if (gapComposer3.applier == null) {
                                                Updater.invalidApplier();
                                                throw null;
                                            }
                                            gapComposer3.startReusableNode();
                                            if (gapComposer3.inserting) {
                                                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                                            } else {
                                                gapComposer3.useNode();
                                            }
                                            Updater.m576setimpl(gapComposer3, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                            Room.m1165Text25TpFw(0, 2, 0, 0, 1572864, 0, 4028, 0L, (Composer) gapComposer3, (Modifier) Request$Priority$EnumUnboxingLocalUtility.m(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier, 1.0f, false), (TextStyle) null, (TextLineBalancing) null, activityItemViewModel2.primaryLabel, (Map) null, (Function1) null, false);
                                            Strings.getSizes(gapComposer3).getClass();
                                            DefaultSizes.spacing.getClass();
                                            Modifier m281requiredSize3ABfNKs = SizeKt.m281requiredSize3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 16.0f);
                                            int ordinal = icons.ordinal();
                                            if (ordinal == 0) {
                                                gapComposer3.startReplaceGroup(-485377041);
                                                j5 = Strings.getColors(gapComposer3).semantic.icon.info;
                                                gapComposer3.end(false);
                                            } else if (ordinal != 104) {
                                                gapComposer3.startReplaceGroup(-485373578);
                                                gapComposer3.end(false);
                                                j5 = androidx.compose.ui.graphics.Color.Unspecified;
                                            } else {
                                                gapComposer3.startReplaceGroup(-485374608);
                                                j5 = Strings.getColors(gapComposer3).semantic.icon.brand;
                                                gapComposer3.end(false);
                                            }
                                            Trace.m1191Iconww6aTOc(icons, (String) null, m281requiredSize3ABfNKs, j5, gapComposer3, 48, 0);
                                            gapComposer3.end(true);
                                            gapComposer3.end(false);
                                        }
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer3 = (Composer) obj;
                                    int intValue2 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer3;
                                    if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, activityItemViewModel2.presentationContext.secondaryLabelMaxLines, 0, 0, 0, 0, 4030, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, activityItemViewModel2.secondaryLabel, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer), composableLambdaImpl, false, j4, gapComposer, ((i4 << 18) & 1879048192) | 1573302, 256);
                    gapComposer.end(false);
                }
                j3 = j4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new IconKt$$ExternalSyntheticLambda1(activityItemViewModel, function1, modifier3, j3, i, i2, 1);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        int i62 = 1;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void ImageButton(Function0 function0, AsyncImagePainter asyncImagePainter, AsyncImagePainter.State state, ItemAccessory.PortraitImage portraitImage, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        function0.getClass();
        state.getClass();
        portraitImage.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-939537393);
        int i4 = (gapComposer.changedInstance(function0) ? 4 : 2) | i | (gapComposer.changed(asyncImagePainter) ? 32 : 16) | (gapComposer.changedInstance(state) ? 256 : 128) | (gapComposer.changedInstance(portraitImage) ? 2048 : 1024);
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 = i4 | 24576;
        } else {
            i3 = i4 | (gapComposer.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            if (i5 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Modifier modifier3 = modifier;
            CrossfadeKt.Crossfade(Boolean.valueOf(state instanceof AsyncImagePainter.State.Loading), modifier3, (FiniteAnimationSpec) null, "PortraitImageCrossfade", Expect_jvmKt.rememberComposableLambda(-911879282, new LocalViewFactory$$ExternalSyntheticLambda6(17, function0, portraitImage, asyncImagePainter), gapComposer), gapComposer, ((i3 >> 9) & 112) | 27648, 4);
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(function0, asyncImagePainter, state, portraitImage, modifier2, i, i2);
        }
    }

    public static final void ImageButtonAccessory(RealCellActivityAccessoryScope realCellActivityAccessoryScope, ItemAccessory.PortraitImage portraitImage, Function0 function0, Modifier modifier, Composer composer, int i) {
        int i2;
        Function0 function02;
        Modifier modifier2;
        realCellActivityAccessoryScope.getClass();
        portraitImage.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1882360349);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(realCellActivityAccessoryScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(portraitImage) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            function02 = function0;
            i2 |= gapComposer.changedInstance(function02) ? 256 : 128;
        } else {
            function02 = function0;
        }
        int i3 = i2 | 3072;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            AsyncImagePainter m1446rememberAsyncImagePainter19ie5dc = AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(0, 30, gapComposer, portraitImage.imageUrl);
            AsyncImagePainter.State state = (AsyncImagePainter.State) Updater.collectAsState(m1446rememberAsyncImagePainter19ie5dc.state, null, gapComposer, 1).getValue();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            CrossfadeKt.Crossfade(Boolean.valueOf(state instanceof AsyncImagePainter.State.Error), companion, (FiniteAnimationSpec) null, "PortraitImageAccessoryCrossfade", Expect_jvmKt.rememberComposableLambda(285625116, new SwipeToDismissKt$$ExternalSyntheticLambda2(realCellActivityAccessoryScope, function02, portraitImage, m1446rememberAsyncImagePainter19ie5dc, state, 1), gapComposer), gapComposer, ((i3 >> 6) & 112) | 27648, 4);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(realCellActivityAccessoryScope, portraitImage, function0, modifier2, i);
        }
    }

    public static final void PortraitImageFallbackButton(ItemAccessory.PortraitImage portraitImage, Function0 function0, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        portraitImage.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(93879153);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(portraitImage) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 >> 3;
            modifier2 = Modifier.Companion.$$INSTANCE;
            coil3.size.SizeKt.ButtonCompact(function0, modifier2, ButtonProminence.STANDARD, false, false, null, Expect_jvmKt.rememberComposableLambda(2029554281, new ActivityItemViewKt$$ExternalSyntheticLambda30(portraitImage, 1), gapComposer), gapComposer, (i4 & 14) | 1573248 | (i4 & 112), 56);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(portraitImage, function0, modifier2, i, 25);
        }
    }

    public static final void StackedAmounts(ItemAccessory.DualAmounts dualAmounts, Composer composer, int i) {
        TextStyle textStyle;
        TextStyle textStyle2;
        long j;
        dualAmounts.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1286800721);
        int i2 = i | (gapComposer.changedInstance(dualAmounts) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ItemAccessory.Amount amount = dualAmounts.primary;
            ItemAccessory.Amount amount2 = dualAmounts.secondary;
            PaymentHistoryData.AmountTreatment amountTreatment = amount.treatment;
            int[] iArr = WhenMappings.$EnumSwitchMapping$1;
            int i3 = iArr[amountTreatment.ordinal()];
            TextDecoration textDecoration = TextDecoration.LineThrough;
            if (i3 == 4) {
                gapComposer.startReplaceGroup(-335080734);
                textStyle = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, 0L, 0L, null, null, 0L, null, 0L, textDecoration, null, null, 0, 0L, null, null, 0, 16773119);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-335077988);
                textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                gapComposer.end(false);
            }
            if (iArr[amountTreatment.ordinal()] == 4) {
                gapComposer.startReplaceGroup(-335072926);
                textStyle2 = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall, 0L, 0L, null, null, 0L, null, 0L, textDecoration, null, null, 0, 0L, null, null, 0, 16773119);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-335070182);
                textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                gapComposer.end(false);
            }
            TextStyle textStyle3 = textStyle2;
            int i4 = iArr[amountTreatment.ordinal()];
            if (i4 == 1) {
                gapComposer.startReplaceGroup(-335063975);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.text.standard;
                gapComposer.end(false);
            } else if (i4 == 2) {
                gapComposer.startReplaceGroup(-335061512);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.text.success;
                gapComposer.end(false);
            } else {
                if (i4 != 3 && i4 != 4) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -335066699, false);
                }
                gapComposer.startReplaceGroup(-335058025);
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors3.semantic.text.subtle;
                gapComposer.end(false);
            }
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.End, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, amount.text, (Map) null, (Function1) null, false);
            String str = amount2.text;
            Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors4 == null) {
                colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors4.semantic.text.subtle, (Composer) gapComposer, (Modifier) null, textStyle3, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CartBannerViewKt$$ExternalSyntheticLambda2(dualAmounts, i, 25);
        }
    }
}
