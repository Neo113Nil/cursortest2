package com.plaid.internal;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.plaid.internal.a0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0089a0 extends Lambda implements Function0<SimpleDateFormat> {
    public final /* synthetic */ C0099b0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0089a0(C0099b0 c0099b0) {
        super(0);
        this.a = c0099b0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSZ", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("gmt"));
        return simpleDateFormat;
    }
}
