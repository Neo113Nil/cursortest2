package defpackage;

import java.io.IOException;
import java.util.List;

/* loaded from: classes5.dex */
public final class m5e extends f8s {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ o5e f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5e(String str, o5e o5eVar, int i, List list) {
        super(str, true);
        this.f = o5eVar;
        this.g = i;
    }

    @Override // defpackage.f8s
    public final long a() {
        switch (this.e) {
            case 0:
                this.f.k.getClass();
                try {
                    this.f.w.H(this.g, 9);
                    synchronized (this.f) {
                        this.f.y.remove(Integer.valueOf(this.g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f.k.getClass();
                try {
                    this.f.w.H(this.g, 9);
                    synchronized (this.f) {
                        this.f.y.remove(Integer.valueOf(this.g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5e(String str, o5e o5eVar, int i, List list, boolean z) {
        super(str, true);
        this.f = o5eVar;
        this.g = i;
    }
}
