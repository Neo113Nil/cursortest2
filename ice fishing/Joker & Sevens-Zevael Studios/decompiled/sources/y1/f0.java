package y1;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f0 extends pc.k implements oc.a {
    public static final f0 A;
    public static final f0 B;
    public static final f0 C;
    public static final f0 D;
    public static final f0 E;
    public static final f0 F;
    public static final f0 G;
    public static final f0 H;
    public static final f0 I;
    public static final f0 J;

    /* renamed from: h, reason: collision with root package name */
    public static final f0 f8508h;

    /* renamed from: i, reason: collision with root package name */
    public static final f0 f8509i;

    /* renamed from: j, reason: collision with root package name */
    public static final f0 f8510j;

    /* renamed from: k, reason: collision with root package name */
    public static final f0 f8511k;

    /* renamed from: l, reason: collision with root package name */
    public static final f0 f8512l;

    /* renamed from: m, reason: collision with root package name */
    public static final f0 f8513m;

    /* renamed from: n, reason: collision with root package name */
    public static final f0 f8514n;

    /* renamed from: o, reason: collision with root package name */
    public static final f0 f8515o;

    /* renamed from: p, reason: collision with root package name */
    public static final f0 f8516p;

    /* renamed from: q, reason: collision with root package name */
    public static final f0 f8517q;

    /* renamed from: r, reason: collision with root package name */
    public static final f0 f8518r;

    /* renamed from: s, reason: collision with root package name */
    public static final f0 f8519s;

    /* renamed from: t, reason: collision with root package name */
    public static final f0 f8520t;

    /* renamed from: u, reason: collision with root package name */
    public static final f0 f8521u;

    /* renamed from: v, reason: collision with root package name */
    public static final f0 f8522v;

    /* renamed from: w, reason: collision with root package name */
    public static final f0 f8523w;

    /* renamed from: x, reason: collision with root package name */
    public static final f0 f8524x;

    /* renamed from: y, reason: collision with root package name */
    public static final f0 f8525y;

    /* renamed from: z, reason: collision with root package name */
    public static final f0 f8526z;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8527g;

    static {
        int i10 = 0;
        f8508h = new f0(i10, 0);
        f8509i = new f0(i10, 1);
        f8510j = new f0(i10, 2);
        f8511k = new f0(i10, 3);
        f8512l = new f0(i10, 4);
        f8513m = new f0(i10, 5);
        f8514n = new f0(i10, 6);
        f8515o = new f0(i10, 7);
        f8516p = new f0(i10, 8);
        f8517q = new f0(i10, 9);
        f8518r = new f0(i10, 10);
        f8519s = new f0(i10, 11);
        f8520t = new f0(i10, 12);
        f8521u = new f0(i10, 13);
        f8522v = new f0(i10, 14);
        f8523w = new f0(i10, 15);
        f8524x = new f0(i10, 16);
        f8525y = new f0(i10, 17);
        f8526z = new f0(i10, 18);
        A = new f0(i10, 19);
        B = new f0(i10, 20);
        C = new f0(i10, 21);
        D = new f0(i10, 22);
        E = new f0(i10, 23);
        F = new f0(i10, 24);
        G = new f0(i10, 25);
        H = new f0(i10, 26);
        I = new f0(i10, 27);
        J = new f0(i10, 28);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i10, int i11) {
        super(i10);
        this.f8527g = i11;
    }

    @Override // oc.a
    public final Object invoke() {
        Choreographer choreographer;
        fc.d dVar = null;
        switch (this.f8527g) {
            case 0:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case 5:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    fd.e eVar = yc.i0.f8859a;
                    choreographer = (Choreographer) yc.a0.u(dd.o.f1880a, new j0.m0(2, 1, dVar));
                }
                j0 j0Var = new j0(choreographer, v6.a.q(Looper.getMainLooper()));
                return v6.a.K(j0Var, j0Var.f8569r);
            case 6:
            case 7:
                return null;
            case 8:
                y0.b("LocalAutofillManager");
                throw null;
            case 9:
                y0.b("LocalAutofillTree");
                throw null;
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                y0.b("LocalClipboard");
                throw null;
            case 11:
                y0.b("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                y0.b("LocalDensity");
                throw null;
            case 14:
                y0.b("LocalFocusManager");
                throw null;
            case 15:
                y0.b("LocalFontFamilyResolver");
                throw null;
            case 16:
                y0.b("LocalFontLoader");
                throw null;
            case 17:
                y0.b("LocalGraphicsContext");
                throw null;
            case 18:
                y0.b("LocalHapticFeedback");
                throw null;
            case 19:
                y0.b("LocalInputManager");
                throw null;
            case 20:
                y0.b("LocalLayoutDirection");
                throw null;
            case 21:
                return null;
            case 22:
                return Boolean.FALSE;
            case 23:
            case 24:
                return null;
            case 25:
                y0.b("LocalTextToolbar");
                throw null;
            case 26:
                y0.b("LocalUriHandler");
                throw null;
            case 27:
                y0.b("LocalViewConfiguration");
                throw null;
            default:
                y0.b("LocalWindowInfo");
                throw null;
        }
    }
}
