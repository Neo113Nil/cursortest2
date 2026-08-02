package ru.yandex.sdk.common;

import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.g3n;
import defpackage.gvu0;
import defpackage.h3n;
import defpackage.i3n;
import defpackage.j3n;
import defpackage.k3n;
import defpackage.k4o;
import defpackage.l3n;
import defpackage.m3n;
import defpackage.n3n;
import defpackage.o3n;
import defpackage.p3n;
import defpackage.qqy;
import defpackage.rcc;
import defpackage.w511;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.enums.a;

/* loaded from: classes5.dex */
public final class DurationFormatter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/sdk/common/DurationFormatter$TokenType;", "", "YEARS", "MONTHS", "DAYS", "HOURS", "MINUTES", "SECONDS", "MILLISECONDS", "common"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TokenType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TokenType[] $VALUES;
        public static final TokenType DAYS;
        public static final TokenType HOURS;
        public static final TokenType MILLISECONDS;
        public static final TokenType MINUTES;
        public static final TokenType MONTHS;
        public static final TokenType SECONDS;
        public static final TokenType YEARS;

        static {
            TokenType tokenType = new TokenType("YEARS", 0);
            YEARS = tokenType;
            TokenType tokenType2 = new TokenType("MONTHS", 1);
            MONTHS = tokenType2;
            TokenType tokenType3 = new TokenType("DAYS", 2);
            DAYS = tokenType3;
            TokenType tokenType4 = new TokenType("HOURS", 3);
            HOURS = tokenType4;
            TokenType tokenType5 = new TokenType("MINUTES", 4);
            MINUTES = tokenType5;
            TokenType tokenType6 = new TokenType("SECONDS", 5);
            SECONDS = tokenType6;
            TokenType tokenType7 = new TokenType("MILLISECONDS", 6);
            MILLISECONDS = tokenType7;
            TokenType[] tokenTypeArr = {tokenType, tokenType2, tokenType3, tokenType4, tokenType5, tokenType6, tokenType7};
            $VALUES = tokenTypeArr;
            $ENTRIES = a.a(tokenTypeArr);
        }

        public static TokenType valueOf(String str) {
            return (TokenType) Enum.valueOf(TokenType.class, str);
        }

        public static TokenType[] values() {
            return (TokenType[]) $VALUES.clone();
        }
    }

    public static void a(long j, StringBuilder sb, int i) {
        String valueOf = String.valueOf(j);
        int length = i - valueOf.length();
        if (length < 0) {
            length = 0;
        }
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(MoneyInputEditView.DEFAULT_VALUE);
        }
        sb.append(valueOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(long j, String str) {
        long j2;
        ListIterator listIterator;
        qqy qqyVar;
        ?? r26;
        long j3;
        long j4;
        long j5;
        Object i3nVar;
        int intValue;
        Pair pair;
        Character w0;
        if (str.length() == 0) {
            return "";
        }
        ListBuilder a = rcc.a();
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '\'') {
                int i2 = i + 1;
                StringBuilder sb = new StringBuilder();
                while (true) {
                    if (i2 >= str.length()) {
                        pair = new Pair(sb.toString(), Integer.valueOf(i2));
                        break;
                    }
                    if (str.charAt(i2) == '\'' && (w0 = gvu0.w0(i2 + 1, str)) != null && w0.charValue() == '\'') {
                        sb.append('\'');
                        i2 += 2;
                    } else {
                        if (str.charAt(i2) == '\'') {
                            pair = new Pair(sb.toString(), Integer.valueOf(i2 + 1));
                            break;
                        }
                        sb.append(str.charAt(i2));
                        i2++;
                    }
                }
                String str2 = (String) pair.getFirst();
                intValue = ((Number) pair.getSecond()).intValue();
                a.add(new j3n(str2));
            } else {
                char charAt = str.charAt(i);
                int i3 = i + 1;
                while (i3 < str.length() && str.charAt(i3) == charAt) {
                    i3++;
                }
                int i4 = i3 - i;
                if (charAt == 'H') {
                    i3nVar = new i3n(i4);
                } else if (charAt == 'M') {
                    i3nVar = new m3n(i4);
                } else if (charAt != 'S') {
                    if (charAt != 'Y') {
                        if (charAt == 'd') {
                            i3nVar = new g3n(i4);
                        } else if (charAt == 'h') {
                            i3nVar = new h3n(i4);
                        } else if (charAt == 'm') {
                            i3nVar = new l3n(i4);
                        } else if (charAt == 's') {
                            i3nVar = new n3n(i4);
                        } else if (charAt != 'y') {
                            i3nVar = new j3n(str.substring(i, i3));
                        }
                    }
                    i3nVar = new o3n(i4);
                } else {
                    i3nVar = new k3n(i4);
                }
                Pair pair2 = new Pair(i3nVar, Integer.valueOf(i3));
                p3n p3nVar = (p3n) pair2.getFirst();
                intValue = ((Number) pair2.getSecond()).intValue();
                a.add(p3nVar);
            }
            i = intValue;
        }
        ListBuilder j6 = a.j();
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator2 = j6.listIterator(0);
        while (true) {
            qqy qqyVar2 = (qqy) listIterator2;
            TokenType tokenType = null;
            if (qqyVar2.hasNext()) {
                p3n p3nVar2 = (p3n) qqyVar2.next();
                if (p3nVar2 instanceof o3n) {
                    tokenType = TokenType.YEARS;
                } else if (p3nVar2 instanceof m3n) {
                    tokenType = TokenType.MONTHS;
                } else if (p3nVar2 instanceof g3n) {
                    tokenType = TokenType.DAYS;
                } else if ((p3nVar2 instanceof i3n) || (p3nVar2 instanceof h3n)) {
                    tokenType = TokenType.HOURS;
                } else if (p3nVar2 instanceof l3n) {
                    tokenType = TokenType.MINUTES;
                } else if (p3nVar2 instanceof n3n) {
                    tokenType = TokenType.SECONDS;
                } else if (p3nVar2 instanceof k3n) {
                    tokenType = TokenType.MILLISECONDS;
                } else if (!(p3nVar2 instanceof j3n)) {
                    w511.b();
                    return null;
                }
                if (tokenType != null) {
                    arrayList.add(tokenType);
                }
            } else {
                Set N0 = kotlin.collections.a.N0(arrayList);
                long j7 = j / 86400000;
                long j8 = j % 86400000;
                TokenType tokenType2 = TokenType.DAYS;
                long j9 = N0.contains(tokenType2) ? j8 / 3600000 : j / 3600000;
                long j10 = j8 % 3600000;
                TokenType tokenType3 = TokenType.HOURS;
                long j11 = c(N0, tokenType2, tokenType3) ? j10 / 60000 : j / 60000;
                long j12 = j10 % 60000;
                TokenType tokenType4 = TokenType.MINUTES;
                long j13 = c(N0, tokenType2, tokenType3, tokenType4) ? j12 / 1000 : j / 1000;
                long j14 = j12 % 1000;
                if (!c(N0, tokenType2, tokenType3, tokenType4, TokenType.SECONDS)) {
                    j14 = j;
                }
                long j15 = 12;
                if (j9 != 0) {
                    if (j9 > 12) {
                        j15 = j9 % 12;
                    } else {
                        j2 = j9;
                        StringBuilder sb2 = new StringBuilder();
                        listIterator = j6.listIterator(0);
                        while (true) {
                            qqyVar = (qqy) listIterator;
                            if (qqyVar.hasNext()) {
                                return sb2.toString();
                            }
                            p3n p3nVar3 = (p3n) qqyVar.next();
                            if (p3nVar3 instanceof j3n) {
                                sb2.append(((j3n) p3nVar3).a);
                            } else if (p3nVar3 instanceof o3n) {
                                a(0L, sb2, ((o3n) p3nVar3).a);
                            } else if (p3nVar3 instanceof m3n) {
                                a(0L, sb2, ((m3n) p3nVar3).a);
                            } else if (p3nVar3 instanceof g3n) {
                                a(j7, sb2, ((g3n) p3nVar3).a);
                            } else if (p3nVar3 instanceof i3n) {
                                a(j9, sb2, ((i3n) p3nVar3).a);
                            } else {
                                if (p3nVar3 instanceof h3n) {
                                    r26 = tokenType;
                                    j3 = j7;
                                    j4 = j2;
                                    a(j4, sb2, ((h3n) p3nVar3).a);
                                } else {
                                    r26 = tokenType;
                                    j3 = j7;
                                    j4 = j2;
                                    if (p3nVar3 instanceof l3n) {
                                        a(j11, sb2, ((l3n) p3nVar3).a);
                                        r26 = r26;
                                    } else {
                                        if (p3nVar3 instanceof n3n) {
                                            j5 = j13;
                                            a(j5, sb2, ((n3n) p3nVar3).a);
                                        } else {
                                            j5 = j13;
                                            if (!(p3nVar3 instanceof k3n)) {
                                                w511.b();
                                                return r26;
                                            }
                                            a(j14, sb2, ((k3n) p3nVar3).a);
                                        }
                                        j2 = j4;
                                        j13 = j5;
                                        j7 = j3;
                                        tokenType = r26;
                                    }
                                }
                                j5 = j13;
                                j2 = j4;
                                j13 = j5;
                                j7 = j3;
                                tokenType = r26;
                            }
                            r26 = tokenType;
                            j3 = j7;
                            j5 = j13;
                            j4 = j2;
                            j2 = j4;
                            j13 = j5;
                            j7 = j3;
                            tokenType = r26;
                        }
                    }
                }
                j2 = j15;
                StringBuilder sb22 = new StringBuilder();
                listIterator = j6.listIterator(0);
                while (true) {
                    qqyVar = (qqy) listIterator;
                    if (qqyVar.hasNext()) {
                    }
                    j2 = j4;
                    j13 = j5;
                    j7 = j3;
                    tokenType = r26;
                }
            }
        }
    }

    public static boolean c(Set set, TokenType... tokenTypeArr) {
        for (TokenType tokenType : tokenTypeArr) {
            if (set.contains(tokenType)) {
                return true;
            }
        }
        return false;
    }
}
