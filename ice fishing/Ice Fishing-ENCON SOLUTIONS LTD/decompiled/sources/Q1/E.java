package Q1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class E extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0079b f1563a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(EnumC0079b errorCode) {
        super(kotlin.jvm.internal.i.h(errorCode, "stream was reset: "));
        kotlin.jvm.internal.i.e(errorCode, "errorCode");
        this.f1563a = errorCode;
    }
}
