package com.anythink.basead.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class RewardExitConfirmDialogActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10229a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f10230b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static Runnable f10231c = null;

    /* renamed from: d, reason: collision with root package name */
    private static String f10232d = null;

    /* renamed from: e, reason: collision with root package name */
    private static int f10233e = 1;

    /* renamed from: f, reason: collision with root package name */
    private Dialog f10234f;

    /* renamed from: com.anythink.basead.ui.RewardExitConfirmDialogActivity$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RewardExitConfirmDialogActivity.this.finish();
            if (RewardExitConfirmDialogActivity.f10231c != null) {
                RewardExitConfirmDialogActivity.f10231c.run();
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.RewardExitConfirmDialogActivity$2, reason: invalid class name */
    public class AnonymousClass2 implements View.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RewardExitConfirmDialogActivity.this.finish();
        }
    }

    private void b() {
        try {
            View inflate = LayoutInflater.from(this).inflate(q.a(this, "myoffer_confirm_dialog", "layout"), (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(q.a(this, "myoffer_confirm_msg", "id"));
            TextView textView2 = (TextView) inflate.findViewById(q.a(this, "myoffer_confirm_give_up", "id"));
            TextView textView3 = (TextView) inflate.findViewById(q.a(this, "myoffer_confirm_continue", "id"));
            textView2.setText(getResources().getString(q.a(this, "myoffer_reward_exit_confirm_give_up", k.f19636g)));
            if (f10233e != 2) {
                textView.setText(getResources().getString(q.a(this, "myoffer_reward_exit_confirm_msg", k.f19636g), f10232d));
                textView3.setText(getResources().getString(q.a(this, "myoffer_reward_exit_confirm_continue", k.f19636g)));
            } else {
                textView.setText(getResources().getString(q.a(this, "myoffer_anim_reward_exit_confirm_msg", k.f19636g), f10232d));
                textView3.setText(getResources().getString(q.a(this, "myoffer_anim_reward_exit_confirm_continue", k.f19636g)));
            }
            textView2.setOnClickListener(new AnonymousClass1());
            textView3.setOnClickListener(new AnonymousClass2());
            Dialog dialog = new Dialog(this, q.a(this, "style_full_screen_translucent_dialog", k.f19634e));
            this.f10234f = dialog;
            dialog.setContentView(inflate);
            this.f10234f.setCancelable(false);
            this.f10234f.show();
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            View inflate = LayoutInflater.from(this).inflate(q.a(this, "myoffer_confirm_dialog", "layout"), (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(q.a(this, "myoffer_confirm_msg", "id"));
            TextView textView2 = (TextView) inflate.findViewById(q.a(this, "myoffer_confirm_give_up", "id"));
            TextView textView3 = (TextView) inflate.findViewById(q.a(this, "myoffer_confirm_continue", "id"));
            textView2.setText(getResources().getString(q.a(this, "myoffer_reward_exit_confirm_give_up", k.f19636g)));
            if (f10233e != 2) {
                textView.setText(getResources().getString(q.a(this, "myoffer_reward_exit_confirm_msg", k.f19636g), f10232d));
                textView3.setText(getResources().getString(q.a(this, "myoffer_reward_exit_confirm_continue", k.f19636g)));
            } else {
                textView.setText(getResources().getString(q.a(this, "myoffer_anim_reward_exit_confirm_msg", k.f19636g), f10232d));
                textView3.setText(getResources().getString(q.a(this, "myoffer_anim_reward_exit_confirm_continue", k.f19636g)));
            }
            textView2.setOnClickListener(new AnonymousClass1());
            textView3.setOnClickListener(new AnonymousClass2());
            Dialog dialog = new Dialog(this, q.a(this, "style_full_screen_translucent_dialog", k.f19634e));
            this.f10234f = dialog;
            dialog.setContentView(inflate);
            this.f10234f.setCancelable(false);
            this.f10234f.show();
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Dialog dialog = this.f10234f;
        if (dialog != null) {
            dialog.dismiss();
            this.f10234f = null;
        }
        f10231c = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 == i) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public static void a(Context context, String str, Runnable runnable, int i) {
        f10232d = str;
        f10231c = runnable;
        f10233e = i;
        Intent intent = new Intent(context, (Class<?>) RewardExitConfirmDialogActivity.class);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }
}
