package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class tgc {
    public static final vm7 a;

    static {
        ynh.a("media3.decoder.flac");
        vm7 vm7Var = new vm7();
        vm7Var.c = new String[]{"flacJNI"};
        a = vm7Var;
    }

    public static boolean isAvailable() {
        vm7 vm7Var = a;
        synchronized (vm7Var) {
            if (vm7Var.a) {
                return vm7Var.b;
            }
            vm7Var.a = true;
            try {
                for (String str : (String[]) vm7Var.c) {
                    System.loadLibrary(str);
                }
                vm7Var.b = true;
            } catch (UnsatisfiedLinkError unused) {
                vq1.n0("LibraryLoader", "Failed to load " + Arrays.toString((String[]) vm7Var.c));
            }
            return vm7Var.b;
        }
    }
}
