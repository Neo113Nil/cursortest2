package com.google.android.gms.signin;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import coil3.size.DimensionKt;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.zbd;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.service.zab;
import com.google.android.gms.common.moduleinstall.internal.zaz;
import com.google.android.gms.identitycredentials.internal.IdentityCredentialClientImpl;
import com.google.android.gms.internal.appset.zzd;
import com.google.android.gms.internal.fido.zzp;
import com.google.android.gms.internal.p000authapi.zbar;
import com.google.android.gms.internal.p000authapi.zbe;
import com.google.android.gms.internal.p001authapiphone.zzw;
import com.google.android.gms.internal.tapandpay.zzaj;
import com.google.android.gms.internal.time.zzbu;
import com.google.android.gms.location.places.internal.zzat;
import com.google.android.gms.signin.internal.SignInClientImpl;
import com.google.android.gms.wallet.Wallet$WalletOptions;
import com.google.android.gms.wallet.internal.WalletClientImpl;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.boost.db.Reward$Adapter;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import papa.internal.InputTracker$listener$1$1$2$trigger$1;

/* loaded from: classes4.dex */
public final class zaa extends DimensionKt {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zaa(int i) {
        this.$r8$classId = i;
    }

    @Override // coil3.size.DimensionKt
    public GmsClient buildClient(Context context, Looper looper, Reward$Adapter reward$Adapter, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        switch (this.$r8$classId) {
            case 0:
                reward$Adapter.getClass();
                Integer num = (Integer) reward$Adapter.boost_attributesAdapter;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new SignInClientImpl(context, looper, reward$Adapter, bundle, connectionCallbacks, onConnectionFailedListener);
            case 2:
                return new zbe(context, looper, reward$Adapter, (zbd) obj, connectionCallbacks, onConnectionFailedListener);
            case 3:
                return new com.google.android.gms.auth.api.signin.internal.zbe(context, looper, reward$Adapter, (GoogleSignInOptions) obj, connectionCallbacks, onConnectionFailedListener);
            case 9:
                return new zzp(context, looper, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE, reward$Adapter, connectionCallbacks, onConnectionFailedListener, 0);
            case 11:
                String packageName = context.getPackageName();
                com.google.android.gms.location.places.internal.zzp zzpVar = new com.google.android.gms.location.places.internal.zzp(context, looper, 65, reward$Adapter, connectionCallbacks, onConnectionFailedListener, 0);
                new zzat(packageName, Locale.getDefault().toString(), null, null, GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE, 0);
                return zzpVar;
            case 12:
                throw Boxes$$ExternalSyntheticOutline1.m(obj);
            case 14:
                Wallet$WalletOptions wallet$WalletOptions = (Wallet$WalletOptions) obj;
                if (wallet$WalletOptions == null) {
                    wallet$WalletOptions = new Wallet$WalletOptions(new InputTracker$listener$1$1$2$trigger$1());
                }
                return new WalletClientImpl(context, looper, reward$Adapter, connectionCallbacks, onConnectionFailedListener, wallet$WalletOptions.environment, wallet$WalletOptions.zzc);
            default:
                return super.buildClient(context, looper, reward$Adapter, obj, connectionCallbacks, onConnectionFailedListener);
        }
    }

    @Override // coil3.size.DimensionKt
    public GmsClient buildClient$1(Context context, Looper looper, Reward$Adapter reward$Adapter, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        switch (this.$r8$classId) {
            case 1:
                return new zzw(context, looper, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, reward$Adapter, connectionCallbacks, onConnectionFailedListener, 0);
            case 2:
            case 3:
            case 9:
            case 11:
            case 12:
            default:
                return super.buildClient$1(context, looper, reward$Adapter, obj, connectionCallbacks, onConnectionFailedListener);
            case 4:
                return new zab(context, looper, 449, reward$Adapter, connectionCallbacks, onConnectionFailedListener, 0);
            case 5:
                return new zaz(context, looper, EnumC0170g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE, reward$Adapter, connectionCallbacks, onConnectionFailedListener, 0);
            case 6:
                context.getClass();
                looper.getClass();
                reward$Adapter.getClass();
                ((Api.ApiOptions.NoOptions) obj).getClass();
                return new IdentityCredentialClientImpl(context, looper, 352, reward$Adapter, connectionCallbacks, onConnectionFailedListener, 0);
            case 7:
                return new zzd(context, looper, EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, reward$Adapter, connectionCallbacks, onConnectionFailedListener, 0);
            case 8:
                return new zbar(context, looper, reward$Adapter, connectionCallbacks, onConnectionFailedListener);
            case 10:
                return new zzbu(context, looper, EnumC0170g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE, reward$Adapter, connectionCallbacks, onConnectionFailedListener, 0);
            case 13:
                return new zzaj(context, looper, 79, reward$Adapter, connectionCallbacks, onConnectionFailedListener, 0);
        }
    }

    @Override // coil3.size.DimensionKt
    public /* bridge */ /* synthetic */ List getImpliedScopes() {
        switch (this.$r8$classId) {
            case 3:
                return Collections.EMPTY_LIST;
            default:
                return super.getImpliedScopes();
        }
    }
}
