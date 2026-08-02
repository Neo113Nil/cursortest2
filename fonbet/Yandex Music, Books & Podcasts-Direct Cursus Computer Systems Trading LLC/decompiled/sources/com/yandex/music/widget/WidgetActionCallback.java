package com.yandex.music.widget;

import android.content.Context;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.b6e;
import defpackage.hag;
import defpackage.jyr;
import defpackage.kg;
import defpackage.l18;
import defpackage.mg;
import defpackage.moi;
import defpackage.nkv;
import defpackage.nm6;
import defpackage.okv;
import defpackage.rkd;
import defpackage.rnv;
import defpackage.siv;
import defpackage.sjb;
import defpackage.ue;
import defpackage.ukv;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/music/widget/WidgetActionCallback;", "Lue;", "<init>", "()V", "Landroid/content/Context;", "context", "Lrkd;", "glanceId", "Lmg;", "parameters", "", "onAction", "(Landroid/content/Context;Lrkd;Lmg;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "widget"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class WidgetActionCallback implements ue {
    public static final kg b = new kg("WIDGET_ACTION");
    public static final kg c = new kg("WIDGET_RECENTLY_ENTITY");
    public static final kg d = new kg("WIDGET_RECENTLY_ENTITY_POSITION");
    public final jyr a = l18.b.b(hag.I(ukv.class), true);

    public final ukv a() {
        return (ukv) this.a.getValue();
    }

    @Override // defpackage.ue
    public Object onAction(@NotNull Context context, @NotNull rkd rkdVar, @NotNull mg mgVar, @NotNull Continuation<? super Unit> continuation) {
        moi moiVar = (moi) mgVar;
        nkv nkvVar = (nkv) moiVar.a.get(b);
        switch (nkvVar == null ? -1 : okv.a[nkvVar.ordinal()]) {
            case -1:
            case 14:
                return Unit.a;
            case 0:
            default:
                b6e.s();
                return null;
            case 1:
                ukv a = a();
                LinkedHashMap linkedHashMap = moiVar.a;
                Object e = a.e(rkdVar, (Integer) linkedHashMap.get(d), (rnv) linkedHashMap.get(c), continuation);
                return e == nm6.a ? e : Unit.a;
            case 2:
                Object d2 = a().d(rkdVar, continuation);
                return d2 == nm6.a ? d2 : Unit.a;
            case 3:
                Object c2 = a().c(rkdVar, continuation);
                return c2 == nm6.a ? c2 : Unit.a;
            case 4:
                Object b2 = a().b(rkdVar, continuation);
                return b2 == nm6.a ? b2 : Unit.a;
            case 5:
                ukv a2 = a();
                a2.getClass();
                a2.g(sjb.Skip, rkdVar);
                a2.d.d(new siv(7));
                Unit unit = Unit.a;
                nm6 nm6Var = nm6.a;
                return unit;
            case 6:
                ukv a3 = a();
                a3.getClass();
                a3.g(sjb.Skip, rkdVar);
                a3.d.d(new siv(4));
                Unit unit2 = Unit.a;
                nm6 nm6Var2 = nm6.a;
                return unit2;
            case 7:
                ukv a4 = a();
                a4.getClass();
                a4.g(sjb.Like, rkdVar);
                a4.d.d(new siv(5));
                Unit unit3 = Unit.a;
                nm6 nm6Var3 = nm6.a;
                return unit3;
            case 8:
                ukv a5 = a();
                a5.getClass();
                a5.g(sjb.Unlike, rkdVar);
                a5.d.d(new siv(11));
                Unit unit4 = Unit.a;
                nm6 nm6Var4 = nm6.a;
                return unit4;
            case 9:
                ukv a6 = a();
                a6.getClass();
                a6.g(sjb.Undislike, rkdVar);
                a6.d.d(new siv(12));
                Unit unit5 = Unit.a;
                nm6 nm6Var5 = nm6.a;
                return unit5;
            case 10:
                Object a7 = a().a(rkdVar, continuation);
                return a7 == nm6.a ? a7 : Unit.a;
            case 11:
                ukv a8 = a();
                a8.getClass();
                a8.g(sjb.Skip, rkdVar);
                a8.d.d(new siv(9));
                Unit unit6 = Unit.a;
                nm6 nm6Var6 = nm6.a;
                return unit6;
            case 12:
                ukv a9 = a();
                a9.getClass();
                a9.g(sjb.Skip, rkdVar);
                a9.d.d(new siv(6));
                Unit unit7 = Unit.a;
                nm6 nm6Var7 = nm6.a;
                return unit7;
            case 13:
                ukv a10 = a();
                a10.getClass();
                a10.g(sjb.Dislike, rkdVar);
                a10.d.d(new siv(10));
                Unit unit8 = Unit.a;
                nm6 nm6Var8 = nm6.a;
                return unit8;
        }
    }
}
