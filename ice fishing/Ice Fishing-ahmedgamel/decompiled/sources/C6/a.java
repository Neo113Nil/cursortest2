package C6;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import l1.AbstractC4668c;

/* loaded from: classes2.dex */
public final class a implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f329n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f330u;

    public /* synthetic */ a(int i, Object obj) {
        this.f329n = i;
        this.f330u = obj;
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
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f330u;
        boolean z6 = false;
        try {
            try {
                if (httpURLConnection.getResponseCode() / 100 == 2) {
                    z6 = true;
                }
            } catch (NullPointerException e9) {
                e = e9;
                AbstractC4668c.c("get error failed ", e);
                return e.getMessage();
            }
        } catch (IOException unused) {
        }
        if (z6) {
            return null;
        }
        try {
            return "Unable to fetch " + httpURLConnection.getURL() + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + i(httpURLConnection);
        } catch (IOException e10) {
            e = e10;
            AbstractC4668c.c("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f329n) {
            case 0:
                ((D6.a) this.f330u).close();
                break;
            default:
                ((HttpURLConnection) this.f330u).disconnect();
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
        RandomAccessFile randomAccessFile = ((D6.a) this.f330u).f627n;
        int i4 = 0;
        try {
            i = randomAccessFile.read();
        } catch (IOException unused) {
        }
        if (i != -1) {
            if ((i & 128) != 0) {
                i &= com.anythink.expressad.video.module.a.a.f22515R;
                int i6 = 7;
                while (true) {
                    if (i6 >= 32) {
                        while (i6 < 64) {
                            int read = randomAccessFile.read();
                            if (read == -1) {
                                throw new IllegalStateException();
                            }
                            if ((read & 128) != 0) {
                                i6 += 7;
                            }
                        }
                        throw new IllegalStateException();
                    }
                    int read2 = randomAccessFile.read();
                    if (read2 == -1) {
                        throw new IllegalStateException();
                    }
                    i |= (read2 & com.anythink.expressad.video.module.a.a.f22515R) << i6;
                    if ((read2 & 128) == 0) {
                        break;
                    }
                    i6 += 7;
                }
            }
            if (i >= 1) {
                return null;
            }
            byte[] bArr = new byte[i];
            do {
                int read3 = randomAccessFile.read(bArr, i4, i - i4);
                i4 += read3;
                if (read3 == -1) {
                    break;
                }
            } while (i4 < i);
            if (i4 != i) {
                return null;
            }
            return bArr;
        }
        i = 0;
        if (i >= 1) {
        }
    }
}
