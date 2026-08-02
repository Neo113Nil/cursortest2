package defpackage;

import com.yandex.pulse.metrics.o;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final /* synthetic */ class uw8 implements ywt {
    public final /* synthetic */ int a;

    @Override // defpackage.ywt
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return ((Long) obj).longValue() >= 0;
            case 1:
                long longValue = ((Long) obj).longValue();
                return longValue >= 0 && longValue < 100;
            case 2:
                return ((Long) obj).longValue() >= 0;
            case 3:
                return ((Long) obj).longValue() >= 0;
            case 4:
                return ((Long) obj).longValue() >= 0;
            case 5:
                return ((Long) obj).longValue() >= 0;
            case 6:
                return ((Long) obj).longValue() >= 0;
            case 7:
                return ((Long) obj).longValue() >= 0;
            case 8:
                double doubleValue = ((Double) obj).doubleValue();
                return doubleValue >= 0.0d && doubleValue <= 1.0d;
            case 9:
                return ((Long) obj).longValue() >= 0;
            case 10:
                return ((Long) obj).longValue() >= 0;
            case 11:
                return ((Long) obj).longValue() >= 0;
            case 12:
                return ((String) obj).length() >= 1;
            case 13:
                return ((String) obj).length() >= 1;
            case 14:
                return ((Long) obj).longValue() >= 0;
            case 15:
                return Pattern.matches("^[a-zA-Z_][a-zA-Z0-9_]*$", (String) obj);
            case 16:
                double doubleValue2 = ((Double) obj).doubleValue();
                return doubleValue2 >= 0.0d && doubleValue2 <= 1.0d;
            case 17:
                return ((Long) obj).longValue() > 0;
            case 18:
                return ((Long) obj).longValue() >= 0;
            case 19:
                return ((Long) obj).longValue() >= 0;
            case 20:
                return ((Long) obj).longValue() >= 0;
            case 21:
                return ((Long) obj).longValue() >= 0;
            case 22:
                return ((Long) obj).longValue() >= 0;
            case 23:
                double doubleValue3 = ((Double) obj).doubleValue();
                return doubleValue3 >= 0.0d && doubleValue3 <= 1.0d;
            case 24:
                return ((Long) obj).longValue() >= 0;
            case 25:
                return ((Long) obj).longValue() >= 0;
            case 26:
                double doubleValue4 = ((Double) obj).doubleValue();
                return doubleValue4 >= 0.0d && doubleValue4 <= 1.0d;
            case 27:
                return ((Long) obj).longValue() >= 0;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((Long) obj).longValue() >= 0;
            default:
                return ((Long) obj).longValue() >= 0;
        }
    }
}
