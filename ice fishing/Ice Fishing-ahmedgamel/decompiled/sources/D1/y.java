package D1;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class y extends IOException {
    public /* synthetic */ y(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(long j6, long j9, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j6 + ", limit: " + j9 + ", len: " + i), indexOutOfBoundsException);
        Locale locale = Locale.US;
    }

    public y(int i, IOException iOException, String str) {
        super(str + ", status code: " + i, iOException);
    }
}
