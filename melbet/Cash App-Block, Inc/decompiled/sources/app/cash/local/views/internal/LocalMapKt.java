package app.cash.local.views.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.compose.ViewfinderKt$$ExternalSyntheticLambda6;
import androidx.collection.ArrayMap;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$Horizontal;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.AppBarKt$$ExternalSyntheticLambda4;
import androidx.compose.material.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.material.IconKt$$ExternalSyntheticLambda0;
import androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.media3.ui.compose.PlayerSurfaceKt$$ExternalSyntheticLambda2;
import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.badging.backend.RealBadger2$$ExternalSyntheticLambda0;
import app.cash.local.primitives.GpsCoordinates;
import app.cash.local.primitives.LocationMenu$$ExternalSyntheticLambda6;
import app.cash.local.viewmodels.CartItemCounterViewEvent;
import app.cash.local.viewmodels.CartItemCounterViewModel;
import app.cash.local.viewmodels.FreeDeliveryMeter;
import app.cash.local.viewmodels.KeyValue;
import app.cash.local.viewmodels.LocalBottomModalViewModel;
import app.cash.local.viewmodels.LocalBrandBannerEvent$Clicked;
import app.cash.local.viewmodels.LocalBrandBannerEvent$Dismissed;
import app.cash.local.viewmodels.LocalBrandBannerModel;
import app.cash.local.viewmodels.LocalCashBalanceViewModel;
import app.cash.local.viewmodels.MenuItemAvailability;
import app.cash.local.viewmodels.PhoneRowModel;
import app.cash.local.viewmodels.internal.AddRemoveIcon;
import app.cash.local.viewmodels.toasts.ToastData;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda6;
import app.cash.local.views.cart.CartBannerViewKt$$ExternalSyntheticLambda2;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda17;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda28;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda0;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.PlatformKt;
import app.cash.paraphrase.FormattedResource;
import app.cash.redwood.treehouse.EventBridge$sendEvent$1;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda0;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda7;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda1;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.braze.Braze$$ExternalSyntheticLambda34;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda5;
import com.google.android.gms.internal.mlkit_vision_barcode.zzux;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.ComposeMapColorScheme;
import com.google.maps.android.compose.GoogleMapKt;
import com.google.maps.android.compose.MapProperties;
import com.google.maps.android.compose.MapUiSettings;
import com.google.maps.android.compose.MarkerKt;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda10;
import com.google.maps.android.compose.MarkerState;
import com.google.mlkit.common.internal.zzd;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.AlignmentLinesKt;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda5;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarKt;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.collapsingtoolbar.views.ScrollStrategy;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackLayoutWeightElement;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.datefilterbar.views.DateFilterChipKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda16;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda24;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabUI$1$1$1$2$5$1;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.profile.views.BadgeNameKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.ScoreSummaryKt$$ExternalSyntheticLambda18;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda21;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalNumberedListItem;
import com.squareup.protos.cash.local.client.v1.LocalText;
import com.squareup.util.Strings;
import com.squareup.util.android.drawable.DrawablesKt;
import com.squareup.util.cash.Countries;
import com.withpersona.sdk2.camera.feed.CameraFeedKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__ReversedViewsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import radiography.ViewStateRenderers$$ExternalSyntheticLambda5;

/* loaded from: classes3.dex */
public abstract class LocalMapKt {

    /* renamed from: lambda$-215022383, reason: not valid java name */
    public static final ComposableLambdaImpl f49lambda$215022383;

