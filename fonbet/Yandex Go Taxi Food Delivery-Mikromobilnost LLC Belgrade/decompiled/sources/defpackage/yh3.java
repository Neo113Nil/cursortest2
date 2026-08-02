package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.yandex.messaging.ui.auth.AuthorizeActivity;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes15.dex */
public final class yh3 {
    public final Activity a;
    public final ymp b;

    public yh3(Activity activity, ymp ympVar) {
        this.a = activity;
        this.b = ympVar;
    }

    public static void a(yh3 yh3Var, int i, String str) {
        Activity activity = yh3Var.a;
        j1q j1qVar = (j1q) yh3Var.b;
        if (j1qVar.a == null || !((Boolean) j1qVar.b.e.getValue()).booleanValue()) {
            return;
        }
        new l0u0();
        Intent intent = new Intent(activity, (Class<?>) AuthorizeActivity.class);
        intent.putExtra(CRLReasonCodeExtension.REASON, str);
        intent.putExtra("phone_required", true);
        activity.startActivityForResult(intent, i);
    }
}
