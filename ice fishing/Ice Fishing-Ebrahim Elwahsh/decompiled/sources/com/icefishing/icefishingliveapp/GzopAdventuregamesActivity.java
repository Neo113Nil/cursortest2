package com.icefishing.icefishingliveapp;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.anythink.expressad.foundation.d.d;
import com.google.android.gms.internal.ads.CL;
import h.AbstractActivityC4553l;
import k4.InterfaceC4657l;

/* loaded from: classes2.dex */
public class GzopAdventuregamesActivity extends AbstractActivityC4553l {
    Context context;
    private ImageView imageview1;
    private ImageView imageview10;
    private ImageView imageview11;
    private ImageView imageview12;
    private ImageView imageview13;
    private ImageView imageview14;
    private ImageView imageview15;
    private ImageView imageview16;
    private ImageView imageview17;
    private ImageView imageview18;
    private ImageView imageview19;
    private ImageView imageview2;
    private ImageView imageview20;
    private ImageView imageview21;
    private ImageView imageview22;
    private ImageView imageview23;
    private ImageView imageview24;
    private ImageView imageview25;
    private ImageView imageview26;
    private ImageView imageview27;
    private ImageView imageview28;
    private ImageView imageview29;
    private ImageView imageview3;
    private ImageView imageview30;
    private ImageView imageview31;
    private ImageView imageview32;
    private ImageView imageview33;
    private ImageView imageview34;
    private ImageView imageview35;
    private ImageView imageview36;
    private ImageView imageview37;
    private ImageView imageview38;
    private ImageView imageview39;
    private ImageView imageview4;
    private ImageView imageview40;
    private ImageView imageview41;
    private ImageView imageview42;
    private ImageView imageview43;
    private ImageView imageview44;
    private ImageView imageview5;
    private ImageView imageview6;
    private ImageView imageview7;
    private ImageView imageview8;
    private ImageView imageview9;
    public Intent intent_navigation_adventure = new Intent();
    private LinearLayout linear1;
    private LinearLayout linear10;
    private LinearLayout linear11;
    private LinearLayout linear12;
    private LinearLayout linear13;
    private LinearLayout linear14;
    private LinearLayout linear15;
    private LinearLayout linear16;
    private LinearLayout linear17;
    private LinearLayout linear18;
    private LinearLayout linear19;
    private LinearLayout linear2;
    private LinearLayout linear20;
    private LinearLayout linear21;
    private LinearLayout linear22;
    private LinearLayout linear23;
    private LinearLayout linear24;
    private LinearLayout linear25;
    private LinearLayout linear26;
    private LinearLayout linear27;
    private LinearLayout linear28;
    private LinearLayout linear29;
    private LinearLayout linear3;
    private LinearLayout linear30;
    private LinearLayout linear31;
    private LinearLayout linear32;
    private LinearLayout linear33;
    private LinearLayout linear34;
    private LinearLayout linear35;
    private LinearLayout linear36;
    private LinearLayout linear37;
    private LinearLayout linear38;
    private LinearLayout linear39;
    private LinearLayout linear4;
    private LinearLayout linear40;
    private LinearLayout linear41;
    private LinearLayout linear42;
    private LinearLayout linear43;
    private LinearLayout linear44;
    private LinearLayout linear45;
    private LinearLayout linear46;
    private LinearLayout linear47;
    private LinearLayout linear48;
    private LinearLayout linear49;
    private LinearLayout linear5;
    private LinearLayout linear50;
    private LinearLayout linear51;
    private LinearLayout linear52;
    private LinearLayout linear53;
    private LinearLayout linear54;
    private LinearLayout linear55;
    private LinearLayout linear56;
    private LinearLayout linear57;
    private LinearLayout linear58;
    private LinearLayout linear59;
    private LinearLayout linear6;
    private LinearLayout linear60;
    private LinearLayout linear61;
    private LinearLayout linear62;
    private LinearLayout linear63;
    private LinearLayout linear64;
    private LinearLayout linear65;
    private LinearLayout linear7;
    private LinearLayout linear8;
    private LinearLayout linear9;
    private LinearLayout linear_main;

