package N2;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: N2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321g {

    /* renamed from: a, reason: collision with root package name */
    public final Set f2061a;

    public C0321g(int i) {
        switch (i) {
            case 1:
                this.f2061a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
                break;
            default:
                this.f2061a = Collections.newSetFromMap(new WeakHashMap());
                break;
        }
    }
}
