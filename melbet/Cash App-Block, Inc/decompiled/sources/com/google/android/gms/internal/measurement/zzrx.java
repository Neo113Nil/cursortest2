package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzrx implements zzsx {
    public final Context zza;
    public String zzd;
    public final Object zzc = new Object();
    public final zzsd zzb = new zzsd();

    public zzrx(zzxs zzxsVar) {
        this.zza = (Context) zzxsVar.zza$1;
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final String zzc() {
        return "android";
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final zzsl zzd(Uri uri) {
        if (zzh(uri)) {
            throw new zzsg("Android backend cannot perform remote operations without a remote backend");
        }
        File zza = zzjx.zza(zzf(uri));
        return new zzsl(new FileInputStream(zza), zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final boolean zze(Uri uri) {
        if (zzh(uri)) {
            throw new zzsg("Android backend cannot perform remote operations without a remote backend");
        }
        return zzjx.zza(zzf(uri)).exists();
    }

    public final Uri zzf(Uri uri) {
        if (zzh(uri)) {
            throw new zzsi("Operation across authorities is not allowed.");
        }
        File zzg = zzg(uri);
        Uri.Builder path = new Uri.Builder().scheme("file").authority("").path("/");
        ImmutableList.Builder builder = ImmutableList.builder();
        path.path(zzg.getAbsolutePath());
        RegularImmutableList build = builder.build();
        Pattern pattern = zzsp.zza;
        return path.encodedFragment(build.isEmpty() ? null : "transform=".concat(Joiner.on().join(build))).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0110  */
    @Override // com.google.android.gms.internal.measurement.zzsx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final File zzg(Uri uri) {
        File externalFilesDir;
        Account account;
        String str;
        if (zzh(uri)) {
            a$$ExternalSyntheticBUOutline0.m$4("operation is not permitted in other authorities.");
            return null;
        }
        Context context = this.zza;
        if (!uri.getScheme().equals("android")) {
            throw new zzsi("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new zzsi("Did not expect uri to have query");
        }
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        String str2 = (String) arrayList.get(0);
        switch (str2.hashCode()) {
            case -1820761141:
                if (str2.equals("external")) {
                    externalFilesDir = context.getExternalFilesDir(null);
                    File file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!zzky.zzi(context)) {
                        synchronized (this.zzc) {
                            try {
                                if (this.zzd == null) {
                                    this.zzd = zzxm.zza(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                }
                                str = this.zzd;
                            } finally {
                            }
                        }
                        if (!file.getAbsolutePath().startsWith(str)) {
                            throw new zzsg("Cannot access credential-protected data from direct boot");
                        }
                    }
                    return file;
                }
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
            case 94416770:
                if (str2.equals("cache")) {
                    externalFilesDir = context.getCacheDir();
                    File file2 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!zzky.zzi(context)) {
                    }
                    return file2;
                }
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
            case 97434231:
                if (str2.equals("files")) {
                    externalFilesDir = zzxm.zza(context);
                    File file22 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!zzky.zzi(context)) {
                    }
                    return file22;
                }
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
            case 835260319:
                if (str2.equals("managed")) {
                    File file3 = new File(zzxm.zza(context), "managed");
                    if (arrayList.size() >= 3) {
                        try {
                            String str3 = (String) arrayList.get(2);
                            Account account2 = zzrv.zza;
                            if ("shared".equals(str3)) {
                                account = zzrv.zza;
                            } else {
                                int indexOf = str3.indexOf(58);
                                zzky.zza(indexOf >= 0, "Malformed account", new Object[0]);
                                account = new Account(str3.substring(indexOf + 1), str3.substring(0, indexOf));
                            }
                            if (!zzrv.zza.equals(account)) {
                                throw new zzsi("AccountManager cannot be null");
                            }
                        } catch (IllegalArgumentException e) {
                            throw new zzsi(e);
                        }
                    }
                    externalFilesDir = file3;
                    File file222 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!zzky.zzi(context)) {
                    }
                    return file222;
                }
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
            case 988548496:
                if (str2.equals("directboot-cache")) {
                    externalFilesDir = context.createDeviceProtectedStorageContext().getCacheDir();
                    File file2222 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!zzky.zzi(context)) {
                    }
                    return file2222;
                }
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
            case 991565957:
                if (str2.equals("directboot-files")) {
                    externalFilesDir = context.createDeviceProtectedStorageContext().getFilesDir();
                    File file22222 = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!zzky.zzi(context)) {
                    }
                    return file22222;
                }
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
            default:
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
        }
    }

    public final boolean zzh(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.zza.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final OutputStream zzj(Uri uri) {
        return this.zzb.zzj(zzf(uri));
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final void zzk(Uri uri) {
        this.zzb.zzk(zzf(uri));
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final void zzl(Uri uri, Uri uri2) {
        this.zzb.zzl(zzf(uri), zzf(uri2));
    }
}
