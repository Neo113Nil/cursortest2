package l7;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f4206a;

    /* renamed from: b, reason: collision with root package name */
    public int f4207b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4208c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4209d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4210e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4211f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4212g;

    public a() {
        int i10;
        s1.b bVar = s1.b.f6376g;
        this.f4208c = bVar;
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            i10 = 3;
        } else {
            if (ordinal != 1) {
                throw new ac.d();
            }
            i10 = 2;
        }
        this.f4206a = i10;
        this.f4209d = new s1.a[20];
        this.f4210e = new float[20];
        this.f4211f = new float[20];
        this.f4212g = new float[3];
    }

    public void a(j jVar) {
        if (((HashSet) this.f4209d).contains(jVar.f4236a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f4210e).add(jVar);
    }

    public void b(long j3, float f10) {
        int i10 = (this.f4207b + 1) % 20;
        this.f4207b = i10;
        s1.a[] aVarArr = (s1.a[]) this.f4209d;
        s1.a aVar = aVarArr[i10];
        if (aVar != null) {
            aVar.f6374a = j3;
            aVar.f6375b = f10;
        } else {
            s1.a aVar2 = new s1.a();
            aVar2.f6374a = j3;
            aVar2.f6375b = f10;
            aVarArr[i10] = aVar2;
        }
    }

    public b c() {
        if (((e) this.f4212g) != null) {
            return new b((String) this.f4208c, new HashSet((HashSet) this.f4209d), new HashSet((HashSet) this.f4210e), this.f4206a, this.f4207b, (e) this.f4212g, (HashSet) this.f4211f);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public float d(float f10) {
        float f11;
        s1.b bVar;
        int i10;
        float f12;
        float f13 = f10;
        float f14 = 0.0f;
        if (f13 <= 0.0f) {
            u1.a.b("maximumVelocity should be a positive value. You specified=" + f13);
        }
        s1.b bVar2 = (s1.b) this.f4208c;
        float[] fArr = (float[]) this.f4210e;
        float[] fArr2 = (float[]) this.f4211f;
        int i11 = this.f4207b;
        s1.a[] aVarArr = (s1.a[]) this.f4209d;
        s1.a aVar = aVarArr[i11];
        if (aVar == null) {
            f11 = 0.0f;
        } else {
            int i12 = 0;
            s1.a aVar2 = aVar;
            while (true) {
                s1.a aVar3 = aVarArr[i11];
                if (aVar3 != null) {
                    long j3 = aVar.f6374a;
                    long j6 = aVar3.f6374a;
                    float f15 = f14;
                    s1.b bVar3 = bVar2;
                    float f16 = j3 - j6;
                    f11 = f15;
                    i10 = 1;
                    float abs = Math.abs(j6 - aVar2.f6374a);
                    bVar = bVar3;
                    s1.a aVar4 = bVar != s1.b.f6376g ? aVar : aVar3;
                    if (f16 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i12] = aVar3.f6375b;
                    fArr2[i12] = -f16;
                    if (i11 == 0) {
                        i11 = 20;
                    }
                    i11--;
                    i12++;
                    if (i12 >= 20) {
                        break;
                    }
                    aVar2 = aVar4;
                    bVar2 = bVar;
                    f14 = f11;
                } else {
                    f11 = f14;
                    bVar = bVar2;
                    i10 = 1;
                    break;
                }
            }
            if (i12 >= this.f4206a) {
                int ordinal = bVar.ordinal();
                if (ordinal != 0) {
                    int i13 = i10;
                    if (ordinal != i13) {
                        throw new ac.d();
                    }
                    int i14 = i12 - i13;
                    float f17 = fArr2[i14];
                    int i15 = i14;
                    float f18 = f11;
                    while (i15 > 0) {
                        int i16 = i15 - 1;
                        float f19 = fArr2[i16];
                        if (f17 != f19) {
                            float f20 = (fArr[i15] - fArr[i16]) / (f17 - f19);
                            f18 += Math.abs(f20) * (f20 - (Math.signum(f18) * ((float) Math.sqrt(Math.abs(f18) * 2))));
                            if (i15 == i14) {
                                f18 *= 0.5f;
                            }
                        }
                        i15--;
                        f17 = f19;
                    }
                    f12 = Math.signum(f18) * ((float) Math.sqrt(Math.abs(f18) * 2));
                } else {
                    try {
                        float[] fArr3 = (float[]) this.f4212g;
                        a.a.G(fArr2, fArr, i12, fArr3);
                        f12 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f12 = f11;
                    }
                }
                f14 = f12 * 1000;
            } else {
                f14 = f11;
            }
        }
        if (f14 == f11 || Float.isNaN(f14)) {
            return f11;
        }
        if (f14 <= f11) {
            f13 = -f13;
            if (f14 >= f13) {
                return f14;
            }
        } else if (f14 <= f13) {
            f13 = f14;
        }
        return f13;
    }

    public a(Class cls, Class[] clsArr) {
        this.f4208c = null;
        HashSet hashSet = new HashSet();
        this.f4209d = hashSet;
        this.f4210e = new HashSet();
        this.f4206a = 0;
        this.f4207b = 0;
        this.f4211f = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            i7.b.p(cls2, "Null interface");
            ((HashSet) this.f4209d).add(r.a(cls2));
        }
    }

    public a(r rVar, r[] rVarArr) {
        this.f4208c = null;
        HashSet hashSet = new HashSet();
        this.f4209d = hashSet;
        this.f4210e = new HashSet();
        this.f4206a = 0;
        this.f4207b = 0;
        this.f4211f = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            i7.b.p(rVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.f4209d, rVarArr);
    }
}
