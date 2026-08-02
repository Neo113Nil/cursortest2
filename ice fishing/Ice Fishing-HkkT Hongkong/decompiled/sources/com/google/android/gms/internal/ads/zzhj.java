package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.browser.trusted.sharing.ShareTarget;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzhj extends zzgq implements zzht {
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzhs zzf;
    private final zzhs zzg;
    private zzhb zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;

    @Deprecated
    public zzhj() {
        this(null, 8000, 8000, false, null, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final HttpURLConnection zzk(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzc);
        httpURLConnection.setReadTimeout(this.zzd);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.zzf.zza());
        hashMap.putAll(this.zzg.zza());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j == 0) {
            if (j2 == -1) {
                sb = null;
                if (sb != null) {
                    httpURLConnection.setRequestProperty(HttpHeaders.RANGE, sb);
                }
                str = this.zze;
                if (str != null) {
                    httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, str);
                }
                httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, true == z ? "identity" : "gzip");
                httpURLConnection.setInstanceFollowRedirects(z2);
                httpURLConnection.setDoOutput(false);
                int i2 = zzhb.zzj;
                httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
                httpURLConnection.connect();
                return httpURLConnection;
            }
            j = 0;
        }
        StringBuilder sb2 = new StringBuilder("bytes=");
        sb2.append(j);
        sb2.append("-");
        if (j2 != -1) {
            sb2.append((j + j2) - 1);
        }
        sb = sb2.toString();
        if (sb != null) {
        }
        str = this.zze;
        if (str != null) {
        }
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, true == z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        int i22 = zzhb.zzj;
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, String str, zzhb zzhbVar) throws zzhp {
        if (str == null) {
            throw new zzhp("Null location redirect", zzhbVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!TournamentShareDialogURIBuilder.scheme.equals(protocol) && !"http".equals(protocol)) {
                throw new zzhp("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzhbVar, 2001, 1);
            }
            if (this.zzb || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new zzhp("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", zzhbVar, 2001, 1);
        } catch (MalformedURLException e) {
            throw new zzhp(e, zzhbVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzff.zzd("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i, int i2) throws zzhp {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzm;
            if (j != -1) {
                long j2 = j - this.zzn;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                }
                return -1;
            }
            InputStream inputStream = this.zzj;
            int i3 = zzfy.zza;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.zzn += read;
            zzg(read);
            return read;
        } catch (IOException e) {
            zzhb zzhbVar = this.zzh;
            int i4 = zzfy.zza;
            throw zzhp.zza(e, zzhbVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ba, code lost:
    
        if (r10 == 0) goto L37;
     */
    @Override // com.google.android.gms.internal.ads.zzgw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzhb zzhbVar) throws zzhp {
        int i;
        URL url;
        long j;
        long j2;
        boolean zza;
        HttpURLConnection httpURLConnection;
        String str;
        byte[] bArr;
        long j3;
        this.zzh = zzhbVar;
        this.zzn = 0L;
        this.zzm = 0L;
        zzi(zzhbVar);
        try {
            url = new URL(zzhbVar.zza.toString());
            int i2 = zzhbVar.zzb;
            byte[] bArr2 = zzhbVar.zzc;
            j = zzhbVar.zzf;
            j2 = zzhbVar.zzg;
            zza = zzhbVar.zza(1);
            try {
            } catch (IOException e) {
                e = e;
                i = 1;
            }
        } catch (IOException e2) {
            e = e2;
            i = 1;
        }
        if (this.zzb) {
            URL url2 = url;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 > 20) {
                    i = 1;
                    throw new zzhp(new NoRouteToHostException("Too many redirects: " + i4), zzhbVar, 2001, 1);
                }
                long j4 = j2;
                long j5 = j;
                URL url3 = url2;
                HttpURLConnection zzk = zzk(url2, 1, null, j, j2, zza, false, zzhbVar.zzd);
                int responseCode = zzk.getResponseCode();
                String headerField = zzk.getHeaderField(HttpHeaders.LOCATION);
                if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                    httpURLConnection = zzk;
                    break;
                }
                i = 1;
                try {
                    zzk.disconnect();
                    url2 = zzl(url3, headerField, zzhbVar);
                    i3 = i4;
                    j2 = j4;
                    j = j5;
                } catch (IOException e3) {
                    e = e3;
                }
                e = e3;
                zzm();
                throw zzhp.zza(e, zzhbVar, i);
            }
        }
        httpURLConnection = zzk(url, 1, null, j, j2, zza, true, zzhbVar.zzd);
        try {
            this.zzi = httpURLConnection;
            this.zzl = httpURLConnection.getResponseCode();
            String responseMessage = httpURLConnection.getResponseMessage();
            int i5 = this.zzl;
            if (i5 < 200 || i5 > 299) {
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                if (this.zzl == 416) {
                    str = responseMessage;
                    if (zzhbVar.zzf == zzhu.zzb(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_RANGE))) {
                        this.zzk = true;
                        zzj(zzhbVar);
                        long j6 = zzhbVar.zzg;
                        if (j6 != -1) {
                            return j6;
                        }
                        return 0L;
                    }
                } else {
                    str = responseMessage;
                }
                InputStream errorStream = httpURLConnection.getErrorStream();
                try {
                    if (errorStream != null) {
                        int i6 = zzfy.zza;
                        byte[] bArr3 = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int read = errorStream.read(bArr3);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr3, 0, read);
                        }
                        bArr = byteArrayOutputStream.toByteArray();
                    } else {
                        bArr = zzfy.zzf;
                    }
                } catch (IOException unused) {
                    bArr = zzfy.zzf;
                }
                zzm();
                throw new zzhr(this.zzl, str, this.zzl == 416 ? new zzgx(2008) : null, headerFields, zzhbVar, bArr);
            }
            httpURLConnection.getContentType();
            if (this.zzl == 200) {
                j3 = zzhbVar.zzf;
            }
            j3 = 0;
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING));
            if (equalsIgnoreCase) {
                this.zzm = zzhbVar.zzg;
            } else {
                long j7 = zzhbVar.zzg;
                if (j7 != -1) {
                    this.zzm = j7;
                } else {
                    long zza2 = zzhu.zza(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_LENGTH), httpURLConnection.getHeaderField(HttpHeaders.CONTENT_RANGE));
                    this.zzm = zza2 != -1 ? zza2 - j3 : -1L;
                }
            }
            try {
                this.zzj = httpURLConnection.getInputStream();
                if (equalsIgnoreCase) {
                    this.zzj = new GZIPInputStream(this.zzj);
                }
                this.zzk = true;
                zzj(zzhbVar);
                if (j3 != 0) {
                    try {
                        byte[] bArr4 = new byte[4096];
                        while (j3 > 0) {
                            int min = (int) Math.min(j3, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                            InputStream inputStream = this.zzj;
                            int i7 = zzfy.zza;
                            int read2 = inputStream.read(bArr4, 0, min);
                            if (Thread.currentThread().isInterrupted()) {
                                throw new zzhp(new InterruptedIOException(), zzhbVar, 2000, 1);
                            }
                            if (read2 == -1) {
                                throw new zzhp(zzhbVar, 2008, 1);
                            }
                            j3 -= read2;
                            zzg(read2);
                        }
                    } catch (IOException e4) {
                        zzm();
                        if (e4 instanceof zzhp) {
                            throw ((zzhp) e4);
                        }
                        throw new zzhp(e4, zzhbVar, 2000, 1);
                    }
                }
                return this.zzm;
            } catch (IOException e5) {
                zzm();
                throw new zzhp(e5, zzhbVar, 2000, 1);
            }
        } catch (IOException e6) {
            e = e6;
            i = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void zzd() throws zzhp {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                if (this.zzi != null) {
                    int i = zzfy.zza;
                }
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zzhb zzhbVar = this.zzh;
                    int i2 = zzfy.zza;
                    throw new zzhp(e, zzhbVar, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzm();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgq, com.google.android.gms.internal.ads.zzgw
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        return httpURLConnection == null ? zzgad.zzd() : new zzhh(httpURLConnection.getHeaderFields());
    }

    private zzhj(String str, int i, int i2, boolean z, zzhs zzhsVar, zzfxf zzfxfVar, boolean z2) {
        super(true);
        this.zze = str;
        this.zzc = i;
        this.zzd = i2;
        this.zzb = z;
        this.zzf = zzhsVar;
        this.zzg = new zzhs();
    }
}
