package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.Strictness;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.util.Optional;

/* loaded from: classes5.dex */
public final class crd implements vj6 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public crd(Gson gson, TypeAdapter typeAdapter) {
        this.b = typeAdapter;
    }

    @Override // defpackage.vj6
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                o3o o3oVar = (o3o) obj;
                JsonReader jsonReader = new JsonReader(o3oVar.b());
                jsonReader.O0(Strictness.b);
                try {
                    Object b = ((TypeAdapter) this.b).b(jsonReader);
                    if (jsonReader.H0() == JsonToken.END_DOCUMENT) {
                        return b;
                    }
                    throw new JsonIOException("JSON document was not fully consumed.");
                } finally {
                    o3oVar.close();
                }
            default:
                return Optional.ofNullable(((vj6) this.b).a((o3o) obj));
        }
    }

    public crd(vj6 vj6Var) {
        this.b = vj6Var;
    }
}
