package com.IceFishing.LiveIceFishing;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.google.android.gms.internal.ads.LP;
import i1.C4586c;

/* loaded from: classes.dex */
public final class G implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5885n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ StartActivity f5886u;

    public /* synthetic */ G(StartActivity startActivity, int i) {
        this.f5885n = i;
        this.f5886u = startActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5885n) {
            case 0:
                StartActivity startActivity = this.f5886u;
                view.startAnimation(AnimationUtils.loadAnimation(startActivity.getApplicationContext(), C5248R.anim.button_push));
                startActivity.f6387y = new Intent(startActivity, (Class<?>) CountryActivity.class);
                try {
                    Y0.p.e(startActivity.f6386x).j(startActivity, Y0.p.f3890t, Y0.p.f3882l, Y0.p.f3863I, new n4.c(26, this));
                    break;
                } catch (ActivityNotFoundException e9) {
                    e9.printStackTrace();
                    return;
                }
            case 1:
                StartActivity startActivity2 = this.f5886u;
                view.startAnimation(AnimationUtils.loadAnimation(startActivity2.getApplicationContext(), C5248R.anim.button_push));
                com.bumptech.glide.manager.n nVar = new com.bumptech.glide.manager.n();
                ((C4586c) nVar.f24250v).f38154u = Integer.valueOf(Color.parseColor(startActivity2.f6386x.getString(C5248R.color.colorPrimary)) | (-16777216));
                ((Intent) nVar.f24249u).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                LP b9 = nVar.b();
                ((Intent) b9.f26916u).setPackage("com.android.chrome");
                b9.i(startActivity2.f6386x, Uri.parse("https://sites.google.com/view/icefishinggames"));
                break;
            case 2:
                StartActivity startActivity3 = this.f5886u;
                view.startAnimation(AnimationUtils.loadAnimation(startActivity3.getApplicationContext(), C5248R.anim.button_push));
                try {
                    startActivity3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + startActivity3.getPackageName())));
                    break;
                } catch (ActivityNotFoundException unused) {
                    startActivity3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + startActivity3.getPackageName())));
                    return;
                }
            default:
                StartActivity startActivity4 = this.f5886u;
                view.startAnimation(AnimationUtils.loadAnimation(startActivity4.getApplicationContext(), C5248R.anim.button_push));
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", startActivity4.getString(C5248R.string.app_name) + "http://play.google.com/store/apps/details?id=" + startActivity4.getPackageName());
                startActivity4.startActivity(Intent.createChooser(intent, "share Using"));
                break;
        }
    }
}
