package com.gamericefishpro.space.qa;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.gamericefishpro.space.t8.d {
    public final Throwable e;

    /* JADX WARN: Code duplicated, block: B:8:0x003f  */
    /* JADX WARN: Illegal instructions before constructor call */
    public a(int i, Exception exc) {
        String str;
        Locale locale = Locale.ROOT;
        HashMap map = com.gamericefishpro.space.ra.a.a;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            HashMap map2 = com.gamericefishpro.space.ra.a.b;
            if (map2.containsKey(numValueOf)) {
                str = ((String) map.get(numValueOf)) + " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/IntegrityErrorCode.html#" + ((String) map2.get(numValueOf)) + ")";
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        super(new Status(i, "Integrity API error (" + i + "): " + str + ".", null, null));
        if (i == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.e = exc;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.e;
    }
}
