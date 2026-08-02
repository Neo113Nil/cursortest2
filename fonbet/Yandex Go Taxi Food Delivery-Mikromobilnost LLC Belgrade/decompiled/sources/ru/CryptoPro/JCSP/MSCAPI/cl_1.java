package ru.CryptoPro.JCSP.MSCAPI;

import defpackage.oyr;

/* loaded from: classes4.dex */
public class cl_1 {
    private final String a;
    private final String b;

    public cl_1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" [");
        return oyr.t(sb, this.b, "]");
    }
}
