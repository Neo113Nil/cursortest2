package y4;

/* loaded from: classes2.dex */
public final class h {
    private final boolean isEnabled;
    private final M4.c logLevel;

    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public final M4.c getLogLevel() {
        return this.logLevel;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public h(M4.c cVar, boolean z6) {
        this.logLevel = cVar;
        this.isEnabled = z6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ h(M4.c cVar, boolean z6, int i, kotlin.jvm.internal.e eVar) {
        this(cVar, (i & 2) != 0 ? cVar != null : z6);
        cVar = (i & 1) != 0 ? null : cVar;
    }
}
