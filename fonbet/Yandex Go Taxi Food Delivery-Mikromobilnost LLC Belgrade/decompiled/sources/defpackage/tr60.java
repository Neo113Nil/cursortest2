package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlinx.serialization.json.c;
import ru.yandex.taxi.scooters.data.model.OfferType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltr60;", "", "Companion", "pr60", "qr60", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class tr60 {
    public static final qr60 Companion = new qr60();
    public static final i3y[] t = {null, null, null, null, null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new oi60(10)), null, null, null, null, null, null, null, null, null, null};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final OfferType i;
    public final q1f0 j;
    public final Integer k;
    public final Integer l;
    public final String m;
    public final String n;
    public final zzs o;
    public final nt60 p;
    public final tpw0 q;
    public final c r;
    public final u4w s;

    public /* synthetic */ tr60(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, OfferType offerType, q1f0 q1f0Var, Integer num, Integer num2, String str8, String str9, zzs zzsVar, nt60 nt60Var, tpw0 tpw0Var, c cVar, u4w u4wVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str7;
        }
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = offerType;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = q1f0Var;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num2;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str8;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str9;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = zzsVar;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = nt60Var;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = tpw0Var;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = cVar;
        }
        if ((i & 262144) == 0) {
            this.s = null;
        } else {
            this.s = u4wVar;
        }
    }

    public tr60() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = false;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
    }
}
