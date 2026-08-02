package defpackage;

import java.util.Random;

/* loaded from: classes.dex */
public class c3c extends RuntimeException {
    public static final long serialVersionUID = 1;

    public c3c(String str) {
        super(str);
        Random random = new Random();
        if (str == null || !j3c.n.get() || random.nextInt(100) <= 50) {
            return;
        }
        x6c.a(new ipc(str, 2), v6c.ErrorReport);
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message != null ? message : "";
    }
}
