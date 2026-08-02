package com.google.android.gms.internal.ads;

import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.google.android.gms.common.util.Clock;
import com.google.common.net.HttpHeaders;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzchz extends zzchw {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzchz(zzcgl zzcglVar) {
        super(zzcglVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            zzcec.zzj("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            zzcec.zzj("Could not create preload cache directory at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        } else {
            if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
                return;
            }
            zzcec.zzj("Could not set cache file permissions at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        }
    }

    private final File zza(File file) {
        return new File(this.zzg, String.valueOf(file.getName()).concat(".done"));
    }

    @Override // com.google.android.gms.internal.ads.zzchw
    public final void zzf() {
        this.zzh = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0346, code lost:
    
        r26 = r4;
        r24 = r14;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x034c, code lost:
    
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0354, code lost:
    
        if (com.google.android.gms.ads.internal.util.zze.zzm(3) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0356, code lost:
    
        com.google.android.gms.internal.ads.zzcec.zze("Preloaded " + com.google.android.gms.internal.ads.zzchz.zzf.format(r13) + " bytes from " + r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0379, code lost:
    
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0382, code lost:
    
        if (r0.isFile() == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0384, code lost:
    
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x038c, code lost:
    
        r0.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03ec  */
    @Override // com.google.android.gms.internal.ads.zzchw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzt(final String str) {
        int i;
        File file;
        String str2;
        String str3;
        String str4;
        FileOutputStream fileOutputStream;
        String str5;
        int i2;
        String str6;
        com.google.android.gms.ads.internal.util.zzcb zzcbVar;
        FileChannel fileChannel;
        ReadableByteChannel readableByteChannel;
        int i3;
        int i4;
        int responseCode;
        String str7;
        boolean z;
        FileOutputStream fileOutputStream2 = null;
        if (this.zzg == null) {
            zzg(str, null, "noCacheDir", null);
            return false;
        }
        do {
            File file2 = this.zzg;
            if (file2 == null) {
                i = 0;
            } else {
                i = 0;
                for (File file3 : file2.listFiles()) {
                    if (!file3.getName().endsWith(".done")) {
                        i++;
                    }
                }
            }
            if (i > ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzu)).intValue()) {
                File file4 = this.zzg;
                if (file4 == null) {
                    break;
                }
                long j = Long.MAX_VALUE;
                File file5 = null;
                for (File file6 : file4.listFiles()) {
                    if (!file6.getName().endsWith(".done")) {
                        long lastModified = file6.lastModified();
                        if (lastModified < j) {
                            file5 = file6;
                            j = lastModified;
                        }
                    }
                }
                if (file5 != null) {
                    z = file5.delete();
                    File zza = zza(file5);
                    if (zza.isFile()) {
                        z &= zza.delete();
                    }
                } else {
                    z = false;
                }
            } else {
                file = new File(this.zzg, zzcdv.zze(str));
                File zza2 = zza(file);
                if (file.isFile() && zza2.isFile()) {
                    int length = (int) file.length();
                    zzcec.zze("Stream cache hit at ".concat(String.valueOf(str)));
                    zzh(str, file.getAbsolutePath(), length);
                    return true;
                }
                String valueOf = String.valueOf(this.zzg.getAbsolutePath());
                String valueOf2 = String.valueOf(str);
                Set set = zze;
                String concat = valueOf.concat(valueOf2);
                synchronized (set) {
                    if (set.contains(concat)) {
                        zzcec.zzj("Stream cache already in progress at " + str);
                        zzg(str, file.getAbsolutePath(), "inProgress", null);
                        return false;
                    }
                    set.add(concat);
                    str2 = "error";
                    try {
                        HttpURLConnection zzn = zzfto.zza().zzn(new zzftn() { // from class: com.google.android.gms.internal.ads.zzchy
                            @Override // com.google.android.gms.internal.ads.zzftn
                            public final URLConnection zza() {
                                int i5 = zzchz.zzd;
                                com.google.android.gms.ads.internal.zzt.zzw();
                                int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzz)).intValue();
                                URL url = new URL(str);
                                int i6 = 0;
                                while (true) {
                                    i6++;
                                    if (i6 > 20) {
                                        throw new IOException("Too many redirects (20)");
                                    }
                                    URLConnection openConnection = url.openConnection();
                                    openConnection.setConnectTimeout(intValue);
                                    openConnection.setReadTimeout(intValue);
                                    if (!(openConnection instanceof HttpURLConnection)) {
                                        throw new IOException("Invalid protocol.");
                                    }
                                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                                    zzceb zzcebVar = new zzceb(null);
                                    zzcebVar.zzc(httpURLConnection, null);
                                    httpURLConnection.setInstanceFollowRedirects(false);
                                    int responseCode2 = httpURLConnection.getResponseCode();
                                    zzcebVar.zze(httpURLConnection, responseCode2);
                                    if (responseCode2 / 100 != 3) {
                                        return httpURLConnection;
                                    }
                                    String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                                    if (headerField == null) {
                                        throw new IOException("Missing Location header in redirect");
                                    }
                                    URL url2 = new URL(url, headerField);
                                    String protocol = url2.getProtocol();
                                    if (protocol == null) {
                                        throw new IOException("Protocol is null");
                                    }
                                    if (!protocol.equals("http") && !protocol.equals(TournamentShareDialogURIBuilder.scheme)) {
                                        throw new IOException("Unsupported scheme: ".concat(protocol));
                                    }
                                    zzcec.zze("Redirecting to ".concat(headerField));
                                    httpURLConnection.disconnect();
                                    url = url2;
                                }
                            }
                        }, 265, -1);
                        if ((zzn instanceof HttpURLConnection) && (responseCode = zzn.getResponseCode()) >= 400) {
                            str2 = "badUrl";
                            try {
                                str7 = "HTTP request failed. Code: " + Integer.toString(responseCode);
                            } catch (IOException | RuntimeException e) {
                                e = e;
                                str4 = null;
                            }
                            try {
                                throw new IOException("HTTP status code " + responseCode + " at " + str);
                            } catch (IOException | RuntimeException e2) {
                                e = e2;
                                str4 = str7;
                                str3 = concat;
                                if (e instanceof RuntimeException) {
                                }
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException | NullPointerException unused) {
                                }
                                if (this.zzh) {
                                }
                                if (file.exists()) {
                                }
                                zzg(str, file.getAbsolutePath(), str2, str4);
                                zze.remove(str3);
                                return false;
                            }
                        }
                        int contentLength = zzn.getContentLength();
                        if (contentLength < 0) {
                            zzcec.zzj("Stream cache aborted, missing content-length header at " + str);
                            zzg(str, file.getAbsolutePath(), "contentLengthMissing", null);
                            set.remove(concat);
                            return false;
                        }
                        String format = zzf.format(contentLength);
                        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzv)).intValue();
                        if (contentLength > intValue) {
                            zzcec.zzj("Content length " + format + " exceeds limit at " + str);
                            StringBuilder sb = new StringBuilder();
                            sb.append("File too big for full file cache. Size: ");
                            sb.append(format);
                            zzg(str, file.getAbsolutePath(), "sizeExceeded", sb.toString());
                            set.remove(concat);
                            return false;
                        }
                        zzcec.zze("Caching " + format + " bytes from " + str);
                        ReadableByteChannel newChannel = Channels.newChannel(zzn.getInputStream());
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                        try {
                            FileChannel channel = fileOutputStream3.getChannel();
                            ByteBuffer allocate = ByteBuffer.allocate(1048576);
                            Clock zzB = com.google.android.gms.ads.internal.zzt.zzB();
                            long currentTimeMillis = zzB.currentTimeMillis();
                            com.google.android.gms.ads.internal.util.zzcb zzcbVar2 = new com.google.android.gms.ads.internal.util.zzcb(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzy)).longValue());
                            zzbfu zzbfuVar = zzbgc.zzx;
                            zzbga zzc = com.google.android.gms.ads.internal.client.zzba.zzc();
                            long longValue = ((Long) zzc.zza(zzbfuVar)).longValue();
                            i2 = 0;
                            while (true) {
                                int read = newChannel.read(allocate);
                                if (read < 0) {
                                    break;
                                }
                                i2 += read;
                                try {
                                    try {
                                        if (i2 > intValue) {
                                            String str8 = "File too big for full file cache. Size: " + Integer.toString(i2);
                                            throw new IOException("stream cache file size limit exceeded");
                                        }
                                        try {
                                            allocate.flip();
                                            do {
                                            } while (channel.write(allocate) > 0);
                                            allocate.clear();
                                            if (zzB.currentTimeMillis() - currentTimeMillis > 1000 * longValue) {
                                                String str9 = "Timeout exceeded. Limit: " + Long.toString(longValue) + " sec";
                                                throw new IOException("stream cache time limit exceeded");
                                            }
                                            ByteBuffer byteBuffer = allocate;
                                            if (this.zzh) {
                                                throw new IOException("abort requested");
                                            }
                                            if (zzcbVar2.zzb()) {
                                                str5 = str2;
                                                try {
                                                    zzcbVar = zzcbVar2;
                                                    str6 = concat;
                                                    fileChannel = channel;
                                                    fileOutputStream = fileOutputStream3;
                                                    readableByteChannel = newChannel;
                                                    i3 = intValue;
                                                    i4 = contentLength;
                                                    try {
                                                        try {
                                                            zzcdv.zza.post(new zzchq(this, str, file.getAbsolutePath(), i2, contentLength, false));
                                                        } catch (IOException e3) {
                                                            e = e3;
                                                            str3 = str6;
                                                            str2 = str5;
                                                            fileOutputStream2 = fileOutputStream;
                                                            str4 = null;
                                                            if (e instanceof RuntimeException) {
                                                                com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "VideoStreamFullFileCache.preload");
                                                            }
                                                            fileOutputStream2.close();
                                                            if (this.zzh) {
                                                                zzcec.zzi("Preload aborted for URL \"" + str + "\"");
                                                            } else {
                                                                zzcec.zzk("Preload failed for URL \"" + str + "\"", e);
                                                            }
                                                            if (file.exists() && !file.delete()) {
                                                                zzcec.zzj("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                            }
                                                            zzg(str, file.getAbsolutePath(), str2, str4);
                                                            zze.remove(str3);
                                                            return false;
                                                        }
                                                    } catch (RuntimeException e4) {
                                                        e = e4;
                                                        str3 = str6;
                                                        str2 = str5;
                                                        fileOutputStream2 = fileOutputStream;
                                                        str4 = null;
                                                        if (e instanceof RuntimeException) {
                                                        }
                                                        fileOutputStream2.close();
                                                        if (this.zzh) {
                                                        }
                                                        if (file.exists()) {
                                                            zzcec.zzj("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                        }
                                                        zzg(str, file.getAbsolutePath(), str2, str4);
                                                        zze.remove(str3);
                                                        return false;
                                                    }
                                                } catch (IOException e5) {
                                                    e = e5;
                                                    fileOutputStream = fileOutputStream3;
                                                    str6 = concat;
                                                    str3 = str6;
                                                    str2 = str5;
                                                    fileOutputStream2 = fileOutputStream;
                                                    str4 = null;
                                                    if (e instanceof RuntimeException) {
                                                    }
                                                    fileOutputStream2.close();
                                                    if (this.zzh) {
                                                    }
                                                    if (file.exists()) {
                                                    }
                                                    zzg(str, file.getAbsolutePath(), str2, str4);
                                                    zze.remove(str3);
                                                    return false;
                                                } catch (RuntimeException e6) {
                                                    e = e6;
                                                    fileOutputStream = fileOutputStream3;
                                                    str6 = concat;
                                                    str3 = str6;
                                                    str2 = str5;
                                                    fileOutputStream2 = fileOutputStream;
                                                    str4 = null;
                                                    if (e instanceof RuntimeException) {
                                                    }
                                                    fileOutputStream2.close();
                                                    if (this.zzh) {
                                                    }
                                                    if (file.exists()) {
                                                    }
                                                    zzg(str, file.getAbsolutePath(), str2, str4);
                                                    zze.remove(str3);
                                                    return false;
                                                }
                                            } else {
                                                zzcbVar = zzcbVar2;
                                                fileChannel = channel;
                                                fileOutputStream = fileOutputStream3;
                                                readableByteChannel = newChannel;
                                                i3 = intValue;
                                                i4 = contentLength;
                                                str6 = concat;
                                                str5 = str2;
                                            }
                                            allocate = byteBuffer;
                                            newChannel = readableByteChannel;
                                            str2 = str5;
                                            zzcbVar2 = zzcbVar;
                                            concat = str6;
                                            channel = fileChannel;
                                            fileOutputStream3 = fileOutputStream;
                                            intValue = i3;
                                            contentLength = i4;
                                        } catch (IOException | RuntimeException e7) {
                                            e = e7;
                                            fileOutputStream = fileOutputStream3;
                                            str6 = concat;
                                            str5 = str2;
                                        }
                                    } catch (IOException | RuntimeException e8) {
                                        e = e8;
                                        str4 = zzc;
                                        str3 = str6;
                                        fileOutputStream2 = fileOutputStream;
                                        if (e instanceof RuntimeException) {
                                        }
                                        fileOutputStream2.close();
                                        if (this.zzh) {
                                        }
                                        if (file.exists()) {
                                        }
                                        zzg(str, file.getAbsolutePath(), str2, str4);
                                        zze.remove(str3);
                                        return false;
                                    }
                                } catch (IOException | RuntimeException e9) {
                                    e = e9;
                                    str3 = str6;
                                    fileOutputStream2 = fileOutputStream;
                                    str4 = null;
                                    if (e instanceof RuntimeException) {
                                    }
                                    fileOutputStream2.close();
                                    if (this.zzh) {
                                    }
                                    if (file.exists()) {
                                    }
                                    zzg(str, file.getAbsolutePath(), str2, str4);
                                    zze.remove(str3);
                                    return false;
                                }
                            }
                        } catch (IOException | RuntimeException e10) {
                            e = e10;
                            fileOutputStream = fileOutputStream3;
                            str3 = concat;
                            str5 = str2;
                        }
                    } catch (IOException | RuntimeException e11) {
                        e = e11;
                        str3 = concat;
                        str2 = "error";
                        str4 = null;
                        fileOutputStream2 = null;
                    }
                }
            }
        } while (z);
        zzcec.zzj("Unable to expire stream cache");
        zzg(str, null, "expireFailed", null);
        return false;
        zzh(str, file.getAbsolutePath(), i2);
        str3 = str6;
        try {
            zze.remove(str3);
            return true;
        } catch (IOException e12) {
            e = e12;
            str2 = str5;
            fileOutputStream2 = fileOutputStream;
            str4 = null;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream2.close();
            if (this.zzh) {
            }
            if (file.exists()) {
            }
            zzg(str, file.getAbsolutePath(), str2, str4);
            zze.remove(str3);
            return false;
        } catch (RuntimeException e13) {
            e = e13;
            str2 = str5;
            fileOutputStream2 = fileOutputStream;
            str4 = null;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream2.close();
            if (this.zzh) {
            }
            if (file.exists()) {
            }
            zzg(str, file.getAbsolutePath(), str2, str4);
            zze.remove(str3);
            return false;
        }
    }
}
