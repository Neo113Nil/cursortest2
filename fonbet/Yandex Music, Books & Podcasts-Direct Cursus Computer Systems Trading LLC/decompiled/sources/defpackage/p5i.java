package defpackage;

/* loaded from: classes3.dex */
public final class p5i {
    public final fci a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ ime e;

    public p5i(ime imeVar, fci fciVar, int i, int i2, int i3) {
        this.e = imeVar;
        this.a = fciVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final int a() {
        fci fciVar = this.a;
        fci fciVar2 = fci.BYTE;
        int i = this.d;
        if (fciVar != fciVar2) {
            return i;
        }
        q5i q5iVar = (q5i) this.e.d;
        eya eyaVar = (eya) q5iVar.d;
        String str = (String) q5iVar.c;
        int i2 = this.b;
        return str.substring(i2, i + i2).getBytes(eyaVar.a[this.c].charset()).length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        fci fciVar = this.a;
        sb.append(fciVar);
        sb.append('(');
        q5i q5iVar = (q5i) this.e.d;
        if (fciVar == fci.ECI) {
            eya eyaVar = (eya) q5iVar.d;
            sb.append(eyaVar.a[this.c].charset().displayName());
        } else {
            String str = (String) q5iVar.c;
            int i = this.d;
            int i2 = this.b;
            String substring = str.substring(i2, i + i2);
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = 0; i3 < substring.length(); i3++) {
                if (substring.charAt(i3) < ' ' || substring.charAt(i3) > '~') {
                    sb2.append('.');
                } else {
                    sb2.append(substring.charAt(i3));
                }
            }
            sb.append(sb2.toString());
        }
        sb.append(')');
        return sb.toString();
    }
}
