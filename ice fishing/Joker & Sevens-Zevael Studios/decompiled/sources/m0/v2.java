package m0;

import java.util.Iterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class v2 implements Iterable, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public final j2 f4790g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4791h;

    /* renamed from: i, reason: collision with root package name */
    public final b f4792i;

    public v2(j2 j2Var, int i10, q0 q0Var, b bVar) {
        this.f4790g = j2Var;
        this.f4791h = i10;
        this.f4792i = bVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p0(this.f4790g, this.f4791h, null, this.f4792i);
    }
}
