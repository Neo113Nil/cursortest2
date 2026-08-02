package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public interface db7 extends ma7 {
    long a(nb7 nb7Var);

    default Map b() {
        return Collections.EMPTY_MAP;
    }

    void close();

    Uri getUri();

    void q(t6t t6tVar);
}
