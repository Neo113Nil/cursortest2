package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.google.common.net.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzcih extends zzgq implements zzht {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzc = new AtomicReference();
    private final SSLSocketFactory zzd;
    private final int zze;
    private final int zzf;
    private final String zzg;
    private final zzhs zzh;
    private zzhb zzi;
    private HttpURLConnection zzj;
    private InputStream zzk;
    private boolean zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private final Set zzs;

    zzcih(String str, zzhy zzhyVar, int i, int i2, int i3) {
        super(true);
        this.zzd = new zzcig(this);
        this.zzs = new HashSet();
        zzek.zzc(str);
        this.zzg = str;
        this.zzh = new zzhs();
        this.zze = i;
        this.zzf = i2;
        this.zzr = i3;
        if (zzhyVar != null) {
            zzf(zzhyVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzcec.zzh("Unexpected error while disconnecting", e);
            }
            this.zzj = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0102, code lost:
    
        if (r2 == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x023c A[Catch: IOException -> 0x028c, TryCatch #4 {IOException -> 0x028c, blocks: (B:3:0x000e, B:4:0x0025, B:6:0x002b, B:8:0x0035, B:9:0x003d, B:10:0x0055, B:12:0x005b, B:19:0x007f, B:21:0x0099, B:22:0x00ab, B:23:0x00b0, B:25:0x00b9, B:26:0x00c0, B:40:0x00e8, B:102:0x0231, B:104:0x023c, B:106:0x024d, B:112:0x0256, B:113:0x0265, B:116:0x026d, B:117:0x0274, B:120:0x0275, B:121:0x028b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9 A[Catch: IOException -> 0x028c, TryCatch #4 {IOException -> 0x028c, blocks: (B:3:0x000e, B:4:0x0025, B:6:0x002b, B:8:0x0035, B:9:0x003d, B:10:0x0055, B:12:0x005b, B:19:0x007f, B:21:0x0099, B:22:0x00ab, B:23:0x00b0, B:25:0x00b9, B:26:0x00c0, B:40:0x00e8, B:102:0x0231, B:104:0x023c, B:106:0x024d, B:112:0x0256, B:113:0x0265, B:116:0x026d, B:117:0x0274, B:120:0x0275, B:121:0x028b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzhb zzhbVar) throws zzhp {
        int responseCode;
        String headerField;
        int responseCode2;
        long j;
        long parseLong;
        String headerField2;
        this.zzi = zzhbVar;
        long j2 = 0;
        this.zzq = 0L;
        this.zzp = 0L;
        try {
            URL url = new URL(zzhbVar.zza.toString());
            byte[] bArr = zzhbVar.zzc;
            long j3 = zzhbVar.zzf;
            long j4 = zzhbVar.zzg;
            boolean zza = zzhbVar.zza(1);
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i > 20) {
                    throw new NoRouteToHostException("Too many redirects: " + i2);
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.zzd);
                }
                httpURLConnection.setConnectTimeout(this.zze);
                httpURLConnection.setReadTimeout(this.zzf);
                for (Map.Entry entry : this.zzh.zza().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j3 == j2) {
                    if (j4 != -1) {
                    }
                    httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, this.zzg);
                    if (!zza) {
                        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "identity");
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.zzj = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            this.zzm = responseCode2;
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.zzj.getHeaderFields();
                                zzn();
                                zzhr zzhrVar = new zzhr(this.zzm, null, null, headerFields, zzhbVar, zzfy.zzf);
                                if (this.zzm == 416) {
                                    throw zzhrVar;
                                }
                                zzhrVar.initCause(new zzgx(2008));
                                throw zzhrVar;
                            }
                            if (responseCode2 == 200) {
                                j = zzhbVar.zzf;
                            }
                            j = 0;
                            this.zzn = j;
                            if (zzhbVar.zza(1)) {
                                this.zzo = zzhbVar.zzg;
                            } else {
                                long j5 = zzhbVar.zzg;
                                if (j5 != -1) {
                                    this.zzo = j5;
                                } else {
                                    HttpURLConnection httpURLConnection2 = this.zzj;
                                    String headerField3 = httpURLConnection2.getHeaderField(HttpHeaders.CONTENT_LENGTH);
                                    if (!TextUtils.isEmpty(headerField3)) {
                                        try {
                                            parseLong = Long.parseLong(headerField3);
                                        } catch (NumberFormatException unused) {
                                            zzcec.zzg("Unexpected Content-Length [" + headerField3 + "]");
                                        }
                                        headerField2 = httpURLConnection2.getHeaderField(HttpHeaders.CONTENT_RANGE);
                                        if (!TextUtils.isEmpty(headerField2)) {
                                            Matcher matcher = zzb.matcher(headerField2);
                                            if (matcher.find()) {
                                                try {
                                                    long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                    if (parseLong < 0) {
                                                        parseLong = parseLong2;
                                                    } else if (parseLong != parseLong2) {
                                                        zzcec.zzj("Inconsistent headers [" + headerField3 + "] [" + headerField2 + "]");
                                                        parseLong = Math.max(parseLong, parseLong2);
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                    zzcec.zzg("Unexpected Content-Range [" + headerField2 + "]");
                                                }
                                            }
                                        }
                                        this.zzo = parseLong != -1 ? parseLong - this.zzn : -1L;
                                    }
                                    parseLong = -1;
                                    headerField2 = httpURLConnection2.getHeaderField(HttpHeaders.CONTENT_RANGE);
                                    if (!TextUtils.isEmpty(headerField2)) {
                                    }
                                    this.zzo = parseLong != -1 ? parseLong - this.zzn : -1L;
                                }
                            }
                            try {
                                this.zzk = this.zzj.getInputStream();
                                this.zzl = true;
                                zzj(zzhbVar);
                                return this.zzo;
                            } catch (IOException e) {
                                zzn();
                                throw new zzhp(e, zzhbVar, 2000, 1);
                            }
                        } catch (IOException e2) {
                            zzn();
                            throw new zzhp("Unable to connect to ".concat(String.valueOf(zzhbVar.zza.toString())), e2, zzhbVar, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (!TournamentShareDialogURIBuilder.scheme.equals(protocol) && !"http".equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i = i2;
                    j2 = 0;
                } else {
                    j2 = j3;
                }
                String str = "bytes=" + j2 + "-";
                if (j4 != -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append((j2 + j4) - 1);
                    str = sb.toString();
                }
                httpURLConnection.setRequestProperty(HttpHeaders.RANGE, str);
                httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, this.zzg);
                if (!zza) {
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.zzj = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    this.zzm = responseCode2;
                    if (responseCode2 >= 200) {
                    }
                    Map<String, List<String>> headerFields2 = this.zzj.getHeaderFields();
                    zzn();
                    zzhr zzhrVar2 = new zzhr(this.zzm, null, null, headerFields2, zzhbVar, zzfy.zzf);
                    if (this.zzm == 416) {
                    }
                }
                headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                httpURLConnection.disconnect();
                if (headerField != null) {
                }
            }
        } catch (IOException e3) {
            throw new zzhp("Unable to connect to ".concat(String.valueOf(zzhbVar.zza.toString())), e3, zzhbVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void zzd() throws zzhp {
        try {
            if (this.zzk != null) {
                int i = zzfy.zza;
                try {
                    this.zzk.close();
                } catch (IOException e) {
                    throw new zzhp(e, this.zzi, 2000, 3);
                }
            }
        } finally {
            this.zzk = null;
            zzn();
            if (this.zzl) {
                this.zzl = false;
                zzh();
            }
            this.zzs.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgq, com.google.android.gms.internal.ads.zzgw
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final void zzm(int i) {
        this.zzr = i;
        for (Socket socket : this.zzs) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzr);
                } catch (SocketException e) {
                    zzcec.zzk("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i, int i2) throws zzhp {
        try {
            if (this.zzp != this.zzn) {
                byte[] bArr2 = (byte[]) zzc.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.zzp;
                    long j2 = this.zzn;
                    if (j == j2) {
                        zzc.set(bArr2);
                        break;
                    }
                    int read = this.zzk.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.zzp += read;
                    zzg(read);
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.zzo;
            if (j3 != -1) {
                long j4 = j3 - this.zzq;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                }
                return -1;
            }
            int read2 = this.zzk.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.zzo == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzq += read2;
            zzg(read2);
            return read2;
        } catch (IOException e) {
            throw new zzhp(e, this.zzi, 2000, 2);
        }
    }
}
