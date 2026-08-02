package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.OfferTypeDto;
import java.io.Serializable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public abstract class zba1 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4};

    public static final int a(int i, Context context) {
        int i2;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            i2 = obtainStyledAttributes.getColor(0, 0);
        } catch (Exception unused) {
            i2 = ModalContentViewContainer.BASE_SHADOW_COLOR;
        }
        obtainStyledAttributes.recycle();
        return i2;
    }

    public static void b(Serializable serializable) {
        Log.e("RootBeer", c().concat(String.valueOf(serializable)));
        Log.e("QLog", c().concat(String.valueOf(serializable)));
    }

    public static String c() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        int lineNumber = stackTrace[2].getLineNumber();
        return className.substring(className.lastIndexOf(46) + 1) + Extension.COLON_SPACE + methodName + "() [" + lineNumber + "] - ";
    }

    public static final EvgenAnalytics$EvgenOfferType d(OfferTypeDto offerTypeDto) {
        int i = kho.a[offerTypeDto.ordinal()];
        if (i == 1) {
            return EvgenAnalytics$EvgenOfferType.Tariff;
        }
        if (i == 2) {
            return EvgenAnalytics$EvgenOfferType.Option;
        }
        if (i == 3) {
            return null;
        }
        w511.b();
        return null;
    }
}
