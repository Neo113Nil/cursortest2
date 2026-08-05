package com.google.android.gms.wearable.internal;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.NodeClient;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzhy extends NodeClient {
    final NodeApi zza;

    public zzhy(Activity activity, GoogleApi.Settings settings) {
        super(activity, settings);
        this.zza = new zzhq();
    }

    @Override // com.google.android.gms.wearable.NodeClient
    public final Task<String> getCompanionPackageForNode(final String str) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzhx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((zzgq) ((zzkf) obj).getService()).zzn(new zzjn(new zzhr(zzhy.this, (TaskCompletionSource) obj2)), str);
            }
        }).setFeatures(com.google.android.gms.wearable.zzn.zzc).setMethodKey(24023).build());
    }

    @Override // com.google.android.gms.wearable.NodeClient
    public final Task<List<Node>> getConnectedNodes() {
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        return PendingResultUtil.toTask(asGoogleApiClient.enqueue(new zzhn((zzhq) this.zza, asGoogleApiClient)), zzhu.zza);
    }

    @Override // com.google.android.gms.wearable.NodeClient
    public final Task<Node> getLocalNode() {
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        return PendingResultUtil.toTask(asGoogleApiClient.enqueue(new zzhm((zzhq) this.zza, asGoogleApiClient)), zzhv.zza);
    }

    @Override // com.google.android.gms.wearable.NodeClient
    public final Task<String> getNodeId(final String str) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzhw
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((zzgq) ((zzkf) obj).getService()).zzo(new zzhs(zzhy.this, (TaskCompletionSource) obj2), str);
            }
        }).setFeatures(com.google.android.gms.wearable.zzn.zzp).setMethodKey(24025).build());
    }

    public zzhy(Context context, GoogleApi.Settings settings) {
        super(context, settings);
        this.zza = new zzhq();
    }
}
