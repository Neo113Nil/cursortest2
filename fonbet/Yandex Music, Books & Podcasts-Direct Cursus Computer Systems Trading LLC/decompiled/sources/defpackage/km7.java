package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class km7 implements egc {
    public final List a;
    public final List b;

    public km7(List list) {
        list.getClass();
        this.a = list;
        if (list.isEmpty()) {
            ssg.a(7, null, "Error. elements list is empty", null);
        }
        this.b = list;
    }

    @Override // defpackage.egc
    public final egc a() {
        List list = this.a;
        if (list instanceof kdo) {
            return this;
        }
        list.getClass();
        return new km7(new kdo(list));
    }

    @Override // defpackage.egc
    public final boolean b() {
        return this.a instanceof kdo;
    }

    @Override // defpackage.egc
    public final mwk e(int i) {
        return (mwk) this.a.get(i);
    }

    @Override // defpackage.egc
    public final List f() {
        return this.b;
    }

    @Override // defpackage.egc
    public final egc g() {
        List list = this.a;
        return list instanceof kdo ? new km7(((kdo) list).b) : this;
    }

    @Override // defpackage.egc
    public final List getElements() {
        return this.a;
    }

    @Override // defpackage.egc
    public final int c(int i) {
        return i;
    }

    @Override // defpackage.egc
    public final int d(int i) {
        return i;
    }
}
