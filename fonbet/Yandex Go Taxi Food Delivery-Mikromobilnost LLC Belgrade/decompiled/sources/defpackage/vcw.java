package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.feedback.interactor.a;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class vcw extends ad5 {
    public final u8w A;
    public final h2t x;
    public final pcw y;
    public final a z;

    public vcw(h2t h2tVar, pcw pcwVar, a aVar, u8w u8wVar) {
        super(qcw.class);
        this.x = h2tVar;
        this.y = pcwVar;
        this.z = aVar;
        this.A = u8wVar;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        u8w u8wVar = this.A;
        u8wVar.getClass();
        u8wVar.a.a("Intercity.Feedback.Card.Closed", new HashMap(), 1, new HashMap());
    }
}
