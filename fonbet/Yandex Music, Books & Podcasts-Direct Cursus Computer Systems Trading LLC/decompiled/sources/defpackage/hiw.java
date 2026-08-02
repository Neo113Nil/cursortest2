package defpackage;

import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final class hiw {
    public final fiw a;
    public final hhw b;

    public hiw(fiw fiwVar, hhw hhwVar) {
        fiwVar.getClass();
        this.a = fiwVar;
        this.b = hhwVar;
    }

    public final h7a a(faq faqVar) {
        faqVar.getClass();
        this.a.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(t3g.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        return zsd.d0(((t3g) qdcVar.C(I)).v(faqVar), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(StationId stationId, e4d e4dVar, String str, cg6 cg6Var) {
        giw giwVar;
        int i;
        boolean z;
        if (cg6Var instanceof giw) {
            giwVar = (giw) cg6Var;
            int i2 = giwVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                giwVar.l = i2 - Integer.MIN_VALUE;
                Object obj = giwVar.j;
                nm6 nm6Var = nm6.a;
                i = giwVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (this.b == null) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                    giwVar.l = 1;
                    obj = x97.V(dm6.b, new akc(new m78(stationId), e4dVar, str, null, 8), giwVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                z = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(z);
            }
        }
        giwVar = new giw(this, cg6Var);
        Object obj2 = giwVar.j;
        nm6 nm6Var2 = nm6.a;
        i = giwVar.l;
        if (i != 0) {
        }
        z = ((Boolean) obj2).booleanValue();
        return Boolean.valueOf(z);
    }
}
