package b0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r0 extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f881g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f882h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s.z f883i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q0 f884j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(int i10, int i11, s.z zVar, q0 q0Var) {
        super(1);
        this.f881g = i10;
        this.f882h = i11;
        this.f883i = zVar;
        this.f884j = q0Var;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        h hVar = (h) obj;
        x4.c cVar = hVar.f827c;
        int max = Math.max(this.f881g, hVar.f825a);
        int min = Math.min(this.f882h, (r0 + hVar.f826b) - 1);
        if (max <= min) {
            while (true) {
                f fVar = new f(max);
                this.f883i.h(max, fVar);
                q0 q0Var = this.f884j;
                ((Object[]) q0Var.f875c)[max - q0Var.f873a] = fVar;
                if (max == min) {
                    break;
                }
                max++;
            }
        }
        return ac.o.f277a;
    }
}
