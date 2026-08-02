package defpackage;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class k5e extends f8s {
    public final /* synthetic */ int e;
    public final /* synthetic */ o5e f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k5e(String str, o5e o5eVar, int i, int i2, int i3) {
        super(str, true);
        this.e = i3;
        this.f = o5eVar;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.f8s
    public final long a() {
        switch (this.e) {
            case 0:
                o5e o5eVar = this.f;
                try {
                    o5eVar.w.D(this.g, this.h, true);
                    return -1L;
                } catch (IOException e) {
                    o5eVar.a(2, 2, e);
                    return -1L;
                }
            case 1:
                b3i b3iVar = this.f.k;
                int i = this.h;
                b3iVar.getClass();
                if (i == 0) {
                    throw null;
                }
                synchronized (this.f) {
                    this.f.y.remove(Integer.valueOf(this.g));
                }
                return -1L;
            default:
                o5e o5eVar2 = this.f;
                try {
                    int i2 = this.g;
                    int i3 = this.h;
                    if (i3 == 0) {
                        throw null;
                    }
                    o5eVar2.w.H(i2, i3);
                    return -1L;
                } catch (IOException e2) {
                    o5eVar2.a(2, 2, e2);
                    return -1L;
                }
        }
    }
}
