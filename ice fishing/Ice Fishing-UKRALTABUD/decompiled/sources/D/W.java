package D;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class W extends E0.j implements D0.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f145g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f146h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(int i2, Object obj) {
        super(0);
        this.f145g = i2;
        this.f146h = obj;
    }

    @Override // D0.a
    public final Object a() {
        switch (this.f145g) {
            case 0:
                Object obj = X.f148d;
                File file = (File) this.f146h;
                synchronized (obj) {
                    X.f147c.remove(file.getAbsolutePath());
                }
                return t0.g.f2989a;
            case 1:
                File file2 = (File) ((F.b) this.f146h).a();
                String name = file2.getName();
                E0.i.d(name, "getName(...)");
                if (J0.h.S(name, "").equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    E0.i.d(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                Q.a aVar = (Q.a) this.f146h;
                Class<?> loadClass = aVar.f913a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                E0.i.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method declaredMethod = loadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass2 = aVar.f913a.loadClass("androidx.window.extensions.WindowExtensions");
                E0.i.d(loadClass2, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                E0.i.d(declaredMethod, "getWindowExtensionsMethod");
                return Boolean.valueOf(declaredMethod.getReturnType().equals(loadClass2) && Modifier.isPublic(declaredMethod.getModifiers()));
            default:
                R.i iVar = (R.i) this.f146h;
                return BigInteger.valueOf(iVar.f932f).shiftLeft(32).or(BigInteger.valueOf(iVar.f933g)).shiftLeft(32).or(BigInteger.valueOf(iVar.f934h));
        }
    }
}
