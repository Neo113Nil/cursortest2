package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import app.cash.broadway.ui.compose.FullScreenKt$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public abstract class ContextMenuPopupPositionProviderKt {

    /* renamed from: lambda$-1571120048, reason: not valid java name */
    public static final ComposableLambdaImpl f3lambda$1571120048 = new ComposableLambdaImpl(new ComposableSingletons$ContextMenuUiKt$$ExternalSyntheticLambda0(), false, -1571120048);

    /* renamed from: lambda$-1455401925, reason: not valid java name */
    public static final ComposableLambdaImpl f2lambda$1455401925 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(1), false, -1455401925);

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0011, code lost:
    
        if (r4 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int alignPopupAxis(int i, int i2, boolean z, int i3) {
        if (i2 >= i3) {
            if (z) {
                return 0;
            }
            return i3 - i2;
        }
        if (z) {
            if (z) {
                if (z) {
                }
            } else if (z) {
            }
        } else {
            if (z ? i3 - i2 <= i : i2 > i) {
                if (z) {
                    return i3 - i2;
                }
                return 0;
            }
            if (z) {
                return i - i2;
            }
        }
        return i;
    }
}
