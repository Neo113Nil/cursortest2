package com.yandex.plus.bdui.plus.scenario;

import com.yandex.plus.bdui.b0;
import defpackage.btf;
import defpackage.jyr;
import java.util.Map;

/* loaded from: classes4.dex */
public final class l implements b0 {
    public final jyr a;

    public l(Map map) {
        this.a = btf.b(new com.yandex.plus.bdui.flex.ui.content.f(3, map));
    }

    @Override // com.yandex.plus.bdui.b0
    public final Map getSupportedFeatures() {
        return (Map) this.a.getValue();
    }
}
