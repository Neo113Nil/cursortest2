package defpackage;

import com.google.gson.JsonObject;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.experiments.impl.remote.ExperimentInfoDto;
import com.yandex.music.shared.experiments.impl.remote.ExperimentsApi;
import java.util.LinkedHashMap;
import java.util.Map;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class lyb {
    public final ExperimentsApi a;

    public lyb(ExperimentsApi experimentsApi) {
        experimentsApi.getClass();
        this.a = experimentsApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        kyb kybVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof kyb) {
            kybVar = (kyb) cg6Var;
            int i2 = kybVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kybVar.l = i2 - Integer.MIN_VALUE;
                Object obj = kybVar.j;
                nm6 nm6Var = nm6.a;
                i = kybVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<Map<String, ExperimentInfoDto>>> a = this.a.a();
                    kybVar.l = 1;
                    obj = swf.N(a, kybVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (biiVar instanceof aii) {
                    if (!(biiVar instanceof xhi)) {
                        if (biiVar instanceof yhi) {
                            yhi yhiVar = (yhi) biiVar;
                            return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                        }
                        if (biiVar instanceof zhi) {
                            return uwf.J((zhi) biiVar);
                        }
                        b6e.s();
                        return null;
                    }
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    if (name == null) {
                        name = "";
                    }
                    String message = musicBackendInvocationError.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    return new kj6(i3, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
                }
                Map map = (Map) ((aii) biiVar).a;
                map.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (key != null && value != null) {
                        linkedHashMap3.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                    String str = (String) entry2.getKey();
                    ExperimentInfoDto experimentInfoDto = (ExperimentInfoDto) entry2.getValue();
                    String value2 = experimentInfoDto.getValue();
                    if (value2 != null) {
                        linkedHashMap.put(str, value2);
                    }
                    JsonObject details = experimentInfoDto.getDetails();
                    if (details != null) {
                        linkedHashMap2.put(str, new jxb(details));
                    }
                }
                return new qj6(new yxb(linkedHashMap, linkedHashMap2));
            }
        }
        kybVar = new kyb(this, cg6Var);
        Object obj2 = kybVar.j;
        nm6 nm6Var2 = nm6.a;
        i = kybVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
