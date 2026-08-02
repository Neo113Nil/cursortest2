package defpackage;

import java.util.ArrayList;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes3.dex */
public final class xfc extends xr2 {
    public final /* synthetic */ int e = 1;
    public final uif f;

    public xfc(r49 r49Var) {
        super(bnk.b);
        this.f = r49Var;
    }

    @Override // defpackage.xr2
    public void a(String str, Integer num) {
        switch (this.e) {
            case 1:
                eas w = hyf.w(i(), str);
                int intValue = num.intValue();
                int i = w.b;
                int i2 = intValue - i;
                int i3 = 0;
                if (i2 < 0) {
                    i2 = 0;
                }
                eas easVar = new eas(i2, i, w.c);
                String h = h();
                int l = l(easVar, str);
                String h2 = h();
                String a = bnk.a(h2);
                if (a.equals(this.a.a)) {
                    a = null;
                }
                if (a != null) {
                    n(new vr2(a, bnk.a, this.a.c), false);
                    m(0, null, h2);
                    eas w2 = hyf.w(h, h2);
                    int i4 = w2.a + w2.b;
                    int i5 = 0;
                    while (i3 < ((ArrayList) f()).size() && i5 < i4) {
                        int i6 = i3 + 1;
                        if (((ArrayList) f()).get(i3) instanceof sr2) {
                            i5++;
                        }
                        i3 = i6;
                    }
                    while (i3 < ((ArrayList) f()).size() && !(((ur2) ((ArrayList) f()).get(i3)) instanceof sr2)) {
                        i3++;
                    }
                    this.d = i3;
                    break;
                } else {
                    int g = g();
                    if (i2 < g) {
                        while (l < ((ArrayList) f()).size() && !(((ur2) ((ArrayList) f()).get(l)) instanceof sr2)) {
                            l++;
                        }
                        g = Math.min(l, i().length());
                    }
                    this.d = g;
                    break;
                }
            default:
                super.a(str, num);
                break;
        }
    }

    @Override // defpackage.xr2
    public final void j(PatternSyntaxException patternSyntaxException) {
        switch (this.e) {
            case 0:
                ((r49) this.f).invoke(patternSyntaxException);
                break;
            default:
                ((r49) this.f).invoke(patternSyntaxException);
                break;
        }
    }

    @Override // defpackage.xr2
    public void k(String str) {
        switch (this.e) {
            case 1:
                String a = bnk.a(str);
                if (a.equals(this.a.a)) {
                    a = null;
                }
                if (a != null) {
                    n(new vr2(a, bnk.a, this.a.c), false);
                }
                super.k(str);
                break;
            default:
                super.k(str);
                break;
        }
    }

    public xfc(vr2 vr2Var, r49 r49Var) {
        super(vr2Var);
        this.f = r49Var;
    }
}
