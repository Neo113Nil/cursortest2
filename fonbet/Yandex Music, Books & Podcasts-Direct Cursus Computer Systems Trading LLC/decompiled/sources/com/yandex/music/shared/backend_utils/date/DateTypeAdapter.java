package com.yandex.music.shared.backend_utils.date;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import defpackage.ern;
import defpackage.lm4;
import defpackage.qc7;
import defpackage.rc7;
import defpackage.sc7;
import defpackage.su4;
import defpackage.tc7;
import defpackage.tfs;
import defpackage.xq0;
import java.util.Date;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/music/shared/backend_utils/date/DateTypeAdapter;", "Ltc7;", "T", "Lcom/google/gson/TypeAdapter;", "shared-music-backend-utils"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class DateTypeAdapter<T extends tc7> extends TypeAdapter<T> {
    public static final DateTypeAdapter$Companion$factory$1 b = new TypeAdapterFactory() { // from class: com.yandex.music.shared.backend_utils.date.DateTypeAdapter$Companion$factory$1
        @Override // com.google.gson.TypeAdapterFactory
        public final TypeAdapter b(Gson gson, TypeToken typeToken) {
            gson.getClass();
            typeToken.getClass();
            if (tc7.class.isAssignableFrom(typeToken.getRawType())) {
                return new DateTypeAdapter(typeToken);
            }
            return null;
        }
    };
    public final TypeToken a;

    public DateTypeAdapter(TypeToken typeToken) {
        typeToken.getClass();
        this.a = typeToken;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) {
        String f0;
        Object obj;
        Object sc7Var;
        Object sc7Var2;
        Object sc7Var3;
        if ((jsonReader != null ? jsonReader.H0() : null) == JsonToken.NULL) {
            jsonReader.u0();
            return null;
        }
        if (jsonReader != null && (f0 = jsonReader.f0()) != null) {
            Class rawType = this.a.getRawType();
            if (qc7.class.isAssignableFrom(rawType)) {
                lm4 a = ern.a(qc7.class);
                if (a.equals(ern.a(qc7.class))) {
                    Date b2 = tfs.f.b(f0);
                    if (b2 == null) {
                        b2 = tfs.g.b(f0);
                    }
                    sc7Var3 = new qc7(b2, f0);
                } else if (a.equals(ern.a(rc7.class))) {
                    Date b3 = tfs.d.b(f0);
                    if (b3 == null) {
                        b3 = tfs.e.b(f0);
                    }
                    sc7Var3 = new rc7(b3, f0);
                } else {
                    if (!a.equals(ern.a(sc7.class))) {
                        xq0.x("Add this type to method");
                        return null;
                    }
                    sc7Var3 = new sc7(tfs.h.b(f0), f0);
                }
                obj = (qc7) sc7Var3;
            } else if (rc7.class.isAssignableFrom(rawType)) {
                lm4 a2 = ern.a(rc7.class);
                if (a2.equals(ern.a(qc7.class))) {
                    Date b4 = tfs.f.b(f0);
                    if (b4 == null) {
                        b4 = tfs.g.b(f0);
                    }
                    sc7Var2 = new qc7(b4, f0);
                } else if (a2.equals(ern.a(rc7.class))) {
                    Date b5 = tfs.d.b(f0);
                    if (b5 == null) {
                        b5 = tfs.e.b(f0);
                    }
                    sc7Var2 = new rc7(b5, f0);
                } else {
                    if (!a2.equals(ern.a(sc7.class))) {
                        xq0.x("Add this type to method");
                        return null;
                    }
                    sc7Var2 = new sc7(tfs.h.b(f0), f0);
                }
                obj = (rc7) sc7Var2;
            } else if (sc7.class.isAssignableFrom(rawType)) {
                lm4 a3 = ern.a(sc7.class);
                if (a3.equals(ern.a(qc7.class))) {
                    Date b6 = tfs.f.b(f0);
                    if (b6 == null) {
                        b6 = tfs.g.b(f0);
                    }
                    sc7Var = new qc7(b6, f0);
                } else if (a3.equals(ern.a(rc7.class))) {
                    Date b7 = tfs.d.b(f0);
                    if (b7 == null) {
                        b7 = tfs.e.b(f0);
                    }
                    sc7Var = new rc7(b7, f0);
                } else {
                    if (!a3.equals(ern.a(sc7.class))) {
                        xq0.x("Add this type to method");
                        return null;
                    }
                    sc7Var = new sc7(tfs.h.b(f0), f0);
                }
                obj = (sc7) sc7Var;
            } else {
                su4.s(2, null, "Register new RawDate type", null);
                obj = null;
            }
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) {
        tc7 tc7Var = (tc7) obj;
        if (jsonWriter != null) {
            jsonWriter.U0(tc7Var != null ? tc7Var.a : null);
        }
    }
}
