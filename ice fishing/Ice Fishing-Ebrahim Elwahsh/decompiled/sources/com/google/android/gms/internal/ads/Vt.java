package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class Vt {

    /* renamed from: a, reason: collision with root package name */
    public final int f28315a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28316b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28317c;

    public Vt(int i, int i4, boolean z8) {
        this.f28315a = i;
        this.f28316b = i4;
        this.f28317c = z8;
    }

    public static ArrayList a(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i = 0;
            int i4 = 0;
            boolean z8 = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i4 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z8 = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new Vt(i, i4, z8));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
