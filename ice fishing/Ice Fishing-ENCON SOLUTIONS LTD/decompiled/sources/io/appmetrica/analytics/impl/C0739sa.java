package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.sa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0739sa extends C2 {
    public C0739sa(int i2) {
        super(i2);
    }

    @Override // io.appmetrica.analytics.impl.C2, io.appmetrica.analytics.impl.InterfaceC0765ta
    public final Mn a(String str) {
        int i2 = 0;
        if (str != null) {
            int length = str.length();
            int i3 = this.f4253a;
            if (length > i3) {
                String substring = str.substring(0, i3);
                i2 = str.getBytes().length - substring.getBytes().length;
                str = substring;
            }
        }
        return new Mn(str, new C0267a3(i2));
    }
}
