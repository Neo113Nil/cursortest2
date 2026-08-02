package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes9.dex */
public final class zrp0 {
    public static final yrp0 Companion = new yrp0();
    public static final i3y[] f;
    public final List a;
    public final List b;
    public final t1t c;
    public final int d;
    public final List e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{a.b(lazyThreadSafetyMode, new czo0(28)), a.b(lazyThreadSafetyMode, new czo0(29)), null, null, a.b(lazyThreadSafetyMode, new wrp0(0))};
    }

    public /* synthetic */ zrp0(int i, List list, List list2, t1t t1tVar, int i2, List list3) {
        if (30 != (i & 30)) {
            qje.Z(i, 30, xrp0.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        this.b = list2;
        this.c = t1tVar;
        this.d = i2;
        this.e = list3;
    }

    public zrp0(ArrayList arrayList, ArrayList arrayList2, t1t t1tVar, int i, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = t1tVar;
        this.d = i;
        this.e = arrayList3;
    }
}
