package ru.CryptoPro.ssl;

import defpackage.dy31;
import defpackage.ny61;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLProtocolException;

/* loaded from: classes4.dex */
final class cl_0 extends cl_66 {
    public int e;
    public List f;

    public cl_0(String[] strArr) {
        super(cl_36.h);
        this.e = 0;
        this.f = null;
        if (strArr.length == 0) {
            ny61.g("The list of application protocols cannot be empty");
            throw null;
        }
        this.f = Arrays.asList(strArr);
        for (String str : strArr) {
            int length = str.getBytes(StandardCharsets.UTF_8).length;
            if (length == 0) {
                dy31.m("Application protocol name is empty");
                throw null;
            }
            if (length > 255) {
                throw new SSLProtocolException("Application protocol name is too long: ".concat(str));
            }
            int i = length + 1 + this.e;
            this.e = i;
            if (i > 65535) {
                dy31.m("Application protocol name list is too long");
                throw null;
            }
        }
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public final void a(cl_62 cl_62Var) {
        cl_62Var.e(this.d.a);
        int i = this.e;
        cl_62Var.e(i + 2);
        cl_62Var.e(i);
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            cl_62Var.d(((String) it.next()).getBytes(StandardCharsets.UTF_8));
        }
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public final int b() {
        return this.e + 6;
    }

    @Override // ru.CryptoPro.ssl.cl_66
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f;
        if (list == null || list.isEmpty()) {
            sb.append("<empty>");
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb.append("[" + ((String) it.next()) + "]");
            }
        }
        return "Extension " + this.d + ", protocol names: " + ((Object) sb);
    }
}
