package com.yandex.plus.pay.ui.common.internal.error.content;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ a(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        d dVar = this.b;
        j jVar = (j) obj;
        switch (i) {
            case 0:
                jVar.getClass();
                jVar.d(R.string.PlusPay_Error_Unknown_Title_New);
                jVar.c(R.string.PlusPay_Error_Unknown_Subtitle_New);
                jVar.f = dVar.b(R.string.PlusPay_Error_Unknown_Expandable_Title, R.string.PlusPay_Error_Unknown_Expandable_Text);
                e eVar = e.b;
                ArrayList arrayList = jVar.g;
                arrayList.add(eVar);
                arrayList.add(e.c);
                jVar.a("P000");
                break;
            case 1:
                jVar.getClass();
                jVar.d(R.string.PlusPay_Error_Unknown_Title_New);
                jVar.c(R.string.PlusPay_Error_Unknown_Subtitle_New);
                jVar.f = dVar.b(R.string.PlusPay_Error_Unknown_Expandable_Title, R.string.PlusPay_Error_Unknown_Expandable_Text);
                e eVar2 = e.b;
                ArrayList arrayList2 = jVar.g;
                arrayList2.add(eVar2);
                arrayList2.add(e.c);
                jVar.a("P023");
                break;
            case 2:
                jVar.getClass();
                jVar.d(R.string.PlusPay_Error_Unknown_Title_New);
                jVar.c(R.string.PlusPay_Error_Unknown_Subtitle_New);
                jVar.f = dVar.b(R.string.PlusPay_Error_Unknown_Expandable_Title, R.string.PlusPay_Error_Unknown_Expandable_Text);
                e eVar3 = e.b;
                ArrayList arrayList3 = jVar.g;
                arrayList3.add(eVar3);
                arrayList3.add(e.c);
                jVar.a("P011");
                break;
            default:
                jVar.getClass();
                jVar.d(R.string.PlusPay_Error_NotEnoughFunds_Title);
                jVar.c(R.string.PlusPay_Error_NotEnoughFunds_Subtitle);
                jVar.f = dVar.b(R.string.PlusPay_Error_NotEnoughFunds_Expandable_Title, R.string.PlusPay_Error_NotEnoughFunds_Expandable_Text);
                e eVar4 = e.b;
                ArrayList arrayList4 = jVar.g;
                arrayList4.add(eVar4);
                arrayList4.add(e.c);
                jVar.a("P010");
                break;
        }
        return Unit.a;
    }
}
