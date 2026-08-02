package defpackage;

import java.io.File;
import java.util.List;

/* loaded from: classes4.dex */
public interface uhr {
    List a();

    String b();

    thr c();

    File d(thr thrVar);

    default File e(thr thrVar, String str) {
        thrVar.getClass();
        str.getClass();
        File d = d(thrVar);
        if (d == null) {
            return null;
        }
        return new File(new File(d, "user_".concat(str)), "music_cache");
    }
}
