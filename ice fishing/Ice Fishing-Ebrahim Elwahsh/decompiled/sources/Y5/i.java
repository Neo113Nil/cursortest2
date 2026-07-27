package Y5;

import g1.C4523c;
import java.util.Map;
import kotlin.jvm.internal.s;
import q7.v;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: f, reason: collision with root package name */
    public static final c f3995f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f3996g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f3997h;
    public static final c i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f3998j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f3999k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f4000l;

    /* renamed from: m, reason: collision with root package name */
    public static final c f4001m;

    /* renamed from: n, reason: collision with root package name */
    public static final c f4002n;

    /* renamed from: o, reason: collision with root package name */
    public static final c f4003o;

    /* renamed from: p, reason: collision with root package name */
    public static final c f4004p;

    /* renamed from: q, reason: collision with root package name */
    public static final c f4005q;

    /* renamed from: r, reason: collision with root package name */
    public static final c f4006r;

    /* renamed from: s, reason: collision with root package name */
    public static final c f4007s;

    /* renamed from: a, reason: collision with root package name */
    public final d f4008a;

    /* renamed from: b, reason: collision with root package name */
    public final K7.c f4009b;

    /* renamed from: c, reason: collision with root package name */
    public final n f4010c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4011d;

    /* renamed from: e, reason: collision with root package name */
    public final j f4012e;

    static {
        d dVar = d.f3983u;
        kotlin.jvm.internal.d a9 = s.a(Boolean.TYPE);
        n nVar = n.f4023u;
        c cVar = new c(dVar, a9, nVar, Boolean.FALSE, 32, 3);
        f3995f = cVar;
        Class cls = Integer.TYPE;
        c cVar2 = new c(dVar, s.a(cls), nVar, 0, 32, 10);
        f3996g = cVar2;
        new e(cVar2, 0);
        c cVar3 = new c(dVar, s.a(cls), nVar, 0, 32, 19);
        f3997h = cVar3;
        new e(cVar3, 0);
        new e(new c(dVar, s.a(cls), nVar, 0, 32, 12), 0);
        d dVar2 = d.f3986x;
        c cVar4 = new c(dVar2, s.a(cls), nVar, 0, 32, 7);
        i = cVar4;
        new e(cVar4, 0);
        new e(new c(dVar2, s.a(cls), nVar, 0, 32, 7), 0);
        Class cls2 = Long.TYPE;
        c cVar5 = new c(dVar, s.a(cls2), nVar, 0L, 32, 11);
        f3998j = cVar5;
        new e(cVar5, 1);
        c cVar6 = new c(dVar, s.a(cls2), nVar, 0L, 32, 20);
        f3999k = cVar6;
        new e(cVar6, 1);
        new e(new c(dVar, s.a(cls2), nVar, 0L, 32, 13), 1);
        d dVar3 = d.f3984v;
        c cVar7 = new c(dVar3, s.a(cls2), nVar, 0L, 32, 8);
        f4000l = cVar7;
        new e(cVar7, 1);
        new e(new c(dVar3, s.a(cls2), nVar, 0L, 32, 8), 1);
        c cVar8 = new c(dVar2, s.a(Float.TYPE), nVar, Float.valueOf(0.0f), 32, 1);
        new b(cVar8, (byte) 0);
        c cVar9 = new c(dVar3, s.a(Double.TYPE), nVar, Double.valueOf(0.0d), 32, 0);
        f4001m = cVar9;
        new b(cVar9);
        d dVar4 = d.f3985w;
        c cVar10 = new c(dVar4, s.a(u8.h.class), nVar, u8.h.f41278w, 32, 4);
        f4002n = cVar10;
        c cVar11 = new c(dVar4, s.a(String.class), nVar, "", 32, 14);
        f4003o = cVar11;
        kotlin.jvm.internal.d a10 = s.a(v.class);
        n nVar2 = n.f4024v;
        new c(dVar4, a10, nVar2, null, 48, 6);
        f4004p = new c(dVar4, s.a(Map.class), nVar2, null, 48, 16);
        f4005q = new c(dVar4, s.a(Map.class), nVar2, null, 48, 15);
        f4006r = new c(dVar, s.a(Void.class), nVar2, null, 48, 17);
        f4007s = new c(dVar4, s.a(Object.class), nVar2, null, 48, 18);
        Z5.c.c(cVar9, "type.googleapis.com/google.protobuf.DoubleValue");
        Z5.c.c(cVar8, "type.googleapis.com/google.protobuf.FloatValue");
        Z5.c.c(cVar5, "type.googleapis.com/google.protobuf.Int64Value");
        Z5.c.c(cVar6, "type.googleapis.com/google.protobuf.UInt64Value");
        Z5.c.c(cVar2, "type.googleapis.com/google.protobuf.Int32Value");
        Z5.c.c(cVar3, "type.googleapis.com/google.protobuf.UInt32Value");
        Z5.c.c(cVar, "type.googleapis.com/google.protobuf.BoolValue");
        Z5.c.c(cVar11, "type.googleapis.com/google.protobuf.StringValue");
        Z5.c.c(cVar10, "type.googleapis.com/google.protobuf.BytesValue");
        try {
            new c(dVar4, s.a(P.c.D()), nVar2, null, 48, 5);
        } catch (NoClassDefFoundError unused) {
            new c();
        }
        try {
            new c(d.f3985w, s.a(P.c.h()), n.f4024v, null, 48, 9);
        } catch (NoClassDefFoundError unused2) {
            new c();
        }
    }

    public i(d fieldEncoding, K7.c cVar, n syntax, Object obj) {
        d dVar;
        kotlin.jvm.internal.h.e(fieldEncoding, "fieldEncoding");
        kotlin.jvm.internal.h.e(syntax, "syntax");
        this.f4008a = fieldEncoding;
        this.f4009b = cVar;
        this.f4010c = syntax;
        this.f4011d = obj;
        boolean z8 = this instanceof g;
        if (!z8 && !(this instanceof j) && fieldEncoding != (dVar = d.f3985w)) {
            if (fieldEncoding == dVar) {
                throw new IllegalArgumentException("Unable to pack a length-delimited type.");
            }
            new g(this);
        }
        this.f4012e = ((this instanceof j) || z8) ? null : new j(this);
    }

    public final j a() {
        j jVar = this.f4012e;
        if (jVar != null) {
            return jVar;
        }
        throw new UnsupportedOperationException("Can't create a repeated adapter from a repeated or packed adapter.");
    }

    public abstract Object b(I0.j jVar);

    public Object c(a aVar) {
        I0.j jVar = aVar.f3979j;
        if (jVar == null) {
            jVar = new I0.j(aVar);
            aVar.f3979j = jVar;
        }
        return b(jVar);
    }

    public abstract void d(C4523c c4523c, Object obj);

    public void e(C4523c writer, int i4, Object obj) {
        kotlin.jvm.internal.h.e(writer, "writer");
        if (obj != null) {
            d dVar = this.f4008a;
            writer.D(i4, dVar);
            if (dVar == d.f3985w) {
                writer.F(f(obj));
            }
            d(writer, obj);
        }
    }

    public abstract int f(Object obj);

    public int g(int i4, Object obj) {
        if (obj == null) {
            return 0;
        }
        int f6 = f(obj);
        int i9 = 5;
        if (this.f4008a == d.f3985w) {
            f6 += (f6 & (-128)) == 0 ? 1 : (f6 & (-16384)) == 0 ? 2 : (f6 & (-2097152)) == 0 ? 3 : (f6 & (-268435456)) == 0 ? 4 : 5;
        }
        int i10 = i4 << 3;
        if ((i10 & (-128)) == 0) {
            i9 = 1;
        } else if ((i10 & (-16384)) == 0) {
            i9 = 2;
        } else if ((i10 & (-2097152)) == 0) {
            i9 = 3;
        } else if ((i10 & (-268435456)) == 0) {
            i9 = 4;
        }
        return f6 + i9;
    }

    public /* synthetic */ i(d dVar, K7.c cVar, n nVar, Object obj, int i4) {
        this(dVar, cVar, nVar, (i4 & 16) != 0 ? null : obj);
    }

    public i(Class cls) {
        this(d.f3985w, s.a(cls), n.f4024v, null);
    }
}
