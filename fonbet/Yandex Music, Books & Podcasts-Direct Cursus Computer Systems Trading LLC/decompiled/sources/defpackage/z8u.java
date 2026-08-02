package defpackage;

import android.content.res.Configuration;
import androidx.fragment.app.y;
import com.yandex.music.shared.playback.api.commands.PauseCommand;
import com.yandex.music.shared.playback.api.commands.PlayCommand;
import com.yandex.music.shared.playback.api.commands.VolumeMuteCommand;
import com.yandex.music.shared.playback.api.commands.VolumeUnmuteCommand;
import com.yandex.music.shared.playback.utils.api.commands.PrevCommand;
import com.yandex.music.shared.playback.utils.api.commands.SkipCommand;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.a;
import ru.yandex.music.videoclip.VideoClipActivity;

/* loaded from: classes3.dex */
public final class z8u implements y8u {
    public final i9u a;
    public final d8u b;
    public final jvo c;
    public final xdr d;
    public final fkn e;
    public final xdr f;
    public final xdr g;
    public final xdr h;
    public final xdr i;
    public final xdr j;
    public final xdr k;
    public final fkn l;
    public final x8a m;

    public z8u(i9u i9uVar, d8u d8uVar, jvo jvoVar) {
        i9uVar.getClass();
        d8uVar.getClass();
        jvoVar.getClass();
        this.a = i9uVar;
        this.b = d8uVar;
        this.c = jvoVar;
        this.d = i9uVar.x;
        this.e = i9uVar.w;
        this.f = i9uVar.z;
        this.g = i9uVar.y;
        this.h = i9uVar.A;
        this.i = i9uVar.C;
        this.j = i9uVar.D;
        this.k = i9uVar.E;
        this.l = i9uVar.F;
        this.m = new x8a("videoClipLikeClick");
    }

    public final void a(x8u x8uVar) {
        i9u i9uVar = this.a;
        i9uVar.getClass();
        if (i9uVar.K != x8uVar) {
            if (x8uVar != i9uVar.L) {
                i9uVar.H(x8uVar);
            }
            i9uVar.L = x8uVar;
            i9uVar.K = x8uVar;
        }
        d8u d8uVar = this.b;
        d8uVar.getClass();
        VideoClipActivity videoClipActivity = d8uVar.a;
        Configuration configuration = videoClipActivity.getResources().getConfiguration();
        configuration.getClass();
        if (configuration.smallestScreenWidthDp >= 600) {
            return;
        }
        videoClipActivity.setRequestedOrientation(x8uVar.a);
    }

    @Override // defpackage.y8u
    public final void b() {
        ((k1l) ((e3q) this.a.o.a).i.getValue()).a(PauseCommand.INSTANCE, a3t.a);
    }

    @Override // defpackage.y8u
    public final vdr c() {
        return this.e;
    }

    @Override // defpackage.y8u
    public final void d() {
        ((k1l) ((e3q) this.a.o.a).i.getValue()).a(new PlayCommand(false), new b3t("core_play"));
    }

    @Override // defpackage.y8u
    public final xdr e() {
        return this.d;
    }

    @Override // defpackage.y8u
    public final void f() {
        a(x8u.LANDSCAPE);
    }

    @Override // defpackage.y8u
    public final xdr g() {
        return this.h;
    }

    @Override // defpackage.y8u
    public final xdr getProgress() {
        return this.f;
    }

    @Override // defpackage.y8u
    public final vdr h() {
        return this.l;
    }

    @Override // defpackage.y8u
    public final void i() {
        this.c.a(v84.a);
    }

    @Override // defpackage.y8u
    public final void j() {
        this.a.L(true);
    }

    @Override // defpackage.y8u
    public final void k() {
        this.a.o.b.a(PrevCommand.INSTANCE, new b3t("queue_prev"));
    }

    @Override // defpackage.y8u
    public final void l() {
        this.a.L(false);
    }

    @Override // defpackage.y8u
    public final void m() {
        i9u i9uVar;
        o3u G;
        if (this.m.e("item") && (G = (i9uVar = this.a).G()) != null) {
            x1u x1uVar = G.a;
            j1g j1gVar = G.c;
            j1g j1gVar2 = j1g.a;
            w5u w5uVar = i9uVar.o;
            if (j1gVar == j1gVar2) {
                w5uVar.getClass();
                x1uVar.getClass();
                xdr xdrVar = w5uVar.g;
                q4u q4uVar = new q4u(new p4u(x1uVar, j1g.b), System.currentTimeMillis());
                xdrVar.getClass();
                xdrVar.m(null, q4uVar);
                w5uVar.d.B(x1uVar);
                return;
            }
            w5uVar.getClass();
            x1uVar.getClass();
            xdr xdrVar2 = w5uVar.g;
            q4u q4uVar2 = new q4u(new p4u(x1uVar, j1gVar2), System.currentTimeMillis());
            xdrVar2.getClass();
            xdrVar2.m(null, q4uVar2);
            w5uVar.d.u(x1uVar);
        }
    }

