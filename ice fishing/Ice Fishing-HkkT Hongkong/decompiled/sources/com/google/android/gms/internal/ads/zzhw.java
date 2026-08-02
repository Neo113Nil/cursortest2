package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.view.PointerIconCompat;
import com.facebook.internal.security.CertificateUtil;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzhw extends zzgq {
    private final Context zza;
    private zzhb zzb;
    private AssetFileDescriptor zzc;
    private InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzhw(Context context) {
        super(false);
        this.zza = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r0.matches("\\d+") != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static AssetFileDescriptor zzk(Context context, zzhb zzhbVar) throws zzhv {
        Resources resources;
        int parseInt;
        AssetFileDescriptor openRawResourceFd;
        Uri normalizeScheme = zzhbVar.zza.normalizeScheme();
        try {
            if (!TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
                if (TextUtils.equals("android.resource", normalizeScheme.getScheme()) && normalizeScheme.getPathSegments().size() == 1) {
                    String lastPathSegment = normalizeScheme.getLastPathSegment();
                    lastPathSegment.getClass();
                }
                if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                    throw new zzhv("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, PointerIconCompat.TYPE_WAIT);
                }
                String path = normalizeScheme.getPath();
                path.getClass();
                if (path.startsWith("/")) {
                    path = path.substring(1);
                }
                String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
                if (packageName.equals(context.getPackageName())) {
                    resources = context.getResources();
                } else {
                    try {
                        resources = context.getPackageManager().getResourcesForApplication(packageName);
                    } catch (PackageManager.NameNotFoundException e) {
                        throw new zzhv("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                    }
                }
                parseInt = resources.getIdentifier(packageName + CertificateUtil.DELIMITER + path, "raw", null);
                if (parseInt == 0) {
                    throw new zzhv("Resource not found.", null, 2005);
                }
                try {
                    openRawResourceFd = resources.openRawResourceFd(parseInt);
                    if (openRawResourceFd == null) {
                        return openRawResourceFd;
                    }
                    throw new zzhv("Resource is compressed: ".concat(String.valueOf(String.valueOf(normalizeScheme))), null, 2000);
                } catch (Resources.NotFoundException e2) {
                    throw new zzhv(null, e2, 2005);
                }
            }
            String lastPathSegment2 = normalizeScheme.getLastPathSegment();
            if (lastPathSegment2 == null) {
                throw null;
            }
            parseInt = Integer.parseInt(lastPathSegment2);
            openRawResourceFd = resources.openRawResourceFd(parseInt);
            if (openRawResourceFd == null) {
            }
        } catch (NumberFormatException unused) {
            throw new zzhv("Resource identifier must be an integer.", null, PointerIconCompat.TYPE_WAIT);
        }
        resources = context.getResources();
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i, int i2) throws zzhv {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzhv(null, e, 2000);
            }
        }
        InputStream inputStream = this.zzd;
        int i3 = zzfy.zza;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.zze == -1) {
                return -1;
            }
            throw new zzhv("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.zze;
        if (j2 != -1) {
            this.zze = j2 - read;
        }
        zzg(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final long zzb(zzhb zzhbVar) throws zzhv {
        long j;
        this.zzb = zzhbVar;
        zzi(zzhbVar);
        AssetFileDescriptor zzk = zzk(this.zza, zzhbVar);
        this.zzc = zzk;
        long length = zzk.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.zzc.getFileDescriptor());
        this.zzd = fileInputStream;
        if (length != -1) {
            try {
                if (zzhbVar.zzf > length) {
                    throw new zzhv(null, null, 2008);
                }
            } catch (zzhv e) {
                throw e;
            } catch (IOException e2) {
                throw new zzhv(null, e2, 2000);
            }
        }
        long startOffset = this.zzc.getStartOffset();
        long skip = fileInputStream.skip(zzhbVar.zzf + startOffset) - startOffset;
        if (skip != zzhbVar.zzf) {
            throw new zzhv(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.zze = -1L;
                j = -1;
            } else {
                j = channel.size() - channel.position();
                this.zze = j;
                if (j < 0) {
                    throw new zzhv(null, null, 2008);
                }
            }
        } else {
            j = length - skip;
            this.zze = j;
            if (j < 0) {
                throw new zzgx(2008);
            }
        }
        long j2 = zzhbVar.zzg;
        if (j2 != -1) {
            if (j != -1) {
                j2 = Math.min(j, j2);
            }
            this.zze = j2;
        }
        this.zzf = true;
        zzj(zzhbVar);
        long j3 = zzhbVar.zzg;
        return j3 != -1 ? j3 : this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final Uri zzc() {
        zzhb zzhbVar = this.zzb;
        if (zzhbVar != null) {
            return zzhbVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void zzd() throws zzhv {
        this.zzb = null;
        try {
            try {
                try {
                    InputStream inputStream = this.zzd;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.zzd = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzh();
                        }
                    } catch (IOException e) {
                        throw new zzhv(null, e, 2000);
                    }
                } catch (IOException e2) {
                    throw new zzhv(null, e2, 2000);
                }
            } catch (Throwable th) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.zzd = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th2;
            } catch (IOException e3) {
                throw new zzhv(null, e3, 2000);
            }
        }
    }
}
