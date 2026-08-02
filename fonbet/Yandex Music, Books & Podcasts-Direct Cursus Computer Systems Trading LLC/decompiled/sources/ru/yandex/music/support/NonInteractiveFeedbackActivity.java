package ru.yandex.music.support;

import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import defpackage.ggp;
import defpackage.mrr;
import defpackage.np2;
import defpackage.x7c;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class NonInteractiveFeedbackActivity extends np2 {
    public static final /* synthetic */ int v = 0;

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
        super.onCreate(bundle);
        setContentView(R.layout.base_activity);
        if (getSupportFragmentManager().c.f().isEmpty()) {
            String stringExtra = getIntent().getStringExtra("extra_email");
            String string = getString(R.string.non_interactive_feedback_message_title);
            string.getClass();
            x7c x7cVar = x7c.NON_INTERACTIVE_FEEDBACK;
            mrr mrrVar = mrr.DEEPLINK;
            ggp ggpVar = new ggp();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("arg_topic", x7cVar);
            bundle2.putSerializable("arg_source", mrrVar);
            bundle2.putString("arg_email", stringExtra);
            bundle2.putString("arg_message", string);
            ggpVar.setArguments(bundle2);
            y supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            a aVar = new a(supportFragmentManager);
            aVar.e(R.id.content_frame, ggpVar, null);
            aVar.j();
        }
    }
}
