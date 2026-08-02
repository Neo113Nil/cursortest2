package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.hmm;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llpi;", "Lhmm;", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class lpi extends hmm {
    public final LinkedHashMap a;
    public final AtomicBoolean b;

    public lpi(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new AtomicBoolean(z);
    }

    @Override // defpackage.hmm
    public final Object a(hmm.a aVar) {
        aVar.getClass();
        return this.a.get(aVar);
    }

    public final void d() {
        if (this.b.get()) {
            xq0.q("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void e() {
        d();
        this.a.clear();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lpi)) {
            return false;
        }
        return Intrinsics.d(this.a, ((lpi) obj).a);
    }

    public final Object f(hmm.a aVar) {
        aVar.getClass();
        d();
        return this.a.remove(aVar);
    }

    public final void g(hmm.a aVar, Object obj) {
        aVar.getClass();
        h(aVar, obj);
    }

    public final void h(hmm.a aVar, Object obj) {
        aVar.getClass();
        d();
        if (obj == null) {
            f(aVar);
            return;
        }
        boolean z = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.a;
        if (!z) {
            linkedHashMap.put(aVar, obj);
            return;
        }
        Set unmodifiableSet = Collections.unmodifiableSet(CollectionsKt.A0((Iterable) obj));
        unmodifiableSet.getClass();
        linkedHashMap.put(aVar, unmodifiableSet);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return CollectionsKt.X(this.a.entrySet(), ",\n", "{\n", "\n}", kpi.r, 24);
    }

    public /* synthetic */ lpi(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
