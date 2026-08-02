package Q2;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: Q2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0362g {

    /* renamed from: a, reason: collision with root package name */
    public final Set f2562a;

    public C0362g(int i) {
        switch (i) {
            case 1:
                this.f2562a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
                break;
            default:
                this.f2562a = Collections.newSetFromMap(new WeakHashMap());
                break;
        }
    }
}
