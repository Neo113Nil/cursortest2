package androidx.compose.foundation.layout;

import oc.c;
import y0.n;
import z.c0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final FillElement f541a = new FillElement(2, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final FillElement f542b = new FillElement(3, 1.0f);

    public static final n a(float f10, float f11) {
        return new UnspecifiedConstraintsElement(f10, f11);
    }

    public static final n b(float f10) {
        return f10 == 1.0f ? f541a : new FillElement(2, f10);
    }

    public static final n c(n nVar, float f10) {
        return nVar.d(new SizeElement(0.0f, f10, 0.0f, f10, 5));
    }

    public static final n d(c cVar) {
        return new OffsetPxElement(cVar);
    }

    public static final n e(n nVar, c0 c0Var) {
        return nVar.d(new PaddingValuesElement(c0Var));
    }

    public static final n f(n nVar, float f10) {
        return nVar.d(new PaddingElement(f10, f10, f10, f10));
    }

    public static final n g(n nVar, float f10, float f11) {
        return nVar.d(new PaddingElement(f10, f11, f10, f11));
    }

    public static final n h(n nVar, float f10) {
        return nVar.d(new SizeElement(f10, f10, f10, f10));
    }

    public static final n i(n nVar, float f10, float f11) {
        return nVar.d(new SizeElement(f10, f11, f10, f11));
    }

    public static final n j(float f10) {
        return new SizeElement(f10, 0.0f, f10, 0.0f, 10);
    }
}
