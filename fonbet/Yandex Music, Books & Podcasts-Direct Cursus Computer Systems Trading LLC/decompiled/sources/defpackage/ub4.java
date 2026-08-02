package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.t;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.common.media.context.CardPlaybackScope;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.profile.ProfileActivity;
import ru.yandex.music.search.SearchActivity;
import ru.yandex.music.settings.SettingsActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class ub4 extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ub4(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 4;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (this.a) {
            case 0:
                xiu xiuVar = ((vb4) this.receiver).a;
                ef3.g(ef3.b, muo.MY_PLAYLISTS, df3.PLAYLIST_BOTTOMSHEET, pe3.DELETE_COVER);
                ((ub4) xiuVar.b).invoke();
                ((iz7) ((xzi) xiuVar.c).a).g();
                break;
            case 1:
                ((sai) this.receiver).a();
                break;
            case 2:
                ((bg5) this.receiver).a();
                break;
            case 3:
                ((bg5) this.receiver).d();
                break;
            case 4:
                ((bg5) this.receiver).e();
                break;
            case 5:
                eg4 eg4Var = (eg4) this.receiver;
                eg4Var.a.e.d(-1, -1, eg4Var.c);
                kkp kkpVar = eg4Var.b;
                int i2 = PlaylistScreenActivity.B0;
                Context context = (Context) kkpVar.b;
                CardPlaybackScope p = d.p((nrf) kkpVar.d);
                context.getClass();
                context.startActivity(dxl.j(context, fxl.a, cud.a, p, null, 112));
                break;
            case 6:
                ((fi4) this.receiver).d();
                break;
            case 7:
                ((fi4) this.receiver).d();
                break;
            case 8:
                ((tt4) this.receiver).d();
                break;
            case 9:
                ((tt4) this.receiver).f();
                break;
            case 10:
                ((st4) this.receiver).f();
                break;
            case 11:
                ((pu4) this.receiver).c.a.getOnBackPressedDispatcher().d();
                break;
            case 12:
                pu4 pu4Var = (pu4) this.receiver;
                pu4Var.a.a(pu4Var.g, new mt4(1, pu4Var.b, ru4.class, "onFilterItemClick", "onFilterItemClick(Lcom/yandex/music/design/components/bottomsheet/filterbottomsheet/FilterBottomSheetItem;)V", 0, 1));
                break;
            case 13:
                pu4 pu4Var2 = (pu4) this.receiver;
                rmb.j(pu4Var2.d, wjb.SearchScreen, null, null, 14);
                t tVar = pu4Var2.c.a;
                np2 np2Var = tVar instanceof np2 ? (np2) tVar : null;
                rf3 J = np2Var != null ? np2Var.l().J() : null;
                int i3 = SearchActivity.Z;
                tVar.startActivity(rvf.F(tVar, rvf.x(J), p0p.k));
                break;
            case 14:
                ru4 ru4Var = ((pu4) this.receiver).b;
                ru4Var.getClass();
                x97.y(ot0.F(ru4Var), null, null, new ja4(ru4Var, objArr == true ? 1 : 0, i), 3);
                break;
            case 15:
                ((tv4) this.receiver).c.a.getOnBackPressedDispatcher().d();
                break;
            case 16:
                tv4 tv4Var = (tv4) this.receiver;
                tv4Var.a.a(tv4Var.i, new mt4(1, tv4Var.b, xv4.class, "onFilterItemClick", "onFilterItemClick(Lcom/yandex/music/design/components/bottomsheet/filterbottomsheet/FilterBottomSheetItem;)V", 0, 2));
                break;
            case 17:
                t tVar2 = ((tv4) this.receiver).c.a;
                int i4 = SearchActivity.Z;
                tVar2.startActivity(rvf.F(tVar2, c0p.c, p0p.l));
                break;
            case 18:
                eqp eqpVar = (eqp) this.receiver;
                tnb.d(eqpVar.c.a(), wjb.Link);
                t tVar3 = eqpVar.b.a;
                String b = g3o.b(R.string.settings_import_track_raw_link);
                b.getClass();
                w1g.y(tVar3, b, true);
                break;
            case 19:
                ((sai) this.receiver).a();
                break;
            case 20:
                yz4 yz4Var = (yz4) this.receiver;
                yz4Var.getClass();
                x97.y(ot0.F(yz4Var), null, null, new vz4(yz4Var, objArr2 == true ? 1 : 0, i), 3);
                break;
            case 21:
                yz4 yz4Var2 = ((jz4) this.receiver).a;
                rhp rhpVar = yz4Var2.q;
                rar y = x97.y(ot0.F(yz4Var2), null, null, new vz4(yz4Var2, objArr3 == true ? 1 : 0, 5), 3);
                rhpVar.getClass();
                rhpVar.c(y);
                break;
            case 22:
                jz4 jz4Var = (jz4) this.receiver;
                tnb.d((tnb) jz4Var.g.c.getValue(), wjb.ProfileScreen);
                t tVar4 = jz4Var.b.a;
                int i5 = ProfileActivity.w0;
                tVar4.startActivity(new Intent(tVar4, (Class<?>) ProfileActivity.class));
                break;
            case 23:
                jz4 jz4Var2 = (jz4) this.receiver;
                tnb.d((tnb) jz4Var2.g.c.getValue(), wjb.SettingsScreen);
                t tVar5 = jz4Var2.b.a;
                SettingsActivity.v0.getClass();
                tVar5.startActivity(cpp.a(tVar5, null));
                break;
            case 24:
                jz4 jz4Var3 = (jz4) this.receiver;
                tnb.d((tnb) jz4Var3.g.c.getValue(), wjb.SearchScreen);
                t tVar6 = jz4Var3.b.a;
                int i6 = SearchActivity.Z;
                tVar6.startActivity(rvf.F(tVar6, c0p.c, p0p.a));
                break;
            case 25:
                v25 v25Var = (v25) this.receiver;
                xbc xbcVar = v25Var.a;
                o0s o0sVar = (o0s) v25Var.g.getValue();
                if (o0sVar != null) {
                    int ordinal = o0sVar.ordinal();
                    if (ordinal == 0) {
                        xbcVar.a(v25Var.h, new mt4(1, v25Var.b, d35.class, "onOwnFilterItemClick", "onOwnFilterItemClick(Lcom/yandex/music/design/components/bottomsheet/filterbottomsheet/FilterBottomSheetItem;)V", 0, 4));
                    } else if (ordinal != 1) {
                        b6e.s();
                        break;
                    } else {
                        xbcVar.a(v25Var.i, new mt4(1, v25Var.b, d35.class, "onLikedFilterItemClick", "onLikedFilterItemClick(Lcom/yandex/music/design/components/bottomsheet/filterbottomsheet/FilterBottomSheetItem;)V", 0, 5));
                    }
                }
                break;
            case 26:
                v25 v25Var2 = (v25) this.receiver;
                yk3 yk3Var = v25Var2.d;
                ((pwl) yk3Var.d).a(((cvo) yk3Var.b).a(), wjb.SearchScreen);
                t tVar7 = v25Var2.c.a;
                int i7 = SearchActivity.Z;
                tVar7.startActivity(rvf.F(tVar7, c0p.c, p0p.m));
                break;
            case 27:
                ((v25) this.receiver).c.a.getOnBackPressedDispatcher().d();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((v25) this.receiver).a();
                break;
            default:
                ((v25) this.receiver).a();
                break;
        }
        return Unit.a;
    }
}
