package com.squareup.cash.appmessages.views.sheet;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ChromeSystemIconColor;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.local.views.map.LocalMapPinKt$$ExternalSyntheticLambda5;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.Extras;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import coil3.size.DimensionKt;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import coil3.transition.CrossfadeTransition;
import coil3.transition.Transition;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.android.gms.internal.mlkit_vision_common.zzjs;
import com.google.zxing.BinaryBitmap;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda9;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.appmessages.sheet.SheetAppMessageModel;
import com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda8;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetPeekPosition$FixedHeight;
import com.squareup.cash.sheet.SheetStateKt;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda33;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda35;
import com.squareup.protos.cash.messagingplatformcommon.app.Image$Message$ImageFill;
import com.squareup.protos.cash.messagingplatformcommon.app.Image$Message$ImageFixed;
import com.squareup.protos.cash.messagingplatformcommon.app.Image$Message$ImageInset;
import com.squareup.protos.cash.messagingplatformcommon.app.ImageFill;
import com.squareup.protos.cash.messagingplatformcommon.app.ImageFixed;
import com.squareup.protos.cash.messagingplatformcommon.app.ImageInset;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.cash.ColorsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class SheetAppMessageView extends ComposeUiView {
    public final float defaultPeekHeightDp;
    public final RealImageLoader imageLoader;
    public final BinaryBitmap treehouseContent;

    public SheetAppMessageView(Context context, BinaryBitmap binaryBitmap, RealImageLoader realImageLoader) {
        super(context);
        this.treehouseContent = binaryBitmap;
        this.imageLoader = realImageLoader;
        this.defaultPeekHeightDp = 540.0f;
    }

    /* renamed from: getForegroundColor-lPYJkFU, reason: not valid java name */
    public static long m2981getForegroundColorlPYJkFU(SheetAppMessageModel.Loaded loaded, long j, long j2, Composer composer, int i) {
        if (!loaded.isSolid) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-1898938533);
            gapComposer.end(false);
            return Color.White;
        }
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(-1899098059);
        long m3988contrastAdjustedColorysEtTa8 = ColorsKt.m3988contrastAdjustedColorysEtTa8(j, j2, zzabp.access$getHeaderGradientColor(loaded, gapComposer2));
        gapComposer2.end(false);
        return m3988contrastAdjustedColorysEtTa8;
    }

    /* renamed from: getTextColor-XeAY9LY, reason: not valid java name */
    public static long m2982getTextColorXeAY9LY(SheetAppMessageModel.Loaded loaded, Composer composer, int i) {
        loaded.getClass();
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
        GapComposer gapComposer = (GapComposer) composer;
        Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        long j = colors.semantic.text.standard;
        Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
        if (colors2 == null) {
            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        return m2981getForegroundColorlPYJkFU(loaded, j, colors2.semantic.text.inverse, composer, (i & 14) | ((i << 6) & 7168));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Content(RealSheetState realSheetState, SheetAppMessageModel sheetAppMessageModel, Function1 function1, Composer composer, int i) {
        int i2;
        ImageFixed imageFixed;
        realSheetState.getClass();
        sheetAppMessageModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(141620816);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(realSheetState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(sheetAppMessageModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 2048 : 1024;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = sheetAppMessageModel instanceof SheetAppMessageModel.Loaded;
            float f = this.defaultPeekHeightDp;
            if (z) {
                SheetAppMessageModel.Loaded loaded = (SheetAppMessageModel.Loaded) sheetAppMessageModel;
                if (loaded.isSolid) {
                    zzjs zzjsVar = loaded.headerImage.message;
                    if (zzjsVar != null) {
                        Image$Message$ImageFixed image$Message$ImageFixed = zzjsVar instanceof Image$Message$ImageFixed ? (Image$Message$ImageFixed) zzjsVar : null;
                        if (image$Message$ImageFixed != null) {
                            imageFixed = image$Message$ImageFixed.value;
                            if ((imageFixed != null ? imageFixed.width : null) != null && imageFixed.height != null) {
                                float f2 = getResources().getDisplayMetrics().widthPixels;
                                imageFixed.width.getClass();
                                imageFixed.height.getClass();
                                f = Math.max(((r0.intValue() * (f2 / r12.intValue())) / getResources().getDisplayMetrics().density) + 310.0f, f);
                            }
                        }
                    }
                    imageFixed = null;
                    if ((imageFixed != null ? imageFixed.width : null) != null) {
                        float f22 = getResources().getDisplayMetrics().widthPixels;
                        imageFixed.width.getClass();
                        imageFixed.height.getClass();
                        f = Math.max(((r0.intValue() * (f22 / r12.intValue())) / getResources().getDisplayMetrics().density) + 310.0f, f);
                    }
                }
            }
            SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight = new SheetPeekPosition$FixedHeight(6, f, false);
            boolean z2 = (i3 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda1(13, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SheetKt.Sheet((Function0) rememberedValue, null, realSheetState, sheetPeekPosition$FixedHeight, null, false, null, Expect_jvmKt.rememberComposableLambda(-1766239321, new SheetAppMessageView$$ExternalSyntheticLambda2(this, sheetAppMessageModel, f, function1, realSheetState), gapComposer), gapComposer, ((i3 << 6) & 896) | 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2(this, i, realSheetState, sheetAppMessageModel, function1, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0354  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Header(SheetAppMessageModel.Loaded loaded, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Function1 function12;
        SheetAppMessageView sheetAppMessageView;
        GapComposer gapComposer;
        ImageFill imageFill;
        ImageFixed imageFixed;
        ImageInset imageInset;
        boolean changed;
        Object rememberedValue;
        String str;
        Modifier.Companion companion;
        long j;
        boolean z;
        Colors colors;
        boolean z2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(961331770);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(this) ? 2048 : 1024;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 14;
            int i4 = ((i2 >> 6) & 112) | i3;
            loaded.getClass();
            long j2 = Color.Black;
            ChromeConfigKt.ChromeConfig(null, null, Color.m676equalsimpl0(m2981getForegroundColorlPYJkFU(loaded, j2, Color.White, gapComposer2, ((i4 & 14) | 432) | ((i4 << 6) & 7168)), j2) ? ChromeSystemIconColor.ALWAYS_DARK : ChromeSystemIconColor.ALWAYS_LIGHT, null, null, null, null, gapComposer2, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
            long access$getHeaderGradientColor = zzabp.access$getHeaderGradientColor(loaded, gapComposer2);
            long m2982getTextColorXeAY9LY = m2982getTextColorXeAY9LY(loaded, gapComposer2, i4);
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, access$getHeaderGradientColor, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            String str2 = null;
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
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            ImageRequest.Builder builder = new ImageRequest.Builder((Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext));
            zzjs zzjsVar = loaded.headerImage.message;
            if (zzjsVar != null) {
                Image$Message$ImageFill image$Message$ImageFill = zzjsVar instanceof Image$Message$ImageFill ? (Image$Message$ImageFill) zzjsVar : null;
                if (image$Message$ImageFill != null) {
                    imageFill = image$Message$ImageFill.value;
                    if (zzjsVar != null) {
                        Image$Message$ImageFixed image$Message$ImageFixed = zzjsVar instanceof Image$Message$ImageFixed ? (Image$Message$ImageFixed) zzjsVar : null;
                        if (image$Message$ImageFixed != null) {
                            imageFixed = image$Message$ImageFixed.value;
                            if (zzjsVar != null) {
                                Image$Message$ImageInset image$Message$ImageInset = zzjsVar instanceof Image$Message$ImageInset ? (Image$Message$ImageInset) zzjsVar : null;
                                if (image$Message$ImageInset != null) {
                                    imageInset = image$Message$ImageInset.value;
                                    if (imageFill == null) {
                                        gapComposer2.startReplaceGroup(-1092706364);
                                        Image image = imageFill.image_asset;
                                        if (image == null) {
                                            gapComposer2.startReplaceGroup(-1092689687);
                                            z2 = false;
                                            gapComposer2.end(false);
                                        } else {
                                            z2 = false;
                                            str2 = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer2, -1697816040, image, gapComposer2, false);
                                        }
                                        if (str2 == null) {
                                            String str3 = imageFill.asset_url;
                                            str3.getClass();
                                            str2 = str3;
                                        }
                                        gapComposer2.end(z2);
                                    } else if (imageFixed != null) {
                                        gapComposer2.startReplaceGroup(-1092633886);
                                        Image image2 = imageFixed.image_asset;
                                        if (image2 == null) {
                                            gapComposer2.startReplaceGroup(-1092616279);
                                            gapComposer2.end(false);
                                        } else {
                                            str2 = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer2, -1697813672, image2, gapComposer2, false);
                                        }
                                        if (str2 == null) {
                                            String str4 = imageFixed.asset_url;
                                            str4.getClass();
                                            str2 = str4;
                                        }
                                        gapComposer2.end(false);
                                    } else if (imageInset != null) {
                                        gapComposer2.startReplaceGroup(-1092559486);
                                        Image image3 = imageInset.image_asset;
                                        if (image3 == null) {
                                            gapComposer2.startReplaceGroup(-1092541879);
                                            gapComposer2.end(false);
                                        } else {
                                            str2 = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer2, -1697811272, image3, gapComposer2, false);
                                        }
                                        if (str2 == null) {
                                            String str5 = imageInset.asset_url;
                                            str5.getClass();
                                            str2 = str5;
                                        }
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1092495597);
                                        gapComposer2.end(false);
                                        str2 = "";
                                    }
                                    builder.data = str2;
                                    int i5 = !((Boolean) gapComposer2.consume(InspectionModeKt.LocalInspectionMode)).booleanValue() ? 0 : EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE;
                                    Extras.Key key = ImageRequests_androidKt.transitionFactoryKey;
                                    builder.getExtras().set(ImageRequests_androidKt.transitionFactoryKey, i5 <= 0 ? new CrossfadeTransition.Factory(i5) : Transition.Factory.NONE);
                                    AsyncImageKt.m1438AsyncImage10Xjiaw(builder.build(), null, fillMaxWidth, Alignment.Companion.TopCenter, ContentScale.Companion.FillWidth, null, gapComposer2, 1769904, 1944);
                                    Modifier align = BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxWidth(companion2, 1.0f), Alignment.Companion.BottomCenter);
                                    changed = gapComposer2.changed(access$getHeaderGradientColor) | (i3 != 4);
                                    rememberedValue = gapComposer2.rememberedValue();
                                    if (!changed || rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = new LocalMapPinKt$$ExternalSyntheticLambda5(loaded, access$getHeaderGradientColor, 6);
                                        gapComposer2.updateRememberedValue(rememberedValue);
                                    }
                                    Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(ClipKt.drawBehind(align, (Function1) rememberedValue), 16.0f, !loaded.isSolid ? 24.0f : 80.0f, 16.0f, 24.0f);
                                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m301paddingqDBjuR0);
                                    gapComposer2.startReusableNode();
                                    if (gapComposer2.inserting) {
                                        gapComposer2.useNode();
                                    } else {
                                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                                    }
                                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                                    String str6 = loaded.title;
                                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, m2982getTextColorXeAY9LY, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(staticProvidableCompositionLocal)).header, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
                                    gapComposer = gapComposer2;
                                    str = loaded.subtitle;
                                    if (str != null) {
                                        gapComposer.startReplaceGroup(324012140);
                                        z = false;
                                        gapComposer.end(false);
                                        companion = companion2;
                                        j = m2982getTextColorXeAY9LY;
                                    } else {
                                        gapComposer.startReplaceGroup(324012141);
                                        companion = companion2;
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, m2982getTextColorXeAY9LY, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                        j = m2982getTextColorXeAY9LY;
                                        gapComposer = gapComposer;
                                        z = false;
                                        gapComposer.end(false);
                                    }
                                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 32.0f));
                                    colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                    if (colors != null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z);
                                    } else {
                                        gapComposer.startReplaceGroup(-1762997739);
                                        gapComposer.end(z);
                                    }
                                    sheetAppMessageView = this;
                                    function12 = function1;
                                    ArcadeThemeKt.ArcadeTheme(DimensionKt.m1467overrideButtonPrimaryBackgroundWkMShQ$default(colors, j), null, null, Expect_jvmKt.rememberComposableLambda(-1850567167, new InlineAppMessageKt$$ExternalSyntheticLambda8(22, loaded, function12, sheetAppMessageView), gapComposer), gapComposer, 3072, 6);
                                    gapComposer.end(true);
                                    gapComposer.end(true);
                                }
                            }
                            imageInset = null;
                            if (imageFill == null) {
                            }
                            builder.data = str2;
                            if (!((Boolean) gapComposer2.consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
                            }
                            Extras.Key key2 = ImageRequests_androidKt.transitionFactoryKey;
                            builder.getExtras().set(ImageRequests_androidKt.transitionFactoryKey, i5 <= 0 ? new CrossfadeTransition.Factory(i5) : Transition.Factory.NONE);
                            AsyncImageKt.m1438AsyncImage10Xjiaw(builder.build(), null, fillMaxWidth, Alignment.Companion.TopCenter, ContentScale.Companion.FillWidth, null, gapComposer2, 1769904, 1944);
                            Modifier align2 = BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxWidth(companion2, 1.0f), Alignment.Companion.BottomCenter);
                            changed = gapComposer2.changed(access$getHeaderGradientColor) | (i3 != 4);
                            rememberedValue = gapComposer2.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue = new LocalMapPinKt$$ExternalSyntheticLambda5(loaded, access$getHeaderGradientColor, 6);
                            gapComposer2.updateRememberedValue(rememberedValue);
                            Modifier m301paddingqDBjuR02 = SpacerKt.m301paddingqDBjuR0(ClipKt.drawBehind(align2, (Function1) rememberedValue), 16.0f, !loaded.isSolid ? 24.0f : 80.0f, 16.0f, 24.0f);
                            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                            int hashCode22 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope22 = gapComposer2.currentCompositionLocalScope();
                            Modifier materializeModifier22 = PlatformKt.materializeModifier(gapComposer2, m301paddingqDBjuR02);
                            gapComposer2.startReusableNode();
                            if (gapComposer2.inserting) {
                            }
                            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope22, composeUiNode$Companion$SetModifier$12);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode22, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer2, materializeModifier22, composeUiNode$Companion$SetModifier$14);
                            String str62 = loaded.title;
                            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalTypography;
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, m2982getTextColorXeAY9LY, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(staticProvidableCompositionLocal2)).header, (TextLineBalancing) null, str62, (Map) null, (Function1) null, false);
                            gapComposer = gapComposer2;
                            str = loaded.subtitle;
                            if (str != null) {
                            }
                            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 32.0f));
                            colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors != null) {
                            }
                            sheetAppMessageView = this;
                            function12 = function1;
                            ArcadeThemeKt.ArcadeTheme(DimensionKt.m1467overrideButtonPrimaryBackgroundWkMShQ$default(colors, j), null, null, Expect_jvmKt.rememberComposableLambda(-1850567167, new InlineAppMessageKt$$ExternalSyntheticLambda8(22, loaded, function12, sheetAppMessageView), gapComposer), gapComposer, 3072, 6);
                            gapComposer.end(true);
                            gapComposer.end(true);
                        }
                    }
                    imageFixed = null;
                    if (zzjsVar != null) {
                    }
                    imageInset = null;
                    if (imageFill == null) {
                    }
                    builder.data = str2;
                    if (!((Boolean) gapComposer2.consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
                    }
                    Extras.Key key22 = ImageRequests_androidKt.transitionFactoryKey;
                    builder.getExtras().set(ImageRequests_androidKt.transitionFactoryKey, i5 <= 0 ? new CrossfadeTransition.Factory(i5) : Transition.Factory.NONE);
                    AsyncImageKt.m1438AsyncImage10Xjiaw(builder.build(), null, fillMaxWidth, Alignment.Companion.TopCenter, ContentScale.Companion.FillWidth, null, gapComposer2, 1769904, 1944);
                    Modifier align22 = BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxWidth(companion2, 1.0f), Alignment.Companion.BottomCenter);
                    changed = gapComposer2.changed(access$getHeaderGradientColor) | (i3 != 4);
                    rememberedValue = gapComposer2.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new LocalMapPinKt$$ExternalSyntheticLambda5(loaded, access$getHeaderGradientColor, 6);
                    gapComposer2.updateRememberedValue(rememberedValue);
                    Modifier m301paddingqDBjuR022 = SpacerKt.m301paddingqDBjuR0(ClipKt.drawBehind(align22, (Function1) rememberedValue), 16.0f, !loaded.isSolid ? 24.0f : 80.0f, 16.0f, 24.0f);
                    ColumnMeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode222 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope222 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier222 = PlatformKt.materializeModifier(gapComposer2, m301paddingqDBjuR022);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy22, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope222, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode222, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier222, composeUiNode$Companion$SetModifier$14);
                    String str622 = loaded.title;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal22 = ArcadeThemeKt.LocalTypography;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, m2982getTextColorXeAY9LY, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(staticProvidableCompositionLocal22)).header, (TextLineBalancing) null, str622, (Map) null, (Function1) null, false);
                    gapComposer = gapComposer2;
                    str = loaded.subtitle;
                    if (str != null) {
                    }
                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 32.0f));
                    colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors != null) {
                    }
                    sheetAppMessageView = this;
                    function12 = function1;
                    ArcadeThemeKt.ArcadeTheme(DimensionKt.m1467overrideButtonPrimaryBackgroundWkMShQ$default(colors, j), null, null, Expect_jvmKt.rememberComposableLambda(-1850567167, new InlineAppMessageKt$$ExternalSyntheticLambda8(22, loaded, function12, sheetAppMessageView), gapComposer), gapComposer, 3072, 6);
                    gapComposer.end(true);
                    gapComposer.end(true);
                }
            }
            imageFill = null;
            if (zzjsVar != null) {
            }
            imageFixed = null;
            if (zzjsVar != null) {
            }
            imageInset = null;
            if (imageFill == null) {
            }
            builder.data = str2;
            if (!((Boolean) gapComposer2.consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
            }
            Extras.Key key222 = ImageRequests_androidKt.transitionFactoryKey;
            builder.getExtras().set(ImageRequests_androidKt.transitionFactoryKey, i5 <= 0 ? new CrossfadeTransition.Factory(i5) : Transition.Factory.NONE);
            AsyncImageKt.m1438AsyncImage10Xjiaw(builder.build(), null, fillMaxWidth, Alignment.Companion.TopCenter, ContentScale.Companion.FillWidth, null, gapComposer2, 1769904, 1944);
            Modifier align222 = BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxWidth(companion2, 1.0f), Alignment.Companion.BottomCenter);
            changed = gapComposer2.changed(access$getHeaderGradientColor) | (i3 != 4);
            rememberedValue = gapComposer2.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new LocalMapPinKt$$ExternalSyntheticLambda5(loaded, access$getHeaderGradientColor, 6);
            gapComposer2.updateRememberedValue(rememberedValue);
            Modifier m301paddingqDBjuR0222 = SpacerKt.m301paddingqDBjuR0(ClipKt.drawBehind(align222, (Function1) rememberedValue), 16.0f, !loaded.isSolid ? 24.0f : 80.0f, 16.0f, 24.0f);
            ColumnMeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode2222 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2222 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2222 = PlatformKt.materializeModifier(gapComposer2, m301paddingqDBjuR0222);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy222, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2222, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2222, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2222, composeUiNode$Companion$SetModifier$14);
            String str6222 = loaded.title;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal222 = ArcadeThemeKt.LocalTypography;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, m2982getTextColorXeAY9LY, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(staticProvidableCompositionLocal222)).header, (TextLineBalancing) null, str6222, (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            str = loaded.subtitle;
            if (str != null) {
            }
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 32.0f));
            colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors != null) {
            }
            sheetAppMessageView = this;
            function12 = function1;
            ArcadeThemeKt.ArcadeTheme(DimensionKt.m1467overrideButtonPrimaryBackgroundWkMShQ$default(colors, j), null, null, Expect_jvmKt.rememberComposableLambda(-1850567167, new InlineAppMessageKt$$ExternalSyntheticLambda8(22, loaded, function12, sheetAppMessageView), gapComposer), gapComposer, 3072, 6);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            function12 = function1;
            sheetAppMessageView = this;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(sheetAppMessageView, loaded, function12, modifier, i, 29);
        }
    }

    public final void NavigationIcon(Modifier modifier, Icons icons, String str, Function0 function0, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Function0 function02;
        Modifier modifier3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(967158887);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            i3 |= gapComposer.changed(icons.ordinal()) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function02 = function0;
            i3 |= gapComposer.changedInstance(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Modifier modifier4 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(modifier4, 44.0f), RoundedCornerShapeKt.CircleShape);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(ImageKt.m177backgroundbw27NRU(clip, colors.semantic.background.f1047app, ColorKt.RectangleShape), false, null, null, function02, 15);
            boolean z = (i3 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BadgeKt$$ExternalSyntheticLambda3(str, 3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m183clickableoSLSa3U$default, false, (Function1) rememberedValue);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, colors2.semantic.icon.standard, gapComposer, ((i3 >> 3) & 14) | 48, 4);
            gapComposer.end(true);
            modifier3 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3((Object) this, modifier3, (Object) icons, (Object) str, (Object) function0, i, i2, 9);
        }
    }

    public final void ScrollIndicatorText(SheetAppMessageModel.Loaded loaded, RealSheetState realSheetState, PaddingValues paddingValues, Modifier modifier, Composer composer, int i) {
        int i2;
        PaddingValues paddingValues2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1586581388);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(realSheetState) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            paddingValues2 = paddingValues;
            i2 |= gapComposer.changed(paddingValues2) ? 256 : 128;
        } else {
            paddingValues2 = paddingValues;
        }
        if ((i & 3072) == 0) {
            modifier2 = modifier;
            i2 |= gapComposer.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(ValueInsets.layout(ClipKt.clipToBounds(modifier2), new BalanceFeedKt$$ExternalSyntheticLambda9(realSheetState, 27)), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, paddingValues2.mo264calculateBottomPaddingD9Ej5fM() + 24.0f, 7);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            int i3 = i2;
            Modifier align = BoxScopeInstance.INSTANCE.align(Modifier.Companion.$$INSTANCE, Alignment.Companion.Center);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, align);
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
            int i4 = (i3 & 14) | ((i3 >> 9) & 112);
            Trace.m1191Iconww6aTOc(Icons.TickerDown24, (String) null, (Modifier) null, m2982getTextColorXeAY9LY(loaded, gapComposer, i4), gapComposer, 54, 4);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, m2982getTextColorXeAY9LY(loaded, gapComposer, i4), (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.message_sheet_scroll_indicator), (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(this, loaded, realSheetState, paddingValues, modifier, i, 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0363  */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r32v0, types: [com.squareup.cash.appmessages.views.sheet.SheetAppMessageView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r6v18, types: [androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* renamed from: SheetContent-3xixttE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2983SheetContent3xixttE(SheetAppMessageModel.Loaded loaded, Function1 function1, PaddingValues paddingValues, RealSheetState realSheetState, float f, Composer composer, int i) {
        int i2;
        MutableState mutableState;
        MutableFloatState mutableFloatState;
        SheetAppMessageView sheetAppMessageView;
        String str;
        SheetAppMessageModel.Loaded loaded2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1;
        boolean z;
        ?? r3;
        ?? r5;
        float f2;
        float f3;
        boolean z2;
        Colors colors;
        ScrollState scrollState;
        Object rememberedValue;
        Function1 function12;
        float f4;
        int i3;
        ?? r13;
        GapComposer gapComposer;
        Object rememberedValue2;
        boolean z3;
        Object rememberedValue3;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1971928619);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(paddingValues) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(realSheetState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(f) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changedInstance(this) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i4 = i2;
        if (gapComposer2.shouldExecute(i4 & 1, (74899 & i4) != 74898)) {
            Object rememberedValue4 = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = Updater.mutableStateOf$default(Boolean.TRUE);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState2 = (MutableState) rememberedValue4;
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer2);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue5;
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer2);
            }
            MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue6;
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer2);
            Unit unit = Unit.INSTANCE;
            int i5 = i4 & 112;
            boolean z4 = ((i4 & 7168) == 2048) | (i5 == 32);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (z4 || rememberedValue7 == neverEqualPolicy) {
                rememberedValue7 = new SheetAppMessageView$SheetContent$1$1(function1, realSheetState, (Continuation) null);
                gapComposer2.updateRememberedValue(rememberedValue7);
            }
            Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue7);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$13);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$14);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$15);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$16);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion, rememberScrollState, false, 14);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, verticalScroll$default);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$13);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$14);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$15, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$16);
            Modifier m280requiredHeight3ABfNKs = SizeKt.m280requiredHeight3ABfNKs(companion, f);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, m280requiredHeight3ABfNKs);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$13);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$14);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$15, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$16);
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), true);
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (rememberedValue8 == neverEqualPolicy) {
                mutableState = mutableState2;
                mutableFloatState = mutableFloatState2;
                rememberedValue8 = new BadgeQueries$$ExternalSyntheticLambda0(5, mutableFloatState, mutableState);
                gapComposer2.updateRememberedValue(rememberedValue8);
            } else {
                mutableState = mutableState2;
                mutableFloatState = mutableFloatState2;
            }
            int i6 = i4 & 14;
            int i7 = i4 >> 6;
            MutableState mutableState3 = mutableState;
            MutableFloatState mutableFloatState3 = mutableFloatState;
            Header(loaded, function1, RulerKt.onPlaced(m, (Function1) rememberedValue8), gapComposer2, (i7 & 7168) | (i4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE));
            GapComposer gapComposer3 = gapComposer2;
            String str2 = loaded.treehouseContentToken;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$12 = ColorKt.RectangleShape;
            if (str2 != null) {
                gapComposer3.startReplaceGroup(1891557660);
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                str = str2;
                rectangleShapeKt$RectangleShape$1 = rectangleShapeKt$RectangleShape$12;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                ScrollIndicatorText(loaded, realSheetState, paddingValues, ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(companion, 1.0f), zzabp.access$getHeaderGradientColor(loaded, gapComposer3), rectangleShapeKt$RectangleShape$12), gapComposer3, ((i4 >> 3) & 57344) | i6 | (i7 & 112) | (i4 & 896));
                sheetAppMessageView = this;
                loaded2 = loaded;
                z = false;
                gapComposer3.end(false);
            } else {
                sheetAppMessageView = this;
                str = str2;
                loaded2 = loaded;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                rectangleShapeKt$RectangleShape$1 = rectangleShapeKt$RectangleShape$12;
                gapComposer3.startReplaceGroup(1891809876);
                SpacerKt.Spacer(gapComposer3, SizeKt.m277height3ABfNKs(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(companion, 1.0f), zzabp.access$getHeaderGradientColor(loaded2, gapComposer3), rectangleShapeKt$RectangleShape$1), paddingValues.mo264calculateBottomPaddingD9Ej5fM() + 16.0f));
                z = false;
                gapComposer3.end(false);
            }
            gapComposer3.end(true);
            if (str == null) {
                gapComposer3.startReplaceGroup(-8127289);
                gapComposer3.end(z);
                r3 = z;
                r5 = gapComposer3;
            } else {
                gapComposer3.startReplaceGroup(-8127288);
                sheetAppMessageView.treehouseContent.Content(SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 200.0f, RecyclerView.DECELERATION_RATE, 2), str, loaded2.navigator, gapComposer3, 6);
                GapComposer gapComposer4 = gapComposer3;
                SpacerKt.Spacer(gapComposer4, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), ((Density) gapComposer4.consume(CompositionLocalsKt.LocalDensity)).mo233toDpu2uoSUM(parcelableSnapshotMutableIntState.getIntValue())));
                r3 = 0;
                gapComposer4.end(false);
                r5 = gapComposer4;
            }
            r5.end(true);
            ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, r5, r3);
            int hashCode4 = Long.hashCode(r5.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = r5.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(r5, companion);
            r5.startReusableNode();
            if (r5.inserting) {
                r5.createNode(layoutNode$Companion$Constructor$1);
            } else {
                r5.useNode();
            }
            Updater.m576setimpl(r5, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$13);
            Updater.m576setimpl(r5, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$14);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = composeUiNode$Companion$SetModifier$1;
            Recorder$$ExternalSyntheticOutline2.m(hashCode4, (GapComposer) r5, composeUiNode$Companion$SetModifier$17, (GapComposer) r5, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(r5, materializeModifier4, composeUiNode$Companion$SetModifier$12);
            float mo236toPx0680j_4 = ((Density) r5.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(f);
            float intValue = rememberScrollState.value$delegate.getIntValue();
            float f5 = mo236toPx0680j_4 - RecyclerView.DECELERATION_RATE;
            if (f5 != RecyclerView.DECELERATION_RATE) {
                float f6 = (0.65f * f5) + RecyclerView.DECELERATION_RATE;
                float f7 = mo236toPx0680j_4 - f6;
                if (f7 > RecyclerView.DECELERATION_RATE) {
                    float f8 = (intValue - f6) / f7;
                    f3 = 1.0f;
                    f2 = RangesKt___RangesKt.coerceIn(f8, RecyclerView.DECELERATION_RATE, 1.0f);
                    z2 = str == null && realSheetState.getExpandProgress() > RecyclerView.DECELERATION_RATE;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, f3);
                    colors = (Colors) r5.consume(ArcadeThemeKt.LocalColors);
                    if (colors != null) {
                        colors = re$$ExternalSyntheticOutline0.m((GapComposer) r5, -1762997026, (GapComposer) r5, false);
                        scrollState = rememberScrollState;
                    } else {
                        scrollState = rememberScrollState;
                        r5.startReplaceGroup(-1762997739);
                        r5.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, Color.m675copywmQWz5c$default(f2, colors.component.titleBar.background, 14), rectangleShapeKt$RectangleShape$1);
                    rememberedValue = r5.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState3, 2);
                        r5.updateRememberedValue(rememberedValue);
                    }
                    Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(RulerKt.onPlaced(m177backgroundbw27NRU, (Function1) rememberedValue), 24.0f, paddingValues.mo267calculateTopPaddingD9Ej5fM(), 24.0f, 6.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(!z2 ? SpacerKt.SpaceBetween : SpacerKt.End, Alignment.Companion.Top, r5, 0);
                    int hashCode5 = Long.hashCode(r5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = r5.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(r5, m301paddingqDBjuR0);
                    r5.startReusableNode();
                    if (r5.inserting) {
                        r5.useNode();
                    } else {
                        r5.createNode(layoutNode$Companion$Constructor$1);
                    }
                    Updater.m576setimpl(r5, rowMeasurePolicy, composeUiNode$Companion$SetModifier$13);
                    Updater.m576setimpl(r5, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$14);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode5, (GapComposer) r5, composeUiNode$Companion$SetModifier$17, (GapComposer) r5, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(r5, materializeModifier5, composeUiNode$Companion$SetModifier$12);
                    if (z2) {
                        function12 = function1;
                        f4 = f2;
                        i3 = i5;
                        r13 = 0;
                        r5.startReplaceGroup(-965891986);
                        r5.end(false);
                    } else {
                        r5.startReplaceGroup(-966211038);
                        Modifier alpha = AlphaKt.alpha(companion, realSheetState.getExpandProgress());
                        Icons icons = Icons.NavigationClose;
                        String stringResource = Room.stringResource(r5, R.string.close_button_content_description);
                        i3 = i5;
                        boolean z5 = i3 == 32;
                        Object rememberedValue9 = r5.rememberedValue();
                        if (z5 || rememberedValue9 == neverEqualPolicy) {
                            function12 = function1;
                            rememberedValue9 = new BalanceHomeViewKt$$ExternalSyntheticLambda1(14, function12);
                            r5.updateRememberedValue(rememberedValue9);
                        } else {
                            function12 = function1;
                        }
                        r13 = 0;
                        f4 = f2;
                        NavigationIcon(alpha, icons, stringResource, (Function0) rememberedValue9, r5, ((i4 >> 3) & 57344) | 48, 0);
                        r5.end(false);
                    }
                    if (loaded.shareSheet != null) {
                        r5.startReplaceGroup(-965854322);
                        r5.end(r13);
                        gapComposer = r5;
                    } else {
                        r5.startReplaceGroup(-965854321);
                        Icons icons2 = Icons.NavigationShareAndroid;
                        String stringResource2 = Room.stringResource(r5, R.string.share_button_content_description);
                        boolean z6 = i3 == 32 ? true : r13;
                        Object rememberedValue10 = r5.rememberedValue();
                        if (z6 || rememberedValue10 == neverEqualPolicy) {
                            rememberedValue10 = new BalanceHomeViewKt$$ExternalSyntheticLambda1(12, function12);
                            r5.updateRememberedValue(rememberedValue10);
                        }
                        NavigationIcon(null, icons2, stringResource2, (Function0) rememberedValue10, r5, ((i4 >> 3) & 57344) | 48, 1);
                        ?? r6 = r5;
                        r6.end(r13);
                        gapComposer = r6;
                    }
                    gapComposer.end(true);
                    ModalKt.HorizontalDivider(r13, r13, gapComposer, AlphaKt.alpha(companion, f4));
                    gapComposer.end(true);
                    Modifier align = BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter);
                    boolean z7 = (!((Boolean) mutableState3.getValue()).booleanValue() || str == null) ? r13 : true;
                    rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 != neverEqualPolicy) {
                        z3 = 1;
                        rememberedValue2 = new SvgDecoder$$ExternalSyntheticLambda0(1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    } else {
                        z3 = 1;
                    }
                    EnterTransitionImpl slideInVertically$default = EnterExitTransitionKt.slideInVertically$default(z3, (Function1) rememberedValue2);
                    rememberedValue3 = gapComposer.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new SvgDecoder$$ExternalSyntheticLambda0(z3);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    GapComposer gapComposer5 = gapComposer;
                    AnimatedContentKt.AnimatedVisibility(z7, align, slideInVertically$default, EnterExitTransitionKt.slideOutVertically$default(z3, (Function1) rememberedValue3), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-2014460147, new ComposeDialogKt$$ExternalSyntheticLambda12(scrollState, parcelableSnapshotMutableIntState, function12, loaded, 12), gapComposer), (Composer) gapComposer5, 200064, 16);
                    gapComposer2 = gapComposer5;
                    gapComposer2.end(z3);
                }
            }
            f2 = 0.0f;
            f3 = 1.0f;
            if (str == null) {
            }
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, f3);
            colors = (Colors) r5.consume(ArcadeThemeKt.LocalColors);
            if (colors != null) {
            }
            Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(fillMaxWidth2, Color.m675copywmQWz5c$default(f2, colors.component.titleBar.background, 14), rectangleShapeKt$RectangleShape$1);
            rememberedValue = r5.rememberedValue();
            if (rememberedValue == neverEqualPolicy) {
            }
            Modifier m301paddingqDBjuR02 = SpacerKt.m301paddingqDBjuR0(RulerKt.onPlaced(m177backgroundbw27NRU2, (Function1) rememberedValue), 24.0f, paddingValues.mo267calculateTopPaddingD9Ej5fM(), 24.0f, 6.0f);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(!z2 ? SpacerKt.SpaceBetween : SpacerKt.End, Alignment.Companion.Top, r5, 0);
            int hashCode52 = Long.hashCode(r5.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope52 = r5.currentCompositionLocalScope();
            Modifier materializeModifier52 = PlatformKt.materializeModifier(r5, m301paddingqDBjuR02);
            r5.startReusableNode();
            if (r5.inserting) {
            }
            Updater.m576setimpl(r5, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$13);
            Updater.m576setimpl(r5, currentCompositionLocalScope52, composeUiNode$Companion$SetModifier$14);
            Recorder$$ExternalSyntheticOutline2.m(hashCode52, (GapComposer) r5, composeUiNode$Companion$SetModifier$17, (GapComposer) r5, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(r5, materializeModifier52, composeUiNode$Companion$SetModifier$12);
            if (z2) {
            }
            if (loaded.shareSheet != null) {
            }
            gapComposer.end(true);
            ModalKt.HorizontalDivider(r13, r13, gapComposer, AlphaKt.alpha(companion, f4));
            gapComposer.end(true);
            Modifier align2 = BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter);
            if (((Boolean) mutableState3.getValue()).booleanValue()) {
            }
            rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 != neverEqualPolicy) {
            }
            EnterTransitionImpl slideInVertically$default2 = EnterExitTransitionKt.slideInVertically$default(z3, (Function1) rememberedValue2);
            rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
            }
            GapComposer gapComposer52 = gapComposer;
            AnimatedContentKt.AnimatedVisibility(z7, align2, slideInVertically$default2, EnterExitTransitionKt.slideOutVertically$default(z3, (Function1) rememberedValue3), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-2014460147, new ComposeDialogKt$$ExternalSyntheticLambda12(scrollState, parcelableSnapshotMutableIntState, function12, loaded, 12), gapComposer), (Composer) gapComposer52, 200064, 16);
            gapComposer2 = gapComposer52;
            gapComposer2.end(z3);
        } else {
            gapComposer2.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HeroCardViewKt$$ExternalSyntheticLambda35((SheetAppMessageView) this, loaded, function1, paddingValues, realSheetState, f, i);
        }
    }

    public final void Content(SheetAppMessageModel sheetAppMessageModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1176683280);
        int i2 = (gapComposer.changedInstance(sheetAppMessageModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (sheetAppMessageModel != null) {
            Content(SheetStateKt.rememberSheetState(null, gapComposer, 0, 1), sheetAppMessageModel, function1, gapComposer, (i2 << 3) & 8176);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8((Object) this, (Object) sheetAppMessageModel, function1, i, 21);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((SheetAppMessageModel) obj, function1, gapComposer, 0);
    }
}
