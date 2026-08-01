package c6;

import g1.C4523c;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class e extends i {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5584t;

    /* renamed from: u, reason: collision with root package name */
    public final i f5585u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, int i) {
        super(d.f5580w, s.a(int[].class), iVar.f5605c, new int[0], 32);
        this.f5584t = i;
        switch (i) {
            case 1:
                super(d.f5580w, s.a(long[].class), iVar.f5605c, new long[0], 32);
                this.f5585u = iVar;
                break;
            default:
                this.f5585u = iVar;
                break;
        }
    }

    @Override // c6.i
    public final Object b(C0544a c0544a) {
        i iVar = this.f5585u;
        switch (this.f5584t) {
            case 0:
                return new int[]{((Number) iVar.b(c0544a)).intValue()};
            case 1:
                return new long[]{((Number) iVar.b(c0544a)).longValue()};
            default:
                int c9 = c0544a.c();
                Object obj = iVar.f5606d;
                while (true) {
                    int f3 = c0544a.f();
                    if (f3 == -1) {
                        c0544a.d(c9);
                        return obj;
                    }
                    if (f3 == 1) {
                        obj = iVar.b(c0544a);
                    } else {
                        c0544a.k(f3);
                    }
                }
        }
    }

    @Override // c6.i
    public final Object c(C4523c c4523c) {
        i iVar = this.f5585u;
        switch (this.f5584t) {
            case 0:
                return new int[]{((Number) iVar.c(c4523c)).intValue()};
            case 1:
                return new long[]{((Number) iVar.c(c4523c)).longValue()};
            default:
                long A9 = c4523c.A();
                Object obj = iVar.f5606d;
                while (true) {
                    int f3 = ((C0544a) c4523c.f37627u).f();
                    if (f3 == -1) {
                        c4523c.C(A9);
                        return obj;
                    }
                    if (f3 == 1) {
                        obj = iVar.c(c4523c);
                    } else {
                        c4523c.F(f3);
                    }
                }
        }
    }

    @Override // c6.i
    public final void d(F1.a writer, Object obj) {
        switch (this.f5584t) {
            case 0:
                int[] value = (int[]) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value, "value");
                for (int i : value) {
                    this.f5585u.d(writer, Integer.valueOf(i));
                }
                break;
            case 1:
                long[] value2 = (long[]) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value2, "value");
                for (long j6 : value2) {
                    this.f5585u.d(writer, Long.valueOf(j6));
                }
                break;
            default:
                kotlin.jvm.internal.h.e(writer, "writer");
                if (obj != null) {
                    i iVar = this.f5585u;
                    if (!obj.equals(iVar.f5606d)) {
                        iVar.e(writer, 1, obj);
                        break;
                    }
                }
                break;
        }
    }

    @Override // c6.i
    public void e(F1.a writer, int i, Object obj) {
        switch (this.f5584t) {
            case 0:
                int[] iArr = (int[]) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                if (iArr != null && iArr.length != 0) {
                    super.e(writer, i, iArr);
                    break;
                }
                break;
            case 1:
                long[] jArr = (long[]) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                if (jArr != null && jArr.length != 0) {
                    super.e(writer, i, jArr);
                    break;
                }
                break;
            default:
                super.e(writer, i, obj);
                break;
        }
    }

    @Override // c6.i
    public final int f(Object obj) {
        switch (this.f5584t) {
            case 0:
                int[] value = (int[]) obj;
                kotlin.jvm.internal.h.e(value, "value");
                int i = 0;
                for (int i6 : value) {
                    i += this.f5585u.f(Integer.valueOf(i6));
                }
                return i;
            case 1:
                long[] value2 = (long[]) obj;
                kotlin.jvm.internal.h.e(value2, "value");
                int i9 = 0;
                for (long j6 : value2) {
                    i9 += this.f5585u.f(Long.valueOf(j6));
                }
                return i9;
            default:
                if (obj != null) {
                    i iVar = this.f5585u;
                    if (!obj.equals(iVar.f5606d)) {
                        return iVar.g(1, obj);
                    }
                }
                return 0;
        }
    }

    @Override // c6.i
    public int g(int i, Object obj) {
        switch (this.f5584t) {
            case 0:
                int[] iArr = (int[]) obj;
                if (iArr == null || iArr.length == 0) {
                    return 0;
                }
                return super.g(i, iArr);
            case 1:
                long[] jArr = (long[]) obj;
                if (jArr == null || jArr.length == 0) {
                    return 0;
                }
                return super.g(i, jArr);
            default:
                return super.g(i, obj);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(i iVar, O7.c cVar, Object obj) {
        super(r2, cVar, r4, obj, 32);
        this.f5584t = 2;
        d dVar = d.f5580w;
        n nVar = n.f5619v;
        this.f5585u = iVar;
    }
}
