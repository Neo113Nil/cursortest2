package com.yandex.plus.plaquesdk.plaque.api.models;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements s {
    public final String a;
    public final c0 b;
    public final a c;
    public final com.yandex.plus.plaquesdk.plaque.api.models.display.x d;
    public final w e;
    public final com.yandex.plus.core.android.extensions.g f;

    public v(String str, c0 c0Var, a aVar, com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar, w wVar, com.yandex.plus.core.android.extensions.f fVar) {
        str.getClass();
        aVar.getClass();
        xVar.getClass();
        wVar.getClass();
        this.a = str;
        this.b = c0Var;
        this.c = aVar;
        this.d = xVar;
        this.e = wVar;
        this.f = fVar;
    }

    @Override // com.yandex.plus.plaquesdk.plaque.api.models.x
    public final boolean b(x xVar) {
        xVar.getClass();
        if (!(xVar instanceof v)) {
            return false;
        }
        v vVar = (v) xVar;
        return Intrinsics.d(this.d, vVar.d) && Intrinsics.d(this.e, vVar.e) && Intrinsics.d(this.f, vVar.f);
    }

    @Override // com.yandex.plus.plaquesdk.plaque.api.models.x
    public final com.yandex.plus.plaquesdk.plaque.api.models.display.x c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.a, vVar.a) && Intrinsics.d(this.b, vVar.b) && Intrinsics.d(this.c, vVar.c) && Intrinsics.d(this.d, vVar.d) && Intrinsics.d(this.e, vVar.e) && Intrinsics.d(this.f, vVar.f);
    }

    @Override // com.yandex.plus.plaquesdk.plaque.api.models.x
    public final a getContentDescription() {
        return this.c;
    }

    @Override // com.yandex.plus.plaquesdk.plaque.api.models.x
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c0 c0Var = this.b;
        int hashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (c0Var == null ? 0 : c0Var.hashCode())) * 31)) * 31)) * 31)) * 31;
        com.yandex.plus.core.android.extensions.g gVar = this.f;
        return hashCode2 + (gVar != null ? gVar.hashCode() : 0);
    }

    @Override // com.yandex.plus.plaquesdk.plaque.api.models.x
    public final c0 q() {
        return this.b;
    }

    public final String toString() {
        return "TextMicroWidgetModel(id=" + this.a + ", action=" + this.b + ", contentDescription=" + this.c + ", widgetDisplaySettings=" + this.d + ", text=" + this.e + ", lineHeight=" + this.f + ')';
    }
}
