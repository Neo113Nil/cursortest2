package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import ru.yandex.music.glagol.data.GlagolCastConnection$ResponseException;
import ru.yandex.quasar.glagol.ResponseMessage$Status;

/* loaded from: classes5.dex */
public final class ydd implements t3o {
    public final /* synthetic */ zt3 a;
    public final /* synthetic */ String b;

    public ydd(zt3 zt3Var, String str) {
        this.a = zt3Var;
        this.b = str;
    }

    @Override // defpackage.t3o
    public final void onMessage(u3o u3oVar) {
        Object sddVar;
        u3oVar.getClass();
        ResponseMessage$Status status = u3oVar.getStatus();
        StringBuilder sb = new StringBuilder("command ");
        String str = this.b;
        sb.append(str);
        sb.append(" <-- response: ");
        sb.append(status);
        sb.append(StringUtil.SPACE);
        sb.append(u3oVar);
        ssg.a(4, "GlagolCastConnection", sb.toString(), null);
        ResponseMessage$Status status2 = u3oVar.getStatus();
        int i = status2 == null ? -1 : xdd.a[status2.ordinal()];
        if (i != -1) {
            if (i == 1) {
                sddVar = new udd(u3oVar);
                r7o r7oVar = z7o.b;
                this.a.resumeWith(sddVar);
            } else if (i != 2 && i != 3) {
                b6e.s();
                return;
            }
        }
        str.getClass();
        ResponseMessage$Status status3 = u3oVar.getStatus();
        String errorCode = u3oVar.getErrorCode();
        String errorText = u3oVar.getErrorText();
        StringBuilder sb2 = new StringBuilder("Payload(");
        sb2.append(str);
        sb2.append(") response failed with ");
        sb2.append(status3);
        sb2.append("(");
        sddVar = new sdd(new GlagolCastConnection$ResponseException(vz1.s(sb2, errorCode, "): ", errorText)));
        r7o r7oVar2 = z7o.b;
        this.a.resumeWith(sddVar);
    }
}
