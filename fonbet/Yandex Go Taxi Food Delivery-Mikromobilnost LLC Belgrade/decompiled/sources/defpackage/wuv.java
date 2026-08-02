package defpackage;

import com.yandex.xplat.common.NetworkMethod;

/* loaded from: classes2.dex */
public final class wuv extends l55 {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;
    public final String d;

    public wuv(String str, String str2) {
        this.a = 1;
        this.b = "";
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.l55, defpackage.hz50
    public final wj00 a() {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        String str3 = this.b;
        switch (i) {
            case 0:
                wj00 wj00Var = new wj00(0);
                if (str3 != null) {
                    wj00Var.k("verification_intent_id", str3);
                }
                if (str2 != null) {
                    wj00Var.k("binding_id", str2);
                }
                if (str != null) {
                    wj00Var.k("currency", str);
                }
                return wj00Var;
            default:
                wj00 wj00Var2 = new wj00(0);
                wj00Var2.k("verification_intent_id", str3);
                if (str2 != null) {
                    wj00Var2.k("currency", str2);
                }
                if (str != null) {
                    wj00Var2.k("payment_to", str);
                }
                return wj00Var2;
        }
    }

    @Override // defpackage.hz50
    public final String c() {
        switch (this.a) {
            case 0:
                return "v2/init_additional_verification";
            default:
                return "v2/init_verification";
        }
    }

    @Override // defpackage.hz50
    public final y5j0 encoding() {
        switch (this.a) {
        }
        return new aex();
    }

    @Override // defpackage.hz50
    public final NetworkMethod method() {
        switch (this.a) {
        }
        return NetworkMethod.post;
    }

    public wuv(String str, String str2, String str3) {
        this.a = 0;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
