package kotlin.text;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.hx7;
import defpackage.k5r;
import defpackage.t75;
import defpackage.uz0;
import defpackage.wvs;
import defpackage.xq0;
import defpackage.xz0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_1, xs = "kotlin/text/StringsKt")
/* loaded from: classes5.dex */
public class StringsKt__StringsKt extends c {
    public static final boolean A(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!a.c(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final void B(int i) {
        if (i >= 0) {
            return;
        }
        xq0.o(k5r.i(i, "Limit must be non-negative, but was "));
    }

    public static final List C(int i, CharSequence charSequence, String str, boolean z) {
        B(i);
        int i2 = 0;
        int w = w(0, charSequence, str, z);
        if (w == -1 || i == 1) {
            return t75.c(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i3 = 10;
        if (z2 && i <= 10) {
            i3 = i;
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, w).toString());
            i2 = str.length() + w;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            w = w(i2, charSequence, str, z);
        } while (w != -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    public static final String D(CharSequence charSequence, IntRange intRange) {
        charSequence.getClass();
        intRange.getClass();
        return charSequence.subSequence(intRange.a, intRange.b + 1).toString();
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return StringsKt.d0(charSequence, strArr, z, i);
    }

    public static final int w(int i, CharSequence charSequence, String str, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? x(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int x(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        kotlin.ranges.a aVar;
        CharSequence charSequence3 = charSequence2;
        int i3 = i;
        int i4 = i2;
        if (z2) {
            int Q = StringsKt.Q(charSequence);
            if (i3 > Q) {
                i3 = Q;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            kotlin.ranges.a.d.getClass();
            aVar = new kotlin.ranges.a(i3, i4, -1);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            aVar = new IntRange(i3, i4, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i5 = aVar.c;
        int i6 = aVar.b;
        int i7 = aVar.a;
        if (z3 && (charSequence3 instanceof String)) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                int i8 = i7;
                while (true) {
                    String str = (String) charSequence3;
                    if (!c.p(str, z, (String) charSequence, 0, i8, str.length())) {
                        if (i8 == i6) {
                            break;
                        }
                        i8 += i5;
                    } else {
                        return i8;
                    }
                }
            }
        } else if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            int i9 = i7;
            while (!A(charSequence3, 0, charSequence, i9, charSequence3.length(), z)) {
                if (i9 != i6) {
                    i9 += i5;
                    charSequence3 = charSequence2;
                }
            }
            return i9;
        }
        return -1;
    }

    public static final int y(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(xz0.R(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (a.c(c, charAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static hx7 z(CharSequence charSequence, String[] strArr, final boolean z, int i) {
        B(i);
        final List c = uz0.c(strArr);
        return new hx7(charSequence, i, new Function2() { // from class: kotlin.text.e
            /* JADX WARN: Removed duplicated region for block: B:12:0x00f7  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x010b A[RETURN] */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj, Object obj2) {
                Object obj3;
                Pair pair;
                Object obj4;
                Object obj5;
                CharSequence charSequence2 = (CharSequence) obj;
                int intValue = ((Integer) obj2).intValue();
                charSequence2.getClass();
                List list = c;
                boolean z2 = z;
                if (z2 || list.size() != 1) {
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    IntRange intRange = new IntRange(intValue, charSequence2.length(), 1);
                    boolean z3 = charSequence2 instanceof String;
                    int i2 = intRange.c;
                    int i3 = intRange.b;
                    if (z3) {
                        if ((i2 > 0 && intValue <= i3) || (i2 < 0 && i3 <= intValue)) {
                            int i4 = intValue;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj4 = null;
                                        break;
                                    }
                                    obj4 = it.next();
                                    String str = (String) obj4;
                                    if (c.p(str, z2, (String) charSequence2, 0, i4, str.length())) {
                                        break;
                                    }
                                }
                                String str2 = (String) obj4;
                                if (str2 == null) {
                                    if (i4 == i3) {
                                        break;
                                    }
                                    i4 += i2;
                                } else {
                                    pair = new Pair(Integer.valueOf(i4), str2);
                                    break;
                                }
                            }
                        }
                        pair = null;
                        if (pair == null) {
                            return new Pair(pair.a, Integer.valueOf(((String) pair.b).length()));
                        }
                        return null;
                    }
                    if ((i2 > 0 && intValue <= i3) || (i2 < 0 && i3 <= intValue)) {
                        int i5 = intValue;
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = it2.next();
                                String str3 = (String) obj3;
                                boolean z4 = z2;
                                z2 = z4;
                                if (StringsKt__StringsKt.A(str3, 0, charSequence2, i5, str3.length(), z4)) {
                                    break;
                                }
                            }
                            String str4 = (String) obj3;
                            if (str4 == null) {
                                if (i5 == i3) {
                                    break;
                                }
                                i5 += i2;
                            } else {
                                pair = new Pair(Integer.valueOf(i5), str4);
                                break;
                            }
                        }
                    }
                    pair = null;
                    if (pair == null) {
                    }
                } else {
                    List list2 = list;
                    if (list2 instanceof List) {
                        obj5 = CollectionsKt.k0(list2);
                    } else {
                        Iterator it3 = list2.iterator();
                        if (!it3.hasNext()) {
                            wvs.h("Collection is empty.");
                            return null;
                        }
                        Object next = it3.next();
                        if (it3.hasNext()) {
                            xq0.x("Collection has more than one element.");
                            return null;
                        }
                        obj5 = next;
                    }
                    String str5 = (String) obj5;
                    int T = StringsKt.T(charSequence2, str5, intValue, false, 4);
                    if (T >= 0) {
                        pair = new Pair(Integer.valueOf(T), str5);
                        if (pair == null) {
                        }
                    }
                    pair = null;
                    if (pair == null) {
                    }
                }
            }
        });
    }
}
