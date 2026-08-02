package defpackage;

import android.net.Uri;
import com.ybsdk.core.common.utils.theme.ThemedStringParams;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.deeplink.generated.OpenWebAction;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class uub1 {
    public static apf a(p1b p1bVar, i6r i6rVar, w4l0 w4l0Var) {
        i6rVar.getClass();
        w4l0Var.getClass();
        return new apf(p1bVar, i6rVar, w4l0Var);
    }

    public static OpenWebAction b(Uri uri, xz3 xz3Var) {
        Boolean j0;
        Boolean j02;
        String queryParameter = uri.getQueryParameter("url");
        ThemedStringParams themedStringParams = null;
        if (queryParameter != null) {
            String str = ((Boolean) xz3Var.invoke(Uri.parse(queryParameter))).booleanValue() ? queryParameter : null;
            if (str != null) {
                String queryParameter2 = uri.getQueryParameter("open_keyboard");
                boolean booleanValue = (queryParameter2 == null || (j02 = evu0.j0(queryParameter2)) == null) ? false : j02.booleanValue();
                String queryParameter3 = uri.getQueryParameter("show_navbar");
                boolean booleanValue2 = (queryParameter3 == null || (j0 = evu0.j0(queryParameter3)) == null) ? true : j0.booleanValue();
                String queryParameter4 = uri.getQueryParameter("fit_window_top");
                Boolean j03 = queryParameter4 != null ? evu0.j0(queryParameter4) : null;
                ColorModel a = twy0.a(uri, "header_color");
                if (uri.getQueryParameter("statusbar_style") != null) {
                    String l = sd90.l(uri, "statusbar_style");
                    if (l == null) {
                        l = "";
                    }
                    String l2 = sd90.l(uri, "statusbar_style".concat("_dark"));
                    themedStringParams = new ThemedStringParams(l, l2 != null ? l2 : "");
                }
                return new OpenWebAction(str, booleanValue, booleanValue2, j03, a, themedStringParams, twy0.a(uri, "control_color"), uri.getQueryParameter("control"), uri.getQueryParameter("title"), uri.getQueryParameter("auth"), uri.getQueryParameter("add_svc_retpath"));
            }
        }
        return null;
    }

    public static qj11 c(qj11 qj11Var, String[] strArr, Map map) {
        int i = 0;
        if (qj11Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (qj11) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                qj11 qj11Var2 = new qj11();
                int length = strArr.length;
                while (i < length) {
                    qj11Var2.a((qj11) map.get(strArr[i]));
                    i++;
                }
                return qj11Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                qj11Var.a((qj11) map.get(strArr[0]));
                return qj11Var;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    qj11Var.a((qj11) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return qj11Var;
    }
}
