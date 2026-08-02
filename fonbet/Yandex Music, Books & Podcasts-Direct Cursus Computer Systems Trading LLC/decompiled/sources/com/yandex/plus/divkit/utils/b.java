package com.yandex.plus.divkit.utils;

import android.net.Uri;
import defpackage.e5b;
import defpackage.uct;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class b implements uct {
    public final /* synthetic */ int a;
    public final Object b;

    public b(int i) {
        this.a = i;
        switch (i) {
            case 1:
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                this.b = e5bVar;
                break;
            default:
                this.b = Unit.a;
                break;
        }
    }

    @Override // defpackage.uct
    public final Object a() {
        switch (this.a) {
            case 0:
                return (Unit) this.b;
            default:
                return (e5b) this.b;
        }
    }

    @Override // defpackage.uct
    public final boolean b(Object obj) {
        int i = this.a;
        obj.getClass();
        switch (i) {
            case 0:
                return (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof List) || (obj instanceof Map) || (obj instanceof Integer) || (obj instanceof Uri);
            default:
                return obj instanceof Map;
        }
    }
}
