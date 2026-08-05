package com.google.android.gms.wearable;

import android.net.Uri;
import com.google.android.gms.common.data.Freezable;
import java.util.Map;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public interface DataItem extends Freezable<DataItem> {
    Map<String, DataItemAsset> getAssets();

    @Pure
    byte[] getData();

    Uri getUri();

    DataItem setData(byte[] bArr);
}
