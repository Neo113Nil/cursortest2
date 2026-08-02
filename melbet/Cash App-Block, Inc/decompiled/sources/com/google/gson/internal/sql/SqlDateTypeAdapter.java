package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* loaded from: classes4.dex */
final class SqlDateTypeAdapter extends TypeAdapter<Date> {
    static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            Class<? super T> rawType = typeToken.getRawType();
            if (rawType == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: format, reason: collision with root package name */
    private final DateFormat f1013format;

    private SqlDateTypeAdapter() {
        this.f1013format = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read, reason: avoid collision after fix types in other method */
    public Date read2(JsonReader jsonReader) {
        Date date;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        synchronized (this) {
            TimeZone timeZone = this.f1013format.getTimeZone();
            try {
                try {
                    date = new Date(this.f1013format.parse(nextString).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException("Failed parsing '" + nextString + "' as SQL Date; at path " + jsonReader.getPreviousPath(), e);
                }
            } finally {
                this.f1013format.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Date date) {
        String format2;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            format2 = this.f1013format.format((java.util.Date) date);
        }
        jsonWriter.value(format2);
    }
}
