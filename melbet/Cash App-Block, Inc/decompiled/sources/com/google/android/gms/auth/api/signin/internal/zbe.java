package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.internal.p000authapi.zbat;
import com.squareup.cash.boost.db.Reward$Adapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zbe extends GmsClient {
    public final GoogleSignInOptions zba;

    public zbe(Context context, Looper looper, Reward$Adapter reward$Adapter, GoogleSignInOptions googleSignInOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 91, reward$Adapter, connectionCallbacks, onConnectionFailedListener, 0);
        GoogleSignInOptions.Builder builder;
        Set<Scope> set = (Set) reward$Adapter.reward_selection_stateAdapter;
        if (googleSignInOptions != null) {
            builder = new GoogleSignInOptions.Builder();
            builder.zaa = new HashSet();
            builder.zah = new HashMap();
            builder.zaa = new HashSet(googleSignInOptions.zag);
            builder.zab = googleSignInOptions.zaj;
            builder.zac = googleSignInOptions.zak;
            builder.zad = googleSignInOptions.zai;
            builder.zae = googleSignInOptions.zal;
            builder.zaf = googleSignInOptions.zah;
            builder.zag = googleSignInOptions.zam;
            builder.zah = GoogleSignInOptions.zam(googleSignInOptions.zan);
            builder.zai = googleSignInOptions.zao;
        } else {
            builder = new GoogleSignInOptions.Builder();
            builder.zaa = new HashSet();
            builder.zah = new HashMap();
        }
        builder.zai = zbat.zba();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = builder.zaa;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = builder.zaa;
        if (hashSet2.contains(GoogleSignInOptions.zae)) {
            Scope scope2 = GoogleSignInOptions.zad;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (builder.zad && (builder.zaf == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.zac);
        }
        this.zba = new GoogleSignInOptions(3, new ArrayList(hashSet2), builder.zaf, builder.zad, builder.zab, builder.zac, builder.zae, builder.zag, builder.zah, builder.zai);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof zbs ? (zbs) queryLocalInterface : new zbs(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 1);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Intent getSignInIntent() {
        zbm.zba.d("getSignInIntent()", new Object[0]);
        Context context = this.zzl;
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), this.zba);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
