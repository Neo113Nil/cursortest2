package defpackage;

import java.util.HashMap;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes6.dex */
public final class yhb {
    public final HashMap a = new HashMap();

    public final qxm a(String str) {
        if (str == null) {
            return null;
        }
        Assertions.assertUIThread();
        qxm qxmVar = (qxm) this.a.get(str);
        Assertions.assertNonNull(qxmVar);
        return qxmVar;
    }
}
