package defpackage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.yandex.music.shared.slides.ui.music.logic.impl.selection.model.CardSelectionStorageAdapter;
import defpackage.hmm;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class gfp {
    public final cc7 a;
    public final frt b;
    public final Gson c;

    public gfp(cc7 cc7Var, frt frtVar) {
        cc7Var.getClass();
        frtVar.getClass();
        this.a = cc7Var;
        this.b = frtVar;
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.b(ux3.class, new CardSelectionStorageAdapter());
        this.c = gsonBuilder.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(cg6 cg6Var) {
        dfp dfpVar;
        int i;
        hmm hmmVar;
        if (cg6Var instanceof dfp) {
            dfpVar = (dfp) cg6Var;
            int i2 = dfpVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dfpVar.l = i2 - Integer.MIN_VALUE;
                Object obj = dfpVar.j;
                nm6 nm6Var = nm6.a;
                i = dfpVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = b().getData();
                    dfpVar.l = 1;
                    obj = zsd.i0(data, dfpVar);
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
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return null;
                }
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                Map unmodifiableMap = Collections.unmodifiableMap(((lpi) hmmVar).a);
                unmodifiableMap.getClass();
                for (Map.Entry entry : unmodifiableMap.entrySet()) {
                    hmm.a aVar = (hmm.a) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        try {
                            Object d = this.c.d((String) value, ux3.class);
                            d.getClass();
                            tx3 x = gdg.x((ux3) d);
                            if (x != null) {
                                concurrentHashMap.put(aVar.a, x);
                            }
                        } catch (JsonSyntaxException unused) {
                            v3w.l("Ошибка парсинга CardSelectionStorage для ключа ", aVar.a, 7, "SelectionStorage", null);
                        }
                    }
                }
                return concurrentHashMap;
            }
        }
        dfpVar = new dfp(this, cg6Var);
        Object obj2 = dfpVar.j;
        nm6 nm6Var2 = nm6.a;
        i = dfpVar.l;
        if (i != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    public final wb7 b() {
        return ((dc7) this.a).c(this.b.c().a, "slides_selection");
    }
}
