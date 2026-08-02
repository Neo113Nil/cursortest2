package yads;

import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import defpackage.bp5;
import defpackage.k171;
import defpackage.sls;
import defpackage.zy11;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class cp3 extends Lambda implements sls {
    public final /* synthetic */ k171 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp3(k171 k171Var, String str) {
        super(0);
        this.b = k171Var;
        this.c = str;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        BidderTokenLoadListener bidderTokenLoadListener = this.b.a;
        ((bp5) bidderTokenLoadListener).a.resumeWith(this.c);
        return zy11.a;
    }
}
