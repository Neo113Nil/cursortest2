package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class j5m implements mhp, fr3 {
    public final String a;
    public final p3d b;
    public final int c;
    public int d;
    public final String[] e;
    public final List[] f;
    public ArrayList g;
    public final boolean[] h;
    public Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    public j5m(String str, p3d p3dVar, int i) {
        str.getClass();
        this.a = str;
        this.b = p3dVar;
        this.c = i;
        this.d = -1;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.h = new boolean[i3];
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.i = e5bVar;
        bwf bwfVar = bwf.b;
        final int i4 = 0;
        this.j = btf.a(bwfVar, new Function0(this) { // from class: i5m
            public final /* synthetic */ j5m b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [arf, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                t9f[] childSerializers;
                ArrayList arrayList;
                t9f[] typeParametersSerializers;
                switch (i4) {
                    case 0:
                        p3d p3dVar2 = this.b.b;
                        return (p3dVar2 == null || (childSerializers = p3dVar2.childSerializers()) == null) ? ild.k : childSerializers;
                    case 1:
                        p3d p3dVar3 = this.b.b;
                        if (p3dVar3 == null || (typeParametersSerializers = p3dVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (t9f t9fVar : typeParametersSerializers) {
                                arrayList.add(t9fVar.getDescriptor());
                            }
                        }
                        return gld.P(arrayList);
                    default:
                        j5m j5mVar = this.b;
                        return Integer.valueOf(v7g.A(j5mVar, (mhp[]) j5mVar.k.getValue()));
                }
            }
        });
        final int i5 = 1;
        this.k = btf.a(bwfVar, new Function0(this) { // from class: i5m
            public final /* synthetic */ j5m b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [arf, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                t9f[] childSerializers;
                ArrayList arrayList;
                t9f[] typeParametersSerializers;
                switch (i5) {
                    case 0:
                        p3d p3dVar2 = this.b.b;
                        return (p3dVar2 == null || (childSerializers = p3dVar2.childSerializers()) == null) ? ild.k : childSerializers;
                    case 1:
                        p3d p3dVar3 = this.b.b;
                        if (p3dVar3 == null || (typeParametersSerializers = p3dVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (t9f t9fVar : typeParametersSerializers) {
                                arrayList.add(t9fVar.getDescriptor());
                            }
                        }
                        return gld.P(arrayList);
                    default:
                        j5m j5mVar = this.b;
                        return Integer.valueOf(v7g.A(j5mVar, (mhp[]) j5mVar.k.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.l = btf.a(bwfVar, new Function0(this) { // from class: i5m
            public final /* synthetic */ j5m b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [arf, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                t9f[] childSerializers;
                ArrayList arrayList;
                t9f[] typeParametersSerializers;
                switch (i6) {
                    case 0:
                        p3d p3dVar2 = this.b.b;
                        return (p3dVar2 == null || (childSerializers = p3dVar2.childSerializers()) == null) ? ild.k : childSerializers;
                    case 1:
                        p3d p3dVar3 = this.b.b;
                        if (p3dVar3 == null || (typeParametersSerializers = p3dVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (t9f t9fVar : typeParametersSerializers) {
                                arrayList.add(t9fVar.getDescriptor());
                            }
                        }
                        return gld.P(arrayList);
                    default:
                        j5m j5mVar = this.b;
                        return Integer.valueOf(v7g.A(j5mVar, (mhp[]) j5mVar.k.getValue()));
                }
            }
        });
    }

    @Override // defpackage.mhp
    public ivf a() {
        return emr.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.fr3
    public final Set b() {
        return this.i.keySet();
    }

    @Override // defpackage.mhp
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.mhp
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.mhp
    public final int e() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [arf, java.lang.Object] */
    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof j5m) {
            mhp mhpVar = (mhp) obj;
            if (Intrinsics.d(this.a, mhpVar.i()) && Arrays.equals((mhp[]) this.k.getValue(), (mhp[]) ((j5m) obj).k.getValue())) {
                int e = mhpVar.e();
                int i2 = this.c;
                if (i2 == e) {
                    for (0; i < i2; i + 1) {
                        i = (Intrinsics.d(h(i).i(), mhpVar.h(i).i()) && Intrinsics.d(h(i).a(), mhpVar.h(i).a())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.mhp
    public final String f(int i) {
        return this.e[i];
    }

    @Override // defpackage.mhp
    public final List g(int i) {
        List list = this.f[i];
        return list == null ? c5b.a : list;
    }

    @Override // defpackage.mhp
    public final List getAnnotations() {
        ArrayList arrayList = this.g;
        return arrayList == null ? c5b.a : arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    @Override // defpackage.mhp
    public mhp h(int i) {
        return ((t9f[]) this.j.getValue())[i].getDescriptor();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // defpackage.mhp
    public final String i() {
        return this.a;
    }

    @Override // defpackage.mhp
    public boolean isInline() {
        return false;
    }

    @Override // defpackage.mhp
    public final boolean j(int i) {
        return this.h[i];
    }

    public final void k(String str, boolean z) {
        str.getClass();
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.h[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(i2));
            }
            this.i = hashMap;
        }
    }

    public final void l(Annotation annotation) {
        annotation.getClass();
        if (this.g == null) {
            this.g = new ArrayList(1);
        }
        ArrayList arrayList = this.g;
        arrayList.getClass();
        arrayList.add(annotation);
    }

    public String toString() {
        return v7g.Q(this);
    }
}
