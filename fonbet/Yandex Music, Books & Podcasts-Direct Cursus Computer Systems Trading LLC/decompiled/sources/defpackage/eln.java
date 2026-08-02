package defpackage;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class eln extends f8s {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ gln f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eln(gln glnVar) {
        super(su4.o(new StringBuilder(), glnVar.l, " writer"), true);
        this.f = glnVar;
    }

    @Override // defpackage.f8s
    public final long a() {
        switch (this.e) {
            case 0:
                gln glnVar = this.f;
                try {
                    if (glnVar.h()) {
                    }
                } catch (IOException e) {
                    glnVar.c(e, null);
                    break;
                }
                break;
            default:
                mkn mknVar = this.f.g;
                mknVar.getClass();
                mknVar.cancel();
                break;
        }
        return -1L;
        return -1L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eln(gln glnVar, String str) {
        super(str, true);
        this.f = glnVar;
    }
}
