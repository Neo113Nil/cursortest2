package defpackage;

import java.util.LinkedHashSet;

/* loaded from: classes10.dex */
public final class ws7 {
    public final LinkedHashSet a;

    public ws7() {
        this.a = new LinkedHashSet();
    }

    public final xs7 a() {
        return new xs7(this.a);
    }

    public final void b(int i) {
        d6z.y("The specified lens facing is invalid.", i != -1);
        this.a.add(new nby(i));
    }

    public ws7(LinkedHashSet linkedHashSet) {
        this.a = new LinkedHashSet(linkedHashSet);
    }
}
