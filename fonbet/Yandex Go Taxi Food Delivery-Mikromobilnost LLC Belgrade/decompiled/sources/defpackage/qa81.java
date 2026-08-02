package defpackage;

import android.content.Intent;
import android.view.Window;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.common.AdActivity;
import yads.am3;

/* loaded from: classes7.dex */
public final class qa81 implements m271 {
    @Override // defpackage.m271
    public final hz61 a(AdActivity adActivity, RelativeLayout relativeLayout, cf71 cf71Var, o3 o3Var, Intent intent, Window window, lk81 lk81Var) {
        String stringExtra = intent.getStringExtra("extra_browser_url");
        if (stringExtra == null || stringExtra.length() <= 0) {
            return null;
        }
        try {
            return new m781(adActivity, relativeLayout, cf71Var, window, stringExtra);
        } catch (am3 unused) {
            return null;
        }
    }
}
