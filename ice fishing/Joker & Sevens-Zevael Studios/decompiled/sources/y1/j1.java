package y1;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j1 implements x1.n1 {

    /* renamed from: g, reason: collision with root package name */
    public final int f8570g;

    /* renamed from: h, reason: collision with root package name */
    public final List f8571h;

    /* renamed from: i, reason: collision with root package name */
    public Float f8572i = null;

    /* renamed from: j, reason: collision with root package name */
    public Float f8573j = null;

    /* renamed from: k, reason: collision with root package name */
    public e2.h f8574k = null;

    /* renamed from: l, reason: collision with root package name */
    public e2.h f8575l = null;

    public j1(int i10, ArrayList arrayList) {
        this.f8570g = i10;
        this.f8571h = arrayList;
    }

    @Override // x1.n1
    public final boolean y() {
        return this.f8571h.contains(this);
    }
}
