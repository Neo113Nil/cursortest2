package defpackage;

import android.content.Context;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: classes2.dex */
public final class up4 {
    public final Context a;
    public final dt20 b;

    public up4(Context context, kl60 kl60Var, pcy pcyVar, ConsoleLoggingMode consoleLoggingMode, rwo rwoVar) {
        this.a = context;
        this.b = new dt20(kl60Var, rwoVar);
        boolean isConsoleLoggingEnabled = consoleLoggingMode.isConsoleLoggingEnabled(pcyVar.a);
        PaymentSdkEnvironment paymentSdkEnvironment = pcyVar.a;
        int i = 0;
        vll0 a = bwa1.a(paymentSdkEnvironment == PaymentSdkEnvironment.TESTING);
        new qdh();
        OkHttpClient.a aVar = new OkHttpClient.a();
        if (isConsoleLoggingEnabled) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(i);
            httpLoggingInterceptor.d = HttpLoggingInterceptor.Level.BODY;
            aVar.a(httpLoggingInterceptor);
        }
        a.a(aVar);
        ryj ryjVar = new ryj(new wh6(new q7x0(m83.c("com.yandex.infra.".concat("NetworkRequestExecutor")), 1), 0));
        ryjVar.d(1);
        aVar.a = ryjVar;
        new OkHttpClient(aVar);
        new xh6(0);
        new ll60();
    }
}
