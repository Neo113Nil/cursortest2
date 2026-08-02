package defpackage;

import com.yandex.music.shared.utils.assertions.Assertions;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.context.PlaybackContextName;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes6.dex */
public final class igr extends v8n {
    public final xsu c;
    public final nyn d;
    public final boolean e;
    public final xys f;
    public final pfn g;
    public final gxc h;
    public c i;
    public final qdc j;
    public final e0t k;
    public final t0q l;
    public final String m;

    public igr(xsu xsuVar, nyn nynVar, boolean z, xys xysVar, pfn pfnVar, gxc gxcVar, qdc qdcVar, e0t e0tVar, String str, t0q t0qVar) {
        super(c.d);
        this.c = xsuVar;
        this.d = nynVar;
        this.e = z;
        this.f = xysVar;
        this.g = pfnVar;
        this.h = gxcVar;
        this.j = qdcVar;
        this.k = e0tVar;
        this.m = str;
        this.l = t0qVar;
    }

    @Override // defpackage.v8n
    public final Object a(w8n w8nVar) {
        return w8nVar.J(this);
    }

    @Override // defpackage.v8n
    public final String b() {
        return "StationQueueDescriptor{contentStartId=" + this.k + "}";
    }

    @Override // defpackage.v8n
    public final c c() {
        c cVar = this.i;
        if (cVar != null) {
            return cVar;
        }
        Assertions.fail("Developer error. Playback context is not initialized");
        return c.d;
    }

    public final void d(yku ykuVar) {
        if (this.i == null) {
            qdc qdcVar = this.j;
            qdcVar.getClass();
            e eVar = (e) qdcVar.b;
            PlaybackScope playbackScope = (PlaybackScope) qdcVar.c;
            eVar.getClass();
            playbackScope.getClass();
            c cVar = c.d;
            nyk nykVar = oyk.a;
            nyk nykVar2 = new nyk(PlaybackContextName.RADIO, StationId.e(ykuVar.a).h(), ykuVar.c);
            String str = "radio_" + ykuVar.b.replaceAll("-", "_");
            ru.yandex.music.utils.Assertions.assertNonNull(playbackScope, "build(): scope is not set");
            ru.yandex.music.utils.Assertions.assertNonNull(nykVar2, "build(): info is not set");
            ru.yandex.music.utils.Assertions.assertNonNull(str, "build(): card is not set");
            this.i = new c(playbackScope, nykVar2, str);
        }
    }

    @Override // defpackage.v8n
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igr)) {
            return false;
        }
        igr igrVar = (igr) obj;
        if (!super.equals(obj)) {
            return false;
        }
        Object obj2 = igrVar.c;
        xsu xsuVar = this.c;
        xsuVar.getClass();
        obj2.getClass();
        if (xsuVar == obj2) {
            return true;
        }
        if (!xsuVar.getClass().equals(obj2.getClass())) {
            return false;
        }
        if (xsuVar instanceof qsu) {
            return Intrinsics.d(((qsu) xsuVar).a, ((qsu) obj2).a);
        }
        if (xsuVar instanceof wsu) {
            wsu wsuVar = (wsu) xsuVar;
            wsu wsuVar2 = (wsu) obj2;
            return Intrinsics.d(wsuVar.a, wsuVar2.a) && Intrinsics.d(wsuVar.b, wsuVar2.b) && Intrinsics.d(wsuVar.c, wsuVar2.c) && wsuVar.d.equals(wsuVar2.d) && wsuVar.e == wsuVar2.e;
        }
        if (xsuVar.equals(rsu.a)) {
            return xsuVar.equals(obj2);
        }
        b6e.s();
        return false;
    }

    @Override // defpackage.v8n
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode() * 31;
        xsu xsuVar = this.c;
        xsuVar.getClass();
        if (xsuVar instanceof qsu) {
            hashCode = ((qsu) xsuVar).a.hashCode();
        } else if (xsuVar instanceof wsu) {
            wsu wsuVar = (wsu) xsuVar;
            hashCode = Objects.hash(wsuVar.a, wsuVar.b, wsuVar.c, wsuVar.d, Boolean.valueOf(wsuVar.e));
        } else {
            if (!xsuVar.equals(rsu.a)) {
                b6e.s();
                return 0;
            }
            hashCode = xsuVar.hashCode();
        }
        return hashCode2 + hashCode;
    }
}
