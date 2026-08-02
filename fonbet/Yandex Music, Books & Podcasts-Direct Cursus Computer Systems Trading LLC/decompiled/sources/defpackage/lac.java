package defpackage;

import java.util.List;
import okio.internal.a;

/* loaded from: classes5.dex */
public abstract class lac {
    public static final b9f a;

    static {
        b9f b9fVar;
        try {
            Class.forName("java.nio.file.Files");
            b9fVar = new m6j();
        } catch (ClassNotFoundException unused) {
            b9fVar = new b9f();
        }
        a = b9fVar;
        String str = cak.b;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        h1b.M(property);
        ClassLoader classLoader = a.class.getClassLoader();
        classLoader.getClass();
        new a(classLoader);
    }

    public abstract jmq a(cak cakVar);

    public abstract void b(cak cakVar, cak cakVar2);

    public abstract void c(cak cakVar);

    public abstract void d(cak cakVar);

    public final void e(cak cakVar) {
        cakVar.getClass();
        d(cakVar);
    }

    public final boolean f(cak cakVar) {
        cakVar.getClass();
        return i(cakVar) != null;
    }

    public abstract List g(cak cakVar);

    public final v97 h(cak cakVar) {
        cakVar.getClass();
        v97 i = i(cakVar);
        if (i != null) {
            return i;
        }
        kac.e(cakVar, "no such file: ");
        return null;
    }

    public abstract v97 i(cak cakVar);

    public abstract a9f j(cak cakVar);

    public abstract jmq k(cak cakVar);

    public abstract n3r l(cak cakVar);
}
