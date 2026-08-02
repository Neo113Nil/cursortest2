package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class hzf implements zyf {
    public final /* synthetic */ nyf a;
    public final /* synthetic */ aqd b;

    public hzf(aqd aqdVar, nyf nyfVar) {
        this.b = aqdVar;
        this.a = nyfVar;
    }

    @Override // defpackage.zyf
    public final void onDestroy() {
        ((HashMap) this.b.b).remove(this.a);
    }

    @Override // defpackage.zyf
    public final void b() {
    }

    @Override // defpackage.zyf
    public final void onStop() {
    }
}
