package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.dash.PreloadedLiveDashManifestInCacheExpired;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import ru.yandex.video.m3.player.CurrentBufferLengthProvider;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.baseurls.BaseUrlsManager;
import ru.yandex.video.m3.player.impl.ErrorBehindLiveWindowFromPreloadedLiveDashManifest;
import ru.yandex.video.m3.player.impl.source.dash.manifest.YandexDashManifest;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;
import ru.yandex.video.m3.source.chunk.DataSpecFormatter;

/* loaded from: classes10.dex */
public abstract class qd5 extends ol51 {
    public boolean A;
    public final BaseUrlsManager q;
    public final Map r;
    public final CurrentBufferLengthProvider s;
    public final boolean t;
    public final PlayerLogger u;
    public String v;
    public boolean w;
    public final HashMap x;
    public final HashMap y;
    public final DataSpecFormatter z;

    public qd5(ru6 ru6Var, tyy tyyVar, egg eggVar, jc5 jc5Var, int i, int[] iArr, loo looVar, int i2, kpg kpgVar, long j, int i3, boolean z, List list, syc0 syc0Var, BaseUrlsManager baseUrlsManager, Map map, CurrentBufferLengthProvider currentBufferLengthProvider, boolean z2, PlayerLogger playerLogger, vyc0 vyc0Var, boolean z3) {
        super(ru6Var, tyyVar, eggVar, jc5Var, i, iArr, looVar, i2, kpgVar, j, i3, z, list, syc0Var);
        this.q = baseUrlsManager;
        this.r = map;
        this.s = currentBufferLengthProvider;
        this.t = z2;
        this.u = playerLogger;
        this.w = true;
        this.x = new HashMap();
        this.y = new HashMap();
        this.z = new DataSpecFormatter(z3);
        int periodCount = eggVar.getPeriodCount();
        for (int i4 = 0; i4 < periodCount; i4++) {
            pxa0 period = eggVar.getPeriod(i4);
            List list2 = period.c;
            this.x.put(period.a, Integer.valueOf(list2.size()));
            int i5 = 0;
            for (Object obj : list2) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    scc.m();
                    throw null;
                }
                HashMap hashMap = this.y;
                StringBuilder sb = new StringBuilder();
                sb.append(i4);
                sb.append('.');
                sb.append(i5);
                hashMap.put(sb.toString(), Integer.valueOf(((a70) obj).c.size()));
                i5 = i6;
            }
        }
    }

    @Override // defpackage.dgg
    public final void a(egg eggVar, int i) {
        String str;
        ArrayList arrayList;
        BaseUrlsManager baseUrlsManager;
        List list;
        s4j0 s4j0Var;
        ImmutableList immutableList;
        d5z0 d5z0Var = h5z0.a;
        d5z0Var.t("BaseUrlStrategy");
        d5z0Var.a("updateManifest callback", new Object[0]);
        if (eggVar.getPeriodCount() > 0) {
            a70 a70Var = (a70) a.R(eggVar.getPeriod(0).c);
            if (a70Var == null || (list = a70Var.c) == null || (s4j0Var = (s4j0) a.R(list)) == null || (immutableList = s4j0Var.b) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(tcc.n(immutableList, 10));
                Iterator<E> it = immutableList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ic5) it.next()).a);
                }
            }
            if (arrayList != null && (baseUrlsManager = this.q) != null) {
                baseUrlsManager.updateBaseUrls(this.d, arrayList);
            }
        }
        int periodCount = eggVar.getPeriodCount();
        for (int i2 = 0; i2 < periodCount; i2++) {
            pxa0 period = eggVar.getPeriod(i2);
            String str2 = period.a;
            int size = eggVar.getPeriod(i2).c.size();
            HashMap hashMap = this.x;
            Integer num = (Integer) hashMap.get(str2);
            hashMap.put(str2, Integer.valueOf(size));
            if (num != null && num.intValue() != size) {
                h5z0.a.d("adaptation sets count changed!", new Object[0]);
                ny61.j(new PlaybackException.AdaptationSetsCountChanged(String.format("Previous count %d. New count %d", Arrays.copyOf(new Object[]{num, Integer.valueOf(size)}, 2))));
                return;
            }
            int i3 = 0;
            for (Object obj : period.c) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    scc.m();
                    throw null;
                }
                a70 a70Var2 = (a70) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                sb.append('.');
                sb.append(i3);
                String sb2 = sb.toString();
                HashMap hashMap2 = this.y;
                Integer num2 = (Integer) hashMap2.get(sb2);
                int size2 = a70Var2.c.size();
                hashMap2.put(sb2, Integer.valueOf(size2));
                if (num2 != null && num2.intValue() != size2) {
                    h5z0.a.d("representations count changed in adaptationSet " + a70Var2, new Object[0]);
                    ny61.j(new PlaybackException.RepresentationCountChanged(String.format(oyr.j(i3, "Adaptation ", ": Previous representation count %d. New count %d"), Arrays.copyOf(new Object[]{num2, Integer.valueOf(size2)}, 2))));
                    return;
                }
                i3 = i4;
            }
        }
        i9h[] i9hVarArr = this.i;
        try {
            this.l = eggVar;
            this.m = i;
            long periodDurationUs = eggVar.getPeriodDurationUs(i);
            ArrayList l = l();
            for (int i5 = 0; i5 < i9hVarArr.length; i5++) {
                i9hVarArr[i5] = i9hVarArr[i5].b(periodDurationUs, (s4j0) l.get(this.j.getIndexInTrackGroup(i5)));
            }
        } catch (BehindLiveWindowException unused) {
            BehindLiveWindowException behindLiveWindowException = new BehindLiveWindowException();
            this.n = behindLiveWindowException;
            if (this.p) {
                kpg kpgVar = this.e;
                if (!(kpgVar instanceof al51) || (str = this.k) == null) {
                    return;
                }
                al51 al51Var = (al51) kpgVar;
                ra7 ra7Var = al51Var.a;
                String buildCacheKey = al51Var.x.buildCacheKey(new npg(Uri.parse(str)));
                if (ra7Var.getKeys().contains(buildCacheKey)) {
                    this.n = new ErrorBehindLiveWindowFromPreloadedLiveDashManifest(ra7Var, buildCacheKey, behindLiveWindowException);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r5.e.onChunkLoadError(r11 != -9223372036854775807L && r11 < r19.z) != false) goto L70;
     */
    @Override // defpackage.usb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(nsb nsbVar, boolean z, swy swyVar, twy twyVar) {
        boolean z2;
        androidx.media3.common.a aVar = nsbVar.w;
        IOException iOException = swyVar.a;
        PlayerLogger playerLogger = this.u;
        boolean enabled = PlayerLoggerExtensionsKt.getEnabled(playerLogger);
        int i = this.d;
        BaseUrlsManager baseUrlsManager = this.q;
        if (enabled) {
            playerLogger.verbose("BaseYandexDashChunkSource", "onChunkLoadError", "decide to recall media chunk", "possibleToUseOtherBaseUrl=" + ((baseUrlsManager != null ? baseUrlsManager.getAvailableBaseUrlsCount(i) : 0) > 0));
        }
        if (!z) {
            return false;
        }
        syc0 syc0Var = this.h;
        if (syc0Var != null) {
            long j = syc0Var.d;
        }
        boolean z3 = iOException instanceof HttpDataSource$InvalidResponseCodeException;
        HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException = z3 ? (HttpDataSource$InvalidResponseCodeException) iOException : null;
        boolean z4 = httpDataSource$InvalidResponseCodeException != null && httpDataSource$InvalidResponseCodeException.responseCode == 404;
        egg eggVar = this.l;
        if (eggVar.dynamic && (nsbVar instanceof ib10) && z4) {
            kpg kpgVar = this.e;
            if ((kpgVar instanceof al51) && this.p && !this.A && (eggVar instanceof YandexDashManifest)) {
                al51 al51Var = (al51) kpgVar;
                ra7 ra7Var = al51Var.a;
                String buildCacheKey = al51Var.x.buildCacheKey(new npg(Uri.parse(((YandexDashManifest) this.l).getManifestUrl())));
                if (ra7Var.getKeys().contains(buildCacheKey)) {
                    this.n = new PreloadedLiveDashManifestInCacheExpired(ra7Var, buildCacheKey, iOException);
                    return true;
                }
            }
        }
        boolean z5 = this.l.dynamic;
        i9h[] i9hVarArr = this.i;
        if (!z5 && (nsbVar instanceof ib10) && z4) {
            i9h i9hVar = i9hVarArr[this.j.indexOf(aVar)];
            long e = i9hVar.e();
            if (e != -1 && e != 0) {
                pgg pggVar = i9hVar.e;
                d6z.z(pggVar);
                if (((ib10) nsbVar).a() > ((pggVar.C() + i9hVar.g) + e) - 1) {
                    this.o = true;
                    return true;
                }
            }
        }
        i9h i9hVar2 = i9hVarArr[this.j.indexOf(aVar)];
        String baseUrl = baseUrlsManager != null ? baseUrlsManager.getBaseUrl(i) : null;
        if (baseUrl == null || jl40.l(i9hVar2.d.a, baseUrl)) {
            loo looVar = this.j;
            ImmutableList immutableList = i9hVar2.c.b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int length = looVar.length();
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (looVar.isTrackExcluded(i3, elapsedRealtime)) {
                    i2++;
                }
            }
            int size = immutableList.size();
            qwy qwyVar = new qwy(size, size - (baseUrlsManager != null ? baseUrlsManager.getAvailableBaseUrlsCount(i) : 0), length, i2);
            if (!qwyVar.a(2) && !qwyVar.a(1)) {
                d5z0 d5z0Var = h5z0.a;
                d5z0Var.t("BaseUrlStrategy");
                d5z0Var.d("fallback is unavailable", new Object[0]);
                return false;
            }
            rwy fallbackSelectionFor = twyVar.getFallbackSelectionFor(qwyVar, swyVar);
            if (fallbackSelectionFor != null) {
                int i4 = fallbackSelectionFor.a;
                if (qwyVar.a(i4)) {
                    if (i4 == 2) {
                        d5z0 d5z0Var2 = h5z0.a;
                        d5z0Var2.t("BaseUrlStrategy");
                        d5z0Var2.d("FALLBACK_TYPE_TRACK", new Object[0]);
                        loo looVar2 = this.j;
                        z2 = looVar2.excludeTrack(looVar2.indexOf(aVar), fallbackSelectionFor.b);
                    } else {
                        if (i4 == 1) {
                            d5z0 d5z0Var3 = h5z0.a;
                            d5z0Var3.t("BaseUrlStrategy");
                            d5z0Var3.d("FALLBACK_TYPE_LOCATION", new Object[0]);
                            HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException2 = z3 ? (HttpDataSource$InvalidResponseCodeException) iOException : null;
                            Integer valueOf = httpDataSource$InvalidResponseCodeException2 != null ? Integer.valueOf(httpDataSource$InvalidResponseCodeException2.responseCode) : null;
                            if (baseUrlsManager != null) {
                                z2 = baseUrlsManager.onChunkLoadError(i, valueOf);
                            }
                        }
                        z2 = false;
                    }
                    d5z0 d5z0Var4 = h5z0.a;
                    d5z0Var4.t("BaseUrlStrategy");
                    d5z0Var4.d("AfterAll cancelLoad=" + z2 + ". If true - it will be try to reload with other base url", new Object[0]);
                    return z2;
                }
            }
            d5z0 d5z0Var5 = h5z0.a;
            d5z0Var5.t("BaseUrlStrategy");
            d5z0Var5.d("Policy indicated to not use any fallback or a fallback type that is not available.", new Object[0]);
            return false;
        }
        return true;
    }

    @Override // defpackage.usb
    public final void g(nsb nsbVar) {
        long j = nsbVar.A;
        if (!this.w) {
            this.w = true;
            PlayerLogger playerLogger = this.u;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                int i = this.d;
                StringBuilder t = b64.t(i, "first chunk with new base url loaded trackType=", " baseUrl=");
                t.append(this.v);
                t.append(" isInitialChunk=");
                boolean z = nsbVar instanceof swv;
                t.append(z);
                playerLogger.verbose("BaseUrlStrategy", "onChunkLoadCompleted", t.toString(), new Object[0]);
                playerLogger.verbose("BaseYandexDashChunkSource", "onChunkLoadCompleted", "first chunk with new base url loaded", oyr.i(i, "trackType="), "baseUrl=" + this.v, "isInitialChunk=" + z);
            }
        }
        if (nsbVar instanceof ib10) {
            this.A = true;
        }
        if (nsbVar instanceof swv) {
            int indexOf = this.j.indexOf(((swv) nsbVar).w);
            i9h[] i9hVarArr = this.i;
            i9h i9hVar = i9hVarArr[indexOf];
            if (i9hVar.e == null) {
                osb osbVar = i9hVar.b;
                d6z.z(osbVar);
                qsb a = ((su6) osbVar).a();
                if (a != null) {
                    s4j0 s4j0Var = i9hVar.c;
                    i9hVarArr[indexOf] = new i9h(i9hVar.f, s4j0Var, i9hVar.d, i9hVar.b, i9hVar.g, new qgg(a, s4j0Var.c, 0), 1);
                }
            }
        }
        syc0 syc0Var = this.h;
        if (syc0Var != null) {
            long j2 = syc0Var.d;
            if (j2 == -9223372036854775807L || j > j2) {
                syc0Var.d = j;
            }
            syc0Var.e.onChunkLoadCompleted(nsbVar);
        }
    }

    @Override // defpackage.ol51
    public final i9h m(int i) {
        i9h[] i9hVarArr = this.i;
        i9h i9hVar = i9hVarArr[i];
        BaseUrlsManager baseUrlsManager = this.q;
        String baseUrl = baseUrlsManager != null ? baseUrlsManager.getBaseUrl(this.d) : null;
        if (baseUrl == null || baseUrl.equals(i9hVar.d.a)) {
            return i9hVar;
        }
        d5z0 d5z0Var = h5z0.a;
        d5z0Var.t("BaseUrlStrategy");
        d5z0Var.a(unr0.r(new StringBuilder("updateSelectedBaseUrl from "), i9hVar.d.a, " to ", baseUrl), new Object[0]);
        i9h i9hVar2 = new i9h(i9hVar.f, i9hVar.c, new ic5(baseUrl, baseUrl, Integer.MIN_VALUE, 1), i9hVar.b, i9hVar.g, i9hVar.e, 1);
        i9hVarArr[i] = i9hVar2;
        this.v = baseUrl;
        return i9hVar2;
    }

    public final npg n(s4j0 s4j0Var, String str, w6i0 w6i0Var, int i, ImmutableMap immutableMap) {
        CurrentBufferLengthProvider currentBufferLengthProvider;
        npg c = jd00.c(s4j0Var, str, w6i0Var, i, immutableMap);
        if (this.t && (currentBufferLengthProvider = this.s) != null) {
            float bufferMs = currentBufferLengthProvider.getBufferMs() / 1000.0f;
            if (bufferMs < 10.0f) {
                mpg a = c.a();
                a.a = c.a.buildUpon().appendQueryParameter("bufsize", Float.toString(bufferMs)).build();
                c = a.a();
            }
        }
        return this.z.updateDataSpec(c, s4j0Var);
    }
}
