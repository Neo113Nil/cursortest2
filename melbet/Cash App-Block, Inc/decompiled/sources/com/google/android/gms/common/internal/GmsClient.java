package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import coil3.memory.MemoryCacheService;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.squareup.cash.boost.db.Reward$Adapter;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class GmsClient extends BaseGmsClient {
    public final Set zac;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GmsClient(Context context, Looper looper, int i, Reward$Adapter reward$Adapter, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, int i2) {
        super(context, looper, r3, r4, i, new Extras.Key(connectionCallbacks), new MemoryCacheService(onConnectionFailedListener, 26), (String) reward$Adapter.program_detail_rowsAdapter);
        zzq zzqVar = zzq.getInstance(context);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        zzae.checkNotNull(connectionCallbacks);
        zzae.checkNotNull(onConnectionFailedListener);
        Set set = (Set) reward$Adapter.reward_selection_stateAdapter;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                a$$ExternalSyntheticBUOutline0.m$1("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.zac = set;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Account getAccount() {
        return null;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Executor getBindServiceExecutor() {
        return null;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Set getScopes() {
        return this.zac;
    }
}
