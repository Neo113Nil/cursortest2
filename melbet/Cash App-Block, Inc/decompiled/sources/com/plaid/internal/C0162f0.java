package com.plaid.internal;

import java.lang.reflect.Type;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashStorage", f = "CrashStorage.kt", l = {53}, m = "loadEvents")
/* renamed from: com.plaid.internal.f0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0162f0 extends ContinuationImpl {
    public C0180h0 a;
    public Type b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C0180h0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0162f0(C0180h0 c0180h0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c0180h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= PKIFailureInfo.systemUnavail;
        return C0180h0.a(this.d, null, null, this);
    }
}
