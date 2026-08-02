package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.ny, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3670ny implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33599n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f33600u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f33601v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f33602w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f33603x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f33604y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Serializable f33605z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC3670ny(C3778py c3778py, String str, t.h hVar, boolean z6, String str2, byte[] bArr) {
        this.f33601v = c3778py;
        this.f33602w = str;
        this.f33604y = hVar;
        this.f33600u = z6;
        this.f33603x = str2;
        this.f33605z = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        HttpURLConnection httpURLConnection;
        byte[] byteArray;
        switch (this.f33599n) {
            case 0:
                String str = (String) this.f33602w;
                t.h hVar = (t.h) this.f33604y;
                byte[] bArr = (byte[]) this.f33605z;
                C3778py c3778py = (C3778py) this.f33601v;
                c3778py.getClass();
                HttpURLConnection httpURLConnection2 = null;
                try {
                    try {
                        httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
                        try {
                            Objects.requireNonNull(httpURLConnection);
                            RunnableC3830qw runnableC3830qw = new RunnableC3830qw(3, httpURLConnection);
                            ExecutorService executorService = c3778py.f33949a;
                            t.l lVar = hVar.f40581c;
                            if (lVar != null) {
                                lVar.a(runnableC3830qw, executorService);
                            }
                            httpURLConnection.setRequestProperty("User-Agent", c3778py.f33950b);
                            int i = (int) c3778py.f33951c;
                            httpURLConnection.setConnectTimeout(i);
                            httpURLConnection.setReadTimeout(i);
                            if (this.f33600u) {
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setRequestMethod("POST");
                                String str2 = (String) this.f33603x;
                                if (str2 != null) {
                                    httpURLConnection.setRequestProperty("Content-Type", str2);
                                }
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream.write(bArr);
                                    bufferedOutputStream.close();
                                } finally {
                                }
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            InputStream inputStream = responseCode < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    if (inputStream == null) {
                                        byteArray = new byte[0];
                                        byteArrayOutputStream.close();
                                    } else {
                                        byte[] bArr2 = new byte[4096];
                                        while (true) {
                                            int read = inputStream.read(bArr2);
                                            if (read != -1) {
                                                byteArrayOutputStream.write(bArr2, 0, read);
                                            } else {
                                                byteArray = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                inputStream.close();
                                            }
                                        }
                                    }
                                    hVar.a(new C3724oy(responseCode, byteArray));
                                } finally {
                                }
                            } finally {
                            }
                        } catch (SocketTimeoutException e9) {
                            e = e9;
                            httpURLConnection2 = httpURLConnection;
                            String message = e.getMessage();
                            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 9);
                            sb.append("Timeout: ");
                            sb.append(message);
                            hVar.b(new TimeoutException(sb.toString()));
                            httpURLConnection = httpURLConnection2;
                            if (httpURLConnection != null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            httpURLConnection2 = httpURLConnection;
                            hVar.b(th);
                            httpURLConnection = httpURLConnection2;
                            if (httpURLConnection != null) {
                            }
                        }
                    } finally {
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                    }
                } catch (SocketTimeoutException e10) {
                    e = e10;
                } catch (Throwable th2) {
                    th = th2;
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    return;
                }
                return;
            default:
                Pair pair = (Pair) this.f33602w;
                ((BO) ((C3375iO) this.f33601v).f31814b.f1141C).n(((Integer) pair.first).intValue(), (C3860rQ) pair.second, (C3429jQ) this.f33603x, (C3699oQ) this.f33604y, (IOException) this.f33605z, this.f33600u);
                return;
        }
    }

    public /* synthetic */ RunnableC3670ny(C3375iO c3375iO, Pair pair, C3429jQ c3429jQ, C3699oQ c3699oQ, IOException iOException, boolean z6) {
        this.f33601v = c3375iO;
        this.f33602w = pair;
        this.f33603x = c3429jQ;
        this.f33604y = c3699oQ;
        this.f33605z = iOException;
        this.f33600u = z6;
    }
}
