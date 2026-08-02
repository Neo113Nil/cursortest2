package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.location.zzbf;
import java.io.File;
import java.util.logging.Level;

/* loaded from: classes.dex */
public abstract class zzjx {
    public static final Api zza = new Api("Phenotype.API", new zzbf(2), new Api.ClientKey());

    public static final File zza(Uri uri) {
        if (!uri.getScheme().equals("file")) {
            throw new zzsi("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new zzsi("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new zzsi("Did not expect uri to have authority");
    }

    public static int zzb(Level level) {
        int intValue = level.intValue();
        if (intValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue >= Level.INFO.intValue()) {
            return 4;
        }
        return intValue >= Level.FINE.intValue() ? 3 : 2;
    }

    public abstract int zza();

    public abstract zzyl zzb(int i);

    public abstract Object zzc(int i);

    public abstract Object zzd(zzyl zzylVar);

    public static String zza(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String concat = "".concat(str);
        return concat.substring(0, Math.min(concat.length(), 23));
    }
}
