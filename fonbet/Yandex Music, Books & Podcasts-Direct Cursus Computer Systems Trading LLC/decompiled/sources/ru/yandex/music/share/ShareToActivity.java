package ru.yandex.music.share;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import defpackage.asq;
import defpackage.hoe;
import defpackage.np2;
import defpackage.ou0;
import defpackage.xxp;
import defpackage.yxp;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class ShareToActivity extends np2 {
    @Override // defpackage.np2
    public final boolean m() {
        return true;
    }

    @Override // defpackage.np2
    public final boolean n() {
        return true;
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            finish();
        }
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.getClass();
        hoe.b(window);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(asq.H(this) ? 6 : 7);
        }
        if (((yxp) getIntent().getParcelableExtra("share_to")) != null) {
            throw null;
        }
        Assertions.throwOrSkip$default(new FailedAssertionException("Invalid activity params"), null, 2, null);
        finish();
    }

    @Override // defpackage.np2, defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // defpackage.np2, defpackage.gnb, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.np2, defpackage.gnb, defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    @Override // defpackage.np2, defpackage.gnb, defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onStop() {
        super.onStop();
    }

    @Override // defpackage.np2
    public final int q() {
        return R.layout.activity_share_to;
    }

    @Override // defpackage.np2
    public final int v(ou0 ou0Var) {
        return xxp.a[ou0Var.ordinal()] == 1 ? R.style.AppTheme_Transparent_EdgeToEdge_Share : R.style.AppTheme_Transparent_Dark_EdgeToEdge_Share;
    }
}
