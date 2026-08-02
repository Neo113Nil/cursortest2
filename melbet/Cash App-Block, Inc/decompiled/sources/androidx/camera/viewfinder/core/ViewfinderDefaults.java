package androidx.camera.viewfinder.core;

import androidx.camera.core.processing.TargetUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.camera.viewfinder.core.impl.quirk.DeviceQuirks;
import androidx.camera.viewfinder.core.impl.quirk.Quirk;
import androidx.camera.viewfinder.core.impl.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.viewfinder.core.impl.quirk.SurfaceViewStretchedQuirk;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.BlurKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextPainterKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.map.LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.ConstraintsSizeResolver$$ExternalSyntheticLambda0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.dynamite.zzg;
import com.google.mlkit.common.internal.zzc;
import com.google.mlkit.common.internal.zzd;
import com.google.mlkit.vision.text.zzb;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Fonts;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Motion;
import com.squareup.cash.arcade.MotionKt;
import com.squareup.cash.arcade.components.RadioKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.RadioKt$Radio$3$1;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.haptic.HapticVibratorKt;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.avatar.components.AvatarKt;
import com.squareup.cash.banking.views.BankingDialog$$ExternalSyntheticLambda1;
import com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda11;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.theme.MoneybotColors;
import com.squareup.cash.moneybot.theme.MoneybotColorsKt;
import com.squareup.cash.moneybot.theme.MoneybotThemeKt;
import com.squareup.cash.moneybot.viewmodels.chat.InChatPromptViewModel;
import com.squareup.cash.moneybot.views.card.InsightChartKt$$ExternalSyntheticLambda19;
import com.squareup.cash.moneybot.views.chat.InChatPromptUiKt$InChatPromptsVerticalStack$2$1;
import com.squareup.cash.moneybot.views.chat.PromptPillMotion;
import com.squareup.cash.moneybot.views.chat.RotatingPromptItem;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda13;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda2;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$SuggestionsVerticalStack$3$1;
import com.squareup.cash.moneybot.views.shared.LocalMoneybotAnimationsEnabledKt;
import com.squareup.cash.moneybot.widgets.KeyboardState;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.wallet.views.CardAppletTileKt$$ExternalSyntheticLambda5;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt___RangesKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.InteractionResult;

