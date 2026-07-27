package C2;

import android.util.JsonWriter;

/* renamed from: C2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280m implements v2.e {

    /* renamed from: n, reason: collision with root package name */
    public String f390n;

    @Override // v2.e
    public /* synthetic */ void d(JsonWriter jsonWriter) {
        Object obj = v2.f.f41402b;
        jsonWriter.name("params").beginObject();
        String str = this.f390n;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }
}
