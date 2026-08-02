package defpackage;

import java.util.List;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes3.dex */
public abstract class l6u {
    public static final List a;
    public static final m6u b;

    static {
        z9u z9uVar = new z9u(0, "1", "Топ-1 на Яндекс Музыке сейчас", "https://mixkit.imgix.net/videos/preview/mixkit-young-man-walking-listening-to-music-from-his-headphones-4855-0.jpg?q=80&auto=format%2Ccompress&w=460", "Title 1", "Subtitle 1", "16:40", jzb.c, true, null);
        CoverPath none = CoverPath.none();
        none.getClass();
        c5b c5bVar = c5b.a;
        m4u m4uVar = new m4u(z9uVar, new x1u("1", "Title 1", "playerId", none, "", 1000L, c5bVar, c5bVar, true, t75.c(h94.f), t75.c(new hs5(gs5.d, "1")), null, null), true);
        z9u z9uVar2 = new z9u(1, "2", "Топ-1 на Яндекс Музыке сейчас", "https://mixkit.imgix.net/videos/preview/mixkit-young-man-walking-listening-to-music-from-his-headphones-4855-0.jpg?q=80&auto=format%2Ccompress&w=460", "Title 2", "Subtitle 2", "16:40", null, false, null);
        CoverPath none2 = CoverPath.none();
        none2.getClass();
        m4u m4uVar2 = new m4u(z9uVar2, new x1u("2", "Title 2", "playerId", none2, "", 1000L, c5bVar, c5bVar, false, c5bVar, c5bVar, null, null), false);
        z9u z9uVar3 = new z9u(2, "3", "Топ-1 на Яндекс Музыке сейчас", "https://mixkit.imgix.net/videos/preview/mixkit-young-man-walking-listening-to-music-from-his-headphones-4855-0.jpg?q=80&auto=format%2Ccompress&w=460", "Title 3", "Subtitle 3", "16:40", null, false, null);
        CoverPath none3 = CoverPath.none();
        none3.getClass();
        a = u75.h(m4uVar, m4uVar2, new m4u(z9uVar3, new x1u("3", "Title 3", "playerId", none3, "", 1000L, c5bVar, c5bVar, false, c5bVar, c5bVar, null, null), false));
        b = new m6u("1", 500L, 1000L);
    }
}
