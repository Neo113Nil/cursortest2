package defpackage;

import android.content.Context;
import android.net.Uri;
import com.yandex.go.payments.summary.domain.f;
import ru.yandex.taxi.communications.stories.domain.a;

/* loaded from: classes12.dex */
public final class uva extends h55 {
    public final /* synthetic */ int D;
    public final Object E;
    public final Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uva(gai gaiVar, x240 x240Var, d240 d240Var) {
        super(null);
        this.D = 7;
        this.E = gaiVar;
        this.F = x240Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        int i = this.D;
        int i2 = 2;
        int i3 = 1;
        Object obj2 = this.F;
        int i4 = 9;
        Object obj3 = this.E;
        switch (i) {
            case 0:
                rva rvaVar = ((sva) obj).a;
                A((m950) ((yvf0) obj3).get(), new wpc(new aqc(rvaVar != null ? rvaVar.a : null, rvaVar != null ? rvaVar.b : null, rvaVar != null ? rvaVar.c : null), i2), new tva(this, rvaVar, 0));
                break;
            case 1:
                A((uce0) obj3, (tce0) obj, new bb0(this, i2));
                break;
            case 2:
                A((a) obj3, (npu0) obj, new bb0(this, 13));
                break;
            case 3:
                A((ypc) obj3, (wpc) obj, new z36(this, i3));
                break;
            case 4:
                A((com.yandex.go.payments.delivery.navigation.a) obj3, (zhi) obj, new bb0(this, 28));
                break;
            case 5:
                kbr kbrVar = (kbr) obj;
                if (kbrVar.a.resolveActivity(((Context) obj3).getPackageManager()) != null) {
                    ((a60) ((y50) obj2)).b(kbrVar.a);
                    r(new qu(i4));
                    break;
                } else {
                    r(new qu(i4));
                    break;
                }
            case 6:
                A((a) obj3, (npu0) obj, new wui(this, 14));
                break;
            case 7:
                A((gai) obj3, (lbi) obj, new ou8(this, i3));
                break;
            case 8:
                il80 il80Var = (il80) obj;
                if (!(il80Var instanceof gl80)) {
                    if (!(il80Var instanceof hl80)) {
                        w511.b();
                        break;
                    } else {
                        ((com.yandex.go.places.impl.navigation.a) ((h3y) obj2).get()).a(((hl80) il80Var).a, kl80.a);
                    }
                } else {
                    hcc0 hcc0Var = (hcc0) ((gcc0) ((h3y) obj3).get());
                    hcc0Var.a();
                    hcc0Var.b(((gl80) il80Var).a, kl80.a);
                }
                r(new qu(i4));
                break;
            case 9:
                E((m950) ((yvf0) obj3).get(), (ydp) obj, new y01(this, 3), hxx.a);
                break;
            case 10:
                A((pvm) obj3, (qvm) obj, new lhd(this, 4));
                break;
            case 11:
                A((f) obj3, (ujv0) obj, new yio0(11, this));
                break;
            case 12:
                A((s0w0) obj3, (zy11) obj, new yio0(16, this));
                break;
            case 13:
                A((p2z0) obj3, (o2z0) obj, new yio0(21, this));
                break;
            default:
                tg41 tg41Var = (tg41) obj;
                if (!tg41Var.b) {
                    ((plf) ((yvf0) obj3).get()).a(Uri.parse(tg41Var.a));
                    r(new qu(i4));
                    break;
                } else {
                    A((m950) ((yvf0) obj2).get(), tg41Var, new h331(this, 5));
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uva(int i, Object obj, Object obj2) {
        super(null);
        this.D = i;
        this.E = obj;
        this.F = obj2;
    }
}
