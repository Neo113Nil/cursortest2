package J1;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f360a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f361b;

    public /* synthetic */ d(int i, Object obj) {
        this.f360a = i;
        this.f361b = obj;
    }

    @Override // J1.f
    public final Iterator iterator() {
        switch (this.f360a) {
            case 0:
                return new c(this);
            case 1:
                return (Iterator) this.f361b;
            default:
                return ((Collection) this.f361b).iterator();
        }
    }
}
