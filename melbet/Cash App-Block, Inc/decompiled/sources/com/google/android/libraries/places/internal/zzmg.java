package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.datatransport.Transformer;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzmg implements Continuation, Transformer {
    public static final /* synthetic */ zzmg zza = new zzmg();

    @Override // com.google.android.datatransport.Transformer
    public /* synthetic */ Object apply(Object obj) {
        return ((zzbhz) obj).zzbr();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((zzla) task.getResult()).getClass();
        TextUtils.isEmpty(null);
        throw new ApiException(new Status(13, null, null, null));
    }
}
