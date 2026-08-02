package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.ByteArrayOutputStream;
import kotlin.KotlinVersion;

/* loaded from: classes5.dex */
public final class n67 extends ByteArrayOutputStream {
    public final o67 a;
    public final int b;

    public n67(int i, o67 o67Var, int i2) {
        super(i);
        this.a = o67Var;
        this.b = i2;
    }

    public final void D(int i, String str) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            char charAt = str.charAt(i3);
            i2 = (charAt < 1 || charAt > 127) ? charAt > 2047 ? i2 + 3 : i2 + 2 : i2 + 1;
        }
        a(i2);
        for (int i4 = 0; i4 < i; i4++) {
            char charAt2 = str.charAt(i4);
            if (charAt2 >= 1 && charAt2 <= 127) {
                a(charAt2);
            } else if (charAt2 > 2047) {
                a(((charAt2 >> '\f') & 15) | 224);
                a(((charAt2 >> 6) & 63) | 128);
                a((charAt2 & '?') | 128);
            } else {
                a(((charAt2 >> 6) & 31) | 192);
                a((charAt2 & '?') | 128);
            }
        }
    }

    public final void a(int i) {
        write(i & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void b(int i, byte[] bArr) {
        for (int i2 = 0; i2 < i; i2++) {
            a(bArr[i2]);
        }
    }

    public final void g(String str) {
        while (true) {
            int indexOf = str.indexOf(46);
            if (indexOf < 0) {
                indexOf = str.length();
            }
            if (indexOf <= 0) {
                a(0);
                return;
            }
            String substring = str.substring(0, indexOf);
            o67 o67Var = this.a;
            Integer num = (Integer) o67Var.h.get(str);
            if (num != null) {
                int intValue = num.intValue();
                a((intValue >> 8) | 192);
                a(intValue & KotlinVersion.MAX_COMPONENT_VALUE);
                return;
            } else {
                o67Var.h.put(str, Integer.valueOf(size() + this.b));
                D(substring.length(), substring);
                str = str.substring(indexOf);
                if (str.startsWith(".")) {
                    str = str.substring(1);
                }
            }
        }
    }

    public final void o(w67 w67Var, long j) {
        g(w67Var.c());
        z(w67Var.e().a);
        int i = w67Var.d().a;
        boolean z = w67Var.f;
        o67 o67Var = this.a;
        z(i | ((z && o67Var.b) ? SQLiteDatabase.OPEN_NOMUTEX : 0));
        int max = j == 0 ? w67Var.h : (int) Math.max(0L, ((((100 * w67Var.h) * 10) + w67Var.i) - j) / 1000);
        z(max >> 16);
        z(max);
        n67 n67Var = new n67(RemoteCameraConfig.Mic.BUFFER_SIZE, o67Var, size() + this.b + 2);
        w67Var.v(n67Var);
        byte[] byteArray = n67Var.toByteArray();
        z(byteArray.length);
        write(byteArray, 0, byteArray.length);
    }

    @Override // java.io.ByteArrayOutputStream
    public final void writeBytes(byte[] bArr) {
        if (bArr != null) {
            b(bArr.length, bArr);
        }
    }

    public final void z(int i) {
        a(i >> 8);
        a(i);
    }
}
