package com.google.android.libraries.places.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public class zzxq {
    public final String zza;
    public final Class zzb;
    public final boolean zzc;

    public zzxq(String str, Class cls, boolean z, boolean z2) {
        char charAt = str.charAt(0);
        if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
            a$$ExternalSyntheticBUOutline0.m$3("identifier must start with an ASCII letter: ".concat(str));
            throw null;
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt2 = str.charAt(i);
            if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && ((charAt2 < '0' || charAt2 > '9') && charAt2 != '_'))) {
                a$$ExternalSyntheticBUOutline0.m$3("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                throw null;
            }
        }
        this.zza = str;
        this.zzb = cls;
        this.zzc = z;
        System.identityHashCode(this);
        for (int i2 = 0; i2 < 5; i2++) {
        }
    }

    public final String toString() {
        String name = getClass().getName();
        String name2 = this.zzb.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, name, "/", str, "[");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, name2, "]");
    }
}
