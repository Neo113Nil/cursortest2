package com.icefishing.icefishingliveapp;

import android.R;
import android.content.ActivityNotFoundException;
import android.view.View;
import com.anythink.expressad.foundation.d.d;
import g1.C4523c;
import g1.C4524d;

/* loaded from: classes2.dex */
public final class w implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37106n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x f37107u;

    public /* synthetic */ w(x xVar, int i) {
        this.f37106n = i;
        this.f37107u = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f37106n) {
            case 0:
                x xVar = this.f37107u;
                MainActivity mainActivity = xVar.f37110c;
                mainActivity.f36997O.setClass(mainActivity.getApplicationContext(), PlaygamesActivity.class);
                MainActivity mainActivity2 = xVar.f37110c;
                mainActivity2.f36997O.putExtra(d.c.f18793e, "https://static.gamezop.com/UCS62KJ8c/wall.png");
                mainActivity2.f36997O.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Blocks Adventure Jungle Saga");
                mainActivity2.f36997O.putExtra("url", "https://10761.play.gamezop.com/g/UCS62KJ8c");
                mainActivity2.f36997O.putExtra("des", "In jungle lands where wild vines grow, drag and drop blocks in a vibrant flow. Match them right and hear them click: stack up points and do it quick!");
                try {
                    k4.m.e(mainActivity2.f36993M).j(mainActivity2, k4.m.f38803t, k4.m.f38795l, k4.m.f38776I, new C4524d(14, this));
                } catch (ActivityNotFoundException e6) {
                    e6.printStackTrace();
                }
                mainActivity2.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
            case 1:
                x xVar2 = this.f37107u;
                MainActivity mainActivity3 = xVar2.f37110c;
                mainActivity3.f37001Q.setClass(mainActivity3.getApplicationContext(), PlaygamesActivity.class);
                MainActivity mainActivity4 = xVar2.f37110c;
                mainActivity4.f37001Q.putExtra(d.c.f18793e, "https://static.gamezop.com/yVywAGBQ6/wall.png");
                mainActivity4.f37001Q.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Bubble Shooter Classic");
                mainActivity4.f37001Q.putExtra("url", "https://10761.play.gamezop.com/g/yVywAGBQ6");
                mainActivity4.f37001Q.putExtra("des", "Match the colors, make them pop, burst the bubbles and watch them drop! The more bubbles that fall, the more points you get; here's a Bubble Shooter Classic — the best one yet!");
                try {
                    k4.m.e(mainActivity4.f36993M).j(mainActivity4, k4.m.f38803t, k4.m.f38795l, k4.m.f38776I, new h4.c(22, this));
                } catch (ActivityNotFoundException e9) {
                    e9.printStackTrace();
                }
                mainActivity4.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
            case 2:
                x xVar3 = this.f37107u;
                MainActivity mainActivity5 = xVar3.f37110c;
                mainActivity5.f37003R.setClass(mainActivity5.getApplicationContext(), PlaygamesActivity.class);
                MainActivity mainActivity6 = xVar3.f37110c;
                mainActivity6.f37003R.putExtra(d.c.f18793e, "https://static.gamezop.com/pGF1Q7l1s/wall.png");
                mainActivity6.f37003R.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Mahjong At Home: Aloha Edition");
                mainActivity6.f37003R.putExtra("url", "https://10761.play.gamezop.com/g/pGF1Q7l1s");
                mainActivity6.f37003R.putExtra("des", "Under the palm trees, see the tiles align; match them quick and you’re doing fine! Gentle waves and islands glow: feel the vibe, let Mahjong flow!");
                try {
                    k4.m.e(mainActivity6.f36993M).j(mainActivity6, k4.m.f38803t, k4.m.f38795l, k4.m.f38776I, new I0.j(24, this));
                } catch (ActivityNotFoundException e10) {
                    e10.printStackTrace();
                }
                mainActivity6.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
            case 3:
                x xVar4 = this.f37107u;
                MainActivity mainActivity7 = xVar4.f37110c;
                mainActivity7.f37005S.setClass(mainActivity7.getApplicationContext(), PlaygamesActivity.class);
                MainActivity mainActivity8 = xVar4.f37110c;
                mainActivity8.f37005S.putExtra(d.c.f18793e, "https://static.gamezop.com/lzFg1zsV5/wall.png");
                mainActivity8.f37005S.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Ellie Summer Spa Beauty Salon");
                mainActivity8.f37005S.putExtra("url", "https://10761.play.gamezop.com/g/lzFg1zsV5");
                mainActivity8.f37005S.putExtra("des", "Ellie Summer Spa: a soothing shore where beauty and joy are yours to explore! With gentle care, her glow will bloom. Play to find a sweet escape in a sunlit room!");
                try {
                    k4.m.e(mainActivity8.f36993M).j(mainActivity8, k4.m.f38803t, k4.m.f38795l, k4.m.f38776I, new C4523c(21, this));
                } catch (ActivityNotFoundException e11) {
                    e11.printStackTrace();
                }
                mainActivity8.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
            case 4:
                x xVar5 = this.f37107u;
                MainActivity mainActivity9 = xVar5.f37110c;
                mainActivity9.f37007T.setClass(mainActivity9.getApplicationContext(), PlaygamesActivity.class);
                MainActivity mainActivity10 = xVar5.f37110c;
                mainActivity10.f37007T.putExtra(d.c.f18793e, "https://static.gamezop.com/NzI2gCZFn/wall.png");
                mainActivity10.f37007T.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Ellie Bachelorette Party");
                mainActivity10.f37007T.putExtra("des", "Dress up Ellie in sparkle and style! For it's her bachelorette bash, best make it worthwhile. Gowns, jewels, and heels to play: celebrate her special day in the most glamorous way!");
                mainActivity10.f37007T.putExtra("url", "https://10761.play.gamezop.com/g/NzI2gCZFn");
                try {
                    k4.m.e(mainActivity10.f36993M).j(mainActivity10, k4.m.f38803t, k4.m.f38795l, k4.m.f38776I, new C4524d(15, this));
                } catch (ActivityNotFoundException e12) {
                    e12.printStackTrace();
                }
                mainActivity10.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
            default:
                x xVar6 = this.f37107u;
                MainActivity mainActivity11 = xVar6.f37110c;
                mainActivity11.f37011V.setClass(mainActivity11.getApplicationContext(), PlaygamesActivity.class);
                MainActivity mainActivity12 = xVar6.f37110c;
                mainActivity12.f37011V.putExtra(d.c.f18793e, "https://static.gamezop.com/B1fSpMkP51m/wall.png");
                mainActivity12.f37011V.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Bottle Shoot");
                mainActivity12.f37011V.putExtra("url", "https://10761.play.gamezop.com/g/B1fSpMkP51m");
                mainActivity12.f37011V.putExtra("des", "Bring out the cowboy in you and keep a level head while you shoot down as many bottles as you can. Keep an eye out for the red ones!");
                try {
                    k4.m.e(mainActivity12.f36993M).j(mainActivity12, k4.m.f38803t, k4.m.f38795l, k4.m.f38776I, new h4.c(23, this));
                } catch (ActivityNotFoundException e13) {
                    e13.printStackTrace();
                }
                mainActivity12.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
        }
    }
}
