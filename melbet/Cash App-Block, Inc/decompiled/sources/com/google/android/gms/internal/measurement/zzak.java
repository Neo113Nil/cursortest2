package com.google.android.gms.internal.measurement;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.featuretoggle.UnleashContext;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public interface zzak {
    static zzao zzu(zzak zzakVar, zzas zzasVar, UnleashContext unleashContext, ArrayList arrayList) {
        String str = zzasVar.zza;
        if (zzakVar.zzj(str)) {
            zzao zzk = zzakVar.zzk(str);
            if (zzk instanceof zzai) {
                return ((zzai) zzk).zza(unleashContext, arrayList);
            }
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m$1(str, " is not a function"));
            return null;
        }
        if ("hasOwnProperty".equals(str)) {
            zzh.zza("hasOwnProperty", arrayList, 1);
            return zzakVar.zzj(((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) arrayList.get(0)).zzc()) ? zzao.zzk : zzao.zzl;
        }
        a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Object has no function ", str));
        return null;
    }

    boolean zzj(String str);

    zzao zzk(String str);

    void zzm(String str, zzao zzaoVar);
}
