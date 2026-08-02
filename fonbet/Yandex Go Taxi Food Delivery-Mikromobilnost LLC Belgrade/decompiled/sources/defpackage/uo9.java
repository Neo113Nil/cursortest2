package defpackage;

import android.text.SpannableStringBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class uo9 {
    public final CharSequence a;
    public final CharSequence b;
    public final boolean c;
    public final uj9 d;
    public final boolean e;
    public final kdc f;
    public final boolean g;
    public final boolean h;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ uo9(java.lang.CharSequence r12, java.lang.CharSequence r13, boolean r14, defpackage.uj9 r15, boolean r16, defpackage.kdc r17, boolean r18, boolean r19, int r20) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 32
            if (r1 == 0) goto L9
            r1 = 0
            r8 = r1
            goto Lb
        L9:
            r8 = r17
        Lb:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L12
            r9 = r2
            goto L14
        L12:
            r9 = r18
        L14:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L21
            r10 = r2
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r2 = r11
            goto L2a
        L21:
            r10 = r19
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
        L2a:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uo9.<init>(java.lang.CharSequence, java.lang.CharSequence, boolean, uj9, boolean, kdc, boolean, boolean, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.CharSequence] */
    public static uo9 a(uo9 uo9Var, SpannableStringBuilder spannableStringBuilder, int i) {
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if ((i & 1) != 0) {
            spannableStringBuilder2 = uo9Var.a;
        }
        SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
        CharSequence charSequence = uo9Var.b;
        boolean z = uo9Var.c;
        uj9 uj9Var = uo9Var.d;
        boolean z2 = uo9Var.e;
        kdc kdcVar = uo9Var.f;
        boolean z3 = uo9Var.g;
        boolean z4 = (i & 128) != 0 ? uo9Var.h : true;
        uo9Var.getClass();
        return new uo9(spannableStringBuilder3, charSequence, z, uj9Var, z2, kdcVar, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo9)) {
            return false;
        }
        uo9 uo9Var = (uo9) obj;
        return jl40.l(this.a, uo9Var.a) && jl40.l(this.b, uo9Var.b) && this.c == uo9Var.c && jl40.l(this.d, uo9Var.d) && this.e == uo9Var.e && jl40.l(this.f, uo9Var.f) && this.g == uo9Var.g && this.h == uo9Var.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int e = unr0.e((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.c);
        uj9 uj9Var = this.d;
        int e2 = unr0.e((e + (uj9Var == null ? 0 : uj9Var.hashCode())) * 31, 31, this.e);
        kdc kdcVar = this.f;
        return Boolean.hashCode(this.h) + unr0.e((e2 + (kdcVar != null ? kdcVar.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "ChargersButton(text=", ", subtitle=", ", isEnabled=");
        r.append(this.c);
        r.append(", action=");
        r.append(this.d);
        r.append(", isAccent=");
        r.append(this.e);
        r.append(", backgroundColor=");
        r.append(this.f);
        r.append(", isSquare=");
        return smw0.k(", isLoading=", Extension.C_BRAKE, r, this.g, this.h);
    }

    public uo9(CharSequence charSequence, CharSequence charSequence2, boolean z, uj9 uj9Var, boolean z2, kdc kdcVar, boolean z3, boolean z4) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = z;
        this.d = uj9Var;
        this.e = z2;
        this.f = kdcVar;
        this.g = z3;
        this.h = z4;
    }
}
