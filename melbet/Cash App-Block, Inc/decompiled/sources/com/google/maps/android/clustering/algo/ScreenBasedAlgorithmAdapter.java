package com.google.maps.android.clustering.algo;

import androidx.credentials.Credential;
import com.google.maps.android.quadtree.PointQuadTree;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public final class ScreenBasedAlgorithmAdapter extends Credential {
    public PreCachingAlgorithmDecorator mAlgorithm;

    public final void clearItems() {
        PreCachingAlgorithmDecorator preCachingAlgorithmDecorator = this.mAlgorithm;
        NonHierarchicalDistanceBasedAlgorithm nonHierarchicalDistanceBasedAlgorithm = preCachingAlgorithmDecorator.mAlgorithm;
        synchronized (nonHierarchicalDistanceBasedAlgorithm.mQuadTree) {
            nonHierarchicalDistanceBasedAlgorithm.mItems.clear();
            PointQuadTree pointQuadTree = nonHierarchicalDistanceBasedAlgorithm.mQuadTree;
            pointQuadTree.mChildren = null;
            LinkedHashSet linkedHashSet = pointQuadTree.mItems;
            if (linkedHashSet != null) {
                linkedHashSet.clear();
            }
        }
        preCachingAlgorithmDecorator.mCache.trimToSize(-1);
    }
}
