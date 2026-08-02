package ru.yandex.music.support;

import android.R;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import defpackage.f6w;
import defpackage.gnb;
import defpackage.hag;
import defpackage.jyr;
import defpackage.klx;
import defpackage.l18;
import defpackage.mrr;
import defpackage.orr;
import defpackage.ou0;
import defpackage.qdq;
import defpackage.x7c;
import defpackage.y7c;
import defpackage.yu0;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class AppFeedbackActivity extends gnb {
    public static final /* synthetic */ int c = 0;
    public final jyr b = l18.b.b(hag.I(orr.class), true);

    @Override // defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        o oVar;
        hag.k(this);
        super.onCreate(bundle);
        View findViewById = findViewById(R.id.content);
        findViewById.getClass();
        qdq.d(findViewById, true, true, true, true);
        setContentView(ru.yandex.music.R.layout.activity_send_app_feedback);
        setSupportActionBar((Toolbar) findViewById(ru.yandex.music.R.id.toolbar));
        if (getSupportFragmentManager().D("tag_feedback_fragment") == null) {
            x7c x7cVar = (x7c) getIntent().getSerializableExtra("extra_topic");
            Serializable serializableExtra = getIntent().getSerializableExtra("extra_source");
            serializableExtra.getClass();
            mrr mrrVar = (mrr) serializableExtra;
            String stringExtra = getIntent().getStringExtra("extra_message");
            String stringExtra2 = getIntent().getStringExtra("extra_payload");
            String stringExtra3 = getIntent().getStringExtra("extra_hint_text");
            if (x7cVar != null) {
                oVar = f6w.B(x7cVar, mrrVar, stringExtra, stringExtra2, stringExtra3);
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putString("arg_initial_message", stringExtra);
                bundle2.putSerializable("arg_source", mrrVar);
                bundle2.putString("arg_payload", stringExtra2);
                y7c y7cVar = new y7c();
                y7cVar.setArguments(bundle2);
                oVar = y7cVar;
            }
            y supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            a aVar = new a(supportFragmentManager);
            aVar.e(ru.yandex.music.R.id.content_frame, oVar, "tag_feedback_fragment");
            aVar.j();
        }
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        if (isFinishing()) {
            ((orr) this.b.getValue()).e.clear();
        }
        super.onDestroy();
    }

    @Override // defpackage.hq0
    public final boolean onSupportNavigateUp() {
        getOnBackPressedDispatcher().d();
        return true;
    }

    @Override // defpackage.hq0, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        ou0.a.getClass();
        super.setTheme(yu0.a[klx.Z(this).ordinal()] == 1 ? ru.yandex.music.R.style.AppTheme_EdgeToEdge : ru.yandex.music.R.style.AppTheme_Dark_EdgeToEdge);
    }
}
