package yads;

import defpackage.tls;
import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class dx0 extends Lambda implements tls {
    public static final dx0 w = new dx0();

    public dx0() {
        super(1);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return entry.getKey() + "=" + entry.getValue();
    }
}
