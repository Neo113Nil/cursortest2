package com.yandex.passport.common.time;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;

/* loaded from: classes4.dex */
public final class b {
    public final Object a;
    public int b = 1;

    public b(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        Object obj2 = this.a;
        Class<?> cls = obj2.getClass();
        b bVar = (b) obj;
        Object obj3 = bVar.a;
        if (cls.equals(obj3.getClass()) && this.b == bVar.b) {
            return obj2 instanceof StringBuilder ? ((StringBuilder) obj2).toString().equals(obj3.toString()) : obj2 instanceof Number ? obj2.equals(obj3) : obj2 == obj3;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String obj = this.a.toString();
        int i = this.b;
        if (obj == null) {
            obj = null;
        } else {
            if (i > 0) {
                int length = obj.length();
                if (i != 1 && length != 0) {
                    if (length != 1 || i > 8192) {
                        int i2 = length * i;
                        if (length == 1) {
                            char charAt = obj.charAt(0);
                            if (i > 0) {
                                char[] cArr = new char[i];
                                for (int i3 = i - 1; -1 < i3; i3--) {
                                    cArr[i3] = charAt;
                                }
                                obj = new String(cArr);
                            }
                        } else if (length != 2) {
                            StringBuilder sb = new StringBuilder(i2);
                            for (int i4 = 0; i4 < i; i4++) {
                                sb.append(obj);
                            }
                            obj = sb.toString();
                        } else {
                            char charAt2 = obj.charAt(0);
                            char charAt3 = obj.charAt(1);
                            char[] cArr2 = new char[i2];
                            for (int i5 = (i * 2) - 2; i5 >= 0; i5 -= 2) {
                                cArr2[i5] = charAt2;
                                cArr2[i5 + 1] = charAt3;
                            }
                            obj = new String(cArr2);
                        }
                    } else {
                        char charAt4 = obj.charAt(0);
                        if (i > 0) {
                            char[] cArr3 = new char[i];
                            for (int i6 = i - 1; -1 < i6; i6--) {
                                cArr3[i6] = charAt4;
                            }
                            obj = new String(cArr3);
                        }
                    }
                }
            }
            obj = StringUtil.SPACE;
        }
        obj.getClass();
        return obj;
    }
}
