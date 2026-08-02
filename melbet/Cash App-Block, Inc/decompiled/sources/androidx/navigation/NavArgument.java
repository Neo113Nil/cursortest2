package androidx.navigation;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Reflection;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class NavArgument {
    public final Object defaultValue;
    public final boolean isDefaultValuePresent;
    public final boolean isNullable;

    /* renamed from: type, reason: collision with root package name */
    public final NavType f901type;

    public NavArgument(NavType navType, boolean z, Object obj, boolean z2) {
        if (!navType.isNullableAllowed && z) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) navType.getName().concat(" does not allow nullable values"));
            throw null;
        }
        if (!z && z2 && obj == null) {
            a$$ExternalSyntheticBUOutline0.m("Argument with type ", navType.getName(), " has null value but is not nullable.");
            throw null;
        }
        this.f901type = navType;
        this.isNullable = z;
        this.defaultValue = obj;
        this.isDefaultValuePresent = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NavArgument.class != obj.getClass()) {
            return false;
        }
        NavArgument navArgument = (NavArgument) obj;
        if (this.isNullable != navArgument.isNullable || this.isDefaultValuePresent != navArgument.isDefaultValuePresent || !this.f901type.equals(navArgument.f901type)) {
            return false;
        }
        Object obj2 = navArgument.defaultValue;
        Object obj3 = this.defaultValue;
        return obj3 != null ? obj3.equals(obj2) : obj2 == null;
    }

    public final int hashCode() {
        int hashCode = ((((this.f901type.hashCode() * 31) + (this.isNullable ? 1 : 0)) * 31) + (this.isDefaultValuePresent ? 1 : 0)) * 31;
        Object obj = this.defaultValue;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Reflection.factory.getOrCreateKotlinClass(NavArgument.class).getSimpleName());
        sb.append(" Type: " + this.f901type);
        sb.append(" Nullable: " + this.isNullable);
        if (this.isDefaultValuePresent) {
            sb.append(" DefaultValue: " + this.defaultValue);
        }
        return sb.toString();
    }
}
