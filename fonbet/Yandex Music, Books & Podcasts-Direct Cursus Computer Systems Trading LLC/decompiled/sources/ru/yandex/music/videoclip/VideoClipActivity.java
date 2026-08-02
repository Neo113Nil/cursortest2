package ru.yandex.music.videoclip;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import defpackage.asq;
import defpackage.bdt;
import defpackage.cxb;
import defpackage.d6m;
import defpackage.e8u;
import defpackage.g1e;
import defpackage.h4u;
import defpackage.hag;
import defpackage.j6m;
import defpackage.jyr;
import defpackage.klx;
import defpackage.l18;
import defpackage.l8u;
import defpackage.lot;
import defpackage.lwc;
import defpackage.np2;
import defpackage.o6m;
import defpackage.ou0;
import defpackage.ox6;
import defpackage.p6m;
import defpackage.pqv;
import defpackage.q5g;
import defpackage.sb;
import defpackage.su4;
import defpackage.wdu;
import defpackage.wmn;
import defpackage.wyf;
import defpackage.xz0;
import defpackage.y5g;
import defpackage.yu0;
import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class VideoClipActivity extends np2 {
    public static final jyr y = l18.b.b(hag.I(lwc.class), true);
    public final jyr v;
    public final jyr w;
    public final g1e x;

    public VideoClipActivity() {
        bdt I = hag.I(h4u.class);
        l18 l18Var = l18.b;
        this.v = l18Var.b(I, true);
        this.w = l18Var.b(hag.I(d6m.class), true);
        this.x = new g1e(5, this);
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        getWindow().addFlags(128);
        sb.r(this);
        super.onCreate(bundle);
        getOnBackPressedDispatcher().a(this, this.x);
        q5g.I(getWindow(), false);
        pqv j = wdu.j(findViewById(R.id.content_frame));
        if (j == null) {
            finish();
            return;
        }
        y5g y5gVar = j.a;
        y5gVar.l0();
        if (asq.H(this)) {
            y5gVar.b0(519);
        } else {
            y5gVar.m0(519);
        }
        Parcelable[] parcelableArrayExtra = getIntent().getParcelableArrayExtra("extra.videoclip");
        List X = parcelableArrayExtra != null ? xz0.X(parcelableArrayExtra) : null;
        if (!(X instanceof List)) {
            X = null;
        }
        String[] stringArrayExtra = getIntent().getStringArrayExtra("extra.videoclipid");
        List X2 = stringArrayExtra != null ? xz0.X(stringArrayExtra) : null;
        int intExtra = getIntent().getIntExtra("extra.videoclipstartpos", 0);
        Serializable serializableExtra = getIntent().getSerializableExtra("extra.videocliprectype");
        wmn wmnVar = serializableExtra instanceof wmn ? (wmn) serializableExtra : null;
        jyr jyrVar = p6m.f;
        if (o6m.e()) {
            ox6.B(((j6m) ((d6m) this.w.getValue())).j, wyf.F(getLifecycle()), new lot(4, this));
        }
        if (bundle == null) {
            y supportFragmentManager = getSupportFragmentManager();
            a l = su4.l(supportFragmentManager, supportFragmentManager);
            if (wmnVar == null) {
                wmnVar = wmn.a;
            }
            e8u e8uVar = new e8u(X, X2, intExtra, wmnVar);
            l8u l8uVar = new l8u();
            l8uVar.setArguments(cxb.K(new Pair("videoClipsScreen:args", e8uVar)));
            l.e(R.id.content_frame, l8uVar, null);
            l.j();
        }
        ((h4u) this.v.getValue()).a.a(Unit.a);
    }

    @Override // defpackage.hn5, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        finish();
        startActivity(intent);
    }

    @Override // defpackage.np2
    public final int v(ou0 ou0Var) {
        klx klxVar = ou0.a;
        return yu0.a[0] == 1 ? R.style.AppTheme_EdgeToEdge_TransparentStatusBar : R.style.AppTheme_Dark_EdgeToEdge_TransparentStatusBar;
    }
}
