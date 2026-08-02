package com.miteksystems.misnap.core;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/miteksystems/misnap/core/LicenseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "<init>", "(Ljava/lang/String;)V", "core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class LicenseException extends Exception {

    /* renamed from: a, reason: from kotlin metadata */
    public final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LicenseException(String str) {
        super(str);
        str.getClass();
        this.message = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
