package defpackage;

/* loaded from: classes10.dex */
public final class q6w implements m43 {
    @Override // defpackage.m43
    public final int a(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // defpackage.m43
    public final int b() {
        return 4;
    }

    @Override // defpackage.m43
    public final String getTag() {
        return "IntegerArrayPool";
    }

    @Override // defpackage.m43
    public final Object newArray(int i) {
        return new int[i];
    }
}
