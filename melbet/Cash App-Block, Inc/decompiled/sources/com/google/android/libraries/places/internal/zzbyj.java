package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.google.common.base.Stopwatch;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes4.dex */
public final class zzbyj extends zzbtg {
    public static final boolean zza;

    static {
        boolean z = false;
        try {
            Class.forName("android.app.Application", false, zzbyj.class.getClassLoader());
            z = true;
        } catch (Exception unused) {
        }
        zza = z;
    }

    @Override // com.google.android.libraries.places.internal.zzbta
    public final zzbtf zza(URI uri, zzbsy zzbsyVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String path = uri.getPath();
        Trace.checkNotNull(path, "targetPath");
        Trace.checkArgument(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
        String substring = path.substring(1);
        uri.getAuthority();
        return new zzbyi(substring, zzbsyVar, zzbzg.zzm, new Stopwatch(), zza);
    }

    @Override // com.google.android.libraries.places.internal.zzbta
    public final zzbtf zzb(zzbuj zzbujVar, zzbsy zzbsyVar) {
        String str = null;
        if (!"dns".equals(zzbujVar.zzl)) {
            return null;
        }
        String str2 = zzbujVar.zzp;
        ImmutableList.Builder builder = ImmutableList.builder();
        zzbuj.zzi(str2, builder);
        RegularImmutableList build = builder.build();
        Trace.checkArgument(!build.isEmpty(), "expected 1 path segment in target %s but found %s", zzbujVar, build);
        String str3 = (String) build.get(0);
        if (zzbujVar.zzn != null) {
            StringBuilder sb = new StringBuilder();
            zzbujVar.zzk(sb);
            str = sb.toString();
        }
        zzbuj.zzm(str);
        return new zzbyi(str3, zzbsyVar, zzbzg.zzm, new Stopwatch(), zza);
    }

    @Override // com.google.android.libraries.places.internal.zzbtg
    public final Collection zzf() {
        return Collections.singleton(InetSocketAddress.class);
    }
}
