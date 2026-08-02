package com.google.android.libraries.places.internal;

import com.google.common.io.BaseEncoding$Base64Encoding;
import java.nio.charset.Charset;
import java.util.BitSet;

/* loaded from: classes4.dex */
public abstract class zzbrc {
    public static final Charset zza = Charset.forName("US-ASCII");
    public static final BaseEncoding$Base64Encoding zzb = zzbsn.zzb;

    public static zzbsl zza(String str, zzbrb zzbrbVar) {
        char charAt = str.charAt(0);
        BitSet bitSet = zzbsj.zzb;
        return new zzbsl(str, charAt == ':', zzbrbVar);
    }
}
