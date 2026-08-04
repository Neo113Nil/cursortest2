package com.gamericefishpro.space.ni;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final Object a;
    public final long b;

    public i(Object obj, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!Intrinsics.a(this.a, iVar.a)) {
            return false;
        }
        long j = iVar.b;
        a aVar = b.d;
        return this.b == j;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        a aVar = b.d;
        return Long.hashCode(this.b) + (iHashCode * 31);
    }

    public final String toString() {
        int i;
        long j;
        int i2;
        int i3;
        int i4;
        char c;
        String string;
        StringBuilder sb = new StringBuilder("TimedValue(value=");
        sb.append(this.a);
        sb.append(", duration=");
        long jF = this.b;
        if (jF == 0) {
            a aVar = b.d;
            string = "0s";
        } else {
            if (jF != b.e) {
                if (jF == b.i) {
                    string = "-Infinity";
                } else {
                    boolean z = jF < 0;
                    StringBuilder sb2 = new StringBuilder();
                    if (z) {
                        sb2.append('-');
                    }
                    if (jF < 0) {
                        jF = b.f(jF);
                    }
                    long jE = b.e(jF, d.DAYS);
                    int iE = b.c(jF) ? 0 : (int) (b.e(jF, d.HOURS) % ((long) 24));
                    int iE2 = b.c(jF) ? 0 : (int) (b.e(jF, d.MINUTES) % ((long) 60));
                    int iE3 = b.c(jF) ? 0 : (int) (b.e(jF, d.SECONDS) % ((long) 60));
                    if (b.c(jF)) {
                        i = 1;
                        i2 = 0;
                    } else {
                        if ((((int) jF) & 1) == 1) {
                            i = 1;
                            j = ((jF >> 1) % ((long) 1000)) * ((long) 1000000);
                        } else {
                            i = 1;
                            j = (jF >> 1) % ((long) 1000000000);
                        }
                        i2 = (int) j;
                    }
                    int i5 = jE != 0 ? i : 0;
                    int i6 = iE != 0 ? i : 0;
                    int i7 = iE2 != 0 ? i : 0;
                    int i8 = (iE3 == 0 && i2 == 0) ? 0 : i;
                    if (i5 != 0) {
                        sb2.append(jE);
                        sb2.append('d');
                        i3 = i;
                    } else {
                        i3 = 0;
                    }
                    if (i6 != 0 || (i5 != 0 && (i7 != 0 || i8 != 0))) {
                        int i9 = i3 + 1;
                        if (i3 > 0) {
                            sb2.append(' ');
                        }
                        sb2.append(iE);
                        sb2.append('h');
                        i3 = i9;
                    }
                    if (i7 != 0 || (i8 != 0 && (i6 != 0 || i5 != 0))) {
                        int i10 = i3 + 1;
                        if (i3 > 0) {
                            sb2.append(' ');
                        }
                        sb2.append(iE2);
                        sb2.append('m');
                        i3 = i10;
                    }
                    if (i8 != 0) {
                        i4 = i3 + 1;
                        if (i3 > 0) {
                            sb2.append(' ');
                        }
                        if (iE3 != 0 || i5 != 0 || i6 != 0 || i7 != 0) {
                            b.b(sb2, iE3, i2, 9, "s", false);
                        } else if (i2 >= 1000000) {
                            b.b(sb2, i2 / 1000000, i2 % 1000000, 6, "ms", false);
                        } else if (i2 >= 1000) {
                            b.b(sb2, i2 / 1000, i2 % 1000, 3, "us", false);
                        } else {
                            sb2.append(i2);
                            sb2.append("ns");
                        }
                    } else {
                        i4 = i3;
                    }
                    if (!z || i4 <= i) {
                        c = ')';
                    } else {
                        c = ')';
                        sb2.insert(i, '(').append(')');
                    }
                    string = sb2.toString();
                }
                sb.append((Object) string);
                sb.append(c);
                return sb.toString();
            }
            string = "Infinity";
        }
        c = ')';
        sb.append((Object) string);
        sb.append(c);
        return sb.toString();
    }
}
