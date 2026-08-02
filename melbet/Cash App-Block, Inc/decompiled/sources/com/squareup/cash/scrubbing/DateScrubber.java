package com.squareup.cash.scrubbing;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes4.dex */
public final class DateScrubber implements InsertingScrubber {
    public final SimpleDateFormat dateFormat;
    public final SimpleDateFormat dayFormat;
    public final int dayIndex;
    public final String dayToken;
    public final SimpleDateFormat monthFormat;
    public final int monthIndex;
    public final String monthToken;
    public final Calendar now;
    public Function0 onInvalidContentListener;
    public final List patternIndexes;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1199type;
    public final SimpleDateFormat yearFormat;
    public final int yearIndex;
    public final String yearToken;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Type {
        public static final /* synthetic */ Type[] $VALUES;
        public static final Type ANY;
        public static final Type FUTURE;
        public static final Type PAST;

        static {
            Type type2 = new Type("PAST", 0);
            PAST = type2;
            Type type3 = new Type("FUTURE", 1);
            FUTURE = type3;
            Type type4 = new Type("ANY", 2);
            ANY = type4;
            $VALUES = new Type[]{type2, type3, type4};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public DateScrubber(SimpleDateFormat simpleDateFormat, Type type2) {
        Calendar calendar = Calendar.getInstance();
        calendar.getClass();
        this.dateFormat = simpleDateFormat;
        this.f1199type = type2;
        this.now = calendar;
        this.monthToken = "MM";
        this.dayToken = "dd";
        this.yearToken = "yyyy";
        Locale locale = Locale.US;
        this.monthFormat = new SimpleDateFormat("MM", locale);
        this.dayFormat = new SimpleDateFormat("dd", locale);
        this.yearFormat = new SimpleDateFormat("yyyy", locale);
        this.onInvalidContentListener = new DateScrubber$$ExternalSyntheticLambda0(0);
        String pattern = simpleDateFormat.toPattern();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        pattern.getClass();
        int indexOf$default = StringsKt.indexOf$default((CharSequence) pattern, "MM", 0, false, 6);
        this.monthIndex = indexOf$default;
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) pattern, "yyyy", 0, false, 6);
        this.yearIndex = indexOf$default2;
        int indexOf$default3 = StringsKt.indexOf$default((CharSequence) pattern, "dd", 0, false, 6);
        this.dayIndex = indexOf$default3;
        if (indexOf$default == -1) {
            a$$ExternalSyntheticBUOutline0.m$3("Date format needs month");
            throw null;
        }
        if (indexOf$default2 == -1) {
            a$$ExternalSyntheticBUOutline0.m$3("Date format needs year");
            throw null;
        }
        CollectionsKt__MutableCollectionsKt.addAll(RangesKt___RangesKt.until(indexOf$default, "MM".length() + indexOf$default), linkedHashSet);
        CollectionsKt__MutableCollectionsKt.addAll(RangesKt___RangesKt.until(indexOf$default2, "yyyy".length() + indexOf$default2), linkedHashSet);
        if (indexOf$default3 != -1) {
            CollectionsKt__MutableCollectionsKt.addAll(RangesKt___RangesKt.until(indexOf$default3, "dd".length() + indexOf$default3), linkedHashSet);
        }
        this.patternIndexes = CollectionsKt.sorted(linkedHashSet);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int daysInMonth(String str, String str2) {
        String str3;
        int hashCode = str.hashCode();
        switch (hashCode) {
            case 1537:
                str3 = "01";
                str.equals(str3);
                return 31;
            case 1538:
                if (str.equals("02")) {
                    if (str2.length() != 4) {
                        return 29;
                    }
                    int parseInt = Integer.parseInt(str2);
                    if (parseInt % 4 != 0) {
                        return 28;
                    }
                    return (parseInt % 100 == 0 && parseInt % 400 != 0) ? 28 : 29;
                }
            case 1539:
                str3 = "03";
                str.equals(str3);
                return 31;
            case 1540:
                return !str.equals("04") ? 31 : 30;
            case 1541:
                str3 = "05";
                str.equals(str3);
                return 31;
            case 1542:
                if (str.equals("06")) {
                    return 30;
                }
                break;
            case 1543:
                str3 = "07";
                str.equals(str3);
                return 31;
            case 1544:
                str3 = "08";
                str.equals(str3);
                return 31;
            case 1545:
                if (str.equals("09")) {
                    return 30;
                }
                break;
            default:
                switch (hashCode) {
                    case 1567:
                        str3 = "10";
                        str.equals(str3);
                        return 31;
                    case 1568:
                        if (str.equals("11")) {
                            return 30;
                        }
                        break;
                    case 1569:
                        str3 = "12";
                        str.equals(str3);
                        return 31;
                }
        }
    }

    public static String substringAvailable(String str, IntRange intRange) {
        if (intRange.first < 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
        IntProgressionIterator it = intRange.iterator();
        while (it.hasNext) {
            arrayList.add(StringsKt___StringsKt.getOrNull(it.nextInt(), str));
        }
        return CollectionsKt.joinToString$default(CollectionsKt.filterNotNull(arrayList), "", null, null, 0, null, null, 62);
    }

    @Override // com.squareup.cash.scrubbing.InsertingScrubber
    public final String scrub(String str, String str2) {
        boolean z;
        Iterator it;
        Object obj;
        String str3;
        int parseInt;
        Object obj2;
        str.getClass();
        str2.getClass();
        String pattern = this.dateFormat.toPattern();
        int length = str2.length();
        int length2 = str.length() - 1;
        List list = this.patternIndexes;
        if (length == length2) {
            if (!StringsKt__StringsJVMKt.startsWith(str, str2, false)) {
                return StringsKt.commonPrefixWith$default(str2, str);
            }
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj2 = null;
                    break;
                }
                Object previous = listIterator.previous();
                if (str2.length() >= ((Number) previous).intValue()) {
                    obj2 = previous;
                    break;
                }
            }
            Integer num = (Integer) obj2;
            return str2.substring(0, num != null ? num.intValue() : 0);
        }
        String str4 = this.dayToken;
        int length3 = str4.length();
        int i = this.dayIndex;
        String substringAvailable = substringAvailable(str2, RangesKt___RangesKt.until(i, length3 + i));
        StringBuilder sb = new StringBuilder();
        int length4 = substringAvailable.length();
        for (int i2 = 0; i2 < length4; i2++) {
            char charAt = substringAvailable.charAt(i2);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        String str5 = this.monthToken;
        int length5 = str5.length();
        int i3 = this.monthIndex;
        String substringAvailable2 = substringAvailable(str2, RangesKt___RangesKt.until(i3, length5 + i3));
        StringBuilder sb3 = new StringBuilder();
        int length6 = substringAvailable2.length();
        for (int i4 = 0; i4 < length6; i4++) {
            char charAt2 = substringAvailable2.charAt(i4);
            if (Character.isDigit(charAt2)) {
                sb3.append(charAt2);
            }
        }
        String sb4 = sb3.toString();
        String str6 = this.yearToken;
        int length7 = str6.length();
        int i5 = this.yearIndex;
        String substringAvailable3 = substringAvailable(str2, RangesKt___RangesKt.until(i5, length7 + i5));
        StringBuilder sb5 = new StringBuilder();
        int length8 = substringAvailable3.length();
        for (int i6 = 0; i6 < length8; i6++) {
            char charAt3 = substringAvailable3.charAt(i6);
            if (Character.isDigit(charAt3)) {
                sb5.append(charAt3);
            }
        }
        String sb6 = sb5.toString();
        boolean z2 = true;
        while (z2) {
            try {
                if (sb2.length() == 2 && Integer.parseInt(sb2) > daysInMonth(sb4, sb6)) {
                    throw new IllegalStateException("Check failed.");
                }
                String concat = (sb2.length() != 1 || Integer.parseInt(StringsKt.padEnd(sb2, 2, '0')) <= daysInMonth(sb4, sb6)) ? sb2 : "0".concat(sb2);
                boolean z3 = !concat.equals(sb2);
                String str7 = concat;
                if (sb4.length() != 1 || Intrinsics.compare((int) sb4.charAt(0), 50) < 0) {
                    if (sb4.length() == 2 && (1 > (parseInt = Integer.parseInt(sb4)) || parseInt >= 13)) {
                        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                        str3 = null;
                    }
                    str3 = sb4;
                } else {
                    str3 = "0" + sb4.charAt(0);
                }
                boolean z4 = z3 | (!str3.equals(sb4));
                if (StringsKt__StringsJVMKt.startsWith(sb6, "0", false)) {
                    throw new IllegalStateException("Check failed.");
                }
                String concat2 = (sb6.length() != 2 || Integer.parseInt(sb6) < 30) ? sb6 : "19".concat(sb6);
                boolean z5 = (!concat2.equals(sb6)) | z4;
                sb4 = str3;
                sb2 = str7;
                z2 = z5;
                sb6 = concat2;
            } catch (IllegalStateException unused) {
                this.onInvalidContentListener.invoke();
                return str;
            }
        }
        Map mapOf = MapsKt__MapsKt.mapOf(new Pair(Integer.valueOf(i), sb2), new Pair(Integer.valueOf(i3), sb4), new Pair(Integer.valueOf(i5), sb6));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapOf.entrySet()) {
            if (((String) entry.getValue()).length() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        String str8 = pattern;
        int i7 = 0;
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            int intValue = ((Number) entry2.getKey()).intValue();
            String str9 = (String) entry2.getValue();
            str8.getClass();
            str8 = StringsKt.replaceRange(str8, intValue, str9.length() + intValue, str9).toString();
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    it = it2;
                    obj = null;
                    break;
                }
                obj = it3.next();
                it = it2;
                if (((Number) obj).intValue() >= str9.length() + intValue) {
                    break;
                }
                it2 = it;
            }
            Integer num2 = (Integer) obj;
            i7 = Math.max(i7, num2 != null ? num2.intValue() : str8.length());
            it2 = it;
        }
        Calendar calendar = Calendar.getInstance();
        if (sb6.length() != 0 && sb6.length() == str6.length()) {
            calendar.setTime(this.yearFormat.parse(sb6));
            int i8 = calendar.get(1);
            Calendar calendar2 = this.now;
            int compare = Intrinsics.compare(i8, calendar2.get(1));
            Type type2 = Type.FUTURE;
            Type type3 = this.f1199type;
            boolean z6 = type3 == type2 && compare < 0;
            Type type4 = Type.PAST;
            if (type3 == type4 && compare > 0) {
                z6 = true;
            }
            if (compare == 0 && sb4.length() != 0 && sb4.length() == str5.length()) {
                calendar.setTime(this.monthFormat.parse(sb4));
                int compare2 = Intrinsics.compare(calendar.get(2), calendar2.get(2));
                if (type3 == type2 && compare2 < 0) {
                    z6 = true;
                }
                if (type3 == type4 && compare2 > 0) {
                    z6 = true;
                }
                if (compare2 == 0 && sb2.length() != 0 && sb2.length() == str4.length()) {
                    calendar.setTime(this.dayFormat.parse(sb2));
                    int compare3 = Intrinsics.compare(calendar.get(5), calendar2.get(5));
                    if (type3 == type2 && compare3 < 0) {
                        z6 = true;
                    }
                    if (type3 == type4 && compare3 > 0) {
                        z6 = true;
                    }
                    if (!z6) {
                        str8.getClass();
                        return str8;
                    }
                }
            }
            z = z6;
        } else {
            z = false;
        }
        if (z) {
            this.onInvalidContentListener.invoke();
            return str;
        }
        str8.getClass();
        return str8.substring(0, i7);
    }
}
