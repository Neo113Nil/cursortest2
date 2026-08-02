package com.yandex.plus.home.api.panel;

import com.yandex.plus.home.feature.panel.internal.sections.h;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class f implements Function1 {
    public static final f b = new f(0);
    public static final f c = new f(1);
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
        }
        return Boolean.valueOf(obj instanceof h);
    }
}
