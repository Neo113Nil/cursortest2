package io.appmetrica.analytics.impl;

/* loaded from: classes4.dex */
public final class Rb extends AbstractC0668r3 {
    public Rb(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0668r3, io.appmetrica.analytics.impl.Sb
    public final C0490kr a(String str) {
        int i = 0;
        if (str != null) {
            int length = str.length();
            int i2 = this.a;
            if (length > i2) {
                String substring = str.substring(0, i2);
                i = str.getBytes().length - substring.getBytes().length;
                str = substring;
            }
        }
        return new C0490kr(str, new S3(i));
    }
}
