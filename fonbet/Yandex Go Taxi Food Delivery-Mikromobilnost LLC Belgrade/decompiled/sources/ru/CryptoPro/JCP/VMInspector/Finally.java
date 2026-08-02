package ru.CryptoPro.JCP.VMInspector;

/* loaded from: classes4.dex */
public class Finally {
    private Finally() {
    }

    public static void main(String[] strArr) throws Exception {
        int i;
        someFunction(someFunction(2));
        someFunction(0);
        try {
            i = someFunction(0);
        } catch (SecurityException unused) {
            i = 0;
        }
        try {
        } catch (SecurityException unused2) {
            someFunction(i);
            someFunction(0);
        }
        if (someFunction(i) != 0) {
            throw new SecurityException();
        }
        someFunction(i);
        someFunction(0);
    }

    private static int someFunction(int i) {
        return i + 1;
    }
}
