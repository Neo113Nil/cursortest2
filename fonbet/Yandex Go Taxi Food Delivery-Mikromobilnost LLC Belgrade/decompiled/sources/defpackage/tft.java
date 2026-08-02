package defpackage;

import com.yandex.messaging.domain.statuses.e;

/* loaded from: classes15.dex */
public final class tft extends vds0 {
    public final /* synthetic */ int b = 0;
    public final h3y c;
    public final Object d;
    public final Object e;

    public tft(kse kseVar, xyw xywVar, lqo lqoVar, h3y h3yVar) {
        super(kseVar.b);
        this.d = xywVar;
        this.e = lqoVar;
        this.c = h3yVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        h3y h3yVar = this.c;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                String str = (String) obj;
                return new syc(((u9u0) ((h3y) obj3).get()).w ? ((e) h3yVar.get()).a(new x6t(str)) : new syc(((rft) ((h3y) obj2).get()).a(str), 25), 26);
            default:
                return !((lqo) obj3).a(tz10.k) ? new g92(2, Boolean.FALSE) : ((rc4) h3yVar.get()).c ? new g92(2, Boolean.TRUE) : ((xyw) obj2).a(zy11.a);
        }
    }

    public tft(kse kseVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3) {
        super(kseVar.e);
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = h3yVar3;
    }
}
