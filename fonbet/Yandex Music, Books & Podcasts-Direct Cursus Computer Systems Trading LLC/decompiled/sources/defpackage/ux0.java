package defpackage;

/* loaded from: classes5.dex */
public final class ux0 extends f9g {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux0(mhp mhpVar) {
        super(mhpVar);
        this.b = 1;
        mhpVar.getClass();
    }

    @Override // defpackage.mhp
    public final String i() {
        switch (this.b) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ux0(mhp mhpVar, boolean z) {
        super(mhpVar);
        this.b = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ux0(mhp mhpVar, int i) {
        super(mhpVar);
        this.b = i;
    }
}
