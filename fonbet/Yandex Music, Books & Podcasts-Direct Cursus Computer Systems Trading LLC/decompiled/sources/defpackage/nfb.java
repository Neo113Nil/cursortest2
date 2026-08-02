package defpackage;

import ru.yandex.video.m3.player.error_handling.ErrorHandlingDecision$RepeatPrepare$AutoPlay;
import ru.yandex.video.m3.player.error_handling.ErrorHandlingDecision$RepeatPrepare$StartPosition;

/* loaded from: classes6.dex */
public final class nfb extends ild {
    public final ErrorHandlingDecision$RepeatPrepare$StartPosition m;
    public final ErrorHandlingDecision$RepeatPrepare$AutoPlay n;
    public final boolean o;

    public nfb(ErrorHandlingDecision$RepeatPrepare$StartPosition errorHandlingDecision$RepeatPrepare$StartPosition, boolean z) {
        ErrorHandlingDecision$RepeatPrepare$AutoPlay errorHandlingDecision$RepeatPrepare$AutoPlay = tfb.d;
        errorHandlingDecision$RepeatPrepare$StartPosition.getClass();
        errorHandlingDecision$RepeatPrepare$AutoPlay.getClass();
        this.m = errorHandlingDecision$RepeatPrepare$StartPosition;
        this.n = errorHandlingDecision$RepeatPrepare$AutoPlay;
        this.o = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfb)) {
            return false;
        }
        nfb nfbVar = (nfb) obj;
        return this.m == nfbVar.m && this.n == nfbVar.n && this.o == nfbVar.o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + ((this.n.hashCode() + (this.m.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RepeatPrepare(startPosition=");
        sb.append(this.m);
        sb.append(", autoPlay=");
        sb.append(this.n);
        sb.append(", preferredH264=");
        return dfi.j(sb, this.o, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nfb(ErrorHandlingDecision$RepeatPrepare$StartPosition errorHandlingDecision$RepeatPrepare$StartPosition) {
        this(errorHandlingDecision$RepeatPrepare$StartPosition, false);
        tfb tfbVar = tfb.a;
    }
}
