package defpackage;

import android.os.Bundle;
import com.yandex.pulse.metrics.o;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class na5 extends uif implements Function0 {
    public static final na5 A;
    public static final na5 A0;
    public static final na5 B;
    public static final na5 B0;
    public static final na5 C;
    public static final na5 D;
    public static final na5 E;
    public static final na5 F;
    public static final na5 G;
    public static final na5 H;
    public static final na5 I;
    public static final na5 J;
    public static final na5 K;
    public static final na5 L;
    public static final na5 X;
    public static final na5 Y;
    public static final na5 Z;
    public static final na5 s;
    public static final na5 t;
    public static final na5 u;
    public static final na5 v;
    public static final na5 v0;
    public static final na5 w;
    public static final na5 w0;
    public static final na5 x;
    public static final na5 x0;
    public static final na5 y;
    public static final na5 y0;
    public static final na5 z;
    public static final na5 z0;
    public final /* synthetic */ int r;

    static {
        int i = 0;
        s = new na5(i, 0);
        t = new na5(i, 1);
        u = new na5(i, 2);
        v = new na5(i, 3);
        w = new na5(i, 4);
        x = new na5(i, 5);
        y = new na5(i, 6);
        z = new na5(i, 7);
        A = new na5(i, 8);
        B = new na5(i, 9);
        C = new na5(i, 10);
        D = new na5(i, 11);
        E = new na5(i, 12);
        F = new na5(i, 13);
        G = new na5(i, 14);
        H = new na5(i, 15);
        I = new na5(i, 16);
        J = new na5(i, 17);
        K = new na5(i, 18);
        L = new na5(i, 19);
        X = new na5(i, 20);
        Y = new na5(i, 21);
        Z = new na5(i, 22);
        v0 = new na5(i, 23);
        w0 = new na5(i, 24);
        x0 = new na5(i, 25);
        y0 = new na5(i, 26);
        z0 = new na5(i, 27);
        A0 = new na5(i, 28);
        B0 = new na5(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ na5(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return pa5.c(0L, 0L, 0L, 0L, 0L, 4095);
            case 1:
                return new mpf(2);
            case 2:
                return null;
            case 3:
                return new Bundle();
            case 4:
                return null;
            case 5:
                es5.b("LocalAutofillManager");
                throw null;
            case 6:
                es5.b("LocalAutofillTree");
                throw null;
            case 7:
                es5.b("LocalClipboard");
                throw null;
            case 8:
                es5.b("LocalClipboardManager");
                throw null;
            case 9:
                return fxa.B;
            case 10:
                throw new IllegalStateException("No default context");
            case 11:
                return Boolean.TRUE;
            case 12:
                es5.b("LocalDensity");
                throw null;
            case 13:
                es5.b("LocalFocusManager");
                throw null;
            case 14:
                es5.b("LocalFontFamilyResolver");
                throw null;
            case 15:
                es5.b("LocalFontLoader");
                throw null;
            case 16:
                throw new IllegalStateException("No default glance id");
            case 17:
                es5.b("LocalGraphicsContext");
                throw null;
            case 18:
                es5.b("LocalHapticFeedback");
                throw null;
            case 19:
                es5.b("LocalInputManager");
                throw null;
            case 20:
                es5.b("LocalLayoutDirection");
                throw null;
            case 21:
                return null;
            case 22:
                return Boolean.FALSE;
            case 23:
                throw new IllegalStateException("No default size");
            case 24:
                return null;
            case 25:
                return null;
            case 26:
                return null;
            case 27:
                es5.b("LocalTextToolbar");
                throw null;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                es5.b("LocalUriHandler");
                throw null;
            default:
                es5.b("LocalViewConfiguration");
                throw null;
        }
    }
}
