package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ro, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0727ro implements InterfaceC0753so {
    @Override // io.appmetrica.analytics.impl.InterfaceC0753so
    public final C0702qo a(List<C0702qo> list) {
        LinkedList linkedList = new LinkedList();
        boolean z2 = true;
        for (C0702qo c0702qo : list) {
            if (!c0702qo.f6792a) {
                linkedList.add(c0702qo.f6793b);
                z2 = false;
            }
        }
        return z2 ? new C0702qo(this, true, "") : new C0702qo(this, false, TextUtils.join(", ", linkedList));
    }
}
