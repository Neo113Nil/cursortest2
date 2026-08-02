package defpackage;

/* loaded from: classes7.dex */
public final class s491 implements id91 {
    public final /* synthetic */ int a;
    public final me0 b;

    public /* synthetic */ s491(me0 me0Var, int i) {
        this.a = i;
        this.b = me0Var;
    }

    @Override // defpackage.id91
    public final Object zza() {
        int i = this.a;
        me0 me0Var = this.b;
        switch (i) {
            case 0:
                return me0Var.a;
            default:
                tvb1 b = tvb1.b(me0Var.a);
                if (b != null) {
                    return b;
                }
                ny61.t("Cannot return null from a non-@Nullable @Provides method");
                return null;
        }
    }
}
