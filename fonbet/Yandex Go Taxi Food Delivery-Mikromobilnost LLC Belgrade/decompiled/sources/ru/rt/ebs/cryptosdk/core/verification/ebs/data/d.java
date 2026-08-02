package ru.rt.ebs.cryptosdk.core.verification.ebs.data;

import defpackage.qjn;
import java.io.FileInputStream;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class d extends ContinuationImpl {
    public FileInputStream a;
    public /* synthetic */ Object b;
    public final /* synthetic */ qjn c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qjn qjnVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = qjnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, null, null, null, this);
    }
}
