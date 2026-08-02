package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class v4p implements ag5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6p b;
    public final /* synthetic */ aqi c;
    public final /* synthetic */ j7p d;

    public /* synthetic */ v4p(g6p g6pVar, j7p j7pVar, aqi aqiVar, int i) {
        this.a = i;
        this.b = g6pVar;
        this.d = j7pVar;
        this.c = aqiVar;
    }

    @Override // defpackage.ag5
    public final void b(mqs mqsVar) {
        int i = this.a;
        mqsVar.getClass();
        switch (i) {
            case 0:
                e4p e4pVar = ((x6p) this.d).c;
                ((Number) this.c.getValue()).intValue();
                this.b.W(mqsVar, e4pVar);
                break;
            default:
                e4p e4pVar2 = ((d7p) this.d).c;
                ((Number) this.c.getValue()).intValue();
                this.b.W(mqsVar, e4pVar2);
                break;
        }
    }

    @Override // defpackage.ag5
    public final void c(mqs mqsVar) {
        int i = this.a;
        mqsVar.getClass();
        switch (i) {
            case 0:
                this.b.k(mqsVar, ((x6p) this.d).c, ((Number) this.c.getValue()).intValue());
                break;
            default:
                this.b.k(mqsVar, ((d7p) this.d).c, ((Number) this.c.getValue()).intValue());
                break;
        }
    }

    @Override // defpackage.ag5
    public final void d(mqs mqsVar) {
        int i = this.a;
        mqsVar.getClass();
        switch (i) {
            case 0:
                x6p x6pVar = (x6p) this.d;
                this.b.x(mqsVar, x6pVar.c, ((Number) this.c.getValue()).intValue(), x6pVar);
                break;
            default:
                d7p d7pVar = (d7p) this.d;
                this.b.x(mqsVar, d7pVar.c, ((Number) this.c.getValue()).intValue(), d7pVar);
                break;
        }
    }

    @Override // defpackage.ag5
    public final void e(Context context, mqs mqsVar) {
        int i = this.a;
        context.getClass();
        mqsVar.getClass();
    }
}
