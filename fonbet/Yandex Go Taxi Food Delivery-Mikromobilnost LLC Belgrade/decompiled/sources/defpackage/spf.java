package defpackage;

import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes4.dex */
public final class spf extends f2 {
    public final byte[] B() {
        byte[] bArr = this.a;
        if (bArr[bArr.length - 1] == 90) {
            if (!x()) {
                byte[] bArr2 = new byte[bArr.length + 4];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length - 1);
                System.arraycopy(ruu0.b("0000Z"), 0, bArr2, bArr.length - 1, 5);
                return bArr2;
            }
            if (!y()) {
                byte[] bArr3 = new byte[bArr.length + 2];
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length - 1);
                System.arraycopy(ruu0.b("00Z"), 0, bArr3, bArr.length - 1, 3);
                return bArr3;
            }
            if (u()) {
                int length = bArr.length - 2;
                while (length > 0 && bArr[length] == 48) {
                    length--;
                }
                if (bArr[length] == 46) {
                    byte[] bArr4 = new byte[length + 1];
                    System.arraycopy(bArr, 0, bArr4, 0, length);
                    bArr4[length] = Alerts.alert_user_canceled;
                    return bArr4;
                }
                byte[] bArr5 = new byte[length + 2];
                int i = length + 1;
                System.arraycopy(bArr, 0, bArr5, 0, i);
                bArr5[i] = Alerts.alert_user_canceled;
                return bArr5;
            }
        }
        return bArr;
    }

    @Override // defpackage.f2, defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        g191Var.Y(24, B(), z);
    }

    @Override // defpackage.f2, defpackage.a3
    public final int k(boolean z) {
        return g191.M(B().length, z);
    }

    @Override // defpackage.f2, defpackage.a3
    public final a3 n() {
        return this;
    }

    @Override // defpackage.a3
    public final a3 o() {
        return this;
    }
}
