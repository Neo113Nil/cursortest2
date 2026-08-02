package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class s7w {
    public final Set a;

    public s7w(ArrayList arrayList) {
        this.a = CollectionsKt.z0(arrayList);
    }

    public s7w(Set set) {
        this.a = set;
    }

    public /* synthetic */ s7w() {
        this(new LinkedHashSet());
    }
}
