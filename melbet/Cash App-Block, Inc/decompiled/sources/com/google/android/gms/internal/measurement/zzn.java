package com.google.android.gms.internal.measurement;

import com.fillr.featuretoggle.UnleashContext;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzn extends zzai {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzn(String str, int i) {
        super(str);
        this.$r8$classId = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao zza(UnleashContext unleashContext, List list) {
        int i = this.$r8$classId;
        zzat zzatVar = zzao.zzf;
        switch (i) {
            case 0:
                return zzatVar;
            case 1:
            case 2:
                return this;
            case 3:
                return new zzah(Double.valueOf(0.0d));
            default:
                return zzatVar;
        }
    }
}
