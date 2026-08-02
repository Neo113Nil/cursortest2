package defpackage;

import android.content.Context;
import android.content.Intent;
import android.webkit.WebChromeClient;
import com.ybsdk.feature.webview.internal.utils.FileChooserActivity;

/* loaded from: classes11.dex */
public final class qyq {
    public static Intent a(Context context, pi51 pi51Var, String str) {
        if (pi51Var == null) {
            return null;
        }
        Intent createIntent = ((WebChromeClient.FileChooserParams) ((zch) pi51Var).a).createIntent();
        Intent intent = new Intent(context, (Class<?>) FileChooserActivity.class);
        intent.putExtra("android.intent.extra.INTENT", createIntent);
        intent.putExtra("extra_url_for_logs", str);
        return intent;
    }
}
