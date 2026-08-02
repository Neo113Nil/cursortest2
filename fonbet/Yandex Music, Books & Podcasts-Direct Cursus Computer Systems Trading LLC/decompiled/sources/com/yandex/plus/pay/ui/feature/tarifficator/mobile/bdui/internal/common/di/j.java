package com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di;

import defpackage.wxm;

/* loaded from: classes5.dex */
public final /* synthetic */ class j extends wxm {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.b = i2;
    }

    @Override // defpackage.p9f
    public final Object get() {
        switch (this.b) {
            case 0:
                return (com.yandex.plus.pay.ui.webview.family.domain.a) ((i) this.receiver).C.getValue();
            case 1:
                return (com.yandex.plus.pay.ui.webview.common.diagnostic.a) ((i) this.receiver).B.getValue();
            case 2:
                return ((com.yandex.plus.bdui.plus.auth.a) this.receiver).d;
            case 3:
                return ((com.yandex.plus.bdui.plus.auth.a) this.receiver).d;
            case 4:
                return ((com.yandex.plus.domain.auth.api.e) this.receiver).e();
            default:
                ((com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.c) this.receiver).getClass();
                return (com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.d) com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags.c.b.getValue();
        }
    }
}
