package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class zk7 implements va7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zk7(int i, Function0 function0) {
        this.a = i;
        this.b = (uif) function0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function0, uif] */
    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // defpackage.va7
    public final db7 a() {
        switch (this.a) {
            case 0:
                return (db7) ((uif) this.b).invoke();
            case 1:
                return (db7) ((uif) this.b).invoke();
            default:
                return new bl4(((sco) this.b).a());
        }
    }

    public /* synthetic */ zk7(sco scoVar) {
        this.a = 2;
        this.b = scoVar;
    }
}
