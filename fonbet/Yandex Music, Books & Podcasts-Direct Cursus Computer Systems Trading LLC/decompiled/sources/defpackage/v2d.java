package defpackage;

import android.content.Intent;
import androidx.fragment.app.t;
import com.google.gson.GsonBuilder;
import com.yandex.pulse.metrics.o;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;
import ru.yandex.music.chat.SupportChatActivity;
import ru.yandex.music.main.MainScreenActivity;
import ru.yandex.music.search.SearchActivity;
import ru.yandex.music.settings.AboutActivity;
import ru.yandex.music.slides.SlidesScreenActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class v2d extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2d(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        esr esrVar;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                g2d g2dVar = (g2d) this.receiver;
                r1d r1dVar = (r1d) g2dVar.a.k.getValue();
                r1dVar.getClass();
                x97.y(cmd.a, null, null, new g68(r1dVar, continuation, 25), 3);
                q1d.g((q1d) r1dVar.b.getValue(), "gdpr_ok");
                t tVar = (t) g2dVar.b.a;
                if (!tVar.isFinishing()) {
                    jyr jyrVar = i7h.e;
                    if (y7g.A()) {
                        lhs lhsVar = MainScreenActivity.Q0;
                        Intent J = imp.J(tVar, null, null, null, 14);
                        J.addFlags(268468224);
                        tVar.startActivity(J);
                    } else {
                        tVar.finish();
                        lhs lhsVar2 = MainScreenActivity.Q0;
                        tVar.startActivity(imp.J(tVar, null, null, null, 14));
                    }
                }
                return Unit.a;
            case 1:
                ard ardVar = (ard) this.receiver;
                ardVar.getClass();
                GsonBuilder gsonBuilder = new GsonBuilder();
                Iterator it = ardVar.b.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    ((Function1) next).invoke(gsonBuilder);
                }
                return gsonBuilder.a();
            case 2:
                ((htd) this.receiver).U0();
                return Unit.a;
            case 3:
                t tVar2 = ((m1v) this.receiver).c.a;
                int i = SlidesScreenActivity.y;
                Intent putExtra = new Intent(tVar2, (Class<?>) SlidesScreenActivity.class).putExtra("extra.slides_params", new bwq("my_vibe_onboarding"));
                putExtra.getClass();
                tVar2.startActivity(putExtra);
                return Unit.a;
            case 4:
                t tVar3 = ((m1v) this.receiver).c.a;
                int i2 = SearchActivity.Z;
                tVar3.startActivity(rvf.E(tVar3, rvf.x(rf3.m)));
                return Unit.a;
            case 5:
                eqp eqpVar = (eqp) this.receiver;
                tnb.d(eqpVar.c.a(), wjb.AboutScreen);
                t tVar4 = eqpVar.b.a;
                int i3 = AboutActivity.v;
                tVar4.startActivity(new Intent(tVar4, (Class<?>) AboutActivity.class));
                return Unit.a;
            case 6:
                eqp eqpVar2 = (eqp) this.receiver;
                tnb.d(eqpVar2.c.a(), wjb.Link);
                t tVar5 = eqpVar2.b.a;
                String string = tVar5.getString(R.string.url_external_help);
                string.getClass();
                w1g.z(tVar5, string);
                return Unit.a;
            case 7:
                ((suc) this.receiver).d();
                return Unit.a;
            case 8:
                ((j2e) this.receiver).a.S();
                return Unit.a;
            case 9:
                ((j2e) this.receiver).b.invoke();
                return Unit.a;
            case 10:
                ((dfe) this.receiver).a.a.finish();
                return Unit.a;
            case 11:
                ige igeVar = ((dfe) this.receiver).b;
                x97.y(ot0.F(igeVar), null, null, new akc(igeVar, continuation, 19), 3);
                return Unit.a;
            case 12:
                yfe yfeVar = ((dfe) this.receiver).a;
                t tVar6 = yfeVar.a;
                int i4 = SupportChatActivity.w;
                int ordinal = yfeVar.b.ordinal();
                if (ordinal == 0) {
                    esrVar = esr.PAYWALL_RESTORE_PURCHASES;
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return Unit.a;
                    }
                    esrVar = esr.PROFILE_RESTORE_PURCHASES;
                }
                tVar6.startActivity(qcm.d(tVar6, esrVar));
                return Unit.a;
            case 13:
                iye iyeVar = (iye) this.receiver;
                synchronized (iyeVar.h) {
                    tjj tjjVar = iyeVar.b.h;
                    ReentrantLock reentrantLock = tjjVar.a;
                    reentrantLock.lock();
                    try {
                        boolean[] zArr = tjjVar.c;
                        Arrays.fill(zArr, 0, zArr.length, false);
                        tjjVar.d = true;
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                return Unit.a;
            case 14:
                ((bdf) this.receiver).d.B();
                return Unit.a;
            case 15:
                gdf gdfVar = ((cdf) this.receiver).b;
                gdfVar.getClass();
                x97.y(ot0.F(gdfVar), null, null, new jmd(gdfVar, continuation, 8), 3);
                return Unit.a;
            case 16:
                t tVar7 = ((bdf) this.receiver).c.a;
                int i5 = SearchActivity.Z;
                tVar7.startActivity(rvf.F(tVar7, c0p.a, p0p.q));
                return Unit.a;
            case 17:
                ((vni) ((cdf) this.receiver).d.b).a();
                return Unit.a;
            case 18:
                bdf bdfVar = (bdf) this.receiver;
                bdfVar.a.a(bdfVar.f, new aub(1, bdfVar.b, fdf.class, "onFilterItemClick", "onFilterItemClick(Lcom/yandex/music/design/components/bottomsheet/filterbottomsheet/FilterBottomSheetItem;)V", 0, 24));
                return Unit.a;
            case 19:
                t tVar8 = ((cdf) this.receiver).c.a;
                int i6 = SearchActivity.Z;
                tVar8.startActivity(rvf.F(tVar8, c0p.a, p0p.v));
                return Unit.a;
            case 20:
                cdf cdfVar = (cdf) this.receiver;
                cdfVar.a.a(cdfVar.g, new aub(1, cdfVar.b, gdf.class, "onFilterItemClick", "onFilterItemClick(Lcom/yandex/music/design/components/bottomsheet/filterbottomsheet/FilterBottomSheetItem;)V", 0, 25));
                return Unit.a;
            case 21:
                t tVar9 = ((jef) this.receiver).c.a;
                int i7 = SearchActivity.Z;
                tVar9.startActivity(rvf.E(tVar9, c0p.a));
                return Unit.a;
            case 22:
                ((jef) this.receiver).c.a.getOnBackPressedDispatcher().d();
                return Unit.a;
            case 23:
                ((jef) this.receiver).b.S();
                return Unit.a;
            case 24:
                ((zef) this.receiver).d.B();
                return Unit.a;
            case 25:
                dff dffVar = ((aff) this.receiver).b;
                dffVar.getClass();
                x97.y(ot0.F(dffVar), null, null, new jmd(dffVar, continuation, 11), 3);
                return Unit.a;
            case 26:
                t tVar10 = ((zef) this.receiver).c.a;
                int i8 = SearchActivity.Z;
                tVar10.startActivity(rvf.F(tVar10, c0p.a, p0p.q));
                return Unit.a;
            case 27:
                ((vni) ((aff) this.receiver).d.b).a();
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                zef zefVar = (zef) this.receiver;
                zefVar.a.a(zefVar.f, new kef(1, zefVar.b, cff.class, "onFilterItemClick", "onFilterItemClick(Lcom/yandex/music/design/components/bottomsheet/filterbottomsheet/FilterBottomSheetItem;)V", 0, 1));
                return Unit.a;
            default:
                t tVar11 = ((aff) this.receiver).c.a;
                int i9 = SearchActivity.Z;
                tVar11.startActivity(rvf.F(tVar11, c0p.a, p0p.o));
                return Unit.a;
        }
    }
}
