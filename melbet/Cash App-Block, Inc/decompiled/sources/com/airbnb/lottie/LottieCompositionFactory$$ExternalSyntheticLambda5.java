package com.airbnb.lottie;

import android.content.Context;
import com.google.firebase.concurrent.DelegatingScheduledExecutorService;
import com.plaid.internal.r6$$ExternalSyntheticLambda0;
import com.squareup.scannerview.SizeMap;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class LottieCompositionFactory$$ExternalSyntheticLambda5 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ LottieCompositionFactory$$ExternalSyntheticLambda5(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        LottieResult fromInputStreamSync;
        int i = this.$r8$classId;
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                fromInputStreamSync = LottieCompositionFactory.fromInputStreamSync((Context) obj3, (InputStream) obj2, (String) obj);
                return fromInputStreamSync;
            default:
                return ((DelegatingScheduledExecutorService) obj3).delegate.submit(new r6$$ExternalSyntheticLambda0(2, (Callable) obj2, (SizeMap) obj));
        }
    }
}
