package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public abstract class w5f {
    public static final Logger a = Logger.getLogger(w5f.class.getName());

    public static Object a(JsonReader jsonReader) {
        o2g.U("unexpected end of JSON", jsonReader.hasNext());
        switch (t5f.a[jsonReader.H0().ordinal()]) {
            case 1:
                jsonReader.b();
                ArrayList arrayList = new ArrayList();
                while (jsonReader.hasNext()) {
                    arrayList.add(a(jsonReader));
                }
                o2g.U("Bad token: " + jsonReader.getPath(), jsonReader.H0() == JsonToken.END_ARRAY);
                jsonReader.H();
                break;
            case 2:
                jsonReader.g();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (jsonReader.hasNext()) {
                    linkedHashMap.put(jsonReader.L(), a(jsonReader));
                }
                o2g.U("Bad token: " + jsonReader.getPath(), jsonReader.H0() == JsonToken.END_OBJECT);
                jsonReader.I();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                jsonReader.u0();
                break;
            default:
                b6e.w(jsonReader.getPath(), "Bad token: ");
                break;
        }
        return null;
    }
}
