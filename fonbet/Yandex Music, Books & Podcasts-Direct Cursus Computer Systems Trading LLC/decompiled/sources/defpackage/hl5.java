package defpackage;

import android.content.Context;

/* loaded from: classes4.dex */
public final class hl5 implements va7 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public hl5(Context context, f6e f6eVar) {
        this.a = 2;
        this.b = context.getApplicationContext();
        this.c = f6eVar;
    }

    @Override // defpackage.va7
    public final db7 a() {
        switch (this.a) {
            case 0:
                return new il5((liq) this.c, ((bq3) this.b).a());
            case 1:
                return new v66(((hl5) this.c).a(), (z66) this.b);
            default:
                return new xk7((Context) this.b, ((f6e) this.c).a());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hl5(Context context) {
        this(context, new zm7());
        this.a = 2;
    }

    public /* synthetic */ hl5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
