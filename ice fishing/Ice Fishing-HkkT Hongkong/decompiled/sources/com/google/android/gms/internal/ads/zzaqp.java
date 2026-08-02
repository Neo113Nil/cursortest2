package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.browser.trusted.sharing.ShareTarget;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.google.common.net.HttpHeaders;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public class zzaqp implements zzapt {
    protected final zzaqr zza;

    @Deprecated
    protected final zzaqo zzb;
    private final zzaqo zzc;

    public zzaqp(zzaqo zzaqoVar) {
        zzaqr zzaqrVar = new zzaqr(4096);
        this.zzc = zzaqoVar;
        this.zzb = zzaqoVar;
        this.zza = zzaqrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x02a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c3  */
    @Override // com.google.android.gms.internal.ads.zzapt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzapw zza(zzaqa zzaqaVar) throws zzaqj {
        zzaqy zzaqyVar;
        byte[] bArr;
        zzarc zzarcVar;
        zzarc zzarcVar2;
        int zzb;
        String str;
        zzaqj zzaqjVar;
        String str2;
        Map map;
        byte[] bArr2;
        byte[] bArr3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            try {
                zzapj zzd = zzaqaVar.zzd();
                if (zzd == null) {
                    map = Collections.emptyMap();
                } else {
                    HashMap hashMap = new HashMap();
                    String str3 = zzd.zzb;
                    if (str3 != null) {
                        hashMap.put(HttpHeaders.IF_NONE_MATCH, str3);
                    }
                    long j = zzd.zzd;
                    if (j > 0) {
                        hashMap.put(HttpHeaders.IF_MODIFIED_SINCE, zzaqx.zzc(j));
                    }
                    map = hashMap;
                }
                String zzk = zzaqaVar.zzk();
                HashMap hashMap2 = new HashMap();
                hashMap2.putAll(map);
                hashMap2.putAll(zzaqaVar.zzl());
                URL url = new URL(zzk);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                int zzb2 = zzaqaVar.zzb();
                httpURLConnection.setConnectTimeout(zzb2);
                httpURLConnection.setReadTimeout(zzb2);
                boolean z = false;
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                TournamentShareDialogURIBuilder.scheme.equals(url.getProtocol());
                try {
                    for (String str4 : hashMap2.keySet()) {
                        httpURLConnection.setRequestProperty(str4, (String) hashMap2.get(str4));
                    }
                    if (zzaqaVar.zza() != 0) {
                        httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
                        byte[] zzx = zzaqaVar.zzx();
                        if (zzx != null) {
                            httpURLConnection.setDoOutput(true);
                            if (!httpURLConnection.getRequestProperties().containsKey(HttpHeaders.CONTENT_TYPE)) {
                                httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded; charset=UTF-8");
                            }
                            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                            dataOutputStream.write(zzx);
                            dataOutputStream.close();
                        }
                    } else {
                        httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == -1) {
                        try {
                            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                        } catch (Throwable th) {
                            th = th;
                            if (!z) {
                            }
                            throw th;
                        }
                    }
                    zzaqaVar.zza();
                    if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                        zzaqyVar = new zzaqy(responseCode, zzara.zza(httpURLConnection.getHeaderFields()), -1, null);
                        httpURLConnection.disconnect();
                    } else {
                        try {
                            zzaqyVar = new zzaqy(responseCode, zzara.zza(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zzaqz(httpURLConnection));
                        } catch (Throwable th2) {
                            th = th2;
                            z = true;
                            if (!z) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (IOException e) {
                                    e = e;
                                    zzaqyVar = null;
                                    bArr = null;
                                    if (e instanceof SocketTimeoutException) {
                                    }
                                    zzarcVar2 = zzarcVar;
                                    zzapo zzy = zzaqaVar.zzy();
                                    zzb = zzaqaVar.zzb();
                                    try {
                                        zzaqjVar = zzarcVar2.zzb;
                                        zzy.zzc(zzaqjVar);
                                        str2 = zzarcVar2.zza;
                                        zzaqaVar.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
                                    } catch (zzaqj e2) {
                                        str = zzarcVar2.zza;
                                        zzaqaVar.zzm(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(zzb)));
                                        throw e2;
                                    }
                                }
                            }
                            throw th;
                        }
                    }
                    try {
                        int zzb3 = zzaqyVar.zzb();
                        List zzd2 = zzaqyVar.zzd();
                        if (zzb3 == 304) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            zzapj zzd3 = zzaqaVar.zzd();
                            if (zzd3 == null) {
                                return new zzapw(304, (byte[]) null, true, elapsedRealtime2, zzd2);
                            }
                            TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                            if (!zzd2.isEmpty()) {
                                Iterator it = zzd2.iterator();
                                while (it.hasNext()) {
                                    treeSet.add(((zzaps) it.next()).zza());
                                }
                            }
                            ArrayList arrayList = new ArrayList(zzd2);
                            List list = zzd3.zzh;
                            if (list != null) {
                                if (!list.isEmpty()) {
                                    for (zzaps zzapsVar : zzd3.zzh) {
                                        if (!treeSet.contains(zzapsVar.zza())) {
                                            arrayList.add(zzapsVar);
                                        }
                                    }
                                }
                            } else if (!zzd3.zzg.isEmpty()) {
                                for (Map.Entry entry : zzd3.zzg.entrySet()) {
                                    if (!treeSet.contains(entry.getKey())) {
                                        arrayList.add(new zzaps((String) entry.getKey(), (String) entry.getValue()));
                                    }
                                }
                            }
                            return new zzapw(304, zzd3.zza, true, elapsedRealtime2, (List) arrayList);
                        }
                        InputStream zzc = zzaqyVar.zzc();
                        if (zzc != null) {
                            int zza = zzaqyVar.zza();
                            try {
                                zzaqr zzaqrVar = this.zza;
                                zzard zzardVar = new zzard(zzaqrVar, zza);
                                try {
                                    bArr3 = zzaqrVar.zzb(1024);
                                    while (true) {
                                        try {
                                            int read = zzc.read(bArr3);
                                            if (read == -1) {
                                                break;
                                            }
                                            zzardVar.write(bArr3, 0, read);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                zzc.close();
                                                break;
                                            } catch (IOException unused) {
                                                zzaqm.zzd("Error occurred when closing InputStream", new Object[0]);
                                            }
                                            zzaqrVar.zza(bArr3);
                                            zzardVar.close();
                                            throw th;
                                        }
                                    }
                                    byte[] byteArray = zzardVar.toByteArray();
                                    try {
                                        zzc.close();
                                    } catch (IOException unused2) {
                                        zzaqm.zzd("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    zzaqrVar.zza(bArr3);
                                    zzardVar.close();
                                    bArr2 = byteArray;
                                } catch (Throwable th4) {
                                    th = th4;
                                    bArr3 = null;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                bArr = null;
                                if (e instanceof SocketTimeoutException) {
                                    zzarcVar = new zzarc("socket", new zzaqi(), null);
                                } else {
                                    if (e instanceof MalformedURLException) {
                                        throw new RuntimeException("Bad URL ".concat(String.valueOf(zzaqaVar.zzk())), e);
                                    }
                                    if (zzaqyVar == null) {
                                        throw new zzapx(e);
                                    }
                                    int zzb4 = zzaqyVar.zzb();
                                    zzaqm.zzb("Unexpected response code %d for %s", Integer.valueOf(zzb4), zzaqaVar.zzk());
                                    if (bArr != null) {
                                        zzapw zzapwVar = new zzapw(zzb4, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzaqyVar.zzd());
                                        if (zzb4 != 401 && zzb4 != 403) {
                                            if (zzb4 < 400 || zzb4 > 499) {
                                                throw new zzaqh(zzapwVar);
                                            }
                                            throw new zzapn(zzapwVar);
                                        }
                                        zzarcVar = new zzarc("auth", new zzapi(zzapwVar), null);
                                    } else {
                                        zzarcVar = new zzarc("network", new zzapv(), null);
                                    }
                                }
                                zzarcVar2 = zzarcVar;
                                zzapo zzy2 = zzaqaVar.zzy();
                                zzb = zzaqaVar.zzb();
                                zzaqjVar = zzarcVar2.zzb;
                                zzy2.zzc(zzaqjVar);
                                str2 = zzarcVar2.zza;
                                zzaqaVar.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
                            }
                        } else {
                            bArr2 = new byte[0];
                        }
                        try {
                            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (!zzaqm.zzb) {
                                if (elapsedRealtime3 > 3000) {
                                }
                                if (zzb3 >= 200 || zzb3 > 299) {
                                    throw new IOException();
                                }
                                return new zzapw(zzb3, bArr2, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzd2);
                            }
                            zzaqm.zza("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", zzaqaVar, Long.valueOf(elapsedRealtime3), bArr2 != null ? Integer.valueOf(bArr2.length) : "null", Integer.valueOf(zzb3), Integer.valueOf(zzaqaVar.zzy().zza()));
                            if (zzb3 >= 200) {
                            }
                            throw new IOException();
                        } catch (IOException e4) {
                            e = e4;
                            bArr = bArr2;
                            if (e instanceof SocketTimeoutException) {
                            }
                            zzarcVar2 = zzarcVar;
                            zzapo zzy22 = zzaqaVar.zzy();
                            zzb = zzaqaVar.zzb();
                            zzaqjVar = zzarcVar2.zzb;
                            zzy22.zzc(zzaqjVar);
                            str2 = zzarcVar2.zza;
                            zzaqaVar.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
                        }
                    } catch (IOException e5) {
                        e = e5;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (IOException e6) {
                e = e6;
            }
            str2 = zzarcVar2.zza;
            zzaqaVar.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
        }
    }
}
