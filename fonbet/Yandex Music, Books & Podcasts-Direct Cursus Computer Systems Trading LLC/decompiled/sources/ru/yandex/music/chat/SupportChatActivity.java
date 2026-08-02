package ru.yandex.music.chat;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import defpackage.bsr;
import defpackage.bx5;
import defpackage.fpq;
import defpackage.hag;
import defpackage.np2;
import defpackage.qdq;
import defpackage.wyf;
import defpackage.x97;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class SupportChatActivity extends np2 {
    public static final /* synthetic */ int w = 0;
    public final bx5 v = new bx5(getLifecycle());

    @Override // defpackage.np2
    public final boolean m() {
        return true;
    }

    @Override // defpackage.np2
    public final boolean n() {
        return true;
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ((bsr) this.v.a.getValue()).d().f();
        hag.k(this);
        super.onCreate(bundle);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        x97.y(wyf.F(getLifecycle()), null, null, new fpq(getIntent().getStringExtra("extra.chatid"), this, getIntent().getStringExtra("extra.initialtext"), (Continuation) null), 3);
        View findViewById = findViewById(android.R.id.content);
        findViewById.getClass();
        qdq.d(findViewById, true, true, true, true);
    }

    @Override // defpackage.np2, defpackage.hq0
    public final boolean onSupportNavigateUp() {
        getOnBackPressedDispatcher().d();
        return true;
    }

    @Override // defpackage.np2
    public final int q() {
        return R.layout.activity_support_chat;
    }
}
