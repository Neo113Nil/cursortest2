package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p8g implements yg2 {
    public final yde a;
    public final int b;

    public p8g(int i, qsn qsnVar) {
        this.b = i;
        this.a = qsnVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static p8g b(int i, d7k d7kVar) {
        yg2 ijrVar;
        String str;
        int i2 = 4;
        hld.w(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i3 = d7kVar.c;
        int i4 = -2;
        int i5 = 0;
        while (d7kVar.a() > 8) {
            int j = d7kVar.j();
            int j2 = d7kVar.b + d7kVar.j();
            d7kVar.G(j2);
            if (j != 1414744396) {
                ch2 ch2Var = null;
                switch (j) {
                    case 1718776947:
                        if (i4 == 2) {
                            d7kVar.I(i2);
                            int j3 = d7kVar.j();
                            int j4 = d7kVar.j();
                            d7kVar.I(i2);
                            int j5 = d7kVar.j();
                            switch (j5) {
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
                                bsc bscVar = new bsc();
                                bscVar.t = j3;
                                bscVar.u = j4;
                                bscVar.m = l5i.p(str);
                                ijrVar = new ijr(new dsc(bscVar));
                                break;
                            } else {
                                dfi.o(j5, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                ijrVar = ch2Var;
                                break;
                            }
                        } else {
                            if (i4 == 1) {
                                int o = d7kVar.o();
                                String str2 = o != 1 ? o != 85 ? o != 255 ? o != 8192 ? o != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int o2 = d7kVar.o();
                                    int j6 = d7kVar.j();
                                    d7kVar.I(6);
                                    int I = dvt.I(d7kVar.o());
                                    int o3 = d7kVar.a() > 0 ? d7kVar.o() : 0;
                                    bsc bscVar2 = new bsc();
                                    bscVar2.m = l5i.p(str2);
                                    bscVar2.C = o2;
                                    bscVar2.D = j6;
                                    if (str2.equals("audio/raw") && I != 0) {
                                        bscVar2.E = I;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && o3 > 0) {
                                        byte[] bArr = new byte[o3];
                                        d7kVar.f(bArr, 0, o3);
                                        bscVar2.p = yde.y(bArr);
                                    }
                                    ijrVar = new ijr(new dsc(bscVar2));
                                    break;
                                } else {
                                    dfi.o(o, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                vq1.n0("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(dvt.N(i4)));
                            }
                            ijrVar = ch2Var;
                        }
                    case 1751742049:
                        int j7 = d7kVar.j();
                        d7kVar.I(8);
                        int j8 = d7kVar.j();
                        int j9 = d7kVar.j();
                        d7kVar.I(i2);
                        d7kVar.j();
                        d7kVar.I(12);
                        ijrVar = new bh2(j7, j8, j9);
                        break;
                    case 1752331379:
                        int j10 = d7kVar.j();
                        d7kVar.I(12);
                        d7kVar.j();
                        int j11 = d7kVar.j();
                        int j12 = d7kVar.j();
                        d7kVar.I(i2);
                        int j13 = d7kVar.j();
                        int j14 = d7kVar.j();
                        d7kVar.I(i2);
                        ch2Var = new ch2(j10, j11, j12, j13, j14, d7kVar.j());
                        ijrVar = ch2Var;
                        break;
                    case 1852994675:
                        ijrVar = new ojr(d7kVar.t(d7kVar.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        ijrVar = ch2Var;
                        break;
                }
            } else {
                ijrVar = b(d7kVar.j(), d7kVar);
            }
            if (ijrVar != null) {
                if (ijrVar.getType() == 1752331379) {
                    i4 = ((ch2) ijrVar).a();
                }
                int i6 = i5 + 1;
                int e = pde.e(objArr.length, i6);
                if (e > objArr.length) {
                    objArr = Arrays.copyOf(objArr, e);
                }
                objArr[i5] = ijrVar;
                i5 = i6;
            }
            d7kVar.H(j2);
            d7kVar.G(i3);
            i2 = 4;
        }
        return new p8g(i, yde.t(i5, objArr));
    }

    public final yg2 a(Class cls) {
        ude listIterator = this.a.listIterator(0);
        while (listIterator.hasNext()) {
            yg2 yg2Var = (yg2) listIterator.next();
            if (yg2Var.getClass() == cls) {
                return yg2Var;
            }
        }
        return null;
    }

    @Override // defpackage.yg2
    public final int getType() {
        return this.b;
    }
}
