package ru.yandex.music.share;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import defpackage.hag;
import defpackage.hq0;
import defpackage.klx;
import defpackage.ou0;
import defpackage.sk3;
import defpackage.yu0;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class CopyExtraTextActivity extends hq0 {
    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ou0.a.getClass();
        setTheme(yu0.a[klx.Z(this).ordinal()] == 1 ? R.style.AppTheme_Transparent_EdgeToEdge : R.style.AppTheme_Transparent_Dark_EdgeToEdge);
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("android.intent.extra.TEXT");
        if (stringExtra == null) {
            Assertions.throwOrSkip$default(new FailedAssertionException("Invalid activity params"), null, 2, null);
            finish();
            return;
        }
        Object systemService = ((Context) sk3.I(Context.class)).getSystemService("clipboard");
        systemService.getClass();
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, stringExtra));
        hag.x(this, R.string.link_copied_to_clipboard, 0);
        finish();
        overridePendingTransition(0, 0);
    }
}
