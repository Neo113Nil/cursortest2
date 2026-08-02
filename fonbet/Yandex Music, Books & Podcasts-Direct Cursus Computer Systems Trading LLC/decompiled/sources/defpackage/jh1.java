package defpackage;

import androidx.fragment.app.o;
import androidx.fragment.app.y;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.catalog.playlist.editor.PlaylistEditorActivity;
import ru.yandex.music.concert.ConcertActivity;
import ru.yandex.music.concert.catalog.ConcertCatalogActivity;
import ru.yandex.music.gallery.GalleryWidgetActivity;
import ru.yandex.music.slides.SlidesScreenActivity;
import ru.yandex.music.webview.WebViewScreenActivity;

/* loaded from: classes4.dex */
public final class jh1 extends otc {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jh1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.otc
    public final o a(ClassLoader classLoader, String str) {
        int i = 0;
        switch (this.b) {
            case 0:
                lh1 lh1Var = (lh1) this.d;
                classLoader.getClass();
                str.getClass();
                ArtistScreenActivity artistScreenActivity = (ArtistScreenActivity) this.c;
                if (!str.equals(artistScreenActivity.Z.getName())) {
                    o a = super.a(classLoader, str);
                    a.getClass();
                    return a;
                }
                pu0 t = pd.t(ypg.a);
                u51 u51Var = lh1Var.a;
                y supportFragmentManager = artistScreenActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                kxi d = artistScreenActivity.d();
                z6n z6nVar = artistScreenActivity.Y;
                bi1 bi1Var = new bi1(u51Var, artistScreenActivity, supportFragmentManager, d, z6nVar != null ? (dyd) z6nVar.b : null, new ih1(artistScreenActivity, 1));
                le3 le3Var = new le3();
                le3Var.a = new e00(bi1Var);
                le3Var.b = btf.b(new vh1(bi1Var, i));
                return new ni1(t, le3Var, lh1Var.a, lh1Var.b, lh1Var.c, lh1Var.d);
            case 1:
                classLoader.getClass();
                str.getClass();
                m65 m65Var = (m65) this.c;
                if (!str.equals(p65.class.getName())) {
                    o a2 = ((otc) this.d).a(classLoader, str);
                    a2.getClass();
                    return a2;
                }
                e00 e00Var = m65Var.a;
                e00Var.getClass();
                pu0 t2 = pd.t(new qzm[0]);
                bdt I = hag.I(c65.class);
                qdc qdcVar = e00Var.a;
                qdcVar.getClass();
                return new p65(t2, (c65) qdcVar.C(I));
            case 2:
                vs5 vs5Var = (vs5) this.d;
                classLoader.getClass();
                str.getClass();
                ConcertActivity concertActivity = (ConcertActivity) this.c;
                if (!str.equals(concertActivity.v0.getName())) {
                    o a3 = super.a(classLoader, str);
                    a3.getClass();
                    return a3;
                }
                xy5 xy5Var = (xy5) concertActivity.Z.getValue();
                pu0 t3 = pd.t(ypg.a);
                String str2 = vs5Var.a;
                znk znkVar = new znk(17);
                y supportFragmentManager2 = concertActivity.getSupportFragmentManager();
                supportFragmentManager2.getClass();
                bz5 bz5Var = new bz5(str2, znkVar, concertActivity, supportFragmentManager2, concertActivity.d());
                osh oshVar = new osh();
                oshVar.a = bz5Var;
                oshVar.b = new e00(bz5Var);
                oshVar.c = btf.b(new r25(15, oshVar));
                String str3 = vs5Var.a;
                dud dudVar = vs5Var.c;
                xy5Var.getClass();
                str3.getClass();
                dudVar.getClass();
                return new dz5(t3, oshVar, str3, dudVar);
            case 3:
                classLoader.getClass();
                str.getClass();
                ConcertCatalogActivity concertCatalogActivity = (ConcertCatalogActivity) this.c;
                if (!str.equals(concertCatalogActivity.Z.getName())) {
                    o a4 = super.a(classLoader, str);
                    a4.getClass();
                    return a4;
                }
                vt5 vt5Var = (vt5) concertCatalogActivity.Y.getValue();
                lt5 lt5Var = (lt5) this.d;
                vt5Var.getClass();
                return new qt5(lt5Var, vt5Var.a);
            case 4:
                classLoader.getClass();
                str.getClass();
                GalleryWidgetActivity galleryWidgetActivity = (GalleryWidgetActivity) this.c;
                int i2 = GalleryWidgetActivity.y;
                jyr jyrVar = galleryWidgetActivity.v;
                ((k1d) jyrVar.getValue()).getClass();
                if (!str.equals(j1d.class.getName())) {
                    o a5 = super.a(classLoader, str);
                    a5.getClass();
                    return a5;
                }
                k1d k1dVar = (k1d) jyrVar.getValue();
                g1d g1dVar = (g1d) this.d;
                jyr b = btf.b(new htb(15));
                k1dVar.getClass();
                return new j1d(g1dVar, k1dVar.a, b);
            case 5:
                classLoader.getClass();
                str.getClass();
                PlaylistEditorActivity playlistEditorActivity = (PlaylistEditorActivity) this.c;
                int i3 = PlaylistEditorActivity.w0;
                if (!str.equals(((Class) playlistEditorActivity.Z.getValue()).getName())) {
                    o a6 = super.a(classLoader, str);
                    a6.getClass();
                    return a6;
                }
                g3m g3mVar = (g3m) playlistEditorActivity.Y.getValue();
                cvl cvlVar = (cvl) this.d;
                g3mVar.getClass();
                return new e3m(cvlVar, g3mVar.a);
            case 6:
                classLoader.getClass();
                str.getClass();
                SlidesScreenActivity slidesScreenActivity = (SlidesScreenActivity) this.c;
                if (!str.equals(slidesScreenActivity.w.getName())) {
                    o a7 = super.a(classLoader, str);
                    a7.getClass();
                    return a7;
                }
                cwq cwqVar = (cwq) slidesScreenActivity.v.getValue();
                zvq zvqVar = (zvq) this.d;
                cwqVar.getClass();
                return new uvq(zvqVar, cwqVar.a);
            case 7:
                classLoader.getClass();
                str.getClass();
                dsu dsuVar = (dsu) this.c;
                if (!str.equals(kru.class.getName())) {
                    o a8 = ((otc) this.d).a(classLoader, str);
                    a8.getClass();
                    return a8;
                }
                pu0 a9 = dru.a(false);
                pzl pzlVar = dsuVar.b;
                bdt I2 = hag.I(mpu.class);
                qdc qdcVar2 = pzlVar.a;
                qdcVar2.getClass();
                return new kru(a9, (mpu) qdcVar2.C(I2), dsuVar);
            default:
                classLoader.getClass();
                str.getClass();
                WebViewScreenActivity webViewScreenActivity = (WebViewScreenActivity) this.c;
                int i4 = WebViewScreenActivity.A;
                if (!str.equals(((Class) webViewScreenActivity.z.getValue()).getName())) {
                    o a10 = super.a(classLoader, str);
                    a10.getClass();
                    return a10;
                }
                pu0 t4 = pd.t(new qzm[0]);
                wev wevVar = (wev) webViewScreenActivity.y.getValue();
                String str4 = (String) this.d;
                boolean booleanValue = ((Boolean) webViewScreenActivity.w.getValue()).booleanValue();
                xfv xfvVar = (xfv) webViewScreenActivity.x.getValue();
                wevVar.getClass();
                return new dfv(t4, wevVar, str4, booleanValue, xfvVar);
        }
    }
}
