package androidx.datastore.preferences.protobuf;

import defpackage.qq6;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
final class z {
    public static final a b = new a();
    public final b a;

    public static class a implements f0 {
        @Override // androidx.datastore.preferences.protobuf.f0
        public final e0 a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.f0
        public final boolean b(Class cls) {
            return false;
        }
    }

    public static class b implements f0 {
        public f0[] a;

        @Override // androidx.datastore.preferences.protobuf.f0
        public final e0 a(Class cls) {
            for (f0 f0Var : this.a) {
                if (f0Var.b(cls)) {
                    return f0Var.a(cls);
                }
            }
            qq6.d("No factory is available for message type: ".concat(cls.getName()));
            return null;
        }

        @Override // androidx.datastore.preferences.protobuf.f0
        public final boolean b(Class cls) {
            for (f0 f0Var : this.a) {
                if (f0Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public z() {
        f0 f0Var;
        try {
            f0Var = (f0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            f0Var = b;
        }
        f0[] f0VarArr = {r.a, f0Var};
        b bVar = new b();
        bVar.a = f0VarArr;
        Charset charset = u.a;
        this.a = bVar;
    }
}
