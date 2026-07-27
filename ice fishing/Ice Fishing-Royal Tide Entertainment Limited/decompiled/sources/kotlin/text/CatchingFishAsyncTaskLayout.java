package kotlin.text;

import java.io.IOException;

/* loaded from: classes.dex */
public final class CatchingFishAsyncTaskLayout extends IOException {
    public CatchingFishAsyncTaskLayout(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
