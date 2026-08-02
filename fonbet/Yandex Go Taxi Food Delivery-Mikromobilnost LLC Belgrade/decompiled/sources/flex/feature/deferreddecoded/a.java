package flex.feature.deferreddecoded;

import defpackage.dez;
import defpackage.dw;
import defpackage.hwn;
import defpackage.jse;
import defpackage.kr;
import defpackage.n6u;
import defpackage.sjh;
import defpackage.tje;
import defpackage.toh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.w9h;
import defpackage.zjr;
import defpackage.zse;
import java.util.LinkedHashMap;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public final class a implements dw, dez {
    public final w9h a;
    public final tse b;
    public final zjr c = new zjr(new hwn(), EmptyList.a);
    public final LinkedHashMap w = new LinkedHashMap();

    public a(w9h w9hVar, tse tseVar) {
        this.a = w9hVar;
        this.b = tseVar;
    }

    @Override // defpackage.dez
    public final zjr a() {
        return this.c;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        toh tohVar = (toh) krVar;
        int hashCode = tohVar.a.hashCode();
        kr krVar2 = (kr) this.w.get(Integer.valueOf(hashCode));
        if (krVar2 != null) {
            n6uVar.c.b(krVar2, n6uVar.b, n6uVar.e);
            return;
        }
        sjh sjhVar = uyj.a;
        tje.N(this.b, (jse) zse.a.w, null, new DeferredDecodingActionHandler$handle$2(this, tohVar, n6uVar, hashCode, null), 2);
    }
}
