package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.net.Uri;
import android.os.Build;
import androidx.fragment.app.y;
import com.yandex.passport.sloth.ui.dependencies.m;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.a;

/* loaded from: classes6.dex */
public final class til {
    public final hn5 a;
    public final y b;
    public final kxi c;
    public final nsh d;
    public final jyr e;
    public final jyr f;

    public til(hn5 hn5Var, y yVar, kxi kxiVar) {
        hn5Var.getClass();
        yVar.getClass();
        this.a = hn5Var;
        this.b = yVar;
        this.c = kxiVar;
        this.d = new nsh(hn5Var, yVar, kxiVar);
        this.e = btf.b(new ril(0, this));
        this.f = l18.b.b(hag.I(mvp.class), true);
    }

    public final void a(String str, qil qilVar) {
        int i;
        hn5 hn5Var = this.a;
        ClipboardManager clipboardManager = (ClipboardManager) hn5Var.getSystemService(ClipboardManager.class);
        if (clipboardManager == null) {
            return;
        }
        int ordinal = qilVar.ordinal();
        if (ordinal == 0) {
            i = R.string.track_title_label;
        } else {
            if (ordinal != 1) {
                b6e.s();
                return;
            }
            i = R.string.track_subtitle_label;
        }
        String string = hn5Var.getString(i);
        string.getClass();
        clipboardManager.setPrimaryClip(ClipData.newPlainText(string, str));
        if (Build.VERSION.SDK_INT <= 32) {
            String string2 = hn5Var.getString(R.string.track_info_copied);
            string2.getClass();
            hag.y(hn5Var, string2);
        }
    }

    public final m b() {
        a aVar = PlaybackScope.a;
        aVar.getClass();
        return new m(aVar, new ufl(6), this.a, this.b, null, 48);
    }

    public final void c(mwk mwkVar, int i) {
        int i2 = 24;
        wyf.q(mwkVar, new t1f(i2, new x8l(this, mwkVar, i, 1), new ufl(5), new y66(1, this, til.class, "showVideoClipOverflow", "showVideoClipOverflow(Lru/yandex/music/data/audio/VideoClip;)Z", 8, 2)));
    }

    public final void d(Uri uri) {
        String uri2 = uri.toString();
        uri2.getClass();
        w1g.y(this.a, uri2, true);
    }
}
