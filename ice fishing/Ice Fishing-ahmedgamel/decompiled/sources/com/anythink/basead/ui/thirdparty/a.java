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
    private Timer f12144a;

    /* renamed from: b, reason: collision with root package name */
    private long f12145b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0065a f12146c;

    /* renamed from: d, reason: collision with root package name */
    private View f12147d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f12148e;

    /* renamed from: f, reason: collision with root package name */
    private f.b f12149f = new f.b(1);

    /* renamed from: g, reason: collision with root package name */
    private String f12150g;

    /* renamed from: com.anythink.basead.ui.thirdparty.a$a, reason: collision with other inner class name */
    public interface InterfaceC0065a {
        void a(int i);
    }

    public a(Context context, View view, long j6, InterfaceC0065a interfaceC0065a) {
        this.f12150g = "";
        this.f12147d = view;
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
        this.f12148e = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.thirdparty.a.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a.a(a.this, 2);
            }
        });
        this.f12146c = interfaceC0065a;
        this.f12145b = j6;
        this.f12150g = Locale.getDefault().getLanguage().equals(com.anythink.expressad.video.dynview.a.a.f21883S) ? "跳过" : "Skip";
    }

    public static /* synthetic */ long b(a aVar, long j6) {
        long j9 = aVar.f12145b - j6;
        aVar.f12145b = j9;
        return j9;
    }

    private static boolean d() {
        return Locale.getDefault().getLanguage().equals(com.anythink.expressad.video.dynview.a.a.f21883S);
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
        Timer timer = this.f12144a;
        if (timer != null) {
            timer.cancel();
            this.f12144a = null;
        }
    }

    public final void b() {
        if (this.f12144a == null) {
            Timer timer = new Timer();
            this.f12144a = timer;
            timer.schedule(new TimerTask() { // from class: com.anythink.basead.ui.thirdparty.a.2

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ long f12152a = 1000;

                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    a.this.f12147d.post(new Runnable() { // from class: com.anythink.basead.ui.thirdparty.a.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (a.this.f12147d.getParent() != null && (a.this.f12147d.getParent() instanceof View) && a.this.f12149f.a((View) a.this.f12147d.getParent(), a.this.f12147d, 80, 0)) {
                                if (a.this.f12145b <= 0) {
                                    a.a(a.this, 3);
                                } else {
                                    a aVar = a.this;
                                    a.a(aVar, aVar.f12145b);
                                }
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                a.b(a.this, anonymousClass2.f12152a);
                            }
                        }
                    });
                }
            }, 1000L, 1000L);
            this.f12147d.post(new Runnable() { // from class: com.anythink.basead.ui.thirdparty.a.3

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ long f12155a = 1000;

                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    a.a(aVar, aVar.f12145b);
                    a.b(a.this, this.f12155a);
                }
            });
        }
    }

    public final TextView a() {
        return this.f12148e;
    }

    private void a(long j6) {
        int i = (int) (j6 / 1000);
        TextView textView = this.f12148e;
        if (textView != null) {
            textView.setText(i + "s | " + this.f12150g);
        }
    }

    private void a(int i) {
        InterfaceC0065a interfaceC0065a = this.f12146c;
        if (interfaceC0065a != null) {
            interfaceC0065a.a(i);
        }
        TextView textView = this.f12148e;
        if (textView != null) {
            textView.setVisibility(8);
        }
        Timer timer = this.f12144a;
        if (timer != null) {
            timer.cancel();
            this.f12144a = null;
        }
    }

    private static int a(Context context, float f2) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static /* synthetic */ void a(a aVar, int i) {
        InterfaceC0065a interfaceC0065a = aVar.f12146c;
        if (interfaceC0065a != null) {
            interfaceC0065a.a(i);
        }
        TextView textView = aVar.f12148e;
        if (textView != null) {
            textView.setVisibility(8);
        }
        Timer timer = aVar.f12144a;
        if (timer != null) {
            timer.cancel();
            aVar.f12144a = null;
        }
    }

    public static /* synthetic */ void a(a aVar, long j6) {
        int i = (int) (j6 / 1000);
        TextView textView = aVar.f12148e;
        if (textView != null) {
            textView.setText(i + "s | " + aVar.f12150g);
        }
    }
}
