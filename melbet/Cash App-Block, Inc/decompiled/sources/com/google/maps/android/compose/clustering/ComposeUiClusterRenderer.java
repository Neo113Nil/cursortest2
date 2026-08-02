package com.google.maps.android.compose.clustering;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import bo.app.t7$$ExternalSyntheticLambda4;
import coil3.RealImageLoader$execute$2;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import com.google.maps.android.compose.MapComposeViewRenderKt;
import com.google.maps.android.compose.MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1;
import com.google.maps.android.compose.clustering.ComposeUiClusterRenderer;
import com.squareup.cash.R;
import com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine;
import com.withpersona.sdk2.camera.feed.CameraFeedKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class ComposeUiClusterRenderer extends DefaultClusterRenderer {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final MutableState clusterContentAnchorState;
    public final MutableState clusterContentState;
    public final MutableState clusterContentZIndexState;
    public final MutableState clusterItemContentAnchorState;
    public final MutableState clusterItemContentState;
    public final MutableState clusterItemContentZIndexState;
    public final Context context;
    public final Canvas fakeCanvas;
    public final ComposeUiClusterRenderer$fakeLifecycleOwner$1 fakeLifecycleOwner;
    public final LinkedHashMap keysToViews;
    public final CoroutineScope scope;
    public final ParcelableSnapshotMutableState unclusteredItems;
    public final MutableState viewRendererState;

    public final class InvalidatingComposeView extends AbstractComposeView {
        public final ComposableLambdaImpl content;
        public Function0 onInvalidate;
        public final ClusteringMarkerProperties properties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidatingComposeView(Context context, ComposableLambdaImpl composableLambdaImpl) {
            super(context, null, 6, 0);
            context.getClass();
            this.content = composableLambdaImpl;
            this.properties = new ClusteringMarkerProperties();
        }

        @Override // androidx.compose.ui.platform.AbstractComposeView
        public final void Content(Composer composer, int i) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(77023790);
            int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
            if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
                ClusteringMarkerProperties clusteringMarkerProperties = this.properties;
                Offset offset = (Offset) clusteringMarkerProperties.anchor$delegate.getValue();
                Float f = (Float) clusteringMarkerProperties.zIndex$delegate.getValue();
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new DiskLruCache$launchCleanup$1(this, (Continuation) null, 25);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.LaunchedEffect(offset, f, (Function2) rememberedValue, gapComposer);
                Updater.CompositionLocalProvider(ClusteringKt.LocalClusteringMarkerProperties.defaultProvidedValue$runtime(clusteringMarkerProperties), Expect_jvmKt.rememberComposableLambda(-1686266130, new ComposeUiClusterRenderer$InvalidatingComposeView$$ExternalSyntheticLambda0(this), gapComposer), gapComposer, 56);
            } else {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new ComposeUiClusterRenderer$InvalidatingComposeView$$ExternalSyntheticLambda0(this, i);
            }
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public final void onDescendantInvalidated(View view, View view2) {
            view.getClass();
            view2.getClass();
            super.onDescendantInvalidated(view, view2);
            Function0 function0 = this.onInvalidate;
            if (function0 != null) {
                function0.invoke();
            }
        }

        public final void setOnInvalidate(Function0<Unit> function0) {
            this.onInvalidate = function0;
        }
    }

    public final class ViewInfo {
        public final t7$$ExternalSyntheticLambda4 onRemove;
        public final InvalidatingComposeView view;

        public ViewInfo(InvalidatingComposeView invalidatingComposeView, t7$$ExternalSyntheticLambda4 t7__externalsyntheticlambda4) {
            this.view = invalidatingComposeView;
            this.onRemove = t7__externalsyntheticlambda4;
        }
    }

    public abstract class ViewKey {

        public final class Cluster extends ViewKey {
            public final com.google.maps.android.clustering.Cluster cluster;

            public Cluster(com.google.maps.android.clustering.Cluster cluster) {
                cluster.getClass();
                this.cluster = cluster;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Cluster) && Intrinsics.areEqual(this.cluster, ((Cluster) obj).cluster);
            }

            public final int hashCode() {
                return this.cluster.hashCode();
            }

            public final String toString() {
                return "Cluster(cluster=" + this.cluster + ')';
            }
        }

        public final class Item extends ViewKey {
            public final GoogleMapEngine.GoogleClusterItemAdapter item;

            public Item(GoogleMapEngine.GoogleClusterItemAdapter googleClusterItemAdapter) {
                googleClusterItemAdapter.getClass();
                this.item = googleClusterItemAdapter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Item) && Intrinsics.areEqual(this.item, ((Item) obj).item);
            }

            public final int hashCode() {
                return this.item.hashCode();
            }

            public final String toString() {
                return "Item(item=" + this.item + ')';
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.maps.android.compose.clustering.ComposeUiClusterRenderer$fakeLifecycleOwner$1] */
    public ComposeUiClusterRenderer(Context context, CoroutineScope coroutineScope, GoogleMap googleMap, ClusterManager clusterManager, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7) {
        super(context, googleMap, clusterManager);
        context.getClass();
        coroutineScope.getClass();
        googleMap.getClass();
        this.context = context;
        this.scope = coroutineScope;
        this.viewRendererState = mutableState;
        this.clusterContentState = mutableState2;
        this.clusterItemContentState = mutableState3;
        this.clusterContentAnchorState = mutableState4;
        this.clusterItemContentAnchorState = mutableState5;
        this.clusterContentZIndexState = mutableState6;
        this.clusterItemContentZIndexState = mutableState7;
        this.unclusteredItems = Updater.mutableStateOf$default(EmptySet.INSTANCE);
        this.fakeCanvas = new Canvas();
        this.keysToViews = new LinkedHashMap();
        this.fakeLifecycleOwner = new LifecycleOwner() { // from class: com.google.maps.android.compose.clustering.ComposeUiClusterRenderer$fakeLifecycleOwner$1
            public final LifecycleRegistry lifecycleRegistry;

            {
                LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this, true);
                lifecycleRegistry.setCurrentState(Lifecycle.State.RESUMED);
                this.lifecycleRegistry = lifecycleRegistry;
            }

            @Override // androidx.lifecycle.LifecycleOwner
            public final Lifecycle getLifecycle() {
                return this.lifecycleRegistry;
            }
        };
    }

    public final Set computeViewKeys(Cluster cluster) {
        if (shouldRenderAsCluster(cluster)) {
            return this.clusterContentState.getValue() != null ? SetsKt__SetsJVMKt.setOf(new ViewKey.Cluster(cluster)) : EmptySet.INSTANCE;
        }
        if (this.clusterItemContentState.getValue() == null) {
            return EmptySet.INSTANCE;
        }
        Collection<GoogleMapEngine.GoogleClusterItemAdapter> items = cluster.getItems();
        items.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (GoogleMapEngine.GoogleClusterItemAdapter googleClusterItemAdapter : items) {
            googleClusterItemAdapter.getClass();
            linkedHashSet.add(new ViewKey.Item(googleClusterItemAdapter));
        }
        return linkedHashSet;
    }

    public final ViewInfo createAndAddView(final ViewKey viewKey) {
        ComposableLambdaImpl composableLambdaImpl;
        final int i = 1;
        if (viewKey instanceof ViewKey.Cluster) {
            final int i2 = 0;
            composableLambdaImpl = new ComposableLambdaImpl(new Function2(this) { // from class: com.google.maps.android.compose.clustering.ComposeUiClusterRenderer$$ExternalSyntheticLambda0
                public final /* synthetic */ ComposeUiClusterRenderer f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i3 = i2;
                    ComposeUiClusterRenderer.ViewKey viewKey2 = viewKey;
                    ComposeUiClusterRenderer composeUiClusterRenderer = this.f$0;
                    Composer composer = (Composer) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i3) {
                        case 0:
                            GapComposer gapComposer = (GapComposer) composer;
                            if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Function3 function3 = (Function3) composeUiClusterRenderer.clusterContentState.getValue();
                                if (function3 == null) {
                                    gapComposer.startReplaceGroup(776287182);
                                } else {
                                    gapComposer.startReplaceGroup(1133420179);
                                    function3.invoke(((ComposeUiClusterRenderer.ViewKey.Cluster) viewKey2).cluster, gapComposer, 0);
                                }
                                gapComposer.end(false);
                            } else {
                                gapComposer.skipToGroupEnd();
                            }
                            break;
                        default:
                            GapComposer gapComposer2 = (GapComposer) composer;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Function3 function32 = (Function3) composeUiClusterRenderer.clusterItemContentState.getValue();
                                if (function32 == null) {
                                    gapComposer2.startReplaceGroup(941670042);
                                } else {
                                    gapComposer2.startReplaceGroup(-2047833529);
                                    function32.invoke(((ComposeUiClusterRenderer.ViewKey.Item) viewKey2).item, gapComposer2, 0);
                                }
                                gapComposer2.end(false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, true, -231222560);
        } else {
            if (!(viewKey instanceof ViewKey.Item)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            composableLambdaImpl = new ComposableLambdaImpl(new Function2(this) { // from class: com.google.maps.android.compose.clustering.ComposeUiClusterRenderer$$ExternalSyntheticLambda0
                public final /* synthetic */ ComposeUiClusterRenderer f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i3 = i;
                    ComposeUiClusterRenderer.ViewKey viewKey2 = viewKey;
                    ComposeUiClusterRenderer composeUiClusterRenderer = this.f$0;
                    Composer composer = (Composer) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i3) {
                        case 0:
                            GapComposer gapComposer = (GapComposer) composer;
                            if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Function3 function3 = (Function3) composeUiClusterRenderer.clusterContentState.getValue();
                                if (function3 == null) {
                                    gapComposer.startReplaceGroup(776287182);
                                } else {
                                    gapComposer.startReplaceGroup(1133420179);
                                    function3.invoke(((ComposeUiClusterRenderer.ViewKey.Cluster) viewKey2).cluster, gapComposer, 0);
                                }
                                gapComposer.end(false);
                            } else {
                                gapComposer.skipToGroupEnd();
                            }
                            break;
                        default:
                            GapComposer gapComposer2 = (GapComposer) composer;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Function3 function32 = (Function3) composeUiClusterRenderer.clusterItemContentState.getValue();
                                if (function32 == null) {
                                    gapComposer2.startReplaceGroup(941670042);
                                } else {
                                    gapComposer2.startReplaceGroup(-2047833529);
                                    function32.invoke(((ComposeUiClusterRenderer.ViewKey.Item) viewKey2).item, gapComposer2, 0);
                                }
                                gapComposer2.end(false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, true, -1883693097);
        }
        InvalidatingComposeView invalidatingComposeView = new InvalidatingComposeView(this.context, composableLambdaImpl);
        invalidatingComposeView.setTag(R.id.view_tree_lifecycle_owner, this.fakeLifecycleOwner);
        MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1 mapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1 = (MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1) this.viewRendererState.getValue();
        mapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1.getClass();
        ViewInfo viewInfo = new ViewInfo(invalidatingComposeView, new t7$$ExternalSyntheticLambda4(25, JobKt.launch$default(this.scope, null, null, new RealImageLoader$execute$2(this, viewKey, invalidatingComposeView, null, 27), 3), MapComposeViewRenderKt.startRenderingComposeView(mapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1.$mapView, invalidatingComposeView, mapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1.$compositionContext)));
        this.keysToViews.put(viewKey, viewInfo);
        return viewInfo;
    }

    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
    public final BitmapDescriptor getDescriptorForCluster(Cluster cluster) {
        Object obj;
        if (this.clusterContentState.getValue() == null) {
            return super.getDescriptorForCluster(cluster);
        }
        Iterator it = this.keysToViews.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ViewKey viewKey = (ViewKey) ((Map.Entry) obj).getKey();
            ViewKey.Cluster cluster2 = viewKey instanceof ViewKey.Cluster ? (ViewKey.Cluster) viewKey : null;
            if (Intrinsics.areEqual(cluster2 != null ? cluster2.cluster : null, cluster)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        ViewInfo viewInfo = entry != null ? (ViewInfo) entry.getValue() : null;
        if (viewInfo != null) {
            return renderViewToBitmapDescriptor(viewInfo.view);
        }
        ViewKey viewKey2 = (ViewKey) CollectionsKt.firstOrNull(computeViewKeys(cluster));
        return viewKey2 != null ? renderViewToBitmapDescriptor(createAndAddView(viewKey2).view) : super.getDescriptorForCluster(cluster);
    }

    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
    public final void onBeforeClusterItemRendered(GoogleMapEngine.GoogleClusterItemAdapter googleClusterItemAdapter, MarkerOptions markerOptions) {
        Object obj;
        ViewInfo createAndAddView;
        googleClusterItemAdapter.getClass();
        if (this.clusterItemContentState.getValue() != null) {
            Iterator it = this.keysToViews.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                ViewKey viewKey = (ViewKey) ((Map.Entry) next).getKey();
                ViewKey.Item item = viewKey instanceof ViewKey.Item ? (ViewKey.Item) viewKey : null;
                if (Intrinsics.areEqual(item != null ? item.item : null, googleClusterItemAdapter)) {
                    obj = next;
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry == null || (createAndAddView = (ViewInfo) entry.getValue()) == null) {
                createAndAddView = createAndAddView(new ViewKey.Item(googleClusterItemAdapter));
            }
            markerOptions.zzd = renderViewToBitmapDescriptor(createAndAddView.view);
            long j = ((Offset) this.clusterItemContentAnchorState.getValue()).packedValue;
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
            markerOptions.zze = intBitsToFloat;
            markerOptions.zzf = intBitsToFloat2;
            markerOptions.zzn = ((Number) this.clusterItemContentZIndexState.getValue()).floatValue();
        }
    }

    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
    public final void onBeforeClusterRendered(Cluster cluster, MarkerOptions markerOptions) {
        super.onBeforeClusterRendered(cluster, markerOptions);
        if (this.clusterContentState.getValue() != null) {
            long j = ((Offset) this.clusterContentAnchorState.getValue()).packedValue;
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
            markerOptions.zze = intBitsToFloat;
            markerOptions.zzf = intBitsToFloat2;
            markerOptions.zzn = ((Number) this.clusterContentZIndexState.getValue()).floatValue();
        }
    }

    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
    public final void onClustersChanged(Set set) {
        set.getClass();
        super.onClustersChanged(set);
        Set set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set2) {
            if (!shouldRenderAsCluster((Cluster) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Collection items = ((Cluster) it.next()).getItems();
            items.getClass();
            CollectionsKt__MutableCollectionsKt.addAll(items, arrayList2);
        }
        this.unclusteredItems.setValue(CollectionsKt.toSet(arrayList2));
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(computeViewKeys((Cluster) it2.next()), arrayList3);
        }
        LinkedHashMap linkedHashMap = this.keysToViews;
        Iterator it3 = linkedHashMap.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            ViewKey viewKey = (ViewKey) entry.getKey();
            ViewInfo viewInfo = (ViewInfo) entry.getValue();
            if (!arrayList3.contains(viewKey)) {
                it3.remove();
                viewInfo.onRemove.invoke();
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            ViewKey viewKey2 = (ViewKey) it4.next();
            if (!linkedHashMap.keySet().contains(viewKey2)) {
                createAndAddView(viewKey2);
            }
        }
    }

    public final BitmapDescriptor renderViewToBitmapDescriptor(AbstractComposeView abstractComposeView) {
        abstractComposeView.draw(this.fakeCanvas);
        ViewParent parent = abstractComposeView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return CameraFeedKt.fromBitmap(Bitmap.createBitmap(20, 20, Bitmap.Config.ARGB_8888));
        }
        abstractComposeView.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), PKIFailureInfo.systemUnavail), View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), PKIFailureInfo.systemUnavail));
        abstractComposeView.layout(0, 0, abstractComposeView.getMeasuredWidth(), abstractComposeView.getMeasuredHeight());
        int measuredWidth = abstractComposeView.getMeasuredWidth();
        Integer valueOf = Integer.valueOf(measuredWidth);
        if (measuredWidth <= 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 1;
        int measuredHeight = abstractComposeView.getMeasuredHeight();
        Integer valueOf2 = measuredHeight > 0 ? Integer.valueOf(measuredHeight) : null;
        Bitmap createBitmap = Bitmap.createBitmap(intValue, valueOf2 != null ? valueOf2.intValue() : 1, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        abstractComposeView.draw(new Canvas(createBitmap));
        return CameraFeedKt.fromBitmap(createBitmap);
    }
}
