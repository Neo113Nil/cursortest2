package defpackage;

import ru.yandex.taxi.preorder.summary.tariffpage.data.holder.f;

/* loaded from: classes6.dex */
public final /* synthetic */ class qi31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ qi31(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        f fVar = this.b;
        switch (i) {
            case 0:
                fVar.p1.run();
                break;
            default:
                fVar.D0.setMinimumHeight(0);
                break;
        }
    }
}
