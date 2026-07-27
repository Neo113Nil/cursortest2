package com.icefishing.icefishinglive2;

import android.R;
import android.content.ActivityNotFoundException;
import android.view.View;
import com.anythink.expressad.foundation.d.d;
import g1.C4522b;
import g1.C4523c;
import o4.C4799l;

/* loaded from: classes2.dex */
public final class x implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36945n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ y f36946u;

    public /* synthetic */ x(y yVar, int i) {
        this.f36945n = i;
        this.f36946u = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36945n) {
            case 0:
                y yVar = this.f36946u;
                MainActivity mainActivity = yVar.f36949c;
                mainActivity.f36836O.setClass(mainActivity.getApplicationContext(), PlaygamesActivity.class);
                MainActivity mainActivity2 = yVar.f36949c;
                mainActivity2.f36836O.putExtra(d.c.f18635e, "https://static.gamezop.com/UCS62KJ8c/wall.png");
                mainActivity2.f36836O.putExtra(com.anythink.basead.exoplayer.k.o.f8446c, "Blocks Adventure Jungle Saga");
                mainActivity2.f36836O.putExtra("url", "https://10761.play.gamezop.com/g/UCS62KJ8c");
                mainActivity2.f36836O.putExtra("des", "In jungle lands where wild vines grow, drag and drop blocks in a vibrant flow. Match them right and hear them click: stack up points and do it quick!");
                try {
                    C4799l.e(mainActivity2.f36832M).j(mainActivity2, C4799l.f39624t, C4799l.f39616l, C4799l.f39597I, new C4523c(18, this));
                } catch (ActivityNotFoundException e9) {
                    e9.printStackTrace();
                }
                mainActivity2.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
            case 1:
                y yVar2 = this.f36946u;
                MainActivity mainActivity3 = yVar2.f36949c;
                mainActivity3.f36840Q.setClass(mainActivity3.getApplicationContext(), PlaygamesActivity.class);
                MainActivity mainActivity4 = yVar2.f36949c;
                mainActivity4.f36840Q.putExtra(d.c.f18635e, "https://static.gamezop.com/yVywAGBQ6/wall.png");
                mainActivity4.f36840Q.putExtra(com.anythink.basead.exoplayer.k.o.f8446c, "Bubble Shooter Classic");
                mainActivity4.f36840Q.putExtra("url", "https://10761.play.gamezop.com/g/yVywAGBQ6");
                mainActivity4.f36840Q.putExtra("des", "Match the colors, make them pop, burst the bubbles and watch them drop! The more bubbles that fall, the more points you get; here's a Bubble Shooter Classic — the best one yet!");
                try {
                    C4799l.e(mainActivity4.f36832M).j(mainActivity4, C4799l.f39624t, C4799l.f39616l, C4799l.f39597I, new F1.a(14, this));
                } catch (ActivityNotFoundException e10) {
                    e10.printStackTrace();
                }
                mainActivity4.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
            case 2:
                y yVar3 = this.f36946u;
                MainActivity mainActivity5 = yVar3.f36949c;
                mainActivity5.f36842R.setClass(mainActivity5.getApplicationContext(), PlaygamesActivity.class);
                MainActivity mainActivity6 = yVar3.f36949c;
                mainActivity6.f36842R.putExtra(d.c.f18635e, "https://static.gamezop.com/pGF1Q7l1s/wall.png");
                mainActivity6.f36842R.putExtra(com.anythink.basead.exoplayer.k.o.f8446c, "Mahjong At Home: Aloha Edition");
                mainActivity6.f36842R.putExtra("url", "https://10761.play.gamezop.com/g/pGF1Q7l1s");
                mainActivity6.f36842R.putExtra("des", "Under the palm trees, see the tiles align; match them quick and you’re doing fine! Gentle waves and islands glow: feel the vibe, let Mahjong flow!");
                try {
                    C4799l.e(mainActivity6.f36832M).j(mainActivity6, C4799l.f39624t, C4799l.f39616l, C4799l.f39597I, new I0.j(21, this));
                } catch (ActivityNotFoundException e11) {
                    e11.printStackTrace();
                }
                mainActivity6.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
            case 3:
                y yVar4 = this.f36946u;
                MainActivity mainActivity7 = yVar4.f36949c;
                mainActivity7.f36844S.setClass(mainActivity7.getApplicationContext(), PlaygamesActivity.class);
                MainActivity mainActivity8 = yVar4.f36949c;
                mainActivity8.f36844S.putExtra(d.c.f18635e, "https://static.gamezop.com/lzFg1zsV5/wall.png");
                mainActivity8.f36844S.putExtra(com.anythink.basead.exoplayer.k.o.f8446c, "Ellie Summer Spa Beauty Salon");
                mainActivity8.f36844S.putExtra("url", "https://10761.play.gamezop.com/g/lzFg1zsV5");
                mainActivity8.f36844S.putExtra("des", "Ellie Summer Spa: a soothing shore where beauty and joy are yours to explore! With gentle care, her glow will bloom. Play to find a sweet escape in a sunlit room!");
                try {
                    C4799l.e(mainActivity8.f36832M).j(mainActivity8, C4799l.f39624t, C4799l.f39616l, C4799l.f39597I, new C4522b(17, this));
                } catch (ActivityNotFoundException e12) {
                    e12.printStackTrace();
                }
                mainActivity8.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
            case 4:
                y yVar5 = this.f36946u;
                MainActivity mainActivity9 = yVar5.f36949c;
                mainActivity9.f36846T.setClass(mainActivity9.getApplicationContext(), PlaygamesActivity.class);
                MainActivity mainActivity10 = yVar5.f36949c;
                mainActivity10.f36846T.putExtra(d.c.f18635e, "https://static.gamezop.com/NzI2gCZFn/wall.png");
                mainActivity10.f36846T.putExtra(com.anythink.basead.exoplayer.k.o.f8446c, "Ellie Bachelorette Party");
                mainActivity10.f36846T.putExtra("des", "Dress up Ellie in sparkle and style! For it's her bachelorette bash, best make it worthwhile. Gowns, jewels, and heels to play: celebrate her special day in the most glamorous way!");
                mainActivity10.f36846T.putExtra("url", "https://10761.play.gamezop.com/g/NzI2gCZFn");
                try {
                    C4799l.e(mainActivity10.f36832M).j(mainActivity10, C4799l.f39624t, C4799l.f39616l, C4799l.f39597I, new C4523c(19, this));
                } catch (ActivityNotFoundException e13) {
                    e13.printStackTrace();
                }
                mainActivity10.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
            default:
                y yVar6 = this.f36946u;
                MainActivity mainActivity11 = yVar6.f36949c;
                mainActivity11.f36850V.setClass(mainActivity11.getApplicationContext(), PlaygamesActivity.class);
                MainActivity mainActivity12 = yVar6.f36949c;
                mainActivity12.f36850V.putExtra(d.c.f18635e, "https://static.gamezop.com/B1fSpMkP51m/wall.png");
                mainActivity12.f36850V.putExtra(com.anythink.basead.exoplayer.k.o.f8446c, "Bottle Shoot");
                mainActivity12.f36850V.putExtra("url", "https://10761.play.gamezop.com/g/B1fSpMkP51m");
                mainActivity12.f36850V.putExtra("des", "Bring out the cowboy in you and keep a level head while you shoot down as many bottles as you can. Keep an eye out for the red ones!");
                try {
                    C4799l.e(mainActivity12.f36832M).j(mainActivity12, C4799l.f39624t, C4799l.f39616l, C4799l.f39597I, new F1.a(15, this));
                } catch (ActivityNotFoundException e14) {
                    e14.printStackTrace();
                }
                mainActivity12.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
        }
    }
}
