package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes12.dex */
public final class uxd0 implements ig5 {
    public static final txd0 Companion = new txd0();
    public static final i3y[] h;
    public final int a;
    public final double b;
    public final String c;
    public final String d;
    public final vm50 e;
    public final vm50 f;
    public final vm50 g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, null, null, a.b(lazyThreadSafetyMode, new yud0(4)), a.b(lazyThreadSafetyMode, new yud0(5)), a.b(lazyThreadSafetyMode, new yud0(6))};
    }

    public /* synthetic */ uxd0(int i, int i2, double d, String str, String str2, vm50 vm50Var, vm50 vm50Var2, vm50 vm50Var3) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, sxd0.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = d;
        this.c = str;
        this.d = str2;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = vm50Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = vm50Var2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = vm50Var3;
        }
    }
}
