package i1;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class p implements y1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3414b;

    public /* synthetic */ p(int i2, Object obj) {
        this.f3413a = i2;
        this.f3414b = obj;
    }

    @Override // y1.c
    public final Iterator iterator() {
        switch (this.f3413a) {
            case 0:
                return ((List) this.f3414b).iterator();
            default:
                return (Iterator) this.f3414b;
        }
    }
}
