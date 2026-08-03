package v1;

import java.io.Serializable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7101a;

    /* renamed from: b, reason: collision with root package name */
    public final m f7102b;

    /* renamed from: c, reason: collision with root package name */
    public final m f7103c;

    /* renamed from: d, reason: collision with root package name */
    public final m f7104d;

    /* renamed from: e, reason: collision with root package name */
    public final m f7105e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f7106f;

    public n(String str) {
        this.f7101a = 1;
        this.f7106f = str;
        this.f7102b = new m(1, null);
        this.f7103c = new m(0, null);
        this.f7104d = new m(1, null);
        this.f7105e = new m(0, null);
    }

    public final m a() {
        switch (this.f7101a) {
        }
        return this.f7105e;
    }

    public final m b() {
        switch (this.f7101a) {
        }
        return this.f7102b;
    }

    public final m c() {
        switch (this.f7101a) {
        }
        return this.f7104d;
    }

    public final m d() {
        switch (this.f7101a) {
        }
        return this.f7103c;
    }

    public final String toString() {
        switch (this.f7101a) {
            case 0:
                return bc.l.a0(57, (n[]) this.f7106f);
            default:
                String str = (String) this.f7106f;
                if (str == null) {
                    return super.toString();
                }
                return "RectRulers(" + str + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(n[] nVarArr) {
        this.f7101a = 0;
        this.f7106f = nVarArr;
        int length = nVarArr.length;
        m[] mVarArr = new m[length];
        for (int i10 = 0; i10 < length; i10++) {
            mVarArr[i10] = ((n[]) this.f7106f)[i10].b();
        }
        this.f7102b = new m(1, new u0(mVarArr, 0));
        int length2 = ((n[]) this.f7106f).length;
        m[] mVarArr2 = new m[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            mVarArr2[i11] = ((n[]) this.f7106f)[i11].d();
        }
        this.f7103c = new m(0, new l(mVarArr2, 0));
        int length3 = ((n[]) this.f7106f).length;
        m[] mVarArr3 = new m[length3];
        for (int i12 = 0; i12 < length3; i12++) {
            mVarArr3[i12] = ((n[]) this.f7106f)[i12].c();
        }
        this.f7104d = new m(1, new u0(mVarArr3, 1));
        int length4 = ((n[]) this.f7106f).length;
        m[] mVarArr4 = new m[length4];
        for (int i13 = 0; i13 < length4; i13++) {
            mVarArr4[i13] = ((n[]) this.f7106f)[i13].a();
        }
        this.f7105e = new m(0, new l(mVarArr4, 1));
    }
}
