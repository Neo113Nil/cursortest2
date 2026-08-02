package defpackage;

/* loaded from: classes.dex */
public final class a3c extends c3c {
    public static final long serialVersionUID = 1;
    public final int a;
    public final String b;

    public a3c(String str, int i, String str2) {
        super(str);
        this.a = i;
        this.b = str2;
    }

    @Override // defpackage.c3c, java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("{FacebookDialogException: errorCode: ");
        sb.append(this.a);
        sb.append(", message: ");
        sb.append(getMessage());
        sb.append(", url: ");
        return su4.o(sb, this.b, "}");
    }
}
