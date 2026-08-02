package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class Tt {

    /* renamed from: a, reason: collision with root package name */
    public final int f28604a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28605b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28606c;

    public Tt(int i, int i4, boolean z6) {
        this.f28604a = i;
        this.f28605b = i4;
        this.f28606c = z6;
    }

    public static ArrayList a(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i = 0;
            int i4 = 0;
            boolean z6 = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i4 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z6 = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new Tt(i, i4, z6));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
