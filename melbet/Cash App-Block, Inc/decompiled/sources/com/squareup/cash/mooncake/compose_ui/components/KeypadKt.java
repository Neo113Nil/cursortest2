package com.squareup.cash.mooncake.compose_ui.components;

import android.content.Context;
import android.content.res.Resources;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$Horizontal;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.SimpleLayoutKt$$ExternalSyntheticLambda0;
import androidx.compose.material.RippleKt;
import androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
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
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.core.os.BundleKt;
import androidx.media3.ui.compose.PlayerSurfaceKt$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.map.LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.mikepenz.markdown.compose.elements.MarkdownCodeKt$$ExternalSyntheticLambda4;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountToolbarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.BadgeKt$BadgeAssetLayout$3$2$1;
import com.squareup.cash.arcade.components.FilterBarKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.components.avatar.AvatarKt$$ExternalSyntheticLambda7;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda5;
import com.squareup.cash.bitcoin.views.map.BitcoinMapOnboardingViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.core.CardSceneEffectKt$$ExternalSyntheticLambda5;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.core.views.BottomNavigationKt$$ExternalSyntheticLambda7;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.invitations.InviteErrorDialogKt$$ExternalSyntheticLambda4;
import com.squareup.cash.money.applets.common.views.SharedUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda11;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda37;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.views.plugins.SlottedTableKt$$ExternalSyntheticLambda2;
import com.squareup.cash.moneybot.widgets.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.components.MooncakeLargeIcon;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.components.SplitButtons;
import com.squareup.cash.mooncake.compose_ui.ComposeColorPalette;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypography;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda6;
import com.squareup.cash.offers.db.OffersHomeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.cash.overlays.OverlaysKt$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.StartPoolAmountKt$$ExternalSyntheticLambda9;
import com.squareup.cash.retro.views.PaymentPlanSummaryViewKt$$ExternalSyntheticLambda28;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda13;
import com.squareup.cash.support.chat.views.input.InputAreaKt$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.widget.keypad.ExtraButton;
import com.squareup.util.cash.Countries;
import com.squareup.util.coroutines.StateFlowKt$$ExternalSyntheticLambda3;
import com.squareup.workflow1.Snapshots;
import com.stripe.android.uicore.elements.DropdownFieldUIKt$$ExternalSyntheticLambda4;
import com.valentinilk.shimmer.Shimmer;
import com.valentinilk.shimmer.ShimmerBounds;
import com.valentinilk.shimmer.ShimmerKt;
import com.valentinilk.shimmer.ShimmerTheme;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class KeypadKt {
    public static final ComposableLambdaImpl lambda$631649248 = new ComposableLambdaImpl(new MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(29), false, 631649248);
    public static final ComposableLambdaImpl lambda$1306078879 = new ComposableLambdaImpl(new NfcNotAvailableKt$$ExternalSyntheticLambda6(1), false, 1306078879);
    public static final ComposableLambdaImpl lambda$278539346 = new ComposableLambdaImpl(new NfcNotAvailableKt$$ExternalSyntheticLambda6(2), false, 278539346);
    public static final ComposableLambdaImpl lambda$1835924848 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(23), false, 1835924848);
    public static final ComposableLambdaImpl lambda$982154686 = new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(24), false, 982154686);

    static {
        new ComposableLambdaImpl(new NfcNotAvailableKt$$ExternalSyntheticLambda6(3), false, -141776469);
        new ComposableLambdaImpl(new NfcNotAvailableKt$$ExternalSyntheticLambda6(4), false, -2045387243);
        new ComposableLambdaImpl(new SlottedTableKt$$ExternalSyntheticLambda2(25), false, -1373737246);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AlertDialogContent(Modifier modifier, Function2 function2, String str, String str2, AlertDialogButton alertDialogButton, AlertDialogButton alertDialogButton2, boolean z, Composer composer, int i, int i2) {
        Function2 function22;
        int i3;
        AlertDialogButton alertDialogButton3;
        int i4;
        int i5;
        Modifier modifier2;
        boolean z2;
        Function2 function23;
        AlertDialogButton alertDialogButton4;
        RecomposeScopeImpl endRestartGroup;
        Function2 function24;
        str2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2110868452);
        int i6 = i | 6;
        int i7 = i2 & 2;
        if (i7 != 0) {
            i6 = i | 54;
        } else if ((i & 48) == 0) {
            function22 = function2;
            i6 |= gapComposer.changedInstance(function22) ? 32 : 16;
            int i8 = i6 | (!gapComposer.changed(str) ? 256 : 128) | (!gapComposer.changed(str2) ? 2048 : 1024) | (!gapComposer.changed(alertDialogButton) ? 16384 : PKIFailureInfo.certRevoked);
            i3 = i2 & 32;
            if (i3 == 0) {
                i4 = i8 | 196608;
                alertDialogButton3 = alertDialogButton2;
            } else {
                alertDialogButton3 = alertDialogButton2;
                i4 = i8 | (gapComposer.changed(alertDialogButton3) ? 131072 : 65536);
            }
            i5 = i4 | 1572864;
            if (gapComposer.shouldExecute(i5 & 1, (599187 & i5) == 599186)) {
                gapComposer.skipToGroupEnd();
                modifier2 = modifier;
                z2 = z;
                function23 = function22;
                alertDialogButton4 = alertDialogButton3;
            } else {
                Function2 function25 = i7 != 0 ? null : function22;
                AlertDialogButton alertDialogButton5 = i3 != 0 ? null : alertDialogButton3;
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = new OffersHomeQueries$$ExternalSyntheticLambda1(8);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function1 function1 = (Function1) rememberedValue;
                boolean z3 = ((i5 & 112) == 32) | ((i5 & 896) == 256) | ((i5 & 7168) == 2048) | ((458752 & i5) == 131072) | ((i5 & 57344) == 16384);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z3 || rememberedValue2 == neverEqualPolicy) {
                    OverlayKt$$ExternalSyntheticLambda3 overlayKt$$ExternalSyntheticLambda3 = new OverlayKt$$ExternalSyntheticLambda3(function25, str, str2, alertDialogButton5, alertDialogButton, 22);
                    function24 = function25;
                    gapComposer.updateRememberedValue(overlayKt$$ExternalSyntheticLambda3);
                    rememberedValue2 = overlayKt$$ExternalSyntheticLambda3;
                } else {
                    function24 = function25;
                }
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                AndroidView_androidKt.AndroidView(function1, companion, (Function1) rememberedValue2, gapComposer, 48, 0);
                modifier2 = companion;
                alertDialogButton4 = alertDialogButton5;
                function23 = function24;
                z2 = true;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new ButtonKt$$ExternalSyntheticLambda4(modifier2, function23, str, str2, alertDialogButton, alertDialogButton4, z2, i, i2);
                return;
            }
            return;
        }
        function22 = function2;
        int i82 = i6 | (!gapComposer.changed(str) ? 256 : 128) | (!gapComposer.changed(str2) ? 2048 : 1024) | (!gapComposer.changed(alertDialogButton) ? 16384 : PKIFailureInfo.certRevoked);
        i3 = i2 & 32;
        if (i3 == 0) {
        }
        i5 = i4 | 1572864;
        if (gapComposer.shouldExecute(i5 & 1, (599187 & i5) == 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0061  */
    /* renamed from: AutoScaleText-gQjefEo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3639AutoScaleTextgQjefEo(final String str, Modifier modifier, final TextStyle textStyle, final long j, int i, int i2, long j2, int i3, Composer composer, final int i4, final int i5) {
        int i6;
        final Modifier modifier2;
        int i7;
        int i8;
        int i9;
        long j3;
        int i10;
        final int i11;
        final int i12;
        GapComposer gapComposer;
        final long j4;
        final int i13;
        RecomposeScopeImpl endRestartGroup;
        int i14;
        int i15;
        int i16;
        Modifier modifier3;
        int i17;
        long j5;
        int i18;
        int i19;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1418646252);
        if ((i4 & 6) == 0) {
            i6 = (gapComposer2.changed(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i20 = i5 & 2;
        if (i20 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i6 |= gapComposer2.changed(modifier2) ? 32 : 16;
            if ((i4 & MLKEMEngine.KyberPolyBytes) == 0) {
                i6 |= gapComposer2.changed(textStyle) ? 256 : 128;
            }
            if ((i4 & 3072) == 0) {
                i6 |= gapComposer2.changed(j) ? 2048 : 1024;
            }
            i7 = i5 & 16;
            if (i7 == 0) {
                i6 |= 24576;
            } else if ((i4 & 24576) == 0) {
                i8 = i;
                i6 |= gapComposer2.changed(i8) ? 16384 : PKIFailureInfo.certRevoked;
                if ((196608 & i4) == 0) {
                    if ((i5 & 32) == 0) {
                        i9 = i2;
                        if (gapComposer2.changed(i9)) {
                            i19 = PKIFailureInfo.unsupportedVersion;
                            i6 |= i19;
                        }
                    } else {
                        i9 = i2;
                    }
                    i19 = 65536;
                    i6 |= i19;
                } else {
                    i9 = i2;
                }
                if ((1572864 & i4) == 0) {
                    if ((i5 & 64) == 0) {
                        j3 = j2;
                        if (gapComposer2.changed(j3)) {
                            i18 = PKIFailureInfo.badCertTemplate;
                            i6 |= i18;
                        }
                    } else {
                        j3 = j2;
                    }
                    i18 = PKIFailureInfo.signerNotTrusted;
                    i6 |= i18;
                } else {
                    j3 = j2;
                }
                i10 = i6 | 12582912;
                if (gapComposer2.shouldExecute(i10 & 1, (4793491 & i10) != 4793490)) {
                    gapComposer2.startDefaults();
                    if ((i4 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                        Modifier modifier4 = i20 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                        if (i7 != 0) {
                            i8 = Integer.MAX_VALUE;
                        }
                        if ((i5 & 32) != 0) {
                            i10 &= -458753;
                            i9 = 0;
                        }
                        if ((i5 & 64) != 0) {
                            j3 = Snapshots.getNotScaledUp(textStyle.spanStyle.fontSize, gapComposer2);
                            i10 &= -3670017;
                        }
                        i14 = i10;
                        i15 = i8;
                        i16 = 1;
                        long j6 = j3;
                        modifier3 = modifier4;
                        i17 = i9;
                        j5 = j6;
                    } else {
                        gapComposer2.skipToGroupEnd();
                        if ((i5 & 32) != 0) {
                            i10 &= -458753;
                        }
                        if ((i5 & 64) != 0) {
                            i10 &= -3670017;
                        }
                        i14 = i10;
                        i15 = i8;
                        i17 = i9;
                        j5 = j3;
                        modifier3 = modifier2;
                        i16 = i3;
                    }
                    gapComposer2.endDefaults();
                    Snapshots.m4002FoundationAutoScaleTextZLomxE(i15, i17, i16, (i14 & 29360128) | (i14 & 14) | ((i14 >> 3) & 112) | ((i14 << 3) & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14), 256, j, j5, gapComposer2, modifier3, textStyle, str, null);
                    Modifier modifier5 = modifier3;
                    i13 = i16;
                    modifier2 = modifier5;
                    i11 = i15;
                    gapComposer = gapComposer2;
                    j4 = j5;
                    i12 = i17;
                } else {
                    gapComposer2.skipToGroupEnd();
                    i11 = i8;
                    i12 = i9;
                    gapComposer = gapComposer2;
                    j4 = j3;
                    i13 = i3;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new Function2() { // from class: com.squareup.cash.mooncake.compose_ui.components.AutoScaleTextKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            KeypadKt.m3639AutoScaleTextgQjefEo(str, modifier2, textStyle, j, i11, i12, j4, i13, (Composer) obj, Updater.updateChangedFlags(i4 | 1), i5);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            i8 = i;
            if ((196608 & i4) == 0) {
            }
            if ((1572864 & i4) == 0) {
            }
            i10 = i6 | 12582912;
            if (gapComposer2.shouldExecute(i10 & 1, (4793491 & i10) != 4793490)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i4 & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        if ((i4 & 3072) == 0) {
        }
        i7 = i5 & 16;
        if (i7 == 0) {
        }
        i8 = i;
        if ((196608 & i4) == 0) {
        }
        if ((1572864 & i4) == 0) {
        }
        i10 = i6 | 12582912;
        if (gapComposer2.shouldExecute(i10 & 1, (4793491 & i10) != 4793490)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016e  */
    /* renamed from: Button-GFipHI0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3640ButtonGFipHI0(final String str, final Function0 function0, Modifier modifier, String str2, MooncakePillButton.Size size, MooncakePillButton.Style style, Color color, boolean z, int i, Arrangement$Horizontal arrangement$Horizontal, Function3 function3, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Function0 function02;
        Modifier modifier2;
        int i6;
        String str3;
        int i7;
        int i8;
        int i9;
        Color color2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final MooncakePillButton.Size size2;
        final MooncakePillButton.Style style2;
        final boolean z2;
        final Arrangement$Horizontal arrangement$Horizontal2;
        final Function3 function32;
        final Modifier modifier3;
        final String str4;
        final Color color3;
        final int i17;
        RecomposeScopeImpl endRestartGroup;
        int i18;
        Modifier modifier4;
        ButtonSize buttonSize;
        ButtonSize buttonSize2;
        ButtonStyle buttonStyle;
        int intValue;
        OnPressBehaviour onPressBehaviour;
        Object rememberedValue;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(367835520);
        if ((i2 & 6) == 0) {
            i5 = (gapComposer.changed(str) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            function02 = function0;
            i5 |= gapComposer.changedInstance(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        int i19 = i4 & 4;
        if (i19 != 0) {
            i5 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i5 |= gapComposer.changed(modifier2) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                str3 = str2;
                i5 |= gapComposer.changed(str3) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i5 |= gapComposer.changed(size == null ? -1 : size.ordinal()) ? 16384 : PKIFailureInfo.certRevoked;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else if ((196608 & i2) == 0) {
                    i5 |= gapComposer.changed(style != null ? style.ordinal() : -1) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    i5 |= 1572864;
                } else if ((1572864 & i2) == 0) {
                    color2 = color;
                    i5 |= gapComposer.changed(color2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    i10 = i4 & 128;
                    if (i10 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= gapComposer.changed(z) ? 8388608 : 4194304;
                    }
                    i11 = i4 & 256;
                    if (i11 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i12 = i11;
                        i5 |= gapComposer.changed(i) ? 67108864 : 33554432;
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i5 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i14 = i13;
                            i5 |= gapComposer.changed(arrangement$Horizontal) ? PKIFailureInfo.duplicateCertReq : 268435456;
                            i15 = i4 & 1024;
                            if (i15 == 0) {
                                i16 = 6;
                            } else if ((i3 & 6) == 0) {
                                i16 = i3 | (gapComposer.changedInstance(function3) ? 4 : 2);
                            } else {
                                i16 = i3;
                            }
                            if (gapComposer.shouldExecute(i5 & 1, (i5 & 306783379) == 306783378 || ((i16 | 48) & 19) != 18)) {
                                gapComposer.skipToGroupEnd();
                                size2 = size;
                                style2 = style;
                                z2 = z;
                                arrangement$Horizontal2 = arrangement$Horizontal;
                                function32 = function3;
                                modifier3 = modifier2;
                                str4 = str3;
                                color3 = color2;
                                i17 = i;
                            } else {
                                if (i19 != 0) {
                                    int i20 = i14;
                                    modifier4 = Modifier.Companion.$$INSTANCE;
                                    i18 = i20;
                                } else {
                                    i18 = i14;
                                    modifier4 = modifier2;
                                }
                                String str5 = i6 != 0 ? null : str3;
                                MooncakePillButton.Size size3 = i7 != 0 ? MooncakePillButton.Size.LARGE : size;
                                style2 = i8 != 0 ? MooncakePillButton.Style.PRIMARY : style;
                                if (i9 != 0) {
                                    color2 = null;
                                }
                                boolean z3 = i10 != 0 ? true : z;
                                int i21 = i12 != 0 ? Integer.MAX_VALUE : i;
                                Arrangement$Horizontal arrangement$Horizontal3 = i18 != 0 ? SpacerKt.SpaceEvenly : arrangement$Horizontal;
                                Function3 function33 = i15 != 0 ? null : function3;
                                size3.getClass();
                                style2.getClass();
                                int ordinal = size3.ordinal();
                                if (ordinal == 0 || ordinal == 1) {
                                    gapComposer.startReplaceGroup(-845799994);
                                    MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                                    if (mooncakeTypography == null) {
                                        mooncakeTypography = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                                    }
                                    buttonSize = new ButtonSize(16.0f, 12.0f, mooncakeTypography.mainTitle, 48.0f);
                                    gapComposer.end(false);
                                } else {
                                    if (ordinal != 2) {
                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1274220727, false);
                                    }
                                    gapComposer.startReplaceGroup(-846109405);
                                    MooncakeTypography mooncakeTypography2 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                                    if (mooncakeTypography2 == null) {
                                        mooncakeTypography2 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                                    }
                                    buttonSize = new ButtonSize(16.0f, 4.0f, mooncakeTypography2.strongCaption, 32.0f);
                                    gapComposer.end(false);
                                }
                                if (style2 == MooncakePillButton.Style.TERTIARY) {
                                    buttonSize = new ButtonSize(buttonSize.horizontal, buttonSize.vertical, TextStyle.m994copyp1EtxEg$default(buttonSize.textStyle, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.Underline, null, null, 0, 0L, null, null, 0, 16773119), buttonSize.minHeight);
                                }
                                int ordinal2 = style2.ordinal();
                                if (ordinal2 == 0) {
                                    buttonSize2 = buttonSize;
                                    gapComposer.startReplaceGroup(1821247474);
                                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = AndroidCompositionLocals_androidKt.LocalContext;
                                    int i22 = ThemeHelpersKt.themeInfo((Context) gapComposer.consume(staticProvidableCompositionLocal)).colorPalette.primaryButtonTint;
                                    Integer valueOf = color2 != null ? Integer.valueOf(ColorKt.m694toArgb8_81llA(color2.value)) : null;
                                    if (valueOf == null) {
                                        gapComposer.startReplaceGroup(1821257402);
                                        intValue = ThemeHelpersKt.themeInfo((Context) gapComposer.consume(staticProvidableCompositionLocal)).colorPalette.primaryButtonBackground;
                                        gapComposer.end(false);
                                    } else {
                                        gapComposer.startReplaceGroup(1821254333);
                                        gapComposer.end(false);
                                        intValue = valueOf.intValue();
                                    }
                                    buttonStyle = new ButtonStyle(ColorKt.Color(ThemablesKt.contrastAdjustedColor(i22, intValue, ThemeHelpersKt.themeInfo((Context) gapComposer.consume(staticProvidableCompositionLocal)).colorPalette.primaryButtonTintInverted)), MooncakeTheme.getColors(gapComposer).primaryButtonBackground, null, true, 12);
                                    gapComposer.end(false);
                                } else if (ordinal2 == 1) {
                                    buttonSize2 = buttonSize;
                                    gapComposer.startReplaceGroup(1821267745);
                                    buttonStyle = new ButtonStyle(MooncakeTheme.getColors(gapComposer).secondaryButtonTint, MooncakeTheme.getColors(gapComposer).secondaryButtonBackground, null, true, 12);
                                    gapComposer.end(false);
                                } else if (ordinal2 == 2 || ordinal2 == 3) {
                                    buttonSize2 = buttonSize;
                                    gapComposer.startReplaceGroup(1821275266);
                                    buttonStyle = new ButtonStyle(MooncakeTheme.getColors(gapComposer).tertiaryButtonTint, Color.Transparent, null, false, 4);
                                    gapComposer.end(false);
                                } else {
                                    if (ordinal2 != 4 && ordinal2 != 5) {
                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1821247155, false);
                                    }
                                    gapComposer.startReplaceGroup(1821282894);
                                    buttonSize2 = buttonSize;
                                    buttonStyle = new ButtonStyle(MooncakeTheme.getColors(gapComposer).secondaryButtonTint, Color.Transparent, new Pair(new Color(MooncakeTheme.getColors(gapComposer).outlineButtonBorder), new Color(MooncakeTheme.getColors(gapComposer).outlineButtonSelectedBorder)), true, 8);
                                    gapComposer.end(false);
                                }
                                OnPressBehaviour.Companion.getClass();
                                int ordinal3 = style2.ordinal();
                                if (ordinal3 != 0 && ordinal3 != 1) {
                                    if (ordinal3 == 2 || ordinal3 == 3) {
                                        onPressBehaviour = OnPressBehaviour.NO_SCALING;
                                        OnPressBehaviour onPressBehaviour2 = onPressBehaviour;
                                        rememberedValue = gapComposer.rememberedValue();
                                        if (rememberedValue == Composer.Companion.Empty) {
                                            rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                                        }
                                        MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                                        Color color4 = color2;
                                        ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-2061822149, new CardSceneEffectKt$$ExternalSyntheticLambda5(buttonSize2, buttonStyle, modifier4, onPressBehaviour2, AnimateAsStateKt.animateFloatAsState(!((Boolean) Room.collectIsPressedAsState(mutableInteractionSourceImpl, gapComposer, 6).getValue()).booleanValue() ? 0.95f : 1.0f, null, "On-press scaling", null, gapComposer, 3072, 22), z3, function02, mutableInteractionSourceImpl, color4, str5, style2, arrangement$Horizontal3, function33, str, i21), gapComposer), gapComposer, 6);
                                        size2 = size3;
                                        modifier3 = modifier4;
                                        z2 = z3;
                                        color3 = color4;
                                        str4 = str5;
                                        arrangement$Horizontal2 = arrangement$Horizontal3;
                                        function32 = function33;
                                        i17 = i21;
                                    } else if (ordinal3 != 4 && ordinal3 != 5) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return;
                                    }
                                }
                                onPressBehaviour = OnPressBehaviour.SCALE_WHOLE_BUTTON;
                                OnPressBehaviour onPressBehaviour22 = onPressBehaviour;
                                rememberedValue = gapComposer.rememberedValue();
                                if (rememberedValue == Composer.Companion.Empty) {
                                }
                                MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) rememberedValue;
                                Color color42 = color2;
                                ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-2061822149, new CardSceneEffectKt$$ExternalSyntheticLambda5(buttonSize2, buttonStyle, modifier4, onPressBehaviour22, AnimateAsStateKt.animateFloatAsState(!((Boolean) Room.collectIsPressedAsState(mutableInteractionSourceImpl2, gapComposer, 6).getValue()).booleanValue() ? 0.95f : 1.0f, null, "On-press scaling", null, gapComposer, 3072, 22), z3, function02, mutableInteractionSourceImpl2, color42, str5, style2, arrangement$Horizontal3, function33, str, i21), gapComposer), gapComposer, 6);
                                size2 = size3;
                                modifier3 = modifier4;
                                z2 = z3;
                                color3 = color42;
                                str4 = str5;
                                arrangement$Horizontal2 = arrangement$Horizontal3;
                                function32 = function33;
                                i17 = i21;
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.block = new Function2() { // from class: com.squareup.cash.mooncake.compose_ui.components.MooncakeButtonKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                                        int updateChangedFlags2 = Updater.updateChangedFlags(i3);
                                        KeypadKt.m3640ButtonGFipHI0(str, function0, modifier3, str4, size2, style2, color3, z2, i17, arrangement$Horizontal2, function32, (Composer) obj, updateChangedFlags, updateChangedFlags2, i4);
                                        return Unit.INSTANCE;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        i14 = i13;
                        i15 = i4 & 1024;
                        if (i15 == 0) {
                        }
                        if (gapComposer.shouldExecute(i5 & 1, (i5 & 306783379) == 306783378 || ((i16 | 48) & 19) != 18)) {
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i12 = i11;
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    i15 = i4 & 1024;
                    if (i15 == 0) {
                    }
                    if (gapComposer.shouldExecute(i5 & 1, (i5 & 306783379) == 306783378 || ((i16 | 48) & 19) != 18)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                color2 = color;
                i10 = i4 & 128;
                if (i10 == 0) {
                }
                i11 = i4 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i14 = i13;
                i15 = i4 & 1024;
                if (i15 == 0) {
                }
                if (gapComposer.shouldExecute(i5 & 1, (i5 & 306783379) == 306783378 || ((i16 | 48) & 19) != 18)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            str3 = str2;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            i8 = i4 & 32;
            if (i8 != 0) {
            }
            i9 = i4 & 64;
            if (i9 != 0) {
            }
            color2 = color;
            i10 = i4 & 128;
            if (i10 == 0) {
            }
            i11 = i4 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i14 = i13;
            i15 = i4 & 1024;
            if (i15 == 0) {
            }
            if (gapComposer.shouldExecute(i5 & 1, (i5 & 306783379) == 306783378 || ((i16 | 48) & 19) != 18)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        str3 = str2;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        i8 = i4 & 32;
        if (i8 != 0) {
        }
        i9 = i4 & 64;
        if (i9 != 0) {
        }
        color2 = color;
        i10 = i4 & 128;
        if (i10 == 0) {
        }
        i11 = i4 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i14 = i13;
        i15 = i4 & 1024;
        if (i15 == 0) {
        }
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 306783379) == 306783378 || ((i16 | 48) & 19) != 18)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0087  */
    /* renamed from: Card-IkByU14, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3641CardIkByU14(Modifier modifier, Shape shape, long j, boolean z, Function0 function0, String str, Alignment alignment, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        long j2;
        boolean z2;
        int i4;
        Function0 function02;
        int i5;
        String str2;
        int i6;
        ComposableLambdaImpl composableLambdaImpl2;
        final Alignment alignment2;
        final Modifier modifier3;
        final Shape shape3;
        final String str3;
        final boolean z3;
        final long j3;
        final Function0 function03;
        RecomposeScopeImpl endRestartGroup;
        final Alignment alignment3;
        final boolean z4;
        final Modifier modifier4;
        int i7;
        int i8;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1205787872);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                shape2 = shape;
                if (gapComposer.changed(shape2)) {
                    i8 = 32;
                    i3 |= i8;
                }
            } else {
                shape2 = shape;
            }
            i8 = 16;
            i3 |= i8;
        } else {
            shape2 = shape;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i2 & 4) == 0) {
                j2 = j;
                if (gapComposer.changed(j2)) {
                    i7 = 256;
                    i3 |= i7;
                }
            } else {
                j2 = j;
            }
            i7 = 128;
            i3 |= i7;
        } else {
            j2 = j;
        }
        int i10 = i3 | 3072;
        int i11 = i2 & 16;
        if (i11 != 0) {
            i10 = i3 | 27648;
        } else if ((i & 24576) == 0) {
            z2 = z;
            i10 |= gapComposer.changed(z2) ? 16384 : PKIFailureInfo.certRevoked;
            i4 = i2 & 32;
            if (i4 == 0) {
                i10 |= 196608;
            } else if ((196608 & i) == 0) {
                function02 = function0;
                i10 |= gapComposer.changedInstance(function02) ? PKIFailureInfo.unsupportedVersion : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i10 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    str2 = str;
                    i10 |= gapComposer.changed(str2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    i6 = i10 | 12582912;
                    if ((100663296 & i) != 0) {
                        composableLambdaImpl2 = composableLambdaImpl;
                        i6 |= gapComposer.changedInstance(composableLambdaImpl2) ? 67108864 : 33554432;
                    } else {
                        composableLambdaImpl2 = composableLambdaImpl;
                    }
                    if (gapComposer.shouldExecute(i6 & 1, (38347923 & i6) == 38347922)) {
                        gapComposer.skipToGroupEnd();
                        alignment2 = alignment;
                        modifier3 = modifier2;
                        shape3 = shape2;
                        str3 = str2;
                        long j4 = j2;
                        z3 = z2;
                        j3 = j4;
                        function03 = function02;
                    } else {
                        gapComposer.startDefaults();
                        if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                            Modifier modifier5 = i9 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                            if ((i2 & 2) != 0) {
                                shape2 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f);
                            }
                            if ((i2 & 4) != 0) {
                                j2 = MooncakeTheme.getColors(gapComposer).background;
                            }
                            boolean z5 = i11 == 0 ? z2 : true;
                            if (i4 != 0) {
                                function02 = null;
                            }
                            if (i5 != 0) {
                                str2 = null;
                            }
                            alignment3 = Alignment.Companion.TopStart;
                            z4 = z5;
                            modifier4 = modifier5;
                        } else {
                            gapComposer.skipToGroupEnd();
                            alignment3 = alignment;
                            modifier4 = modifier2;
                            z4 = z2;
                        }
                        final Shape shape4 = shape2;
                        final long j5 = j2;
                        final Function0 function04 = function02;
                        final String str4 = str2;
                        gapComposer.endDefaults();
                        final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
                        ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(1077663579, new Function2() { // from class: com.squareup.cash.mooncake.compose_ui.components.MooncakeCardKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Modifier m3657decorateCardXOJAsU = KeypadKt.m3657decorateCardXOJAsU(Modifier.this, shape4, j5, z4);
                                    Modifier modifier6 = Modifier.Companion.$$INSTANCE;
                                    Function0 function05 = function04;
                                    if (function05 != null) {
                                        gapComposer2.startReplaceGroup(-204507045);
                                        Object rememberedValue = gapComposer2.rememberedValue();
                                        if (rememberedValue == Composer.Companion.Empty) {
                                            rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                                        }
                                        modifier6 = ImageKt.m182clickableO2vRcR0$default(modifier6, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m500rippleH2RKhps$default(RecyclerView.DECELERATION_RATE, 6, 0L, true), false, str4, null, function05, 20);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-204259231);
                                        gapComposer2.end(false);
                                    }
                                    Modifier then = m3657decorateCardXOJAsU.then(modifier6);
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment3, false);
                                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, then);
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
                                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                    composableLambdaImpl3.invoke((Object) BoxScopeInstance.INSTANCE, (Object) gapComposer2, (Object) 6);
                                    gapComposer2.end(true);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer), gapComposer, 6);
                        modifier3 = modifier4;
                        shape3 = shape4;
                        j3 = j5;
                        z3 = z4;
                        function03 = function04;
                        str3 = str4;
                        alignment2 = alignment3;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new Function2() { // from class: com.squareup.cash.mooncake.compose_ui.components.MooncakeCardKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                KeypadKt.m3641CardIkByU14(Modifier.this, shape3, j3, z3, function03, str3, alignment2, composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
                str2 = str;
                i6 = i10 | 12582912;
                if ((100663296 & i) != 0) {
                }
                if (gapComposer.shouldExecute(i6 & 1, (38347923 & i6) == 38347922)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function02 = function0;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            str2 = str;
            i6 = i10 | 12582912;
            if ((100663296 & i) != 0) {
            }
            if (gapComposer.shouldExecute(i6 & 1, (38347923 & i6) == 38347922)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z2 = z;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        str2 = str;
        i6 = i10 | 12582912;
        if ((100663296 & i) != 0) {
        }
        if (gapComposer.shouldExecute(i6 & 1, (38347923 & i6) == 38347922)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void CenterLineAlignmentRow(Modifier modifier, Function3 function3, PaddingValues paddingValues, Function4 function4, Composer composer, int i) {
        Function4 function42;
        PaddingValues paddingValues2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1739332665);
        int i2 = 2;
        int i3 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(function3) ? 32 : 16) | 24960;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            paddingValues2 = new PaddingValuesImpl(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BadgeKt$BadgeAssetLayout$3$2$1(i2, function3, mutableState, paddingValues2);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
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
            Updater.m576setimpl(gapComposer, measurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-1751159822);
            if (function3 == null) {
                gapComposer.startReplaceGroup(1917165410);
            } else {
                gapComposer.startReplaceGroup(1724412031);
                function3.invoke(CenterLineAlignmentRowScopeInstance.INSTANCE, gapComposer, Integer.valueOf(i4));
            }
            gapComposer.end(false);
            function42 = function4;
            function42.invoke(SpacerKt.padding(RulerKt.layoutId(Modifier.Companion.$$INSTANCE, "text"), paddingValues2), mutableState, gapComposer, 432);
            gapComposer.startReplaceGroup(1917286434);
            gapComposer.end(false);
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            function42 = function4;
            gapComposer.skipToGroupEnd();
            paddingValues2 = paddingValues;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyUiFactory$$ExternalSyntheticLambda1(modifier, i, function3, paddingValues2, function42, 29);
        }
    }

    public static final void ClearSearchButton(boolean z, Function0 function0, Composer composer, int i) {
        Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1601221141);
        int i2 = (gapComposer.changed(z) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier animateContentSize$default = AnimatedContentKt.animateContentSize$default(Modifier.Companion.$$INSTANCE, null, 3);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, animateContentSize$default);
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
            if (z) {
                gapComposer.startReplaceGroup(459534475);
                function02 = function0;
                IconButton(function02, null, null, false, lambda$278539346, gapComposer, ((i2 >> 3) & 14) | 24576, 14);
                gapComposer.end(false);
            } else {
                function02 = function0;
                gapComposer.startReplaceGroup(459868903);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AccountToolbarKt$$ExternalSyntheticLambda1(z, function02, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* renamed from: Divider-aM-cp0Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3642DivideraMcp0Q(Modifier modifier, long j, float f, Composer composer, int i, int i2) {
        int i3;
        float f2;
        float f3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(987879913);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | (((i2 & 2) == 0 && gapComposer.changed(j)) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i5 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer.changed(f) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = Modifier.Companion.$$INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    j = MooncakeTheme.getColors(gapComposer).hairline;
                }
                if (i6 != 0) {
                    f2 = 0.0f;
                    gapComposer.endDefaults();
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
                    if (Dp.m1037equalsimpl0(f2, RecyclerView.DECELERATION_RATE)) {
                        gapComposer.startReplaceGroup(-664188411);
                        gapComposer.end(false);
                        f3 = f2;
                    } else {
                        gapComposer.startReplaceGroup(-664189328);
                        f3 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo233toDpu2uoSUM(1);
                        gapComposer.end(false);
                    }
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(fillMaxWidth, f3), j, ColorKt.RectangleShape), gapComposer, 0);
                }
            } else {
                gapComposer.skipToGroupEnd();
            }
            f2 = f;
            gapComposer.endDefaults();
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(modifier, 1.0f);
            if (Dp.m1037equalsimpl0(f2, RecyclerView.DECELERATION_RATE)) {
            }
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(fillMaxWidth2, f3), j, ColorKt.RectangleShape), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
            f2 = f;
        }
        Modifier modifier2 = modifier;
        long j2 = j;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SharedUIKt$$ExternalSyntheticLambda0(modifier2, j2, f2, i, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconButton(Function0 function0, Modifier modifier, String str, boolean z, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        boolean z2;
        Modifier modifier3;
        boolean z3;
        String str2;
        RecomposeScopeImpl endRestartGroup;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-830228887);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer.changed(str) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= gapComposer.changed(z2) ? 2048 : 1024;
                    if ((i & 24576) == 0) {
                        i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 16384 : PKIFailureInfo.certRevoked;
                    }
                    if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
                        gapComposer.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        str2 = str;
                    } else {
                        Modifier modifier4 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                        String str3 = i4 != 0 ? null : str;
                        boolean z4 = i5 != 0 ? true : z2;
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                        }
                        int i7 = i3;
                        Modifier m181clickableO2vRcR0 = ImageKt.m181clickableO2vRcR0(modifier4, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m500rippleH2RKhps$default(RecyclerView.DECELERATION_RATE, 6, 0L, false), z4, str3, new Role(0), function0);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m181clickableO2vRcR0);
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
                        Recorder$$ExternalSyntheticOutline2.m((i7 >> 12) & 14, composableLambdaImpl, gapComposer, true);
                        modifier3 = modifier4;
                        z3 = z4;
                        str2 = str3;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(function0, modifier3, str2, z3, composableLambdaImpl, i, i2);
                        return;
                    }
                    return;
                }
                z2 = z;
                if ((i & 24576) == 0) {
                }
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: KeyPad-f8fvdUg, reason: not valid java name */
    public static final void m3643KeyPadf8fvdUg(Modifier modifier, long j, long j2, final ExtraButton extraButton, final String str, String str2, final Function0 function0, final Function0 function02, final Function1 function1, Composer composer, final int i) {
        GapComposer gapComposer;
        final Modifier modifier2;
        final long j3;
        final long j4;
        final String str3;
        int i2;
        long j5;
        String str4;
        Modifier modifier3;
        long j6;
        KeyPadChar keyPadChar;
        Modifier wrapContentHeight;
        Modifier wrapContentHeight2;
        CoroutineScope coroutineScope;
        GapComposer gapComposer2;
        NeverEqualPolicy neverEqualPolicy;
        Modifier.Companion companion;
        Iterator it;
        Resources resources;
        long j7;
        long j8;
        String str5;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1;
        long j9;
        String str6;
        int i3;
        KeyPadChar keyPadChar2;
        Modifier.Companion companion2;
        KeyPadChar keyPadChar3;
        String str7;
        NeverEqualPolicy neverEqualPolicy2;
        boolean z;
        TextStyle textStyle;
        KeyPadChar keyPadChar4;
        Function0 function03 = function02;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(745274296);
        Applier applier = gapComposer3.applier;
        Function0 function04 = function0;
        int i4 = i | 406 | (gapComposer3.changed(extraButton == null ? -1 : extraButton.ordinal()) ? 2048 : 1024) | (gapComposer3.changed(str) ? 16384 : PKIFailureInfo.certRevoked) | 196608 | (gapComposer3.changedInstance(function04) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer3.changedInstance(function03) ? 8388608 : 4194304) | (gapComposer3.changedInstance(function1) ? 67108864 : 33554432);
        if (gapComposer3.shouldExecute(i4 & 1, (38347923 & i4) != 38347922)) {
            gapComposer3.startDefaults();
            int i5 = i & 1;
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            if (i5 == 0 || gapComposer3.getDefaultsInvalid()) {
                i2 = i4 & (-113);
                j5 = MooncakeTheme.getColors(gapComposer3).label;
                str4 = "<";
                modifier3 = companion3;
                j6 = Color.Transparent;
            } else {
                gapComposer3.skipToGroupEnd();
                modifier3 = modifier;
                j5 = j;
                str4 = str2;
                i2 = i4 & (-113);
                j6 = j2;
            }
            gapComposer3.endDefaults();
            Object rememberedValue = gapComposer3.rememberedValue();
            NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy3) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer3);
                gapComposer3.updateRememberedValue(rememberedValue);
            }
            KeyPadChar keyPadChar5 = new KeyPadChar("1", "1");
            KeyPadChar keyPadChar6 = new KeyPadChar("2", "2");
            KeyPadChar keyPadChar7 = new KeyPadChar("3", "3");
            KeyPadChar keyPadChar8 = new KeyPadChar("4", "4");
            KeyPadChar keyPadChar9 = new KeyPadChar("5", "5");
            KeyPadChar keyPadChar10 = new KeyPadChar("6", "6");
            KeyPadChar keyPadChar11 = new KeyPadChar("7", "7");
            KeyPadChar keyPadChar12 = new KeyPadChar("8", "8");
            KeyPadChar keyPadChar13 = new KeyPadChar("9", "9");
            int ordinal = extraButton.ordinal();
            CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    gapComposer3.startReplaceGroup(-1025856486);
                    keyPadChar4 = new KeyPadChar(str, Room.stringResource(gapComposer3, R.string.keypad_decimal_content_description));
                    gapComposer3.end(false);
                } else {
                    if (ordinal != 2) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -1025858213, false);
                    }
                    gapComposer3.startReplaceGroup(-1025852794);
                    keyPadChar4 = new KeyPadChar(Room.stringResource(gapComposer3, R.string.keypad_abc_key), Room.stringResource(gapComposer3, R.string.keypad_change_mode_abc_content_description));
                    gapComposer3.end(false);
                }
                keyPadChar = keyPadChar4;
            } else {
                gapComposer3.startReplaceGroup(-1736812450);
                gapComposer3.end(false);
                keyPadChar = null;
            }
            List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new KeyPadChar[]{keyPadChar5, keyPadChar6, keyPadChar7, keyPadChar8, keyPadChar9, keyPadChar10, keyPadChar11, keyPadChar12, keyPadChar13, keyPadChar, new KeyPadChar("0", "0"), new KeyPadChar(str4, Room.stringResource(gapComposer3, R.string.keypad_delete_content_description))});
            Resources resources2 = (Resources) gapComposer3.consume(AndroidCompositionLocals_androidKt.LocalResources);
            wrapContentHeight = SizeKt.wrapContentHeight(modifier3, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$12 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(wrapContentHeight, j6, rectangleShapeKt$RectangleShape$12);
            long j10 = j6;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m177backgroundbw27NRU);
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
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer3.startReplaceGroup(-2106364834);
            int i6 = 3;
            Iterator it2 = CollectionsKt.chunked(listOf, 3).iterator();
            while (it2.hasNext()) {
                List list = (List) it2.next();
                wrapContentHeight2 = SizeKt.wrapContentHeight(companion3, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(wrapContentHeight2, 1.0f);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer3, 0);
                int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer3.startReusableNode();
                Iterator it3 = it2;
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer3.useNode();
                }
                Updater.m576setimpl(gapComposer3, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer3, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                gapComposer3.startReplaceGroup(-596465004);
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    KeyPadChar keyPadChar14 = (KeyPadChar) it4.next();
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    if (keyPadChar14 != null) {
                        gapComposer3.startReplaceGroup(-1464722680);
                        Object rememberedValue2 = gapComposer3.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy3) {
                            rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer3);
                        }
                        MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
                        MutableState collectIsPressedAsState = Room.collectIsPressedAsState(mutableInteractionSourceImpl, gapComposer3, 6);
                        MutableState collectIsFocusedAsState = Countries.collectIsFocusedAsState(mutableInteractionSourceImpl, gapComposer3, 6);
                        Object rememberedValue3 = gapComposer3.rememberedValue();
                        if (rememberedValue3 == neverEqualPolicy3) {
                            rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
                            gapComposer3.updateRememberedValue(rememberedValue3);
                        }
                        MutableState mutableState = (MutableState) rememberedValue3;
                        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$13 = rectangleShapeKt$RectangleShape$12;
                        CoroutineScope coroutineScope3 = coroutineScope2;
                        GapComposer gapComposer4 = gapComposer3;
                        it = it4;
                        State animateFloatAsState = AnimateAsStateKt.animateFloatAsState((((Boolean) mutableState.getValue()).booleanValue() || ((Boolean) collectIsPressedAsState.getValue()).booleanValue()) ? 1.8f : 1.0f, null, null, null, gapComposer4, 0, 30);
                        Modifier weight = rowScopeInstance.weight(1.0f, SizeKt.m279heightInVpY3zN4$default(companion3, 60.0f, RecyclerView.DECELERATION_RATE, 2), true);
                        if (((Boolean) collectIsFocusedAsState.getValue()).booleanValue()) {
                            gapComposer4.startReplaceGroup(-1464057668);
                            MooncakeTheme.getColors(gapComposer4);
                            j9 = ComposeColorPalette.m3637pressColorEGaQkGg(MooncakeTheme.getColors(gapComposer4).background, gapComposer4);
                            gapComposer4.end(false);
                        } else {
                            gapComposer4.startReplaceGroup(-1463876659);
                            gapComposer4.end(false);
                            j9 = Color.Transparent;
                        }
                        Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(weight, j9, rectangleShapeKt$RectangleShape$13);
                        int i7 = i2 & 29360128;
                        boolean changed = gapComposer4.changed(keyPadChar14) | (i7 == 8388608);
                        Object rememberedValue4 = gapComposer4.rememberedValue();
                        if (changed || rememberedValue4 == neverEqualPolicy3) {
                            rememberedValue4 = new BasicShieetScope$$ExternalSyntheticLambda10(6, keyPadChar14, str4, function03);
                            gapComposer4.updateRememberedValue(rememberedValue4);
                        }
                        Function0 function05 = (Function0) rememberedValue4;
                        boolean changedInstance = ((i2 & 3670016) == 1048576) | gapComposer4.changedInstance(coroutineScope3) | gapComposer4.changed(keyPadChar14) | ((i2 & 234881024) == 67108864);
                        Object rememberedValue5 = gapComposer4.rememberedValue();
                        if (changedInstance || rememberedValue5 == neverEqualPolicy3) {
                            Function0 function06 = function04;
                            gapComposer2 = gapComposer4;
                            str6 = str4;
                            i3 = i7;
                            keyPadChar2 = keyPadChar14;
                            StateFlowKt$$ExternalSyntheticLambda3 stateFlowKt$$ExternalSyntheticLambda3 = new StateFlowKt$$ExternalSyntheticLambda3(coroutineScope3, keyPadChar2, str6, function06, function1, mutableState, 5);
                            coroutineScope = coroutineScope3;
                            gapComposer2.updateRememberedValue(stateFlowKt$$ExternalSyntheticLambda3);
                            rememberedValue5 = stateFlowKt$$ExternalSyntheticLambda3;
                        } else {
                            str6 = str4;
                            gapComposer2 = gapComposer4;
                            i3 = i7;
                            coroutineScope = coroutineScope3;
                            keyPadChar2 = keyPadChar14;
                        }
                        Modifier m184combinedClickableauXiCPI$default = ImageKt.m184combinedClickableauXiCPI$default(m177backgroundbw27NRU2, mutableInteractionSourceImpl, null, false, null, null, null, function05, (Function0) rememberedValue5, 444);
                        boolean changed2 = (i3 == 8388608) | gapComposer2.changed(keyPadChar2) | gapComposer2.changedInstance(resources2);
                        Object rememberedValue6 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue6 == neverEqualPolicy3) {
                            companion2 = companion3;
                            keyPadChar3 = keyPadChar2;
                            str7 = str6;
                            j8 = j10;
                            neverEqualPolicy2 = neverEqualPolicy3;
                            Resources resources3 = resources2;
                            z = false;
                            BankingConfigQueries$$ExternalSyntheticLambda0 bankingConfigQueries$$ExternalSyntheticLambda0 = new BankingConfigQueries$$ExternalSyntheticLambda0(25, keyPadChar3, resources3, function03, str7);
                            resources = resources3;
                            gapComposer2.updateRememberedValue(bankingConfigQueries$$ExternalSyntheticLambda0);
                            rememberedValue6 = bankingConfigQueries$$ExternalSyntheticLambda0;
                        } else {
                            companion2 = companion3;
                            keyPadChar3 = keyPadChar2;
                            str7 = str6;
                            j8 = j10;
                            neverEqualPolicy2 = neverEqualPolicy3;
                            resources = resources2;
                            z = false;
                        }
                        Modifier semantics = SemanticsModifierKt.semantics(m184combinedClickableauXiCPI$default, true, (Function1) rememberedValue6);
                        BiasAlignment biasAlignment = Alignment.Companion.Center;
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z);
                        int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, semantics);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(layoutNode$Companion$Constructor$13);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer2, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                        Modifier m687graphicsLayer_6ThJ44$default = ColorKt.m687graphicsLayer_6ThJ44$default(BoxScopeInstance.INSTANCE.align(companion2, biasAlignment), ((Number) animateFloatAsState.getValue()).floatValue(), ((Number) animateFloatAsState.getValue()).floatValue(), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 524284);
                        boolean changed3 = gapComposer2.changed(keyPadChar3);
                        Object rememberedValue7 = gapComposer2.rememberedValue();
                        if (changed3 || rememberedValue7 == neverEqualPolicy2) {
                            rememberedValue7 = new Overlay$$ExternalSyntheticLambda0(keyPadChar3, 12);
                            gapComposer2.updateRememberedValue(rememberedValue7);
                        }
                        Modifier semantics2 = SemanticsModifierKt.semantics(m687graphicsLayer_6ThJ44$default, z, (Function1) rememberedValue7);
                        if (Intrinsics.areEqual(keyPadChar3.key, Room.stringResource(gapComposer2, R.string.keypad_abc_key))) {
                            gapComposer2.startReplaceGroup(-1917164054);
                            MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer2.consume(MooncakeTypographyKt.LocalTypography);
                            if (mooncakeTypography == null) {
                                mooncakeTypography = ((Boolean) gapComposer2.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                            }
                            textStyle = mooncakeTypography.smallTitle;
                            gapComposer2.end(z);
                        } else {
                            gapComposer2.startReplaceGroup(-1917056825);
                            MooncakeTypography mooncakeTypography2 = (MooncakeTypography) gapComposer2.consume(MooncakeTypographyKt.LocalTypography);
                            if (mooncakeTypography2 == null) {
                                mooncakeTypography2 = ((Boolean) gapComposer2.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                            }
                            textStyle = mooncakeTypography2.header3;
                            gapComposer2.end(z);
                        }
                        TextStyle textStyle2 = textStyle;
                        String str8 = keyPadChar3.key;
                        companion = companion2;
                        neverEqualPolicy = neverEqualPolicy2;
                        j7 = j5;
                        m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4080, j7, (Composer) gapComposer2, semantics2, textStyle2, (TextLineBalancing) null, str8, (Map) null, (Function1) null, false);
                        gapComposer2.end(true);
                        gapComposer2.end(z);
                        str5 = str7;
                        rectangleShapeKt$RectangleShape$1 = rectangleShapeKt$RectangleShape$13;
                    } else {
                        coroutineScope = coroutineScope2;
                        gapComposer2 = gapComposer3;
                        neverEqualPolicy = neverEqualPolicy3;
                        companion = companion3;
                        it = it4;
                        resources = resources2;
                        j7 = j5;
                        j8 = j10;
                        gapComposer2.startReplaceGroup(-1461717385);
                        str5 = str4;
                        rectangleShapeKt$RectangleShape$1 = rectangleShapeKt$RectangleShape$12;
                        BoxKt.Box(ImageKt.m177backgroundbw27NRU(rowScopeInstance.weight(1.0f, SizeKt.m279heightInVpY3zN4$default(companion, 60.0f, RecyclerView.DECELERATION_RATE, 2), true), Color.Transparent, rectangleShapeKt$RectangleShape$1), gapComposer2, 0);
                        gapComposer2.end(false);
                    }
                    it4 = it;
                    function03 = function02;
                    resources2 = resources;
                    companion3 = companion;
                    rectangleShapeKt$RectangleShape$12 = rectangleShapeKt$RectangleShape$1;
                    str4 = str5;
                    j5 = j7;
                    j10 = j8;
                    coroutineScope2 = coroutineScope;
                    neverEqualPolicy3 = neverEqualPolicy;
                    gapComposer3 = gapComposer2;
                    function04 = function0;
                }
                GapComposer gapComposer5 = gapComposer3;
                gapComposer5.end(false);
                gapComposer5.end(true);
                it2 = it3;
                function03 = function02;
                resources2 = resources2;
                str4 = str4;
                j5 = j5;
                i6 = 3;
                neverEqualPolicy3 = neverEqualPolicy3;
                gapComposer3 = gapComposer5;
                function04 = function0;
            }
            gapComposer = gapComposer3;
            gapComposer.end(false);
            gapComposer.end(true);
            modifier2 = modifier3;
            str3 = str4;
            j3 = j5;
            j4 = j10;
        } else {
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            j3 = j;
            j4 = j2;
            str3 = str2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(j3, j4, extraButton, str, str3, function0, function02, function1, i) { // from class: com.squareup.cash.mooncake.compose_ui.components.KeypadKt$$ExternalSyntheticLambda4
                public final /* synthetic */ long f$1;
                public final /* synthetic */ long f$2;
                public final /* synthetic */ ExtraButton f$3;
                public final /* synthetic */ String f$4;
                public final /* synthetic */ String f$5;
                public final /* synthetic */ Function0 f$6;
                public final /* synthetic */ Function0 f$7;
                public final /* synthetic */ Function1 f$8;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    KeypadKt.m3643KeyPadf8fvdUg(Modifier.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void MooncakeLargeIcon(MooncakeLargeIcon.Icon icon, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1610908400);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(icon.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Modifier modifier3 = modifier;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new OffersHomeQueries$$ExternalSyntheticLambda1(10);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            boolean z = (i3 & 14) == 4;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new Overlay$$ExternalSyntheticLambda0(icon, 13);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AndroidView_androidKt.AndroidView(function1, modifier3, (Function1) rememberedValue2, gapComposer, (i3 & 112) | 6, 0);
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PlayerSurfaceKt$$ExternalSyntheticLambda2(icon, modifier2, i, i2, 12);
        }
    }

    /* renamed from: MooncakeSearchTextField-j30j4ZQ, reason: not valid java name */
    public static final void m3644MooncakeSearchTextFieldj30j4ZQ(String str, Function1 function1, Modifier modifier, Function1 function12, Function0 function0, TextStyle textStyle, long j, boolean z, String str2, Composer composer, int i) {
        GapComposer gapComposer;
        TextStyle textStyle2;
        long j2;
        boolean z2;
        int i2;
        int i3;
        TextStyle textStyle3;
        long j3;
        boolean z3;
        boolean z4;
        TextStyle textStyle4;
        str.getClass();
        function1.getClass();
        function0.getClass();
        str2.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(856889767);
        int i4 = i | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changed(modifier) ? 256 : 128) | (gapComposer2.changedInstance(function12) ? 2048 : 1024) | 24576 | (gapComposer2.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536) | 910688256;
        int i5 = (gapComposer2.changed(str2) ? 4 : 2) | 48;
        if (gapComposer2.shouldExecute(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer2.consume(MooncakeTypographyKt.LocalTypography);
                if (mooncakeTypography == null) {
                    mooncakeTypography = ((Boolean) gapComposer2.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                }
                i2 = i5;
                i3 = i4 & (-33030145);
                textStyle3 = mooncakeTypography.smallBody;
                j3 = MooncakeTheme.getColors(gapComposer2).label;
                z3 = true;
            } else {
                gapComposer2.skipToGroupEnd();
                i3 = i4 & (-33030145);
                textStyle3 = textStyle;
                z3 = z;
                i2 = i5;
                j3 = j;
            }
            gapComposer2.endDefaults();
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                int length = str.length();
                z4 = z3;
                textStyle4 = textStyle3;
                rememberedValue = Updater.mutableStateOf$default(new TextFieldValue(str, coil3.size.SizeKt.TextRange(length, length), 4));
                gapComposer2.updateRememberedValue(rememberedValue);
            } else {
                z4 = z3;
                textStyle4 = textStyle3;
            }
            MutableState mutableState = (MutableState) rememberedValue;
            long j4 = j3;
            TextFieldValue m1002copy3r_uNRQ$default = TextFieldValue.m1002copy3r_uNRQ$default((TextFieldValue) mutableState.getValue(), str, 0L, 6);
            boolean z5 = str.length() > 0;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m276defaultMinSizeVpY3zN4$default(modifier, RecyclerView.DECELERATION_RATE, 48.0f, 1), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), MooncakeTheme.getColors(gapComposer2).behindBackground, ColorKt.RectangleShape);
            gapComposer2.startReplaceGroup(-1162620017);
            gapComposer2.end(false);
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(m177backgroundbw27NRU.then(Modifier.Companion.$$INSTANCE), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, z5 ? RecyclerView.DECELERATION_RATE : 16.0f, RecyclerView.DECELERATION_RATE, 11);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, 3, (Boolean) null, 119);
            KeyboardActions keyboardActions = new KeyboardActions(null, null, function12, 47);
            boolean z6 = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z6 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MainPaymentViewKt$$ExternalSyntheticLambda9(str, function1, mutableState);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            TextStyle textStyle5 = textStyle4;
            z2 = z4;
            gapComposer = gapComposer2;
            m3652TextFieldWiQJ_vM(m1002copy3r_uNRQ$default, (Function1) rememberedValue2, m302paddingqDBjuR0$default, z2, textStyle5, j4, keyboardOptions, keyboardActions, null, true, 0, str2, lambda$1306078879, Expect_jvmKt.rememberComposableLambda(-449138440, new StartPoolAmountKt$$ExternalSyntheticLambda9(z5, function0, 2), gapComposer2), gapComposer, 806882304, 27696 | ((i2 << 6) & 896));
            textStyle2 = textStyle5;
            j2 = j4;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            textStyle2 = textStyle;
            j2 = j;
            z2 = z;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FilterBarKt$$ExternalSyntheticLambda2(str, function1, modifier, function12, function0, textStyle2, j2, z2, str2, i);
        }
    }

    public static final void MooncakeShimmerBox(Modifier modifier, Alignment alignment, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1117175801);
        int i2 = i | 54;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            alignment = Alignment.Companion.TopStart;
            InfiniteRepeatableSpec m154infiniteRepeatable9IiC70o$default = AnimatableKt.m154infiniteRepeatable9IiC70o$default(new TweenSpec(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, EasingKt.LinearEasing), RepeatMode.Restart, 4);
            long j = Color.Black;
            Shimmer rememberShimmer = ShimmerKt.rememberShimmer(ShimmerBounds.Window.INSTANCE, new ShimmerTheme(m154infiniteRepeatable9IiC70o$default, 9, 30.0f, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(Color.m675copywmQWz5c$default(RecyclerView.DECELERATION_RATE, j, 14)), new Color(Color.m675copywmQWz5c$default(MooncakeTheme.getColors(gapComposer).isLight ? 0.05f : 0.5f, j, 14)), new Color(Color.m675copywmQWz5c$default(RecyclerView.DECELERATION_RATE, j, 14))}), CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(RecyclerView.DECELERATION_RATE), Float.valueOf(0.5f), Float.valueOf(1.0f)})), gapComposer, 0);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier shimmer = ShimmerKt.shimmer(companion, rememberShimmer, gapComposer, 70);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, shimmer);
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
            composableLambdaImpl.invoke(BoxScopeInstance.INSTANCE, (Object) gapComposer, (Object) 54);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        Alignment alignment2 = alignment;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda5(i, 25, modifier2, alignment2, composableLambdaImpl);
        }
    }

    public static final void MooncakeSwitch(ComposableLambdaImpl composableLambdaImpl, boolean z, Function1 function1, Modifier modifier, Function2 function2, boolean z2, PaddingValuesImpl paddingValuesImpl, boolean z3, Composer composer, int i) {
        ComposableLambdaImpl composableLambdaImpl2;
        Function2 function22;
        PaddingValuesImpl paddingValuesImpl2;
        boolean z4;
        GapComposer gapComposer;
        Modifier modifier2;
        boolean z5;
        boolean z6;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1320807093);
        int i2 = i | (gapComposer2.changed(z) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128) | 12782592;
        int i3 = 1;
        if (gapComposer2.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            Role role = new Role(2);
            boolean z7 = (i2 & 896) == 256;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z7 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(25, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            paddingValuesImpl2 = paddingValuesImpl;
            modifier2 = companion;
            z4 = z;
            Modifier padding = SpacerKt.padding(SelectableKt.m337toggleableoSLSa3U$default(companion, z, false, role, (Function1) rememberedValue, 10), paddingValuesImpl2);
            int i4 = 21;
            composableLambdaImpl2 = composableLambdaImpl;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1656998790, new OverlaysKt$$ExternalSyntheticLambda1(composableLambdaImpl2, i4), gapComposer2);
            function22 = function2;
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1211461479, new ToastKt$$ExternalSyntheticLambda11(i4, function22), gapComposer2);
            gapComposer2.startReplaceGroup(-1967371534);
            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-721145475, new BitcoinMapOnboardingViewKt$$ExternalSyntheticLambda1(z4, function1, i3), gapComposer2);
            gapComposer2.end(false);
            gapComposer = gapComposer2;
            MooncakeSwitchScaffold(padding, rememberComposableLambda, rememberComposableLambda2, rememberComposableLambda3, gapComposer, 432);
            z5 = true;
            z6 = true;
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            function22 = function2;
            paddingValuesImpl2 = paddingValuesImpl;
            z4 = z;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            z5 = z2;
            z6 = z3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InputAreaKt$$ExternalSyntheticLambda0(composableLambdaImpl2, z4, function1, modifier2, function22, z5, paddingValuesImpl2, z6, i);
        }
    }

    public static final void MooncakeSwitchScaffold(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, Function2 function2, Composer composer, int i) {
        Function2 function22;
        float f;
        boolean z;
        boolean z2;
        Function2 function23 = function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2132184986);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(function23) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            float f2 = function23 == null ? RecyclerView.DECELERATION_RATE : 52.0f;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14, 1.0f, true);
            BiasAlignment biasAlignment = Alignment.Companion.TopStart;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            composableLambdaImpl.invoke((Object) gapComposer, (Object) 6);
            gapComposer.end(true);
            if (function2 != null) {
                gapComposer.startReplaceGroup(-2117021786);
                SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 16.0f));
                Modifier m284requiredWidth3ABfNKs = SizeKt.m284requiredWidth3ABfNKs(companion, f2);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                f = 16.0f;
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, m284requiredWidth3ABfNKs);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                int i3 = (i2 >> 9) & 14;
                function23 = function2;
                z = true;
                z2 = false;
                Recorder$$ExternalSyntheticOutline2.m(i3, function23, gapComposer, true, false);
            } else {
                f = 16.0f;
                z = true;
                z2 = false;
                function23 = function2;
                gapComposer.startReplaceGroup(-2116841118);
                gapComposer.end(false);
            }
            gapComposer.end(z);
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f + f2, RecyclerView.DECELERATION_RATE, 11);
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z2);
            int hashCode5 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier5, composeUiNode$Companion$SetModifier$14);
            function22 = composableLambdaImpl2;
            function22.invoke(gapComposer, 6);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            function22 = composableLambdaImpl2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolGoalMetKt$$ExternalSyntheticLambda0(modifier, composableLambdaImpl, function22, function23, i, 1);
        }
    }

    /* renamed from: NavigateUpButton-_KipM6I, reason: not valid java name */
    public static final void m3645NavigateUpButton_KipM6I(int i, long j, Composer composer, NavigationIconType navigationIconType, Function0 function0) {
        int i2;
        long j2;
        Pair pair;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-432328414);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed((Object) null) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(navigationIconType.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            int ordinal = navigationIconType.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(1144230315);
                pair = new Pair(Integer.valueOf(R.drawable.mooncake_chevron_back), Room.stringResource(gapComposer, R.string.action_bar_back));
                gapComposer.end(false);
            } else {
                if (ordinal != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1144229047, false);
                }
                gapComposer.startReplaceGroup(1144235489);
                pair = new Pair(Integer.valueOf(R.drawable.close_black), Room.stringResource(gapComposer, R.string.action_bar_close));
                gapComposer.end(false);
            }
            int intValue = ((Number) pair.first).intValue();
            String str = (String) pair.second;
            int i3 = i2 << 9;
            m3656ToolbarActionButtondOz2H2g(null, intValue, str, j, false, function0, gapComposer, ((i2 << 12) & 458752) | (i3 & 7168) | (i3 & 3670016));
            j2 = j;
        } else {
            j2 = j;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda13(i, j2, navigationIconType, function0);
        }
    }

    /* renamed from: NavigationIcon-bfVYXPE, reason: not valid java name */
    public static final void m3646NavigationIconbfVYXPE(int i, long j, Composer composer, NavigationIconType navigationIconType, Function0 function0) {
        long j2;
        Function0 function02;
        navigationIconType.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1040980241);
        int i2 = (gapComposer.changed(navigationIconType.ordinal()) ? 4 : 2) | i | (gapComposer.changed(j) ? 32 : 16) | (gapComposer.changed((Object) null) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            int ordinal = navigationIconType.ordinal();
            if (ordinal == 0) {
                j2 = j;
                function02 = function0;
                gapComposer.startReplaceGroup(2116724448);
                int i3 = i2 >> 3;
                m3645NavigateUpButton_KipM6I((i3 & 112) | (i3 & 14) | MLKEMEngine.KyberPolyBytes | (i2 & 7168), j2, gapComposer, NavigationIconType.BACK, function02);
                gapComposer.end(false);
            } else {
                if (ordinal != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 345375000, false);
                }
                gapComposer.startReplaceGroup(2116921887);
                NavigationIconType navigationIconType2 = NavigationIconType.CLOSE;
                int i4 = i2 >> 3;
                j2 = j;
                function02 = function0;
                m3645NavigateUpButton_KipM6I((i4 & 112) | (i4 & 14) | MLKEMEngine.KyberPolyBytes | (i2 & 7168), j2, gapComposer, navigationIconType2, function02);
                gapComposer.end(false);
            }
        } else {
            j2 = j;
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ToolbarKt$$ExternalSyntheticLambda0(i, j2, navigationIconType, function02);
        }
    }

    /* renamed from: Pill-MogV5mo, reason: not valid java name */
    public static final void m3647PillMogV5mo(String str, Modifier modifier, int i, Color color, Color color2, Composer composer, int i2) {
        long j;
        Modifier.Companion companion;
        long j2;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1847060546);
        Applier applier = gapComposer.applier;
        int i3 = i2 | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changed(i) ? 2048 : 1024) | (gapComposer.changed(color) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(color2) ? PKIFailureInfo.unsupportedVersion : 65536) | 1572864;
        if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) != 599186)) {
            gapComposer.startDefaults();
            if ((i2 & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            float f = MooncakeTheme.getColors(gapComposer).isLight ? 0.1f : 0.2f;
            if (color != null) {
                j = color.value;
            } else if (MooncakeTheme.getColors(gapComposer).isLight) {
                gapComposer.startReplaceGroup(-1339892822);
                gapComposer.end(false);
                j = ColorKt.Color(4278222895L);
            } else {
                gapComposer.startReplaceGroup(-1339802860);
                j = MooncakeTheme.getColors(gapComposer).green;
                gapComposer.end(false);
            }
            long j3 = j;
            Modifier clip = ClipKt.clip(SizeKt.wrapContentSize$default(modifier, null, 3), RoundedCornerShapeKt.RoundedCornerShape(50));
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier then = clip.then(companion2);
            if (color2 == null) {
                gapComposer.startReplaceGroup(1203723775);
                companion = companion2;
                j2 = Color.m675copywmQWz5c$default(f, MooncakeTheme.getColors(gapComposer).green, 14);
                gapComposer.end(false);
            } else {
                companion = companion2;
                gapComposer.startReplaceGroup(1203722349);
                gapComposer.end(false);
                j2 = color2.value;
            }
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(then, j2, ColorKt.RectangleShape), 12.0f, 4.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
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
            gapComposer.startReplaceGroup(-446700874);
            gapComposer.end(false);
            m3651TextPdH14aY(0, 0, i, 0, (i3 & 14) | ((i3 << 15) & 234881024), 0, 3826, j3, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(MooncakeTheme.getTypography(gapComposer).identifier, 0L, 0L, null, null, Room.pack(8589934592L, 0.05f), null, 0L, null, null, null, 0, 0L, null, null, 0, 16777087), (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2(str, modifier, i, color, color2, i2);
        }
    }

    public static final void PrimarySplitButton(int i, Composer composer, Modifier modifier, String str, Function0 function0) {
        int i2;
        Function0 function02;
        GapComposer gapComposer;
        SplitButtons.Style style = SplitButtons.Style.MOONCAKE_PILLS;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-699142941);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function02 = function0;
            i2 |= gapComposer2.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            function02 = function0;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changed(-1) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            Modifier testTag = TestTagKt.testTag(modifier, "SplitButtons_PrimarySplitButton");
            gapComposer2.startReplaceGroup(-1870583129);
            m3640ButtonGFipHI0(str, function02, testTag, null, MooncakePillButton.Size.LARGE, MooncakePillButton.Style.PRIMARY, null, true, 0, null, null, gapComposer2, ((i2 >> 3) & 14) | 24576 | ((i2 >> 9) & 112) | ((i2 << 15) & 29360128), 0, 3912);
            gapComposer = gapComposer2;
            gapComposer.end(false);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteErrorDialogKt$$ExternalSyntheticLambda4(modifier, str, function0, i, 3);
        }
    }

    public static final void PushOnPress(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1436531211);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PushOnPressScope(new MutableInteractionSourceImpl());
                gapComposer.updateRememberedValue(rememberedValue);
            }
            PushOnPressScope pushOnPressScope = (PushOnPressScope) rememberedValue;
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) Room.collectIsPressedAsState(pushOnPressScope.interactionSource, gapComposer, 6).getValue()).booleanValue() ? 0.95f : 1.0f, AnimatableKt.tween$default(80, 0, null, 6), null, null, gapComposer, 48, 28);
            float floatValue = ((Number) animateFloatAsState.getValue()).floatValue();
            float floatValue2 = ((Number) animateFloatAsState.getValue()).floatValue();
            modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier m687graphicsLayer_6ThJ44$default = ColorKt.m687graphicsLayer_6ThJ44$default(modifier2, floatValue, floatValue2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 524284);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m687graphicsLayer_6ThJ44$default);
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
            composableLambdaImpl.invoke((Object) pushOnPressScope, (Object) gapComposer, (Object) 54);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SimpleLayoutKt$$ExternalSyntheticLambda0(modifier2, composableLambdaImpl, i, 2);
        }
    }

    /* renamed from: PushOnPressCard-IkByU14, reason: not valid java name */
    public static final void m3648PushOnPressCardIkByU14(Modifier modifier, Shape shape, long j, Function0 function0, Alignment alignment, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        Shape shape2;
        Alignment alignment2;
        Shape m340RoundedCornerShape0680j_4;
        Alignment alignment3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1921492302);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(j) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= gapComposer.changed(true) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i4 = i3 | 14155776;
        if ((100663296 & i) == 0) {
            i4 |= gapComposer.changedInstance(composableLambdaImpl) ? 67108864 : 33554432;
        }
        if (gapComposer.shouldExecute(i4 & 1, (38347923 & i4) != 38347922)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f);
                alignment3 = Alignment.Companion.TopStart;
            } else {
                gapComposer.skipToGroupEnd();
                m340RoundedCornerShape0680j_4 = shape;
                alignment3 = alignment;
            }
            gapComposer.endDefaults();
            PushOnPress(null, Expect_jvmKt.rememberComposableLambda(-1241839340, new DropdownFieldUIKt$$ExternalSyntheticLambda4(modifier, m340RoundedCornerShape0680j_4, j, function0, alignment3, composableLambdaImpl), gapComposer), gapComposer, 48);
            shape2 = m340RoundedCornerShape0680j_4;
            alignment2 = alignment3;
        } else {
            gapComposer.skipToGroupEnd();
            shape2 = shape;
            alignment2 = alignment;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownCodeKt$$ExternalSyntheticLambda4(modifier, shape2, j, function0, alignment2, composableLambdaImpl, i);
        }
    }

    public static final void SearchIcon(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-166629495);
        int i2 = 5;
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 14.0f, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 10), 20.0f);
            Painter painterResource = Countries.painterResource(R.drawable.mooncake_search, 0, gapComposer);
            long j = MooncakeTheme.getColors(gapComposer).tertiaryLabel;
            ImageKt.Image(painterResource, null, m285size3ABfNKs, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 432, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda6(i, i2);
        }
    }

    public static final void SecondarySplitButton(int i, Composer composer, Modifier modifier, String str, Function0 function0) {
        Modifier modifier2;
        int i2;
        Function0 function02;
        GapComposer gapComposer;
        SplitButtons.Style style = SplitButtons.Style.MOONCAKE_PILLS;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(247792085);
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i2 = (gapComposer2.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function02 = function0;
            i2 |= gapComposer2.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            function02 = function0;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changed(-1) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            gapComposer2.startReplaceGroup(-1074503175);
            m3640ButtonGFipHI0(str, function02, modifier2, null, MooncakePillButton.Size.LARGE, MooncakePillButton.Style.SECONDARY, null, true, 0, null, null, gapComposer2, ((i2 >> 3) & 14) | 24576 | ((i2 >> 9) & 112) | ((i2 << 6) & 896) | ((i2 << 15) & 29360128), 0, 3912);
            gapComposer = gapComposer2;
            gapComposer.end(false);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteErrorDialogKt$$ExternalSyntheticLambda4(modifier, str, function0, i, 2);
        }
    }

    /* renamed from: SplitButtons-nbWgWpA, reason: not valid java name */
    public static final void m3649SplitButtonsnbWgWpA(Modifier modifier, SplitButtons.Style style, SplitButtons.LayoutMode layoutMode, SplitButtonEntry splitButtonEntry, SplitButtonEntry splitButtonEntry2, float f, float f2, Composer composer, int i) {
        SplitButtons.LayoutMode layoutMode2;
        float f3;
        float f4;
        float f5;
        float f6;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1873645889);
        int i2 = i | 432 | (gapComposer.changedInstance(splitButtonEntry) ? 2048 : 1024) | (gapComposer.changedInstance(splitButtonEntry2) ? 16384 : PKIFailureInfo.certRevoked) | 1769472;
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            SplitButtons.Style style2 = SplitButtons.Style.MOONCAKE_PILLS;
            layoutMode2 = SplitButtons.LayoutMode.AUTOMATIC;
            int ordinal = layoutMode2.ordinal();
            int i3 = 3;
            float f7 = 1.0f;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    style = style2;
                    f5 = 15.0f;
                    gapComposer.startReplaceGroup(392293783);
                    gapComposer.end(false);
                } else {
                    if (ordinal != 2) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 982413489, false);
                    }
                    gapComposer.startReplaceGroup(391104716);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
                    LayoutDirection layoutDirection = LayoutDirection.Rtl;
                    SplitButtons.Style style3 = SplitButtons.Style.MOONCAKE_PILLS;
                    style = style2;
                    f5 = 15.0f;
                    coil3.size.SizeKt.AdaptiveStack(fillMaxWidth, null, layoutDirection, new Arrangement$SpacedAligned(15.0f, true, new Drop$$ExternalSyntheticBUOutline0(i3)), null, null, Expect_jvmKt.rememberComposableLambda(503852691, new MoneyTabUIKt$$ExternalSyntheticLambda11(splitButtonEntry, splitButtonEntry2, f7), gapComposer), gapComposer, 1573248, 50);
                    gapComposer.end(false);
                }
                f6 = 1.0f;
            } else {
                style = style2;
                f5 = 15.0f;
                gapComposer.startReplaceGroup(390041385);
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(modifier, 1.0f);
                SplitButtons.Style style4 = SplitButtons.Style.MOONCAKE_PILLS;
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(15.0f, true, new Drop$$ExternalSyntheticBUOutline0(i3)), Alignment.Companion.Start, gapComposer, 0);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth2);
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
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (splitButtonEntry == null) {
                    gapComposer.startReplaceGroup(-1887210520);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1887210519);
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new OffersHomeQueries$$ExternalSyntheticLambda1(13);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    PrimarySplitButton(3072, gapComposer, SemanticsModifierKt.semantics(fillMaxWidth3, false, (Function1) rememberedValue), splitButtonEntry.text.toString(), splitButtonEntry.onClick);
                    gapComposer.end(false);
                }
                gapComposer.startReplaceGroup(-1886767405);
                gapComposer.end(false);
                if (splitButtonEntry2 == null) {
                    gapComposer.startReplaceGroup(-1886736034);
                    gapComposer.end(false);
                    f6 = 1.0f;
                } else {
                    gapComposer.startReplaceGroup(-1886736033);
                    f6 = 1.0f;
                    Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion, 1.0f);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new OffersHomeQueries$$ExternalSyntheticLambda1(14);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    SecondarySplitButton(3072, gapComposer, SemanticsModifierKt.semantics(fillMaxWidth4, false, (Function1) rememberedValue2), splitButtonEntry2.text.toString(), splitButtonEntry2.onClick);
                    gapComposer.end(false);
                }
                gapComposer.end(true);
                gapComposer.end(false);
            }
            f3 = f5;
            f4 = f6;
        } else {
            gapComposer.skipToGroupEnd();
            layoutMode2 = layoutMode;
            f3 = f;
            f4 = f2;
        }
        SplitButtons.Style style5 = style;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaymentPlanSummaryViewKt$$ExternalSyntheticLambda28(modifier, style5, layoutMode2, splitButtonEntry, splitButtonEntry2, f3, f4, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* renamed from: Text-PdH14aY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3650TextPdH14aY(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, Composer composer, Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, TextLineBalancing textLineBalancing, Map map, Function1 function1, boolean z) {
        int i8;
        Modifier modifier2;
        TextStyle textStyle2;
        int i9;
        Function1 function12;
        int i10;
        int i11;
        int i12;
        boolean z2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        GapComposer gapComposer;
        int i19;
        int i20;
        int i21;
        int i22;
        TextLineBalancing textLineBalancing2;
        boolean z3;
        Function1 function13;
        Map map2;
        RecomposeScopeImpl endRestartGroup;
        boolean z4;
        int i23;
        int i24;
        int i25;
        int i26;
        Map map3;
        int i27;
        int i28;
        int i29;
        int i30;
        TextLineBalancing textLineBalancing3;
        long j2;
        int i31;
        int i32;
        annotatedString.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-70487906);
        if ((i5 & 6) == 0) {
            i8 = (gapComposer2.changed(annotatedString) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        int i33 = i7 & 2;
        if (i33 != 0) {
            i8 |= 48;
        } else if ((i5 & 48) == 0) {
            modifier2 = modifier;
            i8 |= gapComposer2.changed(modifier2) ? 32 : 16;
            if ((i5 & MLKEMEngine.KyberPolyBytes) != 0) {
                textStyle2 = textStyle;
                i8 |= gapComposer2.changed(textStyle2) ? 256 : 128;
            } else {
                textStyle2 = textStyle;
            }
            if ((i5 & 3072) == 0) {
                i8 |= gapComposer2.changed(j) ? 2048 : 1024;
            }
            i9 = i7 & 16;
            if (i9 == 0) {
                i8 |= 24576;
            } else if ((i5 & 24576) == 0) {
                function12 = function1;
                i8 |= gapComposer2.changedInstance(function12) ? 16384 : PKIFailureInfo.certRevoked;
                i10 = i7 & 32;
                if (i10 != 0) {
                    i8 |= 196608;
                } else if ((i5 & 196608) == 0) {
                    i8 |= gapComposer2.changed(i) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
                i11 = i7 & 64;
                if (i11 != 0) {
                    i8 |= 1572864;
                } else if ((i5 & 1572864) == 0) {
                    i8 |= gapComposer2.changed(i2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
                i12 = i7 & 128;
                if (i12 != 0) {
                    i8 |= 12582912;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i5 & 12582912) == 0) {
                        i8 |= gapComposer2.changed(z2) ? 8388608 : 4194304;
                    }
                }
                if ((i5 & 100663296) == 0) {
                    int i34 = i8;
                    if ((i7 & 256) == 0 && gapComposer2.changed(i3)) {
                        i32 = 67108864;
                        i13 = i34 | i32;
                    }
                    i32 = 33554432;
                    i13 = i34 | i32;
                } else {
                    i13 = i8;
                }
                i14 = i7 & 512;
                if (i14 != 0) {
                    i13 |= 805306368;
                } else if ((i5 & 805306368) == 0) {
                    i15 = i14;
                    i13 |= gapComposer2.changed(textLineBalancing) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    if ((i6 & 6) != 0) {
                        if ((i7 & 1024) == 0 && gapComposer2.changed(i4)) {
                            i31 = 4;
                            i16 = i6 | i31;
                        }
                        i31 = 2;
                        i16 = i6 | i31;
                    } else {
                        i16 = i6;
                    }
                    i17 = i7 & 2048;
                    if (i17 == 0) {
                        i16 |= 48;
                    } else if ((i6 & 48) == 0) {
                        i18 = i17;
                        i16 |= gapComposer2.changedInstance(map) ? 32 : 16;
                        if (gapComposer2.shouldExecute(i13 & 1, (i13 & 306783379) == 306783378 || (i16 & 19) != 18)) {
                            gapComposer2.startDefaults();
                            if ((i5 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                                Modifier modifier3 = i33 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                                if (i9 != 0) {
                                    Object rememberedValue = gapComposer2.rememberedValue();
                                    if (rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = new OffersHomeQueries$$ExternalSyntheticLambda1(12);
                                        gapComposer2.updateRememberedValue(rememberedValue);
                                    }
                                    function12 = (Function1) rememberedValue;
                                }
                                int i35 = i10 != 0 ? Integer.MAX_VALUE : i;
                                int i36 = i11 != 0 ? 1 : i2;
                                z4 = i12 == 0 ? z2 : true;
                                if ((i7 & 256) != 0) {
                                    i13 &= -234881025;
                                    i23 = 0;
                                } else {
                                    i23 = i3;
                                }
                                TextLineBalancing textLineBalancing4 = i15 != 0 ? null : textLineBalancing;
                                if ((i7 & 1024) != 0) {
                                    i24 = textLineBalancing4 != null ? 3 : 2;
                                    i16 &= -15;
                                } else {
                                    i24 = i4;
                                }
                                if (i18 != 0) {
                                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                                    emptyMap.getClass();
                                    int i37 = i36;
                                    modifier2 = modifier3;
                                    i25 = i16;
                                    i26 = i37;
                                    i27 = i23;
                                    i28 = i35;
                                    i29 = i24;
                                    map3 = emptyMap;
                                } else {
                                    int i38 = i36;
                                    modifier2 = modifier3;
                                    i25 = i16;
                                    i26 = i38;
                                    map3 = map;
                                    i27 = i23;
                                    i28 = i35;
                                    i29 = i24;
                                }
                                function13 = function12;
                                i30 = i13;
                                textLineBalancing3 = textLineBalancing4;
                            } else {
                                gapComposer2.skipToGroupEnd();
                                if ((i7 & 256) != 0) {
                                    i13 &= -234881025;
                                }
                                if ((i7 & 1024) != 0) {
                                    i16 &= -15;
                                }
                                i28 = i;
                                i27 = i3;
                                i29 = i4;
                                map3 = map;
                                z4 = z2;
                                function13 = function12;
                                i25 = i16;
                                i30 = i13;
                                i26 = i2;
                                textLineBalancing3 = textLineBalancing;
                            }
                            gapComposer2.endDefaults();
                            gapComposer2.startReplaceGroup(980618822);
                            if (j != 16) {
                                j2 = j;
                            } else {
                                gapComposer2.startReplaceGroup(980619595);
                                long m996getColor0d7_KjU = textStyle2.m996getColor0d7_KjU();
                                if (m996getColor0d7_KjU == 16) {
                                    gapComposer2.startReplaceGroup(302311945);
                                    long j3 = ((Color) gapComposer2.consume(ComposeMooncakeThemeKt.LocalTextColor)).value;
                                    if (j3 == 16) {
                                        j3 = MooncakeTheme.getColors(gapComposer2).label;
                                    }
                                    m996getColor0d7_KjU = j3;
                                    gapComposer2.end(false);
                                }
                                gapComposer2.end(false);
                                j2 = m996getColor0d7_KjU;
                            }
                            gapComposer2.end(false);
                            gapComposer = gapComposer2;
                            BundleKt.m1092FoundationTextPdH14aY(annotatedString, modifier2, textStyle2, j2, function13, i28, i26, z4, i27, textLineBalancing3, i29, map3, gapComposer, i30 & 2147476478, i25 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                            i19 = i28;
                            i20 = i26;
                            z3 = z4;
                            i21 = i27;
                            textLineBalancing2 = textLineBalancing3;
                            i22 = i29;
                            map2 = map3;
                        } else {
                            gapComposer = gapComposer2;
                            gapComposer.skipToGroupEnd();
                            i19 = i;
                            i20 = i2;
                            i21 = i3;
                            i22 = i4;
                            textLineBalancing2 = textLineBalancing;
                            z3 = z2;
                            function13 = function12;
                            map2 = map;
                        }
                        Modifier modifier4 = modifier2;
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new MooncakeTextKt$$ExternalSyntheticLambda1(i19, i20, i21, i22, i5, i6, i7, 1, j, modifier4, textStyle, textLineBalancing2, annotatedString, map2, function13, z3);
                            return;
                        }
                        return;
                    }
                    i18 = i17;
                    if (gapComposer2.shouldExecute(i13 & 1, (i13 & 306783379) == 306783378 || (i16 & 19) != 18)) {
                    }
                    Modifier modifier42 = modifier2;
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i15 = i14;
                if ((i6 & 6) != 0) {
                }
                i17 = i7 & 2048;
                if (i17 == 0) {
                }
                i18 = i17;
                if (gapComposer2.shouldExecute(i13 & 1, (i13 & 306783379) == 306783378 || (i16 & 19) != 18)) {
                }
                Modifier modifier422 = modifier2;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function12 = function1;
            i10 = i7 & 32;
            if (i10 != 0) {
            }
            i11 = i7 & 64;
            if (i11 != 0) {
            }
            i12 = i7 & 128;
            if (i12 != 0) {
            }
            if ((i5 & 100663296) == 0) {
            }
            i14 = i7 & 512;
            if (i14 != 0) {
            }
            i15 = i14;
            if ((i6 & 6) != 0) {
            }
            i17 = i7 & 2048;
            if (i17 == 0) {
            }
            i18 = i17;
            if (gapComposer2.shouldExecute(i13 & 1, (i13 & 306783379) == 306783378 || (i16 & 19) != 18)) {
            }
            Modifier modifier4222 = modifier2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i5 & MLKEMEngine.KyberPolyBytes) != 0) {
        }
        if ((i5 & 3072) == 0) {
        }
        i9 = i7 & 16;
        if (i9 == 0) {
        }
        function12 = function1;
        i10 = i7 & 32;
        if (i10 != 0) {
        }
        i11 = i7 & 64;
        if (i11 != 0) {
        }
        i12 = i7 & 128;
        if (i12 != 0) {
        }
        if ((i5 & 100663296) == 0) {
        }
        i14 = i7 & 512;
        if (i14 != 0) {
        }
        i15 = i14;
        if ((i6 & 6) != 0) {
        }
        i17 = i7 & 2048;
        if (i17 == 0) {
        }
        i18 = i17;
        if (gapComposer2.shouldExecute(i13 & 1, (i13 & 306783379) == 306783378 || (i16 & 19) != 18)) {
        }
        Modifier modifier42222 = modifier2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: TextField-WiQJ_vM, reason: not valid java name */
    public static final void m3652TextFieldWiQJ_vM(final TextFieldValue textFieldValue, final Function1 function1, final Modifier modifier, final boolean z, final TextStyle textStyle, final long j, final KeyboardOptions keyboardOptions, final KeyboardActions keyboardActions, SolidColor solidColor, final boolean z2, int i, final String str, final Function2 function2, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i4;
        TextStyle textStyle2;
        final String str2;
        Function2 function22;
        GapComposer gapComposer;
        final SolidColor solidColor2;
        final int i5;
        SolidColor solidColor3;
        int i6;
        int i7;
        function1.getClass();
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(536675662);
        if ((i2 & 6) == 0) {
            i4 = (gapComposer2.changed(textFieldValue) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= gapComposer2.changed(z) ? 2048 : 1024;
        }
        int i8 = i2 & 24576;
        int i9 = PKIFailureInfo.certRevoked;
        if (i8 == 0) {
            textStyle2 = textStyle;
            i4 |= gapComposer2.changed(textStyle2) ? 16384 : 8192;
        } else {
            textStyle2 = textStyle;
        }
        if ((i2 & 196608) == 0) {
            i4 |= gapComposer2.changed(j) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= gapComposer2.changed(keyboardOptions) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= gapComposer2.changed(keyboardActions) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= gapComposer2.changed(z2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i10 = i3 | 6;
        if ((i3 & 48) == 0) {
            i10 |= gapComposer2.changed(false) ? 32 : 16;
        }
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            str2 = str;
            i10 |= gapComposer2.changed(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i3 & 3072) == 0) {
            function22 = function2;
            i10 |= gapComposer2.changedInstance(function22) ? 2048 : 1024;
        } else {
            function22 = function2;
        }
        if ((i3 & 24576) == 0) {
            if (gapComposer2.changedInstance(function3)) {
                i9 = 16384;
            }
            i10 |= i9;
        }
        int i11 = i10;
        if (gapComposer2.shouldExecute(i4 & 1, ((i4 & 306783379) == 306783378 && (i11 & 9363) == 9362) ? false : true)) {
            gapComposer2.startDefaults();
            if ((i2 & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                solidColor3 = new SolidColor(MooncakeTheme.getColors(gapComposer2).tint);
                i6 = i4 & (-234881025);
                i7 = Integer.MAX_VALUE;
            } else {
                gapComposer2.skipToGroupEnd();
                i7 = i;
                i6 = i4 & (-234881025);
                solidColor3 = solidColor;
            }
            gapComposer2.endDefaults();
            final TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(textStyle2, j != 16 ? j : textStyle2.m996getColor0d7_KjU(), 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214);
            final int i12 = i7;
            final Function2 function23 = function22;
            SolidColor solidColor4 = solidColor3;
            gapComposer = gapComposer2;
            BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifier, z, m994copyp1EtxEg$default, keyboardOptions, keyboardActions, z2, i7, 0, null, null, null, solidColor4, Expect_jvmKt.rememberComposableLambda(1081465035, new Function3() { // from class: com.squareup.cash.mooncake.compose_ui.components.MooncakeTextFieldKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Function2 function24 = (Function2) obj;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    function24.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((GapComposer) composer2).changedInstance(function24) ? 4 : 2;
                    }
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                        KeypadKt.TextFieldDecorationBox(TextFieldValue.this.annotatedString.text, m994copyp1EtxEg$default, str2, z2, i12, function23, function3, function24, gapComposer3, (intValue << 21) & 29360128);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), gapComposer, ((i6 >> 3) & 234881024) | (i6 & 8190) | ((i11 << 9) & 57344) | (3670016 & i6) | (29360128 & i6) | ((i11 << 27) & 1879048192), 196608, 15360);
            i5 = i7;
            solidColor2 = solidColor4;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            solidColor2 = solidColor;
            i5 = i;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.mooncake.compose_ui.components.MooncakeTextFieldKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                    int updateChangedFlags2 = Updater.updateChangedFlags(i3);
                    KeypadKt.m3652TextFieldWiQJ_vM(TextFieldValue.this, function1, modifier, z, textStyle, j, keyboardOptions, keyboardActions, solidColor2, z2, i5, str, function2, function3, (Composer) obj, updateChangedFlags, updateChangedFlags2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void TextFieldDecorationBox(String str, TextStyle textStyle, String str2, boolean z, int i, Function2 function2, Function3 function3, Function2 function22, Composer composer, int i2) {
        int i3;
        Function3 function32;
        RowScopeInstance rowScopeInstance;
        boolean z2;
        Function3 function33 = function3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(794896429);
        Applier applier = gapComposer.applier;
        if ((i2 & 6) == 0) {
            i3 = (gapComposer.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= gapComposer.changed(textStyle) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= gapComposer.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= gapComposer.changed(i) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i2) == 0) {
            i3 |= gapComposer.changedInstance(function2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= gapComposer.changedInstance(function33) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i2) == 0) {
            i3 |= gapComposer.changedInstance(function22) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 4793491) != 4793490)) {
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier animateContentSize$default = AnimatedContentKt.animateContentSize$default(companion, null, 3);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, animateContentSize$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            if (function2 == null) {
                gapComposer.startReplaceGroup(-1892475722);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1169426261);
                Recorder$$ExternalSyntheticOutline1.m((i4 >> 15) & 14, function2, gapComposer, false);
            }
            gapComposer.end(true);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(rowScopeInstance2.weight(1.0f, companion, true), density.mo231toDpGaN1DYA(Room.pack(4294967296L, TextUnit.m1059getValueimpl(textStyle.paragraphStyle.lineHeight))), RecyclerView.DECELERATION_RATE, 2);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterStart, false);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m279heightInVpY3zN4$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            function22.invoke(gapComposer, Integer.valueOf((i4 >> 21) & 14));
            if (str.length() == 0) {
                gapComposer.startReplaceGroup(-949575534);
                rowScopeInstance = rowScopeInstance2;
                m3651TextPdH14aY(z ? 1 : i, 0, 0, 0, (14 & (i4 >> 6)) | ((i4 << 3) & 896), 0, 4050, Color.m675copywmQWz5c$default(0.36f, textStyle.m996getColor0d7_KjU(), 14), (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                z2 = false;
                gapComposer.end(false);
            } else {
                rowScopeInstance = rowScopeInstance2;
                z2 = false;
                gapComposer.startReplaceGroup(-949325674);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            Function3 function34 = function3;
            if (function34 != null) {
                gapComposer.startReplaceGroup(900108536);
                function34.invoke(rowScopeInstance, gapComposer, Integer.valueOf(((i4 >> 15) & 112) | 6));
            } else {
                gapComposer.startReplaceGroup(2133575257);
            }
            gapComposer.end(z2);
            gapComposer.end(true);
            function32 = function34;
        } else {
            gapComposer.skipToGroupEnd();
            function32 = function33;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonKt$$ExternalSyntheticLambda4(str, textStyle, str2, z, i, function2, function32, function22, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007b  */
    /* renamed from: Toolbar-7ZsnBMk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3653Toolbar7ZsnBMk(ComposableLambdaImpl composableLambdaImpl, Modifier modifier, NavigationIconType navigationIconType, long j, Function0 function0, Function3 function3, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        Function3 function32;
        Modifier modifier3;
        GapComposer gapComposer;
        long j2;
        RecomposeScopeImpl endRestartGroup;
        long j3;
        int i6;
        Function3 function33;
        int i7;
        Modifier modifier4;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1437518249);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 32 : 16;
            int i9 = i3 | MLKEMEngine.KyberPolyBytes;
            if ((i & 3072) == 0) {
                i9 |= gapComposer2.changed(navigationIconType == null ? -1 : navigationIconType.ordinal()) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i9 |= PKIFailureInfo.certRevoked;
            }
            i4 = i9 | 196608;
            if ((1572864 & i) == 0) {
                i4 |= gapComposer2.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            }
            i5 = i2 & 128;
            if (i5 == 0) {
                i4 |= 12582912;
            } else if ((12582912 & i) == 0) {
                function32 = function3;
                i4 |= gapComposer2.changedInstance(function32) ? 8388608 : 4194304;
                if (gapComposer2.shouldExecute(i4 & 1, (4793491 & i4) != 4793490)) {
                    gapComposer2.startDefaults();
                    if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                        Modifier modifier5 = i8 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                        j3 = MooncakeTheme.getColors(gapComposer2).label;
                        i6 = i4 & (-57345);
                        if (i5 != 0) {
                            function33 = lambda$1835924848;
                            Modifier modifier6 = modifier5;
                            i7 = i6;
                            modifier4 = modifier6;
                            gapComposer2.endDefaults();
                            int i10 = i7 << 6;
                            m3655ToolbarFJfuzF0(modifier4, Expect_jvmKt.rememberComposableLambda(130844506, new ToolbarKt$$ExternalSyntheticLambda0(navigationIconType, j3, function0, 1, (byte) 0), gapComposer2), composableLambdaImpl, function33, RecyclerView.DECELERATION_RATE, gapComposer2, (57344 & i10) | ((i7 >> 12) & 7168) | ((i7 >> 3) & 14) | 48 | (i10 & 896), 0);
                            modifier3 = modifier4;
                            function32 = function33;
                            gapComposer = gapComposer2;
                            j2 = j3;
                        } else {
                            modifier2 = modifier5;
                        }
                    } else {
                        gapComposer2.skipToGroupEnd();
                        i6 = i4 & (-57345);
                        j3 = j;
                    }
                    i7 = i6;
                    modifier4 = modifier2;
                    function33 = function32;
                    gapComposer2.endDefaults();
                    int i102 = i7 << 6;
                    m3655ToolbarFJfuzF0(modifier4, Expect_jvmKt.rememberComposableLambda(130844506, new ToolbarKt$$ExternalSyntheticLambda0(navigationIconType, j3, function0, 1, (byte) 0), gapComposer2), composableLambdaImpl, function33, RecyclerView.DECELERATION_RATE, gapComposer2, (57344 & i102) | ((i7 >> 12) & 7168) | ((i7 >> 3) & 14) | 48 | (i102 & 896), 0);
                    modifier3 = modifier4;
                    function32 = function33;
                    gapComposer = gapComposer2;
                    j2 = j3;
                } else {
                    gapComposer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    gapComposer = gapComposer2;
                    j2 = j;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ToolbarKt$$ExternalSyntheticLambda2(composableLambdaImpl, modifier3, navigationIconType, j2, function0, function32, i, i2, 1);
                    return;
                }
                return;
            }
            function32 = function3;
            if (gapComposer2.shouldExecute(i4 & 1, (4793491 & i4) != 4793490)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        int i92 = i3 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i4 = i92 | 196608;
        if ((1572864 & i) == 0) {
        }
        i5 = i2 & 128;
        if (i5 == 0) {
        }
        function32 = function3;
        if (gapComposer2.shouldExecute(i4 & 1, (4793491 & i4) != 4793490)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007f  */
    /* renamed from: Toolbar-A_Dysh8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3654ToolbarA_Dysh8(String str, Modifier modifier, NavigationIconType navigationIconType, long j, Function0 function0, Function3 function3, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        long j2;
        Function3 function32;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        int i5;
        Modifier modifier4;
        long j3;
        Function3 function33;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(315819063);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            int i7 = i3 | 3456;
            if ((i & 24576) == 0) {
                i7 |= gapComposer.changed(navigationIconType == null ? -1 : navigationIconType.ordinal()) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if ((196608 & i) == 0) {
                i7 |= 65536;
            }
            int i8 = i7 | 1572864;
            if ((12582912 & i) == 0) {
                i8 |= gapComposer.changedInstance(function0) ? 8388608 : 4194304;
            }
            i4 = i8 | 100663296;
            if (gapComposer.shouldExecute(i4 & 1, (38347923 & i4) == 38347922)) {
                gapComposer.skipToGroupEnd();
                j2 = j;
                function32 = function3;
                modifier3 = modifier2;
            } else {
                gapComposer.startDefaults();
                if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    i5 = i4 & (-458753);
                    modifier4 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    j3 = MooncakeTheme.getColors(gapComposer).label;
                    function33 = lambda$982154686;
                } else {
                    gapComposer.skipToGroupEnd();
                    i5 = i4 & (-458753);
                    j3 = j;
                    function33 = function3;
                    modifier4 = modifier2;
                }
                gapComposer.endDefaults();
                m3655ToolbarFJfuzF0(modifier4, Expect_jvmKt.rememberComposableLambda(2146859560, new ToolbarKt$$ExternalSyntheticLambda0(navigationIconType, j3, function0, 0, (byte) 0), gapComposer), Expect_jvmKt.rememberComposableLambda(-893325719, new PoolCreateViewKt$$ExternalSyntheticLambda5(str, 18), gapComposer), function33, RecyclerView.DECELERATION_RATE, gapComposer, ((i5 >> 3) & 14) | 432 | ((i5 >> 15) & 7168), 16);
                modifier3 = modifier4;
                function32 = function33;
                j2 = j3;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new ToolbarKt$$ExternalSyntheticLambda2(str, modifier3, navigationIconType, j2, function0, function32, i, i2, 0);
                return;
            }
            return;
        }
        modifier2 = modifier;
        int i72 = i3 | 3456;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        int i82 = i72 | 1572864;
        if ((12582912 & i) == 0) {
        }
        i4 = i82 | 100663296;
        if (gapComposer.shouldExecute(i4 & 1, (38347923 & i4) == 38347922)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007c  */
    /* renamed from: Toolbar-FJfuzF0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3655ToolbarFJfuzF0(Modifier modifier, Function2 function2, ComposableLambdaImpl composableLambdaImpl, Function3 function3, float f, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        ComposableLambdaImpl composableLambdaImpl2;
        Function3 function32;
        float f3;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2141302519);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function3) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            f2 = f;
            i3 |= gapComposer.changed(f2) ? 16384 : PKIFailureInfo.certRevoked;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
                composableLambdaImpl2 = composableLambdaImpl;
                function32 = function3;
                gapComposer.skipToGroupEnd();
                f3 = f2;
            } else {
                float f4 = i4 != 0 ? 16.0f : f2;
                Modifier m280requiredHeight3ABfNKs = SizeKt.m280requiredHeight3ABfNKs(SizeKt.fillMaxWidth(SpacerKt.statusBarsPadding(modifier2), 1.0f), 56.0f);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer, 54);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m280requiredHeight3ABfNKs);
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
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
                BiasAlignment.Vertical vertical = Alignment.Companion.Top;
                RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 0);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                int i5 = i3;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                Recorder$$ExternalSyntheticOutline1.m((i5 >> 3) & 14, function2, gapComposer, true);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(rowScopeInstance.weight(1.0f, companion, true), f4, RecyclerView.DECELERATION_RATE, 2);
                RowMeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 0);
                float f5 = f4;
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                composableLambdaImpl2 = composableLambdaImpl;
                Updater.CompositionLocalProvider(new ProvidedValue[]{ComposeMooncakeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(MooncakeTheme.getTypography(gapComposer).mainTitle), re$$ExternalSyntheticOutline0.m(MooncakeTheme.getColors(gapComposer).label, ComposeMooncakeThemeKt.LocalTextColor)}, Expect_jvmKt.rememberComposableLambda(-1614215288, new OverlaysKt$$ExternalSyntheticLambda1(composableLambdaImpl2, 23), gapComposer), gapComposer, 56);
                gapComposer.end(true);
                RowMeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 0);
                int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, companion);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy4, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                function32 = function3;
                function32.invoke(rowScopeInstance, gapComposer, Integer.valueOf(6 | ((i5 >> 6) & 112)));
                gapComposer.end(true);
                gapComposer.end(true);
                f3 = f5;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new MoneyTabUIKt$$ExternalSyntheticLambda37(modifier, function2, composableLambdaImpl2, function32, f3, i, i2);
                return;
            }
            return;
        }
        f2 = f;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: ToolbarActionButton-dOz2H2g, reason: not valid java name */
    public static final void m3656ToolbarActionButtondOz2H2g(Modifier modifier, final int i, final String str, final long j, boolean z, final Function0 function0, Composer composer, final int i2) {
        final Modifier modifier2;
        final boolean z2;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1856484921);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= gapComposer.changed(i) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= gapComposer.changed(j) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        if ((196608 & i2) == 0) {
            i4 |= gapComposer.changed((Object) null) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= gapComposer.changedInstance(function0) ? 1048576 : PKIFailureInfo.signerNotTrusted;
        }
        if (gapComposer.shouldExecute(i4 & 1, (599187 & i4) != 599186)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier clip = ClipKt.clip(SizeKt.m281requiredSize3ABfNKs(companion, 56.0f), RoundedCornerShapeKt.CircleShape);
            boolean z3 = (3670016 & i4) == 1048576;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z3 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ToViewKt$$ExternalSyntheticLambda2(2, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            IconButton((Function0) rememberedValue, clip, null, true, Expect_jvmKt.rememberComposableLambda(-1437765277, new AvatarKt$$ExternalSyntheticLambda7(j, str, i), gapComposer), gapComposer, ((i4 >> 3) & 7168) | 24576, 4);
            modifier2 = companion;
            z2 = true;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            z2 = z;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.mooncake.compose_ui.components.ToolbarKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    KeypadKt.m3656ToolbarActionButtondOz2H2g(Modifier.this, i, str, j, z2, function0, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void ToolbarTitle(int i, Composer composer, Modifier modifier, String str) {
        boolean z;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(724156522);
        int i2 = i | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed((Object) null) ? 256 : 128) | (gapComposer.changed((Object) null) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            if (str == null) {
                gapComposer.startReplaceGroup(-1578990270);
                gapComposer.end(false);
                z = false;
                z2 = true;
            } else {
                gapComposer.startReplaceGroup(-1578990269);
                boolean z3 = (i2 & 7168) == 2048;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z3 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new OffersHomeQueries$$ExternalSyntheticLambda1(17);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                z = false;
                z2 = true;
                m3651TextPdH14aY(1, 0, 5, 2, ((i2 >> 3) & 14) | 196608, 6, 2768, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue), MooncakeTheme.getTypography(gapComposer).mainTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            gapComposer.startReplaceGroup(-1578526138);
            gapComposer.end(z);
            gapComposer.end(z2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda4(modifier, str, i, 11);
        }
    }

    public static final void TooltipBox(ComposableLambdaImpl composableLambdaImpl, TooltipState tooltipState, Modifier modifier, ComposableLambdaImpl composableLambdaImpl2, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1607056378);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(tooltipState) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl2) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (tooltipState._alpha$delegate.getFloatValue() > RecyclerView.DECELERATION_RATE) {
                gapComposer.startReplaceGroup(662559870);
                boolean changedInstance = gapComposer.changedInstance(tooltipState);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new BottomNavigationKt$$ExternalSyntheticLambda7(tooltipState, i3);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                AndroidPopup_androidKt.Popup(PositionProvider.INSTANCE, (Function0) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(-1403229029, new OverlaysKt$$ExternalSyntheticLambda1(composableLambdaImpl, 24), gapComposer), gapComposer, 3078, 4);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(662790510);
                gapComposer.end(false);
            }
            Recorder$$ExternalSyntheticOutline2.m((i2 >> 9) & 14, composableLambdaImpl2, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2(composableLambdaImpl, i, tooltipState, modifier, composableLambdaImpl2, 27);
        }
    }

    public static final int access$calculateYOffset(Placeable placeable, TextLayoutResult textLayoutResult) {
        int i;
        MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
        if (placeable != null) {
            Object parentData = placeable.getParentData();
            CenterLineAlignmentModifier centerLineAlignmentModifier = parentData instanceof CenterLineAlignmentModifier ? (CenterLineAlignmentModifier) parentData : null;
            Line$First line$First = Line$First.INSTANCE;
            Line$First line$First2 = centerLineAlignmentModifier != null ? line$First : null;
            if (line$First2 != null) {
                if (line$First2.equals(line$First)) {
                    i = 1;
                } else if (line$First2.equals(Line$Last.INSTANCE)) {
                    i = multiParagraph.lineCount;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                }
                return MathKt__MathJVMKt.roundToInt((((multiParagraph.getLineBottom(0) - multiParagraph.getLineTop(0)) / 2.0f) + multiParagraph.getLineTop(Math.min(i, multiParagraph.lineCount) - 1)) - (placeable.getMeasuredHeight() / 2));
            }
        }
        return 0;
    }

    /* renamed from: decorateCard-XO-JAsU, reason: not valid java name */
    public static final Modifier m3657decorateCardXOJAsU(Modifier modifier, Shape shape, long j, boolean z) {
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        return ImageKt.m177backgroundbw27NRU(modifier.then(z ? m3658mooncakeShadowWMci_g0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, shape, 23) : ClipKt.clip(companion, shape)), j, ColorKt.RectangleShape).then(companion);
    }

    /* renamed from: mooncakeShadow-WMci_g0$default, reason: not valid java name */
    public static Modifier m3658mooncakeShadowWMci_g0$default(Modifier modifier, float f, float f2, float f3, Shape shape, int i) {
        if ((i & 1) != 0) {
            f = 4.0f;
        }
        if ((i & 2) != 0) {
            f2 = 12.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.06f;
        }
        boolean z = (i & 16) != 0;
        modifier.getClass();
        shape.getClass();
        Modifier drawWithCache = ClipKt.drawWithCache(modifier, new Overlay$$ExternalSyntheticLambda0(new ShadowConfig(shape, f, f2, f3), 14));
        return z ? ClipKt.clip(drawWithCache, shape) : drawWithCache;
    }

    public static final TooltipState rememberTooltipState(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new TooltipState(coroutineScope);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        return (TooltipState) rememberedValue2;
    }

    public static final void TooltipBox(String str, TooltipState tooltipState, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        str.getClass();
        tooltipState.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1822577628);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(tooltipState) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier;
            TooltipBox(Expect_jvmKt.rememberComposableLambda(-1100772039, new FakeOverlayLayerKt$$ExternalSyntheticLambda0(13, tooltipState, str), gapComposer), tooltipState, modifier3, composableLambdaImpl, gapComposer, (i3 & 7168) | (i3 & 112) | 6 | (i3 & 896));
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(str, tooltipState, modifier2, composableLambdaImpl, i, i2, 18);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* renamed from: Text-PdH14aY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3651TextPdH14aY(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, Composer composer, Modifier modifier, TextStyle textStyle, TextLineBalancing textLineBalancing, String str, Map map, Function1 function1, boolean z) {
        int i8;
        Modifier modifier2;
        TextStyle textStyle2;
        int i9;
        long j2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        GapComposer gapComposer;
        int i19;
        int i20;
        int i21;
        Map map2;
        Function1 function12;
        boolean z2;
        int i22;
        Modifier modifier3;
        TextLineBalancing textLineBalancing2;
        TextStyle textStyle3;
        long j3;
        RecomposeScopeImpl endRestartGroup;
        TextStyle textStyle4;
        Function1 function13;
        int i23;
        Map map3;
        Modifier modifier4;
        TextLineBalancing textLineBalancing3;
        TextStyle textStyle5;
        long j4;
        Function1 function14;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z3;
        int i28;
        int i29;
        int i30;
        int i31;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1664314468);
        if ((i5 & 6) == 0) {
            i8 = (gapComposer2.changed(str) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        int i32 = i7 & 2;
        if (i32 != 0) {
            i8 |= 48;
        } else if ((i5 & 48) == 0) {
            modifier2 = modifier;
            i8 |= gapComposer2.changed(modifier2) ? 32 : 16;
            if ((i5 & MLKEMEngine.KyberPolyBytes) != 0) {
                if ((i7 & 4) == 0) {
                    textStyle2 = textStyle;
                    if (gapComposer2.changed(textStyle2)) {
                        i31 = 256;
                        i8 |= i31;
                    }
                } else {
                    textStyle2 = textStyle;
                }
                i31 = 128;
                i8 |= i31;
            } else {
                textStyle2 = textStyle;
            }
            i9 = i7 & 8;
            if (i9 == 0) {
                i8 |= 3072;
            } else if ((i5 & 3072) == 0) {
                j2 = j;
                i8 |= gapComposer2.changed(j2) ? 2048 : 1024;
                i10 = i7 & 16;
                if (i10 != 0) {
                    i8 |= 24576;
                } else if ((i5 & 24576) == 0) {
                    i8 |= gapComposer2.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
                    i11 = i7 & 32;
                    if (i11 == 0) {
                        i8 |= 196608;
                    } else if ((i5 & 196608) == 0) {
                        i8 |= gapComposer2.changed(i) ? PKIFailureInfo.unsupportedVersion : 65536;
                    }
                    int i33 = i8 | 14155776;
                    if ((i5 & 100663296) != 0) {
                        if ((i7 & 256) == 0) {
                            i12 = i3;
                            if (gapComposer2.changed(i12)) {
                                i30 = 67108864;
                                i33 |= i30;
                            }
                        } else {
                            i12 = i3;
                        }
                        i30 = 33554432;
                        i33 |= i30;
                    } else {
                        i12 = i3;
                    }
                    i13 = i7 & 512;
                    if (i13 == 0) {
                        i15 = i33 | 805306368;
                    } else {
                        if ((i5 & 805306368) == 0) {
                            i14 = i33 | (gapComposer2.changed(textLineBalancing) ? PKIFailureInfo.duplicateCertReq : 268435456);
                        } else {
                            i14 = i33;
                        }
                        i15 = i14;
                    }
                    if ((i6 & 6) != 0) {
                        if ((i7 & 1024) == 0 && gapComposer2.changed(i4)) {
                            i29 = 4;
                            i16 = i6 | i29;
                        }
                        i29 = 2;
                        i16 = i6 | i29;
                    } else {
                        i16 = i6;
                    }
                    i17 = i7 & 2048;
                    if (i17 == 0) {
                        i16 |= 48;
                    } else if ((i6 & 48) == 0) {
                        i18 = i17;
                        i16 |= gapComposer2.changedInstance(map) ? 32 : 16;
                        int i34 = 0;
                        if (gapComposer2.shouldExecute(i15 & 1, (i15 & 306783379) == 306783378 || (i16 & 19) != 18)) {
                            gapComposer2.startDefaults();
                            if ((i5 & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                                gapComposer2.skipToGroupEnd();
                                if ((i7 & 4) != 0) {
                                    i15 &= -897;
                                }
                                if ((i7 & 256) != 0) {
                                    i15 &= -234881025;
                                }
                                if ((i7 & 1024) != 0) {
                                    i16 &= -15;
                                }
                                i24 = i;
                                i27 = i2;
                                i28 = i4;
                                textLineBalancing3 = textLineBalancing;
                                map3 = map;
                                function14 = function1;
                                z3 = z;
                                modifier4 = modifier2;
                                textStyle5 = textStyle2;
                                j4 = j2;
                                i25 = i16;
                                i26 = i12;
                            } else {
                                Modifier modifier5 = i32 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                                if ((i7 & 4) != 0) {
                                    textStyle4 = MooncakeTheme.getCurrentTextStyle(gapComposer2, 6);
                                    i15 &= -897;
                                } else {
                                    textStyle4 = textStyle2;
                                }
                                long j5 = i9 != 0 ? Color.Unspecified : j2;
                                if (i10 != 0) {
                                    Object rememberedValue = gapComposer2.rememberedValue();
                                    if (rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = new OffersHomeQueries$$ExternalSyntheticLambda1(11);
                                        gapComposer2.updateRememberedValue(rememberedValue);
                                    }
                                    function13 = (Function1) rememberedValue;
                                } else {
                                    function13 = function1;
                                }
                                int i35 = i11 != 0 ? Integer.MAX_VALUE : i;
                                if ((i7 & 256) != 0) {
                                    i15 &= -234881025;
                                } else {
                                    i34 = i12;
                                }
                                TextLineBalancing textLineBalancing4 = i13 != 0 ? null : textLineBalancing;
                                if ((i7 & 1024) != 0) {
                                    i23 = textLineBalancing4 != null ? 3 : 2;
                                    i16 &= -15;
                                } else {
                                    i23 = i4;
                                }
                                if (i18 != 0) {
                                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                                    emptyMap.getClass();
                                    modifier4 = modifier5;
                                    textLineBalancing3 = textLineBalancing4;
                                    textStyle5 = textStyle4;
                                    map3 = emptyMap;
                                } else {
                                    map3 = map;
                                    modifier4 = modifier5;
                                    textLineBalancing3 = textLineBalancing4;
                                    textStyle5 = textStyle4;
                                }
                                j4 = j5;
                                function14 = function13;
                                i24 = i35;
                                i25 = i16;
                                i26 = i34;
                                i27 = 1;
                                z3 = true;
                                i28 = i23;
                            }
                            gapComposer2.endDefaults();
                            gapComposer = gapComposer2;
                            m3650TextPdH14aY(i24, i27, i26, i28, i15 & 2147483632, i25 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0, j4, gapComposer, modifier4, new AnnotatedString(str), textStyle5, textLineBalancing3, map3, function14, z3);
                            i19 = i24;
                            i20 = i27;
                            i22 = i26;
                            i21 = i28;
                            j3 = j4;
                            modifier3 = modifier4;
                            textStyle3 = textStyle5;
                            textLineBalancing2 = textLineBalancing3;
                            map2 = map3;
                            function12 = function14;
                            z2 = z3;
                        } else {
                            gapComposer = gapComposer2;
                            gapComposer.skipToGroupEnd();
                            i19 = i;
                            i20 = i2;
                            i21 = i4;
                            map2 = map;
                            function12 = function1;
                            z2 = z;
                            i22 = i12;
                            modifier3 = modifier2;
                            long j6 = j2;
                            textLineBalancing2 = textLineBalancing;
                            textStyle3 = textStyle2;
                            j3 = j6;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new MooncakeTextKt$$ExternalSyntheticLambda1(i19, i20, i22, i21, i5, i6, i7, 0, j3, modifier3, textStyle3, textLineBalancing2, str, map2, function12, z2);
                            return;
                        }
                        return;
                    }
                    i18 = i17;
                    int i342 = 0;
                    if (gapComposer2.shouldExecute(i15 & 1, (i15 & 306783379) == 306783378 || (i16 & 19) != 18)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i11 = i7 & 32;
                if (i11 == 0) {
                }
                int i332 = i8 | 14155776;
                if ((i5 & 100663296) != 0) {
                }
                i13 = i7 & 512;
                if (i13 == 0) {
                }
                if ((i6 & 6) != 0) {
                }
                i17 = i7 & 2048;
                if (i17 == 0) {
                }
                i18 = i17;
                int i3422 = 0;
                if (gapComposer2.shouldExecute(i15 & 1, (i15 & 306783379) == 306783378 || (i16 & 19) != 18)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            j2 = j;
            i10 = i7 & 16;
            if (i10 != 0) {
            }
            i11 = i7 & 32;
            if (i11 == 0) {
            }
            int i3322 = i8 | 14155776;
            if ((i5 & 100663296) != 0) {
            }
            i13 = i7 & 512;
            if (i13 == 0) {
            }
            if ((i6 & 6) != 0) {
            }
            i17 = i7 & 2048;
            if (i17 == 0) {
            }
            i18 = i17;
            int i34222 = 0;
            if (gapComposer2.shouldExecute(i15 & 1, (i15 & 306783379) == 306783378 || (i16 & 19) != 18)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i5 & MLKEMEngine.KyberPolyBytes) != 0) {
        }
        i9 = i7 & 8;
        if (i9 == 0) {
        }
        j2 = j;
        i10 = i7 & 16;
        if (i10 != 0) {
        }
        i11 = i7 & 32;
        if (i11 == 0) {
        }
        int i33222 = i8 | 14155776;
        if ((i5 & 100663296) != 0) {
        }
        i13 = i7 & 512;
        if (i13 == 0) {
        }
        if ((i6 & 6) != 0) {
        }
        i17 = i7 & 2048;
        if (i17 == 0) {
        }
        i18 = i17;
        int i342222 = 0;
        if (gapComposer2.shouldExecute(i15 & 1, (i15 & 306783379) == 306783378 || (i16 & 19) != 18)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
