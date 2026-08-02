package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import javax.jmdns.impl.a;

/* loaded from: classes5.dex */
public final class dkp extends ckp {
    private static final long serialVersionUID = 7107973622016897488L;
    public final String a;
    public final String b;
    public final fkp c;

    public dkp(p2f p2fVar, String str, String str2, fkp fkpVar) {
        super(p2fVar);
        this.a = str;
        this.b = str2;
        this.c = fkpVar;
    }

    public final Object clone() {
        return new dkp((p2f) ((j2f) getSource()), this.a, this.b, new a(this.c));
    }

    @Override // java.util.EventObject
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + dkp.class.getSimpleName() + "@" + System.identityHashCode(this) + StringUtil.SPACE);
        sb.append("\n\tname: '");
        sb.append(this.b);
        sb.append("' type: '");
        sb.append(this.a);
        sb.append("' info: '");
        sb.append(this.c);
        sb.append("']");
        return sb.toString();
    }
}
