package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lyuh;", "Lw96;", "Lc6z;", "Companion", "xuh", "wuh", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class yuh extends w96 implements c6z {
    public static final xuh Companion = new xuh();
    public static final i3y[] r = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new n5h(11)), null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    public static final yuh s = new yuh(0);
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;

    public /* synthetic */ yuh(int i, boolean z, Map map, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i & 16) == 0) {
            this.f = "";
        } else {
            this.f = str3;
        }
        if ((i & 32) == 0) {
            this.g = "";
        } else {
            this.g = str4;
        }
        if ((i & 64) == 0) {
            this.h = "";
        } else {
            this.h = str5;
        }
        if ((i & 128) == 0) {
            this.i = "";
        } else {
            this.i = str6;
        }
        if ((i & 256) == 0) {
            this.j = "";
        } else {
            this.j = str7;
        }
        if ((i & 512) == 0) {
            this.k = "";
        } else {
            this.k = str8;
        }
        if ((i & 1024) == 0) {
            this.l = "";
        } else {
            this.l = str9;
        }
        if ((i & 2048) == 0) {
            this.m = "";
        } else {
            this.m = str10;
        }
        if ((i & 4096) == 0) {
            this.n = "";
        } else {
            this.n = str11;
        }
        if ((i & 8192) == 0) {
            this.o = "";
        } else {
            this.o = str12;
        }
        if ((i & 16384) == 0) {
            this.p = "";
        } else {
            this.p = str13;
        }
        if ((i & 32768) == 0) {
            this.q = "";
        } else {
            this.q = str14;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yuh)) {
            return false;
        }
        yuh yuhVar = (yuh) obj;
        return this.b == yuhVar.b && jl40.l(this.c, yuhVar.c) && jl40.l(this.d, yuhVar.d) && jl40.l(this.e, yuhVar.e) && jl40.l(this.f, yuhVar.f) && jl40.l(this.g, yuhVar.g) && jl40.l(this.h, yuhVar.h) && jl40.l(this.i, yuhVar.i) && jl40.l(this.j, yuhVar.j) && jl40.l(this.k, yuhVar.k) && jl40.l(this.l, yuhVar.l) && jl40.l(this.m, yuhVar.m) && jl40.l(this.n, yuhVar.n) && jl40.l(this.o, yuhVar.o) && jl40.l(this.p, yuhVar.p) && jl40.l(this.q, yuhVar.q);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getB() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final int hashCode() {
        return this.q.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p);
    }

    public final String toString() {
        StringBuilder l = nnm.l("DeliveryAddressCopyParseExperiment(enabled=", ", l10n=", ", titleFormNameKey=", this.c, this.b);
        g8e.D(l, this.d, ", titleCancelButtonKey=", this.e, ", titleSuccessButtonKey=");
        g8e.D(l, this.f, ", titleApartmentNumberKey=", this.g, ", titlePorchNumberKey=");
        g8e.D(l, this.h, ", titleFloorNumberKey=", this.i, ", titleDoorPhoneNumberKey=");
        g8e.D(l, this.j, ", titleCommentKey=", this.k, ", titleDestinationContactKey=");
        g8e.D(l, this.l, ", titleSourceContactKey=", this.m, ", titleOriginalTextKey=");
        g8e.D(l, this.n, ", subtitleOriginalTextKey=", this.o, ", titleContactsPickerRecipientKey=");
        return g8e.r(l, this.p, ", titleContactsPickerSenderKey=", this.q, Extension.C_BRAKE);
    }

    public yuh() {
        this(0);
    }

    public yuh(int i) {
        Map f = b.f();
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = "";
        this.n = "";
        this.o = "";
        this.p = "";
        this.q = "";
    }
}
