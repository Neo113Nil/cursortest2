package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.reflect.TypeToken;
import com.yandex.music.shared.bdu.trigger.cache.mapping.impl.CommunicationTriggerCacheMapperImpl$mapToInternalCommunicationTriggerMap$type$1;
import defpackage.hmm;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class di5 extends aur implements Function2 {
    public int j;
    public final /* synthetic */ ei5 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di5(ei5 ei5Var, Continuation continuation) {
        super(2, continuation);
        this.k = ei5Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new di5(this.k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((di5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b8, code lost:
    
        if (r2 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0035, code lost:
    
        if (r7 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0037, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0026, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map map;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        ei5 ei5Var = this.k;
        if (i == 0) {
            qgg.h0(obj);
            this.j = 1;
            obj = ei5.a(ei5Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                hmm hmmVar = (hmm) obj;
                String str = hmmVar != null ? (String) ((lpi) hmmVar).a.get(new hmm.a("triggers")) : null;
                xdr xdrVar = ei5Var.e;
                if (str != null) {
                    hi5 hi5Var = (hi5) ei5Var.a;
                    hi5Var.getClass();
                    JsonObject n0 = cxb.n0(str);
                    if (n0 != null) {
                        try {
                            Object b = hi5Var.a.b(new JsonTreeReader(n0), TypeToken.get(new CommunicationTriggerCacheMapperImpl$mapToInternalCommunicationTriggerMap$type$1().getType()));
                            b.getClass();
                            Map map2 = (Map) b;
                            map = new LinkedHashMap(tah.a(map2.size()));
                            for (Object obj2 : map2.entrySet()) {
                                map.put(((Map.Entry) obj2).getKey(), hi5.b((List) ((Map.Entry) obj2).getValue()));
                            }
                        } catch (JsonIOException | JsonSyntaxException | JSONException unused) {
                        }
                    }
                    map = null;
                }
                map = e5b.a;
                map.getClass();
                xdrVar.getClass();
                xdrVar.m(null, map);
                xdr xdrVar2 = ei5Var.f;
                Boolean bool = Boolean.TRUE;
                xdrVar2.getClass();
                xdrVar2.m(null, bool);
                return Unit.a;
            }
            qgg.h0(obj);
        }
        pjc data = ((wb7) obj).getData();
        this.j = 2;
        obj = zsd.i0(data, this);
    }
}
