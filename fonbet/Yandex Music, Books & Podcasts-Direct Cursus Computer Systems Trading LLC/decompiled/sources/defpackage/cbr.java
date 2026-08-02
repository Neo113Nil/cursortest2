package defpackage;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes3.dex */
public final class cbr extends z3f {
    public final Class a;
    public final String[] b;
    public final Enum[] c;
    public final aqd d;

    public cbr(Class cls) {
        this.a = cls;
        try {
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            this.c = enumArr;
            this.b = new String[enumArr.length];
            int i = 0;
            while (true) {
                Enum[] enumArr2 = this.c;
                if (i >= enumArr2.length) {
                    this.d = aqd.q(this.b);
                    return;
                }
                String name = enumArr2[i].name();
                String[] strArr = this.b;
                Field field = cls.getField(name);
                Set set = avt.a;
                y3f y3fVar = (y3f) field.getAnnotation(y3f.class);
                if (y3fVar != null) {
                    String name2 = y3fVar.name();
                    if (!"\u0000".equals(name2)) {
                        name = name2;
                    }
                }
                strArr[i] = name;
                i++;
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e);
        }
    }

    @Override // defpackage.z3f
    public final Object a(l7f l7fVar) {
        int i;
        int i2 = l7fVar.g;
        if (i2 == 0) {
            i2 = l7fVar.o();
        }
        if (i2 < 8 || i2 > 11) {
            i = -1;
        } else {
            aqd aqdVar = this.d;
            if (i2 == 11) {
                i = l7fVar.I(l7fVar.j, aqdVar);
            } else {
                i = l7fVar.e.h0((qwj) aqdVar.c);
                if (i != -1) {
                    l7fVar.g = 0;
                    int[] iArr = l7fVar.d;
                    int i3 = l7fVar.a - 1;
                    iArr[i3] = iArr[i3] + 1;
                } else {
                    String f0 = l7fVar.f0();
                    int I = l7fVar.I(f0, aqdVar);
                    if (I == -1) {
                        l7fVar.g = 11;
                        l7fVar.j = f0;
                        l7fVar.d[l7fVar.a - 1] = r0[r1] - 1;
                    }
                    i = I;
                }
            }
        }
        if (i != -1) {
            return this.c[i];
        }
        String path = l7fVar.getPath();
        String f02 = l7fVar.f0();
        throw new wp3("Expected one of " + Arrays.asList(this.b) + " but was " + f02 + " at path " + path);
    }

    @Override // defpackage.z3f
    public final void e(n7f n7fVar, Object obj) {
        n7fVar.Q(this.b[((Enum) obj).ordinal()]);
    }

    public final String toString() {
        return "JsonAdapter(" + this.a.getName() + ")";
    }
}
