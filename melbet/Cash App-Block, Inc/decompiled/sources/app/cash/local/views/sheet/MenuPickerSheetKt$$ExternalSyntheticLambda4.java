package app.cash.local.views.sheet;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.appcompat.app.LocaleOverlayHelper;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.viewmodels.LocationStatus;
import app.cash.local.viewmodels.sheet.EducationalSheetModel;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda4;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import app.cash.local.views.wallet.LocalHomeViewKt;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda6;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.xg$$ExternalSyntheticLambda9;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda1;
import coil3.size.DimensionKt;
import coil3.svg.internal.ParseSvg_androidKt;
import com.bugsnag.android.MarshalledEventSource;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.internal.zzca;
import com.google.android.gms.maps.internal.zzg;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.tasks.zzb;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.CameraPositionStateKt;
import com.google.maps.android.compose.MapApplier;
import com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$1;
import com.google.maps.android.compose.MapUpdaterState;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda2;
import com.google.maps.android.compose.clustering.ClusteringKt;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cardcustomizations.stampview.FadingStamp;
import com.squareup.cardcustomizations.stampview.PatternStampState;
import com.squareup.cardcustomizations.stampview.StampMovingListener;
import com.squareup.cardcustomizations.stampview.StampState;
import com.squareup.cardcustomizations.stampview.TransformedStamp;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountDocumentDownloaderDialogViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.account.components.AccountToDoKt;
import com.squareup.cash.account.components.AccountToDoKt$$ExternalSyntheticLambda0;
import com.squareup.cash.account.components.PreviewTrustIndicator;
import com.squareup.cash.account.components.ThemeSwitcherView;
import com.squareup.cash.account.components.ThemeSwitcherViewKt;
import com.squareup.cash.account.components.accountswitcher.AddAccountOptionsView;
import com.squareup.cash.account.components.accountswitcher.BadgeTitleKt;
import com.squareup.cash.account.settings.viewmodels.AccountAvatarViewModel;
import com.squareup.cash.account.settings.viewmodels.AccountCardViewModel;
import com.squareup.cash.account.settings.viewmodels.ThemeData;
import com.squareup.cash.account.settings.viewmodels.ThemeSwitcherViewModel;
import com.squareup.cash.account.settings.viewmodels.business.BusinessInfoViewModel;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsDownloadOptionsViewModel;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsDownloaderViewModel;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import com.squareup.cash.account.viewmodels.accountswitcher.AddAccountOptionsViewModel;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.viewmodels.BalanceFeedViewModel;
import com.squareup.cash.activity.views.ActivityTabViewKt;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda17;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.activity.views.EmbeddedHeaderScope;
import com.squareup.cash.activity.views.receipts.ReceiptTimelineKt;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.integration.analytics.UtilsKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.offers.db.OffersHomeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.paymentpad.viewmodels.MainPaymentPadViewModel;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.franklin.ui.ReceiptSection;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.util.Strings;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class MenuPickerSheetKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ MenuPickerSheetKt$$ExternalSyntheticLambda4(BusinessInfoViewModel.ConfirmationSheetViewModel confirmationSheetViewModel, Function1 function1) {
        this.$r8$classId = 19;
        this.f$0 = confirmationSheetViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Applier applier;
        ArrayList plus;
        int i = this.$r8$classId;
        int i2 = 10;
        final int i3 = 6;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Object obj3 = Composer.Companion.Empty;
        Modifier modifier = Modifier.Companion.$$INSTANCE;
        final int i4 = 3;
        final int i5 = 2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                LoyaltySheetKt.MenuPickerRow((LocationMenu.Menu) obj5, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                LoyaltySheetKt.EducationalHeroImage((Modifier) obj5, (EducationalSheetModel.Image.HeroImage) obj4, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                LoyaltySheetKt.m1332LocalBrandLocationStatusRowdrOMvmE((Modifier) obj5, (LocationStatus) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                LocalHomeViewKt.ActiveOrderDetails((Modifier) obj5, (LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                MapUpdaterState mapUpdaterState = (MapUpdaterState) obj5;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = mapUpdaterState.cameraPositionState$delegate;
                Function2 function2 = (Function2) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier2 = gapComposer.applier;
                if (shouldExecute) {
                    gapComposer.startReplaceGroup(-1929097700);
                    applier2.getClass();
                    MapApplier mapApplier = (MapApplier) applier2;
                    final GoogleMap googleMap = mapApplier.map;
                    MapView mapView = mapApplier.mapView;
                    if (((Boolean) mapUpdaterState.mergeDescendants$delegate.getValue()).booleanValue()) {
                        mapView.setImportantForAccessibility(4);
                    }
                    Object obj6 = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                    LayoutDirection layoutDirection = (LayoutDirection) gapComposer.consume(CompositionLocalsKt.LocalLayoutDirection);
                    boolean changed = gapComposer.changed(mapUpdaterState) | gapComposer.changedInstance(googleMap) | gapComposer.changed(obj6) | gapComposer.changed(layoutDirection.ordinal());
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == obj3) {
                        applier = applier2;
                        Object marshalledEventSource = new MarshalledEventSource(mapUpdaterState, googleMap, obj6, layoutDirection, 1);
                        gapComposer.updateRememberedValue(marshalledEventSource);
                        rememberedValue = marshalledEventSource;
                    } else {
                        applier = applier2;
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    if (!(applier instanceof MapApplier)) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(function0);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m577updateimpl(gapComposer, obj6, MapUpdaterKt$MapUpdater$1$2$1.INSTANCE);
                    Updater.m577updateimpl(gapComposer, layoutDirection, MapUpdaterKt$MapUpdater$1$2$1.INSTANCE$2);
                    Updater.m577updateimpl(gapComposer, (String) mapUpdaterState.contentDescription$delegate.getValue(), MapUpdaterKt$MapUpdater$1$2$1.INSTANCE$3);
                    PaddingValues paddingValues = (PaddingValues) mapUpdaterState.contentPadding$delegate.getValue();
                    final int i6 = false ? 1 : 0;
                    Updater.m577updateimpl(gapComposer, paddingValues, new Function2() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            zzb uiSettings;
                            zzb uiSettings2;
                            zzb uiSettings3;
                            zzb uiSettings4;
                            zzb uiSettings5;
                            zzb uiSettings6;
                            int i7 = i6;
                            GoogleMap googleMap2 = googleMap;
                            switch (i7) {
                                case 0:
                                    MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj7;
                                    PaddingValues paddingValues2 = (PaddingValues) obj8;
                                    mapPropertiesNode.getClass();
                                    paddingValues2.getClass();
                                    MapUpdaterKt.access$applyContentPadding(mapPropertiesNode, googleMap2, paddingValues2);
                                    return Unit.INSTANCE;
                                case 1:
                                    LatLngBounds latLngBounds = (LatLngBounds) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar = googleMap2.zza;
                                        Parcel zza = zzgVar.zza();
                                        zzc.zze(zza, latLngBounds);
                                        zzgVar.zzc(zza, 95);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                case 2:
                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar2 = googleMap2.zza;
                                        Parcel zza2 = zzgVar2.zza();
                                        zzc.zze(zza2, mapStyleOptions);
                                        Parcel zzJ = zzgVar2.zzJ(zza2, 91);
                                        zzJ.readInt();
                                        zzJ.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e2) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                                        return null;
                                    }
                                case 3:
                                    MapType mapType = (MapType) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    mapType.getClass();
                                    int i8 = mapType.value;
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar3 = googleMap2.zza;
                                        Parcel zza3 = zzgVar3.zza();
                                        zza3.writeInt(i8);
                                        zzgVar3.zzc(zza3, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e3) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                                        return null;
                                    }
                                case 4:
                                    float floatValue = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar4 = googleMap2.zza;
                                        Parcel zza4 = zzgVar4.zza();
                                        zza4.writeFloat(floatValue);
                                        zzgVar4.zzc(zza4, 93);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e4) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e4);
                                        return null;
                                    }
                                case 5:
                                    float floatValue2 = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar5 = googleMap2.zza;
                                        Parcel zza5 = zzgVar5.zza();
                                        zza5.writeFloat(floatValue2);
                                        zzgVar5.zzc(zza5, 92);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e5) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e5);
                                        return null;
                                    }
                                case 6:
                                    Integer num = (Integer) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        googleMap2.getClass();
                                        try {
                                            zzg zzgVar6 = googleMap2.zza;
                                            Parcel zza6 = zzgVar6.zza();
                                            zza6.writeInt(intValue2);
                                            zzgVar6.zzc(zza6, 113);
                                        } catch (RemoteException e6) {
                                            TransportImpl$$ExternalSyntheticLambda0.m(e6);
                                            return null;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings = googleMap2.getUiSettings();
                                        uiSettings.getClass();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        zzca zzcaVar = (zzca) uiSettings.zza;
                                        Parcel zza7 = zzcaVar.zza();
                                        int i9 = zzc.$r8$clinit;
                                        zza7.writeInt(booleanValue ? 1 : 0);
                                        zzcaVar.zzc(zza7, 2);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e7) {
                                        throw new RuntimeRemoteException((Throwable) e7);
                                    }
                                case 8:
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings2 = googleMap2.getUiSettings();
                                        uiSettings2.getClass();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        zzca zzcaVar2 = (zzca) uiSettings2.zza;
                                        Parcel zza8 = zzcaVar2.zza();
                                        int i10 = zzc.$r8$clinit;
                                        zza8.writeInt(booleanValue2 ? 1 : 0);
                                        zzcaVar2.zzc(zza8, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeRemoteException((Throwable) e8);
                                    }
                                case 9:
                                    boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings3 = googleMap2.getUiSettings();
                                        uiSettings3.getClass();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        zzca zzcaVar3 = (zzca) uiSettings3.zza;
                                        Parcel zza9 = zzcaVar3.zza();
                                        int i11 = zzc.$r8$clinit;
                                        zza9.writeInt(booleanValue3 ? 1 : 0);
                                        zzcaVar3.zzc(zza9, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e9) {
                                        throw new RuntimeRemoteException((Throwable) e9);
                                    }
                                case 10:
                                    boolean booleanValue4 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings7 = googleMap2.getUiSettings();
                                        uiSettings7.getClass();
                                        try {
                                            zzca zzcaVar4 = (zzca) uiSettings7.zza;
                                            Parcel zza10 = zzcaVar4.zza();
                                            int i12 = zzc.$r8$clinit;
                                            zza10.writeInt(booleanValue4 ? 1 : 0);
                                            zzcaVar4.zzc(zza10, 3);
                                        } catch (RemoteException e10) {
                                            throw new RuntimeRemoteException((Throwable) e10);
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    boolean booleanValue5 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings4 = googleMap2.getUiSettings();
                                        uiSettings4.getClass();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        zzca zzcaVar5 = (zzca) uiSettings4.zza;
                                        Parcel zza11 = zzcaVar5.zza();
                                        int i13 = zzc.$r8$clinit;
                                        zza11.writeInt(booleanValue5 ? 1 : 0);
                                        zzcaVar5.zzc(zza11, 7);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e11) {
                                        throw new RuntimeRemoteException((Throwable) e11);
                                    }
                                case 12:
                                    boolean booleanValue6 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings5 = googleMap2.getUiSettings();
                                        uiSettings5.getClass();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        zzca zzcaVar6 = (zzca) uiSettings5.zza;
                                        Parcel zza12 = zzcaVar6.zza();
                                        int i14 = zzc.$r8$clinit;
                                        zza12.writeInt(booleanValue6 ? 1 : 0);
                                        zzcaVar6.zzc(zza12, 4);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e12) {
                                        throw new RuntimeRemoteException((Throwable) e12);
                                    }
                                case 13:
                                    boolean booleanValue7 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings8 = googleMap2.getUiSettings();
                                        uiSettings8.getClass();
                                        try {
                                            zzca zzcaVar7 = (zzca) uiSettings8.zza;
                                            Parcel zza13 = zzcaVar7.zza();
                                            int i15 = zzc.$r8$clinit;
                                            zza13.writeInt(booleanValue7 ? 1 : 0);
                                            zzcaVar7.zzc(zza13, 20);
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException((Throwable) e13);
                                        }
                                    } catch (Exception unused7) {
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    boolean booleanValue8 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings9 = googleMap2.getUiSettings();
                                        uiSettings9.getClass();
                                        try {
                                            zzca zzcaVar8 = (zzca) uiSettings9.zza;
                                            Parcel zza14 = zzcaVar8.zza();
                                            int i16 = zzc.$r8$clinit;
                                            zza14.writeInt(booleanValue8 ? 1 : 0);
                                            zzcaVar8.zzc(zza14, 6);
                                        } catch (RemoteException e14) {
                                            throw new RuntimeRemoteException((Throwable) e14);
                                        }
                                    } catch (Exception unused8) {
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    boolean booleanValue9 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings10 = googleMap2.getUiSettings();
                                        uiSettings10.getClass();
                                        try {
                                            zzca zzcaVar9 = (zzca) uiSettings10.zza;
                                            Parcel zza15 = zzcaVar9.zza();
                                            int i17 = zzc.$r8$clinit;
                                            zza15.writeInt(booleanValue9 ? 1 : 0);
                                            zzcaVar9.zzc(zza15, 1);
                                        } catch (RemoteException e15) {
                                            throw new RuntimeRemoteException((Throwable) e15);
                                        }
                                    } catch (Exception unused9) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    boolean booleanValue10 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings6 = googleMap2.getUiSettings();
                                        uiSettings6.getClass();
                                    } catch (Exception unused10) {
                                    }
                                    try {
                                        zzca zzcaVar10 = (zzca) uiSettings6.zza;
                                        Parcel zza16 = zzcaVar10.zza();
                                        int i18 = zzc.$r8$clinit;
                                        zza16.writeInt(booleanValue10 ? 1 : 0);
                                        zzcaVar10.zzc(zza16, 5);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e16) {
                                        throw new RuntimeRemoteException((Throwable) e16);
                                    }
                                case 17:
                                    MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj7;
                                    if (obj8 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    mapPropertiesNode2.getClass();
                                    zzg zzgVar7 = googleMap2.zza;
                                    try {
                                        Parcel zza17 = zzgVar7.zza();
                                        zzc.zzg(zza17, null);
                                        zzgVar7.zzc(zza17, 24);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e17) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e17);
                                        return null;
                                    }
                                case 18:
                                    boolean booleanValue11 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar8 = googleMap2.zza;
                                        Parcel zza18 = zzgVar8.zza();
                                        int i19 = zzc.$r8$clinit;
                                        zza18.writeInt(booleanValue11 ? 1 : 0);
                                        zzgVar8.zzc(zza18, 41);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e18) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e18);
                                        return null;
                                    }
                                case 19:
                                    boolean booleanValue12 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar9 = googleMap2.zza;
                                        Parcel zza19 = zzgVar9.zza();
                                        int i20 = zzc.$r8$clinit;
                                        zza19.writeInt(booleanValue12 ? 1 : 0);
                                        Parcel zzJ2 = zzgVar9.zzJ(zza19, 20);
                                        zzJ2.readInt();
                                        zzJ2.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e19) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e19);
                                        return null;
                                    }
                                case 20:
                                    boolean booleanValue13 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar10 = googleMap2.zza;
                                        Parcel zza20 = zzgVar10.zza();
                                        int i21 = zzc.$r8$clinit;
                                        zza20.writeInt(booleanValue13 ? 1 : 0);
                                        zzgVar10.zzc(zza20, 22);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e20) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e20);
                                        return null;
                                    }
                                default:
                                    boolean booleanValue14 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar11 = googleMap2.zza;
                                        Parcel zza21 = zzgVar11.zza();
                                        int i22 = zzc.$r8$clinit;
                                        zza21.writeInt(booleanValue14 ? 1 : 0);
                                        zzgVar11.zzc(zza21, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e21) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e21);
                                        return null;
                                    }
                            }
                        }
                    });
                    if (mapUpdaterState.locationSource$delegate.getValue() != null) {
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return null;
                    }
                    final int i7 = 17;
                    Updater.m576setimpl(gapComposer, null, new Function2() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            zzb uiSettings;
                            zzb uiSettings2;
                            zzb uiSettings3;
                            zzb uiSettings4;
                            zzb uiSettings5;
                            zzb uiSettings6;
                            int i72 = i7;
                            GoogleMap googleMap2 = googleMap;
                            switch (i72) {
                                case 0:
                                    MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj7;
                                    PaddingValues paddingValues2 = (PaddingValues) obj8;
                                    mapPropertiesNode.getClass();
                                    paddingValues2.getClass();
                                    MapUpdaterKt.access$applyContentPadding(mapPropertiesNode, googleMap2, paddingValues2);
                                    return Unit.INSTANCE;
                                case 1:
                                    LatLngBounds latLngBounds = (LatLngBounds) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar = googleMap2.zza;
                                        Parcel zza = zzgVar.zza();
                                        zzc.zze(zza, latLngBounds);
                                        zzgVar.zzc(zza, 95);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                case 2:
                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar2 = googleMap2.zza;
                                        Parcel zza2 = zzgVar2.zza();
                                        zzc.zze(zza2, mapStyleOptions);
                                        Parcel zzJ = zzgVar2.zzJ(zza2, 91);
                                        zzJ.readInt();
                                        zzJ.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e2) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                                        return null;
                                    }
                                case 3:
                                    MapType mapType = (MapType) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    mapType.getClass();
                                    int i8 = mapType.value;
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar3 = googleMap2.zza;
                                        Parcel zza3 = zzgVar3.zza();
                                        zza3.writeInt(i8);
                                        zzgVar3.zzc(zza3, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e3) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                                        return null;
                                    }
                                case 4:
                                    float floatValue = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar4 = googleMap2.zza;
                                        Parcel zza4 = zzgVar4.zza();
                                        zza4.writeFloat(floatValue);
                                        zzgVar4.zzc(zza4, 93);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e4) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e4);
                                        return null;
                                    }
                                case 5:
                                    float floatValue2 = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar5 = googleMap2.zza;
                                        Parcel zza5 = zzgVar5.zza();
                                        zza5.writeFloat(floatValue2);
                                        zzgVar5.zzc(zza5, 92);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e5) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e5);
                                        return null;
                                    }
                                case 6:
                                    Integer num = (Integer) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        googleMap2.getClass();
                                        try {
                                            zzg zzgVar6 = googleMap2.zza;
                                            Parcel zza6 = zzgVar6.zza();
                                            zza6.writeInt(intValue2);
                                            zzgVar6.zzc(zza6, 113);
                                        } catch (RemoteException e6) {
                                            TransportImpl$$ExternalSyntheticLambda0.m(e6);
                                            return null;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings = googleMap2.getUiSettings();
                                        uiSettings.getClass();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        zzca zzcaVar = (zzca) uiSettings.zza;
                                        Parcel zza7 = zzcaVar.zza();
                                        int i9 = zzc.$r8$clinit;
                                        zza7.writeInt(booleanValue ? 1 : 0);
                                        zzcaVar.zzc(zza7, 2);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e7) {
                                        throw new RuntimeRemoteException((Throwable) e7);
                                    }
                                case 8:
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings2 = googleMap2.getUiSettings();
                                        uiSettings2.getClass();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        zzca zzcaVar2 = (zzca) uiSettings2.zza;
                                        Parcel zza8 = zzcaVar2.zza();
                                        int i10 = zzc.$r8$clinit;
                                        zza8.writeInt(booleanValue2 ? 1 : 0);
                                        zzcaVar2.zzc(zza8, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeRemoteException((Throwable) e8);
                                    }
                                case 9:
                                    boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings3 = googleMap2.getUiSettings();
                                        uiSettings3.getClass();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        zzca zzcaVar3 = (zzca) uiSettings3.zza;
                                        Parcel zza9 = zzcaVar3.zza();
                                        int i11 = zzc.$r8$clinit;
                                        zza9.writeInt(booleanValue3 ? 1 : 0);
                                        zzcaVar3.zzc(zza9, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e9) {
                                        throw new RuntimeRemoteException((Throwable) e9);
                                    }
                                case 10:
                                    boolean booleanValue4 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings7 = googleMap2.getUiSettings();
                                        uiSettings7.getClass();
                                        try {
                                            zzca zzcaVar4 = (zzca) uiSettings7.zza;
                                            Parcel zza10 = zzcaVar4.zza();
                                            int i12 = zzc.$r8$clinit;
                                            zza10.writeInt(booleanValue4 ? 1 : 0);
                                            zzcaVar4.zzc(zza10, 3);
                                        } catch (RemoteException e10) {
                                            throw new RuntimeRemoteException((Throwable) e10);
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    boolean booleanValue5 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings4 = googleMap2.getUiSettings();
                                        uiSettings4.getClass();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        zzca zzcaVar5 = (zzca) uiSettings4.zza;
                                        Parcel zza11 = zzcaVar5.zza();
                                        int i13 = zzc.$r8$clinit;
                                        zza11.writeInt(booleanValue5 ? 1 : 0);
                                        zzcaVar5.zzc(zza11, 7);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e11) {
                                        throw new RuntimeRemoteException((Throwable) e11);
                                    }
                                case 12:
                                    boolean booleanValue6 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings5 = googleMap2.getUiSettings();
                                        uiSettings5.getClass();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        zzca zzcaVar6 = (zzca) uiSettings5.zza;
                                        Parcel zza12 = zzcaVar6.zza();
                                        int i14 = zzc.$r8$clinit;
                                        zza12.writeInt(booleanValue6 ? 1 : 0);
                                        zzcaVar6.zzc(zza12, 4);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e12) {
                                        throw new RuntimeRemoteException((Throwable) e12);
                                    }
                                case 13:
                                    boolean booleanValue7 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings8 = googleMap2.getUiSettings();
                                        uiSettings8.getClass();
                                        try {
                                            zzca zzcaVar7 = (zzca) uiSettings8.zza;
                                            Parcel zza13 = zzcaVar7.zza();
                                            int i15 = zzc.$r8$clinit;
                                            zza13.writeInt(booleanValue7 ? 1 : 0);
                                            zzcaVar7.zzc(zza13, 20);
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException((Throwable) e13);
                                        }
                                    } catch (Exception unused7) {
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    boolean booleanValue8 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings9 = googleMap2.getUiSettings();
                                        uiSettings9.getClass();
                                        try {
                                            zzca zzcaVar8 = (zzca) uiSettings9.zza;
                                            Parcel zza14 = zzcaVar8.zza();
                                            int i16 = zzc.$r8$clinit;
                                            zza14.writeInt(booleanValue8 ? 1 : 0);
                                            zzcaVar8.zzc(zza14, 6);
                                        } catch (RemoteException e14) {
                                            throw new RuntimeRemoteException((Throwable) e14);
                                        }
                                    } catch (Exception unused8) {
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    boolean booleanValue9 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings10 = googleMap2.getUiSettings();
                                        uiSettings10.getClass();
                                        try {
                                            zzca zzcaVar9 = (zzca) uiSettings10.zza;
                                            Parcel zza15 = zzcaVar9.zza();
                                            int i17 = zzc.$r8$clinit;
                                            zza15.writeInt(booleanValue9 ? 1 : 0);
                                            zzcaVar9.zzc(zza15, 1);
                                        } catch (RemoteException e15) {
                                            throw new RuntimeRemoteException((Throwable) e15);
                                        }
                                    } catch (Exception unused9) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    boolean booleanValue10 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings6 = googleMap2.getUiSettings();
                                        uiSettings6.getClass();
                                    } catch (Exception unused10) {
                                    }
                                    try {
                                        zzca zzcaVar10 = (zzca) uiSettings6.zza;
                                        Parcel zza16 = zzcaVar10.zza();
                                        int i18 = zzc.$r8$clinit;
                                        zza16.writeInt(booleanValue10 ? 1 : 0);
                                        zzcaVar10.zzc(zza16, 5);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e16) {
                                        throw new RuntimeRemoteException((Throwable) e16);
                                    }
                                case 17:
                                    MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj7;
                                    if (obj8 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    mapPropertiesNode2.getClass();
                                    zzg zzgVar7 = googleMap2.zza;
                                    try {
                                        Parcel zza17 = zzgVar7.zza();
                                        zzc.zzg(zza17, null);
                                        zzgVar7.zzc(zza17, 24);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e17) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e17);
                                        return null;
                                    }
                                case 18:
                                    boolean booleanValue11 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar8 = googleMap2.zza;
                                        Parcel zza18 = zzgVar8.zza();
                                        int i19 = zzc.$r8$clinit;
                                        zza18.writeInt(booleanValue11 ? 1 : 0);
                                        zzgVar8.zzc(zza18, 41);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e18) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e18);
                                        return null;
                                    }
                                case 19:
                                    boolean booleanValue12 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar9 = googleMap2.zza;
                                        Parcel zza19 = zzgVar9.zza();
                                        int i20 = zzc.$r8$clinit;
                                        zza19.writeInt(booleanValue12 ? 1 : 0);
                                        Parcel zzJ2 = zzgVar9.zzJ(zza19, 20);
                                        zzJ2.readInt();
                                        zzJ2.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e19) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e19);
                                        return null;
                                    }
                                case 20:
                                    boolean booleanValue13 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar10 = googleMap2.zza;
                                        Parcel zza20 = zzgVar10.zza();
                                        int i21 = zzc.$r8$clinit;
                                        zza20.writeInt(booleanValue13 ? 1 : 0);
                                        zzgVar10.zzc(zza20, 22);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e20) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e20);
                                        return null;
                                    }
                                default:
                                    boolean booleanValue14 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar11 = googleMap2.zza;
                                        Parcel zza21 = zzgVar11.zza();
                                        int i22 = zzc.$r8$clinit;
                                        zza21.writeInt(booleanValue14 ? 1 : 0);
                                        zzgVar11.zzc(zza21, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e21) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e21);
                                        return null;
                                    }
                            }
                        }
                    });
                    mapUpdaterState.getMapProperties().getClass();
                    Boolean bool = Boolean.FALSE;
                    final int i8 = 18;
                    Updater.m576setimpl(gapComposer, bool, new Function2() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            zzb uiSettings;
                            zzb uiSettings2;
                            zzb uiSettings3;
                            zzb uiSettings4;
                            zzb uiSettings5;
                            zzb uiSettings6;
                            int i72 = i8;
                            GoogleMap googleMap2 = googleMap;
                            switch (i72) {
                                case 0:
                                    MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj7;
                                    PaddingValues paddingValues2 = (PaddingValues) obj8;
                                    mapPropertiesNode.getClass();
                                    paddingValues2.getClass();
                                    MapUpdaterKt.access$applyContentPadding(mapPropertiesNode, googleMap2, paddingValues2);
                                    return Unit.INSTANCE;
                                case 1:
                                    LatLngBounds latLngBounds = (LatLngBounds) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar = googleMap2.zza;
                                        Parcel zza = zzgVar.zza();
                                        zzc.zze(zza, latLngBounds);
                                        zzgVar.zzc(zza, 95);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                case 2:
                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar2 = googleMap2.zza;
                                        Parcel zza2 = zzgVar2.zza();
                                        zzc.zze(zza2, mapStyleOptions);
                                        Parcel zzJ = zzgVar2.zzJ(zza2, 91);
                                        zzJ.readInt();
                                        zzJ.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e2) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                                        return null;
                                    }
                                case 3:
                                    MapType mapType = (MapType) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    mapType.getClass();
                                    int i82 = mapType.value;
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar3 = googleMap2.zza;
                                        Parcel zza3 = zzgVar3.zza();
                                        zza3.writeInt(i82);
                                        zzgVar3.zzc(zza3, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e3) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                                        return null;
                                    }
                                case 4:
                                    float floatValue = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar4 = googleMap2.zza;
                                        Parcel zza4 = zzgVar4.zza();
                                        zza4.writeFloat(floatValue);
                                        zzgVar4.zzc(zza4, 93);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e4) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e4);
                                        return null;
                                    }
                                case 5:
                                    float floatValue2 = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar5 = googleMap2.zza;
                                        Parcel zza5 = zzgVar5.zza();
                                        zza5.writeFloat(floatValue2);
                                        zzgVar5.zzc(zza5, 92);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e5) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e5);
                                        return null;
                                    }
                                case 6:
                                    Integer num = (Integer) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        googleMap2.getClass();
                                        try {
                                            zzg zzgVar6 = googleMap2.zza;
                                            Parcel zza6 = zzgVar6.zza();
                                            zza6.writeInt(intValue2);
                                            zzgVar6.zzc(zza6, 113);
                                        } catch (RemoteException e6) {
                                            TransportImpl$$ExternalSyntheticLambda0.m(e6);
                                            return null;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings = googleMap2.getUiSettings();
                                        uiSettings.getClass();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        zzca zzcaVar = (zzca) uiSettings.zza;
                                        Parcel zza7 = zzcaVar.zza();
                                        int i9 = zzc.$r8$clinit;
                                        zza7.writeInt(booleanValue ? 1 : 0);
                                        zzcaVar.zzc(zza7, 2);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e7) {
                                        throw new RuntimeRemoteException((Throwable) e7);
                                    }
                                case 8:
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings2 = googleMap2.getUiSettings();
                                        uiSettings2.getClass();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        zzca zzcaVar2 = (zzca) uiSettings2.zza;
                                        Parcel zza8 = zzcaVar2.zza();
                                        int i10 = zzc.$r8$clinit;
                                        zza8.writeInt(booleanValue2 ? 1 : 0);
                                        zzcaVar2.zzc(zza8, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeRemoteException((Throwable) e8);
                                    }
                                case 9:
                                    boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings3 = googleMap2.getUiSettings();
                                        uiSettings3.getClass();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        zzca zzcaVar3 = (zzca) uiSettings3.zza;
                                        Parcel zza9 = zzcaVar3.zza();
                                        int i11 = zzc.$r8$clinit;
                                        zza9.writeInt(booleanValue3 ? 1 : 0);
                                        zzcaVar3.zzc(zza9, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e9) {
                                        throw new RuntimeRemoteException((Throwable) e9);
                                    }
                                case 10:
                                    boolean booleanValue4 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings7 = googleMap2.getUiSettings();
                                        uiSettings7.getClass();
                                        try {
                                            zzca zzcaVar4 = (zzca) uiSettings7.zza;
                                            Parcel zza10 = zzcaVar4.zza();
                                            int i12 = zzc.$r8$clinit;
                                            zza10.writeInt(booleanValue4 ? 1 : 0);
                                            zzcaVar4.zzc(zza10, 3);
                                        } catch (RemoteException e10) {
                                            throw new RuntimeRemoteException((Throwable) e10);
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    boolean booleanValue5 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings4 = googleMap2.getUiSettings();
                                        uiSettings4.getClass();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        zzca zzcaVar5 = (zzca) uiSettings4.zza;
                                        Parcel zza11 = zzcaVar5.zza();
                                        int i13 = zzc.$r8$clinit;
                                        zza11.writeInt(booleanValue5 ? 1 : 0);
                                        zzcaVar5.zzc(zza11, 7);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e11) {
                                        throw new RuntimeRemoteException((Throwable) e11);
                                    }
                                case 12:
                                    boolean booleanValue6 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings5 = googleMap2.getUiSettings();
                                        uiSettings5.getClass();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        zzca zzcaVar6 = (zzca) uiSettings5.zza;
                                        Parcel zza12 = zzcaVar6.zza();
                                        int i14 = zzc.$r8$clinit;
                                        zza12.writeInt(booleanValue6 ? 1 : 0);
                                        zzcaVar6.zzc(zza12, 4);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e12) {
                                        throw new RuntimeRemoteException((Throwable) e12);
                                    }
                                case 13:
                                    boolean booleanValue7 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings8 = googleMap2.getUiSettings();
                                        uiSettings8.getClass();
                                        try {
                                            zzca zzcaVar7 = (zzca) uiSettings8.zza;
                                            Parcel zza13 = zzcaVar7.zza();
                                            int i15 = zzc.$r8$clinit;
                                            zza13.writeInt(booleanValue7 ? 1 : 0);
                                            zzcaVar7.zzc(zza13, 20);
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException((Throwable) e13);
                                        }
                                    } catch (Exception unused7) {
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    boolean booleanValue8 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings9 = googleMap2.getUiSettings();
                                        uiSettings9.getClass();
                                        try {
                                            zzca zzcaVar8 = (zzca) uiSettings9.zza;
                                            Parcel zza14 = zzcaVar8.zza();
                                            int i16 = zzc.$r8$clinit;
                                            zza14.writeInt(booleanValue8 ? 1 : 0);
                                            zzcaVar8.zzc(zza14, 6);
                                        } catch (RemoteException e14) {
                                            throw new RuntimeRemoteException((Throwable) e14);
                                        }
                                    } catch (Exception unused8) {
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    boolean booleanValue9 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings10 = googleMap2.getUiSettings();
                                        uiSettings10.getClass();
                                        try {
                                            zzca zzcaVar9 = (zzca) uiSettings10.zza;
                                            Parcel zza15 = zzcaVar9.zza();
                                            int i17 = zzc.$r8$clinit;
                                            zza15.writeInt(booleanValue9 ? 1 : 0);
                                            zzcaVar9.zzc(zza15, 1);
                                        } catch (RemoteException e15) {
                                            throw new RuntimeRemoteException((Throwable) e15);
                                        }
                                    } catch (Exception unused9) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    boolean booleanValue10 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings6 = googleMap2.getUiSettings();
                                        uiSettings6.getClass();
                                    } catch (Exception unused10) {
                                    }
                                    try {
                                        zzca zzcaVar10 = (zzca) uiSettings6.zza;
                                        Parcel zza16 = zzcaVar10.zza();
                                        int i18 = zzc.$r8$clinit;
                                        zza16.writeInt(booleanValue10 ? 1 : 0);
                                        zzcaVar10.zzc(zza16, 5);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e16) {
                                        throw new RuntimeRemoteException((Throwable) e16);
                                    }
                                case 17:
                                    MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj7;
                                    if (obj8 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    mapPropertiesNode2.getClass();
                                    zzg zzgVar7 = googleMap2.zza;
                                    try {
                                        Parcel zza17 = zzgVar7.zza();
                                        zzc.zzg(zza17, null);
                                        zzgVar7.zzc(zza17, 24);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e17) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e17);
                                        return null;
                                    }
                                case 18:
                                    boolean booleanValue11 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar8 = googleMap2.zza;
                                        Parcel zza18 = zzgVar8.zza();
                                        int i19 = zzc.$r8$clinit;
                                        zza18.writeInt(booleanValue11 ? 1 : 0);
                                        zzgVar8.zzc(zza18, 41);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e18) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e18);
                                        return null;
                                    }
                                case 19:
                                    boolean booleanValue12 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar9 = googleMap2.zza;
                                        Parcel zza19 = zzgVar9.zza();
                                        int i20 = zzc.$r8$clinit;
                                        zza19.writeInt(booleanValue12 ? 1 : 0);
                                        Parcel zzJ2 = zzgVar9.zzJ(zza19, 20);
                                        zzJ2.readInt();
                                        zzJ2.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e19) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e19);
                                        return null;
                                    }
                                case 20:
                                    boolean booleanValue13 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar10 = googleMap2.zza;
                                        Parcel zza20 = zzgVar10.zza();
                                        int i21 = zzc.$r8$clinit;
                                        zza20.writeInt(booleanValue13 ? 1 : 0);
                                        zzgVar10.zzc(zza20, 22);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e20) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e20);
                                        return null;
                                    }
                                default:
                                    boolean booleanValue14 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar11 = googleMap2.zza;
                                        Parcel zza21 = zzgVar11.zza();
                                        int i22 = zzc.$r8$clinit;
                                        zza21.writeInt(booleanValue14 ? 1 : 0);
                                        zzgVar11.zzc(zza21, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e21) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e21);
                                        return null;
                                    }
                            }
                        }
                    });
                    mapUpdaterState.getMapProperties().getClass();
                    final int i9 = 19;
                    Updater.m576setimpl(gapComposer, bool, new Function2() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            zzb uiSettings;
                            zzb uiSettings2;
                            zzb uiSettings3;
                            zzb uiSettings4;
                            zzb uiSettings5;
                            zzb uiSettings6;
                            int i72 = i9;
                            GoogleMap googleMap2 = googleMap;
                            switch (i72) {
                                case 0:
                                    MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj7;
                                    PaddingValues paddingValues2 = (PaddingValues) obj8;
                                    mapPropertiesNode.getClass();
                                    paddingValues2.getClass();
                                    MapUpdaterKt.access$applyContentPadding(mapPropertiesNode, googleMap2, paddingValues2);
                                    return Unit.INSTANCE;
                                case 1:
                                    LatLngBounds latLngBounds = (LatLngBounds) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar = googleMap2.zza;
                                        Parcel zza = zzgVar.zza();
                                        zzc.zze(zza, latLngBounds);
                                        zzgVar.zzc(zza, 95);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                case 2:
                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar2 = googleMap2.zza;
                                        Parcel zza2 = zzgVar2.zza();
                                        zzc.zze(zza2, mapStyleOptions);
                                        Parcel zzJ = zzgVar2.zzJ(zza2, 91);
                                        zzJ.readInt();
                                        zzJ.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e2) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                                        return null;
                                    }
                                case 3:
                                    MapType mapType = (MapType) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    mapType.getClass();
                                    int i82 = mapType.value;
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar3 = googleMap2.zza;
                                        Parcel zza3 = zzgVar3.zza();
                                        zza3.writeInt(i82);
                                        zzgVar3.zzc(zza3, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e3) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                                        return null;
                                    }
                                case 4:
                                    float floatValue = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar4 = googleMap2.zza;
                                        Parcel zza4 = zzgVar4.zza();
                                        zza4.writeFloat(floatValue);
                                        zzgVar4.zzc(zza4, 93);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e4) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e4);
                                        return null;
                                    }
                                case 5:
                                    float floatValue2 = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar5 = googleMap2.zza;
                                        Parcel zza5 = zzgVar5.zza();
                                        zza5.writeFloat(floatValue2);
                                        zzgVar5.zzc(zza5, 92);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e5) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e5);
                                        return null;
                                    }
                                case 6:
                                    Integer num = (Integer) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        googleMap2.getClass();
                                        try {
                                            zzg zzgVar6 = googleMap2.zza;
                                            Parcel zza6 = zzgVar6.zza();
                                            zza6.writeInt(intValue2);
                                            zzgVar6.zzc(zza6, 113);
                                        } catch (RemoteException e6) {
                                            TransportImpl$$ExternalSyntheticLambda0.m(e6);
                                            return null;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings = googleMap2.getUiSettings();
                                        uiSettings.getClass();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        zzca zzcaVar = (zzca) uiSettings.zza;
                                        Parcel zza7 = zzcaVar.zza();
                                        int i92 = zzc.$r8$clinit;
                                        zza7.writeInt(booleanValue ? 1 : 0);
                                        zzcaVar.zzc(zza7, 2);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e7) {
                                        throw new RuntimeRemoteException((Throwable) e7);
                                    }
                                case 8:
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings2 = googleMap2.getUiSettings();
                                        uiSettings2.getClass();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        zzca zzcaVar2 = (zzca) uiSettings2.zza;
                                        Parcel zza8 = zzcaVar2.zza();
                                        int i10 = zzc.$r8$clinit;
                                        zza8.writeInt(booleanValue2 ? 1 : 0);
                                        zzcaVar2.zzc(zza8, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeRemoteException((Throwable) e8);
                                    }
                                case 9:
                                    boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings3 = googleMap2.getUiSettings();
                                        uiSettings3.getClass();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        zzca zzcaVar3 = (zzca) uiSettings3.zza;
                                        Parcel zza9 = zzcaVar3.zza();
                                        int i11 = zzc.$r8$clinit;
                                        zza9.writeInt(booleanValue3 ? 1 : 0);
                                        zzcaVar3.zzc(zza9, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e9) {
                                        throw new RuntimeRemoteException((Throwable) e9);
                                    }
                                case 10:
                                    boolean booleanValue4 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings7 = googleMap2.getUiSettings();
                                        uiSettings7.getClass();
                                        try {
                                            zzca zzcaVar4 = (zzca) uiSettings7.zza;
                                            Parcel zza10 = zzcaVar4.zza();
                                            int i12 = zzc.$r8$clinit;
                                            zza10.writeInt(booleanValue4 ? 1 : 0);
                                            zzcaVar4.zzc(zza10, 3);
                                        } catch (RemoteException e10) {
                                            throw new RuntimeRemoteException((Throwable) e10);
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    boolean booleanValue5 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings4 = googleMap2.getUiSettings();
                                        uiSettings4.getClass();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        zzca zzcaVar5 = (zzca) uiSettings4.zza;
                                        Parcel zza11 = zzcaVar5.zza();
                                        int i13 = zzc.$r8$clinit;
                                        zza11.writeInt(booleanValue5 ? 1 : 0);
                                        zzcaVar5.zzc(zza11, 7);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e11) {
                                        throw new RuntimeRemoteException((Throwable) e11);
                                    }
                                case 12:
                                    boolean booleanValue6 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings5 = googleMap2.getUiSettings();
                                        uiSettings5.getClass();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        zzca zzcaVar6 = (zzca) uiSettings5.zza;
                                        Parcel zza12 = zzcaVar6.zza();
                                        int i14 = zzc.$r8$clinit;
                                        zza12.writeInt(booleanValue6 ? 1 : 0);
                                        zzcaVar6.zzc(zza12, 4);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e12) {
                                        throw new RuntimeRemoteException((Throwable) e12);
                                    }
                                case 13:
                                    boolean booleanValue7 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings8 = googleMap2.getUiSettings();
                                        uiSettings8.getClass();
                                        try {
                                            zzca zzcaVar7 = (zzca) uiSettings8.zza;
                                            Parcel zza13 = zzcaVar7.zza();
                                            int i15 = zzc.$r8$clinit;
                                            zza13.writeInt(booleanValue7 ? 1 : 0);
                                            zzcaVar7.zzc(zza13, 20);
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException((Throwable) e13);
                                        }
                                    } catch (Exception unused7) {
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    boolean booleanValue8 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings9 = googleMap2.getUiSettings();
                                        uiSettings9.getClass();
                                        try {
                                            zzca zzcaVar8 = (zzca) uiSettings9.zza;
                                            Parcel zza14 = zzcaVar8.zza();
                                            int i16 = zzc.$r8$clinit;
                                            zza14.writeInt(booleanValue8 ? 1 : 0);
                                            zzcaVar8.zzc(zza14, 6);
                                        } catch (RemoteException e14) {
                                            throw new RuntimeRemoteException((Throwable) e14);
                                        }
                                    } catch (Exception unused8) {
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    boolean booleanValue9 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings10 = googleMap2.getUiSettings();
                                        uiSettings10.getClass();
                                        try {
                                            zzca zzcaVar9 = (zzca) uiSettings10.zza;
                                            Parcel zza15 = zzcaVar9.zza();
                                            int i17 = zzc.$r8$clinit;
                                            zza15.writeInt(booleanValue9 ? 1 : 0);
                                            zzcaVar9.zzc(zza15, 1);
                                        } catch (RemoteException e15) {
                                            throw new RuntimeRemoteException((Throwable) e15);
                                        }
                                    } catch (Exception unused9) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    boolean booleanValue10 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings6 = googleMap2.getUiSettings();
                                        uiSettings6.getClass();
                                    } catch (Exception unused10) {
                                    }
                                    try {
                                        zzca zzcaVar10 = (zzca) uiSettings6.zza;
                                        Parcel zza16 = zzcaVar10.zza();
                                        int i18 = zzc.$r8$clinit;
                                        zza16.writeInt(booleanValue10 ? 1 : 0);
                                        zzcaVar10.zzc(zza16, 5);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e16) {
                                        throw new RuntimeRemoteException((Throwable) e16);
                                    }
                                case 17:
                                    MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj7;
                                    if (obj8 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    mapPropertiesNode2.getClass();
                                    zzg zzgVar7 = googleMap2.zza;
                                    try {
                                        Parcel zza17 = zzgVar7.zza();
                                        zzc.zzg(zza17, null);
                                        zzgVar7.zzc(zza17, 24);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e17) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e17);
                                        return null;
                                    }
                                case 18:
                                    boolean booleanValue11 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar8 = googleMap2.zza;
                                        Parcel zza18 = zzgVar8.zza();
                                        int i19 = zzc.$r8$clinit;
                                        zza18.writeInt(booleanValue11 ? 1 : 0);
                                        zzgVar8.zzc(zza18, 41);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e18) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e18);
                                        return null;
                                    }
                                case 19:
                                    boolean booleanValue12 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar9 = googleMap2.zza;
                                        Parcel zza19 = zzgVar9.zza();
                                        int i20 = zzc.$r8$clinit;
                                        zza19.writeInt(booleanValue12 ? 1 : 0);
                                        Parcel zzJ2 = zzgVar9.zzJ(zza19, 20);
                                        zzJ2.readInt();
                                        zzJ2.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e19) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e19);
                                        return null;
                                    }
                                case 20:
                                    boolean booleanValue13 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar10 = googleMap2.zza;
                                        Parcel zza20 = zzgVar10.zza();
                                        int i21 = zzc.$r8$clinit;
                                        zza20.writeInt(booleanValue13 ? 1 : 0);
                                        zzgVar10.zzc(zza20, 22);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e20) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e20);
                                        return null;
                                    }
                                default:
                                    boolean booleanValue14 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar11 = googleMap2.zza;
                                        Parcel zza21 = zzgVar11.zza();
                                        int i22 = zzc.$r8$clinit;
                                        zza21.writeInt(booleanValue14 ? 1 : 0);
                                        zzgVar11.zzc(zza21, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e21) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e21);
                                        return null;
                                    }
                            }
                        }
                    });
                    final int i10 = 20;
                    Updater.m576setimpl(gapComposer, Boolean.valueOf(mapUpdaterState.getMapProperties().isMyLocationEnabled), new Function2() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            zzb uiSettings;
                            zzb uiSettings2;
                            zzb uiSettings3;
                            zzb uiSettings4;
                            zzb uiSettings5;
                            zzb uiSettings6;
                            int i72 = i10;
                            GoogleMap googleMap2 = googleMap;
                            switch (i72) {
                                case 0:
                                    MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj7;
                                    PaddingValues paddingValues2 = (PaddingValues) obj8;
                                    mapPropertiesNode.getClass();
                                    paddingValues2.getClass();
                                    MapUpdaterKt.access$applyContentPadding(mapPropertiesNode, googleMap2, paddingValues2);
                                    return Unit.INSTANCE;
                                case 1:
                                    LatLngBounds latLngBounds = (LatLngBounds) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar = googleMap2.zza;
                                        Parcel zza = zzgVar.zza();
                                        zzc.zze(zza, latLngBounds);
                                        zzgVar.zzc(zza, 95);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                case 2:
                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar2 = googleMap2.zza;
                                        Parcel zza2 = zzgVar2.zza();
                                        zzc.zze(zza2, mapStyleOptions);
                                        Parcel zzJ = zzgVar2.zzJ(zza2, 91);
                                        zzJ.readInt();
                                        zzJ.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e2) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                                        return null;
                                    }
                                case 3:
                                    MapType mapType = (MapType) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    mapType.getClass();
                                    int i82 = mapType.value;
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar3 = googleMap2.zza;
                                        Parcel zza3 = zzgVar3.zza();
                                        zza3.writeInt(i82);
                                        zzgVar3.zzc(zza3, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e3) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                                        return null;
                                    }
                                case 4:
                                    float floatValue = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar4 = googleMap2.zza;
                                        Parcel zza4 = zzgVar4.zza();
                                        zza4.writeFloat(floatValue);
                                        zzgVar4.zzc(zza4, 93);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e4) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e4);
                                        return null;
                                    }
                                case 5:
                                    float floatValue2 = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar5 = googleMap2.zza;
                                        Parcel zza5 = zzgVar5.zza();
                                        zza5.writeFloat(floatValue2);
                                        zzgVar5.zzc(zza5, 92);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e5) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e5);
                                        return null;
                                    }
                                case 6:
                                    Integer num = (Integer) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        googleMap2.getClass();
                                        try {
                                            zzg zzgVar6 = googleMap2.zza;
                                            Parcel zza6 = zzgVar6.zza();
                                            zza6.writeInt(intValue2);
                                            zzgVar6.zzc(zza6, 113);
                                        } catch (RemoteException e6) {
                                            TransportImpl$$ExternalSyntheticLambda0.m(e6);
                                            return null;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings = googleMap2.getUiSettings();
                                        uiSettings.getClass();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        zzca zzcaVar = (zzca) uiSettings.zza;
                                        Parcel zza7 = zzcaVar.zza();
                                        int i92 = zzc.$r8$clinit;
                                        zza7.writeInt(booleanValue ? 1 : 0);
                                        zzcaVar.zzc(zza7, 2);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e7) {
                                        throw new RuntimeRemoteException((Throwable) e7);
                                    }
                                case 8:
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings2 = googleMap2.getUiSettings();
                                        uiSettings2.getClass();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        zzca zzcaVar2 = (zzca) uiSettings2.zza;
                                        Parcel zza8 = zzcaVar2.zza();
                                        int i102 = zzc.$r8$clinit;
                                        zza8.writeInt(booleanValue2 ? 1 : 0);
                                        zzcaVar2.zzc(zza8, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeRemoteException((Throwable) e8);
                                    }
                                case 9:
                                    boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings3 = googleMap2.getUiSettings();
                                        uiSettings3.getClass();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        zzca zzcaVar3 = (zzca) uiSettings3.zza;
                                        Parcel zza9 = zzcaVar3.zza();
                                        int i11 = zzc.$r8$clinit;
                                        zza9.writeInt(booleanValue3 ? 1 : 0);
                                        zzcaVar3.zzc(zza9, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e9) {
                                        throw new RuntimeRemoteException((Throwable) e9);
                                    }
                                case 10:
                                    boolean booleanValue4 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings7 = googleMap2.getUiSettings();
                                        uiSettings7.getClass();
                                        try {
                                            zzca zzcaVar4 = (zzca) uiSettings7.zza;
                                            Parcel zza10 = zzcaVar4.zza();
                                            int i12 = zzc.$r8$clinit;
                                            zza10.writeInt(booleanValue4 ? 1 : 0);
                                            zzcaVar4.zzc(zza10, 3);
                                        } catch (RemoteException e10) {
                                            throw new RuntimeRemoteException((Throwable) e10);
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    boolean booleanValue5 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings4 = googleMap2.getUiSettings();
                                        uiSettings4.getClass();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        zzca zzcaVar5 = (zzca) uiSettings4.zza;
                                        Parcel zza11 = zzcaVar5.zza();
                                        int i13 = zzc.$r8$clinit;
                                        zza11.writeInt(booleanValue5 ? 1 : 0);
                                        zzcaVar5.zzc(zza11, 7);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e11) {
                                        throw new RuntimeRemoteException((Throwable) e11);
                                    }
                                case 12:
                                    boolean booleanValue6 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings5 = googleMap2.getUiSettings();
                                        uiSettings5.getClass();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        zzca zzcaVar6 = (zzca) uiSettings5.zza;
                                        Parcel zza12 = zzcaVar6.zza();
                                        int i14 = zzc.$r8$clinit;
                                        zza12.writeInt(booleanValue6 ? 1 : 0);
                                        zzcaVar6.zzc(zza12, 4);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e12) {
                                        throw new RuntimeRemoteException((Throwable) e12);
                                    }
                                case 13:
                                    boolean booleanValue7 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings8 = googleMap2.getUiSettings();
                                        uiSettings8.getClass();
                                        try {
                                            zzca zzcaVar7 = (zzca) uiSettings8.zza;
                                            Parcel zza13 = zzcaVar7.zza();
                                            int i15 = zzc.$r8$clinit;
                                            zza13.writeInt(booleanValue7 ? 1 : 0);
                                            zzcaVar7.zzc(zza13, 20);
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException((Throwable) e13);
                                        }
                                    } catch (Exception unused7) {
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    boolean booleanValue8 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings9 = googleMap2.getUiSettings();
                                        uiSettings9.getClass();
                                        try {
                                            zzca zzcaVar8 = (zzca) uiSettings9.zza;
                                            Parcel zza14 = zzcaVar8.zza();
                                            int i16 = zzc.$r8$clinit;
                                            zza14.writeInt(booleanValue8 ? 1 : 0);
                                            zzcaVar8.zzc(zza14, 6);
                                        } catch (RemoteException e14) {
                                            throw new RuntimeRemoteException((Throwable) e14);
                                        }
                                    } catch (Exception unused8) {
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    boolean booleanValue9 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings10 = googleMap2.getUiSettings();
                                        uiSettings10.getClass();
                                        try {
                                            zzca zzcaVar9 = (zzca) uiSettings10.zza;
                                            Parcel zza15 = zzcaVar9.zza();
                                            int i17 = zzc.$r8$clinit;
                                            zza15.writeInt(booleanValue9 ? 1 : 0);
                                            zzcaVar9.zzc(zza15, 1);
                                        } catch (RemoteException e15) {
                                            throw new RuntimeRemoteException((Throwable) e15);
                                        }
                                    } catch (Exception unused9) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    boolean booleanValue10 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings6 = googleMap2.getUiSettings();
                                        uiSettings6.getClass();
                                    } catch (Exception unused10) {
                                    }
                                    try {
                                        zzca zzcaVar10 = (zzca) uiSettings6.zza;
                                        Parcel zza16 = zzcaVar10.zza();
                                        int i18 = zzc.$r8$clinit;
                                        zza16.writeInt(booleanValue10 ? 1 : 0);
                                        zzcaVar10.zzc(zza16, 5);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e16) {
                                        throw new RuntimeRemoteException((Throwable) e16);
                                    }
                                case 17:
                                    MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj7;
                                    if (obj8 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    mapPropertiesNode2.getClass();
                                    zzg zzgVar7 = googleMap2.zza;
                                    try {
                                        Parcel zza17 = zzgVar7.zza();
                                        zzc.zzg(zza17, null);
                                        zzgVar7.zzc(zza17, 24);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e17) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e17);
                                        return null;
                                    }
                                case 18:
                                    boolean booleanValue11 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar8 = googleMap2.zza;
                                        Parcel zza18 = zzgVar8.zza();
                                        int i19 = zzc.$r8$clinit;
                                        zza18.writeInt(booleanValue11 ? 1 : 0);
                                        zzgVar8.zzc(zza18, 41);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e18) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e18);
                                        return null;
                                    }
                                case 19:
                                    boolean booleanValue12 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar9 = googleMap2.zza;
                                        Parcel zza19 = zzgVar9.zza();
                                        int i20 = zzc.$r8$clinit;
                                        zza19.writeInt(booleanValue12 ? 1 : 0);
                                        Parcel zzJ2 = zzgVar9.zzJ(zza19, 20);
                                        zzJ2.readInt();
                                        zzJ2.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e19) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e19);
                                        return null;
                                    }
                                case 20:
                                    boolean booleanValue13 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar10 = googleMap2.zza;
                                        Parcel zza20 = zzgVar10.zza();
                                        int i21 = zzc.$r8$clinit;
                                        zza20.writeInt(booleanValue13 ? 1 : 0);
                                        zzgVar10.zzc(zza20, 22);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e20) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e20);
                                        return null;
                                    }
                                default:
                                    boolean booleanValue14 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar11 = googleMap2.zza;
                                        Parcel zza21 = zzgVar11.zza();
                                        int i22 = zzc.$r8$clinit;
                                        zza21.writeInt(booleanValue14 ? 1 : 0);
                                        zzgVar11.zzc(zza21, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e21) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e21);
                                        return null;
                                    }
                            }
                        }
                    });
                    mapUpdaterState.getMapProperties().getClass();
                    final int i11 = 21;
                    Updater.m576setimpl(gapComposer, bool, new Function2() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            zzb uiSettings;
                            zzb uiSettings2;
                            zzb uiSettings3;
                            zzb uiSettings4;
                            zzb uiSettings5;
                            zzb uiSettings6;
                            int i72 = i11;
                            GoogleMap googleMap2 = googleMap;
                            switch (i72) {
                                case 0:
                                    MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj7;
                                    PaddingValues paddingValues2 = (PaddingValues) obj8;
                                    mapPropertiesNode.getClass();
                                    paddingValues2.getClass();
                                    MapUpdaterKt.access$applyContentPadding(mapPropertiesNode, googleMap2, paddingValues2);
                                    return Unit.INSTANCE;
                                case 1:
                                    LatLngBounds latLngBounds = (LatLngBounds) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar = googleMap2.zza;
                                        Parcel zza = zzgVar.zza();
                                        zzc.zze(zza, latLngBounds);
                                        zzgVar.zzc(zza, 95);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                case 2:
                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar2 = googleMap2.zza;
                                        Parcel zza2 = zzgVar2.zza();
                                        zzc.zze(zza2, mapStyleOptions);
                                        Parcel zzJ = zzgVar2.zzJ(zza2, 91);
                                        zzJ.readInt();
                                        zzJ.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e2) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                                        return null;
                                    }
                                case 3:
                                    MapType mapType = (MapType) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    mapType.getClass();
                                    int i82 = mapType.value;
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar3 = googleMap2.zza;
                                        Parcel zza3 = zzgVar3.zza();
                                        zza3.writeInt(i82);
                                        zzgVar3.zzc(zza3, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e3) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                                        return null;
                                    }
                                case 4:
                                    float floatValue = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar4 = googleMap2.zza;
                                        Parcel zza4 = zzgVar4.zza();
                                        zza4.writeFloat(floatValue);
                                        zzgVar4.zzc(zza4, 93);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e4) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e4);
                                        return null;
                                    }
                                case 5:
                                    float floatValue2 = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar5 = googleMap2.zza;
                                        Parcel zza5 = zzgVar5.zza();
                                        zza5.writeFloat(floatValue2);
                                        zzgVar5.zzc(zza5, 92);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e5) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e5);
                                        return null;
                                    }
                                case 6:
                                    Integer num = (Integer) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        googleMap2.getClass();
                                        try {
                                            zzg zzgVar6 = googleMap2.zza;
                                            Parcel zza6 = zzgVar6.zza();
                                            zza6.writeInt(intValue2);
                                            zzgVar6.zzc(zza6, 113);
                                        } catch (RemoteException e6) {
                                            TransportImpl$$ExternalSyntheticLambda0.m(e6);
                                            return null;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings = googleMap2.getUiSettings();
                                        uiSettings.getClass();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        zzca zzcaVar = (zzca) uiSettings.zza;
                                        Parcel zza7 = zzcaVar.zza();
                                        int i92 = zzc.$r8$clinit;
                                        zza7.writeInt(booleanValue ? 1 : 0);
                                        zzcaVar.zzc(zza7, 2);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e7) {
                                        throw new RuntimeRemoteException((Throwable) e7);
                                    }
                                case 8:
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings2 = googleMap2.getUiSettings();
                                        uiSettings2.getClass();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        zzca zzcaVar2 = (zzca) uiSettings2.zza;
                                        Parcel zza8 = zzcaVar2.zza();
                                        int i102 = zzc.$r8$clinit;
                                        zza8.writeInt(booleanValue2 ? 1 : 0);
                                        zzcaVar2.zzc(zza8, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeRemoteException((Throwable) e8);
                                    }
                                case 9:
                                    boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings3 = googleMap2.getUiSettings();
                                        uiSettings3.getClass();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        zzca zzcaVar3 = (zzca) uiSettings3.zza;
                                        Parcel zza9 = zzcaVar3.zza();
                                        int i112 = zzc.$r8$clinit;
                                        zza9.writeInt(booleanValue3 ? 1 : 0);
                                        zzcaVar3.zzc(zza9, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e9) {
                                        throw new RuntimeRemoteException((Throwable) e9);
                                    }
                                case 10:
                                    boolean booleanValue4 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings7 = googleMap2.getUiSettings();
                                        uiSettings7.getClass();
                                        try {
                                            zzca zzcaVar4 = (zzca) uiSettings7.zza;
                                            Parcel zza10 = zzcaVar4.zza();
                                            int i12 = zzc.$r8$clinit;
                                            zza10.writeInt(booleanValue4 ? 1 : 0);
                                            zzcaVar4.zzc(zza10, 3);
                                        } catch (RemoteException e10) {
                                            throw new RuntimeRemoteException((Throwable) e10);
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    boolean booleanValue5 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings4 = googleMap2.getUiSettings();
                                        uiSettings4.getClass();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        zzca zzcaVar5 = (zzca) uiSettings4.zza;
                                        Parcel zza11 = zzcaVar5.zza();
                                        int i13 = zzc.$r8$clinit;
                                        zza11.writeInt(booleanValue5 ? 1 : 0);
                                        zzcaVar5.zzc(zza11, 7);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e11) {
                                        throw new RuntimeRemoteException((Throwable) e11);
                                    }
                                case 12:
                                    boolean booleanValue6 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings5 = googleMap2.getUiSettings();
                                        uiSettings5.getClass();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        zzca zzcaVar6 = (zzca) uiSettings5.zza;
                                        Parcel zza12 = zzcaVar6.zza();
                                        int i14 = zzc.$r8$clinit;
                                        zza12.writeInt(booleanValue6 ? 1 : 0);
                                        zzcaVar6.zzc(zza12, 4);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e12) {
                                        throw new RuntimeRemoteException((Throwable) e12);
                                    }
                                case 13:
                                    boolean booleanValue7 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings8 = googleMap2.getUiSettings();
                                        uiSettings8.getClass();
                                        try {
                                            zzca zzcaVar7 = (zzca) uiSettings8.zza;
                                            Parcel zza13 = zzcaVar7.zza();
                                            int i15 = zzc.$r8$clinit;
                                            zza13.writeInt(booleanValue7 ? 1 : 0);
                                            zzcaVar7.zzc(zza13, 20);
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException((Throwable) e13);
                                        }
                                    } catch (Exception unused7) {
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    boolean booleanValue8 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings9 = googleMap2.getUiSettings();
                                        uiSettings9.getClass();
                                        try {
                                            zzca zzcaVar8 = (zzca) uiSettings9.zza;
                                            Parcel zza14 = zzcaVar8.zza();
                                            int i16 = zzc.$r8$clinit;
                                            zza14.writeInt(booleanValue8 ? 1 : 0);
                                            zzcaVar8.zzc(zza14, 6);
                                        } catch (RemoteException e14) {
                                            throw new RuntimeRemoteException((Throwable) e14);
                                        }
                                    } catch (Exception unused8) {
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    boolean booleanValue9 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings10 = googleMap2.getUiSettings();
                                        uiSettings10.getClass();
                                        try {
                                            zzca zzcaVar9 = (zzca) uiSettings10.zza;
                                            Parcel zza15 = zzcaVar9.zza();
                                            int i17 = zzc.$r8$clinit;
                                            zza15.writeInt(booleanValue9 ? 1 : 0);
                                            zzcaVar9.zzc(zza15, 1);
                                        } catch (RemoteException e15) {
                                            throw new RuntimeRemoteException((Throwable) e15);
                                        }
                                    } catch (Exception unused9) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    boolean booleanValue10 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings6 = googleMap2.getUiSettings();
                                        uiSettings6.getClass();
                                    } catch (Exception unused10) {
                                    }
                                    try {
                                        zzca zzcaVar10 = (zzca) uiSettings6.zza;
                                        Parcel zza16 = zzcaVar10.zza();
                                        int i18 = zzc.$r8$clinit;
                                        zza16.writeInt(booleanValue10 ? 1 : 0);
                                        zzcaVar10.zzc(zza16, 5);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e16) {
                                        throw new RuntimeRemoteException((Throwable) e16);
                                    }
                                case 17:
                                    MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj7;
                                    if (obj8 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    mapPropertiesNode2.getClass();
                                    zzg zzgVar7 = googleMap2.zza;
                                    try {
                                        Parcel zza17 = zzgVar7.zza();
                                        zzc.zzg(zza17, null);
                                        zzgVar7.zzc(zza17, 24);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e17) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e17);
                                        return null;
                                    }
                                case 18:
                                    boolean booleanValue11 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar8 = googleMap2.zza;
                                        Parcel zza18 = zzgVar8.zza();
                                        int i19 = zzc.$r8$clinit;
                                        zza18.writeInt(booleanValue11 ? 1 : 0);
                                        zzgVar8.zzc(zza18, 41);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e18) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e18);
                                        return null;
                                    }
                                case 19:
                                    boolean booleanValue12 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar9 = googleMap2.zza;
                                        Parcel zza19 = zzgVar9.zza();
                                        int i20 = zzc.$r8$clinit;
                                        zza19.writeInt(booleanValue12 ? 1 : 0);
                                        Parcel zzJ2 = zzgVar9.zzJ(zza19, 20);
                                        zzJ2.readInt();
                                        zzJ2.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e19) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e19);
                                        return null;
                                    }
                                case 20:
                                    boolean booleanValue13 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar10 = googleMap2.zza;
                                        Parcel zza20 = zzgVar10.zza();
                                        int i21 = zzc.$r8$clinit;
                                        zza20.writeInt(booleanValue13 ? 1 : 0);
                                        zzgVar10.zzc(zza20, 22);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e20) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e20);
                                        return null;
                                    }
                                default:
                                    boolean booleanValue14 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar11 = googleMap2.zza;
                                        Parcel zza21 = zzgVar11.zza();
                                        int i22 = zzc.$r8$clinit;
                                        zza21.writeInt(booleanValue14 ? 1 : 0);
                                        zzgVar11.zzc(zza21, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e21) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e21);
                                        return null;
                                    }
                            }
                        }
                    });
                    final int i12 = 1;
                    Updater.m576setimpl(gapComposer, mapUpdaterState.getMapProperties().latLngBoundsForCameraTarget, new Function2() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            zzb uiSettings;
                            zzb uiSettings2;
                            zzb uiSettings3;
                            zzb uiSettings4;
                            zzb uiSettings5;
                            zzb uiSettings6;
                            int i72 = i12;
                            GoogleMap googleMap2 = googleMap;
                            switch (i72) {
                                case 0:
                                    MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj7;
                                    PaddingValues paddingValues2 = (PaddingValues) obj8;
                                    mapPropertiesNode.getClass();
                                    paddingValues2.getClass();
                                    MapUpdaterKt.access$applyContentPadding(mapPropertiesNode, googleMap2, paddingValues2);
                                    return Unit.INSTANCE;
                                case 1:
                                    LatLngBounds latLngBounds = (LatLngBounds) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar = googleMap2.zza;
                                        Parcel zza = zzgVar.zza();
                                        zzc.zze(zza, latLngBounds);
                                        zzgVar.zzc(zza, 95);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                case 2:
                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar2 = googleMap2.zza;
                                        Parcel zza2 = zzgVar2.zza();
                                        zzc.zze(zza2, mapStyleOptions);
                                        Parcel zzJ = zzgVar2.zzJ(zza2, 91);
                                        zzJ.readInt();
                                        zzJ.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e2) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                                        return null;
                                    }
                                case 3:
                                    MapType mapType = (MapType) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    mapType.getClass();
                                    int i82 = mapType.value;
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar3 = googleMap2.zza;
                                        Parcel zza3 = zzgVar3.zza();
                                        zza3.writeInt(i82);
                                        zzgVar3.zzc(zza3, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e3) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                                        return null;
                                    }
                                case 4:
                                    float floatValue = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar4 = googleMap2.zza;
                                        Parcel zza4 = zzgVar4.zza();
                                        zza4.writeFloat(floatValue);
                                        zzgVar4.zzc(zza4, 93);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e4) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e4);
                                        return null;
                                    }
                                case 5:
                                    float floatValue2 = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar5 = googleMap2.zza;
                                        Parcel zza5 = zzgVar5.zza();
                                        zza5.writeFloat(floatValue2);
                                        zzgVar5.zzc(zza5, 92);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e5) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e5);
                                        return null;
                                    }
                                case 6:
                                    Integer num = (Integer) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        googleMap2.getClass();
                                        try {
                                            zzg zzgVar6 = googleMap2.zza;
                                            Parcel zza6 = zzgVar6.zza();
                                            zza6.writeInt(intValue2);
                                            zzgVar6.zzc(zza6, 113);
                                        } catch (RemoteException e6) {
                                            TransportImpl$$ExternalSyntheticLambda0.m(e6);
                                            return null;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings = googleMap2.getUiSettings();
                                        uiSettings.getClass();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        zzca zzcaVar = (zzca) uiSettings.zza;
                                        Parcel zza7 = zzcaVar.zza();
                                        int i92 = zzc.$r8$clinit;
                                        zza7.writeInt(booleanValue ? 1 : 0);
                                        zzcaVar.zzc(zza7, 2);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e7) {
                                        throw new RuntimeRemoteException((Throwable) e7);
                                    }
                                case 8:
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings2 = googleMap2.getUiSettings();
                                        uiSettings2.getClass();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        zzca zzcaVar2 = (zzca) uiSettings2.zza;
                                        Parcel zza8 = zzcaVar2.zza();
                                        int i102 = zzc.$r8$clinit;
                                        zza8.writeInt(booleanValue2 ? 1 : 0);
                                        zzcaVar2.zzc(zza8, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeRemoteException((Throwable) e8);
                                    }
                                case 9:
                                    boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings3 = googleMap2.getUiSettings();
                                        uiSettings3.getClass();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        zzca zzcaVar3 = (zzca) uiSettings3.zza;
                                        Parcel zza9 = zzcaVar3.zza();
                                        int i112 = zzc.$r8$clinit;
                                        zza9.writeInt(booleanValue3 ? 1 : 0);
                                        zzcaVar3.zzc(zza9, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e9) {
                                        throw new RuntimeRemoteException((Throwable) e9);
                                    }
                                case 10:
                                    boolean booleanValue4 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings7 = googleMap2.getUiSettings();
                                        uiSettings7.getClass();
                                        try {
                                            zzca zzcaVar4 = (zzca) uiSettings7.zza;
                                            Parcel zza10 = zzcaVar4.zza();
                                            int i122 = zzc.$r8$clinit;
                                            zza10.writeInt(booleanValue4 ? 1 : 0);
                                            zzcaVar4.zzc(zza10, 3);
                                        } catch (RemoteException e10) {
                                            throw new RuntimeRemoteException((Throwable) e10);
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    boolean booleanValue5 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings4 = googleMap2.getUiSettings();
                                        uiSettings4.getClass();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        zzca zzcaVar5 = (zzca) uiSettings4.zza;
                                        Parcel zza11 = zzcaVar5.zza();
                                        int i13 = zzc.$r8$clinit;
                                        zza11.writeInt(booleanValue5 ? 1 : 0);
                                        zzcaVar5.zzc(zza11, 7);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e11) {
                                        throw new RuntimeRemoteException((Throwable) e11);
                                    }
                                case 12:
                                    boolean booleanValue6 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings5 = googleMap2.getUiSettings();
                                        uiSettings5.getClass();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        zzca zzcaVar6 = (zzca) uiSettings5.zza;
                                        Parcel zza12 = zzcaVar6.zza();
                                        int i14 = zzc.$r8$clinit;
                                        zza12.writeInt(booleanValue6 ? 1 : 0);
                                        zzcaVar6.zzc(zza12, 4);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e12) {
                                        throw new RuntimeRemoteException((Throwable) e12);
                                    }
                                case 13:
                                    boolean booleanValue7 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings8 = googleMap2.getUiSettings();
                                        uiSettings8.getClass();
                                        try {
                                            zzca zzcaVar7 = (zzca) uiSettings8.zza;
                                            Parcel zza13 = zzcaVar7.zza();
                                            int i15 = zzc.$r8$clinit;
                                            zza13.writeInt(booleanValue7 ? 1 : 0);
                                            zzcaVar7.zzc(zza13, 20);
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException((Throwable) e13);
                                        }
                                    } catch (Exception unused7) {
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    boolean booleanValue8 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings9 = googleMap2.getUiSettings();
                                        uiSettings9.getClass();
                                        try {
                                            zzca zzcaVar8 = (zzca) uiSettings9.zza;
                                            Parcel zza14 = zzcaVar8.zza();
                                            int i16 = zzc.$r8$clinit;
                                            zza14.writeInt(booleanValue8 ? 1 : 0);
                                            zzcaVar8.zzc(zza14, 6);
                                        } catch (RemoteException e14) {
                                            throw new RuntimeRemoteException((Throwable) e14);
                                        }
                                    } catch (Exception unused8) {
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    boolean booleanValue9 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings10 = googleMap2.getUiSettings();
                                        uiSettings10.getClass();
                                        try {
                                            zzca zzcaVar9 = (zzca) uiSettings10.zza;
                                            Parcel zza15 = zzcaVar9.zza();
                                            int i17 = zzc.$r8$clinit;
                                            zza15.writeInt(booleanValue9 ? 1 : 0);
                                            zzcaVar9.zzc(zza15, 1);
                                        } catch (RemoteException e15) {
                                            throw new RuntimeRemoteException((Throwable) e15);
                                        }
                                    } catch (Exception unused9) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    boolean booleanValue10 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings6 = googleMap2.getUiSettings();
                                        uiSettings6.getClass();
                                    } catch (Exception unused10) {
                                    }
                                    try {
                                        zzca zzcaVar10 = (zzca) uiSettings6.zza;
                                        Parcel zza16 = zzcaVar10.zza();
                                        int i18 = zzc.$r8$clinit;
                                        zza16.writeInt(booleanValue10 ? 1 : 0);
                                        zzcaVar10.zzc(zza16, 5);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e16) {
                                        throw new RuntimeRemoteException((Throwable) e16);
                                    }
                                case 17:
                                    MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj7;
                                    if (obj8 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    mapPropertiesNode2.getClass();
                                    zzg zzgVar7 = googleMap2.zza;
                                    try {
                                        Parcel zza17 = zzgVar7.zza();
                                        zzc.zzg(zza17, null);
                                        zzgVar7.zzc(zza17, 24);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e17) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e17);
                                        return null;
                                    }
                                case 18:
                                    boolean booleanValue11 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar8 = googleMap2.zza;
                                        Parcel zza18 = zzgVar8.zza();
                                        int i19 = zzc.$r8$clinit;
                                        zza18.writeInt(booleanValue11 ? 1 : 0);
                                        zzgVar8.zzc(zza18, 41);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e18) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e18);
                                        return null;
                                    }
                                case 19:
                                    boolean booleanValue12 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar9 = googleMap2.zza;
                                        Parcel zza19 = zzgVar9.zza();
                                        int i20 = zzc.$r8$clinit;
                                        zza19.writeInt(booleanValue12 ? 1 : 0);
                                        Parcel zzJ2 = zzgVar9.zzJ(zza19, 20);
                                        zzJ2.readInt();
                                        zzJ2.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e19) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e19);
                                        return null;
                                    }
                                case 20:
                                    boolean booleanValue13 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar10 = googleMap2.zza;
                                        Parcel zza20 = zzgVar10.zza();
                                        int i21 = zzc.$r8$clinit;
                                        zza20.writeInt(booleanValue13 ? 1 : 0);
                                        zzgVar10.zzc(zza20, 22);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e20) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e20);
                                        return null;
                                    }
                                default:
                                    boolean booleanValue14 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar11 = googleMap2.zza;
                                        Parcel zza21 = zzgVar11.zza();
                                        int i22 = zzc.$r8$clinit;
                                        zza21.writeInt(booleanValue14 ? 1 : 0);
                                        zzgVar11.zzc(zza21, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e21) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e21);
                                        return null;
                                    }
                            }
                        }
                    });
                    Updater.m576setimpl(gapComposer, mapUpdaterState.getMapProperties().mapStyleOptions, new Function2() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            zzb uiSettings;
                            zzb uiSettings2;
                            zzb uiSettings3;
                            zzb uiSettings4;
                            zzb uiSettings5;
                            zzb uiSettings6;
                            int i72 = i5;
                            GoogleMap googleMap2 = googleMap;
                            switch (i72) {
                                case 0:
                                    MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj7;
                                    PaddingValues paddingValues2 = (PaddingValues) obj8;
                                    mapPropertiesNode.getClass();
                                    paddingValues2.getClass();
                                    MapUpdaterKt.access$applyContentPadding(mapPropertiesNode, googleMap2, paddingValues2);
                                    return Unit.INSTANCE;
                                case 1:
                                    LatLngBounds latLngBounds = (LatLngBounds) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar = googleMap2.zza;
                                        Parcel zza = zzgVar.zza();
                                        zzc.zze(zza, latLngBounds);
                                        zzgVar.zzc(zza, 95);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                case 2:
                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar2 = googleMap2.zza;
                                        Parcel zza2 = zzgVar2.zza();
                                        zzc.zze(zza2, mapStyleOptions);
                                        Parcel zzJ = zzgVar2.zzJ(zza2, 91);
                                        zzJ.readInt();
                                        zzJ.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e2) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                                        return null;
                                    }
                                case 3:
                                    MapType mapType = (MapType) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    mapType.getClass();
                                    int i82 = mapType.value;
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar3 = googleMap2.zza;
                                        Parcel zza3 = zzgVar3.zza();
                                        zza3.writeInt(i82);
                                        zzgVar3.zzc(zza3, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e3) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                                        return null;
                                    }
                                case 4:
                                    float floatValue = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar4 = googleMap2.zza;
                                        Parcel zza4 = zzgVar4.zza();
                                        zza4.writeFloat(floatValue);
                                        zzgVar4.zzc(zza4, 93);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e4) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e4);
                                        return null;
                                    }
                                case 5:
                                    float floatValue2 = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar5 = googleMap2.zza;
                                        Parcel zza5 = zzgVar5.zza();
                                        zza5.writeFloat(floatValue2);
                                        zzgVar5.zzc(zza5, 92);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e5) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e5);
                                        return null;
                                    }
                                case 6:
                                    Integer num = (Integer) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        googleMap2.getClass();
                                        try {
                                            zzg zzgVar6 = googleMap2.zza;
                                            Parcel zza6 = zzgVar6.zza();
                                            zza6.writeInt(intValue2);
                                            zzgVar6.zzc(zza6, 113);
                                        } catch (RemoteException e6) {
                                            TransportImpl$$ExternalSyntheticLambda0.m(e6);
                                            return null;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings = googleMap2.getUiSettings();
                                        uiSettings.getClass();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        zzca zzcaVar = (zzca) uiSettings.zza;
                                        Parcel zza7 = zzcaVar.zza();
                                        int i92 = zzc.$r8$clinit;
                                        zza7.writeInt(booleanValue ? 1 : 0);
                                        zzcaVar.zzc(zza7, 2);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e7) {
                                        throw new RuntimeRemoteException((Throwable) e7);
                                    }
                                case 8:
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings2 = googleMap2.getUiSettings();
                                        uiSettings2.getClass();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        zzca zzcaVar2 = (zzca) uiSettings2.zza;
                                        Parcel zza8 = zzcaVar2.zza();
                                        int i102 = zzc.$r8$clinit;
                                        zza8.writeInt(booleanValue2 ? 1 : 0);
                                        zzcaVar2.zzc(zza8, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeRemoteException((Throwable) e8);
                                    }
                                case 9:
                                    boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings3 = googleMap2.getUiSettings();
                                        uiSettings3.getClass();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        zzca zzcaVar3 = (zzca) uiSettings3.zza;
                                        Parcel zza9 = zzcaVar3.zza();
                                        int i112 = zzc.$r8$clinit;
                                        zza9.writeInt(booleanValue3 ? 1 : 0);
                                        zzcaVar3.zzc(zza9, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e9) {
                                        throw new RuntimeRemoteException((Throwable) e9);
                                    }
                                case 10:
                                    boolean booleanValue4 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings7 = googleMap2.getUiSettings();
                                        uiSettings7.getClass();
                                        try {
                                            zzca zzcaVar4 = (zzca) uiSettings7.zza;
                                            Parcel zza10 = zzcaVar4.zza();
                                            int i122 = zzc.$r8$clinit;
                                            zza10.writeInt(booleanValue4 ? 1 : 0);
                                            zzcaVar4.zzc(zza10, 3);
                                        } catch (RemoteException e10) {
                                            throw new RuntimeRemoteException((Throwable) e10);
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    boolean booleanValue5 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings4 = googleMap2.getUiSettings();
                                        uiSettings4.getClass();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        zzca zzcaVar5 = (zzca) uiSettings4.zza;
                                        Parcel zza11 = zzcaVar5.zza();
                                        int i13 = zzc.$r8$clinit;
                                        zza11.writeInt(booleanValue5 ? 1 : 0);
                                        zzcaVar5.zzc(zza11, 7);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e11) {
                                        throw new RuntimeRemoteException((Throwable) e11);
                                    }
                                case 12:
                                    boolean booleanValue6 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings5 = googleMap2.getUiSettings();
                                        uiSettings5.getClass();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        zzca zzcaVar6 = (zzca) uiSettings5.zza;
                                        Parcel zza12 = zzcaVar6.zza();
                                        int i14 = zzc.$r8$clinit;
                                        zza12.writeInt(booleanValue6 ? 1 : 0);
                                        zzcaVar6.zzc(zza12, 4);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e12) {
                                        throw new RuntimeRemoteException((Throwable) e12);
                                    }
                                case 13:
                                    boolean booleanValue7 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings8 = googleMap2.getUiSettings();
                                        uiSettings8.getClass();
                                        try {
                                            zzca zzcaVar7 = (zzca) uiSettings8.zza;
                                            Parcel zza13 = zzcaVar7.zza();
                                            int i15 = zzc.$r8$clinit;
                                            zza13.writeInt(booleanValue7 ? 1 : 0);
                                            zzcaVar7.zzc(zza13, 20);
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException((Throwable) e13);
                                        }
                                    } catch (Exception unused7) {
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    boolean booleanValue8 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings9 = googleMap2.getUiSettings();
                                        uiSettings9.getClass();
                                        try {
                                            zzca zzcaVar8 = (zzca) uiSettings9.zza;
                                            Parcel zza14 = zzcaVar8.zza();
                                            int i16 = zzc.$r8$clinit;
                                            zza14.writeInt(booleanValue8 ? 1 : 0);
                                            zzcaVar8.zzc(zza14, 6);
                                        } catch (RemoteException e14) {
                                            throw new RuntimeRemoteException((Throwable) e14);
                                        }
                                    } catch (Exception unused8) {
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    boolean booleanValue9 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings10 = googleMap2.getUiSettings();
                                        uiSettings10.getClass();
                                        try {
                                            zzca zzcaVar9 = (zzca) uiSettings10.zza;
                                            Parcel zza15 = zzcaVar9.zza();
                                            int i17 = zzc.$r8$clinit;
                                            zza15.writeInt(booleanValue9 ? 1 : 0);
                                            zzcaVar9.zzc(zza15, 1);
                                        } catch (RemoteException e15) {
                                            throw new RuntimeRemoteException((Throwable) e15);
                                        }
                                    } catch (Exception unused9) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    boolean booleanValue10 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings6 = googleMap2.getUiSettings();
                                        uiSettings6.getClass();
                                    } catch (Exception unused10) {
                                    }
                                    try {
                                        zzca zzcaVar10 = (zzca) uiSettings6.zza;
                                        Parcel zza16 = zzcaVar10.zza();
                                        int i18 = zzc.$r8$clinit;
                                        zza16.writeInt(booleanValue10 ? 1 : 0);
                                        zzcaVar10.zzc(zza16, 5);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e16) {
                                        throw new RuntimeRemoteException((Throwable) e16);
                                    }
                                case 17:
                                    MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj7;
                                    if (obj8 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    mapPropertiesNode2.getClass();
                                    zzg zzgVar7 = googleMap2.zza;
                                    try {
                                        Parcel zza17 = zzgVar7.zza();
                                        zzc.zzg(zza17, null);
                                        zzgVar7.zzc(zza17, 24);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e17) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e17);
                                        return null;
                                    }
                                case 18:
                                    boolean booleanValue11 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar8 = googleMap2.zza;
                                        Parcel zza18 = zzgVar8.zza();
                                        int i19 = zzc.$r8$clinit;
                                        zza18.writeInt(booleanValue11 ? 1 : 0);
                                        zzgVar8.zzc(zza18, 41);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e18) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e18);
                                        return null;
                                    }
                                case 19:
                                    boolean booleanValue12 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar9 = googleMap2.zza;
                                        Parcel zza19 = zzgVar9.zza();
                                        int i20 = zzc.$r8$clinit;
                                        zza19.writeInt(booleanValue12 ? 1 : 0);
                                        Parcel zzJ2 = zzgVar9.zzJ(zza19, 20);
                                        zzJ2.readInt();
                                        zzJ2.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e19) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e19);
                                        return null;
                                    }
                                case 20:
                                    boolean booleanValue13 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar10 = googleMap2.zza;
                                        Parcel zza20 = zzgVar10.zza();
                                        int i21 = zzc.$r8$clinit;
                                        zza20.writeInt(booleanValue13 ? 1 : 0);
                                        zzgVar10.zzc(zza20, 22);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e20) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e20);
                                        return null;
                                    }
                                default:
                                    boolean booleanValue14 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar11 = googleMap2.zza;
                                        Parcel zza21 = zzgVar11.zza();
                                        int i22 = zzc.$r8$clinit;
                                        zza21.writeInt(booleanValue14 ? 1 : 0);
                                        zzgVar11.zzc(zza21, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e21) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e21);
                                        return null;
                                    }
                            }
                        }
                    });
                    Updater.m576setimpl(gapComposer, mapUpdaterState.getMapProperties().mapType, new Function2() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            zzb uiSettings;
                            zzb uiSettings2;
                            zzb uiSettings3;
                            zzb uiSettings4;
                            zzb uiSettings5;
                            zzb uiSettings6;
                            int i72 = i4;
                            GoogleMap googleMap2 = googleMap;
                            switch (i72) {
                                case 0:
                                    MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj7;
                                    PaddingValues paddingValues2 = (PaddingValues) obj8;
                                    mapPropertiesNode.getClass();
                                    paddingValues2.getClass();
                                    MapUpdaterKt.access$applyContentPadding(mapPropertiesNode, googleMap2, paddingValues2);
                                    return Unit.INSTANCE;
                                case 1:
                                    LatLngBounds latLngBounds = (LatLngBounds) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar = googleMap2.zza;
                                        Parcel zza = zzgVar.zza();
                                        zzc.zze(zza, latLngBounds);
                                        zzgVar.zzc(zza, 95);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                case 2:
                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar2 = googleMap2.zza;
                                        Parcel zza2 = zzgVar2.zza();
                                        zzc.zze(zza2, mapStyleOptions);
                                        Parcel zzJ = zzgVar2.zzJ(zza2, 91);
                                        zzJ.readInt();
                                        zzJ.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e2) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                                        return null;
                                    }
                                case 3:
                                    MapType mapType = (MapType) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    mapType.getClass();
                                    int i82 = mapType.value;
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar3 = googleMap2.zza;
                                        Parcel zza3 = zzgVar3.zza();
                                        zza3.writeInt(i82);
                                        zzgVar3.zzc(zza3, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e3) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                                        return null;
                                    }
                                case 4:
                                    float floatValue = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar4 = googleMap2.zza;
                                        Parcel zza4 = zzgVar4.zza();
                                        zza4.writeFloat(floatValue);
                                        zzgVar4.zzc(zza4, 93);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e4) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e4);
                                        return null;
                                    }
                                case 5:
                                    float floatValue2 = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar5 = googleMap2.zza;
                                        Parcel zza5 = zzgVar5.zza();
                                        zza5.writeFloat(floatValue2);
                                        zzgVar5.zzc(zza5, 92);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e5) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e5);
                                        return null;
                                    }
                                case 6:
                                    Integer num = (Integer) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        googleMap2.getClass();
                                        try {
                                            zzg zzgVar6 = googleMap2.zza;
                                            Parcel zza6 = zzgVar6.zza();
                                            zza6.writeInt(intValue2);
                                            zzgVar6.zzc(zza6, 113);
                                        } catch (RemoteException e6) {
                                            TransportImpl$$ExternalSyntheticLambda0.m(e6);
                                            return null;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings = googleMap2.getUiSettings();
                                        uiSettings.getClass();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        zzca zzcaVar = (zzca) uiSettings.zza;
                                        Parcel zza7 = zzcaVar.zza();
                                        int i92 = zzc.$r8$clinit;
                                        zza7.writeInt(booleanValue ? 1 : 0);
                                        zzcaVar.zzc(zza7, 2);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e7) {
                                        throw new RuntimeRemoteException((Throwable) e7);
                                    }
                                case 8:
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings2 = googleMap2.getUiSettings();
                                        uiSettings2.getClass();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        zzca zzcaVar2 = (zzca) uiSettings2.zza;
                                        Parcel zza8 = zzcaVar2.zza();
                                        int i102 = zzc.$r8$clinit;
                                        zza8.writeInt(booleanValue2 ? 1 : 0);
                                        zzcaVar2.zzc(zza8, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeRemoteException((Throwable) e8);
                                    }
                                case 9:
                                    boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings3 = googleMap2.getUiSettings();
                                        uiSettings3.getClass();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        zzca zzcaVar3 = (zzca) uiSettings3.zza;
                                        Parcel zza9 = zzcaVar3.zza();
                                        int i112 = zzc.$r8$clinit;
                                        zza9.writeInt(booleanValue3 ? 1 : 0);
                                        zzcaVar3.zzc(zza9, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e9) {
                                        throw new RuntimeRemoteException((Throwable) e9);
                                    }
                                case 10:
                                    boolean booleanValue4 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings7 = googleMap2.getUiSettings();
                                        uiSettings7.getClass();
                                        try {
                                            zzca zzcaVar4 = (zzca) uiSettings7.zza;
                                            Parcel zza10 = zzcaVar4.zza();
                                            int i122 = zzc.$r8$clinit;
                                            zza10.writeInt(booleanValue4 ? 1 : 0);
                                            zzcaVar4.zzc(zza10, 3);
                                        } catch (RemoteException e10) {
                                            throw new RuntimeRemoteException((Throwable) e10);
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    boolean booleanValue5 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings4 = googleMap2.getUiSettings();
                                        uiSettings4.getClass();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        zzca zzcaVar5 = (zzca) uiSettings4.zza;
                                        Parcel zza11 = zzcaVar5.zza();
                                        int i13 = zzc.$r8$clinit;
                                        zza11.writeInt(booleanValue5 ? 1 : 0);
                                        zzcaVar5.zzc(zza11, 7);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e11) {
                                        throw new RuntimeRemoteException((Throwable) e11);
                                    }
                                case 12:
                                    boolean booleanValue6 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings5 = googleMap2.getUiSettings();
                                        uiSettings5.getClass();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        zzca zzcaVar6 = (zzca) uiSettings5.zza;
                                        Parcel zza12 = zzcaVar6.zza();
                                        int i14 = zzc.$r8$clinit;
                                        zza12.writeInt(booleanValue6 ? 1 : 0);
                                        zzcaVar6.zzc(zza12, 4);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e12) {
                                        throw new RuntimeRemoteException((Throwable) e12);
                                    }
                                case 13:
                                    boolean booleanValue7 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings8 = googleMap2.getUiSettings();
                                        uiSettings8.getClass();
                                        try {
                                            zzca zzcaVar7 = (zzca) uiSettings8.zza;
                                            Parcel zza13 = zzcaVar7.zza();
                                            int i15 = zzc.$r8$clinit;
                                            zza13.writeInt(booleanValue7 ? 1 : 0);
                                            zzcaVar7.zzc(zza13, 20);
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException((Throwable) e13);
                                        }
                                    } catch (Exception unused7) {
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    boolean booleanValue8 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings9 = googleMap2.getUiSettings();
                                        uiSettings9.getClass();
                                        try {
                                            zzca zzcaVar8 = (zzca) uiSettings9.zza;
                                            Parcel zza14 = zzcaVar8.zza();
                                            int i16 = zzc.$r8$clinit;
                                            zza14.writeInt(booleanValue8 ? 1 : 0);
                                            zzcaVar8.zzc(zza14, 6);
                                        } catch (RemoteException e14) {
                                            throw new RuntimeRemoteException((Throwable) e14);
                                        }
                                    } catch (Exception unused8) {
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    boolean booleanValue9 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings10 = googleMap2.getUiSettings();
                                        uiSettings10.getClass();
                                        try {
                                            zzca zzcaVar9 = (zzca) uiSettings10.zza;
                                            Parcel zza15 = zzcaVar9.zza();
                                            int i17 = zzc.$r8$clinit;
                                            zza15.writeInt(booleanValue9 ? 1 : 0);
                                            zzcaVar9.zzc(zza15, 1);
                                        } catch (RemoteException e15) {
                                            throw new RuntimeRemoteException((Throwable) e15);
                                        }
                                    } catch (Exception unused9) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    boolean booleanValue10 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings6 = googleMap2.getUiSettings();
                                        uiSettings6.getClass();
                                    } catch (Exception unused10) {
                                    }
                                    try {
                                        zzca zzcaVar10 = (zzca) uiSettings6.zza;
                                        Parcel zza16 = zzcaVar10.zza();
                                        int i18 = zzc.$r8$clinit;
                                        zza16.writeInt(booleanValue10 ? 1 : 0);
                                        zzcaVar10.zzc(zza16, 5);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e16) {
                                        throw new RuntimeRemoteException((Throwable) e16);
                                    }
                                case 17:
                                    MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj7;
                                    if (obj8 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    mapPropertiesNode2.getClass();
                                    zzg zzgVar7 = googleMap2.zza;
                                    try {
                                        Parcel zza17 = zzgVar7.zza();
                                        zzc.zzg(zza17, null);
                                        zzgVar7.zzc(zza17, 24);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e17) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e17);
                                        return null;
                                    }
                                case 18:
                                    boolean booleanValue11 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar8 = googleMap2.zza;
                                        Parcel zza18 = zzgVar8.zza();
                                        int i19 = zzc.$r8$clinit;
                                        zza18.writeInt(booleanValue11 ? 1 : 0);
                                        zzgVar8.zzc(zza18, 41);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e18) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e18);
                                        return null;
                                    }
                                case 19:
                                    boolean booleanValue12 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar9 = googleMap2.zza;
                                        Parcel zza19 = zzgVar9.zza();
                                        int i20 = zzc.$r8$clinit;
                                        zza19.writeInt(booleanValue12 ? 1 : 0);
                                        Parcel zzJ2 = zzgVar9.zzJ(zza19, 20);
                                        zzJ2.readInt();
                                        zzJ2.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e19) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e19);
                                        return null;
                                    }
                                case 20:
                                    boolean booleanValue13 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar10 = googleMap2.zza;
                                        Parcel zza20 = zzgVar10.zza();
                                        int i21 = zzc.$r8$clinit;
                                        zza20.writeInt(booleanValue13 ? 1 : 0);
                                        zzgVar10.zzc(zza20, 22);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e20) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e20);
                                        return null;
                                    }
                                default:
                                    boolean booleanValue14 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar11 = googleMap2.zza;
                                        Parcel zza21 = zzgVar11.zza();
                                        int i22 = zzc.$r8$clinit;
                                        zza21.writeInt(booleanValue14 ? 1 : 0);
                                        zzgVar11.zzc(zza21, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e21) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e21);
                                        return null;
                                    }
                            }
                        }
                    });
                    final int i13 = 4;
                    Updater.m576setimpl(gapComposer, Float.valueOf(mapUpdaterState.getMapProperties().maxZoomPreference), new Function2() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            zzb uiSettings;
                            zzb uiSettings2;
                            zzb uiSettings3;
                            zzb uiSettings4;
                            zzb uiSettings5;
                            zzb uiSettings6;
                            int i72 = i13;
                            GoogleMap googleMap2 = googleMap;
                            switch (i72) {
                                case 0:
                                    MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj7;
                                    PaddingValues paddingValues2 = (PaddingValues) obj8;
                                    mapPropertiesNode.getClass();
                                    paddingValues2.getClass();
                                    MapUpdaterKt.access$applyContentPadding(mapPropertiesNode, googleMap2, paddingValues2);
                                    return Unit.INSTANCE;
                                case 1:
                                    LatLngBounds latLngBounds = (LatLngBounds) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar = googleMap2.zza;
                                        Parcel zza = zzgVar.zza();
                                        zzc.zze(zza, latLngBounds);
                                        zzgVar.zzc(zza, 95);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                case 2:
                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar2 = googleMap2.zza;
                                        Parcel zza2 = zzgVar2.zza();
                                        zzc.zze(zza2, mapStyleOptions);
                                        Parcel zzJ = zzgVar2.zzJ(zza2, 91);
                                        zzJ.readInt();
                                        zzJ.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e2) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                                        return null;
                                    }
                                case 3:
                                    MapType mapType = (MapType) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    mapType.getClass();
                                    int i82 = mapType.value;
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar3 = googleMap2.zza;
                                        Parcel zza3 = zzgVar3.zza();
                                        zza3.writeInt(i82);
                                        zzgVar3.zzc(zza3, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e3) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                                        return null;
                                    }
                                case 4:
                                    float floatValue = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar4 = googleMap2.zza;
                                        Parcel zza4 = zzgVar4.zza();
                                        zza4.writeFloat(floatValue);
                                        zzgVar4.zzc(zza4, 93);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e4) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e4);
                                        return null;
                                    }
                                case 5:
                                    float floatValue2 = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar5 = googleMap2.zza;
                                        Parcel zza5 = zzgVar5.zza();
                                        zza5.writeFloat(floatValue2);
                                        zzgVar5.zzc(zza5, 92);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e5) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e5);
                                        return null;
                                    }
                                case 6:
                                    Integer num = (Integer) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        googleMap2.getClass();
                                        try {
                                            zzg zzgVar6 = googleMap2.zza;
                                            Parcel zza6 = zzgVar6.zza();
                                            zza6.writeInt(intValue2);
                                            zzgVar6.zzc(zza6, 113);
                                        } catch (RemoteException e6) {
                                            TransportImpl$$ExternalSyntheticLambda0.m(e6);
                                            return null;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings = googleMap2.getUiSettings();
                                        uiSettings.getClass();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        zzca zzcaVar = (zzca) uiSettings.zza;
                                        Parcel zza7 = zzcaVar.zza();
                                        int i92 = zzc.$r8$clinit;
                                        zza7.writeInt(booleanValue ? 1 : 0);
                                        zzcaVar.zzc(zza7, 2);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e7) {
                                        throw new RuntimeRemoteException((Throwable) e7);
                                    }
                                case 8:
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings2 = googleMap2.getUiSettings();
                                        uiSettings2.getClass();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        zzca zzcaVar2 = (zzca) uiSettings2.zza;
                                        Parcel zza8 = zzcaVar2.zza();
                                        int i102 = zzc.$r8$clinit;
                                        zza8.writeInt(booleanValue2 ? 1 : 0);
                                        zzcaVar2.zzc(zza8, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeRemoteException((Throwable) e8);
                                    }
                                case 9:
                                    boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings3 = googleMap2.getUiSettings();
                                        uiSettings3.getClass();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        zzca zzcaVar3 = (zzca) uiSettings3.zza;
                                        Parcel zza9 = zzcaVar3.zza();
                                        int i112 = zzc.$r8$clinit;
                                        zza9.writeInt(booleanValue3 ? 1 : 0);
                                        zzcaVar3.zzc(zza9, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e9) {
                                        throw new RuntimeRemoteException((Throwable) e9);
                                    }
                                case 10:
                                    boolean booleanValue4 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings7 = googleMap2.getUiSettings();
                                        uiSettings7.getClass();
                                        try {
                                            zzca zzcaVar4 = (zzca) uiSettings7.zza;
                                            Parcel zza10 = zzcaVar4.zza();
                                            int i122 = zzc.$r8$clinit;
                                            zza10.writeInt(booleanValue4 ? 1 : 0);
                                            zzcaVar4.zzc(zza10, 3);
                                        } catch (RemoteException e10) {
                                            throw new RuntimeRemoteException((Throwable) e10);
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    boolean booleanValue5 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings4 = googleMap2.getUiSettings();
                                        uiSettings4.getClass();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        zzca zzcaVar5 = (zzca) uiSettings4.zza;
                                        Parcel zza11 = zzcaVar5.zza();
                                        int i132 = zzc.$r8$clinit;
                                        zza11.writeInt(booleanValue5 ? 1 : 0);
                                        zzcaVar5.zzc(zza11, 7);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e11) {
                                        throw new RuntimeRemoteException((Throwable) e11);
                                    }
                                case 12:
                                    boolean booleanValue6 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings5 = googleMap2.getUiSettings();
                                        uiSettings5.getClass();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        zzca zzcaVar6 = (zzca) uiSettings5.zza;
                                        Parcel zza12 = zzcaVar6.zza();
                                        int i14 = zzc.$r8$clinit;
                                        zza12.writeInt(booleanValue6 ? 1 : 0);
                                        zzcaVar6.zzc(zza12, 4);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e12) {
                                        throw new RuntimeRemoteException((Throwable) e12);
                                    }
                                case 13:
                                    boolean booleanValue7 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings8 = googleMap2.getUiSettings();
                                        uiSettings8.getClass();
                                        try {
                                            zzca zzcaVar7 = (zzca) uiSettings8.zza;
                                            Parcel zza13 = zzcaVar7.zza();
                                            int i15 = zzc.$r8$clinit;
                                            zza13.writeInt(booleanValue7 ? 1 : 0);
                                            zzcaVar7.zzc(zza13, 20);
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException((Throwable) e13);
                                        }
                                    } catch (Exception unused7) {
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    boolean booleanValue8 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings9 = googleMap2.getUiSettings();
                                        uiSettings9.getClass();
                                        try {
                                            zzca zzcaVar8 = (zzca) uiSettings9.zza;
                                            Parcel zza14 = zzcaVar8.zza();
                                            int i16 = zzc.$r8$clinit;
                                            zza14.writeInt(booleanValue8 ? 1 : 0);
                                            zzcaVar8.zzc(zza14, 6);
                                        } catch (RemoteException e14) {
                                            throw new RuntimeRemoteException((Throwable) e14);
                                        }
                                    } catch (Exception unused8) {
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    boolean booleanValue9 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings10 = googleMap2.getUiSettings();
                                        uiSettings10.getClass();
                                        try {
                                            zzca zzcaVar9 = (zzca) uiSettings10.zza;
                                            Parcel zza15 = zzcaVar9.zza();
                                            int i17 = zzc.$r8$clinit;
                                            zza15.writeInt(booleanValue9 ? 1 : 0);
                                            zzcaVar9.zzc(zza15, 1);
                                        } catch (RemoteException e15) {
                                            throw new RuntimeRemoteException((Throwable) e15);
                                        }
                                    } catch (Exception unused9) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    boolean booleanValue10 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings6 = googleMap2.getUiSettings();
                                        uiSettings6.getClass();
                                    } catch (Exception unused10) {
                                    }
                                    try {
                                        zzca zzcaVar10 = (zzca) uiSettings6.zza;
                                        Parcel zza16 = zzcaVar10.zza();
                                        int i18 = zzc.$r8$clinit;
                                        zza16.writeInt(booleanValue10 ? 1 : 0);
                                        zzcaVar10.zzc(zza16, 5);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e16) {
                                        throw new RuntimeRemoteException((Throwable) e16);
                                    }
                                case 17:
                                    MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj7;
                                    if (obj8 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    mapPropertiesNode2.getClass();
                                    zzg zzgVar7 = googleMap2.zza;
                                    try {
                                        Parcel zza17 = zzgVar7.zza();
                                        zzc.zzg(zza17, null);
                                        zzgVar7.zzc(zza17, 24);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e17) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e17);
                                        return null;
                                    }
                                case 18:
                                    boolean booleanValue11 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar8 = googleMap2.zza;
                                        Parcel zza18 = zzgVar8.zza();
                                        int i19 = zzc.$r8$clinit;
                                        zza18.writeInt(booleanValue11 ? 1 : 0);
                                        zzgVar8.zzc(zza18, 41);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e18) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e18);
                                        return null;
                                    }
                                case 19:
                                    boolean booleanValue12 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar9 = googleMap2.zza;
                                        Parcel zza19 = zzgVar9.zza();
                                        int i20 = zzc.$r8$clinit;
                                        zza19.writeInt(booleanValue12 ? 1 : 0);
                                        Parcel zzJ2 = zzgVar9.zzJ(zza19, 20);
                                        zzJ2.readInt();
                                        zzJ2.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e19) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e19);
                                        return null;
                                    }
                                case 20:
                                    boolean booleanValue13 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar10 = googleMap2.zza;
                                        Parcel zza20 = zzgVar10.zza();
                                        int i21 = zzc.$r8$clinit;
                                        zza20.writeInt(booleanValue13 ? 1 : 0);
                                        zzgVar10.zzc(zza20, 22);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e20) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e20);
                                        return null;
                                    }
                                default:
                                    boolean booleanValue14 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar11 = googleMap2.zza;
                                        Parcel zza21 = zzgVar11.zza();
                                        int i22 = zzc.$r8$clinit;
                                        zza21.writeInt(booleanValue14 ? 1 : 0);
                                        zzgVar11.zzc(zza21, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e21) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e21);
                                        return null;
                                    }
                            }
                        }
                    });
                    final int i14 = 5;
                    Updater.m576setimpl(gapComposer, Float.valueOf(mapUpdaterState.getMapProperties().minZoomPreference), new Function2() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            zzb uiSettings;
                            zzb uiSettings2;
                            zzb uiSettings3;
                            zzb uiSettings4;
                            zzb uiSettings5;
                            zzb uiSettings6;
                            int i72 = i14;
                            GoogleMap googleMap2 = googleMap;
                            switch (i72) {
                                case 0:
                                    MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj7;
                                    PaddingValues paddingValues2 = (PaddingValues) obj8;
                                    mapPropertiesNode.getClass();
                                    paddingValues2.getClass();
                                    MapUpdaterKt.access$applyContentPadding(mapPropertiesNode, googleMap2, paddingValues2);
                                    return Unit.INSTANCE;
                                case 1:
                                    LatLngBounds latLngBounds = (LatLngBounds) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar = googleMap2.zza;
                                        Parcel zza = zzgVar.zza();
                                        zzc.zze(zza, latLngBounds);
                                        zzgVar.zzc(zza, 95);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                case 2:
                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar2 = googleMap2.zza;
                                        Parcel zza2 = zzgVar2.zza();
                                        zzc.zze(zza2, mapStyleOptions);
                                        Parcel zzJ = zzgVar2.zzJ(zza2, 91);
                                        zzJ.readInt();
                                        zzJ.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e2) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                                        return null;
                                    }
                                case 3:
                                    MapType mapType = (MapType) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    mapType.getClass();
                                    int i82 = mapType.value;
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar3 = googleMap2.zza;
                                        Parcel zza3 = zzgVar3.zza();
                                        zza3.writeInt(i82);
                                        zzgVar3.zzc(zza3, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e3) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                                        return null;
                                    }
                                case 4:
                                    float floatValue = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar4 = googleMap2.zza;
                                        Parcel zza4 = zzgVar4.zza();
                                        zza4.writeFloat(floatValue);
                                        zzgVar4.zzc(zza4, 93);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e4) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e4);
                                        return null;
                                    }
                                case 5:
                                    float floatValue2 = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar5 = googleMap2.zza;
                                        Parcel zza5 = zzgVar5.zza();
                                        zza5.writeFloat(floatValue2);
                                        zzgVar5.zzc(zza5, 92);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e5) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e5);
                                        return null;
                                    }
                                case 6:
                                    Integer num = (Integer) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        googleMap2.getClass();
                                        try {
                                            zzg zzgVar6 = googleMap2.zza;
                                            Parcel zza6 = zzgVar6.zza();
                                            zza6.writeInt(intValue2);
                                            zzgVar6.zzc(zza6, 113);
                                        } catch (RemoteException e6) {
                                            TransportImpl$$ExternalSyntheticLambda0.m(e6);
                                            return null;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings = googleMap2.getUiSettings();
                                        uiSettings.getClass();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        zzca zzcaVar = (zzca) uiSettings.zza;
                                        Parcel zza7 = zzcaVar.zza();
                                        int i92 = zzc.$r8$clinit;
                                        zza7.writeInt(booleanValue ? 1 : 0);
                                        zzcaVar.zzc(zza7, 2);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e7) {
                                        throw new RuntimeRemoteException((Throwable) e7);
                                    }
                                case 8:
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings2 = googleMap2.getUiSettings();
                                        uiSettings2.getClass();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        zzca zzcaVar2 = (zzca) uiSettings2.zza;
                                        Parcel zza8 = zzcaVar2.zza();
                                        int i102 = zzc.$r8$clinit;
                                        zza8.writeInt(booleanValue2 ? 1 : 0);
                                        zzcaVar2.zzc(zza8, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeRemoteException((Throwable) e8);
                                    }
                                case 9:
                                    boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings3 = googleMap2.getUiSettings();
                                        uiSettings3.getClass();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        zzca zzcaVar3 = (zzca) uiSettings3.zza;
                                        Parcel zza9 = zzcaVar3.zza();
                                        int i112 = zzc.$r8$clinit;
                                        zza9.writeInt(booleanValue3 ? 1 : 0);
                                        zzcaVar3.zzc(zza9, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e9) {
                                        throw new RuntimeRemoteException((Throwable) e9);
                                    }
                                case 10:
                                    boolean booleanValue4 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings7 = googleMap2.getUiSettings();
                                        uiSettings7.getClass();
                                        try {
                                            zzca zzcaVar4 = (zzca) uiSettings7.zza;
                                            Parcel zza10 = zzcaVar4.zza();
                                            int i122 = zzc.$r8$clinit;
                                            zza10.writeInt(booleanValue4 ? 1 : 0);
                                            zzcaVar4.zzc(zza10, 3);
                                        } catch (RemoteException e10) {
                                            throw new RuntimeRemoteException((Throwable) e10);
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    boolean booleanValue5 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings4 = googleMap2.getUiSettings();
                                        uiSettings4.getClass();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        zzca zzcaVar5 = (zzca) uiSettings4.zza;
                                        Parcel zza11 = zzcaVar5.zza();
                                        int i132 = zzc.$r8$clinit;
                                        zza11.writeInt(booleanValue5 ? 1 : 0);
                                        zzcaVar5.zzc(zza11, 7);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e11) {
                                        throw new RuntimeRemoteException((Throwable) e11);
                                    }
                                case 12:
                                    boolean booleanValue6 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings5 = googleMap2.getUiSettings();
                                        uiSettings5.getClass();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        zzca zzcaVar6 = (zzca) uiSettings5.zza;
                                        Parcel zza12 = zzcaVar6.zza();
                                        int i142 = zzc.$r8$clinit;
                                        zza12.writeInt(booleanValue6 ? 1 : 0);
                                        zzcaVar6.zzc(zza12, 4);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e12) {
                                        throw new RuntimeRemoteException((Throwable) e12);
                                    }
                                case 13:
                                    boolean booleanValue7 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings8 = googleMap2.getUiSettings();
                                        uiSettings8.getClass();
                                        try {
                                            zzca zzcaVar7 = (zzca) uiSettings8.zza;
                                            Parcel zza13 = zzcaVar7.zza();
                                            int i15 = zzc.$r8$clinit;
                                            zza13.writeInt(booleanValue7 ? 1 : 0);
                                            zzcaVar7.zzc(zza13, 20);
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException((Throwable) e13);
                                        }
                                    } catch (Exception unused7) {
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    boolean booleanValue8 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings9 = googleMap2.getUiSettings();
                                        uiSettings9.getClass();
                                        try {
                                            zzca zzcaVar8 = (zzca) uiSettings9.zza;
                                            Parcel zza14 = zzcaVar8.zza();
                                            int i16 = zzc.$r8$clinit;
                                            zza14.writeInt(booleanValue8 ? 1 : 0);
                                            zzcaVar8.zzc(zza14, 6);
                                        } catch (RemoteException e14) {
                                            throw new RuntimeRemoteException((Throwable) e14);
                                        }
                                    } catch (Exception unused8) {
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    boolean booleanValue9 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings10 = googleMap2.getUiSettings();
                                        uiSettings10.getClass();
                                        try {
                                            zzca zzcaVar9 = (zzca) uiSettings10.zza;
                                            Parcel zza15 = zzcaVar9.zza();
                                            int i17 = zzc.$r8$clinit;
                                            zza15.writeInt(booleanValue9 ? 1 : 0);
                                            zzcaVar9.zzc(zza15, 1);
                                        } catch (RemoteException e15) {
                                            throw new RuntimeRemoteException((Throwable) e15);
                                        }
                                    } catch (Exception unused9) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    boolean booleanValue10 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings6 = googleMap2.getUiSettings();
                                        uiSettings6.getClass();
                                    } catch (Exception unused10) {
                                    }
                                    try {
                                        zzca zzcaVar10 = (zzca) uiSettings6.zza;
                                        Parcel zza16 = zzcaVar10.zza();
                                        int i18 = zzc.$r8$clinit;
                                        zza16.writeInt(booleanValue10 ? 1 : 0);
                                        zzcaVar10.zzc(zza16, 5);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e16) {
                                        throw new RuntimeRemoteException((Throwable) e16);
                                    }
                                case 17:
                                    MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj7;
                                    if (obj8 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    mapPropertiesNode2.getClass();
                                    zzg zzgVar7 = googleMap2.zza;
                                    try {
                                        Parcel zza17 = zzgVar7.zza();
                                        zzc.zzg(zza17, null);
                                        zzgVar7.zzc(zza17, 24);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e17) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e17);
                                        return null;
                                    }
                                case 18:
                                    boolean booleanValue11 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar8 = googleMap2.zza;
                                        Parcel zza18 = zzgVar8.zza();
                                        int i19 = zzc.$r8$clinit;
                                        zza18.writeInt(booleanValue11 ? 1 : 0);
                                        zzgVar8.zzc(zza18, 41);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e18) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e18);
                                        return null;
                                    }
                                case 19:
                                    boolean booleanValue12 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar9 = googleMap2.zza;
                                        Parcel zza19 = zzgVar9.zza();
                                        int i20 = zzc.$r8$clinit;
                                        zza19.writeInt(booleanValue12 ? 1 : 0);
                                        Parcel zzJ2 = zzgVar9.zzJ(zza19, 20);
                                        zzJ2.readInt();
                                        zzJ2.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e19) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e19);
                                        return null;
                                    }
                                case 20:
                                    boolean booleanValue13 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar10 = googleMap2.zza;
                                        Parcel zza20 = zzgVar10.zza();
                                        int i21 = zzc.$r8$clinit;
                                        zza20.writeInt(booleanValue13 ? 1 : 0);
                                        zzgVar10.zzc(zza20, 22);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e20) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e20);
                                        return null;
                                    }
                                default:
                                    boolean booleanValue14 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar11 = googleMap2.zza;
                                        Parcel zza21 = zzgVar11.zza();
                                        int i22 = zzc.$r8$clinit;
                                        zza21.writeInt(booleanValue14 ? 1 : 0);
                                        zzgVar11.zzc(zza21, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e21) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e21);
                                        return null;
                                    }
                            }
                        }
                    });
                    Updater.m576setimpl(gapComposer, (Integer) mapUpdaterState.mapColorScheme$delegate.getValue(), new Function2() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            zzb uiSettings;
                            zzb uiSettings2;
                            zzb uiSettings3;
                            zzb uiSettings4;
                            zzb uiSettings5;
                            zzb uiSettings6;
                            int i72 = i3;
                            GoogleMap googleMap2 = googleMap;
                            switch (i72) {
                                case 0:
                                    MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj7;
                                    PaddingValues paddingValues2 = (PaddingValues) obj8;
                                    mapPropertiesNode.getClass();
                                    paddingValues2.getClass();
                                    MapUpdaterKt.access$applyContentPadding(mapPropertiesNode, googleMap2, paddingValues2);
                                    return Unit.INSTANCE;
                                case 1:
                                    LatLngBounds latLngBounds = (LatLngBounds) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar = googleMap2.zza;
                                        Parcel zza = zzgVar.zza();
                                        zzc.zze(zza, latLngBounds);
                                        zzgVar.zzc(zza, 95);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                case 2:
                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar2 = googleMap2.zza;
                                        Parcel zza2 = zzgVar2.zza();
                                        zzc.zze(zza2, mapStyleOptions);
                                        Parcel zzJ = zzgVar2.zzJ(zza2, 91);
                                        zzJ.readInt();
                                        zzJ.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e2) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                                        return null;
                                    }
                                case 3:
                                    MapType mapType = (MapType) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    mapType.getClass();
                                    int i82 = mapType.value;
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar3 = googleMap2.zza;
                                        Parcel zza3 = zzgVar3.zza();
                                        zza3.writeInt(i82);
                                        zzgVar3.zzc(zza3, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e3) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                                        return null;
                                    }
                                case 4:
                                    float floatValue = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar4 = googleMap2.zza;
                                        Parcel zza4 = zzgVar4.zza();
                                        zza4.writeFloat(floatValue);
                                        zzgVar4.zzc(zza4, 93);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e4) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e4);
                                        return null;
                                    }
                                case 5:
                                    float floatValue2 = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar5 = googleMap2.zza;
                                        Parcel zza5 = zzgVar5.zza();
                                        zza5.writeFloat(floatValue2);
                                        zzgVar5.zzc(zza5, 92);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e5) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e5);
                                        return null;
                                    }
                                case 6:
                                    Integer num = (Integer) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        googleMap2.getClass();
                                        try {
                                            zzg zzgVar6 = googleMap2.zza;
                                            Parcel zza6 = zzgVar6.zza();
                                            zza6.writeInt(intValue2);
                                            zzgVar6.zzc(zza6, 113);
                                        } catch (RemoteException e6) {
                                            TransportImpl$$ExternalSyntheticLambda0.m(e6);
                                            return null;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings = googleMap2.getUiSettings();
                                        uiSettings.getClass();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        zzca zzcaVar = (zzca) uiSettings.zza;
                                        Parcel zza7 = zzcaVar.zza();
                                        int i92 = zzc.$r8$clinit;
                                        zza7.writeInt(booleanValue ? 1 : 0);
                                        zzcaVar.zzc(zza7, 2);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e7) {
                                        throw new RuntimeRemoteException((Throwable) e7);
                                    }
                                case 8:
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings2 = googleMap2.getUiSettings();
                                        uiSettings2.getClass();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        zzca zzcaVar2 = (zzca) uiSettings2.zza;
                                        Parcel zza8 = zzcaVar2.zza();
                                        int i102 = zzc.$r8$clinit;
                                        zza8.writeInt(booleanValue2 ? 1 : 0);
                                        zzcaVar2.zzc(zza8, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeRemoteException((Throwable) e8);
                                    }
                                case 9:
                                    boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings3 = googleMap2.getUiSettings();
                                        uiSettings3.getClass();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        zzca zzcaVar3 = (zzca) uiSettings3.zza;
                                        Parcel zza9 = zzcaVar3.zza();
                                        int i112 = zzc.$r8$clinit;
                                        zza9.writeInt(booleanValue3 ? 1 : 0);
                                        zzcaVar3.zzc(zza9, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e9) {
                                        throw new RuntimeRemoteException((Throwable) e9);
                                    }
                                case 10:
                                    boolean booleanValue4 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings7 = googleMap2.getUiSettings();
                                        uiSettings7.getClass();
                                        try {
                                            zzca zzcaVar4 = (zzca) uiSettings7.zza;
                                            Parcel zza10 = zzcaVar4.zza();
                                            int i122 = zzc.$r8$clinit;
                                            zza10.writeInt(booleanValue4 ? 1 : 0);
                                            zzcaVar4.zzc(zza10, 3);
                                        } catch (RemoteException e10) {
                                            throw new RuntimeRemoteException((Throwable) e10);
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    boolean booleanValue5 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings4 = googleMap2.getUiSettings();
                                        uiSettings4.getClass();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        zzca zzcaVar5 = (zzca) uiSettings4.zza;
                                        Parcel zza11 = zzcaVar5.zza();
                                        int i132 = zzc.$r8$clinit;
                                        zza11.writeInt(booleanValue5 ? 1 : 0);
                                        zzcaVar5.zzc(zza11, 7);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e11) {
                                        throw new RuntimeRemoteException((Throwable) e11);
                                    }
                                case 12:
                                    boolean booleanValue6 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings5 = googleMap2.getUiSettings();
                                        uiSettings5.getClass();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        zzca zzcaVar6 = (zzca) uiSettings5.zza;
                                        Parcel zza12 = zzcaVar6.zza();
                                        int i142 = zzc.$r8$clinit;
                                        zza12.writeInt(booleanValue6 ? 1 : 0);
                                        zzcaVar6.zzc(zza12, 4);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e12) {
                                        throw new RuntimeRemoteException((Throwable) e12);
                                    }
                                case 13:
                                    boolean booleanValue7 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings8 = googleMap2.getUiSettings();
                                        uiSettings8.getClass();
                                        try {
                                            zzca zzcaVar7 = (zzca) uiSettings8.zza;
                                            Parcel zza13 = zzcaVar7.zza();
                                            int i15 = zzc.$r8$clinit;
                                            zza13.writeInt(booleanValue7 ? 1 : 0);
                                            zzcaVar7.zzc(zza13, 20);
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException((Throwable) e13);
                                        }
                                    } catch (Exception unused7) {
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    boolean booleanValue8 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings9 = googleMap2.getUiSettings();
                                        uiSettings9.getClass();
                                        try {
                                            zzca zzcaVar8 = (zzca) uiSettings9.zza;
                                            Parcel zza14 = zzcaVar8.zza();
                                            int i16 = zzc.$r8$clinit;
                                            zza14.writeInt(booleanValue8 ? 1 : 0);
                                            zzcaVar8.zzc(zza14, 6);
                                        } catch (RemoteException e14) {
                                            throw new RuntimeRemoteException((Throwable) e14);
                                        }
                                    } catch (Exception unused8) {
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    boolean booleanValue9 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings10 = googleMap2.getUiSettings();
                                        uiSettings10.getClass();
                                        try {
                                            zzca zzcaVar9 = (zzca) uiSettings10.zza;
                                            Parcel zza15 = zzcaVar9.zza();
                                            int i17 = zzc.$r8$clinit;
                                            zza15.writeInt(booleanValue9 ? 1 : 0);
                                            zzcaVar9.zzc(zza15, 1);
                                        } catch (RemoteException e15) {
                                            throw new RuntimeRemoteException((Throwable) e15);
                                        }
                                    } catch (Exception unused9) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    boolean booleanValue10 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings6 = googleMap2.getUiSettings();
                                        uiSettings6.getClass();
                                    } catch (Exception unused10) {
                                    }
                                    try {
                                        zzca zzcaVar10 = (zzca) uiSettings6.zza;
                                        Parcel zza16 = zzcaVar10.zza();
                                        int i18 = zzc.$r8$clinit;
                                        zza16.writeInt(booleanValue10 ? 1 : 0);
                                        zzcaVar10.zzc(zza16, 5);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e16) {
                                        throw new RuntimeRemoteException((Throwable) e16);
                                    }
                                case 17:
                                    MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj7;
                                    if (obj8 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    mapPropertiesNode2.getClass();
                                    zzg zzgVar7 = googleMap2.zza;
                                    try {
                                        Parcel zza17 = zzgVar7.zza();
                                        zzc.zzg(zza17, null);
                                        zzgVar7.zzc(zza17, 24);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e17) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e17);
                                        return null;
                                    }
                                case 18:
                                    boolean booleanValue11 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar8 = googleMap2.zza;
                                        Parcel zza18 = zzgVar8.zza();
                                        int i19 = zzc.$r8$clinit;
                                        zza18.writeInt(booleanValue11 ? 1 : 0);
                                        zzgVar8.zzc(zza18, 41);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e18) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e18);
                                        return null;
                                    }
                                case 19:
                                    boolean booleanValue12 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar9 = googleMap2.zza;
                                        Parcel zza19 = zzgVar9.zza();
                                        int i20 = zzc.$r8$clinit;
                                        zza19.writeInt(booleanValue12 ? 1 : 0);
                                        Parcel zzJ2 = zzgVar9.zzJ(zza19, 20);
                                        zzJ2.readInt();
                                        zzJ2.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e19) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e19);
                                        return null;
                                    }
                                case 20:
                                    boolean booleanValue13 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar10 = googleMap2.zza;
                                        Parcel zza20 = zzgVar10.zza();
                                        int i21 = zzc.$r8$clinit;
                                        zza20.writeInt(booleanValue13 ? 1 : 0);
                                        zzgVar10.zzc(zza20, 22);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e20) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e20);
                                        return null;
                                    }
                                default:
                                    boolean booleanValue14 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar11 = googleMap2.zza;
                                        Parcel zza21 = zzgVar11.zza();
                                        int i22 = zzc.$r8$clinit;
                                        zza21.writeInt(booleanValue14 ? 1 : 0);
                                        zzgVar11.zzc(zza21, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e21) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e21);
                                        return null;
                                    }
                            }
                        }
                    });
                    final int i15 = 7;
                    Updater.m576setimpl(gapComposer, Boolean.valueOf(mapUpdaterState.getMapUiSettings().compassEnabled), new Function2() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            zzb uiSettings;
                            zzb uiSettings2;
                            zzb uiSettings3;
                            zzb uiSettings4;
                            zzb uiSettings5;
                            zzb uiSettings6;
                            int i72 = i15;
                            GoogleMap googleMap2 = googleMap;
                            switch (i72) {
                                case 0:
                                    MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj7;
                                    PaddingValues paddingValues2 = (PaddingValues) obj8;
                                    mapPropertiesNode.getClass();
                                    paddingValues2.getClass();
                                    MapUpdaterKt.access$applyContentPadding(mapPropertiesNode, googleMap2, paddingValues2);
                                    return Unit.INSTANCE;
                                case 1:
                                    LatLngBounds latLngBounds = (LatLngBounds) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar = googleMap2.zza;
                                        Parcel zza = zzgVar.zza();
                                        zzc.zze(zza, latLngBounds);
                                        zzgVar.zzc(zza, 95);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                case 2:
                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar2 = googleMap2.zza;
                                        Parcel zza2 = zzgVar2.zza();
                                        zzc.zze(zza2, mapStyleOptions);
                                        Parcel zzJ = zzgVar2.zzJ(zza2, 91);
                                        zzJ.readInt();
                                        zzJ.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e2) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                                        return null;
                                    }
                                case 3:
                                    MapType mapType = (MapType) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    mapType.getClass();
                                    int i82 = mapType.value;
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar3 = googleMap2.zza;
                                        Parcel zza3 = zzgVar3.zza();
                                        zza3.writeInt(i82);
                                        zzgVar3.zzc(zza3, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e3) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                                        return null;
                                    }
                                case 4:
                                    float floatValue = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar4 = googleMap2.zza;
                                        Parcel zza4 = zzgVar4.zza();
                                        zza4.writeFloat(floatValue);
                                        zzgVar4.zzc(zza4, 93);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e4) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e4);
                                        return null;
                                    }
                                case 5:
                                    float floatValue2 = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar5 = googleMap2.zza;
                                        Parcel zza5 = zzgVar5.zza();
                                        zza5.writeFloat(floatValue2);
                                        zzgVar5.zzc(zza5, 92);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e5) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e5);
                                        return null;
                                    }
                                case 6:
                                    Integer num = (Integer) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        googleMap2.getClass();
                                        try {
                                            zzg zzgVar6 = googleMap2.zza;
                                            Parcel zza6 = zzgVar6.zza();
                                            zza6.writeInt(intValue2);
                                            zzgVar6.zzc(zza6, 113);
                                        } catch (RemoteException e6) {
                                            TransportImpl$$ExternalSyntheticLambda0.m(e6);
                                            return null;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings = googleMap2.getUiSettings();
                                        uiSettings.getClass();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        zzca zzcaVar = (zzca) uiSettings.zza;
                                        Parcel zza7 = zzcaVar.zza();
                                        int i92 = zzc.$r8$clinit;
                                        zza7.writeInt(booleanValue ? 1 : 0);
                                        zzcaVar.zzc(zza7, 2);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e7) {
                                        throw new RuntimeRemoteException((Throwable) e7);
                                    }
                                case 8:
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings2 = googleMap2.getUiSettings();
                                        uiSettings2.getClass();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        zzca zzcaVar2 = (zzca) uiSettings2.zza;
                                        Parcel zza8 = zzcaVar2.zza();
                                        int i102 = zzc.$r8$clinit;
                                        zza8.writeInt(booleanValue2 ? 1 : 0);
                                        zzcaVar2.zzc(zza8, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeRemoteException((Throwable) e8);
                                    }
                                case 9:
                                    boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings3 = googleMap2.getUiSettings();
                                        uiSettings3.getClass();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        zzca zzcaVar3 = (zzca) uiSettings3.zza;
                                        Parcel zza9 = zzcaVar3.zza();
                                        int i112 = zzc.$r8$clinit;
                                        zza9.writeInt(booleanValue3 ? 1 : 0);
                                        zzcaVar3.zzc(zza9, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e9) {
                                        throw new RuntimeRemoteException((Throwable) e9);
                                    }
                                case 10:
                                    boolean booleanValue4 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings7 = googleMap2.getUiSettings();
                                        uiSettings7.getClass();
                                        try {
                                            zzca zzcaVar4 = (zzca) uiSettings7.zza;
                                            Parcel zza10 = zzcaVar4.zza();
                                            int i122 = zzc.$r8$clinit;
                                            zza10.writeInt(booleanValue4 ? 1 : 0);
                                            zzcaVar4.zzc(zza10, 3);
                                        } catch (RemoteException e10) {
                                            throw new RuntimeRemoteException((Throwable) e10);
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    boolean booleanValue5 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings4 = googleMap2.getUiSettings();
                                        uiSettings4.getClass();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        zzca zzcaVar5 = (zzca) uiSettings4.zza;
                                        Parcel zza11 = zzcaVar5.zza();
                                        int i132 = zzc.$r8$clinit;
                                        zza11.writeInt(booleanValue5 ? 1 : 0);
                                        zzcaVar5.zzc(zza11, 7);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e11) {
                                        throw new RuntimeRemoteException((Throwable) e11);
                                    }
                                case 12:
                                    boolean booleanValue6 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings5 = googleMap2.getUiSettings();
                                        uiSettings5.getClass();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        zzca zzcaVar6 = (zzca) uiSettings5.zza;
                                        Parcel zza12 = zzcaVar6.zza();
                                        int i142 = zzc.$r8$clinit;
                                        zza12.writeInt(booleanValue6 ? 1 : 0);
                                        zzcaVar6.zzc(zza12, 4);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e12) {
                                        throw new RuntimeRemoteException((Throwable) e12);
                                    }
                                case 13:
                                    boolean booleanValue7 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings8 = googleMap2.getUiSettings();
                                        uiSettings8.getClass();
                                        try {
                                            zzca zzcaVar7 = (zzca) uiSettings8.zza;
                                            Parcel zza13 = zzcaVar7.zza();
                                            int i152 = zzc.$r8$clinit;
                                            zza13.writeInt(booleanValue7 ? 1 : 0);
                                            zzcaVar7.zzc(zza13, 20);
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException((Throwable) e13);
                                        }
                                    } catch (Exception unused7) {
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    boolean booleanValue8 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings9 = googleMap2.getUiSettings();
                                        uiSettings9.getClass();
                                        try {
                                            zzca zzcaVar8 = (zzca) uiSettings9.zza;
                                            Parcel zza14 = zzcaVar8.zza();
                                            int i16 = zzc.$r8$clinit;
                                            zza14.writeInt(booleanValue8 ? 1 : 0);
                                            zzcaVar8.zzc(zza14, 6);
                                        } catch (RemoteException e14) {
                                            throw new RuntimeRemoteException((Throwable) e14);
                                        }
                                    } catch (Exception unused8) {
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    boolean booleanValue9 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings10 = googleMap2.getUiSettings();
                                        uiSettings10.getClass();
                                        try {
                                            zzca zzcaVar9 = (zzca) uiSettings10.zza;
                                            Parcel zza15 = zzcaVar9.zza();
                                            int i17 = zzc.$r8$clinit;
                                            zza15.writeInt(booleanValue9 ? 1 : 0);
                                            zzcaVar9.zzc(zza15, 1);
                                        } catch (RemoteException e15) {
                                            throw new RuntimeRemoteException((Throwable) e15);
                                        }
                                    } catch (Exception unused9) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    boolean booleanValue10 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings6 = googleMap2.getUiSettings();
                                        uiSettings6.getClass();
                                    } catch (Exception unused10) {
                                    }
                                    try {
                                        zzca zzcaVar10 = (zzca) uiSettings6.zza;
                                        Parcel zza16 = zzcaVar10.zza();
                                        int i18 = zzc.$r8$clinit;
                                        zza16.writeInt(booleanValue10 ? 1 : 0);
                                        zzcaVar10.zzc(zza16, 5);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e16) {
                                        throw new RuntimeRemoteException((Throwable) e16);
                                    }
                                case 17:
                                    MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj7;
                                    if (obj8 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    mapPropertiesNode2.getClass();
                                    zzg zzgVar7 = googleMap2.zza;
                                    try {
                                        Parcel zza17 = zzgVar7.zza();
                                        zzc.zzg(zza17, null);
                                        zzgVar7.zzc(zza17, 24);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e17) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e17);
                                        return null;
                                    }
                                case 18:
                                    boolean booleanValue11 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar8 = googleMap2.zza;
                                        Parcel zza18 = zzgVar8.zza();
                                        int i19 = zzc.$r8$clinit;
                                        zza18.writeInt(booleanValue11 ? 1 : 0);
                                        zzgVar8.zzc(zza18, 41);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e18) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e18);
                                        return null;
                                    }
                                case 19:
                                    boolean booleanValue12 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar9 = googleMap2.zza;
                                        Parcel zza19 = zzgVar9.zza();
                                        int i20 = zzc.$r8$clinit;
                                        zza19.writeInt(booleanValue12 ? 1 : 0);
                                        Parcel zzJ2 = zzgVar9.zzJ(zza19, 20);
                                        zzJ2.readInt();
                                        zzJ2.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e19) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e19);
                                        return null;
                                    }
                                case 20:
                                    boolean booleanValue13 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar10 = googleMap2.zza;
                                        Parcel zza20 = zzgVar10.zza();
                                        int i21 = zzc.$r8$clinit;
                                        zza20.writeInt(booleanValue13 ? 1 : 0);
                                        zzgVar10.zzc(zza20, 22);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e20) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e20);
                                        return null;
                                    }
                                default:
                                    boolean booleanValue14 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar11 = googleMap2.zza;
                                        Parcel zza21 = zzgVar11.zza();
                                        int i22 = zzc.$r8$clinit;
                                        zza21.writeInt(booleanValue14 ? 1 : 0);
                                        zzgVar11.zzc(zza21, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e21) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e21);
                                        return null;
                                    }
                            }
                        }
                    });
                    final int i16 = 8;
                    Updater.m576setimpl(gapComposer, Boolean.valueOf(mapUpdaterState.getMapUiSettings().indoorLevelPickerEnabled), new Function2() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            zzb uiSettings;
                            zzb uiSettings2;
                            zzb uiSettings3;
                            zzb uiSettings4;
                            zzb uiSettings5;
                            zzb uiSettings6;
                            int i72 = i16;
                            GoogleMap googleMap2 = googleMap;
                            switch (i72) {
                                case 0:
                                    MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj7;
                                    PaddingValues paddingValues2 = (PaddingValues) obj8;
                                    mapPropertiesNode.getClass();
                                    paddingValues2.getClass();
                                    MapUpdaterKt.access$applyContentPadding(mapPropertiesNode, googleMap2, paddingValues2);
                                    return Unit.INSTANCE;
                                case 1:
                                    LatLngBounds latLngBounds = (LatLngBounds) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar = googleMap2.zza;
                                        Parcel zza = zzgVar.zza();
                                        zzc.zze(zza, latLngBounds);
                                        zzgVar.zzc(zza, 95);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                case 2:
                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar2 = googleMap2.zza;
                                        Parcel zza2 = zzgVar2.zza();
                                        zzc.zze(zza2, mapStyleOptions);
                                        Parcel zzJ = zzgVar2.zzJ(zza2, 91);
                                        zzJ.readInt();
                                        zzJ.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e2) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                                        return null;
                                    }
                                case 3:
                                    MapType mapType = (MapType) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    mapType.getClass();
                                    int i82 = mapType.value;
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar3 = googleMap2.zza;
                                        Parcel zza3 = zzgVar3.zza();
                                        zza3.writeInt(i82);
                                        zzgVar3.zzc(zza3, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e3) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                                        return null;
                                    }
                                case 4:
                                    float floatValue = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar4 = googleMap2.zza;
                                        Parcel zza4 = zzgVar4.zza();
                                        zza4.writeFloat(floatValue);
                                        zzgVar4.zzc(zza4, 93);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e4) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e4);
                                        return null;
                                    }
                                case 5:
                                    float floatValue2 = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar5 = googleMap2.zza;
                                        Parcel zza5 = zzgVar5.zza();
                                        zza5.writeFloat(floatValue2);
                                        zzgVar5.zzc(zza5, 92);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e5) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e5);
                                        return null;
                                    }
                                case 6:
                                    Integer num = (Integer) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        googleMap2.getClass();
                                        try {
                                            zzg zzgVar6 = googleMap2.zza;
                                            Parcel zza6 = zzgVar6.zza();
                                            zza6.writeInt(intValue2);
                                            zzgVar6.zzc(zza6, 113);
                                        } catch (RemoteException e6) {
                                            TransportImpl$$ExternalSyntheticLambda0.m(e6);
                                            return null;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings = googleMap2.getUiSettings();
                                        uiSettings.getClass();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        zzca zzcaVar = (zzca) uiSettings.zza;
                                        Parcel zza7 = zzcaVar.zza();
                                        int i92 = zzc.$r8$clinit;
                                        zza7.writeInt(booleanValue ? 1 : 0);
                                        zzcaVar.zzc(zza7, 2);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e7) {
                                        throw new RuntimeRemoteException((Throwable) e7);
                                    }
                                case 8:
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings2 = googleMap2.getUiSettings();
                                        uiSettings2.getClass();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        zzca zzcaVar2 = (zzca) uiSettings2.zza;
                                        Parcel zza8 = zzcaVar2.zza();
                                        int i102 = zzc.$r8$clinit;
                                        zza8.writeInt(booleanValue2 ? 1 : 0);
                                        zzcaVar2.zzc(zza8, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeRemoteException((Throwable) e8);
                                    }
                                case 9:
                                    boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings3 = googleMap2.getUiSettings();
                                        uiSettings3.getClass();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        zzca zzcaVar3 = (zzca) uiSettings3.zza;
                                        Parcel zza9 = zzcaVar3.zza();
                                        int i112 = zzc.$r8$clinit;
                                        zza9.writeInt(booleanValue3 ? 1 : 0);
                                        zzcaVar3.zzc(zza9, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e9) {
                                        throw new RuntimeRemoteException((Throwable) e9);
                                    }
                                case 10:
                                    boolean booleanValue4 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings7 = googleMap2.getUiSettings();
                                        uiSettings7.getClass();
                                        try {
                                            zzca zzcaVar4 = (zzca) uiSettings7.zza;
                                            Parcel zza10 = zzcaVar4.zza();
                                            int i122 = zzc.$r8$clinit;
                                            zza10.writeInt(booleanValue4 ? 1 : 0);
                                            zzcaVar4.zzc(zza10, 3);
                                        } catch (RemoteException e10) {
                                            throw new RuntimeRemoteException((Throwable) e10);
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    boolean booleanValue5 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings4 = googleMap2.getUiSettings();
                                        uiSettings4.getClass();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        zzca zzcaVar5 = (zzca) uiSettings4.zza;
                                        Parcel zza11 = zzcaVar5.zza();
                                        int i132 = zzc.$r8$clinit;
                                        zza11.writeInt(booleanValue5 ? 1 : 0);
                                        zzcaVar5.zzc(zza11, 7);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e11) {
                                        throw new RuntimeRemoteException((Throwable) e11);
                                    }
                                case 12:
                                    boolean booleanValue6 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings5 = googleMap2.getUiSettings();
                                        uiSettings5.getClass();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        zzca zzcaVar6 = (zzca) uiSettings5.zza;
                                        Parcel zza12 = zzcaVar6.zza();
                                        int i142 = zzc.$r8$clinit;
                                        zza12.writeInt(booleanValue6 ? 1 : 0);
                                        zzcaVar6.zzc(zza12, 4);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e12) {
                                        throw new RuntimeRemoteException((Throwable) e12);
                                    }
                                case 13:
                                    boolean booleanValue7 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings8 = googleMap2.getUiSettings();
                                        uiSettings8.getClass();
                                        try {
                                            zzca zzcaVar7 = (zzca) uiSettings8.zza;
                                            Parcel zza13 = zzcaVar7.zza();
                                            int i152 = zzc.$r8$clinit;
                                            zza13.writeInt(booleanValue7 ? 1 : 0);
                                            zzcaVar7.zzc(zza13, 20);
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException((Throwable) e13);
                                        }
                                    } catch (Exception unused7) {
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    boolean booleanValue8 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings9 = googleMap2.getUiSettings();
                                        uiSettings9.getClass();
                                        try {
                                            zzca zzcaVar8 = (zzca) uiSettings9.zza;
                                            Parcel zza14 = zzcaVar8.zza();
                                            int i162 = zzc.$r8$clinit;
                                            zza14.writeInt(booleanValue8 ? 1 : 0);
                                            zzcaVar8.zzc(zza14, 6);
                                        } catch (RemoteException e14) {
                                            throw new RuntimeRemoteException((Throwable) e14);
                                        }
                                    } catch (Exception unused8) {
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    boolean booleanValue9 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings10 = googleMap2.getUiSettings();
                                        uiSettings10.getClass();
                                        try {
                                            zzca zzcaVar9 = (zzca) uiSettings10.zza;
                                            Parcel zza15 = zzcaVar9.zza();
                                            int i17 = zzc.$r8$clinit;
                                            zza15.writeInt(booleanValue9 ? 1 : 0);
                                            zzcaVar9.zzc(zza15, 1);
                                        } catch (RemoteException e15) {
                                            throw new RuntimeRemoteException((Throwable) e15);
                                        }
                                    } catch (Exception unused9) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    boolean booleanValue10 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings6 = googleMap2.getUiSettings();
                                        uiSettings6.getClass();
                                    } catch (Exception unused10) {
                                    }
                                    try {
                                        zzca zzcaVar10 = (zzca) uiSettings6.zza;
                                        Parcel zza16 = zzcaVar10.zza();
                                        int i18 = zzc.$r8$clinit;
                                        zza16.writeInt(booleanValue10 ? 1 : 0);
                                        zzcaVar10.zzc(zza16, 5);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e16) {
                                        throw new RuntimeRemoteException((Throwable) e16);
                                    }
                                case 17:
                                    MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj7;
                                    if (obj8 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    mapPropertiesNode2.getClass();
                                    zzg zzgVar7 = googleMap2.zza;
                                    try {
                                        Parcel zza17 = zzgVar7.zza();
                                        zzc.zzg(zza17, null);
                                        zzgVar7.zzc(zza17, 24);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e17) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e17);
                                        return null;
                                    }
                                case 18:
                                    boolean booleanValue11 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar8 = googleMap2.zza;
                                        Parcel zza18 = zzgVar8.zza();
                                        int i19 = zzc.$r8$clinit;
                                        zza18.writeInt(booleanValue11 ? 1 : 0);
                                        zzgVar8.zzc(zza18, 41);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e18) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e18);
                                        return null;
                                    }
                                case 19:
                                    boolean booleanValue12 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar9 = googleMap2.zza;
                                        Parcel zza19 = zzgVar9.zza();
                                        int i20 = zzc.$r8$clinit;
                                        zza19.writeInt(booleanValue12 ? 1 : 0);
                                        Parcel zzJ2 = zzgVar9.zzJ(zza19, 20);
                                        zzJ2.readInt();
                                        zzJ2.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e19) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e19);
                                        return null;
                                    }
                                case 20:
                                    boolean booleanValue13 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar10 = googleMap2.zza;
                                        Parcel zza20 = zzgVar10.zza();
                                        int i21 = zzc.$r8$clinit;
                                        zza20.writeInt(booleanValue13 ? 1 : 0);
                                        zzgVar10.zzc(zza20, 22);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e20) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e20);
                                        return null;
                                    }
                                default:
                                    boolean booleanValue14 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar11 = googleMap2.zza;
                                        Parcel zza21 = zzgVar11.zza();
                                        int i22 = zzc.$r8$clinit;
                                        zza21.writeInt(booleanValue14 ? 1 : 0);
                                        zzgVar11.zzc(zza21, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e21) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e21);
                                        return null;
                                    }
                            }
                        }
                    });
                    final int i17 = 9;
                    Updater.m576setimpl(gapComposer, Boolean.valueOf(mapUpdaterState.getMapUiSettings().mapToolbarEnabled), new Function2() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            zzb uiSettings;
                            zzb uiSettings2;
                            zzb uiSettings3;
                            zzb uiSettings4;
                            zzb uiSettings5;
                            zzb uiSettings6;
                            int i72 = i17;
                            GoogleMap googleMap2 = googleMap;
                            switch (i72) {
                                case 0:
                                    MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj7;
                                    PaddingValues paddingValues2 = (PaddingValues) obj8;
                                    mapPropertiesNode.getClass();
                                    paddingValues2.getClass();
                                    MapUpdaterKt.access$applyContentPadding(mapPropertiesNode, googleMap2, paddingValues2);
                                    return Unit.INSTANCE;
                                case 1:
                                    LatLngBounds latLngBounds = (LatLngBounds) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar = googleMap2.zza;
                                        Parcel zza = zzgVar.zza();
                                        zzc.zze(zza, latLngBounds);
                                        zzgVar.zzc(zza, 95);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                case 2:
                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar2 = googleMap2.zza;
                                        Parcel zza2 = zzgVar2.zza();
                                        zzc.zze(zza2, mapStyleOptions);
                                        Parcel zzJ = zzgVar2.zzJ(zza2, 91);
                                        zzJ.readInt();
                                        zzJ.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e2) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                                        return null;
                                    }
                                case 3:
                                    MapType mapType = (MapType) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    mapType.getClass();
                                    int i82 = mapType.value;
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar3 = googleMap2.zza;
                                        Parcel zza3 = zzgVar3.zza();
                                        zza3.writeInt(i82);
                                        zzgVar3.zzc(zza3, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e3) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                                        return null;
                                    }
                                case 4:
                                    float floatValue = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar4 = googleMap2.zza;
                                        Parcel zza4 = zzgVar4.zza();
                                        zza4.writeFloat(floatValue);
                                        zzgVar4.zzc(zza4, 93);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e4) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e4);
                                        return null;
                                    }
                                case 5:
                                    float floatValue2 = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar5 = googleMap2.zza;
                                        Parcel zza5 = zzgVar5.zza();
                                        zza5.writeFloat(floatValue2);
                                        zzgVar5.zzc(zza5, 92);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e5) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e5);
                                        return null;
                                    }
                                case 6:
                                    Integer num = (Integer) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        googleMap2.getClass();
                                        try {
                                            zzg zzgVar6 = googleMap2.zza;
                                            Parcel zza6 = zzgVar6.zza();
                                            zza6.writeInt(intValue2);
                                            zzgVar6.zzc(zza6, 113);
                                        } catch (RemoteException e6) {
                                            TransportImpl$$ExternalSyntheticLambda0.m(e6);
                                            return null;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings = googleMap2.getUiSettings();
                                        uiSettings.getClass();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        zzca zzcaVar = (zzca) uiSettings.zza;
                                        Parcel zza7 = zzcaVar.zza();
                                        int i92 = zzc.$r8$clinit;
                                        zza7.writeInt(booleanValue ? 1 : 0);
                                        zzcaVar.zzc(zza7, 2);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e7) {
                                        throw new RuntimeRemoteException((Throwable) e7);
                                    }
                                case 8:
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings2 = googleMap2.getUiSettings();
                                        uiSettings2.getClass();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        zzca zzcaVar2 = (zzca) uiSettings2.zza;
                                        Parcel zza8 = zzcaVar2.zza();
                                        int i102 = zzc.$r8$clinit;
                                        zza8.writeInt(booleanValue2 ? 1 : 0);
                                        zzcaVar2.zzc(zza8, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeRemoteException((Throwable) e8);
                                    }
                                case 9:
                                    boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings3 = googleMap2.getUiSettings();
                                        uiSettings3.getClass();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        zzca zzcaVar3 = (zzca) uiSettings3.zza;
                                        Parcel zza9 = zzcaVar3.zza();
                                        int i112 = zzc.$r8$clinit;
                                        zza9.writeInt(booleanValue3 ? 1 : 0);
                                        zzcaVar3.zzc(zza9, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e9) {
                                        throw new RuntimeRemoteException((Throwable) e9);
                                    }
                                case 10:
                                    boolean booleanValue4 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings7 = googleMap2.getUiSettings();
                                        uiSettings7.getClass();
                                        try {
                                            zzca zzcaVar4 = (zzca) uiSettings7.zza;
                                            Parcel zza10 = zzcaVar4.zza();
                                            int i122 = zzc.$r8$clinit;
                                            zza10.writeInt(booleanValue4 ? 1 : 0);
                                            zzcaVar4.zzc(zza10, 3);
                                        } catch (RemoteException e10) {
                                            throw new RuntimeRemoteException((Throwable) e10);
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    boolean booleanValue5 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings4 = googleMap2.getUiSettings();
                                        uiSettings4.getClass();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        zzca zzcaVar5 = (zzca) uiSettings4.zza;
                                        Parcel zza11 = zzcaVar5.zza();
                                        int i132 = zzc.$r8$clinit;
                                        zza11.writeInt(booleanValue5 ? 1 : 0);
                                        zzcaVar5.zzc(zza11, 7);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e11) {
                                        throw new RuntimeRemoteException((Throwable) e11);
                                    }
                                case 12:
                                    boolean booleanValue6 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings5 = googleMap2.getUiSettings();
                                        uiSettings5.getClass();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        zzca zzcaVar6 = (zzca) uiSettings5.zza;
                                        Parcel zza12 = zzcaVar6.zza();
                                        int i142 = zzc.$r8$clinit;
                                        zza12.writeInt(booleanValue6 ? 1 : 0);
                                        zzcaVar6.zzc(zza12, 4);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e12) {
                                        throw new RuntimeRemoteException((Throwable) e12);
                                    }
                                case 13:
                                    boolean booleanValue7 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings8 = googleMap2.getUiSettings();
                                        uiSettings8.getClass();
                                        try {
                                            zzca zzcaVar7 = (zzca) uiSettings8.zza;
                                            Parcel zza13 = zzcaVar7.zza();
                                            int i152 = zzc.$r8$clinit;
                                            zza13.writeInt(booleanValue7 ? 1 : 0);
                                            zzcaVar7.zzc(zza13, 20);
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException((Throwable) e13);
                                        }
                                    } catch (Exception unused7) {
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    boolean booleanValue8 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings9 = googleMap2.getUiSettings();
                                        uiSettings9.getClass();
                                        try {
                                            zzca zzcaVar8 = (zzca) uiSettings9.zza;
                                            Parcel zza14 = zzcaVar8.zza();
                                            int i162 = zzc.$r8$clinit;
                                            zza14.writeInt(booleanValue8 ? 1 : 0);
                                            zzcaVar8.zzc(zza14, 6);
                                        } catch (RemoteException e14) {
                                            throw new RuntimeRemoteException((Throwable) e14);
                                        }
                                    } catch (Exception unused8) {
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    boolean booleanValue9 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings10 = googleMap2.getUiSettings();
                                        uiSettings10.getClass();
                                        try {
                                            zzca zzcaVar9 = (zzca) uiSettings10.zza;
                                            Parcel zza15 = zzcaVar9.zza();
                                            int i172 = zzc.$r8$clinit;
                                            zza15.writeInt(booleanValue9 ? 1 : 0);
                                            zzcaVar9.zzc(zza15, 1);
                                        } catch (RemoteException e15) {
                                            throw new RuntimeRemoteException((Throwable) e15);
                                        }
                                    } catch (Exception unused9) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    boolean booleanValue10 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings6 = googleMap2.getUiSettings();
                                        uiSettings6.getClass();
                                    } catch (Exception unused10) {
                                    }
                                    try {
                                        zzca zzcaVar10 = (zzca) uiSettings6.zza;
                                        Parcel zza16 = zzcaVar10.zza();
                                        int i18 = zzc.$r8$clinit;
                                        zza16.writeInt(booleanValue10 ? 1 : 0);
                                        zzcaVar10.zzc(zza16, 5);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e16) {
                                        throw new RuntimeRemoteException((Throwable) e16);
                                    }
                                case 17:
                                    MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj7;
                                    if (obj8 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    mapPropertiesNode2.getClass();
                                    zzg zzgVar7 = googleMap2.zza;
                                    try {
                                        Parcel zza17 = zzgVar7.zza();
                                        zzc.zzg(zza17, null);
                                        zzgVar7.zzc(zza17, 24);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e17) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e17);
                                        return null;
                                    }
                                case 18:
                                    boolean booleanValue11 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar8 = googleMap2.zza;
                                        Parcel zza18 = zzgVar8.zza();
                                        int i19 = zzc.$r8$clinit;
                                        zza18.writeInt(booleanValue11 ? 1 : 0);
                                        zzgVar8.zzc(zza18, 41);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e18) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e18);
                                        return null;
                                    }
                                case 19:
                                    boolean booleanValue12 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar9 = googleMap2.zza;
                                        Parcel zza19 = zzgVar9.zza();
                                        int i20 = zzc.$r8$clinit;
                                        zza19.writeInt(booleanValue12 ? 1 : 0);
                                        Parcel zzJ2 = zzgVar9.zzJ(zza19, 20);
                                        zzJ2.readInt();
                                        zzJ2.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e19) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e19);
                                        return null;
                                    }
                                case 20:
                                    boolean booleanValue13 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar10 = googleMap2.zza;
                                        Parcel zza20 = zzgVar10.zza();
                                        int i21 = zzc.$r8$clinit;
                                        zza20.writeInt(booleanValue13 ? 1 : 0);
                                        zzgVar10.zzc(zza20, 22);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e20) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e20);
                                        return null;
                                    }
                                default:
                                    boolean booleanValue14 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar11 = googleMap2.zza;
                                        Parcel zza21 = zzgVar11.zza();
                                        int i22 = zzc.$r8$clinit;
                                        zza21.writeInt(booleanValue14 ? 1 : 0);
                                        zzgVar11.zzc(zza21, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e21) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e21);
                                        return null;
                                    }
                            }
                        }
                    });
                    final int i18 = 10;
                    Updater.m576setimpl(gapComposer, Boolean.valueOf(mapUpdaterState.getMapUiSettings().myLocationButtonEnabled), new Function2() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            zzb uiSettings;
                            zzb uiSettings2;
                            zzb uiSettings3;
                            zzb uiSettings4;
                            zzb uiSettings5;
                            zzb uiSettings6;
                            int i72 = i18;
                            GoogleMap googleMap2 = googleMap;
                            switch (i72) {
                                case 0:
                                    MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj7;
                                    PaddingValues paddingValues2 = (PaddingValues) obj8;
                                    mapPropertiesNode.getClass();
                                    paddingValues2.getClass();
                                    MapUpdaterKt.access$applyContentPadding(mapPropertiesNode, googleMap2, paddingValues2);
                                    return Unit.INSTANCE;
                                case 1:
                                    LatLngBounds latLngBounds = (LatLngBounds) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar = googleMap2.zza;
                                        Parcel zza = zzgVar.zza();
                                        zzc.zze(zza, latLngBounds);
                                        zzgVar.zzc(zza, 95);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                case 2:
                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar2 = googleMap2.zza;
                                        Parcel zza2 = zzgVar2.zza();
                                        zzc.zze(zza2, mapStyleOptions);
                                        Parcel zzJ = zzgVar2.zzJ(zza2, 91);
                                        zzJ.readInt();
                                        zzJ.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e2) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                                        return null;
                                    }
                                case 3:
                                    MapType mapType = (MapType) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    mapType.getClass();
                                    int i82 = mapType.value;
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar3 = googleMap2.zza;
                                        Parcel zza3 = zzgVar3.zza();
                                        zza3.writeInt(i82);
                                        zzgVar3.zzc(zza3, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e3) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                                        return null;
                                    }
                                case 4:
                                    float floatValue = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar4 = googleMap2.zza;
                                        Parcel zza4 = zzgVar4.zza();
                                        zza4.writeFloat(floatValue);
                                        zzgVar4.zzc(zza4, 93);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e4) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e4);
                                        return null;
                                    }
                                case 5:
                                    float floatValue2 = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar5 = googleMap2.zza;
                                        Parcel zza5 = zzgVar5.zza();
                                        zza5.writeFloat(floatValue2);
                                        zzgVar5.zzc(zza5, 92);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e5) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e5);
                                        return null;
                                    }
                                case 6:
                                    Integer num = (Integer) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        googleMap2.getClass();
                                        try {
                                            zzg zzgVar6 = googleMap2.zza;
                                            Parcel zza6 = zzgVar6.zza();
                                            zza6.writeInt(intValue2);
                                            zzgVar6.zzc(zza6, 113);
                                        } catch (RemoteException e6) {
                                            TransportImpl$$ExternalSyntheticLambda0.m(e6);
                                            return null;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings = googleMap2.getUiSettings();
                                        uiSettings.getClass();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        zzca zzcaVar = (zzca) uiSettings.zza;
                                        Parcel zza7 = zzcaVar.zza();
                                        int i92 = zzc.$r8$clinit;
                                        zza7.writeInt(booleanValue ? 1 : 0);
                                        zzcaVar.zzc(zza7, 2);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e7) {
                                        throw new RuntimeRemoteException((Throwable) e7);
                                    }
                                case 8:
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings2 = googleMap2.getUiSettings();
                                        uiSettings2.getClass();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        zzca zzcaVar2 = (zzca) uiSettings2.zza;
                                        Parcel zza8 = zzcaVar2.zza();
                                        int i102 = zzc.$r8$clinit;
                                        zza8.writeInt(booleanValue2 ? 1 : 0);
                                        zzcaVar2.zzc(zza8, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeRemoteException((Throwable) e8);
                                    }
                                case 9:
                                    boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings3 = googleMap2.getUiSettings();
                                        uiSettings3.getClass();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        zzca zzcaVar3 = (zzca) uiSettings3.zza;
                                        Parcel zza9 = zzcaVar3.zza();
                                        int i112 = zzc.$r8$clinit;
                                        zza9.writeInt(booleanValue3 ? 1 : 0);
                                        zzcaVar3.zzc(zza9, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e9) {
                                        throw new RuntimeRemoteException((Throwable) e9);
                                    }
                                case 10:
                                    boolean booleanValue4 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings7 = googleMap2.getUiSettings();
                                        uiSettings7.getClass();
                                        try {
                                            zzca zzcaVar4 = (zzca) uiSettings7.zza;
                                            Parcel zza10 = zzcaVar4.zza();
                                            int i122 = zzc.$r8$clinit;
                                            zza10.writeInt(booleanValue4 ? 1 : 0);
                                            zzcaVar4.zzc(zza10, 3);
                                        } catch (RemoteException e10) {
                                            throw new RuntimeRemoteException((Throwable) e10);
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    boolean booleanValue5 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings4 = googleMap2.getUiSettings();
                                        uiSettings4.getClass();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        zzca zzcaVar5 = (zzca) uiSettings4.zza;
                                        Parcel zza11 = zzcaVar5.zza();
                                        int i132 = zzc.$r8$clinit;
                                        zza11.writeInt(booleanValue5 ? 1 : 0);
                                        zzcaVar5.zzc(zza11, 7);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e11) {
                                        throw new RuntimeRemoteException((Throwable) e11);
                                    }
                                case 12:
                                    boolean booleanValue6 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings5 = googleMap2.getUiSettings();
                                        uiSettings5.getClass();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        zzca zzcaVar6 = (zzca) uiSettings5.zza;
                                        Parcel zza12 = zzcaVar6.zza();
                                        int i142 = zzc.$r8$clinit;
                                        zza12.writeInt(booleanValue6 ? 1 : 0);
                                        zzcaVar6.zzc(zza12, 4);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e12) {
                                        throw new RuntimeRemoteException((Throwable) e12);
                                    }
                                case 13:
                                    boolean booleanValue7 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings8 = googleMap2.getUiSettings();
                                        uiSettings8.getClass();
                                        try {
                                            zzca zzcaVar7 = (zzca) uiSettings8.zza;
                                            Parcel zza13 = zzcaVar7.zza();
                                            int i152 = zzc.$r8$clinit;
                                            zza13.writeInt(booleanValue7 ? 1 : 0);
                                            zzcaVar7.zzc(zza13, 20);
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException((Throwable) e13);
                                        }
                                    } catch (Exception unused7) {
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    boolean booleanValue8 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings9 = googleMap2.getUiSettings();
                                        uiSettings9.getClass();
                                        try {
                                            zzca zzcaVar8 = (zzca) uiSettings9.zza;
                                            Parcel zza14 = zzcaVar8.zza();
                                            int i162 = zzc.$r8$clinit;
                                            zza14.writeInt(booleanValue8 ? 1 : 0);
                                            zzcaVar8.zzc(zza14, 6);
                                        } catch (RemoteException e14) {
                                            throw new RuntimeRemoteException((Throwable) e14);
                                        }
                                    } catch (Exception unused8) {
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    boolean booleanValue9 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings10 = googleMap2.getUiSettings();
                                        uiSettings10.getClass();
                                        try {
                                            zzca zzcaVar9 = (zzca) uiSettings10.zza;
                                            Parcel zza15 = zzcaVar9.zza();
                                            int i172 = zzc.$r8$clinit;
                                            zza15.writeInt(booleanValue9 ? 1 : 0);
                                            zzcaVar9.zzc(zza15, 1);
                                        } catch (RemoteException e15) {
                                            throw new RuntimeRemoteException((Throwable) e15);
                                        }
                                    } catch (Exception unused9) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    boolean booleanValue10 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings6 = googleMap2.getUiSettings();
                                        uiSettings6.getClass();
                                    } catch (Exception unused10) {
                                    }
                                    try {
                                        zzca zzcaVar10 = (zzca) uiSettings6.zza;
                                        Parcel zza16 = zzcaVar10.zza();
                                        int i182 = zzc.$r8$clinit;
                                        zza16.writeInt(booleanValue10 ? 1 : 0);
                                        zzcaVar10.zzc(zza16, 5);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e16) {
                                        throw new RuntimeRemoteException((Throwable) e16);
                                    }
                                case 17:
                                    MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj7;
                                    if (obj8 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    mapPropertiesNode2.getClass();
                                    zzg zzgVar7 = googleMap2.zza;
                                    try {
                                        Parcel zza17 = zzgVar7.zza();
                                        zzc.zzg(zza17, null);
                                        zzgVar7.zzc(zza17, 24);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e17) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e17);
                                        return null;
                                    }
                                case 18:
                                    boolean booleanValue11 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar8 = googleMap2.zza;
                                        Parcel zza18 = zzgVar8.zza();
                                        int i19 = zzc.$r8$clinit;
                                        zza18.writeInt(booleanValue11 ? 1 : 0);
                                        zzgVar8.zzc(zza18, 41);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e18) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e18);
                                        return null;
                                    }
                                case 19:
                                    boolean booleanValue12 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar9 = googleMap2.zza;
                                        Parcel zza19 = zzgVar9.zza();
                                        int i20 = zzc.$r8$clinit;
                                        zza19.writeInt(booleanValue12 ? 1 : 0);
                                        Parcel zzJ2 = zzgVar9.zzJ(zza19, 20);
                                        zzJ2.readInt();
                                        zzJ2.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e19) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e19);
                                        return null;
                                    }
                                case 20:
                                    boolean booleanValue13 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar10 = googleMap2.zza;
                                        Parcel zza20 = zzgVar10.zza();
                                        int i21 = zzc.$r8$clinit;
                                        zza20.writeInt(booleanValue13 ? 1 : 0);
                                        zzgVar10.zzc(zza20, 22);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e20) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e20);
                                        return null;
                                    }
                                default:
                                    boolean booleanValue14 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar11 = googleMap2.zza;
                                        Parcel zza21 = zzgVar11.zza();
                                        int i22 = zzc.$r8$clinit;
                                        zza21.writeInt(booleanValue14 ? 1 : 0);
                                        zzgVar11.zzc(zza21, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e21) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e21);
                                        return null;
                                    }
                            }
                        }
                    });
                    final int i19 = 11;
                    Updater.m576setimpl(gapComposer, Boolean.valueOf(mapUpdaterState.getMapUiSettings().rotationGesturesEnabled), new Function2() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            zzb uiSettings;
                            zzb uiSettings2;
                            zzb uiSettings3;
                            zzb uiSettings4;
                            zzb uiSettings5;
                            zzb uiSettings6;
                            int i72 = i19;
                            GoogleMap googleMap2 = googleMap;
                            switch (i72) {
                                case 0:
                                    MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj7;
                                    PaddingValues paddingValues2 = (PaddingValues) obj8;
                                    mapPropertiesNode.getClass();
                                    paddingValues2.getClass();
                                    MapUpdaterKt.access$applyContentPadding(mapPropertiesNode, googleMap2, paddingValues2);
                                    return Unit.INSTANCE;
                                case 1:
                                    LatLngBounds latLngBounds = (LatLngBounds) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar = googleMap2.zza;
                                        Parcel zza = zzgVar.zza();
                                        zzc.zze(zza, latLngBounds);
                                        zzgVar.zzc(zza, 95);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                case 2:
                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar2 = googleMap2.zza;
                                        Parcel zza2 = zzgVar2.zza();
                                        zzc.zze(zza2, mapStyleOptions);
                                        Parcel zzJ = zzgVar2.zzJ(zza2, 91);
                                        zzJ.readInt();
                                        zzJ.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e2) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                                        return null;
                                    }
                                case 3:
                                    MapType mapType = (MapType) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    mapType.getClass();
                                    int i82 = mapType.value;
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar3 = googleMap2.zza;
                                        Parcel zza3 = zzgVar3.zza();
                                        zza3.writeInt(i82);
                                        zzgVar3.zzc(zza3, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e3) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                                        return null;
                                    }
                                case 4:
                                    float floatValue = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar4 = googleMap2.zza;
                                        Parcel zza4 = zzgVar4.zza();
                                        zza4.writeFloat(floatValue);
                                        zzgVar4.zzc(zza4, 93);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e4) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e4);
                                        return null;
                                    }
                                case 5:
                                    float floatValue2 = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar5 = googleMap2.zza;
                                        Parcel zza5 = zzgVar5.zza();
                                        zza5.writeFloat(floatValue2);
                                        zzgVar5.zzc(zza5, 92);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e5) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e5);
                                        return null;
                                    }
                                case 6:
                                    Integer num = (Integer) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        googleMap2.getClass();
                                        try {
                                            zzg zzgVar6 = googleMap2.zza;
                                            Parcel zza6 = zzgVar6.zza();
                                            zza6.writeInt(intValue2);
                                            zzgVar6.zzc(zza6, 113);
                                        } catch (RemoteException e6) {
                                            TransportImpl$$ExternalSyntheticLambda0.m(e6);
                                            return null;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings = googleMap2.getUiSettings();
                                        uiSettings.getClass();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        zzca zzcaVar = (zzca) uiSettings.zza;
                                        Parcel zza7 = zzcaVar.zza();
                                        int i92 = zzc.$r8$clinit;
                                        zza7.writeInt(booleanValue ? 1 : 0);
                                        zzcaVar.zzc(zza7, 2);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e7) {
                                        throw new RuntimeRemoteException((Throwable) e7);
                                    }
                                case 8:
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings2 = googleMap2.getUiSettings();
                                        uiSettings2.getClass();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        zzca zzcaVar2 = (zzca) uiSettings2.zza;
                                        Parcel zza8 = zzcaVar2.zza();
                                        int i102 = zzc.$r8$clinit;
                                        zza8.writeInt(booleanValue2 ? 1 : 0);
                                        zzcaVar2.zzc(zza8, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeRemoteException((Throwable) e8);
                                    }
                                case 9:
                                    boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings3 = googleMap2.getUiSettings();
                                        uiSettings3.getClass();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        zzca zzcaVar3 = (zzca) uiSettings3.zza;
                                        Parcel zza9 = zzcaVar3.zza();
                                        int i112 = zzc.$r8$clinit;
                                        zza9.writeInt(booleanValue3 ? 1 : 0);
                                        zzcaVar3.zzc(zza9, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e9) {
                                        throw new RuntimeRemoteException((Throwable) e9);
                                    }
                                case 10:
                                    boolean booleanValue4 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings7 = googleMap2.getUiSettings();
                                        uiSettings7.getClass();
                                        try {
                                            zzca zzcaVar4 = (zzca) uiSettings7.zza;
                                            Parcel zza10 = zzcaVar4.zza();
                                            int i122 = zzc.$r8$clinit;
                                            zza10.writeInt(booleanValue4 ? 1 : 0);
                                            zzcaVar4.zzc(zza10, 3);
                                        } catch (RemoteException e10) {
                                            throw new RuntimeRemoteException((Throwable) e10);
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    boolean booleanValue5 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings4 = googleMap2.getUiSettings();
                                        uiSettings4.getClass();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        zzca zzcaVar5 = (zzca) uiSettings4.zza;
                                        Parcel zza11 = zzcaVar5.zza();
                                        int i132 = zzc.$r8$clinit;
                                        zza11.writeInt(booleanValue5 ? 1 : 0);
                                        zzcaVar5.zzc(zza11, 7);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e11) {
                                        throw new RuntimeRemoteException((Throwable) e11);
                                    }
                                case 12:
                                    boolean booleanValue6 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings5 = googleMap2.getUiSettings();
                                        uiSettings5.getClass();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        zzca zzcaVar6 = (zzca) uiSettings5.zza;
                                        Parcel zza12 = zzcaVar6.zza();
                                        int i142 = zzc.$r8$clinit;
                                        zza12.writeInt(booleanValue6 ? 1 : 0);
                                        zzcaVar6.zzc(zza12, 4);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e12) {
                                        throw new RuntimeRemoteException((Throwable) e12);
                                    }
                                case 13:
                                    boolean booleanValue7 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings8 = googleMap2.getUiSettings();
                                        uiSettings8.getClass();
                                        try {
                                            zzca zzcaVar7 = (zzca) uiSettings8.zza;
                                            Parcel zza13 = zzcaVar7.zza();
                                            int i152 = zzc.$r8$clinit;
                                            zza13.writeInt(booleanValue7 ? 1 : 0);
                                            zzcaVar7.zzc(zza13, 20);
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException((Throwable) e13);
                                        }
                                    } catch (Exception unused7) {
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    boolean booleanValue8 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings9 = googleMap2.getUiSettings();
                                        uiSettings9.getClass();
                                        try {
                                            zzca zzcaVar8 = (zzca) uiSettings9.zza;
                                            Parcel zza14 = zzcaVar8.zza();
                                            int i162 = zzc.$r8$clinit;
                                            zza14.writeInt(booleanValue8 ? 1 : 0);
                                            zzcaVar8.zzc(zza14, 6);
                                        } catch (RemoteException e14) {
                                            throw new RuntimeRemoteException((Throwable) e14);
                                        }
                                    } catch (Exception unused8) {
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    boolean booleanValue9 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings10 = googleMap2.getUiSettings();
                                        uiSettings10.getClass();
                                        try {
                                            zzca zzcaVar9 = (zzca) uiSettings10.zza;
                                            Parcel zza15 = zzcaVar9.zza();
                                            int i172 = zzc.$r8$clinit;
                                            zza15.writeInt(booleanValue9 ? 1 : 0);
                                            zzcaVar9.zzc(zza15, 1);
                                        } catch (RemoteException e15) {
                                            throw new RuntimeRemoteException((Throwable) e15);
                                        }
                                    } catch (Exception unused9) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    boolean booleanValue10 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings6 = googleMap2.getUiSettings();
                                        uiSettings6.getClass();
                                    } catch (Exception unused10) {
                                    }
                                    try {
                                        zzca zzcaVar10 = (zzca) uiSettings6.zza;
                                        Parcel zza16 = zzcaVar10.zza();
                                        int i182 = zzc.$r8$clinit;
                                        zza16.writeInt(booleanValue10 ? 1 : 0);
                                        zzcaVar10.zzc(zza16, 5);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e16) {
                                        throw new RuntimeRemoteException((Throwable) e16);
                                    }
                                case 17:
                                    MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj7;
                                    if (obj8 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    mapPropertiesNode2.getClass();
                                    zzg zzgVar7 = googleMap2.zza;
                                    try {
                                        Parcel zza17 = zzgVar7.zza();
                                        zzc.zzg(zza17, null);
                                        zzgVar7.zzc(zza17, 24);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e17) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e17);
                                        return null;
                                    }
                                case 18:
                                    boolean booleanValue11 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar8 = googleMap2.zza;
                                        Parcel zza18 = zzgVar8.zza();
                                        int i192 = zzc.$r8$clinit;
                                        zza18.writeInt(booleanValue11 ? 1 : 0);
                                        zzgVar8.zzc(zza18, 41);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e18) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e18);
                                        return null;
                                    }
                                case 19:
                                    boolean booleanValue12 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar9 = googleMap2.zza;
                                        Parcel zza19 = zzgVar9.zza();
                                        int i20 = zzc.$r8$clinit;
                                        zza19.writeInt(booleanValue12 ? 1 : 0);
                                        Parcel zzJ2 = zzgVar9.zzJ(zza19, 20);
                                        zzJ2.readInt();
                                        zzJ2.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e19) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e19);
                                        return null;
                                    }
                                case 20:
                                    boolean booleanValue13 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar10 = googleMap2.zza;
                                        Parcel zza20 = zzgVar10.zza();
                                        int i21 = zzc.$r8$clinit;
                                        zza20.writeInt(booleanValue13 ? 1 : 0);
                                        zzgVar10.zzc(zza20, 22);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e20) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e20);
                                        return null;
                                    }
                                default:
                                    boolean booleanValue14 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar11 = googleMap2.zza;
                                        Parcel zza21 = zzgVar11.zza();
                                        int i22 = zzc.$r8$clinit;
                                        zza21.writeInt(booleanValue14 ? 1 : 0);
                                        zzgVar11.zzc(zza21, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e21) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e21);
                                        return null;
                                    }
                            }
                        }
                    });
                    final int i20 = 12;
                    Updater.m576setimpl(gapComposer, Boolean.valueOf(mapUpdaterState.getMapUiSettings().scrollGesturesEnabled), new Function2() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            zzb uiSettings;
                            zzb uiSettings2;
                            zzb uiSettings3;
                            zzb uiSettings4;
                            zzb uiSettings5;
                            zzb uiSettings6;
                            int i72 = i20;
                            GoogleMap googleMap2 = googleMap;
                            switch (i72) {
                                case 0:
                                    MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj7;
                                    PaddingValues paddingValues2 = (PaddingValues) obj8;
                                    mapPropertiesNode.getClass();
                                    paddingValues2.getClass();
                                    MapUpdaterKt.access$applyContentPadding(mapPropertiesNode, googleMap2, paddingValues2);
                                    return Unit.INSTANCE;
                                case 1:
                                    LatLngBounds latLngBounds = (LatLngBounds) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar = googleMap2.zza;
                                        Parcel zza = zzgVar.zza();
                                        zzc.zze(zza, latLngBounds);
                                        zzgVar.zzc(zza, 95);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                case 2:
                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar2 = googleMap2.zza;
                                        Parcel zza2 = zzgVar2.zza();
                                        zzc.zze(zza2, mapStyleOptions);
                                        Parcel zzJ = zzgVar2.zzJ(zza2, 91);
                                        zzJ.readInt();
                                        zzJ.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e2) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                                        return null;
                                    }
                                case 3:
                                    MapType mapType = (MapType) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    mapType.getClass();
                                    int i82 = mapType.value;
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar3 = googleMap2.zza;
                                        Parcel zza3 = zzgVar3.zza();
                                        zza3.writeInt(i82);
                                        zzgVar3.zzc(zza3, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e3) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                                        return null;
                                    }
                                case 4:
                                    float floatValue = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar4 = googleMap2.zza;
                                        Parcel zza4 = zzgVar4.zza();
                                        zza4.writeFloat(floatValue);
                                        zzgVar4.zzc(zza4, 93);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e4) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e4);
                                        return null;
                                    }
                                case 5:
                                    float floatValue2 = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar5 = googleMap2.zza;
                                        Parcel zza5 = zzgVar5.zza();
                                        zza5.writeFloat(floatValue2);
                                        zzgVar5.zzc(zza5, 92);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e5) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e5);
                                        return null;
                                    }
                                case 6:
                                    Integer num = (Integer) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        googleMap2.getClass();
                                        try {
                                            zzg zzgVar6 = googleMap2.zza;
                                            Parcel zza6 = zzgVar6.zza();
                                            zza6.writeInt(intValue2);
                                            zzgVar6.zzc(zza6, 113);
                                        } catch (RemoteException e6) {
                                            TransportImpl$$ExternalSyntheticLambda0.m(e6);
                                            return null;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings = googleMap2.getUiSettings();
                                        uiSettings.getClass();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        zzca zzcaVar = (zzca) uiSettings.zza;
                                        Parcel zza7 = zzcaVar.zza();
                                        int i92 = zzc.$r8$clinit;
                                        zza7.writeInt(booleanValue ? 1 : 0);
                                        zzcaVar.zzc(zza7, 2);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e7) {
                                        throw new RuntimeRemoteException((Throwable) e7);
                                    }
                                case 8:
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings2 = googleMap2.getUiSettings();
                                        uiSettings2.getClass();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        zzca zzcaVar2 = (zzca) uiSettings2.zza;
                                        Parcel zza8 = zzcaVar2.zza();
                                        int i102 = zzc.$r8$clinit;
                                        zza8.writeInt(booleanValue2 ? 1 : 0);
                                        zzcaVar2.zzc(zza8, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeRemoteException((Throwable) e8);
                                    }
                                case 9:
                                    boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings3 = googleMap2.getUiSettings();
                                        uiSettings3.getClass();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        zzca zzcaVar3 = (zzca) uiSettings3.zza;
                                        Parcel zza9 = zzcaVar3.zza();
                                        int i112 = zzc.$r8$clinit;
                                        zza9.writeInt(booleanValue3 ? 1 : 0);
                                        zzcaVar3.zzc(zza9, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e9) {
                                        throw new RuntimeRemoteException((Throwable) e9);
                                    }
                                case 10:
                                    boolean booleanValue4 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings7 = googleMap2.getUiSettings();
                                        uiSettings7.getClass();
                                        try {
                                            zzca zzcaVar4 = (zzca) uiSettings7.zza;
                                            Parcel zza10 = zzcaVar4.zza();
                                            int i122 = zzc.$r8$clinit;
                                            zza10.writeInt(booleanValue4 ? 1 : 0);
                                            zzcaVar4.zzc(zza10, 3);
                                        } catch (RemoteException e10) {
                                            throw new RuntimeRemoteException((Throwable) e10);
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    boolean booleanValue5 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings4 = googleMap2.getUiSettings();
                                        uiSettings4.getClass();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        zzca zzcaVar5 = (zzca) uiSettings4.zza;
                                        Parcel zza11 = zzcaVar5.zza();
                                        int i132 = zzc.$r8$clinit;
                                        zza11.writeInt(booleanValue5 ? 1 : 0);
                                        zzcaVar5.zzc(zza11, 7);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e11) {
                                        throw new RuntimeRemoteException((Throwable) e11);
                                    }
                                case 12:
                                    boolean booleanValue6 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings5 = googleMap2.getUiSettings();
                                        uiSettings5.getClass();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        zzca zzcaVar6 = (zzca) uiSettings5.zza;
                                        Parcel zza12 = zzcaVar6.zza();
                                        int i142 = zzc.$r8$clinit;
                                        zza12.writeInt(booleanValue6 ? 1 : 0);
                                        zzcaVar6.zzc(zza12, 4);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e12) {
                                        throw new RuntimeRemoteException((Throwable) e12);
                                    }
                                case 13:
                                    boolean booleanValue7 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings8 = googleMap2.getUiSettings();
                                        uiSettings8.getClass();
                                        try {
                                            zzca zzcaVar7 = (zzca) uiSettings8.zza;
                                            Parcel zza13 = zzcaVar7.zza();
                                            int i152 = zzc.$r8$clinit;
                                            zza13.writeInt(booleanValue7 ? 1 : 0);
                                            zzcaVar7.zzc(zza13, 20);
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException((Throwable) e13);
                                        }
                                    } catch (Exception unused7) {
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    boolean booleanValue8 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings9 = googleMap2.getUiSettings();
                                        uiSettings9.getClass();
                                        try {
                                            zzca zzcaVar8 = (zzca) uiSettings9.zza;
                                            Parcel zza14 = zzcaVar8.zza();
                                            int i162 = zzc.$r8$clinit;
                                            zza14.writeInt(booleanValue8 ? 1 : 0);
                                            zzcaVar8.zzc(zza14, 6);
                                        } catch (RemoteException e14) {
                                            throw new RuntimeRemoteException((Throwable) e14);
                                        }
                                    } catch (Exception unused8) {
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    boolean booleanValue9 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings10 = googleMap2.getUiSettings();
                                        uiSettings10.getClass();
                                        try {
                                            zzca zzcaVar9 = (zzca) uiSettings10.zza;
                                            Parcel zza15 = zzcaVar9.zza();
                                            int i172 = zzc.$r8$clinit;
                                            zza15.writeInt(booleanValue9 ? 1 : 0);
                                            zzcaVar9.zzc(zza15, 1);
                                        } catch (RemoteException e15) {
                                            throw new RuntimeRemoteException((Throwable) e15);
                                        }
                                    } catch (Exception unused9) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    boolean booleanValue10 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings6 = googleMap2.getUiSettings();
                                        uiSettings6.getClass();
                                    } catch (Exception unused10) {
                                    }
                                    try {
                                        zzca zzcaVar10 = (zzca) uiSettings6.zza;
                                        Parcel zza16 = zzcaVar10.zza();
                                        int i182 = zzc.$r8$clinit;
                                        zza16.writeInt(booleanValue10 ? 1 : 0);
                                        zzcaVar10.zzc(zza16, 5);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e16) {
                                        throw new RuntimeRemoteException((Throwable) e16);
                                    }
                                case 17:
                                    MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj7;
                                    if (obj8 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    mapPropertiesNode2.getClass();
                                    zzg zzgVar7 = googleMap2.zza;
                                    try {
                                        Parcel zza17 = zzgVar7.zza();
                                        zzc.zzg(zza17, null);
                                        zzgVar7.zzc(zza17, 24);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e17) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e17);
                                        return null;
                                    }
                                case 18:
                                    boolean booleanValue11 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar8 = googleMap2.zza;
                                        Parcel zza18 = zzgVar8.zza();
                                        int i192 = zzc.$r8$clinit;
                                        zza18.writeInt(booleanValue11 ? 1 : 0);
                                        zzgVar8.zzc(zza18, 41);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e18) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e18);
                                        return null;
                                    }
                                case 19:
                                    boolean booleanValue12 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar9 = googleMap2.zza;
                                        Parcel zza19 = zzgVar9.zza();
                                        int i202 = zzc.$r8$clinit;
                                        zza19.writeInt(booleanValue12 ? 1 : 0);
                                        Parcel zzJ2 = zzgVar9.zzJ(zza19, 20);
                                        zzJ2.readInt();
                                        zzJ2.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e19) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e19);
                                        return null;
                                    }
                                case 20:
                                    boolean booleanValue13 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar10 = googleMap2.zza;
                                        Parcel zza20 = zzgVar10.zza();
                                        int i21 = zzc.$r8$clinit;
                                        zza20.writeInt(booleanValue13 ? 1 : 0);
                                        zzgVar10.zzc(zza20, 22);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e20) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e20);
                                        return null;
                                    }
                                default:
                                    boolean booleanValue14 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar11 = googleMap2.zza;
                                        Parcel zza21 = zzgVar11.zza();
                                        int i22 = zzc.$r8$clinit;
                                        zza21.writeInt(booleanValue14 ? 1 : 0);
                                        zzgVar11.zzc(zza21, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e21) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e21);
                                        return null;
                                    }
                            }
                        }
                    });
                    final int i21 = 13;
                    Updater.m576setimpl(gapComposer, Boolean.valueOf(mapUpdaterState.getMapUiSettings().scrollGesturesEnabledDuringRotateOrZoom), new Function2() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            zzb uiSettings;
                            zzb uiSettings2;
                            zzb uiSettings3;
                            zzb uiSettings4;
                            zzb uiSettings5;
                            zzb uiSettings6;
                            int i72 = i21;
                            GoogleMap googleMap2 = googleMap;
                            switch (i72) {
                                case 0:
                                    MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj7;
                                    PaddingValues paddingValues2 = (PaddingValues) obj8;
                                    mapPropertiesNode.getClass();
                                    paddingValues2.getClass();
                                    MapUpdaterKt.access$applyContentPadding(mapPropertiesNode, googleMap2, paddingValues2);
                                    return Unit.INSTANCE;
                                case 1:
                                    LatLngBounds latLngBounds = (LatLngBounds) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar = googleMap2.zza;
                                        Parcel zza = zzgVar.zza();
                                        zzc.zze(zza, latLngBounds);
                                        zzgVar.zzc(zza, 95);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                case 2:
                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar2 = googleMap2.zza;
                                        Parcel zza2 = zzgVar2.zza();
                                        zzc.zze(zza2, mapStyleOptions);
                                        Parcel zzJ = zzgVar2.zzJ(zza2, 91);
                                        zzJ.readInt();
                                        zzJ.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e2) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                                        return null;
                                    }
                                case 3:
                                    MapType mapType = (MapType) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    mapType.getClass();
                                    int i82 = mapType.value;
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar3 = googleMap2.zza;
                                        Parcel zza3 = zzgVar3.zza();
                                        zza3.writeInt(i82);
                                        zzgVar3.zzc(zza3, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e3) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                                        return null;
                                    }
                                case 4:
                                    float floatValue = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar4 = googleMap2.zza;
                                        Parcel zza4 = zzgVar4.zza();
                                        zza4.writeFloat(floatValue);
                                        zzgVar4.zzc(zza4, 93);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e4) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e4);
                                        return null;
                                    }
                                case 5:
                                    float floatValue2 = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar5 = googleMap2.zza;
                                        Parcel zza5 = zzgVar5.zza();
                                        zza5.writeFloat(floatValue2);
                                        zzgVar5.zzc(zza5, 92);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e5) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e5);
                                        return null;
                                    }
                                case 6:
                                    Integer num = (Integer) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        googleMap2.getClass();
                                        try {
                                            zzg zzgVar6 = googleMap2.zza;
                                            Parcel zza6 = zzgVar6.zza();
                                            zza6.writeInt(intValue2);
                                            zzgVar6.zzc(zza6, 113);
                                        } catch (RemoteException e6) {
                                            TransportImpl$$ExternalSyntheticLambda0.m(e6);
                                            return null;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings = googleMap2.getUiSettings();
                                        uiSettings.getClass();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        zzca zzcaVar = (zzca) uiSettings.zza;
                                        Parcel zza7 = zzcaVar.zza();
                                        int i92 = zzc.$r8$clinit;
                                        zza7.writeInt(booleanValue ? 1 : 0);
                                        zzcaVar.zzc(zza7, 2);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e7) {
                                        throw new RuntimeRemoteException((Throwable) e7);
                                    }
                                case 8:
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings2 = googleMap2.getUiSettings();
                                        uiSettings2.getClass();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        zzca zzcaVar2 = (zzca) uiSettings2.zza;
                                        Parcel zza8 = zzcaVar2.zza();
                                        int i102 = zzc.$r8$clinit;
                                        zza8.writeInt(booleanValue2 ? 1 : 0);
                                        zzcaVar2.zzc(zza8, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeRemoteException((Throwable) e8);
                                    }
                                case 9:
                                    boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings3 = googleMap2.getUiSettings();
                                        uiSettings3.getClass();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        zzca zzcaVar3 = (zzca) uiSettings3.zza;
                                        Parcel zza9 = zzcaVar3.zza();
                                        int i112 = zzc.$r8$clinit;
                                        zza9.writeInt(booleanValue3 ? 1 : 0);
                                        zzcaVar3.zzc(zza9, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e9) {
                                        throw new RuntimeRemoteException((Throwable) e9);
                                    }
                                case 10:
                                    boolean booleanValue4 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings7 = googleMap2.getUiSettings();
                                        uiSettings7.getClass();
                                        try {
                                            zzca zzcaVar4 = (zzca) uiSettings7.zza;
                                            Parcel zza10 = zzcaVar4.zza();
                                            int i122 = zzc.$r8$clinit;
                                            zza10.writeInt(booleanValue4 ? 1 : 0);
                                            zzcaVar4.zzc(zza10, 3);
                                        } catch (RemoteException e10) {
                                            throw new RuntimeRemoteException((Throwable) e10);
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    boolean booleanValue5 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings4 = googleMap2.getUiSettings();
                                        uiSettings4.getClass();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        zzca zzcaVar5 = (zzca) uiSettings4.zza;
                                        Parcel zza11 = zzcaVar5.zza();
                                        int i132 = zzc.$r8$clinit;
                                        zza11.writeInt(booleanValue5 ? 1 : 0);
                                        zzcaVar5.zzc(zza11, 7);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e11) {
                                        throw new RuntimeRemoteException((Throwable) e11);
                                    }
                                case 12:
                                    boolean booleanValue6 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings5 = googleMap2.getUiSettings();
                                        uiSettings5.getClass();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        zzca zzcaVar6 = (zzca) uiSettings5.zza;
                                        Parcel zza12 = zzcaVar6.zza();
                                        int i142 = zzc.$r8$clinit;
                                        zza12.writeInt(booleanValue6 ? 1 : 0);
                                        zzcaVar6.zzc(zza12, 4);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e12) {
                                        throw new RuntimeRemoteException((Throwable) e12);
                                    }
                                case 13:
                                    boolean booleanValue7 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings8 = googleMap2.getUiSettings();
                                        uiSettings8.getClass();
                                        try {
                                            zzca zzcaVar7 = (zzca) uiSettings8.zza;
                                            Parcel zza13 = zzcaVar7.zza();
                                            int i152 = zzc.$r8$clinit;
                                            zza13.writeInt(booleanValue7 ? 1 : 0);
                                            zzcaVar7.zzc(zza13, 20);
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException((Throwable) e13);
                                        }
                                    } catch (Exception unused7) {
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    boolean booleanValue8 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings9 = googleMap2.getUiSettings();
                                        uiSettings9.getClass();
                                        try {
                                            zzca zzcaVar8 = (zzca) uiSettings9.zza;
                                            Parcel zza14 = zzcaVar8.zza();
                                            int i162 = zzc.$r8$clinit;
                                            zza14.writeInt(booleanValue8 ? 1 : 0);
                                            zzcaVar8.zzc(zza14, 6);
                                        } catch (RemoteException e14) {
                                            throw new RuntimeRemoteException((Throwable) e14);
                                        }
                                    } catch (Exception unused8) {
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    boolean booleanValue9 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings10 = googleMap2.getUiSettings();
                                        uiSettings10.getClass();
                                        try {
                                            zzca zzcaVar9 = (zzca) uiSettings10.zza;
                                            Parcel zza15 = zzcaVar9.zza();
                                            int i172 = zzc.$r8$clinit;
                                            zza15.writeInt(booleanValue9 ? 1 : 0);
                                            zzcaVar9.zzc(zza15, 1);
                                        } catch (RemoteException e15) {
                                            throw new RuntimeRemoteException((Throwable) e15);
                                        }
                                    } catch (Exception unused9) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    boolean booleanValue10 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings6 = googleMap2.getUiSettings();
                                        uiSettings6.getClass();
                                    } catch (Exception unused10) {
                                    }
                                    try {
                                        zzca zzcaVar10 = (zzca) uiSettings6.zza;
                                        Parcel zza16 = zzcaVar10.zza();
                                        int i182 = zzc.$r8$clinit;
                                        zza16.writeInt(booleanValue10 ? 1 : 0);
                                        zzcaVar10.zzc(zza16, 5);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e16) {
                                        throw new RuntimeRemoteException((Throwable) e16);
                                    }
                                case 17:
                                    MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj7;
                                    if (obj8 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    mapPropertiesNode2.getClass();
                                    zzg zzgVar7 = googleMap2.zza;
                                    try {
                                        Parcel zza17 = zzgVar7.zza();
                                        zzc.zzg(zza17, null);
                                        zzgVar7.zzc(zza17, 24);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e17) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e17);
                                        return null;
                                    }
                                case 18:
                                    boolean booleanValue11 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar8 = googleMap2.zza;
                                        Parcel zza18 = zzgVar8.zza();
                                        int i192 = zzc.$r8$clinit;
                                        zza18.writeInt(booleanValue11 ? 1 : 0);
                                        zzgVar8.zzc(zza18, 41);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e18) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e18);
                                        return null;
                                    }
                                case 19:
                                    boolean booleanValue12 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar9 = googleMap2.zza;
                                        Parcel zza19 = zzgVar9.zza();
                                        int i202 = zzc.$r8$clinit;
                                        zza19.writeInt(booleanValue12 ? 1 : 0);
                                        Parcel zzJ2 = zzgVar9.zzJ(zza19, 20);
                                        zzJ2.readInt();
                                        zzJ2.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e19) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e19);
                                        return null;
                                    }
                                case 20:
                                    boolean booleanValue13 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar10 = googleMap2.zza;
                                        Parcel zza20 = zzgVar10.zza();
                                        int i212 = zzc.$r8$clinit;
                                        zza20.writeInt(booleanValue13 ? 1 : 0);
                                        zzgVar10.zzc(zza20, 22);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e20) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e20);
                                        return null;
                                    }
                                default:
                                    boolean booleanValue14 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar11 = googleMap2.zza;
                                        Parcel zza21 = zzgVar11.zza();
                                        int i22 = zzc.$r8$clinit;
                                        zza21.writeInt(booleanValue14 ? 1 : 0);
                                        zzgVar11.zzc(zza21, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e21) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e21);
                                        return null;
                                    }
                            }
                        }
                    });
                    final int i22 = 14;
                    Updater.m576setimpl(gapComposer, Boolean.valueOf(mapUpdaterState.getMapUiSettings().tiltGesturesEnabled), new Function2() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            zzb uiSettings;
                            zzb uiSettings2;
                            zzb uiSettings3;
                            zzb uiSettings4;
                            zzb uiSettings5;
                            zzb uiSettings6;
                            int i72 = i22;
                            GoogleMap googleMap2 = googleMap;
                            switch (i72) {
                                case 0:
                                    MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj7;
                                    PaddingValues paddingValues2 = (PaddingValues) obj8;
                                    mapPropertiesNode.getClass();
                                    paddingValues2.getClass();
                                    MapUpdaterKt.access$applyContentPadding(mapPropertiesNode, googleMap2, paddingValues2);
                                    return Unit.INSTANCE;
                                case 1:
                                    LatLngBounds latLngBounds = (LatLngBounds) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar = googleMap2.zza;
                                        Parcel zza = zzgVar.zza();
                                        zzc.zze(zza, latLngBounds);
                                        zzgVar.zzc(zza, 95);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                case 2:
                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar2 = googleMap2.zza;
                                        Parcel zza2 = zzgVar2.zza();
                                        zzc.zze(zza2, mapStyleOptions);
                                        Parcel zzJ = zzgVar2.zzJ(zza2, 91);
                                        zzJ.readInt();
                                        zzJ.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e2) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                                        return null;
                                    }
                                case 3:
                                    MapType mapType = (MapType) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    mapType.getClass();
                                    int i82 = mapType.value;
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar3 = googleMap2.zza;
                                        Parcel zza3 = zzgVar3.zza();
                                        zza3.writeInt(i82);
                                        zzgVar3.zzc(zza3, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e3) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                                        return null;
                                    }
                                case 4:
                                    float floatValue = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar4 = googleMap2.zza;
                                        Parcel zza4 = zzgVar4.zza();
                                        zza4.writeFloat(floatValue);
                                        zzgVar4.zzc(zza4, 93);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e4) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e4);
                                        return null;
                                    }
                                case 5:
                                    float floatValue2 = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar5 = googleMap2.zza;
                                        Parcel zza5 = zzgVar5.zza();
                                        zza5.writeFloat(floatValue2);
                                        zzgVar5.zzc(zza5, 92);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e5) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e5);
                                        return null;
                                    }
                                case 6:
                                    Integer num = (Integer) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        googleMap2.getClass();
                                        try {
                                            zzg zzgVar6 = googleMap2.zza;
                                            Parcel zza6 = zzgVar6.zza();
                                            zza6.writeInt(intValue2);
                                            zzgVar6.zzc(zza6, 113);
                                        } catch (RemoteException e6) {
                                            TransportImpl$$ExternalSyntheticLambda0.m(e6);
                                            return null;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings = googleMap2.getUiSettings();
                                        uiSettings.getClass();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        zzca zzcaVar = (zzca) uiSettings.zza;
                                        Parcel zza7 = zzcaVar.zza();
                                        int i92 = zzc.$r8$clinit;
                                        zza7.writeInt(booleanValue ? 1 : 0);
                                        zzcaVar.zzc(zza7, 2);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e7) {
                                        throw new RuntimeRemoteException((Throwable) e7);
                                    }
                                case 8:
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings2 = googleMap2.getUiSettings();
                                        uiSettings2.getClass();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        zzca zzcaVar2 = (zzca) uiSettings2.zza;
                                        Parcel zza8 = zzcaVar2.zza();
                                        int i102 = zzc.$r8$clinit;
                                        zza8.writeInt(booleanValue2 ? 1 : 0);
                                        zzcaVar2.zzc(zza8, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeRemoteException((Throwable) e8);
                                    }
                                case 9:
                                    boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings3 = googleMap2.getUiSettings();
                                        uiSettings3.getClass();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        zzca zzcaVar3 = (zzca) uiSettings3.zza;
                                        Parcel zza9 = zzcaVar3.zza();
                                        int i112 = zzc.$r8$clinit;
                                        zza9.writeInt(booleanValue3 ? 1 : 0);
                                        zzcaVar3.zzc(zza9, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e9) {
                                        throw new RuntimeRemoteException((Throwable) e9);
                                    }
                                case 10:
                                    boolean booleanValue4 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings7 = googleMap2.getUiSettings();
                                        uiSettings7.getClass();
                                        try {
                                            zzca zzcaVar4 = (zzca) uiSettings7.zza;
                                            Parcel zza10 = zzcaVar4.zza();
                                            int i122 = zzc.$r8$clinit;
                                            zza10.writeInt(booleanValue4 ? 1 : 0);
                                            zzcaVar4.zzc(zza10, 3);
                                        } catch (RemoteException e10) {
                                            throw new RuntimeRemoteException((Throwable) e10);
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    boolean booleanValue5 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings4 = googleMap2.getUiSettings();
                                        uiSettings4.getClass();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        zzca zzcaVar5 = (zzca) uiSettings4.zza;
                                        Parcel zza11 = zzcaVar5.zza();
                                        int i132 = zzc.$r8$clinit;
                                        zza11.writeInt(booleanValue5 ? 1 : 0);
                                        zzcaVar5.zzc(zza11, 7);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e11) {
                                        throw new RuntimeRemoteException((Throwable) e11);
                                    }
                                case 12:
                                    boolean booleanValue6 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings5 = googleMap2.getUiSettings();
                                        uiSettings5.getClass();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        zzca zzcaVar6 = (zzca) uiSettings5.zza;
                                        Parcel zza12 = zzcaVar6.zza();
                                        int i142 = zzc.$r8$clinit;
                                        zza12.writeInt(booleanValue6 ? 1 : 0);
                                        zzcaVar6.zzc(zza12, 4);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e12) {
                                        throw new RuntimeRemoteException((Throwable) e12);
                                    }
                                case 13:
                                    boolean booleanValue7 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings8 = googleMap2.getUiSettings();
                                        uiSettings8.getClass();
                                        try {
                                            zzca zzcaVar7 = (zzca) uiSettings8.zza;
                                            Parcel zza13 = zzcaVar7.zza();
                                            int i152 = zzc.$r8$clinit;
                                            zza13.writeInt(booleanValue7 ? 1 : 0);
                                            zzcaVar7.zzc(zza13, 20);
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException((Throwable) e13);
                                        }
                                    } catch (Exception unused7) {
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    boolean booleanValue8 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings9 = googleMap2.getUiSettings();
                                        uiSettings9.getClass();
                                        try {
                                            zzca zzcaVar8 = (zzca) uiSettings9.zza;
                                            Parcel zza14 = zzcaVar8.zza();
                                            int i162 = zzc.$r8$clinit;
                                            zza14.writeInt(booleanValue8 ? 1 : 0);
                                            zzcaVar8.zzc(zza14, 6);
                                        } catch (RemoteException e14) {
                                            throw new RuntimeRemoteException((Throwable) e14);
                                        }
                                    } catch (Exception unused8) {
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    boolean booleanValue9 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings10 = googleMap2.getUiSettings();
                                        uiSettings10.getClass();
                                        try {
                                            zzca zzcaVar9 = (zzca) uiSettings10.zza;
                                            Parcel zza15 = zzcaVar9.zza();
                                            int i172 = zzc.$r8$clinit;
                                            zza15.writeInt(booleanValue9 ? 1 : 0);
                                            zzcaVar9.zzc(zza15, 1);
                                        } catch (RemoteException e15) {
                                            throw new RuntimeRemoteException((Throwable) e15);
                                        }
                                    } catch (Exception unused9) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    boolean booleanValue10 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings6 = googleMap2.getUiSettings();
                                        uiSettings6.getClass();
                                    } catch (Exception unused10) {
                                    }
                                    try {
                                        zzca zzcaVar10 = (zzca) uiSettings6.zza;
                                        Parcel zza16 = zzcaVar10.zza();
                                        int i182 = zzc.$r8$clinit;
                                        zza16.writeInt(booleanValue10 ? 1 : 0);
                                        zzcaVar10.zzc(zza16, 5);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e16) {
                                        throw new RuntimeRemoteException((Throwable) e16);
                                    }
                                case 17:
                                    MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj7;
                                    if (obj8 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    mapPropertiesNode2.getClass();
                                    zzg zzgVar7 = googleMap2.zza;
                                    try {
                                        Parcel zza17 = zzgVar7.zza();
                                        zzc.zzg(zza17, null);
                                        zzgVar7.zzc(zza17, 24);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e17) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e17);
                                        return null;
                                    }
                                case 18:
                                    boolean booleanValue11 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar8 = googleMap2.zza;
                                        Parcel zza18 = zzgVar8.zza();
                                        int i192 = zzc.$r8$clinit;
                                        zza18.writeInt(booleanValue11 ? 1 : 0);
                                        zzgVar8.zzc(zza18, 41);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e18) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e18);
                                        return null;
                                    }
                                case 19:
                                    boolean booleanValue12 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar9 = googleMap2.zza;
                                        Parcel zza19 = zzgVar9.zza();
                                        int i202 = zzc.$r8$clinit;
                                        zza19.writeInt(booleanValue12 ? 1 : 0);
                                        Parcel zzJ2 = zzgVar9.zzJ(zza19, 20);
                                        zzJ2.readInt();
                                        zzJ2.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e19) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e19);
                                        return null;
                                    }
                                case 20:
                                    boolean booleanValue13 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar10 = googleMap2.zza;
                                        Parcel zza20 = zzgVar10.zza();
                                        int i212 = zzc.$r8$clinit;
                                        zza20.writeInt(booleanValue13 ? 1 : 0);
                                        zzgVar10.zzc(zza20, 22);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e20) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e20);
                                        return null;
                                    }
                                default:
                                    boolean booleanValue14 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar11 = googleMap2.zza;
                                        Parcel zza21 = zzgVar11.zza();
                                        int i222 = zzc.$r8$clinit;
                                        zza21.writeInt(booleanValue14 ? 1 : 0);
                                        zzgVar11.zzc(zza21, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e21) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e21);
                                        return null;
                                    }
                            }
                        }
                    });
                    final int i23 = 15;
                    Updater.m576setimpl(gapComposer, Boolean.valueOf(mapUpdaterState.getMapUiSettings().zoomControlsEnabled), new Function2() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            zzb uiSettings;
                            zzb uiSettings2;
                            zzb uiSettings3;
                            zzb uiSettings4;
                            zzb uiSettings5;
                            zzb uiSettings6;
                            int i72 = i23;
                            GoogleMap googleMap2 = googleMap;
                            switch (i72) {
                                case 0:
                                    MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj7;
                                    PaddingValues paddingValues2 = (PaddingValues) obj8;
                                    mapPropertiesNode.getClass();
                                    paddingValues2.getClass();
                                    MapUpdaterKt.access$applyContentPadding(mapPropertiesNode, googleMap2, paddingValues2);
                                    return Unit.INSTANCE;
                                case 1:
                                    LatLngBounds latLngBounds = (LatLngBounds) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar = googleMap2.zza;
                                        Parcel zza = zzgVar.zza();
                                        zzc.zze(zza, latLngBounds);
                                        zzgVar.zzc(zza, 95);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                case 2:
                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar2 = googleMap2.zza;
                                        Parcel zza2 = zzgVar2.zza();
                                        zzc.zze(zza2, mapStyleOptions);
                                        Parcel zzJ = zzgVar2.zzJ(zza2, 91);
                                        zzJ.readInt();
                                        zzJ.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e2) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                                        return null;
                                    }
                                case 3:
                                    MapType mapType = (MapType) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    mapType.getClass();
                                    int i82 = mapType.value;
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar3 = googleMap2.zza;
                                        Parcel zza3 = zzgVar3.zza();
                                        zza3.writeInt(i82);
                                        zzgVar3.zzc(zza3, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e3) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                                        return null;
                                    }
                                case 4:
                                    float floatValue = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar4 = googleMap2.zza;
                                        Parcel zza4 = zzgVar4.zza();
                                        zza4.writeFloat(floatValue);
                                        zzgVar4.zzc(zza4, 93);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e4) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e4);
                                        return null;
                                    }
                                case 5:
                                    float floatValue2 = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar5 = googleMap2.zza;
                                        Parcel zza5 = zzgVar5.zza();
                                        zza5.writeFloat(floatValue2);
                                        zzgVar5.zzc(zza5, 92);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e5) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e5);
                                        return null;
                                    }
                                case 6:
                                    Integer num = (Integer) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        googleMap2.getClass();
                                        try {
                                            zzg zzgVar6 = googleMap2.zza;
                                            Parcel zza6 = zzgVar6.zza();
                                            zza6.writeInt(intValue2);
                                            zzgVar6.zzc(zza6, 113);
                                        } catch (RemoteException e6) {
                                            TransportImpl$$ExternalSyntheticLambda0.m(e6);
                                            return null;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings = googleMap2.getUiSettings();
                                        uiSettings.getClass();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        zzca zzcaVar = (zzca) uiSettings.zza;
                                        Parcel zza7 = zzcaVar.zza();
                                        int i92 = zzc.$r8$clinit;
                                        zza7.writeInt(booleanValue ? 1 : 0);
                                        zzcaVar.zzc(zza7, 2);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e7) {
                                        throw new RuntimeRemoteException((Throwable) e7);
                                    }
                                case 8:
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings2 = googleMap2.getUiSettings();
                                        uiSettings2.getClass();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        zzca zzcaVar2 = (zzca) uiSettings2.zza;
                                        Parcel zza8 = zzcaVar2.zza();
                                        int i102 = zzc.$r8$clinit;
                                        zza8.writeInt(booleanValue2 ? 1 : 0);
                                        zzcaVar2.zzc(zza8, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeRemoteException((Throwable) e8);
                                    }
                                case 9:
                                    boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings3 = googleMap2.getUiSettings();
                                        uiSettings3.getClass();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        zzca zzcaVar3 = (zzca) uiSettings3.zza;
                                        Parcel zza9 = zzcaVar3.zza();
                                        int i112 = zzc.$r8$clinit;
                                        zza9.writeInt(booleanValue3 ? 1 : 0);
                                        zzcaVar3.zzc(zza9, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e9) {
                                        throw new RuntimeRemoteException((Throwable) e9);
                                    }
                                case 10:
                                    boolean booleanValue4 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings7 = googleMap2.getUiSettings();
                                        uiSettings7.getClass();
                                        try {
                                            zzca zzcaVar4 = (zzca) uiSettings7.zza;
                                            Parcel zza10 = zzcaVar4.zza();
                                            int i122 = zzc.$r8$clinit;
                                            zza10.writeInt(booleanValue4 ? 1 : 0);
                                            zzcaVar4.zzc(zza10, 3);
                                        } catch (RemoteException e10) {
                                            throw new RuntimeRemoteException((Throwable) e10);
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    boolean booleanValue5 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings4 = googleMap2.getUiSettings();
                                        uiSettings4.getClass();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        zzca zzcaVar5 = (zzca) uiSettings4.zza;
                                        Parcel zza11 = zzcaVar5.zza();
                                        int i132 = zzc.$r8$clinit;
                                        zza11.writeInt(booleanValue5 ? 1 : 0);
                                        zzcaVar5.zzc(zza11, 7);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e11) {
                                        throw new RuntimeRemoteException((Throwable) e11);
                                    }
                                case 12:
                                    boolean booleanValue6 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings5 = googleMap2.getUiSettings();
                                        uiSettings5.getClass();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        zzca zzcaVar6 = (zzca) uiSettings5.zza;
                                        Parcel zza12 = zzcaVar6.zza();
                                        int i142 = zzc.$r8$clinit;
                                        zza12.writeInt(booleanValue6 ? 1 : 0);
                                        zzcaVar6.zzc(zza12, 4);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e12) {
                                        throw new RuntimeRemoteException((Throwable) e12);
                                    }
                                case 13:
                                    boolean booleanValue7 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings8 = googleMap2.getUiSettings();
                                        uiSettings8.getClass();
                                        try {
                                            zzca zzcaVar7 = (zzca) uiSettings8.zza;
                                            Parcel zza13 = zzcaVar7.zza();
                                            int i152 = zzc.$r8$clinit;
                                            zza13.writeInt(booleanValue7 ? 1 : 0);
                                            zzcaVar7.zzc(zza13, 20);
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException((Throwable) e13);
                                        }
                                    } catch (Exception unused7) {
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    boolean booleanValue8 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings9 = googleMap2.getUiSettings();
                                        uiSettings9.getClass();
                                        try {
                                            zzca zzcaVar8 = (zzca) uiSettings9.zza;
                                            Parcel zza14 = zzcaVar8.zza();
                                            int i162 = zzc.$r8$clinit;
                                            zza14.writeInt(booleanValue8 ? 1 : 0);
                                            zzcaVar8.zzc(zza14, 6);
                                        } catch (RemoteException e14) {
                                            throw new RuntimeRemoteException((Throwable) e14);
                                        }
                                    } catch (Exception unused8) {
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    boolean booleanValue9 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings10 = googleMap2.getUiSettings();
                                        uiSettings10.getClass();
                                        try {
                                            zzca zzcaVar9 = (zzca) uiSettings10.zza;
                                            Parcel zza15 = zzcaVar9.zza();
                                            int i172 = zzc.$r8$clinit;
                                            zza15.writeInt(booleanValue9 ? 1 : 0);
                                            zzcaVar9.zzc(zza15, 1);
                                        } catch (RemoteException e15) {
                                            throw new RuntimeRemoteException((Throwable) e15);
                                        }
                                    } catch (Exception unused9) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    boolean booleanValue10 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings6 = googleMap2.getUiSettings();
                                        uiSettings6.getClass();
                                    } catch (Exception unused10) {
                                    }
                                    try {
                                        zzca zzcaVar10 = (zzca) uiSettings6.zza;
                                        Parcel zza16 = zzcaVar10.zza();
                                        int i182 = zzc.$r8$clinit;
                                        zza16.writeInt(booleanValue10 ? 1 : 0);
                                        zzcaVar10.zzc(zza16, 5);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e16) {
                                        throw new RuntimeRemoteException((Throwable) e16);
                                    }
                                case 17:
                                    MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj7;
                                    if (obj8 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    mapPropertiesNode2.getClass();
                                    zzg zzgVar7 = googleMap2.zza;
                                    try {
                                        Parcel zza17 = zzgVar7.zza();
                                        zzc.zzg(zza17, null);
                                        zzgVar7.zzc(zza17, 24);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e17) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e17);
                                        return null;
                                    }
                                case 18:
                                    boolean booleanValue11 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar8 = googleMap2.zza;
                                        Parcel zza18 = zzgVar8.zza();
                                        int i192 = zzc.$r8$clinit;
                                        zza18.writeInt(booleanValue11 ? 1 : 0);
                                        zzgVar8.zzc(zza18, 41);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e18) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e18);
                                        return null;
                                    }
                                case 19:
                                    boolean booleanValue12 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar9 = googleMap2.zza;
                                        Parcel zza19 = zzgVar9.zza();
                                        int i202 = zzc.$r8$clinit;
                                        zza19.writeInt(booleanValue12 ? 1 : 0);
                                        Parcel zzJ2 = zzgVar9.zzJ(zza19, 20);
                                        zzJ2.readInt();
                                        zzJ2.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e19) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e19);
                                        return null;
                                    }
                                case 20:
                                    boolean booleanValue13 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar10 = googleMap2.zza;
                                        Parcel zza20 = zzgVar10.zza();
                                        int i212 = zzc.$r8$clinit;
                                        zza20.writeInt(booleanValue13 ? 1 : 0);
                                        zzgVar10.zzc(zza20, 22);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e20) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e20);
                                        return null;
                                    }
                                default:
                                    boolean booleanValue14 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar11 = googleMap2.zza;
                                        Parcel zza21 = zzgVar11.zza();
                                        int i222 = zzc.$r8$clinit;
                                        zza21.writeInt(booleanValue14 ? 1 : 0);
                                        zzgVar11.zzc(zza21, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e21) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e21);
                                        return null;
                                    }
                            }
                        }
                    });
                    final int i24 = 16;
                    Updater.m576setimpl(gapComposer, Boolean.valueOf(mapUpdaterState.getMapUiSettings().zoomGesturesEnabled), new Function2() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            zzb uiSettings;
                            zzb uiSettings2;
                            zzb uiSettings3;
                            zzb uiSettings4;
                            zzb uiSettings5;
                            zzb uiSettings6;
                            int i72 = i24;
                            GoogleMap googleMap2 = googleMap;
                            switch (i72) {
                                case 0:
                                    MapPropertiesNode mapPropertiesNode = (MapPropertiesNode) obj7;
                                    PaddingValues paddingValues2 = (PaddingValues) obj8;
                                    mapPropertiesNode.getClass();
                                    paddingValues2.getClass();
                                    MapUpdaterKt.access$applyContentPadding(mapPropertiesNode, googleMap2, paddingValues2);
                                    return Unit.INSTANCE;
                                case 1:
                                    LatLngBounds latLngBounds = (LatLngBounds) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar = googleMap2.zza;
                                        Parcel zza = zzgVar.zza();
                                        zzc.zze(zza, latLngBounds);
                                        zzgVar.zzc(zza, 95);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e);
                                        return null;
                                    }
                                case 2:
                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar2 = googleMap2.zza;
                                        Parcel zza2 = zzgVar2.zza();
                                        zzc.zze(zza2, mapStyleOptions);
                                        Parcel zzJ = zzgVar2.zzJ(zza2, 91);
                                        zzJ.readInt();
                                        zzJ.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e2) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e2);
                                        return null;
                                    }
                                case 3:
                                    MapType mapType = (MapType) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    mapType.getClass();
                                    int i82 = mapType.value;
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar3 = googleMap2.zza;
                                        Parcel zza3 = zzgVar3.zza();
                                        zza3.writeInt(i82);
                                        zzgVar3.zzc(zza3, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e3) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e3);
                                        return null;
                                    }
                                case 4:
                                    float floatValue = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar4 = googleMap2.zza;
                                        Parcel zza4 = zzgVar4.zza();
                                        zza4.writeFloat(floatValue);
                                        zzgVar4.zzc(zza4, 93);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e4) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e4);
                                        return null;
                                    }
                                case 5:
                                    float floatValue2 = ((Number) obj8).floatValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar5 = googleMap2.zza;
                                        Parcel zza5 = zzgVar5.zza();
                                        zza5.writeFloat(floatValue2);
                                        zzgVar5.zzc(zza5, 92);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e5) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e5);
                                        return null;
                                    }
                                case 6:
                                    Integer num = (Integer) obj8;
                                    ((MapPropertiesNode) obj7).getClass();
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        googleMap2.getClass();
                                        try {
                                            zzg zzgVar6 = googleMap2.zza;
                                            Parcel zza6 = zzgVar6.zza();
                                            zza6.writeInt(intValue2);
                                            zzgVar6.zzc(zza6, 113);
                                        } catch (RemoteException e6) {
                                            TransportImpl$$ExternalSyntheticLambda0.m(e6);
                                            return null;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                case 7:
                                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings = googleMap2.getUiSettings();
                                        uiSettings.getClass();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        zzca zzcaVar = (zzca) uiSettings.zza;
                                        Parcel zza7 = zzcaVar.zza();
                                        int i92 = zzc.$r8$clinit;
                                        zza7.writeInt(booleanValue ? 1 : 0);
                                        zzcaVar.zzc(zza7, 2);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e7) {
                                        throw new RuntimeRemoteException((Throwable) e7);
                                    }
                                case 8:
                                    boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings2 = googleMap2.getUiSettings();
                                        uiSettings2.getClass();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        zzca zzcaVar2 = (zzca) uiSettings2.zza;
                                        Parcel zza8 = zzcaVar2.zza();
                                        int i102 = zzc.$r8$clinit;
                                        zza8.writeInt(booleanValue2 ? 1 : 0);
                                        zzcaVar2.zzc(zza8, 16);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e8) {
                                        throw new RuntimeRemoteException((Throwable) e8);
                                    }
                                case 9:
                                    boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings3 = googleMap2.getUiSettings();
                                        uiSettings3.getClass();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        zzca zzcaVar3 = (zzca) uiSettings3.zza;
                                        Parcel zza9 = zzcaVar3.zza();
                                        int i112 = zzc.$r8$clinit;
                                        zza9.writeInt(booleanValue3 ? 1 : 0);
                                        zzcaVar3.zzc(zza9, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e9) {
                                        throw new RuntimeRemoteException((Throwable) e9);
                                    }
                                case 10:
                                    boolean booleanValue4 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings7 = googleMap2.getUiSettings();
                                        uiSettings7.getClass();
                                        try {
                                            zzca zzcaVar4 = (zzca) uiSettings7.zza;
                                            Parcel zza10 = zzcaVar4.zza();
                                            int i122 = zzc.$r8$clinit;
                                            zza10.writeInt(booleanValue4 ? 1 : 0);
                                            zzcaVar4.zzc(zza10, 3);
                                        } catch (RemoteException e10) {
                                            throw new RuntimeRemoteException((Throwable) e10);
                                        }
                                    } catch (Exception unused4) {
                                    }
                                    return Unit.INSTANCE;
                                case 11:
                                    boolean booleanValue5 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings4 = googleMap2.getUiSettings();
                                        uiSettings4.getClass();
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        zzca zzcaVar5 = (zzca) uiSettings4.zza;
                                        Parcel zza11 = zzcaVar5.zza();
                                        int i132 = zzc.$r8$clinit;
                                        zza11.writeInt(booleanValue5 ? 1 : 0);
                                        zzcaVar5.zzc(zza11, 7);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e11) {
                                        throw new RuntimeRemoteException((Throwable) e11);
                                    }
                                case 12:
                                    boolean booleanValue6 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings5 = googleMap2.getUiSettings();
                                        uiSettings5.getClass();
                                    } catch (Exception unused6) {
                                    }
                                    try {
                                        zzca zzcaVar6 = (zzca) uiSettings5.zza;
                                        Parcel zza12 = zzcaVar6.zza();
                                        int i142 = zzc.$r8$clinit;
                                        zza12.writeInt(booleanValue6 ? 1 : 0);
                                        zzcaVar6.zzc(zza12, 4);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e12) {
                                        throw new RuntimeRemoteException((Throwable) e12);
                                    }
                                case 13:
                                    boolean booleanValue7 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings8 = googleMap2.getUiSettings();
                                        uiSettings8.getClass();
                                        try {
                                            zzca zzcaVar7 = (zzca) uiSettings8.zza;
                                            Parcel zza13 = zzcaVar7.zza();
                                            int i152 = zzc.$r8$clinit;
                                            zza13.writeInt(booleanValue7 ? 1 : 0);
                                            zzcaVar7.zzc(zza13, 20);
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException((Throwable) e13);
                                        }
                                    } catch (Exception unused7) {
                                    }
                                    return Unit.INSTANCE;
                                case 14:
                                    boolean booleanValue8 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings9 = googleMap2.getUiSettings();
                                        uiSettings9.getClass();
                                        try {
                                            zzca zzcaVar8 = (zzca) uiSettings9.zza;
                                            Parcel zza14 = zzcaVar8.zza();
                                            int i162 = zzc.$r8$clinit;
                                            zza14.writeInt(booleanValue8 ? 1 : 0);
                                            zzcaVar8.zzc(zza14, 6);
                                        } catch (RemoteException e14) {
                                            throw new RuntimeRemoteException((Throwable) e14);
                                        }
                                    } catch (Exception unused8) {
                                    }
                                    return Unit.INSTANCE;
                                case 15:
                                    boolean booleanValue9 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        zzb uiSettings10 = googleMap2.getUiSettings();
                                        uiSettings10.getClass();
                                        try {
                                            zzca zzcaVar9 = (zzca) uiSettings10.zza;
                                            Parcel zza15 = zzcaVar9.zza();
                                            int i172 = zzc.$r8$clinit;
                                            zza15.writeInt(booleanValue9 ? 1 : 0);
                                            zzcaVar9.zzc(zza15, 1);
                                        } catch (RemoteException e15) {
                                            throw new RuntimeRemoteException((Throwable) e15);
                                        }
                                    } catch (Exception unused9) {
                                    }
                                    return Unit.INSTANCE;
                                case 16:
                                    boolean booleanValue10 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    try {
                                        uiSettings6 = googleMap2.getUiSettings();
                                        uiSettings6.getClass();
                                    } catch (Exception unused10) {
                                    }
                                    try {
                                        zzca zzcaVar10 = (zzca) uiSettings6.zza;
                                        Parcel zza16 = zzcaVar10.zza();
                                        int i182 = zzc.$r8$clinit;
                                        zza16.writeInt(booleanValue10 ? 1 : 0);
                                        zzcaVar10.zzc(zza16, 5);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e16) {
                                        throw new RuntimeRemoteException((Throwable) e16);
                                    }
                                case 17:
                                    MapPropertiesNode mapPropertiesNode2 = (MapPropertiesNode) obj7;
                                    if (obj8 != null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    mapPropertiesNode2.getClass();
                                    zzg zzgVar7 = googleMap2.zza;
                                    try {
                                        Parcel zza17 = zzgVar7.zza();
                                        zzc.zzg(zza17, null);
                                        zzgVar7.zzc(zza17, 24);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e17) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e17);
                                        return null;
                                    }
                                case 18:
                                    boolean booleanValue11 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar8 = googleMap2.zza;
                                        Parcel zza18 = zzgVar8.zza();
                                        int i192 = zzc.$r8$clinit;
                                        zza18.writeInt(booleanValue11 ? 1 : 0);
                                        zzgVar8.zzc(zza18, 41);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e18) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e18);
                                        return null;
                                    }
                                case 19:
                                    boolean booleanValue12 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar9 = googleMap2.zza;
                                        Parcel zza19 = zzgVar9.zza();
                                        int i202 = zzc.$r8$clinit;
                                        zza19.writeInt(booleanValue12 ? 1 : 0);
                                        Parcel zzJ2 = zzgVar9.zzJ(zza19, 20);
                                        zzJ2.readInt();
                                        zzJ2.recycle();
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e19) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e19);
                                        return null;
                                    }
                                case 20:
                                    boolean booleanValue13 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar10 = googleMap2.zza;
                                        Parcel zza20 = zzgVar10.zza();
                                        int i212 = zzc.$r8$clinit;
                                        zza20.writeInt(booleanValue13 ? 1 : 0);
                                        zzgVar10.zzc(zza20, 22);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e20) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e20);
                                        return null;
                                    }
                                default:
                                    boolean booleanValue14 = ((Boolean) obj8).booleanValue();
                                    ((MapPropertiesNode) obj7).getClass();
                                    googleMap2.getClass();
                                    try {
                                        zzg zzgVar11 = googleMap2.zza;
                                        Parcel zza21 = zzgVar11.zza();
                                        int i222 = zzc.$r8$clinit;
                                        zza21.writeInt(booleanValue14 ? 1 : 0);
                                        zzgVar11.zzc(zza21, 18);
                                        return Unit.INSTANCE;
                                    } catch (RemoteException e21) {
                                        TransportImpl$$ExternalSyntheticLambda0.m(e21);
                                        return null;
                                    }
                            }
                        }
                    });
                    Updater.m577updateimpl(gapComposer, (CameraPositionState) parcelableSnapshotMutableState.getValue(), MapUpdaterKt$MapUpdater$1$2$1.INSTANCE$1);
                    gapComposer.end(true);
                    gapComposer.end(false);
                    UtilsKt.MapClickListenerUpdater(gapComposer, 0);
                    Updater.CompositionLocalProvider(CameraPositionStateKt.LocalCameraPositionState.defaultProvidedValue$runtime((CameraPositionState) parcelableSnapshotMutableState.getValue()), function2, gapComposer, 8);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                UtilsKt.MapClickListenerComposeNode((MutablePropertyReference0Impl) obj5, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                ClusteringKt.m2060ClusteringMarkerPropertiesMDSh_HA((Offset) obj5, (Float) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                PatternStampState patternStampState = (PatternStampState) obj5;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = patternStampState.stamps$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = patternStampState.canvasSize$delegate;
                StampMovingListener stampMovingListener = (StampMovingListener) obj4;
                int intValue2 = ((Integer) obj2).intValue();
                long j = ((Offset) obj).packedValue;
                for (TransformedStamp transformedStamp : patternStampState.getMovingStamps()) {
                    PickVisualMediaRequestKt.snapBackToAllowedSize(transformedStamp, new Rect(0, 0, (int) (((IntSize) parcelableSnapshotMutableState3.getValue()).packedValue >> 32), (int) (((IntSize) parcelableSnapshotMutableState3.getValue()).packedValue & BodyPartID.bodyIdMax)), patternStampState.boxHeight$delegate.getIntValue(), false, new xg$$ExternalSyntheticLambda9(patternStampState, 23));
                    if (((RectF) patternStampState.stampSaveArea$delegate.getValue()).contains(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax))) || intValue2 != 1) {
                        parcelableSnapshotMutableState2.setValue(CollectionsKt.plus((Collection) patternStampState.getStamps$customizations(), (Object) transformedStamp));
                        SnapshotStateList snapshotStateList = patternStampState.fadingStamps;
                        AndroidPaint Paint = ColorKt.Paint();
                        Paint.setAntiAlias();
                        Paint.m663setStylek9PVt8s(1);
                        Paint.m662setStrokeJoinWw9F2mQ(1);
                        Paint.m661setStrokeCapBeK7IIE(1);
                        Paint.m659setColor8_81llA(((Color) patternStampState.offClipStrokeColor$delegate.getValue()).value);
                        Paint.setStrokeWidth(((Number) patternStampState.strokeWidth$delegate.getValue()).floatValue());
                        snapshotStateList.add(new FadingStamp(transformedStamp, Paint));
                    } else {
                        parcelableSnapshotMutableState2.setValue(CollectionsKt.minus(patternStampState.getStamps$customizations(), transformedStamp));
                    }
                }
                patternStampState.customizationDeque.push(patternStampState.getStamps$customizations());
                patternStampState.trashBinDirectionResolved = false;
                if (!patternStampState.getMovingStamps().isEmpty()) {
                    patternStampState.onStampsChanged.invoke();
                }
                EmptyList emptyList = EmptyList.INSTANCE;
                emptyList.getClass();
                patternStampState.movingStamps$delegate.setValue(emptyList);
                if (stampMovingListener != null) {
                    stampMovingListener.onStampStopMoving();
                }
                return Unit.INSTANCE;
            case 8:
                StampState stampState = (StampState) obj5;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = stampState.canvasSize$delegate;
                StampMovingListener stampMovingListener2 = (StampMovingListener) obj4;
                int intValue3 = ((Integer) obj2).intValue();
                long j2 = ((Offset) obj).packedValue;
                ArrayDeque arrayDeque = stampState.customizationDeque;
                TransformedStamp movingStamp = stampState.getMovingStamp();
                if (movingStamp != null) {
                    Rect rect = new Rect(0, 0, (int) (((IntSize) parcelableSnapshotMutableState4.getValue()).packedValue >> 32), (int) (((IntSize) parcelableSnapshotMutableState4.getValue()).packedValue & BodyPartID.bodyIdMax));
                    PickVisualMediaRequestKt.snapBackToAllowedSize(movingStamp, rect, rect.height(), true, new xg$$ExternalSyntheticLambda9(stampState, 24));
                    if (((RectF) stampState.stampSaveArea$delegate.getValue()).contains(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax))) || intValue3 != 1) {
                        plus = CollectionsKt.plus((Collection) stampState.getStamps$customizations(), (Object) movingStamp);
                        arrayDeque.push(plus);
                    } else {
                        plus = CollectionsKt.minus(stampState.getStamps$customizations(), movingStamp);
                        arrayDeque.push(plus);
                    }
                    stampState.stamps$delegate.setValue(plus);
                    SnapshotStateList snapshotStateList2 = stampState.fadingStamps;
                    AndroidPaint Paint2 = ColorKt.Paint();
                    Paint2.setAntiAlias();
                    Paint2.m663setStylek9PVt8s(1);
                    Paint2.m662setStrokeJoinWw9F2mQ(1);
                    Paint2.m661setStrokeCapBeK7IIE(1);
                    Paint2.m659setColor8_81llA(((Color) stampState.offClipStrokeColor$delegate.getValue()).value);
                    Paint2.setStrokeWidth(((Number) stampState.strokeWidth$delegate.getValue()).floatValue());
                    snapshotStateList2.add(new FadingStamp(movingStamp, Paint2));
                }
                stampState.trashBinDirectionResolved = false;
                if (stampState.getMovingStamp() != null) {
                    stampState.onStampsChanged.invoke();
                }
                stampState.movingStamp$delegate.setValue(null);
                if (stampMovingListener2 != null) {
                    stampMovingListener2.onStampStopMoving();
                }
                return Unit.INSTANCE;
            case 9:
                AccountDocumentsDownloaderViewModel accountDocumentsDownloaderViewModel = (AccountDocumentsDownloaderViewModel) obj5;
                Function1 function1 = (Function1) obj4;
                Composer composer2 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ModalKt.Modal(Modifier.Companion.$$INSTANCE, AccountToDoKt.lambda$1757263940, Expect_jvmKt.rememberComposableLambda(377478627, new AccountDocumentDownloaderDialogViewKt$$ExternalSyntheticLambda2(accountDocumentsDownloaderViewModel, false ? 1 : 0), gapComposer2), Expect_jvmKt.rememberComposableLambda(1777680527, new BrandSheetViewKt$$ExternalSyntheticLambda1(9, (Object) accountDocumentsDownloaderViewModel, function1), gapComposer2), (Function3) null, AccountToDoKt.lambda$533089984, gapComposer2, 200112, 16);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                AccountDocumentsDownloadOptionsViewModel accountDocumentsDownloadOptionsViewModel = (AccountDocumentsDownloadOptionsViewModel) obj5;
                Function1 function12 = (Function1) obj4;
                Composer composer3 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
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
                    String str = accountDocumentsDownloadOptionsViewModel.title;
                    if (str == null) {
                        str = "";
                    }
                    Transformations.SheetHeader(str, (Modifier) null, (Function2) null, accountDocumentsDownloadOptionsViewModel.description, gapComposer3, 0, 6);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1644886330, new BrandSheetViewKt$$ExternalSyntheticLambda6(9, function12), gapComposer3), gapComposer3, 24576, 15);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                AccountDocumentsViewModel accountDocumentsViewModel = (AccountDocumentsViewModel) obj5;
                Function1 function13 = (Function1) obj4;
                Composer composer4 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
                    Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 0);
                    int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, navigationBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(modifier, 1.0f);
                    String str2 = accountDocumentsViewModel.title;
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed2 = gapComposer4.changed(function13);
                    Object rememberedValue2 = gapComposer4.rememberedValue();
                    if (changed2 || rememberedValue2 == obj3) {
                        rememberedValue2 = new TabContentViewKt$$ExternalSyntheticLambda6(6, function13);
                        gapComposer4.updateRememberedValue(rememberedValue2);
                    }
                    DBUtil.TitleBarSub(str2, navigationType, fillMaxWidth2, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, (Function3) null, gapComposer4, 432, 104);
                    boolean z = accountDocumentsViewModel.isLoading;
                    Object rememberedValue3 = gapComposer4.rememberedValue();
                    if (rememberedValue3 == obj3) {
                        rememberedValue3 = new MarkerKt$$ExternalSyntheticLambda2(19);
                        gapComposer4.updateRememberedValue(rememberedValue3);
                    }
                    Strings.LoadableFullScreenContent(accountDocumentsViewModel, z, null, (Function1) rememberedValue3, null, Expect_jvmKt.rememberComposableLambda(2003890969, new LocalViewFactory$$ExternalSyntheticLambda4(13, function13, accountDocumentsViewModel), gapComposer4), gapComposer4, 199680, 20);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                AccountToDoKt.NoDocument((AccountDocumentsViewModel) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                AccountCardViewModel accountCardViewModel = (AccountCardViewModel) obj5;
                Function1 function14 = (Function1) obj4;
                Composer composer5 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    AccountAvatarViewModel accountAvatarViewModel = accountCardViewModel.avatar;
                    boolean changed3 = gapComposer5.changed(function14);
                    Object rememberedValue4 = gapComposer5.rememberedValue();
                    if (changed3 || rememberedValue4 == obj3) {
                        rememberedValue4 = new TabContentViewKt$$ExternalSyntheticLambda6(14, function14);
                        gapComposer5.updateRememberedValue(rememberedValue4);
                    }
                    AccountToDoKt.AccountAvatar(accountAvatarViewModel, (Function0) rememberedValue4, null, null, null, false, false, gapComposer5, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                AccountToDoKt.ProfileQrAvatar((AccountAvatarViewModel) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                Icons icons = (Icons) obj5;
                PreviewTrustIndicator previewTrustIndicator = (PreviewTrustIndicator) obj4;
                Composer composer6 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    String str3 = previewTrustIndicator.arcadeIconId;
                    zzd zzdVar = Icons.Companion;
                    if (Intrinsics.areEqual(str3, "KfLRUr")) {
                        gapComposer6.startReplaceGroup(-562129218);
                        ((DefaultSizes) gapComposer6.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        modifier = SizeKt.m285size3ABfNKs(modifier, 16.0f);
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(-562028251);
                        gapComposer6.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, modifier, 0L, gapComposer6, 48, 8);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                ThemeSwitcherViewModel themeSwitcherViewModel = (ThemeSwitcherViewModel) obj5;
                Function1 function15 = (Function1) obj4;
                Composer composer7 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                int i25 = ThemeSwitcherView.$r8$clinit;
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Strings.LoadableFullScreenContent(themeSwitcherViewModel, themeSwitcherViewModel instanceof ThemeSwitcherViewModel.Loading, null, new OffersHomeQueries$$ExternalSyntheticLambda1(7), null, Expect_jvmKt.rememberComposableLambda(-1797101728, new SetPinViewKt$$ExternalSyntheticLambda4(i5, function15), gapComposer7), gapComposer7, 196608, 20);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                ThemeData themeData = (ThemeData) obj5;
                MainPaymentPadViewModel mainPaymentPadViewModel = (MainPaymentPadViewModel) obj4;
                Composer composer8 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                int i26 = 1;
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    String str4 = themeData.buttonText;
                    mainPaymentPadViewModel.getClass();
                    Object rememberedValue5 = gapComposer8.rememberedValue();
                    if (rememberedValue5 == obj3) {
                        rememberedValue5 = new ActivityTabViewKt$$ExternalSyntheticLambda17(i26);
                        gapComposer8.updateRememberedValue(rememberedValue5);
                    }
                    ThemeSwitcherViewKt.ThemeSelection(Modifier.Companion.$$INSTANCE, str4, mainPaymentPadViewModel, (Function1) rememberedValue5, gapComposer8, 3078);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                AddAccountOptionsViewModel addAccountOptionsViewModel = (AddAccountOptionsViewModel) obj5;
                Function1 function16 = (Function1) obj4;
                Composer composer9 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                int i27 = AddAccountOptionsView.$r8$clinit;
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    BadgeTitleKt.AddAccountOptions(addAccountOptionsViewModel, function16, null, gapComposer9, 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                BusinessInfoViewModel.ConfirmationSheetViewModel confirmationSheetViewModel = (BusinessInfoViewModel.ConfirmationSheetViewModel) obj5;
                Function1 function17 = (Function1) obj4;
                Composer composer10 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(modifier, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 3);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer10, 48);
                    int hashCode3 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer10.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer10, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer10.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer10.startReusableNode();
                    if (gapComposer10.inserting) {
                        gapComposer10.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer10.useNode();
                    }
                    Updater.m576setimpl(gapComposer10, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer10, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer10, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer10, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer10, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 48, 0, 4080, MooncakeTheme.getColors(gapComposer10).label, (Composer) gapComposer10, SpacerKt.m299paddingVpY3zN4(modifier, 16.0f, 30.0f), MooncakeTheme.getTypography(gapComposer10).mainTitle, (TextLineBalancing) null, confirmationSheetViewModel.businessAddress, (Map) null, (Function1) null, false);
                    KeypadKt.m3642DivideraMcp0Q(null, 0L, RecyclerView.DECELERATION_RATE, gapComposer10, 0, 7);
                    String stringResource = Room.stringResource(gapComposer10, R.string.business_info_confirm_replace_address);
                    boolean changed4 = gapComposer10.changed(function17) | gapComposer10.changedInstance(confirmationSheetViewModel);
                    Object rememberedValue6 = gapComposer10.rememberedValue();
                    if (changed4 || rememberedValue6 == obj3) {
                        rememberedValue6 = new BalanceFeedKt$$ExternalSyntheticLambda5(7, function17, confirmationSheetViewModel);
                        gapComposer10.updateRememberedValue(rememberedValue6);
                    }
                    ParseSvg_androidKt.ConfirmationButton(null, stringResource, null, (Function0) rememberedValue6, gapComposer10, 0, 5);
                    KeypadKt.m3642DivideraMcp0Q(null, 0L, RecyclerView.DECELERATION_RATE, gapComposer10, 0, 7);
                    String stringResource2 = Room.stringResource(gapComposer10, R.string.business_info_confirm_dismiss);
                    TextStyle textStyle = MooncakeTheme.getTypography(gapComposer10).mainTitle;
                    boolean changed5 = gapComposer10.changed(function17);
                    Object rememberedValue7 = gapComposer10.rememberedValue();
                    if (changed5 || rememberedValue7 == obj3) {
                        rememberedValue7 = new AccountToDoKt$$ExternalSyntheticLambda0(26, function17);
                        gapComposer10.updateRememberedValue(rememberedValue7);
                    }
                    ParseSvg_androidKt.ConfirmationButton(null, stringResource2, textStyle, (Function0) rememberedValue7, gapComposer10, 0, 1);
                    gapComposer10.end(true);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Function1 function18 = (Function1) obj5;
                BusinessInfoViewModel businessInfoViewModel = (BusinessInfoViewModel) obj4;
                Composer composer11 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(SpacerKt.systemBarsPadding(modifier), 1.0f);
                    Colors colors3 = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                    } else {
                        gapComposer11.startReplaceGroup(-1762997739);
                        gapComposer11.end(false);
                    }
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors3.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer11, 0);
                    int hashCode4 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer11.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer11, m177backgroundbw27NRU2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer11.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer11.startReusableNode();
                    if (gapComposer11.inserting) {
                        gapComposer11.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer11.useNode();
                    }
                    Updater.m576setimpl(gapComposer11, columnMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer11, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer11, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer11, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer11, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    String stringResource3 = Room.stringResource(gapComposer11, R.string.business_info_title);
                    NavigationType navigationType2 = NavigationType.BACK;
                    boolean changed6 = gapComposer11.changed(function18);
                    Object rememberedValue8 = gapComposer11.rememberedValue();
                    if (changed6 || rememberedValue8 == obj3) {
                        rememberedValue8 = new AccountToDoKt$$ExternalSyntheticLambda0(28, function18);
                        gapComposer11.updateRememberedValue(rememberedValue8);
                    }
                    DBUtil.TitleBarSub(stringResource3, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue8, (Modifier) null, (Function3) null, gapComposer11, 48, 108);
                    if (businessInfoViewModel.showTaxInfo) {
                        gapComposer11.startReplaceGroup(1578540385);
                        LocaleOverlayHelper.BusinessInfoHeader(0, gapComposer11, null, Room.stringResource(gapComposer11, R.string.business_info_tax_info_header));
                        String stringResource4 = Room.stringResource(gapComposer11, R.string.business_info_tax_info_row);
                        boolean changed7 = gapComposer11.changed(function18);
                        Object rememberedValue9 = gapComposer11.rememberedValue();
                        if (changed7 || rememberedValue9 == obj3) {
                            rememberedValue9 = new AccountToDoKt$$ExternalSyntheticLambda0(29, function18);
                            gapComposer11.updateRememberedValue(rememberedValue9);
                        }
                        AccountToDoKt.AccountSectionRowNoIcon(6, 29, gapComposer11, null, stringResource4, null, (Function0) rememberedValue9);
                        gapComposer11.end(false);
                    } else {
                        gapComposer11.startReplaceGroup(1578860398);
                        gapComposer11.end(false);
                    }
                    String str5 = businessInfoViewModel.businessAddress;
                    if (str5 == null) {
                        gapComposer11.startReplaceGroup(1578894280);
                        gapComposer11.end(false);
                    } else {
                        gapComposer11.startReplaceGroup(1578894281);
                        LocaleOverlayHelper.BusinessAddressSection(str5, function18, gapComposer11, 6);
                        gapComposer11.end(false);
                    }
                    if (businessInfoViewModel.showDowngradeToPersonal) {
                        gapComposer11.startReplaceGroup(1579046305);
                        LocaleOverlayHelper.BusinessInfoHeader(0, gapComposer11, null, Room.stringResource(gapComposer11, R.string.business_info_account_type_header));
                        String stringResource5 = Room.stringResource(gapComposer11, R.string.edit_profile_personal_profile_title);
                        boolean changed8 = gapComposer11.changed(function18);
                        Object rememberedValue10 = gapComposer11.rememberedValue();
                        if (changed8 || rememberedValue10 == obj3) {
                            rememberedValue10 = new UtilsKt$$ExternalSyntheticLambda1(i2, function18);
                            gapComposer11.updateRememberedValue(rememberedValue10);
                        }
                        AccountToDoKt.SwitchBusinessProfile(390, gapComposer11, null, stringResource5, (Function1) rememberedValue10);
                        gapComposer11.end(false);
                    } else {
                        gapComposer11.startReplaceGroup(1579427822);
                        gapComposer11.end(false);
                    }
                    gapComposer11.end(true);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                ActivityTabViewKt.NewUserExperience((ActivityFeedEntry.NewUserExperience) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                AvatarsKt.InfoSheet((Modifier) obj5, (BalanceFeedViewModel.InfoSheet) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                ((EmbeddedHeaderScope) obj5).CompactHeader((Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                Function2 function22 = (Function2) obj5;
                State state = (State) obj4;
                Composer composer12 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode5 = Long.hashCode(gapComposer12.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer12.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer12, modifier);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer12.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer12.startReusableNode();
                    if (gapComposer12.inserting) {
                        gapComposer12.createNode(layoutNode$Companion$Constructor$15);
                    } else {
                        gapComposer12.useNode();
                    }
                    Updater.m576setimpl(gapComposer12, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer12, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer12, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer12, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer12, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    function22.invoke(gapComposer12, 0);
                    ModalKt.HorizontalDivider(0, 0, gapComposer12, AlphaKt.alpha(modifier, ((Number) state.getValue()).floatValue()));
                    gapComposer12.end(true);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                ReceiptTimelineKt.TimelineDetailsOverlayContent((Modifier) obj5, (ReceiptSection.TimelineEntry.EventDetailsOverlay) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                ReceiptTimelineKt.Timeline((Timeline) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                ReceiptUiKt.Section((ReceiptSection) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                ReceiptUiKt.ReceiptButtonCta((PaymentHistoryButton) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ReceiptUiKt.TextBlock((ReceiptSection.TextBlock) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MenuPickerSheetKt$$ExternalSyntheticLambda4(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ MenuPickerSheetKt$$ExternalSyntheticLambda4(AccountDocumentsDownloadOptionsViewModel accountDocumentsDownloadOptionsViewModel, Function1 function1) {
        this.$r8$classId = 10;
        this.f$0 = accountDocumentsDownloadOptionsViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ MenuPickerSheetKt$$ExternalSyntheticLambda4(AccountDocumentsDownloaderViewModel accountDocumentsDownloaderViewModel, Function1 function1) {
        this.$r8$classId = 9;
        this.f$0 = accountDocumentsDownloaderViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ MenuPickerSheetKt$$ExternalSyntheticLambda4(AccountDocumentsViewModel accountDocumentsViewModel, Function1 function1) {
        this.$r8$classId = 11;
        this.f$0 = accountDocumentsViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ MenuPickerSheetKt$$ExternalSyntheticLambda4(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ MenuPickerSheetKt$$ExternalSyntheticLambda4(Function1 function1, BusinessInfoViewModel businessInfoViewModel) {
        this.$r8$classId = 20;
        this.f$0 = function1;
        this.f$1 = businessInfoViewModel;
    }
}
