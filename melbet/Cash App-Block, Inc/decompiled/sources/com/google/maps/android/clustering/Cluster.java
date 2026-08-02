package com.google.maps.android.clustering;

import com.google.android.gms.maps.model.LatLng;
import java.util.Collection;

/* loaded from: classes4.dex */
public interface Cluster {
    Collection getItems();

    LatLng getPosition();

    int getSize();
}
