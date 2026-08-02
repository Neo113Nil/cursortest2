package com.nimbusds.jose.shaded.gson.internal.bind;

import androidx.camera.video.VideoCapture;
import com.nimbusds.jose.shaded.gson.Gson;
import com.nimbusds.jose.shaded.gson.TypeAdapter;
import com.nimbusds.jose.shaded.gson.TypeAdapterFactory;
import com.nimbusds.jose.shaded.gson.internal.GsonTypes;
import com.nimbusds.jose.shaded.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes5.dex */
public final class MapTypeAdapterFactory implements TypeAdapterFactory {
    public final /* synthetic */ int $r8$classId;
    public final VideoCapture.AnonymousClass3 constructorConstructor;

    public /* synthetic */ MapTypeAdapterFactory(VideoCapture.AnonymousClass3 anonymousClass3, int i) {
        this.$r8$classId = i;
        this.constructorConstructor = anonymousClass3;
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        Class cls;
        Type[] actualTypeArguments;
        int i = this.$r8$classId;
        VideoCapture.AnonymousClass3 anonymousClass3 = this.constructorConstructor;
        cls = Object.class;
        int i2 = 2;
        switch (i) {
            case 0:
                Type type2 = typeToken.f1030type;
                Class cls2 = typeToken.rawType;
                if (!Map.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls2)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    GsonTypes.checkArgument(Map.class.isAssignableFrom(cls2));
                    Type resolve = GsonTypes.resolve(type2, cls2, GsonTypes.getGenericSupertype(type2, cls2, Map.class), new HashMap());
                    actualTypeArguments = resolve instanceof ParameterizedType ? ((ParameterizedType) resolve).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                Type type4 = actualTypeArguments[1];
                return new EnumTypeAdapter(this, new EnumTypeAdapter(gson, (type3 == Boolean.TYPE || type3 == Boolean.class) ? TypeAdapters.BOOLEAN_AS_STRING : gson.getAdapter(new TypeToken(type3)), type3), new EnumTypeAdapter(gson, gson.getAdapter(new TypeToken(type4)), type4), anonymousClass3.get(typeToken, false));
            default:
                Type type5 = typeToken.f1030type;
                Class cls3 = typeToken.rawType;
                if (!Collection.class.isAssignableFrom(cls3)) {
                    return null;
                }
                if (type5 instanceof WildcardType) {
                    type5 = ((WildcardType) type5).getUpperBounds()[0];
                }
                GsonTypes.checkArgument(Collection.class.isAssignableFrom(cls3));
                Type resolve2 = GsonTypes.resolve(type5, cls3, GsonTypes.getGenericSupertype(type5, cls3, Collection.class), new HashMap());
                cls = resolve2 instanceof ParameterizedType ? ((ParameterizedType) resolve2).getActualTypeArguments()[0] : Object.class;
                return new ArrayTypeAdapter(i2, new EnumTypeAdapter(gson, gson.getAdapter(new TypeToken(cls)), cls), anonymousClass3.get(typeToken, false));
        }
    }
}