    /* renamed from: lambda$-1031045966, reason: not valid java name */
    public static final ComposableLambdaImpl f48lambda$1031045966 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(25), false, -1031045966);
    public static final ComposableLambdaImpl lambda$1673300566 = new ComposableLambdaImpl(new MarkerKt$$ExternalSyntheticLambda10(2), false, 1673300566);

    static {
        new ComposableLambdaImpl(new MarkerKt$$ExternalSyntheticLambda10(3), false, -1145668850);
        f49lambda$215022383 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(26), false, -215022383);
    }

    /* renamed from: AnimatedAlternatingText-uDo3WH8, reason: not valid java name */
    public static final void m1316AnimatedAlternatingTextuDo3WH8(String str, String str2, Modifier modifier, long j, TextStyle textStyle, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(274679464);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changed(j) ? 2048 : 1024) | (gapComposer.changed(textStyle) ? 16384 : PKIFailureInfo.certRevoked);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ZiplineLoader$ModuleJob$run$3(str2, mutableState, null, 21);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, str2, (Function2) rememberedValue2);
            String str3 = (!((Boolean) mutableState.getValue()).booleanValue() || str2 == null) ? str : str2;
            boolean z2 = ((i2 & 14) == 4) | (i4 == 32);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(str, str2, 3);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue3);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new LocationMenu$$ExternalSyntheticLambda6(26);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            AnimatedContentKt.AnimatedContent(str3, clearAndSetSemantics, (Function1) rememberedValue4, null, "alternating_text", null, Expect_jvmKt.rememberComposableLambda(875370450, new ScoreSummaryKt$$ExternalSyntheticLambda18(i3, j, textStyle), gapComposer), gapComposer, 1597824, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DateFilterChipKt$$ExternalSyntheticLambda0(str, str2, modifier, j, textStyle, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0335  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CartItemCounterView(Modifier modifier, final CartItemCounterViewModel cartItemCounterViewModel, Function1 function1, CartItemCounterStyle cartItemCounterStyle, CartItemCounterStyle cartItemCounterStyle2, Composer composer, int i, int i2) {
        int i3;
        CartItemCounterStyle cartItemCounterStyle3;
        CartItemCounterStyle cartItemCounterStyle4;
        Modifier modifier2;
        CartItemCounterStyle cartItemCounterStyle5;
        CartItemCounterStyle cartItemCounterStyle6;
        GapComposer gapComposer;
        Modifier.Companion companion;
        Modifier modifier3;
        CartItemCounterStyle cartItemCounterStyle7;
        CartItemCounterStyle cartItemCounterStyle8;
        CartItemCounterStyle cartItemCounterStyle9;
        Modifier modifier4;
        boolean z;
        Object obj;
        Throwable th;
        Object obj2;
        boolean z2;
        float fontScale;
        boolean booleanValue;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1;
        Function1 function12;
        Modifier.Companion companion2;
        Modifier modifier5;
        boolean z3;
        float f;
        Modifier adaptiveStackLayoutWeightElement;
        float f2;
        float f3;
        Modifier modifier6;
        float f4;
        float f5;
        CartItemCounterStyle cartItemCounterStyle10;
        final int i4;
        Object obj3;
        boolean z4;
        Painter painter;
        int i5;
        int i6;
        float f6;
        float f7;
        GapComposer gapComposer2;
        boolean z5;
        GapComposer gapComposer3;
        boolean z6;
        Object obj4;
        boolean z7;
        int i7;
        int i8;
        cartItemCounterViewModel.getClass();
        Integer num = cartItemCounterViewModel.maxQuantity;
        int i9 = cartItemCounterViewModel.quantity;
        CartItemCounterViewModel.Mode mode = cartItemCounterViewModel.mode;
        function1.getClass();
        GapComposer gapComposer4 = (GapComposer) composer;
        gapComposer4.startRestartGroup(-393548507);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer4.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer4.changedInstance(cartItemCounterViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer4.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                cartItemCounterStyle3 = cartItemCounterStyle;
                if (gapComposer4.changed(cartItemCounterStyle3)) {
                    i8 = 2048;
                    i3 |= i8;
                }
            } else {
                cartItemCounterStyle3 = cartItemCounterStyle;
            }
            i8 = 1024;
            i3 |= i8;
        } else {
            cartItemCounterStyle3 = cartItemCounterStyle;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                cartItemCounterStyle4 = cartItemCounterStyle2;
                if (gapComposer4.changed(cartItemCounterStyle4)) {
                    i7 = 16384;
                    i3 |= i7;
                }
            } else {
                cartItemCounterStyle4 = cartItemCounterStyle2;
            }
            i7 = PKIFailureInfo.certRevoked;
            i3 |= i7;
        } else {
            cartItemCounterStyle4 = cartItemCounterStyle2;
        }
        int i11 = i3 | 196608;
        if (gapComposer4.shouldExecute(i11 & 1, (74899 & i11) != 74898)) {
            gapComposer4.startDefaults();
            int i12 = i & 1;
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            if (i12 == 0 || gapComposer4.getDefaultsInvalid()) {
                Modifier modifier7 = i10 != 0 ? companion3 : modifier;
                if ((i2 & 8) != 0) {
                    companion = companion3;
                    i11 &= -7169;
                    cartItemCounterStyle3 = new CartItemCounterStyle(24.0f, Strings.getColors(gapComposer4).semantic.icon.prominent, Strings.getColors(gapComposer4).semantic.icon.disabled, Strings.getColors(gapComposer4).semantic.background.standard);
                } else {
                    companion = companion3;
                }
                if ((i2 & 16) != 0) {
                    modifier3 = modifier7;
                    cartItemCounterStyle7 = new CartItemCounterStyle(24.0f, Strings.getColors(gapComposer4).semantic.background.standard, Strings.getColors(gapComposer4).semantic.background.subtle, Strings.getColors(gapComposer4).semantic.icon.prominent);
                    i11 &= -57345;
                } else {
                    modifier3 = modifier7;
                    cartItemCounterStyle7 = cartItemCounterStyle2;
                }
                cartItemCounterStyle8 = cartItemCounterStyle3;
                cartItemCounterStyle9 = cartItemCounterStyle7;
                modifier4 = modifier3;
            } else {
                gapComposer4.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i11 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i11 &= -57345;
                }
                modifier4 = modifier;
                cartItemCounterStyle8 = cartItemCounterStyle3;
                cartItemCounterStyle9 = cartItemCounterStyle4;
                companion = companion3;
            }
            gapComposer4.endDefaults();
            Object rememberedValue = gapComposer4.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                z = false;
                obj = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer4);
            } else {
                z = false;
                obj = rememberedValue;
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj;
            Object rememberedValue2 = gapComposer4.rememberedValue();
            Object obj5 = rememberedValue2;
            if (rememberedValue2 == neverEqualPolicy) {
                obj5 = Recorder$$ExternalSyntheticOutline1.m(z, gapComposer4);
            }
            MutableState mutableState = (MutableState) obj5;
            Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
            Object rememberedValue3 = gapComposer4.rememberedValue();
            Object obj6 = rememberedValue3;
            if (rememberedValue3 == neverEqualPolicy) {
                CartItemCounterViewKt$CartItemCounterView$1$1 cartItemCounterViewKt$CartItemCounterView$1$1 = new CartItemCounterViewKt$CartItemCounterView$1$1(parcelableSnapshotMutableIntState, mutableState, (Continuation) null);
                gapComposer4.updateRememberedValue(cartItemCounterViewKt$CartItemCounterView$1$1);
                obj6 = cartItemCounterViewKt$CartItemCounterView$1$1;
            }
            Updater.LaunchedEffect(gapComposer4, valueOf, (Function2) obj6);
            boolean z8 = (i11 & 896) == 256;
            Object rememberedValue4 = gapComposer4.rememberedValue();
            Object obj7 = rememberedValue4;
            if (z8 || rememberedValue4 == neverEqualPolicy) {
                LocalShortlinkSheetKt$$ExternalSyntheticLambda0 localShortlinkSheetKt$$ExternalSyntheticLambda0 = new LocalShortlinkSheetKt$$ExternalSyntheticLambda0(function1, parcelableSnapshotMutableIntState, 1);
                gapComposer4.updateRememberedValue(localShortlinkSheetKt$$ExternalSyntheticLambda0);
                obj7 = localShortlinkSheetKt$$ExternalSyntheticLambda0;
            }
            final Function1 function13 = (Function1) obj7;
            Object rememberedValue5 = gapComposer4.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy) {
                CartItemCounterViewModel.Mode.Compact compact = mode instanceof CartItemCounterViewModel.Mode.Compact ? (CartItemCounterViewModel.Mode.Compact) mode : null;
                if (compact != null) {
                    th = null;
                    if (compact.expandable) {
                        z7 = true;
                        Boolean valueOf2 = Boolean.valueOf(z7);
                        gapComposer4.updateRememberedValue(valueOf2);
                        obj2 = valueOf2;
                    }
                } else {
                    th = null;
                }
                z7 = false;
                Boolean valueOf22 = Boolean.valueOf(z7);
                gapComposer4.updateRememberedValue(valueOf22);
                obj2 = valueOf22;
            } else {
                th = null;
                obj2 = rememberedValue5;
            }
            boolean booleanValue2 = ((Boolean) obj2).booleanValue();
            CartItemCounterStyle cartItemCounterStyle11 = (!booleanValue2 || (!((Boolean) mutableState.getValue()).booleanValue() && i9 <= 0)) ? cartItemCounterStyle8 : cartItemCounterStyle9;
            float f8 = cartItemCounterStyle11.size;
            long j = cartItemCounterStyle11.foregroundColor;
            int i13 = i11;
            long j2 = cartItemCounterStyle11.foregroundDisabledColor;
            long j3 = cartItemCounterStyle11.backgroundColor;
            boolean z9 = num != null && num.intValue() == 0;
            boolean z10 = !z9 && i9 > cartItemCounterViewModel.minQuantity;
            if (!z9) {
                if (i9 < (num != null ? num.intValue() : Integer.MAX_VALUE)) {
                    z2 = true;
                    fontScale = ((((Density) gapComposer4.consume(CompositionLocalsKt.LocalDensity)).getFontScale() - 1.0f) * 0.5f) + 1.0f;
                    booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                    rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1 = ContentScale.Companion.Inside;
                    boolean z11 = z9;
                    if (booleanValue && booleanValue2) {
                        gapComposer4.startReplaceGroup(1059066278);
                        if (i9 == 0) {
                            gapComposer4.startReplaceGroup(1059095015);
                            Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(modifier4, f8), RoundedCornerShapeKt.CircleShape);
                            boolean changed = gapComposer4.changed(function13) | gapComposer4.changedInstance(cartItemCounterViewModel);
                            Object rememberedValue6 = gapComposer4.rememberedValue();
                            if (changed || rememberedValue6 == neverEqualPolicy) {
                                z6 = false;
                                final boolean z12 = false ? 1 : 0;
                                Function0 function0 = new Function0() { // from class: app.cash.local.views.internal.CartItemCounterViewKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i14 = z12;
                                        CartItemCounterViewModel cartItemCounterViewModel2 = cartItemCounterViewModel;
                                        Function1 function14 = function13;
                                        switch (i14) {
                                            case 0:
                                                function14.invoke(new CartItemCounterViewEvent.Increment(cartItemCounterViewModel2.menuItemToken, cartItemCounterViewModel2.menuCategoryToken, cartItemCounterViewModel2.analyticsContext));
                                                break;
                                            case 1:
                                                int i15 = cartItemCounterViewModel2.quantity;
                                                String str = cartItemCounterViewModel2.menuItemToken;
                                                function14.invoke(i15 == 1 ? new CartItemCounterViewEvent.Trash(str) : new CartItemCounterViewEvent.Decrement(str));
                                                break;
                                            default:
                                                function14.invoke(new CartItemCounterViewEvent.Increment(cartItemCounterViewModel2.menuItemToken, cartItemCounterViewModel2.menuCategoryToken, cartItemCounterViewModel2.analyticsContext));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                gapComposer4.updateRememberedValue(function0);
                                obj4 = function0;
                            } else {
                                z6 = false;
                                obj4 = rememberedValue6;
                            }
                            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ImageKt.m183clickableoSLSa3U$default(clip, false, null, null, (Function0) obj4, 15), j3, rectangleShapeKt$RectangleShape$1);
                            Painter painter2 = Icons.Add16.painter(gapComposer4);
                            String stringResource = Room.stringResource(gapComposer4, R.string.local_views_increment);
                            long j4 = z11 ? j2 : j;
                            z5 = z6;
                            ImageKt.Image(painter2, stringResource, m177backgroundbw27NRU, null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j4, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j4), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer4, Painter.$stable | 24576, 40);
                            gapComposer4.end(z5);
                            gapComposer3 = gapComposer4;
                        } else {
                            z5 = false;
                            gapComposer4.startReplaceGroup(1059812851);
                            int i14 = cartItemCounterViewModel.quantity;
                            float f9 = f8 * fontScale;
                            Object rememberedValue7 = gapComposer4.rememberedValue();
                            Object obj8 = rememberedValue7;
                            if (rememberedValue7 == neverEqualPolicy) {
                                WalletHomeViewKt$$ExternalSyntheticLambda21 walletHomeViewKt$$ExternalSyntheticLambda21 = new WalletHomeViewKt$$ExternalSyntheticLambda21(2, parcelableSnapshotMutableIntState);
                                gapComposer4.updateRememberedValue(walletHomeViewKt$$ExternalSyntheticLambda21);
                                obj8 = walletHomeViewKt$$ExternalSyntheticLambda21;
                            }
                            m1322QuantityBadgexx3dHbM(modifier4, i14, f9, j, j3, (Function0) obj8, gapComposer4, (i13 & 14) | 196608);
                            GapComposer gapComposer5 = gapComposer4;
                            gapComposer5.end(false);
                            gapComposer3 = gapComposer5;
                        }
                        gapComposer3.end(z5);
                        modifier6 = modifier4;
                        cartItemCounterStyle10 = cartItemCounterStyle8;
                        gapComposer2 = gapComposer3;
                    } else {
                        gapComposer4.startReplaceGroup(1060204691);
                        if (booleanValue2) {
                            function12 = function13;
                            companion2 = companion;
                            modifier5 = modifier4;
                        } else {
                            function12 = function13;
                            companion2 = companion;
                            modifier5 = modifier4.then(OffsetKt.m273offsetVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                        }
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(modifier5, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 6.0f, RecyclerView.DECELERATION_RATE, 11);
                        z3 = mode instanceof CartItemCounterViewModel.Mode.Compact;
                        if (!z3) {
                            f = 32.0f;
                        } else {
                            if (!(mode instanceof CartItemCounterViewModel.Mode.Dynamic)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            f = 52.0f;
                        }
                        Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(m302paddingqDBjuR0$default, f * fontScale);
                        if (!z3) {
                            adaptiveStackLayoutWeightElement = SizeKt.m290width3ABfNKs(companion2, 95.0f * fontScale);
                            f2 = fontScale;
                        } else if (!(mode instanceof CartItemCounterViewModel.Mode.Dynamic)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        } else {
                            f2 = fontScale;
                            adaptiveStackLayoutWeightElement = new AdaptiveStackLayoutWeightElement(1.0f);
                        }
                        Modifier then = m277height3ABfNKs.then(adaptiveStackLayoutWeightElement);
                        if (!z3) {
                            f3 = 16.0f;
                        } else {
                            if (!(mode instanceof CartItemCounterViewModel.Mode.Dynamic)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            f3 = 26.0f;
                        }
                        Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(ClipKt.clip(then, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f3 * f2)), j3, rectangleShapeKt$RectangleShape$1);
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Top, gapComposer4, 6);
                        modifier6 = modifier4;
                        int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, m177backgroundbw27NRU2);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer4.applier != null) {
                            Updater.invalidApplier();
                            throw th;
                        }
                        gapComposer4.startReusableNode();
                        if (gapComposer4.inserting) {
                            gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer4.useNode();
                        }
                        Updater.m576setimpl(gapComposer4, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Modifier weight = rowScopeInstance.weight(1.0f, companion2, true);
                        if (z3) {
                            f4 = 16.0f;
                        } else {
                            if (!(mode instanceof CartItemCounterViewModel.Mode.Dynamic)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            f4 = 20.0f;
                        }
                        Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(weight, f4 * f2);
                        if (z3) {
                            f5 = 12.0f;
                        } else {
                            if (!(mode instanceof CartItemCounterViewModel.Mode.Dynamic)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            f5 = 14.0f;
                        }
                        Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(m285size3ABfNKs, f5, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                        Object rememberedValue8 = gapComposer4.rememberedValue();
                        Object obj9 = rememberedValue8;
                        if (rememberedValue8 == neverEqualPolicy) {
                            obj9 = Recorder$$ExternalSyntheticOutline2.m(gapComposer4);
                        }
                        MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj9;
                        Modifier.Companion companion4 = companion2;
                        cartItemCounterStyle10 = cartItemCounterStyle8;
                        final Function1 function14 = function12;
                        RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer4, 48, 13);
                        boolean changed2 = gapComposer4.changed(function14) | gapComposer4.changedInstance(cartItemCounterViewModel);
                        Object rememberedValue9 = gapComposer4.rememberedValue();
                        if (changed2 || rememberedValue9 == neverEqualPolicy) {
                            i4 = 1;
                            Function0 function02 = new Function0() { // from class: app.cash.local.views.internal.CartItemCounterViewKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i142 = i4;
                                    CartItemCounterViewModel cartItemCounterViewModel2 = cartItemCounterViewModel;
                                    Function1 function142 = function14;
                                    switch (i142) {
                                        case 0:
                                            function142.invoke(new CartItemCounterViewEvent.Increment(cartItemCounterViewModel2.menuItemToken, cartItemCounterViewModel2.menuCategoryToken, cartItemCounterViewModel2.analyticsContext));
                                            break;
                                        case 1:
                                            int i15 = cartItemCounterViewModel2.quantity;
                                            String str = cartItemCounterViewModel2.menuItemToken;
                                            function142.invoke(i15 == 1 ? new CartItemCounterViewEvent.Trash(str) : new CartItemCounterViewEvent.Decrement(str));
                                            break;
                                        default:
                                            function142.invoke(new CartItemCounterViewEvent.Increment(cartItemCounterViewModel2.menuItemToken, cartItemCounterViewModel2.menuCategoryToken, cartItemCounterViewModel2.analyticsContext));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer4.updateRememberedValue(function02);
                            obj3 = function02;
                        } else {
                            i4 = 1;
                            obj3 = rememberedValue9;
                        }
                        Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(m302paddingqDBjuR0$default2, mutableInteractionSourceImpl, m3400rippleYJYuY3k, z10, null, null, (Function0) obj3, 24);
                        BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                        Modifier align = rowScopeInstance.align(m182clickableO2vRcR0$default, vertical);
                        if (i9 <= i4) {
                            gapComposer4.startReplaceGroup(903313692);
                            if (z3) {
                                gapComposer4.startReplaceGroup(-1356332314);
                                painter = Icons.Clear16.painter(gapComposer4);
                                z4 = false;
                                gapComposer4.end(false);
                            } else {
                                z4 = false;
                                if (!(mode instanceof CartItemCounterViewModel.Mode.Dynamic)) {
                                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, -1356334170, false);
                                }
                                gapComposer4.startReplaceGroup(-1356330650);
                                painter = Icons.Clear24.painter(gapComposer4);
                                gapComposer4.end(false);
                            }
                            gapComposer4.end(z4);
                        } else {
                            z4 = false;
                            gapComposer4.startReplaceGroup(903481526);
                            if (z3) {
                                gapComposer4.startReplaceGroup(-1356326810);
                                painter = Icons.Subtract16.painter(gapComposer4);
                                gapComposer4.end(false);
                            } else {
                                if (!(mode instanceof CartItemCounterViewModel.Mode.Dynamic)) {
                                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, -1356328756, false);
                                }
                                gapComposer4.startReplaceGroup(-1356325050);
                                painter = Icons.Subtract24.painter(gapComposer4);
                                gapComposer4.end(false);
                            }
                            gapComposer4.end(false);
                        }
                        if (i9 <= 1) {
                            i5 = 903698433;
                            i6 = R.string.local_views_close;
                        } else {
                            i5 = 903771965;
                            i6 = R.string.local_views_decrement;
                        }
                        String m = re$$ExternalSyntheticOutline0.m(gapComposer4, i5, i6, gapComposer4, z4);
                        long j5 = z10 ? j : j2;
                        BlendModeColorFilter blendModeColorFilter = new BlendModeColorFilter(j5, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j5), ColorKt.m693toAndroidBlendModes9anfk8(5)));
                        int i15 = Painter.$stable | 24576;
                        ImageKt.Image(painter, m, align, null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, blendModeColorFilter, gapComposer4, i15, 40);
                        Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, j, (Composer) gapComposer4, rowScopeInstance.align(rowScopeInstance.weight(1.0f, companion4, true), vertical), ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, String.valueOf(i9), (Map) null, (Function1) null, false);
                        Modifier weight2 = rowScopeInstance.weight(1.0f, companion4, true);
                        if (z3) {
                            f6 = 16.0f;
                        } else {
                            if (!(mode instanceof CartItemCounterViewModel.Mode.Dynamic)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            f6 = 20.0f;
                        }
                        Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(weight2, f6 * f2);
                        if (z3) {
                            f7 = 12.0f;
                        } else {
                            if (!(mode instanceof CartItemCounterViewModel.Mode.Dynamic)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            f7 = 14.0f;
                        }
                        Modifier m302paddingqDBjuR0$default3 = SpacerKt.m302paddingqDBjuR0$default(m285size3ABfNKs2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f7, RecyclerView.DECELERATION_RATE, 11);
                        Object rememberedValue10 = gapComposer4.rememberedValue();
                        Object obj10 = rememberedValue10;
                        if (rememberedValue10 == neverEqualPolicy) {
                            obj10 = Recorder$$ExternalSyntheticOutline2.m(gapComposer4);
                        }
                        MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) obj10;
                        RippleNodeFactory m3400rippleYJYuY3k2 = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer4, 48, 13);
                        GapComposer gapComposer6 = gapComposer4;
                        boolean changed3 = gapComposer6.changed(function14) | gapComposer6.changedInstance(cartItemCounterViewModel);
                        Object rememberedValue11 = gapComposer6.rememberedValue();
                        Object obj11 = rememberedValue11;
                        if (changed3 || rememberedValue11 == neverEqualPolicy) {
                            final int i16 = 2;
                            Function0 function03 = new Function0() { // from class: app.cash.local.views.internal.CartItemCounterViewKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i142 = i16;
                                    CartItemCounterViewModel cartItemCounterViewModel2 = cartItemCounterViewModel;
                                    Function1 function142 = function14;
                                    switch (i142) {
                                        case 0:
                                            function142.invoke(new CartItemCounterViewEvent.Increment(cartItemCounterViewModel2.menuItemToken, cartItemCounterViewModel2.menuCategoryToken, cartItemCounterViewModel2.analyticsContext));
                                            break;
                                        case 1:
                                            int i152 = cartItemCounterViewModel2.quantity;
                                            String str = cartItemCounterViewModel2.menuItemToken;
                                            function142.invoke(i152 == 1 ? new CartItemCounterViewEvent.Trash(str) : new CartItemCounterViewEvent.Decrement(str));
                                            break;
                                        default:
                                            function142.invoke(new CartItemCounterViewEvent.Increment(cartItemCounterViewModel2.menuItemToken, cartItemCounterViewModel2.menuCategoryToken, cartItemCounterViewModel2.analyticsContext));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer6.updateRememberedValue(function03);
                            obj11 = function03;
                        }
                        boolean z13 = z2;
                        Modifier align2 = rowScopeInstance.align(ImageKt.m182clickableO2vRcR0$default(m302paddingqDBjuR0$default3, mutableInteractionSourceImpl2, m3400rippleYJYuY3k2, z13, null, null, (Function0) obj11, 24), vertical);
                        Painter painter3 = Icons.Add24.painter(gapComposer6);
                        String stringResource2 = Room.stringResource(gapComposer6, R.string.local_views_increment);
                        long j6 = z13 ? j : j2;
                        ImageKt.Image(painter3, stringResource2, align2, null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j6, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j6), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer6, i15, 40);
                        gapComposer6.end(true);
                        gapComposer6.end(false);
                        gapComposer2 = gapComposer6;
                    }
                    cartItemCounterStyle5 = cartItemCounterStyle9;
                    modifier2 = modifier6;
                    cartItemCounterStyle6 = cartItemCounterStyle10;
                    gapComposer = gapComposer2;
                }
            }
            z2 = false;
            fontScale = ((((Density) gapComposer4.consume(CompositionLocalsKt.LocalDensity)).getFontScale() - 1.0f) * 0.5f) + 1.0f;
            booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            ContentScale$Companion$Fit$1 contentScale$Companion$Fit$12 = ContentScale.Companion.Inside;
            boolean z112 = z9;
            if (booleanValue) {
            }
            gapComposer4.startReplaceGroup(1060204691);
            if (booleanValue2) {
            }
            Modifier m302paddingqDBjuR0$default4 = SpacerKt.m302paddingqDBjuR0$default(modifier5, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 6.0f, RecyclerView.DECELERATION_RATE, 11);
            z3 = mode instanceof CartItemCounterViewModel.Mode.Compact;
            if (!z3) {
            }
            Modifier m277height3ABfNKs2 = SizeKt.m277height3ABfNKs(m302paddingqDBjuR0$default4, f * fontScale);
            if (!z3) {
            }
            Modifier then2 = m277height3ABfNKs2.then(adaptiveStackLayoutWeightElement);
            if (!z3) {
            }
            Modifier m177backgroundbw27NRU22 = ImageKt.m177backgroundbw27NRU(ClipKt.clip(then2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f3 * f2)), j3, rectangleShapeKt$RectangleShape$1);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Top, gapComposer4, 6);
            modifier6 = modifier4;
            int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, m177backgroundbw27NRU22);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (gapComposer4.applier != null) {
            }
        } else {
            gapComposer4.skipToGroupEnd();
            modifier2 = modifier;
            cartItemCounterStyle5 = cartItemCounterStyle2;
            cartItemCounterStyle6 = cartItemCounterStyle3;
            gapComposer = gapComposer4;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3(modifier2, (Object) cartItemCounterViewModel, (Object) function1, (Object) cartItemCounterStyle6, (Object) cartItemCounterStyle5, i, i2, 4);
        }
    }

    public static final void Checkmark(boolean z, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1343698481);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            gapComposer.skipToGroupEnd();
        } else if (z) {
            gapComposer.startReplaceGroup(-1026185447);
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 18.0f);
            Painter painterResource = Countries.painterResource(R.drawable.icon_check_16, 0, gapComposer);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.component.checkbox.active.icon;
            ImageKt.Image(painterResource, Room.stringResource(gapComposer, R.string.checkbox_component), m285size3ABfNKs, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | MLKEMEngine.KyberPolyBytes, 56);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1025910477);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ViewStateRenderers$$ExternalSyntheticLambda5(i, 3, z);
        }
    }

    /* renamed from: CollapsingHeaderScaffold-_trzp-w, reason: not valid java name */
    public static final void m1317CollapsingHeaderScaffold_trzpw(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, ComposableLambdaImpl composableLambdaImpl3, CollapsingToolbarScaffoldState collapsingToolbarScaffoldState, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1627932920);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 3072 | (gapComposer.changed(collapsingToolbarScaffoldState) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            Modifier clipToBounds = ClipKt.clipToBounds(modifier);
            ScrollStrategy[] scrollStrategyArr = ScrollStrategy.$VALUES;
            CollapsingToolbarKt.CollapsingToolbarScaffold(clipToBounds, collapsingToolbarScaffoldState, false, null, Expect_jvmKt.rememberComposableLambda(554103442, new LocalViewFactory$$ExternalSyntheticLambda6(10, collapsingToolbarScaffoldState, composableLambdaImpl2, composableLambdaImpl), gapComposer), composableLambdaImpl3, gapComposer, ((i3 >> 12) & 112) | 1769856);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(modifier, composableLambdaImpl, composableLambdaImpl2, composableLambdaImpl3, collapsingToolbarScaffoldState, i, 2);
        }
    }

    public static final void DefaultBulletSeparator(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-820773116);
        int i2 = 1;
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 8.0f, RecyclerView.DECELERATION_RATE, 2);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new Yoga$$ExternalSyntheticLambda0(i2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(m300paddingVpY3zN4$default, (Function1) rememberedValue);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4080, colors.semantic.text.disabled, (Composer) gapComposer, clearAndSetSemantics, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, "•", (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkerKt$$ExternalSyntheticLambda10(i, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: DismissableToast-Tnuy9kA, reason: not valid java name */
    public static final void m1318DismissableToastTnuy9kA(Modifier modifier, ToastData toastData, Function0 function0, Duration duration, Composer composer, int i) {
        Function0 function02;
        Function0 function03;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1694017496);
        int i2 = 2;
        int i3 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(toastData) ? 32 : 16) | MLKEMEngine.KyberPolyBytes | (gapComposer.changed(duration) ? 2048 : 1024);
        int i4 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new LocalMapKt$$ExternalSyntheticLambda3(26);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function04 = (Function0) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(toastData);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            boolean changedInstance = gapComposer.changedInstance(toastData);
            Object rememberedValue3 = gapComposer.rememberedValue();
            ComposableLambdaImpl composableLambdaImpl = null;
            Object[] objArr = 0;
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new EventBridge$sendEvent$1(toastData, mutableState, objArr == true ? 1 : 0, 17);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, toastData, (Function2) rememberedValue3);
            ToastData toastData2 = (ToastData) mutableState.getValue();
            if (toastData2 == null) {
                gapComposer.startReplaceGroup(-608913961);
                gapComposer.end(false);
                function03 = function04;
            } else {
                gapComposer.startReplaceGroup(-608913960);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(modifier, 8.0f, RecyclerView.DECELERATION_RATE, 2);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1464536030, new CartBannerViewKt$$ExternalSyntheticLambda2(toastData2, 5), gapComposer);
                String str = toastData2.body;
                if (str == null) {
                    gapComposer.startReplaceGroup(-328524825);
                } else {
                    gapComposer.startReplaceGroup(-328524824);
                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(1595391641, new ToastKt$$ExternalSyntheticLambda1(str, i2), gapComposer);
                }
                gapComposer.end(false);
                int i5 = ((i3 << 12) & 29360128) | 196992;
                function03 = function04;
                ModalKt.m3380ToastBAHpl2s(m300paddingVpY3zN4$default, toastData2, rememberComposableLambda, null, composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(-332251830, new DismissableToastKt$$ExternalSyntheticLambda3(i4, function04), gapComposer), null, duration, gapComposer, i5, EnumC0170g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE);
                gapComposer.end(false);
            }
            function02 = function03;
        } else {
            gapComposer.skipToGroupEnd();
            function02 = function0;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(modifier, i, toastData, function02, duration, 0);
        }
    }

    public static final void FreeDeliveryMeterView(FreeDeliveryMeter freeDeliveryMeter, Modifier modifier, Composer composer, int i) {
        freeDeliveryMeter.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-814366412);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(freeDeliveryMeter) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(freeDeliveryMeter.progress, AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, EasingKt.FastOutSlowInEasing, 2), "free_delivery_progress", null, gapComposer, 3072, 20);
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
            String str = freeDeliveryMeter.message;
            TextStyle textStyle = Strings.getTypography(gapComposer).labelSmall;
            long j = Strings.getColors(gapComposer).semantic.text.subtle;
            gapComposer = gapComposer;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier clip = ClipKt.clip(SizeKt.m277height3ABfNKs(Request$Priority$EnumUnboxingLocalUtility.m(companion, 6.0f, gapComposer, companion, 1.0f), 4.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(2.0f));
            long j2 = Strings.getColors(gapComposer).semantic.background.subtle;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, j2, rectangleShapeKt$RectangleShape$1);
            boolean changedInstance = gapComposer.changedInstance(freeDeliveryMeter);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CachedPageEventFlow$$ExternalSyntheticLambda0(freeDeliveryMeter, 27);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m177backgroundbw27NRU, false, (Function1) rememberedValue);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, semantics);
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
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(companion, ((Number) animateFloatAsState.getValue()).floatValue()), 1.0f), Strings.getColors(gapComposer).semantic.icon.prominent, rectangleShapeKt$RectangleShape$1), gapComposer, 0);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(freeDeliveryMeter, modifier, i, 24);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InfoEntry(Modifier modifier, AnnotatedString annotatedString, AnnotatedString annotatedString2, Function2 function2, Function2 function22, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        AnnotatedString annotatedString3;
        Function2 function23;
        int i4;
        Function2 function24;
        int i5;
        Function0 function02;
        GapComposer gapComposer;
        Function2 function25;
        Function2 function26;
        Function0 function03;
        RecomposeScopeImpl endRestartGroup;
        Modifier.Companion companion;
        Function0 function04;
        annotatedString2.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-555937453);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(annotatedString) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            annotatedString3 = annotatedString2;
            i3 |= gapComposer2.changed(annotatedString3) ? 256 : 128;
        } else {
            annotatedString3 = annotatedString2;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function23 = function2;
            i3 |= gapComposer2.changedInstance(function23) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function24 = function22;
                i3 |= gapComposer2.changedInstance(function24) ? 16384 : PKIFailureInfo.certRevoked;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    function02 = function0;
                    i3 |= gapComposer2.changedInstance(function02) ? PKIFailureInfo.unsupportedVersion : 65536;
                    if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                        gapComposer = gapComposer2;
                        gapComposer.skipToGroupEnd();
                        function25 = function23;
                        function26 = function24;
                        function03 = function02;
                    } else {
                        if (i6 != 0) {
                            function23 = null;
                        }
                        function26 = i4 != 0 ? null : function24;
                        Function0 function05 = i5 != 0 ? null : function02;
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(modifier, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                        if (function05 != null) {
                            companion = companion2;
                            function04 = function05;
                            m302paddingqDBjuR0$default = m302paddingqDBjuR0$default.then(ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, function05, 15));
                        } else {
                            companion = companion2;
                            function04 = function05;
                        }
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer2, 54);
                        int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
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
                        Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                        Integer valueOf = Integer.valueOf(hashCode);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                        if (function23 == null) {
                            gapComposer2.startReplaceGroup(2126645602);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(68601471);
                            Recorder$$ExternalSyntheticOutline1.m((i3 >> 9) & 14, function23, gapComposer2, false);
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        int i7 = i3;
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                        int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, layoutWeightElement);
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        Modifier.Companion companion3 = companion;
                        Room.m1164Text25TpFw(0, 0, 0, 0, ((i7 >> 3) & 14) | 48, 0, 4080, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, (Modifier) companion3, annotatedString, Strings.getTypography(gapComposer2).listNumber, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                        Room.m1164Text25TpFw(0, 0, 0, 0, ((i7 >> 6) & 14) | 48, 0, 4080, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, (Modifier) companion3, annotatedString3, Strings.getTypography(gapComposer2).helpText, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                        gapComposer = gapComposer2;
                        gapComposer.end(true);
                        if (function26 == null) {
                            gapComposer.startReplaceGroup(2127082082);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(68615551);
                            Recorder$$ExternalSyntheticOutline1.m((i7 >> 12) & 14, function26, gapComposer, false);
                        }
                        gapComposer.end(true);
                        function25 = function23;
                        function03 = function04;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(modifier, annotatedString, annotatedString2, function25, function26, function03, i, i2, 3);
                        return;
                    }
                    return;
                }
                function02 = function0;
                if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function24 = function22;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function02 = function0;
            if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function23 = function2;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function24 = function22;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function02 = function0;
        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void KeyValueRow(Modifier modifier, KeyValue keyValue, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        long j;
        keyValue.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1194151459);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (gapComposer.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i3 | (gapComposer.changedInstance(keyValue) ? 32 : 16);
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (i4 != 0) {
                modifier2 = companion;
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier2, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer, 54);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodySmall, 0L, 0L, new FontWeight(keyValue.isBold ? 500 : 400), null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211);
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) companion, m994copyp1EtxEg$default, (TextLineBalancing) null, keyValue.key, (Map) null, (Function1) null, false);
            String str = keyValue.value;
            if (keyValue.isHighlighted) {
                gapComposer.startReplaceGroup(-522115675);
                j = Strings.getColors(gapComposer).semantic.text.success;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-522048188);
                j = Strings.getColors(gapComposer).semantic.text.standard;
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, j, (Composer) gapComposer, (Modifier) companion, m994copyp1EtxEg$default, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PlayerSurfaceKt$$ExternalSyntheticLambda2(modifier2, (Object) keyValue, i, i2, 3);
        }
    }

    public static final void LocalAddRemoveIcon(AddRemoveIcon addRemoveIcon, Function0 function0, Function0 function02, Composer composer, int i) {
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1977989318);
        int i2 = i | (gapComposer.changed(addRemoveIcon.ordinal()) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(function02) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(companion, null, 3);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, wrapContentSize$default);
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
            int ordinal = addRemoveIcon.ordinal();
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(-1148380993);
                Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 24.0f), RoundedCornerShapeKt.CircleShape), false, null, null, function0, 15);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(m183clickableoSLSa3U$default, colors.semantic.background.standard, rectangleShapeKt$RectangleShape$1), 6.0f);
                Icons icons = Icons.Add32;
                String stringResource = Room.stringResource(gapComposer, R.string.local_views_add);
                Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Trace.m1191Iconww6aTOc(icons, stringResource, m298padding3ABfNKs, colors2.semantic.icon.standard, gapComposer, 6, 0);
                gapComposer.end(false);
            } else if (ordinal == 1) {
                gapComposer.startReplaceGroup(-1147930625);
                Modifier m183clickableoSLSa3U$default2 = ImageKt.m183clickableoSLSa3U$default(ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 24.0f), RoundedCornerShapeKt.CircleShape), false, null, null, function02, 15);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                Colors colors3 = (Colors) gapComposer.consume(staticProvidableCompositionLocal2);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(m183clickableoSLSa3U$default2, colors3.semantic.icon.prominent, rectangleShapeKt$RectangleShape$1), 6.0f);
                Icons icons2 = Icons.Check32;
                String stringResource2 = Room.stringResource(gapComposer, R.string.local_views_remove);
                Colors colors4 = (Colors) gapComposer.consume(staticProvidableCompositionLocal2);
                if (colors4 == null) {
                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Trace.m1191Iconww6aTOc(icons2, stringResource2, m298padding3ABfNKs2, colors4.semantic.icon.inverse, gapComposer, 6, 0);
                gapComposer.end(false);
            } else {
                if (ordinal != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -868328980, false);
                }
                gapComposer.startReplaceGroup(-1147493370);
                Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 24.0f), RoundedCornerShapeKt.CircleShape);
                Colors colors5 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors5 == null) {
                    colors5 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                ProgressCircularKt.ProgressCircular(0, 0, gapComposer, SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(clip, colors5.component.button.standard.background.f163default, rectangleShapeKt$RectangleShape$1), 6.0f));
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Yoga$$ExternalSyntheticLambda7(addRemoveIcon, function0, function02, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LocalAsyncImage(Modifier modifier, Modifier modifier2, String str, ContentScale contentScale, Alignment alignment, String str2, Function3 function3, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier3;
        int i4;
        Alignment alignment2;
        int i5;
        Function3 function32;
        GapComposer gapComposer;
        String str3;
        Modifier modifier4;
        Alignment alignment3;
        Function3 function33;
        RecomposeScopeImpl endRestartGroup;
        modifier.getClass();
        contentScale.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1125756788);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier3 = modifier2;
            i3 |= gapComposer2.changed(modifier3) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer2.changed(str) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= gapComposer2.changed(contentScale) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                alignment2 = alignment;
                i3 |= gapComposer2.changed(alignment2) ? 16384 : PKIFailureInfo.certRevoked;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    function32 = function3;
                    i3 |= gapComposer2.changedInstance(function32) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    if (gapComposer2.shouldExecute(i3 & 1, (533651 & i3) == 533650)) {
                        gapComposer = gapComposer2;
                        gapComposer.skipToGroupEnd();
                        str3 = str2;
                        modifier4 = modifier3;
                        alignment3 = alignment2;
                        function33 = function32;
                    } else {
                        Modifier modifier5 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier3;
                        if (i4 != 0) {
                            alignment2 = Alignment.Companion.TopStart;
                        }
                        String str4 = (i2 & 32) != 0 ? null : str2;
                        Function3 function34 = i5 != 0 ? f48lambda$1031045966 : function32;
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment2, false);
                        int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
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
                        AsyncImagePainter m1446rememberAsyncImagePainter19ie5dc = AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc((i3 >> 6) & 14, 30, gapComposer2, str);
                        Function3 function35 = function34;
                        ImageKt.Image(m1446rememberAsyncImagePainter19ie5dc, null, SizeKt.fillMaxSize(modifier5, 1.0f), null, contentScale, RecyclerView.DECELERATION_RATE, null, gapComposer2, ((i3 << 3) & 57344) | 48, 104);
                        gapComposer = gapComposer2;
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = m1446rememberAsyncImagePainter19ie5dc.state;
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        AsyncImagePainter.State state = (AsyncImagePainter.State) Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1).getValue();
                        if ((state instanceof AsyncImagePainter.State.Loading) || (state instanceof AsyncImagePainter.State.Error)) {
                            gapComposer.startReplaceGroup(-1328104121);
                            function35.invoke(BoxScopeInstance.INSTANCE, gapComposer, Integer.valueOf(((i3 >> 15) & 112) | 6));
                            gapComposer.end(false);
                        } else {
                            if (!(state instanceof AsyncImagePainter.State.Empty) && !(state instanceof AsyncImagePainter.State.Success)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1328105872, false);
                            }
                            gapComposer.startReplaceGroup(-1328102530);
                            gapComposer.end(false);
                        }
                        gapComposer.end(true);
                        modifier4 = modifier5;
                        str3 = str4;
                        alignment3 = alignment2;
                        function33 = function35;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new ToastKt$$ExternalSyntheticLambda3(modifier, modifier4, str, contentScale, alignment3, str3, function33, i, i2);
                        return;
                    }
                    return;
                }
                function32 = function3;
                if (gapComposer2.shouldExecute(i3 & 1, (533651 & i3) == 533650)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            alignment2 = alignment;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            function32 = function3;
            if (gapComposer2.shouldExecute(i3 & 1, (533651 & i3) == 533650)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier3 = modifier2;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        if ((i & 3072) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        alignment2 = alignment;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        function32 = function3;
        if (gapComposer2.shouldExecute(i3 & 1, (533651 & i3) == 533650)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03de  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LocalBottomModal(Modifier modifier, LocalBottomModalViewModel localBottomModalViewModel, Function1 function1, int i, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        RecomposeScopeImpl endRestartGroup;
        int i7;
        BiasAlignment.Vertical vertical;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        boolean z;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        long j;
        int i8;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        boolean z2;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        boolean z3;
        int i9;
        GapComposer gapComposer;
        GapComposer gapComposer2;
        ?? r3;
        boolean z4;
        boolean z5;
        GapComposer gapComposer3;
        LocalBottomModalViewModel localBottomModalViewModel2 = localBottomModalViewModel;
        Function1 function12 = function1;
        BiasAlignment.Vertical vertical2 = Alignment.Companion.CenterVertically;
        localBottomModalViewModel2.getClass();
        LocalBottomModalViewModel.Title title = localBottomModalViewModel2.title;
        function12.getClass();
        GapComposer gapComposer4 = (GapComposer) composer;
        gapComposer4.startRestartGroup(865248222);
        Applier applier = gapComposer4.applier;
        if ((i2 & 6) == 0) {
            i4 = (gapComposer4.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer4.changedInstance(localBottomModalViewModel2) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer4.changedInstance(function12) ? 256 : 128;
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 = i;
            i4 |= gapComposer4.changed(i5) ? 2048 : 1024;
            if (gapComposer4.shouldExecute(i4 & 1, (i4 & 1171) == 1170)) {
                gapComposer4.skipToGroupEnd();
                i6 = i5;
            } else {
                if (i10 != 0) {
                    i5 = 0;
                }
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(modifier, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 15.0f, 7);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 0);
                int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, m302paddingqDBjuR0$default);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                int i11 = i4;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer4.startReusableNode();
                if (gapComposer4.inserting) {
                    gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer4.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer4, columnMeasurePolicy, composeUiNode$Companion$SetModifier$15);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$16);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer4, valueOf, composeUiNode$Companion$SetModifier$17);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer4, materializeModifier, composeUiNode$Companion$SetModifier$18);
                boolean z6 = localBottomModalViewModel2.enabled;
                float f = title == null ? 15.0f : RecyclerView.DECELERATION_RATE;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                ModalKt.HorizontalDivider(0, 0, gapComposer4, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f, 7));
                if (title == null) {
                    gapComposer4.startReplaceGroup(2133328546);
                    gapComposer4.end(false);
                    vertical = vertical2;
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                    r3 = 0;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                    i7 = i5;
                    z = z6;
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                    i9 = 54;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$17;
                    i8 = i11;
                    z2 = true;
                    gapComposer2 = gapComposer4;
                } else {
                    gapComposer4.startReplaceGroup(2133328547);
                    i7 = i5;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, vertical2, gapComposer4, 54);
                    int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, fillMaxWidth);
                    gapComposer4.startReusableNode();
                    vertical = vertical2;
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, rowMeasurePolicy, composeUiNode$Companion$SetModifier$15);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$16);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer4, composeUiNode$Companion$SetModifier$17, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    TitleView(Request$Priority$EnumUnboxingLocalUtility.m(gapComposer4, materializeModifier2, composeUiNode$Companion$SetModifier$18, 1.0f, false), z6, title, gapComposer4, 0);
                    String str = title.cta;
                    if (str == null) {
                        gapComposer4.startReplaceGroup(1651761124);
                        gapComposer4.end(false);
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                        z3 = false;
                        composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                        gapComposer = gapComposer4;
                        z = z6;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                        composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$17;
                        i8 = i11;
                        z2 = true;
                        i9 = 54;
                    } else {
                        gapComposer4.startReplaceGroup(1651761125);
                        SpacerKt.Spacer(gapComposer4, SizeKt.m290width3ABfNKs(companion, 6.0f));
                        Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 4.0f, 1), null, 3);
                        boolean z7 = z6 || title.ignoreDisablement;
                        Object rememberedValue = gapComposer4.rememberedValue();
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (rememberedValue == neverEqualPolicy) {
                            rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer4);
                        }
                        MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                        z = z6;
                        composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                        RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, true, RecyclerView.DECELERATION_RATE, null, gapComposer4, 48, 13);
                        Role role = new Role(0);
                        boolean z8 = (i11 & 896) == 256;
                        Object rememberedValue2 = gapComposer4.rememberedValue();
                        if (z8 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(26, function12);
                            gapComposer4.updateRememberedValue(rememberedValue2);
                        }
                        Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m182clickableO2vRcR0$default(wrapContentSize$default, mutableInteractionSourceImpl, m3400rippleYJYuY3k, z7, null, role, (Function0) rememberedValue2, 8), RecyclerView.DECELERATION_RATE, 8.0f, 1);
                        TextStyle textStyle = Strings.getTypography(gapComposer4).linkSmall;
                        int ordinal = title.textStyle.ordinal();
                        if (ordinal == 0 || ordinal == 1) {
                            gapComposer4.startReplaceGroup(1378648917);
                            j = Strings.getColors(gapComposer4).semantic.text.standard;
                            gapComposer4.end(false);
                        } else {
                            if (ordinal != 2) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, 1378645529, false);
                            }
                            gapComposer4.startReplaceGroup(1378651124);
                            j = Strings.getColors(gapComposer4).semantic.text.warning;
                            gapComposer4.end(false);
                        }
                        i8 = i11;
                        composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$17;
                        z2 = true;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        z3 = false;
                        i9 = 54;
                        Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4016, j, (Composer) gapComposer4, m300paddingVpY3zN4$default, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                        GapComposer gapComposer5 = gapComposer4;
                        gapComposer5.end(false);
                        gapComposer = gapComposer5;
                    }
                    gapComposer.end(z2);
                    gapComposer.end(z3);
                    r3 = z3;
                    gapComposer2 = gapComposer;
                }
                RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer2, r3);
                int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, companion);
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(gapComposer2, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$13);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$1);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$14, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$12);
                localBottomModalViewModel2 = localBottomModalViewModel;
                LocalBottomModalViewModel.Payload payload = localBottomModalViewModel2.payload;
                boolean z9 = payload instanceof LocalBottomModalViewModel.Payload.ItemInfo;
                int i12 = 6;
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                if (z9) {
                    gapComposer2.startReplaceGroup(-1098212971);
                    QuantityAndAmount((LocalBottomModalViewModel.Payload.ItemInfo) payload, gapComposer2, 6);
                    gapComposer2.end(r3);
                } else if (payload instanceof LocalBottomModalViewModel.Payload.OpenTabInfo) {
                    gapComposer2.startReplaceGroup(-1098126729);
                    OpenTabInfoContent(rowScopeInstance.align(rowScopeInstance.weight(1.0f, companion, z2), vertical), (LocalBottomModalViewModel.Payload.OpenTabInfo) payload, gapComposer2, r3);
                    ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, 16.0f));
                    gapComposer2.end(r3);
                } else {
                    if (payload instanceof LocalBottomModalViewModel.Payload.ItemCounter) {
                        gapComposer2.startReplaceGroup(-1097853371);
                        GapComposer gapComposer6 = gapComposer2;
                        z5 = z2;
                        z4 = r3;
                        CartItemCounterView(SizeKt.fillMaxWidth(companion, 0.5f), z ? ((LocalBottomModalViewModel.Payload.ItemCounter) payload).model : CartItemCounterViewModel.m1292copys0nK_MQ$default(((LocalBottomModalViewModel.Payload.ItemCounter) payload).model, null, null, 107), function1, null, null, gapComposer6, (i8 & 896) | 6, 56);
                        function12 = function1;
                        GapComposer gapComposer7 = gapComposer6;
                        gapComposer7.end(z4);
                        gapComposer3 = gapComposer7;
                    } else {
                        z4 = r3;
                        z5 = z2;
                        function12 = function1;
                        if (!(payload instanceof LocalBottomModalViewModel.Payload.NoPayload)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 2042782468, z4);
                        }
                        gapComposer2.startReplaceGroup(2042808252);
                        gapComposer2.end(z4);
                        gapComposer3 = gapComposer2;
                    }
                    int i13 = i7;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1257471823, new LocalBottomModalKt$$ExternalSyntheticLambda1(localBottomModalViewModel2, function12, i13), gapComposer3);
                    if (localBottomModalViewModel2.isLoading) {
                        gapComposer4 = gapComposer3;
                        gapComposer4.startReplaceGroup(-1095929077);
                        gapComposer4.startReplaceGroup(-1095635259);
                        rememberComposableLambda.invoke(rowScopeInstance, gapComposer4, Integer.valueOf(i9));
                        gapComposer4.end(z4);
                        gapComposer4.end(z4);
                    } else {
                        gapComposer3.startReplaceGroup(-1096740657);
                        Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, z4);
                        } else {
                            gapComposer3.startReplaceGroup(-1762997739);
                            gapComposer3.end(z4);
                        }
                        gapComposer4 = gapComposer3;
                        ArcadeThemeKt.ArcadeTheme(colors.isLight ? ColorsDarkKt.colorsDark : ColorsLightKt.colorsLight, null, null, Expect_jvmKt.rememberComposableLambda(475394910, new CartBannerViewKt$$ExternalSyntheticLambda2(localBottomModalViewModel2, i12), gapComposer3), gapComposer4, 3072, 6);
                        gapComposer4.end(z4);
                    }
                    gapComposer4.end(z5);
                    gapComposer4.end(z5);
                    i6 = i13;
                }
                z4 = r3;
                z5 = z2;
                function12 = function1;
                gapComposer3 = gapComposer2;
                int i132 = i7;
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1257471823, new LocalBottomModalKt$$ExternalSyntheticLambda1(localBottomModalViewModel2, function12, i132), gapComposer3);
                if (localBottomModalViewModel2.isLoading) {
                }
                gapComposer4.end(z5);
                gapComposer4.end(z5);
                i6 = i132;
            }
            endRestartGroup = gapComposer4.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new BadgeNameKt$$ExternalSyntheticLambda1(modifier, localBottomModalViewModel2, function12, i6, i2, i3);
                return;
            }
            return;
        }
        i5 = i;
        if (gapComposer4.shouldExecute(i4 & 1, (i4 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer4.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r13v12, types: [androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r13v14, types: [androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v4, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r13v5, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r13v9, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r3v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    public static final void LocalBrandBanner(Modifier modifier, final LocalBrandBannerModel localBrandBannerModel, Function1 function1, Composer composer, int i) {
        int i2;
        final LocalBrandBannerModel localBrandBannerModel2;
        GapComposer gapComposer;
        Modifier wrapContentHeight;
        Applier applier;
        Modifier.Companion companion;
        LocalBrandBannerModel.Mode mode;
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        Modifier.Companion companion2;
        boolean z4;
        float f;
        NeverEqualPolicy neverEqualPolicy;
        boolean z5;
        boolean z6;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        float f2;
        float f3;
        int i3;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        Modifier.Companion companion3;
        LocalBrandBannerModel.Mode mode2;
        Unit unit;
        ?? r3;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        Modifier.Companion companion4;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        final ?? r4;
        ?? r13;
        long j2;
        ?? r132;
        final Function1 function12 = function1;
        BiasAlignment biasAlignment = Alignment.Companion.Center;
        localBrandBannerModel.getClass();
        function12.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1964862221);
        Applier applier2 = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(localBrandBannerModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function12) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy2) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState.getValue()).booleanValue() ? 0.3f : 1.0f, null, "banner_alpha", null, gapComposer2, 3072, 22);
            ?? r133 = gapComposer2;
            r133.startReplaceGroup(-1552983258);
            r133.startReplaceGroup(-1552991307);
            r133.startReplaceGroup(-1552997098);
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(Request$Priority$EnumUnboxingLocalUtility.m(20.0f, AlphaKt.alpha(modifier, ((Number) animateFloatAsState.getValue()).floatValue()), Strings.getColors(r133).semantic.background.subtle, 12.0f), 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            LocalBrandBannerModel.Mode mode3 = localBrandBannerModel.mode;
            boolean z7 = mode3 instanceof LocalBrandBannerModel.Mode.Clickable;
            Modifier.Companion companion5 = Modifier.Companion.$$INSTANCE;
            if (z7) {
                boolean changedInstance = ((i2 & 896) == 256) | r133.changedInstance(localBrandBannerModel);
                Object rememberedValue2 = r133.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy2) {
                    final int i4 = 0;
                    rememberedValue2 = new Function0() { // from class: app.cash.local.views.internal.LocalBrandBannerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i5 = i4;
                            LocalBrandBannerModel localBrandBannerModel3 = localBrandBannerModel;
                            Function1 function13 = function12;
                            switch (i5) {
                                case 0:
                                    LocalBrandBannerModel.Type type2 = localBrandBannerModel3.f917type;
                                    LocalBrandBannerModel.Mode mode4 = localBrandBannerModel3.mode;
                                    mode4.getClass();
                                    function13.invoke(new LocalBrandBannerEvent$Clicked(type2, ((LocalBrandBannerModel.Mode.Clickable) mode4).action));
                                    break;
                                default:
                                    function13.invoke(new LocalBrandBannerEvent$Dismissed(localBrandBannerModel3.f917type));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    r133.updateRememberedValue(rememberedValue2);
                }
                wrapContentHeight = wrapContentHeight.then(ImageKt.m183clickableoSLSa3U$default(companion5, false, null, null, (Function0) rememberedValue2, 15));
            }
            r133.end(false);
            boolean z8 = mode3 instanceof LocalBrandBannerModel.Mode.Toggleable;
            if (z8) {
                boolean z9 = ((LocalBrandBannerModel.Mode.Toggleable) mode3).applied;
                applier = applier2;
                boolean changedInstance2 = ((i2 & 896) == 256) | r133.changedInstance(localBrandBannerModel);
                Object rememberedValue3 = r133.rememberedValue();
                if (changedInstance2 || rememberedValue3 == neverEqualPolicy2) {
                    rememberedValue3 = new RealBadger2$$ExternalSyntheticLambda0(28, function12, localBrandBannerModel);
                    r133.updateRememberedValue(rememberedValue3);
                }
                Modifier m337toggleableoSLSa3U$default = SelectableKt.m337toggleableoSLSa3U$default(companion5, z9, true, null, (Function1) rememberedValue3, 12);
                companion = companion5;
                wrapContentHeight = wrapContentHeight.then(m337toggleableoSLSa3U$default);
            } else {
                applier = applier2;
                companion = companion5;
            }
            r133.end(false);
            if (mode3 instanceof LocalBrandBannerModel.Mode.Fixed) {
                Unit unit2 = Unit.INSTANCE;
                Object rememberedValue4 = r133.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy2) {
                    mode = mode3;
                    rememberedValue4 = new MoneyTabUIKt$MoneyTabUI$1$1$1$2$5$1(1, mutableState);
                    r133.updateRememberedValue(rememberedValue4);
                } else {
                    mode = mode3;
                }
                wrapContentHeight = wrapContentHeight.then(SuspendingPointerInputFilterKt.pointerInput(companion, unit2, (PointerInputEventHandler) rememberedValue4));
            } else {
                mode = mode3;
            }
            r133.end(false);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, r133, 48);
            int hashCode = Long.hashCode(r133.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = r133.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(r133, wrapContentHeight);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            Color color = null;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            r133.startReusableNode();
            if (r133.inserting) {
                r133.createNode(layoutNode$Companion$Constructor$12);
            } else {
                r133.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(r133, rowMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(r133, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$16);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(r133, valueOf, composeUiNode$Companion$SetModifier$17);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(r133, ownerSnapshotObserver$onCommitAffectingLayout$13);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(r133, materializeModifier, composeUiNode$Companion$SetModifier$18);
            LocalImage localImage = localBrandBannerModel.image;
            if (localImage == null) {
                r133.startReplaceGroup(286015908);
                r133.end(false);
                z5 = z7;
                neverEqualPolicy = neverEqualPolicy2;
                companion3 = companion;
                r3 = 0;
                f3 = 48.0f;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                unit = null;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$18;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                f2 = 40.0f;
                f = 12.0f;
                i3 = i2;
                z6 = z8;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                mode2 = mode;
            } else {
                r133.startReplaceGroup(286015909);
                Modifier.Companion companion6 = companion;
                Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(SpacerKt.m302paddingqDBjuR0$default(companion6, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 11), 40.0f, 48.0f);
                LocalColor localColor = localImage.placeholder_color;
                if (localColor == null) {
                    r133.startReplaceGroup(-1917181512);
                    r133.end(false);
                    z = false;
                    z2 = z7;
                    z3 = z8;
                } else {
                    z = false;
                    r133.startReplaceGroup(2016365417);
                    z2 = z7;
                    z3 = z8;
                    color = Recorder$$ExternalSyntheticOutline1.m((GapComposer) r133, false, LocalViewsKt.toComposeColor(localColor, r133, 0));
                }
                Color color2 = color;
                if (color2 == null) {
                    r133.startReplaceGroup(2016367871);
                    j = Strings.getColors(r133).semantic.background.subtle;
                    r133.end(z);
                } else {
                    r133.startReplaceGroup(2016364709);
                    r133.end(z);
                    j = color2.value;
                }
                Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(12.0f, m287sizeVpY3zN4, j, 6.0f);
                Float ratio = LocalViewsKt.getRatio(localImage);
                if (ratio != null) {
                    z4 = false;
                    companion2 = OffsetKt.aspectRatio(ratio.floatValue(), companion6, false);
                } else {
                    companion2 = companion6;
                    z4 = false;
                }
                f = 12.0f;
                neverEqualPolicy = neverEqualPolicy2;
                z5 = z2;
                z6 = z3;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$18;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                f2 = 40.0f;
                f3 = 48.0f;
                i3 = i2;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                boolean z10 = z4;
                companion3 = companion6;
                mode2 = mode;
                LocalAsyncImage(m, companion2, LocalViewsKt.getThemedUrl(localImage, r133), ContentScale.Companion.Fit, biasAlignment, null, null, r133, 27648, 96);
                r133.end(z10);
                unit = Unit.INSTANCE;
                r3 = z10;
            }
            if (unit == null) {
                r133.startReplaceGroup(1533267075);
                companion4 = companion3;
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m287sizeVpY3zN4(SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, 11), f2, f3), Strings.getColors(r133).semantic.background.brand, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f));
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, r3);
                int hashCode2 = Long.hashCode(r133.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = r133.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(r133, m177backgroundbw27NRU);
                r133.startReusableNode();
                if (r133.inserting) {
                    r133.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    r133.useNode();
                }
                Updater.m576setimpl(r133, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$15);
                Updater.m576setimpl(r133, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$16);
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$12;
                ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, (GapComposer) r133, composeUiNode$Companion$SetModifier$13, (GapComposer) r133, ownerSnapshotObserver$onCommitAffectingLayout$12);
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$1;
                Updater.m576setimpl(r133, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                Trace.m1190Iconww6aTOc(Countries.painterResource(R.drawable.local_views_cash_balance_icon, r3, r133), (String) null, SizeKt.m285size3ABfNKs(companion4, 20.0f), Strings.getColors(r133).base.constantWhite, (Composer) r133, Painter.$stable | 432, 0);
                ?? r134 = r133;
                r4 = 1;
                r134.end(true);
                r134.end(r3);
                r13 = r134;
            } else {
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$12;
                companion4 = companion3;
                ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$1;
                r4 = 1;
                r133.startReplaceGroup(1533247142);
                r133.end(r3);
                r13 = r133;
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, r4);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, r13, r3);
            int hashCode3 = Long.hashCode(r13.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = r13.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(r13, layoutWeightElement);
            r13.startReusableNode();
            if (r13.inserting) {
                r13.createNode(layoutNode$Companion$Constructor$1);
            } else {
                r13.useNode();
            }
            Updater.m576setimpl(r13, columnMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            Updater.m576setimpl(r13, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$16);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, (GapComposer) r13, composeUiNode$Companion$SetModifier$13, (GapComposer) r13, ownerSnapshotObserver$onCommitAffectingLayout$12);
            Updater.m576setimpl(r13, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            localBrandBannerModel2 = localBrandBannerModel;
            String str = localBrandBannerModel2.label;
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(r13).bodySmall, 0L, 0L, new FontWeight(500), null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211);
            if (localBrandBannerModel2.useSuccessTextColor) {
                r13.startReplaceGroup(-1656927687);
                j2 = Strings.getColors(r13).semantic.text.success;
                r13.end(r3);
            } else {
                r13.startReplaceGroup(-1656856232);
                j2 = Strings.getColors(r13).semantic.text.standard;
                r13.end(r3);
            }
            Composer composer2 = r13;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j2, composer2, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(composer2).semantic.text.subtle, composer2, (Modifier) null, Strings.getTypography(composer2).bodySmall, (TextLineBalancing) null, localBrandBannerModel2.body, (Map) null, (Function1) null, false);
            ?? r135 = composer2;
            r135.end(r4);
            LocalBrandBannerModel.Mode mode4 = mode2;
            if (Intrinsics.areEqual(mode4, LocalBrandBannerModel.Mode.Fixed.INSTANCE) || z5) {
                function12 = function1;
                r135.startReplaceGroup(1533303957);
                r135.end(r3);
                r132 = r135;
            } else if (Intrinsics.areEqual(mode4, LocalBrandBannerModel.Mode.Dismissible.INSTANCE)) {
                r135.startReplaceGroup(287823085);
                Modifier.Companion companion7 = companion4;
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion7, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), f3);
                boolean changedInstance3 = r135.changedInstance(localBrandBannerModel2) | ((i3 & 896) == 256 ? r4 : r3);
                Object rememberedValue5 = r135.rememberedValue();
                if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
                    function12 = function1;
                    rememberedValue5 = new Function0() { // from class: app.cash.local.views.internal.LocalBrandBannerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i5 = r4;
                            LocalBrandBannerModel localBrandBannerModel3 = localBrandBannerModel2;
                            Function1 function13 = function12;
                            switch (i5) {
                                case 0:
                                    LocalBrandBannerModel.Type type2 = localBrandBannerModel3.f917type;
                                    LocalBrandBannerModel.Mode mode42 = localBrandBannerModel3.mode;
                                    mode42.getClass();
                                    function13.invoke(new LocalBrandBannerEvent$Clicked(type2, ((LocalBrandBannerModel.Mode.Clickable) mode42).action));
                                    break;
                                default:
                                    function13.invoke(new LocalBrandBannerEvent$Dismissed(localBrandBannerModel3.f917type));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    r135.updateRememberedValue(rememberedValue5);
                } else {
                    function12 = function1;
                }
                Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(m285size3ABfNKs, false, null, null, (Function0) rememberedValue5, 15);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterEnd, r3);
                int hashCode4 = Long.hashCode(r135.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = r135.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(r135, m183clickableoSLSa3U$default);
                r135.startReusableNode();
                if (r135.inserting) {
                    r135.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    r135.useNode();
                }
                Updater.m576setimpl(r135, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
                Updater.m576setimpl(r135, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$16);
                Recorder$$ExternalSyntheticOutline2.m(hashCode4, (GapComposer) r135, composeUiNode$Companion$SetModifier$13, (GapComposer) r135, ownerSnapshotObserver$onCommitAffectingLayout$12);
                Updater.m576setimpl(r135, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                Trace.m1191Iconww6aTOc(Icons.NavigationClose, Room.stringResource(r135, R.string.local_views_close), SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion7, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, 11), 16.0f), 0L, (Composer) r135, 390, 8);
                ?? r136 = r135;
                r136.end(r4);
                r136.end(r3);
                r132 = r136;
            } else {
                function12 = function1;
                if (!z6) {
                    throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) r135, 1533302481, (boolean) r3);
                }
                r135.startReplaceGroup(288293603);
                ModalKt.Toggle(MLKEMEngine.KyberPolyBytes, 2, r135, null, ((LocalBrandBannerModel.Mode.Toggleable) mode4).applied, true);
                r135.end(r3);
                r132 = r135;
            }
            r132.end(r4);
            gapComposer = r132;
        } else {
            localBrandBannerModel2 = localBrandBannerModel;
            gapComposer2.skipToGroupEnd();
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(i, 7, modifier, localBrandBannerModel2, function12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r4v35, types: [androidx.compose.ui.Modifier] */
    public static final void LocalCashActivityRow(LocalCashBalanceViewModel.Activity.Row row, Function1 function1, Composer composer, int i) {
        Modifier.Companion companion;
        Color m;
        long j;
        boolean z;
        LocalCashBalanceViewModel.Activity.Row row2 = row;
        row2.getClass();
        function1.getClass();
        ?? r12 = (GapComposer) composer;
        r12.startRestartGroup(494843992);
        Applier applier = r12.applier;
        int i2 = i | (r12.changedInstance(row2) ? 4 : 2) | (r12.changedInstance(function1) ? 32 : 16);
        if (r12.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            r12.startReplaceGroup(-1196288857);
            String str = row2.clientRoute;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (str != null) {
                boolean changed = ((i2 & 112) == 32) | r12.changed(str);
                Object rememberedValue = r12.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new P2PListViewKt$$ExternalSyntheticLambda13(function1, str, 5);
                    r12.updateRememberedValue(rememberedValue);
                }
                companion = companion2;
                companion2 = ImageKt.m183clickableoSLSa3U$default(companion2, false, null, null, (Function0) rememberedValue, 15);
            } else {
                companion = companion2;
            }
            r12.end(false);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            Strings.getSizes(r12).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(fillMaxWidth, 16.0f);
            Strings.getSizes(r12).getClass();
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            BiasAlignment.Vertical vertical = Alignment.Companion.Top;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, r12, 0);
            int hashCode = Long.hashCode(r12.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = r12.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(r12, m298padding3ABfNKs);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            r12.startReusableNode();
            if (r12.inserting) {
                r12.createNode(layoutNode$Companion$Constructor$1);
            } else {
                r12.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(r12, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(r12, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(r12, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(r12, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(r12, materializeModifier, composeUiNode$Companion$SetModifier$14);
            LocalImage localImage = row2.image;
            if (localImage == null) {
                r12.startReplaceGroup(-1803127615);
                r12.end(false);
            } else {
                r12.startReplaceGroup(-1803127614);
                LocalCashActivityRowIcon(null, localImage, row2.imageBackground, r12, 0);
                r12.end(false);
            }
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier weight = rowScopeInstance.weight(1.0f, companion, true);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, r12, 0);
            int hashCode2 = Long.hashCode(r12.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = r12.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(r12, weight);
            r12.startReusableNode();
            if (r12.inserting) {
                r12.createNode(layoutNode$Companion$Constructor$1);
            } else {
                r12.useNode();
            }
            Updater.m576setimpl(r12, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(r12, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, (GapComposer) r12, composeUiNode$Companion$SetModifier$13, (GapComposer) r12, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(r12, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, r12, 0);
            int hashCode3 = Long.hashCode(r12.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = r12.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(r12, companion);
            r12.startReusableNode();
            if (r12.inserting) {
                r12.createNode(layoutNode$Companion$Constructor$1);
            } else {
                r12.useNode();
            }
            Updater.m576setimpl(r12, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(r12, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, (GapComposer) r12, composeUiNode$Companion$SetModifier$13, (GapComposer) r12, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(r12, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(r12).semantic.text.standard, (Composer) r12, (Modifier) null, Strings.getTypography(r12).labelMedium, (TextLineBalancing) null, row2.label, (Map) null, (Function1) null, false);
            SpacerKt.Spacer(r12, rowScopeInstance.weight(1.0f, companion, true));
            row2 = row;
            LocalText localText = row2.amount;
            if (localText == null) {
                r12.startReplaceGroup(-2094236614);
                r12.end(false);
                z = false;
            } else {
                r12.startReplaceGroup(-2094236613);
                String str2 = localText.text;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                TextStyle textStyle = LocalViewsKt.textStyle(localText, Strings.getTypography(r12).labelMedium, r12);
                LocalColor localColor = localText.text_color;
                if (localColor == null) {
                    r12.startReplaceGroup(104556264);
                    r12.end(false);
                    m = null;
                } else {
                    r12.startReplaceGroup(-1797742535);
                    m = Recorder$$ExternalSyntheticOutline1.m((GapComposer) r12, false, LocalViewsKt.toComposeColor(localColor, r12, 0));
                }
                if (m == null) {
                    r12.startReplaceGroup(-1797740848);
                    j = Strings.getColors(r12).semantic.text.success;
                    r12.end(false);
                } else {
                    r12.startReplaceGroup(-1797743080);
                    r12.end(false);
                    j = m.value;
                }
                z = false;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) r12, (Modifier) null, textStyle, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                r12.end(false);
            }
            r12.end(true);
            String str4 = row2.description;
            if (str4 == null) {
                r12.startReplaceGroup(692242382);
                r12.end(z);
            } else {
                r12.startReplaceGroup(692242383);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(r12).semantic.text.subtle, (Composer) r12, (Modifier) null, Strings.getTypography(r12).bodySmall, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                r12.end(z);
            }
            String joinToString$default = CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{row2.transactedAt, row2.expiresAt}), " · ", null, null, 0, null, null, 62);
            if (joinToString$default.length() > 0) {
                r12.startReplaceGroup(692568286);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(r12).semantic.text.subtle, (Composer) r12, (Modifier) null, Strings.getTypography(r12).bodySmall, (TextLineBalancing) null, joinToString$default, (Map) null, (Function1) null, false);
                r12.end(z);
            } else {
                r12.startReplaceGroup(692739344);
                r12.end(z);
            }
            r12.end(true);
            r12.end(true);
        } else {
            r12.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = r12.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(row2, function1, i, 26);
        }
    }

    public static final void LocalCashActivityRowIcon(Modifier modifier, LocalImage localImage, LocalColor localColor, Composer composer, int i) {
        Color m;
        long j;
        localImage.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-624056769);
        int i2 = i | 6 | (gapComposer.changedInstance(localImage) ? 32 : 16) | (gapComposer.changedInstance(localColor) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String themedUrl = LocalViewsKt.getThemedUrl(localImage, gapComposer);
            modifier = Modifier.Companion.$$INSTANCE;
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(modifier, 40.0f), 48.0f);
            if (localColor == null) {
                gapComposer.startReplaceGroup(1638600530);
                gapComposer.end(false);
                m = null;
            } else {
                gapComposer.startReplaceGroup(1576878735);
                m = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, LocalViewsKt.toComposeColor(localColor, gapComposer, (i2 >> 6) & 14));
            }
            if (m == null) {
                gapComposer.startReplaceGroup(1576880613);
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
                gapComposer.startReplaceGroup(1576878412);
                gapComposer.end(false);
                j = m.value;
            }
            LocalAsyncImage(SpacerKt.m300paddingVpY3zN4$default(ImageKt.m177backgroundbw27NRU(m277height3ABfNKs, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f)), RecyclerView.DECELERATION_RATE, 12.0f, 1), null, themedUrl, ContentScale.Companion.FillHeight, null, null, null, gapComposer, 3072, 114);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Yoga$$ExternalSyntheticLambda7(modifier2, localImage, localColor, i, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [boolean, int] */
    public static final void LocalCashActivityView(Modifier modifier, LocalCashBalanceViewModel.Activity activity, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        Object obj;
        Modifier.Companion companion;
        boolean z;
        boolean z2;
        float f;
        Modifier.Companion companion2;
        boolean z3;
        activity.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1000457211);
        Applier applier = gapComposer.applier;
        int i2 = i | 6 | (gapComposer.changedInstance(activity) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion3);
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
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion3, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            BiasAlignment.Vertical vertical = Alignment.Companion.Bottom;
            Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            String str = activity.header;
            ArrayList arrayList = activity.rows;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) m, Strings.getTypography(gapComposer).sectionTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            boolean z4 = activity.hasMore;
            Object obj2 = Composer.Companion.Empty;
            if (z4) {
                gapComposer.startReplaceGroup(-1934500212);
                boolean z5 = (i2 & 896) == 256;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z5 || rememberedValue == obj2) {
                    rememberedValue = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(27, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(companion3, false, null, null, (Function0) rememberedValue, 15);
                RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, Alignment.Companion.CenterVertically, gapComposer, 48);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m183clickableoSLSa3U$default);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                obj = obj2;
                companion = companion3;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_view_all), (Map) null, (Function1) null, false);
                f = 16.0f;
                Trace.m1191Iconww6aTOc(Icons.SubtlePush16, (String) null, SizeKt.m285size3ABfNKs(companion, 16.0f), Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 438, 0);
                z = true;
                gapComposer.end(true);
                z2 = 0;
                gapComposer.end(false);
            } else {
                obj = obj2;
                companion = companion3;
                z = true;
                z2 = 0;
                f = 16.0f;
                gapComposer.startReplaceGroup(-1933936105);
                gapComposer.end(false);
            }
            Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, z, companion, 8.0f, gapComposer);
            if (arrayList.isEmpty()) {
                gapComposer.startReplaceGroup(-2043463267);
                Strings.getSizes(gapComposer).getClass();
                companion2 = companion;
                z3 = z;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_no_local_cash_row), (Map) null, (Function1) null, false);
                gapComposer.end(z2);
            } else {
                companion2 = companion;
                z3 = z;
                gapComposer.startReplaceGroup(-2043180206);
                int size = arrayList.size();
                int i3 = z2;
                while (i3 < size) {
                    ArrayList arrayList2 = arrayList;
                    LocalCashBalanceViewModel.Activity.Row row = (LocalCashBalanceViewModel.Activity.Row) arrayList2.get(i3);
                    boolean z6 = (i2 & 896) == 256 ? z3 : z2;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    Object obj3 = obj;
                    if (z6 || rememberedValue2 == obj3) {
                        rememberedValue2 = new GestureNodeKt$$ExternalSyntheticLambda0(29, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    LocalCashActivityRow(row, (Function1) rememberedValue2, gapComposer, z2);
                    i3++;
                    arrayList = arrayList2;
                    obj = obj3;
                }
                gapComposer.end(z2);
            }
            gapComposer.end(z3);
            modifier2 = companion2;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Yoga$$ExternalSyntheticLambda7((Object) modifier2, (Object) activity, function1, i, 6);
        }
    }

    public static final void LocalCombinedViews(Modifier modifier, Function2 function2, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(551179389);
        int i2 = i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            int i3 = 6;
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AppBarKt$$ExternalSyntheticLambda4(composableLambdaImpl, i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            RulerKt.SubcomposeLayout(modifier, (Function2) rememberedValue, gapComposer, 6, 0);
            function2 = lambda$1673300566;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Function2 function22 = function2;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Yoga$$ExternalSyntheticLambda7(modifier, function22, composableLambdaImpl, i, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LocalDiscountText(Modifier modifier, String str, TextStyle textStyle, Arrangement$Horizontal arrangement$Horizontal, Composer composer, int i, int i2) {
        TextStyle textStyle2;
        int i3;
        int i4;
        int i5;
        Arrangement$Horizontal arrangement$Horizontal2;
        TextStyle textStyle3;
        Modifier modifier2;
        RecomposeScopeImpl endRestartGroup;
        TextStyle textStyle4;
        int i6;
        Modifier modifier3;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-732231396);
        int i7 = i | 6;
        if ((i & 48) == 0) {
            i7 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) == 0) {
            textStyle2 = textStyle;
            if (gapComposer.changed(textStyle2)) {
                i3 = 256;
                i4 = i7 | i3;
                i5 = i2 & 8;
                if (i5 == 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    arrangement$Horizontal2 = arrangement$Horizontal;
                    i4 |= gapComposer.changed(arrangement$Horizontal2) ? 2048 : 1024;
                    if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
                        gapComposer.startDefaults();
                        if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                            if ((i2 & 4) != 0) {
                                textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                i4 &= -897;
                            }
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            if (i5 != 0) {
                                textStyle4 = textStyle2;
                                arrangement$Horizontal2 = new Arrangement$SpacedAligned(4.0f, false, null);
                            } else {
                                textStyle4 = textStyle2;
                            }
                            i6 = i4;
                            modifier3 = companion;
                        } else {
                            gapComposer.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i4 &= -897;
                            }
                            textStyle4 = textStyle2;
                            i6 = i4;
                            modifier3 = modifier;
                        }
                        gapComposer.endDefaults();
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$Horizontal2, Alignment.Companion.CenterVertically, gapComposer, (((((i6 >> 6) & 112) | 390) >> 3) & 14) | 48);
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier3);
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
                        Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        Painter painter = Icons.DiscountTag16.painter(gapComposer);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                        Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        long j = colors.semantic.icon.success;
                        Modifier modifier4 = modifier3;
                        ImageKt.Image(painter, null, null, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 48, 60);
                        Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, ((i6 >> 3) & 14) | (i6 & 896), 0, 4082, colors2.semantic.text.success, (Composer) gapComposer, (Modifier) null, textStyle4, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                        gapComposer = gapComposer;
                        gapComposer.end(true);
                        modifier2 = modifier4;
                        textStyle3 = textStyle4;
                    } else {
                        gapComposer.skipToGroupEnd();
                        textStyle3 = textStyle2;
                        modifier2 = modifier;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(modifier2, str, textStyle3, arrangement$Horizontal2, i, i2, 1);
                        return;
                    }
                    return;
                }
                arrangement$Horizontal2 = arrangement$Horizontal;
                if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
        } else {
            textStyle2 = textStyle;
        }
        i3 = 128;
        i4 = i7 | i3;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        arrangement$Horizontal2 = arrangement$Horizontal;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void LocalExpandableSection(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, ExpandableSectionStyle expandableSectionStyle, boolean z, Composer composer, int i) {
        int i2;
        ComposableLambdaImpl composableLambdaImpl3;
        GapComposer gapComposer;
        Painter painter;
        Object obj = composableLambdaImpl2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(238316993);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(obj) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(expandableSectionStyle) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(expandableSectionStyle.borderRadius);
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(modifier, expandableSectionStyle.borderWidth, expandableSectionStyle.borderColor, m340RoundedCornerShape0680j_4);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m178borderxT4_qwU);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function0);
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
            int i3 = i2;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Object[] objArr = new Object[0];
            boolean z2 = (i3 & 57344) == 16384;
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (z2 || rememberedValue == obj2) {
                rememberedValue = new Braze$$ExternalSyntheticLambda34(z, 3);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer2, 0);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean changed = gapComposer2.changed(mutableState);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == obj2) {
                rememberedValue2 = new DateInputKt$$ExternalSyntheticLambda5(19, mutableState);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Modifier clip = ClipKt.clip(SemanticsModifierKt.semantics(fillMaxWidth, true, (Function1) rememberedValue2), m340RoundedCornerShape0680j_4);
            RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, true, RecyclerView.DECELERATION_RATE, null, gapComposer2, 48, 13);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == obj2) {
                rememberedValue3 = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue3;
            boolean changed2 = gapComposer2.changed(mutableState);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue4 == obj2) {
                rememberedValue4 = new TabContentViewKt$$ExternalSyntheticLambda1(2, mutableState);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            Modifier padding = SpacerKt.padding(ImageKt.m182clickableO2vRcR0$default(clip, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, (Function0) rememberedValue4, 28), expandableSectionStyle.headerPadding);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, padding);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function0);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            composableLambdaImpl3 = composableLambdaImpl;
            Updater.CompositionLocalProvider(new ProvidedValue[]{Recorder$$ExternalSyntheticOutline2.m(Strings.getColors(gapComposer2).semantic.icon.success, ArcadeThemeKt.LocalIconColor), ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(Strings.getTypography(gapComposer2).labelSmall), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer2).semantic.text.standard, ArcadeThemeKt.LocalTextColor)}, Expect_jvmKt.rememberComposableLambda(1228735463, new AppBarKt$$ExternalSyntheticLambda4(composableLambdaImpl3, 8), gapComposer2), gapComposer2, 56);
            VerticalAlignElement verticalAlignElement = new VerticalAlignElement(expandableSectionStyle.expansionIconAlignment);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (rememberedValue5 == obj2) {
                rememberedValue5 = new Yoga$$ExternalSyntheticLambda0(2);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SemanticsModifierKt.clearAndSetSemantics(verticalAlignElement, (Function1) rememberedValue5), 24.0f);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                gapComposer2.startReplaceGroup(647502975);
                painter = Icons.CollapseCentered24.painter(gapComposer2);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(647568385);
                painter = Icons.ExpandCentered24.painter(gapComposer2);
                gapComposer2.end(false);
            }
            Painter painter2 = painter;
            long j = Strings.getColors(gapComposer2).semantic.icon.standard;
            ImageKt.Image(painter2, null, m285size3ABfNKs, null, ContentScale.Companion.None, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable | 24624, 40);
            gapComposer2.end(true);
            obj = composableLambdaImpl2;
            AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, ((Boolean) mutableState.getValue()).booleanValue(), null, null, null, null, Expect_jvmKt.rememberComposableLambda(1846803379, new BrandSheetViewKt$$ExternalSyntheticLambda1(5, expandableSectionStyle, obj), gapComposer2), gapComposer2, 1572870, 30);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            composableLambdaImpl3 = composableLambdaImpl;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(modifier, composableLambdaImpl3, obj, expandableSectionStyle, z, i, 3);
        }
    }

    public static final void LocalExpandedHeader(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1590734068);
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f));
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(systemBarsPadding, 16.0f, 88.0f, 16.0f, 28.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.Start, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m301paddingqDBjuR0);
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
            Recorder$$ExternalSyntheticOutline1.m(54, composableLambdaImpl, ColumnScopeInstance.INSTANCE, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AppBarKt$$ExternalSyntheticLambda4(i, 9, composableLambdaImpl);
        }
    }

    public static final void LocalLoadingView(boolean z, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2031681176);
        int i3 = 4;
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            KeypadKt.MooncakeShimmerBox(null, null, Expect_jvmKt.rememberComposableLambda(733916591, new MoneyTabUIKt$$ExternalSyntheticLambda16(z, (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity), i4), gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ViewStateRenderers$$ExternalSyntheticLambda5(i, i3, z);
        }
    }

    /* renamed from: LocalMap-UR9CgXA, reason: not valid java name */
    public static final void m1319LocalMapUR9CgXA(final Modifier modifier, final float f, final float f2, final LatLng latLng, final float f3, Function0 function0, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        GapComposer gapComposer;
        final Function0 function02;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1789696282);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(f) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(latLng) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(f3) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changed(false) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i3 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i3 |= gapComposer2.changedInstance(composableLambdaImpl) ? 8388608 : 4194304;
        }
        if (gapComposer2.shouldExecute(i3 & 1, (4793491 & i3) != 4793490)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = new LocalMapKt$$ExternalSyntheticLambda3(0);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Function0 function03 = (Function0) rememberedValue;
            CameraPositionState cameraPositionState = (CameraPositionState) SaverKt.m581rememberSaveable(new Object[0], (Saver) CameraPositionState.Saver, (Function0) new LocalMapKt$LocalMapUR9CgXA$$inlined$rememberCameraPositionState$1(0), (Composer) gapComposer2, 0);
            Float valueOf = Float.valueOf(f3);
            boolean changedInstance = gapComposer2.changedInstance(cameraPositionState) | gapComposer2.changedInstance(latLng) | ((i3 & 57344) == 16384);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue2 == obj) {
                rememberedValue2 = new LocalMapKt$LocalMap$2$1(cameraPositionState, latLng, f3, (Continuation) null);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(latLng, valueOf, (Function2) rememberedValue2, gapComposer2);
            int i4 = (i3 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | 4096;
            int i5 = i3 >> 3;
            gapComposer = gapComposer2;
            m1320LocalMapContentAFY4PWA(modifier, f, f2, cameraPositionState, false, function03, composableLambdaImpl, gapComposer, i4 | (i5 & 57344) | (458752 & i5) | (i5 & 3670016), 0);
            function02 = function03;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            function02 = function0;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    LocalMapKt.m1319LocalMapUR9CgXA(Modifier.this, f, f2, latLng, f3, function02, composableLambdaImpl, (Composer) obj2, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* renamed from: LocalMapContent-AFY4PWA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1320LocalMapContentAFY4PWA(final Modifier modifier, final float f, float f2, final CameraPositionState cameraPositionState, final boolean z, final Function0 function0, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2) {
        int i3;
        float f3;
        boolean z2;
        GapComposer gapComposer;
        final float f4;
        RecomposeScopeImpl endRestartGroup;
        cameraPositionState.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1147291002);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(f) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            f3 = f2;
            i3 |= gapComposer2.changed(f3) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= (i & 4096) == 0 ? gapComposer2.changed(cameraPositionState) : gapComposer2.changedInstance(cameraPositionState) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                z2 = z;
                i3 |= gapComposer2.changed(z2) ? 16384 : PKIFailureInfo.certRevoked;
            } else {
                z2 = z;
            }
            if ((196608 & i) == 0) {
                i3 |= gapComposer2.changedInstance(function0) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                i3 |= gapComposer2.changedInstance(composableLambdaImpl) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            }
            if (gapComposer2.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                f4 = f3;
            } else {
                float f5 = i4 != 0 ? 8.0f : f3;
                Context context = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
                MapStyleOptions loadRawResourceStyle = ImageKt.isSystemInDarkTheme(gapComposer2) ? MapStyleOptions.loadRawResourceStyle(context, R.raw.local_views_map_style_dark) : MapStyleOptions.loadRawResourceStyle(context, R.raw.local_views_map_style_lite);
                Modifier clip = ClipKt.clip(OffsetKt.aspectRatio(f, SizeKt.fillMaxWidth(modifier, 1.0f), false), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f5));
                MapUiSettings mapUiSettings = new MapUiSettings(false, false, false, false, false, z2, false, false, false, z);
                int i5 = i3;
                MapProperties mapProperties = new MapProperties(false, null, loadRawResourceStyle, 479);
                ComposeMapColorScheme composeMapColorScheme = ImageKt.isSystemInDarkTheme(gapComposer2) ? ComposeMapColorScheme.DARK : ComposeMapColorScheme.LIGHT;
                int i6 = 458752 & i5;
                boolean z3 = i6 == 131072;
                Object rememberedValue = gapComposer2.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (z3 || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new LocalMapKt$$ExternalSyntheticLambda10(0, function0);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                Function1 function1 = (Function1) rememberedValue;
                boolean z4 = i6 == 131072;
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (z4 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new LocalMapKt$$ExternalSyntheticLambda10(9, function0);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                Function1 function12 = (Function1) rememberedValue2;
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new LocalMapKt$$ExternalSyntheticLambda3(27);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                Function0 function02 = (Function0) rememberedValue3;
                boolean z5 = i6 == 131072;
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (z5 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new LocalMapKt$$ExternalSyntheticLambda10(10, function0);
                    gapComposer2.updateRememberedValue(rememberedValue4);
                }
                Function1 function13 = (Function1) rememberedValue4;
                boolean z6 = i6 == 131072;
                Object rememberedValue5 = gapComposer2.rememberedValue();
                if (z6 || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new LocalMapKt$$ExternalSyntheticLambda10(11, function0);
                    gapComposer2.updateRememberedValue(rememberedValue5);
                }
                gapComposer = gapComposer2;
                GoogleMapKt.GoogleMap(clip, cameraPositionState, null, mapProperties, mapUiSettings, null, function1, function12, function02, function13, (Function1) rememberedValue5, null, composeMapColorScheme, null, composableLambdaImpl, gapComposer, 512 | ((i5 >> 3) & 896), (234881024 & (i5 << 6)) | 48, 168282);
                f4 = f5;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new Function2() { // from class: app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        LocalMapKt.m1320LocalMapContentAFY4PWA(Modifier.this, f, f4, cameraPositionState, z, function0, composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        f3 = f2;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (gapComposer2.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void LocalMapMarker(LatLng latLng, Bitmap bitmap, Composer composer, int i) {
        GapComposer gapComposer;
        bitmap.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(553078687);
        int i2 = 4;
        int i3 = (gapComposer2.changedInstance(latLng) ? 4 : 2) | i | (gapComposer2.changedInstance(bitmap) ? 32 : 16);
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            MarkerState rememberUpdatedMarkerState = MarkerKt.rememberUpdatedMarkerState(latLng, gapComposer2, 0);
            BitmapDescriptor fromBitmap = CameraFeedKt.fromBitmap(bitmap);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new Yoga$$ExternalSyntheticLambda0(3);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new Yoga$$ExternalSyntheticLambda0(i2);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Function1 function12 = (Function1) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new Yoga$$ExternalSyntheticLambda0(5);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Function1 function13 = (Function1) rememberedValue3;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new Yoga$$ExternalSyntheticLambda0(6);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            gapComposer = gapComposer2;
            MarkerKt.m2057Markerqld6geY(rememberUpdatedMarkerState, null, RecyclerView.DECELERATION_RATE, 0L, fromBitmap, 0L, false, function1, function12, function13, (Function1) rememberedValue4, gapComposer, 0, 14376960, 16318);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(latLng, bitmap, i, 0);
        }
    }

    public static final void LocalMenuAvailabilityText(Modifier modifier, MenuItemAvailability menuItemAvailability, boolean z, LocalMenuAvailabilityTextStyle localMenuAvailabilityTextStyle, Composer composer, int i, int i2) {
        LocalMenuAvailabilityTextStyle localMenuAvailabilityTextStyle2;
        LocalMenuAvailabilityTextStyle localMenuAvailabilityTextStyle3;
        Modifier modifier2;
        Modifier modifier3;
        String m;
        FormattedResource formattedResource;
        int i3;
        menuItemAvailability.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(475781377);
        int i4 = i | 6;
        if ((i & 48) == 0) {
            i4 |= gapComposer.changedInstance(menuItemAvailability) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                localMenuAvailabilityTextStyle2 = localMenuAvailabilityTextStyle;
                if (gapComposer.changed(localMenuAvailabilityTextStyle2)) {
                    i3 = 2048;
                    i4 |= i3;
                }
            } else {
                localMenuAvailabilityTextStyle2 = localMenuAvailabilityTextStyle;
            }
            i3 = 1024;
            i4 |= i3;
        } else {
            localMenuAvailabilityTextStyle2 = localMenuAvailabilityTextStyle;
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                int i5 = i2 & 8;
                modifier3 = Modifier.Companion.$$INSTANCE;
                if (i5 != 0) {
                    localMenuAvailabilityTextStyle2 = smallStyle(gapComposer);
                }
            } else {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier;
            }
            gapComposer.endDefaults();
            boolean z2 = menuItemAvailability instanceof MenuItemAvailability.Available;
            MenuItemAvailability.SoldOut soldOut = MenuItemAvailability.SoldOut.INSTANCE;
            if (z2) {
                gapComposer.startReplaceGroup(-32148612);
                MenuItemAvailability.Available available = (MenuItemAvailability.Available) menuItemAvailability;
                String str = available.price;
                if (str == null) {
                    str = "";
                }
                String str2 = available.originalPriceBeforeDeal;
                if (str2 != null) {
                    if (!z) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        formattedResource = new FormattedResource(R.string.local_views_item_price_discount_content_description, new Object[]{str, str2});
                        m = zzux.formattedResource(formattedResource, gapComposer);
                        gapComposer.end(false);
                    }
                }
                formattedResource = new FormattedResource(R.string.local_views_item_price_content_description, new Object[]{str});
                m = zzux.formattedResource(formattedResource, gapComposer);
                gapComposer.end(false);
            } else {
                if (!menuItemAvailability.equals(soldOut)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -2079247998, false);
                }
                m = re$$ExternalSyntheticOutline0.m(gapComposer, -2079235633, R.string.local_views_item_sold_out_content_description, gapComposer, false);
            }
            boolean changed = gapComposer.changed(m);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new IconKt$$ExternalSyntheticLambda0(m, 27);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier3, (Function1) rememberedValue);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(localMenuAvailabilityTextStyle2.horizontalSpacing, false, null), Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clearAndSetSemantics);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (z2) {
                gapComposer.startReplaceGroup(-1369181858);
                MenuItemAvailability.Available available2 = (MenuItemAvailability.Available) menuItemAvailability;
                String str3 = available2.price;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, localMenuAvailabilityTextStyle2.defaultTextColor, (Composer) gapComposer, (Modifier) null, localMenuAvailabilityTextStyle2.defaultTextStyle, (TextLineBalancing) null, str3 == null ? "" : str3, (Map) null, (Function1) null, false);
                String str4 = available2.originalPriceBeforeDeal;
                String str5 = (str4 == null || !z) ? null : str4;
                if (str5 == null) {
                    gapComposer.startReplaceGroup(-1368931286);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1368931285);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, localMenuAvailabilityTextStyle2.strikethroughTextColor, (Composer) gapComposer, (Modifier) null, localMenuAvailabilityTextStyle2.strikethroughTextStyle, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            } else {
                if (!menuItemAvailability.equals(soldOut)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 787115677, false);
                }
                gapComposer.startReplaceGroup(-1368728824);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, localMenuAvailabilityTextStyle2.soldOutTextColor, (Composer) gapComposer, (Modifier) null, localMenuAvailabilityTextStyle2.soldOutTextStyle, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_sold_out), (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            Modifier modifier4 = modifier3;
            localMenuAvailabilityTextStyle3 = localMenuAvailabilityTextStyle2;
            modifier2 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            localMenuAvailabilityTextStyle3 = localMenuAvailabilityTextStyle2;
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(modifier2, (Object) menuItemAvailability, z, (Object) localMenuAvailabilityTextStyle3, i, i2, 4);
        }
    }

    public static final void LocalNumberedList(int i, Composer composer, Modifier modifier, List list) {
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2011159035);
        int i2 = 2;
        int i3 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(list) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
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
            gapComposer.startReplaceGroup(-268255038);
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                LocalNumberedListItem((LocalNumberedListItem) list.get(i4), gapComposer, 0);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda17(modifier, list, i, i2);
        }
    }

    public static final void LocalNumberedListItem(LocalNumberedListItem localNumberedListItem, Composer composer, int i) {
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1864199777);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(localNumberedListItem) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            long sp = Room.getSp(24);
            float mo231toDpGaN1DYA = density.mo231toDpGaN1DYA(sp);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 48);
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
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m275defaultMinSizeVpY3zN4(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7), mo231toDpGaN1DYA, mo231toDpGaN1DYA), Strings.getColors(gapComposer).semantic.icon.standard, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(mo231toDpGaN1DYA));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.inverse, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).listNumber, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 0, sp, null, null, 0, 16646143), (TextLineBalancing) null, String.valueOf(localNumberedListItem.index), (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
            String str = localNumberedListItem.header_label;
            if (str == null) {
                gapComposer.startReplaceGroup(-1476646802);
                gapComposer.end(false);
                z = false;
            } else {
                gapComposer.startReplaceGroup(-1476646801);
                z = false;
                LazyDslKt.m304MarkdownTextpCuZGqc(str, null, null, Strings.getTypography(gapComposer).labelMedium, 0L, null, null, null, 0, 0, 0, gapComposer, 48, 2036);
                gapComposer.end(false);
            }
            String str2 = localNumberedListItem.body;
            if (str2 == null) {
                gapComposer.startReplaceGroup(-1476523019);
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(-1476523018);
                LazyDslKt.m304MarkdownTextpCuZGqc(str2, null, null, Strings.getTypography(gapComposer).bodyMedium, Strings.getColors(gapComposer).semantic.text.subtle, null, null, null, 0, 0, 0, gapComposer, 48, 2020);
                gapComposer.end(z);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CartBannerViewKt$$ExternalSyntheticLambda2(localNumberedListItem, i, 8);
        }
    }

    public static final void LocalPhoneRow(Modifier modifier, PhoneRowModel phoneRowModel, Function1 function1, Composer composer, int i) {
        int i2;
        boolean z;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(497551325);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(phoneRowModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = (i2 & 7168) == 2048;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(28, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(modifier, false, null, null, (Function0) rememberedValue, 15);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m183clickableoSLSa3U$default);
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
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            String str = phoneRowModel.label;
            gapComposer.startReplaceGroup(996090879);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                z = false;
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                z = false;
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.disabled;
            gapComposer.end(z);
            gapComposer.startReplaceGroup(996095553);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
            gapComposer.end(z);
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, j, (Composer) gapComposer, (Modifier) companion, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            String str2 = phoneRowModel.number;
            long j2 = Strings.getColors(gapComposer).semantic.text.standard;
            gapComposer.startReplaceGroup(996104450);
            TextStyle textStyle2 = Strings.getTypography(gapComposer).labelMedium;
            gapComposer.end(z);
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, j2, (Composer) gapComposer, (Modifier) companion, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7), 24.0f);
            Painter painter = Icons.CommPhoneFill24.painter(gapComposer);
            long j3 = Strings.getColors(gapComposer).semantic.icon.extraSubtle;
            ImageKt.Image(painter, null, m285size3ABfNKs, null, ContentScale.Companion.None, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j3, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j3), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 25008, 40);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(i, 8, modifier, phoneRowModel, function1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0044  */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LocalRadio(boolean z, Modifier modifier, MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z2, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        int i6;
        Function0 function02;
        boolean z3;
        Modifier modifier3;
        Function0 function03;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        int i7;
        Modifier.Companion companion;
        RadioColors radioColors;
        GapComposer gapComposer2;
        boolean z4;
        float f;
        ?? r10;
        Modifier modifier4;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-295421616);
        if ((i & 6) == 0) {
            i3 = (gapComposer3.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer3.changed(modifier2) ? 32 : 16;
            i4 = i3 | MLKEMEngine.KyberPolyBytes;
            i5 = i2 & 8;
            if (i5 == 0) {
                i4 = i3 | 3456;
            } else if ((i & 3072) == 0) {
                i4 |= gapComposer3.changed(z2) ? 2048 : 1024;
                i6 = i2 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    function02 = function0;
                    i4 |= gapComposer3.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked;
                    if (gapComposer3.shouldExecute(i4 & 1, (i4 & 9363) == 9362)) {
                        gapComposer3.skipToGroupEnd();
                        z3 = z2;
                        modifier3 = modifier2;
                        function03 = function02;
                        mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                        gapComposer = gapComposer3;
                    } else {
                        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                        Modifier modifier5 = i8 != 0 ? companion2 : modifier2;
                        Object rememberedValue = gapComposer3.rememberedValue();
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (rememberedValue == neverEqualPolicy) {
                            rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer3);
                        }
                        MutableInteractionSourceImpl mutableInteractionSourceImpl4 = (MutableInteractionSourceImpl) rememberedValue;
                        if (i5 != 0) {
                            i7 = i4;
                            z3 = true;
                        } else {
                            i7 = i4;
                            z3 = z2;
                        }
                        Function0 function04 = i6 != 0 ? null : function02;
                        Object rememberedValue2 = gapComposer3.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new ArrayMap(1);
                            gapComposer3.updateRememberedValue(rememberedValue2);
                        }
                        ArrayMap arrayMap = (ArrayMap) rememberedValue2;
                        if (z) {
                            gapComposer3.startReplaceGroup(1049966232);
                            companion = companion2;
                            radioColors = new RadioColors(Strings.getColors(gapComposer3).semantic.icon.prominent, Strings.getColors(gapComposer3).semantic.icon.subtle, Strings.getColors(gapComposer3).semantic.icon.prominent);
                            GapComposer gapComposer4 = gapComposer3;
                            gapComposer4.end(false);
                            gapComposer2 = gapComposer4;
                        } else {
                            companion = companion2;
                            gapComposer3.startReplaceGroup(1050000022);
                            radioColors = new RadioColors(Strings.getColors(gapComposer3).component.radio.inactive.border.f211default, Strings.getColors(gapComposer3).component.radio.inactive.border.disabled, Strings.getColors(gapComposer3).component.radio.inactive.background.pressed);
                            gapComposer3.end(false);
                            gapComposer2 = gapComposer3;
                        }
                        MutableState collectIsPressedAsState = Room.collectIsPressedAsState(mutableInteractionSourceImpl4, gapComposer2, (i7 >> 6) & 14);
                        long j = radioColors.border;
                        if (!z3 || ((Boolean) collectIsPressedAsState.getValue()).booleanValue()) {
                            if (!z3 && ((Boolean) collectIsPressedAsState.getValue()).booleanValue()) {
                                j = radioColors.borderPressed;
                            } else if (!z3 && !((Boolean) collectIsPressedAsState.getValue()).booleanValue()) {
                                j = radioColors.borderDisabled;
                            }
                        }
                        if (z) {
                            gapComposer2.startReplaceGroup(-516733344);
                            Strings.getSizes(gapComposer2).getClass();
                            Object obj = DefaultSizes.border.annotationsMap;
                            z4 = false;
                            gapComposer2.end(false);
                            f = 8.0f;
                        } else {
                            z4 = false;
                            gapComposer2.startReplaceGroup(-516677761);
                            Strings.getSizes(gapComposer2).getClass();
                            Object obj2 = DefaultSizes.border.annotationsMap;
                            gapComposer2.end(false);
                            f = 2.0f;
                        }
                        gapComposer2.startReplaceGroup(-432301135);
                        Modifier recordVerticalCenter = AlignmentLinesKt.recordVerticalCenter(ImageKt.m178borderxT4_qwU(SizeKt.m285size3ABfNKs(modifier5, 22.0f), f, j, RoundedCornerShapeKt.CircleShape), AlignmentLinesKt.FirstLineCenter, arrayMap);
                        if (function04 != null) {
                            Modifier modifier6 = modifier5;
                            mutableInteractionSourceImpl3 = mutableInteractionSourceImpl4;
                            r10 = z4;
                            modifier4 = modifier6;
                            recordVerticalCenter = recordVerticalCenter.then(SelectableKt.m334selectableO2vRcR0(companion, z, mutableInteractionSourceImpl3, RippleKt.m3400rippleYJYuY3k(0L, false, 20.0f, null, gapComposer2, 432, 9), z3, new Role(3), function04));
                        } else {
                            r10 = z4;
                            modifier4 = modifier5;
                            mutableInteractionSourceImpl3 = mutableInteractionSourceImpl4;
                        }
                        gapComposer2.end(r10);
                        BoxKt.Box(recordVerticalCenter, gapComposer2, r10);
                        mutableInteractionSourceImpl2 = mutableInteractionSourceImpl3;
                        function03 = function04;
                        modifier3 = modifier4;
                        gapComposer = gapComposer2;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new LocalRadioKt$$ExternalSyntheticLambda0(z, modifier3, mutableInteractionSourceImpl2, z3, function03, i, i2, 0);
                        return;
                    }
                    return;
                }
                function02 = function0;
                if (gapComposer3.shouldExecute(i4 & 1, (i4 & 9363) == 9362)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            function02 = function0;
            if (gapComposer3.shouldExecute(i4 & 1, (i4 & 9363) == 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i3 | MLKEMEngine.KyberPolyBytes;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        function02 = function0;
        if (gapComposer3.shouldExecute(i4 & 1, (i4 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LocalStackedImage(Modifier modifier, List list, int i, LocalStackedImageStyle localStackedImageStyle, ContentScale contentScale, Composer composer, int i2, int i3) {
        Modifier modifier2;
        int i4;
        LocalStackedImageStyle localStackedImageStyle2;
        ContentScale contentScale2;
        int i5;
        Modifier modifier3;
        LocalStackedImageStyle localStackedImageStyle3;
        ContentScale contentScale3;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier4;
        LocalStackedImageStyle localStackedImageStyle4;
        ContentScale contentScale4;
        int i6;
        LocalStackedImageStyle localStackedImageStyle5;
        int i7;
        Modifier then;
        ?? listOf;
        Modifier m272offsetVpY3zN4;
        boolean z;
        BiasAlignment biasAlignment;
        boolean z2;
        int i8;
        BiasAlignment biasAlignment2 = Alignment.Companion.Center;
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1767203737);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (gapComposer.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer.changedInstance(list) ? 32 : 16;
        }
        int i10 = i4 | MLKEMEngine.KyberPolyBytes;
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                localStackedImageStyle2 = localStackedImageStyle;
                if (gapComposer.changed(localStackedImageStyle2)) {
                    i8 = 2048;
                    i10 |= i8;
                }
            } else {
                localStackedImageStyle2 = localStackedImageStyle;
            }
            i8 = 1024;
            i10 |= i8;
        } else {
            localStackedImageStyle2 = localStackedImageStyle;
        }
        int i11 = i3 & 16;
        if (i11 != 0) {
            i10 |= 24576;
        } else if ((i2 & 24576) == 0) {
            contentScale2 = contentScale;
            i10 |= gapComposer.changed(contentScale2) ? 16384 : PKIFailureInfo.certRevoked;
            if (gapComposer.shouldExecute(i10 & 1, (i10 & 9363) == 9362)) {
                gapComposer.skipToGroupEnd();
                i5 = i;
                modifier3 = modifier2;
                localStackedImageStyle3 = localStackedImageStyle2;
                contentScale3 = contentScale2;
            } else {
                gapComposer.startDefaults();
                int i12 = i2 & 1;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (i12 == 0 || gapComposer.getDefaultsInvalid()) {
                    if (i9 != 0) {
                        modifier2 = companion;
                    }
                    if ((i3 & 8) != 0) {
                        modifier4 = modifier2;
                        long j = Strings.getColors(gapComposer).semantic.background.standard;
                        Strings.getSizes(gapComposer).getClass();
                        Object obj = DefaultSizes.border.entries;
                        Strings.getSizes(gapComposer).getClass();
                        localStackedImageStyle4 = new LocalStackedImageStyle(46.0f, 5.0f, j, 16.0f, Strings.getColors(gapComposer).semantic.background.f1047app, false);
                        i10 &= -7169;
                    } else {
                        modifier4 = modifier2;
                        localStackedImageStyle4 = localStackedImageStyle2;
                    }
                    if (i11 != 0) {
                        modifier2 = modifier4;
                        contentScale4 = ContentScale.Companion.Crop;
                    } else {
                        modifier2 = modifier4;
                        contentScale4 = contentScale2;
                    }
                    i6 = 3;
                    localStackedImageStyle5 = localStackedImageStyle4;
                } else {
                    gapComposer.skipToGroupEnd();
                    if ((i3 & 8) != 0) {
                        i10 &= -7169;
                    }
                    i6 = i;
                    contentScale4 = contentScale2;
                    localStackedImageStyle5 = localStackedImageStyle2;
                }
                gapComposer.endDefaults();
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                boolean z3 = colors.isLight;
                int i13 = i6 < 1 ? 1 : i6;
                boolean changed = gapComposer.changed(list) | gapComposer.changed(z3) | gapComposer.changed(i13);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (changed || rememberedValue == neverEqualPolicy) {
                    i7 = 1;
                    rememberedValue = CollectionsKt__ReversedViewsKt.asReversed(SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.take(SequencesKt___SequencesKt.mapNotNull(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(list, 1), new MoneyTabUIKt$$ExternalSyntheticLambda24(z3, i7)), i13)));
                    gapComposer.updateRememberedValue(rememberedValue);
                } else {
                    i7 = 1;
                }
                List list2 = (List) rememberedValue;
                float f = localStackedImageStyle5.imageSize;
                float f2 = localStackedImageStyle5.step;
                float f3 = (((list2.size() < i7 ? i7 : r13) - 1) * f2) + f;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new Yoga$$ExternalSyntheticLambda0(7);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                then = SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue2).then(new SizeElement((r13 & 1) != 0 ? Float.NaN : f3, (r13 & 2) != 0 ? Float.NaN : f3, (r13 & 4) != 0 ? Float.NaN : RecyclerView.DECELERATION_RATE, (r13 & 8) != 0 ? Float.NaN : RecyclerView.DECELERATION_RATE, false));
                Modifier then2 = then.then(modifier2);
                BiasAlignment biasAlignment3 = Alignment.Companion.TopStart;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment3, false);
                int i14 = i6;
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then2);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                Modifier modifier5 = modifier2;
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
                if (list2.isEmpty()) {
                    gapComposer.startReplaceGroup(-39319412);
                    if (list.isEmpty()) {
                        z2 = false;
                        gapComposer.startReplaceGroup(-39212927);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-39287885);
                        StackedImageTile(null, contentScale4, localStackedImageStyle5, null, gapComposer, ((i10 >> 9) & 112) | ((i10 >> 3) & 896), 9);
                        z2 = false;
                        gapComposer.end(false);
                    }
                    gapComposer.end(z2);
                } else {
                    gapComposer.startReplaceGroup(-39179788);
                    BiasAlignment biasAlignment4 = Alignment.Companion.BottomEnd;
                    int size = list2.size();
                    boolean z4 = true;
                    if (size == 1) {
                        listOf = CollectionsKt__CollectionsJVMKt.listOf(biasAlignment2);
                    } else if (size != 2) {
                        int size2 = list2.size();
                        listOf = new ArrayList(size2);
                        int i15 = 0;
                        while (i15 < size2) {
                            if (i15 == 0) {
                                z = z4;
                                biasAlignment = biasAlignment4;
                            } else {
                                z = z4;
                                biasAlignment = i15 == list2.size() + (-1) ? biasAlignment3 : biasAlignment2;
                            }
                            listOf.add(biasAlignment);
                            i15++;
                            z4 = z;
                        }
                    } else {
                        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Alignment[]{biasAlignment4, biasAlignment3});
                    }
                    int size3 = list2.size();
                    int i16 = 0;
                    while (i16 < size3) {
                        String str = (String) list2.get(i16);
                        int size4 = (list2.size() - 1) - i16;
                        int i17 = size3;
                        int size5 = list2.size();
                        List list3 = list2;
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (size5 == 1) {
                            m272offsetVpY3zN4 = boxScopeInstance.align(companion, biasAlignment2);
                        } else if (localStackedImageStyle5.alignToBounds) {
                            m272offsetVpY3zN4 = boxScopeInstance.align(companion, (Alignment) listOf.get(i16));
                        } else {
                            float f4 = size4 * f2;
                            m272offsetVpY3zN4 = OffsetKt.m272offsetVpY3zN4(companion, f4, f4);
                        }
                        StackedImageTile(m272offsetVpY3zN4, contentScale4, localStackedImageStyle5, str, gapComposer, ((i10 >> 9) & 112) | ((i10 >> 3) & 896), 0);
                        i16++;
                        f2 = f2;
                        companion = companion;
                        size3 = i17;
                        list2 = list3;
                    }
                    gapComposer.end(false);
                }
                gapComposer.end(true);
                contentScale3 = contentScale4;
                localStackedImageStyle3 = localStackedImageStyle5;
                i5 = i14;
                modifier3 = modifier5;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new ViewfinderKt$$ExternalSyntheticLambda6(modifier3, list, i5, localStackedImageStyle3, contentScale3, i2, i3);
                return;
            }
            return;
        }
        contentScale2 = contentScale;
        if (gapComposer.shouldExecute(i10 & 1, (i10 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0045  */
    /* renamed from: LocalStaticMap-hGBTI10, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1321LocalStaticMaphGBTI10(final GpsCoordinates gpsCoordinates, Modifier modifier, float f, float f2, float f3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float f4;
        int i5;
        int i6;
        final float f5;
        final Modifier modifier3;
        final float f6;
        final float f7;
        RecomposeScopeImpl endRestartGroup;
        int i7;
        Modifier modifier4;
        gpsCoordinates.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-747859050);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(gpsCoordinates) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                f4 = f;
                i3 |= gapComposer.changed(f4) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= gapComposer.changed(f2) ? 2048 : 1024;
                    i6 = i3 | 24576;
                    if (gapComposer.shouldExecute(i6 & 1, (i6 & 9363) == 9362)) {
                        gapComposer.skipToGroupEnd();
                        f5 = f2;
                        modifier3 = modifier2;
                        f6 = f4;
                        f7 = f3;
                    } else {
                        if (i8 != 0) {
                            modifier4 = Modifier.Companion.$$INSTANCE;
                            i7 = i5;
                        } else {
                            i7 = i5;
                            modifier4 = modifier2;
                        }
                        float f8 = i4 != 0 ? 2.8f : f4;
                        float f9 = i7 != 0 ? 8.0f : f2;
                        int i9 = i6 >> 3;
                        m1319LocalMapUR9CgXA(modifier4, f8, f9, toLatLng(gpsCoordinates), 17.0f, null, Expect_jvmKt.rememberComposableLambda(29304219, new LocalMapKt$$ExternalSyntheticLambda0(gpsCoordinates), gapComposer), gapComposer, (i9 & 896) | (i9 & 14) | 12779520 | (i9 & 112) | (i6 & 57344));
                        modifier3 = modifier4;
                        f6 = f8;
                        f5 = f9;
                        f7 = 17.0f;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new Function2() { // from class: app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                LocalMapKt.m1321LocalStaticMaphGBTI10(GpsCoordinates.this, modifier3, f6, f5, f7, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
                i6 = i3 | 24576;
                if (gapComposer.shouldExecute(i6 & 1, (i6 & 9363) == 9362)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f4 = f;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            i6 = i3 | 24576;
            if (gapComposer.shouldExecute(i6 & 1, (i6 & 9363) == 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f4 = f;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        i6 = i3 | 24576;
        if (gapComposer.shouldExecute(i6 & 1, (i6 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void OpenTabInfoContent(Modifier modifier, LocalBottomModalViewModel.Payload.OpenTabInfo openTabInfo, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(196556593);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(openTabInfo) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(modifier, RecyclerView.DECELERATION_RATE, 8.0f, 1);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, Strings.getColors(gapComposer).semantic.text.prominent, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).buttonCompact, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 0, Room.getSp(24), null, null, 0, 16646143), (TextLineBalancing) null, openTabInfo.titleText, (Map) null, (Function1) null, false);
            String str = openTabInfo.subtitleText;
            String str2 = (str == null || StringsKt.isBlank(str)) ? null : str;
            if (str2 == null) {
                gapComposer.startReplaceGroup(800702573);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(800702574);
                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(modifier, openTabInfo, i, 25);
        }
    }

    public static final void QuantityAndAmount(LocalBottomModalViewModel.Payload.ItemInfo itemInfo, Composer composer, int i) {
        GapComposer gapComposer;
        TextStyle textStyle;
        boolean z;
        GapComposer gapComposer2;
        Long l = itemInfo.amountRaw;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(1593172350);
        Applier applier = gapComposer3.applier;
        int i2 = i | (gapComposer3.changedInstance(itemInfo) ? 32 : 16);
        if (gapComposer3.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 0.5f);
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Modifier then = fillMaxWidth.then(new VerticalAlignElement(vertical));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, then);
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
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer3, 48);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, companion);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer3).labelMedium, 0L, Room.getSp(20), null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213);
            TextStyle m994copyp1EtxEg$default2 = TextStyle.m994copyp1EtxEg$default(m994copyp1EtxEg$default, 0L, 0L, FontWeight.Normal, null, 0L, null, 0L, TextDecoration.LineThrough, null, null, 0, 0L, null, null, 0, 16773115);
            if (l != null) {
                gapComposer3.startReplaceGroup(955575112);
                boolean changedInstance = gapComposer3.changedInstance(itemInfo);
                Object rememberedValue = gapComposer3.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new CachedPageEventFlow$$ExternalSyntheticLambda0(itemInfo, 28);
                    gapComposer3.updateRememberedValue(rememberedValue);
                }
                Modifier semantics = SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue);
                long j = Strings.getColors(gapComposer3).semantic.text.standard;
                String str = itemInfo.amountText;
                l.getClass();
                AnimatedAmountTextView.Amount amount = new AnimatedAmountTextView.Amount(str, l.longValue());
                textStyle = m994copyp1EtxEg$default2;
                gapComposer2 = gapComposer3;
                z = false;
                VisibleKt.m3482AnimatedAmountTextJDMA8c0(semantics, m994copyp1EtxEg$default, j, 0, amount, null, false, 0L, gapComposer2, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                gapComposer2.end(false);
            } else {
                textStyle = m994copyp1EtxEg$default2;
                z = false;
                gapComposer3.startReplaceGroup(955864838);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer3).semantic.text.standard, (Composer) gapComposer3, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, itemInfo.amountText, (Map) null, (Function1) null, false);
                gapComposer2 = gapComposer3;
                gapComposer2.end(false);
            }
            AnimatedContentKt.AnimatedVisibility(itemInfo.strokedAmountText != null ? true : z, (Modifier) null, (EnterTransitionImpl) null, (ExitTransitionImpl) null, (String) null, Expect_jvmKt.rememberComposableLambda(-1267527504, new BrandSheetViewKt$$ExternalSyntheticLambda1(4, itemInfo, textStyle), gapComposer2), (Composer) gapComposer2, 1572870, 30);
            gapComposer2.end(true);
            GapComposer gapComposer4 = gapComposer2;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer4, (Modifier) null, Strings.getTypography(gapComposer2).bodySmall, (TextLineBalancing) null, itemInfo.quantityText, (Map) null, (Function1) null, false);
            gapComposer = gapComposer4;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CartBannerViewKt$$ExternalSyntheticLambda2(itemInfo, i, 7);
        }
    }

    /* renamed from: QuantityBadge-xx3dHbM, reason: not valid java name */
    public static final void m1322QuantityBadgexx3dHbM(final Modifier modifier, int i, final float f, final long j, final long j2, final Function0 function0, Composer composer, final int i2) {
        int i3;
        int i4;
        Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1236343972);
        if ((i2 & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 = i;
            i3 |= gapComposer.changed(i4) ? 32 : 16;
        } else {
            i4 = i;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= gapComposer.changed(j) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= gapComposer.changed(j2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i2) == 0) {
            function02 = function0;
            i3 |= gapComposer.changedInstance(function02) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            function02 = function0;
        }
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ImageKt.m183clickableoSLSa3U$default(ClipKt.clip(modifier, RoundedCornerShapeKt.CircleShape), false, null, null, function02, 15), j2, ColorKt.RectangleShape);
            boolean z = (i3 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MeasurePolicy() { // from class: app.cash.local.views.internal.CartItemCounterViewKt$QuantityBadge$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j3) {
                        measureScope.getClass();
                        list.getClass();
                        Placeable mo833measureBRTryo0 = ((Measurable) CollectionsKt.first(list)).mo833measureBRTryo0(j3);
                        int max = Math.max(mo833measureBRTryo0.width, Math.max(mo833measureBRTryo0.height, measureScope.mo230roundToPx0680j_4(f)));
                        return MeasureScope.layout$default(measureScope, max, max, new ProgressIndicatorKt$$ExternalSyntheticLambda4(mo833measureBRTryo0, max, 4));
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Room.m1165Text25TpFw(0, 0, 0, 3, i3 & 7168, 0, 3826, j, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, String.valueOf(i4), (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i5 = i4;
            endRestartGroup.block = new Function2() { // from class: app.cash.local.views.internal.CartItemCounterViewKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    LocalMapKt.m1322QuantityBadgexx3dHbM(Modifier.this, i5, f, j, j2, function0, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StackedImageTile(Modifier modifier, ContentScale contentScale, LocalStackedImageStyle localStackedImageStyle, String str, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        String str2;
        String str3;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(641993048);
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
            i3 |= gapComposer.changed(contentScale) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(localStackedImageStyle) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            str2 = str;
            i3 |= gapComposer.changed(str2) ? 2048 : 1024;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                gapComposer.skipToGroupEnd();
                str3 = str2;
            } else {
                Modifier modifier3 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                String str4 = i5 != 0 ? null : str2;
                RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(localStackedImageStyle.imageCornerRadius);
                LocalAsyncImage(ClipKt.clip(ImageKt.m178borderxT4_qwU(ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(modifier3, localStackedImageStyle.imageSize), localStackedImageStyle.imageBackgroundColor, m340RoundedCornerShape0680j_4), 1.0f, localStackedImageStyle.imageBorderColor, m340RoundedCornerShape0680j_4), m340RoundedCornerShape0680j_4), null, str4, contentScale, null, null, null, gapComposer, ((i3 >> 3) & 896) | ((i3 << 6) & 7168), 114);
                modifier2 = modifier3;
                str3 = str4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(modifier2, contentScale, localStackedImageStyle, str3, i, i2, 2);
                return;
            }
            return;
        }
        str2 = str;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void TitleView(LayoutWeightElement layoutWeightElement, boolean z, LocalBottomModalViewModel.Title title, Composer composer, int i) {
        TextStyle textStyle;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2078608203);
        int i2 = i | (gapComposer.changed(layoutWeightElement) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(title) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 12.0f, 1), null, 3);
            String str = title.label;
            LocalBottomModalViewModel.Title.TitleTextStyle titleTextStyle = title.textStyle;
            if (z) {
                gapComposer.startReplaceGroup(1375794045);
                textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).buttonCompact;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1375861377);
                textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                gapComposer.end(false);
            }
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 0, Room.getSp(24), null, null, 0, 16646143);
            int ordinal = titleTextStyle.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(44388879);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.text.disabled;
                gapComposer.end(false);
            } else if (ordinal == 1) {
                gapComposer.startReplaceGroup(44390959);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.text.standard;
                gapComposer.end(false);
            } else {
                if (ordinal != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 44386567, false);
                }
                gapComposer.startReplaceGroup(44392974);
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors3.semantic.text.warning;
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, j, (Composer) gapComposer, wrapContentSize$default, m994copyp1EtxEg$default, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.startReplaceGroup(1376237592);
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(layoutWeightElement, z, title, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UnlabeledLocalCheckbox(boolean z, Function1 function1, Modifier modifier, MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        RecomposeScopeImpl endRestartGroup;
        Modifier.Companion companion;
        long j;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        long j2;
        Modifier modifier3;
        boolean z3;
        boolean z4;
        MutableInteractionSourceImpl mutableInteractionSourceImpl4;
        int i5;
        boolean z5 = z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-710834437);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(z5) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 256 : 128;
            i4 = i3 | 3072;
            if ((i & 24576) == 0) {
                i4 |= gapComposer.changed(z2) ? 16384 : PKIFailureInfo.certRevoked;
            }
            int i7 = 1;
            if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) == 9362)) {
                gapComposer.skipToGroupEnd();
                mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
            } else {
                int i8 = i4;
                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                Modifier modifier4 = i6 != 0 ? companion2 : modifier2;
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl5 = (MutableInteractionSourceImpl) rememberedValue;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ArrayMap(1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                ArrayMap arrayMap = (ArrayMap) rememberedValue2;
                Strings.getSizes(gapComposer).getClass();
                Object obj = DefaultSizes.border.entries;
                RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f);
                Strings.getSizes(gapComposer).getClass();
                if (z5) {
                    gapComposer.startReplaceGroup(-212077180);
                    companion = companion2;
                    j = Strings.getColors(gapComposer).semantic.icon.prominent;
                    gapComposer.end(false);
                } else {
                    companion = companion2;
                    if (z2) {
                        gapComposer.startReplaceGroup(-212074590);
                        j = Strings.getColors(gapComposer).component.checkbox.inactive.border.f179default;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-212072157);
                        j = Strings.getColors(gapComposer).component.checkbox.inactive.border.disabled;
                        gapComposer.end(false);
                    }
                }
                if (z && z2) {
                    gapComposer.startReplaceGroup(-212068796);
                    mutableInteractionSourceImpl3 = mutableInteractionSourceImpl5;
                    j2 = Strings.getColors(gapComposer).semantic.icon.prominent;
                    gapComposer.end(false);
                } else {
                    mutableInteractionSourceImpl3 = mutableInteractionSourceImpl5;
                    if (z && !z2) {
                        gapComposer.startReplaceGroup(-212066493);
                        j2 = Strings.getColors(gapComposer).semantic.icon.disabled;
                        gapComposer.end(false);
                    } else if (z || !z2) {
                        gapComposer.startReplaceGroup(-212060861);
                        j2 = Strings.getColors(gapComposer).component.checkbox.inactive.background.disabled;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-212063422);
                        j2 = Strings.getColors(gapComposer).component.checkbox.inactive.background.f178default;
                        gapComposer.end(false);
                    }
                }
                gapComposer.startReplaceGroup(-212053065);
                Modifier recordVerticalCenter = AlignmentLinesKt.recordVerticalCenter(ImageKt.m177backgroundbw27NRU(ImageKt.m178borderxT4_qwU(SizeKt.m285size3ABfNKs(modifier4, 22.0f), 2.0f, j, m340RoundedCornerShape0680j_4), j2, m340RoundedCornerShape0680j_4), AlignmentLinesKt.FirstLineCenter, arrayMap);
                if (function1 != null) {
                    RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, 20.0f, null, gapComposer, 432, 9);
                    Role role = new Role(1);
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new UtilsKt$$ExternalSyntheticLambda1(i7, function1);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Function1 function12 = (Function1) rememberedValue3;
                    z3 = true;
                    modifier3 = modifier4;
                    z4 = false;
                    i5 = i8;
                    z5 = z;
                    mutableInteractionSourceImpl4 = mutableInteractionSourceImpl3;
                    recordVerticalCenter = recordVerticalCenter.then(SelectableKt.m336toggleableO2vRcR0(companion, z5, mutableInteractionSourceImpl4, m3400rippleYJYuY3k, z2, role, function12));
                } else {
                    z5 = z;
                    modifier3 = modifier4;
                    z3 = true;
                    z4 = false;
                    mutableInteractionSourceImpl4 = mutableInteractionSourceImpl3;
                    i5 = i8;
                }
                gapComposer.end(z4);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, z4);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, recordVerticalCenter);
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
                Checkmark(z5, gapComposer, i5 & 14);
                gapComposer.end(z3);
                mutableInteractionSourceImpl2 = mutableInteractionSourceImpl4;
                modifier2 = modifier3;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new LocalCheckboxKt$$ExternalSyntheticLambda1(z5, function1, modifier2, mutableInteractionSourceImpl2, z2, i, i2, 0);
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3 | 3072;
        if ((i & 24576) == 0) {
        }
        int i72 = 1;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static ExpandableSectionStyle cardStyle(Composer composer) {
        Strings.getSizes(composer).getClass();
        Object obj = DefaultSizes.border.annotationsMap;
        long j = Strings.getColors(composer).semantic.border.subtle;
        Strings.getSizes(composer).getClass();
        Strings.getSizes(composer).getClass();
        DefaultSizes.spacing.getClass();
        PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(16.0f, 12.0f, 16.0f, 12.0f);
        Strings.getSizes(composer).getClass();
        Strings.getSizes(composer).getClass();
        Strings.getSizes(composer).getClass();
        Strings.getSizes(composer).getClass();
        return new ExpandableSectionStyle(j, paddingValuesImpl, new PaddingValuesImpl(40.0f, 2.0f, 40.0f, 12.0f), 32);
    }

    public static LocalMenuAvailabilityTextStyle mediumStyle(GapComposer gapComposer) {
        LocalMenuAvailabilityTextStyle smallStyle = smallStyle(gapComposer);
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
        TextStyle textStyle = ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).labelMedium;
        TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.LineThrough, null, null, 0, 0L, null, null, 0, 16773119);
        TextStyle textStyle2 = ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).labelMedium;
        long j = smallStyle.defaultTextColor;
        long j2 = smallStyle.strikethroughTextColor;
        long j3 = smallStyle.soldOutTextColor;
        textStyle.getClass();
        textStyle2.getClass();
        return new LocalMenuAvailabilityTextStyle(textStyle, j, m994copyp1EtxEg$default, j2, textStyle2, j3, 8.0f);
    }

    /* renamed from: singleImageStack-rAjV9yQ, reason: not valid java name */
    public static LocalStackedImageStyle m1323singleImageStackrAjV9yQ(int i, GapComposer gapComposer) {
        int coerceIn = RangesKt___RangesKt.coerceIn(i, 1, 3);
        float f = coerceIn != 1 ? coerceIn != 2 ? 48.0f : 54.0f : 60.0f;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
        Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        long j = colors.semantic.background.subtle;
        Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
        if (colors2 == null) {
            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        return new LocalStackedImageStyle(f, 6.0f, j, 13.333333f, colors2.semantic.background.subtle, true);
    }

    public static LocalMenuAvailabilityTextStyle smallStyle(Composer composer) {
        return new LocalMenuAvailabilityTextStyle(Strings.getTypography(composer).labelSmall, Strings.getColors(composer).semantic.text.standard, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(composer).bodySmall, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.LineThrough, null, null, 0, 0L, null, null, 0, 16773119), Strings.getColors(composer).semantic.text.disabled, Strings.getTypography(composer).labelSmall, Strings.getColors(composer).semantic.text.warning, 2.0f);
    }

    public static final LatLng toLatLng(GpsCoordinates gpsCoordinates) {
        gpsCoordinates.getClass();
        return new LatLng(gpsCoordinates.latitude, gpsCoordinates.longitude);
    }

    public static final void LocalMapMarker(GpsCoordinates gpsCoordinates, Composer composer, int i) {
        long j;
        gpsCoordinates.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-232380263);
        int i2 = (gapComposer.changedInstance(gpsCoordinates) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            LatLng latLng = toLatLng(gpsCoordinates);
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            gapComposer.startReplaceGroup(-1807049701);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Colors.Base base = colors.base;
            if (ImageKt.isSystemInDarkTheme(gapComposer)) {
                j = base.constantWhite;
            } else {
                j = base.constantBlack;
            }
            gapComposer.end(false);
            int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(j);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                zzd zzdVar = Icons.Companion;
                Drawable drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.icon_location_fill_32, Integer.valueOf(m694toArgb8_81llA));
                drawableCompat.getClass();
                rememberedValue = Updater.mutableStateOf$default(DrawablesKt.drawableToBitmap(drawableCompat));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LocalMapMarker(latLng, (Bitmap) ((MutableState) rememberedValue).getValue(), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda0(gpsCoordinates, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InfoEntry(Modifier modifier, String str, String str2, Function2 function2, Function2 function22, Function0 function0, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Function2 function23;
        int i4;
        Function2 function24;
        int i5;
        Function2 function25;
        Function2 function26;
        Function0 function02;
        RecomposeScopeImpl endRestartGroup;
        int i6;
        Modifier modifier3;
        str.getClass();
        str2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-87486483);
        int i7 = i2 & 1;
        if (i7 != 0) {
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
            i3 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(str2) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function23 = function2;
            i3 |= gapComposer.changedInstance(function23) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function24 = function22;
                i3 |= gapComposer.changedInstance(function24) ? 16384 : PKIFailureInfo.certRevoked;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    i3 |= gapComposer.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536;
                    if (!gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                        if (i7 != 0) {
                            modifier3 = Modifier.Companion.$$INSTANCE;
                            i6 = i4;
                        } else {
                            i6 = i4;
                            modifier3 = modifier2;
                        }
                        Function2 function27 = i8 != 0 ? null : function23;
                        Function2 function28 = i6 != 0 ? null : function24;
                        Function0 function03 = i5 != 0 ? null : function0;
                        InfoEntry(modifier3, new AnnotatedString(str), new AnnotatedString(str2), function27, function28, function03, gapComposer, i3 & 523278, 0);
                        modifier2 = modifier3;
                        function25 = function27;
                        function26 = function28;
                        function02 = function03;
                    } else {
                        gapComposer.skipToGroupEnd();
                        function25 = function23;
                        function26 = function24;
                        function02 = function0;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(modifier2, str, str2, (Object) function25, (Object) function26, function02, i, i2, 2);
                        return;
                    }
                    return;
                }
                if (!gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function24 = function22;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if (!gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function23 = function2;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function24 = function22;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if (!gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void LocalExpandableSection(Modifier modifier, ExpandableSectionHeaderData expandableSectionHeaderData, ComposableLambdaImpl composableLambdaImpl, ExpandableSectionStyle expandableSectionStyle, boolean z, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-114832123);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changed(modifier) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (gapComposer.changed(expandableSectionHeaderData) ? 32 : 16) | (gapComposer.changed(expandableSectionStyle) ? 2048 : 1024) | (gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            LocalExpandableSection(modifier, Expect_jvmKt.rememberComposableLambda(-963414871, new SliderDefaults$$ExternalSyntheticLambda3(expandableSectionHeaderData, 24), gapComposer), composableLambdaImpl, expandableSectionStyle, z, gapComposer, (i3 & 14) | 432 | (i3 & 7168) | (i3 & 57344));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(modifier, expandableSectionHeaderData, composableLambdaImpl, expandableSectionStyle, z, i, 2);
        }
    }
}
