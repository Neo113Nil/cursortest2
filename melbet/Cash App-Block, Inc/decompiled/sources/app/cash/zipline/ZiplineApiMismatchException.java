package app.cash.zipline;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lapp/cash/zipline/ZiplineApiMismatchException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "zipline_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZiplineApiMismatchException extends Exception {
    public final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZiplineApiMismatchException(String str) {
        super(str);
        str.getClass();
        this.message = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
