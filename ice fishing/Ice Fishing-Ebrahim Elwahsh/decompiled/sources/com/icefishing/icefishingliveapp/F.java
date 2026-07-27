package com.icefishing.icefishingliveapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import android.view.animation.AnimationUtils;
import g1.C4523c;

/* loaded from: classes2.dex */
public final class F implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36552n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ StartActivity f36553u;

    public /* synthetic */ F(StartActivity startActivity, int i) {
        this.f36552n = i;
        this.f36553u = startActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36552n) {
            case 0:
                StartActivity startActivity = this.f36553u;
                view.startAnimation(AnimationUtils.loadAnimation(startActivity.getApplicationContext(), C5284R.anim.button_push));
                startActivity.f37059y = new Intent(startActivity, (Class<?>) CountryActivity.class);
                try {
                    k4.m.e(startActivity.f37058x).j(startActivity, k4.m.f38803t, k4.m.f38795l, k4.m.f38776I, new I0.j(26, this));
                    break;
                } catch (ActivityNotFoundException e6) {
                    e6.printStackTrace();
                    return;
                }
            case 1:
                StartActivity startActivity2 = this.f36553u;
                view.startAnimation(AnimationUtils.loadAnimation(startActivity2.getApplicationContext(), C5284R.anim.button_push));
                com.bumptech.glide.manager.n nVar = new com.bumptech.glide.manager.n();
                ((C4523c) nVar.f23619v).f37856u = Integer.valueOf(Color.parseColor(startActivity2.f37058x.getString(C5284R.color.colorPrimary)) | (-16777216));
                ((Intent) nVar.f23618u).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                S0.l b9 = nVar.b();
                ((Intent) b9.f2910u).setPackage("com.android.chrome");
                b9.q(startActivity2.f37058x, Uri.parse("https://sites.google.com/view/icefishinggames"));
                break;
            case 2:
                StartActivity startActivity3 = this.f36553u;
                view.startAnimation(AnimationUtils.loadAnimation(startActivity3.getApplicationContext(), C5284R.anim.button_push));
                try {
                    startActivity3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + startActivity3.getPackageName())));
                    break;
                } catch (ActivityNotFoundException unused) {
                    startActivity3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + startActivity3.getPackageName())));
                    return;
                }
            default:
                StartActivity startActivity4 = this.f36553u;
                view.startAnimation(AnimationUtils.loadAnimation(startActivity4.getApplicationContext(), C5284R.anim.button_push));
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", startActivity4.getString(C5284R.string.app_name) + "http://play.google.com/store/apps/details?id=" + startActivity4.getPackageName());
                startActivity4.startActivity(Intent.createChooser(intent, "share Using"));
                break;
        }
    }
}
