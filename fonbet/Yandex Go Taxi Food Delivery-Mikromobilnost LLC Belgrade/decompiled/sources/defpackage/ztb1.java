package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class ztb1 {
    public static final mc91 a;

    static {
        Map unmodifiableMap = Collections.unmodifiableMap(new HashMap());
        if (unmodifiableMap != null) {
            a = new mc91(null, unmodifiableMap);
        } else {
            ny61.t("Null splitInstallErrorCodeByModule");
        }
    }

    public abstract Integer a();

    public abstract Map b();
}
