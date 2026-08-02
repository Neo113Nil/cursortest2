package com.IceFishing.LiveIceFishing;

import android.R;
import android.content.ActivityNotFoundException;
import android.view.View;
import com.anythink.expressad.foundation.d.d;
import i1.C4585b;
import i1.C4586c;

/* loaded from: classes.dex */
public final class y implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f6436n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ z f6437u;

    public /* synthetic */ y(z zVar, int i) {
        this.f6436n = i;
        this.f6437u = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6436n) {
            case 0:
                z zVar = this.f6437u;
                MainActivity mainActivity = zVar.f6440c;
                mainActivity.f6326O.setClass(mainActivity.getApplicationContext(), PlaygamesActivity.class);
                MainActivity mainActivity2 = zVar.f6440c;
                mainActivity2.f6326O.putExtra(d.c.f19422e, "https://static.gamezop.com/UCS62KJ8c/wall.png");
                mainActivity2.f6326O.putExtra(com.anythink.basead.exoplayer.k.o.f9232c, "Blocks Adventure Jungle Saga");
                mainActivity2.f6326O.putExtra("url", "https://10761.play.gamezop.com/g/UCS62KJ8c");
                mainActivity2.f6326O.putExtra("des", "In jungle lands where wild vines grow, drag and drop blocks in a vibrant flow. Match them right and hear them click: stack up points and do it quick!");
                try {
                    Y0.p.e(mainActivity2.f6322M).j(mainActivity2, Y0.p.f3890t, Y0.p.f3882l, Y0.p.f3863I, new C4585b(20, this));
                } catch (ActivityNotFoundException e9) {
                    e9.printStackTrace();
                }
                mainActivity2.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
            case 1:
                z zVar2 = this.f6437u;
                MainActivity mainActivity3 = zVar2.f6440c;
                mainActivity3.f6330Q.setClass(mainActivity3.getApplicationContext(), PlaygamesActivity.class);
                MainActivity mainActivity4 = zVar2.f6440c;
                mainActivity4.f6330Q.putExtra(d.c.f19422e, "https://static.gamezop.com/yVywAGBQ6/wall.png");
                mainActivity4.f6330Q.putExtra(com.anythink.basead.exoplayer.k.o.f9232c, "Bubble Shooter Classic");
                mainActivity4.f6330Q.putExtra("url", "https://10761.play.gamezop.com/g/yVywAGBQ6");
                mainActivity4.f6330Q.putExtra("des", "Match the colors, make them pop, burst the bubbles and watch them drop! The more bubbles that fall, the more points you get; here's a Bubble Shooter Classic — the best one yet!");
                try {
                    Y0.p.e(mainActivity4.f6322M).j(mainActivity4, Y0.p.f3890t, Y0.p.f3882l, Y0.p.f3863I, new C4586c(17, this));
                } catch (ActivityNotFoundException e10) {
                    e10.printStackTrace();
                }
                mainActivity4.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
            case 2:
                z zVar3 = this.f6437u;
                MainActivity mainActivity5 = zVar3.f6440c;
                mainActivity5.f6332R.setClass(mainActivity5.getApplicationContext(), PlaygamesActivity.class);
                MainActivity mainActivity6 = zVar3.f6440c;
                mainActivity6.f6332R.putExtra(d.c.f19422e, "https://static.gamezop.com/pGF1Q7l1s/wall.png");
                mainActivity6.f6332R.putExtra(com.anythink.basead.exoplayer.k.o.f9232c, "Mahjong At Home: Aloha Edition");
                mainActivity6.f6332R.putExtra("url", "https://10761.play.gamezop.com/g/pGF1Q7l1s");
                mainActivity6.f6332R.putExtra("des", "Under the palm trees, see the tiles align; match them quick and you’re doing fine! Gentle waves and islands glow: feel the vibe, let Mahjong flow!");
                try {
                    Y0.p.e(mainActivity6.f6322M).j(mainActivity6, Y0.p.f3890t, Y0.p.f3882l, Y0.p.f3863I, new n4.c(24, this));
                } catch (ActivityNotFoundException e11) {
                    e11.printStackTrace();
                }
                mainActivity6.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
            case 3:
                z zVar4 = this.f6437u;
                MainActivity mainActivity7 = zVar4.f6440c;
                mainActivity7.f6334S.setClass(mainActivity7.getApplicationContext(), PlaygamesActivity.class);
                MainActivity mainActivity8 = zVar4.f6440c;
                mainActivity8.f6334S.putExtra(d.c.f19422e, "https://static.gamezop.com/lzFg1zsV5/wall.png");
                mainActivity8.f6334S.putExtra(com.anythink.basead.exoplayer.k.o.f9232c, "Ellie Summer Spa Beauty Salon");
                mainActivity8.f6334S.putExtra("url", "https://10761.play.gamezop.com/g/lzFg1zsV5");
                mainActivity8.f6334S.putExtra("des", "Ellie Summer Spa: a soothing shore where beauty and joy are yours to explore! With gentle care, her glow will bloom. Play to find a sweet escape in a sunlit room!");
                try {
                    Y0.p.e(mainActivity8.f6322M).j(mainActivity8, Y0.p.f3890t, Y0.p.f3882l, Y0.p.f3863I, new I0.j(21, this));
                } catch (ActivityNotFoundException e12) {
                    e12.printStackTrace();
                }
                mainActivity8.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
            case 4:
                z zVar5 = this.f6437u;
                MainActivity mainActivity9 = zVar5.f6440c;
                mainActivity9.f6336T.setClass(mainActivity9.getApplicationContext(), PlaygamesActivity.class);
                MainActivity mainActivity10 = zVar5.f6440c;
                mainActivity10.f6336T.putExtra(d.c.f19422e, "https://static.gamezop.com/NzI2gCZFn/wall.png");
                mainActivity10.f6336T.putExtra(com.anythink.basead.exoplayer.k.o.f9232c, "Ellie Bachelorette Party");
                mainActivity10.f6336T.putExtra("des", "Dress up Ellie in sparkle and style! For it's her bachelorette bash, best make it worthwhile. Gowns, jewels, and heels to play: celebrate her special day in the most glamorous way!");
                mainActivity10.f6336T.putExtra("url", "https://10761.play.gamezop.com/g/NzI2gCZFn");
                try {
                    Y0.p.e(mainActivity10.f6322M).j(mainActivity10, Y0.p.f3890t, Y0.p.f3882l, Y0.p.f3863I, new C4585b(21, this));
                } catch (ActivityNotFoundException e13) {
                    e13.printStackTrace();
                }
                mainActivity10.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
            default:
                z zVar6 = this.f6437u;
                MainActivity mainActivity11 = zVar6.f6440c;
                mainActivity11.f6340V.setClass(mainActivity11.getApplicationContext(), PlaygamesActivity.class);
                MainActivity mainActivity12 = zVar6.f6440c;
                mainActivity12.f6340V.putExtra(d.c.f19422e, "https://static.gamezop.com/B1fSpMkP51m/wall.png");
                mainActivity12.f6340V.putExtra(com.anythink.basead.exoplayer.k.o.f9232c, "Bottle Shoot");
                mainActivity12.f6340V.putExtra("url", "https://10761.play.gamezop.com/g/B1fSpMkP51m");
                mainActivity12.f6340V.putExtra("des", "Bring out the cowboy in you and keep a level head while you shoot down as many bottles as you can. Keep an eye out for the red ones!");
                try {
                    Y0.p.e(mainActivity12.f6322M).j(mainActivity12, Y0.p.f3890t, Y0.p.f3882l, Y0.p.f3863I, new C4586c(18, this));
                } catch (ActivityNotFoundException e14) {
                    e14.printStackTrace();
                }
                mainActivity12.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
        }
    }
}
