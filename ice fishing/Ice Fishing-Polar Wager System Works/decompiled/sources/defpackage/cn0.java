package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class cn0 implements defpackage.g00 {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ android.os.Bundle xiZrDbcSW0;

    public /* synthetic */ cn0(android.os.Bundle bundle, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = bundle;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        boolean containsKey;
        int i = this.adDC3e2L;
        android.os.Bundle bundle = this.xiZrDbcSW0;
        java.lang.String str = (java.lang.String) obj;
        switch (i) {
            case 0:
                str.getClass();
                containsKey = bundle.containsKey(str);
                break;
            default:
                str.getClass();
                containsKey = bundle.containsKey(str);
                break;
        }
        return java.lang.Boolean.valueOf(!containsKey);
    }
}
