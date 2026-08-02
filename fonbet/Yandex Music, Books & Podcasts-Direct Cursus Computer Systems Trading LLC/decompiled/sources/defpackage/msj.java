package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.fragment.app.y;
import com.yandex.music.shared.playback.utils.api.commands.AddPlayablesAsLastCommand;
import com.yandex.music.shared.playback.utils.api.commands.AddPlayablesAsNextCommand;
import com.yandex.pulse.metrics.o;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;
import ru.yandex.music.catalog.playlist.editor.PlaylistEditorActivity;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.common.media.context.f;
import ru.yandex.music.utils.Assertions;
import ru.yandex.music.videoclip.VideoClipActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class msj extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ msj(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        zwp zwpVar;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                ((psj) this.receiver).d();
                break;
            case 1:
                ((psj) this.receiver).e();
                break;
            case 2:
                cwj cwjVar = ((rvj) this.receiver).a;
                cwjVar.getClass();
                x97.y(ot0.F(cwjVar), null, null, new d7i(cwjVar, continuation, 7), 3);
                break;
            case 3:
                ((rvj) this.receiver).a();
                break;
            case 4:
                ((nzj) this.receiver).b();
                break;
            case 5:
                ((j1k) this.receiver).c.F(Boolean.TRUE);
                break;
            case 6:
                ((j1k) this.receiver).c.F(Boolean.FALSE);
                break;
            case 7:
                ((j1k) this.receiver).c.F(Boolean.FALSE);
                break;
            case 8:
                Context context = ((thi) this.receiver).a;
                jyr jyrVar = VideoClipActivity.y;
                context.startActivity(l3l.e(context, null, 6));
                break;
            case 9:
                Context context2 = ((thi) this.receiver).a;
                jyr jyrVar2 = VideoClipActivity.y;
                context2.startActivity(l3l.e(context2, null, 6));
                break;
            case 10:
                break;
            case 11:
                ((jub) this.receiver).g();
                break;
            case 12:
                ((jub) this.receiver).g();
                break;
            case 13:
                ((sai) this.receiver).a();
                break;
            case 14:
                yrl yrlVar = (yrl) this.receiver;
                yrlVar.d.b(wjb.TextScreen);
                wrl wrlVar = yrlVar.e;
                wrlVar.a();
                ywf.F(wrlVar.a, (dy7) wrlVar.h.getValue(), wrlVar.f, pd.t(new qzm[0]), wrlVar.d);
                break;
            case 15:
                yrl yrlVar2 = (yrl) this.receiver;
                yrlVar2.d.a(sjb.Share);
                wrl wrlVar2 = yrlVar2.e;
                wrlVar2.a();
                Context context3 = wrlVar2.c;
                y yVar = wrlVar2.d;
                mvp mvpVar = (mvp) wrlVar2.i.getValue();
                pu0 t = pd.t(new qzm[0]);
                fnb fnbVar = wrlVar2.f.a;
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                boolean h = ((bft) ((byb) qdcVar.C(I)).c(ern.a(bft.class))).h();
                mvpVar.getClass();
                yVar.getClass();
                context3.getClass();
                fnbVar.getClass();
                cvl cvlVar = wrlVar2.a;
                boolean z = wrlVar2.b;
                cvlVar.getClass();
                if (cvlVar.h()) {
                    String str = cvlVar.w;
                    drt drtVar = cvlVar.c;
                    if (str != null || h) {
                        String e = cvlVar.e();
                        String str2 = drtVar.b;
                        if (str2.length() <= 0) {
                            str2 = null;
                        }
                        if (str2 == null) {
                            str2 = drtVar.a;
                        }
                        gxp gxpVar = new gxp(e, str2, drtVar.a, cvlVar.a, z, false, str);
                        co6 c = op7.c(cvlVar);
                        String str3 = cvlVar.b;
                        String string = context3.getString(R.string.share_playlist_preview_subtitle);
                        string.getClass();
                        zwpVar = new zwp(gxpVar, c, str3, string);
                    } else {
                        zwpVar = null;
                    }
                    if (zwpVar != null) {
                        sai saiVar = new sai(false);
                        cvo cvoVar = cvo.i;
                        e3s.X(o6m.b(wjb.ShareScreen, null, 6), yVar, "SHARE_BOTTOM_SHEET", saiVar, null, new wn5(new ntb(t, mvpVar, zwpVar, saiVar, context3, yVar, fnbVar, 4), 1326092232, true), 48);
                    }
                }
                break;
            case 16:
                yrl yrlVar3 = (yrl) this.receiver;
                yrlVar3.e.a();
                String t2 = weo.t();
                yrlVar3.d.c(xlb.Next, t2);
                ((k1l) yrlVar3.c.m.getValue()).a(new AddPlayablesAsNextCommand(yrlVar3.c(t2)), new b3t("queue_add"));
                break;
            case 17:
                yrl yrlVar4 = (yrl) this.receiver;
                yrlVar4.e.a();
                String t3 = weo.t();
                yrlVar4.d.c(xlb.End, t3);
                ((k1l) yrlVar4.c.m.getValue()).a(new AddPlayablesAsLastCommand(yrlVar4.c(t3)), new b3t("queue_add"));
                break;
            case 18:
                yrl yrlVar5 = (yrl) this.receiver;
                yrlVar5.d.a(sjb.PlayOnDevice);
                wrl wrlVar3 = yrlVar5.e;
                wrlVar3.a();
                e eVar = (e) wrlVar3.k.getValue();
                PlaybackScope playbackScope = wrlVar3.g;
                cvl cvlVar2 = wrlVar3.a;
                eVar.getClass();
                String a = e.f(playbackScope, cvlVar2).a();
                Context context4 = wrlVar3.c;
                r1n r1nVar = r1n.b;
                cvl cvlVar3 = wrlVar3.a;
                c5b c5bVar = c5b.a;
                ((f) wrlVar3.j.getValue()).getClass();
                c d = f.d();
                kxi kxiVar = wrlVar3.f;
                new j2n(context4, kxiVar.a, r1nVar, new m2n(cvlVar3, c5bVar, d, a, kxiVar), true).m();
                break;
            case 19:
                yrl yrlVar6 = (yrl) this.receiver;
                yrlVar6.d.a(sjb.ChangeView);
                wrl wrlVar4 = yrlVar6.e;
                hq0 hq0Var = (hq0) vq2.R(wrlVar4.c);
                if (hq0Var != null) {
                    wrlVar4.a();
                    jyr jyrVar3 = nr6.a;
                    cvl cvlVar4 = wrlVar4.a;
                    cvlVar4.getClass();
                    if (ivf.I(cvlVar4) && !cvlVar4.d()) {
                        g3m g3mVar = (g3m) nr6.d.getValue();
                        y supportFragmentManager = hq0Var.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        g3mVar.getClass();
                        if (!(supportFragmentManager.J() instanceof f3m)) {
                            xq0.q("addDialogFragmentFactory(fragmentManager) was not called for this FragmentManager. Add it in Activity.onCreate() before super.onCreate()");
                            break;
                        } else {
                            new er6(g3mVar.a, cvlVar4, null).show(hq0Var.getSupportFragmentManager(), (String) null);
                        }
                    } else {
                        Assertions.fail("renamePlaylist(): invalid playlist: " + cvlVar4);
                    }
                }
                break;
            case 20:
                yrl yrlVar7 = (yrl) this.receiver;
                yrlVar7.d.b(wjb.TrackListScreen);
                wrl wrlVar5 = yrlVar7.e;
                hq0 hq0Var2 = (hq0) vq2.R(wrlVar5.c);
                if (hq0Var2 != null) {
                    wrlVar5.a();
                    jyr jyrVar4 = nr6.a;
                    cvl cvlVar5 = wrlVar5.a;
                    cvlVar5.getClass();
                    if (ivf.I(cvlVar5)) {
                        int i = PlaylistEditorActivity.w0;
                        Intent intent = new Intent(hq0Var2, (Class<?>) PlaylistEditorActivity.class);
                        intent.putExtra("extra.playlist.header", (Serializable) cvlVar5);
                        hq0Var2.startActivity(intent);
                    } else {
                        Assertions.fail("editPlaylist(): invalid playlist: " + cvlVar5);
                    }
                }
                break;
            case 21:
                yrl yrlVar8 = (yrl) this.receiver;
                yrlVar8.d.b(wjb.AddTracksScreen);
                wrl wrlVar6 = yrlVar8.e;
                hq0 hq0Var3 = (hq0) vq2.R(wrlVar6.c);
                if (hq0Var3 != null) {
                    wrlVar6.a();
                    nr6.a(hq0Var3, wrlVar6.a);
                }
                break;
            case 22:
                yrl yrlVar9 = (yrl) this.receiver;
                yrlVar9.d.a(sjb.Remove);
                wrl wrlVar7 = yrlVar9.e;
                cvl cvlVar6 = wrlVar7.a;
                Context context5 = wrlVar7.c;
                Continuation continuation2 = null;
                if (context5 instanceof PlaylistScreenActivity) {
                    PlaylistScreenActivity playlistScreenActivity = (PlaylistScreenActivity) context5;
                    if (playlistScreenActivity.A0) {
                        Intent intent2 = new Intent();
                        cvlVar6.getClass();
                        intent2.putExtra("extra.removable.playlist.header", (Parcelable) cvlVar6);
                        playlistScreenActivity.setResult(-1, intent2);
                        playlistScreenActivity.finish();
                    } else {
                        x97.y(wyf.F(playlistScreenActivity.getLifecycle()), null, null, new c5l(cvlVar6, wrlVar7, playlistScreenActivity, continuation2, 4), 3);
                    }
                } else {
                    wrlVar7.a();
                    context5.getClass();
                    cvlVar6.getClass();
                    x97.y(cmd.a, dm6.a, null, new mr6(context5, cvlVar6, (Continuation) null), 2);
                }
                break;
            case 23:
                ((bg5) this.receiver).a();
                break;
            case 24:
                ((bg5) this.receiver).e();
                break;
            case 25:
                ((bg5) this.receiver).e();
                break;
            case 26:
                n0m n0mVar = ((cyl) this.receiver).a;
                if (n0mVar.L0 == null) {
                    n0mVar.H();
                } else {
                    x97.y(ot0.F(n0mVar), null, null, new d0m(n0mVar, continuation, 8), 3);
                }
                break;
            case 27:
                rar rarVar = ((cyl) this.receiver).a.L0;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((cyl) this.receiver).f.a.finish();
                break;
            default:
                cyl cylVar = (cyl) this.receiver;
                cvl cvlVar7 = cylVar.h;
                List list = cylVar.i;
                if (cvlVar7 != null && list != null) {
                    cylVar.f.b(cvlVar7, list);
                }
                break;
        }
        return Unit.a;
    }
}
