package ru.yandex.taxi.scooters.presentation.feedback.data.mapper;

import defpackage.avq;
import defpackage.fln0;
import defpackage.g8e;
import defpackage.gln0;
import defpackage.hln0;
import defpackage.htq;
import defpackage.iln0;
import defpackage.jl40;
import defpackage.juq;
import defpackage.jwo0;
import defpackage.mtq;
import defpackage.ny61;
import defpackage.ovq;
import defpackage.oyr;
import defpackage.sln0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.tuq;
import defpackage.uyj;
import defpackage.ysq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackAttachments;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;
import ru.yandex.taxi.widget.c;

/* loaded from: classes6.dex */
public final class a {
    public final tt2 a;
    public final c b;

    public a(tt2 tt2Var, c cVar) {
        this.a = tt2Var;
        this.b = cVar;
    }

    public static void b(iln0 iln0Var, ArrayList arrayList, List list, List list2, ArrayList arrayList2) {
        String str = iln0Var.a.a.a;
        if (arrayList.contains(str)) {
            ArrayList o0 = kotlin.collections.a.o0(list2, str);
            if (list.contains(str)) {
                arrayList2.add(o0);
            }
            Iterator it = iln0Var.c.iterator();
            while (it.hasNext()) {
                b((iln0) it.next(), arrayList, list, o0, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0192 -> B:11:0x005a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(hln0 hln0Var, List list, int i, List list2, List list3, ContinuationImpl continuationImpl) {
        ScootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1 scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1;
        int i2;
        List list4;
        ArrayList t;
        ScootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1 scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$12;
        Iterator it;
        hln0 hln0Var2;
        int i3;
        List list5;
        ScootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1 scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$13;
        List list6;
        List list7;
        ovq ovqVar;
        a aVar;
        hln0 hln0Var3;
        int i4;
        fln0 fln0Var;
        Object obj;
        Object obj2;
        Object obj3;
        if (continuationImpl instanceof ScootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1) {
            scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1 = (ScootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1) continuationImpl;
            int i5 = scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1.label = i5 - Integer.MIN_VALUE;
                Object obj4 = scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1.label;
                ovq ovqVar2 = null;
                if (i2 != 0) {
                    list4 = list3;
                    t = g8e.t(obj4);
                    scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$12 = scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1;
                    it = list.iterator();
                    hln0Var2 = hln0Var;
                    i3 = i;
                    list5 = list2;
                    if (it.hasNext()) {
                    }
                } else if (i2 == 1) {
                    i4 = scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1.I$0;
                    a aVar2 = (a) scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1.L$8;
                    ovqVar = (ovq) scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1.L$7;
                    it = (Iterator) scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1.L$5;
                    ?? r13 = (List) scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1.L$4;
                    list6 = (List) scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1.L$3;
                    List list8 = (List) scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1.L$2;
                    hln0Var3 = (hln0) scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1.L$0;
                    b.b(obj4);
                    aVar = aVar2;
                    t = r13;
                    list7 = list8;
                    scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$13 = scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1;
                    Iterator it2 = it;
                    fln0Var = (fln0) obj4;
                    if (fln0Var == null) {
                    }
                } else {
                    if (i2 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1.I$0;
                    Iterator it3 = (Iterator) scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1.L$5;
                    ?? r11 = (List) scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1.L$4;
                    List list9 = (List) scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1.L$3;
                    list7 = (List) scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1.L$2;
                    hln0 hln0Var4 = (hln0) scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1.L$0;
                    b.b(obj4);
                    Object a = obj4;
                    list4 = list9;
                    it = it3;
                    t = r11;
                    scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$12 = scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1;
                    i3 = i4;
                    list5 = list7;
                    t.add((iln0) a);
                    hln0Var2 = hln0Var4;
                    ovqVar2 = null;
                    if (it.hasNext()) {
                        String str = (String) it.next();
                        Iterator it4 = list4.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj = ovqVar2;
                                break;
                            }
                            obj = it4.next();
                            if (jl40.l(((ovq) obj).a, str)) {
                                break;
                            }
                        }
                        ovq ovqVar3 = (ovq) obj;
                        if (ovqVar3 == null) {
                            Iterator it5 = list5.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    obj3 = ovqVar2;
                                    break;
                                }
                                obj3 = it5.next();
                                if (jl40.l(((ysq) obj3).a, str)) {
                                    break;
                                }
                            }
                            ysq ysqVar = (ysq) obj3;
                            ovq ovqVar4 = ysqVar != null ? new ovq(ysqVar.a, 6) : ovqVar2;
                            if (ovqVar4 == null) {
                                ny61.g(oyr.p("Feedback item with this id = '", str, "' was not found in feedback items"));
                                return ovqVar2;
                            }
                            ovqVar3 = ovqVar4;
                        }
                        Iterator it6 = list5.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it6.next();
                            if (jl40.l(((ysq) obj2).a, ovqVar3.a)) {
                                break;
                            }
                        }
                        ysq ysqVar2 = (ysq) obj2;
                        if (ysqVar2 != null) {
                            scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$12.L$0 = hln0Var2;
                            scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$12.L$1 = null;
                            scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$12.L$2 = list5;
                            scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$12.L$3 = list4;
                            scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$12.L$4 = t;
                            scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$12.L$5 = it;
                            scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$12.L$6 = null;
                            scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$12.L$7 = ovqVar3;
                            scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$12.L$8 = this;
                            scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$12.I$0 = i3;
                            scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$12.label = 1;
                            Object c = c(ysqVar2, scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$12);
                            if (c != coroutineSingletons) {
                                ovq ovqVar5 = ovqVar3;
                                scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$13 = scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$12;
                                ovqVar = ovqVar5;
                                list7 = list5;
                                list6 = list4;
                                hln0Var3 = hln0Var2;
                                i4 = i3;
                                obj4 = c;
                                aVar = this;
                                Iterator it22 = it;
                                fln0Var = (fln0) obj4;
                                if (fln0Var == null) {
                                    scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$13.L$0 = hln0Var3;
                                    scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$13.L$1 = null;
                                    scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$13.L$2 = list7;
                                    scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$13.L$3 = list6;
                                    scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$13.L$4 = t;
                                    scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$13.L$5 = it22;
                                    scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$13.L$6 = null;
                                    scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$13.L$7 = null;
                                    scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$13.L$8 = null;
                                    scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$13.I$0 = i4;
                                    scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$13.label = 2;
                                    ArrayList arrayList = t;
                                    a = aVar.a(new hln0(fln0Var, ovqVar.c), ovqVar.b, i4 + 1, list7, list6, scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$13);
                                    if (a != coroutineSingletons) {
                                        List list10 = list6;
                                        hln0Var4 = hln0Var3;
                                        list4 = list10;
                                        it = it22;
                                        t = arrayList;
                                        scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$12 = scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$13;
                                        i3 = i4;
                                        list5 = list7;
                                        t.add((iln0) a);
                                        hln0Var2 = hln0Var4;
                                        ovqVar2 = null;
                                        if (it.hasNext()) {
                                            return new iln0(hln0Var2, i3, t);
                                        }
                                    }
                                } else {
                                    ovqVar3 = ovqVar;
                                }
                            }
                            return coroutineSingletons;
                        }
                        ny61.g(oyr.p("Feedback item with this id = '", ovqVar3.a, "' was not found in feedback items"));
                        return null;
                    }
                }
            }
        }
        scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1 = new ScootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1(this, continuationImpl);
        Object obj42 = scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = scootersFeedbackMapper$createScootersFeedbackItemTreeRecursive$1.label;
        ovq ovqVar22 = null;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ysq ysqVar, ContinuationImpl continuationImpl) {
        ScootersFeedbackMapper$mapToScootersFeedbackItem$1 scootersFeedbackMapper$mapToScootersFeedbackItem$1;
        int i;
        String str;
        if (continuationImpl instanceof ScootersFeedbackMapper$mapToScootersFeedbackItem$1) {
            scootersFeedbackMapper$mapToScootersFeedbackItem$1 = (ScootersFeedbackMapper$mapToScootersFeedbackItem$1) continuationImpl;
            int i2 = scootersFeedbackMapper$mapToScootersFeedbackItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersFeedbackMapper$mapToScootersFeedbackItem$1.label = i2 - Integer.MIN_VALUE;
                ScootersFeedbackMapper$mapToScootersFeedbackItem$1 scootersFeedbackMapper$mapToScootersFeedbackItem$12 = scootersFeedbackMapper$mapToScootersFeedbackItem$1;
                Object obj = scootersFeedbackMapper$mapToScootersFeedbackItem$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersFeedbackMapper$mapToScootersFeedbackItem$12.label;
                if (i != 0) {
                    b.b(obj);
                    String str2 = ysqVar.a;
                    FormattedText formattedText = ysqVar.b;
                    scootersFeedbackMapper$mapToScootersFeedbackItem$12.L$0 = null;
                    scootersFeedbackMapper$mapToScootersFeedbackItem$12.L$1 = str2;
                    scootersFeedbackMapper$mapToScootersFeedbackItem$12.label = 1;
                    Object e = c.e(this.b, formattedText, null, false, scootersFeedbackMapper$mapToScootersFeedbackItem$12, 30);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = e;
                    str = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) scootersFeedbackMapper$mapToScootersFeedbackItem$12.L$1;
                    b.b(obj);
                }
                return new fln0((CharSequence) obj, str);
            }
        }
        scootersFeedbackMapper$mapToScootersFeedbackItem$1 = new ScootersFeedbackMapper$mapToScootersFeedbackItem$1(this, continuationImpl);
        ScootersFeedbackMapper$mapToScootersFeedbackItem$1 scootersFeedbackMapper$mapToScootersFeedbackItem$122 = scootersFeedbackMapper$mapToScootersFeedbackItem$1;
        Object obj2 = scootersFeedbackMapper$mapToScootersFeedbackItem$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersFeedbackMapper$mapToScootersFeedbackItem$122.label;
        if (i != 0) {
        }
        return new fln0((CharSequence) obj2, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0094 -> B:10:0x0097). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(List list, ContinuationImpl continuationImpl) {
        ScootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$1 scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$1;
        int i;
        Iterator it;
        Collection collection;
        ScootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$1 scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$12;
        if (continuationImpl instanceof ScootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$1) {
            scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$1 = (ScootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$1) continuationImpl;
            int i2 = scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$1.label;
                if (i != 0) {
                    b.b(obj);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    it = list2.iterator();
                    collection = arrayList;
                    scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$12 = scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$1;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i3 = scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$1.I$0;
                    collection = (Collection) scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$1.L$7;
                    Iterator it2 = (Iterator) scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$1.L$4;
                    Collection collection2 = (Collection) scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$1.L$3;
                    b.b(obj);
                    scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$12 = scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$1;
                    collection.add(new gln0(i3, (CharSequence) obj));
                    it = it2;
                    collection = collection2;
                    if (it.hasNext()) {
                        htq htqVar = (htq) it.next();
                        int i4 = htqVar.a;
                        FormattedText formattedText = htqVar.b;
                        scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$12.L$0 = null;
                        scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$12.L$1 = null;
                        scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$12.L$2 = null;
                        scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$12.L$3 = collection;
                        scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$12.L$4 = it;
                        scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$12.L$5 = null;
                        scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$12.L$6 = null;
                        scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$12.L$7 = collection;
                        scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$12.I$0 = i4;
                        scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$12.label = 1;
                        obj = c.e(this.b, formattedText, null, false, scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$12, 30);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        it2 = it;
                        i3 = i4;
                        collection2 = collection;
                        collection.add(new gln0(i3, (CharSequence) obj));
                        it = it2;
                        collection = collection2;
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$1 = new ScootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$1(this, continuationImpl);
        Object obj2 = scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersFeedbackMapper$mapToScootersFeedbackItemLevelTitles$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r16v0, types: [ru.yandex.taxi.scooters.presentation.feedback.data.mapper.a] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00e1 -> B:23:0x00e9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(avq avqVar, FeedbackSettingsParams$Screen feedbackSettingsParams$Screen, ContinuationImpl continuationImpl) {
        ScootersFeedbackMapper$mapToScootersFeedbackSettings$1 scootersFeedbackMapper$mapToScootersFeedbackSettings$1;
        int i;
        Map map;
        List list;
        ScootersFeedbackMapper$mapToScootersFeedbackSettings$1 scootersFeedbackMapper$mapToScootersFeedbackSettings$12;
        int i2;
        FeedbackSettingsParams$Screen feedbackSettingsParams$Screen2;
        List list2;
        Iterator it;
        Map map2;
        MapBuilder j;
        juq juqVar;
        FeedbackSettingsParams$Screen feedbackSettingsParams$Screen3;
        List list3;
        MapBuilder mapBuilder;
        tuq tuqVar;
        FeedbackSettingsParams$Screen feedbackSettingsParams$Screen4;
        List list4;
        MapBuilder mapBuilder2;
        int i3;
        avq avqVar2 = avqVar;
        if (continuationImpl instanceof ScootersFeedbackMapper$mapToScootersFeedbackSettings$1) {
            scootersFeedbackMapper$mapToScootersFeedbackSettings$1 = (ScootersFeedbackMapper$mapToScootersFeedbackSettings$1) continuationImpl;
            int i4 = scootersFeedbackMapper$mapToScootersFeedbackSettings$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                scootersFeedbackMapper$mapToScootersFeedbackSettings$1.label = i4 - Integer.MIN_VALUE;
                Object obj = scootersFeedbackMapper$mapToScootersFeedbackSettings$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersFeedbackMapper$mapToScootersFeedbackSettings$1.label;
                jwo0 jwo0Var = null;
                if (i != 0) {
                    b.b(obj);
                    juq juqVar2 = avqVar2.c;
                    int i5 = (juqVar2 == null || !juqVar2.a) ? 0 : 1;
                    List list5 = avqVar2.d;
                    MapBuilder mapBuilder3 = new MapBuilder();
                    juq juqVar3 = avqVar2.c;
                    if (juqVar3 == null || (list2 = juqVar3.b) == null) {
                        map = mapBuilder3;
                        list = list5;
                        scootersFeedbackMapper$mapToScootersFeedbackSettings$12 = scootersFeedbackMapper$mapToScootersFeedbackSettings$1;
                        i2 = i5;
                        feedbackSettingsParams$Screen2 = feedbackSettingsParams$Screen;
                        j = ((MapBuilder) map).j();
                        juqVar = avqVar2.c;
                        if (juqVar != null) {
                        }
                        feedbackSettingsParams$Screen3 = feedbackSettingsParams$Screen2;
                        list3 = list;
                        mapBuilder = j;
                        return new sln0(i2 != 0, list3, mapBuilder, jwo0Var, feedbackSettingsParams$Screen3);
                    }
                    map = mapBuilder3;
                    it = list2.iterator();
                    list = list5;
                    map2 = map;
                    scootersFeedbackMapper$mapToScootersFeedbackSettings$12 = scootersFeedbackMapper$mapToScootersFeedbackSettings$1;
                    i2 = i5;
                    feedbackSettingsParams$Screen2 = feedbackSettingsParams$Screen;
                    while (it.hasNext()) {
                    }
                    j = ((MapBuilder) map).j();
                    juqVar = avqVar2.c;
                    if (juqVar != null) {
                    }
                    feedbackSettingsParams$Screen3 = feedbackSettingsParams$Screen2;
                    list3 = list;
                    mapBuilder = j;
                    return new sln0(i2 != 0, list3, mapBuilder, jwo0Var, feedbackSettingsParams$Screen3);
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = scootersFeedbackMapper$mapToScootersFeedbackSettings$1.I$0;
                    ?? r1 = (Map) scootersFeedbackMapper$mapToScootersFeedbackSettings$1.L$4;
                    list4 = (List) scootersFeedbackMapper$mapToScootersFeedbackSettings$1.L$3;
                    feedbackSettingsParams$Screen4 = (FeedbackSettingsParams$Screen) scootersFeedbackMapper$mapToScootersFeedbackSettings$1.L$1;
                    b.b(obj);
                    mapBuilder2 = r1;
                    jwo0Var = (jwo0) obj;
                    i2 = i3;
                    mapBuilder = mapBuilder2;
                    list3 = list4;
                    feedbackSettingsParams$Screen3 = feedbackSettingsParams$Screen4;
                    return new sln0(i2 != 0, list3, mapBuilder, jwo0Var, feedbackSettingsParams$Screen3);
                }
                int i6 = scootersFeedbackMapper$mapToScootersFeedbackSettings$1.I$0;
                List list6 = (List) scootersFeedbackMapper$mapToScootersFeedbackSettings$1.L$11;
                map2 = (Map) scootersFeedbackMapper$mapToScootersFeedbackSettings$1.L$10;
                List list7 = (List) scootersFeedbackMapper$mapToScootersFeedbackSettings$1.L$9;
                it = (Iterator) scootersFeedbackMapper$mapToScootersFeedbackSettings$1.L$5;
                Map map3 = (Map) scootersFeedbackMapper$mapToScootersFeedbackSettings$1.L$3;
                map = (Map) scootersFeedbackMapper$mapToScootersFeedbackSettings$1.L$2;
                FeedbackSettingsParams$Screen feedbackSettingsParams$Screen5 = (FeedbackSettingsParams$Screen) scootersFeedbackMapper$mapToScootersFeedbackSettings$1.L$1;
                avq avqVar3 = (avq) scootersFeedbackMapper$mapToScootersFeedbackSettings$1.L$0;
                b.b(obj);
                map2.put(list7, obj);
                ScootersFeedbackMapper$mapToScootersFeedbackSettings$1 scootersFeedbackMapper$mapToScootersFeedbackSettings$13 = scootersFeedbackMapper$mapToScootersFeedbackSettings$1;
                i2 = i6;
                avqVar2 = avqVar3;
                list = list6;
                scootersFeedbackMapper$mapToScootersFeedbackSettings$12 = scootersFeedbackMapper$mapToScootersFeedbackSettings$13;
                map2 = map3;
                feedbackSettingsParams$Screen2 = feedbackSettingsParams$Screen5;
                while (it.hasNext()) {
                    mtq mtqVar = (mtq) it.next();
                    tuq tuqVar2 = mtqVar.b;
                    if (tuqVar2 != null) {
                        list7 = mtqVar.a;
                        scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$0 = avqVar2;
                        scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$1 = feedbackSettingsParams$Screen2;
                        scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$2 = map;
                        scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$3 = map2;
                        scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$4 = null;
                        scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$5 = it;
                        scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$6 = null;
                        scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$7 = null;
                        scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$8 = null;
                        scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$9 = list7;
                        scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$10 = map2;
                        scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$11 = list;
                        scootersFeedbackMapper$mapToScootersFeedbackSettings$12.I$0 = i2;
                        scootersFeedbackMapper$mapToScootersFeedbackSettings$12.label = 1;
                        Object f = f(avqVar2, tuqVar2, scootersFeedbackMapper$mapToScootersFeedbackSettings$12);
                        if (f != coroutineSingletons) {
                            List list8 = list;
                            avqVar3 = avqVar2;
                            i6 = i2;
                            scootersFeedbackMapper$mapToScootersFeedbackSettings$1 = scootersFeedbackMapper$mapToScootersFeedbackSettings$12;
                            list6 = list8;
                            feedbackSettingsParams$Screen5 = feedbackSettingsParams$Screen2;
                            obj = f;
                            map3 = map2;
                            map2.put(list7, obj);
                            ScootersFeedbackMapper$mapToScootersFeedbackSettings$1 scootersFeedbackMapper$mapToScootersFeedbackSettings$132 = scootersFeedbackMapper$mapToScootersFeedbackSettings$1;
                            i2 = i6;
                            avqVar2 = avqVar3;
                            list = list6;
                            scootersFeedbackMapper$mapToScootersFeedbackSettings$12 = scootersFeedbackMapper$mapToScootersFeedbackSettings$132;
                            map2 = map3;
                            feedbackSettingsParams$Screen2 = feedbackSettingsParams$Screen5;
                            while (it.hasNext()) {
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                j = ((MapBuilder) map).j();
                juqVar = avqVar2.c;
                if (juqVar != null || (tuqVar = juqVar.c) == null) {
                    feedbackSettingsParams$Screen3 = feedbackSettingsParams$Screen2;
                    list3 = list;
                    mapBuilder = j;
                    return new sln0(i2 != 0, list3, mapBuilder, jwo0Var, feedbackSettingsParams$Screen3);
                }
                scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$0 = null;
                scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$1 = feedbackSettingsParams$Screen2;
                scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$2 = null;
                scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$3 = list;
                scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$4 = j;
                scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$5 = null;
                scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$6 = null;
                scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$7 = null;
                scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$8 = null;
                scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$9 = null;
                scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$10 = null;
                scootersFeedbackMapper$mapToScootersFeedbackSettings$12.L$11 = null;
                scootersFeedbackMapper$mapToScootersFeedbackSettings$12.I$0 = i2;
                scootersFeedbackMapper$mapToScootersFeedbackSettings$12.label = 2;
                Object f2 = f(avqVar2, tuqVar, scootersFeedbackMapper$mapToScootersFeedbackSettings$12);
                if (f2 != coroutineSingletons) {
                    feedbackSettingsParams$Screen4 = feedbackSettingsParams$Screen2;
                    list4 = list;
                    mapBuilder2 = j;
                    obj = f2;
                    i3 = i2;
                    jwo0Var = (jwo0) obj;
                    i2 = i3;
                    mapBuilder = mapBuilder2;
                    list3 = list4;
                    feedbackSettingsParams$Screen3 = feedbackSettingsParams$Screen4;
                    return new sln0(i2 != 0, list3, mapBuilder, jwo0Var, feedbackSettingsParams$Screen3);
                }
                return coroutineSingletons;
            }
        }
        scootersFeedbackMapper$mapToScootersFeedbackSettings$1 = new ScootersFeedbackMapper$mapToScootersFeedbackSettings$1(this, continuationImpl);
        Object obj2 = scootersFeedbackMapper$mapToScootersFeedbackSettings$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersFeedbackMapper$mapToScootersFeedbackSettings$1.label;
        jwo0 jwo0Var2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        if (r0 == r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(avq avqVar, tuq tuqVar, ContinuationImpl continuationImpl) {
        ScootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1 scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1;
        Object obj;
        Object obj2;
        int i;
        iln0 iln0Var;
        FeedbackAttachments.Requirement requirement;
        FeedbackAttachments.Requirement requirement2;
        FeedbackAttachments.Requirement requirement3;
        FeedbackAttachments feedbackAttachments;
        if (continuationImpl instanceof ScootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1) {
            scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1 = (ScootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1) continuationImpl;
            int i2 = scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.label;
                if (i != 0) {
                    b.b(obj);
                    String str = tuqVar.a;
                    List list = avqVar.a;
                    List list2 = avqVar.b;
                    if (str == null || list == null || list2 == null || list.isEmpty()) {
                        iln0Var = null;
                        FeedbackAttachments feedbackAttachments2 = tuqVar.b;
                        requirement = feedbackAttachments2.a;
                        FeedbackAttachments.Requirement requirement4 = feedbackAttachments2.b;
                        requirement.getClass();
                        requirement2 = FeedbackAttachments.Requirement.NONE;
                        if (requirement == requirement2) {
                            requirement4.getClass();
                            if (!(requirement4 == requirement2)) {
                                requirement3 = FeedbackAttachments.Requirement.OPTIONAL;
                                FeedbackAttachments feedbackAttachments3 = new FeedbackAttachments(requirement3, requirement4);
                                List list3 = tuqVar.c;
                                scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$0 = null;
                                scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$1 = null;
                                scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$2 = null;
                                scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$3 = null;
                                scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$4 = null;
                                scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$5 = iln0Var;
                                scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$6 = feedbackAttachments3;
                                scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.label = 2;
                                obj = d(list3, scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1);
                                if (obj != obj2) {
                                    feedbackAttachments = feedbackAttachments3;
                                    return new jwo0(iln0Var, feedbackAttachments, (List) obj);
                                }
                                return obj2;
                            }
                        }
                        requirement3 = feedbackAttachments2.a;
                        FeedbackAttachments feedbackAttachments32 = new FeedbackAttachments(requirement3, requirement4);
                        List list32 = tuqVar.c;
                        scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$0 = null;
                        scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$1 = null;
                        scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$2 = null;
                        scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$3 = null;
                        scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$4 = null;
                        scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$5 = iln0Var;
                        scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$6 = feedbackAttachments32;
                        scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.label = 2;
                        obj = d(list32, scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1);
                        if (obj != obj2) {
                        }
                        return obj2;
                    }
                    scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$0 = null;
                    scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$1 = tuqVar;
                    scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$2 = null;
                    scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$3 = null;
                    scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$4 = null;
                    scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.label = 1;
                    this.a.getClass();
                    obj = tje.k0(uyj.a, new ScootersFeedbackMapper$mapToScootersFeedbackItemTreeNode$2(list2, str, this, list, null), scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        feedbackAttachments = (FeedbackAttachments) scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$6;
                        iln0Var = (iln0) scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$5;
                        b.b(obj);
                        return new jwo0(iln0Var, feedbackAttachments, (List) obj);
                    }
                    tuqVar = (tuq) scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$1;
                    b.b(obj);
                }
                iln0Var = (iln0) obj;
                FeedbackAttachments feedbackAttachments22 = tuqVar.b;
                requirement = feedbackAttachments22.a;
                FeedbackAttachments.Requirement requirement42 = feedbackAttachments22.b;
                requirement.getClass();
                requirement2 = FeedbackAttachments.Requirement.NONE;
                if (requirement == requirement2) {
                }
                requirement3 = feedbackAttachments22.a;
                FeedbackAttachments feedbackAttachments322 = new FeedbackAttachments(requirement3, requirement42);
                List list322 = tuqVar.c;
                scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$0 = null;
                scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$1 = null;
                scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$2 = null;
                scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$3 = null;
                scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$4 = null;
                scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$5 = iln0Var;
                scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$6 = feedbackAttachments322;
                scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.label = 2;
                obj = d(list322, scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1);
                if (obj != obj2) {
                }
                return obj2;
            }
        }
        scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1 = new ScootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1(this, continuationImpl);
        obj = scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.label;
        if (i != 0) {
        }
        iln0Var = (iln0) obj;
        FeedbackAttachments feedbackAttachments222 = tuqVar.b;
        requirement = feedbackAttachments222.a;
        FeedbackAttachments.Requirement requirement422 = feedbackAttachments222.b;
        requirement.getClass();
        requirement2 = FeedbackAttachments.Requirement.NONE;
        if (requirement == requirement2) {
        }
        requirement3 = feedbackAttachments222.a;
        FeedbackAttachments feedbackAttachments3222 = new FeedbackAttachments(requirement3, requirement422);
        List list3222 = tuqVar.c;
        scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$0 = null;
        scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$1 = null;
        scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$2 = null;
        scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$3 = null;
        scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$4 = null;
        scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$5 = iln0Var;
        scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.L$6 = feedbackAttachments3222;
        scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1.label = 2;
        obj = d(list3222, scootersFeedbackMapper$mapToScootersSpecifiedFeedbackSettings$1);
        if (obj != obj2) {
        }
        return obj2;
    }
}
