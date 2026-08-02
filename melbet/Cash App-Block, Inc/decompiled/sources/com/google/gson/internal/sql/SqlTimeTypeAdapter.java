package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes4.dex */
final class SqlTimeTypeAdapter extends TypeAdapter<Time> {
    static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            Class<? super T> rawType = typeToken.getRawType();
            if (rawType == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: format, reason: collision with root package name */
    private final DateFormat f1014format;

    private SqlTimeTypeAdapter() {
        this.f1014format = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read, reason: avoid collision after fix types in other method */
    public Time read2(JsonReader jsonReader) {
        Time time;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        synchronized (this) {
            TimeZone timeZone = this.f1014format.getTimeZone();
            try {
                try {
                    time = new Time(this.f1014format.parse(nextString).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException("Failed parsing '" + nextString + "' as SQL Time; at path " + jsonReader.getPreviousPath(), e);
                }
            } finally {
                this.f1014format.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Time time) {
        String format2;
        if (time == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            format2 = this.f1014format.format((Date) time);
        }
        jsonWriter.value(format2);
    }
}
