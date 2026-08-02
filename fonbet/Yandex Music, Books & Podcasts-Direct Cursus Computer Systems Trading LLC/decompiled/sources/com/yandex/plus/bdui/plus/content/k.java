package com.yandex.plus.bdui.plus.content;

import com.yandex.plus.bdui.plus.action.y;
import com.yandex.plus.core.reflect.NotTraversableField;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public abstract class k {
    public final s a;

    @NotTraversableField
    @NotNull
    private final y renderablesHelper;

    public k(s sVar, y yVar) {
        yVar.getClass();
        this.a = sVar;
        this.renderablesHelper = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.a.equals(((k) obj).a) && this.renderablesHelper.a(this, obj);
        }
        return false;
    }

    public final int hashCode() {
        return this.renderablesHelper.b(this.a.hashCode(), this);
    }
}
