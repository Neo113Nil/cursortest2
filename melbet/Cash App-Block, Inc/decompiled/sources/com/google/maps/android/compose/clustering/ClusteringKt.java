package com.google.maps.android.compose.clustering;

import android.content.Context;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda8;
import app.cash.local.views.sheet.MenuPickerSheetKt$$ExternalSyntheticLambda4;
import bo.app.xg$$ExternalSyntheticLambda9;
import bo.app.yf$$ExternalSyntheticLambda2;
import coil3.network.NetworkFetcher$doFetch$2;
import coil3.network.NetworkFetcher$fetch$2;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda0;
import com.google.android.gms.maps.MapView;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.CameraPositionStateKt;
import com.google.maps.android.compose.InputHandlerKt;
import com.google.maps.android.compose.MapApplier;
import com.google.maps.android.compose.MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1;
import com.google.maps.android.compose.MapEffectKt;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine;
import com.squareup.cash.wallet.views.CardTransitionKt$sceneCache$4$1$1;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda4;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KFunction;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public abstract class ClusteringKt {
    public static final StaticProvidableCompositionLocal LocalClusteringMarkerProperties = new StaticProvidableCompositionLocal(new ViewUtils$$ExternalSyntheticLambda0(18));

    /* JADX WARN: Multi-variable type inference failed */
    public static final void Clustering(Collection collection, ClusterManager clusterManager, ComposableLambdaImpl composableLambdaImpl, DefaultClusterRenderer defaultClusterRenderer, Composer composer, int i) {
        int i2;
        int i3;
        NeverEqualPolicy neverEqualPolicy;
        boolean z;
        MarkerManager markerManager = clusterManager.mMarkerManager;
        collection.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(274351384);
        int i4 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(collection) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(clusterManager) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(defaultClusterRenderer) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            int i5 = i2 >> 3;
            ResetMapListeners(clusterManager, gapComposer, i5 & 14);
            markerManager.getClass();
            boolean changedInstance = gapComposer.changedInstance(markerManager);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy2) {
                i3 = i5;
                neverEqualPolicy = neverEqualPolicy2;
                NetworkFetcher$fetch$2 networkFetcher$fetch$2 = new NetworkFetcher$fetch$2(1, markerManager, MarkerManager.class, "onMarkerClick", "onMarkerClick(Lcom/google/android/gms/maps/model/Marker;)Z", 0, 13);
                gapComposer.updateRememberedValue(networkFetcher$fetch$2);
                rememberedValue = networkFetcher$fetch$2;
            } else {
                i3 = i5;
                neverEqualPolicy = neverEqualPolicy2;
            }
            Function1 function1 = (Function1) ((KFunction) rememberedValue);
            markerManager.getClass();
            boolean changedInstance2 = gapComposer.changedInstance(markerManager);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                NetworkFetcher$fetch$2 networkFetcher$fetch$22 = new NetworkFetcher$fetch$2(1, markerManager, MarkerManager.class, "onInfoWindowClick", "onInfoWindowClick(Lcom/google/android/gms/maps/model/Marker;)V", 0, 14);
                gapComposer.updateRememberedValue(networkFetcher$fetch$22);
                rememberedValue2 = networkFetcher$fetch$22;
            }
            Function1 function12 = (Function1) ((KFunction) rememberedValue2);
            markerManager.getClass();
            boolean changedInstance3 = gapComposer.changedInstance(markerManager);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                NetworkFetcher$fetch$2 networkFetcher$fetch$23 = new NetworkFetcher$fetch$2(1, markerManager, MarkerManager.class, "onInfoWindowLongClick", "onInfoWindowLongClick(Lcom/google/android/gms/maps/model/Marker;)V", 0, 15);
                gapComposer.updateRememberedValue(networkFetcher$fetch$23);
                rememberedValue3 = networkFetcher$fetch$23;
            }
            Function1 function13 = (Function1) ((KFunction) rememberedValue3);
            markerManager.getClass();
            boolean changedInstance4 = gapComposer.changedInstance(markerManager);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance4 || rememberedValue4 == neverEqualPolicy) {
                NetworkFetcher$fetch$2 networkFetcher$fetch$24 = new NetworkFetcher$fetch$2(1, markerManager, MarkerManager.class, "onMarkerDrag", "onMarkerDrag(Lcom/google/android/gms/maps/model/Marker;)V", 0, 16);
                gapComposer.updateRememberedValue(networkFetcher$fetch$24);
                rememberedValue4 = networkFetcher$fetch$24;
            }
            Function1 function14 = (Function1) ((KFunction) rememberedValue4);
            markerManager.getClass();
            boolean changedInstance5 = gapComposer.changedInstance(markerManager);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance5 || rememberedValue5 == neverEqualPolicy) {
                NetworkFetcher$fetch$2 networkFetcher$fetch$25 = new NetworkFetcher$fetch$2(1, markerManager, MarkerManager.class, "onMarkerDragEnd", "onMarkerDragEnd(Lcom/google/android/gms/maps/model/Marker;)V", 0, 17);
                gapComposer.updateRememberedValue(networkFetcher$fetch$25);
                rememberedValue5 = networkFetcher$fetch$25;
            }
            Function1 function15 = (Function1) ((KFunction) rememberedValue5);
            markerManager.getClass();
            boolean changedInstance6 = gapComposer.changedInstance(markerManager);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changedInstance6 || rememberedValue6 == neverEqualPolicy) {
                NetworkFetcher$fetch$2 networkFetcher$fetch$26 = new NetworkFetcher$fetch$2(1, markerManager, MarkerManager.class, "onMarkerDragStart", "onMarkerDragStart(Lcom/google/android/gms/maps/model/Marker;)V", 0, 18);
                gapComposer.updateRememberedValue(networkFetcher$fetch$26);
                rememberedValue6 = networkFetcher$fetch$26;
            }
            InputHandlerKt.InputHandler(function1, function12, function13, function14, function15, (Function1) ((KFunction) rememberedValue6), gapComposer, 0);
            CameraPositionState cameraPositionState = (CameraPositionState) gapComposer.consume(CameraPositionStateKt.LocalCameraPositionState);
            boolean changedInstance7 = gapComposer.changedInstance(cameraPositionState) | gapComposer.changedInstance(clusterManager);
            Object rememberedValue7 = gapComposer.rememberedValue();
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (changedInstance7 || rememberedValue7 == neverEqualPolicy) {
                rememberedValue7 = new NetworkFetcher$doFetch$2(cameraPositionState, clusterManager, objArr == true ? 1 : 0, i4);
                gapComposer.updateRememberedValue(rememberedValue7);
            }
            Updater.LaunchedEffect(gapComposer, cameraPositionState, (Function2) rememberedValue7);
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(collection, gapComposer);
            boolean changed = gapComposer.changed(rememberUpdatedState) | gapComposer.changedInstance(clusterManager);
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (changed || rememberedValue8 == neverEqualPolicy) {
                rememberedValue8 = new NetworkFetcher$doFetch$2(rememberUpdatedState, clusterManager, objArr2 == true ? 1 : 0, 5);
                gapComposer.updateRememberedValue(rememberedValue8);
            }
            Updater.LaunchedEffect(gapComposer, rememberUpdatedState, (Function2) rememberedValue8);
            boolean changedInstance8 = gapComposer.changedInstance(clusterManager);
            Object rememberedValue9 = gapComposer.rememberedValue();
            if (changedInstance8 || rememberedValue9 == neverEqualPolicy) {
                rememberedValue9 = new xg$$ExternalSyntheticLambda9(clusterManager, 19);
                gapComposer.updateRememberedValue(rememberedValue9);
            }
            Updater.DisposableEffect(rememberUpdatedState, (Function1) rememberedValue9, gapComposer);
            DefaultClusterRenderer defaultClusterRenderer2 = defaultClusterRenderer == null ? clusterManager.mRenderer : defaultClusterRenderer;
            ComposeUiClusterRenderer composeUiClusterRenderer = defaultClusterRenderer2 instanceof ComposeUiClusterRenderer ? (ComposeUiClusterRenderer) defaultClusterRenderer2 : null;
            MutableState mutableState = composeUiClusterRenderer != null ? composeUiClusterRenderer.unclusteredItems : null;
            if (mutableState == null) {
                gapComposer.startReplaceGroup(-119020733);
                Object rememberedValue10 = gapComposer.rememberedValue();
                if (rememberedValue10 == neverEqualPolicy) {
                    rememberedValue10 = Updater.mutableStateOf$default(EmptySet.INSTANCE);
                    gapComposer.updateRememberedValue(rememberedValue10);
                }
                mutableState = (MutableState) rememberedValue10;
                z = false;
            } else {
                z = false;
                gapComposer.startReplaceGroup(1658726189);
            }
            gapComposer.end(z);
            Iterator it = ((Set) mutableState.getValue()).iterator();
            while (it.hasNext()) {
                composableLambdaImpl.invoke((GoogleMapEngine.GoogleClusterItemAdapter) it.next(), gapComposer, Integer.valueOf(i3 & 112));
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(collection, clusterManager, composableLambdaImpl, defaultClusterRenderer, i);
        }
    }

    /* renamed from: Clustering-VvsazsQ, reason: not valid java name */
    public static final void m2059ClusteringVvsazsQ(final Collection collection, final Function1 function1, final Function1 function12, Function1 function13, Function1 function14, final Function3 function3, final Function3 function32, long j, long j2, Function3 function33, final Function1 function15, Composer composer, final int i) {
        final Function1 function16;
        final Function1 function17;
        final long j3;
        final long j4;
        final Function3 function34;
        ClusterManager clusterManager;
        DefaultClusterRenderer defaultClusterRenderer;
        Function1 function18;
        Function1 function19;
        long j5;
        long j6;
        Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
        collection.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1278191865);
        int i2 = 2;
        int i3 = i | (gapComposer.changedInstance(collection) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(function12) ? 256 : 128) | 918580224;
        if (gapComposer.shouldExecute(i3 & 1, (306783379 & i3) != 306783378)) {
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = new MarkerKt$$ExternalSyntheticLambda2(i2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function110 = (Function1) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = new MarkerKt$$ExternalSyntheticLambda2(3);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function1 function111 = (Function1) rememberedValue2;
            long floatToRawIntBits = (Float.floatToRawIntBits(1.0f) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(0.5f) << 32);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(1.0f) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(0.5f) << 32);
            ProvidableCompositionLocal providableCompositionLocal = AndroidCompositionLocals_androidKt.LocalContext;
            Context context = (Context) gapComposer.consume(providableCompositionLocal);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == obj) {
                rememberedValue3 = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState = (MutableState) rememberedValue3;
            boolean changedInstance = gapComposer.changedInstance(context);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue4 == obj) {
                rememberedValue4 = new CardModelView$getActiveHeat$2$2(mutableState, context, (Continuation) null);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            MapEffectKt.MapEffect(context, (Function3) rememberedValue4, gapComposer, 0);
            ClusterManager clusterManager2 = (ClusterManager) mutableState.getValue();
            gapComposer.startReplaceGroup(28053112);
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(function3, gapComposer);
            MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(function32, gapComposer);
            MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(new Offset(floatToRawIntBits), gapComposer);
            MutableState rememberUpdatedState4 = Updater.rememberUpdatedState(new Offset(floatToRawIntBits2), gapComposer);
            MutableState rememberUpdatedState5 = Updater.rememberUpdatedState(valueOf, gapComposer);
            MutableState rememberUpdatedState6 = Updater.rememberUpdatedState(valueOf, gapComposer);
            Context context2 = (Context) gapComposer.consume(providableCompositionLocal);
            Applier applier = gapComposer.applier;
            applier.getClass();
            MapView mapView = ((MapApplier) applier).mapView;
            GapComposer.CompositionContextImpl buildContext = gapComposer.buildContext();
            boolean changed = gapComposer.changed(buildContext);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changed || rememberedValue5 == obj) {
                rememberedValue5 = new MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1(mapView, buildContext);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            MutableState rememberUpdatedState7 = Updater.rememberUpdatedState((MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1) rememberedValue5, gapComposer);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (rememberedValue6 == obj) {
                rememberedValue6 = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            MutableState mutableState2 = (MutableState) rememberedValue6;
            if (clusterManager2 == null) {
                gapComposer.end(false);
                defaultClusterRenderer = null;
                clusterManager = clusterManager2;
            } else {
                boolean changedInstance2 = gapComposer.changedInstance(context2) | gapComposer.changedInstance(clusterManager2) | gapComposer.changed(rememberUpdatedState7) | gapComposer.changed(rememberUpdatedState) | gapComposer.changed(rememberUpdatedState2) | gapComposer.changed(rememberUpdatedState3) | gapComposer.changed(rememberUpdatedState4) | gapComposer.changed(rememberUpdatedState5) | gapComposer.changed(rememberUpdatedState6);
                Object rememberedValue7 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue7 == obj) {
                    rememberedValue7 = new ClusteringKt$rememberClusterRenderer$2$1(context2, clusterManager2, rememberUpdatedState7, rememberUpdatedState, rememberUpdatedState2, rememberUpdatedState3, rememberUpdatedState4, rememberUpdatedState5, rememberUpdatedState6, mutableState2, null);
                    clusterManager = clusterManager2;
                    gapComposer.updateRememberedValue(rememberedValue7);
                } else {
                    clusterManager = clusterManager2;
                }
                MapEffectKt.MapEffect(context2, (Function3) rememberedValue7, gapComposer, 0);
                DefaultClusterRenderer defaultClusterRenderer2 = (DefaultClusterRenderer) mutableState2.getValue();
                gapComposer.end(false);
                defaultClusterRenderer = defaultClusterRenderer2;
            }
            boolean changedInstance3 = gapComposer.changedInstance(clusterManager) | gapComposer.changedInstance(defaultClusterRenderer) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue8 == obj) {
                function18 = function111;
                function19 = function110;
                j5 = floatToRawIntBits2;
                j6 = floatToRawIntBits;
                Object heroCardViewKt$$ExternalSyntheticLambda4 = new HeroCardViewKt$$ExternalSyntheticLambda4(clusterManager, defaultClusterRenderer, function1, function12, function19, function18, function15, 2);
                gapComposer.updateRememberedValue(heroCardViewKt$$ExternalSyntheticLambda4);
                rememberedValue8 = heroCardViewKt$$ExternalSyntheticLambda4;
            } else {
                function18 = function111;
                function19 = function110;
                j5 = floatToRawIntBits2;
                j6 = floatToRawIntBits;
            }
            Updater.SideEffect((Function0) rememberedValue8, gapComposer);
            ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$ClusteringKt.lambda$20936884;
            if (clusterManager == null || defaultClusterRenderer == null) {
                gapComposer.startReplaceGroup(568111675);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(567918514);
                Clustering(collection, clusterManager, composableLambdaImpl, defaultClusterRenderer, gapComposer, (i3 & 14) | MLKEMEngine.KyberPolyBytes);
                gapComposer.end(false);
            }
            function34 = composableLambdaImpl;
            function16 = function19;
            function17 = function18;
            j3 = j6;
            j4 = j5;
        } else {
            gapComposer.skipToGroupEnd();
            function16 = function13;
            function17 = function14;
            j3 = j;
            j4 = j2;
            function34 = function33;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(collection, function1, function12, function16, function17, function3, function32, j3, j4, function34, function15, i) { // from class: com.google.maps.android.compose.clustering.ClusteringKt$$ExternalSyntheticLambda4
                public final /* synthetic */ Collection f$0;
                public final /* synthetic */ Function1 f$1;
                public final /* synthetic */ Function3 f$11;
                public final /* synthetic */ Function1 f$12;
                public final /* synthetic */ Function1 f$2;
                public final /* synthetic */ Function1 f$3;
                public final /* synthetic */ Function1 f$4;
                public final /* synthetic */ Function3 f$5;
                public final /* synthetic */ Function3 f$6;
                public final /* synthetic */ long f$7;
                public final /* synthetic */ long f$8;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1769473);
                    ClusteringKt.m2059ClusteringVvsazsQ(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$11, this.f$12, (Composer) obj2, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: ClusteringMarkerProperties-MDSh_HA, reason: not valid java name */
    public static final void m2060ClusteringMarkerPropertiesMDSh_HA(Offset offset, Float f, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1217442032);
        int i2 = (gapComposer.changed(offset) ? 4 : 2) | i | (gapComposer.changed(f) ? 32 : 16);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ClusteringMarkerProperties clusteringMarkerProperties = (ClusteringMarkerProperties) gapComposer.consume(LocalClusteringMarkerProperties);
            boolean changed = ((i2 & 14) == 4) | gapComposer.changed(clusteringMarkerProperties) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CopyCodeKt$$ExternalSyntheticLambda4(i3, clusteringMarkerProperties, offset, f);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.SideEffect((Function0) rememberedValue, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuPickerSheetKt$$ExternalSyntheticLambda4(offset, f, i, 6);
        }
    }

    public static final void ResetMapListeners(ClusterManager clusterManager, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-895341247);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(clusterManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Applier applier = gapComposer.applier;
            applier.getClass();
            MapApplier mapApplier = (MapApplier) applier;
            boolean changed = gapComposer.changed(mapApplier);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new yf$$ExternalSyntheticLambda2(mapApplier, 12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            boolean changed2 = gapComposer.changed(function0);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CardTransitionKt$sceneCache$4$1$1(function0, null, 2);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(clusterManager, function0, (Function2) rememberedValue2, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(clusterManager, i, i3);
        }
    }
}
