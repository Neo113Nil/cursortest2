package ru.yandex.music.communication.trigger;

import android.R;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import defpackage.cxb;
import defpackage.hoe;
import defpackage.lhd;
import defpackage.np2;
import defpackage.ns8;
import defpackage.ou0;
import defpackage.su4;
import defpackage.yu0;
import defpackage.zh5;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class CommunicationTriggerActivity extends np2 {
    public static final /* synthetic */ int v = 0;

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hoe.a(this, false, new lhd(8, this));
        if (bundle == null) {
            zh5 zh5Var = (zh5) getIntent().getParcelableExtra("anchor");
            String str = zh5Var != null ? zh5Var.a : null;
            if (str == null) {
                finish();
                return;
            }
            y supportFragmentManager = getSupportFragmentManager();
            a l = su4.l(supportFragmentManager, supportFragmentManager);
            ns8 ns8Var = new ns8();
            ns8Var.setArguments(cxb.K(new Pair("anchor_id", str)));
            l.e(R.id.content, ns8Var, null);
            l.j();
        }
    }

    @Override // defpackage.np2
    public final int v(ou0 ou0Var) {
        return yu0.a[ou0Var.ordinal()] == 1 ? ru.yandex.music.R.style.AppTheme_Transparent_EdgeToEdge : ru.yandex.music.R.style.AppTheme_Transparent_Dark_EdgeToEdge;
    }
}
