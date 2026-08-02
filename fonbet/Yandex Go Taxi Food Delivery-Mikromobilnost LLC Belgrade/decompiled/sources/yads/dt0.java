package yads;

import defpackage.tls;
import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class dt0 extends Lambda implements tls {
    public static final dt0 w = new dt0();

    public dt0() {
        super(1);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return entry.getKey() + "=" + entry.getValue();
    }
}
