package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.passport.sloth.ui.dependencies.m;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.a;

/* loaded from: classes6.dex */
public final class a9l {
    public final t a;
    public final kxi b;
    public final jyr c = l18.b.b(hag.I(mvp.class), true);

    public a9l(t tVar, kxi kxiVar) {
        this.a = tVar;
        this.b = kxiVar;
    }

    public static final p5n b(a9l a9lVar, uft uftVar) {
        a9lVar.getClass();
        int ordinal = uftVar.ordinal();
        if (ordinal == 0) {
            return p5n.c;
        }
        if (ordinal == 1) {
            return p5n.b;
        }
        if (ordinal == 2) {
            return p5n.a;
        }
        if (ordinal == 3) {
            return p5n.d;
        }
        b6e.s();
        return null;
    }

    public final m a() {
        a aVar = PlaybackScope.a;
        aVar.getClass();
        aok aokVar = new aok(13);
        t tVar = this.a;
        y supportFragmentManager = tVar.getSupportFragmentManager();
        supportFragmentManager.getClass();
        return new m(aVar, aokVar, tVar, supportFragmentManager, null, 48);
    }

    public final void c(String str, String str2) {
        str.getClass();
        str2.getClass();
        t tVar = this.a;
        ClipboardManager clipboardManager = (ClipboardManager) tVar.getSystemService(ClipboardManager.class);
        if (clipboardManager == null) {
            return;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText(str2, str));
        if (Build.VERSION.SDK_INT <= 32) {
            String string = tVar.getString(R.string.track_info_copied);
            string.getClass();
            hag.y(tVar, string);
        }
    }

    public final boolean d(mwk mwkVar, int i) {
        mwkVar.getClass();
        return ((Boolean) wyf.q(mwkVar, new ime(new x8l(this, mwkVar, i, 0), new aok(14), new kef(1, this, a9l.class, "showVideoClipOverflow", "showVideoClipOverflow(Lru/yandex/music/data/audio/VideoClip;)Z", 0, 25)))).booleanValue();
    }
}
