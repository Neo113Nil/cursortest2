package com.yandex.plus.bdui.plus.action;

import com.yandex.plus.core.reflect.TraversableCollectionField;
import defpackage.eta;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class l implements com.yandex.plus.bdui.action.a {

    @TraversableCollectionField
    @NotNull
    private final List<com.yandex.plus.bdui.action.a> actions;

    public l(List list) {
        list.getClass();
        this.actions = list;
    }

    public final List a() {
        return this.actions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.actions, ((l) obj).actions);
    }

    public final int hashCode() {
        return this.actions.hashCode();
    }

    public final String toString() {
        return eta.h(new StringBuilder("PlusMultiAction(actions="), this.actions, ')');
    }
}
