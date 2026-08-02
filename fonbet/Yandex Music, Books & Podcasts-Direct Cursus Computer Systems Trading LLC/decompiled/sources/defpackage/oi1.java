package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.a;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.pulse.metrics.o;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.catalog.album.screen.AlbumScreenActivity;
import ru.yandex.music.catalog.artist.ArtistItemsActivity;
import ru.yandex.music.payment.tariffpaywall.TariffPaywallActivity;
import ru.yandex.music.search.SearchActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class oi1 extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oi1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String a;
        int i = 14;
        int i2 = 2;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                ((yi1) this.receiver).b();
                break;
            case 1:
                ((yi1) this.receiver).e();
                break;
            case 2:
                ((yi1) this.receiver).d();
                break;
            case 3:
                ((np2) ((zh1) this.receiver).a.b).finish();
                break;
            case 4:
                ne1 ne1Var = (ne1) this.receiver;
                rmb.j(ne1Var.d, wjb.ArtistTrackListScreen, null, null, 14);
                me1 me1Var = ne1Var.e;
                u51 u51Var = ne1Var.a;
                u51Var.getClass();
                int i3 = ArtistItemsActivity.Y;
                Context context = me1Var.b;
                context.getClass();
                context.startActivity(kg5.z(context, u51Var, zb1.b));
                break;
            case 5:
                sk1 sk1Var = (sk1) this.receiver;
                o43 o43Var = sk1Var.b.g.e;
                if (o43Var != null && (a = o43Var.a()) != null) {
                    rmb.k(sk1Var.c, a, null, null, 6);
                    w1g.y(sk1Var.d.a, a, true);
                }
                break;
            case 6:
                ((ml1) this.receiver).b.getOnBackPressedDispatcher().d();
                break;
            case 7:
                em1 em1Var = ((ml1) this.receiver).a;
                em1Var.p = true;
                em1Var.r.h();
                break;
            case 8:
                ((ml1) this.receiver).a.r.i();
                break;
            case 9:
                ml1 ml1Var = (ml1) this.receiver;
                ml1Var.getClass();
                String t = weo.t();
                if (!((Boolean) ml1Var.j.getValue()).booleanValue()) {
                    nsh nshVar = ml1Var.d;
                    t.getClass();
                    nmb nmbVar = (nmb) nshVar.d;
                    wjb wjbVar = wjb.TrackListScreen;
                    pkb pkbVar = pkb.Artist;
                    String str = (String) nshVar.b;
                    nmb.z(nmbVar, ((fnb) nshVar.c).G(), wjbVar, null, pkbVar, str, null, 0, false, "header", "header", 0, "artist", str, 0, t, 52452);
                }
                ml1Var.a.n.h(t);
                break;
            case 10:
                ((bz1) ((dz1) this.receiver).b.b).requireActivity().getOnBackPressedDispatcher().d();
                break;
            case 11:
                t tVar = ((dz1) this.receiver).c.a;
                int i4 = SearchActivity.Z;
                tVar.startActivity(rvf.F(tVar, c0p.c, p0p.x));
                break;
            case 12:
                kz1 kz1Var = ((dz1) this.receiver).a;
                kz1Var.getClass();
                x97.y(ot0.F(kz1Var), null, null, new hl(kz1Var, continuation, i), 3);
                break;
            case 13:
                le3 le3Var = ((dz1) this.receiver).b;
                bz1 bz1Var = (bz1) le3Var.b;
                y supportFragmentManager = bz1Var.requireActivity().getSupportFragmentManager();
                supportFragmentManager.getClass();
                a aVar = new a(supportFragmentManager);
                aVar.c(null);
                int i5 = bz1Var.requireArguments().getInt("arg_container_id");
                o15 o15Var = (o15) le3Var.a;
                o15Var.getClass();
                k9j k9jVar = new k9j();
                k9jVar.setArguments(cxb.K(new Pair("arg_collection_non_music_type", o15Var)));
                aVar.e(i5, k9jVar, null);
                aVar.j();
                break;
            case 14:
                le3 le3Var2 = ((dz1) this.receiver).b;
                bz1 bz1Var2 = (bz1) le3Var2.b;
                y supportFragmentManager2 = bz1Var2.requireActivity().getSupportFragmentManager();
                supportFragmentManager2.getClass();
                a aVar2 = new a(supportFragmentManager2);
                aVar2.c(null);
                int i6 = bz1Var2.requireArguments().getInt("arg_container_id");
                o15 o15Var2 = (o15) le3Var2.a;
                o15Var2.getClass();
                ldj ldjVar = new ldj();
                ldjVar.setArguments(cxb.K(new Pair("arg_collection_non_music_type", o15Var2)));
                aVar2.e(i6, ldjVar, null);
                aVar2.j();
                break;
            case 15:
                ((q32) this.receiver).b.a.getOnBackPressedDispatcher().d();
                break;
            case 16:
                rx2 rx2Var = (rx2) this.receiver;
                rx2Var.getClass();
                ot0.A(gw2.b.e(), "BatteryRestrictionsDialog", tah.b(new Pair("type", "Close dialog")));
                rx2Var.e.getClass();
                break;
            case 17:
                rx2 rx2Var2 = (rx2) this.receiver;
                rx2Var2.getClass();
                ot0.A(gw2.b.e(), "BatteryRestrictionsDialog", tah.b(new Pair("type", "Close dialog")));
                rx2Var2.e.getClass();
                break;
            case 18:
                rx2 rx2Var3 = (rx2) this.receiver;
                Intent c = rx2Var3.b.a.c(rx2Var3.a);
                rx2Var3.f.a();
                ot0.A(gw2.b.e(), "BatteryRestrictionsDialog", tah.b(new Pair("type", "Instruction button")));
                x97.y(rx2Var3.d, dm6.b, null, new cs1(rx2Var3, c, continuation, 7), 2);
                break;
            case 19:
                rx2 rx2Var4 = (rx2) this.receiver;
                rx2Var4.f.a();
                ot0.A(gw2.b.e(), "BatteryRestrictionsDialog", tah.b(new Pair("type", "Instruction button")));
                x97.y(rx2Var4.d, dm6.b, null, new qx2(rx2Var4, continuation, 0), 2);
                break;
            case 20:
                rx2 rx2Var5 = (rx2) this.receiver;
                rx2Var5.f.a();
                ot0.A(gw2.b.e(), "BatteryRestrictionsDialog", tah.b(new Pair("type", "Support button")));
                x97.y(rx2Var5.d, dm6.b, null, new qx2(rx2Var5, continuation, i2), 2);
                break;
            case 21:
                ((va3) this.receiver).a.j();
                break;
            case 22:
                ((va3) this.receiver).a.k();
                break;
            case 23:
                ce5 ce5Var = ((va3) this.receiver).a;
                ((icj) ce5Var.b).y(new kv4(8, ce5Var));
                break;
            case 24:
                ((v83) this.receiver).d.B();
                break;
            case 25:
                t tVar2 = ((v83) this.receiver).c.a;
                int i7 = SearchActivity.Z;
                tVar2.startActivity(rvf.F(tVar2, c0p.b, p0p.q));
                break;
            case 26:
                v83 v83Var = (v83) this.receiver;
                v83Var.a.a(v83Var.j, new m5(1, v83Var.b, x83.class, "onFilterItemClick", "onFilterItemClick(Lcom/yandex/music/design/components/bottomsheet/filterbottomsheet/FilterBottomSheetItem;)V", 0, 24));
                break;
            case 27:
                ((va3) this.receiver).a.h();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ce5 ce5Var2 = ((va3) this.receiver).a;
                rmb.j((rmb) ce5Var2.h, wjb.BottomsheetScreen, null, null, 14);
                ((qbj) ce5Var2.c).b((oq) ce5Var2.e);
                break;
            default:
                va3 va3Var = (va3) this.receiver;
                rmb.j(va3Var.g, wjb.PaywallScreen, va3Var.h, null, 12);
                qbj qbjVar = va3Var.c;
                lik likVar = va3Var.d.a;
                qbjVar.getClass();
                likVar.getClass();
                AlbumScreenActivity albumScreenActivity = qbjVar.a;
                albumScreenActivity.getClass();
                int i8 = TariffPaywallActivity.z;
                albumScreenActivity.startActivity(dml.b(albumScreenActivity, likVar));
                break;
        }
        return Unit.a;
    }
}
