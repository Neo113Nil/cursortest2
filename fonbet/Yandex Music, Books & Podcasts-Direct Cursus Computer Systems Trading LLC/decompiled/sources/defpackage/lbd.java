package defpackage;

/* loaded from: classes3.dex */
public abstract class lbd extends obd {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lbd(int i) {
        super(1);
        this.b = i;
    }

    @Override // defpackage.oyc
    public final String c() {
        switch (this.b) {
            case 0:
                return "getStoredBooleanValue";
            case 1:
                return "getStoredColorValue";
            case 2:
                return "getStoredIntegerValue";
            case 3:
                return "getStoredNumberValue";
            case 4:
                return "getStoredStringValue";
            default:
                return "getStoredUrlValue";
        }
    }

    @Override // defpackage.oyc
    public final mhb d() {
        switch (this.b) {
            case 0:
                return mhb.BOOLEAN;
            case 1:
                return mhb.COLOR;
            case 2:
                return mhb.INTEGER;
            case 3:
                return mhb.NUMBER;
            case 4:
                return mhb.STRING;
            default:
                return mhb.URL;
        }
    }

    @Override // defpackage.obd
    public Object j(Object obj, ssb ssbVar) {
        switch (this.b) {
            case 3:
                Number number = null;
                if (!(obj instanceof Long) && (obj instanceof Number)) {
                    number = (Number) obj;
                }
                return number == null ? (Number) ssbVar.invoke() : number;
            default:
                return super.j(obj, ssbVar);
        }
    }
}
