package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public abstract class zzbsj {
    public static final BitSet zzb;
    public final String zzd;
    public final byte[] zze;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            bitSet.set(c);
        }
        for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        zzb = bitSet;
    }

    public zzbsj(String str, boolean z) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Trace.checkNotNull(lowerCase, "name");
        Trace.checkArgument("token must have at least 1 tchar", !lowerCase.isEmpty());
        if (lowerCase.equals("connection")) {
            Logger logger = zzbsn.zzc;
            zzbsn.zzc.logp(Level.WARNING, "io.grpc.Metadata$Key", "validateName", "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        int i = 0;
        while (i < lowerCase.length()) {
            char charAt = lowerCase.charAt(i);
            if (z && charAt == ':') {
                if (i == 0) {
                    i = 0;
                    i++;
                } else {
                    charAt = ':';
                }
            }
            if (!zzb.get(charAt)) {
                a$$ExternalSyntheticBUOutline0.m$3(DBUtil.lenientFormat("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
                throw null;
            }
            i++;
        }
        this.zzd = lowerCase;
        this.zze = lowerCase.getBytes(StandardCharsets.US_ASCII);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zzd.equals(((zzbsj) obj).zzd);
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }

    public final String toString() {
        String str = this.zzd;
        return Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(String.valueOf(str).length() + 12), "Key{name='", str, "'}");
    }

    public abstract byte[] zza(Object obj);

    public abstract Object zzb(byte[] bArr);
}
