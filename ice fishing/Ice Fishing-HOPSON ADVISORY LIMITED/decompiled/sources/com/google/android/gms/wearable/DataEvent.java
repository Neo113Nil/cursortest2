package com.google.android.gms.wearable;

import com.google.android.gms.common.data.Freezable;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public interface DataEvent extends Freezable<DataEvent> {
    public static final int TYPE_CHANGED = 1;
    public static final int TYPE_DELETED = 2;

    DataItem getDataItem();

    int getType();
}
