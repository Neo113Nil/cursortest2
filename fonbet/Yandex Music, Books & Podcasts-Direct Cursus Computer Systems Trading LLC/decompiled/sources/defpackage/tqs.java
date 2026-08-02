package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.y;
import com.yandex.music.shared.playback.utils.api.commands.SkipCommand;
import com.yandex.passport.sloth.ui.dependencies.m;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;
import ru.yandex.music.support.complaint.ComplaintActivity;

/* loaded from: classes4.dex */
public final /* synthetic */ class tqs implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ brs b;
    public final /* synthetic */ mqs c;

    public /* synthetic */ tqs(brs brsVar, mqs mqsVar, int i) {
        this.a = i;
        this.b = brsVar;
        this.c = mqsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v31, types: [mqs] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        n7q n7qVar;
        mwk b;
        Continuation continuation = null;
        continuation = null;
        continuation = null;
        switch (this.a) {
            case 0:
                brs brsVar = this.b;
                mqs mqsVar = this.c;
                ef3 ef3Var = ef3.b;
                muo muoVar = brsVar.g;
                m mVar = brsVar.d;
                if (muoVar == null) {
                    muoVar = muo.UNKNOWN;
                }
                ef3.g(ef3Var, muoVar, brs.j(mqsVar), pe3.TRACK_INFO);
                brsVar.l.y().b(wjb.TextScreen);
                mVar.e();
                ((Function0) mVar.c).invoke();
                kt6 kt6Var = (kt6) ((jyr) mVar.i).getValue();
                y yVar = (y) mVar.e;
                pu0 t = pd.t(new qzm[0]);
                kt6Var.getClass();
                yVar.getClass();
                cvo cvoVar = cvo.i;
                e3s.X(o6m.b(wjb.DescriptionScreen, new avo(pkb.Track, mqsVar.a), 2), yVar, "TRACK_INFO_DIALOG_TAG", null, null, new wn5(new aqp(8, t, kt6Var, mqsVar), -319012280, true), 56);
                break;
            case 1:
                brs brsVar2 = this.b;
                mqs mqsVar2 = this.c;
                ef3 ef3Var2 = ef3.b;
                muo muoVar2 = brsVar2.g;
                m mVar2 = brsVar2.d;
                if (muoVar2 == null) {
                    muoVar2 = muo.UNKNOWN;
                }
                ef3.g(ef3Var2, muoVar2, brs.j(mqsVar2), pe3.LYRICS);
                if (!((lwc) brsVar2.x.getValue()).a()) {
                    mVar2.e();
                    brsVar2.l.C(sjb.Lyrics);
                    ((Function0) mVar2.c).invoke();
                    i1h i1hVar = (i1h) ((jyr) mVar2.h).getValue();
                    y yVar2 = (y) mVar2.e;
                    pu0 t2 = pd.t(new qzm[0]);
                    i1hVar.getClass();
                    yVar2.getClass();
                    cvo cvoVar2 = cvo.i;
                    e3s.X(o6m.b(wjb.BottomsheetScreen, new avo(pkb.Track, mqsVar2.a), 2), yVar2, "TRACK_LYRICS_BOTTOM_SHEET_DIALOG_TAG", null, null, new wn5(new vtb(10, t2, i1hVar, mqsVar2), 1208299711, true), 56);
                    break;
                } else {
                    v7g.L((Context) mVar2.d, new lik(vik.f, null, null));
                    break;
                }
            case 2:
                brs brsVar3 = this.b;
                mqs mqsVar3 = this.c;
                ef3 ef3Var3 = ef3.b;
                muo muoVar3 = brsVar3.g;
                m mVar3 = brsVar3.d;
                if (muoVar3 == null) {
                    muoVar3 = muo.UNKNOWN;
                }
                ef3.g(ef3Var3, muoVar3, brs.j(mqsVar3), pe3.ADD_TO_PLAYLIST);
                mVar3.e();
                brsVar3.l.C(sjb.AddToPlaylist);
                y yVar3 = (y) mVar3.e;
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                if (((nf3) ((byb) qdcVar.C(I)).b(nf3.class)).h()) {
                    new nsh((yk) ((jyr) mVar3.k).getValue(), pd.t(new qzm[0]), yVar3).T(mqsVar3);
                } else {
                    v7f v7fVar = new v7f();
                    v7fVar.l = mqsVar3;
                    yVar3.getClass();
                    x7f.B(v7fVar, yVar3, "ADD_TO_PLAYLIST_DIALOG");
                }
                break;
            case 3:
                brs brsVar4 = this.b;
                mqs mqsVar4 = this.c;
                ef3 ef3Var4 = ef3.b;
                muo muoVar4 = brsVar4.g;
                if (muoVar4 == null) {
                    muoVar4 = muo.UNKNOWN;
                }
                ef3.g(ef3Var4, muoVar4, brs.j(mqsVar4), pe3.UNBAN);
                brsVar4.l.C(sjb.Undislike);
                brsVar4.d.f();
                jyr jyrVar = ols.a;
                ols.c(brsVar4.e);
                brsVar4.n().A(mqsVar4);
                break;
            case 4:
                brs brsVar5 = this.b;
                mqs mqsVar5 = this.c;
                ef3 ef3Var5 = ef3.b;
                muo muoVar5 = brsVar5.g;
                if (muoVar5 == null) {
                    muoVar5 = muo.UNKNOWN;
                }
                ef3.g(ef3Var5, muoVar5, brs.j(mqsVar5), pe3.BAN);
                brsVar5.l.C(sjb.Dislike);
                brsVar5.d.f();
                jyr jyrVar2 = ols.a;
                ols.b(brsVar5.e);
                fx fxVar = fx.b;
                gj gjVar = brsVar5.b;
                if (gjVar != null) {
                    ((gx) brsVar5.p.getValue()).a(fxVar, mqsVar5.a, gjVar);
                }
                brsVar5.n().b(mqsVar5);
                break;
            case 5:
                brs brsVar6 = this.b;
                mqs mqsVar6 = this.c;
                ef3 ef3Var6 = ef3.b;
                muo muoVar6 = brsVar6.g;
                if (muoVar6 == null) {
                    muoVar6 = muo.UNKNOWN;
                }
                ef3.g(ef3Var6, muoVar6, df3.EPISODE_BOTTOMSHEET, pe3.MARK_AS_UNREAD);
                brsVar6.d.e();
                brsVar6.l.C(sjb.MarkAsUnlistened);
                r1l r1lVar = (r1l) brsVar6.t.getValue();
                r1lVar.getClass();
                mqsVar6.getClass();
                r1lVar.b(mqsVar6, false);
                String str = mqsVar6.a;
                str.getClass();
                r1lVar.c.a(t75.c(str));
                break;
            case 6:
                brs brsVar7 = this.b;
                mqs mqsVar7 = this.c;
                ef3 ef3Var7 = ef3.b;
                muo muoVar7 = brsVar7.g;
                if (muoVar7 == null) {
                    muoVar7 = muo.UNKNOWN;
                }
                ef3.g(ef3Var7, muoVar7, df3.EPISODE_BOTTOMSHEET, pe3.MARK_AS_READ);
                brsVar7.d.e();
                brsVar7.l.C(sjb.MarkAsListened);
                r1l r1lVar2 = (r1l) brsVar7.t.getValue();
                r1lVar2.getClass();
                mqsVar7.getClass();
                r1lVar2.b(mqsVar7, true);
                String str2 = mqsVar7.a;
                str2.getClass();
                r1lVar2.c.a(t75.c(str2));
                d6l x = p6g.x((e6l) ((oq7) brsVar7.v.getValue()).a.c.getValue());
                if (x != null && (n7qVar = x.a) != null && (b = n7qVar.b()) != null) {
                    continuation = b.a();
                }
                if (mqsVar7.equals(continuation)) {
                    ((k1l) brsVar7.n.getValue()).a(new SkipCommand(), new b3t("queue_skip"));
                }
                break;
            case 7:
                brs brsVar8 = this.b;
                mqs mqsVar8 = this.c;
                brsVar8.l.y().b(wjb.TrailerScreen);
                m mVar4 = brsVar8.d;
                l5t l5tVar = l5t.f;
                String e = mqsVar8.d().e();
                kxi kxiVar = brsVar8.k;
                e.getClass();
                kxiVar.getClass();
                ((Function0) mVar4.c).invoke();
                Context context = (Context) mVar4.d;
                hq0 hq0Var = context instanceof hq0 ? (hq0) context : null;
                if (hq0Var == null) {
                    dfi.r("Expected activity as context, cannot show TrailerBottomSheetDialog, see MUSICANDROID-31303", "CatalogMenuNavigation");
                } else {
                    y supportFragmentManager = hq0Var.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    mvn.T(supportFragmentManager, l5tVar, e, true, kxiVar, null);
                }
                break;
            case 8:
                brs brsVar9 = this.b;
                mqs mqsVar9 = this.c;
                brsVar9.d.e();
                brsVar9.l.C(sjb.Share);
                m mVar5 = brsVar9.d;
                fnb fnbVar = brsVar9.k.a;
                mqsVar9.getClass();
                fnbVar.getClass();
                new tao((mvp) ((jyr) mVar5.j).getValue(), pd.t(new qzm[0]), (y) mVar5.e, (Context) mVar5.d, fnbVar, 0).p(mqsVar9);
                break;
            case 9:
                brs brsVar10 = this.b;
                mqs mqsVar10 = this.c;
                brsVar10.d.e();
                m mVar6 = brsVar10.d;
                j94 j94Var = (j94) mVar6.g;
                int i = ComplaintActivity.v;
                Context context2 = (Context) mVar6.d;
                String str3 = mqsVar10.y0;
                if (str3 == null) {
                    str3 = mqsVar10.a;
                }
                context2.getClass();
                str3.getClass();
                Intent putExtra = new Intent(context2, (Class<?>) ComplaintActivity.class).putExtra("track_id", str3);
                putExtra.getClass();
                j94Var.invoke(putExtra);
                break;
            case 10:
                brs brsVar11 = this.b;
                mqs mqsVar11 = this.c;
                ef3 ef3Var8 = ef3.b;
                muo muoVar8 = brsVar11.g;
                if (muoVar8 == null) {
                    muoVar8 = muo.UNKNOWN;
                }
                ef3.g(ef3Var8, muoVar8, brs.j(mqsVar11), pe3.DISLIKE);
                v5g.O(brsVar11.e, ((frt) brsVar11.m.getValue()).c(), a4g.D(gys.PodcastHolder, mqsVar11) ? R.string.podcast_removed_from_favorites : a4g.D(gys.AudioBookHolder, mqsVar11) ? R.string.bookmate_audiobook_removed_from_favorites : R.string.track_was_removed_from_favorites);
                brsVar11.l.C(sjb.Unlike);
                brsVar11.n().A(mqsVar11);
                brsVar11.d.f();
                break;
            case 11:
                brs brsVar12 = this.b;
                mqs mqsVar12 = this.c;
                ef3 ef3Var9 = ef3.b;
                muo muoVar9 = brsVar12.g;
                if (muoVar9 == null) {
                    muoVar9 = muo.UNKNOWN;
                }
                ef3.g(ef3Var9, muoVar9, brs.j(mqsVar12), pe3.LIKE);
                brsVar12.q(mqsVar12);
                break;
            default:
                brs brsVar13 = this.b;
                mqs mqsVar13 = this.c;
                ef3 ef3Var10 = ef3.b;
                muo muoVar10 = brsVar13.g;
                if (muoVar10 == null) {
                    muoVar10 = muo.UNKNOWN;
                }
                ef3.g(ef3Var10, muoVar10, brs.j(mqsVar13), pe3.DELETE_CACHE);
                brsVar13.d.e();
                brsVar13.l.C(sjb.Remove);
                Context context3 = brsVar13.e;
                context3.getClass();
                x97.y(cmd.a, dm6.a, null, new bv6(context3, mqsVar13, continuation, 27), 2);
                break;
        }
        return Unit.a;
    }
}
