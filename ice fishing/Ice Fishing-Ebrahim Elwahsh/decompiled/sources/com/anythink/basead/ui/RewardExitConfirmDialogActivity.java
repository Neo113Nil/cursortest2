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
    public static final int f10386a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f10387b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static Runnable f10388c = null;

    /* renamed from: d, reason: collision with root package name */
    private static String f10389d = null;

    /* renamed from: e, reason: collision with root package name */
    private static int f10390e = 1;

    /* renamed from: f, reason: collision with root package name */
    private Dialog f10391f;

    /* renamed from: com.anythink.basead.ui.RewardExitConfirmDialogActivity$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RewardExitConfirmDialogActivity.this.finish();
            if (RewardExitConfirmDialogActivity.f10388c != null) {
                RewardExitConfirmDialogActivity.f10388c.run();
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
            textView2.setText(getResources().getString(q.a(this, "myoffer_reward_exit_confirm_give_up", k.f19794g)));
            if (f10390e != 2) {
                textView.setText(getResources().getString(q.a(this, "myoffer_reward_exit_confirm_msg", k.f19794g), f10389d));
                textView3.setText(getResources().getString(q.a(this, "myoffer_reward_exit_confirm_continue", k.f19794g)));
            } else {
                textView.setText(getResources().getString(q.a(this, "myoffer_anim_reward_exit_confirm_msg", k.f19794g), f10389d));
                textView3.setText(getResources().getString(q.a(this, "myoffer_anim_reward_exit_confirm_continue", k.f19794g)));
            }
            textView2.setOnClickListener(new AnonymousClass1());
            textView3.setOnClickListener(new AnonymousClass2());
            Dialog dialog = new Dialog(this, q.a(this, "style_full_screen_translucent_dialog", k.f19792e));
            this.f10391f = dialog;
            dialog.setContentView(inflate);
            this.f10391f.setCancelable(false);
            this.f10391f.show();
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
            textView2.setText(getResources().getString(q.a(this, "myoffer_reward_exit_confirm_give_up", k.f19794g)));
            if (f10390e != 2) {
                textView.setText(getResources().getString(q.a(this, "myoffer_reward_exit_confirm_msg", k.f19794g), f10389d));
                textView3.setText(getResources().getString(q.a(this, "myoffer_reward_exit_confirm_continue", k.f19794g)));
            } else {
                textView.setText(getResources().getString(q.a(this, "myoffer_anim_reward_exit_confirm_msg", k.f19794g), f10389d));
                textView3.setText(getResources().getString(q.a(this, "myoffer_anim_reward_exit_confirm_continue", k.f19794g)));
            }
            textView2.setOnClickListener(new AnonymousClass1());
            textView3.setOnClickListener(new AnonymousClass2());
            Dialog dialog = new Dialog(this, q.a(this, "style_full_screen_translucent_dialog", k.f19792e));
            this.f10391f = dialog;
            dialog.setContentView(inflate);
            this.f10391f.setCancelable(false);
            this.f10391f.show();
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Dialog dialog = this.f10391f;
        if (dialog != null) {
            dialog.dismiss();
            this.f10391f = null;
        }
        f10388c = null;
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
        f10389d = str;
        f10388c = runnable;
        f10390e = i;
        Intent intent = new Intent(context, (Class<?>) RewardExitConfirmDialogActivity.class);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }
}
