package defpackage;

/* loaded from: classes3.dex */
public abstract class jbd extends obd {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jbd(int i) {
        super(0);
        this.b = i;
    }

    @Override // defpackage.oyc
    public final String c() {
        switch (this.b) {
            case 0:
                return "getStoredArrayValue";
            default:
                return "getStoredDictValue";
        }
    }

    @Override // defpackage.oyc
    public final mhb d() {
        switch (this.b) {
            case 0:
                return mhb.ARRAY;
            default:
                return mhb.DICT;
        }
    }
}
