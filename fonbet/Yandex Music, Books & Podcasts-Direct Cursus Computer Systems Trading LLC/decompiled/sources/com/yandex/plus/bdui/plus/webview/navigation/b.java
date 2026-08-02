package com.yandex.plus.bdui.plus.webview.navigation;

import android.net.Uri;
import com.yandex.plus.bdui.plus.action.y;
import com.yandex.plus.core.reflect.NotTraversableField;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public abstract class b {

    @NotTraversableField
    @NotNull
    private final y renderablesHelper;

    public b(y yVar) {
        yVar.getClass();
        this.renderablesHelper = yVar;
    }

    public abstract String a();

    public abstract String b();

    public abstract Uri c();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.renderablesHelper.a(this, obj);
    }

    public int hashCode() {
        return this.renderablesHelper.b(0, this);
    }
}
