package defpackage;

import android.content.Intent;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.catalog.album.screen.AlbumScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.a;
import ru.yandex.music.common.media.context.d;

/* loaded from: classes3.dex */
public final /* synthetic */ class tz implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xz b;

    public /* synthetic */ tz(xz xzVar, int i) {
        this.a = i;
        this.b = xzVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                xz xzVar = this.b;
                return new cvo(wjb.AlbumScreen, hlb.Fullscreen, (glb) null, (dvo) null, new avo(pkb.Album, xzVar.A().a), 44);
            case 1:
                xz xzVar2 = this.b;
                qne qneVar = new qne();
                qneVar.a = xzVar2.g.m();
                qneVar.b = xzVar2.getJ();
                return new vy(qneVar);
            case 2:
                xz xzVar3 = this.b;
                hy A = xzVar3.A();
                Intent intent = xzVar3.requireActivity().getIntent();
                intent.getClass();
                return new e10(xzVar3.d(), A, intent, (tmb) ((vy) xzVar3.l.getValue()).b.getValue(), xzVar3.j);
            case 3:
                xz xzVar4 = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(oz.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                t requireActivity = xzVar4.requireActivity();
                requireActivity.getClass();
                xzVar4.A();
                kxi d = xzVar4.d();
                cvo j = xzVar4.getJ();
                j.getClass();
                a aVar = PlaybackScope.a;
                aVar.getClass();
                return new f00((AlbumScreenActivity) requireActivity, new kkp(requireActivity, aVar, d), d.a, j);
            default:
                xz xzVar5 = this.b;
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(oz.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                t requireActivity2 = xzVar5.requireActivity();
                requireActivity2.getClass();
                hy A2 = xzVar5.A();
                kxi d2 = xzVar5.d();
                AlbumScreenActivity albumScreenActivity = (AlbumScreenActivity) requireActivity2;
                int i = AlbumScreenActivity.v0;
                Intent intent2 = albumScreenActivity.getIntent();
                intent2.getClass();
                PlaybackScope b = d.b(A2.a, A2.b);
                int i2 = np2.u;
                PlaybackScope w = sj2.w(intent2, b);
                y supportFragmentManager = albumScreenActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                a aVar2 = PlaybackScope.a;
                aVar2.getClass();
                return new dy(albumScreenActivity, w, supportFragmentManager, new kkp(requireActivity2, aVar2, d2));
        }
    }
}
