package com.yandex.plus.core.debug.panel.internal.presentation.adapter;

import com.yandex.plus.core.debug.panel.internal.model.ui.d;
import com.yandex.plus.core.debug.panel.internal.model.ui.e;
import defpackage.up6;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends up6 {
    public final /* synthetic */ int p;

    public /* synthetic */ a(int i) {
        this.p = i;
    }

    @Override // defpackage.up6
    public final boolean o(Object obj, Object obj2) {
        switch (this.p) {
            case 0:
                return ((e) obj).equals((e) obj2);
            case 1:
                return ((com.yandex.plus.core.debug.panel.internal.model.ui.b) obj).equals((com.yandex.plus.core.debug.panel.internal.model.ui.b) obj2);
            default:
                return ((d) obj).equals((d) obj2);
        }
    }

    @Override // defpackage.up6
    public final boolean p(Object obj, Object obj2) {
        switch (this.p) {
            case 0:
                return ((e) obj).a == ((e) obj2).a;
            case 1:
                com.yandex.plus.core.debug.panel.internal.model.ui.b bVar = (com.yandex.plus.core.debug.panel.internal.model.ui.b) obj;
                return Intrinsics.d(bVar.getId(), bVar.getId());
            default:
                return Intrinsics.d(((d) obj).a, ((d) obj2).a);
        }
    }
}
