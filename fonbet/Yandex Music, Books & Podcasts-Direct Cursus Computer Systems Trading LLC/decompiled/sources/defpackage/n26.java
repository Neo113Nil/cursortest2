package defpackage;

import android.content.Context;
import androidx.fragment.app.y;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.common.media.context.CardPlaybackScope;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes5.dex */
public final class n26 extends m18 {
    public final Context b;
    public final y c;
    public final ri1 d;
    public final kxi e;
    public final a3 f;
    public final jyr g;
    public final jyr h;

    public n26(Context context, y yVar, ri1 ri1Var, kxi kxiVar, a3 a3Var) {
        context.getClass();
        yVar.getClass();
        kxiVar.getClass();
        this.b = context;
        this.c = yVar;
        this.d = ri1Var;
        this.e = kxiVar;
        this.f = a3Var;
        bdt I = hag.I(e.class);
        l18 l18Var = l18.b;
        this.g = l18Var.b(I, true);
        this.h = l18Var.b(hag.I(z5l.class), true);
    }

    @Override // defpackage.ag5
    public final void b(mqs mqsVar) {
        mqsVar.getClass();
        int ordinal = ((ezb) l18.b.b(hag.I(ezb.class), true).getValue()).a().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                b6e.s();
                return;
            } else if (mqsVar.i() != null) {
                return;
            }
        }
        rre.Z(mqsVar, zus.b, y5g.B0(mqsVar, ryt.a), new ve(muo.CONCERT, zqt.d), this.b, this.c, this.e, d.x("ARTIST_POPULAR_TRACKS"), null, null, null, 1792);
    }

    @Override // defpackage.ag5
    public final void d(mqs mqsVar) {
        u51 O;
        mqsVar.getClass();
        String t = weo.t();
        List list = mqsVar.f;
        if (list.size() == 1) {
            O = ghh.O((zp2) list.get(0));
        } else {
            List list2 = (List) this.d.invoke();
            Set A0 = CollectionsKt.A0(list);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                A0 = CollectionsKt.U(A0, CollectionsKt.A0(((mqs) it.next()).f));
                if (A0.size() < 2) {
                    break;
                }
            }
            zp2 zp2Var = (zp2) CollectionsKt.R(A0);
            if (zp2Var == null && (zp2Var = (zp2) CollectionsKt.S(list, 0)) == null) {
                zp2Var = zp2.k;
            }
            O = ghh.O(zp2Var);
        }
        CardPlaybackScope x = d.x("ARTIST_POPULAR_TRACKS");
        ((e) this.g.getValue()).getClass();
        c e = x.e(O);
        jyr jyrVar = this.h;
        if (!((z5l) jyrVar.getValue()).c(e, mqsVar, false)) {
            a0g.G(this.b, mqsVar, new ye(this, t, e, mqsVar, 12));
        } else if (((z5l) jyrVar.getValue()).i(false)) {
            this.f.invoke(mqsVar, t);
        }
    }
}
