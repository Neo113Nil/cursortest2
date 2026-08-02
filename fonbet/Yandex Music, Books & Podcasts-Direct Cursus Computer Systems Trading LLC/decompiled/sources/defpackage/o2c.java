package defpackage;

import java.util.Map;

/* loaded from: classes6.dex */
public final class o2c implements Map.Entry, j9f {
    public final long a;

    public o2c(long j) {
        this.a = j;
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "EXTRA_INTERNAL_STALLED_KEY";
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return Long.valueOf(this.a);
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
