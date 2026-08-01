package i1;

import B0.c;
import B1.z;
import S0.l;
import com.anythink.core.common.d.j;
import com.icefishing.icefishingbigwin.AbstractC4404f;
import java.io.EOFException;
import x.C5176n;
import y8.e;
import y8.h;
import y8.m;
import y8.r;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4580b extends AbstractC4579a {

    /* renamed from: E, reason: collision with root package name */
    public static final h f38034E;

    /* renamed from: F, reason: collision with root package name */
    public static final h f38035F;

    /* renamed from: G, reason: collision with root package name */
    public static final h f38036G;

    /* renamed from: A, reason: collision with root package name */
    public int f38037A;

    /* renamed from: B, reason: collision with root package name */
    public long f38038B;

    /* renamed from: C, reason: collision with root package name */
    public int f38039C;

    /* renamed from: D, reason: collision with root package name */
    public String f38040D;

    /* renamed from: y, reason: collision with root package name */
    public final r f38041y;

    /* renamed from: z, reason: collision with root package name */
    public final e f38042z;

    static {
        h hVar = h.f41954w;
        f38034E = C5176n.b("'\\");
        f38035F = C5176n.b("\"\\");
        f38036G = C5176n.b("{}[]:, \n\t\r\f/\\;#=");
        C5176n.b("\n\r");
        C5176n.b("*/");
    }

    public C4580b(r rVar) {
        this.f38031u = new int[32];
        this.f38032v = new String[32];
        this.f38033w = new int[32];
        this.f38037A = 0;
        this.f38041y = rVar;
        this.f38042z = rVar.f41985u;
        J(6);
    }

    @Override // i1.AbstractC4579a
    public final void B() {
        int i = this.f38037A;
        if (i == 0) {
            i = Z();
        }
        if (i != 2) {
            throw new c("Expected END_OBJECT but was " + AbstractC4404f.q(I()) + " at path " + C());
        }
        int i6 = this.f38030n;
        int i9 = i6 - 1;
        this.f38030n = i9;
        this.f38032v[i9] = null;
        int[] iArr = this.f38033w;
        int i10 = i6 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.f38037A = 0;
    }

    @Override // i1.AbstractC4579a
    public final boolean D() {
        int i = this.f38037A;
        if (i == 0) {
            i = Z();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    @Override // i1.AbstractC4579a
    public final boolean E() {
        int i = this.f38037A;
        if (i == 0) {
            i = Z();
        }
        if (i == 5) {
            this.f38037A = 0;
            int[] iArr = this.f38033w;
            int i6 = this.f38030n - 1;
            iArr[i6] = iArr[i6] + 1;
            return true;
        }
        if (i == 6) {
            this.f38037A = 0;
            int[] iArr2 = this.f38033w;
            int i9 = this.f38030n - 1;
            iArr2[i9] = iArr2[i9] + 1;
            return false;
        }
        throw new c("Expected a boolean but was " + AbstractC4404f.q(I()) + " at path " + C());
    }

    @Override // i1.AbstractC4579a
    public final double F() {
        int i = this.f38037A;
        if (i == 0) {
            i = Z();
        }
        if (i == 16) {
            this.f38037A = 0;
            int[] iArr = this.f38033w;
            int i6 = this.f38030n - 1;
            iArr[i6] = iArr[i6] + 1;
            return this.f38038B;
        }
        if (i == 17) {
            long j6 = this.f38039C;
            e eVar = this.f38042z;
            eVar.getClass();
            this.f38040D = eVar.F(j6, Q7.a.f2664a);
        } else if (i == 9) {
            this.f38040D = e0(f38035F);
        } else if (i == 8) {
            this.f38040D = e0(f38034E);
        } else if (i == 10) {
            this.f38040D = f0();
        } else if (i != 11) {
            throw new c("Expected a double but was " + AbstractC4404f.q(I()) + " at path " + C());
        }
        this.f38037A = 11;
        try {
            double parseDouble = Double.parseDouble(this.f38040D);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new z("JSON forbids NaN and infinities: " + parseDouble + " at path " + C());
            }
            this.f38040D = null;
            this.f38037A = 0;
            int[] iArr2 = this.f38033w;
            int i9 = this.f38030n - 1;
            iArr2[i9] = iArr2[i9] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new c("Expected a double but was " + this.f38040D + " at path " + C());
        }
    }

    @Override // i1.AbstractC4579a
    public final int G() {
        int i = this.f38037A;
        if (i == 0) {
            i = Z();
        }
        if (i == 16) {
            long j6 = this.f38038B;
            int i6 = (int) j6;
            if (j6 == i6) {
                this.f38037A = 0;
                int[] iArr = this.f38033w;
                int i9 = this.f38030n - 1;
                iArr[i9] = iArr[i9] + 1;
                return i6;
            }
            throw new c("Expected an int but was " + this.f38038B + " at path " + C());
        }
        if (i == 17) {
            long j9 = this.f38039C;
            e eVar = this.f38042z;
            eVar.getClass();
            this.f38040D = eVar.F(j9, Q7.a.f2664a);
        } else if (i == 9 || i == 8) {
            String e02 = i == 9 ? e0(f38035F) : e0(f38034E);
            this.f38040D = e02;
            try {
                int parseInt = Integer.parseInt(e02);
                this.f38037A = 0;
                int[] iArr2 = this.f38033w;
                int i10 = this.f38030n - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new c("Expected an int but was " + AbstractC4404f.q(I()) + " at path " + C());
        }
        this.f38037A = 11;
        try {
            double parseDouble = Double.parseDouble(this.f38040D);
            int i11 = (int) parseDouble;
            if (i11 != parseDouble) {
                throw new c("Expected an int but was " + this.f38040D + " at path " + C());
            }
            this.f38040D = null;
            this.f38037A = 0;
            int[] iArr3 = this.f38033w;
            int i12 = this.f38030n - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return i11;
        } catch (NumberFormatException unused2) {
            throw new c("Expected an int but was " + this.f38040D + " at path " + C());
        }
    }

    @Override // i1.AbstractC4579a
    public final String H() {
        String F8;
        int i = this.f38037A;
        if (i == 0) {
            i = Z();
        }
        if (i == 10) {
            F8 = f0();
        } else if (i == 9) {
            F8 = e0(f38035F);
        } else if (i == 8) {
            F8 = e0(f38034E);
        } else if (i == 11) {
            F8 = this.f38040D;
            this.f38040D = null;
        } else if (i == 16) {
            F8 = Long.toString(this.f38038B);
        } else {
            if (i != 17) {
                throw new c("Expected a string but was " + AbstractC4404f.q(I()) + " at path " + C());
            }
            long j6 = this.f38039C;
            e eVar = this.f38042z;
            eVar.getClass();
            F8 = eVar.F(j6, Q7.a.f2664a);
        }
        this.f38037A = 0;
        int[] iArr = this.f38033w;
        int i6 = this.f38030n - 1;
        iArr[i6] = iArr[i6] + 1;
        return F8;
    }

    @Override // i1.AbstractC4579a
    public final int I() {
        int i = this.f38037A;
        if (i == 0) {
            i = Z();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        r6 = -1;
     */
    @Override // i1.AbstractC4579a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int K(l lVar) {
        int b9;
        int i = this.f38037A;
        if (i == 0) {
            i = Z();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return a0(this.f38040D, lVar);
        }
        m mVar = (m) lVar.f2798v;
        r rVar = this.f38041y;
        if (rVar.f41986v) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            e eVar = rVar.f41985u;
            b9 = z8.a.b(eVar, mVar, true);
            if (b9 != -2) {
                if (b9 != -1) {
                    eVar.H(mVar.f41970n[b9].a());
                }
            } else if (rVar.f41984n.d(8192L, eVar) == -1) {
                break;
            }
        }
        if (b9 != -1) {
            this.f38037A = 0;
            this.f38032v[this.f38030n - 1] = ((String[]) lVar.f2797u)[b9];
            return b9;
        }
        String str = this.f38032v[this.f38030n - 1];
        String c02 = c0();
        int a02 = a0(c02, lVar);
        if (a02 == -1) {
            this.f38037A = 15;
            this.f38040D = c02;
            this.f38032v[this.f38030n - 1] = str;
        }
        return a02;
    }

    @Override // i1.AbstractC4579a
    public final void V() {
        int i = this.f38037A;
        if (i == 0) {
            i = Z();
        }
        if (i == 14) {
            long j6 = this.f38041y.j(f38036G);
            e eVar = this.f38042z;
            if (j6 == -1) {
                j6 = eVar.f41953u;
            }
            eVar.H(j6);
        } else if (i == 13) {
            h0(f38035F);
        } else if (i == 12) {
            h0(f38034E);
        } else if (i != 15) {
            throw new c("Expected a name but was " + AbstractC4404f.q(I()) + " at path " + C());
        }
        this.f38037A = 0;
        this.f38032v[this.f38030n - 1] = "null";
    }

    @Override // i1.AbstractC4579a
    public final void W() {
        int i = 0;
        do {
            int i6 = this.f38037A;
            if (i6 == 0) {
                i6 = Z();
            }
            if (i6 == 3) {
                J(1);
            } else if (i6 == 1) {
                J(3);
            } else {
                if (i6 == 4) {
                    i--;
                    if (i < 0) {
                        throw new c("Expected a value but was " + AbstractC4404f.q(I()) + " at path " + C());
                    }
                    this.f38030n--;
                } else if (i6 == 2) {
                    i--;
                    if (i < 0) {
                        throw new c("Expected a value but was " + AbstractC4404f.q(I()) + " at path " + C());
                    }
                    this.f38030n--;
                } else {
                    e eVar = this.f38042z;
                    if (i6 == 14 || i6 == 10) {
                        long j6 = this.f38041y.j(f38036G);
                        if (j6 == -1) {
                            j6 = eVar.f41953u;
                        }
                        eVar.H(j6);
                    } else if (i6 == 9 || i6 == 13) {
                        h0(f38035F);
                    } else if (i6 == 8 || i6 == 12) {
                        h0(f38034E);
                    } else if (i6 == 17) {
                        eVar.H(this.f38039C);
                    } else if (i6 == 18) {
                        throw new c("Expected a value but was " + AbstractC4404f.q(I()) + " at path " + C());
                    }
                }
                this.f38037A = 0;
            }
            i++;
            this.f38037A = 0;
        } while (i != 0);
        int[] iArr = this.f38033w;
        int i9 = this.f38030n - 1;
        iArr[i9] = iArr[i9] + 1;
        this.f38032v[i9] = "null";
    }

    public final void Y() {
        X("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bb, code lost:
    
        if (r1 == 4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01be, code lost:
    
        if (r1 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c0, code lost:
    
        r22.f38039C = r2;
        r9 = 17;
        r22.f38037A = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0195, code lost:
    
        if (b0(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0197, code lost:
    
        if (r1 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0199, code lost:
    
        if (r4 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019f, code lost:
    
        if (r12 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a1, code lost:
    
        if (r9 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a5, code lost:
    
        if (r12 != r17) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a7, code lost:
    
        if (r9 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a9, code lost:
    
        if (r9 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ac, code lost:
    
        r12 = -r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ad, code lost:
    
        r22.f38038B = r12;
        r7.H(r2);
        r9 = 16;
        r22.f38037A = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b8, code lost:
    
        if (r1 == 2) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int Z() {
        int i;
        String str;
        String str2;
        long j6;
        char k9;
        int i6;
        char c9;
        int[] iArr = this.f38031u;
        int i9 = this.f38030n - 1;
        int i10 = iArr[i9];
        e eVar = this.f38042z;
        if (i10 == 1) {
            iArr[i9] = 2;
        } else if (i10 == 2) {
            int d02 = d0(true);
            eVar.z();
            if (d02 != 44) {
                if (d02 == 59) {
                    Y();
                    throw null;
                }
                if (d02 == 93) {
                    this.f38037A = 4;
                    return 4;
                }
                X("Unterminated array");
                throw null;
            }
        } else {
            if (i10 == 3 || i10 == 5) {
                iArr[i9] = 4;
                if (i10 == 5) {
                    int d03 = d0(true);
                    eVar.z();
                    if (d03 != 44) {
                        if (d03 == 59) {
                            Y();
                            throw null;
                        }
                        if (d03 == 125) {
                            this.f38037A = 2;
                            return 2;
                        }
                        X("Unterminated object");
                        throw null;
                    }
                }
                int d04 = d0(true);
                if (d04 == 34) {
                    eVar.z();
                    this.f38037A = 13;
                    return 13;
                }
                if (d04 == 39) {
                    eVar.z();
                    Y();
                    throw null;
                }
                if (d04 != 125) {
                    Y();
                    throw null;
                }
                if (i10 == 5) {
                    X("Expected name");
                    throw null;
                }
                eVar.z();
                this.f38037A = 2;
                return 2;
            }
            if (i10 == 4) {
                iArr[i9] = 5;
                int d05 = d0(true);
                eVar.z();
                if (d05 != 58) {
                    if (d05 != 61) {
                        X("Expected ':'");
                        throw null;
                    }
                    Y();
                    throw null;
                }
            } else if (i10 == 6) {
                iArr[i9] = 7;
            } else {
                if (i10 == 7) {
                    if (d0(false) == -1) {
                        this.f38037A = 18;
                        return 18;
                    }
                    Y();
                    throw null;
                }
                if (i10 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int d06 = d0(true);
        if (d06 == 34) {
            eVar.z();
            this.f38037A = 9;
            return 9;
        }
        if (d06 == 39) {
            Y();
            throw null;
        }
        if (d06 != 44 && d06 != 59) {
            if (d06 == 91) {
                eVar.z();
                this.f38037A = 3;
                return 3;
            }
            if (d06 != 93) {
                if (d06 == 123) {
                    eVar.z();
                    this.f38037A = 1;
                    return 1;
                }
                byte k10 = eVar.k(0L);
                r rVar = this.f38041y;
                if (k10 == 116 || k10 == 84) {
                    i = 5;
                    str2 = "true";
                    str = "TRUE";
                } else if (k10 == 102 || k10 == 70) {
                    i = 6;
                    str2 = "false";
                    str = "FALSE";
                } else if (k10 == 110 || k10 == 78) {
                    i = 7;
                    str2 = "null";
                    str = "NULL";
                } else {
                    j6 = 0;
                    i = 0;
                    if (i == 0) {
                        return i;
                    }
                    boolean z3 = true;
                    long j9 = j6;
                    char c10 = 0;
                    int i11 = 0;
                    boolean z6 = false;
                    while (true) {
                        int i12 = i11 + 1;
                        if (!rVar.S(i12)) {
                            break;
                        }
                        byte k11 = eVar.k(i11);
                        if (k11 != 43) {
                            if (k11 == 69 || k11 == 101) {
                                c9 = 6;
                                if (c10 != 2 && c10 != 4) {
                                    break;
                                }
                                c10 = 5;
                                i11 = i12;
                            } else if (k11 == 45) {
                                c9 = 6;
                                if (c10 == 0) {
                                    c10 = 1;
                                    z6 = true;
                                    i11 = i12;
                                } else {
                                    if (c10 != 5) {
                                        break;
                                    }
                                    c10 = c9;
                                    i11 = i12;
                                }
                            } else if (k11 == 46) {
                                c9 = 6;
                                if (c10 != 2) {
                                    break;
                                }
                                c10 = 3;
                                i11 = i12;
                            } else {
                                if (k11 < 48 || k11 > 57) {
                                    break;
                                }
                                if (c10 == 1 || c10 == 0) {
                                    c9 = 6;
                                    j9 = -(k11 - 48);
                                    c10 = 2;
                                } else {
                                    if (c10 == 2) {
                                        if (j9 == j6) {
                                            break;
                                        }
                                        long j10 = (10 * j9) - (k11 - 48);
                                        z3 &= j9 > -922337203685477580L || (j9 == -922337203685477580L && j10 < j9);
                                        j9 = j10;
                                    } else if (c10 == 3) {
                                        c10 = 4;
                                    } else {
                                        c9 = 6;
                                        if (c10 == 5 || c10 == 6) {
                                            c10 = 7;
                                        }
                                    }
                                    c9 = 6;
                                    i11 = i12;
                                }
                                i11 = i12;
                            }
                            if (i6 == 0) {
                                return i6;
                            }
                            if (b0(eVar.k(j6))) {
                                Y();
                                throw null;
                            }
                            X("Expected value");
                            throw null;
                        }
                        c9 = 6;
                        if (c10 != 5) {
                            break;
                        }
                        c10 = c9;
                        i11 = i12;
                    }
                    i6 = 0;
                    if (i6 == 0) {
                    }
                }
                int length = str2.length();
                j6 = 0;
                int i13 = 1;
                while (true) {
                    if (i13 < length) {
                        int i14 = i13 + 1;
                        if (!rVar.S(i14) || ((k9 = eVar.k(i13)) != str2.charAt(i13) && k9 != str.charAt(i13))) {
                            break;
                        }
                        i13 = i14;
                    } else if (!rVar.S(length + 1) || !b0(eVar.k(length))) {
                        eVar.H(length);
                        this.f38037A = i;
                    }
                }
                i = 0;
                if (i == 0) {
                }
            } else if (i10 == 1) {
                eVar.z();
                this.f38037A = 4;
                return 4;
            }
        }
        if (i10 == 1 || i10 == 2) {
            Y();
            throw null;
        }
        X("Unexpected value");
        throw null;
    }

    public final int a0(String str, l lVar) {
        int length = ((String[]) lVar.f2797u).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) lVar.f2797u)[i])) {
                this.f38037A = 0;
                this.f38032v[this.f38030n - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // i1.AbstractC4579a
    public final void b() {
        int i = this.f38037A;
        if (i == 0) {
            i = Z();
        }
        if (i == 3) {
            J(1);
            this.f38033w[this.f38030n - 1] = 0;
            this.f38037A = 0;
        } else {
            throw new c("Expected BEGIN_ARRAY but was " + AbstractC4404f.q(I()) + " at path " + C());
        }
    }

    public final boolean b0(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case j.v.f12578I /* 93 */:
                            return false;
                        case j.v.f12577H /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        Y();
        throw null;
    }

    public final String c0() {
        String str;
        int i = this.f38037A;
        if (i == 0) {
            i = Z();
        }
        if (i == 14) {
            str = f0();
        } else if (i == 13) {
            str = e0(f38035F);
        } else if (i == 12) {
            str = e0(f38034E);
        } else {
            if (i != 15) {
                throw new c("Expected a name but was " + AbstractC4404f.q(I()) + " at path " + C());
            }
            str = this.f38040D;
        }
        this.f38037A = 0;
        this.f38032v[this.f38030n - 1] = str;
        return str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f38037A = 0;
        this.f38031u[0] = 8;
        this.f38030n = 1;
        e eVar = this.f38042z;
        eVar.H(eVar.f41953u);
        this.f38041y.close();
    }

    public final int d0(boolean z3) {
        int i = 0;
        while (true) {
            int i6 = i + 1;
            r rVar = this.f38041y;
            if (!rVar.S(i6)) {
                if (z3) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j6 = i;
            e eVar = this.f38042z;
            byte k9 = eVar.k(j6);
            if (k9 != 10 && k9 != 32 && k9 != 13 && k9 != 9) {
                eVar.H(j6);
                if (k9 == 47) {
                    if (rVar.S(2L)) {
                        Y();
                        throw null;
                    }
                } else if (k9 == 35) {
                    Y();
                    throw null;
                }
                return k9;
            }
            i = i6;
        }
    }

    public final String e0(h hVar) {
        StringBuilder sb = null;
        while (true) {
            long j6 = this.f38041y.j(hVar);
            if (j6 == -1) {
                X("Unterminated string");
                throw null;
            }
            e eVar = this.f38042z;
            if (eVar.k(j6) != 92) {
                if (sb == null) {
                    String F8 = eVar.F(j6, Q7.a.f2664a);
                    eVar.z();
                    return F8;
                }
                sb.append(eVar.F(j6, Q7.a.f2664a));
                eVar.z();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(eVar.F(j6, Q7.a.f2664a));
            eVar.z();
            sb.append(g0());
        }
    }

    public final String f0() {
        long j6 = this.f38041y.j(f38036G);
        e eVar = this.f38042z;
        if (j6 == -1) {
            return eVar.G();
        }
        eVar.getClass();
        return eVar.F(j6, Q7.a.f2664a);
    }

    public final char g0() {
        int i;
        r rVar = this.f38041y;
        if (!rVar.S(1L)) {
            X("Unterminated escape sequence");
            throw null;
        }
        e eVar = this.f38042z;
        byte z3 = eVar.z();
        if (z3 == 10 || z3 == 34 || z3 == 39 || z3 == 47 || z3 == 92) {
            return (char) z3;
        }
        if (z3 == 98) {
            return '\b';
        }
        if (z3 == 102) {
            return '\f';
        }
        if (z3 == 110) {
            return '\n';
        }
        if (z3 == 114) {
            return '\r';
        }
        if (z3 == 116) {
            return '\t';
        }
        if (z3 != 117) {
            X("Invalid escape sequence: \\" + ((char) z3));
            throw null;
        }
        if (!rVar.S(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + C());
        }
        char c9 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            byte k9 = eVar.k(i6);
            char c10 = (char) (c9 << 4);
            if (k9 >= 48 && k9 <= 57) {
                i = k9 - 48;
            } else if (k9 >= 97 && k9 <= 102) {
                i = k9 - 87;
            } else {
                if (k9 < 65 || k9 > 70) {
                    X("\\u".concat(eVar.F(4L, Q7.a.f2664a)));
                    throw null;
                }
                i = k9 - 55;
            }
            c9 = (char) (i + c10);
        }
        eVar.H(4L);
        return c9;
    }

    public final void h0(h hVar) {
        while (true) {
            long j6 = this.f38041y.j(hVar);
            if (j6 == -1) {
                X("Unterminated string");
                throw null;
            }
            e eVar = this.f38042z;
            if (eVar.k(j6) != 92) {
                eVar.H(j6 + 1);
                return;
            } else {
                eVar.H(j6 + 1);
                g0();
            }
        }
    }

    @Override // i1.AbstractC4579a
    public final void j() {
        int i = this.f38037A;
        if (i == 0) {
            i = Z();
        }
        if (i == 1) {
            J(3);
            this.f38037A = 0;
        } else {
            throw new c("Expected BEGIN_OBJECT but was " + AbstractC4404f.q(I()) + " at path " + C());
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f38041y + ")";
    }

    @Override // i1.AbstractC4579a
    public final void z() {
        int i = this.f38037A;
        if (i == 0) {
            i = Z();
        }
        if (i != 4) {
            throw new c("Expected END_ARRAY but was " + AbstractC4404f.q(I()) + " at path " + C());
        }
        int i6 = this.f38030n;
        this.f38030n = i6 - 1;
        int[] iArr = this.f38033w;
        int i9 = i6 - 2;
        iArr[i9] = iArr[i9] + 1;
        this.f38037A = 0;
    }
}
