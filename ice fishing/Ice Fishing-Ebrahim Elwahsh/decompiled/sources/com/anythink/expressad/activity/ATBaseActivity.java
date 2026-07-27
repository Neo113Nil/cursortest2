package com.anythink.expressad.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.OrientationEventListener;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.anythink.expressad.foundation.f.b;

/* loaded from: classes.dex */
public abstract class ATBaseActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17861a = "ATBaseActivity";

    /* renamed from: b, reason: collision with root package name */
    private OrientationEventListener f17862b;

    /* renamed from: c, reason: collision with root package name */
    private Display f17863c;

    /* renamed from: d, reason: collision with root package name */
    private int f17864d = -1;

    /* renamed from: com.anythink.expressad.activity.ATBaseActivity$2, reason: invalid class name */
    public class AnonymousClass2 extends OrientationEventListener {
        public AnonymousClass2(Context context) {
            super(context, 1);
        }

        @Override // android.view.OrientationEventListener
        public final void onOrientationChanged(int i) {
            int c4 = ATBaseActivity.this.c();
            if (c4 < 0) {
                c4 = 0;
            }
            if (c4 == 1 && ATBaseActivity.this.f17864d != 1) {
                ATBaseActivity.this.f17864d = 1;
                ATBaseActivity.this.a();
                return;
            }
            if (c4 == 3 && ATBaseActivity.this.f17864d != 2) {
                ATBaseActivity.this.f17864d = 2;
                ATBaseActivity.this.a();
            } else if (c4 == 0 && ATBaseActivity.this.f17864d != 3) {
                ATBaseActivity.this.f17864d = 3;
                ATBaseActivity.this.a();
            } else {
                if (c4 != 2 || ATBaseActivity.this.f17864d == 4) {
                    return;
                }
                ATBaseActivity.this.f17864d = 4;
                ATBaseActivity.this.a();
            }
        }
    }

    private void d() {
        try {
            getWindow().addFlags(67108864);
            getWindow().getDecorView().setSystemUiVisibility(4098);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void e() {
        try {
            finish();
        } catch (Throwable unused) {
        }
    }

    public abstract void a(int i, int i4, int i9, int i10, int i11);

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            d();
            c();
            Window window = getWindow();
            if (window == null || (i = Build.VERSION.SDK_INT) < 28) {
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (i >= 30) {
                attributes.layoutInDisplayCutoutMode = 3;
            } else {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        OrientationEventListener orientationEventListener = this.f17862b;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.f17862b = null;
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                try {
                    super.onResume();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                finish();
            }
        } else {
            super.onResume();
        }
        if (b.f19207c) {
            return;
        }
        a();
        d();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        d();
    }

    private void b() {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this);
        this.f17862b = anonymousClass2;
        if (anonymousClass2.canDetectOrientation()) {
            this.f17862b.enable();
        } else {
            this.f17862b.disable();
            this.f17862b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c() {
        Display display;
        if (this.f17863c == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                display = getDisplay();
                this.f17863c = display;
            } else {
                this.f17863c = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            }
        }
        Display display2 = this.f17863c;
        if (display2 == null) {
            return -1;
        }
        try {
            return display2.getRotation();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final void a() {
        getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.anythink.expressad.activity.ATBaseActivity.1
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
            
                r0 = r1.getDisplayCutout();
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                int i;
                int i4;
                int i9;
                DisplayCutout displayCutout;
                int safeInsetLeft;
                int safeInsetBottom;
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    WindowInsets rootWindowInsets = ATBaseActivity.this.getWindow().getDecorView().getRootWindowInsets();
                    int i11 = -1;
                    int i12 = 0;
                    if (rootWindowInsets == null || i10 < 28 || displayCutout == null) {
                        i = 0;
                        i4 = 0;
                        i9 = 0;
                    } else {
                        safeInsetLeft = displayCutout.getSafeInsetLeft();
                        i = displayCutout.getSafeInsetRight();
                        i4 = displayCutout.getSafeInsetTop();
                        safeInsetBottom = displayCutout.getSafeInsetBottom();
                        int c4 = ATBaseActivity.this.c();
                        if (ATBaseActivity.this.f17864d == -1) {
                            ATBaseActivity.this.f17864d = c4 == 0 ? 3 : c4 == 1 ? 1 : c4 == 2 ? 4 : c4 == 3 ? 2 : -1;
                            int unused = ATBaseActivity.this.f17864d;
                        }
                        if (c4 != 0) {
                            if (c4 == 1) {
                                i11 = 90;
                            } else if (c4 == 2) {
                                i11 = 180;
                            } else if (c4 == 3) {
                                i11 = 270;
                            }
                            i9 = safeInsetBottom;
                        } else {
                            i9 = safeInsetBottom;
                            i11 = 0;
                        }
                        i12 = safeInsetLeft;
                    }
                    ATBaseActivity.this.a(i11, i12, i, i4, i9);
                    if (ATBaseActivity.this.f17862b == null) {
                        ATBaseActivity.d(ATBaseActivity.this);
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }, 500L);
    }

    public static /* synthetic */ void d(ATBaseActivity aTBaseActivity) {
        AnonymousClass2 anonymousClass2 = aTBaseActivity.new AnonymousClass2(aTBaseActivity);
        aTBaseActivity.f17862b = anonymousClass2;
        if (anonymousClass2.canDetectOrientation()) {
            aTBaseActivity.f17862b.enable();
        } else {
            aTBaseActivity.f17862b.disable();
            aTBaseActivity.f17862b = null;
        }
    }
}
