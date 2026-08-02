package defpackage;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class n5e extends f8s {
    public final /* synthetic */ o5e e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5e(String str, o5e o5eVar, int i, long j) {
        super(str, true);
        this.e = o5eVar;
        this.f = i;
        this.g = j;
    }

    @Override // defpackage.f8s
    public final long a() {
        o5e o5eVar = this.e;
        try {
            o5eVar.w.I(this.f, this.g);
            return -1L;
        } catch (IOException e) {
            o5eVar.a(2, 2, e);
            return -1L;
        }
    }
}
