package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Uj implements InterfaceC0704uq {
    public final /* synthetic */ C0601ra a;
    public final /* synthetic */ Xj b;

    public Uj(Xj xj, C0601ra c0601ra) {
        this.b = xj;
        this.a = c0601ra;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0704uq
    public final void a(Object obj) {
        List list = (List) obj;
        C0601ra c0601ra = this.a;
        if (AbstractC0734vr.a((Collection) list)) {
            return;
        }
        c0601ra.d = new C0544pa[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C0442lo c0442lo = (C0442lo) list.get(i);
            C0544pa[] c0544paArr = c0601ra.d;
            Map map = AbstractC0465mi.a;
            C0544pa c0544pa = new C0544pa();
            Integer num = c0442lo.a;
            if (num != null) {
                c0544pa.a = num.intValue();
            }
            Integer num2 = c0442lo.b;
            if (num2 != null) {
                c0544pa.b = num2.intValue();
            }
            if (!TextUtils.isEmpty(c0442lo.d)) {
                c0544pa.c = c0442lo.d;
            }
            c0544pa.d = c0442lo.c;
            c0544paArr[i] = c0544pa;
            this.b.g += CodedOutputByteBufferNano.computeMessageSizeNoTag(c0601ra.d[i]);
            this.b.g += CodedOutputByteBufferNano.computeTagSize(10);
        }
    }
}
