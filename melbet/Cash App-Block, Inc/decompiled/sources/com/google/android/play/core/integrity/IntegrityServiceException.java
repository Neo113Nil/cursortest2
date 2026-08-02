package com.google.android.play.core.integrity;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.integrity.model.a;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class IntegrityServiceException extends ApiException {
    public final Throwable a;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IntegrityServiceException(int i, Exception exc) {
        super(new Status(i, "Integrity API error (" + i + "): " + r1 + ".", null, null));
        String str;
        Locale locale = Locale.ROOT;
        HashMap hashMap = a.a;
        Integer valueOf = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf)) {
            HashMap hashMap2 = a.b;
            if (hashMap2.containsKey(valueOf)) {
                str = Boxes$$ExternalSyntheticOutline1.m((String) hashMap.get(valueOf), " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/IntegrityErrorCode.html#", (String) hashMap2.get(valueOf), ")");
                if (i == 0) {
                    this.a = exc;
                    return;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$3("ErrorCode should not be 0.");
                    throw null;
                }
            }
        }
        str = "";
        if (i == 0) {
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.a;
    }
}
