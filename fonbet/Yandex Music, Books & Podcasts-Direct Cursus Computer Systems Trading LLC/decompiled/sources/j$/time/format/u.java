package j$.time.format;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class u {
    public static final j$.time.f h = new j$.time.f(2);
    public static final Map i;
    public u a;
    public final u b;
    public final List c;
    public final boolean d;
    public int e;
    public char f;
    public int g;

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put('G', j$.time.temporal.a.ERA);
        hashMap.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        hashMap.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.g gVar = j$.time.temporal.i.a;
        hashMap.put('Q', gVar);
        hashMap.put('q', gVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        hashMap.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        hashMap.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        hashMap.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        hashMap.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        hashMap.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        hashMap.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', j$.time.temporal.a.NANO_OF_DAY);
        hashMap.put('g', j$.time.temporal.k.a);
    }

    public u() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    public u(u uVar) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = uVar;
        this.d = true;
    }

    public final void l(j$.time.temporal.o oVar) {
        k(new i(oVar, 1, 19, e0.NORMAL));
    }

    public final void m(j$.time.temporal.o oVar, int i2) {
        Objects.requireNonNull(oVar, "field");
        if (i2 < 1 || i2 > 19) {
            j$.time.i.h("The width must be from 1 to 19 inclusive but was ", i2);
        } else {
            k(new i(oVar, i2, i2, e0.NOT_NEGATIVE));
        }
    }

    public final void n(j$.time.temporal.o oVar, int i2, int i3, e0 e0Var) {
        if (i2 == i3 && e0Var == e0.NOT_NEGATIVE) {
            m(oVar, i3);
            return;
        }
        Objects.requireNonNull(oVar, "field");
        Objects.requireNonNull(e0Var, "signStyle");
        if (i2 < 1 || i2 > 19) {
            j$.time.i.h("The minimum width must be from 1 to 19 inclusive but was ", i2);
            return;
        }
        if (i3 < 1 || i3 > 19) {
            j$.time.i.h("The maximum width must be from 1 to 19 inclusive but was ", i3);
            return;
        }
        if (i3 < i2) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
        }
        k(new i(oVar, i2, i3, e0Var));
    }

    public final void k(i iVar) {
        i d;
        u uVar = this.a;
        int i2 = uVar.g;
        if (i2 < 0) {
            uVar.g = c(iVar);
            return;
        }
        i iVar2 = (i) ((ArrayList) uVar.c).get(i2);
        int i3 = iVar.b;
        int i4 = iVar.c;
        if (i3 == i4 && iVar.d == e0.NOT_NEGATIVE) {
            d = iVar2.e(i4);
            c(iVar.d());
            this.a.g = i2;
        } else {
            d = iVar2.d();
            this.a.g = c(iVar);
        }
        ((ArrayList) this.a.c).set(i2, d);
    }

    public final void b(j$.time.temporal.a aVar, int i2, int i3, boolean z) {
        if (i2 == i3 && !z) {
            k(new f(aVar, i2, i3, z));
        } else {
            c(new f(aVar, i2, i3, z));
        }
    }

    public final void j(j$.time.temporal.o oVar, f0 f0Var) {
        Objects.requireNonNull(f0Var, "textStyle");
        c(new q(oVar, f0Var, a0.c));
    }

    public final void i(j$.time.temporal.a aVar, Map map) {
        Objects.requireNonNull(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        f0 f0Var = f0.FULL;
        c(new q(aVar, f0Var, new a(new z(Collections.singletonMap(f0Var, linkedHashMap)))));
    }

    public final void g(String str, String str2) {
        c(new j(str, str2));
    }

    public final void f(f0 f0Var) {
        Objects.requireNonNull(f0Var, "style");
        if (f0Var != f0.FULL && f0Var != f0.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        c(new h(f0Var, 0));
    }

    public final void d(char c) {
        c(new c(c));
    }

    public final void e(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            c(new c(str.charAt(0)));
        } else {
            c(new h(str, 1));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d dVar = dateTimeFormatter.a;
        if (dVar.b) {
            dVar = new d(dVar.a, false);
        }
        c(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0382 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(String str) {
        boolean z;
        int i2;
        int i3;
        Objects.requireNonNull(str, "pattern");
        int i4 = 0;
        while (i4 < str.length()) {
            char charAt = str.charAt(i4);
            if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                int i5 = i4 + 1;
                while (i5 < str.length() && str.charAt(i5) == charAt) {
                    i5++;
                }
                int i6 = i5 - i4;
                if (charAt == 'p') {
                    if (i5 >= str.length() || (((charAt = str.charAt(i5)) < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z'))) {
                        i2 = i5;
                        i3 = i6;
                        i6 = 0;
                    } else {
                        i2 = i5 + 1;
                        while (i2 < str.length() && str.charAt(i2) == charAt) {
                            i2++;
                        }
                        i3 = i2 - i5;
                    }
                    if (i6 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    if (i6 < 1) {
                        j$.time.i.h("The pad width must be at least one but was ", i6);
                        return;
                    }
                    u uVar = this.a;
                    uVar.e = i6;
                    uVar.f = ' ';
                    uVar.g = -1;
                    i6 = i3;
                    i5 = i2;
                }
                j$.time.temporal.o oVar = (j$.time.temporal.o) ((HashMap) i).get(Character.valueOf(charAt));
                if (oVar != null) {
                    if (charAt != 'A') {
                        if (charAt != 'Q') {
                            if (charAt == 'S') {
                                b(j$.time.temporal.a.NANO_OF_SECOND, i6, i6, false);
                            } else if (charAt != 'a') {
                                if (charAt != 'k') {
                                    if (charAt != 'q') {
                                        if (charAt != 's') {
                                            if (charAt == 'u' || charAt == 'y') {
                                                if (i6 == 2) {
                                                    LocalDate localDate = o.h;
                                                    Objects.requireNonNull(localDate, "baseDate");
                                                    k(new o(oVar, 2, 2, localDate, 0));
                                                } else if (i6 < 4) {
                                                    n(oVar, i6, 19, e0.NORMAL);
                                                } else {
                                                    n(oVar, i6, 19, e0.EXCEEDS_PAD);
                                                }
                                            } else if (charAt == 'g') {
                                                n(oVar, i6, 19, e0.NORMAL);
                                            } else if (charAt != 'h' && charAt != 'm') {
                                                if (charAt != 'n') {
                                                    switch (charAt) {
                                                        case 'D':
                                                            if (i6 == 1) {
                                                                l(oVar);
                                                                break;
                                                            } else if (i6 != 2 && i6 != 3) {
                                                                j$.time.i.k("Too many pattern letters: ", charAt);
                                                                return;
                                                            } else {
                                                                n(oVar, i6, 3, e0.NOT_NEGATIVE);
                                                                break;
                                                            }
                                                        case 'E':
                                                            break;
                                                        case RemoteCameraConfig.Camera.JPEG_QUALITY_70 /* 70 */:
                                                            if (i6 != 1) {
                                                                j$.time.i.k("Too many pattern letters: ", charAt);
                                                                return;
                                                            } else {
                                                                l(oVar);
                                                                break;
                                                            }
                                                        case 'G':
                                                            if (i6 != 1 && i6 != 2 && i6 != 3) {
                                                                if (i6 == 4) {
                                                                    j(oVar, f0.FULL);
                                                                    break;
                                                                } else if (i6 != 5) {
                                                                    j$.time.i.k("Too many pattern letters: ", charAt);
                                                                    return;
                                                                } else {
                                                                    j(oVar, f0.NARROW);
                                                                    break;
                                                                }
                                                            } else {
                                                                j(oVar, f0.SHORT);
                                                                break;
                                                            }
                                                        case 'H':
                                                            break;
                                                        default:
                                                            switch (charAt) {
                                                                case 'K':
                                                                    break;
                                                                case 'L':
                                                                    break;
                                                                case 'M':
                                                                    break;
                                                                case 'N':
                                                                    break;
                                                                default:
                                                                    switch (charAt) {
                                                                        case 'c':
                                                                            if (i6 == 1) {
                                                                                int i7 = i6;
                                                                                k(new r(charAt, i7, i7, i7, 0));
                                                                                break;
                                                                            } else if (i6 == 2) {
                                                                                throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                                            }
                                                                            break;
                                                                        case 'd':
                                                                            break;
                                                                        case 'e':
                                                                            break;
                                                                        default:
                                                                            if (i6 != 1) {
                                                                                m(oVar, i6);
                                                                                break;
                                                                            } else {
                                                                                l(oVar);
                                                                                break;
                                                                            }
                                                                    }
                                                            }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    z = true;
                                    if (i6 != 1 || i6 == 2) {
                                        if (charAt != 'e') {
                                            int i8 = i6;
                                            k(new r(charAt, i8, i8, i8, 0));
                                        } else if (charAt == 'E') {
                                            j(oVar, f0.SHORT);
                                        } else if (i6 == 1) {
                                            l(oVar);
                                        } else {
                                            m(oVar, 2);
                                        }
                                    } else if (i6 == 3) {
                                        j(oVar, z ? f0.SHORT_STANDALONE : f0.SHORT);
                                    } else if (i6 == 4) {
                                        j(oVar, z ? f0.FULL_STANDALONE : f0.FULL);
                                    } else {
                                        if (i6 != 5) {
                                            j$.time.i.k("Too many pattern letters: ", charAt);
                                            return;
                                        }
                                        j(oVar, z ? f0.NARROW_STANDALONE : f0.NARROW);
                                    }
                                }
                                if (i6 == 1) {
                                    l(oVar);
                                } else {
                                    if (i6 != 2) {
                                        j$.time.i.k("Too many pattern letters: ", charAt);
                                        return;
                                    }
                                    m(oVar, i6);
                                }
                            } else {
                                if (i6 != 1) {
                                    j$.time.i.k("Too many pattern letters: ", charAt);
                                    return;
                                }
                                j(oVar, f0.SHORT);
                            }
                        }
                        z = false;
                        if (i6 != 1) {
                        }
                        if (charAt != 'e') {
                        }
                    }
                    n(oVar, i6, 19, e0.NOT_NEGATIVE);
                } else if (charAt == 'z') {
                    if (i6 > 4) {
                        j$.time.i.k("Too many pattern letters: ", charAt);
                        return;
                    } else if (i6 == 4) {
                        c(new t(f0.FULL, false));
                    } else {
                        c(new t(f0.SHORT, false));
                    }
                } else if (charAt == 'V') {
                    if (i6 != 2) {
                        j$.time.i.k("Pattern letter count must be 2: ", charAt);
                        return;
                    }
                    c(new s(j$.time.temporal.p.a, "ZoneId()"));
                } else if (charAt != 'v') {
                    String str2 = "+0000";
                    if (charAt == 'Z') {
                        if (i6 < 4) {
                            g("+HHMM", "+0000");
                        } else if (i6 == 4) {
                            f(f0.FULL);
                        } else {
                            if (i6 != 5) {
                                j$.time.i.k("Too many pattern letters: ", charAt);
                                return;
                            }
                            g("+HH:MM:ss", "Z");
                        }
                    } else if (charAt == 'O') {
                        if (i6 == 1) {
                            f(f0.SHORT);
                        } else {
                            if (i6 != 4) {
                                j$.time.i.k("Pattern letter count must be 1 or 4: ", charAt);
                                return;
                            }
                            f(f0.FULL);
                        }
                    } else if (charAt == 'X') {
                        if (i6 > 5) {
                            j$.time.i.k("Too many pattern letters: ", charAt);
                            return;
                        }
                        g(j.d[i6 + (i6 == 1 ? 0 : 1)], "Z");
                    } else if (charAt == 'x') {
                        if (i6 > 5) {
                            j$.time.i.k("Too many pattern letters: ", charAt);
                            return;
                        }
                        if (i6 == 1) {
                            str2 = "+00";
                        } else if (i6 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        g(j.d[i6 + (i6 == 1 ? 0 : 1)], str2);
                    } else if (charAt != 'W') {
                        int i9 = i6;
                        if (charAt == 'w') {
                            if (i9 > 2) {
                                j$.time.i.k("Too many pattern letters: ", charAt);
                                return;
                            }
                            k(new r(charAt, i9, i9, 2, 0));
                        } else if (charAt != 'Y') {
                            j$.time.i.k("Unknown pattern letter: ", charAt);
                            return;
                        } else if (i9 == 2) {
                            k(new r(charAt, i9, i9, 2, 0));
                        } else {
                            k(new r(charAt, i9, i9, 19, 0));
                        }
                    } else if (i6 > 1) {
                        j$.time.i.k("Too many pattern letters: ", charAt);
                        return;
                    } else {
                        int i10 = i6;
                        k(new r(charAt, i10, i10, i10, 0));
                    }
                } else if (i6 == 1) {
                    c(new t(f0.SHORT, true));
                } else {
                    if (i6 != 4) {
                        j$.time.i.k("Wrong number of  pattern letters: ", charAt);
                        return;
                    }
                    c(new t(f0.FULL, true));
                }
                i4 = i5 - 1;
            } else if (charAt == '\'') {
                int i11 = i4 + 1;
                int i12 = i11;
                while (i12 < str.length()) {
                    if (str.charAt(i12) == '\'') {
                        int i13 = i12 + 1;
                        if (i13 < str.length() && str.charAt(i13) == '\'') {
                            i12 = i13;
                        }
                        if (i12 < str.length()) {
                            throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                        }
                        String substring = str.substring(i11, i12);
                        if (substring.isEmpty()) {
                            d('\'');
                        } else {
                            e(substring.replace("''", "'"));
                        }
                        i4 = i12;
                    }
                    i12++;
                }
                if (i12 < str.length()) {
                }
            } else if (charAt == '[') {
                p();
            } else if (charAt == ']') {
                if (this.a.b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                o();
            } else {
                if (charAt == '{' || charAt == '}' || charAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + charAt + "'");
                }
                d(charAt);
            }
            i4++;
        }
    }

    public final void p() {
        u uVar = this.a;
        uVar.g = -1;
        this.a = new u(uVar);
    }

    public final void o() {
        u uVar = this.a;
        if (uVar.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        int size = ((ArrayList) uVar.c).size();
        u uVar2 = this.a;
        if (size > 0) {
            d dVar = new d(uVar2.c, uVar2.d);
            this.a = this.a.b;
            c(dVar);
            return;
        }
        this.a = uVar2.b;
    }

    public final int c(e eVar) {
        Objects.requireNonNull(eVar, "pp");
        u uVar = this.a;
        int i2 = uVar.e;
        if (i2 > 0) {
            k kVar = new k(eVar, i2, uVar.f);
            uVar.e = 0;
            uVar.f = (char) 0;
            eVar = kVar;
        }
        ((ArrayList) uVar.c).add(eVar);
        this.a.g = -1;
        return ((ArrayList) r5.c).size() - 1;
    }

    public final DateTimeFormatter q(d0 d0Var, j$.time.chrono.m mVar) {
        return r(Locale.getDefault(), d0Var, mVar);
    }

    public final DateTimeFormatter r(Locale locale, d0 d0Var, j$.time.chrono.m mVar) {
        Objects.requireNonNull(locale, CommonUrlParts.LOCALE);
        while (this.a.b != null) {
            o();
        }
        return new DateTimeFormatter(new d(this.c, false), locale, b0.a, d0Var, mVar, null);
    }
}
