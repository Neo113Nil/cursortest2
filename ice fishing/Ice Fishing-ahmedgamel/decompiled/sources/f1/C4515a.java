package f1;

import A1.AbstractC0269k;
import c1.AbstractC0545e;
import c1.f;
import c1.j;
import c1.n;
import java.util.List;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4515a extends AbstractC0269k {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f37424v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4515a(List list, int i) {
        super(2, list);
        this.f37424v = i;
    }

    @Override // f1.e
    public final AbstractC0545e a() {
        switch (this.f37424v) {
            case 0:
                return new f((List) this.f67u, 0);
            case 1:
                return new j((List) this.f67u, 0);
            case 2:
                return new f((List) this.f67u, 1);
            case 3:
                return new j((List) this.f67u, 1);
            case 4:
                return new j((List) this.f67u, 2);
            case 5:
                return new n((List) this.f67u);
            default:
                return new f((List) this.f67u, 2);
        }
    }
}
