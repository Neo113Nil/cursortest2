package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes9.dex */
public final class wvl {
    public static final vvl Companion = new vvl();
    public static final i3y[] n;
    public final String a;
    public final String b;
    public final Map c;
    public final a5t0 d;
    public final List e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final bq90 j;
    public final String k;
    public final fjj l;
    public final mw5 m;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        n = new i3y[]{null, null, a.b(lazyThreadSafetyMode, new tvl(0)), null, null, null, null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new tvl(1))};
    }

    public /* synthetic */ wvl(int i, String str, String str2, Map map, a5t0 a5t0Var, List list, String str3, String str4, String str5, boolean z, bq90 bq90Var, String str6, fjj fjjVar, mw5 mw5Var) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, uvl.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = map;
        if ((i & 8) == 0) {
            this.d = qvl.a;
        } else {
            this.d = a5t0Var;
        }
        if ((i & 16) == 0) {
            this.e = qvl.b;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = true;
        } else {
            this.i = z;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = bq90Var;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str6;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = fjjVar;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = mw5Var;
        }
    }
}
