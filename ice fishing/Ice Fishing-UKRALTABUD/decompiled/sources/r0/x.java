package r0;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class x extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public C0238L f2934i;

    /* renamed from: j, reason: collision with root package name */
    public Set f2935j;

    /* renamed from: k, reason: collision with root package name */
    public Map f2936k;

    /* renamed from: l, reason: collision with root package name */
    public Iterator f2937l;

    /* renamed from: m, reason: collision with root package name */
    public G.d f2938m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f2939n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0238L f2940o;

    /* renamed from: p, reason: collision with root package name */
    public int f2941p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C0238L c0238l, x0.b bVar) {
        super(bVar);
        this.f2940o = c0238l;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f2939n = obj;
        this.f2941p |= Integer.MIN_VALUE;
        return C0238L.s(this.f2940o, null, this);
    }
}
