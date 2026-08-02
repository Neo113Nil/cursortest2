package app.cash.local.views.brand.orders;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.ArcSplineKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda7;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.broadway.ui.compose.FullScreenKt$$ExternalSyntheticLambda0;
import app.cash.local.primitives.OrderStatus;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda9;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Fonts;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.util.Strings;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class BrandPinsKt {
    public static final ComposableLambdaImpl lambda$1611443178 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(27), false, 1611443178);

    /* renamed from: lambda$-346101192, reason: not valid java name */
    public static final ComposableLambdaImpl f37lambda$346101192 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(28), false, -346101192);

    /* renamed from: lambda$-1807165284, reason: not valid java name */
    public static final ComposableLambdaImpl f36lambda$1807165284 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(29), false, -1807165284);

    /* renamed from: lambda$-1272453697, reason: not valid java name */
    public static final ComposableLambdaImpl f33lambda$1272453697 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(1), false, -1272453697);

    /* renamed from: lambda$-751050276, reason: not valid java name */
    public static final ComposableLambdaImpl f38lambda$751050276 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(2), false, -751050276);

    /* renamed from: lambda$-1712474414, reason: not valid java name */
    public static final ComposableLambdaImpl f35lambda$1712474414 = new ComposableLambdaImpl(new Savers_androidKt$$ExternalSyntheticLambda0((byte) 0, 23), false, -1712474414);

    /* renamed from: lambda$-1502284357, reason: not valid java name */
    public static final ComposableLambdaImpl f34lambda$1502284357 = new ComposableLambdaImpl(new Savers_androidKt$$ExternalSyntheticLambda0((byte) 0, 24), false, -1502284357);
    public static final ComposableLambdaImpl lambda$854143642 = new ComposableLambdaImpl(new Savers_androidKt$$ExternalSyntheticLambda0((byte) 0, 25), false, 854143642);

    /* renamed from: lambda$-1084395655, reason: not valid java name */
    public static final ComposableLambdaImpl f32lambda$1084395655 = new ComposableLambdaImpl(new Savers_androidKt$$ExternalSyntheticLambda0((byte) 0, 26), false, -1084395655);

    public static final void OrderStatusRow(ColumnScope columnScope, Modifier modifier, OrderStatus orderStatus, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        boolean z;
        long j;
        Modifier modifier4;
        columnScope.getClass();
        orderStatus.getClass();
        List list = orderStatus.statuses;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(329075868);
        Applier applier = gapComposer.applier;
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 48;
            modifier2 = modifier;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 32 : 16) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(orderStatus) ? 256 : 128;
        }
        boolean z2 = true;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            modifier3 = i4 != 0 ? companion : modifier2;
            float f = 1.0f;
            InfiniteTransition.TransitionAnimationState animateFloat = ArcSplineKt.animateFloat(ArcSplineKt.rememberInfiniteTransition(null, gapComposer, 1), 1.0f, 0.2f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.tween$default(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, null, 6), RepeatMode.Reverse, 4), null, gapComposer, 4536, 8);
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(modifier3, 1.0f), 3.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j2 = colors.semantic.background.standard;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m277height3ABfNKs, j2, rectangleShapeKt$RectangleShape$1);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-1199121090);
            boolean z3 = orderStatus.cancelled;
            int i5 = orderStatus.currentStatusIndex;
            int size = list.size();
            int i6 = 0;
            while (i6 < size) {
                long j3 = Strings.getColors(gapComposer).semantic.icon.success;
                boolean z4 = z3;
                Modifier m277height3ABfNKs2 = SizeKt.m277height3ABfNKs(new LayoutWeightElement(f, z2), 3.0f);
                if (z4) {
                    gapComposer.startReplaceGroup(1355570434);
                    modifier4 = ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(gapComposer).semantic.icon.danger, rectangleShapeKt$RectangleShape$1);
                    gapComposer.end(false);
                } else if (i6 == i5 && orderStatus.inProgress) {
                    gapComposer.startReplaceGroup(1355740252);
                    boolean changed = gapComposer.changed(j3) | gapComposer.changed(animateFloat);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ModalBottomSheetKt$$ExternalSyntheticLambda7(j3, animateFloat, 1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    modifier4 = ClipKt.drawBehind(companion, (Function1) rememberedValue);
                    gapComposer.end(false);
                } else if (i6 <= i5) {
                    gapComposer.startReplaceGroup(1355889889);
                    modifier4 = ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(gapComposer).semantic.icon.success, rectangleShapeKt$RectangleShape$1);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1355988438);
                    gapComposer.end(false);
                    modifier4 = companion;
                }
                SpacerKt.Spacer(gapComposer, m277height3ABfNKs2.then(modifier4));
                i6++;
                z3 = z4;
                f = 1.0f;
                z2 = true;
            }
            boolean z5 = z3;
            gapComposer.end(false);
            gapComposer.end(true);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 1.0f);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Bottom, gapComposer, 54);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-854865237);
            int size2 = list.size();
            int i7 = 0;
            while (i7 < size2) {
                String str = (String) list.get(i7);
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodyXSmall, 0L, 0L, new FontWeight(i7 == i5 ? 500 : 400), Fonts.CashSans, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777179);
                if (i7 == i5) {
                    gapComposer.startReplaceGroup(-2090994719);
                    if (z5) {
                        gapComposer.startReplaceGroup(-2090958108);
                        j = Strings.getColors(gapComposer).semantic.text.danger;
                        z = false;
                        gapComposer.end(false);
                    } else {
                        z = false;
                        gapComposer.startReplaceGroup(-2090883615);
                        j = Strings.getColors(gapComposer).semantic.text.prominent;
                        gapComposer.end(false);
                    }
                    gapComposer.end(z);
                } else {
                    z = false;
                    gapComposer.startReplaceGroup(-2090794552);
                    j = Strings.getColors(gapComposer).semantic.text.subtle;
                    gapComposer.end(false);
                }
                GapComposer gapComposer2 = gapComposer;
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, j, (Composer) gapComposer2, (Modifier) layoutWeightElement, m994copyp1EtxEg$default, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer = gapComposer2;
                i7++;
                list = list;
                i5 = i5;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(columnScope, modifier3, orderStatus, i, i2, 0);
        }
    }

    public static final void brandPins(LocalImage localImage, Function1 function1, Composer composer, int i) {
        Color m;
        String str;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1025683872);
        int i2 = (gapComposer.changedInstance(localImage) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            RealImageLoader realImageLoader = (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader);
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            String themedUrl = LocalViewsKt.getThemedUrl(localImage, gapComposer);
            LocalColor localColor = localImage.placeholder_color;
            if (localColor == null) {
                gapComposer.startReplaceGroup(-1750618671);
                gapComposer.end(false);
                m = null;
            } else {
                gapComposer.startReplaceGroup(-2134681552);
                m = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, LocalViewsKt.toComposeColor(localColor, gapComposer, 0));
            }
            if (themedUrl != null) {
                gapComposer.startReplaceGroup(-1750528708);
                boolean changedInstance = gapComposer.changedInstance(localImage) | gapComposer.changed(density) | gapComposer.changedInstance(realImageLoader) | gapComposer.changedInstance(context) | gapComposer.changed(themedUrl) | gapComposer.changed(m) | ((i2 & 112) == 32);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    str = themedUrl;
                    BrandPinsKt$brandPins$1$1 brandPinsKt$brandPins$1$1 = new BrandPinsKt$brandPins$1$1(localImage, density, realImageLoader, context, str, m, function1, null);
                    gapComposer.updateRememberedValue(brandPinsKt$brandPins$1$1);
                    rememberedValue = brandPinsKt$brandPins$1$1;
                } else {
                    str = themedUrl;
                }
                Updater.LaunchedEffect(gapComposer, str, (Function2) rememberedValue);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1749016094);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(localImage, function1, i, 9);
        }
    }
}
