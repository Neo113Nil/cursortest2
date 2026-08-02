package com.google.firebase.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class Dependency {
    public final Qualified anInterface;
    public final int injection;

    /* renamed from: type, reason: collision with root package name */
    public final int f1005type;

    public Dependency(Qualified qualified, int i, int i2) {
        this.anInterface = qualified;
        this.f1005type = i;
        this.injection = i2;
    }

    public static Dependency required(Class cls) {
        return new Dependency(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Dependency)) {
            return false;
        }
        Dependency dependency = (Dependency) obj;
        return this.anInterface.equals(dependency.anInterface) && this.f1005type == dependency.f1005type && this.injection == dependency.injection;
    }

    public final int hashCode() {
        return this.injection ^ ((((this.anInterface.hashCode() ^ 1000003) * 1000003) ^ this.f1005type) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.anInterface);
        sb.append(", type=");
        int i = this.f1005type;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.injection;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                a$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Unsupported injection: "));
                return null;
            }
            str = "deferred";
        }
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, str, "}");
    }

    public Dependency(int i, int i2, Class cls) {
        this(Qualified.unqualified(cls), i, i2);
    }
}
