package app.cash.local.views.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.DrawerKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.presenters.brand.menu.LocalMenuItemDetailsPresenter;
import app.cash.local.presenters.cart.LocalBrandLocationCartPresenter;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.LocationMenu$$ExternalSyntheticLambda6;
import app.cash.local.primitives.MenuItemPreorderingSummary;
import app.cash.local.primitives.OrderStatus;
import app.cash.local.primitives.OrderStatusKt;
import app.cash.local.screens.app.SchedulingDayTimeQuestion;
import app.cash.local.viewmodels.FreeDeliveryMeter;
import app.cash.local.viewmodels.LocalBottomModalViewModel;
import app.cash.local.viewmodels.LocalBrandDescriptionViewModel;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import app.cash.local.viewmodels.LocalBrandLocationCheckoutViewModel;
import app.cash.local.viewmodels.LocalBrandLocationHoursContentModel;
import app.cash.local.viewmodels.LocalBrandLocationMenuCarouselContentModel;
import app.cash.local.viewmodels.LocalBrandLocationMenuContentModel;
import app.cash.local.viewmodels.LocalBrandProfileSectionViewModel;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.viewmodels.LocalCashBalanceViewModel;
import app.cash.local.viewmodels.LocalCheckoutPaymentTimingViewModel;
import app.cash.local.viewmodels.LocalOrderStatusViewModel;
import app.cash.local.viewmodels.OrderBuilderModel;
import app.cash.local.viewmodels.OrderLimitBanner;
import app.cash.local.viewmodels.VehicleColorSpec;
import app.cash.local.viewmodels.internal.Amount;
import app.cash.local.viewmodels.internal.MiniCardModel;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageViewModel;
import app.cash.local.viewmodels.pos.LocalPosCheckInViewModel;
import app.cash.local.views.brand.checkout.CurbsidePickupCarSheetKt;
import app.cash.local.views.brand.checkout.LocalBrandLocationCheckoutViewKt;
import app.cash.local.views.brand.checkout.LocalOpenTabCheckoutViewKt;
import app.cash.local.views.brand.menu.LocalCaloriesTextKt;
import app.cash.local.views.brand.orders.BrandPinsKt;
import app.cash.local.views.brand.orders.LatLngSet;
import app.cash.local.views.brand.orders.LocalOrderStatusViewKt;
import app.cash.local.views.brand.profile.LocalBrandLocationRowKt;
import app.cash.local.views.cart.CartBannerViewKt;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt;
import app.cash.local.views.composeuiview.LocalAddBrandsViewKt;
import app.cash.local.views.fulfillment.FulfillmentRadioCellKt;
import app.cash.local.views.marketingmessages.MarketingMessageKt;
import app.cash.local.views.sheet.LoyaltySheetKt;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import coil3.compose.AsyncImageKt;
import coil3.gif.ImageRequestsKt;
import coil3.request.ImageRequest;
import coil3.size.SizeKt;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.compose.MarkerKt;
import com.google.maps.android.compose.MarkerState;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.SchedulingDay;
import com.squareup.util.Strings;
import com.squareup.util.android.drawable.DrawablesKt;
import com.withpersona.sdk2.camera.feed.CameraFeedKt;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalMapKt$$ExternalSyntheticLambda9 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ LocalMapKt$$ExternalSyntheticLambda9(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int m694toArgb8_81llA;
        LayerDrawable layerWith;
        int i5;
        LatLngSet latLngSet;
        int i6;
        boolean z2;
        int i7;
        Color m;
        boolean z3;
        int intValue;
        Float ratio;
        int i8 = this.$r8$classId;
        Object obj3 = Composer.Companion.Empty;
        Continuation continuation = null;
        int i9 = 2;
        int i10 = 7;
        int i11 = 1;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i8) {
            case 0:
                ((Integer) obj2).getClass();
                LocalMapKt.LocalMapMarker((LatLng) obj5, (Bitmap) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) obj5;
                LocalMenuItemDetailsPresenter localMenuItemDetailsPresenter = (LocalMenuItemDetailsPresenter) obj4;
                FulfillmentConfiguration fulfillmentConfiguration = (FulfillmentConfiguration) obj2;
                ((SchedulingDayTimeQuestion) obj).getClass();
                if (fulfillmentConfiguration != null) {
                    JobKt.launch$default(coroutineScope, null, null, new ZiplineLoader$ModuleJob$run$3(localMenuItemDetailsPresenter, fulfillmentConfiguration, null, i10), 3);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope2 = (CoroutineScope) obj5;
                LocalBrandLocationCartPresenter localBrandLocationCartPresenter = (LocalBrandLocationCartPresenter) obj4;
                FulfillmentConfiguration fulfillmentConfiguration2 = (FulfillmentConfiguration) obj2;
                ((SchedulingDayTimeQuestion) obj).getClass();
                if (fulfillmentConfiguration2 != null) {
                    JobKt.launch$default(coroutineScope2, null, null, new ZiplineLoader$ModuleJob$run$3(localBrandLocationCartPresenter, fulfillmentConfiguration2, continuation, 11), 3);
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                CurbsidePickupCarSheetKt.VehicleColorIndicator((String) obj5, (VehicleColorSpec) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                LocalBrandLocationCheckoutViewKt.DropOffNotes((OrderBuilderModel.OrderType.Regular) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                Function1 function1 = (Function1) obj5;
                LocalBrandLocationCheckoutViewModel.CurbsidePickupSection curbsidePickupSection = (LocalBrandLocationCheckoutViewModel.CurbsidePickupSection) obj4;
                Composer composer = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == obj3) {
                        rememberedValue = new DrawerKt$$ExternalSyntheticLambda1(function1, false, 12);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    SizeKt.ButtonCompact((Function0) rememberedValue, null, ButtonProminence.STANDARD, false, false, null, Expect_jvmKt.rememberComposableLambda(980731052, new SliderDefaults$$ExternalSyntheticLambda3(curbsidePickupSection, 6), gapComposer), gapComposer, 1573248, 58);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                LocalBrandLocationCheckoutViewKt.StorePolicies((Modifier) obj5, (AnnotatedString) obj4, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                LocalOpenTabCheckoutViewKt.PaymentTimingSection((LocalCheckoutPaymentTimingViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                LocalCaloriesTextKt.LocalExpandingPreorderSection((Modifier) obj5, (MenuItemPreorderingSummary) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                BrandPinsKt.brandPins((LocalImage) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                LocalOrderStatusViewModel.Loaded.FulfillmentDetails fulfillmentDetails = (LocalOrderStatusViewModel.Loaded.FulfillmentDetails) obj5;
                List<LatLngSet> list = (List) obj4;
                Composer composer2 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Context context = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
                    Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                    int mo236toPx0680j_4 = (int) density.mo236toPx0680j_4(32.0f);
                    int mo236toPx0680j_42 = (int) density.mo236toPx0680j_4(42.0f);
                    int mo236toPx0680j_43 = (int) density.mo236toPx0680j_4(50.0f);
                    int mo236toPx0680j_44 = (int) density.mo236toPx0680j_4(28.0f);
                    float f = mo236toPx0680j_44;
                    LocalImage brandImage = fulfillmentDetails.getBrandImage();
                    int floatValue = (int) (f * ((brandImage == null || (ratio = LocalViewsKt.getRatio(brandImage)) == null) ? 1.0f : ratio.floatValue()));
                    int mo236toPx0680j_45 = (int) density.mo236toPx0680j_4(1.0f);
                    float mo236toPx0680j_46 = density.mo236toPx0680j_4(8.0f);
                    for (LatLngSet latLngSet2 : list) {
                        int ordinal = latLngSet2.f923type.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == i11) {
                                i = floatValue;
                                i3 = mo236toPx0680j_43;
                                i4 = mo236toPx0680j_44;
                                gapComposer2.startReplaceGroup(-1845597132);
                                gapComposer2.startReplaceGroup(-1845606931);
                                GradientDrawable gradientDrawable = new GradientDrawable();
                                gradientDrawable.setSize(mo236toPx0680j_4, mo236toPx0680j_4);
                                gradientDrawable.setShape(1);
                                i2 = mo236toPx0680j_42;
                                gradientDrawable.setStroke(mo236toPx0680j_45, ColorKt.m694toArgb8_81llA(Strings.getColors(gapComposer2).semantic.border.subtle));
                                gradientDrawable.setColor(ColorKt.m694toArgb8_81llA(Strings.getColors(gapComposer2).semantic.background.f1047app));
                                gapComposer2.end(false);
                                zzd zzdVar = Icons.Companion;
                                Drawable drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.icon_category_transportation_16, Integer.valueOf(ColorKt.m694toArgb8_81llA(Strings.getColors(gapComposer2).semantic.icon.info)));
                                drawableCompat.getClass();
                                int i12 = mo236toPx0680j_4 / 2;
                                layerWith = LocalOrderStatusViewKt.layerWith(gradientDrawable, drawableCompat, mo236toPx0680j_4, mo236toPx0680j_4, i12, i12);
                                gapComposer2.end(false);
                                latLngSet = latLngSet2;
                            } else {
                                if (ordinal != i9) {
                                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -1845640708, false);
                                }
                                gapComposer2.startReplaceGroup(-1845565016);
                                gapComposer2.startReplaceGroup(-1845580508);
                                GradientDrawable gradientDrawable2 = new GradientDrawable();
                                gradientDrawable2.setSize(mo236toPx0680j_42, mo236toPx0680j_43);
                                gradientDrawable2.setCornerRadius(mo236toPx0680j_46);
                                gradientDrawable2.setShape(i11);
                                gradientDrawable2.setStroke(mo236toPx0680j_45, ColorKt.m694toArgb8_81llA(Strings.getColors(gapComposer2).semantic.border.subtle));
                                LocalImage brandImage2 = fulfillmentDetails.getBrandImage();
                                LocalColor localColor = brandImage2 != null ? brandImage2.placeholder_color : null;
                                if (localColor == null) {
                                    gapComposer2.startReplaceGroup(555933262);
                                    gapComposer2.end(false);
                                    i7 = floatValue;
                                    m = null;
                                } else {
                                    gapComposer2.startReplaceGroup(17933331);
                                    i7 = floatValue;
                                    m = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, LocalViewsKt.toComposeColor(localColor, gapComposer2, 0));
                                }
                                Integer valueOf = m != null ? Integer.valueOf(ColorKt.m694toArgb8_81llA(m.value)) : null;
                                if (valueOf == null) {
                                    gapComposer2.startReplaceGroup(17936299);
                                    intValue = ColorKt.m694toArgb8_81llA(Strings.getColors(gapComposer2).semantic.background.f1047app);
                                    z3 = false;
                                    gapComposer2.end(false);
                                } else {
                                    z3 = false;
                                    gapComposer2.startReplaceGroup(17932269);
                                    gapComposer2.end(false);
                                    intValue = valueOf.intValue();
                                }
                                gradientDrawable2.setColor(intValue);
                                gapComposer2.end(z3);
                                zzd zzdVar2 = Icons.Companion;
                                Drawable drawableCompat2 = PlatformKt.getDrawableCompat(context, R.drawable.icon_category_handbags_24, Integer.valueOf(ColorKt.m694toArgb8_81llA(Strings.getColors(gapComposer2).base.constantWhite)));
                                drawableCompat2.getClass();
                                int i13 = mo236toPx0680j_42;
                                int i14 = mo236toPx0680j_43;
                                int i15 = mo236toPx0680j_44;
                                layerWith = LocalOrderStatusViewKt.layerWith(gradientDrawable2, drawableCompat2, i13, i14, i7, i15);
                                i3 = i14;
                                i = i7;
                                i4 = i15;
                                gapComposer2.end(z3);
                                latLngSet = latLngSet2;
                                i2 = i13;
                            }
                            i5 = mo236toPx0680j_4;
                        } else {
                            i = floatValue;
                            i2 = mo236toPx0680j_42;
                            i3 = mo236toPx0680j_43;
                            i4 = mo236toPx0680j_44;
                            gapComposer2.startReplaceGroup(-1845623063);
                            gapComposer2.startReplaceGroup(-1845639826);
                            GradientDrawable gradientDrawable3 = new GradientDrawable();
                            gradientDrawable3.setSize(mo236toPx0680j_4, mo236toPx0680j_4);
                            gradientDrawable3.setShape(1);
                            gradientDrawable3.setStroke(mo236toPx0680j_45, ColorKt.m694toArgb8_81llA(Strings.getColors(gapComposer2).semantic.border.subtle));
                            OrderStatus orderStatus = fulfillmentDetails.getOrderStatus();
                            if (orderStatus == null || !OrderStatusKt.getCompleted(orderStatus)) {
                                z = false;
                                gapComposer2.startReplaceGroup(-1047985066);
                                m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(Strings.getColors(gapComposer2).semantic.background.inverse);
                                gapComposer2.end(false);
                            } else {
                                gapComposer2.startReplaceGroup(-1048085320);
                                m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(Strings.getColors(gapComposer2).semantic.background.brand);
                                z = false;
                                gapComposer2.end(false);
                            }
                            gradientDrawable3.setColor(m694toArgb8_81llA);
                            gapComposer2.end(z);
                            zzd zzdVar3 = Icons.Companion;
                            Drawable drawableCompat3 = PlatformKt.getDrawableCompat(context, R.drawable.icon_location_16, Integer.valueOf(ColorKt.m694toArgb8_81llA(Strings.getColors(gapComposer2).semantic.icon.inverse)));
                            drawableCompat3.getClass();
                            int i16 = mo236toPx0680j_4 / 2;
                            layerWith = LocalOrderStatusViewKt.layerWith(gradientDrawable3, drawableCompat3, mo236toPx0680j_4, mo236toPx0680j_4, i16, i16);
                            i5 = mo236toPx0680j_4;
                            gapComposer2.end(false);
                            latLngSet = latLngSet2;
                        }
                        boolean changed2 = gapComposer2.changed(latLngSet);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue2 == obj3) {
                            rememberedValue2 = Updater.mutableStateOf$default(null);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        MutableState mutableState = (MutableState) rememberedValue2;
                        if (latLngSet.f923type == LatLngSet.MarkerType.BRAND) {
                            gapComposer2.startReplaceGroup(-1845545364);
                            LocalImage brandImage3 = fulfillmentDetails.getBrandImage();
                            if (brandImage3 == null) {
                                gapComposer2.startReplaceGroup(-1377331435);
                                gapComposer2.end(false);
                                z2 = 0;
                            } else {
                                gapComposer2.startReplaceGroup(-1377331434);
                                boolean changed3 = gapComposer2.changed(mutableState);
                                Object rememberedValue3 = gapComposer2.rememberedValue();
                                if (changed3 || rememberedValue3 == obj3) {
                                    rememberedValue3 = new DateInputKt$$ExternalSyntheticLambda5(17, mutableState);
                                    gapComposer2.updateRememberedValue(rememberedValue3);
                                }
                                z2 = 0;
                                BrandPinsKt.brandPins(brandImage3, (Function1) rememberedValue3, gapComposer2, 0);
                                gapComposer2.end(false);
                            }
                            gapComposer2.end(z2);
                            i6 = z2;
                        } else {
                            i6 = 0;
                            gapComposer2.startReplaceGroup(-1377204334);
                            gapComposer2.end(false);
                        }
                        MarkerState rememberUpdatedMarkerState = MarkerKt.rememberUpdatedMarkerState(latLngSet.latLng, gapComposer2, i6);
                        Bitmap bitmap = (Bitmap) mutableState.getValue();
                        if (bitmap == null) {
                            bitmap = DrawablesKt.drawableToBitmap(layerWith);
                        }
                        BitmapDescriptor fromBitmap = CameraFeedKt.fromBitmap(bitmap);
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        if (rememberedValue4 == obj3) {
                            rememberedValue4 = new LocationMenu$$ExternalSyntheticLambda6(11);
                            gapComposer2.updateRememberedValue(rememberedValue4);
                        }
                        MarkerKt.m2057Markerqld6geY(rememberUpdatedMarkerState, null, RecyclerView.DECELERATION_RATE, 0L, fromBitmap, 0L, false, (Function1) rememberedValue4, null, null, null, gapComposer2, 0, 24576, 245694);
                        mo236toPx0680j_42 = i2;
                        mo236toPx0680j_4 = i5;
                        mo236toPx0680j_43 = i3;
                        mo236toPx0680j_44 = i4;
                        floatValue = i;
                        i9 = 2;
                        i11 = 1;
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                LocalBrandLocationRowKt.LocalBrandDescriptionView((Modifier) obj5, (LocalBrandDescriptionViewModel) obj4, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                LocalBrandLocationRowKt.LocalBrandLocationHoursView((LocalBrandLocationHoursContentModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                LocalBrandLocationRowKt.LocalBrandLocationLoyaltyView((Modifier) obj5, (LocalBrandProfileViewModel.LoyaltyModel) obj4, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                LocalBrandLocationRowKt.LocalBrandLocationMenuCarouselView((LocalBrandLocationMenuCarouselContentModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                LocalBrandLocationRowKt.LocalBrandLocationMenuView((LocalBrandLocationMenuContentModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                LocalBrandLocationRowKt.LocalBrandProfileSectionView((LocalBrandProfileSectionViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                LocalBrandLocationRowKt.LocalProfileLocationFulfillmentRow((LocalBrandProfileViewModel.Content) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                Function0 function0 = (Function0) obj5;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj4;
                Composer composer3 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    SheetKt.Sheet(function0, null, null, null, null, false, null, composableLambdaImpl, gapComposer3, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                CartBannerViewKt.CartOrderLimitBannerView((Modifier) obj5, (OrderLimitBanner) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                LocalBrandLocationCartViewKt.SubtotalItem((Amount) obj5, (Amount) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                LocalBrandLocationCartViewKt.CartSelectionItem((LocalBrandLocationCartViewModel.Selection) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                LocalAddBrandsViewKt.BrandImageSquareBox((Modifier) obj5, (LocalImage) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                FulfillmentRadioCellKt.EmptyStateBanner((Modifier) obj5, (SchedulingDay) obj4, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                LocalMapKt.FreeDeliveryMeterView((FreeDeliveryMeter) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                LocalMapKt.OpenTabInfoContent((Modifier) obj5, (LocalBottomModalViewModel.Payload.OpenTabInfo) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                LocalMapKt.LocalCashActivityRow((LocalCashBalanceViewModel.Activity.Row) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                MarketingMessageKt.MarketingMessageProfileHeader((MarketingMessageViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                LocalPosCheckInViewModel localPosCheckInViewModel = (LocalPosCheckInViewModel) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                Composer composer4 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    if (1.0f <= 0.0d) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SpacerKt.m298padding3ABfNKs(fillMaxWidth.then(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true)), 4.0f), Strings.getColors(gapComposer4).semantic.background.f1047app, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(52.0f));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer4, 54);
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
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
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Modifier aspectRatio = OffsetKt.aspectRatio(1.78f, SpacerKt.m300paddingVpY3zN4$default(companion, 24.0f, RecyclerView.DECELERATION_RATE, 2).then(new LayoutWeightElement(1.0f, false)), false);
                    ImageRequest.Builder builder = new ImageRequest.Builder((Context) gapComposer4.consume(AndroidCompositionLocals_androidKt.LocalContext));
                    builder.data = 2131232832;
                    builder.getExtras().set(ImageRequestsKt.repeatCountKey, 0);
                    Object rememberedValue5 = gapComposer4.rememberedValue();
                    if (rememberedValue5 == obj3) {
                        rememberedValue5 = new TabContentViewKt$$ExternalSyntheticLambda1(8, mutableState2);
                        gapComposer4.updateRememberedValue(rememberedValue5);
                    }
                    builder.getExtras().set(ImageRequestsKt.animationEndCallbackKey, (Function0) rememberedValue5);
                    AsyncImageKt.m1438AsyncImage10Xjiaw(builder.build(), null, aspectRatio, null, null, null, gapComposer4, 48, 2040);
                    Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer4).semantic.text.standard, (Composer) gapComposer4, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 18.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), Strings.getTypography(gapComposer4).sectionTitle, (TextLineBalancing) null, localPosCheckInViewModel.localCashAmount, (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer4).semantic.text.standard, (Composer) gapComposer4, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), Strings.getTypography(gapComposer4).bodyMedium, (TextLineBalancing) null, localPosCheckInViewModel.checkInExplanation, (Map) null, (Function1) null, false);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                LoyaltySheetKt.EducationalMiniCard((Modifier) obj5, (MiniCardModel) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ LocalMapKt$$ExternalSyntheticLambda9(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
