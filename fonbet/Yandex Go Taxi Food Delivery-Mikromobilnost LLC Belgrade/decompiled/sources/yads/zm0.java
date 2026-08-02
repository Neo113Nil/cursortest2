package yads;

import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.g8e;
import defpackage.ny61;
import defpackage.qd81;
import defpackage.rf71;
import defpackage.rg71;
import defpackage.w511;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class zm0 extends jc2 {
    public final int d;
    public final String e;
    public final int f;
    public final qd81 g;
    public final int h;
    public final rg71 i;
    public final boolean j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zm0(int i, Exception exc, String str, int i2, String str2, int i3, qd81 qd81Var, int i4, boolean z) {
        this(TextUtils.isEmpty(str) ? r0 : g8e.p(r0, Extension.COLON_SPACE, str), exc, i2, i, r5, r6, r7, i4, null, SystemClock.elapsedRealtime(), z);
        String str3;
        int i5;
        qd81 qd81Var2;
        String str4;
        String str5;
        if (i == 0) {
            str3 = str2;
            i5 = i3;
            qd81Var2 = qd81Var;
            str4 = "Source error";
        } else if (i != 1) {
            str4 = i != 3 ? "Unexpected runtime error" : "Remote error";
            str3 = str2;
            i5 = i3;
            qd81Var2 = qd81Var;
        } else {
            StringBuilder sb = new StringBuilder();
            str3 = str2;
            sb.append(str3);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            qd81Var2 = qd81Var;
            sb.append(qd81Var2);
            sb.append(", format_supported=");
            int i6 = rf71.a;
            if (i4 == 0) {
                str5 = "NO";
            } else if (i4 == 1) {
                str5 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str5 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str5 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    ny61.k();
                    throw null;
                }
                str5 = "YES";
            }
            sb.append(str5);
            str4 = sb.toString();
        }
    }

    public zm0(String str, Throwable th, int i, int i2, String str2, int i3, qd81 qd81Var, int i4, rg71 rg71Var, long j, boolean z) {
        super(str, th, i, j);
        if (z && i2 != 1) {
            w511.q();
            throw null;
        }
        if (th == null && i2 != 3) {
            w511.q();
            throw null;
        }
        this.d = i2;
        this.e = str2;
        this.f = i3;
        this.g = qd81Var;
        this.h = i4;
        this.i = rg71Var;
        this.j = z;
    }

    public zm0(int i, Exception exc, int i2) {
        this(i, exc, null, i2, null, -1, null, 4, false);
    }
}
