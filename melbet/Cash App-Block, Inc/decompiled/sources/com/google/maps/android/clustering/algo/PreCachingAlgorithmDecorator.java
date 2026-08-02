package com.google.maps.android.clustering.algo;

import androidx.collection.LruCache;
import androidx.core.provider.CallbackWrapper$2;
import androidx.credentials.Credential;
import com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.projection.Point;
import com.google.maps.android.quadtree.PointQuadTree;
import com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes4.dex */
public final class PreCachingAlgorithmDecorator extends Credential {
    public final NonHierarchicalDistanceBasedAlgorithm mAlgorithm;
    public final LruCache mCache;
    public final ReentrantReadWriteLock mCacheLock;
    public final ExecutorService mExecutor;

    public PreCachingAlgorithmDecorator(NonHierarchicalDistanceBasedAlgorithm nonHierarchicalDistanceBasedAlgorithm) {
        super(8);
        this.mCache = new LruCache(5);
        this.mCacheLock = new ReentrantReadWriteLock();
        this.mExecutor = Executors.newCachedThreadPool();
        this.mAlgorithm = nonHierarchicalDistanceBasedAlgorithm;
    }

    public final boolean addItems(Collection collection) {
        boolean add;
        NonHierarchicalDistanceBasedAlgorithm nonHierarchicalDistanceBasedAlgorithm = this.mAlgorithm;
        nonHierarchicalDistanceBasedAlgorithm.getClass();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            NonHierarchicalDistanceBasedAlgorithm.QuadItem quadItem = new NonHierarchicalDistanceBasedAlgorithm.QuadItem((GoogleMapEngine.GoogleClusterItemAdapter) it.next());
            synchronized (nonHierarchicalDistanceBasedAlgorithm.mQuadTree) {
                try {
                    add = nonHierarchicalDistanceBasedAlgorithm.mItems.add(quadItem);
                    if (add) {
                        PointQuadTree pointQuadTree = nonHierarchicalDistanceBasedAlgorithm.mQuadTree;
                        pointQuadTree.getClass();
                        Point point = quadItem.mPoint;
                        if (pointQuadTree.mBounds.contains(point.x, point.y)) {
                            pointQuadTree.insert(point.x, point.y, quadItem);
                        }
                    }
                } finally {
                }
            }
            if (add) {
                z = true;
            }
        }
        if (z) {
            this.mCache.trimToSize(-1);
        }
        return z;
    }

    public final Set getClusters(float f) {
        int i = (int) f;
        Set clustersInternal = getClustersInternal(i);
        int i2 = i + 1;
        Integer valueOf = Integer.valueOf(i2);
        LruCache lruCache = this.mCache;
        Object obj = lruCache.get(valueOf);
        int i3 = 6;
        ExecutorService executorService = this.mExecutor;
        if (obj == null) {
            executorService.execute(new CallbackWrapper$2(this, i2, i3));
        }
        int i4 = i - 1;
        if (lruCache.get(Integer.valueOf(i4)) == null) {
            executorService.execute(new CallbackWrapper$2(this, i4, i3));
        }
        return clustersInternal;
    }

    public final Set getClustersInternal(int i) {
        ReentrantReadWriteLock reentrantReadWriteLock;
        ReentrantReadWriteLock reentrantReadWriteLock2 = this.mCacheLock;
        reentrantReadWriteLock2.readLock().lock();
        LruCache lruCache = this.mCache;
        Set set = (Set) lruCache.get(Integer.valueOf(i));
        reentrantReadWriteLock2.readLock().unlock();
        if (set == null) {
            reentrantReadWriteLock2.writeLock().lock();
            set = (Set) lruCache.get(Integer.valueOf(i));
            if (set == null) {
                NonHierarchicalDistanceBasedAlgorithm nonHierarchicalDistanceBasedAlgorithm = this.mAlgorithm;
                double d = 2.0d;
                double pow = (nonHierarchicalDistanceBasedAlgorithm.mMaxDistance / Math.pow(2.0d, i)) / 256.0d;
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                synchronized (nonHierarchicalDistanceBasedAlgorithm.mQuadTree) {
                    try {
                        for (NonHierarchicalDistanceBasedAlgorithm.QuadItem quadItem : nonHierarchicalDistanceBasedAlgorithm.mItems) {
                            if (!hashSet.contains(quadItem)) {
                                Point point = quadItem.mPoint;
                                double d2 = pow / d;
                                double d3 = point.x;
                                double d4 = d3 - d2;
                                double d5 = d3 + d2;
                                double d6 = point.y;
                                Bounds bounds = new Bounds(d4, d5, d6 - d2, d6 + d2);
                                PointQuadTree pointQuadTree = nonHierarchicalDistanceBasedAlgorithm.mQuadTree;
                                pointQuadTree.getClass();
                                ArrayList arrayList = new ArrayList();
                                pointQuadTree.search(bounds, arrayList);
                                if (arrayList.size() == 1) {
                                    hashSet2.add(quadItem);
                                    hashSet.add(quadItem);
                                    hashMap.put(quadItem, Double.valueOf(0.0d));
                                } else {
                                    StaticCluster staticCluster = new StaticCluster(quadItem.mClusterItem.getPosition());
                                    hashSet2.add(staticCluster);
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        NonHierarchicalDistanceBasedAlgorithm nonHierarchicalDistanceBasedAlgorithm2 = nonHierarchicalDistanceBasedAlgorithm;
                                        NonHierarchicalDistanceBasedAlgorithm.QuadItem quadItem2 = (NonHierarchicalDistanceBasedAlgorithm.QuadItem) it.next();
                                        Double d7 = (Double) hashMap.get(quadItem2);
                                        ReentrantReadWriteLock reentrantReadWriteLock3 = reentrantReadWriteLock2;
                                        Point point2 = quadItem2.mPoint;
                                        Point point3 = quadItem.mPoint;
                                        double d8 = pow;
                                        double d9 = point2.x - point3.x;
                                        double d10 = d9 * d9;
                                        double d11 = point2.y - point3.y;
                                        double d12 = (d11 * d11) + d10;
                                        if (d7 != null) {
                                            if (d7.doubleValue() < d12) {
                                                nonHierarchicalDistanceBasedAlgorithm = nonHierarchicalDistanceBasedAlgorithm2;
                                                reentrantReadWriteLock2 = reentrantReadWriteLock3;
                                                pow = d8;
                                            } else {
                                                ((StaticCluster) hashMap2.get(quadItem2)).mItems.remove(quadItem2.mClusterItem);
                                            }
                                        }
                                        hashMap.put(quadItem2, Double.valueOf(d12));
                                        staticCluster.mItems.add(quadItem2.mClusterItem);
                                        hashMap2.put(quadItem2, staticCluster);
                                        nonHierarchicalDistanceBasedAlgorithm = nonHierarchicalDistanceBasedAlgorithm2;
                                        reentrantReadWriteLock2 = reentrantReadWriteLock3;
                                        pow = d8;
                                    }
                                    hashSet.addAll(arrayList);
                                    nonHierarchicalDistanceBasedAlgorithm = nonHierarchicalDistanceBasedAlgorithm;
                                    reentrantReadWriteLock2 = reentrantReadWriteLock2;
                                    pow = pow;
                                }
                                d = 2.0d;
                            }
                        }
                        reentrantReadWriteLock = reentrantReadWriteLock2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                lruCache.put(Integer.valueOf(i), hashSet2);
                set = hashSet2;
            } else {
                reentrantReadWriteLock = reentrantReadWriteLock2;
            }
            reentrantReadWriteLock.writeLock().unlock();
        }
        return set;
    }
}
