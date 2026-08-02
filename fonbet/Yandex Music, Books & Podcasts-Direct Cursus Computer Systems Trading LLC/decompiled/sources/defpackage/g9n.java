package defpackage;

import android.util.Log;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class g9n implements eac {
    public static final Charset c = Charset.forName("UTF-8");
    public final File a;
    public f9n b;

    public g9n(File file) {
        this.a = file;
    }

    public final void a() {
        File file = this.a;
        if (this.b == null) {
            try {
                this.b = new f9n(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }

    @Override // defpackage.eac
    public final void b() {
        kg5.q(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004b  */
    @Override // defpackage.eac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String j() {
        j4x j4xVar;
        byte[] bArr;
        if (this.a.exists()) {
            a();
            f9n f9nVar = this.b;
            if (f9nVar != null) {
                int[] iArr = {0};
                byte[] bArr2 = new byte[f9nVar.P()];
                try {
                    this.b.g(new j6e(bArr2, iArr));
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e);
                }
                j4xVar = new j4x(bArr2, iArr[0], 14);
                if (j4xVar != null) {
                    bArr = null;
                } else {
                    int i = j4xVar.b;
                    bArr = new byte[i];
                    System.arraycopy((byte[]) j4xVar.c, 0, bArr, 0, i);
                }
                if (bArr == null) {
                    return new String(bArr, c);
                }
                return null;
            }
        }
        j4xVar = null;
        if (j4xVar != null) {
        }
        if (bArr == null) {
        }
    }

    @Override // defpackage.eac
    public final void k(long j, String str) {
        a();
        if (this.b == null) {
            return;
        }
        try {
            if (str.length() > 16384) {
                str = "...".concat(str.substring(str.length() - 16384));
            }
            this.b.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll(StringUtil.CR, StringUtil.SPACE).replaceAll(StringUtil.LF, StringUtil.SPACE)).getBytes(c));
            while (!this.b.o() && this.b.P() > 65536) {
                this.b.H();
            }
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }
}
