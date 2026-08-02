package com.google.android.gms.common.moduleinstall.internal;

import androidx.room.Room;
import com.google.android.filament.Box;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.signin.zaa;
import com.google.android.gms.tasks.zzw;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zay extends GoogleApi {
    public static final Api zae = new Api("ModuleInstall.API", new zaa(5), new Api.ClientKey());

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.common.Feature[], java.io.Serializable] */
    public final zzw areModulesAvailable(OptionalModuleApi... optionalModuleApiArr) {
        zzae.checkArgument("Please provide at least one OptionalModuleApi.", optionalModuleApiArr.length > 0);
        for (OptionalModuleApi optionalModuleApi : optionalModuleApiArr) {
            zzae.checkNotNull(optionalModuleApi, "Requested API must not be null.");
        }
        ApiFeatureRequest zaa = ApiFeatureRequest.zaa(Arrays.asList(optionalModuleApiArr), false);
        if (zaa.zab.isEmpty()) {
            return Room.forResult(new ModuleAvailabilityResponse(true, 0));
        }
        zacn builder = zacn.builder();
        builder.zaa$1 = new Feature[]{zap.zaa};
        builder.zac = 27301;
        builder.zab = false;
        builder.zaa = new Box(13, this, zaa);
        return zae(0, builder.build());
    }
}
