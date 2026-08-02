package defpackage;

import com.yandex.go.payments.shared.y;

/* loaded from: classes13.dex */
public final /* synthetic */ class yue implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y b;

    public /* synthetic */ yue(y yVar, int i) {
        this.a = i;
        this.b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        y yVar = this.b;
        switch (i) {
            case 0:
                yVar.d();
                break;
            case 1:
                yVar.h();
                break;
            case 2:
                yVar.h();
                break;
            case 3:
                yVar.h();
                break;
            case 4:
                yVar.h();
                break;
            default:
                yVar.h();
                break;
        }
    }
}
