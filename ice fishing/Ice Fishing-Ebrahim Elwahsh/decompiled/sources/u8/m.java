package u8;

import java.util.RandomAccess;
import r7.AbstractC4973d;

/* loaded from: classes2.dex */
public final class m extends AbstractC4973d implements RandomAccess {

    /* renamed from: n, reason: collision with root package name */
    public final h[] f41294n;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f41295u;

    public m(h[] hVarArr, int[] iArr) {
        this.f41294n = hVarArr;
        this.f41295u = iArr;
    }

    @Override // r7.AbstractC4970a
    public final int a() {
        return this.f41294n.length;
    }

    @Override // r7.AbstractC4970a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return super.contains((h) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f41294n[i];
    }

    @Override // r7.AbstractC4973d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return super.indexOf((h) obj);
        }
        return -1;
    }

    @Override // r7.AbstractC4973d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return super.lastIndexOf((h) obj);
        }
        return -1;
    }
}
