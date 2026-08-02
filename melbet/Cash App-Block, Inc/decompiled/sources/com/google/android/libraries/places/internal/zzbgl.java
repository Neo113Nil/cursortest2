package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.appsflyer.AppsFlyerProperties;
import com.google.mlkit.vision.text.Text;

/* loaded from: classes4.dex */
public final class zzbgl extends Text.TextBase {
    public final /* synthetic */ int $r8$classId;

    public zzbgl(zzbow zzbowVar, zzbov zzbovVar, int i) {
        this.$r8$classId = i;
        Trace.checkNotNull(zzbowVar, AppsFlyerProperties.CHANNEL);
        this.zza = zzbowVar;
        Trace.checkNotNull(zzbovVar, "callOptions");
        this.zzd = zzbovVar;
    }

    public final Text.TextBase zza(zzbow zzbowVar, zzbov zzbovVar) {
        switch (this.$r8$classId) {
            case 0:
                return new zzbgl(zzbowVar, zzbovVar, 0);
            default:
                return new zzbgl(zzbowVar, zzbovVar, 1);
        }
    }
}
