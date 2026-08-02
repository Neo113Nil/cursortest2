package ru.yandex.music.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.o;
import defpackage.b6e;
import defpackage.cpp;
import defpackage.cxb;
import defpackage.ddl;
import defpackage.ern;
import defpackage.fd;
import defpackage.hil;
import defpackage.ksp;
import defpackage.lpp;
import defpackage.lsp;
import defpackage.msp;
import defpackage.opi;
import defpackage.pqp;
import defpackage.qdq;
import defpackage.s9f;
import defpackage.wfl;
import defpackage.ypp;
import kotlin.Pair;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes6.dex */
public final class SettingsActivity extends a {
    public static final cpp v0;
    public static final /* synthetic */ s9f[] w0;
    public static final fd x0;
    public static final fd y0;
    public final int Y = R.id.fragment_container_view;
    public final ddl Z = new ddl();

    static {
        opi opiVar = new opi(SettingsActivity.class, "settingsFragment", "getSettingsFragment()Landroidx/fragment/app/Fragment;", 0);
        ern.a.getClass();
        w0 = new s9f[]{opiVar};
        v0 = new cpp();
        x0 = new fd("ARG_TARGET_BLOCK");
        y0 = new fd("ARG_TARGET_OPTION");
    }

    public static msp F(Intent intent) {
        v0.getClass();
        s9f[] s9fVarArr = cpp.a;
        s9f s9fVar = s9fVarArr[1];
        fd fdVar = y0;
        String str = (String) fdVar.getValue(intent, s9fVar);
        fdVar.setValue(intent, s9fVarArr[1], null);
        s9f s9fVar2 = s9fVarArr[0];
        fd fdVar2 = x0;
        String str2 = (String) fdVar2.getValue(intent, s9fVar2);
        fdVar2.setValue(intent, s9fVarArr[0], null);
        lsp.b.getClass();
        lsp a = hil.a(str);
        if (a != null) {
            return a;
        }
        ksp.a.getClass();
        return wfl.b(str2);
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle K;
        super.onCreate(bundle);
        s9f[] s9fVarArr = w0;
        s9f s9fVar = s9fVarArr[0];
        ddl ddlVar = this.Z;
        ddlVar.getClass();
        if (ddlVar.getValue(this, s9fVar) == null) {
            if (getIntent().getBooleanExtra("ARG_OPEN_CLEAR_MEMORY", false)) {
                ddlVar.setValue(this, s9fVarArr[0], new lpp());
            } else {
                Intent intent = getIntent();
                intent.getClass();
                msp F = F(intent);
                ypp yppVar = new ypp();
                if (F != null) {
                    if (F instanceof ksp) {
                        K = cxb.K(new Pair("ARG_TARGET_BLOCK", ((ksp) F).name()));
                    } else {
                        if (!(F instanceof lsp)) {
                            b6e.s();
                            return;
                        }
                        K = cxb.K(new Pair("ARG_TARGET_OPTION", ((lsp) F).name()));
                    }
                    yppVar.setArguments(K);
                }
                ddlVar.setValue(this, s9fVarArr[0], yppVar);
            }
        }
        View findViewById = findViewById(android.R.id.content);
        findViewById.getClass();
        qdq.d(findViewById, true, false, true, false);
    }

    @Override // ru.yandex.music.player.a, defpackage.hn5, android.app.Activity
    public final void onNewIntent(Intent intent) {
        msp F;
        intent.getClass();
        super.onNewIntent(intent);
        s9f s9fVar = w0[0];
        ddl ddlVar = this.Z;
        ddlVar.getClass();
        o value = ddlVar.getValue(this, s9fVar);
        ypp yppVar = value instanceof ypp ? (ypp) value : null;
        if (yppVar == null || (F = F(intent)) == null) {
            return;
        }
        ((pqp) yppVar.k.getValue()).I.a(F);
    }
}
