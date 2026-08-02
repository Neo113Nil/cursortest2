package defpackage;

import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;
import ru.yandex.music.videoclip.VideoClipActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class j6u extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j6u(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((y8u) this.receiver).x();
                break;
            case 1:
                ((y8u) this.receiver).d();
                break;
            case 2:
                ((y8u) this.receiver).b();
                break;
            case 3:
                VideoClipActivity videoClipActivity = ((h8u) this.receiver).b.a;
                videoClipActivity.finish();
                videoClipActivity.overridePendingTransition(0, R.anim.slide_out_bottom);
                break;
            case 4:
                ((h8u) this.receiver).c.a(v84.a);
                break;
            case 5:
                ((y8u) this.receiver).l();
                break;
            case 6:
                ((y8u) this.receiver).d();
                break;
            case 7:
                ((y8u) this.receiver).b();
                break;
            case 8:
                ((y8u) this.receiver).r();
                break;
            case 9:
                ((y8u) this.receiver).m();
                break;
            case 10:
                ((y8u) this.receiver).u();
                break;
            case 11:
                ((y8u) this.receiver).f();
                break;
            case 12:
                ((rpu) this.receiver).i();
                break;
            case 13:
                ((rpu) this.receiver).c();
                break;
            case 14:
                ((rpu) this.receiver).e();
                break;
            case 15:
                ((rpu) this.receiver).e();
                break;
            case 16:
                ((rpu) this.receiver).b();
                break;
            case 17:
                ((nru) this.receiver).c();
                break;
            case 18:
                ((nru) this.receiver).i();
                break;
            case 19:
                ((nru) this.receiver).a();
                break;
            case 20:
                ((nru) this.receiver).l();
                break;
            case 21:
                ((nru) this.receiver).l();
                break;
            case 22:
                ((nru) this.receiver).l();
                break;
            case 23:
                ((sai) this.receiver).a();
                break;
            case 24:
                ltu ltuVar = (ltu) this.receiver;
                ltuVar.x.d(ltuVar.p, new u5l((cvo) ltuVar.u.getValue(), ltuVar.v, (thj) ltuVar.w.invoke(), null));
                break;
            case 25:
                ((s2v) this.receiver).c();
                break;
            case 26:
                ((s2v) this.receiver).g();
                break;
            case 27:
                ((s2v) this.receiver).c();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((s2v) this.receiver).f();
                break;
            default:
                ((s2v) this.receiver).c();
                break;
        }
        return Unit.a;
    }
}
