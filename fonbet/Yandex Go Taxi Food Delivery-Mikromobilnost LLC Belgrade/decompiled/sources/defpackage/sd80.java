package defpackage;

import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class sd80 extends k8 implements RandomAccess {
    public final int a;

    public sd80(int i) {
        this.a = i;
    }

    @Override // defpackage.z6, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Integer) {
            return super.contains(Integer.valueOf(((Number) obj).intValue()));
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Integer.valueOf(i);
    }

    @Override // defpackage.z6
    public final int getSize() {
        return this.a;
    }

    @Override // defpackage.k8, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Integer) {
            return super.indexOf(Integer.valueOf(((Number) obj).intValue()));
        }
        return -1;
    }

    @Override // defpackage.k8, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            return super.lastIndexOf(Integer.valueOf(((Number) obj).intValue()));
        }
        return -1;
    }
}
