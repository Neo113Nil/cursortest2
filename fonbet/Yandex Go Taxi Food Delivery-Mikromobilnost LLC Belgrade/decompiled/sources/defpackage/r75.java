package defpackage;

import com.yandex.go.places.api.navigation.OpenNavigatorActionSubtype;

/* loaded from: classes13.dex */
public final class r75 extends kl80 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r75(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((s75) obj).r(new qu(9));
                break;
            case 1:
                ((rwo0) obj).r(new qu(9));
                break;
            case 2:
                ((khn) obj).r(new qu(9));
                break;
            case 3:
                yn5 yn5Var = (yn5) obj;
                yn5Var.r(new qu(9));
                ((kl80) yn5Var.F).a();
                break;
            case 4:
                ((bm50) obj).invoke();
                break;
            case 5:
                pw1 pw1Var = (pw1) obj;
                pw1Var.r(new qu(9));
                ((kl80) pw1Var.F).a();
                break;
            case 6:
                ((jcc0) obj).r(new qu(9));
                break;
            default:
                ((udc0) obj).r(new qu(9));
                break;
        }
    }

    @Override // defpackage.kl80
    public void n1(OpenNavigatorActionSubtype openNavigatorActionSubtype, String str) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((s75) obj).r(new b75(openNavigatorActionSubtype, str, 1));
                break;
            case 1:
                ((rwo0) obj).r(new b75(openNavigatorActionSubtype, str, 2));
                break;
            case 2:
                ((khn) obj).r(new b75(openNavigatorActionSubtype, str, 3));
                break;
            case 3:
                yn5 yn5Var = (yn5) obj;
                yn5Var.r(new qu(9));
                ((kl80) yn5Var.F).n1(openNavigatorActionSubtype, str);
                break;
            case 5:
                pw1 pw1Var = (pw1) obj;
                pw1Var.r(new qu(9));
                ((kl80) pw1Var.F).n1(openNavigatorActionSubtype, str);
                break;
            case 6:
                ((jcc0) obj).r(new b75(openNavigatorActionSubtype, str, 5));
                break;
            case 7:
                ((udc0) obj).r(new b75(openNavigatorActionSubtype, str, 6));
                break;
        }
    }

    @Override // defpackage.kl80
    public void o1(String str) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((s75) obj).r(new h0(str, 12));
                break;
            case 1:
                ((rwo0) obj).r(new h0(str, 13));
                break;
            case 2:
                ((khn) obj).r(new my30(str, 5));
                break;
            case 3:
                yn5 yn5Var = (yn5) obj;
                yn5Var.r(new qu(9));
                ((kl80) yn5Var.F).o1(str);
                break;
            case 5:
                pw1 pw1Var = (pw1) obj;
                pw1Var.r(new qu(9));
                ((kl80) pw1Var.F).o1(str);
                break;
            case 6:
                ((jcc0) obj).r(new dcc0(str, 1));
                break;
            case 7:
                ((udc0) obj).r(new dcc0(str, 2));
                break;
        }
    }
}
