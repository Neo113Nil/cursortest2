package defpackage;

import com.yandex.messaging.internal.view.timeline.d;

/* loaded from: classes15.dex */
public final /* synthetic */ class tb5 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ tb5(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                return (dx10) dVar.e0().i.get();
            default:
                dVar.r0();
                return zy11.a;
        }
    }
}
