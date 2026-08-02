package com.yandex.plus.plaquesdk.plaque.api.models;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements s {
    public final String a;
    public final c0 b;
    public final a c;
    public final com.yandex.plus.plaquesdk.plaque.api.models.display.x d;
    public final w e;
    public final boolean f;

    public u(String str, c0 c0Var, a aVar, com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar, w wVar, boolean z) {
        str.getClass();
        aVar.getClass();
        xVar.getClass();
        wVar.getClass();
        this.a = str;
        this.b = c0Var;
        this.c = aVar;
        this.d = xVar;
        this.e = wVar;
        this.f = z;
    }

    @Override // com.yandex.plus.plaquesdk.plaque.api.models.x
    public final boolean b(x xVar) {
        xVar.getClass();
        if (!(xVar instanceof u)) {
            return false;
        }
        u uVar = (u) xVar;
        return Intrinsics.d(this.d, uVar.d) && Intrinsics.d(this.e, uVar.e);
    }

    @Override // com.yandex.plus.plaquesdk.plaque.api.models.x
    public final com.yandex.plus.plaquesdk.plaque.api.models.display.x c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.a, uVar.a) && Intrinsics.d(this.b, uVar.b) && Intrinsics.d(this.c, uVar.c) && Intrinsics.d(this.d, uVar.d) && Intrinsics.d(this.e, uVar.e) && this.f == uVar.f;
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
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (c0Var == null ? 0 : c0Var.hashCode())) * 31)) * 31)) * 31)) * 31);
    }

    @Override // com.yandex.plus.plaquesdk.plaque.api.models.x
    public final c0 q() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SwitchMicroWidgetModel(id=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        sb.append(this.c);
        sb.append(", widgetDisplaySettings=");
        sb.append(this.d);
        sb.append(", text=");
        sb.append(this.e);
        sb.append(", switchState=");
        return dfi.j(sb, this.f, ')');
    }
}
