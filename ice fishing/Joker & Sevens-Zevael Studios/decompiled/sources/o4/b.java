package o4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f5185a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(false));

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f5186b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(true));

    /* renamed from: c, reason: collision with root package name */
    public final v f5187c;

    /* renamed from: d, reason: collision with root package name */
    public final u7.d f5188d;

    /* renamed from: e, reason: collision with root package name */
    public final m7.g f5189e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5190f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5191g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5192h;

    public b(p6.i iVar) {
        String str = w.f5225a;
        this.f5187c = new v();
        this.f5188d = new u7.d();
        this.f5189e = new m7.g(8);
        this.f5190f = 4;
        this.f5191g = Integer.MAX_VALUE;
        this.f5192h = 20;
    }
}
