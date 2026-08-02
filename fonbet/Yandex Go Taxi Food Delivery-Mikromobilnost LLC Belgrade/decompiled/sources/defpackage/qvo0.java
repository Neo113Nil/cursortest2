package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes6.dex */
public final class qvo0 {
    public static final pvo0 Companion = new pvo0();
    public static final i3y[] e;
    public final List a;
    public final List b;
    public final zzs c;
    public final float d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{a.b(lazyThreadSafetyMode, new h5o0(25)), a.b(lazyThreadSafetyMode, new h5o0(26)), null, null};
    }

    public /* synthetic */ qvo0(int i, List list, List list2, zzs zzsVar, float f) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, ovo0.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
        this.c = zzsVar;
        this.d = f;
    }

    public qvo0(List list, ArrayList arrayList, zzs zzsVar, float f) {
        this.a = list;
        this.b = arrayList;
        this.c = zzsVar;
        this.d = f;
    }
}
