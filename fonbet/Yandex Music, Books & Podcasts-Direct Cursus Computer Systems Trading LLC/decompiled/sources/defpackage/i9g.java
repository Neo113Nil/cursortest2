package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.player.tracks.TrackVariant;

/* loaded from: classes6.dex */
public final class i9g {
    public final qdc a;
    public final String b;
    public boolean c;

    public i9g(qdc qdcVar, String str) {
        this.a = qdcVar;
        this.b = str;
    }

    public final void a(paw pawVar) {
        nqs f;
        List a;
        nqs f2;
        List a2;
        pawVar.getClass();
        boolean z = this.c;
        float f3 = z ? 0.0f : 1.0f;
        TrackVariant trackVariant = null;
        if (!z) {
            nqs f4 = pawVar.f();
            if (f4 != null && (a = ((jsb) f4).a()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : a) {
                    if (obj instanceof TrackVariant.Variant) {
                        arrayList.add(obj);
                    }
                }
                trackVariant = (TrackVariant.Variant) CollectionsKt.firstOrNull(arrayList);
            }
            if (trackVariant != null && (f = pawVar.f()) != null) {
                ((jsb) f).d(trackVariant);
            }
        } else if (pawVar.getPosition() == 0) {
            nqs f5 = pawVar.f();
            if (f5 != null && (a2 = ((jsb) f5).a()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : a2) {
                    if (obj2 instanceof TrackVariant.Disable) {
                        arrayList2.add(obj2);
                    }
                }
                trackVariant = (TrackVariant.Disable) CollectionsKt.firstOrNull(arrayList2);
            }
            if (trackVariant != null && (f2 = pawVar.f()) != null) {
                ((jsb) f2).d(trackVariant);
            }
        }
        this.a.H(this.b, "audioControl.applyToEngine", "forcedMute = " + this.c + ", audioVolume = 1.0, result = " + f3, new Object[0]);
        pawVar.t(f3);
    }
}
