package com.icefishing.icefishingbigwin;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import android.view.animation.AnimationUtils;
import l.C4648e;

/* loaded from: classes2.dex */
public final class G implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36391n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ StartActivity f36392u;

    public /* synthetic */ G(StartActivity startActivity, int i) {
        this.f36391n = i;
        this.f36392u = startActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36391n) {
            case 0:
                StartActivity startActivity = this.f36392u;
                view.startAnimation(AnimationUtils.loadAnimation(startActivity.getApplicationContext(), C5275R.anim.button_push));
                startActivity.f36898y = new Intent(startActivity, (Class<?>) CountryActivity.class);
                try {
                    o4.m.e(startActivity.f36897x).j(startActivity, o4.m.f39627t, o4.m.f39619l, o4.m.f39600I, new I0.j(23, this));
                    break;
                } catch (ActivityNotFoundException e9) {
                    e9.printStackTrace();
                    return;
                }
            case 1:
                StartActivity startActivity2 = this.f36392u;
                view.startAnimation(AnimationUtils.loadAnimation(startActivity2.getApplicationContext(), C5275R.anim.button_push));
                com.bumptech.glide.manager.o oVar = new com.bumptech.glide.manager.o();
                ((C4648e) oVar.f23465v).f38761u = Integer.valueOf(Color.parseColor(startActivity2.f36897x.getString(C5275R.color.colorPrimary)) | (-16777216));
                ((Intent) oVar.f23464u).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                m8.i b9 = oVar.b();
                ((Intent) b9.f39362n).setPackage("com.android.chrome");
                b9.f(startActivity2.f36897x, Uri.parse("https://sites.google.com/view/icefishinggames"));
                break;
            case 2:
                StartActivity startActivity3 = this.f36392u;
                view.startAnimation(AnimationUtils.loadAnimation(startActivity3.getApplicationContext(), C5275R.anim.button_push));
                try {
                    startActivity3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + startActivity3.getPackageName())));
                    break;
                } catch (ActivityNotFoundException unused) {
                    startActivity3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + startActivity3.getPackageName())));
                    return;
                }
            default:
                StartActivity startActivity4 = this.f36392u;
                view.startAnimation(AnimationUtils.loadAnimation(startActivity4.getApplicationContext(), C5275R.anim.button_push));
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", startActivity4.getString(C5275R.string.app_name) + "http://play.google.com/store/apps/details?id=" + startActivity4.getPackageName());
                startActivity4.startActivity(Intent.createChooser(intent, "share Using"));
                break;
        }
    }
}
