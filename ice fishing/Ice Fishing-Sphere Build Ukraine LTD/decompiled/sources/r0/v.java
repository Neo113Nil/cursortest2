package r0;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class v extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public J f2933h;

    /* renamed from: i, reason: collision with root package name */
    public Set f2934i;

    /* renamed from: j, reason: collision with root package name */
    public Map f2935j;

    /* renamed from: k, reason: collision with root package name */
    public Iterator f2936k;

    /* renamed from: l, reason: collision with root package name */
    public G.d f2937l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f2938m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ J f2939n;

    /* renamed from: o, reason: collision with root package name */
    public int f2940o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(J j2, x0.b bVar) {
        super(bVar);
        this.f2939n = j2;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f2938m = obj;
        this.f2940o |= Integer.MIN_VALUE;
        return J.s(this.f2939n, null, this);
    }
}
