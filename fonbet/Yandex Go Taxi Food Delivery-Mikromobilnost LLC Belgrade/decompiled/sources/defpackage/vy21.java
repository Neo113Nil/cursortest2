package defpackage;

import com.yandex.mob.domain.ValidateConfigUseCase$InvalidCause;
import java.net.URI;
import java.net.URL;

/* loaded from: classes8.dex */
public final class vy21 {
    public final ValidateConfigUseCase$InvalidCause a(String str, String str2) {
        URL url;
        zr20 zr20Var;
        URL url2;
        zr20 zr20Var2;
        try {
            url = new URI("https://".concat(str)).toURL();
        } catch (Exception unused) {
            url = null;
        }
        if (url != null) {
            String protocol = url.getProtocol();
            if (protocol == null) {
                protocol = "";
            }
            String host = url.getHost();
            if (host == null) {
                host = "";
            }
            String query = url.getQuery();
            if (query == null) {
                query = "";
            }
            zr20Var = new zr20(protocol, host, query);
        } else {
            zr20Var = null;
        }
        if (zr20Var == null) {
            return ValidateConfigUseCase$InvalidCause.UrlParsingFailed;
        }
        try {
            url2 = new URI(str2).toURL();
        } catch (Exception unused2) {
            url2 = null;
        }
        if (url2 != null) {
            String protocol2 = url2.getProtocol();
            if (protocol2 == null) {
                protocol2 = "";
            }
            String host2 = url2.getHost();
            if (host2 == null) {
                host2 = "";
            }
            String query2 = url2.getQuery();
            zr20Var2 = new zr20(protocol2, host2, query2 != null ? query2 : "");
        } else {
            zr20Var2 = null;
        }
        if (zr20Var2 == null) {
            return ValidateConfigUseCase$InvalidCause.UrlParsingFailed;
        }
        if (evu0.B(str2, '/') || evu0.B(str, '/')) {
            return ValidateConfigUseCase$InvalidCause.SlashSuffix;
        }
        if (!zr20Var.b.equals(zr20Var2.b)) {
            return ValidateConfigUseCase$InvalidCause.DifferentHosts;
        }
        if (zr20Var2.c.length() > 0) {
            return ValidateConfigUseCase$InvalidCause.AdditionalQuery;
        }
        return null;
    }
}
