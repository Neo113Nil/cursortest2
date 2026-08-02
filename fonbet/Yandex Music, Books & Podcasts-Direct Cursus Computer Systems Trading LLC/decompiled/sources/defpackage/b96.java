package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.alicekit.core.slideup.SlidingBehavior;
import com.yandex.pulse.metrics.o;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b96 {
    public static final SparseIntArray q0;
    public int A;
    public int B;
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public boolean a;
    public int a0;
    public boolean b;
    public int b0;
    public int c;
    public int c0;
    public int d;
    public int d0;
    public int e;
    public float e0;
    public int f;
    public float f0;
    public float g;
    public int g0;
    public boolean h;
    public int h0;
    public int i;
    public int i0;
    public int j;
    public int[] j0;
    public int k;
    public String k0;
    public int l;
    public String l0;
    public int m;
    public boolean m0;
    public int n;
    public boolean n0;
    public int o;
    public boolean o0;
    public int p;
    public int p0;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public float x;
    public float y;
    public String z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        q0 = sparseIntArray;
        sparseIntArray.append(43, 24);
        sparseIntArray.append(44, 25);
        sparseIntArray.append(46, 28);
        sparseIntArray.append(47, 29);
        sparseIntArray.append(52, 35);
        sparseIntArray.append(51, 34);
        sparseIntArray.append(24, 4);
        sparseIntArray.append(23, 3);
        sparseIntArray.append(19, 1);
        sparseIntArray.append(61, 6);
        sparseIntArray.append(62, 7);
        sparseIntArray.append(31, 17);
        sparseIntArray.append(32, 18);
        sparseIntArray.append(33, 19);
        sparseIntArray.append(15, 90);
        sparseIntArray.append(0, 26);
        sparseIntArray.append(48, 31);
        sparseIntArray.append(49, 32);
        sparseIntArray.append(30, 10);
        sparseIntArray.append(29, 9);
        sparseIntArray.append(66, 13);
        sparseIntArray.append(69, 16);
        sparseIntArray.append(67, 14);
        sparseIntArray.append(64, 11);
        sparseIntArray.append(68, 15);
        sparseIntArray.append(65, 12);
        sparseIntArray.append(55, 38);
        sparseIntArray.append(41, 37);
        sparseIntArray.append(40, 39);
        sparseIntArray.append(54, 40);
        sparseIntArray.append(39, 20);
        sparseIntArray.append(53, 36);
        sparseIntArray.append(28, 5);
        sparseIntArray.append(42, 91);
        sparseIntArray.append(50, 91);
        sparseIntArray.append(45, 91);
        sparseIntArray.append(22, 91);
        sparseIntArray.append(18, 91);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(5, 27);
        sparseIntArray.append(7, 30);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(4, 33);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 22);
        sparseIntArray.append(2, 21);
        sparseIntArray.append(56, 41);
        sparseIntArray.append(34, 42);
        sparseIntArray.append(17, 87);
        sparseIntArray.append(16, 88);
        sparseIntArray.append(71, 76);
        sparseIntArray.append(25, 61);
        sparseIntArray.append(27, 62);
        sparseIntArray.append(26, 63);
        sparseIntArray.append(60, 69);
        sparseIntArray.append(38, 70);
        sparseIntArray.append(12, 71);
        sparseIntArray.append(10, 72);
        sparseIntArray.append(11, 73);
        sparseIntArray.append(13, 74);
        sparseIntArray.append(9, 75);
        sparseIntArray.append(58, 84);
        sparseIntArray.append(59, 86);
        sparseIntArray.append(58, 83);
        sparseIntArray.append(37, 85);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(34, 88);
        sparseIntArray.append(91, 89);
        sparseIntArray.append(15, 90);
    }

    public final void a(b96 b96Var) {
        this.a = b96Var.a;
        this.c = b96Var.c;
        this.b = b96Var.b;
        this.d = b96Var.d;
        this.e = b96Var.e;
        this.f = b96Var.f;
        this.g = b96Var.g;
        this.h = b96Var.h;
        this.i = b96Var.i;
        this.j = b96Var.j;
        this.k = b96Var.k;
        this.l = b96Var.l;
        this.m = b96Var.m;
        this.n = b96Var.n;
        this.o = b96Var.o;
        this.p = b96Var.p;
        this.q = b96Var.q;
        this.r = b96Var.r;
        this.s = b96Var.s;
        this.t = b96Var.t;
        this.u = b96Var.u;
        this.v = b96Var.v;
        this.w = b96Var.w;
        this.x = b96Var.x;
        this.y = b96Var.y;
        this.z = b96Var.z;
        this.A = b96Var.A;
        this.B = b96Var.B;
        this.C = b96Var.C;
        this.D = b96Var.D;
        this.E = b96Var.E;
        this.F = b96Var.F;
        this.G = b96Var.G;
        this.H = b96Var.H;
        this.I = b96Var.I;
        this.J = b96Var.J;
        this.K = b96Var.K;
        this.L = b96Var.L;
        this.M = b96Var.M;
        this.N = b96Var.N;
        this.O = b96Var.O;
        this.P = b96Var.P;
        this.Q = b96Var.Q;
        this.R = b96Var.R;
        this.S = b96Var.S;
        this.T = b96Var.T;
        this.U = b96Var.U;
        this.V = b96Var.V;
        this.W = b96Var.W;
        this.X = b96Var.X;
        this.Y = b96Var.Y;
        this.Z = b96Var.Z;
        this.a0 = b96Var.a0;
        this.b0 = b96Var.b0;
        this.c0 = b96Var.c0;
        this.d0 = b96Var.d0;
        this.e0 = b96Var.e0;
        this.f0 = b96Var.f0;
        this.g0 = b96Var.g0;
        this.h0 = b96Var.h0;
        this.i0 = b96Var.i0;
        this.l0 = b96Var.l0;
        int[] iArr = b96Var.j0;
        if (iArr == null || b96Var.k0 != null) {
            this.j0 = null;
        } else {
            this.j0 = Arrays.copyOf(iArr, iArr.length);
        }
        this.k0 = b96Var.k0;
        this.m0 = b96Var.m0;
        this.n0 = b96Var.n0;
        this.o0 = b96Var.o0;
        this.p0 = b96Var.p0;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cen.l);
        this.b = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray = q0;
            int i2 = sparseIntArray.get(index);
            switch (i2) {
                case 1:
                    this.q = f96.o(obtainStyledAttributes, index, this.q);
                    break;
                case 2:
                    this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                    break;
                case 3:
                    this.p = f96.o(obtainStyledAttributes, index, this.p);
                    break;
                case 4:
                    this.o = f96.o(obtainStyledAttributes, index, this.o);
                    break;
                case 5:
                    this.z = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                    break;
                case 7:
                    this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                    break;
                case 8:
                    this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                    break;
                case 9:
                    this.w = f96.o(obtainStyledAttributes, index, this.w);
                    break;
                case 10:
                    this.v = f96.o(obtainStyledAttributes, index, this.v);
                    break;
                case 11:
                    this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                    break;
                case 12:
                    this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                    break;
                case 13:
                    this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                    break;
                case 14:
                    this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                    break;
                case 15:
                    this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                    break;
                case 16:
                    this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                    break;
                case 17:
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                    break;
                case 18:
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                    break;
                case 19:
                    this.g = obtainStyledAttributes.getFloat(index, this.g);
                    break;
                case 20:
                    this.x = obtainStyledAttributes.getFloat(index, this.x);
                    break;
                case 21:
                    this.d = obtainStyledAttributes.getLayoutDimension(index, this.d);
                    break;
                case 22:
                    this.c = obtainStyledAttributes.getLayoutDimension(index, this.c);
                    break;
                case 23:
                    this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                    break;
                case 24:
                    this.i = f96.o(obtainStyledAttributes, index, this.i);
                    break;
                case 25:
                    this.j = f96.o(obtainStyledAttributes, index, this.j);
                    break;
                case 26:
                    this.F = obtainStyledAttributes.getInt(index, this.F);
                    break;
                case 27:
                    this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                    break;
                case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                    this.k = f96.o(obtainStyledAttributes, index, this.k);
                    break;
                case 29:
                    this.l = f96.o(obtainStyledAttributes, index, this.l);
                    break;
                case 30:
                    this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                    break;
                case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                    this.t = f96.o(obtainStyledAttributes, index, this.t);
                    break;
                case 32:
                    this.u = f96.o(obtainStyledAttributes, index, this.u);
                    break;
                case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                    this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                    break;
                case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                    this.n = f96.o(obtainStyledAttributes, index, this.n);
                    break;
                case 35:
                    this.m = f96.o(obtainStyledAttributes, index, this.m);
                    break;
                case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                    this.y = obtainStyledAttributes.getFloat(index, this.y);
                    break;
                case 37:
                    this.V = obtainStyledAttributes.getFloat(index, this.V);
                    break;
                case 38:
                    this.U = obtainStyledAttributes.getFloat(index, this.U);
                    break;
                case 39:
                    this.W = obtainStyledAttributes.getInt(index, this.W);
                    break;
                case 40:
                    this.X = obtainStyledAttributes.getInt(index, this.X);
                    break;
                case 41:
                    f96.p(this, obtainStyledAttributes, index, 0);
                    break;
                case 42:
                    f96.p(this, obtainStyledAttributes, index, 1);
                    break;
                default:
                    switch (i2) {
                        case 61:
                            this.A = f96.o(obtainStyledAttributes, index, this.A);
                            break;
                        case 62:
                            this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                            break;
                        case 63:
                            this.C = obtainStyledAttributes.getFloat(index, this.C);
                            break;
                        default:
                            switch (i2) {
                                case 69:
                                    this.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case RemoteCameraConfig.Camera.JPEG_QUALITY_70 /* 70 */:
                                    this.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    this.g0 = obtainStyledAttributes.getInt(index, this.g0);
                                    break;
                                case 73:
                                    this.h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.h0);
                                    break;
                                case 74:
                                    this.k0 = obtainStyledAttributes.getString(index);
                                    break;
                                case 75:
                                    this.o0 = obtainStyledAttributes.getBoolean(index, this.o0);
                                    break;
                                case 76:
                                    this.p0 = obtainStyledAttributes.getInt(index, this.p0);
                                    break;
                                case 77:
                                    this.r = f96.o(obtainStyledAttributes, index, this.r);
                                    break;
                                case 78:
                                    this.s = f96.o(obtainStyledAttributes, index, this.s);
                                    break;
                                case 79:
                                    this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                    break;
                                case SlidingBehavior.WIDE_EXPANDED_PERCENTAGE /* 80 */:
                                    this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                    break;
                                case 81:
                                    this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                    break;
                                case 82:
                                    this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                    break;
                                case 83:
                                    this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                    break;
                                case 84:
                                    this.a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                    break;
                                case 85:
                                    this.d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                    break;
                                case 86:
                                    this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                    break;
                                case 87:
                                    this.m0 = obtainStyledAttributes.getBoolean(index, this.m0);
                                    break;
                                case 88:
                                    this.n0 = obtainStyledAttributes.getBoolean(index, this.n0);
                                    break;
                                case 89:
                                    this.l0 = obtainStyledAttributes.getString(index);
                                    break;
                                case 90:
                                    this.h = obtainStyledAttributes.getBoolean(index, this.h);
                                    break;
                                case 91:
                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
