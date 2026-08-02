package app.cash.local.views.wallet;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.offers.viewmodels.OffersDetailsSheetViewModelV2;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalText;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* loaded from: classes3.dex */
public final /* synthetic */ class TabContentViewKt$$ExternalSyntheticLambda37 implements Function4 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda37(float f, LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder activeOrder) {
        this.f$0 = f;
        this.f$1 = activeOrder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16, types: [androidx.compose.ui.Modifier] */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Color m;
        long j;
        Modifier.Companion companion;
        Modifier modifier;
        Modifier.Companion companion2;
        Modifier.Companion companion3;
        AnnotatedString annotatedString;
        TextStyle textStyle;
        int i = this.$r8$classId;
        Object obj5 = this.f$1;
        switch (i) {
            case 0:
                LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder activeOrder = (LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder) obj5;
                Composer composer = (Composer) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((ColumnScope) obj).getClass();
                ((PaddingValues) obj2).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                    Modifier.Companion companion4 = Modifier.Companion.$$INSTANCE;
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion4, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, this.f$0, 7);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    TextStyle textStyle2 = null;
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
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    LocalImage localImage = activeOrder.brandImage;
                    LocalText localText = activeOrder.estimatedCompletionText;
                    if (localImage == null) {
                        gapComposer.startReplaceGroup(1488451122);
                        gapComposer.end(false);
                        companion3 = companion4;
                    } else {
                        gapComposer.startReplaceGroup(1488451123);
                        Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 11), 16.0f, 20.0f);
                        LocalColor localColor = localImage.placeholder_color;
                        if (localColor == null) {
                            gapComposer.startReplaceGroup(1646349216);
                            gapComposer.end(false);
                            m = null;
                        } else {
                            gapComposer.startReplaceGroup(1992770689);
                            m = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, LocalViewsKt.toComposeColor(localColor, gapComposer, 0));
                        }
                        if (m == null) {
                            gapComposer.startReplaceGroup(1992773207);
                            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            j = colors.semantic.background.subtle;
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(1992769983);
                            gapComposer.end(false);
                            j = m.value;
                        }
                        Modifier m2 = Request$Priority$EnumUnboxingLocalUtility.m(4.0f, m287sizeVpY3zN4, j, 2.0f);
                        Float ratio = LocalViewsKt.getRatio(localImage);
                        if (ratio != null) {
                            ?? aspectRatio = OffsetKt.aspectRatio(ratio.floatValue(), companion4, false);
                            companion = companion4;
                            modifier = m2;
                            companion2 = aspectRatio;
                        } else {
                            companion = companion4;
                            modifier = m2;
                            companion2 = companion;
                        }
                        companion3 = companion;
                        LocalMapKt.LocalAsyncImage(modifier, companion2, LocalViewsKt.getThemedUrl(localImage, gapComposer), ContentScale.Companion.Fit, Alignment.Companion.Center, null, null, gapComposer, 27648, 96);
                        gapComposer.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelSmall, (TextLineBalancing) null, activeOrder.brandName, (Map) null, (Function1) null, false);
                    Modifier m3 = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SpacerKt.m300paddingVpY3zN4$default(companion3, 4.0f, RecyclerView.DECELERATION_RATE, 2), true);
                    if (localText == null) {
                        gapComposer.startReplaceGroup(1489351486);
                        gapComposer.end(false);
                        annotatedString = null;
                    } else {
                        gapComposer.startReplaceGroup(-1337429725);
                        annotatedString = LocalViewsKt.toAnnotatedString(localText, gapComposer);
                        gapComposer.end(false);
                    }
                    if (annotatedString == null) {
                        annotatedString = new AnnotatedString("");
                    }
                    AnnotatedString annotatedString2 = annotatedString;
                    if (localText == null) {
                        gapComposer.startReplaceGroup(1489452422);
                    } else {
                        gapComposer.startReplaceGroup(-1337426469);
                        textStyle2 = LocalViewsKt.textStyle(localText, Strings.getTypography(gapComposer).bodySmall, gapComposer);
                    }
                    gapComposer.end(false);
                    if (textStyle2 == null) {
                        gapComposer.startReplaceGroup(-1337423879);
                        TextStyle textStyle3 = Strings.getTypography(gapComposer).bodySmall;
                        gapComposer.end(false);
                        textStyle = textStyle3;
                    } else {
                        gapComposer.startReplaceGroup(-1337427382);
                        gapComposer.end(false);
                        textStyle = textStyle2;
                    }
                    Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, m3, annotatedString2, textStyle, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion3, 16.0f);
                    Painter painter = Icons.SubtlePush16.painter(gapComposer);
                    long j2 = Strings.getColors(gapComposer).semantic.icon.standard;
                    ImageKt.Image(painter, null, m285size3ABfNKs, null, ContentScale.Companion.FillBounds, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 25008, 40);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton offerDetailsButton = (OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton) obj2;
                Composer composer2 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                offerDetailsButton.getClass();
                DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1753442881, new MusicViewKt$$ExternalSyntheticLambda4(offerDetailsButton, (Function1) obj5, this.f$0), composer2), composer2, 24576, 15);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda37(float f, Function1 function1) {
        this.f$1 = function1;
        this.f$0 = f;
    }
}
