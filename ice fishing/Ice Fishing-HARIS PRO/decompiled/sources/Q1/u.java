package Q1;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class u implements V.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f972a;

    /* renamed from: b, reason: collision with root package name */
    public final String f973b;

    public /* synthetic */ u(String str, int i) {
        this.f972a = i;
        this.f973b = str;
    }

    @Override // V.p
    public boolean a(CharSequence charSequence, int i, int i2, V.w wVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f973b)) {
            return true;
        }
        wVar.f1251c = (wVar.f1251c & 3) | 4;
        return false;
    }

    @Override // V.p
    public Object b() {
        return this;
    }

    public String toString() {
        switch (this.f972a) {
            case 0:
                return "<" + this.f973b + '>';
            default:
                return super.toString();
        }
    }
}
