package com.gamericefishpro.space.i2;

import android.os.Looper;
import android.view.Choreographer;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends com.gamericefishpro.space.ei.l implements Function0 {
    public static final g0 A;
    public static final g0 B;
    public static final g0 C;
    public static final g0 D;
    public static final g0 E;
    public static final g0 F;
    public static final g0 G;
    public static final g0 H;
    public static final g0 I;
    public static final g0 J;
    public static final g0 K;
    public static final g0 L;
    public static final g0 M;
    public static final g0 N;
    public static final g0 O;
    public static final g0 P;
    public static final g0 Q;
    public static final g0 R;
    public static final g0 S;
    public static final g0 T;
    public static final g0 U;
    public static final g0 V;
    public static final g0 W;
    public static final g0 X;
    public static final g0 e;
    public static final g0 i;
    public static final g0 v;
    public static final g0 w;
    public static final g0 y;
    public static final g0 z;
    public final /* synthetic */ int d;

    static {
        int i2 = 0;
        e = new g0(i2, 0);
        i = new g0(i2, 1);
        v = new g0(i2, 2);
        w = new g0(i2, 3);
        y = new g0(i2, 4);
        z = new g0(i2, 5);
        A = new g0(i2, 6);
        B = new g0(i2, 7);
        C = new g0(i2, 8);
        D = new g0(i2, 9);
        E = new g0(i2, 10);
        F = new g0(i2, 11);
        G = new g0(i2, 12);
        H = new g0(i2, 13);
        I = new g0(i2, 14);
        J = new g0(i2, 15);
        K = new g0(i2, 16);
        L = new g0(i2, 17);
        M = new g0(i2, 18);
        N = new g0(i2, 19);
        O = new g0(i2, 20);
        P = new g0(i2, 21);
        Q = new g0(i2, 22);
        R = new g0(i2, 23);
        S = new g0(i2, 24);
        T = new g0(i2, 25);
        U = new g0(i2, 26);
        V = new g0(i2, 27);
        W = new g0(i2, 28);
        X = new g0(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i2, int i3) {
        super(i2);
        this.d = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Choreographer choreographer;
        com.gamericefishpro.space.th.a aVar = null;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j0.b("LocalConfiguration");
                throw null;
            case 1:
                j0.b("LocalContext");
                throw null;
            case 2:
                j0.b("LocalImageVectorCache");
                throw null;
            case 3:
                j0.b("LocalResourceIdCache");
                throw null;
            case 4:
                j0.b("LocalView");
                throw null;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    com.gamericefishpro.space.wi.e eVar = com.gamericefishpro.space.pi.k0.a;
                    choreographer = (Choreographer) com.gamericefishpro.space.pi.a0.y(com.gamericefishpro.space.ui.m.a, new com.gamericefishpro.space.e.k(2, 1, aVar));
                }
                l0 l0Var = new l0(choreographer, com.gamericefishpro.space.a.a.f(Looper.getMainLooper()));
                return kotlin.coroutines.e.c(l0Var, l0Var.E);
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                b1.b("LocalAutofillManager");
                throw null;
            case 9:
                b1.b("LocalAutofillTree");
                throw null;
            case 10:
                b1.b("LocalClipboard");
                throw null;
            case RequestError.STOP_TRACKING /* 11 */:
                b1.b("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                b1.b("LocalDensity");
                throw null;
            case 14:
                b1.b("LocalFocusManager");
                throw null;
            case 15:
                b1.b("LocalFontFamilyResolver");
                throw null;
            case 16:
                b1.b("LocalFontLoader");
                throw null;
            case 17:
                b1.b("LocalGraphicsContext");
                throw null;
            case 18:
                b1.b("LocalHapticFeedback");
                throw null;
            case 19:
                b1.b("LocalInputManager");
                throw null;
            case 20:
                b1.b("LocalLayoutDirection");
                throw null;
            case 21:
                return null;
            case 22:
                return Boolean.FALSE;
            case 23:
            case 24:
                return null;
            case 25:
                b1.b("LocalTextToolbar");
                throw null;
            case 26:
                b1.b("LocalUriHandler");
                throw null;
            case 27:
                b1.b("LocalViewConfiguration");
                throw null;
            case 28:
                b1.b("LocalWindowInfo");
                throw null;
            default:
                return Boolean.FALSE;
        }
    }
}
