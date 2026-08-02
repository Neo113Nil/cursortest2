package io.flutter.plugins.sharedpreferences;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", f = "SharedPreferencesPlugin.kt", l = {256, 258}, m = "getPrefs")
/* loaded from: classes4.dex */
final class SharedPreferencesPlugin$getPrefs$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin$getPrefs$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return g.b(this.this$0, null, this);
    }
}
