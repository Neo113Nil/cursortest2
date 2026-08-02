package defpackage;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.yandex.music.shared.phonoteka.synchronization.data.model.SyncResponseBlockListDto;
import defpackage.a73;
import defpackage.fxr;
import defpackage.tah;
import defpackage.v75;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class ej implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Set b;

    public /* synthetic */ ej(int i, Set set) {
        this.a = i;
        this.b = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ogo ogoVar = (ogo) obj;
                ogoVar.getClass();
                return new cma(this.b.contains(ogoVar) ? 4 : 0);
            default:
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                gsonBuilder.b(fxr.class, new JsonSerializer<fxr>() { // from class: com.yandex.music.shared.phonoteka.synchronization.data.model.SyncRequestDto$SyncRequestDtoJsonAdapter
                    @Override // com.google.gson.JsonSerializer
                    public final JsonElement b(Object obj2, Type type, JsonSerializationContext jsonSerializationContext) {
                        fxr fxrVar = (fxr) obj2;
                        fxrVar.getClass();
                        type.getClass();
                        jsonSerializationContext.getClass();
                        ArrayList arrayList = fxrVar.a;
                        int a = tah.a(v75.o(arrayList, 10));
                        if (a < 16) {
                            a = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                        for (Object obj3 : arrayList) {
                            linkedHashMap.put(((a73) obj3).getName(), obj3);
                        }
                        JsonElement b = jsonSerializationContext.b(linkedHashMap);
                        b.getClass();
                        return b;
                    }
                });
                gsonBuilder.b(SyncResponseBlockListDto.class, new SyncResponseBlockListDto.SyncResponseBlockListDtoJsonAdapter(this.b));
                return Unit.a;
        }
    }
}
