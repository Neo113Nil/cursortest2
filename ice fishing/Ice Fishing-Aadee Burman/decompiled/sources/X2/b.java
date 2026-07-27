package X2;

import q2.f1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f3771a;

    /* renamed from: b, reason: collision with root package name */
    public int f3772b;

    /* renamed from: c, reason: collision with root package name */
    public int f3773c;

    public b() {
        this.f3771a = 0;
        this.f3772b = 0;
        this.f3773c = 0;
    }

    public static b a(f1 f1Var) {
        return f1Var.f40142w ? new b(3, 0, 0) : f1Var.f40131B ? new b(2, 0, 0) : f1Var.f40130A ? new b(0, 0, 0) : new b(1, f1Var.f40144y, f1Var.f40141v);
    }

    public boolean b() {
        return this.f3771a == 3;
    }

    public b(int i, int i6, int i9) {
        this.f3771a = i;
        this.f3773c = i6;
        this.f3772b = i9;
    }

    public /* synthetic */ b(int i, int i6, int i9, boolean z3) {
        this.f3771a = i;
        this.f3772b = i6;
        this.f3773c = i9;
    }
}
