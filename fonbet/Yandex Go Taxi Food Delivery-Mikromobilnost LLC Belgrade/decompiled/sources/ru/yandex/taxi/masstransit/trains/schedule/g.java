package ru.yandex.taxi.masstransit.trains.schedule;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.avj0;
import defpackage.c6w;
import defpackage.d6w;
import defpackage.e670;
import defpackage.ef40;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.gh40;
import defpackage.hf40;
import defpackage.hfv;
import defpackage.ht;
import defpackage.ief;
import defpackage.ix41;
import defpackage.j5z;
import defpackage.jl40;
import defpackage.jt;
import defpackage.jx41;
import defpackage.kh40;
import defpackage.kt;
import defpackage.kyh0;
import defpackage.lt;
import defpackage.mf40;
import defpackage.mja1;
import defpackage.na11;
import defpackage.ne40;
import defpackage.nh40;
import defpackage.nvi0;
import defpackage.ny61;
import defpackage.ovi0;
import defpackage.p7u0;
import defpackage.pf40;
import defpackage.q7u0;
import defpackage.qe40;
import defpackage.r7u0;
import defpackage.s7u0;
import defpackage.sb01;
import defpackage.sf40;
import defpackage.tcc;
import defpackage.vf40;
import defpackage.wp2;
import defpackage.xdf;
import defpackage.y6i0;
import defpackage.y740;
import defpackage.yci0;
import defpackage.yp2;
import defpackage.za01;
import defpackage.zls;
import defpackage.zuj0;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class g {
    public final ru.yandex.taxi.widget.c a;
    public final yp2 b;
    public final zuj0 c;
    public final xdf d;
    public final j5z e;

    public g(ru.yandex.taxi.widget.c cVar, yp2 yp2Var, zuj0 zuj0Var, xdf xdfVar, j5z j5zVar) {
        this.a = cVar;
        this.b = yp2Var;
        this.c = zuj0Var;
        this.d = xdfVar;
        this.e = j5zVar;
    }

    public static OffsetDateTime k(String str) {
        try {
            try {
                return OffsetDateTime.parse(str);
            } catch (Exception e) {
                yci0.p(g8e.o("Cannot parse date: ", str), e);
                return null;
            }
        } catch (DateTimeParseException unused) {
            return OffsetDateTime.parse(new Regex("([+-]\\d{2})(\\d{2})$").j(str, "$1:$2"));
        }
    }

    public static r7u0 l(kh40 kh40Var) {
        kh40.Companion.getClass();
        if (jl40.l(kh40Var, kh40.d)) {
            return p7u0.b;
        }
        String str = kh40Var.a;
        String str2 = kh40Var.c;
        return new q7u0(str2 != null ? mja1.a(str2, null, 6) : mja1.a("app_transport_icon_train", null, 6), kh40Var.b);
    }

    public final Object a(FormattedText formattedText, ContinuationImpl continuationImpl) {
        if (formattedText == null) {
            formattedText = FormattedText.c;
        }
        return ru.yandex.taxi.widget.c.i(this.a, formattedText, null, continuationImpl, 30);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ne40 ne40Var, ContinuationImpl continuationImpl) {
        MtTrainScheduleUiStateMapper$mapDatePickerData$1 mtTrainScheduleUiStateMapper$mapDatePickerData$1;
        Object obj;
        int i;
        Object a;
        ne40 ne40Var2;
        CharSequence charSequence;
        Object c;
        CharSequence charSequence2;
        List list;
        if (continuationImpl instanceof MtTrainScheduleUiStateMapper$mapDatePickerData$1) {
            mtTrainScheduleUiStateMapper$mapDatePickerData$1 = (MtTrainScheduleUiStateMapper$mapDatePickerData$1) continuationImpl;
            int i2 = mtTrainScheduleUiStateMapper$mapDatePickerData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainScheduleUiStateMapper$mapDatePickerData$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtTrainScheduleUiStateMapper$mapDatePickerData$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainScheduleUiStateMapper$mapDatePickerData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    FormattedText formattedText = ne40Var.a.d;
                    mtTrainScheduleUiStateMapper$mapDatePickerData$1.L$0 = ne40Var;
                    mtTrainScheduleUiStateMapper$mapDatePickerData$1.label = 1;
                    obj2 = a(formattedText, mtTrainScheduleUiStateMapper$mapDatePickerData$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            charSequence2 = (CharSequence) mtTrainScheduleUiStateMapper$mapDatePickerData$1.L$2;
                            charSequence = (CharSequence) mtTrainScheduleUiStateMapper$mapDatePickerData$1.L$1;
                            kotlin.b.b(obj2);
                            list = (List) obj2;
                            if (list == null) {
                                list = EmptyList.a;
                            }
                            return new ix41(charSequence, charSequence2, list);
                        }
                        charSequence = (CharSequence) mtTrainScheduleUiStateMapper$mapDatePickerData$1.L$1;
                        ne40Var2 = (ne40) mtTrainScheduleUiStateMapper$mapDatePickerData$1.L$0;
                        kotlin.b.b(obj2);
                        CharSequence charSequence3 = (CharSequence) obj2;
                        qe40.b bVar = ne40Var2.a;
                        mtTrainScheduleUiStateMapper$mapDatePickerData$1.L$0 = null;
                        mtTrainScheduleUiStateMapper$mapDatePickerData$1.L$1 = charSequence;
                        mtTrainScheduleUiStateMapper$mapDatePickerData$1.L$2 = charSequence3;
                        mtTrainScheduleUiStateMapper$mapDatePickerData$1.label = 3;
                        c = c(bVar, mtTrainScheduleUiStateMapper$mapDatePickerData$1);
                        if (c != obj) {
                            obj2 = c;
                            charSequence2 = charSequence3;
                            list = (List) obj2;
                            if (list == null) {
                            }
                            return new ix41(charSequence, charSequence2, list);
                        }
                        return obj;
                    }
                    ne40Var = (ne40) mtTrainScheduleUiStateMapper$mapDatePickerData$1.L$0;
                    kotlin.b.b(obj2);
                }
                CharSequence charSequence4 = (CharSequence) obj2;
                FormattedText formattedText2 = ne40Var.a.f;
                mtTrainScheduleUiStateMapper$mapDatePickerData$1.L$0 = ne40Var;
                mtTrainScheduleUiStateMapper$mapDatePickerData$1.L$1 = charSequence4;
                mtTrainScheduleUiStateMapper$mapDatePickerData$1.label = 2;
                a = a(formattedText2, mtTrainScheduleUiStateMapper$mapDatePickerData$1);
                if (a != obj) {
                    ne40Var2 = ne40Var;
                    charSequence = charSequence4;
                    obj2 = a;
                    CharSequence charSequence32 = (CharSequence) obj2;
                    qe40.b bVar2 = ne40Var2.a;
                    mtTrainScheduleUiStateMapper$mapDatePickerData$1.L$0 = null;
                    mtTrainScheduleUiStateMapper$mapDatePickerData$1.L$1 = charSequence;
                    mtTrainScheduleUiStateMapper$mapDatePickerData$1.L$2 = charSequence32;
                    mtTrainScheduleUiStateMapper$mapDatePickerData$1.label = 3;
                    c = c(bVar2, mtTrainScheduleUiStateMapper$mapDatePickerData$1);
                    if (c != obj) {
                    }
                }
                return obj;
            }
        }
        mtTrainScheduleUiStateMapper$mapDatePickerData$1 = new MtTrainScheduleUiStateMapper$mapDatePickerData$1(this, continuationImpl);
        Object obj22 = mtTrainScheduleUiStateMapper$mapDatePickerData$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainScheduleUiStateMapper$mapDatePickerData$1.label;
        if (i != 0) {
        }
        CharSequence charSequence42 = (CharSequence) obj22;
        FormattedText formattedText22 = ne40Var.a.f;
        mtTrainScheduleUiStateMapper$mapDatePickerData$1.L$0 = ne40Var;
        mtTrainScheduleUiStateMapper$mapDatePickerData$1.L$1 = charSequence42;
        mtTrainScheduleUiStateMapper$mapDatePickerData$1.label = 2;
        a = a(formattedText22, mtTrainScheduleUiStateMapper$mapDatePickerData$1);
        if (a != obj) {
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v15, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v34, types: [java.util.Iterator] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x036e -> B:11:0x0374). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x038b -> B:12:0x03ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(qe40.b bVar, ContinuationImpl continuationImpl) {
        MtTrainScheduleUiStateMapper$mapDatePickersItems$1 mtTrainScheduleUiStateMapper$mapDatePickersItems$1;
        int i;
        int i2;
        Object obj;
        String str;
        String str2;
        ZoneId of;
        OffsetDateTime k;
        ZonedDateTime atZoneSameInstant;
        String str3;
        OffsetDateTime k2;
        ZonedDateTime atZoneSameInstant2;
        int intValue;
        ArrayList arrayList;
        c6w it;
        Locale locale;
        ZonedDateTime zonedDateTime;
        int i3;
        CharSequence charSequence;
        ArrayList arrayList2;
        int i4;
        int i5;
        ru.yandex.taxi.widget.c cVar;
        int i6;
        CoroutineSingletons coroutineSingletons;
        ZonedDateTime zonedDateTime2;
        ZoneId zoneId;
        zls zlsVar;
        String str4;
        ArrayList arrayList3;
        String str5;
        MtTrainScheduleUiStateMapper$mapDatePickersItems$1 mtTrainScheduleUiStateMapper$mapDatePickersItems$12;
        String str6;
        ZonedDateTime zonedDateTime3;
        Locale locale2;
        qe40.b bVar2;
        CharSequence charSequence2;
        String str7;
        CharSequence charSequence3;
        FormattedText formattedText;
        c6w c6wVar;
        ZonedDateTime zonedDateTime4;
        Locale locale3;
        String str8;
        qe40.b bVar3;
        ZoneId zoneId2;
        int i7;
        String str9;
        ZonedDateTime zonedDateTime5;
        Object obj2;
        zls zlsVar2;
        CharSequence charSequence4;
        String str10;
        String str11;
        String str12;
        ArrayList arrayList4;
        int i8;
        int i9;
        ru.yandex.taxi.widget.c cVar2;
        CoroutineSingletons coroutineSingletons2;
        c6w c6wVar2;
        qe40.b bVar4 = bVar;
        if (continuationImpl instanceof MtTrainScheduleUiStateMapper$mapDatePickersItems$1) {
            mtTrainScheduleUiStateMapper$mapDatePickersItems$1 = (MtTrainScheduleUiStateMapper$mapDatePickersItems$1) continuationImpl;
            int i10 = mtTrainScheduleUiStateMapper$mapDatePickersItems$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mtTrainScheduleUiStateMapper$mapDatePickersItems$1.label = i10 - Integer.MIN_VALUE;
                Object obj3 = mtTrainScheduleUiStateMapper$mapDatePickersItems$1.result;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainScheduleUiStateMapper$mapDatePickersItems$1.label;
                ru.yandex.taxi.widget.c cVar3 = this.a;
                if (i != 0) {
                    i2 = 1;
                    obj = null;
                    kotlin.b.b(obj3);
                    qe40.b.a aVar = bVar4.h;
                    if (aVar == null || (str = aVar.c) == null || (str2 = bVar4.b) == null) {
                        return null;
                    }
                    Locale g = g(bVar4.g);
                    of = ZoneId.of("UTC");
                    String str13 = aVar.a;
                    if (str13 == null || (k = k(str13)) == null || (atZoneSameInstant = k.atZoneSameInstant(of)) == null || (str3 = aVar.b) == null || (k2 = k(str3)) == null || (atZoneSameInstant2 = k2.atZoneSameInstant(of)) == null) {
                        return null;
                    }
                    int between = ((int) ChronoUnit.DAYS.between(atZoneSameInstant.toLocalDate(), atZoneSameInstant2.toLocalDate())) + 1;
                    Integer num = bVar4.a;
                    if (num != null) {
                        intValue = num.intValue();
                        d6w n = y6i0.n(0, between);
                        arrayList = new ArrayList(tcc.n(n, 10));
                        it = n.iterator();
                        locale = g;
                        zonedDateTime = atZoneSameInstant;
                        i3 = between;
                        c6wVar2 = it;
                        if (!c6wVar2.hasNext()) {
                        }
                    }
                    return null;
                }
                if (i == 1) {
                    int i11 = mtTrainScheduleUiStateMapper$mapDatePickersItems$1.I$2;
                    int i12 = mtTrainScheduleUiStateMapper$mapDatePickersItems$1.I$1;
                    int i13 = mtTrainScheduleUiStateMapper$mapDatePickersItems$1.I$0;
                    ?? r6 = (Collection) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$24;
                    str11 = (String) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$23;
                    str10 = (String) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$22;
                    charSequence4 = (CharSequence) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$21;
                    zlsVar2 = (zls) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$19;
                    String str14 = (String) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$15;
                    String str15 = (String) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$14;
                    zonedDateTime5 = (ZonedDateTime) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$13;
                    ?? r15 = (Iterator) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$10;
                    i7 = i11;
                    ?? r0 = (Collection) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$9;
                    ZonedDateTime zonedDateTime6 = (ZonedDateTime) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$5;
                    zoneId2 = (ZoneId) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$4;
                    Locale locale4 = (Locale) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$3;
                    str8 = (String) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$2;
                    String str16 = (String) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$1;
                    qe40.b bVar5 = (qe40.b) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$0;
                    kotlin.b.b(obj3);
                    bVar3 = bVar5;
                    coroutineSingletons2 = coroutineSingletons3;
                    i8 = i13;
                    str = str16;
                    locale3 = locale4;
                    i9 = i12;
                    cVar2 = cVar3;
                    str12 = str15;
                    obj2 = obj3;
                    zonedDateTime4 = zonedDateTime6;
                    c6wVar = r15;
                    str9 = str14;
                    arrayList = r0;
                    arrayList4 = r6;
                    CharSequence charSequence5 = (CharSequence) obj2;
                    int i14 = i7;
                    coroutineSingletons = coroutineSingletons2;
                    str7 = str11;
                    mtTrainScheduleUiStateMapper$mapDatePickersItems$12 = mtTrainScheduleUiStateMapper$mapDatePickersItems$1;
                    locale2 = locale3;
                    i4 = i8;
                    zonedDateTime3 = zonedDateTime5;
                    zoneId = zoneId2;
                    i6 = i14;
                    qe40.b bVar6 = bVar3;
                    cVar = cVar2;
                    charSequence2 = charSequence4;
                    arrayList3 = arrayList;
                    str4 = str9;
                    zonedDateTime2 = zonedDateTime4;
                    arrayList2 = arrayList4;
                    str2 = str8;
                    i5 = i9;
                    bVar2 = bVar6;
                    String str17 = str10;
                    str5 = str12;
                    str6 = str17;
                    zlsVar = zlsVar2;
                    it = c6wVar;
                    charSequence = charSequence5;
                    charSequence3 = (CharSequence) zlsVar.invoke(zonedDateTime3, str5, str4);
                    formattedText = bVar2.e;
                    if (formattedText != null) {
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i15 = mtTrainScheduleUiStateMapper$mapDatePickersItems$1.I$1;
                    int i16 = mtTrainScheduleUiStateMapper$mapDatePickersItems$1.I$0;
                    ?? r5 = (Collection) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$26;
                    CharSequence charSequence6 = (CharSequence) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$25;
                    CharSequence charSequence7 = (CharSequence) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$24;
                    String str18 = (String) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$23;
                    String str19 = (String) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$22;
                    CharSequence charSequence8 = (CharSequence) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$21;
                    ?? r8 = (Iterator) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$10;
                    ?? r62 = (Collection) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$9;
                    ZonedDateTime zonedDateTime7 = (ZonedDateTime) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$5;
                    ZoneId zoneId3 = (ZoneId) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$4;
                    Locale locale5 = (Locale) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$3;
                    String str20 = (String) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$2;
                    String str21 = (String) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$1;
                    qe40.b bVar7 = (qe40.b) mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$0;
                    kotlin.b.b(obj3);
                    i5 = i15;
                    i4 = i16;
                    ru.yandex.taxi.widget.c cVar4 = cVar3;
                    String str22 = str18;
                    str6 = str19;
                    zoneId = zoneId3;
                    CharSequence charSequence9 = charSequence7;
                    Object i17 = obj3;
                    CoroutineSingletons coroutineSingletons4 = coroutineSingletons3;
                    ArrayList arrayList5 = r5;
                    charSequence3 = charSequence6;
                    str = str21;
                    qe40.b bVar8 = bVar7;
                    it = r8;
                    mtTrainScheduleUiStateMapper$mapDatePickersItems$12 = mtTrainScheduleUiStateMapper$mapDatePickersItems$1;
                    locale2 = locale5;
                    ArrayList arrayList6 = r62;
                    CharSequence charSequence10 = charSequence3;
                    ArrayList arrayList7 = arrayList6;
                    CharSequence charSequence11 = (CharSequence) i17;
                    CharSequence charSequence12 = charSequence8;
                    str2 = str20;
                    zonedDateTime2 = zonedDateTime7;
                    String str23 = str6;
                    CharSequence charSequence13 = charSequence9;
                    i3 = i4;
                    String str24 = str22;
                    intValue = i5;
                    arrayList5.add(new jx41(str24, str23, charSequence12, charSequence13, charSequence10, charSequence11));
                    cVar3 = cVar4;
                    arrayList = arrayList7;
                    zonedDateTime = zonedDateTime2;
                    bVar4 = bVar8;
                    obj = null;
                    i2 = 1;
                    coroutineSingletons3 = coroutineSingletons4;
                    locale = locale2;
                    mtTrainScheduleUiStateMapper$mapDatePickersItems$1 = mtTrainScheduleUiStateMapper$mapDatePickersItems$12;
                    of = zoneId;
                    c6wVar2 = it;
                    if (!c6wVar2.hasNext()) {
                        int intValue2 = ((Number) c6wVar2.next()).intValue();
                        ZonedDateTime plusDays = zonedDateTime.plusDays(intValue2);
                        ZonedDateTime plusDays2 = plusDays.plusDays(intValue);
                        qe40.b.a aVar2 = bVar4.h;
                        coroutineSingletons = coroutineSingletons3;
                        String str25 = aVar2.d;
                        str9 = aVar2.e;
                        ru.yandex.taxi.widget.c cVar5 = cVar3;
                        DateTimeFormatter withZone = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX").withZone(of);
                        DateTimeFormatter withLocale = DateTimeFormatter.ofPattern(str).withLocale(locale);
                        int i18 = intValue;
                        int i19 = i3;
                        y740 y740Var = new y740(i2, of, DateTimeFormatter.ofPattern(str2).withLocale(locale));
                        String format = plusDays.format(withLocale);
                        str6 = withZone.format(plusDays);
                        CharSequence charSequence14 = (CharSequence) y740Var.invoke(plusDays, str25, str9);
                        FormattedText formattedText2 = bVar4.c;
                        if (formattedText2 != null) {
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$0 = bVar4;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$1 = str;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$2 = str2;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$3 = locale;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$4 = of;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$5 = zonedDateTime;
                            Object obj4 = obj;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$6 = obj4;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$7 = obj4;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$8 = obj4;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$9 = arrayList;
                            zonedDateTime4 = zonedDateTime;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$10 = c6wVar2;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$11 = obj4;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$12 = obj4;
                            zonedDateTime5 = plusDays2;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$13 = zonedDateTime5;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$14 = str25;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$15 = str9;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$16 = null;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$17 = null;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$18 = null;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$19 = y740Var;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$20 = null;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$21 = charSequence14;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$22 = str6;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$23 = format;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$24 = arrayList;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$25 = null;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.L$26 = null;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.I$0 = i19;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.I$1 = i18;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.I$2 = intValue2;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$1.label = 1;
                            bVar3 = bVar4;
                            cVar2 = cVar5;
                            locale3 = locale;
                            obj2 = ru.yandex.taxi.widget.c.i(cVar2, formattedText2, null, mtTrainScheduleUiStateMapper$mapDatePickersItems$1, 30);
                            coroutineSingletons2 = coroutineSingletons;
                            if (obj2 == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            c6wVar = c6wVar2;
                            i7 = intValue2;
                            i9 = i18;
                            zoneId2 = of;
                            str11 = format;
                            charSequence4 = charSequence14;
                            zlsVar2 = y740Var;
                            str10 = str6;
                            str12 = str25;
                            i8 = i19;
                            str8 = str2;
                            arrayList4 = arrayList;
                            CharSequence charSequence52 = (CharSequence) obj2;
                            int i142 = i7;
                            coroutineSingletons = coroutineSingletons2;
                            str7 = str11;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$12 = mtTrainScheduleUiStateMapper$mapDatePickersItems$1;
                            locale2 = locale3;
                            i4 = i8;
                            zonedDateTime3 = zonedDateTime5;
                            zoneId = zoneId2;
                            i6 = i142;
                            qe40.b bVar62 = bVar3;
                            cVar = cVar2;
                            charSequence2 = charSequence4;
                            arrayList3 = arrayList;
                            str4 = str9;
                            zonedDateTime2 = zonedDateTime4;
                            arrayList2 = arrayList4;
                            str2 = str8;
                            i5 = i9;
                            bVar2 = bVar62;
                            String str172 = str10;
                            str5 = str12;
                            str6 = str172;
                            zlsVar = zlsVar2;
                            it = c6wVar;
                            charSequence = charSequence52;
                            charSequence3 = (CharSequence) zlsVar.invoke(zonedDateTime3, str5, str4);
                            formattedText = bVar2.e;
                            if (formattedText != null) {
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$0 = bVar2;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$1 = str;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$2 = str2;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$3 = locale2;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$4 = zoneId;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$5 = zonedDateTime2;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$6 = null;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$7 = null;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$8 = null;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$9 = arrayList3;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$10 = it;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$11 = null;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$12 = null;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$13 = null;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$14 = null;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$15 = null;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$16 = null;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$17 = null;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$18 = null;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$19 = null;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$20 = null;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$21 = charSequence2;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$22 = str6;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$23 = str7;
                                charSequence9 = charSequence;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$24 = charSequence9;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$25 = charSequence3;
                                arrayList5 = arrayList2;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.L$26 = arrayList5;
                                str22 = str7;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.I$0 = i4;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.I$1 = i5;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.I$2 = i6;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$12.label = 2;
                                CharSequence charSequence15 = charSequence2;
                                bVar8 = bVar2;
                                cVar4 = cVar;
                                i17 = ru.yandex.taxi.widget.c.i(cVar4, formattedText, null, mtTrainScheduleUiStateMapper$mapDatePickersItems$12, 30);
                                coroutineSingletons4 = coroutineSingletons;
                                if (i17 == coroutineSingletons4) {
                                    return coroutineSingletons4;
                                }
                                str20 = str2;
                                arrayList6 = arrayList3;
                                zonedDateTime7 = zonedDateTime2;
                                charSequence8 = charSequence15;
                                CharSequence charSequence102 = charSequence3;
                                ArrayList arrayList72 = arrayList6;
                                CharSequence charSequence112 = (CharSequence) i17;
                                CharSequence charSequence122 = charSequence8;
                                str2 = str20;
                                zonedDateTime2 = zonedDateTime7;
                                String str232 = str6;
                                CharSequence charSequence132 = charSequence9;
                                i3 = i4;
                                String str242 = str22;
                                intValue = i5;
                                arrayList5.add(new jx41(str242, str232, charSequence122, charSequence132, charSequence102, charSequence112));
                                cVar3 = cVar4;
                                arrayList = arrayList72;
                                zonedDateTime = zonedDateTime2;
                                bVar4 = bVar8;
                                obj = null;
                                i2 = 1;
                                coroutineSingletons3 = coroutineSingletons4;
                                locale = locale2;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$1 = mtTrainScheduleUiStateMapper$mapDatePickersItems$12;
                                of = zoneId;
                                c6wVar2 = it;
                                if (!c6wVar2.hasNext()) {
                                    return arrayList;
                                }
                            } else {
                                CharSequence charSequence16 = charSequence2;
                                bVar8 = bVar2;
                                coroutineSingletons4 = coroutineSingletons;
                                cVar4 = cVar;
                                arrayList5 = arrayList2;
                                charSequence102 = charSequence3;
                                arrayList72 = arrayList3;
                                charSequence122 = charSequence16;
                                charSequence112 = null;
                                str232 = str6;
                                charSequence132 = charSequence;
                                intValue = i5;
                                i3 = i4;
                                str242 = str7;
                                arrayList5.add(new jx41(str242, str232, charSequence122, charSequence132, charSequence102, charSequence112));
                                cVar3 = cVar4;
                                arrayList = arrayList72;
                                zonedDateTime = zonedDateTime2;
                                bVar4 = bVar8;
                                obj = null;
                                i2 = 1;
                                coroutineSingletons3 = coroutineSingletons4;
                                locale = locale2;
                                mtTrainScheduleUiStateMapper$mapDatePickersItems$1 = mtTrainScheduleUiStateMapper$mapDatePickersItems$12;
                                of = zoneId;
                                c6wVar2 = it;
                                if (!c6wVar2.hasNext()) {
                                }
                            }
                        } else {
                            ZonedDateTime zonedDateTime8 = zonedDateTime;
                            Locale locale6 = locale;
                            zlsVar = y740Var;
                            str7 = format;
                            arrayList3 = arrayList;
                            bVar2 = bVar4;
                            charSequence = null;
                            cVar = cVar5;
                            str5 = str25;
                            charSequence2 = charSequence14;
                            zonedDateTime3 = plusDays2;
                            str4 = str9;
                            zonedDateTime2 = zonedDateTime8;
                            it = c6wVar2;
                            zoneId = of;
                            arrayList2 = arrayList3;
                            mtTrainScheduleUiStateMapper$mapDatePickersItems$12 = mtTrainScheduleUiStateMapper$mapDatePickersItems$1;
                            locale2 = locale6;
                            i4 = i19;
                            i5 = i18;
                            i6 = intValue2;
                            charSequence3 = (CharSequence) zlsVar.invoke(zonedDateTime3, str5, str4);
                            formattedText = bVar2.e;
                            if (formattedText != null) {
                            }
                        }
                    }
                }
            }
        }
        mtTrainScheduleUiStateMapper$mapDatePickersItems$1 = new MtTrainScheduleUiStateMapper$mapDatePickersItems$1(this, continuationImpl);
        Object obj32 = mtTrainScheduleUiStateMapper$mapDatePickersItems$1.result;
        CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainScheduleUiStateMapper$mapDatePickersItems$1.label;
        ru.yandex.taxi.widget.c cVar32 = this.a;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(gh40 gh40Var, ContinuationImpl continuationImpl) {
        MtTrainScheduleUiStateMapper$mapSuccessState$1 mtTrainScheduleUiStateMapper$mapSuccessState$1;
        Object obj;
        int i;
        gh40 gh40Var2;
        s7u0 s7u0Var;
        Object h;
        List list;
        if (continuationImpl instanceof MtTrainScheduleUiStateMapper$mapSuccessState$1) {
            mtTrainScheduleUiStateMapper$mapSuccessState$1 = (MtTrainScheduleUiStateMapper$mapSuccessState$1) continuationImpl;
            int i2 = mtTrainScheduleUiStateMapper$mapSuccessState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainScheduleUiStateMapper$mapSuccessState$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtTrainScheduleUiStateMapper$mapSuccessState$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainScheduleUiStateMapper$mapSuccessState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    nh40 nh40Var = gh40Var.e;
                    s7u0 s7u0Var2 = new s7u0(l(nh40Var.a), l(nh40Var.b), ((avj0) this.c).h(kyh0.mt_trains_sorting_icon_description));
                    List list2 = gh40Var.g.a;
                    ief iefVar = gh40Var.a;
                    mtTrainScheduleUiStateMapper$mapSuccessState$1.L$0 = gh40Var;
                    mtTrainScheduleUiStateMapper$mapSuccessState$1.L$1 = s7u0Var2;
                    mtTrainScheduleUiStateMapper$mapSuccessState$1.label = 1;
                    obj2 = m(list2, iefVar, mtTrainScheduleUiStateMapper$mapSuccessState$1);
                    if (obj2 != obj) {
                        gh40Var2 = gh40Var;
                        s7u0Var = s7u0Var2;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) mtTrainScheduleUiStateMapper$mapSuccessState$1.L$2;
                    s7u0Var = (s7u0) mtTrainScheduleUiStateMapper$mapSuccessState$1.L$1;
                    kotlin.b.b(obj2);
                    return new sb01(s7u0Var, list, (List) obj2);
                }
                s7u0Var = (s7u0) mtTrainScheduleUiStateMapper$mapSuccessState$1.L$1;
                gh40Var2 = (gh40) mtTrainScheduleUiStateMapper$mapSuccessState$1.L$0;
                kotlin.b.b(obj2);
                List list3 = (List) obj2;
                pf40 pf40Var = gh40Var2.f;
                ne40 ne40Var = gh40Var2.d;
                mtTrainScheduleUiStateMapper$mapSuccessState$1.L$0 = null;
                mtTrainScheduleUiStateMapper$mapSuccessState$1.L$1 = s7u0Var;
                mtTrainScheduleUiStateMapper$mapSuccessState$1.L$2 = list3;
                mtTrainScheduleUiStateMapper$mapSuccessState$1.label = 2;
                h = h(pf40Var, ne40Var, mtTrainScheduleUiStateMapper$mapSuccessState$1);
                if (h != obj) {
                    obj2 = h;
                    list = list3;
                    return new sb01(s7u0Var, list, (List) obj2);
                }
                return obj;
            }
        }
        mtTrainScheduleUiStateMapper$mapSuccessState$1 = new MtTrainScheduleUiStateMapper$mapSuccessState$1(this, continuationImpl);
        Object obj22 = mtTrainScheduleUiStateMapper$mapSuccessState$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainScheduleUiStateMapper$mapSuccessState$1.label;
        if (i != 0) {
        }
        List list32 = (List) obj22;
        pf40 pf40Var2 = gh40Var2.f;
        ne40 ne40Var2 = gh40Var2.d;
        mtTrainScheduleUiStateMapper$mapSuccessState$1.L$0 = null;
        mtTrainScheduleUiStateMapper$mapSuccessState$1.L$1 = s7u0Var;
        mtTrainScheduleUiStateMapper$mapSuccessState$1.L$2 = list32;
        mtTrainScheduleUiStateMapper$mapSuccessState$1.label = 2;
        h = h(pf40Var2, ne40Var2, mtTrainScheduleUiStateMapper$mapSuccessState$1);
        if (h != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0147 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ne40 ne40Var, ContinuationImpl continuationImpl) {
        MtTrainScheduleUiStateMapper$mapToActionButton$1 mtTrainScheduleUiStateMapper$mapToActionButton$1;
        int i;
        String str;
        nvi0 a;
        Object obj;
        String str2;
        CharSequence charSequence;
        wp2 a2;
        Object b;
        wp2 wp2Var;
        int i2;
        String format;
        if (continuationImpl instanceof MtTrainScheduleUiStateMapper$mapToActionButton$1) {
            mtTrainScheduleUiStateMapper$mapToActionButton$1 = (MtTrainScheduleUiStateMapper$mapToActionButton$1) continuationImpl;
            int i3 = mtTrainScheduleUiStateMapper$mapToActionButton$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mtTrainScheduleUiStateMapper$mapToActionButton$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = mtTrainScheduleUiStateMapper$mapToActionButton$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainScheduleUiStateMapper$mapToActionButton$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    OffsetDateTime now = OffsetDateTime.now();
                    String str3 = ne40Var.b;
                    qe40.b bVar = ne40Var.a;
                    LocalDate localDate = now.toLocalDate();
                    if (str3.length() != 0) {
                        localDate = evu0.z(str3, 'T') ? OffsetDateTime.parse(str3).toLocalDate() : LocalDate.parse(str3);
                    }
                    qe40.b.a aVar = bVar.h;
                    String str4 = bVar.g;
                    if (aVar == null || (str = aVar.c) == null) {
                        str = "d MMMM";
                    }
                    DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern(str, g(str4));
                    String format2 = now.format(ofPattern);
                    String format3 = localDate.format(ofPattern);
                    boolean l = jl40.l(format3, format2);
                    int i4 = !l ? 1 : 0;
                    mf40 mf40Var = !l ? ne40Var.d : ne40Var.c;
                    String str5 = mf40Var.c;
                    AppColor$Palette appColor$Palette = AppColor$Palette.ControlMinor;
                    yp2 yp2Var = this.b;
                    wp2 a3 = yp2Var.a(str5, appColor$Palette);
                    String str6 = ne40Var.e;
                    if (str6 == null) {
                        str6 = "";
                    }
                    a = mja1.a(str6, new hfv(a3), 4);
                    qe40.b.a aVar2 = bVar.h;
                    if (aVar2 != null) {
                        LocalDate localDate2 = now.toLocalDate();
                        DateTimeFormatter withLocale = DateTimeFormatter.ofPattern(aVar2.c).withLocale(g(str4));
                        if (localDate.isEqual(localDate2)) {
                            format = aVar2.d;
                            obj = obj3;
                            str2 = format3;
                        } else {
                            obj = obj3;
                            str2 = format3;
                            format = localDate.isEqual(localDate2.plusDays(1L)) ? aVar2.e : localDate.format(withLocale);
                        }
                        if (format != null) {
                            charSequence = format;
                            a2 = yp2Var.a(mf40Var.a, appColor$Palette);
                            wp2 a4 = yp2Var.a(mf40Var.b, appColor$Palette);
                            mtTrainScheduleUiStateMapper$mapToActionButton$1.L$0 = null;
                            mtTrainScheduleUiStateMapper$mapToActionButton$1.L$1 = null;
                            mtTrainScheduleUiStateMapper$mapToActionButton$1.L$2 = null;
                            mtTrainScheduleUiStateMapper$mapToActionButton$1.L$3 = null;
                            mtTrainScheduleUiStateMapper$mapToActionButton$1.L$4 = null;
                            mtTrainScheduleUiStateMapper$mapToActionButton$1.L$5 = null;
                            mtTrainScheduleUiStateMapper$mapToActionButton$1.L$6 = null;
                            mtTrainScheduleUiStateMapper$mapToActionButton$1.L$7 = null;
                            mtTrainScheduleUiStateMapper$mapToActionButton$1.L$8 = a;
                            mtTrainScheduleUiStateMapper$mapToActionButton$1.L$9 = charSequence;
                            mtTrainScheduleUiStateMapper$mapToActionButton$1.L$10 = a2;
                            mtTrainScheduleUiStateMapper$mapToActionButton$1.L$11 = a4;
                            mtTrainScheduleUiStateMapper$mapToActionButton$1.I$0 = i4;
                            z = true;
                            mtTrainScheduleUiStateMapper$mapToActionButton$1.label = 1;
                            b = b(ne40Var, mtTrainScheduleUiStateMapper$mapToActionButton$1);
                            if (b != obj) {
                                return obj;
                            }
                            wp2Var = a4;
                            obj2 = b;
                            i2 = i4;
                        }
                    } else {
                        obj = obj3;
                        str2 = format3;
                    }
                    charSequence = str2;
                    a2 = yp2Var.a(mf40Var.a, appColor$Palette);
                    wp2 a42 = yp2Var.a(mf40Var.b, appColor$Palette);
                    mtTrainScheduleUiStateMapper$mapToActionButton$1.L$0 = null;
                    mtTrainScheduleUiStateMapper$mapToActionButton$1.L$1 = null;
                    mtTrainScheduleUiStateMapper$mapToActionButton$1.L$2 = null;
                    mtTrainScheduleUiStateMapper$mapToActionButton$1.L$3 = null;
                    mtTrainScheduleUiStateMapper$mapToActionButton$1.L$4 = null;
                    mtTrainScheduleUiStateMapper$mapToActionButton$1.L$5 = null;
                    mtTrainScheduleUiStateMapper$mapToActionButton$1.L$6 = null;
                    mtTrainScheduleUiStateMapper$mapToActionButton$1.L$7 = null;
                    mtTrainScheduleUiStateMapper$mapToActionButton$1.L$8 = a;
                    mtTrainScheduleUiStateMapper$mapToActionButton$1.L$9 = charSequence;
                    mtTrainScheduleUiStateMapper$mapToActionButton$1.L$10 = a2;
                    mtTrainScheduleUiStateMapper$mapToActionButton$1.L$11 = a42;
                    mtTrainScheduleUiStateMapper$mapToActionButton$1.I$0 = i4;
                    z = true;
                    mtTrainScheduleUiStateMapper$mapToActionButton$1.label = 1;
                    b = b(ne40Var, mtTrainScheduleUiStateMapper$mapToActionButton$1);
                    if (b != obj) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = mtTrainScheduleUiStateMapper$mapToActionButton$1.I$0;
                    wp2 wp2Var2 = (wp2) mtTrainScheduleUiStateMapper$mapToActionButton$1.L$11;
                    a2 = (wp2) mtTrainScheduleUiStateMapper$mapToActionButton$1.L$10;
                    charSequence = (CharSequence) mtTrainScheduleUiStateMapper$mapToActionButton$1.L$9;
                    a = (nvi0) mtTrainScheduleUiStateMapper$mapToActionButton$1.L$8;
                    kotlin.b.b(obj2);
                    wp2Var = wp2Var2;
                }
                wp2 wp2Var3 = a2;
                CharSequence charSequence2 = charSequence;
                nvi0 nvi0Var = a;
                jt jtVar = new jt((ix41) obj2);
                if (i2 == 0) {
                    z = false;
                }
                return new lt(nvi0Var, charSequence2, wp2Var3, wp2Var, jtVar, z);
            }
        }
        mtTrainScheduleUiStateMapper$mapToActionButton$1 = new MtTrainScheduleUiStateMapper$mapToActionButton$1(this, continuationImpl);
        Object obj22 = mtTrainScheduleUiStateMapper$mapToActionButton$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainScheduleUiStateMapper$mapToActionButton$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        wp2 wp2Var32 = a2;
        CharSequence charSequence22 = charSequence;
        nvi0 nvi0Var2 = a;
        jt jtVar2 = new jt((ix41) obj22);
        if (i2 == 0) {
        }
        return new lt(nvi0Var2, charSequence22, wp2Var32, wp2Var, jtVar2, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0174 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r24v0, types: [ru.yandex.taxi.masstransit.trains.schedule.g] */
    /* JADX WARN: Type inference failed for: r9v3, types: [nvi0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0175 -> B:10:0x0076). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(List list, Map map, ContinuationImpl continuationImpl) {
        MtTrainScheduleUiStateMapper$mapToActionButtons$1 mtTrainScheduleUiStateMapper$mapToActionButtons$1;
        int i;
        Iterator it;
        Collection collection;
        Map map2;
        int i2;
        int i3;
        Object i4;
        Object obj;
        Object obj2;
        String str;
        if (continuationImpl instanceof MtTrainScheduleUiStateMapper$mapToActionButtons$1) {
            mtTrainScheduleUiStateMapper$mapToActionButtons$1 = (MtTrainScheduleUiStateMapper$mapToActionButtons$1) continuationImpl;
            int i5 = mtTrainScheduleUiStateMapper$mapToActionButtons$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                mtTrainScheduleUiStateMapper$mapToActionButtons$1.label = i5 - Integer.MIN_VALUE;
                Object obj3 = mtTrainScheduleUiStateMapper$mapToActionButtons$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainScheduleUiStateMapper$mapToActionButtons$1.label;
                int i6 = 1;
                String str2 = null;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    it = list2.iterator();
                    collection = arrayList;
                    map2 = map;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i7 = mtTrainScheduleUiStateMapper$mapToActionButtons$1.I$0;
                    collection = (Collection) mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$16;
                    ?? r9 = (nvi0) mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$15;
                    ?? r10 = (CharSequence) mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$14;
                    wp2 wp2Var = (wp2) mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$13;
                    wp2 a = (wp2) mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$12;
                    it = (Iterator) mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$5;
                    Collection collection2 = (Collection) mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$4;
                    Map map3 = (Map) mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$1;
                    kotlin.b.b(obj3);
                    ovi0 ovi0Var = r9;
                    String str3 = r10;
                    wp2 wp2Var2 = wp2Var;
                    Collection collection3 = collection2;
                    int i8 = 1;
                    String str4 = null;
                    collection.add(new lt(ovi0Var, str3, wp2Var2, a, (kt) obj3, i7 == 0 ? i8 : 0));
                    collection = collection3;
                    str2 = str4;
                    i6 = i8;
                    map2 = map3;
                    if (it.hasNext()) {
                        ef40 ef40Var = (ef40) it.next();
                        String str5 = ef40Var.c;
                        String str6 = ef40Var.a;
                        hf40 hf40Var = ef40Var.f;
                        if (hf40Var instanceof e670) {
                            List list3 = ((e670) hf40Var).c;
                            Iterator it2 = list3.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    i2 = i6;
                                    obj = str2;
                                    break;
                                }
                                obj = it2.next();
                                String str7 = ((sf40) obj).a;
                                List list4 = (List) map2.get(str6);
                                if (list4 != null) {
                                    String str8 = (String) kotlin.collections.a.P(list4);
                                    i2 = i6;
                                    str = str8;
                                } else {
                                    i2 = i6;
                                    str = str2;
                                }
                                if (jl40.l(str7, str)) {
                                    break;
                                }
                                i6 = i2;
                            }
                            sf40 sf40Var = (sf40) obj;
                            if (sf40Var == null) {
                                Iterator it3 = list3.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        obj2 = str2;
                                        break;
                                    }
                                    obj2 = it3.next();
                                    if (((sf40) obj2).c) {
                                        break;
                                    }
                                }
                                sf40 sf40Var2 = (sf40) obj2;
                                if (sf40Var2 != null) {
                                    str5 = sf40Var2.b;
                                }
                            } else {
                                str5 = sf40Var.b;
                                i3 = !sf40Var.c ? 1 : 0;
                                mf40 mf40Var = i3 == 0 ? ef40Var.e : ef40Var.d;
                                String str9 = mf40Var.c;
                                AppColor$Palette appColor$Palette = AppColor$Palette.ControlMinor;
                                yp2 yp2Var = this.b;
                                ovi0 a2 = mja1.a(ef40Var.b, new hfv(yp2Var.a(str9, appColor$Palette)), 4);
                                wp2 a3 = yp2Var.a(mf40Var.a, appColor$Palette);
                                a = yp2Var.a(mf40Var.b, appColor$Palette);
                                str4 = null;
                                mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$0 = null;
                                mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$1 = map2;
                                mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$2 = null;
                                mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$3 = null;
                                mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$4 = collection;
                                mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$5 = it;
                                mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$6 = null;
                                mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$7 = null;
                                mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$8 = null;
                                mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$9 = null;
                                mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$10 = null;
                                mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$11 = null;
                                mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$12 = a;
                                mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$13 = a3;
                                mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$14 = str5;
                                mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$15 = a2;
                                mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$16 = collection;
                                mtTrainScheduleUiStateMapper$mapToActionButtons$1.I$0 = i3;
                                i8 = i2;
                                mtTrainScheduleUiStateMapper$mapToActionButtons$1.label = i8;
                                i4 = i(hf40Var, map2, str6, mtTrainScheduleUiStateMapper$mapToActionButtons$1);
                                if (i4 != coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                map3 = map2;
                                ovi0Var = a2;
                                str3 = str5;
                                i7 = i3;
                                wp2Var2 = a3;
                                collection3 = collection;
                                obj3 = i4;
                                collection.add(new lt(ovi0Var, str3, wp2Var2, a, (kt) obj3, i7 == 0 ? i8 : 0));
                                collection = collection3;
                                str2 = str4;
                                i6 = i8;
                                map2 = map3;
                                if (it.hasNext()) {
                                    return (List) collection;
                                }
                            }
                        } else {
                            i2 = i6;
                        }
                        i3 = 0;
                        if (i3 == 0) {
                        }
                        String str92 = mf40Var.c;
                        AppColor$Palette appColor$Palette2 = AppColor$Palette.ControlMinor;
                        yp2 yp2Var2 = this.b;
                        ovi0 a22 = mja1.a(ef40Var.b, new hfv(yp2Var2.a(str92, appColor$Palette2)), 4);
                        wp2 a32 = yp2Var2.a(mf40Var.a, appColor$Palette2);
                        a = yp2Var2.a(mf40Var.b, appColor$Palette2);
                        str4 = null;
                        mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$0 = null;
                        mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$1 = map2;
                        mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$2 = null;
                        mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$3 = null;
                        mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$4 = collection;
                        mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$5 = it;
                        mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$6 = null;
                        mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$7 = null;
                        mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$8 = null;
                        mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$9 = null;
                        mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$10 = null;
                        mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$11 = null;
                        mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$12 = a;
                        mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$13 = a32;
                        mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$14 = str5;
                        mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$15 = a22;
                        mtTrainScheduleUiStateMapper$mapToActionButtons$1.L$16 = collection;
                        mtTrainScheduleUiStateMapper$mapToActionButtons$1.I$0 = i3;
                        i8 = i2;
                        mtTrainScheduleUiStateMapper$mapToActionButtons$1.label = i8;
                        i4 = i(hf40Var, map2, str6, mtTrainScheduleUiStateMapper$mapToActionButtons$1);
                        if (i4 != coroutineSingletons) {
                        }
                    }
                }
            }
        }
        mtTrainScheduleUiStateMapper$mapToActionButtons$1 = new MtTrainScheduleUiStateMapper$mapToActionButtons$1(this, continuationImpl);
        Object obj32 = mtTrainScheduleUiStateMapper$mapToActionButtons$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainScheduleUiStateMapper$mapToActionButtons$1.label;
        int i62 = 1;
        String str22 = null;
        if (i != 0) {
        }
    }

    public final Locale g(String str) {
        if (str != null && !evu0.J(str)) {
            return Locale.forLanguageTag(str);
        }
        this.e.getClass();
        return j5z.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable h(pf40 pf40Var, ne40 ne40Var, ContinuationImpl continuationImpl) {
        MtTrainScheduleUiStateMapper$toActionButtonsUiState$1 mtTrainScheduleUiStateMapper$toActionButtonsUiState$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        lt ltVar;
        if (continuationImpl instanceof MtTrainScheduleUiStateMapper$toActionButtonsUiState$1) {
            mtTrainScheduleUiStateMapper$toActionButtonsUiState$1 = (MtTrainScheduleUiStateMapper$toActionButtonsUiState$1) continuationImpl;
            int i2 = mtTrainScheduleUiStateMapper$toActionButtonsUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainScheduleUiStateMapper$toActionButtonsUiState$1.label = i2 - Integer.MIN_VALUE;
                obj = mtTrainScheduleUiStateMapper$toActionButtonsUiState$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainScheduleUiStateMapper$toActionButtonsUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mtTrainScheduleUiStateMapper$toActionButtonsUiState$1.L$0 = pf40Var;
                    mtTrainScheduleUiStateMapper$toActionButtonsUiState$1.L$1 = null;
                    mtTrainScheduleUiStateMapper$toActionButtonsUiState$1.label = 1;
                    obj = e(ne40Var, mtTrainScheduleUiStateMapper$toActionButtonsUiState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ltVar = (lt) mtTrainScheduleUiStateMapper$toActionButtonsUiState$1.L$2;
                        kotlin.b.b(obj);
                        return kotlin.collections.a.m0((List) obj, Collections.singletonList(ltVar));
                    }
                    pf40Var = (pf40) mtTrainScheduleUiStateMapper$toActionButtonsUiState$1.L$0;
                    kotlin.b.b(obj);
                }
                lt ltVar2 = (lt) obj;
                List list = pf40Var.b;
                Map map = pf40Var.a;
                mtTrainScheduleUiStateMapper$toActionButtonsUiState$1.L$0 = null;
                mtTrainScheduleUiStateMapper$toActionButtonsUiState$1.L$1 = null;
                mtTrainScheduleUiStateMapper$toActionButtonsUiState$1.L$2 = ltVar2;
                mtTrainScheduleUiStateMapper$toActionButtonsUiState$1.label = 2;
                obj = f(list, map, mtTrainScheduleUiStateMapper$toActionButtonsUiState$1);
                if (obj != coroutineSingletons) {
                    ltVar = ltVar2;
                    return kotlin.collections.a.m0((List) obj, Collections.singletonList(ltVar));
                }
                return coroutineSingletons;
            }
        }
        mtTrainScheduleUiStateMapper$toActionButtonsUiState$1 = new MtTrainScheduleUiStateMapper$toActionButtonsUiState$1(this, continuationImpl);
        obj = mtTrainScheduleUiStateMapper$toActionButtonsUiState$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainScheduleUiStateMapper$toActionButtonsUiState$1.label;
        if (i != 0) {
        }
        lt ltVar22 = (lt) obj;
        List list2 = pf40Var.b;
        Map map2 = pf40Var.a;
        mtTrainScheduleUiStateMapper$toActionButtonsUiState$1.L$0 = null;
        mtTrainScheduleUiStateMapper$toActionButtonsUiState$1.L$1 = null;
        mtTrainScheduleUiStateMapper$toActionButtonsUiState$1.L$2 = ltVar22;
        mtTrainScheduleUiStateMapper$toActionButtonsUiState$1.label = 2;
        obj = f(list2, map2, mtTrainScheduleUiStateMapper$toActionButtonsUiState$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0154 A[LOOP:0: B:17:0x014e->B:19:0x0154, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(hf40 hf40Var, Map map, String str, ContinuationImpl continuationImpl) {
        MtTrainScheduleUiStateMapper$toButtonAction$1 mtTrainScheduleUiStateMapper$toButtonAction$1;
        Object obj;
        int i;
        Object obj2;
        Object obj3;
        String str2;
        Object obj4;
        sf40 sf40Var;
        e670 e670Var;
        String str3;
        String str4;
        Object a;
        CharSequence charSequence;
        hf40 hf40Var2;
        String str5;
        String str6;
        sf40 sf40Var2;
        String str7;
        if (continuationImpl instanceof MtTrainScheduleUiStateMapper$toButtonAction$1) {
            mtTrainScheduleUiStateMapper$toButtonAction$1 = (MtTrainScheduleUiStateMapper$toButtonAction$1) continuationImpl;
            int i2 = mtTrainScheduleUiStateMapper$toButtonAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainScheduleUiStateMapper$toButtonAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj5 = mtTrainScheduleUiStateMapper$toButtonAction$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainScheduleUiStateMapper$toButtonAction$1.label;
                String str8 = "";
                if (i != 0) {
                    kotlin.b.b(obj5);
                    e670 e670Var2 = (e670) hf40Var;
                    List list = e670Var2.c;
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str9 = ((sf40) obj2).a;
                        List list2 = (List) map.get(str);
                        if (jl40.l(str9, list2 != null ? (String) kotlin.collections.a.P(list2) : null)) {
                            break;
                        }
                    }
                    sf40 sf40Var3 = (sf40) obj2;
                    if (sf40Var3 == null || (str2 = sf40Var3.a) == null) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            if (((sf40) obj3).c) {
                                break;
                            }
                        }
                        sf40 sf40Var4 = (sf40) obj3;
                        str2 = sf40Var4 != null ? sf40Var4.a : "";
                    }
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj4 = null;
                            break;
                        }
                        obj4 = it3.next();
                        if (jl40.l(((sf40) obj4).a, str2)) {
                            break;
                        }
                    }
                    sf40Var = (sf40) obj4;
                    FormattedText formattedText = e670Var2.a;
                    mtTrainScheduleUiStateMapper$toButtonAction$1.L$0 = hf40Var;
                    mtTrainScheduleUiStateMapper$toButtonAction$1.L$1 = null;
                    mtTrainScheduleUiStateMapper$toButtonAction$1.L$2 = str;
                    mtTrainScheduleUiStateMapper$toButtonAction$1.L$3 = e670Var2;
                    mtTrainScheduleUiStateMapper$toButtonAction$1.L$4 = str2;
                    mtTrainScheduleUiStateMapper$toButtonAction$1.L$5 = sf40Var;
                    mtTrainScheduleUiStateMapper$toButtonAction$1.label = 1;
                    Object a2 = a(formattedText, mtTrainScheduleUiStateMapper$toButtonAction$1);
                    if (a2 != obj) {
                        e670Var = e670Var2;
                        obj5 = a2;
                        str3 = str2;
                        str4 = str;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence = (CharSequence) mtTrainScheduleUiStateMapper$toButtonAction$1.L$6;
                    sf40Var2 = (sf40) mtTrainScheduleUiStateMapper$toButtonAction$1.L$5;
                    str5 = (String) mtTrainScheduleUiStateMapper$toButtonAction$1.L$4;
                    str6 = (String) mtTrainScheduleUiStateMapper$toButtonAction$1.L$2;
                    hf40Var2 = (hf40) mtTrainScheduleUiStateMapper$toButtonAction$1.L$0;
                    kotlin.b.b(obj5);
                    CharSequence charSequence2 = (CharSequence) obj5;
                    if (sf40Var2 != null && (str7 = sf40Var2.b) != null) {
                        str8 = str7;
                    }
                    na11 na11Var = new na11(str6, str5, str8);
                    List<sf40> list3 = ((e670) hf40Var2).c;
                    ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                    for (sf40 sf40Var5 : list3) {
                        arrayList.add(new na11(str6, sf40Var5.a, sf40Var5.b));
                    }
                    return new ht(charSequence, charSequence2, na11Var, arrayList);
                }
                sf40 sf40Var6 = (sf40) mtTrainScheduleUiStateMapper$toButtonAction$1.L$5;
                str3 = (String) mtTrainScheduleUiStateMapper$toButtonAction$1.L$4;
                e670Var = (e670) mtTrainScheduleUiStateMapper$toButtonAction$1.L$3;
                str4 = (String) mtTrainScheduleUiStateMapper$toButtonAction$1.L$2;
                hf40 hf40Var3 = (hf40) mtTrainScheduleUiStateMapper$toButtonAction$1.L$0;
                kotlin.b.b(obj5);
                sf40Var = sf40Var6;
                hf40Var = hf40Var3;
                CharSequence charSequence3 = (CharSequence) obj5;
                FormattedText formattedText2 = e670Var.b;
                mtTrainScheduleUiStateMapper$toButtonAction$1.L$0 = hf40Var;
                mtTrainScheduleUiStateMapper$toButtonAction$1.L$1 = null;
                mtTrainScheduleUiStateMapper$toButtonAction$1.L$2 = str4;
                mtTrainScheduleUiStateMapper$toButtonAction$1.L$3 = null;
                mtTrainScheduleUiStateMapper$toButtonAction$1.L$4 = str3;
                mtTrainScheduleUiStateMapper$toButtonAction$1.L$5 = sf40Var;
                mtTrainScheduleUiStateMapper$toButtonAction$1.L$6 = charSequence3;
                mtTrainScheduleUiStateMapper$toButtonAction$1.label = 2;
                a = a(formattedText2, mtTrainScheduleUiStateMapper$toButtonAction$1);
                if (a != obj) {
                    obj5 = a;
                    charSequence = charSequence3;
                    hf40Var2 = hf40Var;
                    str5 = str3;
                    str6 = str4;
                    sf40Var2 = sf40Var;
                    CharSequence charSequence22 = (CharSequence) obj5;
                    if (sf40Var2 != null) {
                        str8 = str7;
                    }
                    na11 na11Var2 = new na11(str6, str5, str8);
                    List<sf40> list32 = ((e670) hf40Var2).c;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list32, 10));
                    while (r1.hasNext()) {
                    }
                    return new ht(charSequence, charSequence22, na11Var2, arrayList2);
                }
                return obj;
            }
        }
        mtTrainScheduleUiStateMapper$toButtonAction$1 = new MtTrainScheduleUiStateMapper$toButtonAction$1(this, continuationImpl);
        Object obj52 = mtTrainScheduleUiStateMapper$toButtonAction$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainScheduleUiStateMapper$toButtonAction$1.label;
        String str82 = "";
        if (i != 0) {
        }
        CharSequence charSequence32 = (CharSequence) obj52;
        FormattedText formattedText22 = e670Var.b;
        mtTrainScheduleUiStateMapper$toButtonAction$1.L$0 = hf40Var;
        mtTrainScheduleUiStateMapper$toButtonAction$1.L$1 = null;
        mtTrainScheduleUiStateMapper$toButtonAction$1.L$2 = str4;
        mtTrainScheduleUiStateMapper$toButtonAction$1.L$3 = null;
        mtTrainScheduleUiStateMapper$toButtonAction$1.L$4 = str3;
        mtTrainScheduleUiStateMapper$toButtonAction$1.L$5 = sf40Var;
        mtTrainScheduleUiStateMapper$toButtonAction$1.L$6 = charSequence32;
        mtTrainScheduleUiStateMapper$toButtonAction$1.label = 2;
        a = a(formattedText22, mtTrainScheduleUiStateMapper$toButtonAction$1);
        if (a != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(vf40 vf40Var, ContinuationImpl continuationImpl) {
        MtTrainScheduleUiStateMapper$toNotificationUiState$1 mtTrainScheduleUiStateMapper$toNotificationUiState$1;
        int i;
        if (continuationImpl instanceof MtTrainScheduleUiStateMapper$toNotificationUiState$1) {
            mtTrainScheduleUiStateMapper$toNotificationUiState$1 = (MtTrainScheduleUiStateMapper$toNotificationUiState$1) continuationImpl;
            int i2 = mtTrainScheduleUiStateMapper$toNotificationUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainScheduleUiStateMapper$toNotificationUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtTrainScheduleUiStateMapper$toNotificationUiState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainScheduleUiStateMapper$toNotificationUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (vf40Var.a.a.isEmpty()) {
                        return null;
                    }
                    FormattedText formattedText = vf40Var.a;
                    mtTrainScheduleUiStateMapper$toNotificationUiState$1.L$0 = vf40Var;
                    mtTrainScheduleUiStateMapper$toNotificationUiState$1.label = 1;
                    obj = a(formattedText, mtTrainScheduleUiStateMapper$toNotificationUiState$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vf40Var = (vf40) mtTrainScheduleUiStateMapper$toNotificationUiState$1.L$0;
                    kotlin.b.b(obj);
                }
                return new za01((CharSequence) obj, this.b.a(vf40Var.b, AppColor$Palette.Error));
            }
        }
        mtTrainScheduleUiStateMapper$toNotificationUiState$1 = new MtTrainScheduleUiStateMapper$toNotificationUiState$1(this, continuationImpl);
        Object obj3 = mtTrainScheduleUiStateMapper$toNotificationUiState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainScheduleUiStateMapper$toNotificationUiState$1.label;
        if (i != 0) {
        }
        return new za01((CharSequence) obj3, this.b.a(vf40Var.b, AppColor$Palette.Error));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0538 -> B:12:0x009d). Please report as a decompilation issue!!! */
    public final java.lang.Object m(java.util.List r37, defpackage.ief r38, kotlin.coroutines.jvm.internal.ContinuationImpl r39) {
        /*
            Method dump skipped, instructions count: 1420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.yandex.taxi.masstransit.trains.schedule.g.m(java.util.List, ief, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
