package com.squareup.cash.activity.views.receipts;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.cart.CartBannerViewKt$$ExternalSyntheticLambda2;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import app.cash.local.views.sheet.MenuPickerSheetKt$$ExternalSyntheticLambda4;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.xg$$ExternalSyntheticLambda9;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.LocalImageLoaderKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zzd;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.squareup.cash.activity.viewmodels.ReceiptViewModel;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda9;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.SectionHeaderScope$$ExternalSyntheticLambda1;
import com.squareup.cash.amountchooser.views.AtmPickerGridKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.CopyCodeKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.list.ListUnorderedItem;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.ButtonBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.common.composeui.ArcadeBannerCardKt$$ExternalSyntheticLambda4;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.marketing.components.CardUpsellIllustration;
import com.squareup.cash.marketing.components.CardUpsellKt;
import com.squareup.cash.marketing.components.IllustrationsKt;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Illustration;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.AttributeRange;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.franklin.ui.ReceiptSection;
import com.squareup.util.Strings;
import com.squareup.workflow1.Worker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import okhttp3.internal.Tags;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import radiography.internal.ComposeLayoutInfoKt;

/* loaded from: classes5.dex */
public abstract class ReceiptUiKt {

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;

        static {
            int[] iArr = new int[Icons.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzd zzdVar = Icons.Companion;
                iArr[103] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[PaymentHistoryData.AmountTreatment.values().length];
            try {
                iArr2[PaymentHistoryData.AmountTreatment.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PaymentHistoryData.AmountTreatment.FADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PaymentHistoryData.AmountTreatment.STRIKETHROUGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PaymentHistoryData.AmountTreatment.SUCCEEDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ReceiptSection.DetailRow.DetailTreatment.values().length];
            try {
                iArr3[ReceiptSection.DetailRow.DetailTreatment.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ReceiptSection.DetailRow.DetailTreatment.DANGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ReceiptSection.DetailRow.DetailTreatment.STANDARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ReceiptSection.ActionRow.AccessoryLabelTreatment.values().length];
            try {
                iArr4[ReceiptSection.ActionRow.AccessoryLabelTreatment.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[ReceiptSection.ItemsGroup.ItemTreatment.values().length];
            try {
                iArr5[ReceiptSection.ItemsGroup.ItemTreatment.SUBTLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[ReceiptSection.ItemsGroup.ItemTreatment.BOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[ReceiptSection.ItemsGroup.ItemTreatment.STRIKETHROUGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[ReceiptSection.ProgressRow.ProgressTreatment.values().length];
            try {
                iArr6[ReceiptSection.ProgressRow.ProgressTreatment.ATTENTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr6[ReceiptSection.ProgressRow.ProgressTreatment.LENDING_NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr6[ReceiptSection.ProgressRow.ProgressTreatment.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[PaymentHistoryData.UiStatusTreatment.values().length];
            try {
                iArr7[PaymentHistoryData.UiStatusTreatment.GREY.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr7[PaymentHistoryData.UiStatusTreatment.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$6 = iArr7;
        }
    }

    static {
        new ReceiptSection.ItemsGroup(CollectionsKt__CollectionsKt.listOf((Object[]) new ReceiptSection.ItemsGroup.Item[]{new ReceiptSection.ItemsGroup.Item("Stock name", "Shrek", ReceiptSection.ItemsGroup.ItemTreatment.BOLD, null, 8, null), new ReceiptSection.ItemsGroup.Item("Stock symbol", "SHRK", ReceiptSection.ItemsGroup.ItemTreatment.NORMAL, null, 8, null), new ReceiptSection.ItemsGroup.Item("Subtle", "$10.00", ReceiptSection.ItemsGroup.ItemTreatment.SUBTLE, null, 8, null), new ReceiptSection.ItemsGroup.Item("Fees", "$0.00", ReceiptSection.ItemsGroup.ItemTreatment.STRIKETHROUGH, null, 8, null)}), null, 2, null);
        ByteString byteString = null;
        new ReceiptSection.ProgressRow(new ReceiptSection.ProgressRow.TextStack("Paid", "$7.50", null, null, null, 28, null), new ReceiptSection.ProgressRow.TextStack("Left to pay", "$2.50", null, null, null, 28, null), Float.valueOf(0.75f), ReceiptSection.ProgressRow.ProgressTreatment.NORMAL, byteString, 16, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActionRow(ReceiptSection.ActionRow actionRow, Function1 function1, Composer composer, int i) {
        Icons icons;
        Icons icons2;
        ComposableLambdaImpl rememberComposableLambda;
        CellDefaultAccessory cellDefaultAccessory;
        CellDefaultAccessory label;
        boolean changedInstance;
        Object rememberedValue;
        String str;
        String str2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1237529805);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(actionRow) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        boolean z = true;
        boolean z2 = false;
        int i4 = 10;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Icon icon = actionRow.icon;
            ComposableLambdaImpl composableLambdaImpl = null;
            if (icon == null || (str2 = icon.arcade_id) == null) {
                icons = null;
            } else {
                Icons.Companion.getClass();
                icons = zzd.get(str2);
            }
            Icon icon2 = actionRow.accessory_icon;
            if (icon2 == null || (str = icon2.arcade_id) == null) {
                icons2 = null;
            } else {
                Icons.Companion.getClass();
                icons2 = zzd.get(str);
            }
            String str3 = actionRow.accessory_label;
            if (icons == null) {
                gapComposer.startReplaceGroup(749162760);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(749162761);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(695501975, new InfoSectionKt$$ExternalSyntheticLambda6(icons, i2), gapComposer);
                gapComposer.end(false);
            }
            String str4 = actionRow.secondary_label;
            if (str4 == null) {
                gapComposer.startReplaceGroup(749290170);
            } else {
                gapComposer.startReplaceGroup(749290171);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-1084324042, new ToastKt$$ExternalSyntheticLambda1(str4, i4), gapComposer);
            }
            gapComposer.end(false);
            if (icons2 != null) {
                gapComposer.startReplaceGroup(749480821);
                cellDefaultAccessory = new CellDefaultAccessory.Label(new CellDefaultAccessory.AccessoryConfig(new Role(0), z2, z, 6), Expect_jvmKt.rememberComposableLambda(-2130979846, new InfoSectionKt$$ExternalSyntheticLambda6(icons2, 3), gapComposer));
                gapComposer.end(false);
            } else if (str3 != null) {
                gapComposer.startReplaceGroup(749736943);
                ReceiptSection.ActionRow.AccessoryLabelTreatment accessoryLabelTreatment = actionRow.accessory_label_treatment;
                int i5 = accessoryLabelTreatment == null ? -1 : WhenMappings.$EnumSwitchMapping$3[accessoryLabelTreatment.ordinal()];
                if (i5 != -1 && i5 != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 439830814, false);
                }
                gapComposer.startReplaceGroup(439836475);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors.semantic.text.standard;
                gapComposer.end(false);
                label = new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(1235575050, new ArcadeBannerCardKt$$ExternalSyntheticLambda4(str3, j, i2), gapComposer), 2);
                gapComposer.end(false);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1779240028, new CartBannerViewKt$$ExternalSyntheticLambda2(actionRow, 27), gapComposer);
                changedInstance = gapComposer.changedInstance(actionRow) | ((i3 & 112) != 32);
                rememberedValue = gapComposer.rememberedValue();
                if (!changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda5(12, actionRow, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, false, false, composableLambdaImpl, null, label, 0L, gapComposer, 48, 3444);
            } else {
                gapComposer.startReplaceGroup(750144004);
                gapComposer.end(false);
                cellDefaultAccessory = CellDefaultAccessory.Push.INSTANCE;
            }
            label = cellDefaultAccessory;
            ComposableLambdaImpl rememberComposableLambda22 = Expect_jvmKt.rememberComposableLambda(-1779240028, new CartBannerViewKt$$ExternalSyntheticLambda2(actionRow, 27), gapComposer);
            changedInstance = gapComposer.changedInstance(actionRow) | ((i3 & 112) != 32);
            rememberedValue = gapComposer.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda5(12, actionRow, function1);
            gapComposer.updateRememberedValue(rememberedValue);
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda22, null, (Function0) rememberedValue, false, false, composableLambdaImpl, null, label, 0L, gapComposer, 48, 3444);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SectionHeaderScope$$ExternalSyntheticLambda1(actionRow, function1, i, 10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if ((r40 & 4) != 0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AmountText(String str, PaymentHistoryData.AmountTreatment amountTreatment, TextStyle textStyle, Composer composer, int i, int i2) {
        TextStyle textStyle2;
        int i3;
        int i4;
        TextStyle textStyle3;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1051763808);
        int i5 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(amountTreatment.ordinal()) ? 32 : 16);
        if ((i2 & 4) == 0) {
            textStyle2 = textStyle;
            if (gapComposer.changed(textStyle2)) {
                i3 = 256;
                i4 = i5 | i3;
                if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) == 146)) {
                    gapComposer.skipToGroupEnd();
                    textStyle3 = textStyle2;
                } else {
                    gapComposer.startDefaults();
                    if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                        if ((i2 & 4) != 0) {
                            textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).numeralLarge;
                            i4 &= -897;
                        }
                        TextStyle textStyle4 = textStyle2;
                        gapComposer.endDefaults();
                        int i6 = WhenMappings.$EnumSwitchMapping$1[amountTreatment.ordinal()];
                        if (i6 == 1) {
                            gapComposer.startReplaceGroup(1309394299);
                            Room.m1165Text25TpFw(0, 0, 0, 0, i4 & 910, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, textStyle4, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            gapComposer.end(false);
                        } else if (i6 == 2) {
                            gapComposer.startReplaceGroup(1309483114);
                            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            textStyle4 = textStyle4;
                            Room.m1165Text25TpFw(0, 0, 0, 0, i4 & 910, 0, 4082, colors.semantic.text.subtle, (Composer) gapComposer, (Modifier) null, textStyle4, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            gapComposer.end(false);
                        } else if (i6 == 3) {
                            gapComposer.startReplaceGroup(1309626985);
                            Room.m1165Text25TpFw(0, 0, 0, 0, i4 & 14, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(textStyle4, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.LineThrough, null, null, 0, 0L, null, null, 0, 16773119), (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            gapComposer.end(false);
                            textStyle4 = textStyle4;
                        } else {
                            if (i6 != 4) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1427710106, false);
                            }
                            gapComposer.startReplaceGroup(1309767849);
                            Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors2 == null) {
                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            Room.m1165Text25TpFw(0, 0, 0, 0, i4 & 910, 0, 4082, colors2.semantic.text.success, (Composer) gapComposer, (Modifier) null, textStyle4, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            gapComposer.end(false);
                        }
                        textStyle3 = textStyle4;
                    } else {
                        gapComposer.skipToGroupEnd();
                    }
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(str, amountTreatment, textStyle3, i, i2);
                    return;
                }
                return;
            }
        } else {
            textStyle2 = textStyle;
        }
        i3 = 128;
        i4 = i5 | i3;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) == 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DetailRow(final ReceiptSection.DetailRow detailRow, Composer composer, int i) {
        final long j;
        Icons icons;
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1973770858);
        int i2 = 2;
        int i3 = i | (gapComposer.changedInstance(detailRow) ? 4 : 2);
        final int i4 = 1;
        final byte b = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            ReceiptSection.DetailRow.DetailTreatment detailTreatment = detailRow.detail_treatment;
            int i5 = detailTreatment == null ? -1 : WhenMappings.$EnumSwitchMapping$2[detailTreatment.ordinal()];
            if (i5 != -1) {
                if (i5 == 1) {
                    gapComposer.startReplaceGroup(1581756765);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors.semantic.text.warning;
                    gapComposer.end(false);
                } else if (i5 == 2) {
                    gapComposer.startReplaceGroup(1581759900);
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors2.semantic.text.danger;
                    gapComposer.end(false);
                } else if (i5 != 3) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1581753044, false);
                }
                if (detailRow.copyable_body != null) {
                    gapComposer.startReplaceGroup(1790089812);
                    CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(1774347565, new ReceiptUiKt$$ExternalSyntheticLambda28(detailRow, b, b), gapComposer), Expect_jvmKt.rememberComposableLambda(-35556020, new ReceiptUiKt$$ExternalSyntheticLambda28(detailRow, i4, b), gapComposer), null, null, false, false, Expect_jvmKt.rememberComposableLambda(1989924358, new Function2() { // from class: com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda30
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = b;
                            ReceiptSection.DetailRow detailRow2 = detailRow;
                            switch (i6) {
                                case 0:
                                    Composer composer2 = (Composer) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                        String str2 = detailRow2.subtitle;
                                        if (str2 == null) {
                                            gapComposer2.startReplaceGroup(-1597014600);
                                        } else {
                                            gapComposer2.startReplaceGroup(-1597014599);
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, j, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj;
                                    int intValue2 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                        String str3 = detailRow2.subtitle;
                                        if (str3 == null) {
                                            gapComposer3.startReplaceGroup(1070510236);
                                        } else {
                                            gapComposer3.startReplaceGroup(1070510237);
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, j, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), null, null, 0L, gapComposer, 12582966, 3964);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1790405454);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1193669821, new ReceiptUiKt$$ExternalSyntheticLambda28(detailRow, i2, b), gapComposer);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(787492258, new Function2() { // from class: com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda30
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = i4;
                            ReceiptSection.DetailRow detailRow2 = detailRow;
                            switch (i6) {
                                case 0:
                                    Composer composer2 = (Composer) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                        String str2 = detailRow2.subtitle;
                                        if (str2 == null) {
                                            gapComposer2.startReplaceGroup(-1597014600);
                                        } else {
                                            gapComposer2.startReplaceGroup(-1597014599);
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, j, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj;
                                    int intValue2 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                        String str3 = detailRow2.subtitle;
                                        if (str3 == null) {
                                            gapComposer3.startReplaceGroup(1070510236);
                                        } else {
                                            gapComposer3.startReplaceGroup(1070510237);
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, j, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer);
                    Icon icon = detailRow.icon;
                    if (icon == null || (str = icon.arcade_id) == null) {
                        icons = null;
                    } else {
                        Icons.Companion.getClass();
                        icons = zzd.get(str);
                    }
                    Icons icons2 = icons;
                    boolean changedInstance = gapComposer.changedInstance(detailRow);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new xg$$ExternalSyntheticLambda9(detailRow, 28);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    CopyCodeKt.CopyCode(rememberComposableLambda, rememberComposableLambda2, null, null, icons2, null, (Function1) rememberedValue, gapComposer, 438, 104);
                    gapComposer.end(false);
                }
            }
            gapComposer.startReplaceGroup(1581763454);
            Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors3 == null) {
                colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            j = colors3.semantic.text.standard;
            gapComposer.end(false);
            if (detailRow.copyable_body != null) {
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ReceiptUiKt$$ExternalSyntheticLambda28(detailRow, i);
        }
    }

    public static final void ImageRow(final ReceiptSection.ImageRow imageRow, final Function1 function1, Composer composer, final int i) {
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        float f;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1350245835);
        int i2 = (gapComposer.changedInstance(imageRow) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        final int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Image image = imageRow.image;
            if (image == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2(imageRow, function1, i, r7) { // from class: com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda50
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ ReceiptSection.ImageRow f$0;
                        public final /* synthetic */ Function1 f$1;

                        {
                            this.$r8$classId = r4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.$r8$classId;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    ReceiptUiKt.ImageRow(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    ReceiptUiKt.ImageRow(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            AsyncImagePainter m1446rememberAsyncImagePainter19ie5dc = AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(3072, 22, gapComposer, ThemablesKt.urlForTheme(image, gapComposer));
            Float f2 = imageRow.corner_radius;
            Dp dp = f2 != null ? new Dp(f2.floatValue()) : null;
            if (dp == null) {
                gapComposer.startReplaceGroup(506133904);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Object obj = DefaultSizes.border.entries;
                gapComposer.end(false);
                f = 24.0f;
            } else {
                gapComposer.startReplaceGroup(506131982);
                gapComposer.end(false);
                f = dp.value;
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            Float f3 = imageRow.aspect_ratio;
            Modifier aspectRatio = OffsetKt.aspectRatio(f3 != null ? f3.floatValue() : 2.0f, fillMaxWidth, false);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier clip = ClipKt.clip(SpacerKt.m302paddingqDBjuR0$default(aspectRatio, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 32.0f, 2), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f));
            Role role = new Role(0);
            int i4 = (gapComposer.changedInstance(imageRow) ? 1 : 0) | ((i2 & 112) == 32 ? 1 : 0);
            Object rememberedValue = gapComposer.rememberedValue();
            if (i4 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda5(13, imageRow, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ImageKt.Image(m1446rememberAsyncImagePainter19ie5dc, imageRow.accessibility_text, ImageKt.m183clickableoSLSa3U$default(clip, false, null, role, (Function0) rememberedValue, 11), null, ContentScale.Companion.Crop, RecyclerView.DECELERATION_RATE, null, gapComposer, 24576, 104);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2(imageRow, function1, i, i3) { // from class: com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda50
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ ReceiptSection.ImageRow f$0;
                public final /* synthetic */ Function1 f$1;

                {
                    this.$r8$classId = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj22) {
                    int i42 = this.$r8$classId;
                    Composer composer2 = (Composer) obj2;
                    ((Integer) obj22).getClass();
                    switch (i42) {
                        case 0:
                            ReceiptUiKt.ImageRow(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            ReceiptUiKt.ImageRow(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final void ItemsGroupRow(ReceiptSection.ItemsGroup itemsGroup, Composer composer, int i) {
        AnnotatedString annotatedString;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(894555128);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(itemsGroup) ? 4 : 2) | i;
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            gapComposer.startReplaceGroup(674022770);
            List<ReceiptSection.ItemsGroup.Item> list = itemsGroup.items;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i5 = 0;
            while (i5 < size) {
                ReceiptSection.ItemsGroup.Item item = list.get(i5);
                gapComposer.startReplaceGroup(674024260);
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                ReceiptSection.ItemsGroup.ItemTreatment itemTreatment = item.treatment;
                if ((itemTreatment == null ? -1 : WhenMappings.$EnumSwitchMapping$4[itemTreatment.ordinal()]) == 1) {
                    gapComposer.startReplaceGroup(-1330693150);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    builder.pushStyle(new SpanStyle(colors.semantic.text.subtle, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER));
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1698276483);
                    gapComposer.end(false);
                }
                String str = item.label;
                if (str == null) {
                    str = "";
                }
                builder.append(str);
                AnnotatedString annotatedString2 = builder.toAnnotatedString();
                gapComposer.end(false);
                if (item.value == null) {
                    gapComposer.startReplaceGroup(-929486225);
                    gapComposer.end(false);
                    annotatedString = null;
                } else {
                    gapComposer.startReplaceGroup(-929486224);
                    gapComposer.startReplaceGroup(662753840);
                    AnnotatedString.Builder builder2 = new AnnotatedString.Builder();
                    ReceiptSection.ItemsGroup.ItemTreatment itemTreatment2 = item.treatment;
                    int i6 = itemTreatment2 != null ? WhenMappings.$EnumSwitchMapping$4[itemTreatment2.ordinal()] : -1;
                    if (i6 == 1) {
                        gapComposer.startReplaceGroup(-1075872549);
                        Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        builder2.pushStyle(new SpanStyle(colors2.semantic.text.subtle, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER));
                        gapComposer.end(false);
                    } else if (i6 == i2) {
                        gapComposer.startReplaceGroup(-1075876536);
                        gapComposer.end(false);
                        builder2.pushStyle(new SpanStyle(0L, 0L, FontWeight.Bold, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65531));
                    } else if (i6 != 3) {
                        gapComposer.startReplaceGroup(1008092010);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1075867587);
                        Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        builder2.pushStyle(new SpanStyle(colors3.semantic.text.subtle, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.LineThrough, (Shadow) null, 61438));
                        gapComposer.end(false);
                    }
                    builder2.append((CharSequence) item.value);
                    annotatedString = builder2.toAnnotatedString();
                    gapComposer.end(false);
                    gapComposer.end(false);
                }
                arrayList.add(new ListUnorderedItem(annotatedString2, (Icons) null, annotatedString, (AnnotatedString) null));
                i5++;
                i2 = 2;
            }
            gapComposer.end(false);
            ImmutableList immutableList = Tags.toImmutableList(arrayList);
            Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors4 == null) {
                colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors4.semantic.background.f1047app, ColorKt.RectangleShape);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            ListUnorderedKt.ListUnordered(immutableList, SpacerKt.m302paddingqDBjuR0$default(m177backgroundbw27NRU, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), (ListUnorderedState) null, (ListUnorderedProminence) null, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, gapComposer, 0, 60);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonBinding$$ExternalSyntheticLambda2(itemsGroup, i, i4);
        }
    }

    public static final void Loading(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1455791912);
        int i2 = 0;
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, navigationBarsPadding);
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
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ReceiptUiKt$$ExternalSyntheticLambda4(i, i2);
        }
    }

    public static final void LoadingError(ReceiptViewModel.LoadingError loadingError, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-778660053);
        int i2 = (gapComposer.changedInstance(loadingError) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            int i3 = 14;
            ScreenScaffoldKt.ScreenScaffoldColumn(SpacerKt.navigationBarsPadding(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape)), null, null, Expect_jvmKt.rememberComposableLambda(-554637229, new BrandSheetViewKt$$ExternalSyntheticLambda6(i3, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(-1966070078, new SwipeToDismissKt$$ExternalSyntheticLambda4(i3, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(-1503019991, new BalanceFeedKt$$ExternalSyntheticLambda9(loadingError, 10), gapComposer), gapComposer, 224256, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SectionHeaderScope$$ExternalSyntheticLambda1(loadingError, function1, i, 11);
        }
    }

    public static final void LocationRow(ReceiptSection.LocationRow locationRow, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1508932657);
        int i2 = (gapComposer.changedInstance(locationRow) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-2024638500, new CartBannerViewKt$$ExternalSyntheticLambda2(locationRow, 26), gapComposer);
            boolean changedInstance = gapComposer.changedInstance(locationRow) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda5(11, locationRow, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(ComposableSingletons$ReceiptUiKt.lambda$1488919427, ComposableSingletons$ReceiptUiKt.f129lambda$1467284446, null, null, false, false, rememberComposableLambda, null, new CellDefaultAccessory.ButtonCompact((Function0) rememberedValue, null, false, ComposableSingletons$ReceiptUiKt.lambda$1308974420, 14), 0L, gapComposer, 12582966, 3452);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AtmPickerGridKt$$ExternalSyntheticLambda4(locationRow, function1, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0236  */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProgressRow(ReceiptSection.ProgressRow progressRow, Composer composer, int i) {
        long j;
        ?? r4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1517991054);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(progressRow) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ReceiptSection.ProgressRow.ProgressTreatment progressTreatment = progressRow.progress_treatment;
            int i3 = progressTreatment == null ? -1 : WhenMappings.$EnumSwitchMapping$5[progressTreatment.ordinal()];
            if (i3 != -1) {
                if (i3 == 1) {
                    gapComposer.startReplaceGroup(-1499454507);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors.semantic.text.warning;
                    gapComposer.end(false);
                } else if (i3 == 2) {
                    gapComposer.startReplaceGroup(-1499450669);
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors2.semantic.accent.ocean;
                    gapComposer.end(false);
                } else if (i3 != 3) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1499458766, false);
                }
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                long j2 = Strings.getColors(gapComposer).semantic.background.f1047app;
                RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, j2, rectangleShapeKt$RectangleShape$1);
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                Strings.getSizes(gapComposer).getClass();
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(m177backgroundbw27NRU, 16.0f, 8.0f);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (applier != null) {
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
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Top, gapComposer, 6);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth2);
                gapComposer.startReusableNode();
                long j3 = j;
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                ReceiptSection.ProgressRow.TextStack textStack = progressRow.leading_text_stack;
                if (textStack == null) {
                    gapComposer.startReplaceGroup(-752462409);
                    r4 = 0;
                } else {
                    r4 = 0;
                    gapComposer.startReplaceGroup(-752462408);
                    ProgressRow$LabelStack(textStack, gapComposer);
                }
                gapComposer.end(r4);
                Strings.getSizes(gapComposer).getClass();
                SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 8.0f));
                ReceiptSection.ProgressRow.TextStack textStack2 = progressRow.trailing_text_stack;
                if (textStack2 == null) {
                    gapComposer.startReplaceGroup(-752328489);
                } else {
                    gapComposer.startReplaceGroup(-752328488);
                    ProgressRow$LabelStack(textStack2, gapComposer);
                }
                gapComposer.end(r4);
                gapComposer.end(true);
                DBUtil.SpacerWithinSectionMedium(r4, 1, gapComposer, null);
                Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 12.0f);
                RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
                Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(ClipKt.clip(m277height3ABfNKs, roundedCornerShape), Strings.getColors(gapComposer).semantic.background.subtle, rectangleShapeKt$RectangleShape$1);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU2);
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
                Modifier fillMaxHeight = SizeKt.fillMaxHeight(companion, 1.0f);
                Float f = progressRow.progress_percentage;
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.fillMaxWidth(fillMaxHeight, f != null ? f.floatValue() : RecyclerView.DECELERATION_RATE), roundedCornerShape), j3, rectangleShapeKt$RectangleShape$1), gapComposer, 0);
                gapComposer.end(true);
                gapComposer.end(true);
            }
            gapComposer.startReplaceGroup(-1499447085);
            Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors3 == null) {
                colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            j = colors3.semantic.text.brand;
            gapComposer.end(false);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion2, 1.0f);
            long j22 = Strings.getColors(gapComposer).semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$12 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU3 = ImageKt.m177backgroundbw27NRU(fillMaxWidth3, j22, rectangleShapeKt$RectangleShape$12);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier m299paddingVpY3zN42 = SpacerKt.m299paddingVpY3zN4(m177backgroundbw27NRU3, 16.0f, 8.0f);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN42);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier != null) {
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CartBannerViewKt$$ExternalSyntheticLambda2(progressRow, i, 28);
        }
    }

    public static final void ProgressRow$LabelStack(ReceiptSection.ProgressRow.TextStack textStack, Composer composer) {
        GapComposer gapComposer;
        boolean z;
        ReceiptSection.ProgressRow.TextStack textStack2;
        GapComposer gapComposer2;
        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer, 0);
        GapComposer gapComposer3 = (GapComposer) composer;
        int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
        Modifier materializeModifier = PlatformKt.materializeModifier(composer, Modifier.Companion.$$INSTANCE);
        ComposeUiNode.Companion.getClass();
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
        GapComposer gapComposer4 = (GapComposer) composer;
        if (gapComposer4.applier == null) {
            Updater.invalidApplier();
            throw null;
        }
        gapComposer4.startReusableNode();
        if (gapComposer4.inserting) {
            gapComposer4.createNode(layoutNode$Companion$Constructor$1);
        } else {
            gapComposer4.useNode();
        }
        Updater.m576setimpl(composer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
        Updater.m576setimpl(composer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
        Updater.m576setimpl(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
        Updater.m575reconcileimpl(composer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
        Updater.m576setimpl(composer, materializeModifier, ComposeUiNode.Companion.SetModifier);
        String str = textStack.label;
        if (str == null) {
            gapComposer4.startReplaceGroup(1870441924);
            gapComposer4.end(false);
            textStack2 = textStack;
            z = false;
            gapComposer = gapComposer4;
        } else {
            gapComposer4.startReplaceGroup(1870441925);
            TextStyle textStyle = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
            Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
            } else {
                gapComposer4.startReplaceGroup(-1762997739);
                gapComposer4.end(false);
            }
            gapComposer = gapComposer4;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.subtle, composer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            z = false;
            gapComposer.end(false);
            textStack2 = textStack;
        }
        String str2 = textStack2.value;
        if (str2 == null) {
            gapComposer.startReplaceGroup(1870635519);
            gapComposer.end(z);
            gapComposer2 = gapComposer;
        } else {
            gapComposer.startReplaceGroup(1870635520);
            TextStyle textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).numeralSmall;
            Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(z);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.standard, composer, (Modifier) null, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer2 = gapComposer;
            gapComposer2.end(false);
        }
        gapComposer2.end(true);
    }

    public static final void Receipt(ReceiptViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        ComposableLambdaImpl rememberComposableLambda;
        loaded.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1033527902);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(loaded) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i4 = 0;
        int i5 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(2111165202, new BrandSheetViewKt$$ExternalSyntheticLambda6(15, function1), gapComposer);
            if (loaded.primaryButton == null && loaded.secondaryButton == null) {
                gapComposer.startReplaceGroup(792345339);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(791302345);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(893801094, new ReceiptUiKt$$ExternalSyntheticLambda10(loaded, function1, i4), gapComposer);
                gapComposer.end(false);
            }
            ComposeLayoutInfoKt.ReceiptScaffold(m177backgroundbw27NRU, null, null, rememberComposableLambda2, rememberComposableLambda, Expect_jvmKt.rememberComposableLambda(-1762284960, new ReceiptUiKt$$ExternalSyntheticLambda10(loaded, function1, i5), gapComposer), gapComposer, 199680);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ReceiptUiKt$$ExternalSyntheticLambda10(loaded, function1, i, i2);
        }
    }

    public static final void ReceiptButtonCta(PaymentHistoryButton paymentHistoryButton, Function1 function1, Composer composer, int i) {
        PaymentHistoryData.UiStatusTreatment uiStatusTreatment;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1951137711);
        int i2 = (gapComposer.changedInstance(paymentHistoryButton) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            PaymentHistoryData.UiStatusTreatment uiStatusTreatment2 = paymentHistoryButton.treatment;
            if (uiStatusTreatment2 == PaymentHistoryData.UiStatusTreatment.FAILED) {
                uiStatusTreatment = uiStatusTreatment2;
                z = true;
            } else {
                uiStatusTreatment = uiStatusTreatment2;
                z = false;
            }
            int i3 = uiStatusTreatment == null ? -1 : WhenMappings.$EnumSwitchMapping$6[uiStatusTreatment.ordinal()];
            ButtonProminence buttonProminence = (i3 == 1 || i3 == 2) ? ButtonProminence.STANDARD : ButtonProminence.PROMINENT;
            boolean changedInstance = gapComposer.changedInstance(paymentHistoryButton) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda5(10, function1, paymentHistoryButton);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, z, false, null, Expect_jvmKt.rememberComposableLambda(1480266764, new BalanceFeedKt$$ExternalSyntheticLambda9(paymentHistoryButton, 8), gapComposer), gapComposer, 1572912, 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuPickerSheetKt$$ExternalSyntheticLambda4(paymentHistoryButton, function1, i, 28);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static final void ReceiptHeader(ReceiptViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        ReceiptViewModel.Loaded loaded2;
        GapComposer gapComposer;
        Modifier.Companion companion;
        boolean z;
        long j;
        Modifier modifier;
        Modifier modifier2;
        ?? r1;
        SpanStyle spanStyle;
        SpanStyle spanStyle2;
        Color m;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-240732913);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changedInstance(loaded) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion2, 16.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m298padding3ABfNKs);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            StackedAvatarViewModel stackedAvatarViewModel = loaded.avatar;
            AvatarBadgeViewModel avatarBadgeViewModel = loaded.avatarBadge;
            AvatarSize avatarSize = AvatarSize.Size64;
            boolean z2 = (i2 & 112) == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ReceiptUiKt$$ExternalSyntheticLambda3(7, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            AvatarsKt.ActivityAvatar(null, stackedAvatarViewModel, avatarBadgeViewModel, avatarSize, (Function0) rememberedValue, gapComposer2, 3072, 1);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion2);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            LayoutWeightElement m2 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14, 1.0f, false);
            String str = loaded.title;
            TextStyle textStyle = Strings.getTypography(gapComposer2).header;
            long j2 = Strings.getColors(gapComposer2).semantic.text.standard;
            GapComposer gapComposer3 = gapComposer2;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j2, (Composer) gapComposer3, (Modifier) m2, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Icons icons = loaded.titleIcon;
            if (icons == null) {
                gapComposer3.startReplaceGroup(-932167307);
                gapComposer3.end(false);
                companion = companion2;
                z = true;
            } else {
                gapComposer3.startReplaceGroup(-932167306);
                Strings.getSizes(gapComposer3).getClass();
                companion = companion2;
                Modifier m281requiredSize3ABfNKs = SizeKt.m281requiredSize3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 24.0f);
                int ordinal = icons.ordinal();
                z = true;
                if (ordinal == 1) {
                    gapComposer3.startReplaceGroup(-1536640894);
                    j = Strings.getColors(gapComposer3).semantic.icon.info;
                    gapComposer3.end(false);
                } else if (ordinal != 103) {
                    gapComposer3.startReplaceGroup(-1536637687);
                    gapComposer3.end(false);
                    j = Color.Unspecified;
                } else {
                    gapComposer3.startReplaceGroup(-1536638589);
                    j = Strings.getColors(gapComposer3).semantic.icon.brand;
                    gapComposer3.end(false);
                }
                Trace.m1191Iconww6aTOc(icons, (String) null, m281requiredSize3ABfNKs, j, gapComposer3, 48, 0);
                gapComposer3.end(false);
            }
            gapComposer3.end(z);
            ReceiptViewModel.Subtitle subtitle = loaded.subtitle;
            if (subtitle == null) {
                gapComposer3.startReplaceGroup(-1259664853);
                gapComposer3.end(false);
                r1 = z;
                modifier2 = null;
            } else {
                gapComposer3.startReplaceGroup(-1259664852);
                gapComposer3.startReplaceGroup(97913835);
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                if (subtitle instanceof ReceiptViewModel.Subtitle.AnnotatedText) {
                    gapComposer3.startReplaceGroup(1172172083);
                    ReceiptViewModel.Subtitle.AnnotatedText annotatedText = (ReceiptViewModel.Subtitle.AnnotatedText) subtitle;
                    builder.append(annotatedText.text);
                    AbstractPersistentList abstractPersistentList = annotatedText.attributes;
                    gapComposer3.startReplaceGroup(-931265188);
                    ArrayList arrayList = new ArrayList(abstractPersistentList.size());
                    int size = abstractPersistentList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        AttributeRange.Attribute attribute = ((AttributeRange) abstractPersistentList.get(i3)).attribute;
                        if (attribute instanceof AttributeRange.Attribute.Bold) {
                            gapComposer3.startReplaceGroup(-171870870);
                            gapComposer3.end(false);
                            spanStyle2 = new SpanStyle(0L, 0L, FontWeight.Bold, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65531);
                        } else if (attribute instanceof AttributeRange.Attribute.ForegroundColor) {
                            gapComposer3.startReplaceGroup(-171867605);
                            com.squareup.protos.cash.ui.Color color = ((AttributeRange.Attribute.ForegroundColor) attribute).getValue().color;
                            if (color == null) {
                                gapComposer3.startReplaceGroup(-1032884748);
                                gapComposer3.end(false);
                                m = null;
                            } else {
                                m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer3, -171866195, color, gapComposer3, false);
                            }
                            spanStyle2 = new SpanStyle(m != null ? m.value : Color.Unspecified, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER);
                            gapComposer3.end(false);
                        } else if (attribute instanceof AttributeRange.Attribute.StrikeThrough) {
                            gapComposer3.startReplaceGroup(-171863367);
                            gapComposer3.end(false);
                            spanStyle2 = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.LineThrough, (Shadow) null, 61439);
                        } else if (attribute instanceof AttributeRange.Attribute.Faded) {
                            gapComposer3.startReplaceGroup(-171859971);
                            Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                            } else {
                                gapComposer3.startReplaceGroup(-1762997739);
                                gapComposer3.end(false);
                            }
                            spanStyle2 = new SpanStyle(colors.semantic.text.subtle, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER);
                            gapComposer3.end(false);
                        } else if (attribute instanceof AttributeRange.Attribute.Underline) {
                            gapComposer3.startReplaceGroup(-171856585);
                            gapComposer3.end(false);
                            spanStyle2 = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61439);
                        } else {
                            gapComposer3.startReplaceGroup(-1032521862);
                            gapComposer3.end(false);
                            spanStyle = null;
                            arrayList.add(spanStyle);
                        }
                        spanStyle = spanStyle2;
                        arrayList.add(spanStyle);
                    }
                    gapComposer3.end(false);
                    Iterator it = CollectionsKt.zip(abstractPersistentList, arrayList).iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        AttributeRange attributeRange = (AttributeRange) pair.first;
                        SpanStyle spanStyle3 = (SpanStyle) pair.second;
                        if (spanStyle3 != null) {
                            Integer num = attributeRange.begin_index_inclusive;
                            int intValue = num != null ? num.intValue() : 0;
                            Integer num2 = attributeRange.end_index_inclusive;
                            builder.addStyle(spanStyle3, intValue, num2 != null ? num2.intValue() : 0);
                        }
                    }
                    gapComposer3.end(false);
                    modifier = null;
                } else {
                    if (!(subtitle instanceof ReceiptViewModel.Subtitle.Markdown)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 453451800, false);
                    }
                    gapComposer3.startReplaceGroup(453465337);
                    gapComposer3.end(false);
                    modifier = null;
                    Worker.DefaultImpls.appendMarkdown$default(builder, ((ReceiptViewModel.Subtitle.Markdown) subtitle).rawText, null, 6);
                }
                AnnotatedString annotatedString = builder.toAnnotatedString();
                gapComposer3.end(false);
                ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                TextStyle textStyle2 = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                } else {
                    gapComposer3.startReplaceGroup(-1762997739);
                    gapComposer3.end(false);
                }
                modifier2 = modifier;
                r1 = z;
                Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors2.semantic.text.subtle, (Composer) gapComposer3, m302paddingqDBjuR0$default, annotatedString, textStyle2, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                gapComposer3.end(false);
            }
            DBUtil.SpacerWithinSectionMedium(0, r1, gapComposer3, modifier2);
            loaded2 = loaded;
            String str2 = loaded2.amount;
            if (str2 == null) {
                gapComposer3.startReplaceGroup(-1258854296);
                gapComposer3.end(false);
            } else {
                gapComposer3.startReplaceGroup(-1258854295);
                PaymentHistoryData.AmountTreatment amountTreatment = loaded2.amountTreatment;
                if (amountTreatment == null) {
                    amountTreatment = PaymentHistoryData.AmountTreatment.STANDARD;
                }
                AmountText(str2, amountTreatment, null, gapComposer3, 0, 4);
                gapComposer3.end(false);
            }
            String str3 = loaded2.amountAlternate;
            if (str3 == null) {
                gapComposer3.startReplaceGroup(-1258708751);
                gapComposer3.end(false);
            } else {
                gapComposer3.startReplaceGroup(-1258708750);
                PaymentHistoryData.AmountTreatment amountTreatment2 = loaded2.amountAlternateTreatment;
                if (amountTreatment2 == null) {
                    amountTreatment2 = PaymentHistoryData.AmountTreatment.STANDARD;
                }
                AmountText(str3, amountTreatment2, ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).sectionTitle, gapComposer3, 0, 0);
                gapComposer3.end(false);
            }
            gapComposer3.end(r1);
            gapComposer = gapComposer3;
        } else {
            loaded2 = loaded;
            gapComposer2.skipToGroupEnd();
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ReceiptUiKt$$ExternalSyntheticLambda10(loaded2, function1, i, 3);
        }
    }

    public static final void ReceiptUi(RealImageLoader realImageLoader, RealCashVibrator realCashVibrator, ReceiptViewModel receiptViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        receiptViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1616974849);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(realImageLoader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(realCashVibrator) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(receiptViewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime(realCashVibrator)}, Expect_jvmKt.rememberComposableLambda(-72100031, new ReceiptUiKt$$ExternalSyntheticLambda0(function1, receiptViewModel, i3), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(realImageLoader, i, realCashVibrator, receiptViewModel, function1, 23);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final void Section(ReceiptSection receiptSection, Function1 function1, Composer composer, int i) {
        ReceiptSection receiptSection2;
        Function1 function12;
        boolean z;
        ?? r0;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1684303111);
        int i2 = i | (gapComposer.changedInstance(receiptSection) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String str = receiptSection.title;
            if (str == null || str.length() == 0) {
                z = true;
                r0 = 0;
                gapComposer.startReplaceGroup(-1829477755);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1829697824);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                String str2 = receiptSection.title;
                str2.getClass();
                z = true;
                r0 = 0;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, m300paddingVpY3zN4$default, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            gapComposer.startReplaceGroup(495175077);
            receiptSection2 = receiptSection;
            Iterator<ReceiptSection.Entry> it = receiptSection2.entries.iterator();
            while (it.hasNext()) {
                ReceiptSection.Entry.Type type2 = it.next().type;
                if (type2 instanceof ReceiptSection.Entry.Type.DetailRow) {
                    gapComposer.startReplaceGroup(495177970);
                    DetailRow(((ReceiptSection.Entry.Type.DetailRow) type2).getValue(), gapComposer, r0);
                    gapComposer.end(r0);
                } else if (type2 instanceof ReceiptSection.Entry.Type.ActionRow) {
                    gapComposer.startReplaceGroup(495180283);
                    ActionRow(((ReceiptSection.Entry.Type.ActionRow) type2).getValue(), function1, gapComposer, i2 & 112);
                    gapComposer.end(r0);
                } else if (type2 instanceof ReceiptSection.Entry.Type.ItemsGroup) {
                    gapComposer.startReplaceGroup(495182902);
                    ItemsGroupRow(((ReceiptSection.Entry.Type.ItemsGroup) type2).getValue(), gapComposer, r0);
                    gapComposer.end(r0);
                } else if (type2 instanceof ReceiptSection.Entry.Type.ProgressRow) {
                    gapComposer.startReplaceGroup(495185396);
                    ProgressRow(((ReceiptSection.Entry.Type.ProgressRow) type2).getValue(), gapComposer, r0);
                    gapComposer.end(r0);
                } else if (type2 instanceof ReceiptSection.Entry.Type.LocationRow) {
                    gapComposer.startReplaceGroup(495187837);
                    LocationRow(((ReceiptSection.Entry.Type.LocationRow) type2).getValue(), function1, gapComposer, i2 & 112);
                    gapComposer.end(r0);
                } else if (type2 instanceof ReceiptSection.Entry.Type.TextBlock) {
                    gapComposer.startReplaceGroup(495190491);
                    TextBlock(((ReceiptSection.Entry.Type.TextBlock) type2).getValue(), function1, gapComposer, i2 & 112);
                    gapComposer.end(r0);
                } else if (type2 instanceof ReceiptSection.Entry.Type.UrlRow) {
                    gapComposer.startReplaceGroup(495192984);
                    UrlRow(((ReceiptSection.Entry.Type.UrlRow) type2).getValue(), function1, gapComposer, i2 & 112);
                    gapComposer.end(r0);
                } else if (type2 instanceof ReceiptSection.Entry.Type.Upsell) {
                    gapComposer.startReplaceGroup(495195384);
                    Upsell(((ReceiptSection.Entry.Type.Upsell) type2).getValue(), function1, gapComposer, i2 & 112);
                    gapComposer.end(r0);
                } else if (type2 instanceof ReceiptSection.Entry.Type.Timeline) {
                    gapComposer.startReplaceGroup(495197850);
                    ReceiptTimelineKt.Timeline(((ReceiptSection.Entry.Type.Timeline) type2).getValue(), function1, gapComposer, i2 & 112);
                    gapComposer.end(r0);
                } else if (type2 instanceof ReceiptSection.Entry.Type.TimelineEntry) {
                    gapComposer.startReplaceGroup(495200538);
                    ReceiptTimelineKt.Timeline(((ReceiptSection.Entry.Type.TimelineEntry) type2).getValue(), function1, gapComposer, i2 & 112);
                    gapComposer.end(r0);
                } else if (type2 instanceof ReceiptSection.Entry.Type.ImageRow) {
                    gapComposer.startReplaceGroup(495203066);
                    ImageRow(((ReceiptSection.Entry.Type.ImageRow) type2).getValue(), function1, gapComposer, i2 & 112);
                    gapComposer.end(r0);
                } else {
                    if (type2 != null) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 495176280, (boolean) r0);
                    }
                    gapComposer.startReplaceGroup(495204513);
                    gapComposer.end(r0);
                }
            }
            function12 = function1;
            gapComposer.end(r0);
            gapComposer.end(z);
        } else {
            receiptSection2 = receiptSection;
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuPickerSheetKt$$ExternalSyntheticLambda4(receiptSection2, function12, i, 27);
        }
    }

    public static final void TextBlock(ReceiptSection.TextBlock textBlock, Function1 function1, Composer composer, int i) {
        TextStyle textStyle;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1456668667);
        int i2 = (gapComposer.changedInstance(textBlock) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = textBlock.content;
            if (str == null) {
                gapComposer.startReplaceGroup(-733167909);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-733167908);
                String str2 = textBlock.arcade_text_style;
                if (str2 == null) {
                    gapComposer.startReplaceGroup(1146945215);
                    gapComposer.end(false);
                    textStyle = null;
                } else {
                    gapComposer.startReplaceGroup(1146945216);
                    TextStyle fromID = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).fromID(str2);
                    gapComposer.end(false);
                    textStyle = fromID;
                }
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                gapComposer.startReplaceGroup(-300738149);
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                SpanStyle spanStyle = textStyle != null ? TextStyle.m994copyp1EtxEg$default(textStyle, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.Underline, null, null, 0, 0L, null, null, 0, 16773119).spanStyle : null;
                if (spanStyle == null) {
                    gapComposer.startReplaceGroup(-2104193360);
                    spanStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).linkMedium.spanStyle;
                } else {
                    gapComposer.startReplaceGroup(-2104197297);
                }
                gapComposer.end(false);
                boolean z = (i2 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new SwipeToDismissKt$$ExternalSyntheticLambda4(13, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Worker.DefaultImpls.appendMarkdown(builder, str, spanStyle, (Function2) rememberedValue);
                AnnotatedString annotatedString = builder.toAnnotatedString();
                gapComposer.end(false);
                if (textStyle == null) {
                    gapComposer.startReplaceGroup(1422489891);
                    textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                } else {
                    gapComposer.startReplaceGroup(1422488775);
                }
                gapComposer.end(false);
                TextStyle textStyle2 = textStyle;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer, m300paddingVpY3zN4$default, annotatedString, textStyle2, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuPickerSheetKt$$ExternalSyntheticLambda4(textBlock, function1, i, 29);
        }
    }

    public static final void Upsell(ReceiptSection.Upsell upsell, Function1 function1, Composer composer, int i) {
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1836374453);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(upsell) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            int i4 = i3 & 112;
            boolean changedInstance = (i4 == 32) | gapComposer.changedInstance(upsell);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ReceiptUiKt$Upsell$1$1(function1, upsell, null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, upsell, (Function2) rememberedValue);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 32.0f, 2);
            String str = upsell.body;
            if (str == null) {
                gapComposer.startReplaceGroup(1862529186);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(1862529187);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-979454903, new ToastKt$$ExternalSyntheticLambda1(str, 11), gapComposer);
                gapComposer.end(false);
            }
            Illustration illustration = upsell.illustration;
            CardUpsellIllustration cardUpsellIllustration = illustration != null ? IllustrationsKt.toCardUpsellIllustration(illustration) : null;
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(717602284, new CartBannerViewKt$$ExternalSyntheticLambda2(upsell, 29), gapComposer);
            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-1486079787, new BalanceFeedKt$$ExternalSyntheticLambda9(upsell, 9), gapComposer);
            boolean changedInstance2 = gapComposer.changedInstance(upsell) | (i4 == 32);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BalanceFeedKt$$ExternalSyntheticLambda5(14, function1, upsell);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CardUpsellKt.CardUpsellSmall(rememberComposableLambda2, rememberComposableLambda3, (Function0) rememberedValue2, m302paddingqDBjuR0$default, rememberComposableLambda, cardUpsellIllustration, gapComposer, 54, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AtmPickerGridKt$$ExternalSyntheticLambda4(upsell, function1, i, i2);
        }
    }

    public static final void UrlRow(final ReceiptSection.URLRow uRLRow, final Function1 function1, Composer composer, final int i) {
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-226434037);
        int i2 = (gapComposer.changedInstance(uRLRow) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = uRLRow.url;
            if (str == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                } else {
                    function2 = new Function2(uRLRow, function1, i, i3) { // from class: com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda45
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ ReceiptSection.URLRow f$0;
                        public final /* synthetic */ Function1 f$1;

                        {
                            this.$r8$classId = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    ReceiptUiKt.UrlRow(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                                    break;
                                case 1:
                                    ReceiptUiKt.UrlRow(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    ReceiptUiKt.UrlRow(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else {
                String str2 = uRLRow.label;
                if (str2 == null) {
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    } else {
                        function2 = new Function2(uRLRow, function1, i, i4) { // from class: com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda45
                            public final /* synthetic */ int $r8$classId;
                            public final /* synthetic */ ReceiptSection.URLRow f$0;
                            public final /* synthetic */ Function1 f$1;

                            {
                                this.$r8$classId = i4;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i5 = this.$r8$classId;
                                Composer composer2 = (Composer) obj;
                                ((Integer) obj2).getClass();
                                switch (i5) {
                                    case 0:
                                        ReceiptUiKt.UrlRow(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                                        break;
                                    case 1:
                                        ReceiptUiKt.UrlRow(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                                        break;
                                    default:
                                        ReceiptUiKt.UrlRow(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    }
                } else {
                    boolean changed = gapComposer.changed(uRLRow);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        AnnotatedString.Builder builder = new AnnotatedString.Builder();
                        builder.pushLink(new LinkAnnotation.Url(str, null, new ReceiptUiKt$$ExternalSyntheticLambda47(function1, str, 0), 2));
                        builder.append(str2);
                        rememberedValue = builder.toAnnotatedString();
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Room.m1164Text25TpFw(0, 1, 0, 0, 1572864, 0, 4024, 0L, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), (AnnotatedString) rememberedValue, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                }
            }
            endRestartGroup.block = function2;
        }
        gapComposer.skipToGroupEnd();
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i5 = 2;
            function2 = new Function2(uRLRow, function1, i, i5) { // from class: com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda45
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ ReceiptSection.URLRow f$0;
                public final /* synthetic */ Function1 f$1;

                {
                    this.$r8$classId = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            ReceiptUiKt.UrlRow(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                            break;
                        case 1:
                            ReceiptUiKt.UrlRow(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            ReceiptUiKt.UrlRow(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }
}
