package kotlinx.serialization.json;

import defpackage.gdx;
import defpackage.gsq0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@gsq0(with = gdx.class)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/json/d;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JsonNull extends d {
    public static final JsonNull INSTANCE = new JsonNull();

    @Override // kotlinx.serialization.json.d
    public final String a() {
        return "null";
    }

    @Override // kotlinx.serialization.json.d
    public final boolean b() {
        return false;
    }

    public final KSerializer serializer() {
        return gdx.a;
    }
}
