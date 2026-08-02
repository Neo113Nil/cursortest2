package com.plaid.internal;

import android.view.View;
import com.plaid.link.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.plaid.internal.w2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0316w2 extends Lambda implements Function0<View> {
    public final /* synthetic */ C0334y2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0316w2(C0334y2 c0334y2) {
        super(0);
        this.a = c0334y2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.a.findViewById(R.id.retry_button);
    }
}
