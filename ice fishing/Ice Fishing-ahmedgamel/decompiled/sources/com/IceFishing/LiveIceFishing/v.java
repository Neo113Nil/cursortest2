package com.IceFishing.LiveIceFishing;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.anythink.expressad.foundation.d.d;
import com.google.android.gms.internal.ads.LP;
import i1.C4586c;

/* loaded from: classes.dex */
public final class v implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f6431n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ MainActivity f6432u;

    public /* synthetic */ v(MainActivity mainActivity, int i) {
        this.f6431n = i;
        this.f6432u = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6431n) {
            case 0:
                MainActivity mainActivity = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity.getApplicationContext(), C5248R.anim.button_push));
                Intent intent = new Intent(mainActivity.f6322M, (Class<?>) GzopArcadegamesActivity.class);
                mainActivity.f6320L = intent;
                MainActivity.e(mainActivity, intent);
                mainActivity.f6335S0.c();
                break;
            case 1:
                MainActivity mainActivity2 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity2.getApplicationContext(), C5248R.anim.button_push));
                Intent intent2 = new Intent(mainActivity2.f6322M, (Class<?>) GzopPuzzleLogicActivity.class);
                mainActivity2.f6320L = intent2;
                MainActivity.e(mainActivity2, intent2);
                mainActivity2.f6335S0.c();
                break;
            case 2:
                MainActivity mainActivity3 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity3.getApplicationContext(), C5248R.anim.button_push));
                Intent intent3 = new Intent(mainActivity3.f6322M, (Class<?>) GzopSportsRacinggamesActivity.class);
                mainActivity3.f6320L = intent3;
                MainActivity.e(mainActivity3, intent3);
                mainActivity3.f6335S0.c();
                break;
            case 3:
                MainActivity mainActivity4 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity4.getApplicationContext(), C5248R.anim.button_push));
                Intent intent4 = new Intent(mainActivity4.f6322M, (Class<?>) GzopStretegygamesActivity.class);
                mainActivity4.f6320L = intent4;
                MainActivity.e(mainActivity4, intent4);
                mainActivity4.f6335S0.c();
                break;
            case 4:
                MainActivity mainActivity5 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity5.getApplicationContext(), C5248R.anim.button_push));
                Intent intent5 = new Intent(mainActivity5.f6322M, (Class<?>) GzopActiongamesActivity.class);
                mainActivity5.f6320L = intent5;
                MainActivity.e(mainActivity5, intent5);
                break;
            case 5:
                MainActivity mainActivity6 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity6.getApplicationContext(), C5248R.anim.button_push));
                Intent intent6 = new Intent(mainActivity6.f6322M, (Class<?>) GzopAdventuregamesActivity.class);
                mainActivity6.f6320L = intent6;
                MainActivity.e(mainActivity6, intent6);
                break;
            case 6:
                MainActivity mainActivity7 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity7.getApplicationContext(), C5248R.anim.button_push));
                Intent intent7 = new Intent(mainActivity7.f6322M, (Class<?>) GzopArcadegamesActivity.class);
                mainActivity7.f6320L = intent7;
                MainActivity.e(mainActivity7, intent7);
                break;
            case 7:
                MainActivity mainActivity8 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity8.getApplicationContext(), C5248R.anim.button_push));
                Intent intent8 = new Intent(mainActivity8.f6322M, (Class<?>) GzopPuzzleLogicActivity.class);
                mainActivity8.f6320L = intent8;
                MainActivity.e(mainActivity8, intent8);
                break;
            case 8:
                MainActivity mainActivity9 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity9.getApplicationContext(), C5248R.anim.button_push));
                Intent intent9 = new Intent(mainActivity9.f6322M, (Class<?>) GzopSportsRacinggamesActivity.class);
                mainActivity9.f6320L = intent9;
                MainActivity.e(mainActivity9, intent9);
                break;
            case 9:
                MainActivity mainActivity10 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity10.getApplicationContext(), C5248R.anim.button_push));
                Intent intent10 = new Intent(mainActivity10.f6322M, (Class<?>) GzopStretegygamesActivity.class);
                mainActivity10.f6320L = intent10;
                MainActivity.e(mainActivity10, intent10);
                break;
            case 10:
                this.f6432u.onBackPressed();
                break;
            case 11:
                MainActivity mainActivity11 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity11.getApplicationContext(), C5248R.anim.button_push));
                mainActivity11.f6320L = new Intent(mainActivity11.getApplicationContext(), (Class<?>) PlaygamesActivity.class);
                mainActivity11.f6320L.putExtra(d.c.f19422e, "https://static.gamezop.com/H1AN6fkwqJ7/cover.jpg");
                mainActivity11.f6320L.putExtra(com.anythink.basead.exoplayer.k.o.f9232c, "Bubble Wipeout");
                mainActivity11.f6320L.putExtra("url", "https://10761.play.gamezop.com/g/H1AN6fkwqJ7");
                mainActivity11.f6320L.putExtra("des", "Shoot down as many bubbles as you can - aim, match, shoot and burst the same colored bubbles. There is a timer to watch out for!");
                MainActivity.e(mainActivity11, mainActivity11.f6320L);
                break;
            case 12:
                MainActivity mainActivity12 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity12.getApplicationContext(), C5248R.anim.button_push));
                mainActivity12.f6320L = new Intent(mainActivity12.getApplicationContext(), (Class<?>) PlaygamesActivity.class);
                mainActivity12.f6320L.putExtra(d.c.f19422e, "https://static.gamezop.com/Skz4pzkDqyX/cover.jpg");
                mainActivity12.f6320L.putExtra(com.anythink.basead.exoplayer.k.o.f9232c, "Escape Run");
                mainActivity12.f6320L.putExtra("url", "https://10761.play.gamezop.com/g/Skz4pzkDqyX");
                mainActivity12.f6320L.putExtra("des", "Help the mountain man escape the eyes of media while he peacefully runs in the cold. Collect fruits to buy power-ups for the escape!");
                MainActivity.e(mainActivity12, mainActivity12.f6320L);
                break;
            case 13:
                MainActivity mainActivity13 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity13.getApplicationContext(), C5248R.anim.button_push));
                mainActivity13.f6320L = new Intent(mainActivity13.getApplicationContext(), (Class<?>) PlaygamesActivity.class);
                mainActivity13.f6320L.putExtra(d.c.f19422e, "https://static.gamezop.com/HJP4afkvqJQ/cover.jpg");
                mainActivity13.f6320L.putExtra(com.anythink.basead.exoplayer.k.o.f9232c, "City Cricket");
                mainActivity13.f6320L.putExtra("url", "https://10761.play.gamezop.com/g/HJP4afkvqJQ");
                mainActivity13.f6320L.putExtra("des", "Pick your city, bring out your batting gloves and show your Cricket skills. Let's see you chase that target!");
                MainActivity.e(mainActivity13, mainActivity13.f6320L);
                break;
            case 14:
                MainActivity mainActivity14 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity14.getApplicationContext(), C5248R.anim.button_push));
                mainActivity14.f6320L = new Intent(mainActivity14.getApplicationContext(), (Class<?>) PlaygamesActivity.class);
                mainActivity14.f6320L.putExtra(d.c.f19422e, "https://static.gamezop.com/H1Tz6z1Dqym/cover.jpg");
                mainActivity14.f6320L.putExtra(com.anythink.basead.exoplayer.k.o.f9232c, "Bouncy");
                mainActivity14.f6320L.putExtra("url", "https://10761.play.gamezop.com/g/H1Tz6z1Dqym");
                mainActivity14.f6320L.putExtra("des", "Bounce off the platforms and make as many jumps as you can in this amazing 3D game!");
                MainActivity.e(mainActivity14, mainActivity14.f6320L);
                break;
            case 15:
                MainActivity mainActivity15 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity15.getApplicationContext(), C5248R.anim.button_push));
                mainActivity15.f6320L = new Intent(mainActivity15.getApplicationContext(), (Class<?>) PlaygamesActivity.class);
                mainActivity15.f6320L.putExtra(d.c.f19422e, "https://static.gamezop.com/B1fSpMkP51m/cover.jpg");
                mainActivity15.f6320L.putExtra(com.anythink.basead.exoplayer.k.o.f9232c, "Bottle Shoot");
                mainActivity15.f6320L.putExtra("url", "https://10761.play.gamezop.com/g/B1fSpMkP51m");
                mainActivity15.f6320L.putExtra("des", "Bring out the cowboy in you and keep a level head while you shoot down as many bottles as you can. Keep an eye out for the red ones!");
                MainActivity.e(mainActivity15, mainActivity15.f6320L);
                break;
            case 16:
                MainActivity mainActivity16 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity16.getApplicationContext(), C5248R.anim.button_push));
                mainActivity16.f6320L = new Intent(mainActivity16.getApplicationContext(), (Class<?>) PlaygamesActivity.class);
                mainActivity16.f6320L.putExtra(d.c.f19422e, "https://static.gamezop.com/SkhljT2fdgb/cover.jpg");
                mainActivity16.f6320L.putExtra(com.anythink.basead.exoplayer.k.o.f9232c, "Ludo With Friends");
                mainActivity16.f6320L.putExtra("url", "https://10761.play.gamezop.com/g/SkhljT2fdgb");
                mainActivity16.f6320L.putExtra("des", "Here's the best multiplayer Ludo game! Play with your friends or with thousands of other players online.");
                MainActivity.e(mainActivity16, mainActivity16.f6320L);
                break;
            case 17:
                MainActivity mainActivity17 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity17.getApplicationContext(), C5248R.anim.button_push));
                mainActivity17.f6320L = new Intent(mainActivity17.getApplicationContext(), (Class<?>) PlaygamesActivity.class);
                mainActivity17.f6320L.putExtra(d.c.f19422e, "https://static.gamezop.com/S1Wrpf1v5ym/cover.jpg");
                mainActivity17.f6320L.putExtra(com.anythink.basead.exoplayer.k.o.f9232c, "Box Crush");
                mainActivity17.f6320L.putExtra("url", "https://10761.play.gamezop.com/g/S1Wrpf1v5ym");
                mainActivity17.f6320L.putExtra("des", "Clear rows and columns before the numbers get to 0. Keep an eye on the progress bar to unlock special power ups!");
                MainActivity.e(mainActivity17, mainActivity17.f6320L);
                break;
            case 18:
                MainActivity mainActivity18 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity18.getApplicationContext(), C5248R.anim.button_push));
                mainActivity18.f6320L = new Intent(mainActivity18.getApplicationContext(), (Class<?>) PlaygamesActivity.class);
                mainActivity18.f6320L.putExtra(d.c.f19422e, "https://static.gamezop.com/BkdJhTX50B/cover.jpg");
                mainActivity18.f6320L.putExtra(com.anythink.basead.exoplayer.k.o.f9232c, "Bowling Stars");
                mainActivity18.f6320L.putExtra("url", "https://10761.play.gamezop.com/g/BkdJhTX50B");
                mainActivity18.f6320L.putExtra("des", "Enjoy the best Bowling game online — compete with thousands of players! Let's see how many pins you can knock down!");
                MainActivity.e(mainActivity18, mainActivity18.f6320L);
                break;
            case 19:
                MainActivity mainActivity19 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity19.getApplicationContext(), C5248R.anim.button_push));
                mainActivity19.f6320L = new Intent(mainActivity19.getApplicationContext(), (Class<?>) PlaygamesActivity.class);
                mainActivity19.f6320L.putExtra(d.c.f19422e, "https://static.gamezop.com/rJ57aMJDcJm/cover.jpg");
                mainActivity19.f6320L.putExtra(com.anythink.basead.exoplayer.k.o.f9232c, "Go Chicken Go");
                mainActivity19.f6320L.putExtra("url", "https://10761.play.gamezop.com/g/rJ57aMJDcJm");
                mainActivity19.f6320L.putExtra("des", "There's a group of chickens that need to cross the road, and they need to do that quick. Just try and avoid blood!");
                MainActivity.e(mainActivity19, mainActivity19.f6320L);
                break;
            case 20:
                MainActivity mainActivity20 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity20.getApplicationContext(), C5248R.anim.button_push));
                mainActivity20.f6320L = new Intent(mainActivity20.getApplicationContext(), (Class<?>) PlaygamesActivity.class);
                mainActivity20.f6320L.putExtra(d.c.f19422e, "https://static.gamezop.com/SyfxJ3a75Cr/cover.jpg");
                mainActivity20.f6320L.putExtra(com.anythink.basead.exoplayer.k.o.f9232c, "Kingdom Fight");
                mainActivity20.f6320L.putExtra("url", "https://10761.play.gamezop.com/g/SyfxJ3a75Cr");
                mainActivity20.f6320L.putExtra("des", "A battle so awesome: we came with chapter two. The army of the undead just wants to get through. Slow them down, fry them up, let them take the arrows you spew!");
                MainActivity.e(mainActivity20, mainActivity20.f6320L);
                break;
            case 21:
                this.f6432u.f6335S0.r();
                break;
            case 22:
                MainActivity mainActivity21 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity21.getApplicationContext(), C5248R.anim.button_push));
                mainActivity21.f6320L = new Intent(mainActivity21.getApplicationContext(), (Class<?>) PlaygamesActivity.class);
                mainActivity21.f6320L.putExtra(d.c.f19422e, "https://static.gamezop.com/r1z13aXqAB/cover.jpg");
                mainActivity21.f6320L.putExtra(com.anythink.basead.exoplayer.k.o.f9232c, "Flappy Foot Chinko");
                mainActivity21.f6320L.putExtra("url", "https://10761.play.gamezop.com/g/r1z13aXqAB");
                mainActivity21.f6320L.putExtra("des", "Dribble the football through the adventures of this game: through fielders and defenders, through pigs and electric poles! Just don't lose!");
                MainActivity.e(mainActivity21, mainActivity21.f6320L);
                break;
            case 23:
                MainActivity mainActivity22 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity22.getApplicationContext(), C5248R.anim.button_push));
                mainActivity22.f6320L = new Intent(mainActivity22.getApplicationContext(), (Class<?>) PlaygamesActivity.class);
                mainActivity22.f6320L.putExtra(d.c.f19422e, "https://static.gamezop.com/H1PJn6mqAr/cover.jpg");
                mainActivity22.f6320L.putExtra(com.anythink.basead.exoplayer.k.o.f9232c, "Knife Flip");
                mainActivity22.f6320L.putExtra("url", "https://10761.play.gamezop.com/g/H1PJn6mqAr");
                mainActivity22.f6320L.putExtra("des", "You have to make the Knife flip from pillar to post! The objective of the game is simple: don't fall down. ");
                MainActivity.e(mainActivity22, mainActivity22.f6320L);
                break;
            case 24:
                MainActivity mainActivity23 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity23.getApplicationContext(), C5248R.anim.button_push));
                mainActivity23.f6320L = new Intent(mainActivity23.getApplicationContext(), (Class<?>) PlaygamesActivity.class);
                mainActivity23.f6320L.putExtra(d.c.f19422e, "https://static.gamezop.com/rkYbNLTIT-x/cover.jpg");
                mainActivity23.f6320L.putExtra(com.anythink.basead.exoplayer.k.o.f9232c, "Knight Ride");
                mainActivity23.f6320L.putExtra("url", "https://10761.play.gamezop.com/g/rkYbNLTIT-x");
                mainActivity23.f6320L.putExtra("des", "The canon's loaded and the knight's ready! Bounce through your flight while avoiding the onslaught of monsters.");
                MainActivity.e(mainActivity23, mainActivity23.f6320L);
                break;
            case 25:
                MainActivity mainActivity24 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity24.getApplicationContext(), C5248R.anim.button_push));
                mainActivity24.f6320L = new Intent(mainActivity24.getApplicationContext(), (Class<?>) PlaygamesActivity.class);
                mainActivity24.f6320L.putExtra(d.c.f19422e, "https://static.gamezop.com/B1gBpzJwqJQ/cover.jpg");
                mainActivity24.f6320L.putExtra(com.anythink.basead.exoplayer.k.o.f9232c, "Pirate Hunt");
                mainActivity24.f6320L.putExtra("url", "https://10761.play.gamezop.com/g/B1gBpzJwqJQ");
                mainActivity24.f6320L.putExtra("des", "Protect your waters from the notorious pirates by hunting them one by one, but spare the hostages and keep an eye out for the bonus!");
                MainActivity.e(mainActivity24, mainActivity24.f6320L);
                break;
            case 26:
                MainActivity mainActivity25 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity25.getApplicationContext(), C5248R.anim.button_push));
                mainActivity25.f6320L = new Intent(mainActivity25.getApplicationContext(), (Class<?>) PlaygamesActivity.class);
                mainActivity25.f6320L.putExtra(d.c.f19422e, "https://static.gamezop.com/H1IEpMJP917/cover.jpg");
                mainActivity25.f6320L.putExtra(com.anythink.basead.exoplayer.k.o.f9232c, "Plane Fight");
                mainActivity25.f6320L.putExtra("url", "https://10761.play.gamezop.com/g/H1IEpMJP917");
                mainActivity25.f6320L.putExtra("des", "Collide with your enemy and push their blocks on to the bomb before they kill you. Bring out the fighter pilot in you!");
                MainActivity.e(mainActivity25, mainActivity25.f6320L);
                break;
            case 27:
                MainActivity mainActivity26 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity26.getApplicationContext(), C5248R.anim.button_push));
                mainActivity26.f6320L = new Intent(mainActivity26.getApplicationContext(), (Class<?>) PlaygamesActivity.class);
                mainActivity26.f6320L.putExtra(d.c.f19422e, "https://static.gamezop.com/r10-NLT86bx/cover.jpg");
                mainActivity26.f6320L.putExtra(com.anythink.basead.exoplayer.k.o.f9232c, "Rope Ninja");
                mainActivity26.f6320L.putExtra("url", "https://10761.play.gamezop.com/g/r10-NLT86bx");
                mainActivity26.f6320L.putExtra("des", "Time to show your ninja skills and catch as many birds as you can. Mind the coins you can collect!");
                MainActivity.e(mainActivity26, mainActivity26.f6320L);
                break;
            case 28:
                MainActivity mainActivity27 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity27.getApplicationContext(), C5248R.anim.button_push));
                Intent intent11 = new Intent("android.intent.action.SEND");
                intent11.setType("text/plain");
                intent11.putExtra("android.intent.extra.TEXT", mainActivity27.getString(C5248R.string.app_name) + "http://play.google.com/store/apps/details?id=" + mainActivity27.getPackageName());
                mainActivity27.startActivity(Intent.createChooser(intent11, "share Using"));
                mainActivity27.f6335S0.c();
                break;
            default:
                MainActivity mainActivity28 = this.f6432u;
                view.startAnimation(AnimationUtils.loadAnimation(mainActivity28.getApplicationContext(), C5248R.anim.button_push));
                com.bumptech.glide.manager.n nVar = new com.bumptech.glide.manager.n();
                ((C4586c) nVar.f24250v).f38154u = Integer.valueOf(Color.parseColor(mainActivity28.f6322M.getString(C5248R.color.colorPrimary)) | (-16777216));
                ((Intent) nVar.f24249u).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                LP b9 = nVar.b();
                ((Intent) b9.f26916u).setPackage("com.android.chrome");
                b9.i(mainActivity28.f6322M, Uri.parse("https://sites.google.com/view/icefishinggames"));
                mainActivity28.f6335S0.c();
                break;
        }
    }
}
