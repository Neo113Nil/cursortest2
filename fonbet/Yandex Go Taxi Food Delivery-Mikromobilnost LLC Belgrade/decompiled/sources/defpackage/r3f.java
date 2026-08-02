package defpackage;

import com.yandex.go.payments.shared.wizard.welcome.a;

/* loaded from: classes13.dex */
public final /* synthetic */ class r3f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ r3f(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.Lg();
                break;
            default:
                aVar.Mg();
                break;
        }
    }
}
