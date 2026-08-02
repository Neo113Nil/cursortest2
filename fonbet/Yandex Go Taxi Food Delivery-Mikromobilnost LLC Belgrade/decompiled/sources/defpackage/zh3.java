package defpackage;

/* loaded from: classes10.dex */
public abstract class zh3 implements hwx {
    public String a;
    public String b;
    public boolean c;

    public abstract void a(boolean z);

    @Override // defpackage.hwx
    public final void k(owx owxVar) {
        String str = this.a;
        if (str == null) {
            str = "";
        }
        String str2 = owxVar.g;
        boolean z = owxVar.a;
        String str3 = owxVar.f;
        if (str2 == null) {
            str2 = "";
        }
        if (str.equals(str2)) {
            String str4 = this.b;
            if (str4 == null) {
                str4 = "";
            }
            if (str4.equals(str3 != null ? str3 : "") && z == this.c) {
                return;
            }
        }
        this.a = owxVar.g;
        this.b = str3;
        this.c = z;
        a(z);
    }
}
