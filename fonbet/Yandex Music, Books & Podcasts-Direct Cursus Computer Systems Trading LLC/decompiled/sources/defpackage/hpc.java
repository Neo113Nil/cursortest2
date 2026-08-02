package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class hpc implements b4b {
    public static final hpc c;
    public static final hpc d;
    public final /* synthetic */ int a;
    public String b;

    static {
        int i = 0;
        c = new hpc("NONE", i);
        d = new hpc("FULL", i);
    }

    public /* synthetic */ hpc(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.b4b
    public boolean a(CharSequence charSequence, int i, int i2, jdt jdtVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.b)) {
            return true;
        }
        jdtVar.c = (jdtVar.c & 3) | 4;
        return false;
    }

    public ipc b() {
        if (this.b != null) {
            return new ipc(this);
        }
        xq0.x("Product type must be set");
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.b4b
    public Object getResult() {
        return this;
    }
}
