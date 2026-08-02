package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wf6 extends yf6 {
    public final t9f a;

    public wf6(t9f t9fVar) {
        t9fVar.getClass();
        this.a = t9fVar;
    }

    @Override // defpackage.yf6
    public final t9f a(List list) {
        list.getClass();
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wf6) && Intrinsics.d(((wf6) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
