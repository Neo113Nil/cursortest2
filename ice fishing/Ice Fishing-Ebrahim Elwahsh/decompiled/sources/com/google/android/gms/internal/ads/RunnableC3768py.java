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

/* renamed from: com.google.android.gms.internal.ads.py, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3768py implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33544n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f33545u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f33546v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f33547w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f33548x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f33549y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Serializable f33550z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC3768py(C3875ry c3875ry, String str, t.h hVar, boolean z8, String str2, byte[] bArr) {
        this.f33546v = c3875ry;
        this.f33547w = str;
        this.f33549y = hVar;
        this.f33545u = z8;
        this.f33548x = str2;
        this.f33550z = bArr;
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
        switch (this.f33544n) {
            case 0:
                String str = (String) this.f33547w;
                t.h hVar = (t.h) this.f33549y;
                byte[] bArr = (byte[]) this.f33550z;
                C3875ry c3875ry = (C3875ry) this.f33546v;
                c3875ry.getClass();
                HttpURLConnection httpURLConnection2 = null;
                try {
                    try {
                        httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
                        try {
                            Objects.requireNonNull(httpURLConnection);
                            RunnableC3873rw runnableC3873rw = new RunnableC3873rw(3, httpURLConnection);
                            ExecutorService executorService = c3875ry.f34143a;
                            t.l lVar = hVar.f40553c;
                            if (lVar != null) {
                                lVar.c(runnableC3873rw, executorService);
                            }
                            httpURLConnection.setRequestProperty("User-Agent", c3875ry.f34144b);
                            int i = (int) c3875ry.f34145c;
                            httpURLConnection.setConnectTimeout(i);
                            httpURLConnection.setReadTimeout(i);
                            if (this.f33545u) {
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setRequestMethod("POST");
                                String str2 = (String) this.f33548x;
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
                                    hVar.a(new C3822qy(responseCode, byteArray));
                                } finally {
                                }
                            } finally {
                            }
                        } catch (SocketTimeoutException e6) {
                            e = e6;
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
                } catch (SocketTimeoutException e9) {
                    e = e9;
                } catch (Throwable th2) {
                    th = th2;
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    return;
                }
                return;
            default:
                Pair pair = (Pair) this.f33547w;
                ((OO) ((C4064vO) this.f33546v).f34759b.f446C).p(((Integer) pair.first).intValue(), (BQ) pair.second, (C3958tQ) this.f33548x, (C4228yQ) this.f33549y, (IOException) this.f33550z, this.f33545u);
                return;
        }
    }

    public /* synthetic */ RunnableC3768py(C4064vO c4064vO, Pair pair, C3958tQ c3958tQ, C4228yQ c4228yQ, IOException iOException, boolean z8) {
        this.f33546v = c4064vO;
        this.f33547w = pair;
        this.f33548x = c3958tQ;
        this.f33549y = c4228yQ;
        this.f33550z = iOException;
        this.f33545u = z8;
    }
}
