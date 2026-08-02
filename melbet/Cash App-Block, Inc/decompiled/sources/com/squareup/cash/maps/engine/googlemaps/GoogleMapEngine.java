package com.squareup.cash.maps.engine.googlemaps;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.ComposeMapColorScheme;
import com.google.maps.android.compose.GoogleMapKt;
import com.google.maps.android.compose.MapEffectKt;
import com.google.maps.android.compose.MapProperties;
import com.google.maps.android.compose.MapUiSettings;
import com.google.maps.android.compose.MarkerKt;
import com.google.maps.android.compose.clustering.ClusteringKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.maps.presenter.CashMapPresenter$models$3$1;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import com.squareup.cash.maps.viewmodels.LocationSelection;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.cash.maps.viewmodels.SearchLocation;
import com.squareup.cash.maps.views.CashClusterItem;
import com.squareup.cash.maps.views.SelectedLocationCameraReframe;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda7;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda9;
import com.squareup.cash.moneybot.widgets.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import com.squareup.util.android.drawable.DrawablesKt;
import com.withpersona.sdk2.camera.feed.CameraFeedKt;
import com.withpersona.sdk2.inquiry.shared.AdapterHelper$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$4;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final class GoogleMapEngine {

    public final class GoogleClusterItemAdapter {
        public final CashClusterItem cashItem;

        public GoogleClusterItemAdapter(CashClusterItem cashClusterItem) {
            cashClusterItem.getClass();
            this.cashItem = cashClusterItem;
        }

        public final LatLng getPosition() {
            CashClusterItem cashClusterItem = this.cashItem;
            return new LatLng(cashClusterItem.getLatitude(), cashClusterItem.getLongitude());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Map(final Modifier modifier, final CashMapViewModel cashMapViewModel, final List list, final boolean z, final Function3 function3, final ComposableLambdaImpl composableLambdaImpl, final Function1 function1, final Function2 function2, final SelectedLocationCameraReframe selectedLocationCameraReframe, final Function3 function32, final Function0 function0, final Function1 function12, Composer composer, final int i) {
        int i2;
        GapComposer gapComposer;
        int i3;
        Context context;
        Density density;
        LatLngBounds latLngBounds;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        int i4;
        Continuation continuation;
        Density density2;
        CashMapViewModel cashMapViewModel2;
        Object obj;
        MutableState mutableState4;
        MutableState mutableState5;
        boolean z2;
        NeverEqualPolicy neverEqualPolicy;
        Object[] objArr;
        CameraPositionState cameraPositionState;
        MutableState mutableState6;
        Object cashMapPresenter$models$3$1;
        LocationViewModel locationViewModel;
        modifier.getClass();
        cashMapViewModel.getClass();
        list.getClass();
        function3.getClass();
        function1.getClass();
        function2.getClass();
        function0.getClass();
        function12.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1184040629);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(cashMapViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(function3) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i & 196608) == 0) {
            i2 |= gapComposer2.changedInstance(composableLambdaImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i & 100663296) == 0) {
            i2 |= (i & 134217728) == 0 ? gapComposer2.changed(selectedLocationCameraReframe) : gapComposer2.changedInstance(selectedLocationCameraReframe) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= gapComposer2.changedInstance(function32) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i5 = 6 | (gapComposer2.changedInstance(function12) ? ' ' : (char) 16) | (gapComposer2.changed(this) ? 256 : 128);
        int i6 = 4;
        if (gapComposer2.shouldExecute(i2 & 1, ((i2 & 302064787) == 302064786 && (i5 & 147) == 146) ? false : true)) {
            Context context2 = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
            Density density3 = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
            boolean isSystemInDarkTheme = ImageKt.isSystemInDarkTheme(gapComposer2);
            boolean changed = gapComposer2.changed(context2) | gapComposer2.changed(isSystemInDarkTheme);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy2) {
                rememberedValue = isSystemInDarkTheme ? MapStyleOptions.loadRawResourceStyle(context2, R.raw.night_mode_style) : null;
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MapStyleOptions mapStyleOptions = (MapStyleOptions) rememberedValue;
            boolean z3 = cashMapViewModel.hasLocationPermission && (Strings.checkSelfPermission(context2, "android.permission.ACCESS_FINE_LOCATION") == 0 || Strings.checkSelfPermission(context2, "android.permission.ACCESS_COARSE_LOCATION") == 0);
            boolean changed2 = gapComposer2.changed(z3);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy2) {
                com.squareup.cash.maps.viewmodels.LatLngBounds latLngBounds2 = cashMapViewModel.cameraBounds;
                if (latLngBounds2 != null) {
                    i3 = i2;
                    context = context2;
                    com.squareup.cash.maps.viewmodels.LatLng latLng = latLngBounds2.southwest;
                    density = density3;
                    LatLng latLng2 = new LatLng(latLng.lat, latLng.lng);
                    com.squareup.cash.maps.viewmodels.LatLng latLng3 = latLngBounds2.northeast;
                    latLngBounds = new LatLngBounds(latLng2, new LatLng(latLng3.lat, latLng3.lng));
                } else {
                    i3 = i2;
                    context = context2;
                    density = density3;
                    latLngBounds = null;
                }
                rememberedValue2 = Updater.mutableStateOf$default(new MapProperties(z3, latLngBounds, mapStyleOptions, 75));
                gapComposer2.updateRememberedValue(rememberedValue2);
            } else {
                i3 = i2;
                context = context2;
                density = density3;
            }
            MutableState mutableState7 = (MutableState) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy2) {
                rememberedValue3 = Updater.mutableStateOf$default(new MapUiSettings(true, (609 & 2) != 0, (609 & 4) != 0, (609 & 8) != 0, (609 & 16) != 0, true, true, (128 & 609) != 0, (609 & 256) != 0, true));
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState8 = (MutableState) rememberedValue3;
            CameraPositionState cameraPositionState2 = (CameraPositionState) SaverKt.m581rememberSaveable(new Object[0], (Saver) CameraPositionState.Saver, (Function0) new ConvertFromJavaKt$$Lambda$4(new TooltipBoxKt$$ExternalSyntheticLambda2(cashMapViewModel, 23), i6), (Composer) gapComposer2, 0);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy2) {
                rememberedValue4 = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState9 = (MutableState) rememberedValue4;
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy2) {
                rememberedValue5 = Updater.mutableStateOf$default(Boolean.TRUE);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState10 = (MutableState) rememberedValue5;
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (rememberedValue6 == neverEqualPolicy2) {
                rememberedValue6 = Updater.mutableStateOf$default(new IntSize(0L));
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            MutableState mutableState11 = (MutableState) rememberedValue6;
            if (((Boolean) mutableState10.getValue()).booleanValue() || !z) {
                mutableState = mutableState7;
                mutableState2 = mutableState9;
                mutableState3 = mutableState8;
                i4 = i3;
                continuation = null;
                density2 = density;
                cashMapViewModel2 = cashMapViewModel;
                gapComposer2.startReplaceGroup(815800055);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(814593039);
                GoogleMap googleMap = (GoogleMap) mutableState9.getValue();
                LocationViewModel locationViewModel2 = cashMapViewModel.locationViewModel;
                boolean changedInstance = gapComposer2.changedInstance(cameraPositionState2) | gapComposer2.changedInstance(cashMapViewModel);
                Object rememberedValue7 = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue7 == neverEqualPolicy2) {
                    mutableState = mutableState7;
                    locationViewModel = locationViewModel2;
                    mutableState3 = mutableState8;
                    i4 = i3;
                    continuation = null;
                    density2 = density;
                    cashMapPresenter$models$3$1 = new CashMapPresenter$models$3$1(7, mutableState9, cameraPositionState2, cashMapViewModel, continuation);
                    gapComposer2.updateRememberedValue(cashMapPresenter$models$3$1);
                } else {
                    mutableState = mutableState7;
                    locationViewModel = locationViewModel2;
                    cashMapPresenter$models$3$1 = rememberedValue7;
                    mutableState3 = mutableState8;
                    i4 = i3;
                    continuation = null;
                    density2 = density;
                }
                Updater.LaunchedEffect(googleMap, locationViewModel, (Function2) cashMapPresenter$models$3$1, gapComposer2);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance2 = gapComposer2.changedInstance(cameraPositionState2) | ((i5 & 112) == 32);
                Object rememberedValue8 = gapComposer2.rememberedValue();
                if (changedInstance2 || rememberedValue8 == neverEqualPolicy2) {
                    cashMapViewModel2 = cashMapViewModel;
                    CashMapPresenter$models$3$1 cashMapPresenter$models$3$12 = new CashMapPresenter$models$3$1(8, mutableState9, cameraPositionState2, function12, continuation);
                    mutableState2 = mutableState9;
                    gapComposer2.updateRememberedValue(cashMapPresenter$models$3$12);
                    rememberedValue8 = cashMapPresenter$models$3$12;
                } else {
                    cashMapViewModel2 = cashMapViewModel;
                    mutableState2 = mutableState9;
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue8);
                gapComposer2.end(false);
            }
            boolean changed3 = gapComposer2.changed(list);
            Object rememberedValue9 = gapComposer2.rememberedValue();
            Object obj2 = rememberedValue9;
            if (changed3 || rememberedValue9 == neverEqualPolicy2) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new GoogleClusterItemAdapter((CashClusterItem) it.next()));
                }
                gapComposer2.updateRememberedValue(arrayList);
                obj2 = arrayList;
            }
            final List list3 = (List) obj2;
            LocationSelection locationSelection = cashMapViewModel2.selectedLocation;
            Object obj3 = locationSelection != null ? locationSelection.locationToken : continuation;
            boolean changed4 = gapComposer2.changed(list) | gapComposer2.changed(obj3);
            Object rememberedValue10 = gapComposer2.rememberedValue();
            if (changed4 || rememberedValue10 == neverEqualPolicy2) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = continuation;
                        break;
                    } else {
                        obj = it2.next();
                        if (Intrinsics.areEqual(((CashClusterItem) obj).getViewModel().getToken(), obj3)) {
                            break;
                        }
                    }
                }
                rememberedValue10 = (CashClusterItem) obj;
                gapComposer2.updateRememberedValue(rememberedValue10);
            }
            CashClusterItem cashClusterItem = (CashClusterItem) rememberedValue10;
            Object rememberedValue11 = gapComposer2.rememberedValue();
            if (rememberedValue11 == neverEqualPolicy2) {
                rememberedValue11 = Updater.mutableStateOf$default(continuation);
                gapComposer2.updateRememberedValue(rememberedValue11);
            }
            final MutableState mutableState12 = (MutableState) rememberedValue11;
            Object obj4 = locationSelection != null ? locationSelection.id : continuation;
            GoogleMap googleMap2 = (GoogleMap) mutableState2.getValue();
            IntSize intSize = new IntSize(((IntSize) mutableState11.getValue()).packedValue);
            Boolean bool = (Boolean) mutableState10.getValue();
            bool.getClass();
            final String str = obj3;
            Object[] objArr2 = {obj4, selectedLocationCameraReframe, cashClusterItem, googleMap2, intSize, bool, Boolean.valueOf(z)};
            boolean changedInstance3 = gapComposer2.changedInstance(cashClusterItem) | ((234881024 & i4) == 67108864 || ((i4 & 134217728) != 0 && gapComposer2.changedInstance(selectedLocationCameraReframe))) | ((i4 & 7168) == 2048) | gapComposer2.changed(density2) | gapComposer2.changedInstance(cameraPositionState2);
            Object rememberedValue12 = gapComposer2.rememberedValue();
            if (changedInstance3 || rememberedValue12 == neverEqualPolicy2) {
                mutableState4 = mutableState10;
                mutableState5 = mutableState11;
                MutableState mutableState13 = mutableState2;
                z2 = false;
                neverEqualPolicy = neverEqualPolicy2;
                Density density4 = density2;
                objArr = objArr2;
                GoogleMapEngine$Map$3$1 googleMapEngine$Map$3$1 = new GoogleMapEngine$Map$3$1(cashClusterItem, selectedLocationCameraReframe, z, density4, cameraPositionState2, mutableState13, mutableState4, mutableState5, null);
                cameraPositionState = cameraPositionState2;
                mutableState6 = mutableState13;
                gapComposer2.updateRememberedValue(googleMapEngine$Map$3$1);
                rememberedValue12 = googleMapEngine$Map$3$1;
            } else {
                objArr = objArr2;
                cameraPositionState = cameraPositionState2;
                mutableState4 = mutableState10;
                mutableState5 = mutableState11;
                mutableState6 = mutableState2;
                z2 = false;
                neverEqualPolicy = neverEqualPolicy2;
            }
            Updater.LaunchedEffect(objArr, (Function2) rememberedValue12, gapComposer2);
            Object rememberedValue13 = gapComposer2.rememberedValue();
            if (rememberedValue13 == neverEqualPolicy) {
                rememberedValue13 = new MoneyTabUIKt$$ExternalSyntheticLambda9(4, mutableState5);
                gapComposer2.updateRememberedValue(rememberedValue13);
            }
            Modifier alpha = AlphaKt.alpha(RulerKt.onSizeChanged(modifier, (Function1) rememberedValue13), z ? 1.0f : RecyclerView.DECELERATION_RATE);
            MapProperties mapProperties = (MapProperties) mutableState.getValue();
            MapUiSettings mapUiSettings = (MapUiSettings) mutableState3.getValue();
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, z2);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(z2);
            }
            ComposeMapColorScheme composeMapColorScheme = colors.isLight ? ComposeMapColorScheme.LIGHT : ComposeMapColorScheme.DARK;
            boolean z4 = (i5 & 112) != 32 ? z2 : true;
            Object rememberedValue14 = gapComposer2.rememberedValue();
            if (z4 || rememberedValue14 == neverEqualPolicy) {
                rememberedValue14 = new UtilsKt$$ExternalSyntheticLambda0(4, function12);
                gapComposer2.updateRememberedValue(rememberedValue14);
            }
            Function1 function13 = (Function1) rememberedValue14;
            Object rememberedValue15 = gapComposer2.rememberedValue();
            if (rememberedValue15 == neverEqualPolicy) {
                rememberedValue15 = new MoneyTabUIKt$$ExternalSyntheticLambda7(function0, mutableState4, 3);
                gapComposer2.updateRememberedValue(rememberedValue15);
            }
            final Context context3 = context;
            final MutableState mutableState14 = mutableState6;
            gapComposer = gapComposer2;
            GoogleMapKt.GoogleMap(alpha, cameraPositionState, null, mapProperties, mapUiSettings, null, function13, null, (Function0) rememberedValue15, null, null, null, composeMapColorScheme, null, Expect_jvmKt.rememberComposableLambda(-1159681934, new Function2() { // from class: com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    Composer composer2 = (Composer) obj5;
                    int intValue = ((Integer) obj6).intValue();
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        boolean z5 = z;
                        CashMapViewModel cashMapViewModel3 = cashMapViewModel;
                        Object obj7 = Composer.Companion.Empty;
                        if (z5) {
                            gapComposer3.startReplaceGroup(632524093);
                            List list4 = list3;
                            GoogleMapEngine googleMapEngine = this;
                            boolean changed5 = gapComposer3.changed(googleMapEngine) | gapComposer3.changedInstance(cashMapViewModel3);
                            Function1 function14 = function12;
                            boolean changed6 = changed5 | gapComposer3.changed(function14);
                            Object rememberedValue16 = gapComposer3.rememberedValue();
                            MutableState mutableState15 = mutableState12;
                            if (changed6 || rememberedValue16 == obj7) {
                                rememberedValue16 = new GpsConfigQueries$$ExternalSyntheticLambda3(googleMapEngine, cashMapViewModel3, function14, mutableState15);
                                gapComposer3.updateRememberedValue(rememberedValue16);
                            }
                            Function1 function15 = (Function1) rememberedValue16;
                            boolean changed7 = gapComposer3.changed(function14);
                            Object rememberedValue17 = gapComposer3.rememberedValue();
                            if (changed7 || rememberedValue17 == obj7) {
                                rememberedValue17 = new UtilsKt$$ExternalSyntheticLambda0(5, function14);
                                gapComposer3.updateRememberedValue(rememberedValue17);
                            }
                            Function1 function16 = (Function1) rememberedValue17;
                            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1488755585, new AdapterHelper$$ExternalSyntheticLambda0(function3, 1), gapComposer3);
                            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1124746249, new MoneyTabBookletKt$$ExternalSyntheticLambda4(25, str, composableLambdaImpl), gapComposer3);
                            Object rememberedValue18 = gapComposer3.rememberedValue();
                            if (rememberedValue18 == obj7) {
                                rememberedValue18 = new MoneyTabUIKt$$ExternalSyntheticLambda9(3, mutableState15);
                                gapComposer3.updateRememberedValue(rememberedValue18);
                            }
                            ClusteringKt.m2059ClusteringVvsazsQ(list4, function15, function16, null, null, rememberComposableLambda, rememberComposableLambda2, 0L, 0L, null, (Function1) rememberedValue18, gapComposer3, 1769472);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(634541232);
                            gapComposer3.end(false);
                        }
                        SearchLocation searchLocation = cashMapViewModel3.searchedLocation;
                        Continuation continuation2 = null;
                        if (searchLocation == null) {
                            gapComposer3.startReplaceGroup(634588661);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(634588662);
                            Function3 function33 = function32;
                            if (function33 != null) {
                                gapComposer3.startReplaceGroup(298681479);
                                function33.invoke(searchLocation, gapComposer3, 0);
                                gapComposer3.end(false);
                            } else {
                                gapComposer3.startReplaceGroup(298752872);
                                Context context4 = context3;
                                boolean changed8 = gapComposer3.changed(context4);
                                Object rememberedValue19 = gapComposer3.rememberedValue();
                                if (changed8 || rememberedValue19 == obj7) {
                                    Drawable drawableCompat = PlatformKt.getDrawableCompat(context4, R.drawable.search_marker_icon, null);
                                    drawableCompat.getClass();
                                    rememberedValue19 = CameraFeedKt.fromBitmap(DrawablesKt.drawableToBitmap(drawableCompat));
                                    gapComposer3.updateRememberedValue(rememberedValue19);
                                }
                                BitmapDescriptor bitmapDescriptor = (BitmapDescriptor) rememberedValue19;
                                bitmapDescriptor.getClass();
                                MarkerKt.m2057Markerqld6geY(MarkerKt.rememberUpdatedMarkerState(new LatLng(searchLocation.lat, searchLocation.lng), gapComposer3, 0), null, RecyclerView.DECELERATION_RATE, 0L, bitmapDescriptor, 0L, false, null, null, null, null, gapComposer3, 0, 0, 262078);
                                gapComposer3.end(false);
                            }
                            gapComposer3.end(false);
                        }
                        Unit unit2 = Unit.INSTANCE;
                        Object rememberedValue20 = gapComposer3.rememberedValue();
                        if (rememberedValue20 == obj7) {
                            rememberedValue20 = new CardModelView.AnonymousClass1.AnonymousClass4(mutableState14, continuation2, 12);
                            gapComposer3.updateRememberedValue(rememberedValue20);
                        }
                        MapEffectKt.MapEffect(unit2, (Function3) rememberedValue20, gapComposer3, 6);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), gapComposer, 512, 100663296, 193882);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                    GoogleMapEngine.this.Map(modifier, cashMapViewModel, list, z, function3, composableLambdaImpl, function1, function2, selectedLocationCameraReframe, function32, function0, function12, (Composer) obj5, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
