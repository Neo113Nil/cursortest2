package ru.yandex.music.catalog.playlist.screen;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import defpackage.cxb;
import defpackage.dud;
import defpackage.dyd;
import defpackage.exl;
import defpackage.fxl;
import defpackage.gzl;
import defpackage.hag;
import defpackage.l18;
import defpackage.lxl;
import defpackage.nxl;
import defpackage.ou0;
import defpackage.oxl;
import defpackage.sml;
import defpackage.su4;
import defpackage.yu0;
import defpackage.z66;
import defpackage.z6n;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes4.dex */
public final class PlaylistScreenActivity extends a {
    public static final /* synthetic */ int B0 = 0;
    public boolean A0;
    public z6n Z;
    public sml v0;
    public lxl w0;
    public String y0;
    public dud z0;
    public final z66 Y = (z66) l18.b.c(hag.I(z66.class));
    public oxl x0 = nxl.a;

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.w0 = (lxl) getIntent().getParcelableExtra("extra.playlist.id.arg");
        this.z0 = (dud) getIntent().getParcelableExtra("extra.playlist.cover.bg");
        this.A0 = getIntent().getBooleanExtra("extra.playlist.navigate.from.global.playlists", false);
        oxl oxlVar = (oxl) getIntent().getParcelableExtra("extra.screen.mode");
        if (oxlVar == null) {
            oxlVar = nxl.a;
        }
        this.x0 = oxlVar;
        this.y0 = getIntent().getStringExtra("extra.promo.info");
        Intent intent = getIntent();
        intent.getClass();
        this.Z = new z6n(intent, bundle);
        Intent intent2 = getIntent();
        intent2.getClass();
        this.v0 = new sml(intent2, bundle);
        lxl lxlVar = this.w0;
        if (lxlVar != null && lxlVar.N() && this.Y.g() && (this.x0 instanceof nxl)) {
            this.w0 = fxl.a;
        }
        lxl lxlVar2 = this.w0;
        dud dudVar = this.z0;
        if (lxlVar2 == null || dudVar == null) {
            Assertions.throwOrSkip$default(new FailedAssertionException("Attempt to create a playlist screen without specifying a playlist data"), null, 2, null);
            finish();
            return;
        }
        exl exlVar = new exl(lxlVar2, dudVar, this.y0, this.x0);
        if (bundle == null) {
            y supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a l = su4.l(supportFragmentManager, supportFragmentManager);
            gzl gzlVar = new gzl();
            gzlVar.setArguments(cxb.K(new Pair("playlistScreen:args", exlVar)));
            l.e(R.id.fragment_container_view, gzlVar, null);
            l.j();
        }
    }

    @Override // defpackage.np2, defpackage.gnb, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        z6n z6nVar = this.Z;
        if (z6nVar == null) {
            Intrinsics.j("urlPlayIntegration");
            throw null;
        }
        dyd dydVar = (dyd) z6nVar.b;
        if (dydVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("key.intent.action.executed", dydVar.c);
            dydVar.d(bundle2, dydVar.b);
            bundle.putBundle(dydVar.a, bundle2);
        }
    }

    @Override // defpackage.np2
    public final int v(ou0 ou0Var) {
        return yu0.a[ou0Var.ordinal()] == 1 ? R.style.AppTheme_EdgeToEdge_TransparentStatusBar : R.style.AppTheme_Dark_EdgeToEdge_TransparentStatusBar;
    }
}
