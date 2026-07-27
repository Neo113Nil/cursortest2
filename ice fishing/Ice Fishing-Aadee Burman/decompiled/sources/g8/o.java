package g8;

import java.util.LinkedHashMap;
import u7.C5084b;

/* loaded from: classes2.dex */
public final class o extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public C5084b f37725n;

    /* renamed from: u, reason: collision with root package name */
    public G1.a f37726u;

    /* renamed from: v, reason: collision with root package name */
    public LinkedHashMap f37727v;

    /* renamed from: w, reason: collision with root package name */
    public String f37728w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f37729x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ G1.a f37730y;

    /* renamed from: z, reason: collision with root package name */
    public int f37731z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(G1.a aVar, B7.a aVar2) {
        super(aVar2);
        this.f37730y = aVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f37729x = obj;
        this.f37731z |= Integer.MIN_VALUE;
        return G1.a.b(this.f37730y, null, this);
    }
}
