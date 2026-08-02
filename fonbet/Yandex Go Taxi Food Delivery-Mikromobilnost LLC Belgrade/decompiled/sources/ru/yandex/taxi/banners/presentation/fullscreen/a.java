package ru.yandex.taxi.banners.presentation.fullscreen;

import android.app.Activity;
import defpackage.b7z0;
import defpackage.bt4;
import defpackage.dis;
import defpackage.eis;
import defpackage.gep0;
import defpackage.hr4;
import defpackage.hz4;
import defpackage.ir4;
import defpackage.ju4;
import defpackage.klf0;
import defpackage.kr4;
import defpackage.ltc;
import defpackage.pzt0;
import defpackage.ruc;
import defpackage.shs;
import defpackage.sqx;
import defpackage.tje;
import defpackage.ywx0;
import defpackage.zpf0;
import defpackage.zuj0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.banners.model.h;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.communications.q;
import ru.yandex.taxi.promotions.model.PromotionBackground;

/* loaded from: classes5.dex */
public final class a extends hz4 {
    public long A;
    public pzt0 B;
    public List C;
    public final Activity e;
    public shs f;
    public final String g;
    public final klf0 h;
    public final zpf0 i;
    public final b7z0 j;
    public final h k;
    public final ruc l;
    public final ru.yandex.taxi.communications.a m;
    public final ywx0 n;
    public final zuj0 o;
    public final ju4 p;
    public final kr4 q;
    public final ltc r;
    public final q s;
    public final ir4 t;
    public final gep0 u;
    public final bt4 v;
    public final sqx w;
    public BannerWidgets.OnCloseEffect x;
    public final boolean y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Activity activity, shs shsVar, String str, klf0 klf0Var, zpf0 zpf0Var, b7z0 b7z0Var, h hVar, ruc rucVar, ru.yandex.taxi.communications.a aVar, ywx0 ywx0Var, zuj0 zuj0Var, ju4 ju4Var, kr4 kr4Var, ltc ltcVar, q qVar, ir4 ir4Var, gep0 gep0Var, bt4 bt4Var) {
        super(dis.b);
        boolean z;
        Object obj;
        eis.i2.getClass();
        this.e = activity;
        this.f = shsVar;
        this.g = str;
        this.h = klf0Var;
        this.i = zpf0Var;
        this.j = b7z0Var;
        this.k = hVar;
        this.l = rucVar;
        this.m = aVar;
        this.n = ywx0Var;
        this.o = zuj0Var;
        this.p = ju4Var;
        this.q = kr4Var;
        this.r = ltcVar;
        this.s = qVar;
        this.t = ir4Var;
        this.u = gep0Var;
        this.v = bt4Var;
        this.w = new sqx(activity);
        Iterator it = shsVar.l.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Iterator it2 = ((shs.a) it.next()).f.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (((PromotionBackground) obj).a == PromotionBackground.Type.VIDEO) {
                        break;
                    }
                }
            }
            if (obj != null) {
                z = true;
                break;
            }
        }
        this.y = z;
        this.C = EmptyList.a;
    }

    @Override // defpackage.hz4
    public final void d() {
        tje.N(e(), null, null, new FullScreenBannerPresenter$clear$1(this, null), 3);
        pzt0 pzt0Var = this.B;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.B = null;
        shs shsVar = this.f;
        this.k.l(shsVar.b, shsVar.k);
        this.q.onDetach();
        super.d();
        BannerWidgets.OnCloseEffect onCloseEffect = this.x;
        if (onCloseEffect != null) {
            this.x = null;
            ((ru.yandex.taxi.communications.banners.a) this.v).a(onCloseEffect);
        }
    }

    public final void f() {
        ((eis) this.a).dismissWithAction();
    }

    public final PromotionBackground.Type g() {
        List list = this.C;
        PromotionBackground.Type type = PromotionBackground.Type.VIDEO;
        ir4 ir4Var = this.t;
        if (hr4.b(list, ir4Var, type) != null) {
            return type;
        }
        List list2 = this.C;
        PromotionBackground.Type type2 = PromotionBackground.Type.IMAGE;
        return hr4.b(list2, ir4Var, type2) != null ? type2 : PromotionBackground.Type.COLOR;
    }

    public final long h() {
        return this.j.a() - this.A;
    }
}
