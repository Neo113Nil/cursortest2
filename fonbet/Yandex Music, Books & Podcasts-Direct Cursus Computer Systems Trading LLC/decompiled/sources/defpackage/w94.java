package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class w94 extends z94 {
    public final d7k h = new d7k();
    public final v94 i = new v94();
    public int j = -1;
    public final int k;
    public final u94[] l;
    public u94 m;
    public List n;
    public List o;
    public v94 p;
    public int q;

    public w94(List list, int i) {
        this.k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = ir4.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new u94[8];
        int i2 = 0;
        while (true) {
            u94[] u94VarArr = this.l;
            if (i2 >= 8) {
                this.m = u94VarArr[0];
                return;
            } else {
                u94VarArr[i2] = new u94();
                i2++;
            }
        }
    }

    @Override // defpackage.z94
    public final rp7 c() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new rp7(list);
    }

    @Override // defpackage.z94
    public final void d(x94 x94Var) {
        ByteBuffer byteBuffer = x94Var.i;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        d7k d7kVar = this.h;
        d7kVar.F(limit, array);
        while (d7kVar.a() >= 3) {
            int v = d7kVar.v();
            int i = v & 3;
            boolean z = (v & 4) == 4;
            byte v2 = (byte) d7kVar.v();
            byte v3 = (byte) d7kVar.v();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        k();
                        int i2 = (v2 & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m();
                            vq1.n0("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = v2 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        v94 v94Var = new v94(i2, i4);
                        this.p = v94Var;
                        byte[] bArr = v94Var.b;
                        v94Var.e = 1;
                        bArr[0] = v3;
                    } else {
                        vq1.v(i == 2);
                        v94 v94Var2 = this.p;
                        if (v94Var2 == null) {
                            vq1.K("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = v94Var2.b;
                            int i5 = v94Var2.e;
                            int i6 = i5 + 1;
                            v94Var2.e = i6;
                            bArr2[i5] = v2;
                            v94Var2.e = i5 + 2;
                            bArr2[i6] = v3;
                        }
                    }
                    v94 v94Var3 = this.p;
                    if (v94Var3.e == (v94Var3.d * 2) - 1) {
                        k();
                    }
                }
            }
        }
    }

    @Override // defpackage.z94, defpackage.fg7
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        m();
        this.p = null;
    }

    @Override // defpackage.z94
    public final boolean j() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void k() {
        char c;
        int i;
        boolean z;
        v94 v94Var = this.p;
        if (v94Var == null) {
            return;
        }
        int i2 = 2;
        if (v94Var.e != (v94Var.d * 2) - 1) {
            vq1.H("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.d * 2) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.c + ");");
        }
        v94 v94Var2 = this.p;
        byte[] bArr = v94Var2.b;
        int i3 = v94Var2.e;
        v94 v94Var3 = this.i;
        v94Var3.o(i3, bArr);
        boolean z2 = false;
        while (true) {
            if (v94Var3.b() > 0) {
                int i4 = 3;
                int i5 = v94Var3.i(3);
                int i6 = v94Var3.i(5);
                if (i5 == 7) {
                    v94Var3.t(i2);
                    i5 = v94Var3.i(6);
                    if (i5 < 7) {
                        dfi.o(i5, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i6 == 0) {
                    if (i5 != 0) {
                        vq1.n0("Cea708Decoder", "serviceNumber is non-zero (" + i5 + ") when blockSize is 0");
                    }
                } else if (i5 != this.k) {
                    v94Var3.u(i6);
                } else {
                    int g = (i6 * 8) + v94Var3.g();
                    while (v94Var3.g() < g) {
                        int i7 = v94Var3.i(8);
                        if (i7 != 16) {
                            if (i7 <= 31) {
                                if (i7 != 0) {
                                    if (i7 == i4) {
                                        this.n = l();
                                    } else if (i7 != 8) {
                                        switch (i7) {
                                            case 12:
                                                m();
                                                break;
                                            case 13:
                                                this.m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (i7 < 17 || i7 > 23) {
                                                    if (i7 < 24 || i7 > 31) {
                                                        dfi.o(i7, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    } else {
                                                        vq1.n0("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i7);
                                                        v94Var3.t(16);
                                                        break;
                                                    }
                                                } else {
                                                    vq1.n0("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i7);
                                                    v94Var3.t(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.m.b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i = i2;
                            } else if (i7 <= 127) {
                                u94 u94Var = this.m;
                                if (i7 == 127) {
                                    u94Var.a((char) 9835);
                                } else {
                                    u94Var.a((char) (i7 & KotlinVersion.MAX_COMPONENT_VALUE));
                                }
                                i = i2;
                                z2 = true;
                            } else {
                                if (i7 <= 159) {
                                    u94[] u94VarArr = this.l;
                                    switch (i7) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z = true;
                                            int i8 = i7 - 128;
                                            if (this.q != i8) {
                                                this.q = i8;
                                                this.m = u94VarArr[i8];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            z = true;
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (v94Var3.h()) {
                                                    u94 u94Var2 = u94VarArr[8 - i9];
                                                    u94Var2.a.clear();
                                                    u94Var2.b.clear();
                                                    u94Var2.o = -1;
                                                    u94Var2.p = -1;
                                                    u94Var2.q = -1;
                                                    u94Var2.s = -1;
                                                    u94Var2.u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i10 = 1; i10 <= 8; i10++) {
                                                if (v94Var3.h()) {
                                                    u94VarArr[8 - i10].d = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 138:
                                            for (int i11 = 1; i11 <= 8; i11++) {
                                                if (v94Var3.h()) {
                                                    u94VarArr[8 - i11].d = false;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 139:
                                            for (int i12 = 1; i12 <= 8; i12++) {
                                                if (v94Var3.h()) {
                                                    u94VarArr[8 - i12].d = !r1.d;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 140:
                                            for (int i13 = 1; i13 <= 8; i13++) {
                                                if (v94Var3.h()) {
                                                    u94VarArr[8 - i13].d();
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 141:
                                            v94Var3.t(8);
                                            z = true;
                                            break;
                                        case 142:
                                            z = true;
                                            break;
                                        case 143:
                                            m();
                                            z = true;
                                            break;
                                        case 144:
                                            int i14 = i2;
                                            if (!this.m.c) {
                                                v94Var3.t(16);
                                                z = true;
                                                i4 = 3;
                                                break;
                                            } else {
                                                v94Var3.i(4);
                                                v94Var3.i(i14);
                                                v94Var3.i(i14);
                                                boolean h = v94Var3.h();
                                                boolean h2 = v94Var3.h();
                                                i4 = 3;
                                                v94Var3.i(3);
                                                v94Var3.i(3);
                                                this.m.e(h, h2);
                                                z = true;
                                            }
                                        case 145:
                                            if (this.m.c) {
                                                int c2 = u94.c(v94Var3.i(2), v94Var3.i(2), v94Var3.i(2), v94Var3.i(2));
                                                int c3 = u94.c(v94Var3.i(2), v94Var3.i(2), v94Var3.i(2), v94Var3.i(2));
                                                v94Var3.t(2);
                                                u94.c(v94Var3.i(2), v94Var3.i(2), v94Var3.i(2), 0);
                                                this.m.f(c2, c3);
                                            } else {
                                                v94Var3.t(24);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 146:
                                            if (this.m.c) {
                                                v94Var3.t(4);
                                                int i15 = v94Var3.i(4);
                                                v94Var3.t(2);
                                                v94Var3.i(6);
                                                u94 u94Var3 = this.m;
                                                if (u94Var3.u != i15) {
                                                    u94Var3.a('\n');
                                                }
                                                u94Var3.u = i15;
                                            } else {
                                                v94Var3.t(16);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            dfi.o(i7, "Invalid C1 command: ", "Cea708Decoder");
                                            z = true;
                                            break;
                                        case 151:
                                            if (this.m.c) {
                                                int c4 = u94.c(v94Var3.i(2), v94Var3.i(2), v94Var3.i(2), v94Var3.i(2));
                                                v94Var3.i(2);
                                                u94.c(v94Var3.i(2), v94Var3.i(2), v94Var3.i(2), 0);
                                                v94Var3.h();
                                                v94Var3.h();
                                                v94Var3.i(2);
                                                v94Var3.i(2);
                                                int i16 = v94Var3.i(2);
                                                v94Var3.t(8);
                                                u94 u94Var4 = this.m;
                                                u94Var4.n = c4;
                                                u94Var4.k = i16;
                                            } else {
                                                v94Var3.t(32);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i17 = i7 - 152;
                                            u94 u94Var5 = u94VarArr[i17];
                                            v94Var3.t(i2);
                                            boolean h3 = v94Var3.h();
                                            v94Var3.t(i2);
                                            int i18 = v94Var3.i(i4);
                                            boolean h4 = v94Var3.h();
                                            int i19 = v94Var3.i(7);
                                            int i20 = v94Var3.i(8);
                                            int i21 = v94Var3.i(4);
                                            int i22 = v94Var3.i(4);
                                            v94Var3.t(i2);
                                            v94Var3.t(6);
                                            v94Var3.t(i2);
                                            int i23 = v94Var3.i(3);
                                            int i24 = v94Var3.i(3);
                                            ArrayList arrayList = u94Var5.a;
                                            u94Var5.c = true;
                                            u94Var5.d = h3;
                                            u94Var5.e = i18;
                                            u94Var5.f = h4;
                                            u94Var5.g = i19;
                                            u94Var5.h = i20;
                                            u94Var5.i = i21;
                                            int i25 = i22 + 1;
                                            if (u94Var5.j != i25) {
                                                u94Var5.j = i25;
                                                while (true) {
                                                    if (arrayList.size() >= u94Var5.j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i23 != 0 && u94Var5.l != i23) {
                                                u94Var5.l = i23;
                                                int i26 = i23 - 1;
                                                int i27 = u94.B[i26];
                                                boolean z3 = u94.A[i26];
                                                int i28 = u94.y[i26];
                                                int i29 = u94.z[i26];
                                                int i30 = u94.x[i26];
                                                u94Var5.n = i27;
                                                u94Var5.k = i30;
                                            }
                                            if (i24 != 0 && u94Var5.m != i24) {
                                                u94Var5.m = i24;
                                                int i31 = i24 - 1;
                                                int i32 = u94.D[i31];
                                                int i33 = u94.C[i31];
                                                u94Var5.e(false, false);
                                                u94Var5.f(u94.v, u94.E[i31]);
                                            }
                                            if (this.q != i17) {
                                                this.q = i17;
                                                this.m = u94VarArr[i17];
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                    }
                                } else {
                                    z = true;
                                    if (i7 <= 255) {
                                        this.m.a((char) (i7 & KotlinVersion.MAX_COMPONENT_VALUE));
                                    } else {
                                        dfi.o(i7, "Invalid base command: ", "Cea708Decoder");
                                        i = 2;
                                        c = 7;
                                    }
                                }
                                z2 = z;
                                i = 2;
                                c = 7;
                            }
                            c = 7;
                        } else {
                            int i34 = v94Var3.i(8);
                            if (i34 <= 31) {
                                c = 7;
                                if (i34 > 7) {
                                    if (i34 <= 15) {
                                        v94Var3.t(8);
                                    } else if (i34 <= 23) {
                                        v94Var3.t(16);
                                    } else if (i34 <= 31) {
                                        v94Var3.t(24);
                                    }
                                }
                            } else {
                                c = 7;
                                if (i34 <= 127) {
                                    if (i34 == 32) {
                                        this.m.a(' ');
                                    } else if (i34 == 33) {
                                        this.m.a((char) 160);
                                    } else if (i34 == 37) {
                                        this.m.a((char) 8230);
                                    } else if (i34 == 42) {
                                        this.m.a((char) 352);
                                    } else if (i34 == 44) {
                                        this.m.a((char) 338);
                                    } else if (i34 == 63) {
                                        this.m.a((char) 376);
                                    } else if (i34 == 57) {
                                        this.m.a((char) 8482);
                                    } else if (i34 == 58) {
                                        this.m.a((char) 353);
                                    } else if (i34 == 60) {
                                        this.m.a((char) 339);
                                    } else if (i34 != 61) {
                                        switch (i34) {
                                            case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                                                this.m.a((char) 9608);
                                                break;
                                            case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                                                this.m.a((char) 8216);
                                                break;
                                            case 50:
                                                this.m.a((char) 8217);
                                                break;
                                            case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                                                this.m.a((char) 8220);
                                                break;
                                            case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                                                this.m.a((char) 8221);
                                                break;
                                            case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                                                this.m.a((char) 8226);
                                                break;
                                            default:
                                                switch (i34) {
                                                    case 118:
                                                        this.m.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.m.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.m.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.m.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.m.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.m.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.m.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.m.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.m.a((char) 9484);
                                                        break;
                                                    default:
                                                        dfi.o(i34, "Invalid G2 character: ", "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.m.a((char) 8480);
                                    }
                                    i = 2;
                                    z2 = true;
                                } else if (i34 > 159) {
                                    i = 2;
                                    if (i34 <= 255) {
                                        if (i34 == 160) {
                                            this.m.a((char) 13252);
                                        } else {
                                            dfi.o(i34, "Invalid G3 character: ", "Cea708Decoder");
                                            this.m.a('_');
                                        }
                                        z2 = true;
                                    } else {
                                        dfi.o(i34, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                } else if (i34 <= 135) {
                                    v94Var3.t(32);
                                } else if (i34 <= 143) {
                                    v94Var3.t(40);
                                } else if (i34 <= 159) {
                                    i = 2;
                                    v94Var3.t(2);
                                    v94Var3.t(v94Var3.i(6) * 8);
                                }
                            }
                            i = 2;
                        }
                        i2 = i;
                    }
                }
            }
        }
        if (z2) {
            this.n = l();
        }
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List l() {
        t94 t94Var;
        Layout.Alignment alignment;
        boolean z;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < 8; i4++) {
            u94[] u94VarArr = this.l;
            u94 u94Var = u94VarArr[i4];
            if (u94Var.c && (!u94Var.a.isEmpty() || u94Var.b.length() != 0)) {
                u94 u94Var2 = u94VarArr[i4];
                if (u94Var2.d) {
                    ArrayList arrayList2 = u94Var2.a;
                    if (!u94Var2.c || (arrayList2.isEmpty() && u94Var2.b.length() == 0)) {
                        t94Var = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i5));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) u94Var2.b());
                        int i6 = u94Var2.k;
                        if (i6 != 0) {
                            if (i6 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i6 == 2) {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            } else if (i6 != 3) {
                                kac.c(u94Var2.k, "Unexpected justification value: ");
                                return null;
                            }
                            Layout.Alignment alignment2 = alignment;
                            z = u94Var2.f;
                            int i7 = u94Var2.h;
                            int i8 = u94Var2.g;
                            if (z) {
                                f = i7 / 209.0f;
                                f2 = i8 / 74.0f;
                            } else {
                                f = i7 / 99.0f;
                                f2 = i8 / 99.0f;
                            }
                            float f3 = (f * 0.9f) + 0.05f;
                            float f4 = (f2 * 0.9f) + 0.05f;
                            int i9 = u94Var2.i;
                            i = i9 / 3;
                            if (i != 0) {
                                i2 = i9;
                                i3 = 0;
                            } else if (i == 1) {
                                i2 = i9;
                                i3 = 1;
                            } else {
                                i2 = i9;
                                i3 = 2;
                            }
                            int i10 = i2 % 3;
                            int i11 = i10 != 0 ? 0 : i10 == 1 ? 1 : 2;
                            int i12 = u94Var2.n;
                            t94Var = new t94(spannableStringBuilder, alignment2, f4, i3, f3, i11, i12 == u94.w, i12, u94Var2.e);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        Layout.Alignment alignment22 = alignment;
                        z = u94Var2.f;
                        int i72 = u94Var2.h;
                        int i82 = u94Var2.g;
                        if (z) {
                        }
                        float f32 = (f * 0.9f) + 0.05f;
                        float f42 = (f2 * 0.9f) + 0.05f;
                        int i92 = u94Var2.i;
                        i = i92 / 3;
                        if (i != 0) {
                        }
                        int i102 = i2 % 3;
                        if (i102 != 0) {
                        }
                        int i122 = u94Var2.n;
                        t94Var = new t94(spannableStringBuilder, alignment22, f42, i3, f32, i11, i122 == u94.w, i122, u94Var2.e);
                    }
                    if (t94Var != null) {
                        arrayList.add(t94Var);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, t94.c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            arrayList3.add(((t94) arrayList.get(i13)).a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void m() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}
