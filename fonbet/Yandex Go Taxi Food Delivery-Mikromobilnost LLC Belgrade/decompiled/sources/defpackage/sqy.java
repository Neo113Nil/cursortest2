package defpackage;

import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import java.nio.charset.StandardCharsets;

/* loaded from: classes10.dex */
public final class sqy implements pb4 {
    public final ImmutableList a;
    public final int b;

    public sqy(int i, ImmutableList immutableList) {
        this.b = i;
        this.a = immutableList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static sqy b(int i, ef90 ef90Var) {
        pb4 cru0Var;
        String str;
        ImmutableList.a aVar = new ImmutableList.a();
        int i2 = ef90Var.c;
        int i3 = -2;
        while (ef90Var.a() > 8) {
            int m = ef90Var.m();
            int m2 = ef90Var.b + ef90Var.m();
            ef90Var.J(m2);
            if (m != 1414744396) {
                tb4 tb4Var = null;
                switch (m) {
                    case 1718776947:
                        if (i3 == 2) {
                            ef90Var.L(4);
                            int m3 = ef90Var.m();
                            int m4 = ef90Var.m();
                            ef90Var.L(4);
                            int m5 = ef90Var.m();
                            switch (m5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                f7s f7sVar = new f7s();
                                f7sVar.t = m3;
                                f7sVar.u = m4;
                                f7sVar.d(str);
                                cru0Var = new cru0(new a(f7sVar));
                                break;
                            } else {
                                xvz.v(m5, "Ignoring track with unsupported compression ");
                                cru0Var = tb4Var;
                                break;
                            }
                        } else {
                            if (i3 == 1) {
                                int r = ef90Var.r();
                                String str2 = r != 1 ? r != 85 ? r != 255 ? r != 8192 ? r != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int r2 = ef90Var.r();
                                    int m6 = ef90Var.m();
                                    ef90Var.L(6);
                                    int F = tw21.F(ef90Var.r());
                                    int r3 = ef90Var.a() > 0 ? ef90Var.r() : 0;
                                    f7s f7sVar2 = new f7s();
                                    f7sVar2.m = eh20.q(str2);
                                    f7sVar2.C = r2;
                                    f7sVar2.D = m6;
                                    if (str2.equals("audio/raw") && F != 0) {
                                        f7sVar2.E = F;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && r3 > 0) {
                                        byte[] bArr = new byte[r3];
                                        ef90Var.i(0, r3, bArr);
                                        f7sVar2.p = ImmutableList.r(bArr);
                                    }
                                    cru0Var = new cru0(new a(f7sVar2));
                                    break;
                                } else {
                                    xvz.v(r, "Ignoring track with unsupported format tag ");
                                }
                            } else {
                                lk91.j("Ignoring strf box for unsupported track type: ".concat(tw21.K(i3)));
                            }
                            cru0Var = tb4Var;
                        }
                    case 1751742049:
                        int m7 = ef90Var.m();
                        ef90Var.L(8);
                        int m8 = ef90Var.m();
                        int m9 = ef90Var.m();
                        ef90Var.L(4);
                        ef90Var.m();
                        ef90Var.L(12);
                        cru0Var = new sb4(m7, m8, m9);
                        break;
                    case 1752331379:
                        int m10 = ef90Var.m();
                        ef90Var.L(12);
                        ef90Var.m();
                        int m11 = ef90Var.m();
                        int m12 = ef90Var.m();
                        ef90Var.L(4);
                        int m13 = ef90Var.m();
                        int m14 = ef90Var.m();
                        ef90Var.L(4);
                        tb4Var = new tb4(m10, m11, m12, m13, m14, ef90Var.m());
                        cru0Var = tb4Var;
                        break;
                    case 1852994675:
                        cru0Var = new fru0(ef90Var.w(ef90Var.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        cru0Var = tb4Var;
                        break;
                }
            } else {
                cru0Var = b(ef90Var.m(), ef90Var);
            }
            if (cru0Var != null) {
                if (cru0Var.getType() == 1752331379) {
                    i3 = ((tb4) cru0Var).a();
                }
                aVar.a(cru0Var);
            }
            ef90Var.K(m2);
            ef90Var.J(i2);
        }
        return new sqy(i, aVar.g());
    }

    public final pb4 a(Class cls) {
        piv listIterator = this.a.listIterator(0);
        while (listIterator.hasNext()) {
            pb4 pb4Var = (pb4) listIterator.next();
            if (pb4Var.getClass() == cls) {
                return pb4Var;
            }
        }
        return null;
    }

    @Override // defpackage.pb4
    public final int getType() {
        return this.b;
    }
}
