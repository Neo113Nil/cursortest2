package defpackage;

/* loaded from: classes.dex */
public final class v7x0 extends e530 {
    public boolean a;

    public v7x0() {
        setAggregateChildKindSet$ui(0);
    }

    @Override // defpackage.e530
    public final void onAttach() {
        this.a = true;
    }

    @Override // defpackage.e530
    public final void onDetach() {
        this.a = false;
    }

    public final String toString() {
        return "<tail>";
    }
}
