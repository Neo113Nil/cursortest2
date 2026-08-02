package defpackage;

import java.util.Map;

/* loaded from: classes5.dex */
public final class zzt implements e0q {
    public final Map a;

    public zzt(Map map) {
        this.a = map;
    }

    @Override // defpackage.e0q
    public final e0q merge(e0q e0qVar) {
        if (!(e0qVar instanceof zzt)) {
            return this;
        }
        return new zzt(uah.i(this.a, ((zzt) e0qVar).a));
    }
}
