package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class pqb extends hzk {
    public final int j;
    public final String k;
    public final int l;
    public final dsc m;
    public final int n;
    public final uvh o;
    public final boolean p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pqb(int i, Throwable th, int i2, String str, int i3, dsc dscVar, int i4, boolean z) {
        this(TextUtils.isEmpty(null) ? r0 : r0.concat(": null"), th, i2, i, r5, r6, r7, i4, null, SystemClock.elapsedRealtime(), z);
        String str2;
        int i5;
        dsc dscVar2;
        String str3;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            dscVar2 = dscVar;
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
            str2 = str;
            i5 = i3;
            dscVar2 = dscVar;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            dscVar2 = dscVar;
            sb.append(dscVar2);
            sb.append(", format_supported=");
            sb.append(dvt.F(i4));
            str3 = sb.toString();
        }
    }

    @Override // defpackage.hzk
    public final boolean a(hzk hzkVar) {
        if (!super.a(hzkVar)) {
            return false;
        }
        int i = dvt.a;
        pqb pqbVar = (pqb) hzkVar;
        return this.j == pqbVar.j && Objects.equals(this.k, pqbVar.k) && this.l == pqbVar.l && Objects.equals(this.m, pqbVar.m) && this.n == pqbVar.n && Objects.equals(this.o, pqbVar.o) && this.p == pqbVar.p;
    }

    public final pqb b(uvh uvhVar) {
        String message = getMessage();
        int i = dvt.a;
        return new pqb(message, getCause(), this.a, this.j, this.k, this.l, this.m, this.n, uvhVar, this.b, this.p);
    }

    public final IOException c() {
        vq1.A(this.j == 0);
        Throwable cause = getCause();
        cause.getClass();
        return (IOException) cause;
    }

    public pqb(String str, Throwable th, int i, int i2, String str2, int i3, dsc dscVar, int i4, uvh uvhVar, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        vq1.v(!z || i2 == 1);
        vq1.v(th != null || i2 == 3);
        this.j = i2;
        this.k = str2;
        this.l = i3;
        this.m = dscVar;
        this.n = i4;
        this.o = uvhVar;
        this.p = z;
    }

    public pqb(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, false);
    }
}
