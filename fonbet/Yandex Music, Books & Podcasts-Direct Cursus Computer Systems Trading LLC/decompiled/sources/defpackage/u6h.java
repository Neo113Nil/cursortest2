package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class u6h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uif b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ u6h(int i, Function0 function0) {
        this.a = i;
        this.b = (uif) function0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, uif] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function0, uif] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function0, uif] */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invoke();
                break;
            case 1:
                this.b.invoke();
                break;
            case 2:
                this.b.invoke();
                break;
            default:
                this.b.invoke();
                break;
        }
    }
}
