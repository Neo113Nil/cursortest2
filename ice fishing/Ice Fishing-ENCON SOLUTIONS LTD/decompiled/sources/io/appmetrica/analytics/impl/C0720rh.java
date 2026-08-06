package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.rh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0720rh implements InterfaceC0675pn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0505j9 f6822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0798uh f6823b;

    public C0720rh(C0798uh c0798uh, C0505j9 c0505j9) {
        this.f6823b = c0798uh;
        this.f6822a = c0505j9;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0675pn
    public final void a(Object obj) {
        List list = (List) obj;
        C0505j9 c0505j9 = this.f6822a;
        if (AbstractC0572lo.a((Collection) list)) {
            return;
        }
        c0505j9.f6264d = new C0454h9[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            C0491il c0491il = (C0491il) list.get(i2);
            C0454h9[] c0454h9Arr = c0505j9.f6264d;
            Map map = Pf.f4929a;
            C0454h9 c0454h9 = new C0454h9();
            Integer num = c0491il.f6197a;
            if (num != null) {
                c0454h9.f6134a = num.intValue();
            }
            Integer num2 = c0491il.f6198b;
            if (num2 != null) {
                c0454h9.f6135b = num2.intValue();
            }
            if (!TextUtils.isEmpty(c0491il.f6200d)) {
                c0454h9.f6136c = c0491il.f6200d;
            }
            c0454h9.f6137d = c0491il.f6199c;
            c0454h9Arr[i2] = c0454h9;
            this.f6823b.f7004g += CodedOutputByteBufferNano.computeMessageSizeNoTag(c0505j9.f6264d[i2]);
            this.f6823b.f7004g += CodedOutputByteBufferNano.computeTagSize(10);
        }
    }
}
