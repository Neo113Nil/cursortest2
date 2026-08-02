package defpackage;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class l5e extends f8s {
    public final /* synthetic */ o5e e;
    public final /* synthetic */ int f;
    public final /* synthetic */ hi3 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5e(String str, o5e o5eVar, int i, hi3 hi3Var, int i2, boolean z) {
        super(str, true);
        this.e = o5eVar;
        this.f = i;
        this.g = hi3Var;
        this.h = i2;
    }

    @Override // defpackage.f8s
    public final long a() {
        try {
            b3i b3iVar = this.e.k;
            hi3 hi3Var = this.g;
            int i = this.h;
            b3iVar.getClass();
            hi3Var.skip(i);
            this.e.w.H(this.f, 9);
            synchronized (this.e) {
                this.e.y.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
