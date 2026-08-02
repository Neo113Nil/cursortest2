package com.yandex.passport.internal.ui.base;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.q;
import com.yandex.passport.R;
import com.yandex.passport.api.y1;
import com.yandex.passport.internal.ui.util.r;
import com.yandex.passport.internal.ui.util.s;
import de.hdodenhof.circleimageview.CircleImageView;
import defpackage.b6e;
import defpackage.bf3;
import defpackage.de8;
import defpackage.evw;
import defpackage.g4i;
import defpackage.hq0;
import defpackage.le;
import defpackage.ndu;
import defpackage.q0v;
import defpackage.wdu;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class e extends hq0 {
    public static final int i = (int) (16 * g4i.a.density);
    public com.yandex.passport.internal.ui.autologin.e a;
    public GestureDetector b;
    public ViewGroup c;
    public TextView d;
    public TextView e;
    public TextView f;
    public CircleImageView g;
    public Button h;

    @Override // android.app.Activity
    public void finish() {
        ViewPropertyAnimator duration = l().animate().translationY(-l().getMeasuredHeight()).setDuration(getResources().getInteger(R.integer.passport_animation_duration));
        duration.getClass();
        duration.setListener(new le(13, this));
        duration.start();
    }

    public final void k() {
        l().setVisibility(8);
        super.finish();
    }

    public final ViewGroup l() {
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics.j("dialogContent");
        throw null;
    }

    public abstract y1 m();

    public void n(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0185  */
    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle bundle) {
        y1 y1Var;
        com.yandex.plus.core.network.api.utils.a aVar;
        y1 m = m();
        m.getClass();
        int ordinal = m.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                y1Var = y1.b;
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    b6e.s();
                    return;
                }
                y1Var = s.a(this);
            }
            q0v q0vVar = new q0v(26, y1Var);
            r rVar = new r(0, 0, q0vVar);
            int i2 = com.yandex.passport.internal.ui.util.g.a;
            int i3 = com.yandex.passport.internal.ui.util.g.b;
            com.yandex.passport.internal.storage.d dVar = new com.yandex.passport.internal.storage.d(16);
            r rVar2 = new r(i2, i3, dVar);
            View decorView = getWindow().getDecorView();
            decorView.getClass();
            Resources resources = decorView.getResources();
            resources.getClass();
            boolean booleanValue = ((Boolean) q0vVar.invoke(resources)).booleanValue();
            Resources resources2 = decorView.getResources();
            resources2.getClass();
            boolean booleanValue2 = ((Boolean) dVar.invoke(resources2)).booleanValue();
            aVar = com.yandex.passport.internal.ui.util.g.c;
            if (aVar == null) {
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 30) {
                    aVar = new com.yandex.passport.internal.ui.util.f();
                } else if (i4 >= 29) {
                    aVar = new com.yandex.passport.internal.ui.util.e();
                } else if (i4 >= 28) {
                    aVar = new com.yandex.passport.internal.ui.util.d();
                } else {
                    aVar = i4 >= 26 ? new com.yandex.passport.internal.ui.util.c() : new com.yandex.passport.internal.ui.util.b();
                    com.yandex.passport.internal.ui.util.g.c = aVar;
                }
            }
            com.yandex.plus.core.network.api.utils.a aVar2 = aVar;
            Window window = getWindow();
            window.getClass();
            aVar2.C(rVar, rVar2, window, decorView, booleanValue, booleanValue2);
            Window window2 = getWindow();
            window2.getClass();
            aVar2.m(window2);
            super.onCreate(bundle);
            setTheme(s.c(m(), this));
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.gravity = 48;
            attributes.width = -1;
            attributes.height = -2;
            getWindow().setAttributes(attributes);
            getWindow().setDimAmount(0.0f);
            getWindow().addFlags(32);
            setContentView(R.layout.passport_activity_autologin);
            View findViewById = findViewById(R.id.dialog_content);
            findViewById.getClass();
            this.c = (ViewGroup) findViewById;
            View findViewById2 = findViewById(R.id.text_message);
            findViewById2.getClass();
            this.d = (TextView) findViewById2;
            View findViewById3 = findViewById(R.id.text_email);
            findViewById3.getClass();
            this.e = (TextView) findViewById3;
            View findViewById4 = findViewById(R.id.text_sub_message);
            findViewById4.getClass();
            this.f = (TextView) findViewById4;
            View findViewById5 = findViewById(R.id.image_avatar);
            findViewById5.getClass();
            this.g = (CircleImageView) findViewById5;
            View findViewById6 = findViewById(R.id.button_action);
            findViewById6.getClass();
            this.h = (Button) findViewById6;
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relative_layout);
            this.a = new com.yandex.passport.internal.ui.autologin.e(this, bundle, new evw(0, this, e.class, "onDismiss", "onDismiss()V", 0, 23), 5000L);
            overridePendingTransition(0, 0);
            this.b = new GestureDetector(this, new bf3(7, this));
            l().setOnTouchListener(new de8(5, this));
            if (bundle == null) {
                l().setTranslationY(-getResources().getDimension(R.dimen.passport_autologin_dialog_height));
                l().animate().translationY(0.0f).setDuration(getResources().getInteger(R.integer.passport_animation_duration)).start();
            }
            View childAt = l().getChildAt(0);
            float b = com.yandex.passport.legacy.f.b(this, 8);
            WeakHashMap weakHashMap = wdu.a;
            ndu.l(childAt, b);
            ndu.n(relativeLayout, new q(17));
        }
        y1Var = y1.a;
        q0v q0vVar2 = new q0v(26, y1Var);
        r rVar3 = new r(0, 0, q0vVar2);
        int i22 = com.yandex.passport.internal.ui.util.g.a;
        int i32 = com.yandex.passport.internal.ui.util.g.b;
        com.yandex.passport.internal.storage.d dVar2 = new com.yandex.passport.internal.storage.d(16);
        r rVar22 = new r(i22, i32, dVar2);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        Resources resources3 = decorView2.getResources();
        resources3.getClass();
        boolean booleanValue3 = ((Boolean) q0vVar2.invoke(resources3)).booleanValue();
        Resources resources22 = decorView2.getResources();
        resources22.getClass();
        boolean booleanValue22 = ((Boolean) dVar2.invoke(resources22)).booleanValue();
        aVar = com.yandex.passport.internal.ui.util.g.c;
        if (aVar == null) {
        }
        com.yandex.plus.core.network.api.utils.a aVar22 = aVar;
        Window window3 = getWindow();
        window3.getClass();
        aVar22.C(rVar3, rVar22, window3, decorView2, booleanValue3, booleanValue22);
        Window window22 = getWindow();
        window22.getClass();
        aVar22.m(window22);
        super.onCreate(bundle);
        setTheme(s.c(m(), this));
        WindowManager.LayoutParams attributes2 = getWindow().getAttributes();
        attributes2.gravity = 48;
        attributes2.width = -1;
        attributes2.height = -2;
        getWindow().setAttributes(attributes2);
        getWindow().setDimAmount(0.0f);
        getWindow().addFlags(32);
        setContentView(R.layout.passport_activity_autologin);
        View findViewById7 = findViewById(R.id.dialog_content);
        findViewById7.getClass();
        this.c = (ViewGroup) findViewById7;
        View findViewById22 = findViewById(R.id.text_message);
        findViewById22.getClass();
        this.d = (TextView) findViewById22;
        View findViewById32 = findViewById(R.id.text_email);
        findViewById32.getClass();
        this.e = (TextView) findViewById32;
        View findViewById42 = findViewById(R.id.text_sub_message);
        findViewById42.getClass();
        this.f = (TextView) findViewById42;
        View findViewById52 = findViewById(R.id.image_avatar);
        findViewById52.getClass();
        this.g = (CircleImageView) findViewById52;
        View findViewById62 = findViewById(R.id.button_action);
        findViewById62.getClass();
        this.h = (Button) findViewById62;
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(R.id.relative_layout);
        this.a = new com.yandex.passport.internal.ui.autologin.e(this, bundle, new evw(0, this, e.class, "onDismiss", "onDismiss()V", 0, 23), 5000L);
        overridePendingTransition(0, 0);
        this.b = new GestureDetector(this, new bf3(7, this));
        l().setOnTouchListener(new de8(5, this));
        if (bundle == null) {
        }
        View childAt2 = l().getChildAt(0);
        float b2 = com.yandex.passport.legacy.f.b(this, 8);
        WeakHashMap weakHashMap2 = wdu.a;
        ndu.l(childAt2, b2);
        ndu.n(relativeLayout2, new q(17));
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public final void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        com.yandex.passport.internal.ui.autologin.e eVar = this.a;
        if (eVar != null) {
            bundle.putLong("create_time", eVar.a);
        } else {
            Intrinsics.j("dismissHelper");
            throw null;
        }
    }

    public abstract void p();
}
