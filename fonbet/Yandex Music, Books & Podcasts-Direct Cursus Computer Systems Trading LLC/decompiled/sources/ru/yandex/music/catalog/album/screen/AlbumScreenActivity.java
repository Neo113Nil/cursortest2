package ru.yandex.music.catalog.album.screen;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.Assertions;
import defpackage.b6e;
import defpackage.cxb;
import defpackage.dud;
import defpackage.dyd;
import defpackage.hy;
import defpackage.iy;
import defpackage.ja3;
import defpackage.jy;
import defpackage.ky;
import defpackage.lik;
import defpackage.mqs;
import defpackage.ou0;
import defpackage.qbm;
import defpackage.qq;
import defpackage.rbj;
import defpackage.rq;
import defpackage.sbj;
import defpackage.sq;
import defpackage.su4;
import defpackage.tbj;
import defpackage.ubj;
import defpackage.uq;
import defpackage.vik;
import defpackage.xz;
import defpackage.yu0;
import defpackage.z6n;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes4.dex */
public final class AlbumScreenActivity extends a {
    public static final /* synthetic */ int v0 = 0;
    public uq Y;
    public z6n Z;

    public final rbj F(uq uqVar) {
        ubj ubjVar;
        vik vikVar = vik.a;
        uq uqVar2 = this.Y;
        if (uqVar2 == null) {
            Intrinsics.j("activityParams");
            throw null;
        }
        lik likVar = new lik(vikVar, uqVar2.a, uqVar2.b);
        String str = uqVar.a;
        String str2 = uqVar.b;
        String str3 = null;
        dud dudVar = uqVar.d;
        mqs mqsVar = uqVar.g;
        if (mqsVar != null) {
            str3 = mqsVar.a;
        }
        boolean z = uqVar.j;
        boolean z2 = uqVar.h;
        sq sqVar = uqVar.i;
        if (Intrinsics.d(sqVar, rq.a)) {
            ubjVar = tbj.a;
        } else {
            if (!Intrinsics.d(sqVar, qq.a)) {
                b6e.s();
                return null;
            }
            ubjVar = sbj.a;
        }
        return new rbj(likVar, str, str2, dudVar, str3, z, z2, ubjVar);
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ky kyVar;
        o xzVar;
        super.onCreate(bundle);
        uq uqVar = (uq) getIntent().getSerializableExtra("extra.activityParams");
        if (uqVar == null) {
            Assertions.fail("activity launch params must not be null");
            finish();
            return;
        }
        this.Y = uqVar;
        Intent intent = getIntent();
        intent.getClass();
        this.Z = new z6n(intent, bundle);
        if (bundle == null) {
            y supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a l = su4.l(supportFragmentManager, supportFragmentManager);
            int ordinal = uqVar.c.ordinal();
            if (ordinal == 0) {
                String str = uqVar.a;
                String str2 = uqVar.b;
                dud dudVar = uqVar.d;
                mqs mqsVar = uqVar.g;
                String str3 = mqsVar != null ? mqsVar.a : null;
                boolean z = uqVar.h;
                sq sqVar = uqVar.i;
                if (Intrinsics.d(sqVar, rq.a)) {
                    kyVar = jy.a;
                } else {
                    if (!Intrinsics.d(sqVar, qq.a)) {
                        b6e.s();
                        return;
                    }
                    kyVar = iy.a;
                }
                hy hyVar = new hy(str, str2, dudVar, str3, z, kyVar, uqVar.e);
                xzVar = new xz();
                xzVar.setArguments(cxb.K(new Pair("albumScreen:args", hyVar)));
            } else if (ordinal == 1) {
                rbj F = F(uqVar);
                xzVar = new qbm();
                xzVar.setArguments(cxb.K(new Pair("podcastScreen:args", F)));
            } else if (ordinal != 2) {
                b6e.s();
                return;
            } else {
                rbj F2 = F(uqVar);
                xzVar = new ja3();
                xzVar.setArguments(cxb.K(new Pair("audioBookScreen:args", F2)));
            }
            l.e(R.id.fragment_container_view, xzVar, null);
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
