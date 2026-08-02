package com.yandex.pulse.histogram;

import android.util.Log;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.ciq;
import defpackage.cp2;
import defpackage.efo;
import defpackage.hyd;
import defpackage.iyd;
import defpackage.lgr;
import defpackage.lyd;
import defpackage.r6g;
import defpackage.s6g;
import defpackage.u2x;
import defpackage.xyd;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/pulse/histogram/ComponentHistograms;", "", "xee", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class ComponentHistograms {
    public static final Object b = new Object();
    public static final ciq c = new ciq(0);
    public final String a;

    public ComponentHistograms(String str) {
        this.a = str;
    }

    public final lyd a(String str) {
        lyd lydVar;
        str.getClass();
        String str2 = this.a;
        str2.getClass();
        synchronized (efo.f) {
            try {
                if (efo.h == null) {
                    new efo(2);
                }
                efo efoVar = efo.h;
                efoVar.getClass();
                if (!((ciq) efoVar.b).containsKey(str2)) {
                    efo efoVar2 = efo.h;
                    efoVar2.getClass();
                    ((ciq) efoVar2.b).put(str2, new lgr());
                }
                efo efoVar3 = efo.h;
                efoVar3.getClass();
                Object obj = ((ciq) efoVar3.b).get(str2);
                obj.getClass();
                lydVar = (lyd) ((lgr) obj).a.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return lydVar;
    }

    public final lyd b(String str, int i, int i2, int i3) {
        str.getClass();
        hyd G = u2x.G(str, i, i2, i3);
        if (!G.c) {
            Log.e("Histogram", "Requested histogram construction arguments were changed. See details above.");
        }
        return new cp2(str, iyd.class, G.a, G.b, G.d).b(this);
    }

    public final lyd c(String str, int i, int i2, int i3) {
        hyd G = u2x.G(str, i, i2, i3);
        if (!G.c) {
            Log.e("LinearHistogram", "Requested histogram construction arguments were changed. See details above.");
        }
        return new r6g(str, s6g.class, G.a, G.b, G.d).b(this);
    }

    public final void d(xyd xydVar) {
        xydVar.getClass();
        String str = this.a;
        str.getClass();
        synchronized (efo.f) {
            if (efo.h == null) {
                new efo(2);
            }
            efo efoVar = efo.h;
            efoVar.getClass();
            if (!((ciq) efoVar.b).containsKey(str)) {
                efo efoVar2 = efo.h;
                efoVar2.getClass();
                ((ciq) efoVar2.b).put(str, new lgr());
            }
            efo efoVar3 = efo.h;
            efoVar3.getClass();
            Object obj = ((ciq) efoVar3.b).get(str);
            obj.getClass();
            ((lgr) obj).a(xydVar);
        }
    }

    public final lyd e(lyd lydVar) {
        lydVar.getClass();
        String str = this.a;
        str.getClass();
        synchronized (efo.f) {
            try {
                if (efo.h == null) {
                    new efo(2);
                }
                efo efoVar = efo.h;
                efoVar.getClass();
                if (!((ciq) efoVar.b).containsKey(str)) {
                    efo efoVar2 = efo.h;
                    efoVar2.getClass();
                    ((ciq) efoVar2.b).put(str, new lgr());
                }
                efo efoVar3 = efo.h;
                efoVar3.getClass();
                Object obj = ((ciq) efoVar3.b).get(str);
                obj.getClass();
                ciq ciqVar = ((lgr) obj).a;
                lyd lydVar2 = (lyd) ciqVar.get(lydVar.a);
                if (lydVar2 == null) {
                    ciqVar.put(lydVar.a, lydVar);
                } else {
                    lydVar = lydVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lydVar;
    }
}
