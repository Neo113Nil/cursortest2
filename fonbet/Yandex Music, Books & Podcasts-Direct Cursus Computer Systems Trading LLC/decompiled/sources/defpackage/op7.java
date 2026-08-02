package defpackage;

import java.util.LinkedList;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public abstract class op7 {
    public static final co6 a;
    public static final co6 b;

    static {
        WebPath$Storage webPath$Storage = WebPath$Storage.DEFAULT_LIBRARY;
        a = new co6(new jcv("https://avatars.mds.yandex.net/get-music-misc/70683/img.654e3808fdf76a26a2eb5b16/%%", webPath$Storage), qo6.e, null);
        b = new co6(new jcv("https://avatars.mds.yandex.net/get-music-misc/70683/img.6745ef31c1cb0d5e0ff55023/%%", webPath$Storage), qo6.l, null);
    }

    public static final CoverPath a(cvl cvlVar) {
        if (cvlVar == null) {
            CoverPath none = CoverPath.none();
            none.getClass();
            return none;
        }
        if (cvlVar.d()) {
            return new jcv("https://avatars.mds.yandex.net/get-music-misc/2413828/img.660c21990c45ca475f1f453b/%%", WebPath$Storage.ENTITY_BACKGROUND_IMG);
        }
        String str = cvlVar.s;
        CoverPath jcvVar = str != null ? new jcv(str, WebPath$Storage.ENTITY_BACKGROUND_IMG) : CoverPath.none();
        jcvVar.getClass();
        return jcvVar;
    }

    public static final co6 b(eul eulVar) {
        eulVar.getClass();
        boolean z = eulVar.g;
        if (z) {
            return a;
        }
        if (!z) {
            return new co6(kg5.M(eulVar.d, WebPath$Storage.AVATARS), qo6.e, null);
        }
        b6e.s();
        return null;
    }

    public static final co6 c(cvl cvlVar) {
        CoverPath none;
        LinkedList linkedList;
        if (cvlVar == null) {
            CoverPath none2 = CoverPath.none();
            none2.getClass();
            return new co6(none2, qo6.e, null);
        }
        if (cvlVar.d()) {
            return a;
        }
        tn6 tn6Var = cvlVar.p;
        if (tn6Var == null || (linkedList = tn6Var.b) == null || (none = (CoverPath) CollectionsKt.firstOrNull(linkedList)) == null) {
            none = CoverPath.none();
            none.getClass();
        }
        return new co6(none, qo6.e, null);
    }
}
