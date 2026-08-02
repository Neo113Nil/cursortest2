package defpackage;

import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;

/* loaded from: classes6.dex */
public final class no7 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ OkHttpClient s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ no7(OkHttpClient okHttpClient, int i) {
        super(0);
        this.r = i;
        this.s = okHttpClient;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
        }
        return this.s;
    }
}
