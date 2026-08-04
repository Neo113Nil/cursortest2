package com.google.android.gms.common.api;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class GoogleApiClient {
    public static final Set a = Collections.newSetFromMap(new WeakHashMap());

    public abstract void connect();

    public abstract boolean d();

    public abstract void disconnect();
}
