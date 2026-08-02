package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.tabs;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.e6x0;
import defpackage.f6x0;
import defpackage.g6x0;
import defpackage.g8e;
import defpackage.j6s;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.q8s;
import defpackage.r9x0;
import defpackage.tcc;
import defpackage.x2s;
import defpackage.x9x0;
import defpackage.y4x0;
import defpackage.z4x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a {
    public final q8s a;

    public a(q8s q8sVar) {
        this.a = q8sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0148 -> B:10:0x0153). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(f6x0 f6x0Var, j6s j6sVar, ContinuationImpl continuationImpl) {
        TabsMapper$map$1 tabsMapper$map$1;
        a aVar;
        int i;
        ArrayList arrayList;
        Object obj;
        Iterator it;
        List list;
        String str;
        int i2;
        TabsMapper$map$1 tabsMapper$map$12;
        Integer num;
        Object obj2;
        int i3;
        f6x0 f6x0Var2 = f6x0Var;
        if (continuationImpl instanceof TabsMapper$map$1) {
            tabsMapper$map$1 = (TabsMapper$map$1) continuationImpl;
            int i4 = tabsMapper$map$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                tabsMapper$map$1.label = i4 - Integer.MIN_VALUE;
                aVar = this;
                Object obj3 = tabsMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tabsMapper$map$1.label;
                Object obj4 = null;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Map map = j6sVar.a;
                    String str2 = f6x0Var2.b;
                    ArrayList arrayList2 = f6x0Var2.c;
                    Object orDefault = map.getOrDefault(str2, null);
                    Iterator it2 = arrayList2.iterator();
                    int i5 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i5 = -1;
                            break;
                        }
                        if (jl40.l(((y4x0) it2.next()).c, orDefault)) {
                            break;
                        }
                        i5++;
                    }
                    Integer num2 = new Integer(i5);
                    if (num2.intValue() == -1) {
                        num2 = null;
                    }
                    y4x0 y4x0Var = (y4x0) kotlin.collections.a.S(f6x0Var2.d, arrayList2);
                    Object obj5 = y4x0Var != null ? y4x0Var.c : null;
                    ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((y4x0) it3.next()).c);
                    }
                    String str3 = f6x0Var2.a;
                    arrayList = new ArrayList(tcc.n(arrayList2, 10));
                    obj = orDefault;
                    it = arrayList2.iterator();
                    list = arrayList3;
                    str = str3;
                    i2 = 0;
                    tabsMapper$map$12 = tabsMapper$map$1;
                    num = num2;
                    obj2 = obj5;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = tabsMapper$map$1.I$1;
                    int i7 = tabsMapper$map$1.I$0;
                    Collection collection = (Collection) tabsMapper$map$1.L$13;
                    String str4 = (String) tabsMapper$map$1.L$12;
                    Iterator it4 = (Iterator) tabsMapper$map$1.L$9;
                    ?? r8 = (Collection) tabsMapper$map$1.L$8;
                    List list2 = (List) tabsMapper$map$1.L$5;
                    Object obj6 = tabsMapper$map$1.L$4;
                    Integer num3 = (Integer) tabsMapper$map$1.L$3;
                    Object obj7 = tabsMapper$map$1.L$2;
                    f6x0 f6x0Var3 = (f6x0) tabsMapper$map$1.L$0;
                    kotlin.b.b(obj3);
                    Object obj8 = obj7;
                    arrayList = r8;
                    list = list2;
                    tabsMapper$map$12 = tabsMapper$map$1;
                    int i8 = i6;
                    f6x0Var2 = f6x0Var3;
                    str = str4;
                    collection.add((z4x0) obj3);
                    obj4 = null;
                    i2 = i8;
                    i3 = i7;
                    obj2 = obj6;
                    num = num3;
                    obj = obj8;
                    it = it4;
                    aVar = this;
                    if (it.hasNext()) {
                        y4x0 y4x0Var2 = (y4x0) it.next();
                        String str5 = f6x0Var2.b;
                        Object obj9 = obj == null ? obj2 : obj;
                        String str6 = f6x0Var2.e;
                        tabsMapper$map$12.L$0 = f6x0Var2;
                        tabsMapper$map$12.L$1 = obj4;
                        tabsMapper$map$12.L$2 = obj;
                        tabsMapper$map$12.L$3 = num;
                        tabsMapper$map$12.L$4 = obj2;
                        tabsMapper$map$12.L$5 = list;
                        tabsMapper$map$12.L$6 = obj4;
                        tabsMapper$map$12.L$7 = obj4;
                        tabsMapper$map$12.L$8 = arrayList;
                        tabsMapper$map$12.L$9 = it;
                        tabsMapper$map$12.L$10 = obj4;
                        tabsMapper$map$12.L$11 = obj4;
                        tabsMapper$map$12.L$12 = str;
                        tabsMapper$map$12.L$13 = arrayList;
                        tabsMapper$map$12.I$0 = i3;
                        tabsMapper$map$12.I$1 = i2;
                        tabsMapper$map$12.I$2 = 0;
                        tabsMapper$map$12.label = 1;
                        Object obj10 = obj2;
                        Integer num4 = num;
                        Object b = aVar.b(str5, y4x0Var2, obj9, str6, list, tabsMapper$map$12);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        int i9 = i3;
                        i8 = i2;
                        obj3 = b;
                        i7 = i9;
                        collection = arrayList;
                        it4 = it;
                        obj8 = obj;
                        num3 = num4;
                        obj6 = obj10;
                        collection.add((z4x0) obj3);
                        obj4 = null;
                        i2 = i8;
                        i3 = i7;
                        obj2 = obj6;
                        num = num3;
                        obj = obj8;
                        it = it4;
                        aVar = this;
                        if (it.hasNext()) {
                            Object obj11 = obj2;
                            Integer num5 = num;
                            ArrayList arrayList4 = arrayList;
                            int intValue = num5 != null ? num5.intValue() : f6x0Var2.d;
                            String str7 = f6x0Var2.e;
                            String o = g8e.o("selected_", f6x0Var2.b);
                            if (obj == null) {
                                obj = obj11;
                            }
                            return new e6x0(str, new g6x0(arrayList4, intValue, new x2s(str7, kotlin.collections.b.i(new Pair(o, obj), new Pair("available_options", list)))));
                        }
                    }
                }
            }
        }
        aVar = this;
        tabsMapper$map$1 = new TabsMapper$map$1(aVar, continuationImpl);
        Object obj32 = tabsMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tabsMapper$map$1.label;
        Object obj42 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        if (r13 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, y4x0 y4x0Var, Object obj, String str2, List list, ContinuationImpl continuationImpl) {
        TabsMapper$mapTabOption$1 tabsMapper$mapTabOption$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        CharSequence charSequence;
        String str3;
        List list2;
        y4x0 y4x0Var2;
        String str4;
        if (continuationImpl instanceof TabsMapper$mapTabOption$1) {
            tabsMapper$mapTabOption$1 = (TabsMapper$mapTabOption$1) continuationImpl;
            int i2 = tabsMapper$mapTabOption$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tabsMapper$mapTabOption$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tabsMapper$mapTabOption$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tabsMapper$mapTabOption$1.label;
                q8s q8sVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    FormattedText formattedText = y4x0Var.a;
                    tabsMapper$mapTabOption$1.L$0 = str;
                    tabsMapper$mapTabOption$1.L$1 = y4x0Var;
                    tabsMapper$mapTabOption$1.L$2 = obj;
                    tabsMapper$mapTabOption$1.L$3 = str2;
                    tabsMapper$mapTabOption$1.L$4 = list;
                    tabsMapper$mapTabOption$1.label = 1;
                    obj2 = q8sVar.a(formattedText, tabsMapper$mapTabOption$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence = (CharSequence) tabsMapper$mapTabOption$1.L$5;
                        list2 = (List) tabsMapper$mapTabOption$1.L$4;
                        str4 = (String) tabsMapper$mapTabOption$1.L$3;
                        obj = tabsMapper$mapTabOption$1.L$2;
                        y4x0Var2 = (y4x0) tabsMapper$mapTabOption$1.L$1;
                        str3 = (String) tabsMapper$mapTabOption$1.L$0;
                        kotlin.b.b(obj2);
                        r9x0 r9x0Var = y4x0Var2.d;
                        Object obj3 = y4x0Var2.c;
                        return new z4x0(charSequence, (CharSequence) obj2, new x9x0(r9x0Var, str3, obj3, new x2s(str4, kotlin.collections.b.i(new Pair(g8e.o("selected_", str3), obj3), new Pair(g8e.o("prev_selected_", str3), obj), new Pair("available_options", list2)))));
                    }
                    list = (List) tabsMapper$mapTabOption$1.L$4;
                    str2 = (String) tabsMapper$mapTabOption$1.L$3;
                    obj = tabsMapper$mapTabOption$1.L$2;
                    y4x0Var = (y4x0) tabsMapper$mapTabOption$1.L$1;
                    str = (String) tabsMapper$mapTabOption$1.L$0;
                    kotlin.b.b(obj2);
                }
                CharSequence charSequence2 = (CharSequence) obj2;
                FormattedText formattedText2 = y4x0Var.b;
                tabsMapper$mapTabOption$1.L$0 = str;
                tabsMapper$mapTabOption$1.L$1 = y4x0Var;
                tabsMapper$mapTabOption$1.L$2 = obj;
                tabsMapper$mapTabOption$1.L$3 = str2;
                tabsMapper$mapTabOption$1.L$4 = list;
                tabsMapper$mapTabOption$1.L$5 = charSequence2;
                tabsMapper$mapTabOption$1.label = 2;
                a = q8sVar.a(formattedText2, tabsMapper$mapTabOption$1);
                if (a != coroutineSingletons) {
                    obj2 = a;
                    charSequence = charSequence2;
                    List list3 = list;
                    str3 = str;
                    list2 = list3;
                    String str5 = str2;
                    y4x0Var2 = y4x0Var;
                    str4 = str5;
                    r9x0 r9x0Var2 = y4x0Var2.d;
                    Object obj32 = y4x0Var2.c;
                    return new z4x0(charSequence, (CharSequence) obj2, new x9x0(r9x0Var2, str3, obj32, new x2s(str4, kotlin.collections.b.i(new Pair(g8e.o("selected_", str3), obj32), new Pair(g8e.o("prev_selected_", str3), obj), new Pair("available_options", list2)))));
                }
                return coroutineSingletons;
            }
        }
        tabsMapper$mapTabOption$1 = new TabsMapper$mapTabOption$1(this, continuationImpl);
        Object obj22 = tabsMapper$mapTabOption$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tabsMapper$mapTabOption$1.label;
        q8s q8sVar2 = this.a;
        if (i != 0) {
        }
        CharSequence charSequence22 = (CharSequence) obj22;
        FormattedText formattedText22 = y4x0Var.b;
        tabsMapper$mapTabOption$1.L$0 = str;
        tabsMapper$mapTabOption$1.L$1 = y4x0Var;
        tabsMapper$mapTabOption$1.L$2 = obj;
        tabsMapper$mapTabOption$1.L$3 = str2;
        tabsMapper$mapTabOption$1.L$4 = list;
        tabsMapper$mapTabOption$1.L$5 = charSequence22;
        tabsMapper$mapTabOption$1.label = 2;
        a = q8sVar2.a(formattedText22, tabsMapper$mapTabOption$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
