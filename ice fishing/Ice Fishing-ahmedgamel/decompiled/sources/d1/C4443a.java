package d1;

import L3.o;
import a1.AbstractC0428e;
import a1.j;
import a1.n;
import java.util.List;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4443a extends o {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f37021v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4443a(List list, int i) {
        super(1, list);
        this.f37021v = i;
    }

    @Override // d1.f
    public final AbstractC0428e a() {
        switch (this.f37021v) {
            case 0:
                return new a1.f((List) this.f1720u, 0);
            case 1:
                return new j((List) this.f1720u, 0);
            case 2:
                return new a1.f((List) this.f1720u, 1);
            case 3:
                return new j((List) this.f1720u, 1);
            case 4:
                return new j((List) this.f1720u, 2);
            case 5:
                return new n((List) this.f1720u);
            default:
                return new a1.f((List) this.f1720u, 2);
        }
    }
}
