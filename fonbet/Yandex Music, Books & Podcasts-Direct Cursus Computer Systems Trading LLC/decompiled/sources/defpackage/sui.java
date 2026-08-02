package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.t;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;
import ru.yandex.music.nonmusic.shelf.screen.MyShelfEntitiesScreenActivity;
import ru.yandex.music.search.SearchActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class sui extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sui(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((dvi) this.receiver).b.a.finish();
                break;
            case 1:
                xdr xdrVar = ((dvi) this.receiver).a.l;
                Boolean bool = Boolean.TRUE;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                break;
            case 2:
                t tVar = ((dvi) this.receiver).b.a;
                String string = tVar.getString(R.string.my_shelf_saved_entities_title);
                string.getClass();
                psi psiVar = new psi(string, ysi.b);
                int i = MyShelfEntitiesScreenActivity.Y;
                Intent putExtra = new Intent(tVar, (Class<?>) MyShelfEntitiesScreenActivity.class).putExtra("extra.activityParams", psiVar);
                putExtra.getClass();
                tVar.startActivity(putExtra);
                break;
            case 3:
                ((u8q) this.receiver).K();
                break;
            case 4:
                ((u8q) this.receiver).K();
                break;
            case 5:
                ((u8q) this.receiver).K();
                break;
            case 6:
                ((u8q) this.receiver).K();
                break;
            case 7:
                ((s3j) this.receiver).b.a.finish();
                break;
            case 8:
                ((s3j) this.receiver).b.a.finish();
                break;
            case 9:
                ((i5j) this.receiver).c();
                break;
            case 10:
                ((bc5) this.receiver).a();
                break;
            case 11:
                ((sai) this.receiver).a();
                break;
            case 12:
                w8j w8jVar = (w8j) this.receiver;
                oq oqVar = w8jVar.e;
                if (oqVar != null) {
                    w8jVar.b.b(wjb.TextScreen);
                    s8j s8jVar = w8jVar.c;
                    s8jVar.a();
                    qld.L(oqVar, (dy7) s8jVar.h.getValue(), s8jVar.d, pd.t(new qzm[0]), s8jVar.c);
                }
                break;
            case 13:
                w8j w8jVar2 = (w8j) this.receiver;
                oq oqVar2 = w8jVar2.e;
                if (oqVar2 != null) {
                    w8jVar2.c.a();
                    vbb vbbVar = (vbb) w8jVar2.g.getValue();
                    eca ecaVar = eca.d;
                    vbbVar.b(d51.o(oqVar2));
                }
                break;
            case 14:
                w8j w8jVar3 = (w8j) this.receiver;
                oq oqVar3 = w8jVar3.e;
                if (oqVar3 != null) {
                    w8jVar3.c.a();
                    vbb vbbVar2 = (vbb) w8jVar3.g.getValue();
                    eca ecaVar2 = eca.d;
                    eca o = d51.o(oqVar3);
                    vbbVar2.d.a(sjb.DeleteDownload);
                    ((taa) vbbVar2.a).c(o);
                }
                break;
            case 15:
                w8j w8jVar4 = (w8j) this.receiver;
                oq oqVar4 = w8jVar4.e;
                if (oqVar4 != null) {
                    w8jVar4.b.b(wjb.PodcastScreen);
                    s8j s8jVar2 = w8jVar4.c;
                    s8jVar2.a();
                    Context context = s8jVar2.b;
                    context.startActivity(quj.T(context, oqVar4, s8jVar2.e));
                }
                break;
            case 16:
                w8j w8jVar5 = (w8j) this.receiver;
                oq oqVar5 = w8jVar5.e;
                if (oqVar5 != null) {
                    w8jVar5.b.a(sjb.Share);
                    w8jVar5.c.a.d0(oqVar5);
                }
                break;
            case 17:
                w8j w8jVar6 = (w8j) this.receiver;
                if (w8jVar6.e != null) {
                    w8jVar6.c.a();
                    w8jVar6.b.a(sjb.MarkAsListened);
                    ((p0t) w8jVar6.a.h.getValue()).a(w8jVar6.b(), true);
                    ((h10) w8jVar6.f.getValue()).d(w8jVar6.b());
                }
                break;
            case 18:
                w8j w8jVar7 = (w8j) this.receiver;
                if (w8jVar7.e != null) {
                    w8jVar7.c.a();
                    w8jVar7.b.a(sjb.MarkAsUnlistened);
                    ((p0t) w8jVar7.a.h.getValue()).a(w8jVar7.b(), false);
                }
                break;
            case 19:
                w8j w8jVar8 = (w8j) this.receiver;
                oq oqVar6 = w8jVar8.e;
                if (oqVar6 != null) {
                    w8jVar8.c.a();
                    String t = weo.t();
                    w8jVar8.b.c(xlb.Next, t);
                    ((h10) w8jVar8.f.getValue()).b(t, oqVar6, w8jVar8.b());
                }
                break;
            case 20:
                w8j w8jVar9 = (w8j) this.receiver;
                oq oqVar7 = w8jVar9.e;
                if (oqVar7 != null) {
                    w8jVar9.c.a();
                    String t2 = weo.t();
                    w8jVar9.b.c(xlb.End, t2);
                    ((h10) w8jVar9.f.getValue()).a(t2, oqVar7, w8jVar9.b());
                }
                break;
            case 21:
                w8j w8jVar10 = (w8j) this.receiver;
                oq oqVar8 = w8jVar10.e;
                if (oqVar8 != null) {
                    w8jVar10.b.a(sjb.PlayOnDevice);
                    w8jVar10.c.a.c0(oqVar8);
                }
                break;
            case 22:
                w8j w8jVar11 = (w8j) this.receiver;
                oq oqVar9 = w8jVar11.e;
                if (oqVar9 != null) {
                    w8jVar11.b.a(sjb.Like);
                    yab yabVar = (yab) w8jVar11.a.m.getValue();
                    yabVar.getClass();
                    t3g a = yabVar.a();
                    a.getClass();
                    x97.y(a.a, null, null, new r3g(a, oqVar9, null), 3);
                    qld.I(10L, w8jVar11.c.f);
                }
                break;
            case 23:
                w8j w8jVar12 = (w8j) this.receiver;
                oq oqVar10 = w8jVar12.e;
                if (oqVar10 != null) {
                    w8jVar12.b.a(sjb.Unlike);
                    yab yabVar2 = (yab) w8jVar12.a.m.getValue();
                    yabVar2.getClass();
                    t3g a2 = yabVar2.a();
                    a2.getClass();
                    x97.y(a2.a, null, null, new r3g(a2, oqVar10, null), 3);
                    qld.I(10L, w8jVar12.c.f);
                }
                break;
            case 24:
                w8j w8jVar13 = (w8j) this.receiver;
                oq oqVar11 = w8jVar13.e;
                s8j s8jVar3 = w8jVar13.c;
                if (oqVar11 != null) {
                    if (((lwc) w8jVar13.a.i.getValue()).a()) {
                        v7g.L(s8jVar3.b, new lik(vik.f, null, null));
                    } else {
                        s8jVar3.a();
                        vbb vbbVar3 = (vbb) w8jVar13.g.getValue();
                        eca ecaVar3 = eca.d;
                        vbbVar3.a(d51.o(oqVar11), new sui(0, s8jVar3, s8j.class, "showConnectivityError", "showConnectivityError()V", 0, 25));
                    }
                }
                break;
            case 25:
                s8j s8jVar4 = (s8j) this.receiver;
                hld.I(s8jVar4.b, (z66) s8jVar4.g.getValue());
                break;
            case 26:
                Object value = ((r8j) this.receiver).u.getValue();
                value.getClass();
                break;
            case 27:
                ((k9j) ((l9j) this.receiver).d.b).requireActivity().getOnBackPressedDispatcher().d();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                i35 i35Var = ((l9j) this.receiver).c;
                switch (i35Var.a) {
                    case 0:
                        t tVar2 = i35Var.b;
                        int i2 = SearchActivity.Z;
                        tVar2.startActivity(rvf.F(tVar2, c0p.c, p0p.u));
                        break;
                    default:
                        t tVar3 = i35Var.b;
                        int i3 = SearchActivity.Z;
                        tVar3.startActivity(rvf.F(tVar3, c0p.c, p0p.t));
                        break;
                }
                break;
            default:
                l9j l9jVar = (l9j) this.receiver;
                l9jVar.a.a(l9jVar.h, new kef(1, l9jVar.b, v9j.class, "onFilterItemClick", "onFilterItemClick(Lcom/yandex/music/design/components/bottomsheet/filterbottomsheet/FilterBottomSheetItem;)V", 0, 17));
                break;
        }
        return Unit.a;
    }
}
