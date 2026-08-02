package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class fs6 implements p3c {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ fs6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new es6((Context) ((fs6) this.b).b, new vpl(), new qcm());
            default:
                return this.b;
        }
    }
}
