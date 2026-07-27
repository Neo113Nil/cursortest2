package d1;

import a1.AbstractC0421e;
import a1.j;
import a1.n;
import java.util.List;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4455a extends f {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f37184v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4455a(List list, int i) {
        super(0, list);
        this.f37184v = i;
    }

    @Override // d1.e
    public final AbstractC0421e a() {
        switch (this.f37184v) {
            case 0:
                return new a1.f((List) this.f37200u, 0);
            case 1:
                return new j((List) this.f37200u, 0);
            case 2:
                return new a1.f((List) this.f37200u, 1);
            case 3:
                return new j((List) this.f37200u, 1);
            case 4:
                return new j((List) this.f37200u, 2);
            case 5:
                return new n((List) this.f37200u);
            default:
                return new a1.f((List) this.f37200u, 2);
        }
    }
}
