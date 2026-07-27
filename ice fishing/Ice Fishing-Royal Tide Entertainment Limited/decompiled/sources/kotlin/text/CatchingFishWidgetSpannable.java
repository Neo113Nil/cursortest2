package kotlin.text;

import java.util.Objects;

/* loaded from: classes.dex */
public class CatchingFishWidgetSpannable {
    public static final CatchingFishSnackbarHandler CatchingFishCoroutine = new CatchingFishSnackbarHandler("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    public final CatchingFishAsyncTaskFlux CatchingFishParcelableFAB;
    public final Character CatchingFishSnackbar;

    static {
        new CatchingFishSnackbarHandler("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new CatchingFishWidgetSpannable("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new CatchingFishWidgetSpannable("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        new CatchingFishDaggerOkHttp(new CatchingFishAsyncTaskFlux("base16()", "0123456789ABCDEF".toCharArray()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatchingFishWidgetSpannable(CatchingFishAsyncTaskFlux catchingFishAsyncTaskFlux, Character ch) {
        boolean z;
        catchingFishAsyncTaskFlux.getClass();
        this.CatchingFishParcelableFAB = catchingFishAsyncTaskFlux;
        if (ch != null) {
            char charValue = ch.charValue();
            byte[] bArr = catchingFishAsyncTaskFlux.CatchingFishDaggerWebsocket;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z = false;
                if (z) {
                    throw new IllegalArgumentException(CatchingFishKtorViewModel.CatchingFish("Padding character %s was already in alphabet", ch));
                }
                this.CatchingFishSnackbar = ch;
                return;
            }
        }
        z = true;
        if (z) {
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishWidgetSpannable) {
            CatchingFishWidgetSpannable catchingFishWidgetSpannable = (CatchingFishWidgetSpannable) obj;
            if (this.CatchingFishParcelableFAB.equals(catchingFishWidgetSpannable.CatchingFishParcelableFAB) && Objects.equals(this.CatchingFishSnackbar, catchingFishWidgetSpannable.CatchingFishSnackbar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.CatchingFishParcelableFAB.hashCode() ^ Objects.hashCode(this.CatchingFishSnackbar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        CatchingFishAsyncTaskFlux catchingFishAsyncTaskFlux = this.CatchingFishParcelableFAB;
        sb.append(catchingFishAsyncTaskFlux);
        if (8 % catchingFishAsyncTaskFlux.CatchingFishCoroutine != 0) {
            Character ch = this.CatchingFishSnackbar;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public CatchingFishWidgetSpannable(String str, String str2) {
        this(new CatchingFishAsyncTaskFlux(str, str2.toCharArray()), (Character) '=');
    }
}
