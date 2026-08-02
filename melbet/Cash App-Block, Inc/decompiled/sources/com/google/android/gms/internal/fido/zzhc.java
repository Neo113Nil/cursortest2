package com.google.android.gms.internal.fido;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public abstract class zzhc {
    public static final byte[] zzd;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzd = bArr;
        ByteBuffer.wrap(bArr);
    }
}
