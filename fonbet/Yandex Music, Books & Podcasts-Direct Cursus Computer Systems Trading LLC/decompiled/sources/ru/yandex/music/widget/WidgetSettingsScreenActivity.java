package ru.yandex.music.widget;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import defpackage.dov;
import defpackage.gfo;
import defpackage.hoe;
import defpackage.np2;
import defpackage.su4;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class WidgetSettingsScreenActivity extends np2 {
    @Override // defpackage.gnb
    public final gfo j() {
        return gfo.Widget;
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        hoe.c(this);
        if (bundle == null) {
            dov dovVar = new dov();
            y supportFragmentManager = getSupportFragmentManager();
            a l = su4.l(supportFragmentManager, supportFragmentManager);
            l.d(R.id.content_frame, dovVar, null, 1);
            l.j();
            Intent intent = new Intent();
            Intent intent2 = getIntent();
            int i = 0;
            if (intent2 != null && (extras = intent2.getExtras()) != null) {
                i = extras.getInt("appWidgetId", 0);
            }
            Intent putExtra = intent.putExtra("appWidgetId", i);
            putExtra.getClass();
            setResult(-1, putExtra);
        }
    }
}
