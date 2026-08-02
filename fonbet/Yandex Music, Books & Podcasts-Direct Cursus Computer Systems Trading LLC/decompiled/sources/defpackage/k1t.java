package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.common.media.context.f;
import ru.yandex.music.support.complaint.ComplaintActivity;

/* loaded from: classes4.dex */
public final class k1t implements j1t {
    public final Context a;
    public final y b;
    public final PlaybackScope c;
    public final qe3 d;
    public final ezc e;
    public final jyr f;
    public final jyr g;
    public final jyr h;
    public final jyr i;
    public final jyr j;
    public final jyr k;
    public final jyr l;
    public final jyr m;
    public final jyr n;
    public final jyr o;

    /* JADX WARN: Multi-variable type inference failed */
    public k1t(Context context, y yVar, PlaybackScope playbackScope, qe3 qe3Var, Function0 function0) {
        context.getClass();
        yVar.getClass();
        playbackScope.getClass();
        qe3Var.getClass();
        this.a = context;
        this.b = yVar;
        this.c = playbackScope;
        this.d = qe3Var;
        this.e = (ezc) function0;
        bdt I = hag.I(lwc.class);
        l18 l18Var = l18.b;
        this.f = l18Var.b(I, true);
        this.g = l18Var.b(hag.I(mvp.class), true);
        this.h = l18Var.b(hag.I(yk.class), true);
        this.i = l18Var.b(hag.I(i1h.class), true);
        this.j = l18Var.b(hag.I(kt6.class), true);
        this.k = l18Var.b(hag.I(z66.class), true);
        this.l = l18Var.b(hag.I(e.class), true);
        this.m = l18Var.b(hag.I(f.class), true);
        this.n = l18Var.b(hag.I(frt.class), true);
        this.o = btf.b(new wfs(6, this));
    }

    @Override // defpackage.j1t
    public final void a(cvl cvlVar, mqs mqsVar) {
        mqsVar.getClass();
        cvlVar.getClass();
        Context context = this.a;
        context.getClass();
        x97.y(cmd.a, dm6.a, null, new j57(context, mqsVar, cvlVar, (Continuation) null, 9), 2);
    }

    @Override // defpackage.j1t
    public final void b() {
        v7g.L(this.a, new lik(vik.f, null, null));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ezc, kotlin.jvm.functions.Function0] */
    @Override // defpackage.j1t
    public final void c() {
        qld.I(100L, this.e);
    }

