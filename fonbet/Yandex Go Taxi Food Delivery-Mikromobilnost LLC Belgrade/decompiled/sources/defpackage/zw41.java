package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.otp.android.sdk.enums.WhatsAppClientType;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes11.dex */
public class zw41 {
    public final bx41 a = new bx41();

    public final void a(Context context, WhatsAppClientType whatsAppClientType) {
        Intent intent;
        bx41 bx41Var = this.a;
        synchronized (bx41Var) {
            if (whatsAppClientType == null) {
                throw new NullPointerException("WhatsApp application type must be defined.");
            }
            if (context == null) {
                throw new NullPointerException("Context cannot be null.");
            }
            String a = whatsAppClientType.a();
            intent = new Intent();
            intent.setPackage(a);
            intent.setAction("com.whatsapp.otp.OTP_REQUESTED");
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? SelfTester_JCP.DECRYPT_CBC : 0);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.putParcelable("_ci_", activity);
            Package r5 = bx41Var.getClass().getPackage();
            String implementationVersion = r5 != null ? r5.getImplementationVersion() : null;
            if (implementationVersion == null) {
                implementationVersion = "0.1.0_not_from_manifest";
            }
            extras.putString("SDK_VERSION", implementationVersion);
            intent.putExtras(extras);
        }
        context.sendBroadcast(intent);
    }
}
