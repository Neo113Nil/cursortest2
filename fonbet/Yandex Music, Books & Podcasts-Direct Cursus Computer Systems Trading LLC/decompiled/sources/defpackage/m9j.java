package defpackage;

import android.content.Context;
import android.os.Parcelable;
import androidx.fragment.app.a;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;
import ru.yandex.music.catalog.album.screen.AlbumScreenActivity;
import ru.yandex.music.phonoteka.mymusic.CollectionMainActivity;
import ru.yandex.music.search.SearchActivity;
import ru.yandex.music.settings.SettingsActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class m9j extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9j(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        qpj onBackPressedDispatcher;
        int i = 18;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                v9j v9jVar = ((l9j) this.receiver).b;
                v9jVar.getClass();
                x97.y(ot0.F(v9jVar), null, null, new m1i(v9jVar, continuation, 15), 3);
                break;
            case 1:
                ((wdj) this.receiver).a();
                break;
            case 2:
                ((wdj) this.receiver).d();
                break;
            case 3:
                ((wdj) this.receiver).e();
                break;
            case 4:
                Context context = ((ebj) this.receiver).c.a;
                int i2 = SearchActivity.Z;
                context.startActivity(rvf.E(context, c0p.b));
                break;
            case 5:
                t tVar = ((ebj) this.receiver).c.b;
                if (tVar != null && (onBackPressedDispatcher = tVar.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher.d();
                }
                break;
            case 6:
                ((ebj) this.receiver).b.S();
                break;
            case 7:
                ((AlbumScreenActivity) this.receiver).z();
                break;
            case 8:
                ncj ncjVar = (ncj) this.receiver;
                mqs mqsVar = ncjVar.a;
                ncjVar.b.b(u2x.K(mqsVar.d) ? wjb.PodcastScreen : wjb.AudiobookScreen);
                mcj mcjVar = ncjVar.c;
                Context context2 = mcjVar.b;
                mcjVar.d.invoke();
                if (mqsVar.k != dg2.c || ((m8w) mcjVar.g).b(mqsVar)) {
                    Parcelable.Creator<oq> creator = oq.CREATOR;
                    context2.startActivity(quj.T(context2, cxb.O(mqsVar), mcjVar.c));
                } else {
                    context2.getClass();
                    hag.x(context2, R.string.track_no_rights_title, 0);
                }
                break;
            case 9:
                ncj ncjVar2 = (ncj) this.receiver;
                ncjVar2.b.b(wjb.TextScreen);
                mcj mcjVar2 = ncjVar2.c;
                mqs mqsVar2 = ncjVar2.a;
                mqsVar2.getClass();
                mcjVar2.d.invoke();
                rre.a0(mqsVar2, mcjVar2.e, mcjVar2.h.a, pd.t(new qzm[0]), mcjVar2.f, true);
                break;
            case 10:
                ((wdj) this.receiver).a();
                break;
            case 11:
                ((wdj) this.receiver).d();
                break;
            case 12:
                ((wdj) this.receiver).e();
                break;
            case 13:
                ((ldj) ((mdj) this.receiver).d.a).requireActivity().getOnBackPressedDispatcher().d();
                break;
            case 14:
                dw4 dw4Var = ((mdj) this.receiver).c;
                switch (dw4Var.a) {
                    case 0:
                        t tVar2 = dw4Var.b;
                        int i3 = SearchActivity.Z;
                        tVar2.startActivity(rvf.F(tVar2, c0p.c, p0p.s));
                        break;
                    default:
                        t tVar3 = dw4Var.b;
                        int i4 = SearchActivity.Z;
                        tVar3.startActivity(rvf.F(tVar3, c0p.c, p0p.r));
                        break;
                }
                break;
            case 15:
                mdj mdjVar = (mdj) this.receiver;
                mdjVar.a.a(mdjVar.l, new kef(1, mdjVar.b, udj.class, "onFilterItemClick", "onFilterItemClick(Lcom/yandex/music/design/components/bottomsheet/filterbottomsheet/FilterBottomSheetItem;)V", 0, 20));
                break;
            case 16:
                udj udjVar = ((mdj) this.receiver).b;
                udjVar.getClass();
                x97.y(ot0.F(udjVar), null, null, new m1i(udjVar, continuation, i), 3);
                break;
            case 17:
                ((sai) this.receiver).a();
                break;
            case 18:
                eqp eqpVar = (eqp) this.receiver;
                tnb.d(eqpVar.c.a(), wjb.SettingsAutoDownloadScreen);
                t tVar4 = eqpVar.b.a;
                int i5 = CollectionMainActivity.v0;
                tVar4.startActivity(men.B(tVar4, v35.l));
                break;
            case 19:
                eqp eqpVar2 = (eqp) this.receiver;
                tnb.d(eqpVar2.c.a(), wjb.SettingsClearMemoryScreen);
                t tVar5 = eqpVar2.b.a;
                SettingsActivity settingsActivity = tVar5 instanceof SettingsActivity ? (SettingsActivity) tVar5 : null;
                if (settingsActivity != null) {
                    lpp lppVar = new lpp();
                    y supportFragmentManager = settingsActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    a aVar = new a(supportFragmentManager);
                    aVar.c(null);
                    aVar.e(settingsActivity.Y, lppVar, null);
                    aVar.j();
                }
                break;
            case 20:
                eqp eqpVar3 = (eqp) this.receiver;
                jsp jspVar = eqpVar3.d;
                xdr xdrVar = eqpVar3.v;
                bml bmlVar = new bml(1, (n8q) eqpVar3.t.getValue(), n8q.class, "switchCacheRoot", "switchCacheRoot(Lcom/yandex/music/shared/player/api/StorageRoot;)V", 0, 27);
                jspVar.getClass();
                xdrVar.getClass();
                t tVar6 = jspVar.a;
                cvo cvoVar = cvo.i;
                fxf.P(tVar6, o6m.b(wjb.SettingsStorageSelectorScreen, null, 6), null, pd.t(new qzm[0]), null, new wn5(new jv(i, xdrVar, bmlVar), 164068662, true), 22);
                break;
            case 21:
                ((jmj) this.receiver).f();
                break;
            case 22:
                ((jmj) this.receiver).d();
                break;
            case 23:
                ((jmj) this.receiver).b();
                break;
            case 24:
                ((jmj) this.receiver).b();
                break;
            case 25:
                ((jmj) this.receiver).f();
                break;
            case 26:
                ((jmj) this.receiver).d();
                break;
            case 27:
                ((qpj) this.receiver).f();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((qpj) this.receiver).f();
                break;
            default:
                arj arjVar = ((orj) this.receiver).a;
                y supportFragmentManager2 = arjVar.a.getSupportFragmentManager();
                supportFragmentManager2.getClass();
                supportFragmentManager2.e0(cxb.J(), "EntryScreenCloseOnboardingKey");
                ((vni) arjVar.b.a).a();
                break;
        }
        return Unit.a;
    }
}
