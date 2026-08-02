package defpackage;

import com.yandex.mapkit.geometry.BoundingBox;

/* loaded from: classes13.dex */
public final /* synthetic */ class su40 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ BoundingBox c;

    public /* synthetic */ su40(tls tlsVar, BoundingBox boundingBox, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = boundingBox;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        BoundingBox boundingBox = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(new f7p(boundingBox));
                break;
            default:
                tlsVar.invoke(boundingBox);
                break;
        }
        return zy11Var;
    }
}
