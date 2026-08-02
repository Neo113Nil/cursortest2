package defpackage;

import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes10.dex */
public final class ymh {
    public final int a;
    public final List b;

    public ymh(int i) {
        this(0, ImmutableList.p());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yi11 a(int i, lg lgVar) {
        String str = (String) lgVar.b;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new n8b0(new ac30(str, lgVar.e(), "video/mp2t"));
            }
            if (i == 21) {
                return new n8b0(new k4n());
            }
            if (i == 27) {
                if (c(4)) {
                    return null;
                }
                return new n8b0(new z4u(new amp0(b(lgVar)), c(1), c(8)));
            }
            if (i == 36) {
                return new n8b0(new b5u(new amp0(b(lgVar))));
            }
            if (i == 45) {
                return new n8b0(new cc30());
            }
            if (i == 89) {
                return new n8b0(new k4n((List) lgVar.c, 0));
            }
            if (i == 172) {
                return new n8b0(new gb(str, lgVar.e(), "video/mp2t", 1));
            }
            if (i == 257) {
                return new l3q0(new p370("application/vnd.dvb.ait"));
            }
            if (i != 138) {
                if (i == 139) {
                    return new n8b0(new xum(str, lgVar.e(), 5408));
                }
                switch (i) {
                    case 15:
                        if (c(2)) {
                            return null;
                        }
                        return new n8b0(new fd1(str, lgVar.e(), "video/mp2t", false));
                    case 16:
                        return new n8b0(new w4u(new a201(b(lgVar))));
                    case 17:
                        if (c(2)) {
                            return null;
                        }
                        return new n8b0(new iux(str, lgVar.e()));
                    default:
                        switch (i) {
                            case 128:
                                break;
                            case HProv.PP_SECURITY_LEVEL /* 129 */:
                                return new n8b0(new gb(str, lgVar.e(), "video/mp2t", 0));
                            case 130:
                                if (!c(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i) {
                                    case HProv.PP_CONTAINER_EXTENSION_DEL /* 134 */:
                                        if (c(16)) {
                                            return null;
                                        }
                                        return new l3q0(new p370("application/x-scte35"));
                                    case HProv.PP_CONTAINER_DEFAULT /* 135 */:
                                        break;
                                    case HProv.PP_LCD_QUERY /* 136 */:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                }
            }
            return new n8b0(new xum(str, lgVar.e(), 4096));
        }
        return new n8b0(new t4u(new a201(b(lgVar)), "video/mp2t"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    public final List b(lg lgVar) {
        String str;
        int i;
        List list;
        boolean c = c(32);
        List list2 = this.b;
        if (c) {
            return list2;
        }
        ef90 ef90Var = new ef90((byte[]) lgVar.d);
        ArrayList arrayList = list2;
        while (ef90Var.a() > 0) {
            int y = ef90Var.y();
            int y2 = ef90Var.b + ef90Var.y();
            if (y == 134) {
                arrayList = new ArrayList();
                int y3 = ef90Var.y() & 31;
                for (int i2 = 0; i2 < y3; i2++) {
                    String w = ef90Var.w(3, StandardCharsets.UTF_8);
                    int y4 = ef90Var.y();
                    boolean z = (y4 & 128) != 0;
                    if (z) {
                        i = y4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte y5 = (byte) ef90Var.y();
                    ef90Var.L(1);
                    if (z) {
                        boolean z2 = (y5 & DerValue.TAG_APPLICATION) != 0;
                        byte[] bArr = bac.a;
                        list = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    f7s f7sVar = new f7s();
                    f7sVar.m = eh20.q(str);
                    f7sVar.d = w;
                    f7sVar.H = i;
                    f7sVar.p = list;
                    arrayList.add(new a(f7sVar));
                }
            }
            ef90Var.K(y2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public final boolean c(int i) {
        return (this.a & i) != 0;
    }

    public ymh() {
        this(0);
    }

    public ymh(int i, List list) {
        this.a = i;
        this.b = list;
    }
}
