package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ren extends qen {
    public final String p;
    public String q;
    public final String r;
    public int s;
    public int t;
    public String u;
    public String v;
    public LinkedHashMap w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ren(String str, yen yenVar, String str2, String str3, String str4, mtk mtkVar, wdb wdbVar, String str5) {
        super(yenVar, str2, str3, str4, mtkVar, wdbVar);
        str.getClass();
        this.p = str;
        this.q = null;
        this.r = str5;
        this.s = 0;
        this.t = 0;
        this.u = null;
        this.v = null;
        if (lsq.z(str)) {
            xq0.x("Message must not be empty");
            throw null;
        }
    }

    @Override // defpackage.qen
    public final String a() {
        return "690.2354";
    }

    @Override // defpackage.qen
    public final Map b() {
        String str = this.v;
        if (str != null) {
            return dfi.n("reqid", str);
        }
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        return e5bVar;
    }

    @Override // defpackage.qen
    public final LinkedHashMap c() {
        String str;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = this.r;
        if (str3 != null) {
            linkedHashMap.put("-ua", str3);
        }
        String str4 = this.q;
        pen penVar = new pen(linkedHashMap, 5);
        if (str4 != null && str4.length() > 0) {
            penVar.invoke(str4);
        }
        int i = this.s;
        if (i != 0) {
            if (i == 1) {
                str2 = "info";
            } else if (i == 2) {
                str2 = "debug";
            } else if (i == 3) {
                str2 = "warn";
            } else if (i == 4) {
                str2 = "error";
            } else {
                if (i != 5) {
                    throw null;
                }
                str2 = "fatal";
            }
            linkedHashMap.put("-level", str2);
        }
        int i2 = this.t;
        if (i2 != 0) {
            if (i2 == 1) {
                str = "yes";
            } else {
                if (i2 != 2) {
                    throw null;
                }
                str = "no";
            }
            linkedHashMap.put("-silent", str);
        }
        String str5 = this.u;
        if (str5 != null) {
            linkedHashMap.put("-url", str5);
        }
        LinkedHashMap linkedHashMap2 = this.w;
        if (linkedHashMap2 != null) {
            linkedHashMap.putAll(linkedHashMap2);
        }
        return linkedHashMap;
    }

    @Override // defpackage.qen
    public final Map d() {
        return dfi.n("-msg", mlr.K(500, this.p));
    }
}
