package defpackage;

/* loaded from: classes9.dex */
public final class v6e extends rm60 {
    public final String c;

    public v6e(String str) {
        super(Integer.valueOf(str.length()), "the predefined string ".concat(str));
        this.c = str;
    }

    @Override // defpackage.rm60
    public final sm60 a(Object obj, CharSequence charSequence, int i, int i2) {
        String obj2 = charSequence.subSequence(i, i2).toString();
        String str = this.c;
        if (jl40.l(obj2, str)) {
            return null;
        }
        return new mf1((byte) 0, 15, str);
    }
}
