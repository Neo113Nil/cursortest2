package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.fragment.app.t;
import androidx.media3.session.i;
import com.yandex.passport.R;
import com.yandex.passport.api.y1;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.properties.k;
import com.yandex.passport.internal.ui.SocialBindActivity;
import com.yandex.passport.internal.ui.social.j;
import com.yandex.passport.internal.y;
import com.yandex.passport.legacy.lx.a;
import com.yandex.plus.pay.ui.core.b;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final /* synthetic */ class w1e implements jd, fvh, ua6, tqj, a {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w1e(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // defpackage.ua6
    public void accept(Object obj) {
        ((lrl) obj).P((dv1) this.c, this.b);
    }

    @Override // com.yandex.passport.legacy.lx.a
    /* renamed from: b */
    public void mo1b(Object obj) {
        SocialBindActivity socialBindActivity = (SocialBindActivity) this.c;
        l lVar = (l) obj;
        int i = SocialBindActivity.h;
        if (lVar == null) {
            com.yandex.passport.legacy.a.e(6, "Error getting master token on binding social to passport account (account is null)", null);
            socialBindActivity.f.w(y.a(socialBindActivity.d.d), new NullPointerException("Error getting master token on binding social to passport account (account is null)"));
            socialBindActivity.setResult(0);
            socialBindActivity.finish();
            return;
        }
        k kVar = new k();
        kVar.c(socialBindActivity.d.a);
        y1 y1Var = socialBindActivity.d.b;
        y1Var.getClass();
        kVar.f = y1Var;
        kVar.h = socialBindActivity.d.c;
        com.yandex.passport.internal.properties.l t = b.t(kVar.a());
        a0 a = y.a(socialBindActivity.d.d);
        j jVar = new j();
        Bundle t2 = t.t();
        t2.putParcelable("social-type", a);
        t2.putBoolean("use-native", this.b);
        t2.putAll(cxb.K(new Pair("master-account", lVar)));
        jVar.setArguments(t2);
        androidx.fragment.app.y supportFragmentManager = socialBindActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.e(R.id.container, jVar, "com.yandex.passport.internal.ui.social.j");
        aVar.k(true, true);
    }

    @Override // defpackage.jd
    public void call() {
        switch (this.a) {
            case 0:
                x1e x1eVar = (x1e) this.c;
                if (this.b) {
                    t l = x1eVar.a.l();
                    ru.yandex.music.player.a aVar = l instanceof ru.yandex.music.player.a ? (ru.yandex.music.player.a) l : null;
                    if (aVar != null) {
                        aVar.z();
                        break;
                    }
                }
                break;
            case 1:
                a2e a2eVar = (a2e) this.c;
                if (this.b) {
                    t l2 = a2eVar.a.l();
                    ru.yandex.music.player.a aVar2 = l2 instanceof ru.yandex.music.player.a ? (ru.yandex.music.player.a) l2 : null;
                    if (aVar2 != null) {
                        aVar2.z();
                        break;
                    }
                }
                break;
            default:
                c0v c0vVar = (c0v) this.c;
                if (this.b) {
                    t l3 = c0vVar.a.l();
                    ru.yandex.music.player.a aVar3 = l3 instanceof ru.yandex.music.player.a ? (ru.yandex.music.player.a) l3 : null;
                    if (aVar3 != null) {
                        aVar3.z();
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.fvh
    public Object h(i iVar, wrh wrhVar, int i) {
        switch (this.a) {
            case 2:
                qsn y = yde.y((onh) this.c);
                boolean z = this.b;
                return iVar.s(wrhVar, y, z ? -1 : iVar.t.v0(), z ? -9223372036854775807L : iVar.t.J0());
            default:
                List list = (List) this.c;
                boolean z2 = this.b;
                return iVar.s(wrhVar, list, z2 ? -1 : iVar.t.v0(), z2 ? -9223372036854775807L : iVar.t.J0());
        }
    }

    @Override // defpackage.tqj
    public void onSuccess(Object obj) {
        SharedPreferences.Editor edit = tyf.x((Context) this.c).edit();
        edit.putBoolean("proxy_retention", this.b);
        edit.apply();
    }

    public /* synthetic */ w1e(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}
