package defpackage;

import java.util.RandomAccess;
import kotlin.collections.a;

/* loaded from: classes5.dex */
public final class qwj extends a implements RandomAccess {
    public static final /* synthetic */ int d = 0;
    public final pn3[] b;
    public final int[] c;

    public qwj(pn3[] pn3VarArr, int[] iArr) {
        this.b = pn3VarArr;
        this.c = iArr;
    }

    @Override // defpackage.w5, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof pn3) {
            return super.contains((pn3) obj);
        }
        return false;
    }

    @Override // defpackage.w5
    public final int f() {
        return this.b.length;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.b[i];
    }

    @Override // kotlin.collections.a, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof pn3) {
            return super.indexOf((pn3) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.a, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof pn3) {
            return super.lastIndexOf((pn3) obj);
        }
        return -1;
    }
}
