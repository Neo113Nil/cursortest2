package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final class wl40 extends f55 {
    public static final wl40 j;
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;

    static {
        EmptyList emptyList = EmptyList.a;
        j = new wl40(emptyList, emptyList, emptyList, emptyList, emptyList, emptyList, emptyList, emptyList, emptyList);
    }

    public wl40(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        this.f = list6;
        this.g = list7;
        this.h = list8;
        this.i = list9;
    }

    @Override // defpackage.f55
    public final List a() {
        return this.g;
    }

    @Override // defpackage.f55
    public final List b() {
        return this.d;
    }

    @Override // defpackage.f55
    public final List c() {
        return this.c;
    }

    @Override // defpackage.f55
    public final List d() {
        return this.b;
    }

    @Override // defpackage.f55
    public final List e() {
        return this.e;
    }

    @Override // defpackage.f55
    public final List f() {
        return this.i;
    }

    @Override // defpackage.f55
    public final List g() {
        return this.h;
    }

    @Override // defpackage.f55
    public final List h() {
        return this.f;
    }

    @Override // defpackage.f55
    public final List i() {
        return this.a;
    }

    public final ArrayList k(h1p... h1pVarArr) {
        List list = this.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ren renVar = (ren) obj;
            int length = h1pVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (jl40.l(h1pVarArr[i].getValue(), renVar.m().getValue())) {
                    arrayList.add(obj);
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }
}
