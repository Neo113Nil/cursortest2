package ru.yandex.taxi.map;

import com.yandex.runtime.image.ImageProvider;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public final class WalkingRouteUiState {
    public final List a;
    public final String b;
    public final float c;
    public final Float d;
    public final ImageProvider e;
    public final ImageProvider f;
    public final Type g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/map/WalkingRouteUiState$Type;", "", "UNDERGROUND", "GROUND", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type GROUND;
        public static final Type UNDERGROUND;

        static {
            Type type = new Type("UNDERGROUND", 0);
            UNDERGROUND = type;
            Type type2 = new Type("GROUND", 1);
            GROUND = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ WalkingRouteUiState(List list, String str, float f, Float f2, ImageProvider imageProvider, ImageProvider imageProvider2, Type type, int i) {
        this((i & 1) != 0 ? EmptyList.a : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 1.0f : f, (i & 8) != 0 ? null : f2, (i & 16) != 0 ? null : imageProvider, (i & 32) == 0 ? imageProvider2 : null, (i & 64) != 0 ? Type.GROUND : type);
    }

    public final ImageProvider a() {
        return this.f;
    }

    public final List b() {
        return this.a;
    }

    public final Float c() {
        return this.d;
    }

    public final ImageProvider d() {
        return this.e;
    }

    public final Type e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalkingRouteUiState)) {
            return false;
        }
        WalkingRouteUiState walkingRouteUiState = (WalkingRouteUiState) obj;
        return jl40.l(this.a, walkingRouteUiState.a) && jl40.l(this.b, walkingRouteUiState.b) && Float.compare(this.c, walkingRouteUiState.c) == 0 && jl40.l(this.d, walkingRouteUiState.d) && jl40.l(this.e, walkingRouteUiState.e) && jl40.l(this.f, walkingRouteUiState.f) && this.g == walkingRouteUiState.g;
    }

    public final String f() {
        return this.b;
    }

    public final int hashCode() {
        int c = g8e.c(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31);
        Float f = this.d;
        int hashCode = (c + (f == null ? 0 : f.hashCode())) * 31;
        ImageProvider imageProvider = this.e;
        int hashCode2 = (hashCode + (imageProvider == null ? 0 : imageProvider.hashCode())) * 31;
        ImageProvider imageProvider2 = this.f;
        return this.g.hashCode() + ((hashCode2 + (imageProvider2 != null ? imageProvider2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder s = xvz.s("WalkingRouteUiState(route=", this.a, ", walkTime=", this.b, ", zIndex=");
        s.append(this.c);
        s.append(", routeInfoZIndex=");
        s.append(this.d);
        s.append(", startPoint=");
        s.append(this.e);
        s.append(", endPoint=");
        s.append(this.f);
        s.append(", type=");
        s.append(this.g);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }

    public WalkingRouteUiState(List list, String str, float f, Float f2, ImageProvider imageProvider, ImageProvider imageProvider2, Type type) {
        this.a = list;
        this.b = str;
        this.c = f;
        this.d = f2;
        this.e = imageProvider;
        this.f = imageProvider2;
        this.g = type;
    }

    public WalkingRouteUiState() {
        this(null, null, 0.0f, null, null, null, null, HProv.PP_VERSION_TIMESTAMP);
    }
}
