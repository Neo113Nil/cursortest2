package i1;

import a0.a0;
import a0.u;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import f1.b0;
import f1.y;
import f1.z;
import java.util.Locale;
import s.h0;
import s.p0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d f3011a;

    /* renamed from: f, reason: collision with root package name */
    public Outline f3016f;

    /* renamed from: j, reason: collision with root package name */
    public float f3020j;

    /* renamed from: k, reason: collision with root package name */
    public b0 f3021k;

    /* renamed from: l, reason: collision with root package name */
    public f1.i f3022l;

    /* renamed from: m, reason: collision with root package name */
    public f1.i f3023m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3024n;

    /* renamed from: o, reason: collision with root package name */
    public h1.b f3025o;

    /* renamed from: p, reason: collision with root package name */
    public l6.l f3026p;

    /* renamed from: q, reason: collision with root package name */
    public int f3027q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3029s;

    /* renamed from: t, reason: collision with root package name */
    public long f3030t;

    /* renamed from: u, reason: collision with root package name */
    public long f3031u;

    /* renamed from: v, reason: collision with root package name */
    public long f3032v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3033w;

    /* renamed from: x, reason: collision with root package name */
    public RectF f3034x;

    /* renamed from: b, reason: collision with root package name */
    public s2.c f3012b = h1.c.f2599a;

    /* renamed from: c, reason: collision with root package name */
    public s2.l f3013c = s2.l.f6396g;

    /* renamed from: d, reason: collision with root package name */
    public pc.k f3014d = a.f3008h;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f3015e = new a0(13, this);

    /* renamed from: g, reason: collision with root package name */
    public boolean f3017g = true;

    /* renamed from: h, reason: collision with root package name */
    public long f3018h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f3019i = 9205357640488583168L;

    /* renamed from: r, reason: collision with root package name */
    public final u f3028r = new u();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        pc.j.d(lowerCase, "toLowerCase(...)");
        lowerCase.equals("robolectric");
    }

    public b(d dVar) {
        this.f3011a = dVar;
        dVar.t(false);
        this.f3030t = 0L;
        this.f3031u = 0L;
        this.f3032v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.f3017g) {
            boolean z10 = this.f3033w;
            Outline outline2 = null;
            d dVar = this.f3011a;
            if (z10 || dVar.E() > 0.0f) {
                f1.i iVar = this.f3022l;
                if (iVar != null) {
                    RectF rectF = this.f3034x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f3034x = rectF;
                    }
                    boolean z11 = iVar instanceof f1.i;
                    if (!z11) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    iVar.f2261a.computeBounds(rectF, false);
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 > 28 || iVar.f2261a.isConvex()) {
                        outline = this.f3016f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f3016f = outline;
                        }
                        if (i10 >= 30) {
                            if (!z11) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(iVar.f2261a);
                        } else {
                            if (!z11) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(iVar.f2261a);
                        }
                        this.f3024n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f3016f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f3024n = true;
                        outline = null;
                    }
                    this.f3022l = iVar;
                    if (outline != null) {
                        outline.setAlpha(dVar.a());
                        outline2 = outline;
                    }
                    dVar.l(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.f3024n && this.f3033w) {
                        dVar.t(false);
                        dVar.q();
                    } else {
                        dVar.t(this.f3033w);
                    }
                } else {
                    dVar.t(this.f3033w);
                    Outline outline4 = this.f3016f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f3016f = outline4;
                    }
                    Outline outline5 = outline4;
                    long F = i7.b.F(this.f3031u);
                    long j3 = this.f3018h;
                    long j6 = this.f3019i;
                    if (j6 != 9205357640488583168L) {
                        F = j6;
                    }
                    int i11 = (int) (j3 >> 32);
                    int i12 = (int) (j3 & 4294967295L);
                    int i13 = (int) (F >> 32);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat(i12)), Math.round(Float.intBitsToFloat(i13) + Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat((int) (F & 4294967295L)) + Float.intBitsToFloat(i12)), this.f3020j);
                    outline5.setAlpha(dVar.a());
                    dVar.l(outline5, (4294967295L & Math.round(Float.intBitsToFloat(r15))) | (Math.round(Float.intBitsToFloat(i13)) << 32));
                }
            } else {
                dVar.t(false);
                dVar.l(null, 0L);
            }
        }
        this.f3017g = false;
    }

    public final void b() {
        if (this.f3029s && this.f3027q == 0) {
            u uVar = this.f3028r;
            b bVar = (b) uVar.f136b;
            if (bVar != null) {
                bVar.e();
                uVar.f136b = null;
            }
            h0 h0Var = (h0) uVar.f138d;
            if (h0Var != null) {
                Object[] objArr = h0Var.f6275b;
                long[] jArr = h0Var.f6274a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j3 = jArr[i10];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j3) < 128) {
                                    ((b) objArr[(i10 << 3) + i12]).e();
                                }
                                j3 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                h0Var.b();
            }
            this.f3011a.q();
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [oc.c, pc.k] */
    public final void c(h1.d dVar) {
        u uVar = this.f3028r;
        uVar.f137c = (b) uVar.f136b;
        h0 h0Var = (h0) uVar.f138d;
        if (h0Var != null && h0Var.h()) {
            h0 h0Var2 = (h0) uVar.f139e;
            if (h0Var2 == null) {
                int i10 = p0.f6316a;
                h0Var2 = new h0();
                uVar.f139e = h0Var2;
            }
            h0Var2.j(h0Var);
            h0Var.b();
        }
        uVar.f135a = true;
        this.f3014d.invoke(dVar);
        uVar.f135a = false;
        b bVar = (b) uVar.f137c;
        if (bVar != null) {
            bVar.e();
        }
        h0 h0Var3 = (h0) uVar.f139e;
        if (h0Var3 == null || !h0Var3.h()) {
            return;
        }
        Object[] objArr = h0Var3.f6275b;
        long[] jArr = h0Var3.f6274a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j3 = jArr[i11];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j3) < 128) {
                            ((b) objArr[(i11 << 3) + i13]).e();
                        }
                        j3 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        h0Var3.b();
    }

    public final b0 d() {
        b0 zVar;
        b0 b0Var = this.f3021k;
        f1.i iVar = this.f3022l;
        if (b0Var != null) {
            return b0Var;
        }
        if (iVar != null) {
            y yVar = new y(iVar);
            this.f3021k = yVar;
            return yVar;
        }
        long F = i7.b.F(this.f3031u);
        long j3 = this.f3018h;
        long j6 = this.f3019i;
        if (j6 != 9205357640488583168L) {
            F = j6;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (F >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (F & 4294967295L)) + intBitsToFloat2;
        if (this.f3020j > 0.0f) {
            zVar = new f1.a0(a.a.d(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            zVar = new z(new e1.c(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.f3021k = zVar;
        return zVar;
    }

    public final void e() {
        this.f3027q--;
        b();
    }

    public final void f(long j3, long j6, float f10) {
        if (e1.b.b(this.f3018h, j3) && e1.e.a(this.f3019i, j6) && this.f3020j == f10 && this.f3022l == null) {
            return;
        }
        this.f3021k = null;
        this.f3022l = null;
        this.f3017g = true;
        this.f3024n = false;
        this.f3018h = j3;
        this.f3019i = j6;
        this.f3020j = f10;
        a();
    }
}
