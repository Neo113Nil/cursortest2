package dd;

import android.text.TextUtils;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w implements h4.f, q3.o {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1886g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1887h;

    public /* synthetic */ w(String str, int i10) {
        this.f1886g = i10;
        this.f1887h = str;
    }

    @Override // q3.o
    public boolean a(CharSequence charSequence, int i10, int i11, q3.t tVar) {
        if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f1887h)) {
            return true;
        }
        tVar.f5795c = (tVar.f5795c & 3) | 4;
        return false;
    }

    @Override // h4.f
    public String d() {
        return this.f1887h;
    }

    public String toString() {
        switch (this.f1886g) {
            case 0:
                return "<" + this.f1887h + '>';
            default:
                return super.toString();
        }
    }

    public w(String str) {
        this.f1886g = 1;
        pc.j.e(str, "query");
        this.f1887h = str;
    }

    @Override // q3.o
    public Object getResult() {
        return this;
    }

    @Override // h4.f
    public void b(h4.e eVar) {
    }
}
