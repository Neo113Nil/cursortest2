package b0;

import java.util.Comparator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f864b;

    public /* synthetic */ o(u uVar, int i10) {
        this.f863a = i10;
        this.f864b = uVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f863a) {
            case 0:
                Object obj3 = ((a0.t) obj).f126g;
                u uVar = this.f864b;
                return a.a.p(Integer.valueOf(uVar.b(obj3)), Integer.valueOf(uVar.b(((a0.t) obj2).f126g)));
            default:
                Object obj4 = ((a0.t) obj2).f126g;
                u uVar2 = this.f864b;
                return a.a.p(Integer.valueOf(uVar2.b(obj4)), Integer.valueOf(uVar2.b(((a0.t) obj).f126g)));
        }
    }
}
