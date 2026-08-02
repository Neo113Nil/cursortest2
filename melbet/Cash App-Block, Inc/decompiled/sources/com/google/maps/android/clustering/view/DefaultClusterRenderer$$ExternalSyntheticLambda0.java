package com.google.maps.android.clustering.view;

import androidx.compose.foundation.layout.RowScopeInstance$$ExternalSyntheticLambda0;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.clustering.Cluster;
import com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine;

/* loaded from: classes4.dex */
public final /* synthetic */ class DefaultClusterRenderer$$ExternalSyntheticLambda0 implements GoogleMap.OnMarkerClickListener, GoogleMap.OnInfoWindowClickListener, GoogleMap.OnInfoWindowLongClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultClusterRenderer f$0;

    public /* synthetic */ DefaultClusterRenderer$$ExternalSyntheticLambda0(DefaultClusterRenderer defaultClusterRenderer, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultClusterRenderer;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public void onInfoWindowClick(Marker marker) {
        DefaultClusterRenderer defaultClusterRenderer = this.f$0;
        RowScopeInstance$$ExternalSyntheticLambda0 rowScopeInstance$$ExternalSyntheticLambda0 = defaultClusterRenderer.mItemInfoWindowClickListener;
        if (rowScopeInstance$$ExternalSyntheticLambda0 != null) {
            rowScopeInstance$$ExternalSyntheticLambda0.f$0.invoke((GoogleMapEngine.GoogleClusterItemAdapter) defaultClusterRenderer.mMarkerCache.affiliateStatesMap.get(marker));
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
    public void onInfoWindowLongClick(Marker marker) {
        DefaultClusterRenderer defaultClusterRenderer = this.f$0;
        RowScopeInstance$$ExternalSyntheticLambda0 rowScopeInstance$$ExternalSyntheticLambda0 = defaultClusterRenderer.mItemInfoWindowLongClickListener;
        if (rowScopeInstance$$ExternalSyntheticLambda0 != null) {
            rowScopeInstance$$ExternalSyntheticLambda0.f$0.invoke((GoogleMapEngine.GoogleClusterItemAdapter) defaultClusterRenderer.mMarkerCache.affiliateStatesMap.get(marker));
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public boolean onMarkerClick(Marker marker) {
        int i = this.$r8$classId;
        DefaultClusterRenderer defaultClusterRenderer = this.f$0;
        switch (i) {
            case 0:
                RowScopeInstance$$ExternalSyntheticLambda0 rowScopeInstance$$ExternalSyntheticLambda0 = defaultClusterRenderer.mItemClickListener;
                if (rowScopeInstance$$ExternalSyntheticLambda0 != null) {
                    if (((Boolean) rowScopeInstance$$ExternalSyntheticLambda0.f$0.invoke((GoogleMapEngine.GoogleClusterItemAdapter) defaultClusterRenderer.mMarkerCache.affiliateStatesMap.get(marker))).booleanValue()) {
                        break;
                    }
                }
                break;
            default:
                RowScopeInstance$$ExternalSyntheticLambda0 rowScopeInstance$$ExternalSyntheticLambda02 = defaultClusterRenderer.mClickListener;
                if (rowScopeInstance$$ExternalSyntheticLambda02 != null) {
                    if (((Boolean) rowScopeInstance$$ExternalSyntheticLambda02.f$0.invoke((Cluster) defaultClusterRenderer.mClusterMarkerCache.affiliateStatesMap.get(marker))).booleanValue()) {
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
