package defpackage;

import android.media.AudioRecord;
import android.net.NetworkRequest;
import com.yandex.music.mixes.data.remote.MixesApi;
import com.yandex.music.skeleton.blocks.neuromusic.data.NeuromusicBlockApi;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.mediabrowser.MusicBrowserService;

/* loaded from: classes3.dex */
public final /* synthetic */ class u5i implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ u5i(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = true;
        switch (this.a) {
            case 0:
                agr agrVar = v5i.a;
                return Boolean.TRUE;
            case 1:
                l18 l18Var = l18.b;
                bdt I = hag.I(upq.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return (MixesApi) ((upq) qdcVar.C(I)).c().a.b(MixesApi.class);
            case 2:
                return new b9i();
            case 3:
                throw new IllegalStateException("Reporter not found!");
            case 4:
                boolean z2 = MusicBrowserService.n;
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(ed0.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                pd0 pd0Var = ((ed0) qdcVar2.C(I2)).a;
                bdt I3 = hag.I(o2q.class);
                qdc qdcVar3 = pd0Var.a;
                qdcVar3.getClass();
                return (o2q) qdcVar3.C(I3);
            case 5:
                l18 l18Var3 = l18.b;
                bdt I4 = hag.I(byb.class);
                qdc qdcVar4 = l18Var3.a;
                qdcVar4.getClass();
                return Boolean.valueOf(((ulu) ((byb) qdcVar4.C(I4)).c(ern.a(ulu.class))).h());
            case 6:
                l18 l18Var4 = l18.b;
                bdt I5 = hag.I(byb.class);
                qdc qdcVar5 = l18Var4.a;
                qdcVar5.getClass();
                return Boolean.valueOf(((a4q) ((byb) qdcVar5.C(I5)).c(ern.a(a4q.class))).h());
            case 7:
                int minBufferSize = AudioRecord.getMinBufferSize(8000, 16, 2);
                if (minBufferSize > 2400) {
                    minBufferSize = 2400;
                }
                return Integer.valueOf(minBufferSize);
            case 8:
                return new NetworkRequest.Builder().addTransportType(1).addTransportType(0).addTransportType(3).addCapability(12).build();
            case 9:
                return gld.e(e.c(a4g.n(), dm6.b));
            case 10:
                return Unit.a;
            case 11:
                return "myshelf";
            case 12:
                return Boolean.valueOf(((env) ((byb) l18.b.c(hag.I(byb.class))).b(env.class)).h());
            case 13:
                return new cvo(wjb.MyShelfHistoryScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
            case 14:
                return new gti();
            case 15:
                return new cvo(wjb.MyShelfLikedScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
            case 16:
                return new cvo(wjb.MyShelfScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
            case 17:
                l18 l18Var5 = l18.b;
                bdt I6 = hag.I(upq.class);
                qdc qdcVar6 = l18Var5.a;
                qdcVar6.getClass();
                return (NeuromusicBlockApi) ((upq) qdcVar6.C(I6)).c().a.b(NeuromusicBlockApi.class);
            case 18:
                jyr jyrVar = k3j.e;
                l18 l18Var6 = l18.b;
                bdt I7 = hag.I(byb.class);
                qdc qdcVar7 = l18Var6.a;
                qdcVar7.getClass();
                Boolean a = ((k3j) ((byb) qdcVar7.C(I7)).b(k3j.class)).a().a("enabled");
                return Boolean.valueOf(a != null ? a.booleanValue() : false);
            case 19:
                return new z3j();
            case 20:
                return new cvo(wjb.NewEpisodeListScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
            case 21:
                l18 l18Var7 = l18.b;
                bdt I8 = hag.I(byb.class);
                qdc qdcVar8 = l18Var7.a;
                qdcVar8.getClass();
                return Boolean.valueOf(((k94) ((byb) qdcVar8.C(I8)).c(ern.a(k94.class))).h());
            case 22:
                l18 l18Var8 = l18.b;
                bdt I9 = hag.I(d5j.class);
                qdc qdcVar9 = l18Var8.a;
                qdcVar9.getClass();
                return (d5j) qdcVar9.C(I9);
            case 23:
                return new lnq();
            case 24:
                jyr jyrVar2 = o5j.e;
                l18 l18Var9 = l18.b;
                bdt I10 = hag.I(byb.class);
                qdc qdcVar10 = l18Var9.a;
                qdcVar10.getClass();
                if (!Intrinsics.d(((o5j) ((byb) qdcVar10.C(I10)).b(o5j.class)).b(), "on")) {
                    jyr jyrVar3 = t5j.e;
                    if (!wyf.M()) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 25:
                jyr jyrVar4 = t5j.e;
                l18 l18Var10 = l18.b;
                bdt I11 = hag.I(byb.class);
                qdc qdcVar11 = l18Var10.a;
                qdcVar11.getClass();
                String b = ((t5j) ((byb) qdcVar11.C(I11)).c(ern.a(t5j.class))).b();
                if (!Intrinsics.d(b, "on") && !Intrinsics.d(b, "on1")) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                return new wbb();
            case 27:
                return new p0t();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new yab();
            default:
                return new lz1();
        }
    }

    public /* synthetic */ u5i(i3 i3Var, int i) {
        this.a = i;
    }
}
