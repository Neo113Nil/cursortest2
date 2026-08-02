package defpackage;

import android.content.res.Resources;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class vh1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi1 b;

    public /* synthetic */ vh1(bi1 bi1Var, int i) {
        this.a = i;
        this.b = bi1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (cvo) ((jyr) this.b.g).getValue();
            case 1:
                bi1 bi1Var = this.b;
                return new cvo(wjb.ArtistScreen, hlb.Fullscreen, (glb) null, new dvo("artists"), new avo(pkb.Artist, ((u51) bi1Var.a).a), 36);
            case 2:
                np2 np2Var = (np2) this.b.b;
                Resources resources = np2Var.getResources();
                String string = np2Var.getResources().getString(R.string.popular_tracks);
                string.getClass();
                String string2 = np2Var.getResources().getString(R.string.cached_albums);
                string2.getClass();
                String string3 = np2Var.getResources().getString(R.string.cached_tracks);
                string3.getClass();
                String string4 = np2Var.getResources().getString(R.string.discography);
                string4.getClass();
                String string5 = resources.getString(R.string.albums);
                string5.getClass();
                String string6 = resources.getString(R.string.playlists);
                string6.getClass();
                String string7 = resources.getString(R.string.compilations);
                string7.getClass();
                String string8 = resources.getString(R.string.similar_artists);
                string8.getClass();
                String string9 = resources.getString(R.string.artist_video_clips_title);
                string9.getClass();
                String string10 = resources.getString(R.string.concerts);
                string10.getClass();
                String string11 = resources.getString(R.string.artist_info_donate_title);
                string11.getClass();
                String string12 = resources.getString(R.string.artist_familiar_block);
                string12.getClass();
                String string13 = resources.getString(R.string.artist_info_block_title);
                string13.getClass();
                String string14 = resources.getString(R.string.artist_pick_block_header);
                string14.getClass();
                String string15 = resources.getString(R.string.artist_last_release);
                string15.getClass();
                String string16 = resources.getString(R.string.artist_new_release);
                string16.getClass();
                ai1 ai1Var = ai1.a;
                return new gj1(string, string2, string3, string5, string4, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16);
            case 3:
                bi1 bi1Var2 = this.b;
                return new tmb(12, ((kxi) bi1Var2.d).a, (cvo) ((jyr) bi1Var2.g).getValue());
            case 4:
                return new hj1((u51) this.b.a);
            case 5:
                return new si1((np2) this.b.b);
            case 6:
                bi1 bi1Var3 = this.b;
                kxi kxiVar = (kxi) bi1Var3.d;
                l18 l18Var = l18.b;
                bdt I = hag.I(tj1.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new uh1(kxiVar, new xh1(bi1Var3), (tj1) qdcVar.C(I));
            case 7:
                bi1 bi1Var4 = this.b;
                return new jnq(((kxi) bi1Var4.d).a, (cvo) ((jyr) bi1Var4.g).getValue());
            case 8:
                bi1 bi1Var5 = this.b;
                return new th1((u51) bi1Var5.a, (uh1) ((jyr) bi1Var5.s).getValue(), (hj1) ((jyr) bi1Var5.i).getValue(), (jnq) ((jyr) bi1Var5.t).getValue(), (tmb) ((jyr) bi1Var5.h).getValue());
            case 9:
                return (oj1) ((jyr) this.b.k).getValue();
            case 10:
                return new le1((tj1) ((jyr) this.b.j).getValue());
            case 11:
                return new h81((imp) ((hj1) ((jyr) this.b.i).getValue()).c.a);
            default:
                return new ue1((jyr) this.b.o);
        }
    }
}
