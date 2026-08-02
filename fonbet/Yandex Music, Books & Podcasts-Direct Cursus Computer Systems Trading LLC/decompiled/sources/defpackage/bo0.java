package defpackage;

import ru.yandex.video.m3.data.Size;

/* loaded from: classes6.dex */
public final class bo0 implements su3 {
    public final zsb a;

    public bo0(zsb zsbVar) {
        this.a = zsbVar;
    }

    @Override // defpackage.su3
    public final Size c() {
        zsb zsbVar = this.a;
        int length = zsbVar.length();
        dsc dscVar = null;
        for (int i = 0; i < length; i++) {
            dsc e = zsbVar.e(i);
            if (dscVar == null || e.v > dscVar.v) {
                dscVar = e;
            }
        }
        if (dscVar != null) {
            return v3g.o(dscVar.u, dscVar.v);
        }
        return null;
    }
}
