package com.squareup.cash.integration.analytics;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.local.views.sheet.MenuPickerSheetKt$$ExternalSyntheticLambda4;
import bo.app.n$$ExternalSyntheticLambda1;
import com.google.maps.android.compose.MapApplier;
import com.google.maps.android.compose.MapClickListeners;
import com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda0;
import com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda1;
import com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda2;
import com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda3;
import com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda4;
import com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda5;
import com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$10$1$1;
import com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$12$1$1;
import com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$14$1$1;
import com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$2$1$1;
import com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$2$2;
import com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$4$1$1;
import com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$6$1$1;
import com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$8$1$1;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda10;
import com.miteksystems.misnap.camera.frameproducers.CameraWrapper;
import com.squareup.protos.common.CurrencyCode;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.reflect.KFunction;
import kotlin.reflect.jvm.internal.UtilKt$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes4.dex */
public abstract class UtilsKt {

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CurrencyCode.values().length];
            try {
                iArr[CurrencyCode.USD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CurrencyCode.GBP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CurrencyCode.JPY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CurrencyCode.BTC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CurrencyCode.CAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void MapClickListenerComposeNode(MutablePropertyReference0Impl mutablePropertyReference0Impl, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1042600347);
        int i2 = (gapComposer.changedInstance(mutablePropertyReference0Impl) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            if (mutablePropertyReference0Impl.get() != null) {
                gapComposer.startReplaceGroup(-1211533631);
                if (!(gapComposer.applier instanceof MapApplier)) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(function0);
                } else {
                    gapComposer.useNode();
                }
                gapComposer.end(true);
            } else {
                gapComposer.startReplaceGroup(1097220765);
            }
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuPickerSheetKt$$ExternalSyntheticLambda4(mutablePropertyReference0Impl, function0, i, 5);
        }
    }

    public static final void MapClickListenerUpdater(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1792062778);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Applier applier = gapComposer.applier;
            applier.getClass();
            MapClickListeners mapClickListeners = ((MapApplier) applier).mapClickListeners;
            gapComposer.startReplaceGroup(-109547171);
            CameraWrapper.i iVar = new CameraWrapper.i(0, 4, MapClickListeners.class, mapClickListeners, "indoorStateChangeListener", "getIndoorStateChangeListener()Lcom/google/maps/android/compose/IndoorStateChangeListener;");
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = MapClickListenersKt$MapClickListenerUpdater$1$2$1$1.INSTANCE;
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MapClickListenerComposeNode(iVar, (Function2) ((KFunction) rememberedValue), new MapClickListenersKt$MapClickListenerUpdater$1$2$2(iVar), gapComposer);
            gapComposer.end(false);
            gapComposer.startReplaceGroup(-109530250);
            CameraWrapper.i iVar2 = new CameraWrapper.i(0, 5, MapClickListeners.class, mapClickListeners, "onMapClick", "getOnMapClick()Lkotlin/jvm/functions/Function1;");
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = MapClickListenersKt$MapClickListenerUpdater$1$4$1$1.INSTANCE;
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function2 function2 = (Function2) ((KFunction) rememberedValue2);
            boolean changedInstance = gapComposer.changedInstance(iVar2);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new MapClickListenersKt$$ExternalSyntheticLambda0(iVar2);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            MapClickListenerComposeNode(iVar2, function2, (MapClickListenersKt$$ExternalSyntheticLambda0) rememberedValue3, gapComposer);
            gapComposer.end(false);
            gapComposer.startReplaceGroup(-109522338);
            CameraWrapper.i iVar3 = new CameraWrapper.i(0, 6, MapClickListeners.class, mapClickListeners, "onMapLongClick", "getOnMapLongClick()Lkotlin/jvm/functions/Function1;");
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = MapClickListenersKt$MapClickListenerUpdater$1$6$1$1.INSTANCE;
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Function2 function22 = (Function2) ((KFunction) rememberedValue4);
            boolean changedInstance2 = gapComposer.changedInstance(iVar3);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new MapClickListenersKt$$ExternalSyntheticLambda1(iVar3);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            MapClickListenerComposeNode(iVar3, function22, (MapClickListenersKt$$ExternalSyntheticLambda1) rememberedValue5, gapComposer);
            gapComposer.end(false);
            gapComposer.startReplaceGroup(-109514282);
            CameraWrapper.i iVar4 = new CameraWrapper.i(0, 7, MapClickListeners.class, mapClickListeners, "onMapLoaded", "getOnMapLoaded()Lkotlin/jvm/functions/Function0;");
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = MapClickListenersKt$MapClickListenerUpdater$1$8$1$1.INSTANCE;
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            Function2 function23 = (Function2) ((KFunction) rememberedValue6);
            boolean changedInstance3 = gapComposer.changedInstance(iVar4);
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue7 == neverEqualPolicy) {
                rememberedValue7 = new MapClickListenersKt$$ExternalSyntheticLambda2(iVar4);
                gapComposer.updateRememberedValue(rememberedValue7);
            }
            MapClickListenerComposeNode(iVar4, function23, (MapClickListenersKt$$ExternalSyntheticLambda2) rememberedValue7, gapComposer);
            gapComposer.end(false);
            gapComposer.startReplaceGroup(-109506057);
            CameraWrapper.i iVar5 = new CameraWrapper.i(0, 8, MapClickListeners.class, mapClickListeners, "onMyLocationButtonClick", "getOnMyLocationButtonClick()Lkotlin/jvm/functions/Function0;");
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (rememberedValue8 == neverEqualPolicy) {
                rememberedValue8 = MapClickListenersKt$MapClickListenerUpdater$1$10$1$1.INSTANCE;
                gapComposer.updateRememberedValue(rememberedValue8);
            }
            Function2 function24 = (Function2) ((KFunction) rememberedValue8);
            boolean changedInstance4 = gapComposer.changedInstance(iVar5);
            Object rememberedValue9 = gapComposer.rememberedValue();
            if (changedInstance4 || rememberedValue9 == neverEqualPolicy) {
                rememberedValue9 = new MapClickListenersKt$$ExternalSyntheticLambda3(iVar5);
                gapComposer.updateRememberedValue(rememberedValue9);
            }
            MapClickListenerComposeNode(iVar5, function24, (MapClickListenersKt$$ExternalSyntheticLambda3) rememberedValue9, gapComposer);
            gapComposer.end(false);
            gapComposer.startReplaceGroup(-109497020);
            CameraWrapper.i iVar6 = new CameraWrapper.i(0, 2, MapClickListeners.class, mapClickListeners, "onMyLocationClick", "getOnMyLocationClick()Lkotlin/jvm/functions/Function1;");
            Object rememberedValue10 = gapComposer.rememberedValue();
            if (rememberedValue10 == neverEqualPolicy) {
                rememberedValue10 = MapClickListenersKt$MapClickListenerUpdater$1$12$1$1.INSTANCE;
                gapComposer.updateRememberedValue(rememberedValue10);
            }
            Function2 function25 = (Function2) ((KFunction) rememberedValue10);
            boolean changedInstance5 = gapComposer.changedInstance(iVar6);
            Object rememberedValue11 = gapComposer.rememberedValue();
            if (changedInstance5 || rememberedValue11 == neverEqualPolicy) {
                rememberedValue11 = new MapClickListenersKt$$ExternalSyntheticLambda4(iVar6);
                gapComposer.updateRememberedValue(rememberedValue11);
            }
            MapClickListenerComposeNode(iVar6, function25, (MapClickListenersKt$$ExternalSyntheticLambda4) rememberedValue11, gapComposer);
            gapComposer.end(false);
            gapComposer.startReplaceGroup(-109488810);
            CameraWrapper.i iVar7 = new CameraWrapper.i(0, 3, MapClickListeners.class, mapClickListeners, "onPOIClick", "getOnPOIClick()Lkotlin/jvm/functions/Function1;");
            Object rememberedValue12 = gapComposer.rememberedValue();
            if (rememberedValue12 == neverEqualPolicy) {
                rememberedValue12 = MapClickListenersKt$MapClickListenerUpdater$1$14$1$1.INSTANCE;
                gapComposer.updateRememberedValue(rememberedValue12);
            }
            Function2 function26 = (Function2) ((KFunction) rememberedValue12);
            boolean changedInstance6 = gapComposer.changedInstance(iVar7);
            Object rememberedValue13 = gapComposer.rememberedValue();
            if (changedInstance6 || rememberedValue13 == neverEqualPolicy) {
                rememberedValue13 = new MapClickListenersKt$$ExternalSyntheticLambda5(iVar7);
                gapComposer.updateRememberedValue(rememberedValue13);
            }
            MapClickListenerComposeNode(iVar7, function26, (MapClickListenersKt$$ExternalSyntheticLambda5) rememberedValue13, gapComposer);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkerKt$$ExternalSyntheticLambda10(i, 29);
        }
    }

    public static final String access$getSignature(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        sb.append(ArraysKt___ArraysKt.joinToString$default(parameterTypes, "", "(", ")", UtilKt$$Lambda$0.INSTANCE$20, 24));
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb.append(ReflectClassUtilKt.getDesc(returnType));
        return sb.toString();
    }

    public static final com.squareup.cash.cdf.CurrencyCode getAsCdfCurrencyCode(CurrencyCode currencyCode) {
        currencyCode.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[currencyCode.ordinal()];
        if (i == 1) {
            return com.squareup.cash.cdf.CurrencyCode.USD;
        }
        if (i == 2) {
            return com.squareup.cash.cdf.CurrencyCode.GBP;
        }
        if (i == 3) {
            return com.squareup.cash.cdf.CurrencyCode.JPY;
        }
        if (i == 4) {
            return com.squareup.cash.cdf.CurrencyCode.BTC;
        }
        if (i != 5) {
            return null;
        }
        return com.squareup.cash.cdf.CurrencyCode.CAD;
    }

    public static final UtilsKt$toCdfEvent$2 toCdfEvent(CdfEvent cdfEvent, Pair... pairArr) {
        cdfEvent.getClass();
        return new UtilsKt$toCdfEvent$2(cdfEvent, pairArr);
    }

    public static final void MapClickListenerComposeNode(MutablePropertyReference0Impl mutablePropertyReference0Impl, Function2 function2, Object obj, Composer composer) {
        Applier applier = ((GapComposer) composer).applier;
        applier.getClass();
        MapApplier mapApplier = (MapApplier) applier;
        GapComposer gapComposer = (GapComposer) composer;
        boolean changedInstance = gapComposer.changedInstance(mapApplier) | gapComposer.changedInstance(obj);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new n$$ExternalSyntheticLambda1(29, mapApplier, function2, obj);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MapClickListenerComposeNode(mutablePropertyReference0Impl, (Function0) rememberedValue, composer, 0);
    }
}
