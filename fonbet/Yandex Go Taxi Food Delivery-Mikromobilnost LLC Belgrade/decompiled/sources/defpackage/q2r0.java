package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@gsq0
/* loaded from: classes12.dex */
public final class q2r0 implements ig5 {
    public static final p2r0 Companion = new p2r0();
    public static final i3y[] m;
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final double e;
    public final String f;
    public final long g;
    public final vm50 h;
    public final vm50 i;
    public final vm50 j;
    public final String k;
    public final String l;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        m = new i3y[]{null, null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new iwq0(9)), a.b(lazyThreadSafetyMode, new iwq0(10)), a.b(lazyThreadSafetyMode, new iwq0(11)), null, null};
    }

    public /* synthetic */ q2r0(int i, String str, int i2, String str2, String str3, double d, String str4, long j, vm50 vm50Var, vm50 vm50Var2, vm50 vm50Var3, String str5, String str6) {
        if (127 != (i & HProv.PP_VERSION_TIMESTAMP)) {
            qje.Z(i, HProv.PP_VERSION_TIMESTAMP, o2r0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = i2;
        this.c = str2;
        this.d = str3;
        this.e = d;
        this.f = str4;
        this.g = j;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = vm50Var;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = vm50Var2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = vm50Var3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str5;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str6;
        }
    }
}
