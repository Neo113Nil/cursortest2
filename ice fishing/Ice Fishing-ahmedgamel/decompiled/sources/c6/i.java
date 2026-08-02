package c6;

import i1.C4586c;
import java.util.Map;
import kotlin.jvm.internal.s;
import u7.v;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: f, reason: collision with root package name */
    public static final c f5766f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f5767g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f5768h;
    public static final c i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f5769j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f5770k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f5771l;

    /* renamed from: m, reason: collision with root package name */
    public static final c f5772m;

    /* renamed from: n, reason: collision with root package name */
    public static final c f5773n;

    /* renamed from: o, reason: collision with root package name */
    public static final c f5774o;

    /* renamed from: p, reason: collision with root package name */
    public static final c f5775p;

    /* renamed from: q, reason: collision with root package name */
    public static final c f5776q;

    /* renamed from: r, reason: collision with root package name */
    public static final c f5777r;

    /* renamed from: s, reason: collision with root package name */
    public static final c f5778s;

    /* renamed from: a, reason: collision with root package name */
    public final d f5779a;

    /* renamed from: b, reason: collision with root package name */
    public final O7.c f5780b;

    /* renamed from: c, reason: collision with root package name */
    public final n f5781c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5782d;

    /* renamed from: e, reason: collision with root package name */
    public final j f5783e;

    static {
        d dVar = d.f5754u;
        kotlin.jvm.internal.d a9 = s.a(Boolean.TYPE);
        n nVar = n.f5794u;
        c cVar = new c(dVar, a9, nVar, Boolean.FALSE, 32, 3);
        f5766f = cVar;
        Class cls = Integer.TYPE;
        c cVar2 = new c(dVar, s.a(cls), nVar, 0, 32, 10);
        f5767g = cVar2;
        new e(cVar2, 0);
        c cVar3 = new c(dVar, s.a(cls), nVar, 0, 32, 19);
        f5768h = cVar3;
        new e(cVar3, 0);
        new e(new c(dVar, s.a(cls), nVar, 0, 32, 12), 0);
        d dVar2 = d.f5757x;
        c cVar4 = new c(dVar2, s.a(cls), nVar, 0, 32, 7);
        i = cVar4;
        new e(cVar4, 0);
        new e(new c(dVar2, s.a(cls), nVar, 0, 32, 7), 0);
        Class cls2 = Long.TYPE;
        c cVar5 = new c(dVar, s.a(cls2), nVar, 0L, 32, 11);
        f5769j = cVar5;
        new e(cVar5, 1);
        c cVar6 = new c(dVar, s.a(cls2), nVar, 0L, 32, 20);
        f5770k = cVar6;
        new e(cVar6, 1);
        new e(new c(dVar, s.a(cls2), nVar, 0L, 32, 13), 1);
        d dVar3 = d.f5755v;
        c cVar7 = new c(dVar3, s.a(cls2), nVar, 0L, 32, 8);
        f5771l = cVar7;
        new e(cVar7, 1);
        new e(new c(dVar3, s.a(cls2), nVar, 0L, 32, 8), 1);
        c cVar8 = new c(dVar2, s.a(Float.TYPE), nVar, Float.valueOf(0.0f), 32, 1);
        new b(cVar8, (byte) 0);
        c cVar9 = new c(dVar3, s.a(Double.TYPE), nVar, Double.valueOf(0.0d), 32, 0);
        f5772m = cVar9;
        new b(cVar9);
        d dVar4 = d.f5756w;
        c cVar10 = new c(dVar4, s.a(y8.h.class), nVar, y8.h.f41925w, 32, 4);
        f5773n = cVar10;
        c cVar11 = new c(dVar4, s.a(String.class), nVar, "", 32, 14);
        f5774o = cVar11;
        kotlin.jvm.internal.d a10 = s.a(v.class);
        n nVar2 = n.f5795v;
        new c(dVar4, a10, nVar2, null, 48, 6);
        f5775p = new c(dVar4, s.a(Map.class), nVar2, null, 48, 16);
        f5776q = new c(dVar4, s.a(Map.class), nVar2, null, 48, 15);
        f5777r = new c(dVar, s.a(Void.class), nVar2, null, 48, 17);
        f5778s = new c(dVar4, s.a(Object.class), nVar2, null, 48, 18);
        com.bumptech.glide.e.b(cVar9, "type.googleapis.com/google.protobuf.DoubleValue");
        com.bumptech.glide.e.b(cVar8, "type.googleapis.com/google.protobuf.FloatValue");
        com.bumptech.glide.e.b(cVar5, "type.googleapis.com/google.protobuf.Int64Value");
        com.bumptech.glide.e.b(cVar6, "type.googleapis.com/google.protobuf.UInt64Value");
        com.bumptech.glide.e.b(cVar2, "type.googleapis.com/google.protobuf.Int32Value");
        com.bumptech.glide.e.b(cVar3, "type.googleapis.com/google.protobuf.UInt32Value");
        com.bumptech.glide.e.b(cVar, "type.googleapis.com/google.protobuf.BoolValue");
        com.bumptech.glide.e.b(cVar11, "type.googleapis.com/google.protobuf.StringValue");
        com.bumptech.glide.e.b(cVar10, "type.googleapis.com/google.protobuf.BytesValue");
        try {
            new c(dVar4, s.a(S6.a.C()), nVar2, null, 48, 5);
        } catch (NoClassDefFoundError unused) {
            new c();
        }
        try {
            new c(d.f5756w, s.a(S6.a.g()), n.f5795v, null, 48, 9);
        } catch (NoClassDefFoundError unused2) {
            new c();
        }
    }

    public i(d fieldEncoding, O7.c cVar, n syntax, Object obj) {
        d dVar;
        kotlin.jvm.internal.h.e(fieldEncoding, "fieldEncoding");
        kotlin.jvm.internal.h.e(syntax, "syntax");
        this.f5779a = fieldEncoding;
        this.f5780b = cVar;
        this.f5781c = syntax;
        this.f5782d = obj;
        boolean z6 = this instanceof g;
        if (!z6 && !(this instanceof j) && fieldEncoding != (dVar = d.f5756w)) {
            if (fieldEncoding == dVar) {
                throw new IllegalArgumentException("Unable to pack a length-delimited type.");
            }
            new g(this);
        }
        this.f5783e = ((this instanceof j) || z6) ? null : new j(this);
    }

    public final j a() {
        j jVar = this.f5783e;
        if (jVar != null) {
            return jVar;
        }
        throw new UnsupportedOperationException("Can't create a repeated adapter from a repeated or packed adapter.");
    }

    public Object b(C0555a c0555a) {
        C4586c c4586c = c0555a.f5750j;
        if (c4586c == null) {
            c4586c = new C4586c(c0555a);
            c0555a.f5750j = c4586c;
        }
        return c(c4586c);
    }

    public abstract Object c(C4586c c4586c);

    public abstract void d(n4.c cVar, Object obj);

    public void e(n4.c writer, int i4, Object obj) {
        kotlin.jvm.internal.h.e(writer, "writer");
        if (obj != null) {
            d dVar = this.f5779a;
            writer.D(i4, dVar);
            if (dVar == d.f5756w) {
                writer.E(f(obj));
            }
            d(writer, obj);
        }
    }

    public abstract int f(Object obj);

    public int g(int i4, Object obj) {
        if (obj == null) {
            return 0;
        }
        int f2 = f(obj);
        int i6 = 5;
        if (this.f5779a == d.f5756w) {
            f2 += (f2 & (-128)) == 0 ? 1 : (f2 & (-16384)) == 0 ? 2 : (f2 & (-2097152)) == 0 ? 3 : (f2 & (-268435456)) == 0 ? 4 : 5;
        }
        int i9 = i4 << 3;
        if ((i9 & (-128)) == 0) {
            i6 = 1;
        } else if ((i9 & (-16384)) == 0) {
            i6 = 2;
        } else if ((i9 & (-2097152)) == 0) {
            i6 = 3;
        } else if ((i9 & (-268435456)) == 0) {
            i6 = 4;
        }
        return f2 + i6;
    }

    public /* synthetic */ i(d dVar, O7.c cVar, n nVar, Object obj, int i4) {
        this(dVar, cVar, nVar, (i4 & 16) != 0 ? null : obj);
    }

    public i(Class cls) {
        this(d.f5756w, s.a(cls), n.f5795v, null);
    }
}
