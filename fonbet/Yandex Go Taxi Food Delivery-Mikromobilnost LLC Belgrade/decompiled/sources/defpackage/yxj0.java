package defpackage;

import com.yandex.messaging.input.c;

/* loaded from: classes15.dex */
public final /* synthetic */ class yxj0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ayj0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ yxj0(ayj0 ayj0Var, String str, boolean z) {
        this.b = ayj0Var;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        boolean z = this.c;
        ayj0 ayj0Var = this.b;
        switch (i) {
            case 0:
                c cVar = (c) ayj0Var.a.b;
                cVar.i = z;
                cVar.c();
                break;
            default:
                tje.e();
                c cVar2 = (c) ayj0Var.a.b;
                cVar2.i = z;
                cVar2.c();
                break;
        }
    }

    public /* synthetic */ yxj0(ayj0 ayj0Var, boolean z) {
        this.b = ayj0Var;
        this.c = z;
    }
}
