package c6;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class f implements Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final transient y8.h f5762n;

    /* renamed from: u, reason: collision with root package name */
    public transient int f5763u;

    public f(i adapter, y8.h unknownFields) {
        kotlin.jvm.internal.h.e(adapter, "adapter");
        kotlin.jvm.internal.h.e(unknownFields, "unknownFields");
        this.f5762n = unknownFields;
    }

    public final y8.h a() {
        y8.h hVar = this.f5762n;
        return hVar == null ? y8.h.f41925w : hVar;
    }
}