    @Override // defpackage.y8u
    public final void n(String str) {
        Object obj;
        String str2;
        String str3;
        str.getClass();
        i9u i9uVar = this.a;
        i9uVar.getClass();
        Iterator it = i9uVar.r.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((o3u) obj).a.a, str)) {
                    break;
                }
            }
        }
        o3u o3uVar = (o3u) obj;
        if (o3uVar != null) {
            byk bykVar = i9uVar.u;
            x1u x1uVar = o3uVar.a;
            String G = i9uVar.k.a.G();
            bykVar.getClass();
            x1uVar.getClass();
            G.getClass();
            c01 c01Var = (c01) CollectionsKt.firstOrNull(x1uVar.h);
            nmb nmbVar = bykVar.a;
            if (c01Var == null || (str2 = c01Var.a) == null) {
                str2 = "";
            }
            if (c01Var == null || (str3 = c01Var.b) == null) {
                str3 = "";
            }
            String str4 = (String) CollectionsKt.firstOrNull(x1uVar.g);
            if (str4 == null) {
                str4 = "";
            }
            String str5 = x1uVar.b;
            String str6 = x1uVar.a;
            nmbVar.getClass();
            str5.getClass();
            str6.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("artist_id", str2);
            linkedHashMap.put("artist_name", str3);
            linkedHashMap.put("hash", G);
            linkedHashMap.put("page_type", "object");
            linkedHashMap.put("track_id", str4);
            linkedHashMap.put("track_name", str5);
            linkedHashMap.put("tag", "");
            linkedHashMap.put("entity_type", "videos");
            dfi.p(1, "clip_id", str6, "_meta", linkedHashMap);
            nmbVar.C("Video.Showed", linkedHashMap);
        }
    }

    @Override // defpackage.y8u
    public final xdr o() {
        return this.k;
    }

    @Override // defpackage.y8u
    public final xdr p() {
        return this.g;
    }

    @Override // defpackage.y8u
    public final void q(float f) {
        f1d.s(f, this.a.H, null);
    }

    @Override // defpackage.y8u
    public final void r() {
        x1u x1uVar;
        i9u i9uVar = this.a;
        kxi kxiVar = i9uVar.k;
        boolean booleanValue = ((Boolean) i9uVar.w.a.getValue()).booleanValue();
        vyk vykVar = i9uVar.o.a;
        a3t a3tVar = a3t.a;
        if (booleanValue) {
            ((k1l) ((e3q) vykVar).i.getValue()).a(VolumeUnmuteCommand.INSTANCE, a3tVar);
        } else {
            ((k1l) ((e3q) vykVar).i.getValue()).a(VolumeMuteCommand.INSTANCE, a3tVar);
        }
        o3u G = i9uVar.G();
        if (G == null || (x1uVar = G.a) == null) {
            return;
        }
        byk bykVar = i9uVar.u;
        if (booleanValue) {
            bykVar.a(x1uVar, kxiVar.a.G());
        } else {
            bykVar.b(x1uVar, kxiVar.a.G());
        }
    }

    @Override // defpackage.y8u
    public final void s() {
        a(x8u.PORTRAIT);
    }

    @Override // defpackage.y8u
    public final xdr t() {
        return this.j;
    }

    @Override // defpackage.y8u
    public final void u() {
        o3u G = this.a.G();
        x1u x1uVar = G != null ? G.a : null;
        if (x1uVar != null) {
            d8u d8uVar = this.b;
            d8uVar.getClass();
            VideoClipActivity videoClipActivity = d8uVar.a;
            y supportFragmentManager = videoClipActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            a aVar = PlaybackScope.a;
            aVar.getClass();
            rre.b0(x1uVar, supportFragmentManager, videoClipActivity, aVar, d8uVar.c, ru0.DARK);
        }
    }

    @Override // defpackage.y8u
    public final xdr v() {
        return this.i;
    }

    @Override // defpackage.y8u
    public final void w() {
        i9u i9uVar = this.a;
        if (i9uVar.B.getValue() == i9uVar.K) {
            a(x8u.AUTO);
        }
    }

    @Override // defpackage.y8u
    public final void x() {
        this.a.o.b.a(new SkipCommand(), new b3t("queue_skip"));
    }
}
