package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.Date;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class wrm implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ wrm(xrm xrmVar, int i, long j, String str, String str2) {
        this.a = i;
        this.b = j;
        this.c = str;
        this.d = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        String format = xrm.c.format(new Date(System.currentTimeMillis()));
        int i = ku2.a;
        switch (this.a) {
            case 2:
                str = "V";
                break;
            case 3:
                str = "D";
                break;
            case 4:
                str = "I";
                break;
            case 5:
                str = "W";
                break;
            case 6:
                str = "E";
                break;
            case 7:
                str = "A";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        String str2 = this.c;
        if (str2 == null) {
            str2 = "nonetag";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(format);
        sb.append(StringUtil.SPACE);
        sb.append(i);
        sb.append(StringUtil.SPACE);
        sb.append(this.b);
        sb.append(StringUtil.SPACE);
        sb.append(str);
        return ouj.q(sb, StringUtil.SPACE, str2, StringUtil.SPACE, this.d);
    }
}
