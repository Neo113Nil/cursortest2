package com.google.android.play.core.install;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.install.model.zza;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class InstallException extends ApiException {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InstallException(int i) {
        super(new Status(i, String.format(r1, "Install Error(%d): %s", r2, r3), null, null));
        String str;
        Locale locale = Locale.getDefault();
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = zza.zza;
        Integer valueOf2 = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf2)) {
            HashMap hashMap2 = zza.zzb;
            if (hashMap2.containsKey(valueOf2)) {
                str = Boxes$$ExternalSyntheticOutline1.m((String) hashMap.get(valueOf2), " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#", (String) hashMap2.get(valueOf2), ")");
                if (i == 0) {
                    return;
                }
                a$$ExternalSyntheticBUOutline0.m$3("errorCode should not be 0.");
                throw null;
            }
        }
        str = "";
        if (i == 0) {
        }
    }
}
