package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes9.dex */
public final class yw0 {
    public final String a;
    public final kdc b;
    public final kdc c;
    public final wp2 d;
    public final wp2 e;

    public yw0(int i, kdc kdcVar, kdc kdcVar2, String str) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : kdcVar, (i & 4) != 0 ? null : kdcVar2, new up2(up2.b), AppColor$Palette.Text);
    }

    public yw0(String str, kdc kdcVar, kdc kdcVar2, wp2 wp2Var, wp2 wp2Var2) {
        this.a = str;
        this.b = kdcVar;
        this.c = kdcVar2;
        this.d = wp2Var;
        this.e = wp2Var2;
    }

    public yw0() {
        this(31, null, null, null);
    }
}
