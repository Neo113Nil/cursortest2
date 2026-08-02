package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class rjd implements phe {
    public final Map a;

    public rjd(Map map) {
        this.a = map;
    }

    @Override // defpackage.dtq0
    public final KSerializer select(String str) {
        return (KSerializer) this.a.get(str);
    }
}
