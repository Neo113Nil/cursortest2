package com.google.maps.android.compose;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import bo.app.yf$$ExternalSyntheticLambda10;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda0;
import com.google.android.play.core.integrity.o;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.cdf.asset.AssetSendSelectInstrument;
import com.squareup.cash.cdf.asset.ExperienceType;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db.contacts.RecipientPaymentInfo;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.common.SelectPaymentInstrumentType;
import com.squareup.cash.instruments.utils.HasNotPassedIdvSortRanking;
import com.squareup.cash.instruments.utils.InstrumentUtils$WhenMappings;
import com.squareup.cash.instruments.utils.InstrumentUtils$getExistingInstruments$$inlined$filterIsInstance$1;
import com.squareup.cash.instruments.utils.InstrumentUtils$getExistingInstruments$1;
import com.squareup.cash.instruments.utils.SelectPaymentInstrumentOption;
import com.squareup.cash.instruments.utils.SelectPaymentInstrumentOptions;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.util.cash.Bps;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KFunction;
import kotlin.reflect.KType;
import kotlin.reflect.full.KCallables;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.ReflectKFunction;
import kotlin.reflect.jvm.internal.ReflectKParameter;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.UtilKt$$Lambda$0;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.RealWebSocket$connect$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class GoogleMapKt {
    /* JADX WARN: Removed duplicated region for block: B:131:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoogleMap(final Modifier modifier, final CameraPositionState cameraPositionState, Function0 function0, final MapProperties mapProperties, final MapUiSettings mapUiSettings, DefaultIndoorStateChangeListener defaultIndoorStateChangeListener, final Function1 function1, Function1 function12, final Function0 function02, Function1 function13, Function1 function14, PaddingValues paddingValues, final ComposeMapColorScheme composeMapColorScheme, Function2 function2, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Function1 function15;
        int i6;
        Function1 function16;
        int i7;
        int i8;
        int i9;
        GapComposer gapComposer;
        final Function0 function03;
        final Function1 function17;
        final PaddingValues paddingValues2;
        final Function1 function18;
        final Function2 function22;
        RecomposeScopeImpl endRestartGroup;
        final PaddingValues paddingValues3;
        int i10;
        final Function1 function19;
        final DefaultIndoorStateChangeListener defaultIndoorStateChangeListener2;
        int i11;
        final Function1 function110;
        final Function2 function23;
        PaddingValues paddingValues4;
        Object obj;
        Function2 function24;
        Function1 function111;
        CameraPositionState cameraPositionState2;
        MapProperties mapProperties2;
        MapUiSettings mapUiSettings2;
        Object obj2;
        Function1 function112;
        Integer num;
        MapUiSettings mapUiSettings3;
        MapProperties mapProperties3;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1892652005);
        if ((i & 6) == 0) {
            i4 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i12 = i4 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= gapComposer2.changedInstance(cameraPositionState) ? 256 : 128;
        }
        int i13 = i12 | 27648;
        if ((i & 196608) == 0) {
            i13 |= gapComposer2.changed(mapProperties) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i14 = i13 | 1572864;
        if ((i & 12582912) == 0) {
            i14 |= gapComposer2.changed(mapUiSettings) ? 8388608 : 4194304;
        }
        int i15 = i14 | 100663296;
        if ((i & 805306368) == 0) {
            i15 |= gapComposer2.changedInstance(function1) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i16 = i3 & 1024;
        if (i16 != 0) {
            i6 = i2 | 6;
            i5 = 196608;
            function15 = function12;
        } else if ((i2 & 6) == 0) {
            i5 = 196608;
            function15 = function12;
            i6 = i2 | (gapComposer2.changedInstance(function15) ? 4 : 2);
        } else {
            i5 = 196608;
            function15 = function12;
            i6 = i2;
        }
        if ((i2 & 48) == 0) {
            i6 |= gapComposer2.changedInstance(function02) ? 32 : 16;
        }
        int i17 = i6;
        int i18 = i17 | MLKEMEngine.KyberPolyBytes;
        int i19 = i3 & PKIFailureInfo.certRevoked;
        if (i19 != 0) {
            i18 = i17 | 3456;
        } else if ((i2 & 3072) == 0) {
            function16 = function13;
            i18 |= gapComposer2.changedInstance(function16) ? 2048 : 1024;
            i7 = i3 & 16384;
            if (i7 == 0) {
                i18 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i18 |= gapComposer2.changedInstance(function14) ? 16384 : PKIFailureInfo.certRevoked;
                int i20 = i18 | i5;
                if ((i2 & 1572864) == 0) {
                    i8 = i7;
                    i20 |= gapComposer2.changed(composeMapColorScheme == null ? -1 : composeMapColorScheme.ordinal()) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                } else {
                    i8 = i7;
                }
                int i21 = i20 | 12582912;
                if ((i2 & 100663296) == 0) {
                    i21 |= gapComposer2.changedInstance(composableLambdaImpl) ? 67108864 : 33554432;
                }
                i9 = i21;
                if (gapComposer2.shouldExecute(i15 & 1, (306783379 & i15) == 306783378 || (38347923 & i9) != 38347922)) {
                    gapComposer2.startDefaults();
                    int i22 = i & 1;
                    Object obj3 = Composer.Companion.Empty;
                    if (i22 == 0 || gapComposer2.getDefaultsInvalid()) {
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (rememberedValue == obj3) {
                            rememberedValue = new ViewUtils$$ExternalSyntheticLambda0(17);
                            gapComposer2.updateRememberedValue(rememberedValue);
                        }
                        Function0 function04 = (Function0) rememberedValue;
                        if (i16 != 0) {
                            function15 = null;
                        }
                        if (i19 != 0) {
                            function16 = null;
                        }
                        Function1 function113 = i8 != 0 ? null : function14;
                        paddingValues3 = MapUpdaterKt.DefaultMapContentPadding;
                        function0 = function04;
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (rememberedValue2 == obj3) {
                            rememberedValue2 = GoogleMapKt$GoogleMap$2$1.INSTANCE;
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        i10 = i9;
                        function19 = function113;
                        defaultIndoorStateChangeListener2 = DefaultIndoorStateChangeListener.INSTANCE;
                        i11 = i15;
                        function110 = function16;
                        function23 = (Function2) ((KFunction) rememberedValue2);
                    } else {
                        gapComposer2.skipToGroupEnd();
                        defaultIndoorStateChangeListener2 = defaultIndoorStateChangeListener;
                        paddingValues3 = paddingValues;
                        i11 = i15;
                        i10 = i9;
                        function110 = function16;
                        function19 = function14;
                        function23 = function2;
                    }
                    final Function0 function05 = function0;
                    gapComposer2.endDefaults();
                    if (((Boolean) gapComposer2.consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
                        gapComposer2.startReplaceGroup(335971056);
                        BoxKt.Box(modifier, gapComposer2, i11 & 14);
                        gapComposer2.end(false);
                        RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                        if (endRestartGroup2 != null) {
                            final int i23 = 0;
                            final Function1 function114 = function15;
                            endRestartGroup2.block = new Function2() { // from class: com.google.maps.android.compose.GoogleMapKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    int i24 = i23;
                                    int i25 = i2;
                                    int i26 = i;
                                    switch (i24) {
                                        case 0:
                                            ((Integer) obj5).getClass();
                                            int updateChangedFlags = Updater.updateChangedFlags(i26 | 1);
                                            int updateChangedFlags2 = Updater.updateChangedFlags(i25);
                                            GoogleMapKt.GoogleMap(modifier, cameraPositionState, function05, mapProperties, mapUiSettings, defaultIndoorStateChangeListener2, function1, function114, function02, function110, function19, paddingValues3, composeMapColorScheme, function23, composableLambdaImpl, (Composer) obj4, updateChangedFlags, updateChangedFlags2, i3);
                                            break;
                                        default:
                                            ((Integer) obj5).getClass();
                                            int updateChangedFlags3 = Updater.updateChangedFlags(i26 | 1);
                                            int updateChangedFlags4 = Updater.updateChangedFlags(i25);
                                            GoogleMapKt.GoogleMap(modifier, cameraPositionState, function05, mapProperties, mapUiSettings, defaultIndoorStateChangeListener2, function1, function114, function02, function110, function19, paddingValues3, composeMapColorScheme, function23, composableLambdaImpl, (Composer) obj4, updateChangedFlags3, updateChangedFlags4, i3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    PaddingValues paddingValues5 = paddingValues3;
                    Function2 function25 = function23;
                    DefaultIndoorStateChangeListener defaultIndoorStateChangeListener3 = defaultIndoorStateChangeListener2;
                    Function1 function115 = function110;
                    Function1 function116 = function19;
                    gapComposer2.startReplaceGroup(336023911);
                    gapComposer2.end(false);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (rememberedValue3 == obj3) {
                        rememberedValue3 = new MapClickListeners();
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    MapClickListeners mapClickListeners = (MapClickListeners) rememberedValue3;
                    mapClickListeners.getClass();
                    defaultIndoorStateChangeListener3.getClass();
                    mapClickListeners.indoorStateChangeListener$delegate.setValue(defaultIndoorStateChangeListener3);
                    mapClickListeners.onMapClick$delegate.setValue(function1);
                    mapClickListeners.onMapLongClick$delegate.setValue(function15);
                    mapClickListeners.onMapLoaded$delegate.setValue(function02);
                    mapClickListeners.onMyLocationButtonClick$delegate.setValue(null);
                    mapClickListeners.onMyLocationClick$delegate.setValue(function115);
                    mapClickListeners.onPOIClick$delegate.setValue(function116);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (rememberedValue4 == obj3) {
                        if (composeMapColorScheme != null) {
                            num = Integer.valueOf(composeMapColorScheme.value);
                            obj = obj3;
                            function24 = function25;
                            function111 = function116;
                            obj2 = mapClickListeners;
                            mapProperties3 = mapProperties;
                            mapUiSettings3 = mapUiSettings;
                        } else {
                            num = null;
                            mapUiSettings3 = mapUiSettings;
                            obj = obj3;
                            function24 = function25;
                            function111 = function116;
                            obj2 = mapClickListeners;
                            mapProperties3 = mapProperties;
                        }
                        cameraPositionState2 = cameraPositionState;
                        Object mapUpdaterState = new MapUpdaterState(cameraPositionState2, paddingValues5, mapProperties3, mapUiSettings3, num);
                        paddingValues4 = paddingValues5;
                        mapProperties2 = mapProperties3;
                        mapUiSettings2 = mapUiSettings3;
                        gapComposer2.updateRememberedValue(mapUpdaterState);
                        rememberedValue4 = mapUpdaterState;
                    } else {
                        paddingValues4 = paddingValues5;
                        obj = obj3;
                        function24 = function25;
                        function111 = function116;
                        cameraPositionState2 = cameraPositionState;
                        mapProperties2 = mapProperties;
                        mapUiSettings2 = mapUiSettings;
                        obj2 = mapClickListeners;
                    }
                    MapUpdaterState mapUpdaterState2 = (MapUpdaterState) rememberedValue4;
                    defaultIndoorStateChangeListener = defaultIndoorStateChangeListener3;
                    mapUpdaterState2.mergeDescendants$delegate.setValue(false);
                    mapUpdaterState2.contentDescription$delegate.setValue(null);
                    cameraPositionState2.getClass();
                    mapUpdaterState2.cameraPositionState$delegate.setValue(cameraPositionState2);
                    paddingValues4.getClass();
                    mapUpdaterState2.contentPadding$delegate.setValue(paddingValues4);
                    mapUpdaterState2.locationSource$delegate.setValue(null);
                    mapProperties2.getClass();
                    mapUpdaterState2.mapProperties$delegate.setValue(mapProperties2);
                    mapUiSettings2.getClass();
                    mapUpdaterState2.mapUiSettings$delegate.setValue(mapUiSettings2);
                    mapUpdaterState2.mapColorScheme$delegate.setValue(composeMapColorScheme != null ? Integer.valueOf(composeMapColorScheme.value) : null);
                    GapComposer.CompositionContextImpl buildContext = gapComposer2.buildContext();
                    Object rememberUpdatedState = Updater.rememberUpdatedState(composableLambdaImpl, gapComposer2);
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    if (rememberedValue5 == obj) {
                        rememberedValue5 = Updater.mutableStateOf$default(null);
                        gapComposer2.updateRememberedValue(rememberedValue5);
                    }
                    MutableState mutableState = (MutableState) rememberedValue5;
                    Object rememberedValue6 = gapComposer2.rememberedValue();
                    if (rememberedValue6 == obj) {
                        rememberedValue6 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                        gapComposer2.updateRememberedValue(rememberedValue6);
                    }
                    Object obj4 = (CoroutineScope) rememberedValue6;
                    PaddingValues paddingValues6 = paddingValues4;
                    boolean changedInstance = ((i11 & 57344) == 16384) | gapComposer2.changedInstance(cameraPositionState2) | ((i10 & 29360128) == 8388608);
                    Object rememberedValue7 = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue7 == obj) {
                        rememberedValue7 = new UtilsKt$$ExternalSyntheticLambda0(10, function05, cameraPositionState2, function24);
                        gapComposer2.updateRememberedValue(rememberedValue7);
                    }
                    Function1 function117 = (Function1) rememberedValue7;
                    Object rememberedValue8 = gapComposer2.rememberedValue();
                    if (rememberedValue8 == obj) {
                        rememberedValue8 = new yf$$ExternalSyntheticLambda10(26);
                        gapComposer2.updateRememberedValue(rememberedValue8);
                    }
                    Function1 function118 = (Function1) rememberedValue8;
                    Object rememberedValue9 = gapComposer2.rememberedValue();
                    if (rememberedValue9 == obj) {
                        function112 = function118;
                        rememberedValue9 = new yf$$ExternalSyntheticLambda10(27);
                        gapComposer2.updateRememberedValue(rememberedValue9);
                    } else {
                        function112 = function118;
                    }
                    Function1 function119 = (Function1) rememberedValue9;
                    boolean changedInstance2 = gapComposer2.changedInstance(obj4) | gapComposer2.changed(mapUpdaterState2) | gapComposer2.changedInstance(buildContext) | gapComposer2.changed(obj2) | gapComposer2.changed(rememberUpdatedState);
                    Object rememberedValue10 = gapComposer2.rememberedValue();
                    if (changedInstance2 || rememberedValue10 == obj) {
                        rememberedValue10 = new SliderKt$$ExternalSyntheticLambda3(obj4, mapUpdaterState2, buildContext, obj2, mutableState, rememberUpdatedState, 3);
                        gapComposer2.updateRememberedValue(rememberedValue10);
                    }
                    paddingValues2 = paddingValues6;
                    gapComposer = gapComposer2;
                    AndroidView_androidKt.AndroidView(function117, modifier, function112, function119, (Function1) rememberedValue10, gapComposer, ((i11 << 3) & 112) | 3456, 0);
                    function17 = function111;
                    function03 = function05;
                    function18 = function115;
                    function22 = function24;
                } else {
                    gapComposer = gapComposer2;
                    gapComposer.skipToGroupEnd();
                    function03 = function0;
                    function17 = function14;
                    paddingValues2 = paddingValues;
                    function18 = function16;
                    function22 = function2;
                }
                final DefaultIndoorStateChangeListener defaultIndoorStateChangeListener4 = defaultIndoorStateChangeListener;
                final Function1 function120 = function15;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i24 = 1;
                    endRestartGroup.block = new Function2() { // from class: com.google.maps.android.compose.GoogleMapKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj42, Object obj5) {
                            int i242 = i24;
                            int i25 = i2;
                            int i26 = i;
                            switch (i242) {
                                case 0:
                                    ((Integer) obj5).getClass();
                                    int updateChangedFlags = Updater.updateChangedFlags(i26 | 1);
                                    int updateChangedFlags2 = Updater.updateChangedFlags(i25);
                                    GoogleMapKt.GoogleMap(modifier, cameraPositionState, function03, mapProperties, mapUiSettings, defaultIndoorStateChangeListener4, function1, function120, function02, function18, function17, paddingValues2, composeMapColorScheme, function22, composableLambdaImpl, (Composer) obj42, updateChangedFlags, updateChangedFlags2, i3);
                                    break;
                                default:
                                    ((Integer) obj5).getClass();
                                    int updateChangedFlags3 = Updater.updateChangedFlags(i26 | 1);
                                    int updateChangedFlags4 = Updater.updateChangedFlags(i25);
                                    GoogleMapKt.GoogleMap(modifier, cameraPositionState, function03, mapProperties, mapUiSettings, defaultIndoorStateChangeListener4, function1, function120, function02, function18, function17, paddingValues2, composeMapColorScheme, function22, composableLambdaImpl, (Composer) obj42, updateChangedFlags3, updateChangedFlags4, i3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            int i202 = i18 | i5;
            if ((i2 & 1572864) == 0) {
            }
            int i212 = i202 | 12582912;
            if ((i2 & 100663296) == 0) {
            }
            i9 = i212;
            if (gapComposer2.shouldExecute(i15 & 1, (306783379 & i15) == 306783378 || (38347923 & i9) != 38347922)) {
            }
            final DefaultIndoorStateChangeListener defaultIndoorStateChangeListener42 = defaultIndoorStateChangeListener;
            final Function1 function1202 = function15;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function16 = function13;
        i7 = i3 & 16384;
        if (i7 == 0) {
        }
        int i2022 = i18 | i5;
        if ((i2 & 1572864) == 0) {
        }
        int i2122 = i2022 | 12582912;
        if ((i2 & 100663296) == 0) {
        }
        i9 = i2122;
        if (gapComposer2.shouldExecute(i15 & 1, (306783379 & i15) == 306783378 || (38347923 & i9) != 38347922)) {
        }
        final DefaultIndoorStateChangeListener defaultIndoorStateChangeListener422 = defaultIndoorStateChangeListener;
        final Function1 function12022 = function15;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final String creditCardFee(SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument existingInstrument, LocalizedMoneyFormatter.Factory factory, AndroidStringManager androidStringManager) {
        Money money = existingInstrument.creditCardFee;
        if (money == null) {
            return null;
        }
        Long l = money.amount;
        l.getClass();
        if (l.longValue() <= 0) {
            return null;
        }
        String format2 = factory.create(MoneyFormatterConfig.COMPACT).format(money);
        format2.getClass();
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format3 = new MessageFormat(resources.getString(R.string.send_payment_instrument_fee)).format(new Object[]{format2});
        format3.getClass();
        return format3;
    }

    public static SelectPaymentInstrumentOption.ExistingOption determineSelectedInstrument$default(List list, Profile profile, Orientation orientation, CashInstrumentType cashInstrumentType, Money money, BalanceSnapshot balanceSnapshot, List list2, InstrumentLinkingConfig instrumentLinkingConfig, boolean z, InstrumentSelection instrumentSelection) {
        list.getClass();
        profile.getClass();
        orientation.getClass();
        money.getClass();
        list2.getClass();
        instrumentLinkingConfig.getClass();
        return normalizeInstrumentSelection$default(orientation, cashInstrumentType, instrumentSelection != null ? instrumentSelection.instrument_token : null, getExistingInstruments(list, profile, money, balanceSnapshot, list2, instrumentLinkingConfig, z, false), 16);
    }

    public static final String displayName(SelectPaymentInstrumentOption.ExistingOption existingOption, AndroidStringManager androidStringManager, Orientation orientation) {
        Instrument instrument;
        String selectionString;
        if (existingOption instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) {
            if (((SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) existingOption).balance != null) {
                return androidStringManager.get(R.string.send_payment_cash_balance);
            }
            return null;
        }
        if (!(existingOption instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) || (instrument = ((SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) existingOption).instrument) == null || (selectionString = selectionString(instrument, androidStringManager)) == null) {
            return null;
        }
        if (orientation != Orientation.BILL) {
            return selectionString;
        }
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.deposit_in)).format(new Object[]{selectionString});
        format2.getClass();
        return format2;
    }

    public static final Type extractContinuationArgument(ReflectKFunction reflectKFunction) {
        Type[] lowerBounds;
        if (reflectKFunction.isSuspend()) {
            Object lastOrNull = CollectionsKt.lastOrNull(reflectKFunction.getCaller().getParameterTypes());
            ParameterizedType parameterizedType = lastOrNull instanceof ParameterizedType ? (ParameterizedType) lastOrNull : null;
            if (Intrinsics.areEqual(parameterizedType != null ? parameterizedType.getRawType() : null, Continuation.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                actualTypeArguments.getClass();
                Object single = ArraysKt___ArraysKt.single(actualTypeArguments);
                WildcardType wildcardType = single instanceof WildcardType ? (WildcardType) single : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) ArraysKt___ArraysKt.first(lowerBounds);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    public static final List getExistingInstruments(List list, Profile profile, Money money, BalanceSnapshot balanceSnapshot, List list2, InstrumentLinkingConfig instrumentLinkingConfig, boolean z, boolean z2) {
        ?? listOf;
        list.getClass();
        profile.getClass();
        money.getClass();
        list2.getClass();
        instrumentLinkingConfig.getClass();
        long j = instrumentLinkingConfig.credit_card_fee_bps;
        Money times = Moneys.times(money, Math.max(1L, list.size()));
        if (list.isEmpty()) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(Long.valueOf(j));
        } else {
            List<Recipient> list3 = list;
            listOf = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            for (Recipient recipient : list3) {
                long j2 = recipient.creditCardFee;
                if (j2 <= 0 && !recipient.isBusiness) {
                    j2 = j;
                }
                listOf.add(Long.valueOf(j2));
            }
        }
        return getExistingInstruments(times, Bps.computeFee$default(money, (Iterable) listOf), balanceSnapshot, list2, instrumentLinkingConfig, Boolean.valueOf(z), profile.country_code, z2);
    }

    public static final SelectPaymentInstrumentOption.ExistingOption getSelectedInstrument(Orientation orientation, CashInstrumentType cashInstrumentType, InstrumentSelection instrumentSelection, List list) {
        orientation.getClass();
        list.getClass();
        return normalizeInstrumentSelection$default(orientation, cashInstrumentType, instrumentSelection != null ? instrumentSelection.instrument_token : null, list, 16);
    }

    public static void goToSelectInstrument$default(BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, Money money, List list, BalanceSnapshot balanceSnapshot, List list2, InstrumentLinkingConfig instrumentLinkingConfig, InstrumentSelection instrumentSelection) {
        ExperienceType experienceType = ExperienceType.LEGACY;
        money.getClass();
        list.getClass();
        list2.getClass();
        Object obj = null;
        analytics.track(new AssetSendSelectInstrument(null, null, null, null, null, null, experienceType, null), null);
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        if (balanceSnapshot != null) {
            createListBuilder.add(balanceSnapshot.token);
        }
        List list3 = list2;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((Instrument) it.next()).token);
        }
        createListBuilder.addAll(arrayList);
        ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        ListIterator listIterator = build.listIterator(0);
        while (true) {
            ListBuilder.Itr itr = (ListBuilder.Itr) listIterator;
            if (!itr.hasNext()) {
                break;
            }
            Object next = itr.next();
            if (Intrinsics.areEqual((String) next, instrumentSelection != null ? instrumentSelection.instrument_token : null)) {
                obj = next;
                break;
            }
        }
        String str = (String) obj;
        SelectPaymentInstrumentType selectPaymentInstrumentType = SelectPaymentInstrumentType.SELECT_FROM_INSTRUMENTS;
        List<Recipient> list4 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
        for (Recipient recipient : list4) {
            arrayList2.add(new RecipientPaymentInfo(recipient.creditCardFee, recipient.isBusiness));
        }
        screenNavigator.goTo(new PaymentScreens.SelectPaymentInstrument(build, arrayList2, money, instrumentLinkingConfig.credit_card_linking_enabled, instrumentLinkingConfig.cash_balance_enabled, instrumentLinkingConfig.credit_card_fee_bps, EmptyList.INSTANCE, true, str));
    }

    public static final InstrumentIcon instrumentIcon(Instrument instrument, Icons icons, InstrumentIcon.IconShape iconShape, boolean z) {
        String str;
        InstrumentIcon.LocalBrand localBrand;
        instrument.getClass();
        InstrumentType instrumentType = instrument.cardBrand;
        iconShape.getClass();
        int ordinal = iconShape.ordinal();
        InstrumentIcon.LocalBrand localBrand2 = null;
        if (ordinal == 0) {
            str = instrument.iconUrl;
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str = instrument.cardImageUrl;
        }
        if (str != null) {
            return new InstrumentIcon.RemoteIcon(str, icons, iconShape);
        }
        int ordinal2 = iconShape.ordinal();
        if (ordinal2 == 0) {
            switch (instrumentType != null ? InstrumentUtils$WhenMappings.$EnumSwitchMapping$2[instrumentType.ordinal()] : -1) {
                case 1:
                    localBrand = new InstrumentIcon.LocalBrand(R.drawable.arcade_instrument_visa, R.drawable.arcade_instrument_visa, icons, null, 8);
                    break;
                case 2:
                    localBrand = new InstrumentIcon.LocalBrand(R.drawable.arcade_instrument_mastercard_light, R.drawable.arcade_instrument_mastercard_dark, icons, null, 8);
                    break;
                case 3:
                    localBrand = new InstrumentIcon.LocalBrand(R.drawable.arcade_instrument_amex, R.drawable.arcade_instrument_amex, icons, null, 8);
                    break;
                case 4:
                    localBrand = new InstrumentIcon.LocalBrand(R.drawable.arcade_instrument_discover_light, R.drawable.arcade_instrument_discover_dark, icons, null, 8);
                    break;
                case 5:
                    localBrand = new InstrumentIcon.LocalBrand(R.drawable.arcade_instrument_diners_light, R.drawable.arcade_instrument_diners_dark, icons, null, 8);
                    break;
                case 6:
                    localBrand = new InstrumentIcon.LocalBrand(R.drawable.arcade_instrument_jcb_light, R.drawable.arcade_instrument_jcb_dark, icons, null, 8);
                    break;
            }
            localBrand2 = localBrand;
        } else {
            if (ordinal2 != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            int i = instrumentType != null ? InstrumentUtils$WhenMappings.$EnumSwitchMapping$2[instrumentType.ordinal()] : -1;
            if (i == 1) {
                int i2 = R.drawable.card_visa;
                int i3 = z ? R.drawable.card_visa_no_bg : R.drawable.card_visa;
                if (z) {
                    i2 = R.drawable.card_visa_no_bg;
                }
                localBrand2 = new InstrumentIcon.LocalBrand(i3, i2, icons, iconShape);
            } else if (i == 2) {
                int i4 = R.drawable.card_mastercard_no_bg;
                int i5 = z ? R.drawable.card_mastercard_no_bg : R.drawable.card_mastercard_light;
                if (!z) {
                    i4 = R.drawable.card_mastercard_dark;
                }
                localBrand2 = new InstrumentIcon.LocalBrand(i5, i4, icons, iconShape);
            } else if (i == 3) {
                localBrand2 = new InstrumentIcon.LocalBrand(R.drawable.card_amex, R.drawable.card_amex, icons, iconShape);
            } else if (i == 4) {
                localBrand2 = new InstrumentIcon.LocalBrand(R.drawable.card_discover, R.drawable.card_discover, icons, iconShape);
            }
        }
        if (localBrand2 != null) {
            return localBrand2;
        }
        int i6 = InstrumentUtils$WhenMappings.$EnumSwitchMapping$0[instrument.cashInstrumentType.ordinal()];
        if (i6 == 1) {
            return new InstrumentIcon.LocalIcon(Icons.CardBasic24, null, null, icons, iconShape, 6);
        }
        if (i6 == 2) {
            return new InstrumentIcon.LocalIcon(Icons.CardCredit24, null, null, icons, iconShape, 6);
        }
        if (i6 != 3 && i6 == 5) {
            return new InstrumentIcon.LocalBrand(R.drawable.google_pay, R.drawable.google_pay, icons, null, 8);
        }
        return new InstrumentIcon.LocalIcon(Icons.BankAccount24, null, null, icons, iconShape, 6);
    }

    public static /* synthetic */ InstrumentIcon instrumentIcon$default(Instrument instrument, Icons icons, InstrumentIcon.IconShape iconShape, int i) {
        if ((i & 1) != 0) {
            icons = null;
        }
        if ((i & 2) != 0) {
            iconShape = InstrumentIcon.IconShape.CIRCLE;
        }
        return instrumentIcon(instrument, icons, iconShape, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.squareup.protos.franklin.api.CashInstrumentType] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static final InstrumentSelection loadInstrument(Orientation orientation, List list, InstrumentSelection instrumentSelection, Profile profile, CashInstrumentType cashInstrumentType, Money money, BalanceSnapshot balanceSnapshot, List list2, InstrumentLinkingConfig instrumentLinkingConfig, Boolean bool, boolean z, boolean z2, boolean z3) {
        Pair pair;
        list.getClass();
        money.getClass();
        if (z) {
            InstrumentSelection instrumentSelection2 = 0;
            instrumentSelection2 = 0;
            instrumentSelection2 = 0;
            instrumentSelection2 = 0;
            instrumentSelection2 = 0;
            instrumentSelection2 = 0;
            instrumentSelection2 = 0;
            if (orientation == Orientation.CASH) {
                if (profile != null && list2 != null && balanceSnapshot != null && instrumentLinkingConfig != null && bool != null) {
                    SelectPaymentInstrumentOption.ExistingOption normalizeInstrumentSelection = normalizeInstrumentSelection(orientation, cashInstrumentType, instrumentSelection != null ? instrumentSelection.instrument_token : null, getExistingInstruments(list, profile, money, balanceSnapshot, list2, instrumentLinkingConfig, bool.booleanValue(), z2), z3);
                    if (normalizeInstrumentSelection != null) {
                        if (normalizeInstrumentSelection instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) {
                            BalanceSnapshot balanceSnapshot2 = ((SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) normalizeInstrumentSelection).balance;
                            String str = balanceSnapshot2.token;
                            CurrencyCode currencyCode = balanceSnapshot2.balance.currency_code;
                            pair = new Pair(str, currencyCode != null ? Moneys.zero(currencyCode) : null);
                        } else {
                            if (!(normalizeInstrumentSelection instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument existingInstrument = (SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) normalizeInstrumentSelection;
                            pair = new Pair(existingInstrument.instrument.token, existingInstrument.creditCardFee);
                        }
                        String str2 = (String) pair.first;
                        Money money2 = (Money) pair.second;
                        if (money2 == null) {
                            money2 = Moneys.zero(CurrencyCode.USD);
                        }
                        instrumentSelection2 = new InstrumentSelection(str2, money2, (CashInstrumentType) instrumentSelection2, 12);
                    }
                }
                if (instrumentSelection2 == 0) {
                }
            }
            return instrumentSelection2;
        }
        return instrumentSelection;
    }

    public static final void logSelectedInstrument(Analytics analytics, CashInstrumentType cashInstrumentType, CashInstrumentType cashInstrumentType2, CashInstrumentType cashInstrumentType3, Long l, Long l2, String str, ExperienceType experienceType, String str2) {
        cashInstrumentType.getClass();
        str.getClass();
        experienceType.getClass();
        analytics.track(new AssetSendSelectInstrument(str, cashInstrumentType.name(), cashInstrumentType2 != null ? cashInstrumentType2.name() : null, cashInstrumentType3 != null ? cashInstrumentType3.name() : null, l, l2, experienceType, str2), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        r0 = (com.squareup.cash.instruments.utils.SelectPaymentInstrumentOption.ExistingOption) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SelectPaymentInstrumentOption.ExistingOption normalizeInstrumentSelection(Orientation orientation, CashInstrumentType cashInstrumentType, String str, List list, boolean z) {
        SelectPaymentInstrumentOption.ExistingOption existingOption;
        Object obj;
        Object obj2;
        boolean areEqual;
        list.getClass();
        Object obj3 = null;
        if (orientation == Orientation.BILL) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((SelectPaymentInstrumentOption.ExistingOption) next) instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) {
                    obj3 = next;
                    break;
                }
            }
            return (SelectPaymentInstrumentOption.ExistingOption) obj3;
        }
        if (str != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                SelectPaymentInstrumentOption.ExistingOption existingOption2 = (SelectPaymentInstrumentOption.ExistingOption) obj2;
                if (existingOption2 instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) {
                    areEqual = Intrinsics.areEqual(((SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) existingOption2).balance.token, str);
                } else {
                    if (!(existingOption2 instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    areEqual = Intrinsics.areEqual(((SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) existingOption2).instrument.token, str);
                }
                if (areEqual) {
                    break;
                }
            }
        }
        if (cashInstrumentType != null) {
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                SelectPaymentInstrumentOption.ExistingOption existingOption3 = (SelectPaymentInstrumentOption.ExistingOption) obj;
                if (existingOption3 instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) {
                    if (CashInstrumentType.CASH_BALANCE == cashInstrumentType) {
                        break;
                    }
                } else {
                    if (!(existingOption3 instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (((SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) existingOption3).instrument.cashInstrumentType == cashInstrumentType) {
                        break;
                    }
                }
            }
            existingOption = (SelectPaymentInstrumentOption.ExistingOption) obj;
        } else {
            existingOption = null;
        }
        if (existingOption != null) {
            return existingOption;
        }
        if (!z) {
            return (SelectPaymentInstrumentOption.ExistingOption) CollectionsKt.firstOrNull(list);
        }
        SelectPaymentInstrumentOption.ExistingOption existingOption4 = (SelectPaymentInstrumentOption.ExistingOption) CollectionsKt.firstOrNull(list);
        List list2 = list;
        boolean z2 = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it4 = list2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                SelectPaymentInstrumentOption.ExistingOption existingOption5 = (SelectPaymentInstrumentOption.ExistingOption) it4.next();
                if ((existingOption5 instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) && ((SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) existingOption5).instrument.cashInstrumentType != CashInstrumentType.GOOGLE_PAY) {
                    z2 = true;
                    break;
                }
            }
        }
        if ((existingOption4 instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) && !((SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance) existingOption4).enabled && !z2) {
            Iterator it5 = list2.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Object next2 = it5.next();
                SelectPaymentInstrumentOption.ExistingOption existingOption6 = (SelectPaymentInstrumentOption.ExistingOption) next2;
                if ((existingOption6 instanceof SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) && ((SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument) existingOption6).instrument.cashInstrumentType == CashInstrumentType.GOOGLE_PAY) {
                    obj3 = next2;
                    break;
                }
            }
            SelectPaymentInstrumentOption.ExistingOption existingOption7 = (SelectPaymentInstrumentOption.ExistingOption) obj3;
            if (existingOption7 != null) {
                return existingOption7;
            }
        }
        return existingOption4;
    }

    public static /* synthetic */ SelectPaymentInstrumentOption.ExistingOption normalizeInstrumentSelection$default(Orientation orientation, CashInstrumentType cashInstrumentType, String str, List list, int i) {
        if ((i & 2) != 0) {
            cashInstrumentType = null;
        }
        return normalizeInstrumentSelection(orientation, cashInstrumentType, str, list, false);
    }

    public static final o patchJvmDescriptorByExtraBoxing(ReflectKFunction reflectKFunction, String str) {
        str.getClass();
        RealWebSocket$connect$1 parseJvmDescriptor = UtilKt.parseJvmDescriptor(str);
        ArrayList arrayList = (ArrayList) parseJvmDescriptor.this$0;
        boolean areEqual = Intrinsics.areEqual(CollectionsKt.lastOrNull((List) arrayList), "Lkotlin/jvm/internal/DefaultConstructorMarker;");
        int size = KCallables.getValueParameters(reflectKFunction).size() + (areEqual ? 1 : 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(CollectionsKt.take(arrayList, arrayList.size() - size));
        Iterator it = CollectionsKt.zip(KCallables.getValueParameters(reflectKFunction), CollectionsKt.takeLast(size, arrayList)).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ReflectKParameter reflectKParameter = (ReflectKParameter) pair.first;
            String str2 = (String) pair.second;
            reflectKParameter.getClass();
            if (reflectKParameter.getDeclaresDefaultValue() && UtilKt.isInlineClassType(reflectKParameter.getType())) {
                Iterator it2 = SequencesKt___SequencesKt.drop(SequencesKt__SequencesKt.generateSequence(UtilKt$$Lambda$0.INSTANCE, reflectKParameter.getType()), 1).iterator();
                while (it2.hasNext()) {
                    if (UtilKt.isNullableType((KType) it2.next())) {
                        linkedHashSet.add(Integer.valueOf(arrayList2.size()));
                        KClassifier classifier = reflectKParameter.getType().getClassifier();
                        classifier.getClass();
                        arrayList2.add("L" + StringsKt__StringsJVMKt.replace(((KClassImpl) ((KClass) classifier)).jClass.getName(), '.', '/', false) + ';');
                        break;
                    }
                }
            }
            arrayList2.add(str2);
        }
        if (areEqual) {
            arrayList2.add("Lkotlin/jvm/internal/DefaultConstructorMarker;");
        }
        return linkedHashSet.isEmpty() ? new o(str, EmptySet.INSTANCE) : new o(CollectionsKt.joinToString$default(arrayList2, "", "(", ")", 0, null, null, 56).concat((String) parseJvmDescriptor.$request), linkedHashSet);
    }

    public static final String selectionString(Instrument instrument, AndroidStringManager androidStringManager) {
        Resources resources = androidStringManager.resources;
        instrument.getClass();
        CashInstrumentType cashInstrumentType = instrument.cashInstrumentType;
        String str = instrument.suffix;
        int i = InstrumentUtils$WhenMappings.$EnumSwitchMapping$0[cashInstrumentType.ordinal()];
        if (i == 1) {
            if (str == null) {
                str = "";
            }
            resources.getClass();
            String format2 = new MessageFormat(resources.getString(R.string.debit_card_display_name)).format(new Object[]{str});
            format2.getClass();
            return format2;
        }
        if (i != 2) {
            return i != 3 ? i != 4 ? i != 5 ? "" : androidStringManager.get(R.string.google_pay) : androidStringManager.get(R.string.send_payment_line_of_credit) : Recorder$$ExternalSyntheticOutline2.m(instrument.bankName, " ", str);
        }
        if (str == null) {
            str = "";
        }
        resources.getClass();
        String format3 = new MessageFormat(resources.getString(R.string.credit_card_display_name)).format(new Object[]{str});
        format3.getClass();
        return format3;
    }

    public static final List getExistingInstruments(Money money, Money money2, BalanceSnapshot balanceSnapshot, List list, InstrumentLinkingConfig instrumentLinkingConfig, Boolean bool, Country country, boolean z) {
        HasNotPassedIdvSortRanking hasNotPassedIdvSortRanking;
        list.getClass();
        instrumentLinkingConfig.getClass();
        if (Intrinsics.areEqual(bool, Boolean.FALSE) && !z && country == Country.US) {
            hasNotPassedIdvSortRanking = HasNotPassedIdvSortRanking.INSTANCE;
        } else {
            hasNotPassedIdvSortRanking = HasNotPassedIdvSortRanking.INSTANCE$1;
        }
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.filter(CollectionsKt.asSequence(new SelectPaymentInstrumentOptions(SelectPaymentInstrumentType.SELECT_FROM_INSTRUMENTS, balanceSnapshot, list, (List) EmptyList.INSTANCE, money, money2, instrumentLinkingConfig.credit_card_linking_enabled, instrumentLinkingConfig.cash_balance_enabled, instrumentLinkingConfig.credit_card_fee_bps, true, true, hasNotPassedIdvSortRanking).options), InstrumentUtils$getExistingInstruments$1.INSTANCE), InstrumentUtils$getExistingInstruments$$inlined$filterIsInstance$1.INSTANCE));
    }
}
