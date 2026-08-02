package defpackage;

import android.view.View;
import com.adjust.sdk.Constants;
import java.util.List;
import java.util.Map;
import yads.od3;
import yads.wh3;

/* loaded from: classes7.dex */
public final class wh61 implements ps81 {
    public final bs81 a;
    public final sl81 b;

    public wh61(bs81 bs81Var, sl81 sl81Var) {
        this.a = bs81Var;
        this.b = sl81Var;
    }

    @Override // defpackage.ps81
    public final /* bridge */ void a(View view) {
    }

    @Override // defpackage.ps81
    public final /* bridge */ void a(String str) {
    }

    @Override // defpackage.ps81
    public final void b(cf71 cf71Var) {
        int i;
        switch (((od3) cf71Var.b).ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 25:
            case 26:
                i = 405;
                break;
            case 7:
                i = 402;
                break;
            case 8:
            case 12:
            case 28:
                i = 900;
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 24:
            case 27:
                i = Constants.MINIMAL_ERROR_STATUS_CODE;
                break;
            case 19:
                i = 401;
                break;
            case 23:
                i = 403;
                break;
            case 29:
            case 31:
                i = 901;
                break;
            case 30:
                i = 902;
                break;
            default:
                w511.b();
                return;
        }
        Map z = g8e.z("[ERRORCODE]", String.valueOf(i));
        List list = (List) this.a.H.get("error");
        if (list != null) {
            ((q191) this.b.a).a(list, z);
        }
    }

    @Override // defpackage.ps81
    public final /* bridge */ void c() {
    }

    @Override // defpackage.ps81
    public final /* bridge */ void c(wh3 wh3Var) {
    }

    @Override // defpackage.ps81
    public final /* bridge */ void d() {
    }

    @Override // defpackage.ps81
    public final /* bridge */ void d(float f, long j) {
    }

    @Override // defpackage.ps81
    public final /* bridge */ void f() {
    }

    @Override // defpackage.ps81
    public final /* bridge */ void g() {
    }

    @Override // defpackage.ps81
    public final void h() {
        this.b.i(this.a, "render_impression");
    }

    @Override // defpackage.ps81
    public final void j() {
        this.b.i(new nr41(15, this.a), "renderingStart");
    }

    @Override // defpackage.ps81
    public final /* bridge */ void k() {
    }

    @Override // defpackage.ps81
    public final /* bridge */ void l(float f) {
    }

    @Override // defpackage.ps81
    public final /* bridge */ void n() {
    }

    @Override // defpackage.ps81
    public final /* bridge */ void o() {
    }

    @Override // defpackage.ps81
    public final /* bridge */ void p() {
    }

    @Override // defpackage.ps81
    public final void q() {
        this.b.i(this.a, "impression");
    }

    @Override // defpackage.ps81
    public final /* bridge */ void a() {
    }

    @Override // defpackage.ps81
    public final /* bridge */ void b() {
    }
}
