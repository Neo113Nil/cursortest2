package defpackage;

import android.nfc.tech.IsoDep;
import com.yandex.go.payments.cards.nfc.enums.CommandEnum;
import com.yandex.go.payments.cards.nfc.enums.SwEnum;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes13.dex */
public final class rxn {
    public static final byte[] c = "2PAY.SYS.DDF01".getBytes(uza.a);
    public final IsoDep a;
    public final rg7 b;

    public rxn(IsoDep isoDep) {
        this.a = isoDep;
        rg7 rg7Var = new rg7();
        rg7Var.a = "";
        rg7Var.b = "";
        rg7Var.c = "";
        this.b = rg7Var;
    }

    public final boolean a(byte[] bArr) {
        int length;
        int length2;
        boolean a;
        int length3;
        int length4;
        CommandEnum commandEnum = CommandEnum.SELECT;
        int cla = commandEnum.getCla();
        int ins = commandEnum.getIns();
        int p1 = commandEnum.getP1();
        int p2 = commandEnum.getP2();
        int length5 = bArr.length;
        int i = 4;
        boolean z = true;
        byte[] bArr2 = new byte[(bArr.length == 0 ? 4 : bArr.length + 5) + 1];
        bArr2[0] = (byte) cla;
        bArr2[1] = (byte) ins;
        char c2 = 2;
        bArr2[2] = (byte) p1;
        int i2 = 3;
        bArr2[3] = (byte) p2;
        if (bArr.length == 0) {
            length = 4;
        } else {
            bArr2[4] = (byte) length5;
            System.arraycopy(bArr, 0, bArr2, 5, bArr.length);
            length = bArr.length + 5;
        }
        bArr2[length] = (byte) (bArr2[length] + ((byte) 0));
        IsoDep isoDep = this.a;
        byte[] transceive = isoDep.transceive(bArr2);
        if (!xna1.c(transceive, SwEnum.SW_9000)) {
            return false;
        }
        byte[] e = oqb1.e(transceive, txn.p);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ArrayList arrayList = new ArrayList();
            if (e != null) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
                while (byteArrayInputStream.available() > 0 && byteArrayInputStream.available() >= 2) {
                    arrayList.add(new o6x0(oqb1.h(oqb1.f(byteArrayInputStream)), oqb1.g(byteArrayInputStream)));
                }
            }
            byteArrayOutputStream.write(txn.f.a);
            Iterator it = arrayList.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                i3 += ((o6x0) it.next()).b;
            }
            byteArrayOutputStream.write(i3);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(vxn.a((o6x0) it2.next()));
            }
        } catch (IOException e2) {
            jst.e.a(10, null, e2, null);
        }
        CommandEnum commandEnum2 = CommandEnum.GPO;
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int cla2 = commandEnum2.getCla();
        int ins2 = commandEnum2.getIns();
        int p12 = commandEnum2.getP1();
        int p22 = commandEnum2.getP2();
        int length6 = byteArray.length;
        byte[] bArr3 = new byte[(byteArray.length == 0 ? 4 : byteArray.length + 5) + 1];
        bArr3[0] = (byte) cla2;
        bArr3[1] = (byte) ins2;
        bArr3[2] = (byte) p12;
        bArr3[3] = (byte) p22;
        if (byteArray.length == 0) {
            length2 = 4;
        } else {
            bArr3[4] = (byte) length6;
            System.arraycopy(byteArray, 0, bArr3, 5, byteArray.length);
            length2 = byteArray.length + 5;
        }
        bArr3[length2] = (byte) (bArr3[length2] + ((byte) 0));
        byte[] transceive2 = isoDep.transceive(bArr3);
        if (!xna1.c(transceive2, SwEnum.SW_9000)) {
            return false;
        }
        byte[] e3 = oqb1.e(transceive2, txn.e);
        rg7 rg7Var = this.b;
        if (e3 != null) {
            e3 = f73.m(2, e3.length, e3);
            a = false;
        } else {
            a = z001.a(rg7Var, transceive2);
            if (!a) {
                e3 = oqb1.e(transceive2, txn.g);
            }
        }
        if (e3 != null) {
            ArrayList arrayList2 = new ArrayList();
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(e3);
            while (byteArrayInputStream2.available() >= 4) {
                xi1 xi1Var = new xi1();
                xi1Var.a = byteArrayInputStream2.read() >> 3;
                xi1Var.b = byteArrayInputStream2.read();
                xi1Var.c = byteArrayInputStream2.read();
                byteArrayInputStream2.read();
                arrayList2.add(xi1Var);
            }
            Iterator it3 = arrayList2.iterator();
            loop4: while (it3.hasNext()) {
                xi1 xi1Var2 = (xi1) it3.next();
                int i4 = xi1Var2.b;
                int i5 = xi1Var2.c;
                if (i4 <= i5) {
                    while (true) {
                        CommandEnum commandEnum3 = CommandEnum.READ_RECORD;
                        int i6 = (xi1Var2.a << i2) | i;
                        int cla3 = commandEnum3.getCla();
                        int i7 = i2;
                        int ins3 = commandEnum3.getIns();
                        char c3 = c2;
                        byte[] bArr4 = new byte[0];
                        int i8 = i;
                        byte[] bArr5 = new byte[(bArr4.length == 0 ? i8 : bArr4.length + 5) + 1];
                        bArr5[0] = (byte) cla3;
                        bArr5[1] = (byte) ins3;
                        bArr5[c3] = (byte) i4;
                        bArr5[i7] = (byte) i6;
                        if (bArr4.length == 0) {
                            length3 = i8;
                        } else {
                            bArr5[i8] = (byte) 0;
                            System.arraycopy(bArr4, 0, bArr5, 5, bArr4.length);
                            length3 = bArr4.length + 5;
                        }
                        bArr5[length3] = (byte) (bArr5[length3] + ((byte) 0));
                        byte[] transceive3 = isoDep.transceive(bArr5);
                        if (xna1.c(transceive3, SwEnum.SW_6C)) {
                            int i9 = (xi1Var2.a << 3) | 4;
                            byte b = transceive3[transceive3.length - 1];
                            int cla4 = commandEnum3.getCla();
                            int ins4 = commandEnum3.getIns();
                            byte[] bArr6 = new byte[0];
                            byte[] bArr7 = new byte[(bArr6.length == 0 ? i8 : bArr6.length + 5) + 1];
                            bArr7[0] = (byte) cla4;
                            bArr7[1] = (byte) ins4;
                            bArr7[c3] = (byte) i4;
                            bArr7[i7] = (byte) i9;
                            if (bArr6.length == 0) {
                                length4 = i8;
                            } else {
                                bArr7[i8] = (byte) 0;
                                System.arraycopy(bArr6, 0, bArr7, 5, bArr6.length);
                                length4 = bArr6.length + 5;
                            }
                            bArr7[length4] = (byte) (bArr7[length4] + b);
                            transceive3 = isoDep.transceive(bArr7);
                        }
                        if (!xna1.c(transceive3, SwEnum.SW_9000) || !z001.a(rg7Var, transceive3)) {
                            if (i4 == i5) {
                                i2 = i7;
                                c2 = c3;
                                i = i8;
                                break;
                            }
                            i4++;
                            i2 = i7;
                            c2 = c3;
                            i = i8;
                        } else {
                            break loop4;
                        }
                    }
                }
            }
        }
        z = a;
        return z;
    }
}
