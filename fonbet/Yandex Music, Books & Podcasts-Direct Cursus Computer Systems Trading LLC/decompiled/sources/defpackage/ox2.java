package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;
import ru.yandex.music.chat.SupportChatActivity;

/* loaded from: classes3.dex */
public final class ox2 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ rx2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ox2(rx2 rx2Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = rx2Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ox2(this.k, continuation, 0);
            case 1:
                return new ox2(this.k, continuation, 1);
            case 2:
                return new ox2(this.k, continuation, 2);
            case 3:
                return new ox2(this.k, continuation, 3);
            default:
                return new ox2(this.k, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((ox2) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                this.k.a();
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                this.k.a();
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                Context context = this.k.e.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                String f = ((kw2) ((byb) qdcVar.C(I)).b(kw2.class)).a().f("instructionUrl");
                if (f == null) {
                    f = "https://yandex.ru/support/music-app-android/search-and-listen/problem-playing.html";
                }
                Intent addFlags = new Intent("android.intent.action.VIEW", Uri.parse(f)).addFlags(268435456);
                addFlags.getClass();
                if (addFlags.resolveActivity(context.getPackageManager()) != null) {
                    try {
                        context.startActivity(addFlags);
                    } catch (ActivityNotFoundException unused) {
                    }
                    break;
                }
                y5g.o0(context, context.getString(R.string.error_unknown));
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                this.k.e.getClass();
                break;
            default:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                wnd wndVar = this.k.e;
                wndVar.getClass();
                int i = SupportChatActivity.w;
                Context context2 = wndVar.b;
                Intent addFlags2 = qcm.d(context2, esr.BATTERY_RESTRICTIONS).addFlags(268435456);
                addFlags2.getClass();
                context2.startActivity(addFlags2);
                break;
        }
        return Unit.a;
    }
}
