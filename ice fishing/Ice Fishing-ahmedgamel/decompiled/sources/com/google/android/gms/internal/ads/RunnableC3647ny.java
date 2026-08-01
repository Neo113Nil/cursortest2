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
public final /* synthetic */ class RunnableC3647ny implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32812n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f32813u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f32814v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f32815w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f32816x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f32817y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Serializable f32818z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC3647ny(C3755py c3755py, String str, t.h hVar, boolean z3, String str2, byte[] bArr) {
        this.f32814v = c3755py;
        this.f32815w = str;
        this.f32817y = hVar;
        this.f32813u = z3;
        this.f32816x = str2;
        this.f32818z = bArr;
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
        switch (this.f32812n) {
            case 0:
                String str = (String) this.f32815w;
                t.h hVar = (t.h) this.f32817y;
                byte[] bArr = (byte[]) this.f32818z;
                C3755py c3755py = (C3755py) this.f32814v;
                c3755py.getClass();
                HttpURLConnection httpURLConnection2 = null;
                try {
                    try {
                        httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
                        try {
                            Objects.requireNonNull(httpURLConnection);
                            RunnableC3807qw runnableC3807qw = new RunnableC3807qw(3, httpURLConnection);
                            ExecutorService executorService = c3755py.f33165a;
                            t.l lVar = hVar.f40528c;
                            if (lVar != null) {
                                lVar.a(runnableC3807qw, executorService);
                            }
                            httpURLConnection.setRequestProperty("User-Agent", c3755py.f33166b);
                            int i = (int) c3755py.f33167c;
                            httpURLConnection.setConnectTimeout(i);
                            httpURLConnection.setReadTimeout(i);
                            if (this.f32813u) {
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setRequestMethod("POST");
                                String str2 = (String) this.f32816x;
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
                                    hVar.a(new C3701oy(responseCode, byteArray));
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
                Pair pair = (Pair) this.f32815w;
                ((BO) ((C3352iO) this.f32814v).f31041b.f799C).n(((Integer) pair.first).intValue(), (C3676oQ) pair.second, (C3246gQ) this.f32816x, (C3514lQ) this.f32817y, (IOException) this.f32818z, this.f32813u);
                return;
        }
    }

    public /* synthetic */ RunnableC3647ny(C3352iO c3352iO, Pair pair, C3246gQ c3246gQ, C3514lQ c3514lQ, IOException iOException, boolean z3) {
        this.f32814v = c3352iO;
        this.f32815w = pair;
        this.f32816x = c3246gQ;
        this.f32817y = c3514lQ;
        this.f32818z = iOException;
        this.f32813u = z3;
    }
}
