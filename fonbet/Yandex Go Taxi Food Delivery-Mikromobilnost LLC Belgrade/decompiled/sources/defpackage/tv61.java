package defpackage;

import com.ybsdk.widgets.common.MoneyInputEditView;
import java.math.BigDecimal;
import java.math.BigInteger;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* loaded from: classes4.dex */
public abstract class tv61 {
    public abstract Number a(mf1 mf1Var);

    public abstract int b();

    public int c() {
        return a(xr61.a).intValue();
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof tv61) && f((tv61) obj) == 0;
    }

    public abstract int f(tv61 tv61Var);

    public int g() {
        return a(xr61.b).intValue();
    }

    public int h() {
        return a(xr61.c).intValue();
    }

    public int i() {
        return a(xr61.d).intValue();
    }

    public int j() {
        return a(xr61.e).intValue();
    }

    public int k() {
        return a(xr61.f).intValue();
    }

    public String toString() {
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2 = new StringBuffer();
        if (b() < 0) {
            stringBuffer2.append(LicenseUtility.SEPARATOR);
        }
        stringBuffer2.append('P');
        BigInteger bigInteger = (BigInteger) a(xr61.a);
        if (bigInteger != null) {
            stringBuffer2.append(bigInteger + "Y");
        }
        BigInteger bigInteger2 = (BigInteger) a(xr61.b);
        if (bigInteger2 != null) {
            stringBuffer2.append(bigInteger2 + "M");
        }
        BigInteger bigInteger3 = (BigInteger) a(xr61.c);
        if (bigInteger3 != null) {
            stringBuffer2.append(bigInteger3 + CA20Status.STATUS_REQUEST_D);
        }
        BigInteger bigInteger4 = (BigInteger) a(xr61.d);
        BigInteger bigInteger5 = (BigInteger) a(xr61.e);
        BigDecimal bigDecimal = (BigDecimal) a(xr61.f);
        if (bigInteger4 != null || bigInteger5 != null || bigDecimal != null) {
            stringBuffer2.append('T');
            if (bigInteger4 != null) {
                stringBuffer2.append(bigInteger4 + CA20Status.STATUS_CERTIFICATE_H);
            }
            if (bigInteger5 != null) {
                stringBuffer2.append(bigInteger5 + "M");
            }
            if (bigDecimal != null) {
                StringBuilder sb = new StringBuilder();
                String bigInteger6 = bigDecimal.unscaledValue().toString();
                int scale = bigDecimal.scale();
                if (scale != 0) {
                    int length = bigInteger6.length() - scale;
                    if (length == 0) {
                        bigInteger6 = "0.".concat(bigInteger6);
                    } else {
                        if (length > 0) {
                            stringBuffer = new StringBuffer(bigInteger6);
                            stringBuffer.insert(length, '.');
                        } else {
                            StringBuffer stringBuffer3 = new StringBuffer(bigInteger6.length() + (3 - length));
                            stringBuffer3.append("0.");
                            for (int i = 0; i < (-length); i++) {
                                stringBuffer3.append(MoneyInputEditView.DEFAULT_VALUE);
                            }
                            stringBuffer3.append(bigInteger6);
                            stringBuffer = stringBuffer3;
                        }
                        bigInteger6 = stringBuffer.toString();
                    }
                }
                sb.append(bigInteger6);
                sb.append("S");
                stringBuffer2.append(sb.toString());
            }
        }
        return stringBuffer2.toString();
    }
}
