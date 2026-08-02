package com.google.android.gms.measurement.internal;

import androidx.fragment.app.FragmentTransitionImpl;
import com.google.android.gms.common.internal.zzae;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;
import papa.InteractionResult;

/* loaded from: classes4.dex */
public final class zzgy implements Runnable {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ InteractionResult zza;
    public final URL zzb;
    public final byte[] zzc;
    public final Object zzd;
    public final String zze;
    public final Map zzf;

    public zzgy(zzgz zzgzVar, String str, URL url, byte[] bArr, Map map, zzgw zzgwVar) {
        Objects.requireNonNull(zzgzVar);
        this.zza = zzgzVar;
        zzae.checkNotEmpty(str);
        zzae.checkNotNull(url);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzgwVar;
        this.zze = str;
        this.zzf = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        int i;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        HttpURLConnection httpURLConnection2;
        Map map2;
        zzgx zzgxVar;
        zzhz zzhzVar;
        URLConnection openConnection;
        Map<String, List<String>> headerFields;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        Throwable th2;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection3;
        Map map3;
        IOException iOException2;
        OutputStream outputStream2;
        HttpURLConnection httpURLConnection4;
        Map map4;
        Map map5;
        ?? r7;
        Map map6;
        InputStream inputStream2;
        Object obj = this.zzd;
        int i2 = this.$r8$classId;
        ?? r6 = "Content-Encoding";
        byte[] bArr2 = this.zzc;
        Map map7 = this.zzf;
        URL url = this.zzb;
        InteractionResult interactionResult = this.zza;
        int i3 = 0;
        String str = this.zze;
        switch (i2) {
            case 0:
                OutputStream outputStream3 = null;
                zzgz zzgzVar = (zzgz) interactionResult;
                zzic zzicVar = (zzic) zzgzVar.$$delegate_0;
                zzic zzicVar2 = (zzic) zzgzVar.$$delegate_0;
                zzhz zzhzVar2 = zzicVar.zzj;
                zzic.zzP(zzhzVar2);
                zzhzVar2.zzaY();
                try {
                    openConnection = url.openConnection();
                } catch (IOException e) {
                    iOException = e;
                    i = 0;
                    httpURLConnection2 = null;
                    map2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    i = 0;
                    httpURLConnection = null;
                    map = null;
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Failed to obtain HTTP connection");
                }
                httpURLConnection2 = (HttpURLConnection) openConnection;
                httpURLConnection2.setDefaultUseCaches(false);
                zzicVar2.getClass();
                httpURLConnection2.setConnectTimeout(60000);
                httpURLConnection2.setReadTimeout(61000);
                httpURLConnection2.setInstanceFollowRedirects(false);
                httpURLConnection2.setDoInput(true);
                if (map7 != null) {
                    try {
                        for (Map.Entry entry : map7.entrySet()) {
                            httpURLConnection2.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    } catch (IOException e2) {
                        iOException = e2;
                        i = 0;
                        map2 = null;
                        if (outputStream3 != null) {
                        }
                        if (httpURLConnection2 != null) {
                        }
                        zzhzVar = zzicVar2.zzj;
                        zzic.zzP(zzhzVar);
                        zzgxVar = new zzgx(this.zze, (zzgw) obj, i, iOException, null, map2);
                        zzhzVar.zzj(zzgxVar);
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        httpURLConnection = httpURLConnection2;
                        i = 0;
                        map = null;
                        th = th;
                        if (outputStream3 != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        zzhz zzhzVar3 = zzicVar2.zzj;
                        zzic.zzP(zzhzVar3);
                        zzhzVar3.zzj(new zzgx(this.zze, (zzgw) obj, i, null, null, map));
                        throw th;
                    }
                }
                if (bArr2 != null) {
                    zzpk zzpkVar = zzgzVar.zzg.zzi;
                    zzpg.zzaT(zzpkVar);
                    byte[] zzv = zzpkVar.zzv(bArr2);
                    zzgu zzguVar = zzicVar2.zzi;
                    zzic.zzP(zzguVar);
                    zzgs zzgsVar = zzguVar.zzl;
                    int length = zzv.length;
                    zzgsVar.zzb(Integer.valueOf(length), "Uploading data. size");
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection2.setFixedLengthStreamingMode(length);
                    httpURLConnection2.connect();
                    OutputStream outputStream4 = httpURLConnection2.getOutputStream();
                    try {
                        outputStream4.write(zzv);
                        outputStream4.close();
                    } catch (IOException e3) {
                        iOException = e3;
                        i = 0;
                        map2 = null;
                        outputStream3 = outputStream4;
                        if (outputStream3 != null) {
                        }
                        if (httpURLConnection2 != null) {
                        }
                        zzhzVar = zzicVar2.zzj;
                        zzic.zzP(zzhzVar);
                        zzgxVar = new zzgx(this.zze, (zzgw) obj, i, iOException, null, map2);
                        zzhzVar.zzj(zzgxVar);
                        return;
                    } catch (Throwable th5) {
                        th = th5;
                        i = 0;
                        map = null;
                        outputStream3 = outputStream4;
                        httpURLConnection = httpURLConnection2;
                        th = th;
                        if (outputStream3 != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        zzhz zzhzVar32 = zzicVar2.zzj;
                        zzic.zzP(zzhzVar32);
                        zzhzVar32.zzj(new zzgx(this.zze, (zzgw) obj, i, null, null, map));
                        throw th;
                    }
                }
                i = httpURLConnection2.getResponseCode();
                try {
                    try {
                        headerFields = httpURLConnection2.getHeaderFields();
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection2.getInputStream();
                        } catch (Throwable th6) {
                            th = th6;
                            inputStream = null;
                        }
                        try {
                            bArr = new byte[1024];
                        } catch (Throwable th7) {
                            th = th7;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    } catch (IOException e4) {
                        iOException = e4;
                        if (outputStream3 != null) {
                            try {
                                outputStream3.close();
                            } catch (IOException e5) {
                                zzgu zzguVar2 = zzicVar2.zzi;
                                zzic.zzP(zzguVar2);
                                zzguVar2.zzd.zzc("Error closing HTTP compressed POST connection output stream. appId", zzgu.zzl(str), e5);
                            }
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        zzhzVar = zzicVar2.zzj;
                        zzic.zzP(zzhzVar);
                        zzgxVar = new zzgx(this.zze, (zzgw) obj, i, iOException, null, map2);
                        zzhzVar.zzj(zzgxVar);
                        return;
                    } catch (Throwable th8) {
                        th = th8;
                        httpURLConnection = httpURLConnection2;
                        th = th;
                        if (outputStream3 != null) {
                            try {
                                outputStream3.close();
                            } catch (IOException e6) {
                                zzgu zzguVar3 = zzicVar2.zzi;
                                zzic.zzP(zzguVar3);
                                zzguVar3.zzd.zzc("Error closing HTTP compressed POST connection output stream. appId", zzgu.zzl(str), e6);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzhz zzhzVar322 = zzicVar2.zzj;
                        zzic.zzP(zzhzVar322);
                        zzhzVar322.zzj(new zzgx(this.zze, (zzgw) obj, i, null, null, map));
                        throw th;
                    }
                } catch (IOException e7) {
                    iOException = e7;
                    map2 = null;
                    if (outputStream3 != null) {
                    }
                    if (httpURLConnection2 != null) {
                    }
                    zzhzVar = zzicVar2.zzj;
                    zzic.zzP(zzhzVar);
                    zzgxVar = new zzgx(this.zze, (zzgw) obj, i, iOException, null, map2);
                    zzhzVar.zzj(zzgxVar);
                    return;
                } catch (Throwable th9) {
                    th = th9;
                    httpURLConnection = httpURLConnection2;
                    map = null;
                    th = th;
                    if (outputStream3 != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    zzhz zzhzVar3222 = zzicVar2.zzj;
                    zzic.zzP(zzhzVar3222);
                    zzhzVar3222.zzj(new zzgx(this.zze, (zzgw) obj, i, null, null, map));
                    throw th;
                }
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        inputStream.close();
                        httpURLConnection2.disconnect();
                        zzhzVar = zzicVar2.zzj;
                        zzic.zzP(zzhzVar);
                        zzgxVar = new zzgx(this.zze, (zzgw) obj, i, null, byteArray, headerFields);
                        zzhzVar.zzj(zzgxVar);
                        return;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            default:
                zzlo zzloVar = (zzlo) interactionResult;
                zzic zzicVar3 = (zzic) zzloVar.$$delegate_0;
                zzic zzicVar4 = (zzic) zzloVar.$$delegate_0;
                zzhz zzhzVar4 = zzicVar3.zzj;
                zzic.zzP(zzhzVar4);
                zzhzVar4.zzaY();
                try {
                    URLConnection openConnection2 = url.openConnection();
                    if (!(openConnection2 instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    HttpURLConnection httpURLConnection5 = (HttpURLConnection) openConnection2;
                    httpURLConnection5.setDefaultUseCaches(false);
                    zzicVar4.getClass();
                    httpURLConnection5.setConnectTimeout(60000);
                    httpURLConnection5.setReadTimeout(61000);
                    httpURLConnection5.setInstanceFollowRedirects(false);
                    httpURLConnection5.setDoInput(true);
                    if (map7 != null) {
                        try {
                            try {
                                for (Map.Entry entry2 : map7.entrySet()) {
                                    httpURLConnection5.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                httpURLConnection3 = httpURLConnection5;
                                outputStream = null;
                                r7 = 0;
                                th2 = th;
                                map3 = r7;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e8) {
                                        zzgu zzguVar4 = zzicVar4.zzi;
                                        zzic.zzP(zzguVar4);
                                        zzguVar4.zzd.zzc("Error closing HTTP compressed POST connection output stream. appId", zzgu.zzl(str), e8);
                                    }
                                }
                                if (httpURLConnection3 != null) {
                                    httpURLConnection3.disconnect();
                                }
                                zzb(i3, null, null, map3);
                                throw th2;
                            }
                        } catch (IOException e9) {
                            e = e9;
                            httpURLConnection4 = httpURLConnection5;
                            map5 = null;
                            iOException2 = e;
                            outputStream2 = null;
                            map4 = map5;
                            if (outputStream2 != null) {
                                try {
                                    outputStream2.close();
                                } catch (IOException e10) {
                                    zzgu zzguVar5 = zzicVar4.zzi;
                                    zzic.zzP(zzguVar5);
                                    zzguVar5.zzd.zzc("Error closing HTTP compressed POST connection output stream. appId", zzgu.zzl(str), e10);
                                }
                            }
                            if (httpURLConnection4 != null) {
                                httpURLConnection4.disconnect();
                            }
                            zzb(i3, iOException2, null, map4);
                            return;
                        }
                    }
                    if (bArr2 != null) {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                            gZIPOutputStream.write(bArr2);
                            gZIPOutputStream.close();
                            byteArrayOutputStream2.close();
                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                            zzgu zzguVar6 = zzicVar4.zzi;
                            zzic.zzP(zzguVar6);
                            zzgs zzgsVar2 = zzguVar6.zzl;
                            int length2 = byteArray2.length;
                            zzgsVar2.zzb(Integer.valueOf(length2), "Uploading data. size");
                            httpURLConnection5.setDoOutput(true);
                            httpURLConnection5.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection5.setFixedLengthStreamingMode(length2);
                            httpURLConnection5.connect();
                            outputStream = httpURLConnection5.getOutputStream();
                            try {
                                outputStream.write(byteArray2);
                                outputStream.close();
                            } catch (IOException e11) {
                                iOException2 = e11;
                                outputStream2 = outputStream;
                                httpURLConnection4 = httpURLConnection5;
                                map4 = null;
                                if (outputStream2 != null) {
                                }
                                if (httpURLConnection4 != null) {
                                }
                                zzb(i3, iOException2, null, map4);
                                return;
                            } catch (Throwable th11) {
                                th = th11;
                                httpURLConnection3 = httpURLConnection5;
                                r7 = 0;
                                th2 = th;
                                map3 = r7;
                                if (outputStream != null) {
                                }
                                if (httpURLConnection3 != null) {
                                }
                                zzb(i3, null, null, map3);
                                throw th2;
                            }
                        } catch (IOException e12) {
                            zzgu zzguVar7 = zzicVar4.zzi;
                            zzic.zzP(zzguVar7);
                            zzguVar7.zzd.zzb(e12, "Failed to gzip post request content");
                            throw e12;
                        }
                    }
                    int responseCode = httpURLConnection5.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields2 = httpURLConnection5.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                inputStream2 = httpURLConnection5.getInputStream();
                                try {
                                    byte[] bArr3 = new byte[1024];
                                    while (true) {
                                        int read2 = inputStream2.read(bArr3);
                                        if (read2 <= 0) {
                                            byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                            inputStream2.close();
                                            httpURLConnection5.disconnect();
                                            zzb(responseCode, null, byteArray3, headerFields2);
                                            return;
                                        }
                                        byteArrayOutputStream3.write(bArr3, 0, read2);
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                inputStream2 = null;
                            }
                        } catch (IOException e13) {
                            e = e13;
                            i3 = responseCode;
                            map6 = null;
                            httpURLConnection4 = httpURLConnection5;
                            map5 = map6;
                            iOException2 = e;
                            outputStream2 = null;
                            map4 = map5;
                            if (outputStream2 != null) {
                            }
                            if (httpURLConnection4 != null) {
                            }
                            zzb(i3, iOException2, null, map4);
                            return;
                        } catch (Throwable th14) {
                            th = th14;
                            httpURLConnection3 = httpURLConnection5;
                            i3 = responseCode;
                            outputStream = null;
                            r7 = 0;
                            th2 = th;
                            map3 = r7;
                            if (outputStream != null) {
                            }
                            if (httpURLConnection3 != null) {
                            }
                            zzb(i3, null, null, map3);
                            throw th2;
                        }
                    } catch (IOException e14) {
                        e = e14;
                        i3 = responseCode;
                        map6 = r6;
                        httpURLConnection4 = httpURLConnection5;
                        map5 = map6;
                        iOException2 = e;
                        outputStream2 = null;
                        map4 = map5;
                        if (outputStream2 != null) {
                        }
                        if (httpURLConnection4 != null) {
                        }
                        zzb(i3, iOException2, null, map4);
                        return;
                    } catch (Throwable th15) {
                        th = th15;
                        i3 = responseCode;
                        r7 = "Content-Encoding";
                        outputStream = null;
                        httpURLConnection3 = httpURLConnection5;
                        th2 = th;
                        map3 = r7;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection3 != null) {
                        }
                        zzb(i3, null, null, map3);
                        throw th2;
                    }
                } catch (IOException e15) {
                    iOException2 = e15;
                    outputStream2 = null;
                    httpURLConnection4 = null;
                } catch (Throwable th16) {
                    th2 = th16;
                    outputStream = null;
                    httpURLConnection3 = null;
                    map3 = null;
                }
        }
    }

    public void zzb(int i, IOException iOException, byte[] bArr, Map map) {
        zzhz zzhzVar = ((zzic) ((zzlo) this.zza).$$delegate_0).zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzj(new FragmentTransitionImpl.AnonymousClass1(this, i, iOException, bArr, map));
    }

    public zzgy(zzlo zzloVar, String str, URL url, byte[] bArr, HashMap hashMap, zzll zzllVar) {
        Objects.requireNonNull(zzloVar);
        this.zza = zzloVar;
        zzae.checkNotEmpty(str);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzllVar;
        this.zze = str;
        this.zzf = hashMap;
    }
}
