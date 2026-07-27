package com.anythink.basead.ui.thirdparty;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.anythink.core.common.v.a.f;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private Timer f11358a;

    /* renamed from: b, reason: collision with root package name */
    private long f11359b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0065a f11360c;

    /* renamed from: d, reason: collision with root package name */
    private View f11361d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f11362e;

    /* renamed from: f, reason: collision with root package name */
    private f.b f11363f = new f.b(1);

    /* renamed from: g, reason: collision with root package name */
    private String f11364g;

    /* renamed from: com.anythink.basead.ui.thirdparty.a$a, reason: collision with other inner class name */
    public interface InterfaceC0065a {
        void a(int i);
    }

    public a(Context context, View view, long j6, InterfaceC0065a interfaceC0065a) {
        this.f11364g = "";
        this.f11361d = view;
        TextView textView = new TextView(context);
        textView.setHeight(a(context, 24.0f));
        textView.setGravity(17);
        textView.setPadding(a(context, 14.0f), 0, a(context, 11.0f), 0);
        textView.setTextColor(Color.parseColor("#FFFFFF"));
        textView.setTextSize(1, 12.0f);
        int parseColor = Color.parseColor("#99000000");
        float a9 = a(context, 20.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(parseColor);
        gradientDrawable.setCornerRadius(a9);
        textView.setBackground(gradientDrawable);
        this.f11362e = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.thirdparty.a.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a.a(a.this, 2);
            }
        });
        this.f11360c = interfaceC0065a;
        this.f11359b = j6;
        this.f11364g = Locale.getDefault().getLanguage().equals(com.anythink.expressad.video.dynview.a.a.f21096S) ? "跳过" : "Skip";
    }

    public static /* synthetic */ long b(a aVar, long j6) {
        long j9 = aVar.f11359b - j6;
        aVar.f11359b = j9;
        return j9;
    }

    private static boolean d() {
        return Locale.getDefault().getLanguage().equals(com.anythink.expressad.video.dynview.a.a.f21096S);
    }

    private static TextView a(Context context) {
        TextView textView = new TextView(context);
        textView.setHeight(a(context, 24.0f));
        textView.setGravity(17);
        textView.setPadding(a(context, 14.0f), 0, a(context, 11.0f), 0);
        textView.setTextColor(Color.parseColor("#FFFFFF"));
        textView.setTextSize(1, 12.0f);
        int parseColor = Color.parseColor("#99000000");
        float a9 = a(context, 20.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(parseColor);
        gradientDrawable.setCornerRadius(a9);
        textView.setBackground(gradientDrawable);
        return textView;
    }

    private void c() {
        Timer timer = this.f11358a;
        if (timer != null) {
            timer.cancel();
            this.f11358a = null;
        }
    }

    public final void b() {
        if (this.f11358a == null) {
            Timer timer = new Timer();
            this.f11358a = timer;
            timer.schedule(new TimerTask() { // from class: com.anythink.basead.ui.thirdparty.a.2

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ long f11366a = 1000;

                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    a.this.f11361d.post(new Runnable() { // from class: com.anythink.basead.ui.thirdparty.a.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (a.this.f11361d.getParent() != null && (a.this.f11361d.getParent() instanceof View) && a.this.f11363f.a((View) a.this.f11361d.getParent(), a.this.f11361d, 80, 0)) {
                                if (a.this.f11359b <= 0) {
                                    a.a(a.this, 3);
                                } else {
                                    a aVar = a.this;
                                    a.a(aVar, aVar.f11359b);
                                }
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                a.b(a.this, anonymousClass2.f11366a);
                            }
                        }
                    });
                }
            }, 1000L, 1000L);
            this.f11361d.post(new Runnable() { // from class: com.anythink.basead.ui.thirdparty.a.3

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ long f11369a = 1000;

                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    a.a(aVar, aVar.f11359b);
                    a.b(a.this, this.f11369a);
                }
            });
        }
    }

    public final TextView a() {
        return this.f11362e;
    }

    private void a(long j6) {
        int i = (int) (j6 / 1000);
        TextView textView = this.f11362e;
        if (textView != null) {
            textView.setText(i + "s | " + this.f11364g);
        }
    }

    private void a(int i) {
        InterfaceC0065a interfaceC0065a = this.f11360c;
        if (interfaceC0065a != null) {
            interfaceC0065a.a(i);
        }
        TextView textView = this.f11362e;
        if (textView != null) {
            textView.setVisibility(8);
        }
        Timer timer = this.f11358a;
        if (timer != null) {
            timer.cancel();
            this.f11358a = null;
        }
    }

    private static int a(Context context, float f3) {
        return (int) ((f3 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static /* synthetic */ void a(a aVar, int i) {
        InterfaceC0065a interfaceC0065a = aVar.f11360c;
        if (interfaceC0065a != null) {
            interfaceC0065a.a(i);
        }
        TextView textView = aVar.f11362e;
        if (textView != null) {
            textView.setVisibility(8);
        }
        Timer timer = aVar.f11358a;
        if (timer != null) {
            timer.cancel();
            aVar.f11358a = null;
        }
    }

    public static /* synthetic */ void a(a aVar, long j6) {
        int i = (int) (j6 / 1000);
        TextView textView = aVar.f11362e;
        if (textView != null) {
            textView.setText(i + "s | " + aVar.f11364g);
        }
    }
}
