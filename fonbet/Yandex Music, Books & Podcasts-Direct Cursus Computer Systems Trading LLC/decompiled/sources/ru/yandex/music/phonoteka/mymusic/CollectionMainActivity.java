package ru.yandex.music.phonoteka.mymusic;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import defpackage.b6e;
import defpackage.bdt;
import defpackage.bz1;
import defpackage.c65;
import defpackage.cha;
import defpackage.cxb;
import defpackage.d98;
import defpackage.dru;
import defpackage.dsu;
import defpackage.e00;
import defpackage.feb;
import defpackage.fp2;
import defpackage.gda;
import defpackage.h32;
import defpackage.hag;
import defpackage.hfa;
import defpackage.jh1;
import defpackage.jnb;
import defpackage.jyr;
import defpackage.kru;
import defpackage.l18;
import defpackage.lam;
import defpackage.lu4;
import defpackage.m65;
import defpackage.mla;
import defpackage.mpu;
import defpackage.n5h;
import defpackage.nea;
import defpackage.otc;
import defpackage.p25;
import defpackage.p65;
import defpackage.pd;
import defpackage.pu0;
import defpackage.pzl;
import defpackage.qdc;
import defpackage.qem;
import defpackage.qha;
import defpackage.qzm;
import defpackage.rv4;
import defpackage.s50;
import defpackage.s83;
import defpackage.su4;
import defpackage.t40;
import defpackage.uef;
import defpackage.v35;
import defpackage.vda;
import defpackage.vef;
import defpackage.vgf;
import defpackage.xcf;
import defpackage.ycf;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Pair;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes6.dex */
public final class CollectionMainActivity extends a {
    public static final /* synthetic */ int v0 = 0;
    public final jyr Y;
    public final jyr Z;

    public CollectionMainActivity() {
        bdt I = hag.I(m65.class);
        l18 l18Var = l18.b;
        this.Y = l18Var.b(I, true);
        this.Z = l18Var.b(hag.I(dsu.class), true);
    }

    public final jnb F(v35 v35Var) {
        Integer valueOf = Integer.valueOf(R.id.fragment_container_view);
        switch (v35Var.ordinal()) {
            case 0:
                return new n5h();
            case 1:
                return new vef();
            case 2:
                return new ycf();
            case 3:
                p25 p25Var = new p25();
                p25Var.setArguments(cxb.K(new Pair("arg.initial_tab", 1)));
                return p25Var;
            case 4:
                p25 p25Var2 = new p25();
                p25Var2.setArguments(cxb.K(new Pair("arg.initial_tab", 0)));
                return p25Var2;
            case 5:
                return new lu4();
            case 6:
                e00 e00Var = ((m65) this.Y.getValue()).a;
                e00Var.getClass();
                pu0 t = pd.t(new qzm[0]);
                bdt I = hag.I(c65.class);
                qdc qdcVar = e00Var.a;
                qdcVar.getClass();
                return new p65(t, (c65) qdcVar.C(I));
            case 7:
                return new rv4();
            case 8:
                return new d98();
            case 9:
                bz1 bz1Var = new bz1();
                bz1Var.setArguments(cxb.K(new Pair("arg_container_id", valueOf)));
                return bz1Var;
            case 10:
                lam lamVar = new lam();
                lamVar.setArguments(cxb.K(new Pair("arg_container_id", valueOf)));
                return lamVar;
            case 11:
                return new h32();
            case 12:
                return new mla();
            case 13:
                Serializable serializableExtra = getIntent().getSerializableExtra("downloaded.screen.artists.list.key");
                ArrayList arrayList = serializableExtra instanceof ArrayList ? (ArrayList) serializableExtra : null;
                vda vdaVar = new vda();
                vdaVar.j = arrayList;
                return vdaVar;
            case 14:
                return new s50();
            case 15:
                return new qha();
            case 16:
                return new feb();
            case 17:
                return new qem();
            case 18:
                return new hfa();
            case 19:
                return new vgf();
            case 20:
                return new uef();
            case 21:
                return new xcf();
            case 22:
                cha chaVar = new cha();
                chaVar.setArguments(cxb.K(new Pair("arg.initial_tab", 0)));
                return chaVar;
            case 23:
                return new gda();
            case 24:
                return new nea();
            case 25:
                return new s83();
            case 26:
                return new t40();
            case 27:
                dsu dsuVar = (dsu) this.Z.getValue();
                dsuVar.getClass();
                pu0 a = dru.a(false);
                pzl pzlVar = dsuVar.b;
                bdt I2 = hag.I(mpu.class);
                qdc qdcVar2 = pzlVar.a;
                qdcVar2.getClass();
                return new kru(a, (mpu) qdcVar2.C(I2), dsuVar);
            default:
                b6e.s();
                return null;
        }
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        m65 m65Var = (m65) this.Y.getValue();
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        m65Var.getClass();
        otc J = supportFragmentManager.J();
        J.getClass();
        int i = 1;
        supportFragmentManager.B = new jh1(i, m65Var, J);
        dsu dsuVar = (dsu) this.Z.getValue();
        y supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        dsuVar.getClass();
        otc J2 = supportFragmentManager2.J();
        J2.getClass();
        supportFragmentManager2.B = new jh1(7, dsuVar, J2);
        super.onCreate(bundle);
        FragmentContainerView fragmentContainerView = (FragmentContainerView) findViewById(R.id.fragment_container_view);
        if (bundle == null) {
            getSupportFragmentManager().o.add(new fp2(fragmentContainerView, i));
            Serializable serializableExtra = getIntent().getSerializableExtra("extra.item");
            v35 v35Var = serializableExtra instanceof v35 ? (v35) serializableExtra : null;
            if (v35Var == null) {
                Assertions.throwOrSkip$default(new FailedAssertionException("Screen must not be null"), null, 2, null);
                finish();
            } else {
                y supportFragmentManager3 = getSupportFragmentManager();
                androidx.fragment.app.a l = su4.l(supportFragmentManager3, supportFragmentManager3);
                l.e(R.id.fragment_container_view, F(v35Var), null);
                l.j();
            }
        }
    }

    @Override // ru.yandex.music.player.a, defpackage.hn5, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Serializable serializableExtra = intent.getSerializableExtra("extra.item");
        v35 v35Var = serializableExtra instanceof v35 ? (v35) serializableExtra : null;
        if (v35Var == null) {
            Assertions.throwOrSkip$default(new FailedAssertionException("Screen must not be null"), null, 2, null);
            finish();
            return;
        }
        jnb F = F(v35Var);
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.c(null);
        aVar.e(R.id.fragment_container_view, F, null);
        aVar.j();
    }
}
