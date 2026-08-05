package com.google.android.gms.wearable;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import androidx.core.util.Preconditions;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.wearable.internal.zzan;
import com.google.android.gms.wearable.internal.zzau;
import com.google.android.gms.wearable.internal.zzbo;
import com.google.android.gms.wearable.internal.zzdg;
import com.google.android.gms.wearable.internal.zzdt;
import com.google.android.gms.wearable.internal.zzgz;
import com.google.android.gms.wearable.internal.zzhj;
import com.google.android.gms.wearable.internal.zzhq;
import com.google.android.gms.wearable.internal.zzhy;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public class Wearable {

    @Deprecated
    public static final Api<WearableOptions> API;
    private static final Api.ClientKey zza;
    private static final Api.AbstractClientBuilder zzb;

    @Deprecated
    public static final DataApi DataApi = new zzdg();

    @Deprecated
    public static final CapabilityApi CapabilityApi = new com.google.android.gms.wearable.internal.zzah();

    @Deprecated
    public static final MessageApi MessageApi = new zzgz();

    @Deprecated
    public static final NodeApi NodeApi = new zzhq();

    @Deprecated
    public static final ChannelApi ChannelApi = new zzau();

    /* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
    public static final class WearableOptions implements Api.ApiOptions.Optional {
        public static final WearableOptions zza = new WearableOptions(new Builder());
        private final Looper zzb;

        /* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
        public static class Builder {
            private Looper zza;

            public WearableOptions build() {
                return new WearableOptions(this, null);
            }

            public Builder setLooper(Looper looper) {
                this.zza = looper;
                return this;
            }

            final /* synthetic */ Looper zza() {
                return this.zza;
            }
        }

        private WearableOptions(Builder builder) {
            this.zzb = builder.zza();
        }

        /* synthetic */ WearableOptions(Builder builder, byte[] bArr) {
            this(builder);
        }

        public boolean equals(Object obj) {
            return obj instanceof WearableOptions;
        }

        public int hashCode() {
            return Objects.hashCode(getClass());
        }

        final /* synthetic */ GoogleApi.Settings zza() {
            Looper looper = this.zzb;
            return looper != null ? new GoogleApi.Settings.Builder().setLooper(looper).build() : GoogleApi.Settings.DEFAULT_SETTINGS;
        }
    }

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzs zzsVar = new zzs();
        zzb = zzsVar;
        API = new Api<>("Wearable.API", zzsVar, clientKey);
    }

    private Wearable() {
    }

    public static CapabilityClient getCapabilityClient(Activity activity) {
        return new zzan(activity, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static ChannelClient getChannelClient(Activity activity) {
        return new zzbo(activity, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static DataClient getDataClient(Activity activity) {
        return new zzdt(activity, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static MessageClient getMessageClient(Activity activity) {
        return new zzhj(activity, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static NodeClient getNodeClient(Activity activity) {
        return new zzhy(activity, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static CapabilityClient getCapabilityClient(Activity activity, WearableOptions wearableOptions) {
        Preconditions.checkNotNull(wearableOptions, "options must not be null");
        return new zzan(activity, wearableOptions.zza());
    }

    public static ChannelClient getChannelClient(Activity activity, WearableOptions wearableOptions) {
        Preconditions.checkNotNull(wearableOptions, "options must not be null");
        return new zzbo(activity, wearableOptions.zza());
    }

    public static DataClient getDataClient(Activity activity, WearableOptions wearableOptions) {
        Preconditions.checkNotNull(wearableOptions, "options must not be null");
        return new zzdt(activity, wearableOptions.zza());
    }

    public static MessageClient getMessageClient(Activity activity, WearableOptions wearableOptions) {
        Preconditions.checkNotNull(wearableOptions, "options must not be null");
        return new zzhj(activity, wearableOptions.zza());
    }

    public static NodeClient getNodeClient(Activity activity, WearableOptions wearableOptions) {
        Preconditions.checkNotNull(wearableOptions, "options must not be null");
        return new zzhy(activity, wearableOptions.zza());
    }

    public static CapabilityClient getCapabilityClient(Context context) {
        return new zzan(context, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static ChannelClient getChannelClient(Context context) {
        return new zzbo(context, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static DataClient getDataClient(Context context) {
        return new zzdt(context, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static MessageClient getMessageClient(Context context) {
        return new zzhj(context, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static NodeClient getNodeClient(Context context) {
        return new zzhy(context, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static CapabilityClient getCapabilityClient(Context context, WearableOptions wearableOptions) {
        Preconditions.checkNotNull(wearableOptions, "options must not be null");
        return new zzan(context, wearableOptions.zza());
    }

    public static ChannelClient getChannelClient(Context context, WearableOptions wearableOptions) {
        Preconditions.checkNotNull(wearableOptions, "options must not be null");
        return new zzbo(context, wearableOptions.zza());
    }

    public static DataClient getDataClient(Context context, WearableOptions wearableOptions) {
        Preconditions.checkNotNull(wearableOptions, "options must not be null");
        return new zzdt(context, wearableOptions.zza());
    }

    public static MessageClient getMessageClient(Context context, WearableOptions wearableOptions) {
        Preconditions.checkNotNull(wearableOptions, "options must not be null");
        return new zzhj(context, wearableOptions.zza());
    }

    public static NodeClient getNodeClient(Context context, WearableOptions wearableOptions) {
        Preconditions.checkNotNull(wearableOptions, "options must not be null");
        return new zzhy(context, wearableOptions.zza());
    }
}
