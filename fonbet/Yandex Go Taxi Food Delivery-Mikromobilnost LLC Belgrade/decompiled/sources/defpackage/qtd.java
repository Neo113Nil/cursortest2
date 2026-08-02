package defpackage;

import com.yandex.plus.log.api.LogPriority;

/* loaded from: classes2.dex */
public final class qtd implements so41 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ qtd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.so41
    public final void f(String str, int i, String str2, String str3, boolean z) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                for (so41 so41Var : (so41[]) obj) {
                    so41Var.f(str, i, str2, str3, z);
                }
                break;
            case 1:
                if (z) {
                    u7d0 u7d0Var = (u7d0) obj;
                    if (str == null) {
                        str = "";
                    }
                    String str4 = str;
                    fu90.a(u7d0Var.a, str4, "3ds", str4, PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType.Network, "no_value");
                    break;
                }
                break;
            case 2:
                if (str != null) {
                    ajo ajoVar = (ajo) obj;
                    if (z) {
                        fu90.a(ajoVar.b, str, ajoVar.a, str, PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType.Network, "no_value");
                        break;
                    } else {
                        fu90 fu90Var = ajoVar.b;
                        String str5 = ajoVar.a;
                        if (str2 == null) {
                            str2 = "no_value";
                        }
                        fu90.a(fu90Var, str, str5, str2, PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType.Network, "no_value");
                        break;
                    }
                }
                break;
            default:
                pgz pgzVar = (pgz) obj;
                LogPriority logPriority = LogPriority.ERROR;
                if (pgzVar.e(logPriority)) {
                    StringBuilder v = ly3.v("3ds.Error.Other: isMainFrame=", ", mainFrameUrl=", str, ", resourceUrl=", z);
                    b64.A(i, str2, ", code=", ", description=", v);
                    v.append(fhb1.c(str3));
                    pgzVar.a(logPriority, "Logs3dsWebViewErrorListener", v.toString());
                    break;
                }
                break;
        }
    }

    @Override // defpackage.so41
    public final void l(String str, int i, String str2, String str3, boolean z) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                for (so41 so41Var : (so41[]) obj) {
                    so41Var.l(str, i, str2, str3, z);
                }
                break;
            case 1:
                if (z) {
                    u7d0 u7d0Var = (u7d0) obj;
                    if (str == null) {
                        str = "";
                    }
                    String str4 = str;
                    fu90.a(u7d0Var.a, str4, "3ds", str4, PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType.Ssl, "no_value");
                    break;
                }
                break;
            case 2:
                if (str != null) {
                    ajo ajoVar = (ajo) obj;
                    if (z) {
                        fu90.a(ajoVar.b, str, ajoVar.a, str, PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType.Ssl, "no_value");
                        break;
                    } else {
                        fu90 fu90Var = ajoVar.b;
                        String str5 = ajoVar.a;
                        if (str2 == null) {
                            str2 = "no_value";
                        }
                        fu90.a(fu90Var, str, str5, str2, PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType.Ssl, "no_value");
                        break;
                    }
                }
                break;
            default:
                pgz pgzVar = (pgz) obj;
                LogPriority logPriority = LogPriority.ERROR;
                if (pgzVar.e(logPriority)) {
                    StringBuilder v = ly3.v("3ds.Error.Ssl: isMainFrame=", ", mainFrameUrl=", str, ", resourceUrl=", z);
                    b64.A(i, str2, ", code=", ", description=", v);
                    v.append(fhb1.c(str3));
                    pgzVar.a(logPriority, "Logs3dsWebViewErrorListener", v.toString());
                    break;
                }
                break;
        }
    }

    @Override // defpackage.so41
    public final void r(String str, int i, String str2, String str3, boolean z) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                for (so41 so41Var : (so41[]) obj) {
                    so41Var.r(str, i, str2, str3, z);
                }
                break;
            case 1:
                if (z) {
                    u7d0 u7d0Var = (u7d0) obj;
                    if (str == null) {
                        str = "";
                    }
                    String str4 = str;
                    fu90.a(u7d0Var.a, str4, "3ds", str4, PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType.Http, String.valueOf(i));
                    break;
                }
                break;
            case 2:
                if (str != null) {
                    ajo ajoVar = (ajo) obj;
                    if (z) {
                        fu90.a(ajoVar.b, str, ajoVar.a, str, PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType.Http, String.valueOf(i));
                        break;
                    } else {
                        fu90 fu90Var = ajoVar.b;
                        String str5 = ajoVar.a;
                        if (str2 == null) {
                            str2 = "no_value";
                        }
                        fu90.a(fu90Var, str, str5, str2, PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType.Http, String.valueOf(i));
                        break;
                    }
                }
                break;
            default:
                pgz pgzVar = (pgz) obj;
                LogPriority logPriority = LogPriority.ERROR;
                if (pgzVar.e(logPriority)) {
                    StringBuilder v = ly3.v("3ds.Error.Http: isMainFrame=", ", mainFrameUrl=", str, ", resourceUrl=", z);
                    b64.A(i, str2, ", code=", ", description=", v);
                    v.append(fhb1.c(str3));
                    pgzVar.a(logPriority, "Logs3dsWebViewErrorListener", v.toString());
                    break;
                }
                break;
        }
    }
}
