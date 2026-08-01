package c6;

import g1.C4523c;
import java.util.Map;
import kotlin.jvm.internal.s;
import u7.v;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: f, reason: collision with root package name */
    public static final c f5590f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f5591g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f5592h;
    public static final c i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f5593j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f5594k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f5595l;

    /* renamed from: m, reason: collision with root package name */
    public static final c f5596m;

    /* renamed from: n, reason: collision with root package name */
    public static final c f5597n;

    /* renamed from: o, reason: collision with root package name */
    public static final c f5598o;

    /* renamed from: p, reason: collision with root package name */
    public static final c f5599p;

    /* renamed from: q, reason: collision with root package name */
    public static final c f5600q;

    /* renamed from: r, reason: collision with root package name */
    public static final c f5601r;

    /* renamed from: s, reason: collision with root package name */
    public static final c f5602s;

    /* renamed from: a, reason: collision with root package name */
    public final d f5603a;

    /* renamed from: b, reason: collision with root package name */
    public final O7.c f5604b;

    /* renamed from: c, reason: collision with root package name */
    public final n f5605c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5606d;

    /* renamed from: e, reason: collision with root package name */
    public final j f5607e;

    static {
        d dVar = d.f5578u;
        kotlin.jvm.internal.d a9 = s.a(Boolean.TYPE);
        n nVar = n.f5618u;
        c cVar = new c(dVar, a9, nVar, Boolean.FALSE, 32, 3);
        f5590f = cVar;
        Class cls = Integer.TYPE;
        c cVar2 = new c(dVar, s.a(cls), nVar, 0, 32, 10);
        f5591g = cVar2;
        new e(cVar2, 0);
        c cVar3 = new c(dVar, s.a(cls), nVar, 0, 32, 19);
        f5592h = cVar3;
        new e(cVar3, 0);
        new e(new c(dVar, s.a(cls), nVar, 0, 32, 12), 0);
        d dVar2 = d.f5581x;
        c cVar4 = new c(dVar2, s.a(cls), nVar, 0, 32, 7);
        i = cVar4;
        new e(cVar4, 0);
        new e(new c(dVar2, s.a(cls), nVar, 0, 32, 7), 0);
        Class cls2 = Long.TYPE;
        c cVar5 = new c(dVar, s.a(cls2), nVar, 0L, 32, 11);
        f5593j = cVar5;
        new e(cVar5, 1);
        c cVar6 = new c(dVar, s.a(cls2), nVar, 0L, 32, 20);
        f5594k = cVar6;
        new e(cVar6, 1);
        new e(new c(dVar, s.a(cls2), nVar, 0L, 32, 13), 1);
        d dVar3 = d.f5579v;
        c cVar7 = new c(dVar3, s.a(cls2), nVar, 0L, 32, 8);
        f5595l = cVar7;
        new e(cVar7, 1);
        new e(new c(dVar3, s.a(cls2), nVar, 0L, 32, 8), 1);
        c cVar8 = new c(dVar2, s.a(Float.TYPE), nVar, Float.valueOf(0.0f), 32, 1);
        new b(cVar8, (byte) 0);
        c cVar9 = new c(dVar3, s.a(Double.TYPE), nVar, Double.valueOf(0.0d), 32, 0);
        f5596m = cVar9;
        new b(cVar9);
        d dVar4 = d.f5580w;
        c cVar10 = new c(dVar4, s.a(y8.h.class), nVar, y8.h.f41954w, 32, 4);
        f5597n = cVar10;
        c cVar11 = new c(dVar4, s.a(String.class), nVar, "", 32, 14);
        f5598o = cVar11;
        kotlin.jvm.internal.d a10 = s.a(v.class);
        n nVar2 = n.f5619v;
        new c(dVar4, a10, nVar2, null, 48, 6);
        f5599p = new c(dVar4, s.a(Map.class), nVar2, null, 48, 16);
        f5600q = new c(dVar4, s.a(Map.class), nVar2, null, 48, 15);
        f5601r = new c(dVar, s.a(Void.class), nVar2, null, 48, 17);
        f5602s = new c(dVar4, s.a(Object.class), nVar2, null, 48, 18);
        com.bumptech.glide.g.d(cVar9, "type.googleapis.com/google.protobuf.DoubleValue");
        com.bumptech.glide.g.d(cVar8, "type.googleapis.com/google.protobuf.FloatValue");
        com.bumptech.glide.g.d(cVar5, "type.googleapis.com/google.protobuf.Int64Value");
        com.bumptech.glide.g.d(cVar6, "type.googleapis.com/google.protobuf.UInt64Value");
        com.bumptech.glide.g.d(cVar2, "type.googleapis.com/google.protobuf.Int32Value");
        com.bumptech.glide.g.d(cVar3, "type.googleapis.com/google.protobuf.UInt32Value");
        com.bumptech.glide.g.d(cVar, "type.googleapis.com/google.protobuf.BoolValue");
        com.bumptech.glide.g.d(cVar11, "type.googleapis.com/google.protobuf.StringValue");
        com.bumptech.glide.g.d(cVar10, "type.googleapis.com/google.protobuf.BytesValue");
        try {
            new c(dVar4, s.a(S3.i.C()), nVar2, null, 48, 5);
        } catch (NoClassDefFoundError unused) {
            new c();
        }
        try {
            new c(d.f5580w, s.a(S3.i.g()), n.f5619v, null, 48, 9);
        } catch (NoClassDefFoundError unused2) {
            new c();
        }
    }

    public i(d fieldEncoding, O7.c cVar, n syntax, Object obj) {
        d dVar;
        kotlin.jvm.internal.h.e(fieldEncoding, "fieldEncoding");
        kotlin.jvm.internal.h.e(syntax, "syntax");
        this.f5603a = fieldEncoding;
        this.f5604b = cVar;
        this.f5605c = syntax;
        this.f5606d = obj;
        boolean z3 = this instanceof g;
        if (!z3 && !(this instanceof j) && fieldEncoding != (dVar = d.f5580w)) {
            if (fieldEncoding == dVar) {
                throw new IllegalArgumentException("Unable to pack a length-delimited type.");
            }
            new g(this);
        }
        this.f5607e = ((this instanceof j) || z3) ? null : new j(this);
    }

    public final j a() {
        j jVar = this.f5607e;
        if (jVar != null) {
            return jVar;
        }
        throw new UnsupportedOperationException("Can't create a repeated adapter from a repeated or packed adapter.");
    }

    public Object b(C0544a c0544a) {
        C4523c c4523c = c0544a.f5574j;
        if (c4523c == null) {
            c4523c = new C4523c(c0544a);
            c0544a.f5574j = c4523c;
        }
        return c(c4523c);
    }

    public abstract Object c(C4523c c4523c);

    public abstract void d(F1.a aVar, Object obj);

    public void e(F1.a writer, int i6, Object obj) {
        kotlin.jvm.internal.h.e(writer, "writer");
        if (obj != null) {
            d dVar = this.f5603a;
            writer.w(i6, dVar);
            if (dVar == d.f5580w) {
                writer.x(f(obj));
            }
            d(writer, obj);
        }
    }

    public abstract int f(Object obj);

    public int g(int i6, Object obj) {
        if (obj == null) {
            return 0;
        }
        int f3 = f(obj);
        int i9 = 5;
        if (this.f5603a == d.f5580w) {
            f3 += (f3 & (-128)) == 0 ? 1 : (f3 & (-16384)) == 0 ? 2 : (f3 & (-2097152)) == 0 ? 3 : (f3 & (-268435456)) == 0 ? 4 : 5;
        }
        int i10 = i6 << 3;
        if ((i10 & (-128)) == 0) {
            i9 = 1;
        } else if ((i10 & (-16384)) == 0) {
            i9 = 2;
        } else if ((i10 & (-2097152)) == 0) {
            i9 = 3;
        } else if ((i10 & (-268435456)) == 0) {
            i9 = 4;
        }
        return f3 + i9;
    }

    public /* synthetic */ i(d dVar, O7.c cVar, n nVar, Object obj, int i6) {
        this(dVar, cVar, nVar, (i6 & 16) != 0 ? null : obj);
    }

    public i(Class cls) {
        this(d.f5580w, s.a(cls), n.f5619v, null);
    }
}
