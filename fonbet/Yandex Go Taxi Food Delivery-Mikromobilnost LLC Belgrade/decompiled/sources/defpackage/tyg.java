package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public final class tyg implements uyg {
    public final o631 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap w = new ConcurrentHashMap();

    public tyg(o631 o631Var) {
        this.a = o631Var;
    }

    @Override // defpackage.uyg
    public final void clearNetworkPageInfo(String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.w.get(new q690(str));
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
    }

    @Override // defpackage.uyg
    public final void endDecodingDocument(String str, long j, String str2, String str3) {
        throw null;
    }

    @Override // defpackage.uyg
    public final void endDecodingDocument(String str, syg sygVar, String str2) {
        Long l = (Long) this.c.remove(str2);
        if (l != null) {
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            String format = String.format("FlexDocumentDecodingTime.%s", Arrays.copyOf(new Object[]{str}, 1));
            o631 o631Var = this.a;
            o631Var.k(currentTimeMillis, format);
            long j = sygVar.a;
            if (j > 0) {
                o631Var.k((PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED * currentTimeMillis) / j, str + ".Relative");
            }
            Integer o = qke.o(this.w, str, sygVar.b);
            if (o != null) {
                o631Var.k(currentTimeMillis, qv10.h(o.intValue(), String.format("FlexDocumentDecodingTime.%s", Arrays.copyOf(new Object[]{str}, 1)), ".page_"));
            }
        }
    }

    @Override // defpackage.uyg
    public final void endDecodingSection(String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        Long l = (Long) this.b.remove(str2);
        if (l != null) {
            this.a.d(currentTimeMillis - l.longValue(), String.format("FlexSectionDecodingTime.%s", Arrays.copyOf(new Object[]{str}, 1)));
        }
    }

    @Override // defpackage.l631
    public final Map getVelocityContext(cnr0 cnr0Var) {
        return b.f();
    }

    @Override // defpackage.uyg
    public final void logDecodingSharedDataSlice(String str, String str2, xez0 xez0Var, Map map) {
        logDecodingSharedDataSlice(str, xez0Var.b - xez0Var.a);
    }

    @Override // defpackage.uyg
    public final void logJsonCreationTimings(String str, String str2, xez0 xez0Var, Map map) {
        logJsonCreationTimings(str, xez0Var.b - xez0Var.a);
    }

    @Override // defpackage.uyg
    public final void startDecodingDocument(String str, String str2) {
        this.c.put(str2, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // defpackage.uyg
    public final void startDecodingSection(String str, String str2) {
        this.b.put(str2, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // defpackage.uyg
    public final void logDecodingSharedDataSlice(String str, long j) {
        this.a.b(j, str);
    }

    @Override // defpackage.uyg
    public final void logJsonCreationTimings(String str, long j) {
        this.a.h(j, str);
    }

    @Override // defpackage.uyg
    public final void endDecodingSection(String str, String str2, String str3, Map map) {
        endDecodingSection(str, str2);
    }
}
