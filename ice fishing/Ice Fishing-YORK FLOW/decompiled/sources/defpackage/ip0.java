package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class ip0 implements defpackage.y10 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ android.os.Bundle oh71FJcDz6S2;

    public /* synthetic */ ip0(android.os.Bundle bundle, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = bundle;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        boolean containsKey;
        int i = this.WDYagTQQm9ns;
        android.os.Bundle bundle = this.oh71FJcDz6S2;
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
