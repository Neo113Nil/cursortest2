package app.cash.local.views.cart;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda8;
import androidx.compose.material3.MenuKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import app.cash.badging.backend.RealBadger2$$ExternalSyntheticLambda0;
import app.cash.local.primitives.LocationMenu$$ExternalSyntheticLambda6;
import app.cash.local.viewmodels.CreateCartErrorViewModel;
import app.cash.local.viewmodels.LocalBrandLocationOpenTabViewModel;
import app.cash.local.viewmodels.OrderLimitBanner;
import app.cash.local.viewmodels.ToolbarModel;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda9;
import app.cash.local.views.toolbar.LocalToolbarKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda5;
import com.google.mlkit.common.internal.zzd;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.util.Strings;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class CartBannerViewKt {

    /* renamed from: lambda$-517684164, reason: not valid java name */
    public static final ComposableLambdaImpl f42lambda$517684164 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(8), false, -517684164);

    /* renamed from: lambda$-1401902197, reason: not valid java name */
    public static final ComposableLambdaImpl f40lambda$1401902197 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(9), false, -1401902197);

    /* renamed from: lambda$-1767803975, reason: not valid java name */
    public static final ComposableLambdaImpl f41lambda$1767803975 = new ComposableLambdaImpl(new Savers_androidKt$$ExternalSyntheticLambda0((byte) 0, 28), false, -1767803975);
    public static final ComposableLambdaImpl lambda$2120782154 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(10), false, 2120782154);
    public static final ComposableLambdaImpl lambda$1059346356 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(11), false, 1059346356);

    /* renamed from: lambda$-1169712896, reason: not valid java name */
    public static final ComposableLambdaImpl f39lambda$1169712896 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(12), false, -1169712896);

    /* renamed from: lambda$-863789513, reason: not valid java name */
    public static final ComposableLambdaImpl f43lambda$863789513 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(13), false, -863789513);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CartBannerView(Modifier modifier, String str, String str2, Function0 function0, CartBannerStyle cartBannerStyle, Composer composer, int i, int i2) {
        int i3;
        String str3;
        int i4;
        Function0 function02;
        String str4;
        Function0 function03;
        RecomposeScopeImpl endRestartGroup;
        float f;
        String str5;
        String str6;
        Icons icons = Icons.AlertFill16;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-864475159);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(18) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(str) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            str3 = str2;
            i3 |= gapComposer.changed(str3) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function02 = function0;
                i3 |= gapComposer.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked;
                if ((196608 & i) == 0) {
                    i3 |= gapComposer.changed(cartBannerStyle) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
                if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
                    gapComposer.startDefaults();
                    if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                        if (i5 != 0) {
                            str3 = null;
                        }
                        if (i4 != 0) {
                            function02 = null;
                        }
                    } else {
                        gapComposer.skipToGroupEnd();
                    }
                    String str7 = str3;
                    Function0 function04 = function02;
                    gapComposer.endDefaults();
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
                    long j = cartBannerStyle.backgroundColor;
                    float f2 = cartBannerStyle.horizontalPadding;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                    Object obj = DefaultSizes.border.entries;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
                    float f3 = cartBannerStyle.verticalPadding;
                    if (function04 != null) {
                        gapComposer.startReplaceGroup(-954947072);
                        ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                        DefaultSizes.spacing.getClass();
                        f = f2 - 8.0f;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-954853948);
                        gapComposer.end(false);
                        f = f2;
                    }
                    Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(m177backgroundbw27NRU, f2, f3, f, f3);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m301paddingqDBjuR0);
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
                    Object rememberedValue = gapComposer.rememberedValue();
                    int i6 = 14;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new LocationMenu$$ExternalSyntheticLambda6(i6);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue);
                    Painter painter = icons.painter(gapComposer);
                    long j2 = cartBannerStyle.textAndIconColor;
                    int i7 = i3;
                    ImageKt.Image(painter, null, clearAndSetSemantics, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 48, 56);
                    SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 8.0f));
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    boolean z = ((i7 & 896) == 256) | ((i7 & 7168) == 2048);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (z || rememberedValue2 == neverEqualPolicy) {
                        str5 = str7;
                        rememberedValue2 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(str, str5, 2);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    } else {
                        str5 = str7;
                    }
                    Modifier clearAndSetSemantics2 = SemanticsModifierKt.clearAndSetSemantics(layoutWeightElement, (Function1) rememberedValue2);
                    int i8 = 0;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, clearAndSetSemantics2);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    String str8 = str5;
                    long j3 = cartBannerStyle.textAndIconColor;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalTypography;
                    Room.m1165Text25TpFw(0, 0, 0, 0, (i7 >> 6) & 14, 0, 4082, j3, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal2)).labelSmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    if (str8 == null) {
                        gapComposer.startReplaceGroup(-1803132529);
                        gapComposer.end(false);
                        str6 = str8;
                    } else {
                        gapComposer.startReplaceGroup(-1803132528);
                        str6 = str8;
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, cartBannerStyle.textAndIconColor, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal2)).bodySmall, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
                        gapComposer = gapComposer;
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                    if (function04 != null) {
                        gapComposer.startReplaceGroup(-1591962235);
                        GapComposer gapComposer2 = gapComposer;
                        function03 = function04;
                        MenuKt.IconButton(function03, null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1914938938, new CartBannerViewKt$$ExternalSyntheticLambda2(cartBannerStyle, i8), gapComposer), gapComposer2, ((i7 >> 12) & 14) | 1572864, 62);
                        gapComposer = gapComposer2;
                        gapComposer.end(false);
                    } else {
                        function03 = function04;
                        gapComposer.startReplaceGroup(-1591731595);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                    str4 = str6;
                } else {
                    gapComposer.skipToGroupEnd();
                    str4 = str3;
                    function03 = function02;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3(modifier, str, str4, function03, cartBannerStyle, i, i2);
                    return;
                }
                return;
            }
            function02 = function0;
            if ((196608 & i) == 0) {
            }
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        str3 = str2;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function02 = function0;
        if ((196608 & i) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void CartOrderLimitBannerView(Modifier modifier, OrderLimitBanner orderLimitBanner, Composer composer, int i) {
        CartBannerStyle cartBannerStyle;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1498420800);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(orderLimitBanner) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            zzd zzdVar = Icons.Companion;
            String str = orderLimitBanner.title;
            String str2 = orderLimitBanner.body;
            if (orderLimitBanner.isLimitExceeded) {
                gapComposer.startReplaceGroup(-1858693068);
                CartBannerStyle errorStyle = errorStyle(gapComposer);
                gapComposer.end(false);
                cartBannerStyle = errorStyle;
            } else {
                gapComposer.startReplaceGroup(-1858641453);
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                Strings.getSizes(gapComposer).getClass();
                CartBannerStyle cartBannerStyle2 = new CartBannerStyle(16.0f, 16.0f, Strings.getColors(gapComposer).semantic.background.standard, Strings.getColors(gapComposer).semantic.text.placeholder);
                gapComposer.end(false);
                cartBannerStyle = cartBannerStyle2;
            }
            CartBannerView(modifier, str, str2, null, cartBannerStyle, gapComposer, (i2 & 14) | 48, 16);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(modifier, orderLimitBanner, i, 19);
        }
    }

    public static final void CreateCartErrorBanner(Modifier modifier, CreateCartErrorViewModel createCartErrorViewModel, Function0 function0, Composer composer, int i) {
        int i2;
        Function0 function02;
        createCartErrorViewModel.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1477714356);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(createCartErrorViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            function02 = function0;
            i2 |= gapComposer.changedInstance(function02) ? 256 : 128;
        } else {
            function02 = function0;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            zzd zzdVar = Icons.Companion;
            String str = createCartErrorViewModel.message;
            CartBannerStyle errorStyle = errorStyle(gapComposer);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            CartBannerView(modifier, str, null, function02, new CartBannerStyle(16.0f, 4.0f, errorStyle.backgroundColor, errorStyle.textAndIconColor), gapComposer, ((i2 << 6) & 57344) | (i2 & 14) | 48, 8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8(modifier, createCartErrorViewModel, function0, i, 26);
        }
    }

    public static final void CreateCartErrorBanners(int i, Composer composer, Modifier modifier, List list, Function1 function1) {
        list.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1078358510);
        int i2 = (i & 6) == 0 ? (gapComposer.changed(modifier) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier animateContentSize$default = AnimatedContentKt.animateContentSize$default(modifier, null, 3);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(4.0f, false, null), Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-436531966);
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                CreateCartErrorBanner(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), (CreateCartErrorViewModel) list.get(i3), function1, gapComposer, (i2 & 896) | 6);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CreateCartErrorBannerKt$$ExternalSyntheticLambda3(modifier, list, function1, i, 0);
        }
    }

    public static final void LocalBrandLocationOpenTabView(Modifier modifier, LocalBrandLocationOpenTabViewModel localBrandLocationOpenTabViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        modifier.getClass();
        localBrandLocationOpenTabViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-380214637);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(localBrandLocationOpenTabViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            int i3 = i2;
            if (1.0f <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            Modifier then = fillMaxWidth.then(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, then);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            ToolbarModel toolbarModel = new ToolbarModel(localBrandLocationOpenTabViewModel.title);
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(29, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            LocalToolbarKt.m1333LocalToolbarflo8M7A(companion, toolbarModel, null, (Function0) rememberedValue, RecyclerView.DECELERATION_RATE, null, gapComposer2, 6, 108);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            if (1.0f <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            Modifier then2 = fillMaxWidth2.then(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            PaddingValuesImpl m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 24.0f, 2);
            boolean changedInstance = gapComposer2.changedInstance(localBrandLocationOpenTabViewModel) | (i4 == 256);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new RealBadger2$$ExternalSyntheticLambda0(19, localBrandLocationOpenTabViewModel, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            LazyDslKt.LazyColumn(then2, null, m297PaddingValuesa9UjIt4$default, null, null, null, false, null, (Function1) rememberedValue2, gapComposer2, MLKEMEngine.KyberPolyBytes, 506);
            gapComposer2.end(true);
            DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(354792475, new LocalBrandLocationOpenTabViewKt$$ExternalSyntheticLambda2(function1, localBrandLocationOpenTabViewModel), gapComposer2), gapComposer2, 24966, 10);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(i, 1, modifier, localBrandLocationOpenTabViewModel, function1);
        }
    }

    public static CartBannerStyle errorStyle(Composer composer) {
        long Color;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
        GapComposer gapComposer = (GapComposer) composer;
        ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
        DefaultSizes.spacing.getClass();
        ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
        Color = ColorKt.Color(0.96f, 0.92f, 0.9f, 1.0f, ColorSpaces.Srgb);
        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        return new CartBannerStyle(16.0f, 16.0f, Color, colors.semantic.text.warning);
    }

    public static final void CreateCartErrorBanner(Modifier modifier, CreateCartErrorViewModel createCartErrorViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        createCartErrorViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1035753005);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(createCartErrorViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean changedInstance = gapComposer.changedInstance(createCartErrorViewModel) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new StatusRunnable$$ExternalSyntheticLambda1(29, function1, createCartErrorViewModel);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CreateCartErrorBanner(modifier, createCartErrorViewModel, (Function0) rememberedValue, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8((Object) modifier, (Object) createCartErrorViewModel, function1, i, 27);
        }
    }
}
