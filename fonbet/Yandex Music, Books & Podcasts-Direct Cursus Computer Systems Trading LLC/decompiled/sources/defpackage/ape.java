package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ape implements t9f {
    public static final ape a = new ape();
    public static final gsm b = new gsm("kotlin.time.Instant", csm.j);

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        yoe w;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        char charAt;
        char charAt2;
        eg7Var.getClass();
        voe voeVar = voe.c;
        String A = eg7Var.A();
        A.getClass();
        if (A.length() == 0) {
            w = new j6e("An empty string is not a valid Instant", A);
        } else {
            char charAt3 = A.charAt(0);
            if (charAt3 == '+' || charAt3 == '-') {
                i = 1;
            } else {
                i = 0;
                charAt3 = ' ';
            }
            int i6 = 0;
            int i7 = i;
            while (i7 < A.length() && '0' <= (charAt2 = A.charAt(i7)) && charAt2 < ':') {
                i6 = (i6 * 10) + (A.charAt(i7) - '0');
                i7++;
            }
            int i8 = i7 - i;
            if (i8 > 10) {
                w = bow.x(A, "Expected at most 10 digits for the year number, got " + i8 + " digits");
            } else if (i8 == 10 && Intrinsics.e(A.charAt(i), 50) >= 0) {
                w = bow.x(A, "Expected at most 9 digits for the year number or year 1000000000, got " + i8 + " digits");
            } else if (i8 < 4) {
                w = bow.x(A, "The year number must be padded to 4 digits, got " + i8 + " digits");
            } else if (charAt3 == '+' && i8 == 4) {
                w = bow.x(A, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (charAt3 != ' ' || i8 == 4) {
                if (charAt3 == '-') {
                    i6 = -i6;
                }
                int i9 = i7 + 16;
                if (A.length() < i9) {
                    w = bow.x(A, "The input string is too short");
                } else {
                    j6e w2 = bow.w(A, "'-'", i7, new mke(11));
                    if (w2 != null) {
                        w = w2;
                    } else {
                        w = bow.w(A, "'-'", i7 + 3, new mke(12));
                        if (w == null && (w = bow.w(A, "'T' or 't'", i7 + 6, new mke(13))) == null && (w = bow.w(A, "':'", i7 + 9, new mke(14))) == null) {
                            char c = 15;
                            w = bow.w(A, "':'", i7 + 12, new mke(15));
                            if (w == null) {
                                int[] iArr = bow.l;
                                int i10 = 0;
                                while (true) {
                                    if (i10 < 10) {
                                        char c2 = c;
                                        j6e w3 = bow.w(A, "an ASCII digit", i7 + iArr[i10], new mke(16));
                                        if (w3 != null) {
                                            w = w3;
                                            break;
                                        }
                                        i10++;
                                        c = c2;
                                    } else {
                                        int y = bow.y(i7 + 1, A);
                                        int y2 = bow.y(i7 + 4, A);
                                        int y3 = bow.y(i7 + 7, A);
                                        int y4 = bow.y(i7 + 10, A);
                                        int y5 = bow.y(i7 + 13, A);
                                        int i11 = i7 + 15;
                                        if (A.charAt(i11) == '.') {
                                            i11 = i9;
                                            int i12 = 0;
                                            while (i11 < A.length() && '0' <= (charAt = A.charAt(i11)) && charAt < ':') {
                                                i12 = (i12 * 10) + (A.charAt(i11) - '0');
                                                i11++;
                                            }
                                            int i13 = i11 - i9;
                                            if (1 > i13 || i13 >= 10) {
                                                w = bow.x(A, "1..9 digits are supported for the fraction of the second, got " + i13 + " digits");
                                            } else {
                                                i2 = i12 * bow.k[9 - i13];
                                            }
                                        } else {
                                            i2 = 0;
                                        }
                                        if (i11 >= A.length()) {
                                            w = bow.x(A, "The UTC offset at the end of the string is missing");
                                        } else {
                                            char charAt4 = A.charAt(i11);
                                            if (charAt4 == '+' || charAt4 == '-') {
                                                int length = A.length() - i11;
                                                if (length > 9) {
                                                    w = bow.x(A, "The UTC offset string \"" + bow.F(16, A.subSequence(i11, A.length()).toString()) + "\" is too long");
                                                } else if (length % 3 != 0) {
                                                    w = bow.x(A, "Invalid UTC offset string \"" + A.subSequence(i11, A.length()).toString() + '\"');
                                                } else {
                                                    int[] iArr2 = bow.m;
                                                    int i14 = 0;
                                                    for (int i15 = 2; i14 < i15; i15 = 2) {
                                                        int i16 = i11 + iArr2[i14];
                                                        if (i16 >= A.length()) {
                                                            break;
                                                        }
                                                        if (A.charAt(i16) != ':') {
                                                            StringBuilder q = k5r.q(i16, "Expected ':' at index ", ", got '");
                                                            q.append(A.charAt(i16));
                                                            q.append('\'');
                                                            w = bow.x(A, q.toString());
                                                            break;
                                                        }
                                                        i14++;
                                                    }
                                                    int[] iArr3 = bow.n;
                                                    int i17 = 0;
                                                    while (i17 < 6 && (i4 = iArr3[i17] + i11) < A.length()) {
                                                        char charAt5 = A.charAt(i4);
                                                        int[] iArr4 = iArr3;
                                                        if ('0' > charAt5 || charAt5 >= ':') {
                                                            StringBuilder q2 = k5r.q(i4, "Expected an ASCII digit at index ", ", got '");
                                                            q2.append(A.charAt(i4));
                                                            q2.append('\'');
                                                            w = bow.x(A, q2.toString());
                                                            break;
                                                        }
                                                        i17++;
                                                        iArr3 = iArr4;
                                                    }
                                                    int y6 = bow.y(i11 + 1, A);
                                                    int y7 = length > 3 ? bow.y(i11 + 4, A) : 0;
                                                    int y8 = length > 6 ? bow.y(i11 + 7, A) : 0;
                                                    if (y7 > 59) {
                                                        w = bow.x(A, "Expected offset-minute-of-hour in 0..59, got " + y7);
                                                    } else if (y8 > 59) {
                                                        w = bow.x(A, "Expected offset-second-of-minute in 0..59, got " + y8);
                                                    } else if (y6 <= 17 || (y6 == 18 && y7 == 0 && y8 == 0)) {
                                                        i3 = ((y7 * 60) + (y6 * 3600) + y8) * (charAt4 == '-' ? -1 : 1);
                                                        if (1 <= y || y >= 13) {
                                                            w = bow.x(A, "Expected a month number in 1..12, got " + y);
                                                        } else {
                                                            if (1 <= y2) {
                                                                int i18 = i6 & 3;
                                                                if (y2 <= (y != 2 ? (y == 4 || y == 6 || y == 9 || y == 11) ? 30 : 31 : i18 == 0 && (i6 % 100 != 0 || i6 % 400 == 0) ? 29 : 28)) {
                                                                    if (y3 > 23) {
                                                                        w = bow.x(A, "Expected hour in 0..23, got " + y3);
                                                                    } else if (y4 > 59) {
                                                                        w = bow.x(A, "Expected minute-of-hour in 0..59, got " + y4);
                                                                    } else if (y5 > 59) {
                                                                        w = bow.x(A, "Expected second-of-minute in 0..59, got " + y5);
                                                                    } else {
                                                                        long j2 = i6;
                                                                        long j3 = 365 * j2;
                                                                        if (j2 >= 0) {
                                                                            i5 = i3;
                                                                            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j3;
                                                                        } else {
                                                                            i5 = i3;
                                                                            j = j3 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
                                                                        }
                                                                        long j4 = j + (((y * 367) - 362) / 12) + (y2 - 1);
                                                                        if (y > 2) {
                                                                            j4 = (i18 != 0 || (i6 % 100 == 0 && i6 % 400 != 0)) ? j4 - 2 : (-1) + j4;
                                                                        }
                                                                        w = new mdr((((j4 - 719528) * 86400) + (((y4 * 60) + (y3 * 3600)) + y5)) - i5, i2);
                                                                    }
                                                                }
                                                            }
                                                            StringBuilder l = dfi.l("Expected a valid day-of-month for month ", y, i6, " of year ", ", got ");
                                                            l.append(y2);
                                                            w = bow.x(A, l.toString());
                                                        }
                                                    } else {
                                                        w = bow.x(A, "Expected an offset in -18:00..+18:00, got " + A.subSequence(i11, A.length()).toString());
                                                    }
                                                }
                                            } else if (charAt4 == 'Z' || charAt4 == 'z') {
                                                int i19 = i11 + 1;
                                                if (A.length() == i19) {
                                                    i3 = 0;
                                                    if (1 <= y) {
                                                    }
                                                    w = bow.x(A, "Expected a month number in 1..12, got " + y);
                                                } else {
                                                    w = bow.x(A, "Extra text after the instant at position " + i19);
                                                }
                                            } else {
                                                w = bow.x(A, "Expected the UTC offset at position " + i11 + ", got '" + charAt4 + '\'');
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                w = bow.x(A, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return w.toInstant();
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        voe voeVar = (voe) obj;
        l6bVar.getClass();
        voeVar.getClass();
        l6bVar.E(voeVar.toString());
    }
}
