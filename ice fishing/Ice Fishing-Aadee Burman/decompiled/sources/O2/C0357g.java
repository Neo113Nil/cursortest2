package O2;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: O2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0357g {

    /* renamed from: a, reason: collision with root package name */
    public final Set f2244a;

    public C0357g(int i) {
        switch (i) {
            case 1:
                this.f2244a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
                break;
            default:
                this.f2244a = Collections.newSetFromMap(new WeakHashMap());
                break;
        }
    }
}
