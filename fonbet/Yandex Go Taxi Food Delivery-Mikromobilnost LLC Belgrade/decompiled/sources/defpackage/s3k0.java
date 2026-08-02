package defpackage;

import android.text.style.URLSpan;

/* loaded from: classes15.dex */
public final /* synthetic */ class s3k0 implements u3k0, t3k0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v3k0 b;

    public /* synthetic */ s3k0(v3k0 v3k0Var, int i) {
        this.a = i;
        this.b = v3k0Var;
    }

    @Override // defpackage.u3k0
    public void a(int[] iArr) {
        int i = this.a;
        v3k0 v3k0Var = this.b;
        switch (i) {
            case 0:
                v3k0Var.d(iArr[0], iArr[1], 2, 2);
                break;
            default:
                v3k0Var.d(iArr[0], iArr[1], 2, 4);
                break;
        }
    }

    @Override // defpackage.t3k0
    public Object e() {
        return new URLSpan((String) this.b.b.poll());
    }
}
