package defpackage;

import android.content.Intent;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ru.yandex.music.catalog.album.screen.AlbumScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.a;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.metatag.album.MetaTagAlbumsActivity;

/* loaded from: classes4.dex */
public final class f00 {
    public final fnb a;
    public final cvo b;
    public final AlbumScreenActivity c;
    public final kkp d;

    public f00(AlbumScreenActivity albumScreenActivity, kkp kkpVar, fnb fnbVar, cvo cvoVar) {
        fnbVar.getClass();
        fnbVar.getClass();
        this.a = fnbVar;
        this.b = cvoVar;
        this.c = albumScreenActivity;
        this.d = kkpVar;
    }

    public final void a(n7w n7wVar) {
        nab nabVar = n7wVar.M().b;
        jab jabVar = nabVar instanceof jab ? (jab) nabVar : null;
        if (jabVar == null) {
            dfi.r("Navigation without entityType", "ScreenNavigationAnalytics");
            return;
        }
        nmb m = qld.m();
        String G = this.a.G();
        cvo cvoVar = this.b;
        wjb wjbVar = cvoVar.a;
        String str = cvoVar.d.a;
        avo avoVar = cvoVar.e;
        pkb pkbVar = avoVar.a;
        String str2 = avoVar.b;
        wjb wjbVar2 = n7wVar.M().a;
        n7wVar.M().getClass();
        n7wVar.M().getClass();
        qkb qkbVar = jabVar.a;
        hlb hlbVar = cvoVar.b;
        qkbVar.getClass();
        String str3 = qkbVar.a;
        G.getClass();
        wjbVar.getClass();
        String str4 = wjbVar.a;
        hlbVar.getClass();
        str.getClass();
        pkbVar.getClass();
        str2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("entity_type", str3);
        linkedHashMap.put("entity_id", str3);
        linkedHashMap.put("hash", G);
        linkedHashMap.put("page_id", str4);
        linkedHashMap.put("page_style", hlbVar.a);
        linkedHashMap.put("skeleton_id", str);
        linkedHashMap.put("main_object_type", pkbVar.a);
        linkedHashMap.put("main_object_id", str2);
        eta.m(0, "tab_id", "", "tab_pos", linkedHashMap);
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(false));
        linkedHashMap.put("from", str4);
        linkedHashMap.put("to", wjbVar2.a);
        dfi.p(3, "deep_link", "", "_meta", linkedHashMap);
        m.C("Screen.Navigated", linkedHashMap);
        boolean z = n7wVar instanceof iz;
        kkp kkpVar = this.d;
        if (z) {
            oq oqVar = ((iz) n7wVar).i;
            kkpVar.getClass();
            oqVar.getClass();
            t tVar = (t) kkpVar.b;
            tVar.startActivity(quj.T(tVar, oqVar, null));
            return;
        }
        boolean z2 = n7wVar instanceof jz;
        AlbumScreenActivity albumScreenActivity = this.c;
        if (z2) {
            jz jzVar = (jz) n7wVar;
            List list = jzVar.i;
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((c01) it.next()).c) {
                        return;
                    }
                }
            }
            a aVar = PlaybackScope.a;
            aVar.getClass();
            s2 s2Var = new s2(19);
            y supportFragmentManager = albumScreenActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            new m(aVar, s2Var, albumScreenActivity, supportFragmentManager, null, 48).y(list, hld.N(jzVar.j));
            return;
        }
        if (n7wVar instanceof lz) {
            lz lzVar = (lz) n7wVar;
            kkpVar.I(lzVar.i, lzVar.j);
            return;
        }
        if (n7wVar instanceof hz) {
            oq oqVar2 = ((hz) n7wVar).i;
            kkpVar.getClass();
            oqVar2.getClass();
            rre.X(oqVar2, (t) kkpVar.b, (kxi) kkpVar.d, (PlaybackScope) kkpVar.c);
            return;
        }
        if (n7wVar instanceof mz) {
            mz mzVar = (mz) n7wVar;
            mqs mqsVar = mzVar.i;
            gj gjVar = mzVar.k.b;
            oq oqVar3 = mzVar.j;
            kkpVar.J(mqsVar, gjVar, oqVar3, oqVar3.F, zus.b);
            return;
        }
        if (n7wVar instanceof nz) {
            y supportFragmentManager2 = albumScreenActivity.getSupportFragmentManager();
            supportFragmentManager2.getClass();
            i5l i5lVar = l5t.a;
            oq oqVar4 = ((nz) n7wVar).i;
            Album$AlbumType d = oqVar4.d();
            i5lVar.getClass();
            mvn.T(supportFragmentManager2, i5l.b(d), oqVar4.a, true, albumScreenActivity.d(), null);
            return;
        }
        if (n7wVar instanceof kz) {
            kkpVar.H(((kz) n7wVar).i);
            return;
        }
        if (!(n7wVar instanceof gz)) {
            b6e.s();
            return;
        }
        int i = MetaTagAlbumsActivity.Y;
        String str5 = ((gz) n7wVar).i;
        albumScreenActivity.getClass();
        str5.getClass();
        Intent putExtra = new Intent(albumScreenActivity, (Class<?>) MetaTagAlbumsActivity.class).putExtra("extra_id", str5);
        putExtra.getClass();
        albumScreenActivity.startActivity(putExtra);
    }
}
