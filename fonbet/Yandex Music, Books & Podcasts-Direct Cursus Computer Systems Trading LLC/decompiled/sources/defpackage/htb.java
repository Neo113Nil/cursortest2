package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.extractor.flac.FlacExtractor;
import com.yandex.music.shared.generative.domain.commands.a;
import com.yandex.music.shared.generative.domain.commands.b;
import com.yandex.music.skeleton.blocks.featured.data.FeaturedBlockApi;
import com.yandex.pulse.metrics.o;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.OkHttpClient;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.d;

/* loaded from: classes6.dex */
public final /* synthetic */ class htb implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ htb(iz7 iz7Var) {
        this.a = 23;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [arf, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Class<?> returnType;
        int i = 1;
        switch (this.a) {
            case 0:
                return new qp1();
            case 1:
                throw new IllegalStateException("LocalExpandedPlayerUiMode not provided");
            case 2:
                return "Experiments";
            case 3:
                l18 l18Var = l18.b;
                bdt I = hag.I(Context.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                Context context = (Context) qdcVar.C(I);
                bdt I2 = hag.I(i0j.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                OkHttpClient okHttpClient = ((i0j) qdcVar2.C(I2)).b(new evj((rao) null, "ExternalCoil", (ozw) null, (Function1) null, 55)).a;
                mmo mmoVar = new mmo(context);
                mmoVar.e = new kme(okHttpClient);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                if (Build.VERSION.SDK_INT >= 28) {
                    arrayList5.add(new hbe());
                } else {
                    arrayList5.add(new ncd());
                }
                mmoVar.f = new on5(xee.L(arrayList), xee.L(arrayList2), xee.L(arrayList3), xee.L(arrayList4), xee.L(arrayList5));
                return mmoVar.k();
            case 4:
                return d.w();
            case 5:
                l18 l18Var2 = l18.b;
                bdt I3 = hag.I(upq.class);
                qdc qdcVar3 = l18Var2.a;
                qdcVar3.getClass();
                return (FeaturedBlockApi) ((upq) qdcVar3.C(I3)).c().a.b(FeaturedBlockApi.class);
            case 6:
                return FlacExtractor.class;
            case 7:
                return oxf.class;
            case 8:
                return Boolean.FALSE;
            case 9:
                return new zf6(ern.a(t5a.class), (t9f) null, new t9f[0]);
            case 10:
                return new zf6(ern.a(q2a.class), (t9f) null, new t9f[0]);
            case 11:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 12:
                try {
                    Method method = (Method) zvc.d.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 13:
                return u75.h(Float.valueOf(8.0f), Float.valueOf(-16.0f), Float.valueOf(12.0f), Float.valueOf(-8.0f), Float.valueOf(5.0f), Float.valueOf(-2.0f), Float.valueOf(1.0f), Float.valueOf(0.0f));
            case 14:
                return Unit.a;
            case 15:
                l18 l18Var3 = l18.b;
                bdt I4 = hag.I(iau.class);
                qdc qdcVar4 = l18Var3.a;
                qdcVar4.getClass();
                return new ee1(1, (iau) qdcVar4.C(I4));
            case 16:
                msa msaVar = nsa.b;
                final long M = yd5.M(5, ssa.SECONDS);
                return new a0d() { // from class: yzc
                    @Override // defpackage.a0d
                    public final eno a() {
                        return new eno(new fv0(M, null, 2));
                    }
                };
            case 17:
                return "gdpr";
            case 18:
                return "GenerativeApi";
            case 19:
                return new f4d();
            case 20:
                return new s4d(new a(), new b(3, null));
            case 21:
                return Unit.a;
            case 22:
                return "getFileInfo";
            case 23:
                h7a d0 = zsd.d0(frc.a.g, 1);
                g4d g4dVar = new g4d(i);
                return new red(new ub7(22, q6k.m(d0, g4dVar, q6k.g), g4dVar), i);
            case 24:
                l18 l18Var4 = l18.b;
                bdt I5 = hag.I(skr.class);
                qdc qdcVar5 = l18Var4.a;
                qdcVar5.getClass();
                return ((skr) qdcVar5.C(I5)).c(R.string.collapsed_player_switching_track);
            case 25:
                return new Handler(Looper.getMainLooper());
            case 26:
                return Unit.a;
            case 27:
                return new ajq(10);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                float f = gtd.a;
                return gtd.a(0.0f, 14, d85.n);
            default:
                return 0;
        }
    }

    public /* synthetic */ htb(int i) {
        this.a = i;
    }
}
