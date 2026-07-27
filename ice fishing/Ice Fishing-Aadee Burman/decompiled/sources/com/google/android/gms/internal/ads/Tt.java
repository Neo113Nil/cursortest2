package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class Tt {

    /* renamed from: a, reason: collision with root package name */
    public final int f27807a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27808b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27809c;

    public Tt(int i, int i6, boolean z3) {
        this.f27807a = i;
        this.f27808b = i6;
        this.f27809c = z3;
    }

    public static ArrayList a(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i = 0;
            int i6 = 0;
            boolean z3 = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i6 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z3 = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new Tt(i, i6, z3));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
