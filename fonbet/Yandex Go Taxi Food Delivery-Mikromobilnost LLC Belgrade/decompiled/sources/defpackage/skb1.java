package defpackage;

/* loaded from: classes15.dex */
public abstract class skb1 {
    public static au2 a;

    public static final Object a(yab yabVar, tls tlsVar) {
        try {
            Object invoke = yabVar.moveToFirst() ? tlsVar.invoke(yabVar) : null;
            yabVar.close();
            return invoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ooc.g(yabVar, th);
                throw th2;
            }
        }
    }
}