    /* JADX INFO: Access modifiers changed from: private */
    public void callAds(final Intent intent) {
        try {
            k4.m.e(this.context).j(this, k4.m.f38803t, k4.m.f38795l, k4.m.f38776I, new InterfaceC4657l() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.45
                @Override // k4.InterfaceC4657l
                public void OnCall() {
                    GzopAdventuregamesActivity.this.startActivity(intent);
                }
            });
        } catch (ActivityNotFoundException e6) {
            e6.printStackTrace();
        }
    }

    private void initialize(Bundle bundle) {
        this.linear1 = (LinearLayout) findViewById(C5284R.id.linear1);
        this.imageview44 = (ImageView) findViewById(C5284R.id.imageview44);
        this.linear3 = (LinearLayout) findViewById(C5284R.id.linear3);
        this.linear_main = (LinearLayout) findViewById(C5284R.id.linear_main);
        this.linear4 = (LinearLayout) findViewById(C5284R.id.linear4);
        this.linear5 = (LinearLayout) findViewById(C5284R.id.linear5);
        this.linear6 = (LinearLayout) findViewById(C5284R.id.linear6);
        this.linear7 = (LinearLayout) findViewById(C5284R.id.linear7);
        this.linear8 = (LinearLayout) findViewById(C5284R.id.linear8);
        this.linear9 = (LinearLayout) findViewById(C5284R.id.linear9);
        this.linear10 = (LinearLayout) findViewById(C5284R.id.linear10);
        this.linear11 = (LinearLayout) findViewById(C5284R.id.linear11);
        this.linear12 = (LinearLayout) findViewById(C5284R.id.linear12);
        this.linear13 = (LinearLayout) findViewById(C5284R.id.linear13);
        this.linear14 = (LinearLayout) findViewById(C5284R.id.linear14);
        this.linear15 = (LinearLayout) findViewById(C5284R.id.linear15);
        this.linear16 = (LinearLayout) findViewById(C5284R.id.linear16);
        this.linear17 = (LinearLayout) findViewById(C5284R.id.linear17);
        this.linear18 = (LinearLayout) findViewById(C5284R.id.linear18);
        this.linear19 = (LinearLayout) findViewById(C5284R.id.linear19);
        this.linear20 = (LinearLayout) findViewById(C5284R.id.linear20);
        this.linear21 = (LinearLayout) findViewById(C5284R.id.linear21);
        this.imageview1 = (ImageView) findViewById(C5284R.id.imageview1);
        this.imageview2 = (ImageView) findViewById(C5284R.id.imageview2);
        this.imageview3 = (ImageView) findViewById(C5284R.id.imageview3);
        this.linear22 = (LinearLayout) findViewById(C5284R.id.linear22);
        this.linear23 = (LinearLayout) findViewById(C5284R.id.linear23);
        this.linear24 = (LinearLayout) findViewById(C5284R.id.linear24);
        this.imageview4 = (ImageView) findViewById(C5284R.id.imageview4);
        this.imageview5 = (ImageView) findViewById(C5284R.id.imageview5);
        this.imageview6 = (ImageView) findViewById(C5284R.id.imageview6);
        this.linear25 = (LinearLayout) findViewById(C5284R.id.linear25);
        this.linear26 = (LinearLayout) findViewById(C5284R.id.linear26);
        this.linear27 = (LinearLayout) findViewById(C5284R.id.linear27);
        this.imageview7 = (ImageView) findViewById(C5284R.id.imageview7);
        this.imageview8 = (ImageView) findViewById(C5284R.id.imageview8);
        this.imageview9 = (ImageView) findViewById(C5284R.id.imageview9);
        this.linear28 = (LinearLayout) findViewById(C5284R.id.linear28);
        this.linear29 = (LinearLayout) findViewById(C5284R.id.linear29);
        this.linear30 = (LinearLayout) findViewById(C5284R.id.linear30);
        this.imageview10 = (ImageView) findViewById(C5284R.id.imageview10);
        this.imageview11 = (ImageView) findViewById(C5284R.id.imageview11);
        this.imageview12 = (ImageView) findViewById(C5284R.id.imageview12);
        this.linear31 = (LinearLayout) findViewById(C5284R.id.linear31);
        this.linear32 = (LinearLayout) findViewById(C5284R.id.linear32);
        this.linear33 = (LinearLayout) findViewById(C5284R.id.linear33);
        this.imageview13 = (ImageView) findViewById(C5284R.id.imageview13);
        this.imageview14 = (ImageView) findViewById(C5284R.id.imageview14);
        this.imageview15 = (ImageView) findViewById(C5284R.id.imageview15);
        this.linear34 = (LinearLayout) findViewById(C5284R.id.linear34);
        this.linear35 = (LinearLayout) findViewById(C5284R.id.linear35);
        this.linear36 = (LinearLayout) findViewById(C5284R.id.linear36);
        this.imageview16 = (ImageView) findViewById(C5284R.id.imageview16);
        this.imageview17 = (ImageView) findViewById(C5284R.id.imageview17);
        this.imageview18 = (ImageView) findViewById(C5284R.id.imageview18);
        this.linear37 = (LinearLayout) findViewById(C5284R.id.linear37);
        this.linear38 = (LinearLayout) findViewById(C5284R.id.linear38);
        this.linear39 = (LinearLayout) findViewById(C5284R.id.linear39);
        this.imageview19 = (ImageView) findViewById(C5284R.id.imageview19);
        this.imageview20 = (ImageView) findViewById(C5284R.id.imageview20);
        this.imageview21 = (ImageView) findViewById(C5284R.id.imageview21);
        this.linear40 = (LinearLayout) findViewById(C5284R.id.linear40);
        this.linear41 = (LinearLayout) findViewById(C5284R.id.linear41);
        this.linear42 = (LinearLayout) findViewById(C5284R.id.linear42);
        this.imageview22 = (ImageView) findViewById(C5284R.id.imageview22);
        this.imageview23 = (ImageView) findViewById(C5284R.id.imageview23);
        this.imageview24 = (ImageView) findViewById(C5284R.id.imageview24);
        this.linear43 = (LinearLayout) findViewById(C5284R.id.linear43);
        this.linear44 = (LinearLayout) findViewById(C5284R.id.linear44);
        this.linear45 = (LinearLayout) findViewById(C5284R.id.linear45);
        this.imageview25 = (ImageView) findViewById(C5284R.id.imageview25);
        this.imageview26 = (ImageView) findViewById(C5284R.id.imageview26);
        this.imageview27 = (ImageView) findViewById(C5284R.id.imageview27);
        this.linear46 = (LinearLayout) findViewById(C5284R.id.linear46);
        this.linear47 = (LinearLayout) findViewById(C5284R.id.linear47);
        this.linear48 = (LinearLayout) findViewById(C5284R.id.linear48);
        this.imageview28 = (ImageView) findViewById(C5284R.id.imageview28);
        this.imageview29 = (ImageView) findViewById(C5284R.id.imageview29);
        this.imageview30 = (ImageView) findViewById(C5284R.id.imageview30);
        this.linear49 = (LinearLayout) findViewById(C5284R.id.linear49);
        this.linear50 = (LinearLayout) findViewById(C5284R.id.linear50);
        this.linear51 = (LinearLayout) findViewById(C5284R.id.linear51);
        this.imageview31 = (ImageView) findViewById(C5284R.id.imageview31);
        this.imageview32 = (ImageView) findViewById(C5284R.id.imageview32);
        this.imageview33 = (ImageView) findViewById(C5284R.id.imageview33);
        this.linear52 = (LinearLayout) findViewById(C5284R.id.linear52);
        this.linear53 = (LinearLayout) findViewById(C5284R.id.linear53);
        this.linear54 = (LinearLayout) findViewById(C5284R.id.linear54);
        this.imageview34 = (ImageView) findViewById(C5284R.id.imageview34);
        this.imageview35 = (ImageView) findViewById(C5284R.id.imageview35);
        this.imageview36 = (ImageView) findViewById(C5284R.id.imageview36);
        this.linear55 = (LinearLayout) findViewById(C5284R.id.linear55);
        this.linear56 = (LinearLayout) findViewById(C5284R.id.linear56);
        this.linear57 = (LinearLayout) findViewById(C5284R.id.linear57);
        this.imageview37 = (ImageView) findViewById(C5284R.id.imageview37);
        this.imageview38 = (ImageView) findViewById(C5284R.id.imageview38);
        this.imageview39 = (ImageView) findViewById(C5284R.id.imageview39);
        this.linear58 = (LinearLayout) findViewById(C5284R.id.linear58);
        this.linear59 = (LinearLayout) findViewById(C5284R.id.linear59);
        this.linear60 = (LinearLayout) findViewById(C5284R.id.linear60);
        this.imageview40 = (ImageView) findViewById(C5284R.id.imageview40);
        this.imageview41 = (ImageView) findViewById(C5284R.id.imageview41);
        this.imageview42 = (ImageView) findViewById(C5284R.id.imageview42);
        this.linear61 = (LinearLayout) findViewById(C5284R.id.linear61);
        this.linear62 = (LinearLayout) findViewById(C5284R.id.linear62);
        this.linear63 = (LinearLayout) findViewById(C5284R.id.linear63);
        this.imageview43 = (ImageView) findViewById(C5284R.id.imageview43);
        this.linear64 = (LinearLayout) findViewById(C5284R.id.linear64);
        this.linear65 = (LinearLayout) findViewById(C5284R.id.linear65);
        this.imageview44.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GzopAdventuregamesActivity.this.finish();
            }
        });
        this.linear19.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/HkBWwMUFOye/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Terra Infirma");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/HkBWwMUFOye");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Skate without falling over as the Earth moves beneath you! Swipe up and down as fast as you can.");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear20.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/HJee0YHZ_E/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Penguin Skip");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/HJee0YHZ_E");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Collect as may fish as possible but avoid falling in the icy cold water. Hop your way to endless fun.");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear21.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/rJDlAKHbdV/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Sir Bottomtight");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/rJDlAKHbdV");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Sir Bottomtight");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear22.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/rkUcEM076/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Cosmo Spin");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/rkUcEM076");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Test your marksmanship by shooting down boxes that come your way. Beware of surprises!");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear23.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/B1Gbjphf_gZ/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Saucer Dodge");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/B1Gbjphf_gZ");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Wade through space and keep your space ship away from flying saucers.");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear24.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/HkRMTzJDck7/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Rollout");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/HkRMTzJDck7");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Steer away from obstacles in this highway in the sky. This is sure to remind you of a few classics!");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear25.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/HkO-wf8F_Jx/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Jumpy: The First Jumper");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/HkO-wf8F_Jx");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Dodge all the random spikes that get in your way to become the best jumper known to early men!");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear26.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/S1gGrw64wY/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Marshmallow Dash");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/S1gGrw64wY");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Here's a snake that likes... carrots! Swiftly move left and right, collect as many carrots as you can!");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear27.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/B1PMIp4XCe/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Sway Bay");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/B1PMIp4XCe");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Jump from stump to stump, but keep an eye out. The jungle ropes aren't known to be forgiving!");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear28.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/rybx12amqCB/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Don't Touch The Walls");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/rybx12amqCB");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Be quick with your moves and navigate the maze without touching the walls! The longer you play without touching any of the walls, the more you score. Watch out for the turns!");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear29.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/B1bxAYHZO4/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Pigeon Bomber");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/B1bxAYHZO4");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Here's your chance to control a professional sniper and aim skeets in a shooting challenge.");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear30.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/SyMlRtBbON/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Pirate Kid");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/SyMlRtBbON");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "A notorious pirate is out for his pot of gold. Help him outsmart his enemies and take the riches!");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear31.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/VJOGOyGb9l/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Flying School");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/VJOGOyGb9l");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Help cute birds learn to fly. Drag and aim to make them fly from one nest to the other.");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear32.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/HyarrY8S/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Panda Love");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/HyarrY8S");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "The Bride is here with the theme you set, for the cute panda wedding - this day she won't forget. Adorned with blooms so bright and a vibe so right, her dream makeover is a pure delight.");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear33.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/41DxMOkGZ5g/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Sneaky Snack");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/41DxMOkGZ5g");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "It's snack time and there's only one rule: eat! Solve the puzzles to feed porky in this HTML5 game.");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear34.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.17
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/SysZvGUt_ye/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Snappy Spy");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/SysZvGUt_ye");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Switch gravity with a touch and avoid obstacles. Remember to get some sushi for extra points!");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear35.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.18
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/BJ-ZsT2zOeZ/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "One More Flight");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/BJ-ZsT2zOeZ");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Can you fly through the obstacles the first time, or will you need one more flight?");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear36.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.19
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/BJ9ZE86I6Wg/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Aqua Thief");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/BJ9ZE86I6Wg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Dive into hours of fun as you help Aqua Thief in his quest to capture the underwater treasure!");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear37.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.20
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/r10-NLT86bx/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Rope Ninja");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/r10-NLT86bx");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Time to show your ninja skills and catch as many birds as you can. Mind the coins you can collect!");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear38.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.21
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/BJAqNMC7T/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Alfy");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/BJAqNMC7T");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "This warrior wants be a legendary forest spirit. Step into this magical world of the fern flower.");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear39.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.22
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/B1JBaM1D9y7/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Colour Chase");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/B1JBaM1D9y7");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "See beautiful landscapes unfold as you navigate the twists and turns of these endless roads: just make sure you only clash with balls of your own colour.");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear40.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.23
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/Skz4pzkDqyX/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Escape Run");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/Skz4pzkDqyX");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Help the mountain man escape the eyes of media while he peacefully runs in the cold. Collect fruits to buy power-ups for the escape!");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear41.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.24
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/HJskh679Cr/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Enchanted Waters");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/HJskh679Cr");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Time is of the essence in this riveting maze runner where one wrong step can make you fall into the endless lake! Time your jumps perfectly to get through the maze without plummeting into the endless lake!");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear42.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.25
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/Bk4ML6470x/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Odd One Out");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/Bk4ML6470x");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Jump the good guys to safety, dump the evil ones to death. Watch out for the timer!");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear43.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.26
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/rkXGK1_L/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Monster Wants Candy");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/rkXGK1_L");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Eliminate all pieces of monsters from the board in this solitaire game, Monsterjong.");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear44.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.27
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/rJWyhp79RS/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Snakes & Ladders");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/rJWyhp79RS");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Ladders take you up, and snakes bring you down. Be the first to get to 100 to win!");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear45.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.28
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/rJJMVIa8p-x/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Sticky Goo");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/rJJMVIa8p-x");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Creepy spiders and bleak platforms leave no room for error as you set out to save your love!");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear46.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.29
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/ry3vtunu/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Battle Fish");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/ry3vtunu");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Grow fish to convert monsters into friends! Addictive arcade game with funny sea creatures.");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear47.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.30
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/H1PJn6mqAr/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Knife Flip");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/H1PJn6mqAr");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "You have to make the Knife flip from pillar to post! The objective of the game is simple: don't fall down.");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear48.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.31
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/SJ2OGpIn/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Dodge Bot");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/SJ2OGpIn");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Run along the surface dodging the attack of the bots; hovering over them brings no laurels!");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear49.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.32
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/HycgCtSWuE/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Space Cowboy");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/HycgCtSWuE");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "How difficult can carrying cargo be? Find out in this surprisingly challenging space game! Keep in mind: fuel is limited and damages unaffordable.");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear50.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.33
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/SyQZs6nzueW/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "The Sea Lion Act");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/SyQZs6nzueW");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Here's a circus sea lion with a twitchy nose: balance as many objects on the beam as you can!");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear51.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.34
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/SkRWoanGOx/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Catch-a-pult");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/SkRWoanGOx");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Catapult the balls from one launcher to another. Rebounds bring extra points!");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear52.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.35
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/BJrMI6E7Rl/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Twin Hop");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/BJrMI6E7Rl");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "This Jumper must always be the same color as the pillar it wants to jump on. Can you keep up?");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear53.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.36
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/BkemftJ_I/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Mouse Jump");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/BkemftJ_I");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Mouse Jump the platforms and make as many jumps as you can in this amazing 3D game!");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear54.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.37
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/HJD9VMRQa/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Astro Knot");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/HJD9VMRQa");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Poor creature is stranded on unexplored land. Hop along to explore a beautiful galactic setup!");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear55.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.38
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/SJz7-kTud/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Submarine Dash");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/SJz7-kTud");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Dive into an underwater world full of beauty where you can collect coins too... just a little bit of danger.");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear56.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.39
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/BkXW1a__/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Jimbo Jump");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/BkXW1a__");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Jump from floor to floor, avoid the ghosts! How high can you climb in this endless game?");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear57.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.40
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/S1Clo6hMdeb/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Jumpy Ape Joe");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/S1Clo6hMdeb");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Help Joe eat up all the bananas! Don't forget to keep an eye out for that ticking timer.");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear58.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.41
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/B1SmafkP5kQ/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Holiday Cheer");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/B1SmafkP5kQ");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "Fly over snowy landscapes as Santa, delivering presents to houses. Be careful, Santa must have a gift for each house!");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear59.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.42
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/SJXVafJP51Q/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Nosedive");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/SJXVafJP51Q");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "They say death is inevitable. But isn't it all about how long you can survive? You are in a plane crashing towards land - survive as long as you can.");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear60.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.43
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/rkYbNLTIT-x/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Knight Ride");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/rkYbNLTIT-x");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "The canon's loaded and the knight's ready! Bounce through your flight while avoiding the onslaught of monsters.");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
        this.linear61.setOnClickListener(new View.OnClickListener() { // from class: com.icefishing.icefishingliveapp.GzopAdventuregamesActivity.44
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CL.q(GzopAdventuregamesActivity.this, C5284R.anim.button_push, view);
                GzopAdventuregamesActivity gzopAdventuregamesActivity = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity.intent_navigation_adventure.setClass(gzopAdventuregamesActivity.getApplicationContext(), PlaygamesActivity.class);
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(d.c.f18793e, "https://static.gamezop.com/rJ57aMJDcJm/cover.jpg");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra(com.anythink.basead.exoplayer.k.o.f8603c, "Go Chicken Go");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("url", "https://10761.play.gamezop.com/g/rJ57aMJDcJm");
                GzopAdventuregamesActivity.this.intent_navigation_adventure.putExtra("des", "There's a group of chickens that need to cross the road, and they need to do that quick. Just try and avoid blood!");
                GzopAdventuregamesActivity gzopAdventuregamesActivity2 = GzopAdventuregamesActivity.this;
                gzopAdventuregamesActivity2.callAds(gzopAdventuregamesActivity2.intent_navigation_adventure);
            }
        });
    }

    private void initializeLogic() {
        ((com.bumptech.glide.n) CL.e("https://static.gamezop.com/rJ57aMJDcJm/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/rkYbNLTIT-x/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/SJXVafJP51Q/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/B1SmafkP5kQ/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/S1Clo6hMdeb/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/BkXW1a__/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/SJz7-kTud/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/HJD9VMRQa/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/BkemftJ_I/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/BJrMI6E7Rl/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/SkRWoanGOx/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/SyQZs6nzueW/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/HycgCtSWuE/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/SJ2OGpIn/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/H1PJn6mqAr/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/ry3vtunu/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/rJJMVIa8p-x/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/rJWyhp79RS/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/rkXGK1_L/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/Bk4ML6470x/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/HJskh679Cr/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/Skz4pzkDqyX/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/B1JBaM1D9y7/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/BJAqNMC7T/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/r10-NLT86bx/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/BJ9ZE86I6Wg/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/BJ-ZsT2zOeZ/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/SysZvGUt_ye/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/41DxMOkGZ5g/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/HyarrY8S/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/VJOGOyGb9l/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/SyMlRtBbON/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/B1bxAYHZO4/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/rybx12amqCB/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/B1PMIp4XCe/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/S1gGrw64wY/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/HkO-wf8F_Jx/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/HkRMTzJDck7/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/B1Gbjphf_gZ/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/rkUcEM076/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/rJDlAKHbdV/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/HJee0YHZ_E/cover.jpg", CL.g((com.bumptech.glide.n) CL.e("https://static.gamezop.com/HkBWwMUFOye/cover.jpg", com.bumptech.glide.c.c(getApplicationContext())), this.imageview1, this)), this.imageview2, this)), this.imageview3, this)), this.imageview4, this)), this.imageview5, this)), this.imageview6, this)), this.imageview7, this)), this.imageview8, this)), this.imageview9, this)), this.imageview10, this)), this.imageview11, this)), this.imageview12, this)), this.imageview13, this)), this.imageview14, this)), this.imageview15, this)), this.imageview16, this)), this.imageview17, this)), this.imageview18, this)), this.imageview19, this)), this.imageview20, this)), this.imageview21, this)), this.imageview22, this)), this.imageview23, this)), this.imageview24, this)), this.imageview25, this)), this.imageview26, this)), this.imageview27, this)), this.imageview28, this)), this.imageview29, this)), this.imageview30, this)), this.imageview31, this)), this.imageview32, this)), this.imageview33, this)), this.imageview34, this)), this.imageview35, this)), this.imageview36, this)), this.imageview37, this)), this.imageview38, this)), this.imageview39, this)), this.imageview40, this)), this.imageview41, this)), this.imageview42, this))).E(this.imageview43);
    }

    @Override // androidx.fragment.app.AbstractActivityC0490x, androidx.activity.p, D.AbstractActivityC0294n, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5284R.layout.gzop_adventuregames);
        this.context = this;
        initialize(bundle);
        initializeLogic();
        k4.m.i(this.context, k4.m.f38802s, k4.m.f38794k, k4.m.f38775H, k4.m.f38778L, (ViewGroup) findViewById(C5284R.id.banner_container));
        k4.m.k(this.context, k4.m.f38804u, k4.m.f38796m, k4.m.f38777K, (ViewGroup) findViewById(C5284R.id.native_ad_container));
    }
}
