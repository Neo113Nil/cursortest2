package ru.yandextaxi.flutter_yandex_mapkit.helper;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/helper/PlatformExceptionWrapper;", "", "", "errorDetails", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "cause", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlatformExceptionWrapper extends Throwable {
    private final Throwable cause;
    private final Object errorDetails;

    public PlatformExceptionWrapper(Object obj, Throwable th) {
        super(th);
        this.errorDetails = obj;
        this.cause = super.getCause();
    }

    /* renamed from: a, reason: from getter */
    public final Object getErrorDetails() {
        return this.errorDetails;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}
