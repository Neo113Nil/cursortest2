package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class zzcjx {
    public zzcjw zza;
    public final zzcis zzb = new zzcis();

    public final void zzb(String str, String str2) {
        zzcis zzcisVar = this.zzb;
        zzcisVar.getClass();
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                a$$ExternalSyntheticBUOutline0.m$3(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str));
                return;
            }
        }
        if (str2 == null) {
            a$$ExternalSyntheticBUOutline0.m$3("value == null");
            return;
        }
        for (int i3 = 0; i3 < str2.length(); i3++) {
            char charAt2 = str2.charAt(i3);
            if (charAt2 <= 31 || charAt2 >= 127) {
                a$$ExternalSyntheticBUOutline0.m$3(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(charAt2), Integer.valueOf(i3), str2));
                return;
            }
        }
        while (true) {
            ArrayList arrayList = zzcisVar.zza;
            if (i >= arrayList.size()) {
                arrayList.add(str);
                arrayList.add(str2.trim());
                return;
            } else {
                if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }
    }
}
