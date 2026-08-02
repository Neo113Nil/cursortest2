package defpackage;

import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes10.dex */
public final /* synthetic */ class qkh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref$ObjectRef b;

    public /* synthetic */ qkh(int i, Ref$ObjectRef ref$ObjectRef) {
        this.a = i;
        this.b = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, dai] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Ref$ObjectRef ref$ObjectRef = this.b;
        switch (i) {
            case 0:
                sls slsVar = (sls) ref$ObjectRef.element;
                if (slsVar != null) {
                    slsVar.invoke();
                    break;
                }
                break;
            case 1:
                ((g18) ref$ObjectRef.element).cancel();
                ref$ObjectRef.element = g18.u1;
                break;
            default:
                gr71 gr71Var = (gr71) ref$ObjectRef.element;
                if (gr71Var != null) {
                    gr71Var.a();
                    break;
                }
                break;
        }
    }
}
