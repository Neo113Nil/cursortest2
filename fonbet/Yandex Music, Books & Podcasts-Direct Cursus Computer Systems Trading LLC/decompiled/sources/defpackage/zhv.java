package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zhv {
    public final boolean a;
    public final jyr b;
    public final ArrayList c = new ArrayList();

    public zhv(jyr jyrVar, boolean z) {
        this.a = z;
        this.b = jyrVar;
    }

    public final void a(yhv yhvVar) {
        if (this.a) {
            giv givVar = (giv) this.b.getValue();
            givVar.getClass();
            ((fgp) givVar.f.getValue()).c(new biv(yhvVar));
        } else {
            while (true) {
                ArrayList arrayList = this.c;
                if (arrayList.size() < 100) {
                    arrayList.add(yhvVar);
                    return;
                }
                arrayList.remove(0);
            }
        }
    }
}
