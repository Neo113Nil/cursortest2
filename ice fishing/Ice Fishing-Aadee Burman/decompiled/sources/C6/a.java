package C6;

import j1.AbstractC4599c;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;

/* loaded from: classes2.dex */
public final class a implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f432n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f433u;

    public /* synthetic */ a(int i, Object obj) {
        this.f432n = i;
        this.f433u = obj;
    }

    public static String i(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }

    public String b() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f433u;
        boolean z3 = false;
        try {
            try {
                if (httpURLConnection.getResponseCode() / 100 == 2) {
                    z3 = true;
                }
            } catch (NullPointerException e9) {
                e = e9;
                AbstractC4599c.c("get error failed ", e);
                return e.getMessage();
            }
        } catch (IOException unused) {
        }
        if (z3) {
            return null;
        }
        try {
            return "Unable to fetch " + httpURLConnection.getURL() + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + i(httpURLConnection);
        } catch (IOException e10) {
            e = e10;
            AbstractC4599c.c("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f432n) {
            case 0:
                ((D6.a) this.f433u).close();
                break;
            default:
                ((HttpURLConnection) this.f433u).disconnect();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] j() {
        int i;
        RandomAccessFile randomAccessFile = ((D6.a) this.f433u).f647n;
        int i6 = 0;
        try {
            i = randomAccessFile.read();
        } catch (IOException unused) {
        }
        if (i != -1) {
            if ((i & 128) != 0) {
                i &= com.anythink.expressad.video.module.a.a.f21728R;
                int i9 = 7;
                while (true) {
                    if (i9 >= 32) {
                        while (i9 < 64) {
                            int read = randomAccessFile.read();
                            if (read == -1) {
                                throw new IllegalStateException();
                            }
                            if ((read & 128) != 0) {
                                i9 += 7;
                            }
                        }
                        throw new IllegalStateException();
                    }
                    int read2 = randomAccessFile.read();
                    if (read2 == -1) {
                        throw new IllegalStateException();
                    }
                    i |= (read2 & com.anythink.expressad.video.module.a.a.f21728R) << i9;
                    if ((read2 & 128) == 0) {
                        break;
                    }
                    i9 += 7;
                }
            }
            if (i >= 1) {
                return null;
            }
            byte[] bArr = new byte[i];
            do {
                int read3 = randomAccessFile.read(bArr, i6, i - i6);
                i6 += read3;
                if (read3 == -1) {
                    break;
                }
            } while (i6 < i);
            if (i6 != i) {
                return null;
            }
            return bArr;
        }
        i = 0;
        if (i >= 1) {
        }
    }
}
