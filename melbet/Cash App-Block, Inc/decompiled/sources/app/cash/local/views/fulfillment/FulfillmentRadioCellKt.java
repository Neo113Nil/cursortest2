package app.cash.local.views.fulfillment;

import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17;
import androidx.compose.material3.InputChipDefaults;
import androidx.compose.material3.RippleKt;
import androidx.compose.material3.RippleNodeFactory;
import androidx.compose.material3.ShapesKt;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.tokens.InputChipTokens;
import androidx.compose.runtime.Applier;
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
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.badging.backend.RealBadger2$$ExternalSyntheticLambda0;
import app.cash.local.primitives.GlobalAddressWrapper;
import app.cash.local.primitives.GpsCoordinates;
import app.cash.local.primitives.LocationMenu$$ExternalSyntheticLambda6;
import app.cash.local.primitives.LocationToken;
import app.cash.local.viewmodels.ToolbarModel;
import app.cash.local.viewmodels.fulfillment.FulfillmentPickerViewModel;
import app.cash.local.viewmodels.fulfillment.SchedulingDayTimePickerViewModel;
import app.cash.local.views.ComposableSingletons$LocalViewFactoryKt$$ExternalSyntheticLambda41;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda5;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda28;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda9;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.toolbar.LocalToolbarKt;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.treehouse.EventBridge$sendEvent$1;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda7;
import bo.app.n$$ExternalSyntheticLambda1;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.y0$$ExternalSyntheticLambda0;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.plaid.internal.EnumC0170g;
import com.squareup.address.typeahead.backend.api.AddressState;
import com.squareup.address.typeahead.backend.api.LocationType;
import com.squareup.address.typeahead.backend.real.PlacesAddressSearcher;
import com.squareup.address.typeahead.views.AddressTypeaheadKt;
import com.squareup.address.typeahead.views.AddressTypeaheadState;
import com.squareup.address.typeahead.views.AddressTypeaheadStateKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda8;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetPeekPosition$FixedHeight;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda28;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalText;
import com.squareup.protos.cash.local.client.v1.SchedulingDay;
import com.squareup.protos.cash.local.client.v1.SchedulingTime;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class FulfillmentRadioCellKt {
    public static final ComposableLambdaImpl lambda$1149781273 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(19), false, 1149781273);
    public static final ComposableLambdaImpl lambda$1031731625 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(20), false, 1031731625);
    public static final ComposableLambdaImpl lambda$1925421906 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(21), false, 1925421906);
    public static final ComposableLambdaImpl lambda$530328720 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(22), false, 530328720);
    public static final ComposableLambdaImpl lambda$27469448 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(23), false, 27469448);

    /* renamed from: lambda$-1556620865, reason: not valid java name */
    public static final ComposableLambdaImpl f46lambda$1556620865 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(24), false, -1556620865);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r19v1, types: [androidx.compose.ui.Modifier] */
    public static final void DeliveryView(Modifier modifier, FulfillmentPickerViewModel.Delivery delivery, Function1 function1, Composer composer, int i) {
        LocalText localText;
        AnnotatedString annotatedString;
        boolean z;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1587971507);
        int i2 = i | (gapComposer.changedInstance(delivery) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            PlacesAddressSearcher placesAddressSearcher = (PlacesAddressSearcher) gapComposer.consume(AddressTypeaheadKt.LocalAddressSearcher);
            Country country = Country.US;
            LocationType locationType = LocationType.Address;
            GlobalAddressWrapper globalAddressWrapper = delivery.addressPrefill;
            LocalText localText2 = delivery.deliveryEstimatedTime;
            String str = delivery.deliveryQuote;
            GlobalAddress globalAddress = globalAddressWrapper != null ? globalAddressWrapper.globalAddress : null;
            ArrayList arrayList = delivery.savedAddresses;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((GlobalAddressWrapper) obj).placeId != null) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                GlobalAddressWrapper globalAddressWrapper2 = (GlobalAddressWrapper) it.next();
                String str2 = globalAddressWrapper2.placeId;
                str2.getClass();
                arrayList3.add(new Pair(str2, globalAddressWrapper2.globalAddress));
            }
            Continuation continuation = null;
            AddressTypeaheadState rememberAddressTypeaheadState = AddressTypeaheadStateKt.rememberAddressTypeaheadState(placesAddressSearcher, country, locationType, globalAddress, true, arrayList3, gapComposer, 25008, 0);
            AddressState address = rememberAddressTypeaheadState.getAddress();
            int i3 = i2 & 7168;
            boolean changed = gapComposer.changed(rememberAddressTypeaheadState) | (i3 == 2048);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new EventBridge$sendEvent$1(rememberAddressTypeaheadState, function1, continuation, 16);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, address, (Function2) rememberedValue);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(modifier, ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
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
            Modifier.Companion companion2 = companion;
            AddressTypeaheadKt.AddressTypeahead(rememberAddressTypeaheadState, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), Room.stringResource(gapComposer, R.string.local_views_fulfillment_search_for_an_address), gapComposer, 48, 0);
            gapComposer.startReplaceGroup(-1342206370);
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            if (str != null) {
                String str3 = !StringsKt.isBlank(str) ? str : null;
                if (str3 != null) {
                    builder.append(str3);
                }
            }
            if (localText2 != null) {
                String str4 = localText2.text;
                localText = (str4 == null || StringsKt.isBlank(str4)) ? null : localText2;
            } else {
                localText = null;
            }
            if (localText == null) {
                gapComposer.startReplaceGroup(1359387937);
                gapComposer.end(false);
                annotatedString = null;
            } else {
                gapComposer.startReplaceGroup(320945888);
                annotatedString = LocalViewsKt.toAnnotatedString(localText, gapComposer);
                gapComposer.end(false);
            }
            if (annotatedString != null) {
                if (builder.text.length() > 0) {
                    builder.append(" · ");
                }
                builder.append(annotatedString);
            }
            AnnotatedString annotatedString2 = builder.toAnnotatedString();
            gapComposer.end(false);
            if (str == null || StringsKt.isBlank(str)) {
                String str5 = localText2 != null ? localText2.text : null;
                if (str5 == null || StringsKt.isBlank(str5)) {
                    companion2 = AlphaKt.alpha(companion2, RecyclerView.DECELERATION_RATE);
                }
            }
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(Alignment.Companion.CenterHorizontally, SpacerKt.m300paddingVpY3zN4$default(companion2, RecyclerView.DECELERATION_RATE, 24.0f, 1));
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                z = false;
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                z = false;
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            boolean z3 = z;
            Room.m1164Text25TpFw(0, 0, 0, 3, 0, 0, 3824, colors.semantic.text.subtle, (Composer) gapComposer, m, annotatedString2, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            GpsCoordinates gpsCoordinates = delivery.gpsCoordinates;
            if (gpsCoordinates == null) {
                gapComposer.startReplaceGroup(1342158185);
                gapComposer.end(z3);
            } else {
                gapComposer.startReplaceGroup(1342158186);
                LocalMapKt.m1321LocalStaticMaphGBTI10(gpsCoordinates, null, 1.77f, 12.0f, RecyclerView.DECELERATION_RATE, gapComposer, 3456, 18);
                gapComposer = gapComposer;
                gapComposer.end(z3);
            }
            gapComposer.end(true);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default("");
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            if (StringsKt.isBlank((String) mutableState.getValue())) {
                z2 = true;
                gapComposer.startReplaceGroup(1807914741);
                gapComposer.end(z3);
            } else {
                gapComposer.startReplaceGroup(1807758098);
                z2 = true;
                ModalKt.Modal((Modifier) null, "Oops", (String) mutableState.getValue(), Expect_jvmKt.rememberComposableLambda(1913372548, new HeroCardViewKt$$ExternalSyntheticLambda28(1 == true ? 1 : 0, mutableState), gapComposer), (Function3) null, (Function3) null, gapComposer, 3120, 49);
                gapComposer.end(z3);
            }
            List list = delivery.availableTypes;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list) {
                if (((LocalFulfillmentType) obj2) != LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY) {
                    arrayList4.add(obj2);
                }
            }
            String str6 = delivery.ctaLabel;
            AddressState address2 = rememberAddressTypeaheadState.getAddress();
            boolean z4 = (((address2 instanceof AddressState.Valid) || (address2 instanceof AddressState.Error)) && delivery.hasDeliveryQuote) ? z2 : z3;
            boolean changed2 = gapComposer.changed(rememberAddressTypeaheadState);
            if (i3 != 2048) {
                z2 = z3;
            }
            boolean z5 = changed2 | z2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z5 != 0 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new n$$ExternalSyntheticLambda1(20, rememberAddressTypeaheadState, function1, mutableState);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            FulfillmentCtaGroup(arrayList4, str6, z4, (Function0) rememberedValue3, function1, gapComposer, 6 | ((i2 << 6) & 458752));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Yoga$$ExternalSyntheticLambda7((Object) modifier, (Object) delivery, function1, i, 2);
        }
    }

    public static final void EmptyStateBanner(Modifier modifier, SchedulingDay schedulingDay, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(310656574);
        int i2 = (gapComposer.changedInstance(schedulingDay) ? 32 : 16) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, Color.m675copywmQWz5c$default(0.15f, Strings.getColors(gapComposer).semantic.icon.warning, 14), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f));
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(m177backgroundbw27NRU, 16.0f);
            Strings.getSizes(gapComposer).getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            Trace.m1191Iconww6aTOc(Icons.AlertFill24, (String) null, (Modifier) null, Strings.getColors(gapComposer).semantic.icon.warning, gapComposer, 54, 4);
            String str = schedulingDay.day_label;
            if (str == null) {
                str = "??";
            }
            String format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.local_views_scheduling_day_times_empty_banner_text)).format(new Object[]{str});
            format2.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.warning, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(modifier, schedulingDay, i, 23);
        }
    }

    public static final void ErrorState(int i, Composer composer, Modifier modifier, String str, Function0 function0) {
        GapComposer gapComposer;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(844364290);
        int i2 = i | 6 | (gapComposer2.changed(str) ? 32 : 16) | (gapComposer2.changedInstance(function0) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(24.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterHorizontally, gapComposer2, 54);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, 0L, 0L, FontWeight.Medium, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 3) & 14, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer2, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            SizeKt.Button(function0, null, null, false, false, null, f46lambda$1556620865, gapComposer2, ((i2 >> 6) & 14) | 1572864, 62);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ToViewKt$$ExternalSyntheticLambda1(modifier2, str, function0, i, 1);
        }
    }

    public static final void FulfillmentCtaGroup(ArrayList arrayList, String str, boolean z, Function0 function0, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1890767977);
        int i2 = i | (gapComposer.changedInstance(arrayList) ? 32 : 16) | (gapComposer.changed(str) ? 256 : 128) | (gapComposer.changed(z) ? 2048 : 1024) | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked);
        if ((i & 196608) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer.shouldExecute(i2 & 1, (74897 & i2) != 74896)) {
            DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.VERTICAL, null, Expect_jvmKt.rememberComposableLambda(-1960069291, new MoneyTabUIKt$$ExternalSyntheticLambda8(arrayList, function0, z, function1, str), gapComposer), gapComposer, 24960, 11);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(arrayList, str, z, function0, function1, i);
        }
    }

    public static final void FulfillmentPickerSheet(FulfillmentPickerViewModel fulfillmentPickerViewModel, Function1 function1, Composer composer, int i) {
        fulfillmentPickerViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1621269663);
        int i2 = (gapComposer.changedInstance(fulfillmentPickerViewModel) ? 32 : 16) | i | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(16, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SheetKt.Sheet((Function0) rememberedValue, null, null, new SheetPeekPosition$FixedHeight(6, 900.0f, false), null, false, null, Expect_jvmKt.rememberComposableLambda(1962565096, new BrandSheetViewKt$$ExternalSyntheticLambda1(fulfillmentPickerViewModel, function1), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalViewFactory$$ExternalSyntheticLambda5(fulfillmentPickerViewModel, function1, i);
        }
    }

    public static final void FulfillmentRadioCell(Modifier modifier, String str, LocalText localText, String str2, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, Function0 function0, Composer composer, int i, int i2) {
        String str3;
        int i3;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        AnnotatedString annotatedString;
        Modifier.Companion companion;
        String str4;
        str.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-171056407);
        int i4 = i | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changedInstance(localText) ? 256 : 128);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            str3 = str2;
        } else {
            str3 = str2;
            i3 = i4 | (gapComposer.changed(str3) ? 2048 : 1024);
        }
        int i6 = i3 | (gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked) | 196608 | (gapComposer.changedInstance(function0) ? 1048576 : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i6 & 1, (599187 & i6) != 599186)) {
            if (i5 != 0) {
                str3 = null;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl3 = (MutableInteractionSourceImpl) rememberedValue;
            if (localText == null) {
                gapComposer.startReplaceGroup(-2109898779);
                gapComposer.end(false);
                annotatedString = null;
            } else {
                gapComposer.startReplaceGroup(-1176439908);
                annotatedString = LocalViewsKt.toAnnotatedString(localText, gapComposer);
                gapComposer.end(false);
            }
            RippleNodeFactory m548rippleH2RKhps$default = RippleKt.m548rippleH2RKhps$default(6, RecyclerView.DECELERATION_RATE, true);
            boolean z2 = (3670016 & i6) == 1048576;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == obj) {
                rememberedValue2 = new y0$$ExternalSyntheticLambda0(7, function0);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier m276defaultMinSizeVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m276defaultMinSizeVpY3zN4$default(SpacerKt.m300paddingVpY3zN4$default(ImageKt.m182clickableO2vRcR0$default(modifier, mutableInteractionSourceImpl3, m548rippleH2RKhps$default, false, null, null, (Function0) rememberedValue2, 28), RecyclerView.DECELERATION_RATE, 8.0f, 1), RecyclerView.DECELERATION_RATE, 32.0f, 1);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m276defaultMinSizeVpY3zN4$default);
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
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            gapComposer.startReplaceGroup(1946265154);
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            int pushStyle = builder.pushStyle(TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodySmall, Strings.getColors(gapComposer).semantic.text.standard, 0L, FontWeight.Medium, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777210).spanStyle);
            try {
                builder.append(str);
                if (annotatedString != null) {
                    gapComposer.startReplaceGroup(2064763244);
                    pushStyle = builder.pushStyle(TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodySmall, Strings.getColors(gapComposer).semantic.text.subtle, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214).spanStyle);
                    try {
                        builder.append(" · ");
                        builder.append(annotatedString);
                        builder.pop(pushStyle);
                        gapComposer.end(false);
                    } finally {
                    }
                } else {
                    gapComposer.startReplaceGroup(2065037129);
                    gapComposer.end(false);
                }
                AnnotatedString annotatedString2 = builder.toAnnotatedString();
                gapComposer.end(false);
                Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer, (Modifier) layoutWeightElement, annotatedString2, (TextStyle) null, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                if (str3 == null) {
                    gapComposer.startReplaceGroup(205279651);
                    gapComposer.end(false);
                    str4 = str3;
                    companion = companion2;
                } else {
                    gapComposer.startReplaceGroup(205279652);
                    companion = companion2;
                    str4 = str3;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), Strings.getTypography(gapComposer).linkSmall, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                }
                ModalKt.Radio(z, SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), null, false, null, gapComposer, ((i6 >> 12) & 14) | 48, 28);
                gapComposer.end(true);
                str3 = str4;
                mutableInteractionSourceImpl2 = mutableInteractionSourceImpl3;
            } finally {
            }
        } else {
            gapComposer.skipToGroupEnd();
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda2(modifier, str, localText, str3, z, mutableInteractionSourceImpl2, function0, i, i2);
        }
    }

    public static final void PickupView(Modifier modifier, FulfillmentPickerViewModel.Pickup pickup, Function1 function1, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1965015363);
        int i2 = i | (gapComposer.changedInstance(pickup) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                String str = pickup.selected;
                rememberedValue = Updater.mutableStateOf$default(str != null ? new LocationToken(str) : null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(modifier, 1.0f);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            boolean changedInstance = gapComposer.changedInstance(pickup);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new RealBadger2$$ExternalSyntheticLambda0(24, pickup, mutableState);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            LazyDslKt.LazyColumn(fillMaxWidth, null, null, null, horizontal, null, false, null, (Function1) rememberedValue2, gapComposer, 196608, 478);
            SpacerKt.Spacer(gapComposer, androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(Modifier.Companion.$$INSTANCE, 32.0f));
            List list = pickup.availableTypes;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((LocalFulfillmentType) obj) != LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP) {
                    arrayList.add(obj);
                }
            }
            String str2 = pickup.ctaLabel;
            LocationToken locationToken = (LocationToken) mutableState.getValue();
            boolean z = (locationToken != null ? locationToken.value : null) != null;
            boolean z2 = (i2 & 7168) == 2048;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z2 || rememberedValue3 == neverEqualPolicy) {
                function12 = function1;
                rememberedValue3 = new CashtagViewKt$$ExternalSyntheticLambda13(function12, mutableState, 1);
                gapComposer.updateRememberedValue(rememberedValue3);
            } else {
                function12 = function1;
            }
            FulfillmentCtaGroup(arrayList, str2, z, (Function0) rememberedValue3, function12, gapComposer, 6 | ((i2 << 6) & 458752));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Yoga$$ExternalSyntheticLambda7((Object) modifier, (Object) pickup, function1, i, 3);
        }
    }

    public static final void SchedulingDayOptions(List list, SchedulingDay schedulingDay, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(690478092);
        int i2 = i | (gapComposer.changedInstance(list) ? 4 : 2) | (gapComposer.changedInstance(schedulingDay) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(16.0f, 24.0f, 16.0f, 24.0f);
            boolean changedInstance = gapComposer.changedInstance(list) | gapComposer.changedInstance(schedulingDay) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(2, list, schedulingDay, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.LazyRow(fillMaxWidth, null, paddingValuesImpl, arrangement$SpacedAligned, null, null, false, null, (Function1) rememberedValue, gapComposer, 24582, 490);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Yoga$$ExternalSyntheticLambda7((Object) list, (Object) schedulingDay, function1, i, 4);
        }
    }

    public static final void SchedulingDayTimeOptions(SchedulingDayTimePickerViewModel.ModelState.LoadedDays loadedDays, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1979128581);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(loadedDays) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 18;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxSize = androidx.compose.foundation.layout.SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean changedInstance = gapComposer.changedInstance(loadedDays) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new RealBadger2$$ExternalSyntheticLambda0(25, loadedDays, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.LazyColumn(fillMaxSize, null, null, null, null, null, false, null, (Function1) rememberedValue, gapComposer, 6, 510);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(loadedDays, function1, i, i3);
        }
    }

    public static final void SchedulingDayTimePickerView(Modifier modifier, SchedulingDayTimePickerViewModel schedulingDayTimePickerViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        modifier.getClass();
        schedulingDayTimePickerViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-263626122);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(schedulingDayTimePickerViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
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
            ToolbarModel toolbarModel = new ToolbarModel(schedulingDayTimePickerViewModel.title);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(17, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            LocalToolbarKt.m1333LocalToolbarflo8M7A(companion, toolbarModel, null, (Function0) rememberedValue, RecyclerView.DECELERATION_RATE, null, gapComposer2, 6, 108);
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), true);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            SchedulingDayTimePickerViewModel.ModelState modelState = schedulingDayTimePickerViewModel.modelState;
            if (Intrinsics.areEqual(modelState, SchedulingDayTimePickerViewModel.ModelState.LoadingDays.INSTANCE)) {
                gapComposer2.startReplaceGroup(1621642307);
                ProgressCircularKt.ProgressCircular(6, 0, gapComposer2, androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(companion, 32.0f));
                gapComposer2.end(false);
            } else if (modelState instanceof SchedulingDayTimePickerViewModel.ModelState.LoadedDays) {
                gapComposer2.startReplaceGroup(1621645398);
                SchedulingDayTimeOptions((SchedulingDayTimePickerViewModel.ModelState.LoadedDays) modelState, function1, gapComposer2, (i2 >> 3) & 112);
                gapComposer2.end(false);
            } else {
                if (!Intrinsics.areEqual(modelState, SchedulingDayTimePickerViewModel.ModelState.FailedToLoadDays.INSTANCE)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 1621640258, false);
                }
                gapComposer2.startReplaceGroup(1621649271);
                String stringResource = Room.stringResource(gapComposer2, R.string.local_views_retry_load_scheduling_day_times);
                boolean z2 = i3 == 256;
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (z2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(19, function1);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                ErrorState(0, gapComposer2, null, stringResource, (Function0) rememberedValue2);
                gapComposer2.end(false);
            }
            gapComposer2.end(true);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1046757870, new ComposableSingletons$LocalViewFactoryKt$$ExternalSyntheticLambda41(function1, schedulingDayTimePickerViewModel), gapComposer2), gapComposer2, 24576, 15);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(i, 5, modifier, schedulingDayTimePickerViewModel, function1);
        }
    }

    public static final void SchedulingTimePickerChip(Modifier modifier, String str, String str2, boolean z, Function0 function0, MutableInteractionSourceImpl mutableInteractionSourceImpl, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        long j;
        long j2;
        str.getClass();
        str2.getClass();
        function0.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1589316555);
        int i2 = i | 6 | (gapComposer2.changed(str) ? 32 : 16) | (gapComposer2.changed(str2) ? 256 : 128) | (gapComposer2.changed(z) ? 2048 : 1024) | (gapComposer2.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked) | 196608;
        if (gapComposer2.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl3 = (MutableInteractionSourceImpl) rememberedValue;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m275defaultMinSizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m275defaultMinSizeVpY3zN4(companion, 96.0f, 56.0f);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = new LocationMenu$$ExternalSyntheticLambda6(22);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m275defaultMinSizeVpY3zN4, false, (Function1) rememberedValue2);
            if (z) {
                gapComposer2.startReplaceGroup(390454533);
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j = colors.semantic.background.inverse;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(390531754);
                Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j = colors2.semantic.border.subtle;
                gapComposer2.end(false);
            }
            BorderStroke m173BorderStrokecXLIe8U = CanvasKt.m173BorderStrokecXLIe8U(j, 1.0f);
            if (z) {
                gapComposer2.startReplaceGroup(390640781);
                Colors colors3 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j2 = colors3.semantic.background.inverse;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(390710097);
                Colors colors4 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors4 == null) {
                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j2 = colors4.semantic.background.f1047app;
                gapComposer2.end(false);
            }
            int i3 = InputChipDefaults.$r8$clinit;
            int i4 = ((i2 >> 12) & 14) | 805306368;
            modifier2 = companion;
            gapComposer = gapComposer2;
            SurfaceKt.m556Surfaceo_FOJdg(function0, semantics, false, ShapesKt.getValue(InputChipTokens.ContainerShape, gapComposer2), j2, 0L, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, m173BorderStrokecXLIe8U, mutableInteractionSourceImpl3, Expect_jvmKt.rememberComposableLambda(1414837504, new SchedulingTimePickerChipKt$$ExternalSyntheticLambda1(str, str2, z), gapComposer2), gapComposer, i4, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl3;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TooltipKt$$ExternalSyntheticLambda2(modifier2, str, str2, z, function0, mutableInteractionSourceImpl2, i, 1);
        }
    }

    public static final void SchedulingTimeRow(SchedulingTime schedulingTime, boolean z, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1617849305);
        int i2 = i | (gapComposer.changedInstance(schedulingTime) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(SpacerKt.m298padding3ABfNKs(Modifier.Companion.$$INSTANCE, 4.0f), 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier clip = ClipKt.clip(fillMaxWidth, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            String str = schedulingTime.scheduling_day_time_token;
            str.getClass();
            boolean changed = gapComposer.changed(str);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m182clickableO2vRcR0$default(clip, (MutableInteractionSourceImpl) rememberedValue, com.squareup.cash.arcade.theme.RippleKt.m3400rippleYJYuY3k(0L, true, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 13), false, null, null, function0, 28), 12.0f, 16.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier, 1.0f, true);
            String str2 = schedulingTime.time_label;
            str2.getClass();
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall, 0L, 0L, FontWeight.Medium, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) m, m994copyp1EtxEg$default, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            ModalKt.Radio(z, null, null, false, null, gapComposer, (i2 >> 3) & 14, 30);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(schedulingTime, z, function0, i, 2);
        }
    }

    public static final int getStringResId(LocalFulfillmentType localFulfillmentType) {
        localFulfillmentType.getClass();
        switch (FulfillmentPickerSheetKt$WhenMappings.$EnumSwitchMapping$0[localFulfillmentType.ordinal()]) {
            case 1:
                break;
            case 2:
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                Path$$ExternalSyntheticBUOutline0.m$1(localFulfillmentType, "Unexpected type ");
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                break;
        }
        return 0;
    }
}
