package defpackage;

import java.util.LinkedList;

/* loaded from: classes8.dex */
public final class rxn0 {
    public final LinkedList a;

    public rxn0(qxn0 qxn0Var) {
        LinkedList linkedList = new LinkedList();
        linkedList.offer(qxn0Var);
        this.a = linkedList;
    }

    public final qxn0 a() {
        return (qxn0) this.a.peekLast();
    }
}
