package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class tob implements czc {
    public final ArrayList a;

    public /* synthetic */ tob(ArrayList arrayList) {
        this.a = arrayList;
    }

    public oyc a(String str, Function1 function1) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            oyc oycVar = (oyc) obj;
            if (Intrinsics.d(oycVar.c(), str) && Intrinsics.d(function1.invoke(oycVar), iyc.g)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (oyc) arrayList.get(0);
        }
        throw new khb("Function " + arrayList.get(0) + " declared multiple times.", (Throwable) null);
    }

    @Override // defpackage.czc
    public oyc r(String str, ArrayList arrayList) {
        oyc a = a(str, new vv(arrayList, 21));
        if (a != null) {
            return a;
        }
        oyc a2 = a(str, new vv(arrayList, 22));
        if (a2 != null) {
            return a2;
        }
        throw new a6i(str, arrayList);
    }

    @Override // defpackage.czc
    public oyc s(String str, ArrayList arrayList) {
        oyc a = a(str, new vv(arrayList, 19));
        if (a != null) {
            return a;
        }
        oyc a2 = a(str, new vv(arrayList, 20));
        if (a2 != null) {
            return a2;
        }
        throw new a6i(str, arrayList);
    }
}
