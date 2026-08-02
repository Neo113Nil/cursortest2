package defpackage;

/* loaded from: classes.dex */
public class my1 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my1(int i) {
        super("master token checksum validation failed");
        switch (i) {
            case 18:
                super("Sso experiment disabled");
                break;
            default:
                break;
        }
    }

    public my1(String str) {
        super(str != null ? str.toString() : null);
    }
}
