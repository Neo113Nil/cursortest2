package defpackage;

/* loaded from: classes3.dex */
public final class d02 extends Exception {
    public final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d02(String str, String str2) {
        super("(" + str + ") " + str2);
        str.getClass();
        this.a = str;
    }
}
