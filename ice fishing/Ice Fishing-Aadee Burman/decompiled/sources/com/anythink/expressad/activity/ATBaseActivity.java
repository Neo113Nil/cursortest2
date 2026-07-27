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
    private static final String f17703a = "ATBaseActivity";

    /* renamed from: b, reason: collision with root package name */
    private OrientationEventListener f17704b;

    /* renamed from: c, reason: collision with root package name */
    private Display f17705c;

    /* renamed from: d, reason: collision with root package name */
    private int f17706d = -1;

    /* renamed from: com.anythink.expressad.activity.ATBaseActivity$2, reason: invalid class name */
    public class AnonymousClass2 extends OrientationEventListener {
        public AnonymousClass2(Context context) {
            super(context, 1);
        }

        @Override // android.view.OrientationEventListener
        public final void onOrientationChanged(int i) {
            int c9 = ATBaseActivity.this.c();
            if (c9 < 0) {
                c9 = 0;
            }
            if (c9 == 1 && ATBaseActivity.this.f17706d != 1) {
                ATBaseActivity.this.f17706d = 1;
                ATBaseActivity.this.a();
                return;
            }
            if (c9 == 3 && ATBaseActivity.this.f17706d != 2) {
                ATBaseActivity.this.f17706d = 2;
                ATBaseActivity.this.a();
            } else if (c9 == 0 && ATBaseActivity.this.f17706d != 3) {
                ATBaseActivity.this.f17706d = 3;
                ATBaseActivity.this.a();
            } else {
                if (c9 != 2 || ATBaseActivity.this.f17706d == 4) {
                    return;
                }
                ATBaseActivity.this.f17706d = 4;
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

    public abstract void a(int i, int i6, int i9, int i10, int i11);

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
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        OrientationEventListener orientationEventListener = this.f17704b;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.f17704b = null;
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
        if (b.f19049c) {
            return;
        }
        a();
        d();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        d();
    }

    private void b() {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this);
        this.f17704b = anonymousClass2;
        if (anonymousClass2.canDetectOrientation()) {
            this.f17704b.enable();
        } else {
            this.f17704b.disable();
            this.f17704b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c() {
        Display display;
        if (this.f17705c == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                display = getDisplay();
                this.f17705c = display;
            } else {
                this.f17705c = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            }
        }
        Display display2 = this.f17705c;
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
                int i6;
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
                        i6 = 0;
                        i9 = 0;
                    } else {
                        safeInsetLeft = displayCutout.getSafeInsetLeft();
                        i = displayCutout.getSafeInsetRight();
                        i6 = displayCutout.getSafeInsetTop();
                        safeInsetBottom = displayCutout.getSafeInsetBottom();
                        int c9 = ATBaseActivity.this.c();
                        if (ATBaseActivity.this.f17706d == -1) {
                            ATBaseActivity.this.f17706d = c9 == 0 ? 3 : c9 == 1 ? 1 : c9 == 2 ? 4 : c9 == 3 ? 2 : -1;
                            int unused = ATBaseActivity.this.f17706d;
                        }
                        if (c9 != 0) {
                            if (c9 == 1) {
                                i11 = 90;
                            } else if (c9 == 2) {
                                i11 = 180;
                            } else if (c9 == 3) {
                                i11 = 270;
                            }
                            i9 = safeInsetBottom;
                        } else {
                            i9 = safeInsetBottom;
                            i11 = 0;
                        }
                        i12 = safeInsetLeft;
                    }
                    ATBaseActivity.this.a(i11, i12, i, i6, i9);
                    if (ATBaseActivity.this.f17704b == null) {
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
        aTBaseActivity.f17704b = anonymousClass2;
        if (anonymousClass2.canDetectOrientation()) {
            aTBaseActivity.f17704b.enable();
        } else {
            aTBaseActivity.f17704b.disable();
            aTBaseActivity.f17704b = null;
        }
    }
}
