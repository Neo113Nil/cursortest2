package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import yads.tf2;
import yads.yf2;

@gsq0
/* loaded from: classes7.dex */
public final class ql81 {
    public static final ni81 Companion = new ni81();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, tf2.w), null, null};
    public final yf2 a;
    public final String b;
    public final Integer c;

    public ql81(int i, yf2 yf2Var, String str, Integer num) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, zb81.b);
            throw null;
        }
        this.a = yf2Var;
        this.b = str;
        this.c = num;
    }

    public ql81(yf2 yf2Var, String str, Integer num) {
        this.a = yf2Var;
        this.b = str;
        this.c = num;
    }
}
