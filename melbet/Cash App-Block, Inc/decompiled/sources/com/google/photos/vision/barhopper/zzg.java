package com.google.photos.vision.barhopper;

import androidx.collection.SieveCacheKt;
import androidx.collection.SparseArrayCompat;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;

/* loaded from: classes6.dex */
public abstract class zzg {
    public static final Object lastOrNull(SparseArrayCompat sparseArrayCompat) {
        if (sparseArrayCompat.size() == 0) {
            return null;
        }
        Object commonGet = SieveCacheKt.commonGet(sparseArrayCompat, sparseArrayCompat.keyAt(sparseArrayCompat.size() - 1));
        commonGet.getClass();
        return commonGet;
    }

    public static ImmutableList.SubList subList(AbstractPersistentList abstractPersistentList, int i, int i2) {
        return new ImmutableList.SubList(abstractPersistentList, i, i2);
    }

    public static int zza(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }
}
