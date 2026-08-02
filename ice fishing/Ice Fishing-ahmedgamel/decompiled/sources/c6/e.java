package c6;

import i1.C4586c;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class e extends i {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5760t;

    /* renamed from: u, reason: collision with root package name */
    public final i f5761u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, int i) {
        super(d.f5756w, s.a(int[].class), iVar.f5781c, new int[0], 32);
        this.f5760t = i;
        switch (i) {
            case 1:
                super(d.f5756w, s.a(long[].class), iVar.f5781c, new long[0], 32);
                this.f5761u = iVar;
                break;
            default:
                this.f5761u = iVar;
                break;
        }
    }

    @Override // c6.i
    public final Object b(C0555a c0555a) {
        i iVar = this.f5761u;
        switch (this.f5760t) {
            case 0:
                return new int[]{((Number) iVar.b(c0555a)).intValue()};
            case 1:
                return new long[]{((Number) iVar.b(c0555a)).longValue()};
            default:
                int c9 = c0555a.c();
                Object obj = iVar.f5782d;
                while (true) {
                    int f2 = c0555a.f();
                    if (f2 == -1) {
                        c0555a.d(c9);
                        return obj;
                    }
                    if (f2 == 1) {
                        obj = iVar.b(c0555a);
                    } else {
                        c0555a.k(f2);
                    }
                }
        }
    }

    @Override // c6.i
    public final Object c(C4586c c4586c) {
        i iVar = this.f5761u;
        switch (this.f5760t) {
            case 0:
                return new int[]{((Number) iVar.c(c4586c)).intValue()};
            case 1:
                return new long[]{((Number) iVar.c(c4586c)).longValue()};
            default:
                long n9 = c4586c.n();
                Object obj = iVar.f5782d;
                while (true) {
                    int f2 = ((C0555a) c4586c.f38154u).f();
                    if (f2 == -1) {
                        c4586c.p(n9);
                        return obj;
                    }
                    if (f2 == 1) {
                        obj = iVar.c(c4586c);
                    } else {
                        c4586c.t(f2);
                    }
                }
        }
    }

    @Override // c6.i
    public final void d(n4.c writer, Object obj) {
        switch (this.f5760t) {
            case 0:
                int[] value = (int[]) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value, "value");
                for (int i : value) {
                    this.f5761u.d(writer, Integer.valueOf(i));
                }
                break;
            case 1:
                long[] value2 = (long[]) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value2, "value");
                for (long j6 : value2) {
                    this.f5761u.d(writer, Long.valueOf(j6));
                }
                break;
            default:
                kotlin.jvm.internal.h.e(writer, "writer");
                if (obj != null) {
                    i iVar = this.f5761u;
                    if (!obj.equals(iVar.f5782d)) {
                        iVar.e(writer, 1, obj);
                        break;
                    }
                }
                break;
        }
    }

    @Override // c6.i
    public void e(n4.c writer, int i, Object obj) {
        switch (this.f5760t) {
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
        switch (this.f5760t) {
            case 0:
                int[] value = (int[]) obj;
                kotlin.jvm.internal.h.e(value, "value");
                int i = 0;
                for (int i4 : value) {
                    i += this.f5761u.f(Integer.valueOf(i4));
                }
                return i;
            case 1:
                long[] value2 = (long[]) obj;
                kotlin.jvm.internal.h.e(value2, "value");
                int i6 = 0;
                for (long j6 : value2) {
                    i6 += this.f5761u.f(Long.valueOf(j6));
                }
                return i6;
            default:
                if (obj != null) {
                    i iVar = this.f5761u;
                    if (!obj.equals(iVar.f5782d)) {
                        return iVar.g(1, obj);
                    }
                }
                return 0;
        }
    }

    @Override // c6.i
    public int g(int i, Object obj) {
        switch (this.f5760t) {
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
        this.f5760t = 2;
        d dVar = d.f5756w;
        n nVar = n.f5795v;
        this.f5761u = iVar;
    }
}
