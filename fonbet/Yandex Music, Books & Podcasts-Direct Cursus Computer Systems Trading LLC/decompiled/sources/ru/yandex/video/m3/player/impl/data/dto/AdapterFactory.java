package ru.yandex.video.m3.player.impl.data.dto;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import defpackage.qwp;
import defpackage.vwb;
import defpackage.xv7;
import defpackage.xz0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/video/m3/player/impl/data/dto/AdapterFactory;", "Lcom/google/gson/TypeAdapterFactory;", "<init>", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class AdapterFactory implements TypeAdapterFactory {
    public static boolean a(Type type, Class cls) {
        Type[] upperBounds;
        if (Intrinsics.d(type, cls)) {
            return true;
        }
        Type type2 = null;
        WildcardType wildcardType = type instanceof WildcardType ? (WildcardType) type : null;
        if (wildcardType != null && (upperBounds = wildcardType.getUpperBounds()) != null) {
            type2 = (Type) xz0.y(upperBounds);
        }
        return Intrinsics.d(type2, cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c9, code lost:
    
        if (a((java.lang.reflect.Type) r0, java.lang.Object.class) != false) goto L39;
     */
    @Override // com.google.gson.TypeAdapterFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TypeAdapter b(Gson gson, TypeToken typeToken) {
        TypeAdapter typeAdapter;
        Type[] actualTypeArguments;
        Class superclass;
        gson.getClass();
        typeToken.getClass();
        Class rawType = typeToken.getRawType();
        if (Enum.class.isAssignableFrom(rawType) && !Intrinsics.d(rawType, Enum.class)) {
            if (rawType != null) {
                Class cls = !rawType.isEnum() ? rawType : null;
                if (cls != null && (superclass = cls.getSuperclass()) != null) {
                    rawType = superclass;
                }
            }
            rawType.getClass();
            typeAdapter = new EnumTypeAdapter(rawType);
        } else if (xv7.class.equals(rawType)) {
            typeAdapter = new ObjectTypeAdapterWrapper(gson.f(TypeToken.get(Object.class)));
        } else {
            if (Map.class.isAssignableFrom(rawType)) {
                Type type = typeToken.getType();
                Class W = qwp.W(typeToken.getType());
                if (Properties.class.isAssignableFrom(W)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type instanceof WildcardType) {
                        type = ((WildcardType) type).getUpperBounds()[0];
                    }
                    vwb.K(Map.class.isAssignableFrom(W));
                    Type p0 = qwp.p0(type, W, qwp.P(type, W, Map.class), new HashMap());
                    actualTypeArguments = p0 instanceof ParameterizedType ? ((ParameterizedType) p0).getActualTypeArguments() : new Type[]{Object.class, Object.class};
                }
                if (actualTypeArguments != null) {
                    Object y = xz0.y(actualTypeArguments);
                    y.getClass();
                    if (a((Type) y, String.class)) {
                        Object K = xz0.K(actualTypeArguments);
                        K.getClass();
                    }
                    actualTypeArguments = null;
                    if (actualTypeArguments != null) {
                        typeAdapter = gson.g(this, new AdapterFactory$create$3$1());
                    }
                }
            }
            typeAdapter = null;
        }
        if (typeAdapter != null) {
            return typeAdapter;
        }
        return null;
    }
}
