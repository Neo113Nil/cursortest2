package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class et7 {
    public final int a;
    public final List b;

    public et7() {
        this.a = 1;
        this.b = Collections.singletonList(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gbt a(int i, anx anxVar) {
        String str = (String) anxVar.b;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zmk(new yuf(str, anxVar.x(), "video/mp2t"));
            }
            if (i == 21) {
                return new zmk(new bta());
            }
            if (i == 27) {
                if (c(4)) {
                    return null;
                }
                return new zmk(new rrd(new sfm(b(anxVar), 16), c(1), c(8)));
            }
            if (i == 36) {
                return new zmk(new trd(new sfm(b(anxVar), 16)));
            }
            if (i == 45) {
                return new zmk(new cgi());
            }
            if (i == 89) {
                return new zmk(new bta((List) anxVar.c));
            }
            if (i == 172) {
                return new zmk(new w9(anxVar.x(), 1, str, "video/mp2t"));
            }
            if (i == 257) {
                return new x8p(new t1f("application/vnd.dvb.ait"));
            }
            if (i != 138) {
                if (i == 139) {
                    return new zmk(new esa(str, anxVar.x(), 5408));
                }
                switch (i) {
                    case 15:
                        if (c(2)) {
                            return null;
                        }
                        return new zmk(new pn(anxVar.x(), str, "video/mp2t", false));
                    case 16:
                        return new zmk(new ord(new y8p(b(anxVar))));
                    case 17:
                        if (c(2)) {
                            return null;
                        }
                        return new zmk(new bnf(str, anxVar.x()));
                    default:
                        switch (i) {
                            case 128:
                                break;
                            case 129:
                                return new zmk(new w9(anxVar.x(), 0, str, "video/mp2t"));
                            case 130:
                                if (!c(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i) {
                                    case 134:
                                        if (c(16)) {
                                            return null;
                                        }
                                        return new x8p(new t1f("application/x-scte35"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                }
            }
            return new zmk(new esa(str, anxVar.x(), 4096));
        }
        return new zmk(new lrd(new y8p(b(anxVar)), "video/mp2t"));
    }

    public List b(anx anxVar) {
        String str;
        int i;
        List list;
        boolean c = c(32);
        List list2 = this.b;
        if (c) {
            return list2;
        }
        d7k d7kVar = new d7k((byte[]) anxVar.d);
        while (d7kVar.a() > 0) {
            int v = d7kVar.v();
            int v2 = d7kVar.b + d7kVar.v();
            if (v == 134) {
                ArrayList arrayList = new ArrayList();
                int v3 = d7kVar.v() & 31;
                for (int i2 = 0; i2 < v3; i2++) {
                    String t = d7kVar.t(3, StandardCharsets.UTF_8);
                    int v4 = d7kVar.v();
                    boolean z = (v4 & 128) != 0;
                    if (z) {
                        i = v4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte v5 = (byte) d7kVar.v();
                    d7kVar.I(1);
                    if (z) {
                        boolean z2 = (v5 & 64) != 0;
                        byte[] bArr = ir4.a;
                        list = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    bsc bscVar = new bsc();
                    bscVar.m = l5i.p(str);
                    bscVar.d = t;
                    bscVar.H = i;
                    bscVar.p = list;
                    arrayList.add(new dsc(bscVar));
                }
                list2 = arrayList;
            }
            d7kVar.H(v2);
        }
        return list2;
    }

    public boolean c(int i) {
        return (i & this.a) != 0;
    }

    public /* synthetic */ et7(List list, int i) {
        this.a = i;
        this.b = list;
    }

    public et7(ArrayList arrayList) {
        this.a = 0;
        this.b = arrayList;
    }
}
