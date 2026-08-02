package com.yandex.plus.bdui.plus.content;

import com.yandex.plus.bdui.plus.action.y;
import com.yandex.plus.core.reflect.NotTraversableField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public abstract class b {
    public final com.yandex.plus.bdui.action.a a;

    @NotTraversableField
    @NotNull
    private final y renderablesHelper;

    public b(com.yandex.plus.bdui.action.a aVar, y yVar) {
        aVar.getClass();
        yVar.getClass();
        this.a = aVar;
        this.renderablesHelper = yVar;
    }

    public abstract String a();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return Intrinsics.d(this.a, ((b) obj).a) && this.renderablesHelper.a(this, obj);
        }
        return false;
    }

    public final int hashCode() {
        return this.renderablesHelper.b(this.a.hashCode(), this);
    }
}
