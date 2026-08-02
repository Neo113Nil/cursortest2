package ru.CryptoPro.ssl;

import defpackage.dy31;
import defpackage.kbs;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SNIServerName;

/* loaded from: classes4.dex */
final class cl_104 extends cl_66 {
    public Map e;
    public int f;

    public cl_104(List list) {
        super(cl_36.d);
        this.f = 0;
        this.e = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SNIServerName sNIServerName = (SNIServerName) it.next();
            if (this.e.put(Integer.valueOf(sNIServerName.getType()), sNIServerName) != null) {
                dy31.e(sNIServerName.getType(), "Duplicated server name of type ");
                throw null;
            }
            this.f = sNIServerName.getEncoded().length + 3 + this.f;
        }
        if (this.f != 0) {
            return;
        }
        kbs.g("The ServerNameList cannot be empty");
        throw null;
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public final void a(cl_62 cl_62Var) {
        cl_62Var.e(this.d.a);
        int i = this.f;
        if (i == 0) {
            cl_62Var.e(i);
            return;
        }
        cl_62Var.e(i + 2);
        cl_62Var.e(i);
        for (SNIServerName sNIServerName : this.e.values()) {
            cl_62Var.a(sNIServerName.getType());
            cl_62Var.b(sNIServerName.getEncoded());
        }
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public final int b() {
        int i = this.f;
        if (i == 0) {
            return 4;
        }
        return i + 6;
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            stringBuffer.append("[" + ((SNIServerName) it.next()) + "]");
        }
        return "Extension " + this.d + ", server_name: " + ((Object) stringBuffer);
    }
}
