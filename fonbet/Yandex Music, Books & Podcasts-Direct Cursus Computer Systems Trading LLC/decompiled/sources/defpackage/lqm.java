package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;

/* loaded from: classes.dex */
public final class lqm {
    public static final lqm c = new lqm(kqm.a, 0);
    public static final lqm d = new lqm(kqm.f, 1);
    public final kqm a;
    public final int b;

    public lqm(kqm kqmVar, int i) {
        this.a = kqmVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lqm.class != obj.getClass()) {
            return false;
        }
        lqm lqmVar = (lqm) obj;
        return this.a == lqmVar.a && this.b == lqmVar.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(StringUtil.SPACE);
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "slice" : "meet");
        return sb.toString();
    }
}
