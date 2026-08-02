package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;

/* loaded from: classes.dex */
public final class d3c extends c3c {
    public final rod a;

    public d3c(rod rodVar, String str) {
        super(str);
        this.a = rodVar;
    }

    @Override // defpackage.c3c, java.lang.Throwable
    public final String toString() {
        rod rodVar = this.a;
        g3c g3cVar = rodVar != null ? rodVar.d : null;
        StringBuilder sb = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(StringUtil.SPACE);
        }
        if (g3cVar != null) {
            sb.append("httpResponseCode: ");
            sb.append(g3cVar.c);
            sb.append(", facebookErrorCode: ");
            sb.append(g3cVar.d);
            sb.append(", facebookErrorType: ");
            sb.append(g3cVar.f);
            sb.append(", message: ");
            sb.append(g3cVar.d());
            sb.append("}");
        }
        return sb.toString();
    }
}
