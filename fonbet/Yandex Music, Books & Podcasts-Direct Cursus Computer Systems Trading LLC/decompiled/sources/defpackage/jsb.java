package defpackage;

import android.util.SparseArray;
import androidx.media3.exoplayer.trackselection.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.tracks.TrackVariant;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class jsb implements nqs {
    public final TrackType a;
    public final wj7 b;
    public final tpl c;
    public final boolean d;
    public final boolean e;
    public volatile p6g f;
    public volatile Collection g;

    public jsb(TrackType trackType, wj7 wj7Var, tpl tplVar, boolean z) {
        trackType.getClass();
        this.a = trackType;
        this.b = wj7Var;
        this.c = tplVar;
        this.d = z || trackType == TrackType.Subtitles;
        this.e = trackType == TrackType.Video;
        this.g = c5b.a;
    }

    public final List a() {
        return CollectionsKt.w0(this.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final isb b() {
        dsc dscVar;
        p6g p6gVar = this.f;
        if (p6gVar != null) {
            jxn jxnVar = p6gVar instanceof jxn ? (jxn) p6gVar : null;
            if (jxnVar != null) {
                dscVar = jxnVar.a;
            }
        }
        p6g p6gVar2 = this.f;
        if (p6gVar2 != null) {
            lxn lxnVar = p6gVar2 instanceof lxn ? (lxn) p6gVar2 : null;
            if (lxnVar != null) {
                dscVar = lxnVar.c;
                if (dscVar == null) {
                    return new isb(dscVar);
                }
                return null;
            }
        }
        dscVar = null;
        if (dscVar == null) {
        }
    }

    public final TrackVariant c() {
        Object obj;
        Iterator it = this.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((TrackVariant) obj).getSelected()) {
                break;
            }
        }
        return (TrackVariant) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r4.getFormat(), r7.getFormat()) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(TrackVariant trackVariant) {
        wj7 wj7Var = this.b;
        uqb uqbVar = (uqb) wj7Var.g;
        yqb yqbVar = (yqb) wj7Var.e;
        ct7 ct7Var = (ct7) wj7Var.d;
        TrackVariant c = c();
        if ((!(c instanceof TrackVariant.Adaptive) || !(trackVariant instanceof TrackVariant.Adaptive)) && (!(c instanceof TrackVariant.Disable) || !(trackVariant instanceof TrackVariant.Disable))) {
            if ((c instanceof TrackVariant.Variant) && (trackVariant instanceof TrackVariant.Variant)) {
                TrackVariant.Variant variant = (TrackVariant.Variant) c;
                TrackVariant.Variant variant2 = (TrackVariant.Variant) trackVariant;
                if (variant.getTrackIndex() == variant2.getTrackIndex()) {
                    if (variant.getGroupIndex() == variant2.getGroupIndex()) {
                    }
                }
            }
            Timber.INSTANCE.d("Apply track: " + trackVariant, new Object[0]);
            if (trackVariant instanceof TrackVariant.Disable) {
                wj7Var.v();
                return true;
            }
            if (trackVariant instanceof TrackVariant.Adaptive) {
                wj7Var.c = false;
                int intValue = ((Number) yqbVar.invoke()).intValue();
                us7 a = ct7Var.a();
                SparseArray sparseArray = a.M;
                Map map = (Map) sparseArray.get(intValue);
                if (map != null && !map.isEmpty()) {
                    sparseArray.remove(intValue);
                }
                a.r(intValue, false);
                ct7Var.k(new a(a));
                uqbVar.invoke();
                return true;
            }
            if (!(trackVariant instanceof TrackVariant.Variant)) {
                if (!(trackVariant instanceof TrackVariant.PreferredTrackVariant)) {
                    b6e.u(trackVariant, "Not supported: ");
                    return false;
                }
                String language = ((TrackVariant.PreferredTrackVariant) trackVariant).getLanguage();
                us7 a2 = ct7Var.a();
                int i = wj7Var.a;
                if (i != 1) {
                    if (i == 3) {
                        a2.q(language);
                    }
                } else if (language == null) {
                    a2.p(new String[0]);
                } else {
                    a2.p(new String[]{language});
                }
                ct7Var.k(new a(a2));
                return true;
            }
            TrackVariant.Variant variant3 = (TrackVariant.Variant) trackVariant;
            int groupIndex = variant3.getGroupIndex();
            int trackIndex = variant3.getTrackIndex();
            wj7Var.c = false;
            int intValue2 = ((Number) yqbVar.invoke()).intValue();
            us7 a3 = ct7Var.a();
            SparseArray sparseArray2 = a3.M;
            Map map2 = (Map) sparseArray2.get(intValue2);
            if (map2 != null && !map2.isEmpty()) {
                sparseArray2.remove(intValue2);
            }
            a3.r(intValue2, false);
            yvs x = wj7Var.x();
            vs7 vs7Var = new vs7(new int[]{trackIndex}, groupIndex);
            Map map3 = (Map) sparseArray2.get(intValue2);
            if (map3 == null) {
                map3 = new HashMap();
                sparseArray2.put(intValue2, map3);
            }
            if (!map3.containsKey(x) || !Objects.equals(map3.get(x), vs7Var)) {
                map3.put(x, vs7Var);
            }
            ct7Var.k(new a(a3));
            uqbVar.invoke();
            return true;
        }
        Timber.INSTANCE.d("Track is not changed, do not reapply: " + trackVariant, new Object[0]);
        return false;
    }

    public final void e() {
        this.f = this.b.w();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.d) {
            TrackVariant.Disable disable = new TrackVariant.Disable(this.c.z(), this.f instanceof kxn, false, 4, null);
            linkedHashMap.put(disable.getTitle(), disable);
        }
        if (this.e) {
            String y = this.c.y();
            boolean z = this.f instanceof jxn;
            p6g p6gVar = this.f;
            jxn jxnVar = p6gVar instanceof jxn ? (jxn) p6gVar : null;
            su3 su3Var = jxnVar != null ? jxnVar.b : null;
            p6g p6gVar2 = this.f;
            jxn jxnVar2 = p6gVar2 instanceof jxn ? (jxn) p6gVar2 : null;
            TrackVariant.Adaptive adaptive = new TrackVariant.Adaptive(y, z, su3Var, jxnVar2 != null ? jxnVar2.c : null);
            linkedHashMap.put(adaptive.getTitle(), adaptive);
        }
        yvs x = this.b.x();
        p6g p6gVar3 = this.f;
        lxn lxnVar = p6gVar3 instanceof lxn ? (lxn) p6gVar3 : null;
        ype it = yhn.m(0, x.a).iterator();
        while (it.c) {
            int nextInt = it.nextInt();
            xvs a = x.a(nextInt);
            ype it2 = yhn.m(0, a.a).iterator();
            while (it2.c) {
                int nextInt2 = it2.nextInt();
                dsc dscVar = a.d[nextInt2];
                dscVar.getClass();
                isb isbVar = new isb(dscVar);
                String p = this.c.p(isbVar);
                if (!linkedHashMap.containsKey(p)) {
                    linkedHashMap.put(p, new TrackVariant.Variant(p, nextInt, nextInt2, Intrinsics.d(lxnVar != null ? lxnVar.c : null, dscVar), isbVar));
                }
            }
        }
        this.g = linkedHashMap.values();
    }

    public final String toString() {
        return "ExoPlayerTrack(trackType=" + this.a + ", selection=" + this.f + ", trackVariants=" + this.g + ')';
    }
}
