package defpackage;

import androidx.fragment.app.t;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.kinopoisk.sdk.easylogin.internal.C1005d2;
import ru.kinopoisk.sdk.easylogin.internal.C1103k2;
import ru.kinopoisk.sdk.easylogin.internal.W1;
import ru.kinopoisk.sdk.easylogin.internal.Z7;

/* loaded from: classes4.dex */
public final /* synthetic */ class vtu extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vtu(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((s2v) this.receiver).g();
                break;
            case 1:
                ((s2v) this.receiver).c();
                break;
            case 2:
                ((s2v) this.receiver).g();
                break;
            case 3:
                ((s2v) this.receiver).c();
                break;
            case 4:
                ((s2v) this.receiver).f();
                break;
            case 5:
                ((s2v) this.receiver).c();
                break;
            case 6:
                ((s2v) this.receiver).c();
                break;
            case 7:
                ((s2v) this.receiver).g();
                break;
            case 8:
                ((t) ((bov) this.receiver).b.a).getOnBackPressedDispatcher().d();
                break;
            case 9:
                ((t) ((bov) this.receiver).b.a).getOnBackPressedDispatcher().d();
                break;
            case 10:
                ((psv) this.receiver).c();
                break;
            case 11:
                ftv ftvVar = ((psv) this.receiver).e;
                if (!ftvVar.f) {
                    ftvVar.f = true;
                    ((lhs) ftvVar.c.getValue()).d();
                }
                break;
            case 12:
                ftv ftvVar2 = ((psv) this.receiver).e;
                if (ftvVar2.f && !ftvVar2.g) {
                    ftvVar2.g = true;
                    ((lhs) ftvVar2.c.getValue()).c();
                }
                break;
            case 13:
                ((psv) this.receiver).c();
                break;
            case 14:
                ((cvv) this.receiver).b.b();
                break;
            case 15:
                ((cvv) this.receiver).b.onStop();
                break;
            case 16:
                ((j1w) ((cyv) ((lwv) this.receiver).f.b).c.a).a.k0();
                break;
            case 17:
                ((lwv) this.receiver).a();
                break;
            case 18:
                ((j1w) ((cyv) ((lwv) this.receiver).f.b).c.a).a.d0();
                break;
            case 19:
                ((hxv) this.receiver).a();
                break;
            case 20:
                ((j1w) this.receiver).a.e0();
                break;
            case 21:
                ((j1w) ((izv) this.receiver).a.a).a.H();
                break;
            case 22:
                ((sai) this.receiver).a();
                break;
            case 23:
                ((l1w) this.receiver).X();
                break;
            case 24:
                ((sai) this.receiver).a();
                break;
            case 25:
                z1w z1wVar = (z1w) this.receiver;
                z6n z6nVar = z1wVar.b;
                String str = (String) z1wVar.e.getValue();
                str.getClass();
                ((j1w) z6nVar.b).a.n0(str);
                break;
            case 26:
                ((z1w) this.receiver).a();
                break;
            case 27:
                W1 w1 = (W1) this.receiver;
                w1.c.trackBackClick();
                Z7.a(w1.b.c);
                w1.b.a();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                C1005d2 c1005d2 = (C1005d2) this.receiver;
                c1005d2.b.trackBackClick();
                Z7.a(c1005d2.a.c);
                c1005d2.a.a();
                break;
            default:
                C1103k2 c1103k2 = (C1103k2) this.receiver;
                c1103k2.b.trackOkClick();
                Z7.a(c1103k2.a.c);
                break;
        }
        return Unit.a;
    }
}
