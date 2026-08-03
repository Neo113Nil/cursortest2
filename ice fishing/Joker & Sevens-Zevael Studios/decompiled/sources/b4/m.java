package b4;

import com.onesignal.inAppMessages.internal.display.impl.a;
import x.o0;
import x.z0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f998a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f999b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1000c;

    public /* synthetic */ m(int i10, Object obj, boolean z10) {
        this.f998a = i10;
        this.f999b = obj;
        this.f1000c = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(long j3, long j6, hc.c cVar) {
        o0 o0Var;
        int i10;
        long j10;
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i11 = o0Var.f7864j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                o0Var.f7864j = i11 - Integer.MIN_VALUE;
                Object obj = o0Var.f7862h;
                i10 = o0Var.f7864j;
                if (i10 != 0) {
                    v6.a.W(obj);
                    if (!this.f1000c) {
                        j10 = 0;
                        return new s2.p(j10);
                    }
                    z0 z0Var = (z0) this.f999b;
                    o0Var.f7861g = j6;
                    o0Var.f7864j = 1;
                    obj = z0Var.b(j6, o0Var);
                    gc.a aVar = gc.a.f2559g;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j6 = o0Var.f7861g;
                    v6.a.W(obj);
                }
                j10 = s2.p.d(j6, ((s2.p) obj).f6404a);
                return new s2.p(j10);
            }
        }
        o0Var = new o0(this, cVar);
        Object obj2 = o0Var.f7862h;
        i10 = o0Var.f7864j;
        if (i10 != 0) {
        }
        j10 = s2.p.d(j6, ((s2.p) obj2).f6404a);
        return new s2.p(j10);
    }

    public String toString() {
        switch (this.f998a) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return "{" + ((String) this.f999b) + "}" + this.f1000c;
            default:
                return super.toString();
        }
    }

    public m(String str, boolean z10) {
        this.f998a = 0;
        this.f1000c = z10;
        this.f999b = str;
    }
}
