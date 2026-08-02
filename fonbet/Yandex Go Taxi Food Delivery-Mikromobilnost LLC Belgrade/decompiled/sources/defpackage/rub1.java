package defpackage;

import ru.yandex.taxi.locationsdk.core.priority.InputSourcePriority$Active;

/* loaded from: classes4.dex */
public abstract class rub1 {
    public static final boolean a(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        if (z && z2) {
            float f6 = f3 - f;
            float f7 = f4 - f2;
            if ((f7 * f7) + (f6 * f6) >= f5 * f5) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c7, code lost:
    
        if (a(r7 - r12, r8 - r12, r4, r6, r12, r4 >= r7 - r12, r6 >= r8 - r12) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean b(qnf qnfVar, float f, float f2, float f3) {
        float f4 = qnfVar.c;
        float max = Math.max(f, f4);
        float f5 = qnfVar.d;
        float max2 = Math.max(f3, f5);
        float f6 = qnfVar.e;
        float min = Math.min(f + f2, f4 + f6);
        float f7 = qnfVar.b;
        float min2 = Math.min(f3 + f2, f5 + f7);
        boolean z = false;
        if (min <= max || min2 <= max2) {
            return false;
        }
        float c = y6i0.c(qnfVar.a, 0.0f, Math.min(f6, f7) / 2.0f);
        if (c <= 0.0f) {
            return true;
        }
        float f8 = max - f4;
        float f9 = max2 - f5;
        float f10 = min - f4;
        float f11 = min2 - f5;
        if (!a(c, c, f10, f11, c, f10 <= c, f11 <= c)) {
            if (!a(f6 - c, c, f8, f11, c, f8 >= f6 - c, f11 <= c)) {
                if (!a(c, f7 - c, f10, f9, c, f10 <= c, f9 >= f7 - c)) {
                }
            }
        }
        z = true;
        return !z;
    }

    public static hz60 c(e3n e3nVar) {
        if (e3nVar != null) {
            InputSourcePriority$Active inputSourcePriority$Active = InputSourcePriority$Active.Low;
            return new hz60(inputSourcePriority$Active, inputSourcePriority$Active, e3nVar.a);
        }
        InputSourcePriority$Active inputSourcePriority$Active2 = InputSourcePriority$Active.Normal;
        o430 o430Var = e3n.b;
        return new hz60(inputSourcePriority$Active2, inputSourcePriority$Active2, 0L);
    }
}
