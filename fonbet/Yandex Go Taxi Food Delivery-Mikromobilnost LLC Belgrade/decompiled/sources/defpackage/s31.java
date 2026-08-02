package defpackage;

import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Point;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.fragment.preorder.AddressMapFragment;
import ru.yandex.taxi.map.overlay.pickup.d;
import ru.yandex.taxi.preorder.source.pickup.PickupPointAnalytics$PointType;
import ru.yandex.taxi.preorder.source.pickup.a;

/* loaded from: classes5.dex */
public final class s31 {
    public final a a;
    public final d b;
    public final ypb0 c;
    public final tb1 d;
    public final AddressResolveRepository e;
    public final ah00 f;
    public final tt2 g;
    public final s0c0 h;
    public final hbm i;
    public wpb0 j;
    public hbp0 k;
    public kx0 l;
    public kx0 m;
    public PickupPointAnalytics$PointType n = PickupPointAnalytics$PointType.SOURCE;

    public s31(a aVar, d dVar, ypb0 ypb0Var, tb1 tb1Var, AddressResolveRepository addressResolveRepository, ah00 ah00Var, tt2 tt2Var, s0c0 s0c0Var, hbm hbmVar) {
        this.a = aVar;
        this.b = dVar;
        this.c = ypb0Var;
        this.d = tb1Var;
        this.e = addressResolveRepository;
        this.f = ah00Var;
        this.g = tt2Var;
        this.h = s0c0Var;
        this.i = hbmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        ScreenRect screenRect;
        a aVar = this.a;
        aVar.getClass();
        ah00 ah00Var = this.f;
        boolean b = a.b(ah00Var);
        AddressResolveRepository addressResolveRepository = this.e;
        d dVar = this.b;
        if (!b) {
            dVar.Ig();
            dVar.Lg(null);
            addressResolveRepository.a(false);
            return;
        }
        y4 y4Var = new y4(23, this);
        gmb0 c = aVar.o.c();
        c.getClass();
        aVar.o = new emb0(c, y4Var);
        gh00 gh00Var = (gh00) ah00Var;
        zzs b2 = gh00Var.e.b();
        wpb0 h = aVar.h(ah00Var, b2, false);
        dVar.Ng(h);
        kx0 kx0Var = this.l;
        if (kx0Var != null) {
            screenRect = AddressMapFragment.setupPickupPoints$lambda$0(kx0Var.b);
            dVar.A.j = screenRect;
        }
        kx0 kx0Var2 = this.m;
        boolean booleanValue = kx0Var2 != null ? ((Boolean) kx0Var2.invoke()).booleanValue() : false;
        if (h == null || !booleanValue) {
            dVar.Mg();
        } else {
            dVar.Jg(h);
        }
        if (h != null) {
            zzs zzsVar = h.b;
            gh00Var.getClass();
            if (gh00Var.f(new Point(b2.a, b2.b), ru.yandex.taxi.map.utils.a.F(zzsVar)) < 1.0d) {
                z = true;
                wpb0 wpb0Var = z ? h : null;
                dVar.Lg(wpb0Var);
                dVar.Pg(aVar.o);
                addressResolveRepository.a(wpb0Var != null);
                String str = aVar.j;
                if (z || str == null || jl40.l(h, this.j)) {
                    return;
                }
                int hashCode = str.hashCode();
                if (hashCode != -607398952) {
                    if (hashCode != 114595) {
                        if (hashCode != 3091764 || !str.equals("drag")) {
                            return;
                        }
                    } else if (!str.equals("tap")) {
                        return;
                    }
                } else if (!str.equals("label_tap")) {
                    return;
                }
                this.c.a(h, this.n, str);
                this.j = h;
                return;
            }
        }
        z = false;
        if (z) {
        }
        dVar.Lg(wpb0Var);
        dVar.Pg(aVar.o);
        addressResolveRepository.a(wpb0Var != null);
        String str2 = aVar.j;
        if (z) {
        }
    }
}
