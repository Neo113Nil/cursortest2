package defpackage;

import com.yandex.payment.sdk.nfcscanner.tools.ownimpl.enums.CountryCodeEnum;
import com.yandex.payment.sdk.nfcscanner.tools.ownimpl.enums.CurrencyEnum;
import com.yandex.payment.sdk.nfcscanner.tools.ownimpl.enums.TransactionTypeEnum;
import com.ybsdk.widgets.common.MoneyInputEditView;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes2.dex */
public final class uxn {
    public final SecureRandom a = new SecureRandom();

    public final byte[] a(n6x0 n6x0Var) {
        byte[] bArr;
        int i = n6x0Var.b;
        byte[] bArr2 = new byte[i];
        la60 la60Var = n6x0Var.a;
        if (la60Var.equals(sxn.r)) {
            byte[] bArr3 = new ogy0().a;
            byte b = (byte) (bArr3[0] | BlobHeaderStructure.BLOB_VERSION);
            bArr3[0] = b;
            bArr3[0] = (byte) (b | 8);
            bArr = Arrays.copyOf(bArr3, bArr3.length);
        } else if (la60Var.equals(sxn.l)) {
            bArr = cdb1.d(phb1.c(MoneyInputEditView.DEFAULT_VALUE, i * 2, String.valueOf(CountryCodeEnum.FR.getKey())));
        } else if (la60Var.equals(sxn.j)) {
            bArr = cdb1.d(phb1.c(MoneyInputEditView.DEFAULT_VALUE, i * 2, String.valueOf(CurrencyEnum.EUR.getKey())));
        } else if (la60Var.equals(sxn.h)) {
            bArr = cdb1.d(new SimpleDateFormat("yyMMdd").format(new Date()));
        } else if (la60Var.equals(sxn.i)) {
            bArr = new byte[]{(byte) TransactionTypeEnum.PURCHASE.getKey()};
        } else if (la60Var.equals(sxn.k)) {
            bArr = cdb1.d("00");
        } else if (la60Var.equals(sxn.n)) {
            bArr = new byte[]{34};
        } else if (la60Var.equals(sxn.m)) {
            bArr = new byte[]{-32, -96, 0};
        } else if (la60Var.equals(sxn.q)) {
            bArr = new byte[]{-114, 0, -80, Alerts.alert_internal_error, 5};
        } else if (la60Var.equals(sxn.u)) {
            bArr = cdb1.d("7345123215904501");
        } else {
            if (la60Var.equals(sxn.o)) {
                this.a.nextBytes(bArr2);
            }
            bArr = null;
        }
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
        }
        return bArr2;
    }
}
