package defpackage;

/* loaded from: classes3.dex */
public final class ox8 implements uct {
    public final /* synthetic */ int a;

    @Override // defpackage.uct
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                return new c85(0);
            case 1:
                return new lpt("");
            case 2:
                return Boolean.FALSE;
            case 3:
                return -16777216;
            case 4:
                return Double.valueOf(0.0d);
            case 5:
                return 0L;
            default:
                return "";
        }
    }

    @Override // defpackage.uct
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                return obj instanceof c85;
            case 1:
                return obj instanceof lpt;
            case 2:
                return obj instanceof Boolean;
            case 3:
                return obj instanceof Integer;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Long;
            default:
                return obj instanceof String;
        }
    }
}
