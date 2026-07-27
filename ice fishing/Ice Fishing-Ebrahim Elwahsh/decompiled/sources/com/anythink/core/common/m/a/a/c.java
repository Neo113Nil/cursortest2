package com.anythink.core.common.m.a.a;

import android.os.Build;
import com.anythink.core.common.m.a.k;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public final class c extends k {

    /* renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f14584a;

    /* renamed from: b, reason: collision with root package name */
    private final InputStream f14585b;

    public c(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.f14584a = httpURLConnection;
        this.f14585b = inputStream;
    }

    @Override // com.anythink.core.common.m.a.k
    public final long a() {
        byte[] readAllBytes;
        try {
            InputStream inputStream = this.f14585b;
            if (inputStream == null || Build.VERSION.SDK_INT < 33) {
                return 0L;
            }
            readAllBytes = inputStream.readAllBytes();
            return readAllBytes.length;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.anythink.core.common.m.a.k
    public final String b() {
        return a(false);
    }

    @Override // com.anythink.core.common.m.a.k
    public final String c() {
        return a(true);
    }

    private String a(boolean z8) {
        InputStreamReader inputStreamReader;
        if (this.f14585b == null) {
            try {
                HttpURLConnection httpURLConnection = this.f14584a;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    return "";
                }
                return "";
            } catch (Throwable unused) {
                return "";
            }
        }
        BufferedReader bufferedReader = null;
        try {
            inputStreamReader = new InputStreamReader(this.f14585b);
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            sb.append(readLine);
                            if (z8) {
                                sb.append('\n');
                            }
                        } else {
                            try {
                                break;
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                    bufferedReader2.close();
                    try {
                        inputStreamReader.close();
                    } catch (Throwable unused3) {
                    }
                    try {
                        InputStream inputStream = this.f14585b;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        HttpURLConnection httpURLConnection2 = this.f14584a;
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                    } catch (Throwable unused4) {
                    }
                    return sb.toString();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused5) {
                        }
                    }
                    if (inputStreamReader != null) {
                        try {
                            inputStreamReader.close();
                        } catch (Throwable unused6) {
                        }
                    }
                    try {
                        InputStream inputStream2 = this.f14585b;
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        HttpURLConnection httpURLConnection3 = this.f14584a;
                        if (httpURLConnection3 != null) {
                            httpURLConnection3.disconnect();
                            throw th;
                        }
                        throw th;
                    } catch (Throwable unused7) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamReader = null;
        }
    }
}
