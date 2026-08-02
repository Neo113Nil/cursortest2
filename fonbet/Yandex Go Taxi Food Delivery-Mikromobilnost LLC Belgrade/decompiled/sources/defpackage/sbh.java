package defpackage;

import android.content.SharedPreferences;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.xflags.FlagsConfigurationSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes2.dex */
public final class sbh implements nfr {
    public final wjm a;
    public final uxd b;
    public final jdj c;
    public ArrayList d = new ArrayList();

    public sbh(wjm wjmVar, uxd uxdVar, jdj jdjVar) {
        this.a = wjmVar;
        this.b = uxdVar;
        this.c = jdjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0136, code lost:
    
        if (r4 != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[LOOP:4: B:34:0x00d3->B:48:?, LOOP_END, SYNTHETIC] */
    @Override // defpackage.nfr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(jnl jnlVar, boolean z) {
        Object obj;
        Object c;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((jfr) obj2).a == FlagsConfigurationSource.experiment) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = this.d;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            if (((jfr) obj3).a == FlagsConfigurationSource.global) {
                arrayList4.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((LinkedHashMap) this.c.w).entrySet().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put((String) entry.getKey(), new lfr(null, new LinkedHashMap(), (y3x) entry.getValue()));
        }
        kfr kfrVar = new kfr(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : rfr.b.a.entrySet()) {
            linkedHashMap2.put((String) entry2.getKey(), new lfr(null, new LinkedHashMap(), (y3x) entry2.getValue()));
        }
        Iterator it2 = scc.i(kfrVar, new kfr(linkedHashMap2), zoa1.d(arrayList2), zoa1.d(arrayList4)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            kfr kfrVar2 = (kfr) it2.next();
            String str = jnlVar.b;
            lfr lfrVar = (lfr) kfrVar2.a.get(str);
            if (lfrVar != null) {
                String str2 = lfrVar.a;
                if (str2 != null) {
                    boolean z2 = false;
                    try {
                        uxd uxdVar = this.b;
                        nvo nvoVar = new nvo();
                        nvoVar.a = str2;
                        z2 = nvoVar.b(0, 0).d(uxdVar.a).c();
                    } catch (RuntimeException e) {
                        String message = e instanceof YSError ? ((YSError) e).getMessage() : String.valueOf(e);
                        LinkedHashMap linkedHashMap3 = zdz.a;
                        ogb1.b("Failed to evaluate condition result for flag \"" + str + "\" with error:\n" + message);
                    }
                }
                y3x y3xVar = lfrVar.c;
                c = jnlVar.c(y3xVar);
                if (c == null) {
                    LinkedHashMap linkedHashMap4 = zdz.a;
                    ogb1.b("Couldn't map value to flag \"" + str + "\":\n" + mbb1.a(y3xVar));
                    c = null;
                }
                if (c != null) {
                    if (z) {
                        LinkedHashMap linkedHashMap5 = lfrVar.b;
                        wjm wjmVar = this.a;
                        sae saeVar = (sae) wjmVar.c;
                        if (linkedHashMap5.size() != 0) {
                            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                            SharedPreferences.Editor edit = ((me1) saeVar.b).b.edit();
                            zv91.b(linkedHashMap5, new j9a(20, saeVar, ref$BooleanRef, new zgf(20, edit)));
                            edit.apply();
                            if (ref$BooleanRef.element) {
                                LinkedHashMap x = saeVar.x();
                                i4u i4uVar = (i4u) wjmVar.x;
                                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                zv91.b(x, new a6n(12, i4uVar, linkedHashMap6));
                                ((nr41) wjmVar.w).q(linkedHashMap6);
                            }
                        }
                    }
                    if (c == null) {
                        obj = c;
                        break;
                    }
                }
            }
            c = null;
            if (c == null) {
            }
        }
        return obj == null ? jnlVar.a : obj;
    }
}
