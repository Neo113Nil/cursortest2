package com.yandex.passport.internal.social.esia;

/* loaded from: classes4.dex */
public final class p0 extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p0(String str, String str2) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder("code: ");
        sb.append(str);
        if (str2 != null) {
            sb.append(", description: ");
            sb.append(str2);
        }
    }
}
