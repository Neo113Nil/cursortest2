package g8;

import java.util.LinkedHashMap;
import u7.C5076b;

/* loaded from: classes2.dex */
public final class o extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public C5076b f37750n;

    /* renamed from: u, reason: collision with root package name */
    public I1.a f37751u;

    /* renamed from: v, reason: collision with root package name */
    public LinkedHashMap f37752v;

    /* renamed from: w, reason: collision with root package name */
    public String f37753w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f37754x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ I1.a f37755y;

    /* renamed from: z, reason: collision with root package name */
    public int f37756z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(I1.a aVar, B7.a aVar2) {
        super(aVar2);
        this.f37755y = aVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f37754x = obj;
        this.f37756z |= Integer.MIN_VALUE;
        return I1.a.a(this.f37755y, null, this);
    }
}
