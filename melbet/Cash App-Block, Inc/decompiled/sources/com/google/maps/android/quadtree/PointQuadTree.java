package com.google.maps.android.quadtree;

import com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.projection.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public final class PointQuadTree {
    public final Bounds mBounds;
    public ArrayList mChildren;
    public final int mDepth;
    public LinkedHashSet mItems;

    public PointQuadTree(Bounds bounds, int i) {
        this.mBounds = bounds;
        this.mDepth = i;
    }

    public final void insert(double d, double d2, NonHierarchicalDistanceBasedAlgorithm.QuadItem quadItem) {
        int i;
        ArrayList arrayList = this.mChildren;
        Bounds bounds = this.mBounds;
        if (arrayList != null) {
            double d3 = bounds.midY;
            double d4 = bounds.midX;
            if (d2 < d3) {
                if (d < d4) {
                    ((PointQuadTree) arrayList.get(0)).insert(d, d2, quadItem);
                    return;
                } else {
                    ((PointQuadTree) arrayList.get(1)).insert(d, d2, quadItem);
                    return;
                }
            }
            if (d < d4) {
                ((PointQuadTree) arrayList.get(2)).insert(d, d2, quadItem);
                return;
            } else {
                ((PointQuadTree) arrayList.get(3)).insert(d, d2, quadItem);
                return;
            }
        }
        if (this.mItems == null) {
            this.mItems = new LinkedHashSet();
        }
        LinkedHashSet linkedHashSet = this.mItems;
        linkedHashSet.getClass();
        linkedHashSet.add(quadItem);
        LinkedHashSet linkedHashSet2 = this.mItems;
        linkedHashSet2.getClass();
        if (linkedHashSet2.size() <= 50 || (i = this.mDepth) >= 40) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(4);
        this.mChildren = arrayList2;
        int i2 = i + 1;
        arrayList2.add(new PointQuadTree(new Bounds(bounds.minX, bounds.midX, bounds.minY, bounds.midY), i2));
        ArrayList arrayList3 = this.mChildren;
        arrayList3.getClass();
        arrayList3.add(new PointQuadTree(new Bounds(bounds.midX, bounds.maxX, bounds.minY, bounds.midY), i2));
        ArrayList arrayList4 = this.mChildren;
        arrayList4.getClass();
        arrayList4.add(new PointQuadTree(new Bounds(bounds.minX, bounds.midX, bounds.midY, bounds.maxY), i2));
        ArrayList arrayList5 = this.mChildren;
        arrayList5.getClass();
        arrayList5.add(new PointQuadTree(new Bounds(bounds.midX, bounds.maxX, bounds.midY, bounds.maxY), i2));
        LinkedHashSet<NonHierarchicalDistanceBasedAlgorithm.QuadItem> linkedHashSet3 = this.mItems;
        this.mItems = null;
        if (linkedHashSet3 != null) {
            for (NonHierarchicalDistanceBasedAlgorithm.QuadItem quadItem2 : linkedHashSet3) {
                Point point = quadItem2.mPoint;
                insert(point.x, point.y, quadItem2);
            }
        }
    }

    public final void search(Bounds bounds, ArrayList arrayList) {
        double d = bounds.minX;
        double d2 = bounds.maxX;
        double d3 = bounds.minY;
        double d4 = bounds.maxY;
        Bounds bounds2 = this.mBounds;
        double d5 = bounds2.maxX;
        if (d < d5) {
            double d6 = bounds2.minX;
            if (d6 < d2) {
                double d7 = bounds2.maxY;
                if (d3 < d7) {
                    double d8 = bounds2.minY;
                    if (d8 < d4) {
                        ArrayList arrayList2 = this.mChildren;
                        if (arrayList2 != null) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                ((PointQuadTree) it.next()).search(bounds, arrayList);
                            }
                            return;
                        }
                        LinkedHashSet<NonHierarchicalDistanceBasedAlgorithm.QuadItem> linkedHashSet = this.mItems;
                        if (linkedHashSet != null) {
                            if (d6 >= d && d5 <= d2 && d8 >= d3 && d7 <= d4) {
                                linkedHashSet.getClass();
                                arrayList.addAll(linkedHashSet);
                                return;
                            }
                            linkedHashSet.getClass();
                            for (NonHierarchicalDistanceBasedAlgorithm.QuadItem quadItem : linkedHashSet) {
                                Point point = quadItem.mPoint;
                                point.getClass();
                                if (bounds.contains(point.x, point.y)) {
                                    arrayList.add(quadItem);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
