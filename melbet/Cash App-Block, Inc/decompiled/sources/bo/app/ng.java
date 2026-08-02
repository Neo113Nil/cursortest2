package bo.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/* loaded from: classes3.dex */
public final class ng {
    public static final Comparator b = new ng$$ExternalSyntheticLambda0(0);
    public final PriorityQueue a;

    public ng(ArrayList arrayList) {
        arrayList.getClass();
        PriorityQueue priorityQueue = new PriorityQueue(12, b);
        this.a = priorityQueue;
        priorityQueue.addAll(arrayList);
    }

    public static final int a(y9 y9Var, y9 y9Var2) {
        y9Var.getClass();
        y9Var2.getClass();
        rg rgVar = (rg) y9Var;
        int i = rgVar.b.c;
        rg rgVar2 = (rg) y9Var2;
        int i2 = rgVar2.b.c;
        if (i > i2) {
            return -1;
        }
        if (i < i2) {
            return 1;
        }
        return rgVar.a.compareTo(rgVar2.a);
    }
}
