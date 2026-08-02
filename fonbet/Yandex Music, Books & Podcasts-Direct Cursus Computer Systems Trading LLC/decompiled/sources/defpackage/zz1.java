package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zz1 extends l9 {

    @NonNull
    public static final Parcelable.Creator<zz1> CREATOR = new k5x(8);
    public final x8c a;
    public final jlx b;
    public final ltt c;
    public final lox d;
    public final f0x e;
    public final n0x f;
    public final nmx g;
    public final v0x h;
    public final xnd i;
    public final g1x j;
    public final o2x k;
    public final a1x l;

    public zz1(x8c x8cVar, jlx jlxVar, ltt lttVar, lox loxVar, f0x f0xVar, n0x n0xVar, nmx nmxVar, v0x v0xVar, xnd xndVar, g1x g1xVar, o2x o2xVar, a1x a1xVar) {
        this.a = x8cVar;
        this.c = lttVar;
        this.b = jlxVar;
        this.d = loxVar;
        this.e = f0xVar;
        this.f = n0xVar;
        this.g = nmxVar;
        this.h = v0xVar;
        this.i = xndVar;
        this.j = g1xVar;
        this.k = o2xVar;
        this.l = a1xVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zz1)) {
            return false;
        }
        zz1 zz1Var = (zz1) obj;
        return ldg.s(this.a, zz1Var.a) && ldg.s(this.b, zz1Var.b) && ldg.s(this.c, zz1Var.c) && ldg.s(this.d, zz1Var.d) && ldg.s(this.e, zz1Var.e) && ldg.s(this.f, zz1Var.f) && ldg.s(this.g, zz1Var.g) && ldg.s(this.h, zz1Var.h) && ldg.s(this.i, zz1Var.i) && ldg.s(this.j, zz1Var.j) && ldg.s(this.k, zz1Var.k) && ldg.s(this.l, zz1Var.l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.h);
        String valueOf9 = String.valueOf(this.i);
        String valueOf10 = String.valueOf(this.j);
        String valueOf11 = String.valueOf(this.k);
        StringBuilder m = f1d.m("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        su4.v(m, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        su4.v(m, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        su4.v(m, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        su4.v(m, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return su4.o(m, valueOf11, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.i0(parcel, 2, this.a, i);
        o8g.i0(parcel, 3, this.b, i);
        o8g.i0(parcel, 4, this.c, i);
        o8g.i0(parcel, 5, this.d, i);
        o8g.i0(parcel, 6, this.e, i);
        o8g.i0(parcel, 7, this.f, i);
        o8g.i0(parcel, 8, this.g, i);
        o8g.i0(parcel, 9, this.h, i);
        o8g.i0(parcel, 10, this.i, i);
        o8g.i0(parcel, 11, this.j, i);
        o8g.i0(parcel, 12, this.k, i);
        o8g.i0(parcel, 13, this.l, i);
        o8g.p0(parcel, o0);
    }
}
