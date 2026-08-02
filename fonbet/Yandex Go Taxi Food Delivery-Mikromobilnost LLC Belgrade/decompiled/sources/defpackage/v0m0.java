package defpackage;

/* loaded from: classes5.dex */
public final class v0m0 extends uw4 {
    public final /* synthetic */ int b;
    public String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0m0(ud0 ud0Var, int i) {
        super(ud0Var);
        this.b = i;
        switch (i) {
            case 1:
                super(ud0Var);
                this.c = "share_current_location";
                break;
            case 2:
                super(ud0Var);
                this.c = "suggested_favorites";
                break;
            default:
                break;
        }
    }

    @Override // defpackage.ze0
    public final boolean a() {
        switch (this.b) {
        }
        return true;
    }

    @Override // defpackage.ze0
    public final String b() {
        switch (this.b) {
        }
        return this.c;
    }

    @Override // defpackage.ze0
    public final void c(String str) {
        switch (this.b) {
            case 0:
                this.c = str;
                break;
            case 1:
                this.c = str;
                break;
            default:
                this.c = str;
                break;
        }
    }
}
