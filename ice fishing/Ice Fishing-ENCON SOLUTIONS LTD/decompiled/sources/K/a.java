package K;

import P0.B;
import android.view.KeyEvent;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1016a;

    /* renamed from: b, reason: collision with root package name */
    public int f1017b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1018c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1019d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1020e;

    public /* synthetic */ a() {
        this.f1016a = 2;
    }

    public a a() {
        if (((o0.h) this.f1019d) != null) {
            return new a(this, (m0.d[]) this.f1020e, this.f1018c, this.f1017b);
        }
        throw new IllegalArgumentException("execute parameter required");
    }

    public String toString() {
        switch (this.f1016a) {
            case 0:
                StringBuilder sb = new StringBuilder(128);
                sb.append("BackStackEntry{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                if (this.f1017b >= 0) {
                    sb.append(" #");
                    sb.append(this.f1017b);
                }
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public a(a aVar, m0.d[] dVarArr, boolean z2, int i2) {
        this.f1016a = 3;
        this.f1020e = aVar;
        this.f1019d = dVarArr;
        boolean z3 = false;
        if (dVarArr != null && z2) {
            z3 = true;
        }
        this.f1018c = z3;
        this.f1017b = i2;
    }

    public a(I0.b bVar) {
        this.f1016a = 0;
        bVar.getClass();
        this.f1019d = new ArrayList();
        this.f1017b = -1;
        this.f1020e = bVar;
    }

    public a(I0.b bVar, KeyEvent keyEvent) {
        this.f1016a = 1;
        this.f1020e = bVar;
        this.f1017b = ((B[]) bVar.f721b).length;
        this.f1018c = false;
        this.f1019d = keyEvent;
    }
}
