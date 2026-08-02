package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class q511 extends kr {
    public static final o511 Companion = new o511();
    public static final i3y[] d;
    public final String a;
    public final kr b;
    public final kr c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, a.b(lazyThreadSafetyMode, new z411(6)), a.b(lazyThreadSafetyMode, new z411(8))};
    }

    public /* synthetic */ q511(int i, String str, kr krVar, kr krVar2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, m511.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = krVar;
        this.c = krVar2;
    }
}
