package n5;

import java.util.List;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends k implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f5065g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f5066h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v0.c f5067i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m5.d f5068j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m5.c f5069k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List list, String str, v0.c cVar, m5.d dVar, m5.c cVar2) {
        super(0);
        this.f5065g = list;
        this.f5066h = str;
        this.f5067i = cVar;
        this.f5068j = dVar;
        this.f5069k = cVar2;
    }

    @Override // oc.a
    public final Object invoke() {
        return new m5.c(this.f5065g, this.f5066h, this.f5067i, this.f5068j, this.f5069k);
    }
}
