package defpackage;

import android.net.Uri;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.action.DivExpressionResolverImpl;
import com.ybsdk.feature.divkit.internal.domain.DownloadPayloadJsonAdapter;
import com.ybsdk.feature.divkit.internal.domain.a;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes11.dex */
public final /* synthetic */ class z3k implements r131, sty {
    public final /* synthetic */ int a;

    public /* synthetic */ z3k(int i) {
        this.a = i;
    }

    public static /* synthetic */ void a(int i, int i2) {
        throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + i + ((Object) ", array size:") + i2);
    }

    public static /* synthetic */ void c(String str) {
        throw new JSONException(str);
    }

    @Override // defpackage.sty
    public boolean b(List list) {
        switch (this.a) {
            case 6:
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 7:
            default:
                if (list.size() >= 1) {
                    break;
                }
                break;
            case 8:
                if (list.size() >= 1) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.r131
    public boolean l(Object obj) {
        boolean resolveUrl_gIAlu_s$lambda$8$lambda$6;
        boolean resolveString_gIAlu_s$lambda$2$lambda$0;
        boolean resolveColor_gIAlu_s$lambda$5$lambda$3;
        switch (this.a) {
            case 0:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 1:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 4:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 5:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 6:
            case 8:
            case 11:
            case 18:
            case 22:
            default:
                if (((Long) obj).longValue() > 0) {
                    break;
                }
                break;
            case 7:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 9:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 10:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 12:
                DownloadPayloadJsonAdapter downloadPayloadJsonAdapter = a.c;
                break;
            case 13:
                resolveUrl_gIAlu_s$lambda$8$lambda$6 = DivExpressionResolverImpl.resolveUrl_gIAlu_s$lambda$8$lambda$6((Uri) obj);
                break;
            case 14:
                break;
            case 15:
                resolveString_gIAlu_s$lambda$2$lambda$0 = DivExpressionResolverImpl.resolveString_gIAlu_s$lambda$2$lambda$0((String) obj);
                break;
            case 16:
                resolveColor_gIAlu_s$lambda$5$lambda$3 = DivExpressionResolverImpl.resolveColor_gIAlu_s$lambda$5$lambda$3(((Integer) obj).intValue());
                break;
            case 17:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 19:
                if (((String) obj).length() >= 1) {
                    break;
                }
                break;
            case 20:
                if (((String) obj).length() >= 1) {
                    break;
                }
                break;
            case 21:
                break;
            case 23:
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue >= 0.0d && doubleValue <= 1.0d) {
                    break;
                }
                break;
            case 24:
                double doubleValue2 = ((Double) obj).doubleValue();
                if (doubleValue2 >= 0.0d && doubleValue2 <= 1.0d) {
                    break;
                }
                break;
            case 25:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 26:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
            case 27:
                if (((Long) obj).longValue() > 0) {
                    break;
                }
                break;
            case 28:
                if (((Long) obj).longValue() >= 0) {
                    break;
                }
                break;
        }
        return true;
    }
}
