package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class ja1 {
    public final jyr a;
    public final jyr b;

    public ja1() {
        bdt I = hag.I(o8q.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, true);
        this.b = l18Var.b(hag.I(k68.class), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0141, code lost:
    
        if (r5 != null) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(s91 s91Var, cg6 cg6Var) {
        ia1 ia1Var;
        int i;
        u51 u51Var;
        CoverPath none;
        String str;
        String t;
        String pathForSize;
        String str2;
        nm6 nm6Var;
        hs5 hs5Var;
        String str3;
        te teVar;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        u51 u51Var2;
        String str9;
        ArrayList arrayList;
        String str10;
        String str11;
        ArrayList arrayList2;
        htr htrVar;
        int i2;
        List list;
        String str12;
        s91 s91Var2 = s91Var;
        if (cg6Var instanceof ia1) {
            ia1Var = (ia1) cg6Var;
            int i3 = ia1Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ia1Var.v = i3 - Integer.MIN_VALUE;
                Object obj = ia1Var.t;
                nm6 nm6Var2 = nm6.a;
                i = ia1Var.v;
                if (i != 0) {
                    qgg.h0(obj);
                    List list2 = s91Var2.g;
                    u51Var = s91Var2.a;
                    u9b u9bVar = u51Var.c;
                    u9b u9bVar2 = (u9b) CollectionsKt.firstOrNull(list2);
                    if (u9bVar2 == null) {
                        u9bVar2 = u9bVar;
                    }
                    if (u9bVar2 != null) {
                        none = kg5.M(u9bVar2, WebPath$Storage.AVATARS_NO_CROP);
                    } else {
                        none = CoverPath.none();
                        none.getClass();
                    }
                    gd6 gd6Var = u51Var.e;
                    hs5 p = (gd6Var == null || (list = gd6Var.a) == null) ? null : lxe.p(list, gs5.g);
                    str = u51Var.b;
                    t = ouj.t(none);
                    pathForSize = none.getPathForSize(frv.b());
                    pathForSize.getClass();
                    String str13 = u9bVar != null ? u9bVar.c : null;
                    List list3 = s91Var2.g;
                    ArrayList arrayList3 = new ArrayList(v75.o(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(kg5.M((u9b) it.next(), WebPath$Storage.AVATARS_NO_CROP));
                    }
                    fk1 fk1Var = s91Var2.e;
                    if (fk1Var != null) {
                        o8q o8qVar = (o8q) this.a.getValue();
                        quk qukVar = htr.f;
                        String language = swf.I().getLanguage();
                        language.getClass();
                        qukVar.getClass();
                        int hashCode = language.hashCode();
                        if (hashCode == 3424) {
                            if (language.equals("kk")) {
                                htrVar = htr.j;
                                Locale locale = htrVar.c;
                                o8qVar.getClass();
                                locale.getClass();
                                i2 = fk1Var.a;
                                Integer valueOf = Integer.valueOf(i2);
                                if (i2 <= 0) {
                                }
                                if (valueOf == null) {
                                }
                            }
                            htrVar = htr.g;
                            Locale locale2 = htrVar.c;
                            o8qVar.getClass();
                            locale2.getClass();
                            i2 = fk1Var.a;
                            Integer valueOf2 = Integer.valueOf(i2);
                            if (i2 <= 0) {
                            }
                            if (valueOf2 == null) {
                            }
                        } else if (hashCode != 3651) {
                            if (hashCode == 3749 && language.equals("uz")) {
                                htrVar = htr.i;
                                Locale locale22 = htrVar.c;
                                o8qVar.getClass();
                                locale22.getClass();
                                i2 = fk1Var.a;
                                Integer valueOf22 = Integer.valueOf(i2);
                                if (i2 <= 0) {
                                    valueOf22 = null;
                                }
                                str2 = valueOf22 == null ? o8qVar.a.d(R.string.number_of_listeners_per_month_short, Arrays.copyOf(new Object[]{ot0.B(valueOf22.intValue(), locale22)}, 1)) : null;
                            }
                            htrVar = htr.g;
                            Locale locale222 = htrVar.c;
                            o8qVar.getClass();
                            locale222.getClass();
                            i2 = fk1Var.a;
                            Integer valueOf222 = Integer.valueOf(i2);
                            if (i2 <= 0) {
                            }
                            if (valueOf222 == null) {
                            }
                        } else {
                            if (language.equals("ru")) {
                                htrVar = htr.h;
                                Locale locale2222 = htrVar.c;
                                o8qVar.getClass();
                                locale2222.getClass();
                                i2 = fk1Var.a;
                                Integer valueOf2222 = Integer.valueOf(i2);
                                if (i2 <= 0) {
                                }
                                if (valueOf2222 == null) {
                                }
                            }
                            htrVar = htr.g;
                            Locale locale22222 = htrVar.c;
                            o8qVar.getClass();
                            locale22222.getClass();
                            i2 = fk1Var.a;
                            Integer valueOf22222 = Integer.valueOf(i2);
                            if (i2 <= 0) {
                            }
                            if (valueOf22222 == null) {
                            }
                        }
                    }
                    str2 = "";
                    t91 t91Var = s91Var2.b;
                    String str14 = t91Var != null ? t91Var.a : null;
                    h21 h21Var = s91Var2.c;
                    if (h21Var != null) {
                        nm6Var = nm6Var2;
                        hs5Var = p;
                        str3 = null;
                        teVar = new te(h21Var.a, null, h21Var.b.a, h21Var.c);
                    } else {
                        nm6Var = nm6Var2;
                        hs5Var = p;
                        str3 = null;
                        teVar = null;
                    }
                    if (hs5Var == null) {
                        str4 = str2;
                        str5 = t;
                        str6 = str14;
                        str7 = pathForSize;
                        str8 = str13;
                        u51Var2 = u51Var;
                        str9 = str3;
                        arrayList = arrayList3;
                        return new ka1(u51Var2, str, str5, str7, str8, arrayList, str4, str6, teVar, str9, s91Var2.f);
                    }
                    k68 k68Var = (k68) this.b.getValue();
                    ia1Var.j = s91Var2;
                    ia1Var.k = u51Var;
                    ia1Var.l = str;
                    ia1Var.m = t;
                    ia1Var.n = pathForSize;
                    ia1Var.o = str13;
                    ia1Var.p = arrayList3;
                    ia1Var.q = str2;
                    ia1Var.r = str14;
                    ia1Var.s = teVar;
                    ia1Var.v = 1;
                    Object b = k68Var.b(hs5Var, ia1Var);
                    nm6 nm6Var3 = nm6Var;
                    if (b == nm6Var3) {
                        return nm6Var3;
                    }
                    str10 = str13;
                    obj = b;
                    str11 = str14;
                    arrayList2 = arrayList3;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    te teVar2 = ia1Var.s;
                    str11 = ia1Var.r;
                    str2 = ia1Var.q;
                    arrayList2 = ia1Var.p;
                    String str15 = ia1Var.o;
                    pathForSize = ia1Var.n;
                    t = ia1Var.m;
                    str = ia1Var.l;
                    u51Var = ia1Var.k;
                    s91 s91Var3 = ia1Var.j;
                    qgg.h0(obj);
                    teVar = teVar2;
                    s91Var2 = s91Var3;
                    str10 = str15;
                    str3 = null;
                }
                a58 a58Var = (a58) obj;
                str8 = str10;
                u51Var2 = u51Var;
                str9 = (a58Var != null || (str12 = a58Var.d) == null) ? str3 : (String) avf.Q(str12);
                arrayList = arrayList2;
                str7 = pathForSize;
                str4 = str2;
                str5 = t;
                str6 = str11;
                return new ka1(u51Var2, str, str5, str7, str8, arrayList, str4, str6, teVar, str9, s91Var2.f);
            }
        }
        ia1Var = new ia1(this, cg6Var);
        Object obj2 = ia1Var.t;
        nm6 nm6Var22 = nm6.a;
        i = ia1Var.v;
        if (i != 0) {
        }
        a58 a58Var2 = (a58) obj2;
        str8 = str10;
        u51Var2 = u51Var;
        str9 = (a58Var2 != null || (str12 = a58Var2.d) == null) ? str3 : (String) avf.Q(str12);
        arrayList = arrayList2;
        str7 = pathForSize;
        str4 = str2;
        str5 = t;
        str6 = str11;
        return new ka1(u51Var2, str, str5, str7, str8, arrayList, str4, str6, teVar, str9, s91Var2.f);
    }
}
