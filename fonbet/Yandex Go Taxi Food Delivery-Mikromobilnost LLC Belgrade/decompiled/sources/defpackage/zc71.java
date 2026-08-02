package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.reprov.array.DerValue;
import yads.t31;
import yads.wk2;

/* loaded from: classes7.dex */
public final class zc71 {
    public final wk2 a;

    public zc71() {
        p481 p481Var = t31.b;
        this.a = wk2.x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    public final List a(vi71 vi71Var) {
        String str;
        int i;
        dl81 dl81Var = new dl81((byte[]) vi71Var.w);
        ArrayList arrayList = this.a;
        while (dl81Var.c - dl81Var.b > 0) {
            int s = dl81Var.s();
            int s2 = dl81Var.b + dl81Var.s();
            if (s == 134) {
                arrayList = new ArrayList();
                int s3 = dl81Var.s() & 31;
                for (int i2 = 0; i2 < s3; i2++) {
                    String b = dl81Var.b(3, md81.c);
                    int s4 = dl81Var.s();
                    boolean z = (s4 & 128) != 0;
                    if (z) {
                        i = s4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte s5 = (byte) dl81Var.s();
                    dl81Var.m(dl81Var.b + 1);
                    List singletonList = z ? Collections.singletonList((s5 & DerValue.TAG_APPLICATION) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    da81 da81Var = new da81();
                    da81Var.k = str;
                    da81Var.c = b;
                    da81Var.C = i;
                    da81Var.m = singletonList;
                    arrayList.add(new qd81(da81Var));
                }
            }
            dl81Var.m(s2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public final w481 b(int i, vi71 vi71Var) {
        String str = (String) vi71Var.b;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new j881(new aa81(str));
            }
            if (i == 21) {
                return new j881(new ze71());
            }
            if (i == 27) {
                return new j881(new qq81(new n971(a(vi71Var), 1)));
            }
            if (i == 36) {
                return new j881(new b5u(new n971(a(vi71Var), 1)));
            }
            if (i == 89) {
                return new j881(new k4n((List) vi71Var.c, 2));
            }
            if (i == 138) {
                return new j881(new mc81(str));
            }
            if (i == 172) {
                return new j881(new dz61(str, 1));
            }
            if (i == 257) {
                return new vy61(new mj31("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i == 134) {
                        return new vy61(new mj31("application/x-scte35"));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                return new j881(new m371(str, false));
                            case 16:
                                return new j881(new w4u(new n971(a(vi71Var), 0)));
                            case 17:
                                return new j881(new ze81(str));
                            default:
                                return null;
                        }
                    }
                }
                return new j881(new dz61(str, 0));
            }
        }
        return new j881(new v681(new n971(a(vi71Var), 0)));
    }
}