    @Override // defpackage.j1t
    public final void d() {
        jyr jyrVar = ols.a;
        ols.c(this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ezc, kotlin.jvm.functions.Function0] */
    @Override // defpackage.j1t
    public final void dismiss() {
        this.e.invoke();
    }

    @Override // defpackage.j1t
    public final void e(mqs mqsVar) {
        mqsVar.getClass();
        dismiss();
        int i = ComplaintActivity.v;
        String str = mqsVar.y0;
        if (str == null) {
            str = mqsVar.a;
        }
        Context context = this.a;
        context.getClass();
        str.getClass();
        Intent putExtra = new Intent(context, (Class<?>) ComplaintActivity.class).putExtra("track_id", str);
        putExtra.getClass();
        context.startActivity(putExtra);
    }

    @Override // defpackage.j1t
    public final void f(mqs mqsVar) {
        mqsVar.getClass();
        dismiss();
        this.d.b(wjb.TextScreen);
        kt6 kt6Var = (kt6) this.j.getValue();
        pu0 t = pd.t(new qzm[0]);
        kt6Var.getClass();
        y yVar = this.b;
        yVar.getClass();
        cvo cvoVar = cvo.i;
        e3s.X(o6m.b(wjb.DescriptionScreen, new avo(pkb.Track, mqsVar.a), 2), yVar, "TRACK_INFO_DIALOG_TAG", null, null, new wn5(new aqp(8, t, kt6Var, mqsVar), -319012280, true), 56);
    }

    @Override // defpackage.j1t
    public final void g() {
        hld.I(this.a, (z66) this.k.getValue());
    }

    @Override // defpackage.j1t
    public final void h(mqs mqsVar) {
        mqsVar.getClass();
        dismiss();
        Context context = this.a;
        hq0 hq0Var = context instanceof hq0 ? (hq0) context : null;
        if (hq0Var == null) {
            dfi.r("Expected activity as context, cannot show TrailerBottomSheetDialog, see MUSICANDROID-31303", "TrackSheetActionNavigation");
            return;
        }
        wjb wjbVar = wjb.TrailerScreen;
        qe3 qe3Var = this.d;
        qe3Var.b(wjbVar);
        y supportFragmentManager = hq0Var.getSupportFragmentManager();
        supportFragmentManager.getClass();
        mvn.T(supportFragmentManager, l5t.f, mqsVar.d().e(), true, qe3Var.a, null);
    }

    @Override // defpackage.j1t
    public final void i(mqs mqsVar) {
        y yVar = this.b;
        mqsVar.getClass();
        dismiss();
        this.d.a(sjb.AddToPlaylist);
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (((nf3) ((byb) qdcVar.C(I)).b(nf3.class)).h()) {
            new nsh((yk) this.h.getValue(), pd.t(new qzm[0]), yVar).T(mqsVar);
            return;
        }
        v7f v7fVar = new v7f();
        v7fVar.l = mqsVar;
        yVar.getClass();
        x7f.B(v7fVar, yVar, "ADD_TO_PLAYLIST_DIALOG");
    }

    @Override // defpackage.j1t
    public final void j(mqs mqsVar) {
        mqsVar.getClass();
        v5g.O(this.a, ((frt) this.n.getValue()).c(), a4g.D(gys.PodcastHolder, mqsVar) ? R.string.podcast_added_to_favorites : a4g.D(gys.AudioBookHolder, mqsVar) ? R.string.bookmate_audiobook_added_to_favorites : R.string.track_added_to_favorites);
    }

    @Override // defpackage.j1t
    public final void k(mqs mqsVar) {
        mqsVar.getClass();
        Context context = this.a;
        context.getClass();
        x97.y(cmd.a, dm6.a, null, new bv6(context, mqsVar, null, 27), 2);
    }

    @Override // defpackage.j1t
    public final void l(mqs mqsVar) {
        mqsVar.getClass();
        if (((lwc) this.f.getValue()).a()) {
            b();
            return;
        }
        dismiss();
        this.d.a(sjb.Lyrics);
        i1h i1hVar = (i1h) this.i.getValue();
        pu0 t = pd.t(new qzm[0]);
        i1hVar.getClass();
        y yVar = this.b;
        yVar.getClass();
        cvo cvoVar = cvo.i;
        e3s.X(o6m.b(wjb.BottomsheetScreen, new avo(pkb.Track, mqsVar.a), 2), yVar, "TRACK_LYRICS_BOTTOM_SHEET_DIALOG_TAG", null, null, new wn5(new vtb(10, t, i1hVar, mqsVar), 1208299711, true), 56);
    }

    @Override // defpackage.j1t
    public final void m() {
        v5g.O(this.a, ((frt) this.n.getValue()).c(), R.string.track_was_removed_from_playlist);
    }

    @Override // defpackage.j1t
    public final void n() {
        jyr jyrVar = ols.a;
        ols.b(this.a);
    }

    @Override // defpackage.j1t
    public final void o(mqs mqsVar) {
        mqsVar.getClass();
        sjb sjbVar = sjb.PlayOnDevice;
        qe3 qe3Var = this.d;
        qe3Var.a(sjbVar);
        ((f) this.m.getValue()).getClass();
        c d = f.d();
        r1n r1nVar = r1n.b;
        m2n m2nVar = new m2n(mqsVar, t75.c(mqsVar), d, (String) this.o.getValue(), qe3Var.a);
        new j2n(this.a, qe3Var.a.a, r1nVar, m2nVar, true).m();
        dismiss();
    }

    @Override // defpackage.j1t
    public final void p(mqs mqsVar) {
        mqsVar.getClass();
        dismiss();
        sjb sjbVar = sjb.Share;
        qe3 qe3Var = this.d;
        qe3Var.a(sjbVar);
        new tao((mvp) this.g.getValue(), pd.t(new qzm[0]), this.b, this.a, qe3Var.a.a, 0).p(mqsVar);
    }

    @Override // defpackage.j1t
    public final void q(mqs mqsVar) {
        mqsVar.getClass();
        v5g.O(this.a, ((frt) this.n.getValue()).c(), a4g.D(gys.PodcastHolder, mqsVar) ? R.string.podcast_removed_from_favorites : a4g.D(gys.AudioBookHolder, mqsVar) ? R.string.bookmate_audiobook_removed_from_favorites : R.string.track_was_removed_from_favorites);
    }
}
