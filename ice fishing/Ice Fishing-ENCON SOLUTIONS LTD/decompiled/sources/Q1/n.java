package Q1;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends M1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f1617f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1618g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(String str, q qVar, int i2, Object obj, int i3) {
        super(str, true);
        this.f1616e = i3;
        this.f1617f = qVar;
        this.f1618g = i2;
    }

    @Override // M1.a
    public final long a() {
        switch (this.f1616e) {
            case 0:
                this.f1617f.f1636k.getClass();
                try {
                    this.f1617f.f1647w.m(this.f1618g, EnumC0079b.CANCEL);
                    synchronized (this.f1617f) {
                        this.f1617f.f1649y.remove(Integer.valueOf(this.f1618g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            case 1:
                this.f1617f.f1636k.getClass();
                try {
                    this.f1617f.f1647w.m(this.f1618g, EnumC0079b.CANCEL);
                    synchronized (this.f1617f) {
                        this.f1617f.f1649y.remove(Integer.valueOf(this.f1618g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
            default:
                this.f1617f.f1636k.getClass();
                synchronized (this.f1617f) {
                    this.f1617f.f1649y.remove(Integer.valueOf(this.f1618g));
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, q qVar, int i2, List list, boolean z2) {
        super(str, true);
        this.f1616e = 0;
        this.f1617f = qVar;
        this.f1618g = i2;
    }
}
