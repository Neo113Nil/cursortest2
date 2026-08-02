package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class w2i implements p3c {
    public final /* synthetic */ int a;
    public final szm b;
    public final szm c;

    public /* synthetic */ w2i(szm szmVar, szm szmVar2, int i) {
        this.a = i;
        this.b = szmVar;
        this.c = szmVar2;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new v2i((Context) ((fs6) this.b).b, (es6) ((fs6) this.c).get());
            default:
                return new bko(new vpl(), new qcm(), dd2.f, (zto) this.b.get(), this.c);
        }
    }
}
