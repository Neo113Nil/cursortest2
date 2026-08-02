package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class iye {
    public final ueo a;
    public final mat b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public a42 e;
    public final hye f;
    public final hye g;
    public final Object h;

    /* JADX WARN: Type inference failed for: r1v4, types: [hye] */
    /* JADX WARN: Type inference failed for: r1v5, types: [hye] */
    public iye(ueo ueoVar, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.a = ueoVar;
        mat matVar = new mat(ueoVar, hashMap, hashMap2, strArr, ueoVar.m, new aub(1, this, iye.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 17));
        this.b = matVar;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        final int i = 0;
        this.f = new Function0(this) { // from class: hye
            public final /* synthetic */ iye b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        a42 a42Var = this.b.e;
                        if (a42Var != null) {
                            a42Var.e();
                        }
                        return Unit.a;
                    case 1:
                        a42 a42Var2 = this.b.e;
                        if (a42Var2 != null) {
                            a42Var2.c();
                        }
                        return Unit.a;
                    default:
                        ueo ueoVar2 = this.b.a;
                        return Boolean.valueOf(!ueoVar2.o() || ueoVar2.r());
                }
            }
        };
        final int i2 = 1;
        this.g = new Function0(this) { // from class: hye
            public final /* synthetic */ iye b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        a42 a42Var = this.b.e;
                        if (a42Var != null) {
                            a42Var.e();
                        }
                        return Unit.a;
                    case 1:
                        a42 a42Var2 = this.b.e;
                        if (a42Var2 != null) {
                            a42Var2.c();
                        }
                        return Unit.a;
                    default:
                        ueo ueoVar2 = this.b.a;
                        return Boolean.valueOf(!ueoVar2.o() || ueoVar2.r());
                }
            }
        };
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.h = new Object();
        final int i3 = 2;
        matVar.k = new Function0(this) { // from class: hye
            public final /* synthetic */ iye b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        a42 a42Var = this.b.e;
                        if (a42Var != null) {
                            a42Var.e();
                        }
                        return Unit.a;
                    case 1:
                        a42 a42Var2 = this.b.e;
                        if (a42Var2 != null) {
                            a42Var2.c();
                        }
                        return Unit.a;
                    default:
                        ueo ueoVar2 = this.b.a;
                        return Boolean.valueOf(!ueoVar2.o() || ueoVar2.r());
                }
            }
        };
    }

    public final pjc a(String[] strArr) {
        Pair pair;
        mat matVar = this.b;
        matVar.getClass();
        mnp mnpVar = new mnp();
        int i = 0;
        for (String str : strArr) {
            HashMap hashMap = matVar.c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) hashMap.get(lowerCase);
            if (set != null) {
                mnpVar.addAll(set);
            } else {
                mnpVar.add(str);
            }
        }
        String[] strArr2 = (String[]) uop.a(mnpVar).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        while (true) {
            if (i >= length) {
                pair = new Pair(strArr2, iArr);
                break;
            }
            String str2 = strArr2[i];
            LinkedHashMap linkedHashMap = matVar.f;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) linkedHashMap.get(lowerCase2);
            if (num == null) {
                xq0.x("There is no table with name ".concat(str2));
                pair = null;
                break;
            }
            iArr[i] = num.intValue();
            i++;
        }
        String[] strArr3 = (String[]) pair.a;
        int[] iArr2 = (int[]) pair.b;
        strArr3.getClass();
        iArr2.getClass();
        return new eno(new lco(matVar, iArr2, strArr3, null, 24));
    }
}
