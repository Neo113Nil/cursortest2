package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class ti21 {
    public final jyq0 a;
    public final xi21 b;
    public final lru0 c;
    public final List d;
    public boolean e = false;
    public boolean f = false;

    public ti21(jyq0 jyq0Var, xi21 xi21Var, lru0 lru0Var, List list) {
        this.a = jyq0Var;
        this.b = xi21Var;
        this.c = lru0Var;
        this.d = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UseCaseAttachInfo{mSessionConfig=");
        sb.append(this.a);
        sb.append(", mUseCaseConfig=");
        sb.append(this.b);
        sb.append(", mStreamSpec=");
        sb.append(this.c);
        sb.append(", mCaptureTypes=");
        sb.append(this.d);
        sb.append(", mAttached=");
        sb.append(this.e);
        sb.append(", mActive=");
        return unr0.u(sb, this.f, '}');
    }
}
