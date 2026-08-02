package com.nimbusds.jose.shaded.gson.internal.sql;

import com.nimbusds.jose.shaded.gson.JsonSyntaxException;
import com.nimbusds.jose.shaded.gson.TypeAdapter;
import com.nimbusds.jose.shaded.gson.internal.bind.EnumTypeAdapter;
import com.nimbusds.jose.shaded.gson.stream.JsonReader;
import com.nimbusds.jose.shaded.gson.stream.JsonWriter;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* loaded from: classes5.dex */
public final class SqlDateTypeAdapter extends TypeAdapter {
    public static final EnumTypeAdapter.AnonymousClass1 FACTORY = new EnumTypeAdapter.AnonymousClass1(4);
    public static final EnumTypeAdapter.AnonymousClass1 FACTORY$1 = new EnumTypeAdapter.AnonymousClass1(5);
    public static final EnumTypeAdapter.AnonymousClass1 FACTORY$2 = new EnumTypeAdapter.AnonymousClass1(6);
    public final /* synthetic */ int $r8$classId;

    /* renamed from: format, reason: collision with root package name */
    public final Object f1029format;

    public SqlDateTypeAdapter(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.f1029format = new SimpleDateFormat("hh:mm:ss a");
                break;
            default:
                this.f1029format = new SimpleDateFormat("MMM d, yyyy");
                break;
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) {
        TimeZone timeZone;
        Date date;
        Time time;
        switch (this.$r8$classId) {
            case 0:
                if (jsonReader.peek() == 9) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                synchronized (this) {
                    timeZone = ((SimpleDateFormat) this.f1029format).getTimeZone();
                    try {
                        try {
                            date = new Date(((SimpleDateFormat) this.f1029format).parse(nextString).getTime());
                        } catch (ParseException e) {
                            throw new JsonSyntaxException("Failed parsing '" + nextString + "' as SQL Date; at path " + jsonReader.getPath(true), e);
                        }
                    } finally {
                    }
                }
                return date;
            case 1:
                if (jsonReader.peek() == 9) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString2 = jsonReader.nextString();
                synchronized (this) {
                    timeZone = ((SimpleDateFormat) this.f1029format).getTimeZone();
                    try {
                        try {
                            time = new Time(((SimpleDateFormat) this.f1029format).parse(nextString2).getTime());
                        } finally {
                        }
                    } catch (ParseException e2) {
                        throw new JsonSyntaxException("Failed parsing '" + nextString2 + "' as SQL Time; at path " + jsonReader.getPath(true), e2);
                    }
                }
                return time;
            default:
                java.util.Date date2 = (java.util.Date) ((TypeAdapter) this.f1029format).read(jsonReader);
                if (date2 != null) {
                    return new Timestamp(date2.getTime());
                }
                return null;
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        String format2;
        String format3;
        switch (this.$r8$classId) {
            case 0:
                Date date = (Date) obj;
                if (date == null) {
                    jsonWriter.nullValue();
                    return;
                }
                synchronized (this) {
                    format2 = ((SimpleDateFormat) this.f1029format).format((java.util.Date) date);
                }
                jsonWriter.value(format2);
                return;
            case 1:
                Time time = (Time) obj;
                if (time == null) {
                    jsonWriter.nullValue();
                    return;
                }
                synchronized (this) {
                    format3 = ((SimpleDateFormat) this.f1029format).format((java.util.Date) time);
                }
                jsonWriter.value(format3);
                return;
            default:
                ((TypeAdapter) this.f1029format).write(jsonWriter, (Timestamp) obj);
                return;
        }
    }

    public SqlDateTypeAdapter(TypeAdapter typeAdapter) {
        this.$r8$classId = 2;
        this.f1029format = typeAdapter;
    }
}
