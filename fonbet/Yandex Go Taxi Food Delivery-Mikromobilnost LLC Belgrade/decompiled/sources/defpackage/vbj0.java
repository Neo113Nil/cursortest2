package defpackage;

import com.yandex.go.address.models.Address;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public final class vbj0 implements sre0 {
    public final dqe0 a;
    public xu0 b;
    public xu0 c;
    public nbj0 d;
    public String e;

    public vbj0(dqe0 dqe0Var) {
        this.a = dqe0Var;
    }

    public static xu0 d(Address address) {
        if (address == null) {
            return null;
        }
        Object extraData = address.getExtraData();
        mu70 mu70Var = extraData instanceof mu70 ? (mu70) extraData : null;
        if (mu70Var != null) {
            return new xu0(q5z.F(address), mu70Var.a, mu70Var.c, mu70Var.b, mu70Var.d);
        }
        String F = q5z.F(address);
        String J1 = address.J1();
        String str = J1 == null ? "" : J1;
        String e2 = address.e2();
        String str2 = e2 == null ? "" : e2;
        String H1 = address.H1();
        String str3 = H1 == null ? "" : H1;
        String e0 = address.e0();
        return new xu0(F, str, str2, str3, e0 == null ? "" : e0);
    }

    @Override // defpackage.sre0
    public final void a(List list) {
        xu0 d;
        String str;
        String str2;
        String str3;
        String str4;
        String e0;
        Address address = (Address) a.b0(list);
        if (this.c != null) {
            String F = q5z.F(address);
            if (address == null || (str = address.J1()) == null) {
                xu0 xu0Var = this.c;
                str = xu0Var != null ? xu0Var.b : null;
                if (str == null) {
                    str = "";
                }
            }
            if (address == null || (str2 = address.e2()) == null) {
                xu0 xu0Var2 = this.c;
                str2 = xu0Var2 != null ? xu0Var2.c : null;
                if (str2 == null) {
                    str2 = "";
                }
            }
            if (address == null || (str3 = address.H1()) == null) {
                xu0 xu0Var3 = this.c;
                str3 = xu0Var3 != null ? xu0Var3.d : null;
                if (str3 == null) {
                    str3 = "";
                }
            }
            if (address == null || (e0 = address.e0()) == null) {
                xu0 xu0Var4 = this.c;
                String str5 = xu0Var4 != null ? xu0Var4.e : null;
                str4 = str5 == null ? "" : str5;
            } else {
                str4 = e0;
            }
            d = new xu0(F, str, str2, str3, str4);
        } else {
            d = d(address);
        }
        this.c = d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0020, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x002a, code lost:
    
        if (r1 == null) goto L15;
     */
    @Override // defpackage.sre0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Address address) {
        String str;
        String str2;
        xu0 xu0Var = null;
        String J1 = address != null ? address.J1() : null;
        if (J1 == null || evu0.J(J1)) {
            xu0 xu0Var2 = this.b;
            str = xu0Var2 != null ? xu0Var2.b : null;
        } else {
            str = address != null ? address.J1() : null;
        }
        xu0 xu0Var3 = this.b;
        if (xu0Var3 != null) {
            xu0Var = xu0.a(xu0Var3, q5z.F(address), str2, null, null, null, 28);
        } else if (address != null) {
            Object extraData = address.getExtraData();
            mu70 mu70Var = extraData instanceof mu70 ? (mu70) extraData : null;
            if (mu70Var != null) {
                xu0Var = new xu0(q5z.F(address), mu70Var.a, mu70Var.c, mu70Var.b, mu70Var.d);
            } else {
                String F = q5z.F(address);
                String J12 = address.J1();
                String str3 = J12 == null ? "" : J12;
                String e2 = address.e2();
                String str4 = e2 == null ? "" : e2;
                String H1 = address.H1();
                String str5 = H1 == null ? "" : H1;
                String e0 = address.e0();
                xu0Var = new xu0(F, str3, str4, str5, e0 == null ? "" : e0);
            }
        }
        this.b = xu0Var;
    }

    public final zbj0 c() {
        xu0 xu0Var = this.b;
        if (xu0Var == null) {
            Address e = this.a.e();
            xu0Var = e != null ? d(e) : null;
            this.b = xu0Var;
        }
        if (xu0Var == null) {
            ny61.g("Required value was null.");
            return null;
        }
        xu0 xu0Var2 = this.c;
        if (xu0Var2 == null) {
            Address a = this.a.a();
            xu0Var2 = a != null ? d(a) : null;
            this.c = xu0Var2;
        }
        String str = this.e;
        if (str == null) {
            str = this.a.a.d();
            if (str == null) {
                str = "";
            }
            if (evu0.J(str)) {
                Address a2 = this.a.a();
                String b1 = a2 != null ? a2.b1() : null;
                str = b1 == null ? "" : b1;
            }
        }
        return new zbj0(xu0Var, xu0Var2, str, this.d);
    }
}
