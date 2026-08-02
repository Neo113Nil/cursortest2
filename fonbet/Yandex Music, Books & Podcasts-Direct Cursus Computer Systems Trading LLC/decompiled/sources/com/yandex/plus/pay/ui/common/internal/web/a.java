package com.yandex.plus.pay.ui.common.internal.web;

import com.yandex.plus.webview.core.i;
import defpackage.edk;
import defpackage.gdk;

/* loaded from: classes5.dex */
public final class a implements i {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public a(com.yandex.plus.pay.ui.webview.common.diagnostic.a aVar) {
        aVar.getClass();
        this.b = aVar;
    }

    @Override // com.yandex.plus.webview.core.i
    public final void d(int i, String str, String str2, String str3, boolean z) {
        switch (this.a) {
            case 0:
                if (z) {
                    com.yandex.plus.pay.ui.core.mobile.domain.a aVar = (com.yandex.plus.pay.ui.core.mobile.domain.a) this.b;
                    String str4 = str == null ? "" : str;
                    String valueOf = String.valueOf(i);
                    aVar.getClass();
                    valueOf.getClass();
                    gdk.a(aVar.a, str4, "3ds", str4, edk.Ssl, "no_value");
                    break;
                }
                break;
            case 1:
                com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) this.b;
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                if (bVar.b(aVar2)) {
                    bVar.c(aVar2, "Logs3dsWebViewErrorListener", "3ds.Error.Ssl: isMainFrame=" + z + ", mainFrameUrl=" + str + ", resourceUrl=" + str2 + ", code=" + i + ", description=" + com.yandex.plus.bdui.flex.ui.a.B(str3));
                    break;
                }
                break;
            case 2:
                String str5 = str2;
                if (str != null) {
                    com.yandex.plus.pay.ui.webview.common.diagnostic.a aVar3 = (com.yandex.plus.pay.ui.webview.common.diagnostic.a) this.b;
                    if (z) {
                        aVar3.getClass();
                        gdk.a(aVar3.b, str, aVar3.a, str, edk.Ssl, "no_value");
                        break;
                    } else {
                        aVar3.getClass();
                        gdk gdkVar = aVar3.b;
                        String str6 = aVar3.a;
                        if (str5 == null) {
                            str5 = "no_value";
                        }
                        gdk.a(gdkVar, str, str6, str5, edk.Ssl, "no_value");
                        break;
                    }
                }
                break;
            default:
                for (i iVar : (i[]) this.b) {
                    iVar.d(i, str, str2, str3, z);
                }
                break;
        }
    }

    @Override // com.yandex.plus.webview.core.i
    public final void k(int i, String str, String str2, String str3, boolean z) {
        switch (this.a) {
            case 0:
                if (z) {
                    com.yandex.plus.pay.ui.core.mobile.domain.a aVar = (com.yandex.plus.pay.ui.core.mobile.domain.a) this.b;
                    String str4 = str == null ? "" : str;
                    aVar.getClass();
                    gdk.a(aVar.a, str4, "3ds", str4, edk.Network, "no_value");
                    break;
                }
                break;
            case 1:
                com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) this.b;
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                if (bVar.b(aVar2)) {
                    bVar.c(aVar2, "Logs3dsWebViewErrorListener", "3ds.Error.Other: isMainFrame=" + z + ", mainFrameUrl=" + str + ", resourceUrl=" + str2 + ", code=" + i + ", description=" + com.yandex.plus.bdui.flex.ui.a.B(str3));
                    break;
                }
                break;
            case 2:
                String str5 = str2;
                if (str != null) {
                    com.yandex.plus.pay.ui.webview.common.diagnostic.a aVar3 = (com.yandex.plus.pay.ui.webview.common.diagnostic.a) this.b;
                    if (z) {
                        aVar3.getClass();
                        gdk.a(aVar3.b, str, aVar3.a, str, edk.Network, "no_value");
                        break;
                    } else {
                        aVar3.getClass();
                        gdk gdkVar = aVar3.b;
                        String str6 = aVar3.a;
                        if (str5 == null) {
                            str5 = "no_value";
                        }
                        gdk.a(gdkVar, str, str6, str5, edk.Network, "no_value");
                        break;
                    }
                }
                break;
            default:
                for (i iVar : (i[]) this.b) {
                    iVar.k(i, str, str2, str3, z);
                }
                break;
        }
    }

    @Override // com.yandex.plus.webview.core.i
    public final void u(int i, String str, String str2, String str3, boolean z) {
        switch (this.a) {
            case 0:
                str3.getClass();
                if (z) {
                    com.yandex.plus.pay.ui.core.mobile.domain.a aVar = (com.yandex.plus.pay.ui.core.mobile.domain.a) this.b;
                    String str4 = str == null ? "" : str;
                    aVar.getClass();
                    gdk.a(aVar.a, str4, "3ds", str4, edk.Http, String.valueOf(i));
                    break;
                }
                break;
            case 1:
                str3.getClass();
                com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) this.b;
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                if (bVar.b(aVar2)) {
                    bVar.c(aVar2, "Logs3dsWebViewErrorListener", "3ds.Error.Http: isMainFrame=" + z + ", mainFrameUrl=" + str + ", resourceUrl=" + str2 + ", code=" + i + ", description=" + com.yandex.plus.bdui.flex.ui.a.B(str3));
                    break;
                }
                break;
            case 2:
                String str5 = str2;
                str3.getClass();
                if (str != null) {
                    com.yandex.plus.pay.ui.webview.common.diagnostic.a aVar3 = (com.yandex.plus.pay.ui.webview.common.diagnostic.a) this.b;
                    if (z) {
                        aVar3.getClass();
                        gdk.a(aVar3.b, str, aVar3.a, str, edk.Http, String.valueOf(i));
                        break;
                    } else {
                        aVar3.getClass();
                        gdk gdkVar = aVar3.b;
                        String str6 = aVar3.a;
                        if (str5 == null) {
                            str5 = "no_value";
                        }
                        gdk.a(gdkVar, str, str6, str5, edk.Http, String.valueOf(i));
                        break;
                    }
                }
                break;
            default:
                str3.getClass();
                for (i iVar : (i[]) this.b) {
                    iVar.u(i, str, str2, str3, z);
                }
                break;
        }
    }

    public a(com.yandex.plus.pay.ui.core.mobile.domain.a aVar) {
        aVar.getClass();
        this.b = aVar;
    }

    public a(com.yandex.plus.log.api.b bVar) {
        bVar.getClass();
        this.b = bVar;
    }

    public a(i[] iVarArr) {
        iVarArr.getClass();
        this.b = iVarArr;
    }
}
