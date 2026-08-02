package defpackage;

import android.content.Context;
import android.content.Intent;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;

/* loaded from: classes3.dex */
public final class xux extends x40 {
    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        b0p b0pVar = (b0p) obj;
        LaunchBrowserActivity.Companion.getClass();
        Intent intent = new Intent(context, (Class<?>) LaunchBrowserActivity.class);
        intent.setData(b0pVar.a);
        intent.putExtra(LaunchBrowserActivity.KEY_CUSTOMTAB, b0pVar.b);
        return intent;
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
