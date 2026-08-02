package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.yandex.passport.R;
import com.yandex.passport.internal.ui.authsdk.a;
import com.yandex.passport.internal.ui.authsdk.n;
import com.yandex.passport.internal.ui.bouncer.error.q;
import com.yandex.passport.internal.ui.bouncer.error.t;
import com.yandex.passport.internal.ui.bouncer.loading.b;
import com.yandex.passport.internal.ui.bouncer.loading.i;
import com.yandex.passport.internal.ui.bouncer.model.x1;
import com.yandex.passport.internal.ui.bouncer.model.y1;
import com.yandex.passport.internal.ui.bouncer.roundabout.items.v;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomSheetActivity;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.r0;
import com.yandex.passport.internal.ui.sloth.authsdk.h0;
import com.yandex.passport.sloth.ui.c1;
import com.yandex.passport.sloth.ui.o0;
import com.yandex.plus.bdui.plus.scenario.m;
import com.yandex.plus.core.network.interceptor.e;
import com.yandex.plus.home.feature.webviews.internal.home.g;
import com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f;
import com.yandex.plus.home.feature.webviews.internal.stories.c;
import com.yandex.plus.home.feature.webviews.internal.stories.k;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class qs extends aur implements Function1 {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qs(Object obj, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.k = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new qs((oq) this.k, continuation, 0);
            case 1:
                return new qs((fk0) this.k, continuation, 1);
            case 2:
                return new qs((ArrayList) this.k, continuation, 2);
            case 3:
                return new qs((aea) this.k, continuation, 3);
            case 4:
                return new qs((aqi) this.k, continuation, 4);
            case 5:
                return new qs((rxv) this.k, continuation, 5);
            case 6:
                return new qs((gs4) this.k, continuation, 6);
            case 7:
                return new qs((xsu) this.k, continuation, 7);
            case 8:
                return new qs((u0f) this.k, continuation, 8);
            case 9:
                return new qs((igr) this.k, continuation, 9);
            case 10:
                return new qs((se5) this.k, continuation, 10);
            case 11:
                return new qs((ybb) this.k, continuation, 11);
            case 12:
                return new qs((String) this.k, continuation, 12);
            case 13:
                return new qs((a) this.k, continuation, 13);
            case 14:
                return new qs((n) this.k, continuation, 14);
            case 15:
                return new qs((t) this.k, continuation, 15);
            case 16:
                return new qs((b) this.k, continuation, 16);
            case 17:
                return new qs((i) this.k, continuation, 17);
            case 18:
                return new qs((com.yandex.passport.internal.ui.bouncer.roundabout.t) this.k, continuation, 18);
            case 19:
                return new qs((v) this.k, continuation, 19);
            case 20:
                return new qs((LogoutBottomSheetActivity) this.k, continuation, 20);
            case 21:
                return new qs((h0) this.k, continuation, 21);
            case 22:
                return new qs((c1) this.k, continuation, 22);
            case 23:
                return new qs((m) this.k, continuation, 23);
            case 24:
                return new qs((e) this.k, continuation, 24);
            case 25:
                return new qs((g) this.k, continuation, 25);
            default:
                return new qs((k) this.k, continuation, 26);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((qs) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                fk0.a((fk0) obj2);
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                aea.a((aea) obj2);
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                ((aqi) obj2).setValue(Boolean.TRUE);
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                act actVar = rxv.K;
                ((rxv) obj2).p(true);
                break;
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                g51 g51Var = (g51) ((gs4) obj2).e;
                g51Var.getClass();
                break;
            case 7:
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                break;
            case 8:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                break;
            case 9:
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                break;
            case 10:
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                break;
            case 11:
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                break;
            case 12:
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                break;
            case 13:
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                ((a) obj2).invoke();
                break;
            case 14:
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                n nVar = (n) obj2;
                com.yandex.passport.internal.clipboard.a aVar = nVar.g;
                q qVar = nVar.d;
                com.yandex.passport.internal.ui.bouncer.error.k kVar = qVar.d;
                StringBuilder sb = new StringBuilder();
                sb.append((Object) kVar.f.getText());
                sb.append('\n');
                sb.append((Object) kVar.g.getText());
                sb.append('\n');
                sb.append((Object) kVar.h.getText());
                sb.append('\n');
                sb.append((Object) kVar.i.getText());
                String sb2 = sb.toString();
                aVar.getClass();
                ClipData newPlainText = ClipData.newPlainText("errorInfo", sb2);
                ClipboardManager clipboardManager = aVar.a;
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(newPlainText);
                }
                Context context = qVar.a;
                String string = context.getString(R.string.passport_error_slab_toast_text);
                string.getClass();
                Toast.makeText(context, string, 0).show();
                break;
            case 15:
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                ((t) obj2).m.a(y1.c);
                break;
            case 16:
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                ((b) obj2).l.a(y1.b);
                break;
            case 17:
                nm6 nm6Var18 = nm6.a;
                qgg.h0(obj);
                ((i) obj2).m.a(y1.b);
                break;
            case 18:
                nm6 nm6Var19 = nm6.a;
                qgg.h0(obj);
                ((com.yandex.passport.internal.ui.bouncer.roundabout.t) obj2).m.a(y1.b);
                break;
            case 19:
                nm6 nm6Var20 = nm6.a;
                qgg.h0(obj);
                ((v) obj2).l.a(new x1(null));
                break;
            case 20:
                nm6 nm6Var21 = nm6.a;
                qgg.h0(obj);
                int i2 = LogoutBottomSheetActivity.k;
                ((LogoutBottomSheetActivity) obj2).k().G(r0.b);
                break;
            case 21:
                nm6 nm6Var22 = nm6.a;
                qgg.h0(obj);
                ((h0) obj2).invoke();
                break;
            case 22:
                nm6 nm6Var23 = nm6.a;
                qgg.h0(obj);
                ((o0) ((c1) obj2)).b.invoke();
                break;
            case 23:
                nm6 nm6Var24 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.bdui.plus.auth.b bVar = (com.yandex.plus.bdui.plus.auth.b) ((m) obj2).m.get();
                if (bVar != null) {
                    break;
                }
                break;
            case 24:
                nm6 nm6Var25 = nm6.a;
                qgg.h0(obj);
                e eVar = (e) obj2;
                int i3 = eVar.d;
                ArrayList arrayList = eVar.c;
                if (i3 >= arrayList.size()) {
                    xq0.q("Check failed.");
                    break;
                } else if (!eVar.f && eVar.g != 0) {
                    jj4.h(arrayList.get(i3), " must call proceed() exactly once", "interceptor ");
                    break;
                } else {
                    eVar.g++;
                    break;
                }
                break;
            case 25:
                nm6 nm6Var26 = nm6.a;
                qgg.h0(obj);
                g gVar = (g) obj2;
                f h0 = gVar.h0();
                rar rarVar = h0.i;
                Continuation continuation = null;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                h0.i = null;
                ((com.yandex.plus.home.feature.webviews.internal.home.a) gVar.e).j();
                f h02 = gVar.h0();
                String str = gVar.g.c;
                String str2 = gVar.J;
                h02.getClass();
                h02.j(new aa0(h02, str, str2, continuation, 17));
                break;
            default:
                nm6 nm6Var27 = nm6.a;
                qgg.h0(obj);
                k kVar2 = (k) obj2;
                com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.g h03 = kVar2.h0();
                rar rarVar2 = h03.i;
                if (rarVar2 != null) {
                    rarVar2.g(null);
                }
                h03.i = null;
                ((c) kVar2.e).j();
                com.yandex.plus.home.feature.webviews.internal.uri.g gVar2 = kVar2.g;
                String str3 = gVar2.b;
                if (str3 != null) {
                    com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.g h04 = kVar2.h0();
                    String str4 = gVar2.c;
                    String str5 = kVar2.F;
                    h04.getClass();
                    h04.j(new jbb(h04, str3, str4, str5, (Continuation) null, 14));
                }
                break;
        }
        return Unit.a;
    }
}