/* loaded from: classes3.dex */
public abstract class ViewfinderDefaults {
    public static final void InChatPromptAvatar(UiAvatar uiAvatar, Modifier modifier, Composer composer, int i) {
        Icons icons;
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-238698772);
        int i2 = (gapComposer.changedInstance(uiAvatar) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        int i3 = 3;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (uiAvatar == null) {
            gapComposer.startReplaceGroup(1390823795);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(1390823796);
            Icon icon = uiAvatar.icon;
            Color color = null;
            if (icon == null || (str = icon.arcade_id) == null) {
                icons = null;
            } else {
                Icons.Companion.getClass();
                icons = zzd.get(str);
            }
            AvatarEntry avatarEntry = AvatarsKt.toAvatarEntry(uiAvatar, null, gapComposer, 1);
            AvatarSize avatarSize = AvatarSize.Size32;
            if (icons != null) {
                gapComposer.startReplaceGroup(1634250803);
            } else {
                gapComposer.startReplaceGroup(1634292808);
                com.squareup.protos.cash.ui.Color color2 = uiAvatar.background_color;
                if (color2 == null) {
                    gapComposer.startReplaceGroup(1634375081);
                    gapComposer.end(false);
                } else {
                    color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -778562216, color2, gapComposer, false);
                }
                avatarEntry = AvatarEntry.m3382copyDuSw1wk$default(avatarEntry, color != null ? color.value : Color.Transparent, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
            }
            gapComposer.end(false);
            TextViewKt.Avatar(avatarSize, avatarEntry, modifier, false, gapComposer, ((i2 << 3) & 896) | 6, 24);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FakeOverlayLayerKt$$ExternalSyntheticLambda0(uiAvatar, modifier, i, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0947  */
    /* JADX WARN: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0311  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InChatPromptPill(Modifier modifier, InChatPromptViewModel inChatPromptViewModel, boolean z, boolean z2, boolean z3, PromptPillMotion promptPillMotion, Function0 function0, Composer composer, int i, int i2) {
        boolean z4;
        int i3;
        int i4;
        int i5;
        Function0 function02;
        boolean z5;
        PromptPillMotion promptPillMotion2;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        boolean z6;
        int i6;
        PromptPillMotion promptPillMotion3;
        Object rememberedValue;
        Object obj;
        boolean changed;
        Transition updateTransition;
        int ordinal;
        SpringSpec soft$default;
        int ordinal2;
        SpringSpec soft$default2;
        boolean isSeeking;
        int i7;
        boolean z7;
        Object m;
        boolean changed2;
        Object rememberedValue2;
        boolean changed3;
        Object rememberedValue3;
        boolean z8;
        Object m2;
        boolean changed4;
        Object rememberedValue4;
        boolean changed5;
        Object rememberedValue5;
        boolean z9;
        Object m3;
        boolean changed6;
        Object rememberedValue6;
        boolean changed7;
        Object rememberedValue7;
        boolean z10;
        Object m4;
        boolean changed8;
        Object rememberedValue8;
        boolean changed9;
        Object rememberedValue9;
        Transition.TransitionAnimationState transitionAnimationState;
        boolean z11;
        Object m5;
        boolean changed10;
        Object rememberedValue10;
        boolean changed11;
        Object rememberedValue11;
        boolean z12;
        Object m6;
        boolean changed12;
        Object rememberedValue12;
        boolean changed13;
        Object rememberedValue13;
        boolean changed14;
        Object rememberedValue14;
        boolean changedInstance;
        Object rememberedValue15;
        MoneybotColors moneybotColors;
        boolean z13;
        Modifier.Companion companion;
        Object rememberedValue16;
        Modifier clearAndSetSemantics;
        inChatPromptViewModel.getClass();
        function0.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1219687615);
        int i8 = (gapComposer2.changed(modifier) ? 4 : 2) | i | (gapComposer2.changedInstance(inChatPromptViewModel) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i8 |= gapComposer2.changed(z) ? 256 : 128;
        }
        int i9 = i8 | (gapComposer2.changed(z2) ? 2048 : 1024);
        if ((i2 & 16) == 0) {
            z4 = z3;
            if (gapComposer2.changed(z4)) {
                i3 = 16384;
                int i10 = i9 | i3;
                i4 = i2 & 32;
                int i11 = 196608;
                if (i4 == 0) {
                    if ((196608 & i) == 0) {
                        i11 = gapComposer2.changed(promptPillMotion == null ? -1 : promptPillMotion.ordinal()) ? PKIFailureInfo.unsupportedVersion : 65536;
                    }
                    i5 = i10 | (gapComposer2.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
                    if (gapComposer2.shouldExecute(i5 & 1, (599187 & i5) != 599186)) {
                        gapComposer2.startDefaults();
                        if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                            if ((i2 & 16) != 0) {
                                i5 &= -57345;
                                z4 = z;
                            }
                            if (i4 != 0) {
                                z6 = z4;
                                i6 = i5;
                                promptPillMotion3 = PromptPillMotion.Soft;
                                gapComposer2.endDefaults();
                                RealHapticVibrator realHapticVibrator = (RealHapticVibrator) gapComposer2.consume(HapticVibratorKt.LocalHapticVibrator);
                                Haptics haptics = (Haptics) gapComposer2.consume(HapticsKt.LocalHaptics);
                                rememberedValue = gapComposer2.rememberedValue();
                                obj = Composer.Companion.Empty;
                                if (rememberedValue == obj) {
                                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                                }
                                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                                changed = ((i6 & 896) != 256) | ((i6 & 7168) != 2048) | gapComposer2.changed(inChatPromptViewModel);
                                Object rememberedValue17 = gapComposer2.rememberedValue();
                                Object obj2 = rememberedValue17;
                                if (!changed || rememberedValue17 == obj) {
                                    MutableTransitionState mutableTransitionState = new MutableTransitionState(Boolean.valueOf(z2 && z));
                                    mutableTransitionState.setTargetState(Boolean.valueOf(z));
                                    gapComposer2.updateRememberedValue(mutableTransitionState);
                                    obj2 = mutableTransitionState;
                                }
                                updateTransition = AnimatableKt.updateTransition((MutableTransitionState) obj2, "pillVisibility", gapComposer2, 48);
                                ordinal = promptPillMotion3.ordinal();
                                if (ordinal != 0) {
                                    gapComposer2.startReplaceGroup(-406247860);
                                    soft$default = TargetUtils.soft$default((zzb) ((Motion) gapComposer2.consume(MotionKt.LocalMotion)).springs.text);
                                    gapComposer2.end(false);
                                } else {
                                    if (ordinal != 1) {
                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -406250282, false);
                                    }
                                    gapComposer2.startReplaceGroup(-406245266);
                                    soft$default = TargetUtils.steady$default((zzb) ((Motion) gapComposer2.consume(MotionKt.LocalMotion)).springs.text);
                                    gapComposer2.end(false);
                                }
                                ordinal2 = promptPillMotion3.ordinal();
                                if (ordinal2 != 0) {
                                    gapComposer2.startReplaceGroup(-406240887);
                                    soft$default2 = TargetUtils.soft$default((zzb) ((Motion) gapComposer2.consume(MotionKt.LocalMotion)).springs.text);
                                    gapComposer2.end(false);
                                } else {
                                    if (ordinal2 != 1) {
                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -406243312, false);
                                    }
                                    gapComposer2.startReplaceGroup(-406238389);
                                    soft$default2 = TargetUtils.steady$default((zzb) ((Motion) gapComposer2.consume(MotionKt.LocalMotion)).springs.text);
                                    gapComposer2.end(false);
                                }
                                SpringSpec springSpec = soft$default2;
                                TwoWayConverterImpl twoWayConverterImpl = AnimatableKt.FloatToVector;
                                isSeeking = updateTransition.isSeeking();
                                InteractionResult interactionResult = updateTransition.transitionState;
                                PromptPillMotion promptPillMotion4 = promptPillMotion3;
                                if (isSeeking) {
                                    gapComposer2.startReplaceGroup(1666573488);
                                    boolean changed15 = gapComposer2.changed(updateTransition);
                                    Object rememberedValue18 = gapComposer2.rememberedValue();
                                    if (changed15 || rememberedValue18 == obj) {
                                        Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                                        Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                        int i12 = i6;
                                        Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                                        i7 = i12;
                                        try {
                                            rememberedValue18 = interactionResult.getCurrentState();
                                            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                                            gapComposer2.updateRememberedValue(rememberedValue18);
                                        } finally {
                                        }
                                    } else {
                                        i7 = i6;
                                    }
                                    gapComposer2.end(false);
                                    m = rememberedValue18;
                                    z7 = false;
                                } else {
                                    i7 = i6;
                                    z7 = false;
                                    m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, 1666827533, false, interactionResult);
                                }
                                boolean booleanValue = ((Boolean) m).booleanValue();
                                gapComposer2.startReplaceGroup(-1125072827);
                                float f = !booleanValue ? 1.0f : RecyclerView.DECELERATION_RATE;
                                gapComposer2.end(z7);
                                Float valueOf = Float.valueOf(f);
                                changed2 = gapComposer2.changed(updateTransition);
                                rememberedValue2 = gapComposer2.rememberedValue();
                                if (!changed2 || rememberedValue2 == obj) {
                                    rememberedValue2 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 11));
                                    gapComposer2.updateRememberedValue(rememberedValue2);
                                }
                                boolean booleanValue2 = ((Boolean) ((State) rememberedValue2).getValue()).booleanValue();
                                gapComposer2.startReplaceGroup(-1125072827);
                                float f2 = !booleanValue2 ? 1.0f : RecyclerView.DECELERATION_RATE;
                                gapComposer2.end(false);
                                Float valueOf2 = Float.valueOf(f2);
                                changed3 = gapComposer2.changed(updateTransition);
                                rememberedValue3 = gapComposer2.rememberedValue();
                                if (!changed3 || rememberedValue3 == obj) {
                                    rememberedValue3 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 12));
                                    gapComposer2.updateRememberedValue(rememberedValue3);
                                }
                                ((Transition.Segment) ((State) rememberedValue3).getValue()).getClass();
                                gapComposer2.startReplaceGroup(-478212086);
                                gapComposer2.end(false);
                                SpringSpec springSpec2 = soft$default;
                                Transition.TransitionAnimationState createTransitionAnimation = AnimatableKt.createTransitionAnimation(updateTransition, valueOf, valueOf2, springSpec2, twoWayConverterImpl, gapComposer2, 196608);
                                if (updateTransition.isSeeking()) {
                                    gapComposer2.startReplaceGroup(1666573488);
                                    boolean changed16 = gapComposer2.changed(updateTransition);
                                    m2 = gapComposer2.rememberedValue();
                                    if (changed16 || m2 == obj) {
                                        Snapshot currentThreadSnapshot2 = zzg.getCurrentThreadSnapshot();
                                        Function1 readObserver2 = currentThreadSnapshot2 != null ? currentThreadSnapshot2.getReadObserver() : null;
                                        Snapshot makeCurrentNonObservable2 = zzg.makeCurrentNonObservable(currentThreadSnapshot2);
                                        try {
                                            Object currentState = interactionResult.getCurrentState();
                                            zzg.restoreNonObservable(currentThreadSnapshot2, makeCurrentNonObservable2, readObserver2);
                                            gapComposer2.updateRememberedValue(currentState);
                                            m2 = currentState;
                                        } finally {
                                        }
                                    }
                                    z8 = false;
                                    gapComposer2.end(false);
                                } else {
                                    z8 = false;
                                    m2 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, 1666827533, false, interactionResult);
                                }
                                boolean booleanValue3 = ((Boolean) m2).booleanValue();
                                gapComposer2.startReplaceGroup(654749489);
                                float f3 = !booleanValue3 ? 1.0f : 0.95f;
                                gapComposer2.end(z8);
                                Float valueOf3 = Float.valueOf(f3);
                                changed4 = gapComposer2.changed(updateTransition);
                                rememberedValue4 = gapComposer2.rememberedValue();
                                int i13 = 13;
                                if (!changed4 || rememberedValue4 == obj) {
                                    rememberedValue4 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, i13));
                                    gapComposer2.updateRememberedValue(rememberedValue4);
                                }
                                boolean booleanValue4 = ((Boolean) ((State) rememberedValue4).getValue()).booleanValue();
                                gapComposer2.startReplaceGroup(654749489);
                                float f4 = !booleanValue4 ? 1.0f : 0.95f;
                                gapComposer2.end(false);
                                Float valueOf4 = Float.valueOf(f4);
                                changed5 = gapComposer2.changed(updateTransition);
                                rememberedValue5 = gapComposer2.rememberedValue();
                                if (!changed5 || rememberedValue5 == obj) {
                                    rememberedValue5 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 14));
                                    gapComposer2.updateRememberedValue(rememberedValue5);
                                }
                                ((Transition.Segment) ((State) rememberedValue5).getValue()).getClass();
                                gapComposer2.startReplaceGroup(1301610230);
                                gapComposer2.end(false);
                                Transition.TransitionAnimationState createTransitionAnimation2 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf3, valueOf4, springSpec2, twoWayConverterImpl, gapComposer2, 196608);
                                TwoWayConverterImpl twoWayConverterImpl2 = AnimatableKt.DpToVector;
                                if (updateTransition.isSeeking()) {
                                    gapComposer2.startReplaceGroup(1666573488);
                                    boolean changed17 = gapComposer2.changed(updateTransition);
                                    m3 = gapComposer2.rememberedValue();
                                    if (changed17 || m3 == obj) {
                                        Snapshot currentThreadSnapshot3 = zzg.getCurrentThreadSnapshot();
                                        Function1 readObserver3 = currentThreadSnapshot3 != null ? currentThreadSnapshot3.getReadObserver() : null;
                                        Snapshot makeCurrentNonObservable3 = zzg.makeCurrentNonObservable(currentThreadSnapshot3);
                                        try {
                                            Object currentState2 = interactionResult.getCurrentState();
                                            zzg.restoreNonObservable(currentThreadSnapshot3, makeCurrentNonObservable3, readObserver3);
                                            gapComposer2.updateRememberedValue(currentState2);
                                            m3 = currentState2;
                                        } finally {
                                        }
                                    }
                                    z9 = false;
                                    gapComposer2.end(false);
                                } else {
                                    z9 = false;
                                    m3 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, 1666827533, false, interactionResult);
                                }
                                boolean booleanValue5 = ((Boolean) m3).booleanValue();
                                gapComposer2.startReplaceGroup(-691133765);
                                Dp m7 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, z9, !booleanValue5 ? RecyclerView.DECELERATION_RATE : 10.0f);
                                changed6 = gapComposer2.changed(updateTransition);
                                rememberedValue6 = gapComposer2.rememberedValue();
                                if (!changed6 || rememberedValue6 == obj) {
                                    rememberedValue6 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 8));
                                    gapComposer2.updateRememberedValue(rememberedValue6);
                                }
                                boolean booleanValue6 = ((Boolean) ((State) rememberedValue6).getValue()).booleanValue();
                                gapComposer2.startReplaceGroup(-691133765);
                                Dp m8 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, false, !booleanValue6 ? RecyclerView.DECELERATION_RATE : 10.0f);
                                changed7 = gapComposer2.changed(updateTransition);
                                rememberedValue7 = gapComposer2.rememberedValue();
                                if (!changed7 || rememberedValue7 == obj) {
                                    rememberedValue7 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 9));
                                    gapComposer2.updateRememberedValue(rememberedValue7);
                                }
                                ((Transition.Segment) ((State) rememberedValue7).getValue()).getClass();
                                gapComposer2.startReplaceGroup(-449615122);
                                gapComposer2.end(false);
                                Transition.TransitionAnimationState createTransitionAnimation3 = AnimatableKt.createTransitionAnimation(updateTransition, m7, m8, springSpec, twoWayConverterImpl2, gapComposer2, 196608);
                                if (updateTransition.isSeeking()) {
                                    gapComposer2.startReplaceGroup(1666573488);
                                    boolean changed18 = gapComposer2.changed(updateTransition);
                                    m4 = gapComposer2.rememberedValue();
                                    if (changed18 || m4 == obj) {
                                        Snapshot currentThreadSnapshot4 = zzg.getCurrentThreadSnapshot();
                                        Function1 readObserver4 = currentThreadSnapshot4 != null ? currentThreadSnapshot4.getReadObserver() : null;
                                        Snapshot makeCurrentNonObservable4 = zzg.makeCurrentNonObservable(currentThreadSnapshot4);
                                        try {
                                            Object currentState3 = interactionResult.getCurrentState();
                                            zzg.restoreNonObservable(currentThreadSnapshot4, makeCurrentNonObservable4, readObserver4);
                                            gapComposer2.updateRememberedValue(currentState3);
                                            m4 = currentState3;
                                        } finally {
                                        }
                                    }
                                    z10 = false;
                                    gapComposer2.end(false);
                                } else {
                                    z10 = false;
                                    m4 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, 1666827533, false, interactionResult);
                                }
                                boolean booleanValue7 = ((Boolean) m4).booleanValue();
                                gapComposer2.startReplaceGroup(891737673);
                                float f5 = !booleanValue7 ? 1.0f : RecyclerView.DECELERATION_RATE;
                                gapComposer2.end(z10);
                                Float valueOf5 = Float.valueOf(f5);
                                changed8 = gapComposer2.changed(updateTransition);
                                rememberedValue8 = gapComposer2.rememberedValue();
                                if (!changed8 || rememberedValue8 == obj) {
                                    rememberedValue8 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 15));
                                    gapComposer2.updateRememberedValue(rememberedValue8);
                                }
                                boolean booleanValue8 = ((Boolean) ((State) rememberedValue8).getValue()).booleanValue();
                                gapComposer2.startReplaceGroup(891737673);
                                float f6 = !booleanValue8 ? 1.0f : RecyclerView.DECELERATION_RATE;
                                gapComposer2.end(false);
                                Float valueOf6 = Float.valueOf(f6);
                                changed9 = gapComposer2.changed(updateTransition);
                                rememberedValue9 = gapComposer2.rememberedValue();
                                if (!changed9 || rememberedValue9 == obj) {
                                    rememberedValue9 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 16));
                                    gapComposer2.updateRememberedValue(rememberedValue9);
                                }
                                ((Transition.Segment) ((State) rememberedValue9).getValue()).getClass();
                                gapComposer2.startReplaceGroup(-926041202);
                                Drop$$ExternalSyntheticBUOutline0 drop$$ExternalSyntheticBUOutline0 = EasingKt.LinearEasing;
                                TweenSpec tween$default = AnimatableKt.tween$default(350, 0, drop$$ExternalSyntheticBUOutline0, 2);
                                gapComposer2.end(false);
                                Transition.TransitionAnimationState createTransitionAnimation4 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf5, valueOf6, tween$default, twoWayConverterImpl, gapComposer2, 196608);
                                if (updateTransition.isSeeking()) {
                                    gapComposer2.startReplaceGroup(1666573488);
                                    boolean changed19 = gapComposer2.changed(updateTransition);
                                    m5 = gapComposer2.rememberedValue();
                                    if (changed19 || m5 == obj) {
                                        Snapshot currentThreadSnapshot5 = zzg.getCurrentThreadSnapshot();
                                        Function1 readObserver5 = currentThreadSnapshot5 != null ? currentThreadSnapshot5.getReadObserver() : null;
                                        Snapshot makeCurrentNonObservable5 = zzg.makeCurrentNonObservable(currentThreadSnapshot5);
                                        transitionAnimationState = createTransitionAnimation4;
                                        try {
                                            Object currentState4 = interactionResult.getCurrentState();
                                            zzg.restoreNonObservable(currentThreadSnapshot5, makeCurrentNonObservable5, readObserver5);
                                            gapComposer2.updateRememberedValue(currentState4);
                                            m5 = currentState4;
                                        } finally {
                                        }
                                    } else {
                                        transitionAnimationState = createTransitionAnimation4;
                                    }
                                    z11 = false;
                                    gapComposer2.end(false);
                                } else {
                                    transitionAnimationState = createTransitionAnimation4;
                                    z11 = false;
                                    m5 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, 1666827533, false, interactionResult);
                                }
                                boolean booleanValue9 = ((Boolean) m5).booleanValue();
                                gapComposer2.startReplaceGroup(-539354720);
                                float f7 = !booleanValue9 ? 1.0f : RecyclerView.DECELERATION_RATE;
                                gapComposer2.end(z11);
                                Float valueOf7 = Float.valueOf(f7);
                                changed10 = gapComposer2.changed(updateTransition);
                                rememberedValue10 = gapComposer2.rememberedValue();
                                if (!changed10 || rememberedValue10 == obj) {
                                    rememberedValue10 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 17));
                                    gapComposer2.updateRememberedValue(rememberedValue10);
                                }
                                boolean booleanValue10 = ((Boolean) ((State) rememberedValue10).getValue()).booleanValue();
                                gapComposer2.startReplaceGroup(-539354720);
                                float f8 = !booleanValue10 ? 1.0f : RecyclerView.DECELERATION_RATE;
                                gapComposer2.end(false);
                                Float valueOf8 = Float.valueOf(f8);
                                changed11 = gapComposer2.changed(updateTransition);
                                rememberedValue11 = gapComposer2.rememberedValue();
                                if (!changed11 || rememberedValue11 == obj) {
                                    rememberedValue11 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 18));
                                    gapComposer2.updateRememberedValue(rememberedValue11);
                                }
                                ((Transition.Segment) ((State) rememberedValue11).getValue()).getClass();
                                gapComposer2.startReplaceGroup(-816655259);
                                TweenSpec tween$default2 = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, 0, drop$$ExternalSyntheticBUOutline0, 2);
                                gapComposer2.end(false);
                                Transition.TransitionAnimationState transitionAnimationState2 = transitionAnimationState;
                                Transition.TransitionAnimationState createTransitionAnimation5 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf7, valueOf8, tween$default2, twoWayConverterImpl, gapComposer2, 196608);
                                if (updateTransition.isSeeking()) {
                                    gapComposer2.startReplaceGroup(1666573488);
                                    boolean changed20 = gapComposer2.changed(updateTransition);
                                    m6 = gapComposer2.rememberedValue();
                                    if (changed20 || m6 == obj) {
                                        Snapshot currentThreadSnapshot6 = zzg.getCurrentThreadSnapshot();
                                        Function1 readObserver6 = currentThreadSnapshot6 != null ? currentThreadSnapshot6.getReadObserver() : null;
                                        Snapshot makeCurrentNonObservable6 = zzg.makeCurrentNonObservable(currentThreadSnapshot6);
                                        try {
                                            Object currentState5 = interactionResult.getCurrentState();
                                            zzg.restoreNonObservable(currentThreadSnapshot6, makeCurrentNonObservable6, readObserver6);
                                            gapComposer2.updateRememberedValue(currentState5);
                                            m6 = currentState5;
                                        } finally {
                                        }
                                    }
                                    gapComposer2.end(false);
                                    z12 = false;
                                } else {
                                    z12 = false;
                                    m6 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, 1666827533, false, interactionResult);
                                }
                                boolean booleanValue11 = ((Boolean) m6).booleanValue();
                                gapComposer2.startReplaceGroup(1995519455);
                                float f9 = !booleanValue11 ? 1.0f : RecyclerView.DECELERATION_RATE;
                                gapComposer2.end(z12);
                                Float valueOf9 = Float.valueOf(f9);
                                changed12 = gapComposer2.changed(updateTransition);
                                rememberedValue12 = gapComposer2.rememberedValue();
                                if (!changed12 || rememberedValue12 == obj) {
                                    rememberedValue12 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 19));
                                    gapComposer2.updateRememberedValue(rememberedValue12);
                                }
                                boolean booleanValue12 = ((Boolean) ((State) rememberedValue12).getValue()).booleanValue();
                                gapComposer2.startReplaceGroup(1995519455);
                                float f10 = !booleanValue12 ? 1.0f : RecyclerView.DECELERATION_RATE;
                                gapComposer2.end(false);
                                Float valueOf10 = Float.valueOf(f10);
                                changed13 = gapComposer2.changed(updateTransition);
                                rememberedValue13 = gapComposer2.rememberedValue();
                                if (!changed13 || rememberedValue13 == obj) {
                                    rememberedValue13 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 10));
                                    gapComposer2.updateRememberedValue(rememberedValue13);
                                }
                                ((Transition.Segment) ((State) rememberedValue13).getValue()).getClass();
                                gapComposer2.startReplaceGroup(1478949178);
                                TweenSpec tween$default3 = AnimatableKt.tween$default(1800, 0, drop$$ExternalSyntheticBUOutline0, 2);
                                gapComposer2.end(false);
                                Transition.TransitionAnimationState createTransitionAnimation6 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf9, valueOf10, tween$default3, twoWayConverterImpl, gapComposer2, 196608);
                                ProvidableCompositionLocal providableCompositionLocal = ArcadeThemeKt.LocalSizes;
                                ((DefaultSizes) gapComposer2.consume(providableCompositionLocal)).getClass();
                                Object obj3 = DefaultSizes.border.entries;
                                RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(40.0f);
                                changed14 = gapComposer2.changed(createTransitionAnimation) | gapComposer2.changed(createTransitionAnimation2) | gapComposer2.changed(createTransitionAnimation3);
                                rememberedValue14 = gapComposer2.rememberedValue();
                                if (!changed14 || rememberedValue14 == obj) {
                                    rememberedValue14 = new CardAppletTileKt$$ExternalSyntheticLambda5(createTransitionAnimation, createTransitionAnimation2, createTransitionAnimation3, 1);
                                    gapComposer2.updateRememberedValue(rememberedValue14);
                                }
                                Modifier clip = ClipKt.clip(ColorKt.graphicsLayer(modifier, (Function1) rememberedValue14), m340RoundedCornerShape0680j_4);
                                Role role = new Role(0);
                                changedInstance = gapComposer2.changedInstance(realHapticVibrator) | gapComposer2.changed(haptics) | ((i7 & 3670016) != 1048576);
                                rememberedValue15 = gapComposer2.rememberedValue();
                                if (!changedInstance || rememberedValue15 == obj) {
                                    function02 = function0;
                                    rememberedValue15 = new SuggestionUiKt$$ExternalSyntheticLambda2(realHapticVibrator, haptics, function02, 1);
                                    gapComposer2.updateRememberedValue(rememberedValue15);
                                } else {
                                    function02 = function0;
                                }
                                Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(clip, mutableInteractionSourceImpl, null, z6, null, role, (Function0) rememberedValue15, 8);
                                moneybotColors = (MoneybotColors) gapComposer2.consume(MoneybotThemeKt.LocalMoneybotColors);
                                if (moneybotColors != null) {
                                    gapComposer2.startReplaceGroup(-973090538);
                                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                    z13 = false;
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1762997739);
                                        gapComposer2.end(false);
                                    }
                                    moneybotColors = MoneybotColorsKt.fromArcade(colors);
                                } else {
                                    z13 = false;
                                    gapComposer2.startReplaceGroup(-973091964);
                                }
                                gapComposer2.end(z13);
                                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m182clickableO2vRcR0$default, moneybotColors.pill.background, m340RoundedCornerShape0680j_4);
                                ((DefaultSizes) gapComposer2.consume(providableCompositionLocal)).getClass();
                                zzc zzcVar = DefaultSizes.spacing;
                                zzcVar.getClass();
                                Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(m177backgroundbw27NRU, 16.0f, 12.0f, 20.0f, 12.0f);
                                companion = Modifier.Companion.$$INSTANCE;
                                if (z || !z6) {
                                    gapComposer2.startReplaceGroup(-406159466);
                                    rememberedValue16 = gapComposer2.rememberedValue();
                                    if (rememberedValue16 == obj) {
                                        rememberedValue16 = new InsightChartKt$$ExternalSyntheticLambda19(5);
                                        gapComposer2.updateRememberedValue(rememberedValue16);
                                    }
                                    clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue16);
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.startReplaceGroup(-406160217);
                                    gapComposer2.end(false);
                                    clearAndSetSemantics = companion;
                                }
                                Modifier then = m301paddingqDBjuR0.then(clearAndSetSemantics);
                                BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                                ((DefaultSizes) gapComposer2.consume(providableCompositionLocal)).getClass();
                                zzcVar.getClass();
                                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer2, 48);
                                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, then);
                                ComposeUiNode.Companion.getClass();
                                Function0 function03 = ComposeUiNode.Companion.Constructor;
                                if (gapComposer2.applier != null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer2.startReusableNode();
                                if (gapComposer2.inserting) {
                                    gapComposer2.createNode(function03);
                                } else {
                                    gapComposer2.useNode();
                                }
                                Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                UiAvatar uiAvatar = inChatPromptViewModel.avatar;
                                boolean changed21 = gapComposer2.changed(transitionAnimationState2);
                                Object rememberedValue19 = gapComposer2.rememberedValue();
                                if (changed21 || rememberedValue19 == obj) {
                                    rememberedValue19 = new MoneyTabUIKt$$ExternalSyntheticLambda10(transitionAnimationState2, 13);
                                    gapComposer2.updateRememberedValue(rememberedValue19);
                                }
                                InChatPromptAvatar(uiAvatar, BlurKt.m586blurF8QBwvs(ColorKt.graphicsLayer(companion, (Function1) rememberedValue19), lerp(4.0f, RecyclerView.DECELERATION_RATE, ((Number) transitionAnimationState2.getValue()).floatValue()), ColorKt.RectangleShape), gapComposer2, 0);
                                TextStyle textStyle = new TextStyle(0L, Room.getSp(20), new FontWeight(400), Fonts.CashSans, 0L, 0L, 0, 0, Room.getSp(26), null, 16646105);
                                String str = inChatPromptViewModel.body;
                                Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                } else {
                                    gapComposer2.startReplaceGroup(-1762997739);
                                    gapComposer2.end(false);
                                }
                                m126PromptRevealTextcf5BqRc(str, textStyle, colors2.semantic.text.subtle, ((Number) createTransitionAnimation5.value$delegate.getValue()).floatValue(), ((Number) createTransitionAnimation6.value$delegate.getValue()).floatValue(), gapComposer2, 0);
                                GapComposer gapComposer3 = gapComposer2;
                                gapComposer3.end(true);
                                z5 = z6;
                                promptPillMotion2 = promptPillMotion4;
                                gapComposer = gapComposer3;
                            }
                        } else {
                            gapComposer2.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i5 &= -57345;
                            }
                        }
                        z6 = z4;
                        i6 = i5;
                        promptPillMotion3 = promptPillMotion;
                        gapComposer2.endDefaults();
                        RealHapticVibrator realHapticVibrator2 = (RealHapticVibrator) gapComposer2.consume(HapticVibratorKt.LocalHapticVibrator);
                        Haptics haptics2 = (Haptics) gapComposer2.consume(HapticsKt.LocalHaptics);
                        rememberedValue = gapComposer2.rememberedValue();
                        obj = Composer.Companion.Empty;
                        if (rememberedValue == obj) {
                        }
                        MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) rememberedValue;
                        changed = ((i6 & 896) != 256) | ((i6 & 7168) != 2048) | gapComposer2.changed(inChatPromptViewModel);
                        Object rememberedValue172 = gapComposer2.rememberedValue();
                        Object obj22 = rememberedValue172;
                        if (!changed) {
                        }
                        MutableTransitionState mutableTransitionState2 = new MutableTransitionState(Boolean.valueOf(z2 && z));
                        mutableTransitionState2.setTargetState(Boolean.valueOf(z));
                        gapComposer2.updateRememberedValue(mutableTransitionState2);
                        obj22 = mutableTransitionState2;
                        updateTransition = AnimatableKt.updateTransition((MutableTransitionState) obj22, "pillVisibility", gapComposer2, 48);
                        ordinal = promptPillMotion3.ordinal();
                        if (ordinal != 0) {
                        }
                        ordinal2 = promptPillMotion3.ordinal();
                        if (ordinal2 != 0) {
                        }
                        SpringSpec springSpec3 = soft$default2;
                        TwoWayConverterImpl twoWayConverterImpl3 = AnimatableKt.FloatToVector;
                        isSeeking = updateTransition.isSeeking();
                        InteractionResult interactionResult2 = updateTransition.transitionState;
                        PromptPillMotion promptPillMotion42 = promptPillMotion3;
                        if (isSeeking) {
                        }
                        boolean booleanValue13 = ((Boolean) m).booleanValue();
                        gapComposer2.startReplaceGroup(-1125072827);
                        if (!booleanValue13) {
                        }
                        gapComposer2.end(z7);
                        Float valueOf11 = Float.valueOf(f);
                        changed2 = gapComposer2.changed(updateTransition);
                        rememberedValue2 = gapComposer2.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue2 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 11));
                        gapComposer2.updateRememberedValue(rememberedValue2);
                        boolean booleanValue22 = ((Boolean) ((State) rememberedValue2).getValue()).booleanValue();
                        gapComposer2.startReplaceGroup(-1125072827);
                        if (!booleanValue22) {
                        }
                        gapComposer2.end(false);
                        Float valueOf22 = Float.valueOf(f2);
                        changed3 = gapComposer2.changed(updateTransition);
                        rememberedValue3 = gapComposer2.rememberedValue();
                        if (!changed3) {
                        }
                        rememberedValue3 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 12));
                        gapComposer2.updateRememberedValue(rememberedValue3);
                        ((Transition.Segment) ((State) rememberedValue3).getValue()).getClass();
                        gapComposer2.startReplaceGroup(-478212086);
                        gapComposer2.end(false);
                        SpringSpec springSpec22 = soft$default;
                        Transition.TransitionAnimationState createTransitionAnimation7 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf11, valueOf22, springSpec22, twoWayConverterImpl3, gapComposer2, 196608);
                        if (updateTransition.isSeeking()) {
                        }
                        boolean booleanValue32 = ((Boolean) m2).booleanValue();
                        gapComposer2.startReplaceGroup(654749489);
                        if (!booleanValue32) {
                        }
                        gapComposer2.end(z8);
                        Float valueOf32 = Float.valueOf(f3);
                        changed4 = gapComposer2.changed(updateTransition);
                        rememberedValue4 = gapComposer2.rememberedValue();
                        int i132 = 13;
                        if (!changed4) {
                        }
                        rememberedValue4 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, i132));
                        gapComposer2.updateRememberedValue(rememberedValue4);
                        boolean booleanValue42 = ((Boolean) ((State) rememberedValue4).getValue()).booleanValue();
                        gapComposer2.startReplaceGroup(654749489);
                        if (!booleanValue42) {
                        }
                        gapComposer2.end(false);
                        Float valueOf42 = Float.valueOf(f4);
                        changed5 = gapComposer2.changed(updateTransition);
                        rememberedValue5 = gapComposer2.rememberedValue();
                        if (!changed5) {
                        }
                        rememberedValue5 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 14));
                        gapComposer2.updateRememberedValue(rememberedValue5);
                        ((Transition.Segment) ((State) rememberedValue5).getValue()).getClass();
                        gapComposer2.startReplaceGroup(1301610230);
                        gapComposer2.end(false);
                        Transition.TransitionAnimationState createTransitionAnimation22 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf32, valueOf42, springSpec22, twoWayConverterImpl3, gapComposer2, 196608);
                        TwoWayConverterImpl twoWayConverterImpl22 = AnimatableKt.DpToVector;
                        if (updateTransition.isSeeking()) {
                        }
                        boolean booleanValue52 = ((Boolean) m3).booleanValue();
                        gapComposer2.startReplaceGroup(-691133765);
                        Dp m72 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, z9, !booleanValue52 ? RecyclerView.DECELERATION_RATE : 10.0f);
                        changed6 = gapComposer2.changed(updateTransition);
                        rememberedValue6 = gapComposer2.rememberedValue();
                        if (!changed6) {
                        }
                        rememberedValue6 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 8));
                        gapComposer2.updateRememberedValue(rememberedValue6);
                        boolean booleanValue62 = ((Boolean) ((State) rememberedValue6).getValue()).booleanValue();
                        gapComposer2.startReplaceGroup(-691133765);
                        Dp m82 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, false, !booleanValue62 ? RecyclerView.DECELERATION_RATE : 10.0f);
                        changed7 = gapComposer2.changed(updateTransition);
                        rememberedValue7 = gapComposer2.rememberedValue();
                        if (!changed7) {
                        }
                        rememberedValue7 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 9));
                        gapComposer2.updateRememberedValue(rememberedValue7);
                        ((Transition.Segment) ((State) rememberedValue7).getValue()).getClass();
                        gapComposer2.startReplaceGroup(-449615122);
                        gapComposer2.end(false);
                        Transition.TransitionAnimationState createTransitionAnimation32 = AnimatableKt.createTransitionAnimation(updateTransition, m72, m82, springSpec3, twoWayConverterImpl22, gapComposer2, 196608);
                        if (updateTransition.isSeeking()) {
                        }
                        boolean booleanValue72 = ((Boolean) m4).booleanValue();
                        gapComposer2.startReplaceGroup(891737673);
                        if (!booleanValue72) {
                        }
                        gapComposer2.end(z10);
                        Float valueOf52 = Float.valueOf(f5);
                        changed8 = gapComposer2.changed(updateTransition);
                        rememberedValue8 = gapComposer2.rememberedValue();
                        if (!changed8) {
                        }
                        rememberedValue8 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 15));
                        gapComposer2.updateRememberedValue(rememberedValue8);
                        boolean booleanValue82 = ((Boolean) ((State) rememberedValue8).getValue()).booleanValue();
                        gapComposer2.startReplaceGroup(891737673);
                        if (!booleanValue82) {
                        }
                        gapComposer2.end(false);
                        Float valueOf62 = Float.valueOf(f6);
                        changed9 = gapComposer2.changed(updateTransition);
                        rememberedValue9 = gapComposer2.rememberedValue();
                        if (!changed9) {
                        }
                        rememberedValue9 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 16));
                        gapComposer2.updateRememberedValue(rememberedValue9);
                        ((Transition.Segment) ((State) rememberedValue9).getValue()).getClass();
                        gapComposer2.startReplaceGroup(-926041202);
                        Drop$$ExternalSyntheticBUOutline0 drop$$ExternalSyntheticBUOutline02 = EasingKt.LinearEasing;
                        TweenSpec tween$default4 = AnimatableKt.tween$default(350, 0, drop$$ExternalSyntheticBUOutline02, 2);
                        gapComposer2.end(false);
                        Transition.TransitionAnimationState createTransitionAnimation42 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf52, valueOf62, tween$default4, twoWayConverterImpl3, gapComposer2, 196608);
                        if (updateTransition.isSeeking()) {
                        }
                        boolean booleanValue92 = ((Boolean) m5).booleanValue();
                        gapComposer2.startReplaceGroup(-539354720);
                        if (!booleanValue92) {
                        }
                        gapComposer2.end(z11);
                        Float valueOf72 = Float.valueOf(f7);
                        changed10 = gapComposer2.changed(updateTransition);
                        rememberedValue10 = gapComposer2.rememberedValue();
                        if (!changed10) {
                        }
                        rememberedValue10 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 17));
                        gapComposer2.updateRememberedValue(rememberedValue10);
                        boolean booleanValue102 = ((Boolean) ((State) rememberedValue10).getValue()).booleanValue();
                        gapComposer2.startReplaceGroup(-539354720);
                        if (!booleanValue102) {
                        }
                        gapComposer2.end(false);
                        Float valueOf82 = Float.valueOf(f8);
                        changed11 = gapComposer2.changed(updateTransition);
                        rememberedValue11 = gapComposer2.rememberedValue();
                        if (!changed11) {
                        }
                        rememberedValue11 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 18));
                        gapComposer2.updateRememberedValue(rememberedValue11);
                        ((Transition.Segment) ((State) rememberedValue11).getValue()).getClass();
                        gapComposer2.startReplaceGroup(-816655259);
                        TweenSpec tween$default22 = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, 0, drop$$ExternalSyntheticBUOutline02, 2);
                        gapComposer2.end(false);
                        Transition.TransitionAnimationState transitionAnimationState22 = transitionAnimationState;
                        Transition.TransitionAnimationState createTransitionAnimation52 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf72, valueOf82, tween$default22, twoWayConverterImpl3, gapComposer2, 196608);
                        if (updateTransition.isSeeking()) {
                        }
                        boolean booleanValue112 = ((Boolean) m6).booleanValue();
                        gapComposer2.startReplaceGroup(1995519455);
                        if (!booleanValue112) {
                        }
                        gapComposer2.end(z12);
                        Float valueOf92 = Float.valueOf(f9);
                        changed12 = gapComposer2.changed(updateTransition);
                        rememberedValue12 = gapComposer2.rememberedValue();
                        if (!changed12) {
                        }
                        rememberedValue12 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 19));
                        gapComposer2.updateRememberedValue(rememberedValue12);
                        boolean booleanValue122 = ((Boolean) ((State) rememberedValue12).getValue()).booleanValue();
                        gapComposer2.startReplaceGroup(1995519455);
                        if (!booleanValue122) {
                        }
                        gapComposer2.end(false);
                        Float valueOf102 = Float.valueOf(f10);
                        changed13 = gapComposer2.changed(updateTransition);
                        rememberedValue13 = gapComposer2.rememberedValue();
                        if (!changed13) {
                        }
                        rememberedValue13 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 10));
                        gapComposer2.updateRememberedValue(rememberedValue13);
                        ((Transition.Segment) ((State) rememberedValue13).getValue()).getClass();
                        gapComposer2.startReplaceGroup(1478949178);
                        TweenSpec tween$default32 = AnimatableKt.tween$default(1800, 0, drop$$ExternalSyntheticBUOutline02, 2);
                        gapComposer2.end(false);
                        Transition.TransitionAnimationState createTransitionAnimation62 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf92, valueOf102, tween$default32, twoWayConverterImpl3, gapComposer2, 196608);
                        ProvidableCompositionLocal providableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
                        ((DefaultSizes) gapComposer2.consume(providableCompositionLocal2)).getClass();
                        Object obj32 = DefaultSizes.border.entries;
                        RoundedCornerShape m340RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(40.0f);
                        changed14 = gapComposer2.changed(createTransitionAnimation7) | gapComposer2.changed(createTransitionAnimation22) | gapComposer2.changed(createTransitionAnimation32);
                        rememberedValue14 = gapComposer2.rememberedValue();
                        if (!changed14) {
                        }
                        rememberedValue14 = new CardAppletTileKt$$ExternalSyntheticLambda5(createTransitionAnimation7, createTransitionAnimation22, createTransitionAnimation32, 1);
                        gapComposer2.updateRememberedValue(rememberedValue14);
                        Modifier clip2 = ClipKt.clip(ColorKt.graphicsLayer(modifier, (Function1) rememberedValue14), m340RoundedCornerShape0680j_42);
                        Role role2 = new Role(0);
                        changedInstance = gapComposer2.changedInstance(realHapticVibrator2) | gapComposer2.changed(haptics2) | ((i7 & 3670016) != 1048576);
                        rememberedValue15 = gapComposer2.rememberedValue();
                        if (changedInstance) {
                        }
                        function02 = function0;
                        rememberedValue15 = new SuggestionUiKt$$ExternalSyntheticLambda2(realHapticVibrator2, haptics2, function02, 1);
                        gapComposer2.updateRememberedValue(rememberedValue15);
                        Modifier m182clickableO2vRcR0$default2 = ImageKt.m182clickableO2vRcR0$default(clip2, mutableInteractionSourceImpl2, null, z6, null, role2, (Function0) rememberedValue15, 8);
                        moneybotColors = (MoneybotColors) gapComposer2.consume(MoneybotThemeKt.LocalMoneybotColors);
                        if (moneybotColors != null) {
                        }
                        gapComposer2.end(z13);
                        Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(m182clickableO2vRcR0$default2, moneybotColors.pill.background, m340RoundedCornerShape0680j_42);
                        ((DefaultSizes) gapComposer2.consume(providableCompositionLocal2)).getClass();
                        zzc zzcVar2 = DefaultSizes.spacing;
                        zzcVar2.getClass();
                        Modifier m301paddingqDBjuR02 = SpacerKt.m301paddingqDBjuR0(m177backgroundbw27NRU2, 16.0f, 12.0f, 20.0f, 12.0f);
                        companion = Modifier.Companion.$$INSTANCE;
                        if (z) {
                        }
                        gapComposer2.startReplaceGroup(-406159466);
                        rememberedValue16 = gapComposer2.rememberedValue();
                        if (rememberedValue16 == obj) {
                        }
                        clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue16);
                        gapComposer2.end(false);
                        Modifier then2 = m301paddingqDBjuR02.then(clearAndSetSemantics);
                        BiasAlignment.Vertical vertical2 = Alignment.Companion.CenterVertically;
                        ((DefaultSizes) gapComposer2.consume(providableCompositionLocal2)).getClass();
                        zzcVar2.getClass();
                        RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical2, gapComposer2, 48);
                        int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, then2);
                        ComposeUiNode.Companion.getClass();
                        Function0 function032 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer2.applier != null) {
                        }
                    } else {
                        function02 = function0;
                        gapComposer2.skipToGroupEnd();
                        z5 = z4;
                        promptPillMotion2 = promptPillMotion;
                        gapComposer = gapComposer2;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.block = new CalendarRowKt$$ExternalSyntheticLambda11(modifier, inChatPromptViewModel, z, z2, z5, promptPillMotion2, function02, i, i2);
                        return;
                    }
                    return;
                }
                i10 |= i11;
                i5 = i10 | (gapComposer2.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
                if (gapComposer2.shouldExecute(i5 & 1, (599187 & i5) != 599186)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
        } else {
            z4 = z3;
        }
        i3 = PKIFailureInfo.certRevoked;
        int i102 = i9 | i3;
        i4 = i2 & 32;
        int i112 = 196608;
        if (i4 == 0) {
        }
        i102 |= i112;
        i5 = i102 | (gapComposer2.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer2.shouldExecute(i5 & 1, (599187 & i5) != 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [int] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object] */
    public static final void InChatPromptsVerticalStack(final Modifier modifier, final FocusOwnerImpl focusOwnerImpl, final List list, final KeyboardState keyboardState, final boolean z, Function1 function1, final Function1 function12, Composer composer, final int i) {
        Modifier modifier2;
        FocusOwnerImpl focusOwnerImpl2;
        GapComposer gapComposer;
        final Function1 function13;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        Function1 function14;
        int i2;
        Object inChatPromptUiKt$InChatPromptsVerticalStack$2$1;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController;
        NeverEqualPolicy neverEqualPolicy;
        boolean z2;
        float f;
        SnapshotStateMap snapshotStateMap;
        List list2;
        ?? r4;
        Object obj;
        Function1 function15;
        float f2;
        int i3;
        focusOwnerImpl.getClass();
        function12.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(706730340);
        int i4 = 4;
        int i5 = i | (gapComposer2.changed(modifier) ? 4 : 2) | (gapComposer2.changedInstance(focusOwnerImpl) ? 32 : 16) | (gapComposer2.changedInstance(list) ? 256 : 128) | (gapComposer2.changed(keyboardState.ordinal()) ? 2048 : 1024) | (gapComposer2.changed(z) ? 16384 : PKIFailureInfo.certRevoked) | 196608 | (gapComposer2.changedInstance(function12) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer2.shouldExecute(i5 & 1, (599187 & i5) != 599186)) {
            gapComposer2.startDefaults();
            int i6 = i & 1;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (i6 == 0 || gapComposer2.getDefaultsInvalid()) {
                ?? rememberedValue = gapComposer2.rememberedValue();
                InsightChartKt$$ExternalSyntheticLambda19 insightChartKt$$ExternalSyntheticLambda19 = rememberedValue;
                if (rememberedValue == neverEqualPolicy2) {
                    InsightChartKt$$ExternalSyntheticLambda19 insightChartKt$$ExternalSyntheticLambda192 = new InsightChartKt$$ExternalSyntheticLambda19(i4);
                    gapComposer2.updateRememberedValue(insightChartKt$$ExternalSyntheticLambda192);
                    insightChartKt$$ExternalSyntheticLambda19 = insightChartKt$$ExternalSyntheticLambda192;
                }
                function14 = insightChartKt$$ExternalSyntheticLambda19;
            } else {
                gapComposer2.skipToGroupEnd();
                function14 = function1;
            }
            gapComposer2.endDefaults();
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = (DelegatingSoftwareKeyboardController) gapComposer2.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Boolean bool = (Boolean) gapComposer2.consume(LocalMoneybotAnimationsEnabledKt.LocalMoneybotAnimationsEnabled);
            boolean booleanValue = bool.booleanValue();
            boolean changed = gapComposer2.changed(list);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            Object obj2 = rememberedValue2;
            if (changed || rememberedValue2 == neverEqualPolicy2) {
                List take = CollectionsKt.take(list, 3);
                gapComposer2.updateRememberedValue(take);
                obj2 = take;
            }
            List list3 = (List) obj2;
            boolean changed2 = gapComposer2.changed(list3);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            Object obj3 = rememberedValue3;
            if (changed2 || rememberedValue3 == neverEqualPolicy2) {
                SnapshotStateMap snapshotStateMap2 = new SnapshotStateMap();
                gapComposer2.updateRememberedValue(snapshotStateMap2);
                obj3 = snapshotStateMap2;
            }
            SnapshotStateMap snapshotStateMap3 = (SnapshotStateMap) obj3;
            boolean changed3 = gapComposer2.changed(list3) | gapComposer2.changed(snapshotStateMap3);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            Object obj4 = rememberedValue4;
            if (changed3 || rememberedValue4 == neverEqualPolicy2) {
                DerivedSnapshotState derivedStateOf = Updater.derivedStateOf(new UtilsKt$$ExternalSyntheticLambda0(5, snapshotStateMap3, list3));
                gapComposer2.updateRememberedValue(derivedStateOf);
                obj4 = derivedStateOf;
            }
            State state = (State) obj4;
            boolean changed4 = gapComposer2.changed(list3);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            Object obj5 = rememberedValue5;
            if (changed4 || rememberedValue5 == neverEqualPolicy2) {
                Animatable Animatable = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer2.updateRememberedValue(Animatable);
                obj5 = Animatable;
            }
            Animatable animatable = (Animatable) obj5;
            SpringSpec soft$default = TargetUtils.soft$default((zzb) ((Motion) gapComposer2.consume(MotionKt.LocalMotion)).springs.text);
            boolean changed5 = gapComposer2.changed(list3) | gapComposer2.changed(booleanValue);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            Object obj6 = rememberedValue6;
            if (changed5 || rememberedValue6 == neverEqualPolicy2) {
                obj6 = Recorder$$ExternalSyntheticOutline1.m(!booleanValue || list3.isEmpty(), gapComposer2);
            }
            MutableState mutableState = (MutableState) obj6;
            boolean changed6 = gapComposer2.changed(list3) | gapComposer2.changed(booleanValue);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            Object obj7 = rememberedValue7;
            if (changed6 || rememberedValue7 == neverEqualPolicy2) {
                obj7 = Boxes$$ExternalSyntheticOutline1.m(booleanValue ? 0 : list3.size(), gapComposer2);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj7;
            Boolean valueOf = Boolean.valueOf(z);
            Boolean bool2 = (Boolean) state.getValue();
            bool2.booleanValue();
            Object[] objArr = {list3, bool, valueOf, bool2};
            boolean changed7 = ((57344 & i5) == 16384) | gapComposer2.changed(booleanValue) | gapComposer2.changed(parcelableSnapshotMutableIntState) | gapComposer2.changedInstance(list3) | gapComposer2.changedInstance(animatable) | gapComposer2.changed(mutableState) | gapComposer2.changed(state) | gapComposer2.changed(snapshotStateMap3) | gapComposer2.changed(soft$default);
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (changed7 || rememberedValue8 == neverEqualPolicy2) {
                i2 = i5;
                delegatingSoftwareKeyboardController = delegatingSoftwareKeyboardController2;
                neverEqualPolicy = neverEqualPolicy2;
                z2 = false;
                f = RecyclerView.DECELERATION_RATE;
                inChatPromptUiKt$InChatPromptsVerticalStack$2$1 = new InChatPromptUiKt$InChatPromptsVerticalStack$2$1(booleanValue, list3, animatable, z, snapshotStateMap3, parcelableSnapshotMutableIntState, mutableState, state, soft$default, null);
                snapshotStateMap = snapshotStateMap3;
                mutableState = mutableState;
                animatable = animatable;
                list2 = list3;
                gapComposer2.updateRememberedValue(inChatPromptUiKt$InChatPromptsVerticalStack$2$1);
            } else {
                i2 = i5;
                neverEqualPolicy = neverEqualPolicy2;
                z2 = false;
                f = RecyclerView.DECELERATION_RATE;
                inChatPromptUiKt$InChatPromptsVerticalStack$2$1 = rememberedValue8;
                delegatingSoftwareKeyboardController = delegatingSoftwareKeyboardController2;
                snapshotStateMap = snapshotStateMap3;
                list2 = list3;
            }
            Updater.LaunchedEffect(objArr, (Function2) inChatPromptUiKt$InChatPromptsVerticalStack$2$1, gapComposer2);
            if (booleanValue && !z) {
                endRestartGroup = gapComposer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i7 = 0;
                    final Function1 function16 = function14;
                    function2 = new Function2(modifier, focusOwnerImpl, list, keyboardState, z, function16, function12, i, i7) { // from class: com.squareup.cash.moneybot.views.chat.InChatPromptUiKt$$ExternalSyntheticLambda2
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ Modifier f$0;
                        public final /* synthetic */ FocusOwnerImpl f$1;
                        public final /* synthetic */ List f$2;
                        public final /* synthetic */ KeyboardState f$3;
                        public final /* synthetic */ boolean f$4;
                        public final /* synthetic */ Function1 f$5;
                        public final /* synthetic */ Function1 f$6;

                        {
                            this.$r8$classId = i7;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj8, Object obj9) {
                            switch (this.$r8$classId) {
                                case 0:
                                    ((Integer) obj9).getClass();
                                    int updateChangedFlags = Updater.updateChangedFlags(1);
                                    ViewfinderDefaults.InChatPromptsVerticalStack(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (Composer) obj8, updateChangedFlags);
                                    break;
                                default:
                                    ((Integer) obj9).getClass();
                                    int updateChangedFlags2 = Updater.updateChangedFlags(1);
                                    ViewfinderDefaults.InChatPromptsVerticalStack(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (Composer) obj8, updateChangedFlags2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            modifier2 = modifier;
            focusOwnerImpl2 = focusOwnerImpl;
            Function1 function17 = function12;
            Function1 function18 = function14;
            Object rememberedValue9 = gapComposer2.rememberedValue();
            Object obj8 = rememberedValue9;
            if (rememberedValue9 == neverEqualPolicy) {
                InsightChartKt$$ExternalSyntheticLambda19 insightChartKt$$ExternalSyntheticLambda193 = new InsightChartKt$$ExternalSyntheticLambda19(6);
                gapComposer2.updateRememberedValue(insightChartKt$$ExternalSyntheticLambda193);
                obj8 = insightChartKt$$ExternalSyntheticLambda193;
            }
            Modifier graphicsLayer = ColorKt.graphicsLayer(modifier2, (Function1) obj8);
            boolean z3 = booleanValue;
            boolean changedInstance = (((((i2 & 7168) ^ 3072) <= 2048 || !gapComposer2.changed(keyboardState.ordinal())) && (i2 & 3072) != 2048) ? z2 : true) | gapComposer2.changedInstance(focusOwnerImpl2) | gapComposer2.changed(delegatingSoftwareKeyboardController);
            Object rememberedValue10 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue10 == neverEqualPolicy) {
                r4 = 1;
                SuggestionUiKt$SuggestionsVerticalStack$3$1 suggestionUiKt$SuggestionsVerticalStack$3$1 = new SuggestionUiKt$SuggestionsVerticalStack$3$1(keyboardState, focusOwnerImpl2, delegatingSoftwareKeyboardController, true ? 1 : 0);
                gapComposer2.updateRememberedValue(suggestionUiKt$SuggestionsVerticalStack$3$1);
                obj = suggestionUiKt$SuggestionsVerticalStack$3$1;
            } else {
                r4 = 1;
                obj = rememberedValue10;
            }
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(graphicsLayer, keyboardState, (PointerInputEventHandler) obj);
            if (!((Boolean) mutableState.getValue()).booleanValue() || list.size() <= 3) {
                Function1 function19 = function18;
                gapComposer = gapComposer2;
                gapComposer.startReplaceGroup(277194112);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, z2 ? 1 : 0);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, pointerInput);
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
                gapComposer.startReplaceGroup(-112675635);
                int i8 = 0;
                for (Object obj9 : list2) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    InChatPromptViewModel inChatPromptViewModel = (InChatPromptViewModel) obj9;
                    boolean z4 = i8 < parcelableSnapshotMutableIntState.getIntValue();
                    boolean changed8 = gapComposer.changed(snapshotStateMap) | gapComposer.changed(i8);
                    Object rememberedValue11 = gapComposer.rememberedValue();
                    if (changed8 || rememberedValue11 == neverEqualPolicy) {
                        rememberedValue11 = new PoolGoalMetKt$$ExternalSyntheticLambda6(snapshotStateMap, i8, function19, 18);
                        gapComposer.updateRememberedValue(rememberedValue11);
                    }
                    Modifier onLayoutRectChanged = RulerKt.onLayoutRectChanged(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue11);
                    boolean changedInstance2 = gapComposer.changedInstance(animatable);
                    int i10 = i2;
                    Object rememberedValue12 = gapComposer.rememberedValue();
                    if (changedInstance2 || rememberedValue12 == neverEqualPolicy) {
                        rememberedValue12 = new RadioKt$$ExternalSyntheticLambda1(animatable, 12);
                        gapComposer.updateRememberedValue(rememberedValue12);
                    }
                    Modifier graphicsLayer2 = ColorKt.graphicsLayer(onLayoutRectChanged, (Function1) rememberedValue12);
                    if (i8 < CollectionsKt__CollectionsKt.getLastIndex(list2)) {
                        gapComposer.startReplaceGroup(-1774063424);
                        ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        gapComposer.end(false);
                        f2 = 8.0f;
                    } else {
                        gapComposer.startReplaceGroup(-1773985893);
                        gapComposer.end(false);
                        f2 = f;
                    }
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(graphicsLayer2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f2, 7);
                    boolean changedInstance3 = gapComposer.changedInstance(inChatPromptViewModel) | ((i10 & 3670016) == 1048576) | gapComposer.changedInstance(focusOwnerImpl2);
                    Object rememberedValue13 = gapComposer.rememberedValue();
                    if (changedInstance3 || rememberedValue13 == neverEqualPolicy) {
                        i3 = 1;
                        rememberedValue13 = new BasicShieetScope$$ExternalSyntheticLambda10(i3, inChatPromptViewModel, function17, focusOwnerImpl2);
                        gapComposer.updateRememberedValue(rememberedValue13);
                    } else {
                        i3 = 1;
                    }
                    boolean z5 = z3;
                    InChatPromptPill(m302paddingqDBjuR0$default, inChatPromptViewModel, z4, z5, false, null, (Function0) rememberedValue13, gapComposer, 0, 48);
                    z3 = z5;
                    neverEqualPolicy = neverEqualPolicy;
                    list2 = list2;
                    function17 = function12;
                    i8 = i9;
                    i2 = i10;
                    function19 = function19;
                }
                function15 = function19;
                Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, false);
            } else {
                gapComposer2.startReplaceGroup(276853763);
                boolean changedInstance4 = ((i2 & 3670016) == 1048576 ? r4 : z2) | gapComposer2.changedInstance(focusOwnerImpl2);
                Object rememberedValue14 = gapComposer2.rememberedValue();
                Object obj10 = rememberedValue14;
                if (changedInstance4 || rememberedValue14 == neverEqualPolicy) {
                    SuggestionUiKt$$ExternalSyntheticLambda13 suggestionUiKt$$ExternalSyntheticLambda13 = new SuggestionUiKt$$ExternalSyntheticLambda13(function17, focusOwnerImpl2, r4);
                    gapComposer2.updateRememberedValue(suggestionUiKt$$ExternalSyntheticLambda13);
                    obj10 = suggestionUiKt$$ExternalSyntheticLambda13;
                }
                RotatingInChatPromptStack(pointerInput, list, z3, function18, (Function1) obj10, gapComposer2, ((i2 >> 3) & 112) | 3072);
                gapComposer = gapComposer2;
                gapComposer.end(z2);
                function15 = function18;
            }
            function13 = function15;
        } else {
            modifier2 = modifier;
            focusOwnerImpl2 = focusOwnerImpl;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            function13 = function1;
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i11 = 1;
            final Modifier modifier3 = modifier2;
            final FocusOwnerImpl focusOwnerImpl3 = focusOwnerImpl2;
            function2 = new Function2(modifier3, focusOwnerImpl3, list, keyboardState, z, function13, function12, i, i11) { // from class: com.squareup.cash.moneybot.views.chat.InChatPromptUiKt$$ExternalSyntheticLambda2
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ Modifier f$0;
                public final /* synthetic */ FocusOwnerImpl f$1;
                public final /* synthetic */ List f$2;
                public final /* synthetic */ KeyboardState f$3;
                public final /* synthetic */ boolean f$4;
                public final /* synthetic */ Function1 f$5;
                public final /* synthetic */ Function1 f$6;

                {
                    this.$r8$classId = i11;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj82, Object obj92) {
                    switch (this.$r8$classId) {
                        case 0:
                            ((Integer) obj92).getClass();
                            int updateChangedFlags = Updater.updateChangedFlags(1);
                            ViewfinderDefaults.InChatPromptsVerticalStack(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (Composer) obj82, updateChangedFlags);
                            break;
                        default:
                            ((Integer) obj92).getClass();
                            int updateChangedFlags2 = Updater.updateChangedFlags(1);
                            ViewfinderDefaults.InChatPromptsVerticalStack(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (Composer) obj82, updateChangedFlags2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    /* renamed from: PromptRevealText-cf5BqRc, reason: not valid java name */
    public static final void m126PromptRevealTextcf5BqRc(final String str, final TextStyle textStyle, final long j, final float f, final float f2, Composer composer, final int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1419552334);
        int i2 = i | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changed(textStyle) ? 32 : 16) | (gapComposer2.changed(j) ? 256 : 128) | (gapComposer2.changed(f) ? 2048 : 1024) | (gapComposer2.changed(f2) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2 & 14;
            int i4 = i2 & 112;
            Brush m3408rememberMoneybotSpotlightBrushcbhI11c = AvatarKt.m3408rememberMoneybotSpotlightBrushcbhI11c(str, textStyle, 1.0f, j, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, gapComposer2, (i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i2 << 3) & 7168), 48);
            final TextMeasurer rememberTextMeasurer = TextPainterKt.rememberTextMeasurer(gapComposer2);
            Modifier clipToBounds = ClipKt.clipToBounds(Modifier.Companion.$$INSTANCE);
            boolean changed = gapComposer2.changed(rememberTextMeasurer) | (i3 == 4) | (i4 == 32) | ((i2 & 7168) == 2048);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MeasurePolicy() { // from class: com.squareup.cash.moneybot.views.chat.InChatPromptUiKt$PromptRevealText$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j2) {
                        measureScope.getClass();
                        list.getClass();
                        int i5 = 0;
                        TextLayoutResult m980measurexDpz5zY$default = TextMeasurer.m980measurexDpz5zY$default(TextMeasurer.this, new AnnotatedString(str), textStyle, false, 0, ConstraintsKt.Constraints$default(0, Constraints.m1025getMaxWidthimpl(j2), 0, 0, 13), null, null, null, 1980);
                        int i6 = m980measurexDpz5zY$default.multiParagraph.lineCount;
                        if (i6 > 0) {
                            IntProgressionIterator it = RangesKt___RangesKt.until(0, i6).iterator();
                            if (!it.hasNext) {
                                a$$ExternalSyntheticBUOutline0.m();
                                return null;
                            }
                            float lineRight = m980measurexDpz5zY$default.getLineRight(it.nextInt());
                            while (it.hasNext) {
                                lineRight = Math.max(lineRight, m980measurexDpz5zY$default.getLineRight(it.nextInt()));
                            }
                            i5 = (int) Math.ceil(lineRight);
                        }
                        Measurable measurable = (Measurable) CollectionsKt.single(list);
                        int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j2);
                        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j2, 0, i5 > m1025getMaxWidthimpl ? m1025getMaxWidthimpl : i5, 0, 0, 12));
                        return MeasureScope.layout$default(measureScope, MathKt__MathJVMKt.roundToInt(RangesKt___RangesKt.coerceIn(f, RecyclerView.DECELERATION_RATE, 1.0f) * mo833measureBRTryo0.width), mo833measureBRTryo0.height, new ConstraintsSizeResolver$$ExternalSyntheticLambda0(mo833measureBRTryo0, 18));
                    }
                };
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, clipToBounds);
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
            Updater.m576setimpl(gapComposer2, measurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            BasicTextKt.m347BasicTextRWo7tUw(str, null, TextStyle.m993copyNs73l9s$default(textStyle, m3408rememberMoneybotSpotlightBrushcbhI11c, new LineHeightStyle(LineHeightStyle.Alignment.Center, 0, 0), 31457278), null, 0, false, 0, 0, null, gapComposer2, i3, IptcConstants.IMAGE_RESOURCE_BLOCK_DUOTONE_IMAGE_INFO);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(str, textStyle, j, f, f2, i) { // from class: com.squareup.cash.moneybot.views.chat.InChatPromptUiKt$$ExternalSyntheticLambda19
                public final /* synthetic */ String f$0;
                public final /* synthetic */ TextStyle f$1;
                public final /* synthetic */ long f$2;
                public final /* synthetic */ float f$3;
                public final /* synthetic */ float f$4;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    ViewfinderDefaults.m126PromptRevealTextcf5BqRc(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void RotatingInChatPromptStack(Modifier modifier, List list, boolean z, Function1 function1, Function1 function12, Composer composer, int i) {
        Function1 function13;
        List list2;
        GapComposer gapComposer;
        final Animatable animatable;
        final int i2;
        Boolean bool;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState;
        int i3;
        int i4;
        Function1 function14 = function12;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1222853864);
        int i5 = (i & 6) == 0 ? (gapComposer2.changed(modifier) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= gapComposer2.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer2.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= gapComposer2.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= gapComposer2.changedInstance(function14) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer2.shouldExecute(i5 & 1, (i5 & 9363) != 9362)) {
            int min = Math.min(3, list.size());
            boolean z2 = list.size() > 3;
            boolean changed = gapComposer2.changed(list);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                rememberedValue = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Animatable animatable2 = (Animatable) rememberedValue;
            SpringSpec steady$default = TargetUtils.steady$default((zzb) ((Motion) gapComposer2.consume(MotionKt.LocalMotion)).springs.text);
            boolean changed2 = gapComposer2.changed(list);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue2 == obj) {
                rememberedValue2 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer2);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) rememberedValue2;
            boolean changed3 = gapComposer2.changed(list);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue3 == obj) {
                rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState = (MutableState) rememberedValue3;
            Boolean valueOf = Boolean.valueOf(z2);
            Boolean valueOf2 = Boolean.valueOf(z);
            int i6 = i5;
            boolean changed4 = gapComposer2.changed(parcelableSnapshotMutableIntState2) | gapComposer2.changed(mutableState) | gapComposer2.changedInstance(animatable2) | gapComposer2.changed(z2) | ((i5 & 896) == 256) | gapComposer2.changed(steady$default) | gapComposer2.changedInstance(list);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changed4 || rememberedValue4 == obj) {
                animatable = animatable2;
                i2 = min;
                bool = valueOf;
                boolean z3 = z2;
                parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState2;
                i3 = i6;
                i4 = 0;
                list2 = list;
                Object radioKt$Radio$3$1 = new RadioKt$Radio$3$1(animatable, z3, z, steady$default, list2, parcelableSnapshotMutableIntState, mutableState, null);
                gapComposer2.updateRememberedValue(radioKt$Radio$3$1);
                rememberedValue4 = radioKt$Radio$3$1;
            } else {
                list2 = list;
                i2 = min;
                bool = valueOf;
                animatable = animatable2;
                parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState2;
                i3 = i6;
                i4 = 0;
            }
            Updater.LaunchedEffect(list2, bool, valueOf2, (Function2) rememberedValue4, gapComposer2);
            boolean changed5 = gapComposer2.changed(parcelableSnapshotMutableIntState.getIntValue()) | gapComposer2.changed(list2) | gapComposer2.changed(i2) | gapComposer2.changed(((Boolean) mutableState.getValue()).booleanValue());
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed5 || rememberedValue5 == obj) {
                int intValue = parcelableSnapshotMutableIntState.getIntValue();
                boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                if (list2.isEmpty() || i2 == 0) {
                    rememberedValue5 = EmptyList.INSTANCE;
                } else {
                    int i7 = i2 + ((!booleanValue || list2.size() <= i2) ? i4 : 1);
                    ArrayList arrayList = new ArrayList(i7);
                    int i8 = i4;
                    while (i8 < i7) {
                        int size = (intValue + i8) % list2.size();
                        int i9 = i8;
                        arrayList.add(new RotatingPromptItem(size, (InChatPromptViewModel) list2.get(size), i9, (booleanValue && i8 == 0) ? 1 : i4, (booleanValue && i8 == i2) ? 1 : i4));
                        i8 = i9 + 1;
                    }
                    rememberedValue5 = arrayList;
                }
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            final List<RotatingPromptItem> list3 = (List) rememberedValue5;
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            boolean changed6 = gapComposer2.changed(8.0f) | gapComposer2.changed(mutableState) | gapComposer2.changedInstance(animatable) | gapComposer2.changed(i2) | gapComposer2.changedInstance(list3);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changed6 || rememberedValue6 == obj) {
                rememberedValue6 = new MeasurePolicy() { // from class: com.squareup.cash.moneybot.views.chat.InChatPromptUiKt$RotatingInChatPromptStack$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list4, long j) {
                        int i10;
                        measureScope.getClass();
                        list4.getClass();
                        List list5 = list4;
                        final ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                        Iterator it = list5.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((Measurable) it.next()).mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, 0, 0, 0, 0, 14)));
                        }
                        int mo230roundToPx0680j_4 = measureScope.mo230roundToPx0680j_4(8.0f);
                        final MutableState mutableState2 = mutableState;
                        final float floatValue = ((Boolean) mutableState2.getValue()).booleanValue() ? ((Number) Animatable.this.getValue()).floatValue() : RecyclerView.DECELERATION_RATE;
                        int i11 = i2;
                        Iterator it2 = CollectionsKt.take(arrayList2, i11).iterator();
                        int i12 = 0;
                        while (it2.hasNext()) {
                            i12 += ((Placeable) it2.next()).height;
                        }
                        int i13 = i11 - 1;
                        int i14 = ((i13 < 0 ? 0 : i13) * mo230roundToPx0680j_4) + i12;
                        if (!((Boolean) mutableState2.getValue()).booleanValue() || arrayList2.size() <= i11) {
                            i10 = i14;
                        } else {
                            Iterator it3 = CollectionsKt.take(CollectionsKt.drop(arrayList2, 1), i11).iterator();
                            int i15 = 0;
                            while (it3.hasNext()) {
                                i15 += ((Placeable) it3.next()).height;
                            }
                            i10 = ((i13 < 0 ? 0 : i13) * mo230roundToPx0680j_4) + i15;
                        }
                        int i16 = (!((Boolean) mutableState2.getValue()).booleanValue() || arrayList2.isEmpty()) ? 0 : ((Placeable) CollectionsKt.first((List) arrayList2)).height + mo230roundToPx0680j_4;
                        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        Iterator it4 = arrayList2.iterator();
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            Integer num = null;
                            if (!it4.hasNext()) {
                                final ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                                Iterator it5 = arrayList2.iterator();
                                if (it5.hasNext()) {
                                    Integer valueOf3 = Integer.valueOf(((Placeable) it5.next()).width);
                                    while (it5.hasNext()) {
                                        Integer valueOf4 = Integer.valueOf(((Placeable) it5.next()).width);
                                        if (valueOf3.compareTo(valueOf4) < 0) {
                                            valueOf3 = valueOf4;
                                        }
                                    }
                                    num = valueOf3;
                                }
                                int coerceIn = RangesKt___RangesKt.coerceIn(num != null ? num.intValue() : Constraints.m1027getMinWidthimpl(j), Constraints.m1027getMinWidthimpl(j), Constraints.m1025getMaxWidthimpl(j));
                                int coerceIn2 = RangesKt___RangesKt.coerceIn(MathKt__MathJVMKt.roundToInt(ViewfinderDefaults.lerp(i14, i10, floatValue)), Constraints.m1026getMinHeightimpl(j), Constraints.m1024getMaxHeightimpl(j));
                                final List list6 = list3;
                                final int i19 = i16;
                                return MeasureScope.layout$default(measureScope, coerceIn, coerceIn2, new Function1() { // from class: com.squareup.cash.moneybot.views.chat.InChatPromptUiKt$RotatingInChatPromptStack$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj2;
                                        placementScope.getClass();
                                        int i20 = 0;
                                        for (Object obj3 : arrayList2) {
                                            int i21 = i20 + 1;
                                            if (i20 < 0) {
                                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                                throw null;
                                            }
                                            placementScope.placeRelative((Placeable) obj3, 0, ((Number) build.get(i20)).intValue() - ((!((Boolean) mutableState2.getValue()).booleanValue() || ((RotatingPromptItem) list6.get(i20)).slotIndex <= 0) ? 0 : MathKt__MathJVMKt.roundToInt(i19 * floatValue)), RecyclerView.DECELERATION_RATE);
                                            i20 = i21;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                            }
                            Object next = it4.next();
                            int i20 = i17 + 1;
                            if (i17 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw null;
                            }
                            createListBuilder.add(Integer.valueOf(i18));
                            i18 += ((Placeable) next).height;
                            boolean z4 = i17 < i13;
                            boolean z5 = ((Boolean) mutableState2.getValue()).booleanValue() && i17 == i13;
                            if (z4 || z5) {
                                i18 += mo230roundToPx0680j_4;
                            }
                            i17 = i20;
                        }
                    }
                };
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue6;
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function0);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, measurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer2.startReplaceGroup(-681358603);
            for (RotatingPromptItem rotatingPromptItem : list3) {
                gapComposer2.startMovableGroup(564799073, rotatingPromptItem.key);
                int i10 = (gapComposer2.changedInstance(rotatingPromptItem) ? 1 : 0) | ((i3 & 7168) == 2048 ? 1 : i4);
                Object rememberedValue7 = gapComposer2.rememberedValue();
                if (i10 != 0 || rememberedValue7 == obj) {
                    rememberedValue7 = new MusicViewKt$$ExternalSyntheticLambda6(8, rotatingPromptItem, function1);
                    gapComposer2.updateRememberedValue(rememberedValue7);
                }
                Modifier onLayoutRectChanged = RulerKt.onLayoutRectChanged(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue7);
                boolean changedInstance = gapComposer2.changedInstance(rotatingPromptItem) | gapComposer2.changedInstance(animatable);
                Object rememberedValue8 = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue8 == obj) {
                    rememberedValue8 = new MusicViewKt$$ExternalSyntheticLambda6(9, rotatingPromptItem, animatable);
                    gapComposer2.updateRememberedValue(rememberedValue8);
                }
                Modifier graphicsLayer = ColorKt.graphicsLayer(onLayoutRectChanged, (Function1) rememberedValue8);
                InChatPromptViewModel inChatPromptViewModel = rotatingPromptItem.prompt;
                boolean z4 = (z && rotatingPromptItem.isIncoming) ? 1 : i4;
                boolean z5 = !rotatingPromptItem.isOutgoing;
                PromptPillMotion promptPillMotion = PromptPillMotion.Steady;
                int i11 = ((57344 & i3) == 16384 ? 1 : i4) | (gapComposer2.changedInstance(rotatingPromptItem) ? 1 : 0);
                Object rememberedValue9 = gapComposer2.rememberedValue();
                if (i11 != 0 || rememberedValue9 == obj) {
                    rememberedValue9 = new UtilsKt$$ExternalSyntheticLambda0(4, function12, rotatingPromptItem);
                    gapComposer2.updateRememberedValue(rememberedValue9);
                }
                GapComposer gapComposer3 = gapComposer2;
                boolean z6 = i4;
                InChatPromptPill(graphicsLayer, inChatPromptViewModel, true, z4, z5, promptPillMotion, (Function0) rememberedValue9, gapComposer3, 196992, 0);
                gapComposer3.end(z6);
                i3 = i3;
                obj = obj;
                i4 = z6 ? 1 : 0;
                gapComposer2 = gapComposer3;
            }
            function13 = function1;
            function14 = function12;
            GapComposer gapComposer4 = gapComposer2;
            gapComposer4.end(i4);
            gapComposer4.end(true);
            gapComposer = gapComposer4;
        } else {
            function13 = function1;
            list2 = list;
            GapComposer gapComposer5 = gapComposer2;
            gapComposer5.skipToGroupEnd();
            gapComposer = gapComposer5;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(modifier, list2, z, function13, function14, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SectionHeader(ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function2 function2, Function0 function0, Function2 function22, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2 function23;
        int i5;
        Function0 function02;
        int i6;
        Function2 function24;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-316123639);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                function23 = function2;
                i3 |= gapComposer.changedInstance(function23) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= gapComposer.changedInstance(function02) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function24 = function22;
                        i3 |= gapComposer.changedInstance(function24) ? 16384 : PKIFailureInfo.certRevoked;
                        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            if (i7 != 0) {
                                modifier2 = companion;
                            }
                            if (i4 != 0) {
                                function23 = null;
                            }
                            if (i5 != 0) {
                                function02 = null;
                            }
                            if (i6 != 0) {
                                function24 = null;
                            }
                            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(modifier2, ((Dp) gapComposer.consume(ArcadeThemeKt.LocalScreenMargin)).value, RecyclerView.DECELERATION_RATE, 2);
                            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
                            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer, 54);
                            Modifier modifier4 = modifier2;
                            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
                            gapComposer.startReusableNode();
                            if (gapComposer.inserting) {
                                gapComposer.createNode(layoutNode$Companion$Constructor$1);
                            } else {
                                gapComposer.useNode();
                            }
                            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalTextStyle;
                            ProvidedValue defaultProvidedValue$runtime = dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(Strings.getTypography(gapComposer).sectionTitle);
                            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTextColor;
                            Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, staticProvidableCompositionLocal)}, Expect_jvmKt.rememberComposableLambda(-414318417, new BankingDialog$$ExternalSyntheticLambda1(2, function23, composableLambdaImpl, function02), gapComposer), gapComposer, 56);
                            gapComposer.end(true);
                            if (function24 != null) {
                                gapComposer.startReplaceGroup(1024394326);
                                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                                Updater.CompositionLocalProvider(new ProvidedValue[]{dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(Strings.getTypography(gapComposer).bodyMedium), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, staticProvidableCompositionLocal)}, Expect_jvmKt.rememberComposableLambda(128148632, new ToastKt$$ExternalSyntheticLambda11(13, function24), gapComposer), gapComposer, 56);
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(1024633615);
                                gapComposer.end(false);
                            }
                            gapComposer.end(true);
                            modifier3 = modifier4;
                        } else {
                            gapComposer.skipToGroupEnd();
                            modifier3 = modifier2;
                        }
                        Function2 function25 = function23;
                        Function0 function03 = function02;
                        Function2 function26 = function24;
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3((Object) composableLambdaImpl, modifier3, (Object) function25, (Object) function03, (Object) function26, i, i2, 12);
                            return;
                        }
                        return;
                    }
                    function24 = function22;
                    if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
                    }
                    Function2 function252 = function23;
                    Function0 function032 = function02;
                    Function2 function262 = function24;
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function02 = function0;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function24 = function22;
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
                }
                Function2 function2522 = function23;
                Function0 function0322 = function02;
                Function2 function2622 = function24;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function23 = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function02 = function0;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function24 = function22;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            }
            Function2 function25222 = function23;
            Function0 function03222 = function02;
            Function2 function26222 = function24;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function23 = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function02 = function0;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function24 = function22;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
        }
        Function2 function252222 = function23;
        Function0 function032222 = function02;
        Function2 function262222 = function24;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final float access$stackShiftPx(int i, Map map, int i2) {
        if (1 > i || i >= i2 || map.size() < i2) {
            return RecyclerView.DECELERATION_RATE;
        }
        int i3 = 0;
        IntProgressionIterator it = RangesKt___RangesKt.until(0, i2).iterator();
        int i4 = 0;
        while (it.hasNext) {
            Integer num = (Integer) map.get(Integer.valueOf(it.nextInt()));
            if (num == null) {
                return RecyclerView.DECELERATION_RATE;
            }
            i4 += num.intValue();
        }
        IntProgressionIterator it2 = RangesKt___RangesKt.until(0, i).iterator();
        while (it2.hasNext) {
            Integer num2 = (Integer) map.get(Integer.valueOf(it2.nextInt()));
            if (num2 == null) {
                return RecyclerView.DECELERATION_RATE;
            }
            i3 += num2.intValue();
        }
        return i4 - i3;
    }

    public static final ImplementationMode getImplementationMode() {
        ArrayList arrayList = DeviceQuirks.QUIRKS.quirks;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Quirk) it.next()) instanceof SurfaceViewStretchedQuirk) {
                    break;
                }
            }
        }
        ArrayList arrayList2 = DeviceQuirks.QUIRKS.quirks;
        if (arrayList2 == null || !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (((Quirk) it2.next()) instanceof SurfaceViewNotCroppedByParentQuirk) {
                    return ImplementationMode.EMBEDDED;
                }
            }
        }
        return ImplementationMode.EXTERNAL;
    }

    public static final float lerp(float f, float f2, float f3) {
        return (RangesKt___RangesKt.coerceIn(f3, RecyclerView.DECELERATION_RATE, 1.0f) * (f2 - f)) + f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SectionHeader(String str, Modifier modifier, String str2, Function0 function0, String str3, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str4;
        int i5;
        int i6;
        Function0 function02;
        Modifier modifier3;
        String str5;
        String str6;
        RecomposeScopeImpl endRestartGroup;
        ComposableLambdaImpl composableLambdaImpl;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-414358907);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                str4 = str2;
                i3 |= gapComposer.changed(str4) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= gapComposer.changed(str3) ? 16384 : PKIFailureInfo.certRevoked;
                        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
                            Modifier modifier4 = i7 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                            ComposableLambdaImpl composableLambdaImpl2 = null;
                            if (i4 != 0) {
                                str4 = null;
                            }
                            Function0 function03 = i5 != 0 ? null : function0;
                            String str7 = i6 != 0 ? null : str3;
                            if (str4 == null) {
                                gapComposer.startReplaceGroup(-429921799);
                                gapComposer.end(false);
                                composableLambdaImpl = null;
                            } else {
                                gapComposer.startReplaceGroup(-429921798);
                                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1172735684, new TransfersViewKt$$ExternalSyntheticLambda5(str4, 7), gapComposer);
                                gapComposer.end(false);
                                composableLambdaImpl = rememberComposableLambda;
                            }
                            if (str7 == null) {
                                gapComposer.startReplaceGroup(-429868417);
                            } else {
                                gapComposer.startReplaceGroup(-429868416);
                                composableLambdaImpl2 = Expect_jvmKt.rememberComposableLambda(740336583, new TransfersViewKt$$ExternalSyntheticLambda5(str7, 8), gapComposer);
                            }
                            gapComposer.end(false);
                            SectionHeader(Expect_jvmKt.rememberComposableLambda(900413100, new TransfersViewKt$$ExternalSyntheticLambda5(str, 9), gapComposer), modifier4, composableLambdaImpl, function03, composableLambdaImpl2, gapComposer, (i3 & 112) | 6 | (i3 & 7168), 0);
                            String str8 = str4;
                            str6 = str7;
                            str5 = str8;
                            modifier3 = modifier4;
                            function02 = function03;
                        } else {
                            gapComposer.skipToGroupEnd();
                            function02 = function0;
                            modifier3 = modifier2;
                            str5 = str4;
                            str6 = str3;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3((Object) str, modifier3, (Object) str5, (Object) function02, (Object) str6, i, i2, 11);
                            return;
                        }
                        return;
                    }
                    if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            str4 = str2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str4 = str2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
