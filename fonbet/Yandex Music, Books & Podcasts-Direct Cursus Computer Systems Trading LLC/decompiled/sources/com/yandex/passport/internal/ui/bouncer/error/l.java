package com.yandex.passport.internal.ui.bouncer.error;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.passport.internal.ui.bouncer.roundabout.b0;
import defpackage.c7g;
import defpackage.g4i;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c7g b;

    public /* synthetic */ l(c7g c7gVar, int i) {
        this.a = i;
        this.b = c7gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ImageView imageView = (ImageView) obj;
                imageView.getClass();
                ViewGroup.LayoutParams a = this.b.a(-2, -2);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a;
                layoutParams.width = -1;
                layoutParams.height = -2;
                imageView.setLayoutParams(a);
                break;
            case 1:
                TextView textView = (TextView) obj;
                textView.getClass();
                ViewGroup.LayoutParams a2 = this.b.a(-2, -2);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) a2;
                layoutParams2.width = -1;
                layoutParams2.height = -2;
                textView.setLayoutParams(a2);
                break;
            case 2:
                Button button = (Button) obj;
                button.getClass();
                ViewGroup.LayoutParams a3 = this.b.a(-2, -2);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) a3;
                layoutParams3.width = -1;
                layoutParams3.height = -2;
                button.setLayoutParams(a3);
                break;
            case 3:
                Button button2 = (Button) obj;
                button2.getClass();
                button2.setVisibility(8);
                ViewGroup.LayoutParams a4 = this.b.a(-2, -2);
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) a4;
                layoutParams4.width = -1;
                layoutParams4.height = -2;
                button2.setLayoutParams(a4);
                break;
            case 4:
                TextView textView2 = (TextView) obj;
                textView2.getClass();
                ViewGroup.LayoutParams a5 = this.b.a(-2, -2);
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) a5;
                layoutParams5.width = -1;
                layoutParams5.height = -2;
                textView2.setLayoutParams(a5);
                break;
            case 5:
                Button button3 = (Button) obj;
                button3.getClass();
                ViewGroup.LayoutParams a6 = this.b.a(-2, -2);
                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) a6;
                layoutParams6.width = -1;
                layoutParams6.height = -2;
                button3.setLayoutParams(a6);
                break;
            case 6:
                ImageView imageView2 = (ImageView) obj;
                imageView2.getClass();
                ViewGroup.LayoutParams a7 = this.b.a(-2, -2);
                LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) a7;
                int i = b0.b;
                layoutParams7.width = i;
                layoutParams7.height = i;
                float f = 12;
                DisplayMetrics displayMetrics = g4i.a;
                layoutParams7.setMarginStart((int) (displayMetrics.density * f));
                layoutParams7.setMarginEnd((int) (displayMetrics.density * f));
                int i2 = (int) (f * displayMetrics.density);
                ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin = i2;
                ((ViewGroup.MarginLayoutParams) layoutParams7).bottomMargin = i2;
                imageView2.setLayoutParams(a7);
                break;
            case 7:
                TextView textView3 = (TextView) obj;
                textView3.getClass();
                ViewGroup.LayoutParams a8 = this.b.a(-2, -2);
                LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) a8;
                layoutParams8.height = -2;
                layoutParams8.width = -1;
                layoutParams8.setMarginEnd((int) (12 * g4i.a.density));
                layoutParams8.gravity = 8388627;
                textView3.setLayoutParams(a8);
                break;
            case 8:
                View view = (View) obj;
                view.getClass();
                view.setLayoutParams(this.b.a(-1, -2));
                break;
            case 9:
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj;
                horizontalScrollView.getClass();
                ViewGroup.LayoutParams a9 = this.b.a(-2, -2);
                LinearLayout.LayoutParams layoutParams9 = (LinearLayout.LayoutParams) a9;
                layoutParams9.width = -1;
                layoutParams9.height = -2;
                horizontalScrollView.setLayoutParams(a9);
                break;
            case 10:
                View view2 = (View) obj;
                view2.getClass();
                ViewGroup.LayoutParams a10 = this.b.a(-2, -2);
                LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) a10;
                layoutParams10.width = -1;
                layoutParams10.height = (int) (32 * g4i.a.density);
                view2.setLayoutParams(a10);
                break;
            case 11:
                View view3 = (View) obj;
                view3.getClass();
                view3.setVisibility(8);
                c7g c7gVar = this.b;
                c7gVar.setGravity(17);
                ViewGroup.LayoutParams a11 = c7gVar.a(-2, -2);
                LinearLayout.LayoutParams layoutParams11 = (LinearLayout.LayoutParams) a11;
                int i3 = (int) (50 * g4i.a.density);
                layoutParams11.width = i3;
                layoutParams11.height = i3;
                view3.setLayoutParams(a11);
                break;
            case 12:
                ImageView imageView3 = (ImageView) obj;
                imageView3.getClass();
                ViewGroup.LayoutParams a12 = this.b.a(-2, -2);
                LinearLayout.LayoutParams layoutParams12 = (LinearLayout.LayoutParams) a12;
                layoutParams12.width = -1;
                layoutParams12.height = -2;
                imageView3.setLayoutParams(a12);
                break;
            case 13:
                TextView textView4 = (TextView) obj;
                textView4.getClass();
                ViewGroup.LayoutParams a13 = this.b.a(-2, -2);
                LinearLayout.LayoutParams layoutParams13 = (LinearLayout.LayoutParams) a13;
                layoutParams13.width = -1;
                layoutParams13.height = -2;
                textView4.setLayoutParams(a13);
                break;
            default:
                Button button4 = (Button) obj;
                button4.getClass();
                ViewGroup.LayoutParams a14 = this.b.a(-2, -2);
                LinearLayout.LayoutParams layoutParams14 = (LinearLayout.LayoutParams) a14;
                layoutParams14.width = -1;
                layoutParams14.height = -2;
                button4.setLayoutParams(a14);
                break;
        }
        return Unit.a;
    }
}
