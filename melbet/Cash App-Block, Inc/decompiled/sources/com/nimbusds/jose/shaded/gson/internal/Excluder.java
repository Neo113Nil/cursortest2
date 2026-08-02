package com.nimbusds.jose.shaded.gson.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.VideoCapture;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.nimbusds.jose.shaded.gson.Gson;
import com.nimbusds.jose.shaded.gson.TypeAdapter;
import com.nimbusds.jose.shaded.gson.TypeAdapterFactory;
import com.nimbusds.jose.shaded.gson.annotations.JsonAdapter;
import com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters;
import com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper;
import com.nimbusds.jose.shaded.gson.reflect.TypeToken;
import com.nimbusds.jose.shaded.gson.stream.JsonReader;
import com.nimbusds.jose.shaded.gson.stream.JsonWriter;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import operations.ComparingOperation;

/* loaded from: classes5.dex */
public final class Excluder implements TypeAdapterFactory, Cloneable {
    public static final Excluder DEFAULT;
    public List deserializationStrategies;
    public List serializationStrategies;

    static {
        Excluder excluder = new Excluder();
        List list = Collections.EMPTY_LIST;
        excluder.serializationStrategies = list;
        excluder.deserializationStrategies = list;
        DEFAULT = excluder;
    }

    public final Object clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            a$$ExternalSyntheticBUOutline0.m$1(e);
            return null;
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
    public final TypeAdapter create(final Gson gson, final TypeToken typeToken) {
        Class cls = typeToken.rawType;
        final boolean excludeClass = excludeClass(cls, true);
        final boolean excludeClass2 = excludeClass(cls, false);
        if (excludeClass || excludeClass2) {
            return new TypeAdapter() { // from class: com.nimbusds.jose.shaded.gson.internal.Excluder.1
                public volatile TypeAdapter delegate;

                /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
                
                    if (r8 == r2) goto L25;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x0063, code lost:
                
                    if (r8 == r2) goto L25;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0087 A[SYNTHETIC] */
                @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object read(JsonReader jsonReader) {
                    Iterator it;
                    if (excludeClass2) {
                        jsonReader.skipValue();
                        return null;
                    }
                    TypeAdapter typeAdapter = this.delegate;
                    if (typeAdapter == null) {
                        Gson gson2 = gson;
                        Excluder excluder = Excluder.this;
                        TypeToken typeToken2 = typeToken;
                        TypeAdapters.AnonymousClass29 anonymousClass29 = gson2.jsonAdapterFactory;
                        anonymousClass29.getClass();
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) anonymousClass29.val$typeAdapter;
                        if (excluder != TypeAdapters.AnonymousClass29.TREE_TYPE_CLASS_DUMMY_FACTORY) {
                            Class cls2 = typeToken2.rawType;
                            TypeAdapterFactory typeAdapterFactory = (TypeAdapterFactory) concurrentHashMap.get(cls2);
                            if (typeAdapterFactory == null) {
                                JsonAdapter jsonAdapter = (JsonAdapter) cls2.getAnnotation(JsonAdapter.class);
                                if (jsonAdapter != null) {
                                    Class value = jsonAdapter.value();
                                    if (TypeAdapterFactory.class.isAssignableFrom(value)) {
                                        TypeAdapterFactory typeAdapterFactory2 = (TypeAdapterFactory) ((VideoCapture.AnonymousClass3) anonymousClass29.val$type).get(new TypeToken(value), true).construct();
                                        TypeAdapterFactory typeAdapterFactory3 = (TypeAdapterFactory) concurrentHashMap.putIfAbsent(cls2, typeAdapterFactory2);
                                        if (typeAdapterFactory3 != null) {
                                            typeAdapterFactory2 = typeAdapterFactory3;
                                        }
                                    }
                                }
                                it = gson2.factories.iterator();
                                boolean z = false;
                                while (true) {
                                    if (!it.hasNext()) {
                                        TypeAdapterFactory typeAdapterFactory4 = (TypeAdapterFactory) it.next();
                                        if (z) {
                                            TypeAdapter create = typeAdapterFactory4.create(gson2, typeToken2);
                                            if (create != null) {
                                                typeAdapter = create;
                                                break;
                                            }
                                        } else if (typeAdapterFactory4 == excluder) {
                                            z = true;
                                        }
                                    } else {
                                        if (z) {
                                            OptionalProvider$$ExternalSyntheticLambda0.m((Object) typeToken2, "GSON cannot serialize or deserialize ");
                                            return null;
                                        }
                                        typeAdapter = gson2.getAdapter(typeToken2);
                                    }
                                }
                                this.delegate = typeAdapter;
                            }
                        }
                        excluder = anonymousClass29;
                        it = gson2.factories.iterator();
                        boolean z2 = false;
                        while (true) {
                            if (!it.hasNext()) {
                            }
                        }
                        this.delegate = typeAdapter;
                    }
                    return typeAdapter.read(jsonReader);
                }

                /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
                
                    if (r7 == r1) goto L25;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x0062, code lost:
                
                    if (r7 == r1) goto L25;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0086 A[SYNTHETIC] */
                @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void write(JsonWriter jsonWriter, Object obj) {
                    Iterator it;
                    if (excludeClass) {
                        jsonWriter.nullValue();
                        return;
                    }
                    TypeAdapter typeAdapter = this.delegate;
                    if (typeAdapter == null) {
                        Gson gson2 = gson;
                        Excluder excluder = Excluder.this;
                        TypeToken typeToken2 = typeToken;
                        TypeAdapters.AnonymousClass29 anonymousClass29 = gson2.jsonAdapterFactory;
                        anonymousClass29.getClass();
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) anonymousClass29.val$typeAdapter;
                        if (excluder != TypeAdapters.AnonymousClass29.TREE_TYPE_CLASS_DUMMY_FACTORY) {
                            Class cls2 = typeToken2.rawType;
                            TypeAdapterFactory typeAdapterFactory = (TypeAdapterFactory) concurrentHashMap.get(cls2);
                            if (typeAdapterFactory == null) {
                                JsonAdapter jsonAdapter = (JsonAdapter) cls2.getAnnotation(JsonAdapter.class);
                                if (jsonAdapter != null) {
                                    Class value = jsonAdapter.value();
                                    if (TypeAdapterFactory.class.isAssignableFrom(value)) {
                                        TypeAdapterFactory typeAdapterFactory2 = (TypeAdapterFactory) ((VideoCapture.AnonymousClass3) anonymousClass29.val$type).get(new TypeToken(value), true).construct();
                                        TypeAdapterFactory typeAdapterFactory3 = (TypeAdapterFactory) concurrentHashMap.putIfAbsent(cls2, typeAdapterFactory2);
                                        if (typeAdapterFactory3 != null) {
                                            typeAdapterFactory2 = typeAdapterFactory3;
                                        }
                                    }
                                }
                                it = gson2.factories.iterator();
                                boolean z = false;
                                while (true) {
                                    if (!it.hasNext()) {
                                        TypeAdapterFactory typeAdapterFactory4 = (TypeAdapterFactory) it.next();
                                        if (z) {
                                            TypeAdapter create = typeAdapterFactory4.create(gson2, typeToken2);
                                            if (create != null) {
                                                typeAdapter = create;
                                                break;
                                            }
                                        } else if (typeAdapterFactory4 == excluder) {
                                            z = true;
                                        }
                                    } else {
                                        if (z) {
                                            OptionalProvider$$ExternalSyntheticLambda0.m((Object) typeToken2, "GSON cannot serialize or deserialize ");
                                            return;
                                        }
                                        typeAdapter = gson2.getAdapter(typeToken2);
                                    }
                                }
                                this.delegate = typeAdapter;
                            }
                        }
                        excluder = anonymousClass29;
                        it = gson2.factories.iterator();
                        boolean z2 = false;
                        while (true) {
                            if (!it.hasNext()) {
                            }
                        }
                        this.delegate = typeAdapter;
                    }
                    typeAdapter.write(jsonWriter, obj);
                }
            };
        }
        return null;
    }

    public final boolean excludeClass(Class cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            ComparingOperation.DefaultImpls defaultImpls = ReflectionHelper.RECORD_HELPER;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z ? this.serializationStrategies : this.deserializationStrategies).iterator();
        if (it.hasNext()) {
            throw Recorder$$ExternalSyntheticOutline2.m(it);
        }
        return false;
    }
}
