package defpackage;

/* loaded from: classes.dex */
public final class c4b implements b4b {
    public final int a;
    public int b = -1;
    public int c = -1;

    public c4b(int i) {
        this.a = i;
    }

    @Override // defpackage.b4b
    public final boolean a(CharSequence charSequence, int i, int i2, jdt jdtVar) {
        int i3 = this.a;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.b = i;
        this.c = i2;
        return false;
    }

    @Override // defpackage.b4b
    public final Object getResult() {
        return this;
    }
}
