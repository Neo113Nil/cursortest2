package io.appmetrica.analytics.impl;

/* loaded from: classes9.dex */
public final class T4 {
    public final String a;
    public final Integer b;
    public final String c;

    public T4(String str, Integer num, String str2) {
        this.a = str;
        this.b = num;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && T4.class == obj.getClass()) {
            T4 t4 = (T4) obj;
            if (!this.a.equals(t4.a)) {
                return false;
            }
            Integer num = this.b;
            Integer num2 = t4.b;
            if (num == null ? num2 != null : !num.equals(num2)) {
                return false;
            }
            String str = this.c;
            String str2 = t4.c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
