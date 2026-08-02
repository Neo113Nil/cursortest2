package ru.yandex.video.m3.player.impl.data.dto;

import com.google.gson.reflect.TypeToken;
import defpackage.j73;
import defpackage.jl40;
import defpackage.nl11;
import defpackage.ol11;
import defpackage.u3u;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\u0004\b\u0000\u0010\t2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/player/impl/data/dto/AdapterFactory;", "Lol11;", "<init>", "()V", "Ljava/lang/reflect/Type;", "type", "", "isType", "(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z", "T", "Lu3u;", "gson", "Lcom/google/gson/reflect/TypeToken;", "Lnl11;", "create", "(Lu3u;Lcom/google/gson/reflect/TypeToken;)Lnl11;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdapterFactory implements ol11 {
    public static final int $stable = 0;

    private final boolean isType(Type type, Type type2) {
        Type[] upperBounds;
        if (jl40.l(type, type2)) {
            return true;
        }
        Type type3 = null;
        WildcardType wildcardType = type instanceof WildcardType ? (WildcardType) type : null;
        if (wildcardType != null && (upperBounds = wildcardType.getUpperBounds()) != null) {
            type3 = (Type) j73.C(upperBounds);
        }
        return jl40.l(type3, type2);
    }

    @Override // defpackage.ol11
    public <T> nl11 create(u3u gson, TypeToken<T> type) {
        nl11 nl11Var;
        Type[] mapKeyAndValueTypes;
        Class<? super Object> superclass;
        Class<? super T> rawType = type.getRawType();
        if (Enum.class.isAssignableFrom(rawType) && !jl40.l(rawType, Enum.class)) {
            if (rawType != null) {
                Class<? super T> cls = !rawType.isEnum() ? rawType : null;
                if (cls != null && (superclass = cls.getSuperclass()) != null) {
                    rawType = superclass;
                }
            }
            nl11Var = new EnumTypeAdapter(rawType);
        } else if (DelegateObject.class.equals(rawType)) {
            nl11Var = new ObjectTypeAdapterWrapper(gson.f(Object.class));
        } else {
            if (Map.class.isAssignableFrom(rawType) && (mapKeyAndValueTypes = GsonTypes.getMapKeyAndValueTypes(type.getType(), GsonTypes.getRawType(type.getType()))) != null) {
                if (!isType((Type) j73.C(mapKeyAndValueTypes), String.class) || !isType((Type) j73.O(mapKeyAndValueTypes), Object.class)) {
                    mapKeyAndValueTypes = null;
                }
                if (mapKeyAndValueTypes != null) {
                    nl11Var = gson.g(this, new TypeToken<Map<String, ? extends DelegateObject>>() { // from class: ru.yandex.video.m3.player.impl.data.dto.AdapterFactory$create$3$1
                    });
                }
            }
            nl11Var = null;
        }
        if (nl11Var != null) {
            return nl11Var;
        }
        return null;
    }
}
