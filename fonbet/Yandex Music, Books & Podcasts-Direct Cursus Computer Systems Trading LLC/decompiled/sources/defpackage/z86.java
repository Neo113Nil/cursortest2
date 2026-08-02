package defpackage;

import android.util.Log;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.pulse.metrics.o;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z86 {
    public int[] a;
    public int[] b;
    public int c;
    public int[] d;
    public float[] e;
    public int f;
    public int[] g;
    public String[] h;
    public int i;
    public int[] j;
    public boolean[] k;
    public int l;

    public final void a(int i, float f) {
        int i2 = this.f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.e;
            this.e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f;
        iArr2[i3] = i;
        float[] fArr2 = this.e;
        this.f = i3 + 1;
        fArr2[i3] = f;
    }

    public final void b(int i, int i2) {
        int i3 = this.c;
        int[] iArr = this.a;
        if (i3 >= iArr.length) {
            this.a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.b;
            this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.a;
        int i4 = this.c;
        iArr3[i4] = i;
        int[] iArr4 = this.b;
        this.c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, String str) {
        int i2 = this.i;
        int[] iArr = this.g;
        if (i2 >= iArr.length) {
            this.g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }

    public final void d(int i, boolean z) {
        int i2 = this.l;
        int[] iArr = this.j;
        if (i2 >= iArr.length) {
            this.j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.k;
            this.k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.j;
        int i3 = this.l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.k;
        this.l = i3 + 1;
        zArr2[i3] = z;
    }

    public final void e(a96 a96Var) {
        for (int i = 0; i < this.c; i++) {
            int i2 = this.a[i];
            int i3 = this.b[i];
            if (i2 == 6) {
                a96Var.e.D = i3;
            } else if (i2 == 7) {
                a96Var.e.E = i3;
            } else if (i2 == 8) {
                a96Var.e.K = i3;
            } else if (i2 == 27) {
                a96Var.e.F = i3;
            } else if (i2 == 28) {
                a96Var.e.H = i3;
            } else if (i2 == 41) {
                a96Var.e.W = i3;
            } else if (i2 == 42) {
                a96Var.e.X = i3;
            } else if (i2 == 61) {
                a96Var.e.A = i3;
            } else if (i2 == 62) {
                a96Var.e.B = i3;
            } else if (i2 == 72) {
                a96Var.e.g0 = i3;
            } else if (i2 == 73) {
                a96Var.e.h0 = i3;
            } else if (i2 == 2) {
                a96Var.e.J = i3;
            } else if (i2 == 31) {
                a96Var.e.L = i3;
            } else if (i2 == 34) {
                a96Var.e.I = i3;
            } else if (i2 == 38) {
                a96Var.a = i3;
            } else if (i2 == 64) {
                a96Var.d.b = i3;
            } else if (i2 == 66) {
                a96Var.d.f = i3;
            } else if (i2 == 76) {
                a96Var.d.e = i3;
            } else if (i2 == 78) {
                a96Var.c.c = i3;
            } else if (i2 == 97) {
                a96Var.e.p0 = i3;
            } else if (i2 == 93) {
                a96Var.e.M = i3;
            } else if (i2 != 94) {
                switch (i2) {
                    case 11:
                        a96Var.e.Q = i3;
                        break;
                    case 12:
                        a96Var.e.R = i3;
                        break;
                    case 13:
                        a96Var.e.N = i3;
                        break;
                    case 14:
                        a96Var.e.P = i3;
                        break;
                    case 15:
                        a96Var.e.S = i3;
                        break;
                    case 16:
                        a96Var.e.O = i3;
                        break;
                    case 17:
                        a96Var.e.e = i3;
                        break;
                    case 18:
                        a96Var.e.f = i3;
                        break;
                    default:
                        switch (i2) {
                            case 21:
                                a96Var.e.d = i3;
                                break;
                            case 22:
                                a96Var.c.b = i3;
                                break;
                            case 23:
                                a96Var.e.c = i3;
                                break;
                            case 24:
                                a96Var.e.G = i3;
                                break;
                            default:
                                switch (i2) {
                                    case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                                        a96Var.e.Y = i3;
                                        break;
                                    case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                                        a96Var.e.Z = i3;
                                        break;
                                    case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                                        a96Var.e.a0 = i3;
                                        break;
                                    case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                                        a96Var.e.b0 = i3;
                                        break;
                                    case 58:
                                        a96Var.e.c0 = i3;
                                        break;
                                    case 59:
                                        a96Var.e.d0 = i3;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 82:
                                                a96Var.d.c = i3;
                                                break;
                                            case 83:
                                                a96Var.f.i = i3;
                                                break;
                                            case 84:
                                                a96Var.d.j = i3;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 87:
                                                        break;
                                                    case 88:
                                                        a96Var.d.l = i3;
                                                        break;
                                                    case 89:
                                                        a96Var.d.m = i3;
                                                        break;
                                                    default:
                                                        Log.w("ConstraintSet", "Unknown attribute 0x");
                                                        break;
                                                }
                                        }
                                }
                        }
                }
            } else {
                a96Var.e.T = i3;
            }
        }
        for (int i4 = 0; i4 < this.f; i4++) {
            int i5 = this.d[i4];
            float f = this.e[i4];
            if (i5 == 19) {
                a96Var.e.g = f;
            } else if (i5 == 20) {
                a96Var.e.x = f;
            } else if (i5 == 37) {
                a96Var.e.y = f;
            } else if (i5 == 60) {
                a96Var.f.b = f;
            } else if (i5 == 63) {
                a96Var.e.C = f;
            } else if (i5 == 79) {
                a96Var.d.g = f;
            } else if (i5 == 85) {
                a96Var.d.i = f;
            } else if (i5 != 87) {
                if (i5 == 39) {
                    a96Var.e.V = f;
                } else if (i5 != 40) {
                    switch (i5) {
                        case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                            a96Var.c.d = f;
                            break;
                        case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                            e96 e96Var = a96Var.f;
                            e96Var.n = f;
                            e96Var.m = true;
                            break;
                        case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                            a96Var.f.c = f;
                            break;
                        case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                            a96Var.f.d = f;
                            break;
                        case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                            a96Var.f.e = f;
                            break;
                        case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                            a96Var.f.f = f;
                            break;
                        case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                            a96Var.f.g = f;
                            break;
                        case 50:
                            a96Var.f.h = f;
                            break;
                        case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                            a96Var.f.j = f;
                            break;
                        case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                            a96Var.f.k = f;
                            break;
                        case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                            a96Var.f.l = f;
                            break;
                        default:
                            switch (i5) {
                                case 67:
                                    a96Var.d.h = f;
                                    break;
                                case 68:
                                    a96Var.c.e = f;
                                    break;
                                case 69:
                                    a96Var.e.e0 = f;
                                    break;
                                case RemoteCameraConfig.Camera.JPEG_QUALITY_70 /* 70 */:
                                    a96Var.e.f0 = f;
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                    break;
                            }
                    }
                } else {
                    a96Var.e.U = f;
                }
            }
        }
        for (int i6 = 0; i6 < this.i; i6++) {
            int i7 = this.g[i6];
            String str = this.h[i6];
            if (i7 == 5) {
                a96Var.e.z = str;
            } else if (i7 == 65) {
                a96Var.d.d = str;
            } else if (i7 == 74) {
                b96 b96Var = a96Var.e;
                b96Var.k0 = str;
                b96Var.j0 = null;
            } else if (i7 == 77) {
                a96Var.e.l0 = str;
            } else if (i7 != 87) {
                if (i7 != 90) {
                    Log.w("ConstraintSet", "Unknown attribute 0x");
                } else {
                    a96Var.d.k = str;
                }
            }
        }
        for (int i8 = 0; i8 < this.l; i8++) {
            int i9 = this.j[i8];
            boolean z = this.k[i8];
            if (i9 == 44) {
                a96Var.f.m = z;
            } else if (i9 == 75) {
                a96Var.e.o0 = z;
            } else if (i9 != 87) {
                if (i9 == 80) {
                    a96Var.e.m0 = z;
                } else if (i9 != 81) {
                    Log.w("ConstraintSet", "Unknown attribute 0x");
                } else {
                    a96Var.e.n0 = z;
                }
            }
        }
    }
}
