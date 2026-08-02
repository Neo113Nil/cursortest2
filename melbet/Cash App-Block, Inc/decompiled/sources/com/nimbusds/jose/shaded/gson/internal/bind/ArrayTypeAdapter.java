package com.nimbusds.jose.shaded.gson.internal.bind;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.shaded.gson.Gson;
import com.nimbusds.jose.shaded.gson.JsonSyntaxException;
import com.nimbusds.jose.shaded.gson.TypeAdapter;
import com.nimbusds.jose.shaded.gson.internal.JavaVersion;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.nimbusds.jose.shaded.gson.internal.bind.EnumTypeAdapter;
import com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters;
import com.nimbusds.jose.shaded.gson.internal.bind.util.ISO8601Utils;
import com.nimbusds.jose.shaded.gson.stream.JsonReader;
import com.nimbusds.jose.shaded.gson.stream.JsonWriter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* loaded from: classes5.dex */
public final class ArrayTypeAdapter extends TypeAdapter {
    public final /* synthetic */ int $r8$classId;
    public final Object componentType;
    public final Object componentTypeAdapter;
    public static final EnumTypeAdapter.AnonymousClass1 FACTORY = new EnumTypeAdapter.AnonymousClass1(1);
    public static final EnumTypeAdapter.AnonymousClass1 DEFAULT_STYLE_FACTORY = new EnumTypeAdapter.AnonymousClass1(2);

    public ArrayTypeAdapter(DefaultDateTypeAdapter$DateType defaultDateTypeAdapter$DateType, int i, int i2) {
        String str;
        String str2;
        this.$r8$classId = 1;
        ArrayList arrayList = new ArrayList();
        this.componentTypeAdapter = arrayList;
        Objects.requireNonNull(defaultDateTypeAdapter$DateType);
        this.componentType = defaultDateTypeAdapter$DateType;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (JavaVersion.majorJavaVersion >= 9) {
            StringBuilder sb = new StringBuilder();
            if (i == 0) {
                str = "EEEE, MMMM d, yyyy";
            } else if (i == 1) {
                str = "MMMM d, yyyy";
            } else if (i == 2) {
                str = "MMM d, yyyy";
            } else {
                if (i != 3) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unknown DateFormat style: "));
                    throw null;
                }
                str = "M/d/yy";
            }
            sb.append(str);
            sb.append(" ");
            if (i2 == 0 || i2 == 1) {
                str2 = "h:mm:ss a z";
            } else if (i2 == 2) {
                str2 = "h:mm:ss a";
            } else {
                if (i2 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Unknown DateFormat style: "));
                    throw null;
                }
                str2 = "h:mm a";
            }
            sb.append(str2);
            arrayList.add(new SimpleDateFormat(sb.toString(), locale));
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) {
        Date parse;
        Collection collection = null;
        switch (this.$r8$classId) {
            case 0:
                Class cls = (Class) this.componentType;
                if (jsonReader.peek() == 9) {
                    jsonReader.nextNull();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(((TypeAdapter) ((EnumTypeAdapter) this.componentTypeAdapter).stringToConstant).read(jsonReader));
                }
                jsonReader.endArray();
                int size = arrayList.size();
                if (!cls.isPrimitive()) {
                    return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
                }
                Object newInstance = Array.newInstance((Class<?>) cls, size);
                for (int i = 0; i < size; i++) {
                    Array.set(newInstance, i, arrayList.get(i));
                }
                return newInstance;
            case 1:
                if (jsonReader.peek() == 9) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                synchronized (((ArrayList) this.componentTypeAdapter)) {
                    try {
                        Iterator it = ((ArrayList) this.componentTypeAdapter).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                DateFormat dateFormat = (DateFormat) it.next();
                                TimeZone timeZone = dateFormat.getTimeZone();
                                try {
                                    parse = dateFormat.parse(nextString);
                                    dateFormat.setTimeZone(timeZone);
                                } catch (ParseException unused) {
                                    dateFormat.setTimeZone(timeZone);
                                } catch (Throwable th) {
                                    dateFormat.setTimeZone(timeZone);
                                    throw th;
                                }
                            } else {
                                try {
                                    parse = ISO8601Utils.parse(nextString, new ParsePosition(0));
                                } catch (ParseException e) {
                                    StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Failed parsing '", nextString, "' as Date; at path ");
                                    m3m.append(jsonReader.getPath(true));
                                    throw new JsonSyntaxException(m3m.toString(), e);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return ((DefaultDateTypeAdapter$DateType) this.componentType).deserialize(parse);
            case 2:
                if (jsonReader.peek() == 9) {
                    jsonReader.nextNull();
                } else {
                    collection = (Collection) ((ObjectConstructor) this.componentType).construct();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        collection.add(((TypeAdapter) ((EnumTypeAdapter) this.componentTypeAdapter).stringToConstant).read(jsonReader));
                    }
                    jsonReader.endArray();
                }
                return collection;
            default:
                Class cls2 = (Class) this.componentType;
                Object read = ((TypeAdapter) ((TypeAdapters.AnonymousClass29) this.componentTypeAdapter).val$typeAdapter).read(jsonReader);
                if (read == null || cls2.isInstance(read)) {
                    return read;
                }
                throw new JsonSyntaxException("Expected a " + cls2.getName() + " but was " + read.getClass().getName() + "; at path " + jsonReader.getPath(true));
        }
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 1:
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.componentTypeAdapter).get(0);
                if (dateFormat instanceof SimpleDateFormat) {
                    return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
                }
                return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
            default:
                return super.toString();
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        String format2;
        switch (this.$r8$classId) {
            case 0:
                if (obj == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginArray();
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    ((EnumTypeAdapter) this.componentTypeAdapter).write(jsonWriter, Array.get(obj, i));
                }
                jsonWriter.endArray();
                return;
            case 1:
                Date date = (Date) obj;
                if (date == null) {
                    jsonWriter.nullValue();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.componentTypeAdapter).get(0);
                synchronized (((ArrayList) this.componentTypeAdapter)) {
                    format2 = dateFormat.format(date);
                }
                jsonWriter.value(format2);
                return;
            case 2:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginArray();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((EnumTypeAdapter) this.componentTypeAdapter).write(jsonWriter, it.next());
                }
                jsonWriter.endArray();
                return;
            default:
                ((TypeAdapter) ((TypeAdapters.AnonymousClass29) this.componentTypeAdapter).val$typeAdapter).write(jsonWriter, obj);
                return;
        }
    }

    public ArrayTypeAdapter(Gson gson, TypeAdapter typeAdapter, Class cls) {
        this.$r8$classId = 0;
        this.componentTypeAdapter = new EnumTypeAdapter(gson, typeAdapter, cls);
        this.componentType = cls;
    }

    public /* synthetic */ ArrayTypeAdapter(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.componentTypeAdapter = obj;
        this.componentType = obj2;
    }
}
