package defpackage;

import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.Digest.CheckMemory;

/* loaded from: classes4.dex */
public final class xt61 {
    public int[] a;
    public int b;

    public xt61(int i) {
        int[] iArr = new int[i];
        this.a = iArr;
        this.b = CheckMemory.checkMem32(iArr, 0, i);
    }

    public static int a(int i, byte[] bArr) {
        return ((bArr[i + 3] << 24) & ModalContentViewContainer.BASE_SHADOW_COLOR) | (bArr[i] & 255) | ((bArr[i + 1] << 8) & 65280) | ((bArr[i + 2] << PKIBody._CKUANN) & 16711680);
    }

    public static byte[] d(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public final void b(ByteArrayInputStream byteArrayInputStream) {
        byte[] bArr = new byte[4];
        if (byteArrayInputStream.read(bArr) != 4) {
            throw new IOException();
        }
        int a = a(0, bArr);
        int[] iArr = this.a;
        if (a != iArr.length) {
            Arrays.fill(iArr, 0);
            this.a = new int[a];
        }
        for (int i = 0; i < this.a.length; i++) {
            if (byteArrayInputStream.read(bArr) != 4) {
                throw new IOException();
            }
            this.a[i] = a(0, bArr);
        }
        if (byteArrayInputStream.read(bArr) != 4) {
            throw new IOException();
        }
        int a2 = a(0, bArr);
        int[] iArr2 = this.a;
        int checkMem32 = CheckMemory.checkMem32(iArr2, 0, iArr2.length);
        this.b = checkMem32;
        if (checkMem32 != a2) {
            throw new IOException();
        }
    }

    public final void c(ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.write(d(this.a.length));
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                byteArrayOutputStream.write(d(this.b));
                return;
            } else {
                byteArrayOutputStream.write(d(iArr[i]));
                i++;
            }
        }
    }

    public final void e(int[] iArr) {
        if (iArr == null) {
            w511.q();
            return;
        }
        if (this.a.length != iArr.length) {
            f();
            this.a = new int[iArr.length];
        }
        int[] iArr2 = this.a;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = this.a;
        this.b = CheckMemory.checkMem32(iArr3, 0, iArr3.length);
    }

    public final void f() {
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public final void finalize() {
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                super.finalize();
                return;
            } else {
                iArr[i] = 0;
                i++;
            }
        }
    }

    public final boolean g() {
        int[] iArr = this.a;
        return CheckMemory.verifyMem32(iArr, 0, iArr.length, this.b);
    }

    public final String toString() {
        return xt61.class.getName();
    }
}
